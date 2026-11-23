package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;
public final class ic {
    public String f24666a;
    public final boolean f24667b;
    public Bitmap f24668c;
    public Drawable d;
    public int f24669e;

    public ic(Bitmap bitmap, String str, int i7) {
        this.f24668c = bitmap;
        this.f24666a = str;
        this.f24669e = i7;
        if (str != null) {
            fc.D().H(this.f24666a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f24666a == null) {
            if (this.f24667b && (bitmap = this.f24668c) != null) {
                bitmap.recycle();
            }
            this.f24668c = null;
            this.d = null;
            return;
        }
        boolean p10 = fc.D().p(this.f24666a);
        if (!fc.D().J(this.f24666a, false) && p10) {
            Bitmap bitmap2 = this.f24668c;
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
        this.f24666a = null;
        this.f24668c = null;
        this.d = null;
    }

    public ic(Bitmap bitmap) {
        this.f24668c = bitmap;
        this.f24667b = true;
    }
}
