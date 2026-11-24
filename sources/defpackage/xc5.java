package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xc5 extends FrameLayout implements vlb {
    public int E;
    public boolean F;
    public final byte G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final ylb N;
    public final ln O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public nj8 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final bf0 a;
    public final dg0 b;
    public final lka c;
    public final jh2 d;
    public final pc0 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final byte w;
    public final int x;
    public String y;

    public xc5(int i, int i2, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        this.x = z8c.t0;
        this.O = new ln(this, 0L, 350L, d53.h);
        this.N = ylbVar;
        this.w = i;
        this.L = z2;
        this.F = false;
        this.G = i2;
        this.M = z;
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(24.0f));
        boolean z3 = jb6.a0;
        if (z3) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i12 = i3 | 48;
        if (z3) {
            f = 0.0f;
        } else {
            f = i2 + 13;
        }
        if (z3) {
            f2 = i2 + 13;
        } else {
            f2 = 0.0f;
        }
        addView(bf0Var, qoe.d(46, 46.0f, i12, f, 6.0f, f2, 0.0f));
        dg0 dg0Var = new dg0(context, (byte) 2);
        this.b = dg0Var;
        nm7.i(dg0Var);
        if (z2) {
            i4 = cmb.dh;
        } else {
            i4 = cmb.F6;
        }
        anb.W(dg0Var, i4, ylbVar);
        dg0Var.setTypeface(gm.o());
        dg0Var.setTextSize(16);
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        dg0Var.setGravity(i5 | 48);
        boolean z4 = jb6.a0;
        if (z4) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        int i13 = i6 | 48;
        if (z4) {
            i7 = 28;
        } else {
            i7 = 72;
        }
        float f4 = i7 + i2;
        if (z4) {
            i8 = 72;
        } else {
            i8 = 28;
        }
        addView(dg0Var, qoe.d(-1, 20.0f, i13, f4, 10.0f, i8 + i2, 0.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        lkaVar.setTextSize(14);
        if (jb6.a0) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        lkaVar.setGravity(i9 | 48);
        boolean z5 = jb6.a0;
        if (z5) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i14 = i10 | 48;
        if (z5) {
            i11 = 28;
        } else {
            i11 = 72;
        }
        addView(lkaVar, qoe.d(-1, 20.0f, i14, i11 + i2, 32.0f, (z5 ? 72 : 28) + i2, 0.0f));
        if (i == 1) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.d = jh2Var;
            jh2Var.b(-1, cmb.c6, cmb.j7);
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(3);
            boolean z6 = jb6.a0;
            int i15 = (z6 ? 5 : 3) | 48;
            if (z6) {
                f3 = 0.0f;
            } else {
                f3 = i2 + 40;
            }
            addView(jh2Var, qoe.d(24, 24.0f, i15, f3, 33.0f, z6 ? i2 + 39 : 0.0f, 0.0f));
        } else if (i == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.L(2.0f));
        }
        setWillNotDraw(false);
    }

    public static pc0 a(boolean z) {
        float f;
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.f(8);
        if (z) {
            f = 0.8f;
        } else {
            f = 1.1f;
        }
        pc0Var.p = f;
        pc0Var.h(cmb.w0(null, cmb.S7, false), cmb.w0(null, cmb.Z7, false));
        return pc0Var;
    }

    public static sn2 b(Context context, boolean z) {
        sn2 sn2Var = new sn2(new f6(new nj8(cmb.Ck, cmb.Bk, -1, -1, null), (byte) 3), context.getResources().getDrawable(2131232368), 0, 0);
        if (z) {
            int L = gm.L(18.0f);
            int L2 = gm.L(18.0f);
            sn2Var.e = L;
            sn2Var.f = L2;
        }
        return sn2Var;
    }

    public final void c(boolean z, boolean z2) {
        float f;
        jh2 jh2Var = this.d;
        if (jh2Var != null) {
            jh2Var.a(z, z2);
        } else if (this.w == 2 && this.I != z) {
            this.I = z;
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new fh4(this, (byte) 10));
                this.H.addListener(new v85(this, (byte) 3));
                this.H.setDuration(180L);
                this.H.setInterpolator(d53.g);
                this.H.start();
            } else {
                float f2 = 0.82f;
                float f3 = 1.0f;
                if (this.I) {
                    f = 0.82f;
                } else {
                    f = 1.0f;
                }
                bf0 bf0Var = this.a;
                bf0Var.setScaleX(f);
                if (!this.I) {
                    f2 = 1.0f;
                }
                bf0Var.setScaleY(f2);
                if (!this.I) {
                    f3 = 0.0f;
                }
                this.J = f3;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f = obj;
        this.n = charSequence2;
        this.h = charSequence;
        this.F = false;
        this.r = false;
        this.s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        nj8 nj8Var;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            bf0 bf0Var = this.a;
            float height = (bf0Var.getHeight() / 2.0f) + bf0Var.getY() + gm.L(18.0f);
            float width = (bf0Var.getWidth() / 2.0f) + bf0Var.getX() + gm.L(18.0f);
            canvas.save();
            Paint paint2 = cmb.s0;
            int i = cmb.c6;
            ylb ylbVar = this.N;
            paint2.setColor(cmb.v0(i, ylbVar));
            canvas.drawCircle(width, height, gm.L(11.33f) * d, cmb.s0);
            if (this.R == null) {
                nj8 nj8Var2 = this.T;
                if (nj8Var2 == null) {
                    nj8 nj8Var3 = new nj8(cmb.Bk, cmb.Ck, -1, -1, this.N);
                    this.T = nj8Var3;
                    nj8Var = nj8Var3;
                } else {
                    nj8Var = nj8Var2;
                }
                nj8Var.d((int) (width - gm.L(10.0f)), 0.0f, (int) (height - gm.L(10.0f)), (int) (gm.L(10.0f) + width), 0.0f, (int) (gm.L(10.0f) + height));
                paint = this.T.f;
            } else {
                Paint paint3 = this.V;
                if (paint3 == null) {
                    paint3 = new Paint();
                    this.V = paint3;
                }
                paint3.setColor(cmb.v0(cmb.b8, ylbVar));
                paint = this.V;
            }
            canvas.drawCircle(width, height, gm.L(10.0f) * d, paint);
            if (this.U == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232248).mutate();
                this.U = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.U;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (height - (((this.U.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.U.getIntrinsicWidth() / 2.0f) * 0.875f * d) + width), (int) (((this.U.getIntrinsicHeight() / 2.0f) * 0.875f * d) + height));
            this.U.setAlpha((int) (d * 255.0f));
            this.U.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z) {
        d(tLObject, str, str2);
        this.F = z;
    }

    public final void f(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc5.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.S) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.R;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = oc7.r1(this.x).L2(((TLRPC.User) this.f).id);
            }
        }
        boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z && this.Q == pg3.j(requirementToContact)) {
            return;
        }
        this.P = z;
        this.Q = pg3.j(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public jh2 getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public lka getStatusTextView() {
        return this.c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        float f2 = 0.0f;
        int i = (this.O.d(this.P) > 0.0f ? 1 : (this.O.d(this.P) == 0.0f ? 0 : -1));
        ylb ylbVar = this.N;
        if (i <= 0 && this.w == 2 && (this.I || this.J > 0.0f)) {
            int v0 = cmb.v0(cmb.V6, ylbVar);
            Paint paint = this.K;
            paint.setColor(v0);
            bf0 bf0Var = this.a;
            canvas.drawCircle((bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft(), (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop(), (gm.L(4.0f) * this.J) + gm.L(18.0f), paint);
        }
        if (this.F) {
            boolean z = jb6.a0;
            byte b = this.G;
            if (z) {
                f = 0.0f;
            } else {
                f = b + 72;
            }
            int L = gm.L(f);
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                f2 = b + 72;
            }
            int L2 = measuredWidth - gm.L(f2);
            if (this.L) {
                cmb.k0.setColor(cmb.v0(cmb.Wg, ylbVar));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), cmb.k0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), cmb.U0("paintDivider", ylbVar));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jh2 jh2Var = this.d;
        if (jh2Var != null) {
            z = jh2Var.a.q;
        } else {
            z = this.I;
        }
        if (z) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        Object obj = this.f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f)) {
            f = 50.0f;
        } else {
            f = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(f), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z) {
        jh2 jh2Var = this.d;
        if (jh2Var != null) {
            jh2Var.setEnabled(z);
        }
    }

    public void setDrawDivider(boolean z) {
        this.F = z;
        invalidate();
    }

    public void setForbiddenCheck(boolean z) {
        this.d.setForbidden(z);
    }

    @Override
    public final void updateColors() {
        int textColor;
        lka lkaVar = this.c;
        if (lkaVar != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = lkaVar.getTextColor()) != this.W) {
                    this.W = textColor;
                    lkaVar.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        bf0 bf0Var = this.a;
        if (bf0Var != null) {
            bf0Var.invalidate();
        }
        try {
            if (this.s && bf0Var != null) {
                Drawable t = bf0Var.getImageReceiver().t();
                if (t instanceof pc0) {
                    ((pc0) t).h(cmb.w0(null, cmb.S7, false), cmb.w0(null, cmb.Z7, false));
                    bf0Var.invalidate();
                }
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public xc5(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
