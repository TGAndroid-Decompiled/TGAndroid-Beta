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
public final class jd4 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public jd4(Context context, ylb ylbVar) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint();
        this.b = paint;
        this.e = new Paint();
        this.f = new SparseArray();
        this.g = new HashMap();
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(gm.o());
        Drawable mutate = context.getDrawable(2131232566).mutate();
        this.c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231188).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(cmb.v0(cmb.Bi, ylbVar));
    }

    public static synchronized void c(File file) {
        synchronized (jd4.class) {
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
        ylb ylbVar = (ylb) this.d;
        Context context = (Context) this.b;
        if (!z) {
            this.f = null;
            u31 u31Var = (u31) this.g;
            if (u31Var != null) {
                u31Var.b();
                this.g = null;
                return;
            }
            return;
        }
        if (((o31) this.f) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            o31 o31Var = new o31(context, ylbVar);
            this.f = o31Var;
            o31Var.a.setAutoRepeat(true);
            ((o31) this.f).a.f(2131624005, 32, 32, null);
            ((o31) this.f).a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ((o31) this.f).b.setText(jb6.a0(null, null, 2131744397, (String) this.a));
            s31 s31Var = new s31(ylbVar, context, true);
            s31Var.b = new yt0(this, (byte) 21);
            ((o31) this.f).setButton(s31Var);
            this.g = u31.f((FrameLayout) this.c, (o31) this.f, -1);
        }
        if (j2 > 0) {
            ((o31) this.f).c.c(jb6.a0(null, null, 2131744396, gm.i0(Math.min(j, j2), false, false), gm.i0(j2, false, false)), !z2, true);
        }
        if (z2) {
            ((u31) this.g).k(true);
        }
    }

    public jd4(String str, jd4 jd4Var, mx6 mx6Var) {
        this.d = new yh4(this, false);
        this.e = new yh4(this, true);
        this.f = new xv6((byte) 2);
        this.g = new AtomicMarkableReference(null, false);
        this.a = str;
        this.b = new jf7(jd4Var);
        this.c = mx6Var;
    }

    public jd4(Context context, FrameLayout frameLayout, ylb ylbVar, String str, Runnable runnable) {
        this.b = context;
        this.c = frameLayout;
        this.d = ylbVar;
        this.a = str;
        this.e = runnable;
    }
}
