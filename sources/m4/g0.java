package m4;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
public final class g0 {
    public final int f19671a;
    public final int f19672b;
    public int f19673c;
    public final Object d;
    public Object f19674e;

    public g0(int i7, int i10) {
        this(Integer.MIN_VALUE, i7, i10);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i7 = 0;
        f5.u uVar = null;
        int i10 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i11 = this.f19672b;
            if ((i11 != 2 || (inetAddress instanceof Inet4Address)) && (i11 != 3 || (inetAddress instanceof Inet6Address))) {
                int i12 = i10 + this.f19673c;
                f5.u uVar2 = new f5.u(i12, 15);
                arrayList.add(new rc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((rc.a) this.f19674e).f54436b), this.f19671a, uVar, uVar2));
                uVar = uVar2;
                i10 = i12;
            }
        }
        obj.f54457b = arrayList;
        obj.f54456a = new CountDownLatch(((ArrayList) obj.f54457b).size());
        ArrayList arrayList2 = (ArrayList) obj.f54457b;
        int size = arrayList2.size();
        while (i7 < size) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((rc.t) obj2).start();
        }
        ((CountDownLatch) obj.f54456a).await();
        Socket socket = (Socket) obj.f54458c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) obj.d;
        if (exc != null) {
            throw exc;
        }
        throw new rc.v(44, "No viable interface to connect");
    }

    public void b() {
        int i7;
        int i10 = this.f19673c;
        if (i10 == Integer.MIN_VALUE) {
            i7 = this.f19671a;
        } else {
            i7 = i10 + this.f19672b;
        }
        this.f19673c = i7;
        this.f19674e = ((String) this.d) + this.f19673c;
    }

    public void c() {
        if (this.f19673c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public g0(int i7, int i10, int i11) {
        String str;
        if (i7 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = com.google.android.recaptcha.internal.a.i(i7, "/");
        }
        this.d = str;
        this.f19671a = i10;
        this.f19672b = i11;
        this.f19673c = Integer.MIN_VALUE;
        this.f19674e = "";
    }

    public g0(SocketFactory socketFactory, rc.a aVar, int i7, int i10, int i11) {
        this.d = socketFactory;
        this.f19674e = aVar;
        this.f19671a = i7;
        this.f19672b = i10;
        this.f19673c = i11;
    }
}
