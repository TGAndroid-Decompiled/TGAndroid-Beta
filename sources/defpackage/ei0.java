package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class ei0 {
    public Object a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ei0(Context context, ci0 ci0Var, aec aecVar) {
        this.a = context;
        this.c = ci0Var;
        this.d = aecVar;
        this.e = new hbf(this, true);
        this.f = new hbf(this, false);
    }

    public final void a() {
        this.a = null;
        if (((m1a) this.f) != null) {
            Utilities.e.a((m1a) this.f);
        }
        Bitmap bitmap = (Bitmap) this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.c).recycle();
        }
        this.c = null;
    }

    public final Bitmap b(jl5 jl5Var) {
        if (jl5Var == null) {
            return null;
        }
        return c(jl5Var.c, jl5Var.a, jl5Var.e, 0, false);
    }

    public final Bitmap c(Bitmap bitmap, String str, int i, int i2, boolean z) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (TextUtils.equals((String) this.a, str)) {
                Bitmap bitmap2 = (Bitmap) this.c;
                if (bitmap2 != null) {
                    return bitmap2;
                }
                if (((m1a) this.f) != null) {
                    return null;
                }
            }
            if (((m1a) this.f) != null) {
                Utilities.e.a((m1a) this.f);
            }
            this.a = str;
            co3 co3Var = Utilities.e;
            m1a m1aVar = new m1a(this, bitmap, i, i2, str, z);
            this.f = m1aVar;
            co3Var.c(m1aVar);
            return (Bitmap) this.c;
        }
        return null;
    }

    public final Bitmap d(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return c(imageReceiver.n(), imageReceiver.R, imageReceiver.V, imageReceiver.W, false);
    }

    public ei0(int i, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.b = i;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
