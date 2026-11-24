package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class ak7 implements Runnable {
    public final InputStream a;
    public final Socket b;
    public final hk7 c;

    public ak7(hk7 hk7Var, InputStream inputStream, Socket socket) {
        this.c = hk7Var;
        this.a = inputStream;
        this.b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.a;
        hk7 hk7Var = this.c;
        Socket socket = this.b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            dk7 dk7Var = new dk7(hk7Var, new jk4((byte) 1), this.a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dk7Var.c();
            }
            hk7.c(outputStream);
        } catch (Exception e2) {
            e = e2;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                hk7.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            hk7.c(outputStream2);
            hk7.c(inputStream);
            hk7.c(socket);
            ((List) hk7Var.c.c).remove(this);
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            hk7.c(outputStream2);
            hk7.c(inputStream);
            hk7.c(socket);
            ((List) hk7Var.c.c).remove(this);
            throw th;
        }
        hk7.c(inputStream);
        hk7.c(socket);
        ((List) hk7Var.c.c).remove(this);
    }
}
