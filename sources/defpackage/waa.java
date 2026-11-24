package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public class waa extends FrameLayout implements gk7 {
    public final wjb E;
    public final lm F;
    public boolean G;
    public final lm H;
    public long I;
    public mh8 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public tgb N;
    public final be0 a;
    public final px8 b;
    public final jia c;
    public final wf2 d;
    public final uaa e;
    public vaa f;
    public TLRPC.User h;
    public final byte n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    public waa(int i, wjb wjbVar, Context context) {
        super(context);
        int i2;
        float f;
        float f2;
        float f3;
        this.y = y6c.t0;
        s33 s33Var = s33.h;
        this.F = new lm(this, 0L, 350L, s33Var);
        this.H = new lm(this, 0L, 350L, s33Var);
        this.L = new Paint();
        this.E = wjbVar;
        this.e = new uaa(this, wjbVar, (byte) 0);
        setWillNotDraw(false);
        this.n = i;
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(28.0f));
        if (i == 2) {
            addView(be0Var, nme.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(be0Var, nme.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        px8 px8Var = new px8(context, (byte) 2);
        this.b = px8Var;
        kk7.i(px8Var);
        if (this.G) {
            i2 = bkb.B6;
        } else {
            i2 = bkb.i5;
        }
        zkb.X(px8Var, i2, wjbVar);
        px8Var.setTextSize(1, 12.0f);
        px8Var.setMaxLines(2);
        px8Var.setGravity(49);
        px8Var.setLines(2);
        px8Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 2) {
            f = 58.0f;
        } else {
            f = 66.0f;
        }
        addView(px8Var, nme.d(-1, -2.0f, 51, 6.0f, f, 6.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        zkb.W(jiaVar, bkb.i5, wjbVar);
        jiaVar.setTextSize(12);
        jiaVar.setMaxLines(2);
        jiaVar.setGravity(49);
        jiaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i == 2) {
            f2 = 58.0f;
        } else {
            f2 = 66.0f;
        }
        addView(jiaVar, nme.d(-1, -2.0f, 51, 6.0f, f2, 6.0f, 0.0f));
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.d = wf2Var;
        wf2Var.b(bkb.A5, bkb.g5, bkb.B5);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(4);
        wf2Var.setProgressDelegate(new wh9(this, (byte) 14));
        if (i == 2) {
            f3 = -40.0f;
        } else {
            f3 = 42.0f;
        }
        addView(wf2Var, nme.d(24, 24.0f, 49, 19.0f, f3, 0.0f, 0.0f));
        int i3 = bkb.h6;
        Drawable Y = bkb.Y(bkb.v0(i3, wjbVar), gl.L(2.0f), gl.L(2.0f));
        vkb M = zkb.M(i3);
        setBackground(Y);
        zkb.j(this, Y, null, M, wjbVar);
    }

    public String a() {
        return k96.M0(2131750472, null);
    }

    public final void b(boolean z, boolean z2) {
        this.d.a(z, z2);
        if (!z) {
            d(null, false, true);
        }
    }

    public final void c(long j, boolean z, CharSequence charSequence) {
        int L;
        int i;
        boolean z2;
        uaa uaaVar = this.e;
        uaaVar.p = 1.0f;
        int i2 = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
        be0 be0Var = this.a;
        px8 px8Var = this.b;
        if (i2 == 0) {
            px8Var.setText(a());
            vaa vaaVar = this.f;
            if (vaaVar == null) {
                vaa vaaVar2 = new vaa(getContext(), be0Var, true, 2131231619, this.E);
                this.f = vaaVar2;
                vaaVar = vaaVar2;
            }
            be0Var.m(null, null, vaaVar, null);
        } else {
            boolean D = cf3.D(j);
            lm lmVar = this.H;
            lm lmVar2 = this.F;
            int i3 = this.y;
            if (D) {
                this.h = na7.q1(i3).V1(Long.valueOf(j));
                TL_account.RequirementToContact I2 = na7.q1(i3).I2(j);
                this.G = I2 instanceof TL_account.requirementToContactPremium;
                this.I = cf3.j(I2);
                if (this.G) {
                    i = bkb.B6;
                } else {
                    i = bkb.i5;
                }
                zkb.X(px8Var, i, this.E);
                lmVar2.a(this.G);
                if (this.I > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lmVar.a(z2);
                invalidate();
                uaaVar.q(this.h);
                if (this.n != 2) {
                    if (l7c.A(this.h)) {
                        px8Var.setText(k96.M0(2131746073, null));
                        uaaVar.f(12);
                        be0Var.m(null, null, uaaVar, this.h);
                    } else if (l7c.C(this.h)) {
                        px8Var.setText(k96.M0(2131745709, null));
                        uaaVar.f(1);
                        be0Var.m(null, null, uaaVar, this.h);
                    }
                    be0Var.setRoundRadius(gl.L(28.0f));
                }
                if (charSequence != null) {
                    px8Var.setText(charSequence);
                } else {
                    TLRPC.User user = this.h;
                    if (user != null) {
                        px8Var.setText(qu2.m(0, user.first_name, user.last_name));
                    } else {
                        px8Var.setText("");
                    }
                }
                be0Var.f(this.h, uaaVar);
                be0Var.setRoundRadius(gl.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                lmVar2.e(true, 0.0f);
                this.I = na7.q1(i3).K1(j);
                lmVar.getClass();
                lmVar.e(true, 0.0f);
                TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j));
                if (charSequence != null) {
                    px8Var.setText(charSequence);
                } else if (K0 != null) {
                    if (K0.monoforum) {
                        px8Var.setText(mm4.j(i3, K0, false));
                    } else {
                        px8Var.setText(K0.title);
                    }
                } else {
                    px8Var.setText("");
                }
                if (hc2.p0(K0)) {
                    mm4.o(i3, K0, uaaVar, be0Var);
                } else {
                    uaaVar.p(K0);
                    be0Var.f(K0, uaaVar);
                }
                if (K0 != null && (K0.forum || K0.monoforum)) {
                    L = gl.L(16.0f);
                } else {
                    L = gl.L(28.0f);
                }
                be0Var.setRoundRadius(L);
            }
        }
        this.w = j;
        this.d.a(z, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2) {
        boolean z3;
        float f;
        boolean z4 = this.x;
        if (tL_forumTopic != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z4 == z3 && z2) {
            return;
        }
        jia jiaVar = this.c;
        yla ylaVar = (yla) jiaVar.getTag(2131296665);
        if (ylaVar != null) {
            ylaVar.d();
        }
        if (z3) {
            if (z) {
                jiaVar.l(na7.q1(this.y).y1(cf3.n(tL_forumTopic.from_id), false), false);
            } else {
                jiaVar.l(mm4.k(tL_forumTopic, jiaVar.getTextPaint(), null), false);
            }
            jiaVar.requestLayout();
        }
        float f2 = 0.0f;
        if (z2) {
            if (z3) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            yla ylaVar2 = new yla(new ti4(f));
            if (z3) {
                f2 = 1000.0f;
            }
            zla zlaVar = new zla(f2);
            zlaVar.b(1500.0f);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            ylaVar2.b(new h10(this, (byte) 16));
            ylaVar2.a(new zv0(this, (byte) 11));
            jiaVar.setTag(2131296665, ylaVar2);
            ylaVar2.h();
        } else {
            px8 px8Var = this.b;
            if (z3) {
                jiaVar.setAlpha(1.0f);
                px8Var.setAlpha(0.0f);
                jiaVar.setTranslationX(0.0f);
                px8Var.setTranslationX(gl.L(10.0f));
            } else {
                jiaVar.setAlpha(0.0f);
                px8Var.setAlpha(1.0f);
                jiaVar.setTranslationX(-gl.L(10.0f));
                px8Var.setTranslationX(0.0f);
            }
        }
        this.x = z3;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long j;
        int i3;
        if (i == kk7.j3) {
            TLRPC.User user = this.h;
            int i4 = this.y;
            if (user != null) {
                requirementToContact = na7.q1(i4).I2(this.h.id);
            } else {
                requirementToContact = null;
            }
            if (this.w < 0) {
                j = na7.q1(i4).K1(this.w);
            } else {
                j = cf3.j(requirementToContact);
            }
            boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.G != z || this.I != j) {
                this.G = z;
                this.I = j;
                if (z) {
                    i3 = bkb.B6;
                } else {
                    i3 = bkb.i5;
                }
                zkb.X(this.b, i3, this.E);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.waa.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public be0 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.y).b(this, kk7.j3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.y).n(this, kk7.j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        be0 be0Var = this.a;
        int measuredWidth = (be0Var.getMeasuredWidth() / 2) + be0Var.getLeft();
        int measuredHeight = (be0Var.getMeasuredHeight() / 2) + be0Var.getTop();
        bkb.n0.setColor(bkb.v0(bkb.A5, this.E));
        bkb.n0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.n == 2) {
            f = 24.0f;
        } else {
            f = 28.0f;
        }
        int L = gl.L(f);
        RectF rectF = gl.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, be0Var.getRoundRadius()[0], be0Var.getRoundRadius()[0], bkb.n0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        if (this.n == 2) {
            f = 95.0f;
        } else {
            f = 103.0f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(f), 1073741824));
    }
}
