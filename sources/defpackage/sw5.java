package defpackage;

import java.util.Map;
public final class sw5 implements zq7 {
    public final byte a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ar7 ar7Var = (ar7) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ar7 ar7Var2 = (ar7) obj2;
                ar7Var2.a(qw8.f, entry.getKey());
                ar7Var2.a(qw8.g, entry.getValue());
                return;
            default:
                ar7 ar7Var3 = (ar7) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
