package defpackage;

import android.content.SharedPreferences;
import org.telegram.ui.Dictation.DictationAsr;
public final class om1 implements Runnable {
    public final byte a;
    public final boolean[] b;

    public om1(boolean[] zArr, byte b) {
        this.a = b;
        this.b = zArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                return;
            case 1:
                nm3[] nm3VarArr = DictationAsr.a;
                zArr[0] = true;
                return;
            case 2:
                nm3[] nm3VarArr2 = DictationAsr.a;
                zArr[0] = true;
                return;
            case 3:
                zArr[0] = true;
                return;
            case 4:
                zArr[0] = true;
                return;
            case 5:
                zArr[0] = true;
                return;
            case 6:
                zArr[0] = true;
                return;
            case 7:
                if (!zArr[0]) {
                    SharedPreferences e1 = uc7.e1();
                    e1.edit().putInt("showchattagsinfo", e1.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                zArr[0] = true;
                return;
        }
    }
}
