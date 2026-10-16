package ad;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f496a;
    public final Socket f497b;
    public final l f498c;

    public a(l lVar, InputStream inputStream, Socket socket) {
        this.f498c = lVar;
        this.f496a = inputStream;
        this.f497b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f496a;
        l lVar = this.f498c;
        Socket socket = this.f497b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            e eVar = new e(lVar, new ya.c(2), this.f496a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                eVar.c();
            }
            l.d(outputStream);
        } catch (Exception e7) {
            e = e7;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                l.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            l.d(outputStream2);
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f539c.f507c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            l.d(outputStream2);
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f539c.f507c).remove(this);
            throw th;
        }
        l.d(inputStream);
        l.d(socket);
        ((List) lVar.f539c.f507c).remove(this);
    }
}
