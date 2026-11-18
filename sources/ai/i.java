package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class i implements Runnable {
    public final int f1234a;
    public final boolean[] f1235b;
    public final ii.h f1236c;

    public i(boolean[] zArr, ii.h hVar, int i7) {
        this.f1234a = i7;
        this.f1235b = zArr;
        this.f1236c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f1234a) {
            case 0:
                boolean[] zArr = this.f1235b;
                ii.h hVar = this.f1236c;
                t[] tVarArr = DictationAsr.f43023a;
                if (!zArr[0]) {
                    hVar.a(null, null, true);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f1235b;
                ii.h hVar2 = this.f1236c;
                t[] tVarArr2 = DictationAsr.f43023a;
                if (!zArr2[0]) {
                    hVar2.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f1235b;
                ii.h hVar3 = this.f1236c;
                t[] tVarArr3 = DictationAsr.f43023a;
                if (!zArr3[0]) {
                    hVar3.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
