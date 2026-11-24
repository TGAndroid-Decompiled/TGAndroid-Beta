package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
public final class gma {
    public final SocketFactory a;
    public final qa b;
    public final short c;
    public final int d;
    public final short e;

    public gma(SocketFactory socketFactory, qa qaVar, int i, int i2, int i3) {
        this.a = socketFactory;
        this.b = qaVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final Socket a(InetAddress[] inetAddressArr) {
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int length = inetAddressArr.length;
        int i = 0;
        de deVar = null;
        short s = 0;
        int i2 = 0;
        while (i2 < length) {
            InetAddress inetAddress = inetAddressArr[i2];
            int i3 = this.d;
            if ((i3 != 2 || (inetAddress instanceof Inet4Address)) && (i3 != 3 || (inetAddress instanceof Inet6Address))) {
                int i4 = s + this.e;
                de deVar2 = new de(i4, (byte) 17);
                arrayList.add(new fma(obj, this.a, new InetSocketAddress(inetAddress, this.b.b), this.c, deVar, deVar2));
                deVar = deVar2;
                s = i4;
            }
            i2++;
            s = s;
        }
        obj.b = arrayList;
        obj.a = new CountDownLatch(((ArrayList) obj.b).size());
        ArrayList arrayList2 = (ArrayList) obj.b;
        int size = arrayList2.size();
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((fma) obj2).start();
        }
        ((CountDownLatch) obj.a).await();
        Socket socket = (Socket) obj.c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) obj.d;
        if (exc != null) {
            throw exc;
        }
        throw new dwc(44, "No viable interface to connect");
    }
}
