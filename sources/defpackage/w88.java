package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class w88 implements Runnable {
    public final byte a;
    public final PhotoViewer b;
    public final Bitmap c;

    public w88(PhotoViewer photoViewer, Bitmap bitmap, byte b) {
        this.a = b;
        this.b = photoViewer;
        this.c = bitmap;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Bitmap bitmap = this.c;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.f(bitmap);
                gm.c3(new w88(photoViewer, bitmap, (byte) 5));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.f(bitmap);
                gm.c3(new w88(photoViewer, bitmap, (byte) 4));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer.f(bitmap);
                gm.c3(new w88(photoViewer, bitmap, (byte) 6));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer.f(bitmap);
                return;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.d9;
                photoViewer.B4.f0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.k2(true, true);
                return;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.d9;
                photoViewer.B4.f0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.k2(true, true);
                return;
            default:
                Drawable[] drawableArr7 = PhotoViewer.d9;
                photoViewer.B4.f0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.k2(true, true);
                return;
        }
    }
}
