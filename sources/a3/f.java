package a3;

import a8.r7;
import a8.v6;
import a8.w6;
import ab.c0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.j0;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import bi.a8;
import bi.b1;
import bi.c5;
import bi.e3;
import bi.g5;
import bi.l3;
import bi.n3;
import bi.p3;
import bi.t0;
import c8.le;
import c8.n0;
import c8.o0;
import di.ec;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.o3;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Dictation.DictationAsr;
public final class f implements Runnable {
    public final int f81a;
    public final Object f82b;

    public f(androidx.fragment.app.l lVar, u0 u0Var) {
        this.f81a = 12;
        this.f82b = lVar;
    }

    private final void a() {
        r7 r7Var = (r7) this.f82b;
        synchronized (((ArrayDeque) r7Var.f618e)) {
            SharedPreferences.Editor edit = ((SharedPreferences) r7Var.f616b).edit();
            String str = (String) r7Var.f617c;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) r7Var.f618e).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) r7Var.d);
            }
            edit.putString(str, sb2.toString()).apply();
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: a3.f.b():void");
    }

    private final void c() {
        androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.f82b;
        synchronized (rVar.d) {
            try {
                if (rVar.f2248n == null) {
                    return;
                }
                try {
                    o0.h d = rVar.d();
                    int i7 = d.f21672e;
                    if (i7 == 2) {
                        synchronized (rVar.d) {
                        }
                    }
                    if (i7 == 0) {
                        int i10 = n0.g.f21146a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        qb.a aVar = rVar.f2245c;
                        Context context = rVar.f2243a;
                        aVar.getClass();
                        o0.h[] hVarArr = {d};
                        n0 n0Var = i0.e.f15984a;
                        le.a("TypefaceCompat.createFromFontInfo");
                        Typeface b10 = i0.e.f15984a.b(context, hVarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer e10 = o0.e(rVar.f2243a, d.f21669a);
                        if (e10 != null && b10 != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            c0 c0Var = new c0(b10, w6.a(e10));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (rVar.d) {
                                v6 v6Var = rVar.f2248n;
                                if (v6Var != null) {
                                    v6Var.b(c0Var);
                                }
                            }
                            rVar.b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                } catch (Throwable th2) {
                    synchronized (rVar.d) {
                        try {
                            v6 v6Var2 = rVar.f2248n;
                            if (v6Var2 != null) {
                                v6Var2.a(th2);
                            }
                            rVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        switch (this.f81a) {
            case 0:
                ((s) this.f82b).k();
                return;
            case 1:
                a();
                return;
            case 2:
                ab.o0 o0Var = (ab.o0) this.f82b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + o0Var.f977a.getAction() + " finishing.");
                o0Var.f978b.trySetResult(null);
                return;
            case 3:
                ((ah.c) this.f82b).f();
                return;
            case 4:
                ((ai.b) this.f82b).b(null, null);
                return;
            case 5:
                b();
                return;
            case 6:
                g0.I3((EditText) this.f82b);
                return;
            case 7:
                DictationAsr.i0((ai.q) ((a0) this.f82b).f1676b, false, new Object());
                return;
            case 8:
                ((androidx.activity.l) this.f82b).invalidateOptionsMenu();
                return;
            case 9:
                androidx.activity.k kVar = (androidx.activity.k) this.f82b;
                Runnable runnable = kVar.f1743b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1743b = null;
                    return;
                }
                return;
            case 10:
                androidx.activity.m.a((androidx.activity.m) this.f82b);
                return;
            case 11:
                c();
                return;
            case 12:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f82b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 13:
                Iterator it = ((j0) this.f82b).f2328n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                it.next().getClass();
                throw new ClassCastException();
            case 14:
                e0 e0Var = (e0) this.f82b;
                androidx.lifecycle.v vVar = e0Var.f2473f;
                if (e0Var.f2470b == 0) {
                    e0Var.f2471c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f2469a == 0 && e0Var.f2471c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 15:
                try {
                    ((Bitmap) this.f82b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 16:
                bg.r rVar = (bg.r) this.f82b;
                long j3 = rVar.f3299b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    rVar.f3299b = j10;
                    rVar.f3298a.g(j10);
                }
                if (rVar.f3299b <= 0) {
                    rVar.f3300c = false;
                }
                if (rVar.f3300c) {
                    g0.h3(rVar.d, 1000L);
                    return;
                }
                return;
            case 17:
                bi.y yVar = (bi.y) this.f82b;
                yVar.d2.setTranslationX(yVar.f4225c2.getAnimatedWidth() + g0.L(28.0f));
                return;
            case 18:
                ((t0) this.f82b).onBackPressed();
                return;
            case 19:
                b1 b1Var = (b1) this.f82b;
                Drawable drawable = b1Var.Q;
                if (drawable != null && !b1Var.S) {
                    drawable.setAlpha(255);
                }
                b1Var.f3389a.setAlpha(1.0f);
                if (b1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) b1Var.getParent()).removeView(b1Var);
                }
                Runnable runnable2 = b1Var.R;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 20:
                b51 b51Var = ((p3) this.f82b).U1;
                if (b51Var != null) {
                    b51Var.O(false);
                    return;
                }
                return;
            case 21:
                ((e3) this.f82b).c();
                return;
            case 22:
                ((l3) this.f82b).invalidateSelf();
                return;
            case 23:
                n3 n3Var = (n3) this.f82b;
                ec ecVar = n3Var.f3876e;
                if (ecVar != null) {
                    ecVar.d();
                    n3Var.invalidateSelf();
                    return;
                }
                return;
            case 24:
                ((c5) this.f82b).run();
                return;
            case 25:
                EditTextBoldCursor editTextBoldCursor = ((g5) this.f82b).f3608o1;
                editTextBoldCursor.requestFocus();
                g0.I3(editTextBoldCursor);
                return;
            case 26:
                ((bi.v6) this.f82b).p();
                return;
            case 27:
                ((a8) this.f82b).f3363c.a(Boolean.TRUE);
                return;
            case 28:
                ((c1.f) this.f82b).f().T(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            default:
                o3 o3Var = (o3) this.f82b;
                synchronized (((AtomicMarkableReference) o3Var.h)) {
                    try {
                        z10 = false;
                        if (((AtomicMarkableReference) o3Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) o3Var.h).getReference();
                            ((AtomicMarkableReference) o3Var.h).set(str, false);
                            z10 = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    ((ca.h) o3Var.f20252a).i((String) o3Var.f20254c, str);
                    return;
                }
                return;
        }
    }

    public f(Object obj, int i7) {
        this.f81a = i7;
        this.f82b = obj;
    }
}
