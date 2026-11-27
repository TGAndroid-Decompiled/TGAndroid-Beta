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
public final class e0b extends nx0 implements fn7 {
    public final m96 A1;
    public final h96 B1;
    public final View C1;
    public final og2 D1;
    public final i94 E1;
    public final r47 F1;
    public final ArrayList G1;
    public final ie0 H1;
    public int I1;
    public b58 J1;
    public int K1;
    public z86 L1;
    public final wm2[] M1;
    public boolean N1;
    public boolean O1;
    public zu1 P1;
    public View Q1;
    public ValueAnimator R1;
    public final vnb l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final LinearLayout p1;
    public final FrameLayout q1;
    public final LinearLayout r1;
    public final tza s1;
    public final FrameLayout t1;
    public final FrameLayout u1;
    public final de0 v1;
    public final c51 w1;
    public final d0b x1;
    public long y1;
    public long z1;

    public e0b(android.content.Context r42, final int r43, final long r44, defpackage.zu1 r46, defpackage.r47 r47, java.util.ArrayList r48, boolean r49, final boolean r50, long r51, final defpackage.vnb r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0b.<init>(android.content.Context, int, long, zu1, r47, java.util.ArrayList, boolean, boolean, long, vnb):void");
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
        ie0 ie0Var = this.H1;
        arrayList.add(ObjectAnimator.ofFloat(ie0Var, property, f));
        Property property2 = View.SCALE_X;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ie0Var, property2, f2));
        Property property3 = View.SCALE_Y;
        if (!z) {
            f3 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ie0Var, property3, f3));
    }

    @Override
    public final boolean D() {
        if (this.s1.l0) {
            return false;
        }
        return this.c0;
    }

    public final void F0(final fxa fxaVar) {
        u49 u49Var;
        View view;
        x49 x49Var;
        b58 b58Var;
        View view2;
        x49 x49Var2;
        u49 u49Var2;
        r47 r47Var;
        tza tzaVar = this.s1;
        i94 i94Var = this.E1;
        r47 r47Var2 = this.F1;
        if (r47Var2 != null && (view2 = this.P1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q1;
            if (view3 instanceof wb2) {
                x49Var2 = ((wb2) view3).O;
                x49Var2.getClass();
                u49Var2 = x49Var2.l("stars");
            } else if (view3 instanceof dl1) {
                x49Var2 = ((dl1) view3).F0;
                x49Var2.getClass();
                u49Var2 = x49Var2.l("stars");
            } else {
                x49Var2 = null;
                u49Var2 = null;
            }
            if (u49Var2 == null && x49Var2 != null) {
                m47 v7 = this.P1.v7(r47Var2);
                if (v7 != null && !v7.e.isEmpty()) {
                    ArrayList arrayList = v7.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            r47Var = (r47) obj;
                            j47 d = v7.d(r47Var);
                            if (d != null) {
                                int i2 = d.l;
                                if ((i2 & 1) != 0 && (i2 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            r47Var = null;
                            break;
                        }
                    }
                    if (r47Var != null) {
                        view3 = this.P1.L6(r47Var.e1(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof wb2) {
                        x49Var2 = ((wb2) view3).O;
                        x49Var2.getClass();
                        u49Var2 = x49Var2.l("stars");
                    }
                } else {
                    return;
                }
            }
            if (u49Var2 != null) {
                x49Var = x49Var2;
                u49Var = u49Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.J1 == null) {
            return;
        } else {
            u49Var = null;
            view = null;
            x49Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        tzaVar.getLocationInWindow(iArr);
        rectF.set(tzaVar.H.getBounds());
        rectF.inset(-hl.L(3.5f), -hl.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        oza ozaVar = new oza(this, (byte) 2);
        i94Var.b0 = ozaVar;
        if (i94Var.a0) {
            i94Var.b0 = null;
            ozaVar.run();
        }
        if (u49Var != null) {
            u49Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        u49 u49Var3 = u49Var;
        h96[] h96VarArr = new h96[1];
        if (this.n1 && (b58Var = this.J1) != null) {
            h96VarArr[0] = b58Var.c(this.K1);
        }
        final RectF rectF2 = new RectF();
        final ra7 ra7Var = new ra7(this, h96VarArr, iArr, rectF2, view, x49Var, u49Var3, (byte) 21);
        View view4 = view;
        ra7Var.run();
        i94Var.setPaused(false);
        i94Var.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        i94Var.setTranslationX(rectF3.centerX() - (hl.L(150.0f) / 2.0f));
        i94Var.setTranslationY(rectF3.centerY() - (hl.L(150.0f) / 2.0f));
        i94Var.setScaleX(rectF3.width() / hl.L(150.0f));
        i94Var.setScaleY(rectF3.height() / hl.L(150.0f));
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
                ra7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                hl.X1(rectF4, rectF5, floatValue, rectF6);
                e0b e0bVar = e0b.this;
                i94 i94Var2 = e0bVar.E1;
                i94Var2.setTranslationX(rectF6.centerX() - (hl.L(150.0f) / 2.0f));
                i94Var2.setTranslationY(rectF6.centerY() - (hl.L(150.0f) / 2.0f));
                float R1 = hl.R1(Math.max(rectF6.width() / hl.L(150.0f), rectF6.height() / hl.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                i94Var2.setScaleX(R1);
                i94Var2.setScaleY(R1);
                ys4 ys4Var = i94Var2.b;
                ys4Var.d = 360.0f * floatValue;
                ys4Var.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.a0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        e0bVar.c.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    fxa fxaVar2 = fxaVar;
                    if (fxaVar2 != null) {
                        fxaVar2.run();
                    }
                }
            }
        });
        this.R1.addListener(new wza(this, u49Var3, view4, h96VarArr, zArr, rectF2, fxaVar));
        this.R1.setDuration(800L);
        this.R1.setInterpolator(new if3((byte) 4));
        this.R1.start();
    }

    public final boolean G0() {
        if (!this.n1) {
            kt0 g = kt0.g(this.m1);
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
                if ((obj instanceof TLRPC.Chat) && xc2.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void H() {
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.H();
    }

    public final void H0(boolean z) {
        boolean z2;
        FrameLayout frameLayout = this.t1;
        int i = 0;
        if (frameLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != G0()) {
            if (!G0()) {
                i = 8;
            }
            frameLayout.setVisibility(i);
            if (z) {
                if (G0()) {
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

    public final void I0() {
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.p = 0.42f;
        long j = this.y1;
        int i = (j > 2666000L ? 1 : (j == 2666000L ? 0 : -1));
        de0 de0Var = this.v1;
        if (i == 0) {
            rb0Var.f(21);
            int i2 = aob.c8;
            vnb vnbVar = this.l1;
            rb0Var.h(aob.v0(i2, vnbVar), aob.v0(i2, vnbVar));
            de0Var.f(null, rb0Var);
            return;
        }
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i4 = this.m1;
        if (i3 >= 0) {
            TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(this.y1));
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
            return;
        }
        TLRPC.Chat M0 = uc7.s1(i4).M0(Long.valueOf(-this.y1));
        rb0Var.p(M0);
        de0Var.f(M0, rb0Var);
    }

    public final void J0(long j) {
        d0b d0bVar;
        long j2;
        long j3;
        boolean z;
        long j4 = 0;
        if ((!this.n1 || this.o1 || j <= 0) && (d0bVar = this.x1) != null) {
            ArrayList arrayList = new ArrayList();
            long e = yac.h(this.m1).e();
            int i = 1;
            ArrayList arrayList2 = this.G1;
            if (arrayList2 != null) {
                j3 = 0;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i2);
                    long n = wf3.n(messageReactor.peer_id);
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
            Collections.sort(arrayList, new fna((byte) 3));
            d0bVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override
    public final boolean U(float f, float f2) {
        ie0 ie0Var = this.H1;
        if (f >= ie0Var.getX() && f <= ie0Var.getX() + ie0Var.getWidth() && f2 >= ie0Var.getY() && f2 <= ie0Var.getY() + ie0Var.getHeight()) {
            return false;
        }
        return super.U(f, f2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.P3) {
            H0(true);
        }
    }

    @Override
    public final void dismiss() {
        Long z1;
        if (!this.N1 && !this.O1) {
            this.O1 = true;
            r47 r47Var = this.F1;
            if (r47Var != null && ((z1 = r47Var.z1()) == null || z1.longValue() != this.y1)) {
                r47Var.I5(this.y1);
                cxa b = cxa.b(r47Var);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i = this.m1;
                uc7 s1 = uc7.s1(i);
                long j = b.a;
                int i2 = b.b;
                tL_messages_togglePaidReactionPrivacy.peer = s1.j1(j);
                tL_messages_togglePaidReactionPrivacy.msg_id = i2;
                long j2 = this.y1;
                if (j2 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j2 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = uc7.s1(i).j1(this.y1);
                }
                jn7.f(i).k(jn7.I1, Long.valueOf(b.a), Integer.valueOf(i2), Long.valueOf(this.y1));
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_togglePaidReactionPrivacy, new yp9(this, (byte) 5));
            }
        }
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.m1).b(this, jn7.P3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.m1).n(this, jn7.P3);
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 < 0 && this.H0 == this.I1 && (v0 = aob.v0(aob.h5, this.l1)) != this.H0) {
                this.H0 = v0;
                this.I1 = v0;
                y0(v0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
