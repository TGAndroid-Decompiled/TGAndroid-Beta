package defpackage;

import android.media.AudioManager;
import org.telegram.messenger.MediaController;
public final class z00 implements AudioManager.OnAudioFocusChangeListener {
    public final byte a;
    public final Object b;

    public z00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAudioFocusChange(int i) {
        o00 o00Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c10 c10Var = (c10) obj;
                c10Var.getClass();
                if (i != -3 && i != -2) {
                    if (i != -1) {
                        if (i != 1) {
                            b10.o(i, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        c10Var.b(2);
                        r74 r74Var = c10Var.c;
                        if (r74Var != null) {
                            r74Var.h.b(33, 1, 0).b();
                            return;
                        }
                        return;
                    }
                    r74 r74Var2 = c10Var.c;
                    if (r74Var2 != null) {
                        r74Var2.h.b(33, -1, 0).b();
                    }
                    c10Var.a();
                    c10Var.b(1);
                    return;
                } else if (i != -2 && ((o00Var = c10Var.d) == null || o00Var.a != 1)) {
                    c10Var.b(4);
                    return;
                } else {
                    r74 r74Var3 = c10Var.c;
                    if (r74Var3 != null) {
                        r74Var3.h.b(33, 0, 0).b();
                    }
                    c10Var.b(3);
                    return;
                }
            default:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                if (i != 1) {
                    mediaController.W = false;
                    return;
                }
                return;
        }
    }
}
