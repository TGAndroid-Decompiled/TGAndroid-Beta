package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class eka extends Thread {
    public final wtc a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final short d;
    public final dd e;
    public final dd f;

    public eka(wtc wtcVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i, dd ddVar, dd ddVar2) {
        this.a = wtcVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i;
        this.e = ddVar;
        this.f = ddVar2;
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
            this.a.A(exc);
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
            this.a.C(this, socket);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    @Override
    public final void run() {
        boolean z;
        Socket socket = null;
        try {
            dd ddVar = this.e;
            if (ddVar != null) {
                ((CountDownLatch) ddVar.c).await(ddVar.b, TimeUnit.MILLISECONDS);
            }
            wtc wtcVar = this.a;
            synchronized (wtcVar) {
                if (((Socket) wtcVar.c) != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                socket = this.b.createSocket();
                int i = go9.a;
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
