package o2;

import k7.x;
public final class k extends b {
    public final int e;

    public k(int i10, String str, String str2) {
        super(2, str, str2);
        this.e = i10;
    }

    @Override
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !x.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z4 = n2.b.f14204a;
                if (l.f16197b.b()) {
                    return m.f16199a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!x.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
