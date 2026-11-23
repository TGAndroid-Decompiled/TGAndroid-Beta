package c8;

import android.os.Build;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class b1 {
    public static boolean a(long j3) {
        if (np.g1().getBoolean("asr_live_text", true) && DictationAsr.D()) {
            if (!DictationAsr.z(j3) || (Build.VERSION.SDK_INT >= 33 && ai.d.i())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
