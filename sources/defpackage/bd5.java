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
public final class bd5 extends FrameLayout implements snb {
    public int E;
    public boolean F;
    public final byte G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final vnb N;
    public final mm O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public al8 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final de0 a;
    public final ff0 b;
    public final ema c;
    public final og2 d;
    public final rb0 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final byte w;
    public final int x;
    public String y;

    public bd5(int i, int i2, vnb vnbVar, Context context, boolean z, boolean z2) {
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
        this.x = yac.t0;
        this.O = new mm(this, 0L, 350L, k43.h);
        this.N = vnbVar;
        this.w = i;
        this.L = z2;
        this.F = false;
        this.G = i2;
        this.M = z;
        this.e = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(24.0f));
        boolean z3 = ob6.a0;
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
        addView(de0Var, tre.d(46, 46.0f, i12, f, 6.0f, f2, 0.0f));
        ff0 ff0Var = new ff0(context, (byte) 2);
        this.b = ff0Var;
        jn7.i(ff0Var);
        if (z2) {
            i4 = aob.eh;
        } else {
            i4 = aob.G6;
        }
        yob.W(ff0Var, i4, vnbVar);
        ff0Var.setTypeface(hl.o());
        ff0Var.setTextSize(16);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        ff0Var.setGravity(i5 | 48);
        boolean z4 = ob6.a0;
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
        addView(ff0Var, tre.d(-1, 20.0f, i13, f4, 10.0f, i8 + i2, 0.0f));
        ema emaVar = new ema(context);
        this.c = emaVar;
        emaVar.setTextSize(14);
        if (ob6.a0) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        emaVar.setGravity(i9 | 48);
        boolean z5 = ob6.a0;
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
        addView(emaVar, tre.d(-1, 20.0f, i14, i11 + i2, 32.0f, (z5 ? 72 : 28) + i2, 0.0f));
        if (i == 1) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.d = og2Var;
            og2Var.b(-1, aob.d6, aob.k7);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(3);
            boolean z6 = ob6.a0;
            int i15 = (z6 ? 5 : 3) | 48;
            if (z6) {
                f3 = 0.0f;
            } else {
                f3 = i2 + 40;
            }
            addView(og2Var, tre.d(24, 24.0f, i15, f3, 33.0f, z6 ? i2 + 39 : 0.0f, 0.0f));
        } else if (i == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.L(2.0f));
        }
        setWillNotDraw(false);
    }

    public static rb0 a(boolean z) {
        float f;
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.f(8);
        if (z) {
            f = 0.8f;
        } else {
            f = 1.1f;
        }
        rb0Var.p = f;
        rb0Var.h(aob.w0(null, aob.T7, false), aob.w0(null, aob.a8, false));
        return rb0Var;
    }

    public static zm2 b(Context context, boolean z) {
        zm2 zm2Var = new zm2(new g6(new al8(aob.Dk, aob.Ck, -1, -1, null), (byte) 3), context.getResources().getDrawable(2131232367), 0, 0);
        if (z) {
            int L = hl.L(18.0f);
            int L2 = hl.L(18.0f);
            zm2Var.e = L;
            zm2Var.f = L2;
        }
        return zm2Var;
    }

    public final void c(boolean z, boolean z2) {
        float f;
        og2 og2Var = this.d;
        if (og2Var != null) {
            og2Var.a(z, z2);
        } else if (this.w == 2 && this.I != z) {
            this.I = z;
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new ch4(this, (byte) 10));
                this.H.addListener(new ad5(this, (byte) 0));
                this.H.setDuration(180L);
                this.H.setInterpolator(k43.g);
                this.H.start();
            } else {
                float f2 = 0.82f;
                float f3 = 1.0f;
                if (this.I) {
                    f = 0.82f;
                } else {
                    f = 1.0f;
                }
                de0 de0Var = this.a;
                de0Var.setScaleX(f);
                if (!this.I) {
                    f2 = 1.0f;
                }
                de0Var.setScaleY(f2);
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
        al8 al8Var;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            de0 de0Var = this.a;
            float height = (de0Var.getHeight() / 2.0f) + de0Var.getY() + hl.L(18.0f);
            float width = (de0Var.getWidth() / 2.0f) + de0Var.getX() + hl.L(18.0f);
            canvas.save();
            Paint paint2 = aob.s0;
            int i = aob.d6;
            vnb vnbVar = this.N;
            paint2.setColor(aob.v0(i, vnbVar));
            canvas.drawCircle(width, height, hl.L(11.33f) * d, aob.s0);
            if (this.R == null) {
                al8 al8Var2 = this.T;
                if (al8Var2 == null) {
                    al8 al8Var3 = new al8(aob.Ck, aob.Dk, -1, -1, this.N);
                    this.T = al8Var3;
                    al8Var = al8Var3;
                } else {
                    al8Var = al8Var2;
                }
                al8Var.d((int) (width - hl.L(10.0f)), 0.0f, (int) (height - hl.L(10.0f)), (int) (hl.L(10.0f) + width), 0.0f, (int) (hl.L(10.0f) + height));
                paint = this.T.f;
            } else {
                Paint paint3 = this.V;
                if (paint3 == null) {
                    paint3 = new Paint();
                    this.V = paint3;
                }
                paint3.setColor(aob.v0(aob.c8, vnbVar));
                paint = this.V;
            }
            canvas.drawCircle(width, height, hl.L(10.0f) * d, paint);
            if (this.U == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232247).mutate();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd5.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.S) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.R;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = uc7.s1(this.x).P2(((TLRPC.User) this.f).id);
            }
        }
        boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z && this.Q == wf3.j(requirementToContact)) {
            return;
        }
        this.P = z;
        this.Q = wf3.j(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public og2 getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public ema getStatusTextView() {
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
        vnb vnbVar = this.N;
        if (i <= 0 && this.w == 2 && (this.I || this.J > 0.0f)) {
            int v0 = aob.v0(aob.W6, vnbVar);
            Paint paint = this.K;
            paint.setColor(v0);
            de0 de0Var = this.a;
            canvas.drawCircle((de0Var.getMeasuredWidth() / 2) + de0Var.getLeft(), (de0Var.getMeasuredHeight() / 2) + de0Var.getTop(), (hl.L(4.0f) * this.J) + hl.L(18.0f), paint);
        }
        if (this.F) {
            boolean z = ob6.a0;
            byte b = this.G;
            if (z) {
                f = 0.0f;
            } else {
                f = b + 72;
            }
            int L = hl.L(f);
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                f2 = b + 72;
            }
            int L2 = measuredWidth - hl.L(f2);
            if (this.L) {
                aob.k0.setColor(aob.v0(aob.Xg, vnbVar));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), aob.k0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), aob.U0("paintDivider", vnbVar));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        og2 og2Var = this.d;
        if (og2Var != null) {
            z = og2Var.a.q;
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z) {
        og2 og2Var = this.d;
        if (og2Var != null) {
            og2Var.setEnabled(z);
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
        ema emaVar = this.c;
        if (emaVar != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = emaVar.getTextColor()) != this.W) {
                    this.W = textColor;
                    emaVar.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        de0 de0Var = this.a;
        if (de0Var != null) {
            de0Var.invalidate();
        }
        try {
            if (this.s && de0Var != null) {
                Drawable t = de0Var.getImageReceiver().t();
                if (t instanceof rb0) {
                    ((rb0) t).h(aob.w0(null, aob.T7, false), aob.w0(null, aob.a8, false));
                    de0Var.invalidate();
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public bd5(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
