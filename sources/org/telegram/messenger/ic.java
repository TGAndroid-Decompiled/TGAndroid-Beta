package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;
public final class ic {
    public String f24372a;
    public final boolean f24373b;
    public Bitmap f24374c;
    public Drawable d;
    public int f24375e;

    public ic(Bitmap bitmap, String str, int i7) {
        this.f24374c = bitmap;
        this.f24372a = str;
        this.f24375e = i7;
        if (str != null) {
            fc.D().H(this.f24372a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f24372a == null) {
            if (this.f24373b && (bitmap = this.f24374c) != null) {
                bitmap.recycle();
            }
            this.f24374c = null;
            this.d = null;
            return;
        }
        boolean p10 = fc.D().p(this.f24372a);
        if (!fc.D().J(this.f24372a, false) && p10) {
            Bitmap bitmap2 = this.f24374c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof ch0) {
                        ((ch0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.t5) {
                        ((org.telegram.ui.Components.t5) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f24372a = null;
        this.f24374c = null;
        this.d = null;
    }

    public ic(Bitmap bitmap) {
        this.f24374c = bitmap;
        this.f24373b = true;
    }
}
