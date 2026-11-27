package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class w00 implements icc {
    public final byte a;
    public final j20 b;

    public w00(j20 j20Var, byte b) {
        this.a = b;
        this.b = j20Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                j20Var.R1 = !((Boolean) obj2).booleanValue();
                MediaController z = MediaController.z();
                w7 w7Var = j20Var.Q1;
                float floatValue = ((Float) obj).floatValue();
                w7Var.getClass();
                z.o0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                j20Var.b2.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
