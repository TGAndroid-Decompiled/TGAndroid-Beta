package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;
public final class hc {
    public String f24449a;
    public final boolean f24450b;
    public Bitmap f24451c;
    public Drawable d;
    public int f24452e;

    public hc(Bitmap bitmap, String str, int i7) {
        this.f24451c = bitmap;
        this.f24449a = str;
        this.f24452e = i7;
        if (str != null) {
            ec.D().H(this.f24449a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f24449a == null) {
            if (this.f24450b && (bitmap = this.f24451c) != null) {
                bitmap.recycle();
            }
            this.f24451c = null;
            this.d = null;
            return;
        }
        boolean p10 = ec.D().p(this.f24449a);
        if (!ec.D().J(this.f24449a, false) && p10) {
            Bitmap bitmap2 = this.f24451c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof oh0) {
                        ((oh0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.c6) {
                        ((org.telegram.ui.Components.c6) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f24449a = null;
        this.f24451c = null;
        this.d = null;
    }

    public hc(Bitmap bitmap) {
        this.f24451c = bitmap;
        this.f24450b = true;
    }
}
