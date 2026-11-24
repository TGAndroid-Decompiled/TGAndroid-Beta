package defpackage;

import android.media.AudioManager;
import org.telegram.messenger.MediaController;
public final class zz implements AudioManager.OnAudioFocusChangeListener {
    public final byte a;
    public final Object b;

    public zz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAudioFocusChange(int i) {
        nz nzVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c00 c00Var = (c00) obj;
                c00Var.getClass();
                if (i != -3 && i != -2) {
                    if (i != -1) {
                        if (i != 1) {
                            b00.o(i, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        c00Var.b(2);
                        i64 i64Var = c00Var.c;
                        if (i64Var != null) {
                            i64Var.h.b(33, 1, 0).b();
                            return;
                        }
                        return;
                    }
                    i64 i64Var2 = c00Var.c;
                    if (i64Var2 != null) {
                        i64Var2.h.b(33, -1, 0).b();
                    }
                    c00Var.a();
                    c00Var.b(1);
                    return;
                } else if (i != -2 && ((nzVar = c00Var.d) == null || nzVar.a != 1)) {
                    c00Var.b(4);
                    return;
                } else {
                    i64 i64Var3 = c00Var.c;
                    if (i64Var3 != null) {
                        i64Var3.h.b(33, 0, 0).b();
                    }
                    c00Var.b(3);
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
