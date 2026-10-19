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
    public final int f14055a;
    public final int f14056b;
    public int f14057c;
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
            int i12 = this.f14056b;
            if ((i12 != 2 || (inetAddress instanceof Inet4Address)) && (i12 != 3 || (inetAddress instanceof Inet6Address))) {
                int i13 = i11 + this.f14057c;
                c5.c0 c0Var2 = new c5.c0(i13, 12);
                arrayList.add(new tc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((tc.a) this.e).f46928b), this.f14055a, c0Var, c0Var2));
                c0Var = c0Var2;
                i11 = i13;
            }
        }
        obj.f46944b = arrayList;
        obj.f46943a = new CountDownLatch(((ArrayList) obj.f46944b).size());
        ArrayList arrayList2 = (ArrayList) obj.f46944b;
        int size = arrayList2.size();
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((tc.t) obj2).start();
        }
        ((CountDownLatch) obj.f46943a).await();
        Socket socket = (Socket) obj.f46945c;
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
        int i11 = this.f14057c;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f14055a;
        } else {
            i10 = i11 + this.f14056b;
        }
        this.f14057c = i10;
        this.e = ((String) this.d) + this.f14057c;
    }

    public void c() {
        if (this.f14057c != Integer.MIN_VALUE) {
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
        this.f14055a = i11;
        this.f14056b = i12;
        this.f14057c = Integer.MIN_VALUE;
        this.e = "";
    }

    public f0(SocketFactory socketFactory, tc.a aVar, int i10, int i11, int i12) {
        this.d = socketFactory;
        this.e = aVar;
        this.f14055a = i10;
        this.f14056b = i11;
        this.f14057c = i12;
    }
}
