package kc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f10261a;
    public final Socket f10262b;
    public final k f10263c;

    public a(k kVar, InputStream inputStream, Socket socket) {
        this.f10263c = kVar;
        this.f10261a = inputStream;
        this.f10262b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f10261a;
        k kVar = this.f10263c;
        Socket socket = this.f10262b;
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
            d dVar = new d(kVar, new ja.c(16), this.f10261a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dVar.c();
            }
            k.d(outputStream);
        } catch (Exception e6) {
            e = e6;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                k.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            k.d(outputStream2);
            k.d(inputStream);
            k.d(socket);
            ((List) kVar.f10301c.f5660c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            k.d(outputStream2);
            k.d(inputStream);
            k.d(socket);
            ((List) kVar.f10301c.f5660c).remove(this);
            throw th;
        }
        k.d(inputStream);
        k.d(socket);
        ((List) kVar.f10301c.f5660c).remove(this);
    }
}
