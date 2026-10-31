package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.bi0;
public final class kc {
    public String f16562a;
    public final boolean f16563b;
    public Bitmap f16564c;
    public Drawable d;
    public int e;

    public kc(Bitmap bitmap, String str, int i10) {
        this.f16564c = bitmap;
        this.f16562a = str;
        this.e = i10;
        if (str != null) {
            hc.D().H(this.f16562a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f16562a == null) {
            if (this.f16563b && (bitmap = this.f16564c) != null) {
                bitmap.recycle();
            }
            this.f16564c = null;
            this.d = null;
            return;
        }
        boolean p5 = hc.D().p(this.f16562a);
        if (!hc.D().J(this.f16562a, false) && p5) {
            Bitmap bitmap2 = this.f16564c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof bi0) {
                        ((bi0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.s5) {
                        ((org.telegram.ui.Components.s5) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f16562a = null;
        this.f16564c = null;
        this.d = null;
    }

    public kc(Bitmap bitmap) {
        this.f16564c = bitmap;
        this.f16563b = true;
    }
}
