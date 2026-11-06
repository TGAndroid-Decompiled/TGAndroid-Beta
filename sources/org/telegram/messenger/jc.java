package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zg0;
public final class jc {
    public String f23507a;
    public final boolean f23508b;
    public Bitmap f23509c;
    public Drawable d;
    public int f23510e;

    public jc(Bitmap bitmap, String str, int i7) {
        this.f23509c = bitmap;
        this.f23507a = str;
        this.f23510e = i7;
        if (str != null) {
            gc.D().H(this.f23507a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f23507a == null) {
            if (this.f23508b && (bitmap = this.f23509c) != null) {
                bitmap.recycle();
            }
            this.f23509c = null;
            this.d = null;
            return;
        }
        boolean p10 = gc.D().p(this.f23507a);
        if (!gc.D().J(this.f23507a, false) && p10) {
            Bitmap bitmap2 = this.f23509c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof zg0) {
                        ((zg0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.v5) {
                        ((org.telegram.ui.Components.v5) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f23507a = null;
        this.f23509c = null;
        this.d = null;
    }

    public jc(Bitmap bitmap) {
        this.f23509c = bitmap;
        this.f23508b = true;
    }
}
