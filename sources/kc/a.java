package kc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
public final class a implements Runnable {
    public final InputStream f10281a;
    public final Socket f10282b;
    public final l f10283c;

    public a(l lVar, InputStream inputStream, Socket socket) {
        this.f10283c = lVar;
        this.f10281a = inputStream;
        this.f10282b = socket;
    }

    @Override
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.f10281a;
        l lVar = this.f10283c;
        Socket socket = this.f10282b;
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
            e eVar = new e(lVar, new d(0), this.f10281a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                eVar.c();
            }
            l.d(outputStream);
        } catch (Exception e6) {
            e = e6;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                l.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            l.d(outputStream2);
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f10322c.f5671c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            l.d(outputStream2);
            l.d(inputStream);
            l.d(socket);
            ((List) lVar.f10322c.f5671c).remove(this);
            throw th;
        }
        l.d(inputStream);
        l.d(socket);
        ((List) lVar.f10322c.f5671c).remove(this);
    }
}
