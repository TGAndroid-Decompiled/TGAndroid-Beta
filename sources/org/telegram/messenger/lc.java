package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ci0;
public final class lc {
    public String f16927a;
    public final boolean f16928b;
    public Bitmap f16929c;
    public Drawable d;
    public int e;

    public lc(Bitmap bitmap, String str, int i10) {
        this.f16929c = bitmap;
        this.f16927a = str;
        this.e = i10;
        if (str != null) {
            ic.D().H(this.f16927a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f16927a == null) {
            if (this.f16928b && (bitmap = this.f16929c) != null) {
                bitmap.recycle();
            }
            this.f16929c = null;
            this.d = null;
            return;
        }
        boolean p5 = ic.D().p(this.f16927a);
        if (!ic.D().J(this.f16927a, false) && p5) {
            Bitmap bitmap2 = this.f16929c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof ci0) {
                        ((ci0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.s5) {
                        ((org.telegram.ui.Components.s5) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.f16927a = null;
        this.f16929c = null;
        this.d = null;
    }

    public lc(Bitmap bitmap) {
        this.f16929c = bitmap;
        this.f16928b = true;
    }
}
