package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class xh7 implements Runnable {
    public final InputStream a;
    public final Socket b;
    public final ei7 c;

    public xh7(ei7 ei7Var, InputStream inputStream, Socket socket) {
        this.c = ei7Var;
        this.a = inputStream;
        this.b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.a;
        ei7 ei7Var = this.c;
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
            ai7 ai7Var = new ai7(ei7Var, new yg2((byte) 2), this.a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                ai7Var.c();
            }
            ei7.c(outputStream);
        } catch (Exception e2) {
            e = e2;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                ei7.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            ei7.c(outputStream2);
            ei7.c(inputStream);
            ei7.c(socket);
            ((List) ei7Var.c.c).remove(this);
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            ei7.c(outputStream2);
            ei7.c(inputStream);
            ei7.c(socket);
            ((List) ei7Var.c.c).remove(this);
            throw th;
        }
        ei7.c(inputStream);
        ei7.c(socket);
        ((List) ei7Var.c.c).remove(this);
    }
}
