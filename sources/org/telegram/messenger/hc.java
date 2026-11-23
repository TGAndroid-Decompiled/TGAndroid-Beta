package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nh0;
public final class hc {
    public String f24520a;
    public final boolean f24521b;
    public Bitmap f24522c;
    public Drawable d;
    public int f24523e;

    public hc(Bitmap bitmap, String str, int i7) {
        this.f24522c = bitmap;
        this.f24520a = str;
        this.f24523e = i7;
        if (str != null) {
            ec.D().H(this.f24520a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f24520a == null) {
            if (this.f24521b && (bitmap = this.f24522c) != null) {
                bitmap.recycle();
            }
            this.f24522c = null;
            this.d = null;
            return;
        }
        boolean p10 = ec.D().p(this.f24520a);
        if (!ec.D().J(this.f24520a, false) && p10) {
            Bitmap bitmap2 = this.f24522c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof nh0) {
                        ((nh0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.b6) {
                        ((org.telegram.ui.Components.b6) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f24520a = null;
        this.f24522c = null;
        this.d = null;
    }

    public hc(Bitmap bitmap) {
        this.f24522c = bitmap;
        this.f24521b = true;
    }
}
