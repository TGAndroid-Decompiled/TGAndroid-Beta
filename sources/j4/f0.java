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
    public final int f15312a;
    public final int f15313b;
    public int f15314c;
    public final Object d;
    public Object e;

    public f0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i10 = 0;
        d5.z zVar = null;
        int i11 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i12 = this.f15313b;
            if ((i12 != 2 || (inetAddress instanceof Inet4Address)) && (i12 != 3 || (inetAddress instanceof Inet6Address))) {
                int i13 = i11 + this.f15314c;
                d5.z zVar2 = new d5.z(i13, 13);
                arrayList.add(new uc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((uc.a) this.e).f49678b), this.f15312a, zVar, zVar2));
                zVar = zVar2;
                i11 = i13;
            }
        }
        obj.f49694b = arrayList;
        obj.f49693a = new CountDownLatch(((ArrayList) obj.f49694b).size());
        ArrayList arrayList2 = (ArrayList) obj.f49694b;
        int size = arrayList2.size();
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((uc.t) obj2).start();
        }
        ((CountDownLatch) obj.f49693a).await();
        Socket socket = (Socket) obj.f49695c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) obj.d;
        if (exc != null) {
            throw exc;
        }
        throw new uc.v(44, "No viable interface to connect");
    }

    public void b() {
        int i10;
        int i11 = this.f15314c;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f15312a;
        } else {
            i10 = i11 + this.f15313b;
        }
        this.f15314c = i10;
        this.e = ((String) this.d) + this.f15314c;
    }

    public void c() {
        if (this.f15314c != Integer.MIN_VALUE) {
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
        this.f15312a = i11;
        this.f15313b = i12;
        this.f15314c = Integer.MIN_VALUE;
        this.e = "";
    }

    public f0(SocketFactory socketFactory, uc.a aVar, int i10, int i11, int i12) {
        this.d = socketFactory;
        this.e = aVar;
        this.f15312a = i10;
        this.f15313b = i11;
        this.f15314c = i12;
    }
}
