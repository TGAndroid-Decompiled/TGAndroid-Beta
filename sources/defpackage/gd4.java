package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
public final class gd4 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public gd4(Context context, vnb vnbVar) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint();
        this.b = paint;
        this.e = new Paint();
        this.f = new SparseArray();
        this.g = new HashMap();
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(hl.o());
        Drawable mutate = context.getDrawable(2131232565).mutate();
        this.c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231187).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(aob.v0(aob.Ci, vnbVar));
    }

    public static synchronized void c(File file) {
        synchronized (gd4.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public final void a(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public final File b(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public final void f(long j, long j2, boolean z) {
        boolean z2;
        vnb vnbVar = (vnb) this.d;
        Context context = (Context) this.b;
        if (!z) {
            this.f = null;
            v21 v21Var = (v21) this.g;
            if (v21Var != null) {
                v21Var.b();
                this.g = null;
                return;
            }
            return;
        }
        if (((p21) this.f) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            p21 p21Var = new p21(context, vnbVar);
            this.f = p21Var;
            p21Var.a.setAutoRepeat(true);
            ((p21) this.f).a.f(2131624005, 32, 32, null);
            ((p21) this.f).a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ((p21) this.f).b.setText(ob6.a0(null, null, 2131744365, (String) this.a));
            t21 t21Var = new t21(vnbVar, context, true);
            t21Var.b = new fv0(this, (byte) 21);
            ((p21) this.f).setButton(t21Var);
            this.g = v21.f((FrameLayout) this.c, (p21) this.f, -1);
        }
        if (j2 > 0) {
            ((p21) this.f).c.c(ob6.a0(null, null, 2131744364, hl.i0(Math.min(j, j2), false, false), hl.i0(j2, false, false)), !z2, true);
        }
        if (z2) {
            ((v21) this.g).k(true);
        }
    }

    public gd4(String str, gd4 gd4Var, rx6 rx6Var) {
        this.d = new vh4(this, false);
        this.e = new vh4(this, true);
        this.f = new qh2((byte) 3);
        this.g = new AtomicMarkableReference(null, false);
        this.a = str;
        this.b = new qf7(gd4Var);
        this.c = rx6Var;
    }

    public gd4(Context context, FrameLayout frameLayout, vnb vnbVar, String str, Runnable runnable) {
        this.b = context;
        this.c = frameLayout;
        this.d = vnbVar;
        this.a = str;
        this.e = runnable;
    }
}
