package ag;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import bi.a4;
import bi.d4;
import bi.v3;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.i5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zr;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.sf;
import org.telegram.ui.aj;
import org.telegram.ui.bj;
import org.telegram.ui.er0;
import org.telegram.ui.fj;
import org.telegram.ui.fn;
import org.telegram.ui.ge;
import org.telegram.ui.he;
import org.telegram.ui.km;
import org.telegram.ui.kq0;
import org.telegram.ui.p4;
import org.telegram.ui.un;
import v7.t6;
public final class d3 implements Runnable {
    public final int f485a;
    public final int f486b;
    public final Object f487c;

    public d3(int i10, Object obj, int i11) {
        this.f485a = i11;
        this.f486b = i10;
        this.f487c = obj;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        CharSequence charSequence;
        int i11;
        int i12;
        int i13;
        int i14 = this.f485a;
        boolean z10 = false;
        final int i15 = this.f486b;
        Object obj = this.f487c;
        switch (i14) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = ((hs) obj).f15940b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i15).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i15).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                bi.g0 g0Var = (bi.g0) obj;
                bi.j0 j0Var = g0Var.f3026f;
                if (g0Var.f3025c && j0Var.E != null && j0Var.f2881a != null) {
                    g0Var.d = true;
                    g0Var.f3023a.m(false);
                    try {
                        g0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    bi.h0 h0Var = j0Var.E;
                    bi.a aVar = j0Var.f2881a;
                    d4 d4Var = ((v3) h0Var).f3410a;
                    d4Var.r3(false);
                    d4Var.f2938o3.v(new a4(d4Var, aVar, i15), g0Var);
                    return;
                }
                return;
            case 2:
                ((c2.f) obj).f3538b.onAudioFocusChange(i15);
                return;
            case 3:
                ((qx) obj).w0(i15, 0, null);
                return;
            case 4:
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    try {
                        x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(d20.f15147s0).cancelRequest(i15, true);
                            }
                        });
                        x1VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 5:
                j2.g gVar = ((i2.s0) obj).M;
                j2.a Q = gVar.Q();
                gVar.V(Q, 1034, new j2.c(Q, i15, 11, (char) 0));
                return;
            case 6:
                jg.j jVar = (jg.j) obj;
                jVar.L = i15;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
                }
                ValueAnimator valueAnimator = jVar.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(gr.f26495f);
                jVar.P.addUpdateListener(new jg.f(jVar, 5));
                jVar.P.addListener(new jg.g(jVar, 2));
                jVar.P.start();
                return;
            case 7:
                er0 er0Var = (er0) obj;
                ig.q1 q1Var = er0Var.f10191t1;
                er0Var.r0(q1Var, null);
                ig.s0.e(i15).j(q1Var.f8434c);
                return;
            case 8:
                zs.f(i15).k(215, Boolean.FALSE);
                ((jg.v2) obj).h();
                return;
            case 9:
                String str2 = e2.l0.f6165a;
                e2.c cVar = ((i2.c0) ((k2.w) ((hf.b) obj).f7658c)).f7821a.C;
                i2.w wVar = new i2.w(i15, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.i0) cVar.f6118c).f6151a.getLooper()) {
                    z10 = true;
                }
                t6.p(z10);
                cVar.f6116a++;
                cVar.n(new d1.e(7, cVar, wVar));
                Integer num = (Integer) cVar.e;
                cVar.t(Integer.valueOf(i15));
                return;
            case 10:
                p80 p80Var = ((mg.n1) obj).e;
                try {
                    if (p80Var.getLayout().getLineForOffset(i15) == 0) {
                        p80Var.getEditableText().insert(i15, "\n");
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 11:
                ConnectionsManager.lambda$onUpdateConfig$21(i15, (TLRPC.TL_config) obj);
                return;
            case 12:
                vp.r1(i15).T2(0, ((TLRPC.Chat) obj).f19793id, true);
                return;
            case 13:
                ((p4) ((org.telegram.ui.e) obj).f36877b).Z(i15, true);
                return;
            case 14:
                org.telegram.ui.Cells.q1 q1Var2 = ((org.telegram.ui.Cells.d1) obj).f21803a;
                int i16 = q1Var2.L5;
                if (i15 == i16) {
                    org.telegram.ui.Cells.c0 c0Var = (org.telegram.ui.Cells.c0) q1Var2.G5.get(i16);
                    if (c0Var != null) {
                        org.telegram.ui.Cells.y yVar = c0Var.f21768s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var.b(false);
                        if (!q1Var2.O5.f16357p1) {
                            if (c0Var.f21759j != null) {
                                q1Var2.m();
                            } else if (c0Var.f21758i != null) {
                                q1Var2.m();
                                org.telegram.ui.Cells.l1 l1Var = q1Var2.Qa;
                                if (l1Var != null) {
                                    l1Var.q1(q1Var2, c0Var.f21758i);
                                }
                            }
                        }
                    }
                    q1Var2.L5 = -1;
                    q1Var2.n2();
                    return;
                }
                return;
            case 15:
                he heVar = ((ge) obj).f37523f;
                heVar.getClass();
                heVar.c(i15);
                return;
            case 16:
                ((fj) obj).f37281a.k(this.f486b, 0, true, 0, true, 0);
                return;
            case 17:
                un unVar = ((aj) obj).f35660g;
                if (unVar.Rb == i15) {
                    unVar.bb();
                    return;
                }
                return;
            case 18:
                un unVar2 = ((bj) obj).f36267g;
                if (unVar2.Rb == i15) {
                    unVar2.bb();
                    return;
                }
                return;
            case 19:
                un unVar3 = ((aj) obj).f35660g;
                if (unVar3.Rb == i15) {
                    unVar3.bb();
                    return;
                }
                return;
            case 20:
                un unVar4 = ((bj) obj).f36267g;
                if (unVar4.Rb == i15) {
                    unVar4.bb();
                    return;
                }
                return;
            case 21:
                un unVar5 = ((bj) obj).f36267g;
                if (unVar5.Rb == i15) {
                    unVar5.bb();
                    return;
                }
                return;
            case 22:
                un unVar6 = ((km) obj).f38902w0;
                unVar6.B0.h1(i15, unVar6.M4);
                return;
            case 23:
                i10 = ((org.telegram.ui.ActionBar.k2) ((fn) obj).f37301a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i15, true);
                return;
            case 24:
                zs.f(i15).k(4, new Object[0]);
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.q1((zr) obj, 1), 250L);
                return;
            case 25:
                p80 p80Var2 = (p80) obj;
                ArrayList v = i5.r(i15).v(11);
                String L0 = cd.L0(2131751242, null);
                if (v != null && !v.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < v.size()) {
                            if (v.get(i17) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                L0 = cd.L0(2131751242, null);
                            } else {
                                if ((v.get(i17) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i17) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    L0 = cd.L0(2131751243, null);
                                }
                                i17++;
                            }
                        }
                    }
                }
                p80Var2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(L0, new org.telegram.ui.Components.f1(0, v)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
                return;
            case 26:
                ((m4.n0) obj).t(i15);
                return;
            case 27:
                nc ncVar = (nc) obj;
                vh.p2 p2Var = ncVar.f28748c1;
                if (ncVar.f28746a1 != i15) {
                    ncVar.setTimer(i15);
                    q20 q20Var = ncVar.f28761q1;
                    if (q20Var != null) {
                        q20Var.a(Integer.valueOf(i15));
                    }
                    float f7 = 1.0f;
                    if (i15 == 0) {
                        if (ncVar.f28760p1) {
                            i13 = 2131744153;
                        } else {
                            i13 = 2131744158;
                        }
                        charSequence = cd.L0(i13, null);
                        p2Var.h = ncVar.getMeasuredWidth();
                        p2Var.p(false);
                        p2Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        p2Var.f51732e0 = org.telegram.messenger.i0.L(0);
                        p2Var.f51731d0 = -org.telegram.messenger.i0.L(1.0f);
                    } else if (i15 == Integer.MAX_VALUE) {
                        if (ncVar.f28760p1) {
                            i11 = 2131744152;
                        } else {
                            i11 = 2131744157;
                        }
                        charSequence = cd.L0(i11, null);
                        p2Var.h = ncVar.getMeasuredWidth();
                        p2Var.p(false);
                        p2Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        p2Var.f51732e0 = org.telegram.messenger.i0.L(0);
                        p2Var.f51731d0 = -org.telegram.messenger.i0.L(1.0f);
                    } else if (i15 > 0) {
                        if (ncVar.f28760p1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.G(i15, str, new Object[0]));
                        p2Var.p(true);
                        p2Var.h = vh.p2.a(W2, p2Var.getTextPaint());
                        p2Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        p2Var.f51732e0 = org.telegram.messenger.i0.L(2);
                        p2Var.f51731d0 = 0.0f;
                        charSequence = W2;
                    } else {
                        return;
                    }
                    float L = (-Math.min(org.telegram.messenger.i0.L(34.0f), ncVar.getEditTextHeight())) - org.telegram.messenger.i0.L(14.0f);
                    if (ncVar instanceof kq0) {
                        f7 = -1.0f;
                    }
                    p2Var.setTranslationY(L * f7);
                    p2Var.s(charSequence);
                    if (i15 > 0) {
                        i12 = 2131624020;
                    } else {
                        i12 = 2131624019;
                    }
                    bi0 bi0Var = new bi0(i12, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(34.0f));
                    bi0Var.start();
                    p2Var.j(bi0Var);
                    p2Var.u();
                    ncVar.f28758n1 = false;
                    org.telegram.messenger.i0.r(ncVar.f28759o1);
                    ncVar.invalidate();
                    return;
                }
                return;
            case 28:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                gf gfVar = chatActivityEnterView.U0;
                if (gfVar != null) {
                    if (chatActivityEnterView.f23723h5 == null) {
                        gfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f23753n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                im imVar = (im) obj;
                jm jmVar = imVar.P;
                if (i15 == imVar.O && jmVar.f27405x.isShown()) {
                    jmVar.f27405x.d(1, true);
                    return;
                }
                return;
        }
    }

    public d3(Object obj, int i10, int i11) {
        this.f485a = i11;
        this.f487c = obj;
        this.f486b = i10;
    }
}
