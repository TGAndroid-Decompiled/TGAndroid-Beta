package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class hk7 implements Runnable {
    public final InputStream a;
    public final Socket b;
    public final ok7 c;

    public hk7(ok7 ok7Var, InputStream inputStream, Socket socket) {
        this.c = ok7Var;
        this.a = inputStream;
        this.b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.a;
        ok7 ok7Var = this.c;
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
            kk7 kk7Var = new kk7(ok7Var, new jk4((byte) 1), this.a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                kk7Var.c();
            }
            ok7.c(outputStream);
        } catch (Exception e2) {
            e = e2;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                ok7.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            ok7.c(outputStream2);
            ok7.c(inputStream);
            ok7.c(socket);
            ((List) ok7Var.c.c).remove(this);
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            ok7.c(outputStream2);
            ok7.c(inputStream);
            ok7.c(socket);
            ((List) ok7Var.c.c).remove(this);
            throw th;
        }
        ok7.c(inputStream);
        ok7.c(socket);
        ((List) ok7Var.c.c).remove(this);
    }
}
