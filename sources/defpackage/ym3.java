package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public final class ym3 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final t0c c;

    public ym3(boolean[] zArr, t0c t0cVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = t0cVar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                t0c t0cVar = this.c;
                gn3[] gn3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    t0cVar.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.b;
                t0c t0cVar2 = this.c;
                gn3[] gn3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    t0cVar2.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
