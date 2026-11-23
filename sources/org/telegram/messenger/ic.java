package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;
public final class ic {
    public String f24702a;
    public final boolean f24703b;
    public Bitmap f24704c;
    public Drawable d;
    public int f24705e;

    public ic(Bitmap bitmap, String str, int i7) {
        this.f24704c = bitmap;
        this.f24702a = str;
        this.f24705e = i7;
        if (str != null) {
            fc.D().H(this.f24702a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f24702a == null) {
            if (this.f24703b && (bitmap = this.f24704c) != null) {
                bitmap.recycle();
            }
            this.f24704c = null;
            this.d = null;
            return;
        }
        boolean p10 = fc.D().p(this.f24702a);
        if (!fc.D().J(this.f24702a, false) && p10) {
            Bitmap bitmap2 = this.f24704c;
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
        this.f24702a = null;
        this.f24704c = null;
        this.d = null;
    }

    public ic(Bitmap bitmap) {
        this.f24704c = bitmap;
        this.f24703b = true;
    }
}
