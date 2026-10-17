package ad;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f495a;
    public final Socket f496b;
    public final m f497c;

    public a(m mVar, InputStream inputStream, Socket socket) {
        this.f497c = mVar;
        this.f495a = inputStream;
        this.f496b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f495a;
        m mVar = this.f497c;
        Socket socket = this.f496b;
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
            f fVar = new f(mVar, new e(0), this.f495a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                fVar.c();
            }
            m.d(outputStream);
        } catch (Exception e7) {
            e = e7;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                m.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            m.d(outputStream2);
            m.d(inputStream);
            m.d(socket);
            ((List) mVar.f539c.f506c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            m.d(outputStream2);
            m.d(inputStream);
            m.d(socket);
            ((List) mVar.f539c.f506c).remove(this);
            throw th;
        }
        m.d(inputStream);
        m.d(socket);
        ((List) mVar.f539c.f506c).remove(this);
    }
}
