package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zg0;
public final class jc {
    public String f23537a;
    public final boolean f23538b;
    public Bitmap f23539c;
    public Drawable d;
    public int f23540e;

    public jc(Bitmap bitmap, String str, int i7) {
        this.f23539c = bitmap;
        this.f23537a = str;
        this.f23540e = i7;
        if (str != null) {
            gc.D().H(this.f23537a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f23537a == null) {
            if (this.f23538b && (bitmap = this.f23539c) != null) {
                bitmap.recycle();
            }
            this.f23539c = null;
            this.d = null;
            return;
        }
        boolean p10 = gc.D().p(this.f23537a);
        if (!gc.D().J(this.f23537a, false) && p10) {
            Bitmap bitmap2 = this.f23539c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof zg0) {
                        ((zg0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.u5) {
                        ((org.telegram.ui.Components.u5) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f23537a = null;
        this.f23539c = null;
        this.d = null;
    }

    public jc(Bitmap bitmap) {
        this.f23539c = bitmap;
        this.f23538b = true;
    }
}
