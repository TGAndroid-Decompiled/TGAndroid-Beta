package oa;

import java.net.InetAddress;
public class p0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return InetAddress.getByName(aVar.v());
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String hostAddress;
        InetAddress inetAddress = (InetAddress) obj;
        if (inetAddress == null) {
            hostAddress = null;
        } else {
            hostAddress = inetAddress.getHostAddress();
        }
        cVar.r(hostAddress);
    }
}
