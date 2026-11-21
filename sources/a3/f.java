package a3;

import a8.r7;
import a8.u6;
import a8.v6;
import ab.c0;
import ab.o0;
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
import bi.a5;
import bi.b1;
import bi.c3;
import bi.e5;
import bi.j3;
import bi.l3;
import bi.n3;
import bi.t0;
import bi.t6;
import bi.y7;
import c8.ke;
import c8.m0;
import c8.n0;
import di.ec;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Dictation.DictationAsr;
public final class f implements Runnable {
    public final int f81a;
    public final Object f82b;

    public f(androidx.fragment.app.l lVar, u0 u0Var) {
        this.f81a = 13;
        this.f82b = lVar;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: a3.f.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: a3.f.b():void");
    }

    private final void c() {
        androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.f82b;
        synchronized (rVar.d) {
            try {
                if (rVar.f2289n == null) {
                    return;
                }
                try {
                    o0.h d = rVar.d();
                    int i7 = d.f21604e;
                    if (i7 == 2) {
                        synchronized (rVar.d) {
                        }
                    }
                    if (i7 == 0) {
                        int i10 = n0.g.f21081a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        qb.a aVar = rVar.f2286c;
                        Context context = rVar.f2284a;
                        aVar.getClass();
                        o0.h[] hVarArr = {d};
                        m0 m0Var = i0.e.f15920a;
                        ke.a("TypefaceCompat.createFromFontInfo");
                        Typeface b10 = i0.e.f15920a.b(context, hVarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer e10 = n0.e(rVar.f2284a, d.f21601a);
                        if (e10 != null && b10 != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            c0 c0Var = new c0(b10, v6.a(e10));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (rVar.d) {
                                u6 u6Var = rVar.f2289n;
                                if (u6Var != null) {
                                    u6Var.b(c0Var);
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
                            u6 u6Var2 = rVar.f2289n;
                            if (u6Var2 != null) {
                                u6Var2.a(th2);
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
        switch (this.f81a) {
            case 0:
                ((s) this.f82b).k();
                return;
            case 1:
                r7 r7Var = (r7) this.f82b;
                synchronized (((ArrayDeque) r7Var.f619e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) r7Var.f617b).edit();
                    String str = (String) r7Var.f618c;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) r7Var.f619e).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) r7Var.d);
                    }
                    edit.putString(str, sb2.toString()).apply();
                }
                return;
            case 2:
                o0 o0Var = (o0) this.f82b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + o0Var.f977a.getAction() + " finishing.");
                o0Var.f978b.trySetResult(null);
                return;
            case 3:
                ((ah.c) this.f82b).f();
                return;
            case 4:
                ((ai.f) this.f82b).c(null, null);
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                g0.I3((EditText) this.f82b);
                return;
            case 8:
                DictationAsr.f0((ai.t) ((a0) this.f82b).f1717b, new Object());
                return;
            case 9:
                ((androidx.activity.l) this.f82b).invalidateOptionsMenu();
                return;
            case 10:
                androidx.activity.k kVar = (androidx.activity.k) this.f82b;
                Runnable runnable = kVar.f1784b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1784b = null;
                    return;
                }
                return;
            case 11:
                androidx.activity.m.a((androidx.activity.m) this.f82b);
                return;
            case 12:
                c();
                return;
            case 13:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f82b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 14:
                Iterator it2 = ((j0) this.f82b).f2369n.iterator();
                if (!it2.hasNext()) {
                    return;
                }
                it2.next().getClass();
                throw new ClassCastException();
            case 15:
                e0 e0Var = (e0) this.f82b;
                androidx.lifecycle.v vVar = e0Var.f2514f;
                if (e0Var.f2511b == 0) {
                    e0Var.f2512c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f2510a == 0 && e0Var.f2512c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 16:
                try {
                    ((Bitmap) this.f82b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
                bg.r rVar = (bg.r) this.f82b;
                long j3 = rVar.f3341b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    rVar.f3341b = j10;
                    rVar.f3340a.i(j10);
                }
                if (rVar.f3341b <= 0) {
                    rVar.f3342c = false;
                }
                if (rVar.f3342c) {
                    g0.h3(rVar.d, 1000L);
                    return;
                }
                return;
            case 18:
                bi.y yVar = (bi.y) this.f82b;
                yVar.d2.setTranslationX(yVar.f4259c2.getAnimatedWidth() + g0.L(28.0f));
                return;
            case 19:
                ((t0) this.f82b).onBackPressed();
                return;
            case 20:
                b1 b1Var = (b1) this.f82b;
                Drawable drawable = b1Var.Q;
                if (drawable != null && !b1Var.S) {
                    drawable.setAlpha(255);
                }
                b1Var.f3417a.setAlpha(1.0f);
                if (b1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) b1Var.getParent()).removeView(b1Var);
                }
                Runnable runnable2 = b1Var.R;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 21:
                c51 c51Var = ((n3) this.f82b).U1;
                if (c51Var != null) {
                    c51Var.O(false);
                    return;
                }
                return;
            case 22:
                ((c3) this.f82b).c();
                return;
            case 23:
                ((j3) this.f82b).invalidateSelf();
                return;
            case 24:
                l3 l3Var = (l3) this.f82b;
                ec ecVar = l3Var.f3839e;
                if (ecVar != null) {
                    ecVar.d();
                    l3Var.invalidateSelf();
                    return;
                }
                return;
            case 25:
                ((a5) this.f82b).run();
                return;
            case 26:
                EditTextBoldCursor editTextBoldCursor = ((e5) this.f82b).f3581o1;
                editTextBoldCursor.requestFocus();
                g0.I3(editTextBoldCursor);
                return;
            case 27:
                ((t6) this.f82b).p();
                return;
            case 28:
                ((y7) this.f82b).f4295c.a(Boolean.TRUE);
                return;
            default:
                ((c1.f) this.f82b).f().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
        }
    }

    public f(Object obj, int i7) {
        this.f81a = i7;
        this.f82b = obj;
    }
}
