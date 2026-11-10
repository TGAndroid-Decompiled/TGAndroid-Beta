package e5;

import a8.n9;
public final class j extends b {
    public final int f10714e;

    public j(int i7, String str, String str2) {
        super(2, str, str2);
        this.f10714e = i7;
    }

    @Override
    public final boolean b() {
        switch (this.f10714e) {
            case 0:
                if (!super.b() || !n9.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z9 = d5.b.f8187a;
                if (k.f10716b.b()) {
                    return l.f10719a.getStatics().isMultiProcessEnabled();
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
