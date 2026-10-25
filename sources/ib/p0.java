package ib;

import java.net.InetAddress;
public class p0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return InetAddress.getByName(aVar.v());
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        String hostAddress;
        InetAddress inetAddress = (InetAddress) obj;
        if (inetAddress == null) {
            hostAddress = null;
        } else {
            hostAddress = inetAddress.getHostAddress();
        }
        bVar.r(hostAddress);
    }
}
