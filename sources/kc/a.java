package kc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f11046a;
    public final Socket f11047b;
    public final l f11048c;

    public a(l lVar, InputStream inputStream, Socket socket) {
        this.f11048c = lVar;
        this.f11046a = inputStream;
        this.f11047b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f11046a;
        l lVar = this.f11048c;
        Socket socket = this.f11047b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            e eVar = new e(lVar, new d(0), this.f11046a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                eVar.c();
            }
            l.d(outputStream);
        } catch (Exception e10) {
            e = e10;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                l.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            l.d(outputStream2);
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f11091c.f5740c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            l.d(outputStream2);
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f11091c.f5740c).remove(this);
            throw th;
        }
        l.d(inputStream);
        l.d(socket);
        ((List) lVar.f11091c.f5740c).remove(this);
    }
}
