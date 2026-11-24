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
public class wca extends FrameLayout implements jm7 {
    public final ylb E;
    public final ln F;
    public boolean G;
    public final ln H;
    public long I;
    public nj8 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public uib N;
    public final bf0 a;
    public final qz8 b;
    public final lka c;
    public final jh2 d;
    public final uca e;
    public vca f;
    public TLRPC.User h;
    public final byte n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    public wca(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        float f;
        float f2;
        float f3;
        this.y = z8c.t0;
        d53 d53Var = d53.h;
        this.F = new ln(this, 0L, 350L, d53Var);
        this.H = new ln(this, 0L, 350L, d53Var);
        this.L = new Paint();
        this.E = ylbVar;
        this.e = new uca(this, ylbVar, (byte) 0);
        setWillNotDraw(false);
        this.n = i;
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(28.0f));
        if (i == 2) {
            addView(bf0Var, qoe.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(bf0Var, qoe.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        qz8 qz8Var = new qz8(context, (byte) 2);
        this.b = qz8Var;
        nm7.i(qz8Var);
        if (this.G) {
            i2 = cmb.B6;
        } else {
            i2 = cmb.i5;
        }
        anb.X(qz8Var, i2, ylbVar);
        qz8Var.setTextSize(1, 12.0f);
        qz8Var.setMaxLines(2);
        qz8Var.setGravity(49);
        qz8Var.setLines(2);
        qz8Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 2) {
            f = 58.0f;
        } else {
            f = 66.0f;
        }
        addView(qz8Var, qoe.d(-1, -2.0f, 51, 6.0f, f, 6.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        anb.W(lkaVar, cmb.i5, ylbVar);
        lkaVar.setTextSize(12);
        lkaVar.setMaxLines(2);
        lkaVar.setGravity(49);
        lkaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i == 2) {
            f2 = 58.0f;
        } else {
            f2 = 66.0f;
        }
        addView(lkaVar, qoe.d(-1, -2.0f, 51, 6.0f, f2, 6.0f, 0.0f));
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.d = jh2Var;
        jh2Var.b(cmb.A5, cmb.g5, cmb.B5);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(4);
        jh2Var.setProgressDelegate(new yf9(this, (byte) 18));
        if (i == 2) {
            f3 = -40.0f;
        } else {
            f3 = 42.0f;
        }
        addView(jh2Var, qoe.d(24, 24.0f, 49, 19.0f, f3, 0.0f, 0.0f));
        int i3 = cmb.h6;
        Drawable Y = cmb.Y(cmb.v0(i3, ylbVar), gm.L(2.0f), gm.L(2.0f));
        wmb M = anb.M(i3);
        setBackground(Y);
        anb.j(this, Y, null, M, ylbVar);
    }

    public String a() {
        return jb6.M0(2131750421, null);
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
        uca ucaVar = this.e;
        ucaVar.p = 1.0f;
        int i2 = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
        bf0 bf0Var = this.a;
        qz8 qz8Var = this.b;
        if (i2 == 0) {
            qz8Var.setText(a());
            vca vcaVar = this.f;
            if (vcaVar == null) {
                vca vcaVar2 = new vca(getContext(), bf0Var, true, 2131231620, this.E);
                this.f = vcaVar2;
                vcaVar = vcaVar2;
            }
            bf0Var.m(null, null, vcaVar, null);
        } else {
            boolean D = pg3.D(j);
            ln lnVar = this.H;
            ln lnVar2 = this.F;
            int i3 = this.y;
            if (D) {
                this.h = oc7.r1(i3).W1(Long.valueOf(j));
                TL_account.RequirementToContact L2 = oc7.r1(i3).L2(j);
                this.G = L2 instanceof TL_account.requirementToContactPremium;
                this.I = pg3.j(L2);
                if (this.G) {
                    i = cmb.B6;
                } else {
                    i = cmb.i5;
                }
                anb.X(qz8Var, i, this.E);
                lnVar2.a(this.G);
                if (this.I > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lnVar.a(z2);
                invalidate();
                ucaVar.q(this.h);
                if (this.n != 2) {
                    if (m9c.B(this.h)) {
                        qz8Var.setText(jb6.M0(2131745999, null));
                        ucaVar.f(12);
                        bf0Var.m(null, null, ucaVar, this.h);
                    } else if (m9c.D(this.h)) {
                        qz8Var.setText(jb6.M0(2131745635, null));
                        ucaVar.f(1);
                        bf0Var.m(null, null, ucaVar, this.h);
                    }
                    bf0Var.setRoundRadius(gm.L(28.0f));
                }
                if (charSequence != null) {
                    qz8Var.setText(charSequence);
                } else {
                    TLRPC.User user = this.h;
                    if (user != null) {
                        qz8Var.setText(bw2.m(0, user.first_name, user.last_name));
                    } else {
                        qz8Var.setText("");
                    }
                }
                bf0Var.f(this.h, ucaVar);
                bf0Var.setRoundRadius(gm.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                lnVar2.e(true, 0.0f);
                this.I = oc7.r1(i3).L1(j);
                lnVar.getClass();
                lnVar.e(true, 0.0f);
                TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-j));
                if (charSequence != null) {
                    qz8Var.setText(charSequence);
                } else if (L0 != null) {
                    if (L0.monoforum) {
                        qz8Var.setText(no4.j(i3, L0, false));
                    } else {
                        qz8Var.setText(L0.title);
                    }
                } else {
                    qz8Var.setText("");
                }
                if (sd2.p0(L0)) {
                    no4.o(i3, L0, ucaVar, bf0Var);
                } else {
                    ucaVar.p(L0);
                    bf0Var.f(L0, ucaVar);
                }
                if (L0 != null && (L0.forum || L0.monoforum)) {
                    L = gm.L(16.0f);
                } else {
                    L = gm.L(28.0f);
                }
                bf0Var.setRoundRadius(L);
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
        lka lkaVar = this.c;
        zna znaVar = (zna) lkaVar.getTag(2131296665);
        if (znaVar != null) {
            znaVar.d();
        }
        if (z3) {
            if (z) {
                lkaVar.l(oc7.r1(this.y).z1(pg3.n(tL_forumTopic.from_id), false), false);
            } else {
                lkaVar.l(no4.k(tL_forumTopic, lkaVar.getTextPaint(), null), false);
            }
            lkaVar.requestLayout();
        }
        float f2 = 0.0f;
        if (z2) {
            if (z3) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            zna znaVar2 = new zna(new xk4(f));
            if (z3) {
                f2 = 1000.0f;
            }
            aoa aoaVar = new aoa(f2);
            aoaVar.b(1500.0f);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            znaVar2.b(new h20(this, (byte) 16));
            znaVar2.a(new hx0(this, (byte) 11));
            lkaVar.setTag(2131296665, znaVar2);
            znaVar2.h();
        } else {
            qz8 qz8Var = this.b;
            if (z3) {
                lkaVar.setAlpha(1.0f);
                qz8Var.setAlpha(0.0f);
                lkaVar.setTranslationX(0.0f);
                qz8Var.setTranslationX(gm.L(10.0f));
            } else {
                lkaVar.setAlpha(0.0f);
                qz8Var.setAlpha(1.0f);
                lkaVar.setTranslationX(-gm.L(10.0f));
                qz8Var.setTranslationX(0.0f);
            }
        }
        this.x = z3;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long j;
        int i3;
        if (i == nm7.k3) {
            TLRPC.User user = this.h;
            int i4 = this.y;
            if (user != null) {
                requirementToContact = oc7.r1(i4).L2(this.h.id);
            } else {
                requirementToContact = null;
            }
            if (this.w < 0) {
                j = oc7.r1(i4).L1(this.w);
            } else {
                j = pg3.j(requirementToContact);
            }
            boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.G != z || this.I != j) {
                this.G = z;
                this.I = j;
                if (z) {
                    i3 = cmb.B6;
                } else {
                    i3 = cmb.i5;
                }
                anb.X(this.b, i3, this.E);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wca.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public bf0 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.y).b(this, nm7.k3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.y).n(this, nm7.k3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        bf0 bf0Var = this.a;
        int measuredWidth = (bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft();
        int measuredHeight = (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop();
        cmb.n0.setColor(cmb.v0(cmb.A5, this.E));
        cmb.n0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.n == 2) {
            f = 24.0f;
        } else {
            f = 28.0f;
        }
        int L = gm.L(f);
        RectF rectF = gm.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, bf0Var.getRoundRadius()[0], bf0Var.getRoundRadius()[0], cmb.n0);
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(f), 1073741824));
    }
}
