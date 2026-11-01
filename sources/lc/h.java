package lc;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class h {
    public static final String[] e = {"Connection", "Upgrade"};
    public static final String[] f11751f = {"Upgrade", "websocket"};
    public static final String[] f11752g = {"Sec-WebSocket-Version", "13"};
    public Object f11753a;
    public Serializable f11754b;
    public Object f11755c;
    public Serializable d;

    public synchronized void a(Exception exc) {
        try {
            CountDownLatch countDownLatch = (CountDownLatch) this.f11753a;
            if (countDownLatch != null && ((ArrayList) this.f11754b) != null) {
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

    public synchronized void b(u uVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.f11753a) != null && (arrayList = (ArrayList) this.f11754b) != null) {
            if (((Socket) this.f11755c) == null) {
                this.f11755c = socket;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    u uVar2 = (u) obj;
                    if (uVar2 != uVar) {
                        uVar2.a(new InterruptedException());
                        uVar2.interrupt();
                    }
                }
            } else {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
            ((CountDownLatch) this.f11753a).countDown();
        } else {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
    }
}
