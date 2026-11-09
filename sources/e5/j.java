package e5;

import a8.n9;
public final class j extends b {
    public final int f10709e;

    public j(int i7, String str, String str2) {
        super(2, str, str2);
        this.f10709e = i7;
    }

    @Override
    public final boolean b() {
        switch (this.f10709e) {
            case 0:
                if (!super.b() || !n9.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z9 = d5.b.f8182a;
                if (k.f10711b.b()) {
                    return l.f10714a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!n9.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
