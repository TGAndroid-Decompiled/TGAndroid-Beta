package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;
public final class cc {
    public String f22005a;
    public final boolean f22006b;
    public Bitmap f22007c;
    public Drawable d;
    public int f22008e;

    public cc(Bitmap bitmap, String str, int i3) {
        this.f22007c = bitmap;
        this.f22005a = str;
        this.f22008e = i3;
        if (str != null) {
            zb.D().H(this.f22005a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f22005a == null) {
            if (this.f22006b && (bitmap = this.f22007c) != null) {
                bitmap.recycle();
            }
            this.f22007c = null;
            this.d = null;
            return;
        }
        boolean p10 = zb.D().p(this.f22005a);
        if (!zb.D().J(this.f22005a, false) && p10) {
            Bitmap bitmap2 = this.f22007c;
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
        this.f22005a = null;
        this.f22007c = null;
        this.d = null;
    }

    public cc(Bitmap bitmap) {
        this.f22007c = bitmap;
        this.f22006b = true;
    }
}
