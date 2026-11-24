package defpackage;

import org.telegram.ui.ActionBar.d;
public final class wv8 implements Runnable {
    public final byte a = 1;
    public final String b;
    public final p8c c;
    public final d d;

    public wv8(String str, p8c p8cVar, d dVar) {
        this.b = str;
        this.c = p8cVar;
        this.d = dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        p8c p8cVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                yv8.p(dVar, 0, new wv8(str, p8cVar, dVar));
                return;
            default:
                if (str != null) {
                    p8cVar.a(str);
                    return;
                } else {
                    u21.b0(dVar).N(k96.M0(2131745669, null), k96.M0(2131751093, null)).j();
                    return;
                }
        }
    }

    public wv8(d dVar, String str, p8c p8cVar) {
        this.d = dVar;
        this.b = str;
        this.c = p8cVar;
    }
}
