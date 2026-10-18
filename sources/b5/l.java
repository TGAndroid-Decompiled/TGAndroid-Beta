package b5;
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
                if (!super.b() || !a.a.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = a5.c.f282a;
                if (m.f4210b.b()) {
                    return n.f4212a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!a.a.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
