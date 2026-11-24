package defpackage;

import java.util.LinkedHashMap;
public abstract class lu8 {
    public static final LinkedHashMap a;

    static {
        ku7[] ku7VarArr = {new ku7(v34.UNKNOWN_ERR, new h1((byte) 26)), new ku7(v34.ABORT_ERR, new h1((byte) 0)), new ku7(v34.ATTESTATION_NOT_PRIVATE_ERR, new h1((byte) 16)), new ku7(v34.CONSTRAINT_ERR, new h1((byte) 1)), new ku7(v34.DATA_ERR, new h1((byte) 3)), new ku7(v34.INVALID_STATE_ERR, new h1((byte) 10)), new ku7(v34.ENCODING_ERR, new h1((byte) 4)), new ku7(v34.NETWORK_ERR, new h1((byte) 12)), new ku7(v34.NOT_ALLOWED_ERR, new h1((byte) 14)), new ku7(v34.NOT_SUPPORTED_ERR, new h1((byte) 17)), new ku7(v34.SECURITY_ERR, new h1((byte) 22)), new ku7(v34.TIMEOUT_ERR, new h1((byte) 24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(qi6.b(12));
        qi6.d(linkedHashMap, ku7VarArr);
        a = linkedHashMap;
    }
}
