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
public final class za5 extends FrameLayout implements tjb {
    public int E;
    public boolean F;
    public final byte G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final wjb N;
    public final lm O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public mh8 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final be0 a;
    public final df0 b;
    public final jia c;
    public final wf2 d;
    public final pb0 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final byte w;
    public final int x;
    public String y;

    public za5(int i, int i2, wjb wjbVar, Context context, boolean z, boolean z2) {
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
        this.x = y6c.t0;
        this.O = new lm(this, 0L, 350L, s33.h);
        this.N = wjbVar;
        this.w = i;
        this.L = z2;
        this.F = false;
        this.G = i2;
        this.M = z;
        this.e = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(24.0f));
        boolean z3 = k96.a0;
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
        addView(be0Var, nme.d(46, 46.0f, i12, f, 6.0f, f2, 0.0f));
        df0 df0Var = new df0(context, (byte) 2);
        this.b = df0Var;
        kk7.i(df0Var);
        if (z2) {
            i4 = bkb.dh;
        } else {
            i4 = bkb.F6;
        }
        zkb.W(df0Var, i4, wjbVar);
        df0Var.setTypeface(gl.o());
        df0Var.setTextSize(16);
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        df0Var.setGravity(i5 | 48);
        boolean z4 = k96.a0;
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
        addView(df0Var, nme.d(-1, 20.0f, i13, f4, 10.0f, i8 + i2, 0.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        jiaVar.setTextSize(14);
        if (k96.a0) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        jiaVar.setGravity(i9 | 48);
        boolean z5 = k96.a0;
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
        addView(jiaVar, nme.d(-1, 20.0f, i14, i11 + i2, 32.0f, (z5 ? 72 : 28) + i2, 0.0f));
        if (i == 1) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.d = wf2Var;
            wf2Var.b(-1, bkb.c6, bkb.j7);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            boolean z6 = k96.a0;
            int i15 = (z6 ? 5 : 3) | 48;
            if (z6) {
                f3 = 0.0f;
            } else {
                f3 = i2 + 40;
            }
            addView(wf2Var, nme.d(24, 24.0f, i15, f3, 33.0f, z6 ? i2 + 39 : 0.0f, 0.0f));
        } else if (i == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.L(2.0f));
        }
        setWillNotDraw(false);
    }

    public static pb0 a(boolean z) {
        float f;
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.f(8);
        if (z) {
            f = 0.8f;
        } else {
            f = 1.1f;
        }
        pb0Var.p = f;
        pb0Var.h(bkb.w0(null, bkb.S7, false), bkb.w0(null, bkb.Z7, false));
        return pb0Var;
    }

    public static fm2 b(Context context, boolean z) {
        fm2 fm2Var = new fm2(new f6(new mh8(bkb.Ck, bkb.Bk, -1, -1, null), (byte) 3), context.getResources().getDrawable(2131232367), 0, 0);
        if (z) {
            int L = gl.L(18.0f);
            int L2 = gl.L(18.0f);
            fm2Var.e = L;
            fm2Var.f = L2;
        }
        return fm2Var;
    }

    public final void c(boolean z, boolean z2) {
        float f;
        wf2 wf2Var = this.d;
        if (wf2Var != null) {
            wf2Var.a(z, z2);
        } else if (this.w == 2 && this.I != z) {
            this.I = z;
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new ni4(this, (byte) 8));
                this.H.addListener(new v85(this, (byte) 1));
                this.H.setDuration(180L);
                this.H.setInterpolator(s33.g);
                this.H.start();
            } else {
                float f2 = 0.82f;
                float f3 = 1.0f;
                if (this.I) {
                    f = 0.82f;
                } else {
                    f = 1.0f;
                }
                be0 be0Var = this.a;
                be0Var.setScaleX(f);
                if (!this.I) {
                    f2 = 1.0f;
                }
                be0Var.setScaleY(f2);
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
        mh8 mh8Var;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            be0 be0Var = this.a;
            float height = (be0Var.getHeight() / 2.0f) + be0Var.getY() + gl.L(18.0f);
            float width = (be0Var.getWidth() / 2.0f) + be0Var.getX() + gl.L(18.0f);
            canvas.save();
            Paint paint2 = bkb.s0;
            int i = bkb.c6;
            wjb wjbVar = this.N;
            paint2.setColor(bkb.v0(i, wjbVar));
            canvas.drawCircle(width, height, gl.L(11.33f) * d, bkb.s0);
            if (this.R == null) {
                mh8 mh8Var2 = this.T;
                if (mh8Var2 == null) {
                    mh8 mh8Var3 = new mh8(bkb.Bk, bkb.Ck, -1, -1, this.N);
                    this.T = mh8Var3;
                    mh8Var = mh8Var3;
                } else {
                    mh8Var = mh8Var2;
                }
                mh8Var.d((int) (width - gl.L(10.0f)), 0.0f, (int) (height - gl.L(10.0f)), (int) (gl.L(10.0f) + width), 0.0f, (int) (gl.L(10.0f) + height));
                paint = this.T.f;
            } else {
                Paint paint3 = this.V;
                if (paint3 == null) {
                    paint3 = new Paint();
                    this.V = paint3;
                }
                paint3.setColor(bkb.v0(bkb.b8, wjbVar));
                paint = this.V;
            }
            canvas.drawCircle(width, height, gl.L(10.0f) * d, paint);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za5.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.S) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.R;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = na7.q1(this.x).J2(((TLRPC.User) this.f).id);
            }
        }
        boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z && this.Q == cf3.j(requirementToContact)) {
            return;
        }
        this.P = z;
        this.Q = cf3.j(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public wf2 getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public jia getStatusTextView() {
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
        wjb wjbVar = this.N;
        if (i <= 0 && this.w == 2 && (this.I || this.J > 0.0f)) {
            int v0 = bkb.v0(bkb.V6, wjbVar);
            Paint paint = this.K;
            paint.setColor(v0);
            be0 be0Var = this.a;
            canvas.drawCircle((be0Var.getMeasuredWidth() / 2) + be0Var.getLeft(), (be0Var.getMeasuredHeight() / 2) + be0Var.getTop(), (gl.L(4.0f) * this.J) + gl.L(18.0f), paint);
        }
        if (this.F) {
            boolean z = k96.a0;
            byte b = this.G;
            if (z) {
                f = 0.0f;
            } else {
                f = b + 72;
            }
            int L = gl.L(f);
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                f2 = b + 72;
            }
            int L2 = measuredWidth - gl.L(f2);
            if (this.L) {
                bkb.k0.setColor(bkb.v0(bkb.Wg, wjbVar));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), bkb.k0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), bkb.U0("paintDivider", wjbVar));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wf2 wf2Var = this.d;
        if (wf2Var != null) {
            z = wf2Var.a.q;
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(f), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z) {
        wf2 wf2Var = this.d;
        if (wf2Var != null) {
            wf2Var.setEnabled(z);
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
        jia jiaVar = this.c;
        if (jiaVar != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = jiaVar.getTextColor()) != this.W) {
                    this.W = textColor;
                    jiaVar.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        be0 be0Var = this.a;
        if (be0Var != null) {
            be0Var.invalidate();
        }
        try {
            if (this.s && be0Var != null) {
                Drawable t = be0Var.getImageReceiver().t();
                if (t instanceof pb0) {
                    ((pb0) t).h(bkb.w0(null, bkb.S7, false), bkb.w0(null, bkb.Z7, false));
                    be0Var.invalidate();
                }
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public za5(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
