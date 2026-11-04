package oc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
public final class t extends Thread {
    public final h f21002a;
    public final SocketFactory f21003b;
    public final InetSocketAddress f21004c;
    public final int d;
    public final e5.u f21005e;
    public final e5.u f21006f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i3, e5.u uVar, e5.u uVar2) {
        this.f21002a = hVar;
        this.f21003b = socketFactory;
        this.f21004c = inetSocketAddress;
        this.d = i3;
        this.f21005e = uVar;
        this.f21006f = uVar2;
    }

    public final void a(Exception exc) {
        boolean z10;
        synchronized (this.f21002a) {
            try {
                if (((CountDownLatch) this.f21006f.f9634c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f21002a.a(exc);
                ((CountDownLatch) this.f21006f.f9634c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        boolean z10;
        synchronized (this.f21002a) {
            try {
                if (((CountDownLatch) this.f21006f.f9634c).getCount() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                this.f21002a.b(this, socket);
                ((CountDownLatch) this.f21006f.f9634c).countDown();
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            e5.u uVar = this.f21005e;
            if (uVar != null) {
                ((CountDownLatch) uVar.f9634c).await(uVar.f9633b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.f21002a;
            synchronized (hVar) {
                if (((Socket) hVar.f20980c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                socket = this.f21003b.createSocket();
                int i3 = r.f20995a;
                socket.connect(this.f21004c, this.d);
                b(socket);
            }
        } catch (Exception e10) {
            a(e10);
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
