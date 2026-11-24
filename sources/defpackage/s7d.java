package defpackage;

import java.util.Map;
public final class s7d implements zn7 {
    public static final s7d b = new s7d((byte) 0);
    public static final s7d c = new s7d((byte) 1);
    public static final s7d d = new s7d((byte) 2);
    public static final s7d e = new s7d((byte) 3);
    public static final s7d f = new s7d((byte) 4);
    public static final s7d g = new s7d((byte) 5);
    public static final s7d h = new s7d((byte) 6);
    public static final s7d i = new s7d((byte) 7);
    public final byte a;

    public s7d(byte b2) {
        this.a = b2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ao7 ao7Var = (ao7) obj2;
                ao7Var.a(y7d.f, entry.getKey());
                ao7Var.a(y7d.g, entry.getValue());
                return;
            case 1:
                ao7 ao7Var2 = (ao7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                ao7 ao7Var3 = (ao7) obj2;
                ao7Var3.a(o8d.f, entry2.getKey());
                ao7Var3.a(o8d.g, entry2.getValue());
                return;
            case 3:
                ao7 ao7Var4 = (ao7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                ao7 ao7Var5 = (ao7) obj2;
                ao7Var5.a(pid.f, entry3.getKey());
                ao7Var5.a(pid.g, entry3.getValue());
                return;
            case 5:
                ao7 ao7Var6 = (ao7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                ao7 ao7Var7 = (ao7) obj2;
                ao7Var7.a(tkd.f, entry4.getKey());
                ao7Var7.a(tkd.g, entry4.getValue());
                return;
            default:
                ao7 ao7Var8 = (ao7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
