package d1;

import e7.r;
import ed.s;
import java.util.LinkedHashMap;
public abstract class g {
    public static final LinkedHashMap f8003a;

    static {
        dd.e[] eVarArr = {new dd.e(r.UNKNOWN_ERR, new x0.a(26)), new dd.e(r.ABORT_ERR, new x0.a(0)), new dd.e(r.ATTESTATION_NOT_PRIVATE_ERR, new x0.a(16)), new dd.e(r.CONSTRAINT_ERR, new x0.a(1)), new dd.e(r.DATA_ERR, new x0.a(3)), new dd.e(r.INVALID_STATE_ERR, new x0.a(10)), new dd.e(r.ENCODING_ERR, new x0.a(4)), new dd.e(r.NETWORK_ERR, new x0.a(12)), new dd.e(r.NOT_ALLOWED_ERR, new x0.a(14)), new dd.e(r.NOT_SUPPORTED_ERR, new x0.a(17)), new dd.e(r.SECURITY_ERR, new x0.a(22)), new dd.e(r.TIMEOUT_ERR, new x0.a(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(s.b(12));
        s.e(linkedHashMap, eVarArr);
        f8003a = linkedHashMap;
    }
}
