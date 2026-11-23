package e5;

import a8.r9;
public final class j extends b {
    public final int f10855e;

    public j(int i7, String str, String str2) {
        super(2, str, str2);
        this.f10855e = i7;
    }

    @Override
    public final boolean b() {
        switch (this.f10855e) {
            case 0:
                if (!super.b() || !r9.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = d5.b.f7848a;
                if (k.f10857b.b()) {
                    return l.f10860a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!r9.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
