package gb;

import java.net.InetAddress;
public class p0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return InetAddress.getByName(aVar.v());
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
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
