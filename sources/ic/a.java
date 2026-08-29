package ic;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f8826a;
    public final Socket f8827b;
    public final l f8828c;

    public a(l lVar, InputStream inputStream, Socket socket) {
        this.f8828c = lVar;
        this.f8826a = inputStream;
        this.f8827b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f8826a;
        l lVar = this.f8828c;
        Socket socket = this.f8827b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            e eVar = new e(lVar, new d(0), this.f8826a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                eVar.c();
            }
            l.d(outputStream);
        } catch (Exception e11) {
            e = e11;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                l.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            l.d(outputStream2);
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f8871c.f6283c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            l.d(outputStream2);
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f8871c.f6283c).remove(this);
            throw th;
        }
        l.d(inputStream);
        l.d(socket);
        ((List) lVar.f8871c.f6283c).remove(this);
    }
}
