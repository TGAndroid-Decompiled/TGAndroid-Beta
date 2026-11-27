package defpackage;

import java.util.Map;
public final class lcd implements zq7 {
    public static final lcd b = new lcd((byte) 0);
    public static final lcd c = new lcd((byte) 1);
    public static final lcd d = new lcd((byte) 2);
    public static final lcd e = new lcd((byte) 3);
    public static final lcd f = new lcd((byte) 4);
    public static final lcd g = new lcd((byte) 5);
    public static final lcd h = new lcd((byte) 6);
    public static final lcd i = new lcd((byte) 7);
    public final byte a;

    public lcd(byte b2) {
        this.a = b2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ar7 ar7Var = (ar7) obj2;
                ar7Var.a(rcd.f, entry.getKey());
                ar7Var.a(rcd.g, entry.getValue());
                return;
            case 1:
                ar7 ar7Var2 = (ar7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                ar7 ar7Var3 = (ar7) obj2;
                ar7Var3.a(hdd.f, entry2.getKey());
                ar7Var3.a(hdd.g, entry2.getValue());
                return;
            case 3:
                ar7 ar7Var4 = (ar7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                ar7 ar7Var5 = (ar7) obj2;
                ar7Var5.a(gnd.f, entry3.getKey());
                ar7Var5.a(gnd.g, entry3.getValue());
                return;
            case 5:
                ar7 ar7Var6 = (ar7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                ar7 ar7Var7 = (ar7) obj2;
                ar7Var7.a(kpd.f, entry4.getKey());
                ar7Var7.a(kpd.g, entry4.getValue());
                return;
            default:
                ar7 ar7Var8 = (ar7) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
