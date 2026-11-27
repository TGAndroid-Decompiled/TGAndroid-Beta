package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class gk7 implements Runnable {
    public final InputStream a;
    public final Socket b;
    public final nk7 c;

    public gk7(nk7 nk7Var, InputStream inputStream, Socket socket) {
        this.c = nk7Var;
        this.a = inputStream;
        this.b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.a;
        nk7 nk7Var = this.c;
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
            jk7 jk7Var = new jk7(nk7Var, new jk4((byte) 1), this.a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                jk7Var.c();
            }
            nk7.c(outputStream);
        } catch (Exception e2) {
            e = e2;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                nk7.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            nk7.c(outputStream2);
            nk7.c(inputStream);
            nk7.c(socket);
            ((List) nk7Var.c.c).remove(this);
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            nk7.c(outputStream2);
            nk7.c(inputStream);
            nk7.c(socket);
            ((List) nk7Var.c.c).remove(this);
            throw th;
        }
        nk7.c(inputStream);
        nk7.c(socket);
        ((List) nk7Var.c.c).remove(this);
    }
}
