package defpackage;
public final class luc extends bo {
    public final byte e;

    public luc(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !muc.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z = juc.a;
                if (muc.b.b()) {
                    return nuc.a.getStatics().isMultiProcessEnabled();
                }
                fyb.i("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (!muc.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
