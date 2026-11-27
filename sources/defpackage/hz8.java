package defpackage;

import org.telegram.ui.ActionBar.e;
public final class hz8 implements Runnable {
    public final byte a = 1;
    public final String b;
    public final pcc c;
    public final e d;

    public hz8(String str, pcc pccVar, e eVar) {
        this.b = str;
        this.c = pccVar;
        this.d = eVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e eVar = this.d;
        pcc pccVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                jz8.p(eVar, 0, new hz8(str, pccVar, eVar));
                return;
            default:
                if (str != null) {
                    pccVar.a(str);
                    return;
                } else {
                    d31.b0(eVar).N(ob6.M0(2131745589, null), ob6.M0(2131751070, null)).j();
                    return;
                }
        }
    }

    public hz8(e eVar, String str, pcc pccVar) {
        this.d = eVar;
        this.b = str;
        this.c = pccVar;
    }
}
