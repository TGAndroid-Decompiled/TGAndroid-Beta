package o2;

import k7.y;
public final class j extends b {
    public final int f16353e;

    public j(int i10, String str, String str2) {
        super(2, str, str2);
        this.f16353e = i10;
    }

    @Override
    public final boolean b() {
        switch (this.f16353e) {
            case 0:
                if (!super.b() || !y.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z4 = n2.a.f15190a;
                if (k.f16355b.b()) {
                    return l.f16357a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!y.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
