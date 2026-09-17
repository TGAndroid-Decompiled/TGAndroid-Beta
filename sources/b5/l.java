package b5;
public final class l extends b {
    public final int f2523e;

    public l(int i10, String str, String str2) {
        super(2, str, str2);
        this.f2523e = i10;
    }

    @Override
    public final boolean b() {
        switch (this.f2523e) {
            case 0:
                if (!super.b() || !com.google.android.gms.internal.cast.o.a("MULTI_PROCESS")) {
                    return false;
                }
                boolean z10 = a5.c.f299a;
                if (m.f2525b.b()) {
                    return n.f2528a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (!com.google.android.gms.internal.cast.o.a("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
