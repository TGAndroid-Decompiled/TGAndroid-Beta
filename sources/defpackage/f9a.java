package defpackage;
public final class f9a implements Runnable {
    public final byte a;
    public final g9a b;

    public f9a(g9a g9aVar, byte b) {
        this.a = b;
        this.b = g9aVar;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        g9a g9aVar = this.b;
        switch (b) {
            case 0:
                String str2 = g9aVar.b.text;
                if (str2 != null && str2.equals("AUTH_TOKEN_EXCEPTION")) {
                    str = jb6.M0(2131754708, null);
                } else {
                    str = jb6.M0(2131751042, null) + "\n" + g9aVar.b.text;
                }
                ik.r0(g9aVar.c, jb6.M0(2131753859, null), str, null);
                return;
            default:
                ik.r0(g9aVar.c, jb6.M0(2131753859, null), jb6.M0(2131751042, null), null);
                return;
        }
    }
}
