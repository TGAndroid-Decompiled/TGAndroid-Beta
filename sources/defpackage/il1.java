package defpackage;

import android.content.SharedPreferences;
import org.telegram.ui.Dictation.DictationAsr;
public final class il1 implements Runnable {
    public final byte a;
    public final boolean[] b;

    public il1(boolean[] zArr, byte b) {
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
                vl3[] vl3VarArr = DictationAsr.a;
                zArr[0] = true;
                return;
            case 2:
                vl3[] vl3VarArr2 = DictationAsr.a;
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
                    SharedPreferences c1 = na7.c1();
                    c1.edit().putInt("showchattagsinfo", c1.getInt("showchattagsinfo", 3) - 1).apply();
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
