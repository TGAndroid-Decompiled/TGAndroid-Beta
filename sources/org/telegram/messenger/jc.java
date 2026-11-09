package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ah0;
public final class jc {
    public String f23533a;
    public final boolean f23534b;
    public Bitmap f23535c;
    public Drawable d;
    public int f23536e;

    public jc(Bitmap bitmap, String str, int i7) {
        this.f23535c = bitmap;
        this.f23533a = str;
        this.f23536e = i7;
        if (str != null) {
            gc.D().H(this.f23533a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f23533a == null) {
            if (this.f23534b && (bitmap = this.f23535c) != null) {
                bitmap.recycle();
            }
            this.f23535c = null;
            this.d = null;
            return;
        }
        boolean p10 = gc.D().p(this.f23533a);
        if (!gc.D().J(this.f23533a, false) && p10) {
            Bitmap bitmap2 = this.f23535c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof ah0) {
                        ((ah0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.v5) {
                        ((org.telegram.ui.Components.v5) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f23533a = null;
        this.f23535c = null;
        this.d = null;
    }

    public jc(Bitmap bitmap) {
        this.f23535c = bitmap;
        this.f23534b = true;
    }
}
