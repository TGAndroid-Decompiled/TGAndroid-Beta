package a3;

import a8.r7;
import a8.u6;
import a8.v6;
import ab.c0;
import ab.o0;
import android.animation.ValueAnimator;
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
import bi.e2;
import bi.i4;
import bi.l2;
import bi.n2;
import bi.s2;
import bi.t0;
import bi.x0;
import c8.he;
import c8.k0;
import c8.l0;
import di.bc;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.o3;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Dictation.DictationAsr;
public final class f implements Runnable {
    public final int f81a;
    public final Object f82b;

    public f(androidx.fragment.app.l lVar, u0 u0Var) {
        this.f81a = 12;
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
                if (rVar.f2282n == null) {
                    return;
                }
                try {
                    o0.h d = rVar.d();
                    int i7 = d.f21215e;
                    if (i7 == 2) {
                        synchronized (rVar.d) {
                        }
                    }
                    if (i7 == 0) {
                        int i10 = n0.g.f20692a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        qb.a aVar = rVar.f2279c;
                        Context context = rVar.f2277a;
                        aVar.getClass();
                        o0.h[] hVarArr = {d};
                        k0 k0Var = i0.f.f15580a;
                        he.a("TypefaceCompat.createFromFontInfo");
                        Typeface b10 = i0.f.f15580a.b(context, hVarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer e10 = l0.e(rVar.f2277a, d.f21212a);
                        if (e10 != null && b10 != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            c0 c0Var = new c0(b10, v6.a(e10));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (rVar.d) {
                                u6 u6Var = rVar.f2282n;
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
                            u6 u6Var2 = rVar.f2282n;
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

    private final void d() {
        boolean z10;
        String str;
        o3 o3Var = (o3) this.f82b;
        synchronized (((AtomicMarkableReference) o3Var.f19799g)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) o3Var.f19799g).isMarked()) {
                    str = (String) ((AtomicMarkableReference) o3Var.f19799g).getReference();
                    ((AtomicMarkableReference) o3Var.f19799g).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((ca.h) o3Var.f19794a).i((String) o3Var.f19796c, str);
        }
    }

    private final void f() {
        ab.q qVar = (ab.q) this.f82b;
        Map map = null;
        ((AtomicReference) qVar.f990c).set(null);
        synchronized (qVar) {
            try {
                if (((AtomicMarkableReference) qVar.f989b).isMarked()) {
                    map = ((ca.e) ((AtomicMarkableReference) qVar.f989b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.f989b;
                    atomicMarkableReference.set((ca.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            o3 o3Var = (o3) qVar.d;
            ((ca.h) o3Var.f19794a).h((String) o3Var.f19796c, map, qVar.f988a);
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
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + o0Var.f978a.getAction() + " finishing.");
                o0Var.f979b.trySetResult(null);
                return;
            case 3:
                ((ah.c) this.f82b).f();
                return;
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                g0.J3((EditText) this.f82b);
                return;
            case 7:
                DictationAsr.V((ai.s) ((a0) this.f82b).f1706b, new Object());
                return;
            case 8:
                ((androidx.activity.l) this.f82b).invalidateOptionsMenu();
                return;
            case 9:
                androidx.activity.k kVar = (androidx.activity.k) this.f82b;
                Runnable runnable = kVar.f1773b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1773b = null;
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
                Iterator it2 = ((j0) this.f82b).f2362n.iterator();
                if (!it2.hasNext()) {
                    return;
                }
                it2.next().getClass();
                throw new ClassCastException();
            case 14:
                e0 e0Var = (e0) this.f82b;
                androidx.lifecycle.v vVar = e0Var.f2507f;
                if (e0Var.f2504b == 0) {
                    e0Var.f2505c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f2503a == 0 && e0Var.f2505c) {
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
                bg.q qVar = (bg.q) this.f82b;
                long j3 = qVar.f3318b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    qVar.f3318b = j10;
                    qVar.f3317a.g(j10);
                }
                if (qVar.f3318b <= 0) {
                    qVar.f3319c = false;
                }
                if (qVar.f3319c) {
                    g0.i3(qVar.d, 1000L);
                    return;
                }
                return;
            case 17:
                bi.y yVar = (bi.y) this.f82b;
                yVar.d2.setTranslationX(yVar.f3987c2.getAnimatedWidth() + g0.L(28.0f));
                return;
            case 18:
                ((t0) this.f82b).onBackPressed();
                return;
            case 19:
                x0 x0Var = (x0) this.f82b;
                Drawable drawable = x0Var.O;
                if (drawable != null && !x0Var.Q) {
                    drawable.setAlpha(255);
                }
                x0Var.f3966a.setAlpha(1.0f);
                if (x0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                }
                Runnable runnable2 = x0Var.P;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 20:
                p41 p41Var = ((s2) this.f82b).U1;
                if (p41Var != null) {
                    p41Var.O(false);
                    return;
                }
                return;
            case 21:
                ((e2) this.f82b).c();
                return;
            case 22:
                ((l2) this.f82b).invalidateSelf();
                return;
            case 23:
                n2 n2Var = (n2) this.f82b;
                bc bcVar = n2Var.f3728e;
                if (bcVar != null) {
                    bcVar.d();
                    n2Var.invalidateSelf();
                    return;
                }
                return;
            case 24:
                ((i4) this.f82b).p();
                return;
            case 25:
                ((c1.f) this.f82b).f().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 26:
                d();
                return;
            case 27:
                f();
                return;
            case 28:
                ch.r rVar = (ch.r) ((d6.i) this.f82b).f7595b;
                ch.q qVar2 = rVar.f5215b;
                if (qVar2 != null) {
                    qVar2.d(true);
                }
                rVar.f5214a.O7(true);
                return;
            default:
                ((ValueAnimator) this.f82b).start();
                return;
        }
    }

    public f(Object obj, int i7) {
        this.f81a = i7;
        this.f82b = obj;
    }
}
