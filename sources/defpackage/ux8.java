package defpackage;

import java.util.LinkedHashMap;
public abstract class ux8 {
    public static final LinkedHashMap a;

    static {
        rx7[] rx7VarArr = {new rx7(q44.UNKNOWN_ERR, new i1((byte) 26)), new rx7(q44.ABORT_ERR, new i1((byte) 0)), new rx7(q44.ATTESTATION_NOT_PRIVATE_ERR, new i1((byte) 16)), new rx7(q44.CONSTRAINT_ERR, new i1((byte) 1)), new rx7(q44.DATA_ERR, new i1((byte) 3)), new rx7(q44.INVALID_STATE_ERR, new i1((byte) 10)), new rx7(q44.ENCODING_ERR, new i1((byte) 4)), new rx7(q44.NETWORK_ERR, new i1((byte) 12)), new rx7(q44.NOT_ALLOWED_ERR, new i1((byte) 14)), new rx7(q44.NOT_SUPPORTED_ERR, new i1((byte) 17)), new rx7(q44.SECURITY_ERR, new i1((byte) 22)), new rx7(q44.TIMEOUT_ERR, new i1((byte) 24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(uk6.b(12));
        uk6.d(linkedHashMap, rx7VarArr);
        a = linkedHashMap;
    }
}
