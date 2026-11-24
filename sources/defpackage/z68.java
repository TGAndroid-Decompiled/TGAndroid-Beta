package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class z68 implements Runnable {
    public final byte a;
    public final PhotoViewer b;

    public z68(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void run() {
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                this.b.F1(false, 0, 0, true, false, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.i2();
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                this.b.F1(false, 0, 0, false, false, false);
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer.B(false, false);
                x02 x02Var = photoViewer.b2;
                if (x02Var != null) {
                    x02Var.a(true);
                }
                d dVar = photoViewer.l4;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.d9;
                photoViewer.s7 = null;
                return;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.d9;
                photoViewer.B(true, false);
                return;
            default:
                Drawable[] drawableArr7 = PhotoViewer.d9;
                photoViewer.F2();
                return;
        }
    }
}
