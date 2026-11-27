package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public class nea extends FrameLayout implements fn7 {
    public final vnb E;
    public final mm F;
    public boolean G;
    public final mm H;
    public long I;
    public al8 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public pkb N;
    public final de0 a;
    public final c19 b;
    public final ema c;
    public final og2 d;
    public final lea e;
    public mea f;
    public TLRPC.User h;
    public final byte n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    public nea(int i, vnb vnbVar, Context context) {
        super(context);
        int i2;
        float f;
        float f2;
        float f3;
        this.y = yac.t0;
        k43 k43Var = k43.h;
        this.F = new mm(this, 0L, 350L, k43Var);
        this.H = new mm(this, 0L, 350L, k43Var);
        this.L = new Paint();
        this.E = vnbVar;
        this.e = new lea(this, vnbVar, (byte) 0);
        setWillNotDraw(false);
        this.n = i;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(28.0f));
        if (i == 2) {
            addView(de0Var, tre.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(de0Var, tre.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        c19 c19Var = new c19(context, (byte) 2);
        this.b = c19Var;
        jn7.i(c19Var);
        if (this.G) {
            i2 = aob.C6;
        } else {
            i2 = aob.j5;
        }
        yob.X(c19Var, i2, vnbVar);
        c19Var.setTextSize(1, 12.0f);
        c19Var.setMaxLines(2);
        c19Var.setGravity(49);
        c19Var.setLines(2);
        c19Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 2) {
            f = 58.0f;
        } else {
            f = 66.0f;
        }
        addView(c19Var, tre.d(-1, -2.0f, 51, 6.0f, f, 6.0f, 0.0f));
        ema emaVar = new ema(context);
        this.c = emaVar;
        yob.W(emaVar, aob.j5, vnbVar);
        emaVar.setTextSize(12);
        emaVar.setMaxLines(2);
        emaVar.setGravity(49);
        emaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i == 2) {
            f2 = 58.0f;
        } else {
            f2 = 66.0f;
        }
        addView(emaVar, tre.d(-1, -2.0f, 51, 6.0f, f2, 6.0f, 0.0f));
        og2 og2Var = new og2(21, vnbVar, context);
        this.d = og2Var;
        og2Var.b(aob.B5, aob.h5, aob.C5);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(4);
        og2Var.setProgressDelegate(new ye9(this, (byte) 27));
        if (i == 2) {
            f3 = -40.0f;
        } else {
            f3 = 42.0f;
        }
        addView(og2Var, tre.d(24, 24.0f, 49, 19.0f, f3, 0.0f, 0.0f));
        int i3 = aob.i6;
        Drawable Y = aob.Y(aob.v0(i3, vnbVar), hl.L(2.0f), hl.L(2.0f));
        uob M = yob.M(i3);
        setBackground(Y);
        yob.j(this, Y, null, M, vnbVar);
    }

    public String a() {
        return ob6.M0(2131750449, null);
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
        SpannableStringBuilder spannableStringBuilder = charSequence;
        lea leaVar = this.e;
        leaVar.p = 1.0f;
        int i2 = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
        c19 c19Var = this.b;
        de0 de0Var = this.a;
        if (i2 == 0) {
            c19Var.setText(a());
            mea meaVar = this.f;
            if (meaVar == null) {
                mea meaVar2 = new mea(getContext(), de0Var, true, 2131231619, this.E);
                this.f = meaVar2;
                meaVar = meaVar2;
            }
            de0Var.m(null, null, meaVar, null);
        } else {
            boolean D = wf3.D(j);
            mm mmVar = this.H;
            mm mmVar2 = this.F;
            int i3 = this.y;
            if (D) {
                this.h = uc7.s1(i3).X1(Long.valueOf(j));
                TL_account.RequirementToContact P2 = uc7.s1(i3).P2(j);
                this.G = P2 instanceof TL_account.requirementToContactPremium;
                this.I = wf3.j(P2);
                if (this.G) {
                    i = aob.C6;
                } else {
                    i = aob.j5;
                }
                vnb vnbVar = this.E;
                yob.X(c19Var, i, vnbVar);
                mmVar2.a(this.G);
                if (this.I > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mmVar.a(z2);
                invalidate();
                leaVar.q(this.h);
                if (this.n != 2) {
                    if (lbc.B(this.h)) {
                        c19Var.setText(ob6.M0(2131745993, null));
                        leaVar.f(12);
                        de0Var.m(null, null, leaVar, this.h);
                    } else if (lbc.D(this.h)) {
                        c19Var.setText(ob6.M0(2131745629, null));
                        leaVar.f(1);
                        de0Var.m(null, null, leaVar, this.h);
                    }
                    de0Var.setRoundRadius(hl.L(28.0f));
                }
                if (spannableStringBuilder == null) {
                    TLRPC.User user = this.h;
                    if (user == null) {
                        spannableStringBuilder = "";
                    } else {
                        spannableStringBuilder = lv2.m(0, user.first_name, user.last_name);
                    }
                }
                if (this.h != null && uc7.s1(i3).r2(j)) {
                    yt9 yt9Var = new yt9(2);
                    yt9Var.b(aob.v0(aob.j9, vnbVar));
                    wm2 wm2Var = new wm2(2, yt9Var);
                    wm2Var.d = false;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    spannableStringBuilder2.append((CharSequence) "  ");
                    spannableStringBuilder2.setSpan(wm2Var, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                }
                c19Var.setText(spannableStringBuilder);
                de0Var.f(this.h, leaVar);
                de0Var.setRoundRadius(hl.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                mmVar2.e(true, 0.0f);
                this.I = uc7.s1(i3).M1(j);
                mmVar.getClass();
                mmVar.e(true, 0.0f);
                TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j));
                if (spannableStringBuilder != null) {
                    c19Var.setText(spannableStringBuilder);
                } else if (M0 != null) {
                    if (M0.monoforum) {
                        c19Var.setText(ro4.j(i3, M0, false));
                    } else {
                        c19Var.setText(M0.title);
                    }
                } else {
                    c19Var.setText("");
                }
                if (xc2.p0(M0)) {
                    ro4.o(i3, M0, leaVar, de0Var);
                } else {
                    leaVar.p(M0);
                    de0Var.f(M0, leaVar);
                }
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    L = hl.L(16.0f);
                } else {
                    L = hl.L(28.0f);
                }
                de0Var.setRoundRadius(L);
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
        ema emaVar = this.c;
        vpa vpaVar = (vpa) emaVar.getTag(2131296665);
        if (vpaVar != null) {
            vpaVar.d();
        }
        if (z3) {
            if (z) {
                emaVar.l(uc7.s1(this.y).A1(wf3.n(tL_forumTopic.from_id), false), false);
            } else {
                emaVar.l(ro4.k(tL_forumTopic, emaVar.getTextPaint(), null), false);
            }
            emaVar.requestLayout();
        }
        float f2 = 0.0f;
        if (z2) {
            if (z3) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            vpa vpaVar2 = new vpa(new xk4(f));
            if (z3) {
                f2 = 1000.0f;
            }
            wpa wpaVar = new wpa(f2);
            wpaVar.b(1500.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            vpaVar2.b(new i10(this, (byte) 17));
            vpaVar2.a(new iw0(this, (byte) 12));
            emaVar.setTag(2131296665, vpaVar2);
            vpaVar2.h();
        } else {
            c19 c19Var = this.b;
            if (z3) {
                emaVar.setAlpha(1.0f);
                c19Var.setAlpha(0.0f);
                emaVar.setTranslationX(0.0f);
                c19Var.setTranslationX(hl.L(10.0f));
            } else {
                emaVar.setAlpha(0.0f);
                c19Var.setAlpha(1.0f);
                emaVar.setTranslationX(-hl.L(10.0f));
                c19Var.setTranslationX(0.0f);
            }
        }
        this.x = z3;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long j;
        int i3;
        if (i == jn7.k3) {
            TLRPC.User user = this.h;
            int i4 = this.y;
            if (user != null) {
                requirementToContact = uc7.s1(i4).P2(this.h.id);
            } else {
                requirementToContact = null;
            }
            if (this.w < 0) {
                j = uc7.s1(i4).M1(this.w);
            } else {
                j = wf3.j(requirementToContact);
            }
            boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.G != z || this.I != j) {
                this.G = z;
                this.I = j;
                if (z) {
                    i3 = aob.C6;
                } else {
                    i3 = aob.j5;
                }
                yob.X(this.b, i3, this.E);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nea.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public de0 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.y).b(this, jn7.k3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.y).n(this, jn7.k3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        de0 de0Var = this.a;
        int measuredWidth = (de0Var.getMeasuredWidth() / 2) + de0Var.getLeft();
        int measuredHeight = (de0Var.getMeasuredHeight() / 2) + de0Var.getTop();
        aob.n0.setColor(aob.v0(aob.B5, this.E));
        aob.n0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.n == 2) {
            f = 24.0f;
        } else {
            f = 28.0f;
        }
        int L = hl.L(f);
        RectF rectF = hl.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, de0Var.getRoundRadius()[0], de0Var.getRoundRadius()[0], aob.n0);
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
    }
}
