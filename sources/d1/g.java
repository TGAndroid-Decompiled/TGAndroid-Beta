package d1;

import bd.t;
import c7.r;
import java.util.LinkedHashMap;
public abstract class g {
    public static final LinkedHashMap f5644a;

    static {
        ad.e[] eVarArr = {new ad.e(r.UNKNOWN_ERR, new x0.a(26)), new ad.e(r.ABORT_ERR, new x0.a(0)), new ad.e(r.ATTESTATION_NOT_PRIVATE_ERR, new x0.a(16)), new ad.e(r.CONSTRAINT_ERR, new x0.a(1)), new ad.e(r.DATA_ERR, new x0.a(3)), new ad.e(r.INVALID_STATE_ERR, new x0.a(10)), new ad.e(r.ENCODING_ERR, new x0.a(4)), new ad.e(r.NETWORK_ERR, new x0.a(12)), new ad.e(r.NOT_ALLOWED_ERR, new x0.a(14)), new ad.e(r.NOT_SUPPORTED_ERR, new x0.a(17)), new ad.e(r.SECURITY_ERR, new x0.a(22)), new ad.e(r.TIMEOUT_ERR, new x0.a(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.a(12));
        t.c(linkedHashMap, eVarArr);
        f5644a = linkedHashMap;
    }
}
