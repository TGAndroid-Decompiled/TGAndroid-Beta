package oc;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class h {
    public static final String[] f20975e = {"Connection", "Upgrade"};
    public static final String[] f20976f = {"Upgrade", "websocket"};
    public static final String[] f20977g = {"Sec-WebSocket-Version", "13"};
    public Object f20978a;
    public Serializable f20979b;
    public Object f20980c;
    public Serializable d;

    public synchronized void a(Exception exc) {
        try {
            CountDownLatch countDownLatch = (CountDownLatch) this.f20978a;
            if (countDownLatch != null && ((ArrayList) this.f20979b) != null) {
                if (((Exception) this.d) == null) {
                    this.d = exc;
                }
                countDownLatch.countDown();
            } else {
                throw new IllegalStateException("Cannot set exception before awaiting!");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(t tVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.f20978a) != null && (arrayList = (ArrayList) this.f20979b) != null) {
            if (((Socket) this.f20980c) == null) {
                this.f20980c = socket;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    t tVar2 = (t) obj;
                    if (tVar2 != tVar) {
                        tVar2.a(new InterruptedException());
                        tVar2.interrupt();
                    }
                }
            } else {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
            ((CountDownLatch) this.f20978a).countDown();
        } else {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
    }
}
