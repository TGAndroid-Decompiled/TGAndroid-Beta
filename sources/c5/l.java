package c5;

import a8.v1;
public final class l extends b {
    public final int e;

    public l(int i10, String str, String str2) {
        super(2, str, str2);
        this.e = i10;
    }

    @Override
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !v1.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = b5.a.f3646a;
                if (m.f6149b.b()) {
                    return n.f6151a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!v1.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
