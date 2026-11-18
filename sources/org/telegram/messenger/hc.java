package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mh0;
public final class hc {
    public String f24421a;
    public final boolean f24422b;
    public Bitmap f24423c;
    public Drawable d;
    public int f24424e;

    public hc(Bitmap bitmap, String str, int i7) {
        this.f24423c = bitmap;
        this.f24421a = str;
        this.f24424e = i7;
        if (str != null) {
            ec.D().H(this.f24421a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f24421a == null) {
            if (this.f24422b && (bitmap = this.f24423c) != null) {
                bitmap.recycle();
            }
            this.f24423c = null;
            this.d = null;
            return;
        }
        boolean p10 = ec.D().p(this.f24421a);
        if (!ec.D().J(this.f24421a, false) && p10) {
            Bitmap bitmap2 = this.f24423c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof mh0) {
                        ((mh0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.b6) {
                        ((org.telegram.ui.Components.b6) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f24421a = null;
        this.f24423c = null;
        this.d = null;
    }

    public hc(Bitmap bitmap) {
        this.f24423c = bitmap;
        this.f24422b = true;
    }
}
