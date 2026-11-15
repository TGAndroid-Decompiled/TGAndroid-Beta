package c8;

import android.os.Build;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class z0 {
    public static boolean a() {
        if (b() && DictationAsr.B()) {
            if (DictationAsr.x()) {
                if (Build.VERSION.SDK_INT >= 33 && ai.d.h()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean b() {
        return np.e1().getBoolean("design_voice_live_transcript", true);
    }

    public static boolean c() {
        return np.e1().getBoolean("design_voice_live_field", true);
    }
}
