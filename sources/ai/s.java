package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Trace;
import b8.sc;
import b8.tc;
import ci.lc;
import ci.nb;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.i20;
public final class s implements Runnable {
    public final int f954a;
    public final Object f955b;

    public s(androidx.fragment.app.l lVar, androidx.fragment.app.u0 u0Var) {
        this.f954a = 11;
        this.f955b = lVar;
    }

    private final void a() {
        boolean z10;
        String str;
        m.o3 o3Var = (m.o3) this.f955b;
        synchronized (((AtomicMarkableReference) o3Var.f18687g)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) o3Var.f18687g).isMarked()) {
                    str = (String) ((AtomicMarkableReference) o3Var.f18687g).getReference();
                    ((AtomicMarkableReference) o3Var.f18687g).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((ba.h) o3Var.f18682a).i((String) o3Var.f18684c, str);
        }
    }

    private final void b() {
        b4.n nVar = (b4.n) this.f955b;
        Map map = null;
        ((AtomicReference) nVar.f2379c).set(null);
        synchronized (nVar) {
            try {
                if (((AtomicMarkableReference) nVar.f2378b).isMarked()) {
                    map = ((ba.e) ((AtomicMarkableReference) nVar.f2378b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) nVar.f2378b;
                    atomicMarkableReference.set((ba.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            m.o3 o3Var = (m.o3) nVar.d;
            ((ba.h) o3Var.f18682a).h((String) o3Var.f18684c, map, nVar.f2377a);
        }
    }

    @Override
    public final void run() {
        switch (this.f954a) {
            case 0:
                e0 e0Var = (e0) this.f955b;
                e0Var.f596a2.setTranslationX(e0Var.Z1.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                return;
            case 1:
                ((z0) this.f955b).onBackPressed();
                return;
            case 2:
                f41 f41Var = ((b3) this.f955b).R1;
                if (f41Var != null) {
                    f41Var.O(false);
                    return;
                }
                return;
            case 3:
                ((m2) this.f955b).c();
                return;
            case 4:
                ((t2) this.f955b).invalidateSelf();
                return;
            case 5:
                w2 w2Var = (w2) this.f955b;
                lc lcVar = w2Var.f1058e;
                if (lcVar != null) {
                    lcVar.d();
                    w2Var.invalidateSelf();
                    return;
                }
                return;
            case 6:
                ((u4) this.f955b).p();
                return;
            case 7:
                ((androidx.activity.l) this.f955b).invalidateOptionsMenu();
                return;
            case 8:
                androidx.activity.k kVar = (androidx.activity.k) this.f955b;
                Runnable runnable = kVar.f1253b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1253b = null;
                    return;
                }
                return;
            case 9:
                androidx.activity.m.a((androidx.activity.m) this.f955b);
                return;
            case 10:
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.f955b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.f1757n != null) {
                            try {
                                o0.i d = rVar.d();
                                int i3 = d.f20497e;
                                if (i3 == 2) {
                                    synchronized (rVar.d) {
                                    }
                                }
                                if (i3 == 0) {
                                    int i10 = n0.g.f20114a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    ra.e eVar = rVar.f1754c;
                                    Context context = rVar.f1752a;
                                    eVar.getClass();
                                    o0.i[] iVarArr = {d};
                                    sc scVar = i0.e.f14501a;
                                    x7.e6.a("TypefaceCompat.createFromFontInfo");
                                    Typeface b10 = i0.e.f14501a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e10 = tc.e(rVar.f1752a, d.f20494a);
                                    if (e10 != null && b10 != null) {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        ui.f fVar = new ui.f(b10, b8.x0.a(e10));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (rVar.d) {
                                            b8.w0 w0Var = rVar.f1757n;
                                            if (w0Var != null) {
                                                w0Var.b(fVar);
                                            }
                                        }
                                        rVar.b();
                                        return;
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            } catch (Throwable th2) {
                                synchronized (rVar.d) {
                                    try {
                                        b8.w0 w0Var2 = rVar.f1757n;
                                        if (w0Var2 != null) {
                                            w0Var2.a(th2);
                                        }
                                        rVar.b();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 11:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f955b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 12:
                Iterator it = ((androidx.fragment.app.j0) this.f955b).f1837n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                throw a1.g.m(it);
            case 13:
                androidx.lifecycle.e0 e0Var2 = (androidx.lifecycle.e0) this.f955b;
                androidx.lifecycle.v vVar = e0Var2.f1982f;
                if (e0Var2.f1979b == 0) {
                    e0Var2.f1980c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var2.f1978a == 0 && e0Var2.f1980c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var2.d = true;
                    return;
                }
                return;
            case 14:
                a();
                return;
            case 15:
                b();
                return;
            case 16:
                ((bh.c) this.f955b).f();
                return;
            case 17:
                ((bi.s) this.f955b).e();
                return;
            case 18:
                ((c1.e) this.f955b).e().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 19:
                ((c3.e) this.f955b).h.i0();
                return;
            case 20:
                ((c3.u) this.f955b).f4115m--;
                return;
            case 21:
                r0.f3983a.postVsyncCallback((c3.c0) this.f955b);
                return;
            case 22:
                try {
                    ((Bitmap) this.f955b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                cg.p pVar = (cg.p) this.f955b;
                long j10 = pVar.f4730b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    pVar.f4730b = j11;
                    pVar.f4729a.h(j11);
                }
                if (pVar.f4730b <= 0) {
                    pVar.f4731c = false;
                }
                if (pVar.f4731c) {
                    org.telegram.messenger.g0.i3(pVar.d, 1000L);
                    return;
                }
                return;
            case 24:
                ci.c cVar = (ci.c) this.f955b;
                cVar.getClass();
                new nb(cVar.getContext(), cVar.f4898b).show();
                return;
            case 25:
                ci.u uVar = (ci.u) this.f955b;
                if (uVar.isAttachedToWindow() && !uVar.f6071c.canScrollVertically(1)) {
                    uVar.a();
                    return;
                }
                return;
            case 26:
                new gu0(((i20) this.f955b).getContext()).show();
                return;
            case 27:
                org.telegram.messenger.g0.K3(((ci.t0) this.f955b).X1);
                return;
            case 28:
                org.telegram.messenger.g0.K3(((ci.x0) this.f955b).f6313o1);
                return;
            default:
                org.telegram.messenger.g0.K3(((ci.a1) this.f955b).k1);
                return;
        }
    }

    public s(Object obj, int i3) {
        this.f954a = i3;
        this.f955b = obj;
    }
}
