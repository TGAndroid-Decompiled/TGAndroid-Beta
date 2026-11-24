package defpackage;

import org.telegram.ui.ActionBar.d;
public final class xx8 implements Runnable {
    public final byte a = 1;
    public final String b;
    public final qac c;
    public final d d;

    public xx8(String str, qac qacVar, d dVar) {
        this.b = str;
        this.c = qacVar;
        this.d = dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        qac qacVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                zx8.p(dVar, 0, new xx8(str, qacVar, dVar));
                return;
            default:
                if (str != null) {
                    qacVar.a(str);
                    return;
                } else {
                    c41.b0(dVar).N(jb6.M0(2131745595, null), jb6.M0(2131751042, null)).j();
                    return;
                }
        }
    }

    public xx8(d dVar, String str, qac qacVar) {
        this.d = dVar;
        this.b = str;
        this.c = qacVar;
    }
}
