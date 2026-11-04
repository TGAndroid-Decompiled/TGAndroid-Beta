package d5;

import b8.p9;
public final class k extends b {
    public final int f8577e;

    public k(int i3, String str, String str2) {
        super(2, str, str2);
        this.f8577e = i3;
    }

    @Override
    public final boolean b() {
        switch (this.f8577e) {
            case 0:
                if (!super.b() || !p9.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = c5.a.f4210a;
                if (l.f8579b.b()) {
                    return m.f8582a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!p9.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
