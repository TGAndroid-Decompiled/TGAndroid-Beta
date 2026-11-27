package defpackage;
public final class vaa implements Runnable {
    public final byte a;
    public final waa b;

    public vaa(waa waaVar, byte b) {
        this.a = b;
        this.b = waaVar;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        waa waaVar = this.b;
        switch (b) {
            case 0:
                String str2 = waaVar.b.text;
                if (str2 != null && str2.equals("AUTH_TOKEN_EXCEPTION")) {
                    str = ob6.M0(2131754704, null);
                } else {
                    str = ob6.M0(2131751070, null) + "\n" + waaVar.b.text;
                }
                jj.r0(waaVar.c, ob6.M0(2131753887, null), str, null);
                return;
            default:
                jj.r0(waaVar.c, ob6.M0(2131753887, null), ob6.M0(2131751070, null), null);
                return;
        }
    }
}
