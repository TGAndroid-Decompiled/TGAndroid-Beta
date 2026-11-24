package defpackage;
public final class mwc extends cp {
    public final byte e;

    public mwc(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !nwc.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z = kwc.a;
                if (nwc.b.b()) {
                    return owc.a.getStatics().isMultiProcessEnabled();
                }
                rjb.j("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (!nwc.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
