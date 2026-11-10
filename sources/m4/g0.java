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
    public final int f19676a;
    public final int f19677b;
    public int f19678c;
    public final Object d;
    public Object f19679e;

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
            int i11 = this.f19677b;
            if ((i11 != 2 || (inetAddress instanceof Inet4Address)) && (i11 != 3 || (inetAddress instanceof Inet6Address))) {
                int i12 = i10 + this.f19678c;
                f5.u uVar2 = new f5.u(i12, 15);
                arrayList.add(new rc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((rc.a) this.f19679e).f54447b), this.f19676a, uVar, uVar2));
                uVar = uVar2;
                i10 = i12;
            }
        }
        obj.f54468b = arrayList;
        obj.f54467a = new CountDownLatch(((ArrayList) obj.f54468b).size());
        ArrayList arrayList2 = (ArrayList) obj.f54468b;
        int size = arrayList2.size();
        while (i7 < size) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((rc.t) obj2).start();
        }
        ((CountDownLatch) obj.f54467a).await();
        Socket socket = (Socket) obj.f54469c;
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
        int i10 = this.f19678c;
        if (i10 == Integer.MIN_VALUE) {
            i7 = this.f19676a;
        } else {
            i7 = i10 + this.f19677b;
        }
        this.f19678c = i7;
        this.f19679e = ((String) this.d) + this.f19678c;
    }

    public void c() {
        if (this.f19678c != Integer.MIN_VALUE) {
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
        this.f19676a = i10;
        this.f19677b = i11;
        this.f19678c = Integer.MIN_VALUE;
        this.f19679e = "";
    }

    public g0(SocketFactory socketFactory, rc.a aVar, int i7, int i10, int i11) {
        this.d = socketFactory;
        this.f19679e = aVar;
        this.f19676a = i7;
        this.f19677b = i10;
        this.f19678c = i11;
    }
}
