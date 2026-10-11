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
    public final int f13805a;
    public final int f13806b;
    public int f13807c;
    public final Object d;
    public Object f13808e;

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
            int i12 = this.f13806b;
            if ((i12 != 2 || (inetAddress instanceof Inet4Address)) && (i12 != 3 || (inetAddress instanceof Inet6Address))) {
                int i13 = i11 + this.f13807c;
                c5.b0 b0Var2 = new c5.b0(i13, 9);
                arrayList.add(new sc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((sc.a) this.f13808e).f48013b), this.f13805a, b0Var, b0Var2));
                b0Var = b0Var2;
                i11 = i13;
            }
        }
        obj.f48035b = arrayList;
        obj.f48034a = new CountDownLatch(((ArrayList) obj.f48035b).size());
        ArrayList arrayList2 = (ArrayList) obj.f48035b;
        int size = arrayList2.size();
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((sc.t) obj2).start();
        }
        ((CountDownLatch) obj.f48034a).await();
        Socket socket = (Socket) obj.f48036c;
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
        int i11 = this.f13807c;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f13805a;
        } else {
            i10 = i11 + this.f13806b;
        }
        this.f13807c = i10;
        this.f13808e = ((String) this.d) + this.f13807c;
    }

    public void c() {
        if (this.f13807c != Integer.MIN_VALUE) {
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
        this.f13805a = i11;
        this.f13806b = i12;
        this.f13807c = Integer.MIN_VALUE;
        this.f13808e = "";
    }

    public f0(SocketFactory socketFactory, sc.a aVar, int i10, int i11, int i12) {
        this.d = socketFactory;
        this.f13808e = aVar;
        this.f13805a = i10;
        this.f13806b = i11;
        this.f13807c = i12;
    }
}
