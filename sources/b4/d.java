package b4;

import g4.i;
import h7.h5;
import j3.t0;
public final class d {
    public static final d f1921a = new Object();

    public final h5 a(t0 t0Var) {
        String str = t0Var.B;
        if (str != null) {
            char c3 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c3 = 4;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    return new c4.b(0);
                case 1:
                    return new f4.a();
                case 2:
                    return new i(null);
                case 3:
                    return new c4.b(1);
                case 4:
                    return new i4.c();
            }
        }
        throw new IllegalArgumentException(u3.c.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(t0 t0Var) {
        String str = t0Var.B;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
