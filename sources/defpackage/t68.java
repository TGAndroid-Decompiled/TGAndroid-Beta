package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class t68 implements Runnable {
    public final byte a;
    public final PhotoViewer b;
    public final Bitmap c;

    public t68(PhotoViewer photoViewer, Bitmap bitmap, byte b) {
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
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.f(bitmap);
                gl.d3(new t68(photoViewer, bitmap, (byte) 5));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer.f(bitmap);
                gl.d3(new t68(photoViewer, bitmap, (byte) 4));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.f9;
                photoViewer.f(bitmap);
                gl.d3(new t68(photoViewer, bitmap, (byte) 6));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer.f(bitmap);
                return;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.f9;
                photoViewer.C4.f0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.j2(true, true);
                return;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.f9;
                photoViewer.C4.f0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.j2(true, true);
                return;
            default:
                Drawable[] drawableArr7 = PhotoViewer.f9;
                photoViewer.C4.f0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.j2(true, true);
                return;
        }
    }
}
