package defpackage;

import java.util.Map;
public final class nw5 implements cq7 {
    public final byte a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                dq7 dq7Var = (dq7) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                dq7 dq7Var2 = (dq7) obj2;
                dq7Var2.a(iv8.f, entry.getKey());
                dq7Var2.a(iv8.g, entry.getValue());
                return;
            default:
                dq7 dq7Var3 = (dq7) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
