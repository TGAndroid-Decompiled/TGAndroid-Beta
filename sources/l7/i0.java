package l7;

import java.util.Map;
public final class i0 implements u9.d {
    public static final i0 f11596b = new i0(0);
    public static final i0 f11597c = new i0(1);
    public final int f11598a;

    public i0(int i10) {
        this.f11598a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f11598a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar = (u9.e) obj2;
                eVar.e(j0.f11608g, entry.getKey());
                eVar.e(j0.h, entry.getValue());
                return;
            default:
                u9.e eVar2 = (u9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
