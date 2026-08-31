package k7;

import java.util.Map;
public final class e implements u9.d {
    public static final e f10510b = new e(0);
    public static final e f10511c = new e(1);
    public final int f10512a;

    public e(int i10) {
        this.f10512a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f10512a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar = (u9.e) obj2;
                eVar.e(f.f10525g, entry.getKey());
                eVar.e(f.h, entry.getValue());
                return;
            default:
                u9.e eVar2 = (u9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
