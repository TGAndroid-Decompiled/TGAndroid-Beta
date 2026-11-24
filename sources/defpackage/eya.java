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
public final class eya extends my0 implements jm7 {
    public final i96 A1;
    public final d96 B1;
    public final View C1;
    public final jh2 D1;
    public final w94 E1;
    public final k47 F1;
    public final ArrayList G1;
    public final gf0 H1;
    public int I1;
    public n38 J1;
    public int K1;
    public v86 L1;
    public final pn2[] M1;
    public boolean N1;
    public boolean O1;
    public yv1 P1;
    public View Q1;
    public ValueAnimator R1;
    public final ylb l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final LinearLayout p1;
    public final FrameLayout q1;
    public final LinearLayout r1;
    public final txa s1;
    public final FrameLayout t1;
    public final FrameLayout u1;
    public final bf0 v1;
    public final b61 w1;
    public final dya x1;
    public long y1;
    public long z1;

    public eya(android.content.Context r42, final int r43, final long r44, defpackage.yv1 r46, defpackage.k47 r47, java.util.ArrayList r48, boolean r49, final boolean r50, long r51, final defpackage.ylb r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eya.<init>(android.content.Context, int, long, yv1, k47, java.util.ArrayList, boolean, boolean, long, ylb):void");
    }

