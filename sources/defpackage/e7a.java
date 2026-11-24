package defpackage;
public final class e7a implements Runnable {
    public final byte a;
    public final f7a b;

    public e7a(f7a f7aVar, byte b) {
        this.a = b;
        this.b = f7aVar;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        f7a f7aVar = this.b;
        switch (b) {
            case 0:
                String str2 = f7aVar.b.text;
                if (str2 != null && str2.equals("AUTH_TOKEN_EXCEPTION")) {
                    str = k96.M0(2131754708, null);
                } else {
                    str = k96.M0(2131751093, null) + "\n" + f7aVar.b.text;
                }
                ij.r0(f7aVar.c, k96.M0(2131753891, null), str, null);
                return;
            default:
                ij.r0(f7aVar.c, k96.M0(2131753891, null), k96.M0(2131751093, null), null);
                return;
        }
    }
}
