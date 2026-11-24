package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class v00 implements i8c {
    public final byte a;
    public final i20 b;

    public v00(i20 i20Var, byte b) {
        this.a = b;
        this.b = i20Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                i20Var.R1 = !((Boolean) obj2).booleanValue();
                MediaController w = MediaController.w();
                v7 v7Var = i20Var.Q1;
                float floatValue = ((Float) obj).floatValue();
                v7Var.getClass();
                w.l0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                i20Var.b2.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
