package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class yna extends Thread {
    public final u8a a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final short d;
    public final ed e;
    public final ed f;

    public yna(u8a u8aVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i, ed edVar, ed edVar2) {
        this.a = u8aVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i;
        this.e = edVar;
        this.f = edVar2;
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
            ed edVar = this.e;
            if (edVar != null) {
                ((CountDownLatch) edVar.c).await(edVar.b, TimeUnit.MILLISECONDS);
            }
            u8a u8aVar = this.a;
            synchronized (u8aVar) {
                if (((Socket) u8aVar.c) != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                socket = this.b.createSocket();
                int i = as9.a;
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