    @Override
    public final void B(ArrayList arrayList, boolean z) {
        float f;
        float f2;
        Property property = View.ALPHA;
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        gf0 gf0Var = this.H1;
        arrayList.add(ObjectAnimator.ofFloat(gf0Var, property, f));
        Property property2 = View.SCALE_X;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(gf0Var, property2, f2));
        Property property3 = View.SCALE_Y;
        if (!z) {
            f3 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(gf0Var, property3, f3));
    }

    @Override
    public final boolean C() {
        if (this.s1.l0) {
            return false;
        }
        return this.c0;
    }

    public final void E0(final fva fvaVar) {
        i39 i39Var;
        View view;
        l39 l39Var;
        n38 n38Var;
        View view2;
        l39 l39Var2;
        i39 i39Var2;
        k47 k47Var;
        txa txaVar = this.s1;
        w94 w94Var = this.E1;
        k47 k47Var2 = this.F1;
        if (k47Var2 != null && (view2 = this.P1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q1;
            if (view3 instanceof rc2) {
                l39Var2 = ((rc2) view3).O;
                l39Var2.getClass();
                i39Var2 = l39Var2.l("stars");
            } else if (view3 instanceof cm1) {
                l39Var2 = ((cm1) view3).F0;
                l39Var2.getClass();
                i39Var2 = l39Var2.l("stars");
            } else {
                l39Var2 = null;
                i39Var2 = null;
            }
            if (i39Var2 == null && l39Var2 != null) {
                f47 v7 = this.P1.v7(k47Var2);
                if (v7 != null && !v7.e.isEmpty()) {
                    ArrayList arrayList = v7.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            k47Var = (k47) obj;
                            c47 d = v7.d(k47Var);
                            if (d != null) {
                                int i2 = d.l;
                                if ((i2 & 1) != 0 && (i2 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            k47Var = null;
                            break;
                        }
                    }
                    if (k47Var != null) {
                        view3 = this.P1.L6(k47Var.e1(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof rc2) {
                        l39Var2 = ((rc2) view3).O;
                        l39Var2.getClass();
                        i39Var2 = l39Var2.l("stars");
                    }
                } else {
                    return;
                }
            }
            if (i39Var2 != null) {
                l39Var = l39Var2;
                i39Var = i39Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.J1 == null) {
            return;
        } else {
            i39Var = null;
            view = null;
            l39Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        txaVar.getLocationInWindow(iArr);
        rectF.set(txaVar.H.getBounds());
        rectF.inset(-gm.L(3.5f), -gm.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        oxa oxaVar = new oxa(this, (byte) 2);
        w94Var.b0 = oxaVar;
        if (w94Var.a0) {
            w94Var.b0 = null;
            oxaVar.run();
        }
        if (i39Var != null) {
            i39Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        i39 i39Var3 = i39Var;
        d96[] d96VarArr = new d96[1];
        if (this.n1 && (n38Var = this.J1) != null) {
            d96VarArr[0] = n38Var.c(this.K1);
        }
        final RectF rectF2 = new RectF();
        final ja7 ja7Var = new ja7(this, d96VarArr, iArr, rectF2, view, l39Var, i39Var3, (byte) 21);
        View view4 = view;
        ja7Var.run();
        w94Var.setPaused(false);
        w94Var.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        w94Var.setTranslationX(rectF3.centerX() - (gm.L(150.0f) / 2.0f));
        w94Var.setTranslationY(rectF3.centerY() - (gm.L(150.0f) / 2.0f));
        w94Var.setScaleX(rectF3.width() / gm.L(150.0f));
        w94Var.setScaleY(rectF3.height() / gm.L(150.0f));
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
                ja7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                gm.X1(rectF4, rectF5, floatValue, rectF6);
                eya eyaVar = eya.this;
                w94 w94Var2 = eyaVar.E1;
                w94Var2.setTranslationX(rectF6.centerX() - (gm.L(150.0f) / 2.0f));
                w94Var2.setTranslationY(rectF6.centerY() - (gm.L(150.0f) / 2.0f));
                float R1 = gm.R1(Math.max(rectF6.width() / gm.L(150.0f), rectF6.height() / gm.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                w94Var2.setScaleX(R1);
                w94Var2.setScaleY(R1);
                vs4 vs4Var = w94Var2.b;
                vs4Var.d = 360.0f * floatValue;
                vs4Var.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.a0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        eyaVar.c.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    fva fvaVar2 = fvaVar;
                    if (fvaVar2 != null) {
                        fvaVar2.run();
                    }
                }
            }
        });
        this.R1.addListener(new wxa(this, i39Var3, view4, d96VarArr, zArr, rectF2, fvaVar));
        this.R1.setDuration(800L);
        this.R1.setInterpolator(new bg3((byte) 4));
        this.R1.start();
    }

    public final boolean F0() {
        if (!this.n1) {
            ku0 g = ku0.g(this.m1);
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
                if ((obj instanceof TLRPC.Chat) && sd2.V((TLRPC.Chat) obj)) {
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

    @Override
    public final void H() {
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.H();
    }

    public final void H0() {
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.p = 0.42f;
        long j = this.y1;
        int i = (j > 2666000L ? 1 : (j == 2666000L ? 0 : -1));
        bf0 bf0Var = this.v1;
        if (i == 0) {
            pc0Var.f(21);
            int i2 = cmb.b8;
            ylb ylbVar = this.l1;
            pc0Var.h(cmb.v0(i2, ylbVar), cmb.v0(i2, ylbVar));
            bf0Var.f(null, pc0Var);
            return;
        }
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i4 = this.m1;
        if (i3 >= 0) {
            TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(this.y1));
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
            return;
        }
        TLRPC.Chat L0 = oc7.r1(i4).L0(Long.valueOf(-this.y1));
        pc0Var.p(L0);
        bf0Var.f(L0, pc0Var);
    }

    public final void I0(long j) {
        dya dyaVar;
        long j2;
        long j3;
        byte b;
        boolean z;
        long j4 = 0;
        if ((!this.n1 || this.o1 || j <= 0) && (dyaVar = this.x1) != null) {
            ArrayList arrayList = new ArrayList();
            long e = z8c.h(this.m1).e();
            int i = 1;
            ArrayList arrayList2 = this.G1;
            if (arrayList2 != null) {
                j3 = 0;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i2);
                    long n = pg3.n(messageReactor.peer_id);
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
                b = 1;
                obj2.b = true;
                obj2.c = e;
                obj2.d = j7;
                arrayList.add(obj2);
            } else {
                b = 1;
            }
            Collections.sort(arrayList, new zua(b));
            dyaVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override
    public final boolean T(float f, float f2) {
        gf0 gf0Var = this.H1;
        if (f >= gf0Var.getX() && f <= gf0Var.getX() + gf0Var.getWidth() && f2 >= gf0Var.getY() && f2 <= gf0Var.getY() + gf0Var.getHeight()) {
            return false;
        }
        return super.T(f, f2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.P3) {
            G0(true);
        }
    }

    @Override
    public final void dismiss() {
        Long z1;
        if (!this.N1 && !this.O1) {
            this.O1 = true;
            k47 k47Var = this.F1;
            if (k47Var != null && ((z1 = k47Var.z1()) == null || z1.longValue() != this.y1)) {
                k47Var.I5(this.y1);
                cva b = cva.b(k47Var);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i = this.m1;
                oc7 r1 = oc7.r1(i);
                long j = b.a;
                int i2 = b.b;
                tL_messages_togglePaidReactionPrivacy.peer = r1.i1(j);
                tL_messages_togglePaidReactionPrivacy.msg_id = i2;
                long j2 = this.y1;
                if (j2 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j2 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = oc7.r1(i).i1(this.y1);
                }
                nm7.f(i).k(nm7.I1, Long.valueOf(b.a), Integer.valueOf(i2), Long.valueOf(this.y1));
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_togglePaidReactionPrivacy, new go9(this, (byte) 5));
            }
        }
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.m1).b(this, nm7.P3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.m1).n(this, nm7.P3);
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 < 0 && this.H0 == this.I1 && (v0 = cmb.v0(cmb.g5, this.l1)) != this.H0) {
                this.H0 = v0;
                this.I1 = v0;
                x0(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
