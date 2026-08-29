package o2;

import i7.d0;
public final class j extends b {
    public final int f19062e;

    public j(int i10, String str, String str2) {
        super(2, str, str2);
        this.f19062e = i10;
    }

    @Override
    public final boolean b() {
        switch (this.f19062e) {
            case 0:
                if (!super.b() || !d0.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = n2.c.f17094a;
                if (k.f19064b.b()) {
                    return l.f19066a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!d0.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
