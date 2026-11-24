package defpackage;

import java.util.Map;
public final class u9d implements cq7 {
    public static final u9d b = new u9d((byte) 0);
    public static final u9d c = new u9d((byte) 1);
    public static final u9d d = new u9d((byte) 2);
    public static final u9d e = new u9d((byte) 3);
    public static final u9d f = new u9d((byte) 4);
    public static final u9d g = new u9d((byte) 5);
    public static final u9d h = new u9d((byte) 6);
    public static final u9d i = new u9d((byte) 7);
    public final byte a;

    public u9d(byte b2) {
        this.a = b2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                dq7 dq7Var = (dq7) obj2;
                dq7Var.a(aad.f, entry.getKey());
                dq7Var.a(aad.g, entry.getValue());
                return;
            case 1:
                dq7 dq7Var2 = (dq7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                dq7 dq7Var3 = (dq7) obj2;
                dq7Var3.a(qad.f, entry2.getKey());
                dq7Var3.a(qad.g, entry2.getValue());
                return;
            case 3:
                dq7 dq7Var4 = (dq7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                dq7 dq7Var5 = (dq7) obj2;
                dq7Var5.a(rkd.f, entry3.getKey());
                dq7Var5.a(rkd.g, entry3.getValue());
                return;
            case 5:
                dq7 dq7Var6 = (dq7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                dq7 dq7Var7 = (dq7) obj2;
                dq7Var7.a(vmd.f, entry4.getKey());
                dq7Var7.a(vmd.g, entry4.getValue());
                return;
            default:
                dq7 dq7Var8 = (dq7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
