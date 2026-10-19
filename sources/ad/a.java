package ad;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f494a;
    public final Socket f495b;
    public final m f496c;

    public a(m mVar, InputStream inputStream, Socket socket) {
        this.f496c = mVar;
        this.f494a = inputStream;
        this.f495b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f494a;
        m mVar = this.f496c;
        Socket socket = this.f495b;
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
            f fVar = new f(mVar, new e(0), this.f494a, outputStream, socket.getInetAddress());
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
            ((List) mVar.f539c.f505c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            m.d(outputStream2);
            m.d(inputStream);
            m.d(socket);
            ((List) mVar.f539c.f505c).remove(this);
            throw th;
        }
        m.d(inputStream);
        m.d(socket);
        ((List) mVar.f539c.f505c).remove(this);
    }
}
