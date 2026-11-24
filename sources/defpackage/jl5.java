package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
public final class jl5 {
    public String a;
    public final boolean b;
    public Bitmap c;
    public Drawable d;
    public int e;

    public jl5(Bitmap bitmap, String str, int i) {
        this.c = bitmap;
        this.a = str;
        this.e = i;
        if (str != null) {
            fl5.z().D(this.a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a == null) {
            if (this.b && (bitmap = this.c) != null) {
                bitmap.recycle();
            }
            this.c = null;
            this.d = null;
            return;
        }
        boolean l = fl5.z().l(this.a);
        if (!fl5.z().F(this.a, false) && l) {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof oy8) {
                        ((oy8) drawable).x(false);
                    } else if (drawable instanceof km) {
                        ((km) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.a = null;
        this.c = null;
        this.d = null;
    }

    public jl5(Bitmap bitmap) {
        this.c = bitmap;
        this.b = true;
    }
}
