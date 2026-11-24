package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class v10 implements jac {
    public final byte a;
    public final i30 b;

    public v10(i30 i30Var, byte b) {
        this.a = b;
        this.b = i30Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                i30Var.R1 = !((Boolean) obj2).booleanValue();
                MediaController w = MediaController.w();
                v7 v7Var = i30Var.Q1;
                float floatValue = ((Float) obj).floatValue();
                v7Var.getClass();
                w.l0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                i30Var.b2.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
