package l4;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
public final class f0 {
    public final int f17820a;
    public final int f17821b;
    public int f17822c;
    public final Object d;
    public Object f17823e;

    public f0(int i3, int i10) {
        this(Integer.MIN_VALUE, i3, i10);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i3 = 0;
        e5.u uVar = null;
        int i10 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i11 = this.f17821b;
            if ((i11 != 2 || (inetAddress instanceof Inet4Address)) && (i11 != 3 || (inetAddress instanceof Inet6Address))) {
                int i12 = i10 + this.f17822c;
                e5.u uVar2 = new e5.u(i12, 10);
                arrayList.add(new oc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((oc.a) this.f17823e).f20957b), this.f17820a, uVar, uVar2));
                uVar = uVar2;
                i10 = i12;
            }
        }
        obj.f20979b = arrayList;
        obj.f20978a = new CountDownLatch(((ArrayList) obj.f20979b).size());
        ArrayList arrayList2 = (ArrayList) obj.f20979b;
        int size = arrayList2.size();
        while (i3 < size) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((oc.t) obj2).start();
        }
        ((CountDownLatch) obj.f20978a).await();
        Socket socket = (Socket) obj.f20980c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) obj.d;
        if (exc != null) {
            throw exc;
        }
        throw new oc.v(44, "No viable interface to connect");
    }

    public void b() {
        int i3;
        int i10 = this.f17822c;
        if (i10 == Integer.MIN_VALUE) {
            i3 = this.f17820a;
        } else {
            i3 = i10 + this.f17821b;
        }
        this.f17822c = i3;
        this.f17823e = ((String) this.d) + this.f17822c;
    }

    public void c() {
        if (this.f17822c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public f0(int i3, int i10, int i11) {
        String str;
        if (i3 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = com.google.android.recaptcha.internal.a.h(i3, "/");
        }
        this.d = str;
        this.f17820a = i10;
        this.f17821b = i11;
        this.f17822c = Integer.MIN_VALUE;
        this.f17823e = "";
    }

    public f0(SocketFactory socketFactory, oc.a aVar, int i3, int i10, int i11) {
        this.d = socketFactory;
        this.f17823e = aVar;
        this.f17820a = i3;
        this.f17821b = i10;
        this.f17822c = i11;
    }
}
