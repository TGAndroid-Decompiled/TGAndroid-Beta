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
    public final int f20250a;
    public final int f20251b;
    public int f20252c;
    public final Object d;
    public Object f20253e;

    public f0(int i7, int i10) {
        this(Integer.MIN_VALUE, i7, i10);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i7 = 0;
        f5.v vVar = null;
        int i10 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i11 = this.f20251b;
            if ((i11 != 2 || (inetAddress instanceof Inet4Address)) && (i11 != 3 || (inetAddress instanceof Inet6Address))) {
                int i12 = i10 + this.f20252c;
                f5.v vVar2 = new f5.v(i12, 15);
                arrayList.add(new rc.t(obj, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((rc.a) this.f20253e).f55919b), this.f20250a, vVar, vVar2));
                vVar = vVar2;
                i10 = i12;
            }
        }
        obj.f55940b = arrayList;
        obj.f55939a = new CountDownLatch(((ArrayList) obj.f55940b).size());
        ArrayList arrayList2 = (ArrayList) obj.f55940b;
        int size = arrayList2.size();
        while (i7 < size) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((rc.t) obj2).start();
        }
        ((CountDownLatch) obj.f55939a).await();
        Socket socket = (Socket) obj.f55941c;
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
        int i10 = this.f20252c;
        if (i10 == Integer.MIN_VALUE) {
            i7 = this.f20250a;
        } else {
            i7 = i10 + this.f20251b;
        }
        this.f20252c = i7;
        this.f20253e = ((String) this.d) + this.f20252c;
    }

    public void c() {
        if (this.f20252c != Integer.MIN_VALUE) {
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
        this.f20250a = i10;
        this.f20251b = i11;
        this.f20252c = Integer.MIN_VALUE;
        this.f20253e = "";
    }

    public f0(SocketFactory socketFactory, rc.a aVar, int i7, int i10, int i11) {
        this.d = socketFactory;
        this.f20253e = aVar;
        this.f20250a = i7;
        this.f20251b = i10;
        this.f20252c = i11;
    }
}
