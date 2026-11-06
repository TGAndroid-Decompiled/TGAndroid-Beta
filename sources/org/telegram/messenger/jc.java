package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zg0;
public final class jc {
    public String f23514a;
    public final boolean f23515b;
    public Bitmap f23516c;
    public Drawable d;
    public int f23517e;

    public jc(Bitmap bitmap, String str, int i7) {
        this.f23516c = bitmap;
        this.f23514a = str;
        this.f23517e = i7;
        if (str != null) {
            gc.D().H(this.f23514a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f23514a == null) {
            if (this.f23515b && (bitmap = this.f23516c) != null) {
                bitmap.recycle();
            }
            this.f23516c = null;
            this.d = null;
            return;
        }
        boolean p10 = gc.D().p(this.f23514a);
        if (!gc.D().J(this.f23514a, false) && p10) {
            Bitmap bitmap2 = this.f23516c;
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
        this.f23514a = null;
        this.f23516c = null;
        this.d = null;
    }

    public jc(Bitmap bitmap) {
        this.f23516c = bitmap;
        this.f23515b = true;
    }
}
