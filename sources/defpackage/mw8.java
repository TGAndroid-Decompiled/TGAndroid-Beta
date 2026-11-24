package defpackage;

import java.util.LinkedHashMap;
public abstract class mw8 {
    public static final LinkedHashMap a;

    static {
        lw7[] lw7VarArr = {new lw7(f54.UNKNOWN_ERR, new h1((byte) 26)), new lw7(f54.ABORT_ERR, new h1((byte) 0)), new lw7(f54.ATTESTATION_NOT_PRIVATE_ERR, new h1((byte) 16)), new lw7(f54.CONSTRAINT_ERR, new h1((byte) 1)), new lw7(f54.DATA_ERR, new h1((byte) 3)), new lw7(f54.INVALID_STATE_ERR, new h1((byte) 10)), new lw7(f54.ENCODING_ERR, new h1((byte) 4)), new lw7(f54.NETWORK_ERR, new h1((byte) 12)), new lw7(f54.NOT_ALLOWED_ERR, new h1((byte) 14)), new lw7(f54.NOT_SUPPORTED_ERR, new h1((byte) 17)), new lw7(f54.SECURITY_ERR, new h1((byte) 22)), new lw7(f54.TIMEOUT_ERR, new h1((byte) 24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(sk6.b(12));
        sk6.d(linkedHashMap, lw7VarArr);
        a = linkedHashMap;
    }
}
