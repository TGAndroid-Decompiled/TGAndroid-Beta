package bd;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f3850a;
    public final Socket f3851b;
    public final k f3852c;

    public a(k kVar, InputStream inputStream, Socket socket) {
        this.f3852c = kVar;
        this.f3850a = inputStream;
        this.f3851b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f3850a;
        k kVar = this.f3852c;
        Socket socket = this.f3851b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            d dVar = new d(kVar, new rb.c(8), this.f3850a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dVar.c();
            }
            k.d(outputStream);
        } catch (Exception e10) {
            e = e10;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                k.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            k.d(outputStream2);
            k.d(inputStream);
            k.d(socket);
            ((List) kVar.f3890c.f600c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            k.d(outputStream2);
            k.d(inputStream);
            k.d(socket);
            ((List) kVar.f3890c.f600c).remove(this);
            throw th;
        }
        k.d(inputStream);
        k.d(socket);
        ((List) kVar.f3890c.f600c).remove(this);
    }
}
