package lc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class u extends Thread {
    public final h f11775a;
    public final SocketFactory f11776b;
    public final InetSocketAddress f11777c;
    public final int d;
    public final c5.x e;
    public final c5.x f11778f;

    public u(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c5.x xVar, c5.x xVar2) {
        this.f11775a = hVar;
        this.f11776b = socketFactory;
        this.f11777c = inetSocketAddress;
        this.d = i10;
        this.e = xVar;
        this.f11778f = xVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f11775a) {
            try {
                if (((CountDownLatch) this.f11778f.f3828c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f11775a.a(exc);
                ((CountDownLatch) this.f11778f.f3828c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f11775a) {
            try {
                if (((CountDownLatch) this.f11778f.f3828c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f11775a.b(this, socket);
                ((CountDownLatch) this.f11778f.f3828c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c5.x xVar = this.e;
            if (xVar != null) {
                ((CountDownLatch) xVar.f3828c).await(xVar.f3827b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f11775a;
            synchronized (hVar) {
                if (((Socket) hVar.f11755c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f11776b.createSocket();
                int i10 = r.f11768a;
                socket.connect(this.f11777c, this.d);
                b(socket);
            }
        } catch (Exception e) {
            a(e);
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
