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
    public final int f13806a;
    public final int f13807b;
    public int f13808c;
    public final Object d;
    public Object f13809e;

    public f0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i10 = 0;
        c5.b0 b0Var = null;
        int i11 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i12 = this.f13807b;
            if ((i12 != 2 || (inetAddress instanceof Inet4Address)) && (i12 != 3 || (inetAddress instanceof Inet6Address))) {
                int i13 = i11 + this.f13808c;
                c5.b0 b0Var2 = new c5.b0(i13, 10);
                arrayList.add(new sc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((sc.a) this.f13809e).f47889b), this.f13806a, b0Var, b0Var2));
                b0Var = b0Var2;
                i11 = i13;
            }
        }
        obj.f47911b = arrayList;
        obj.f47910a = new CountDownLatch(((ArrayList) obj.f47911b).size());
        ArrayList arrayList2 = (ArrayList) obj.f47911b;
        int size = arrayList2.size();
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((sc.t) obj2).start();
        }
        ((CountDownLatch) obj.f47910a).await();
        Socket socket = (Socket) obj.f47912c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) obj.d;
        if (exc != null) {
            throw exc;
        }
        throw new sc.w(44, "No viable interface to connect");
    }

    public void b() {
        int i10;
        int i11 = this.f13808c;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f13806a;
        } else {
            i10 = i11 + this.f13807b;
        }
        this.f13808c = i10;
        this.f13809e = ((String) this.d) + this.f13808c;
    }

    public void c() {
        if (this.f13808c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public f0(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = a1.g.n(i10, "/");
        }
        this.d = str;
        this.f13806a = i11;
        this.f13807b = i12;
        this.f13808c = Integer.MIN_VALUE;
        this.f13809e = "";
    }

    public f0(SocketFactory socketFactory, sc.a aVar, int i10, int i11, int i12) {
        this.d = socketFactory;
        this.f13809e = aVar;
        this.f13806a = i10;
        this.f13807b = i11;
        this.f13808c = i12;
    }
}
