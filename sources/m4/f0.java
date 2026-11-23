package m4;

import com.google.android.gms.internal.vision.e2;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
public final class f0 {
    public final int f20608a;
    public final int f20609b;
    public int f20610c;
    public final Object d;
    public Object f20611e;

    public f0(int i7, int i10) {
        this(Integer.MIN_VALUE, i7, i10);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i7 = 0;
        b3.j jVar = null;
        int i10 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i11 = this.f20609b;
            if ((i11 != 2 || (inetAddress instanceof Inet4Address)) && (i11 != 3 || (inetAddress instanceof Inet6Address))) {
                int i12 = i10 + this.f20610c;
                b3.j jVar2 = new b3.j(i12, 14);
                arrayList.add(new rc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((rc.a) this.f20611e).f56503b), this.f20608a, jVar, jVar2));
                jVar = jVar2;
                i10 = i12;
            }
        }
        obj.f56524b = arrayList;
        obj.f56523a = new CountDownLatch(((ArrayList) obj.f56524b).size());
        ArrayList arrayList2 = (ArrayList) obj.f56524b;
        int size = arrayList2.size();
        while (i7 < size) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((rc.t) obj2).start();
        }
        ((CountDownLatch) obj.f56523a).await();
        Socket socket = (Socket) obj.f56525c;
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
        int i10 = this.f20610c;
        if (i10 == Integer.MIN_VALUE) {
            i7 = this.f20608a;
        } else {
            i7 = i10 + this.f20609b;
        }
        this.f20610c = i7;
        this.f20611e = ((String) this.d) + this.f20610c;
    }

    public void c() {
        if (this.f20610c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public f0(int i7, int i10, int i11) {
        String str;
        if (i7 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = e2.i(i7, "/");
        }
        this.d = str;
        this.f20608a = i10;
        this.f20609b = i11;
        this.f20610c = Integer.MIN_VALUE;
        this.f20611e = "";
    }

    public f0(SocketFactory socketFactory, rc.a aVar, int i7, int i10, int i11) {
        this.d = socketFactory;
        this.f20611e = aVar;
        this.f20608a = i7;
        this.f20609b = i10;
        this.f20610c = i11;
    }
}
