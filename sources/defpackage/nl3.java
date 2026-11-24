package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public final class nl3 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final syb c;

    public nl3(boolean[] zArr, syb sybVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = sybVar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                syb sybVar = this.c;
                vl3[] vl3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    sybVar.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.b;
                syb sybVar2 = this.c;
                vl3[] vl3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    sybVar2.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
