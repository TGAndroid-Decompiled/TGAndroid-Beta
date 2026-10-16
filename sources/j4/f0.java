package j4;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
public final class f0 {
    public final int f12645a;
    public final int f12646b;
    public int f12647c;
    public final Object d;
    public Object e;

    public f0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i10 = 0;
        c5.c0 c0Var = null;
        int i11 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i12 = this.f12646b;
            if ((i12 != 2 || (inetAddress instanceof Inet4Address)) && (i12 != 3 || (inetAddress instanceof Inet6Address))) {
                int i13 = i11 + this.f12647c;
                c5.c0 c0Var2 = new c5.c0(i13, 11);
                arrayList.add(new tc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((tc.a) this.e).f45565b), this.f12645a, c0Var, c0Var2));
                c0Var = c0Var2;
                i11 = i13;
            }
        }
        obj.f45583b = arrayList;
        obj.f45582a = new CountDownLatch(((ArrayList) obj.f45583b).size());
        ArrayList arrayList2 = (ArrayList) obj.f45583b;
        int size = arrayList2.size();
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((tc.t) obj2).start();
        }
        ((CountDownLatch) obj.f45582a).await();
        Socket socket = (Socket) obj.f45584c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) obj.d;
        if (exc != null) {
            throw exc;
        }
        throw new tc.v(44, "No viable interface to connect");
    }

    public void b() {
        int i10;
        int i11 = this.f12647c;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f12645a;
        } else {
            i10 = i11 + this.f12646b;
        }
        this.f12647c = i10;
        this.e = ((String) this.d) + this.f12647c;
    }

    public void c() {
        if (this.f12647c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public f0(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = a1.g.m(i10, "/");
        }
        this.d = str;
        this.f12645a = i11;
        this.f12646b = i12;
        this.f12647c = Integer.MIN_VALUE;
        this.e = "";
    }

    public f0(SocketFactory socketFactory, tc.a aVar, int i10, int i11, int i12) {
        this.d = socketFactory;
        this.e = aVar;
        this.f12645a = i10;
        this.f12646b = i11;
        this.f12647c = i12;
    }
}
