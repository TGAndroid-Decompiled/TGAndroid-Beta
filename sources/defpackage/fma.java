package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class fma extends Thread {
    public final e7a a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final short d;
    public final de e;
    public final de f;

    public fma(e7a e7aVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i, de deVar, de deVar2) {
        this.a = e7aVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i;
        this.e = deVar;
        this.f = deVar2;
    }

    public final void a(Exception exc) {
        boolean z;
        synchronized (this.a) {
            if (((CountDownLatch) this.f.c).getCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            this.a.H(exc);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    public final void b(Socket socket) {
        boolean z;
        synchronized (this.a) {
            if (((CountDownLatch) this.f.c).getCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            this.a.J(this, socket);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    @Override
    public final void run() {
        boolean z;
        Socket socket = null;
        try {
            de deVar = this.e;
            if (deVar != null) {
                ((CountDownLatch) deVar.c).await(deVar.b, TimeUnit.MILLISECONDS);
            }
            e7a e7aVar = this.a;
            synchronized (e7aVar) {
                if (((Socket) e7aVar.c) != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                socket = this.b.createSocket();
                int i = iq9.a;
                socket.connect(this.c, this.d);
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
