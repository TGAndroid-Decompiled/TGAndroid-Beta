package j4;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
public final class g0 {
    public final int f9490a;
    public final int f9491b;
    public int f9492c;
    public final Object d;
    public Object e;

    public g0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i10 = 0;
        c5.x xVar = null;
        int i11 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i12 = this.f9491b;
            if ((i12 != 2 || (inetAddress instanceof Inet4Address)) && (i12 != 3 || (inetAddress instanceof Inet6Address))) {
                int i13 = i11 + this.f9492c;
                c5.x xVar2 = new c5.x(i13, 8);
                arrayList.add(new lc.u(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((lc.a) this.e).f11737b), this.f9490a, xVar, xVar2));
                xVar = xVar2;
                i11 = i13;
            }
        }
        obj.f11754b = arrayList;
        obj.f11753a = new CountDownLatch(((ArrayList) obj.f11754b).size());
        ArrayList arrayList2 = (ArrayList) obj.f11754b;
        int size = arrayList2.size();
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((lc.u) obj2).start();
        }
        ((CountDownLatch) obj.f11753a).await();
        Socket socket = (Socket) obj.f11755c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) obj.d;
        if (exc != null) {
            throw exc;
        }
        throw new lc.w(44, "No viable interface to connect");
    }

    public void b() {
        int i10;
        int i11 = this.f9492c;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f9490a;
        } else {
            i10 = i11 + this.f9491b;
        }
        this.f9492c = i10;
        this.e = ((String) this.d) + this.f9492c;
    }

    public void c() {
        if (this.f9492c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public g0(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = a1.g.k(i10, "/");
        }
        this.d = str;
        this.f9490a = i11;
        this.f9491b = i12;
        this.f9492c = Integer.MIN_VALUE;
        this.e = "";
    }

    public g0(SocketFactory socketFactory, lc.a aVar, int i10, int i11, int i12) {
        this.d = socketFactory;
        this.e = aVar;
        this.f9490a = i10;
        this.f9491b = i11;
        this.f9492c = i12;
    }
}
