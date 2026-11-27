package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public final class em3 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final s2c c;

    public em3(boolean[] zArr, s2c s2cVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = s2cVar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                s2c s2cVar = this.c;
                nm3[] nm3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    s2cVar.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.b;
                s2c s2cVar2 = this.c;
                nm3[] nm3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    s2cVar2.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
