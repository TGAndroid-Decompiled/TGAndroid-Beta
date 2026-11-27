package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class fi0 {
    public Object a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public fi0(Context context, di0 di0Var, zhc zhcVar) {
        this.a = context;
        this.c = di0Var;
        this.d = zhcVar;
        this.e = new xff(this, true);
        this.f = new xff(this, false);
    }

    public final void a() {
        this.a = null;
        if (((l5a) this.f) != null) {
            Utilities.e.a((l5a) this.f);
        }
        Bitmap bitmap = (Bitmap) this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.c).recycle();
        }
        this.c = null;
    }

    public final Bitmap b(mn5 mn5Var) {
        if (mn5Var == null) {
            return null;
        }
        return c(mn5Var.c, mn5Var.a, mn5Var.e, 0, false);
    }

    public final Bitmap c(Bitmap bitmap, String str, int i, int i2, boolean z) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (TextUtils.equals((String) this.a, str)) {
                Bitmap bitmap2 = (Bitmap) this.c;
                if (bitmap2 != null) {
                    return bitmap2;
                }
                if (((l5a) this.f) != null) {
                    return null;
                }
            }
            if (((l5a) this.f) != null) {
                Utilities.e.a((l5a) this.f);
            }
            this.a = str;
            to3 to3Var = Utilities.e;
            l5a l5aVar = new l5a(this, bitmap, i, i2, str, z);
            this.f = l5aVar;
            to3Var.c(l5aVar);
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

    public fi0(int i, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.b = i;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
