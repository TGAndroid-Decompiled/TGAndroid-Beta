package d1;

import java.util.LinkedHashMap;
import q6.r;
public abstract class g {
    public static final LinkedHashMap f4101a;

    static {
        sc.d[] dVarArr = {new sc.d(r.UNKNOWN_ERR, new x0.a(26)), new sc.d(r.ABORT_ERR, new x0.a(0)), new sc.d(r.ATTESTATION_NOT_PRIVATE_ERR, new x0.a(16)), new sc.d(r.CONSTRAINT_ERR, new x0.a(1)), new sc.d(r.DATA_ERR, new x0.a(3)), new sc.d(r.INVALID_STATE_ERR, new x0.a(10)), new sc.d(r.ENCODING_ERR, new x0.a(4)), new sc.d(r.NETWORK_ERR, new x0.a(12)), new sc.d(r.NOT_ALLOWED_ERR, new x0.a(14)), new sc.d(r.NOT_SUPPORTED_ERR, new x0.a(17)), new sc.d(r.SECURITY_ERR, new x0.a(22)), new sc.d(r.TIMEOUT_ERR, new x0.a(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(tc.r.a(12));
        tc.r.c(linkedHashMap, dVarArr);
        f4101a = linkedHashMap;
    }
}
