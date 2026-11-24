package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qn4 implements Runnable {
    public final byte a;
    public final Object b;

    public qn4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        o25 o25Var = (o25) this.b;
        synchronized (o25Var) {
            if (o25Var.a) {
                return;
            }
            o25Var.a = true;
            Runnable runnable = o25Var.b;
            if (runnable != null) {
                runnable.run();
                o25Var.b = null;
            }
        }
    }

    private final void b() {
        q25 q25Var = (q25) this.b;
        synchronized (q25Var) {
            if (q25Var.a) {
                return;
            }
            q25Var.a = true;
            Runnable runnable = q25Var.b;
            if (runnable != null) {
                runnable.run();
                q25Var.b = null;
            }
        }
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                rn4 rn4Var = (rn4) this.b;
                synchronized (rn4Var.c) {
                    if (rn4Var.h != null) {
                        try {
                            co4 d = rn4Var.d();
                            int i = d.e;
                            if (i == 2) {
                                synchronized (rn4Var.c) {
                                }
                            }
                            if (i == 0) {
                                int i2 = ozb.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = rn4Var.a;
                                co4[] co4VarArr = {d};
                                xye xyeVar = s5c.a;
                                yxe.a("TypefaceCompat.createFromFontInfo");
                                Typeface b = s5c.a.b(context, co4VarArr, 0);
                                Trace.endSection();
                                MappedByteBuffer d2 = aze.d(rn4Var.a, d.a);
                                if (d2 != null && b != null) {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    e7a e7aVar = new e7a(b, dre.a(d2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rn4Var.c) {
                                        bhe bheVar = rn4Var.h;
                                        if (bheVar != null) {
                                            bheVar.b(e7aVar);
                                        }
                                    }
                                    rn4Var.a();
                                    return;
                                }
                                throw new RuntimeException("Unable to open file.");
                            }
                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                        } catch (Throwable th) {
                            synchronized (rn4Var.c) {
                                bhe bheVar2 = rn4Var.h;
                                if (bheVar2 != null) {
                                    bheVar2.a(th);
                                }
                                rn4Var.a();
                                return;
                            }
                        }
                    }
                    return;
                }
            case 1:
                Iterator it = ((hq4) this.b).n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                throw kt6.l(it);
            case 2:
                ((pt4) this.b).b(null);
                return;
            case 3:
                ((st4) this.b).E();
                return;
            case 4:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            case 5:
                rv4 rv4Var = ((qv4) this.b).r;
                yj8 yj8Var = new yj8(rv4Var.r1, rv4Var.a, null, null, null, rv4Var.J0);
                yj8Var.E2 = true;
                yj8Var.X1 = true;
                rv4Var.r1.showDialog(yj8Var);
                return;
            case 6:
                xv4 xv4Var = (xv4) this.b;
                Drawable drawable = xv4Var.Q;
                if (drawable != null && !xv4Var.S) {
                    drawable.setAlpha(255);
                }
                xv4Var.a.setAlpha(1.0f);
                if (xv4Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) xv4Var.getParent()).removeView(xv4Var);
                }
                Runnable runnable = xv4Var.R;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = ((mw4) this.b).r1;
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                return;
            case 8:
                l7c l7cVar = ((ux4) this.b).T1;
                if (l7cVar != null) {
                    l7cVar.O(false);
                    return;
                }
                return;
            case 9:
                ((lx4) this.b).c();
                return;
            case 10:
                ((rx4) this.b).invalidateSelf();
                return;
            case 11:
                tx4 tx4Var = (tx4) this.b;
                yxa yxaVar = tx4Var.e;
                if (yxaVar != null) {
                    yxaVar.d();
                    tx4Var.invalidateSelf();
                    return;
                }
                return;
            case 12:
                ((wz4) this.b).k();
                return;
            case 13:
                a();
                return;
            case 14:
                ((y25) this.b).close();
                return;
            case 15:
                b();
                return;
            case 16:
                l35 l35Var = (l35) this.b;
                l35Var.c("AUTH_CANCELED");
                l35Var.e();
                if (cle.b == l35Var) {
                    cle.b = null;
                    return;
                }
                return;
            case 17:
                ((mk7) this.b).dismiss();
                return;
            case 18:
                n55 n55Var = (n55) this.b;
                n55Var.b.g3.O(true);
                n55Var.Z(true);
                return;
            case 19:
                r85 r85Var = (r85) this.b;
                g95 g95Var = r85Var.f;
                e75 e75Var = g95Var.l1;
                gn5 gn5Var = r85Var.d;
                if (gn5Var != null) {
                    e75Var.L0 = gn5Var;
                    e75Var.r1 = null;
                    e75Var.s1 = null;
                    r85Var.d = null;
                }
                TLRPC.Chat L0 = oc7.r1(g95Var.n1.a).L0(Long.valueOf(-r85Var.e));
                gn5 a = gn5.a(0, L0);
                gn5 a2 = gn5.a(1, L0);
                if (gn5.e(r85Var.b) == null) {
                    a2 = gn5.e(r85Var.c);
                }
                e75Var.setCreateThumbFromParent(false);
                e75Var.H(null, a, a2, true);
                r85Var.c = null;
                r85Var.b = null;
                gm.V3(g95Var.J1);
                r85Var.a(1.0f);
                return;
            case 20:
                sb sbVar = (sb) ((pd) this.b).i;
                if (sbVar != null) {
                    sbVar.invalidate();
                    return;
                }
                return;
            case 21:
                ((i95) this.b).invalidate();
                return;
            case 22:
                s95 s95Var = (s95) this.b;
                GroupCallMessage groupCallMessage = s95Var.I;
                if (groupCallMessage != null) {
                    s95Var.a.a(groupCallMessage.isSendDelayed(), true);
                    s95Var.b.a(s95Var.I.isSendError(), true);
                    return;
                }
                return;
            case 23:
                ((ha5) this.b).requestLayout();
                return;
            case 24:
                ((oa5) this.b).h(true);
                return;
            case 25:
                jb5 jb5Var = (jb5) this.b;
                jb5Var.Q0 = null;
                jb5Var.setVisibleParticipant(true);
                return;
            case 26:
                uc5 uc5Var = (uc5) this.b;
                uc5Var.E = null;
                uc5Var.F = null;
                uc5Var.G = null;
                uc5Var.H = null;
                uc5Var.J = null;
                uc5Var.I = null;
                uc5Var.K = 0.0d;
                uc5Var.e0(false, true);
                uc5Var.d.m(null, null, uc5Var.r, null);
                uc5Var.f.setAnimation(uc5Var.S);
                uc5Var.S.H(0);
                return;
            case 27:
                ts2.u(null, 2131749135, c41.b0(((ed5) this.b).c), 2131624000, 36);
                return;
            case 28:
                sj3 sj3Var = ((mv9) ((bf5) this.b)).f0;
                if (!sj3Var.x0.canScrollVertically(-1)) {
                    sj3Var.w0.g1(0, 0);
                    return;
                }
                return;
            default:
                ((fg5) this.b).b.a();
                return;
        }
    }
}
