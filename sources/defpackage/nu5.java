package defpackage;

import java.util.Map;
public final class nu5 implements zn7 {
    public final byte a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ao7 ao7Var = (ao7) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ao7 ao7Var2 = (ao7) obj2;
                ao7Var2.a(ht8.f, entry.getKey());
                ao7Var2.a(ht8.g, entry.getValue());
                return;
            default:
                ao7 ao7Var3 = (ao7) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
