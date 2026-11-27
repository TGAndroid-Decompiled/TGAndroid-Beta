package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
public final class mn5 {
    public String a;
    public final boolean b;
    public Bitmap c;
    public Drawable d;
    public int e;

    public mn5(Bitmap bitmap, String str, int i) {
        this.c = bitmap;
        this.a = str;
        this.e = i;
        if (str != null) {
            in5.z().D(this.a);
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
        boolean l = in5.z().l(this.a);
        if (!in5.z().F(this.a, false) && l) {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof b29) {
                        ((b29) drawable).x(false);
                    } else if (drawable instanceof lm) {
                        ((lm) drawable).u();
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

    public mn5(Bitmap bitmap) {
        this.c = bitmap;
        this.b = true;
    }
}
