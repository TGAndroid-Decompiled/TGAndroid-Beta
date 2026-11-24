package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class ej0 {
    public Object a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ej0(Context context, cj0 cj0Var, rhb rhbVar) {
        this.a = context;
        this.c = cj0Var;
        this.d = rhbVar;
        this.e = new idf(this, true);
        this.f = new idf(this, false);
    }

    public final void a() {
        this.a = null;
        if (((o3a) this.f) != null) {
            Utilities.e.a((o3a) this.f);
        }
        Bitmap bitmap = (Bitmap) this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.c).recycle();
        }
        this.c = null;
    }

    public final Bitmap b(jn5 jn5Var) {
        if (jn5Var == null) {
            return null;
        }
        return c(jn5Var.c, jn5Var.a, jn5Var.e, 0, false);
    }

    public final Bitmap c(Bitmap bitmap, String str, int i, int i2, boolean z) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (TextUtils.equals((String) this.a, str)) {
                Bitmap bitmap2 = (Bitmap) this.c;
                if (bitmap2 != null) {
                    return bitmap2;
                }
                if (((o3a) this.f) != null) {
                    return null;
                }
            }
            if (((o3a) this.f) != null) {
                Utilities.e.a((o3a) this.f);
            }
            this.a = str;
            mp3 mp3Var = Utilities.e;
            o3a o3aVar = new o3a(this, bitmap, i, i2, str, z);
            this.f = o3aVar;
            mp3Var.c(o3aVar);
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

    public ej0(int i, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.b = i;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
