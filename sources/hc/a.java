package hc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;

public final class a implements Runnable {

    public final InputStream f8862a;

    public final Socket f8863b;

    public final l f8864c;

    public a(l lVar, InputStream inputStream, Socket socket) {
        this.f8864c = lVar;
        this.f8862a = inputStream;
        this.f8863b = socket;
    }

    @Override
    public final void run() throws Throwable {
        InputStream inputStream = this.f8862a;
        l lVar = this.f8864c;
        Socket socket = this.f8863b;
        OutputStream outputStream = null;
        try {
            try {
                OutputStream outputStream2 = socket.getOutputStream();
                try {
                    e eVar = new e(lVar, new d(), this.f8862a, outputStream2, socket.getInetAddress());
                    while (!socket.isClosed()) {
                        eVar.c();
                    }
                    l.d(outputStream2);
                } catch (Exception e9) {
                    e = e9;
                    outputStream = outputStream2;
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        l.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                    l.d(outputStream);
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    l.d(outputStream);
                    l.d(inputStream);
                    l.d(socket);
                    ((List) lVar.f8907c.f5631c).remove(this);
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            }
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f8907c.f5631c).remove(this);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
