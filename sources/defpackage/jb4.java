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
public final class jb4 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public jb4(Context context, wjb wjbVar) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint();
        this.b = paint;
        this.e = new Paint();
        this.f = new SparseArray();
        this.g = new HashMap();
        textPaint.setTextSize(gl.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(gl.o());
        Drawable mutate = context.getDrawable(2131232554).mutate();
        this.c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231187).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(bkb.v0(bkb.Bi, wjbVar));
    }

    public static synchronized void c(File file) {
        synchronized (jb4.class) {
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
        wjb wjbVar = (wjb) this.d;
        Context context = (Context) this.b;
        if (!z) {
            this.f = null;
            m21 m21Var = (m21) this.g;
            if (m21Var != null) {
                m21Var.b();
                this.g = null;
                return;
            }
            return;
        }
        if (((g21) this.f) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            g21 g21Var = new g21(context, wjbVar);
            this.f = g21Var;
            g21Var.a.setAutoRepeat(true);
            ((g21) this.f).a.f(2131624005, 32, 32, null);
            ((g21) this.f).a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ((g21) this.f).b.setText(k96.a0(null, null, 2131744471, (String) this.a));
            k21 k21Var = new k21(wjbVar, context, true);
            k21Var.b = new nv0(this, (byte) 18);
            ((g21) this.f).setButton(k21Var);
            this.g = m21.f((FrameLayout) this.c, (g21) this.f, -1);
        }
        if (j2 > 0) {
            ((g21) this.f).c.c(k96.a0(null, null, 2131744470, gl.i0(Math.min(j, j2), false, false), gl.i0(j2, false, false)), !z2, true);
        }
        if (z2) {
            ((m21) this.g).k(true);
        }
    }

    public jb4(String str, jb4 jb4Var, mv6 mv6Var) {
        this.d = new xf4(this, false);
        this.e = new xf4(this, true);
        this.f = new yg2((byte) 4);
        this.g = new AtomicMarkableReference(null, false);
        this.a = str;
        this.b = new hd7(jb4Var);
        this.c = mv6Var;
    }

    public jb4(Context context, FrameLayout frameLayout, wjb wjbVar, String str, Runnable runnable) {
        this.b = context;
        this.c = frameLayout;
        this.d = wjbVar;
        this.a = str;
        this.e = runnable;
    }
}
