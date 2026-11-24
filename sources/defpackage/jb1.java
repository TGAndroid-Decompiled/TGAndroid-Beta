package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class jb1 implements Runnable {
    public final byte a;
    public final mb1 b;

    public jb1(mb1 mb1Var, byte b) {
        this.a = b;
        this.b = mb1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mb1 mb1Var = this.b;
        switch (b) {
            case 0:
                if (mb1Var.o1) {
                    mb1Var.o1 = false;
                    mb1Var.invalidate();
                    return;
                }
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.f9;
                mb1Var.setVisibility(8);
                return;
        }
    }
}
