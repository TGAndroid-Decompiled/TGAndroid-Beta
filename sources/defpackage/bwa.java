package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class bwa extends fx0 implements gk7 {
    public final i76 A1;
    public final d76 B1;
    public final View C1;
    public final wf2 D1;
    public final n84 E1;
    public final k27 F1;
    public final ArrayList G1;
    public final ge0 H1;
    public int I1;
    public l18 J1;
    public int K1;
    public v66 L1;
    public final cm2[] M1;
    public boolean N1;
    public boolean O1;
    public mu1 P1;
    public View Q1;
    public ValueAnimator R1;
    public final wjb l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final LinearLayout p1;
    public final FrameLayout q1;
    public final LinearLayout r1;
    public final qva s1;
    public final FrameLayout t1;
    public final FrameLayout u1;
    public final be0 v1;
    public final u41 w1;
    public final awa x1;
    public long y1;
    public long z1;

    public bwa(android.content.Context r42, final int r43, final long r44, defpackage.mu1 r46, defpackage.k27 r47, java.util.ArrayList r48, boolean r49, final boolean r50, long r51, final defpackage.wjb r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwa.<init>(android.content.Context, int, long, mu1, k27, java.util.ArrayList, boolean, boolean, long, wjb):void");
    }

    @Override
    public final void C(ArrayList arrayList, boolean z) {
        float f;
        float f2;
        Property property = View.ALPHA;
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ge0 ge0Var = this.H1;
        arrayList.add(ObjectAnimator.ofFloat(ge0Var, property, f));
        Property property2 = View.SCALE_X;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ge0Var, property2, f2));
        Property property3 = View.SCALE_Y;
        if (!z) {
            f3 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ge0Var, property3, f3));
    }

    @Override
    public final boolean E() {
        if (this.s1.l0) {
            return false;
        }
        return this.c0;
    }

    public final void E0(final cta ctaVar) {
        f19 f19Var;
        View view;
        i19 i19Var;
        l18 l18Var;
        View view2;
        i19 i19Var2;
        f19 f19Var2;
        k27 k27Var;
        qva qvaVar = this.s1;
        n84 n84Var = this.E1;
        k27 k27Var2 = this.F1;
        if (k27Var2 != null && (view2 = this.P1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q1;
            if (view3 instanceof gb2) {
                i19Var2 = ((gb2) view3).O;
                i19Var2.getClass();
                f19Var2 = i19Var2.l("stars");
            } else if (view3 instanceof uk1) {
                i19Var2 = ((uk1) view3).F0;
                i19Var2.getClass();
                f19Var2 = i19Var2.l("stars");
            } else {
                i19Var2 = null;
                f19Var2 = null;
            }
            if (f19Var2 == null && i19Var2 != null) {
                f27 l7 = this.P1.l7(k27Var2);
                if (l7 != null && !l7.e.isEmpty()) {
                    ArrayList arrayList = l7.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            k27Var = (k27) obj;
                            c27 d = l7.d(k27Var);
                            if (d != null) {
                                int i2 = d.l;
                                if ((i2 & 1) != 0 && (i2 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            k27Var = null;
                            break;
                        }
                    }
                    if (k27Var != null) {
                        view3 = this.P1.C6(k27Var.e1(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof gb2) {
                        i19Var2 = ((gb2) view3).O;
                        i19Var2.getClass();
                        f19Var2 = i19Var2.l("stars");
                    }
                } else {
                    return;
                }
            }
            if (f19Var2 != null) {
                i19Var = i19Var2;
                f19Var = f19Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.J1 == null) {
            return;
        } else {
            f19Var = null;
            view = null;
            i19Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        qvaVar.getLocationInWindow(iArr);
        rectF.set(qvaVar.H.getBounds());
        rectF.inset(-gl.L(3.5f), -gl.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        kva kvaVar = new kva(this, (byte) 2);
        n84Var.b0 = kvaVar;
        if (n84Var.a0) {
            n84Var.b0 = null;
            kvaVar.run();
        }
        if (f19Var != null) {
            f19Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        f19 f19Var3 = f19Var;
        d76[] d76VarArr = new d76[1];
        if (this.n1 && (l18Var = this.J1) != null) {
            d76VarArr[0] = l18Var.c(this.K1);
        }
        final RectF rectF2 = new RectF();
        final i87 i87Var = new i87(this, d76VarArr, iArr, rectF2, view, i19Var, f19Var3, (byte) 21);
        View view4 = view;
        i87Var.run();
        n84Var.setPaused(false);
        n84Var.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        n84Var.setTranslationX(rectF3.centerX() - (gl.L(150.0f) / 2.0f));
        n84Var.setTranslationY(rectF3.centerY() - (gl.L(150.0f) / 2.0f));
        n84Var.setScaleX(rectF3.width() / gl.L(150.0f));
        n84Var.setScaleY(rectF3.height() / gl.L(150.0f));
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                i87Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                gl.X1(rectF4, rectF5, floatValue, rectF6);
                bwa bwaVar = bwa.this;
                n84 n84Var2 = bwaVar.E1;
                n84Var2.setTranslationX(rectF6.centerX() - (gl.L(150.0f) / 2.0f));
                n84Var2.setTranslationY(rectF6.centerY() - (gl.L(150.0f) / 2.0f));
                float R1 = gl.R1(Math.max(rectF6.width() / gl.L(150.0f), rectF6.height() / gl.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                n84Var2.setScaleX(R1);
                n84Var2.setScaleY(R1);
                uq4 uq4Var = n84Var2.b;
                uq4Var.d = 360.0f * floatValue;
                uq4Var.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.a0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        bwaVar.c.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    cta ctaVar2 = ctaVar;
                    if (ctaVar2 != null) {
                        ctaVar2.run();
                    }
                }
            }
        });
        this.R1.addListener(new tva(this, f19Var3, view4, d76VarArr, zArr, rectF2, ctaVar));
        this.R1.setDuration(800L);
        this.R1.setInterpolator(new oe3((byte) 4));
        this.R1.start();
    }

    public final boolean F0() {
        if (!this.n1) {
            ct0 g = ct0.g(this.m1);
            g.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g.l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if ((obj instanceof TLRPC.Chat) && hc2.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void G0(boolean z) {
        boolean z2;
        FrameLayout frameLayout = this.t1;
        int i = 0;
        if (frameLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != F0()) {
            if (!F0()) {
                i = 8;
            }
            frameLayout.setVisibility(i);
            if (z) {
                if (F0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.r1, changeBounds);
            }
        }
    }

    public final void H0() {
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.p = 0.42f;
        long j = this.y1;
        int i = (j > 2666000L ? 1 : (j == 2666000L ? 0 : -1));
        be0 be0Var = this.v1;
        if (i == 0) {
            pb0Var.f(21);
            int i2 = bkb.b8;
            wjb wjbVar = this.l1;
            pb0Var.h(bkb.v0(i2, wjbVar), bkb.v0(i2, wjbVar));
            be0Var.f(null, pb0Var);
            return;
        }
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i4 = this.m1;
        if (i3 >= 0) {
            TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(this.y1));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
            return;
        }
        TLRPC.Chat K0 = na7.q1(i4).K0(Long.valueOf(-this.y1));
        pb0Var.p(K0);
        be0Var.f(K0, pb0Var);
    }

    @Override
    public final void I() {
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.I();
    }

    public final void I0(long j) {
        awa awaVar;
        long j2;
        long j3;
        boolean z;
        long j4 = 0;
        if ((!this.n1 || this.o1 || j <= 0) && (awaVar = this.x1) != null) {
            ArrayList arrayList = new ArrayList();
            long e = y6c.h(this.m1).e();
            int i = 1;
            ArrayList arrayList2 = this.G1;
            if (arrayList2 != null) {
                j3 = 0;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i2);
                    long n = cf3.n(messageReactor.peer_id);
                    long j5 = j4;
                    boolean z2 = messageReactor.anonymous;
                    if (z2) {
                        if (messageReactor.my) {
                            n = e;
                        } else {
                            n = (-i2) - i;
                        }
                    }
                    if (!messageReactor.my && n != e) {
                        long j6 = messageReactor.count;
                        ?? obj = new Object();
                        obj.a = z2;
                        obj.b = false;
                        obj.c = n;
                        obj.d = j6;
                        arrayList.add(obj);
                    } else {
                        j3 = messageReactor.count;
                    }
                    i2++;
                    j4 = j5;
                    i = 1;
                }
                j2 = j4;
            } else {
                j2 = 0;
                j3 = 0;
            }
            long j7 = j3 + j;
            if (j7 > j2) {
                if (this.y1 == 2666000) {
                    z = true;
                } else {
                    z = false;
                }
                ?? obj2 = new Object();
                obj2.a = z;
                obj2.b = true;
                obj2.c = e;
                obj2.d = j7;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new pva((byte) 0));
            awaVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override
    public final boolean U(float f, float f2) {
        ge0 ge0Var = this.H1;
        if (f >= ge0Var.getX() && f <= ge0Var.getX() + ge0Var.getWidth() && f2 >= ge0Var.getY() && f2 <= ge0Var.getY() + ge0Var.getHeight()) {
            return false;
        }
        return super.U(f, f2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.O3) {
            G0(true);
        }
    }

    @Override
    public final void dismiss() {
        Long z1;
        if (!this.N1 && !this.O1) {
            this.O1 = true;
            k27 k27Var = this.F1;
            if (k27Var != null && ((z1 = k27Var.z1()) == null || z1.longValue() != this.y1)) {
                k27Var.I5(this.y1);
                zsa b = zsa.b(k27Var);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i = this.m1;
                na7 q1 = na7.q1(i);
                long j = b.a;
                int i2 = b.b;
                tL_messages_togglePaidReactionPrivacy.peer = q1.h1(j);
                tL_messages_togglePaidReactionPrivacy.msg_id = i2;
                long j2 = this.y1;
                if (j2 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j2 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = na7.q1(i).h1(this.y1);
                }
                kk7.f(i).k(kk7.H1, Long.valueOf(b.a), Integer.valueOf(i2), Long.valueOf(this.y1));
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_togglePaidReactionPrivacy, new wx9(this, (byte) 4));
            }
        }
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.m1).b(this, kk7.O3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.m1).n(this, kk7.O3);
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 < 0 && this.H0 == this.I1 && (v0 = bkb.v0(bkb.g5, this.l1)) != this.H0) {
                this.H0 = v0;
                this.I1 = v0;
                x0(v0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
