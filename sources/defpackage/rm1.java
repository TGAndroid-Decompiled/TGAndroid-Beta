package defpackage;

import android.content.SharedPreferences;
import org.telegram.ui.Dictation.DictationAsr;
public final class rm1 implements Runnable {
    public final byte a;
    public final boolean[] b;

    public rm1(boolean[] zArr, byte b) {
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
                gn3[] gn3VarArr = DictationAsr.a;
                zArr[0] = true;
                return;
            case 2:
                gn3[] gn3VarArr2 = DictationAsr.a;
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
                    SharedPreferences d1 = oc7.d1();
                    d1.edit().putInt("showchattagsinfo", d1.getInt("showchattagsinfo", 3) - 1).apply();
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
