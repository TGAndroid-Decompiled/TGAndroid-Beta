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
import bi.b5;
import bi.f3;
import bi.h3;
import bi.j3;
import bi.q6;
import bi.t0;
import bi.v7;
import bi.x0;
import bi.x4;
import bi.y2;
import c8.ke;
import c8.m0;
import c8.n0;
import di.ec;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.z41;
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
                if (rVar.f2276n == null) {
                    return;
                }
                try {
                    o0.h d = rVar.d();
                    int i7 = d.f21582e;
                    if (i7 == 2) {
                        synchronized (rVar.d) {
                        }
                    }
                    if (i7 == 0) {
                        int i10 = n0.g.f21056a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        qb.a aVar = rVar.f2273c;
                        Context context = rVar.f2271a;
                        aVar.getClass();
                        o0.h[] hVarArr = {d};
                        m0 m0Var = i0.e.f15898a;
                        ke.a("TypefaceCompat.createFromFontInfo");
                        Typeface b10 = i0.e.f15898a.b(context, hVarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer e10 = n0.e(rVar.f2271a, d.f21579a);
                        if (e10 != null && b10 != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            c0 c0Var = new c0(b10, v6.a(e10));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (rVar.d) {
                                u6 u6Var = rVar.f2276n;
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
                            u6 u6Var2 = rVar.f2276n;
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
                DictationAsr.Y((ai.t) ((a0) this.f82b).f1704b, new Object());
                return;
            case 9:
                ((androidx.activity.l) this.f82b).invalidateOptionsMenu();
                return;
            case 10:
                androidx.activity.k kVar = (androidx.activity.k) this.f82b;
                Runnable runnable = kVar.f1771b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1771b = null;
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
                Iterator it2 = ((j0) this.f82b).f2356n.iterator();
                if (!it2.hasNext()) {
                    return;
                }
                it2.next().getClass();
                throw new ClassCastException();
            case 15:
                e0 e0Var = (e0) this.f82b;
                androidx.lifecycle.v vVar = e0Var.f2501f;
                if (e0Var.f2498b == 0) {
                    e0Var.f2499c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f2497a == 0 && e0Var.f2499c) {
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
                long j3 = rVar.f3328b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    rVar.f3328b = j10;
                    rVar.f3327a.i(j10);
                }
                if (rVar.f3328b <= 0) {
                    rVar.f3329c = false;
                }
                if (rVar.f3329c) {
                    g0.h3(rVar.d, 1000L);
                    return;
                }
                return;
            case 18:
                bi.y yVar = (bi.y) this.f82b;
                yVar.d2.setTranslationX(yVar.f4227c2.getAnimatedWidth() + g0.L(28.0f));
                return;
            case 19:
                ((t0) this.f82b).onBackPressed();
                return;
            case 20:
                x0 x0Var = (x0) this.f82b;
                Drawable drawable = x0Var.O;
                if (drawable != null && !x0Var.Q) {
                    drawable.setAlpha(255);
                }
                x0Var.f4197a.setAlpha(1.0f);
                if (x0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                }
                Runnable runnable2 = x0Var.P;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 21:
                z41 z41Var = ((j3) this.f82b).U1;
                if (z41Var != null) {
                    z41Var.O(false);
                    return;
                }
                return;
            case 22:
                ((y2) this.f82b).c();
                return;
            case 23:
                ((f3) this.f82b).invalidateSelf();
                return;
            case 24:
                h3 h3Var = (h3) this.f82b;
                ec ecVar = h3Var.f3692e;
                if (ecVar != null) {
                    ecVar.d();
                    h3Var.invalidateSelf();
                    return;
                }
                return;
            case 25:
                ((x4) this.f82b).run();
                return;
            case 26:
                EditTextBoldCursor editTextBoldCursor = ((b5) this.f82b).f3457o1;
                editTextBoldCursor.requestFocus();
                g0.I3(editTextBoldCursor);
                return;
            case 27:
                ((q6) this.f82b).p();
                return;
            case 28:
                ((v7) this.f82b).f4147c.a(Boolean.TRUE);
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
