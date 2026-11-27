package defpackage;
public final class bzc extends co {
    public final byte e;

    public bzc(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b() || !czc.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z = zyc.a;
                if (czc.b.b()) {
                    return dzc.a.getStatics().isMultiProcessEnabled();
                }
                qyc.c("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (!czc.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
