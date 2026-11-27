package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public abstract class mb5 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public ka5 E;
    public boolean E0;
    public ka5 F;
    public float F0;
    public final t85 G;
    public float G0;
    public final c75 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final tt J;
    public float J0;
    public final jc0 K;
    public ValueAnimator K0;
    public final TextView L;
    public final UndoView[] L0;
    public boolean M;
    public boolean M0;
    public long N;
    public boolean N0;
    public float O;
    public ValueAnimator O0;
    public float P;
    public long P0;
    public float Q;
    public ea5 Q0;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public float a0;
    public boolean b;
    public final GradientDrawable b0;
    public float c;
    public final GradientDrawable c0;
    public long d;
    public final c43 d0;
    public wc2 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final a81 g0;
    public long h;
    public boolean h0;
    public final zz3 i0;
    public vc2 j0;
    public final j95 k0;
    public final d41 l0;
    public final d7 m0;
    public float n;
    public final View n0;
    public final View o0;
    public float p0;
    public float q0;
    public ValueAnimator r;
    public float r0;
    public boolean s;
    public float s0;
    public float t0;
    public boolean u0;
    public float v0;
    public final ImageView w;
    public float w0;
    public final LongSparseIntArray x;
    public int x0;
    public final pn y;
    public int y0;
    public float z0;

    public mb5(LaunchActivity launchActivity, t85 t85Var, c75 c75Var, ArrayList arrayList, vc2 vc2Var, j95 j95Var) {
        super(launchActivity);
        this.x = new LongSparseIntArray();
        this.y = new pn(null);
        this.P = 1.0f;
        this.W = true;
        final g75 g75Var = (g75) this;
        this.i0 = new zz3(g75Var, (byte) 13);
        this.z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = t85Var;
        this.H = c75Var;
        this.I = arrayList;
        this.j0 = vc2Var;
        this.k0 = j95Var;
        d41 d41Var = new d41(launchActivity, (byte) 2);
        this.l0 = d41Var;
        gd0 gd0Var = new gd0(false);
        gd0Var.a(-1);
        d41Var.setImageDrawable(gd0Var);
        d41Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d41Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        d41Var.setBackground(aob.f0(vm2.o(-1, 55), 1, -1));
        View view = new View(launchActivity);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, vm2.o(-16777216, 114)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, tre.c(120.0f, -1));
        View view2 = new View(launchActivity);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, vm2.o(-16777216, 114)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility(8);
        addView(view2, tre.e(160, -1, 5));
        addView(d41Var, tre.e(56, -1, 51));
        d41Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                g75 g75Var2 = g75Var;
                switch (b) {
                    case 0:
                        g75Var2.R0.onBackPressed();
                        return;
                    default:
                        if (g75Var2.b) {
                            boolean z = !g75Var2.f;
                            g75Var2.f = z;
                            g75Var2.d0.a(z, true);
                            g75Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        d7 d7Var = new d7((byte) 2, launchActivity, g75Var);
        this.m0 = d7Var;
        int L = hl.L(20.0f);
        int o = vm2.o(-1, 100);
        hf0 i0 = aob.i0(L, L, L, L, 0, o, o);
        a81 a81Var = new a81(g75Var, launchActivity, i0, (byte) 9);
        this.g0 = a81Var;
        a81Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                g75 g75Var2 = g75Var;
                switch (b) {
                    case 0:
                        g75Var2.R0.onBackPressed();
                        return;
                    default:
                        if (g75Var2.b) {
                            boolean z = !g75Var2.f;
                            g75Var2.f = z;
                            g75Var2.d0.a(z, true);
                            g75Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i0.setCallback(a81Var);
        addView(a81Var);
        c43 c43Var = new c43(launchActivity, 2131232300, -1);
        this.d0 = c43Var;
        c43Var.i = -hl.L(1.0f);
        c43Var.j = hl.L(2.0f);
        c43Var.k = hl.L(1.0f);
        c43Var.invalidateSelf();
        d7Var.setImageDrawable(c43Var);
        d7Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        addView(d7Var, tre.e(56, -1, 51));
        TextView textView = new TextView(launchActivity);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131752580, null));
        TextView textView2 = new TextView(launchActivity);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131752579, null));
        addView(textView, tre.e(-2, -2, 51));
        addView(textView2, tre.e(-2, -2, 51));
        ImageView imageView = new ImageView(launchActivity);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231277);
        imageView.setContentDescription(ob6.M0(2131754803, null));
        int L2 = hl.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(aob.f0(vm2.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new je3(g75Var, j95Var, (byte) 25));
        addView(imageView, tre.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        tt ttVar = new tt(g75Var, launchActivity, aob.b0(hl.L(18.0f), vm2.o(aob.w0(null, aob.kh, false), 204)), (byte) 19);
        this.J = ttVar;
        jc0 jc0Var = new jc0(launchActivity, true);
        this.K = jc0Var;
        jc0Var.setStyle(10);
        ttVar.setClipChildren(false);
        ttVar.setClipToPadding(false);
        ttVar.addView(jc0Var, tre.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(launchActivity);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        ttVar.addView(textView3, tre.e(-2, -2, 16));
        addView(ttVar, tre.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i = 0; i < 2; i++) {
            this.L0[i] = new ls1(g75Var, launchActivity);
            this.L0[i].setHideAnimationType(2);
            this.L0[i].setAdditionalTranslationY(hl.L(10.0f));
            addView(this.L0[i], tre.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.g0.setVisibility(8);
        setIsTablet(j95.v5);
    }

    public void setUiVisible(boolean z) {
        if (this.W != z) {
            this.W = z;
            j95 j95Var = ((g75) this).R0;
            g75 g75Var = j95Var.T3;
            if (g75Var != null) {
                j95Var.o5.a(!g75Var.W, true);
            }
            zz3 zz3Var = this.i0;
            if (z && this.b) {
                if (!this.h0) {
                    this.h0 = true;
                    hl.d3(zz3Var, 3000L);
                }
            } else {
                this.h0 = false;
                hl.r(zz3Var);
            }
            ka5 ka5Var = this.E;
            if (ka5Var != null) {
                ka5Var.requestLayout();
            }
        }
    }

    public final void b(boolean z) {
        ValueAnimator ofFloat;
        long j;
        if (this.H0) {
            this.H0 = false;
            float f = this.J0;
            float[] fArr = new float[2];
            if (z) {
                fArr[0] = f;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.K0 = ofFloat;
            ofFloat.addUpdateListener(new jb5(this, (byte) 0));
            this.K0.addListener(new lb5(this, (byte) 1));
            ValueAnimator valueAnimator = this.K0;
            k43 k43Var = k43.f;
            valueAnimator.setInterpolator(k43Var);
            ValueAnimator valueAnimator2 = this.K0;
            if (z) {
                j = 350;
            } else {
                j = 200;
            }
            valueAnimator2.setDuration(j);
            this.K0.setInterpolator(k43Var);
            ka5 ka5Var = this.E;
            if (ka5Var != null) {
                ga5 ga5Var = ka5Var.a;
                ValueAnimator valueAnimator3 = this.K0;
                if (ga5Var.F) {
                    ga5Var.H.add(valueAnimator3);
                } else {
                    valueAnimator3.start();
                }
            } else {
                this.K0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.I0 = false;
    }

    public final boolean c() {
        if (!this.f && System.currentTimeMillis() - this.h > 2000 && !this.H0 && !this.u0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ka5 ka5Var = this.E;
        if (ka5Var != null) {
            if (ka5Var.o0 || ka5Var.p0 != 0.0f) {
                ka5Var.o0 = false;
                ka5Var.p0 = 0.0f;
                ka5Var.a.invalidate();
                ka5Var.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        ka5 ka5Var;
        int i2;
        ka5 ka5Var2;
        ka5 ka5Var3;
        float f;
        float alpha;
        float f2;
        int L;
        int L2;
        UndoView[] undoViewArr;
        if (j95.v5) {
            this.T = true;
            super.dispatchDraw(canvas);
            this.T = false;
        }
        this.U = true;
        super.dispatchDraw(canvas);
        this.U = false;
        if (this.F != null || this.E != null) {
            t85 t85Var = this.G;
            float y = t85Var.getY() - getTop();
            float measuredHeight = (t85Var.getMeasuredHeight() + y) - t85Var.getTranslationY();
            float f3 = this.c;
            canvas.save();
            boolean z3 = j95.v5;
            if (!z3 && (ka5Var = this.E) != null && !ka5Var.P && ka5Var.c != null) {
                float f4 = 1.0f - f3;
                canvas.clipRect(0.0f, y * f4, getMeasuredWidth(), (getMeasuredHeight() * f3) + (measuredHeight * f4));
            } else if (z3) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            ka5 ka5Var4 = this.F;
            if (ka5Var4 != null && ka5Var4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            ka5 ka5Var5 = this.E;
            if (ka5Var5 != null && ka5Var5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = hl.P;
                    rectF.set(this.E.getX(), this.E.getY(), this.E.getX() + this.E.getMeasuredWidth(), this.E.getY() + this.E.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.E.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                if (!this.H0 && this.K0 == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (!j95.u5 && !j95.v5) {
                        i = hl.L(90.0f);
                    } else {
                        i = 0;
                    }
                    canvas.clipRect(0, 0, measuredWidth, measuredHeight2 - i);
                }
                canvas.translate(this.E.getX(), this.E.getY());
                ka5 ka5Var6 = this.E;
                float f5 = this.J0;
                if (ka5Var6.o0 != z || ka5Var6.p0 != f5) {
                    ka5Var6.o0 = z;
                    ka5Var6.p0 = f5;
                    ka5Var6.a.invalidate();
                    ka5Var6.invalidate();
                }
                ka5 ka5Var7 = this.E;
                if (!this.A0 && this.C0 == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ka5Var7.i(this.z0, this.v0, this.w0, this.s0, this.t0, z2);
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i3 = 0; i3 < 2; i3++) {
            UndoView[] undoViewArr2 = this.L0;
            if (undoViewArr2[i3].getVisibility() == 0) {
                canvas.save();
                if (j95.u5) {
                    f2 = 0.0f;
                } else {
                    f2 = (1.0f - this.a0) * (-hl.L(90.0f));
                }
                float measuredWidth2 = getMeasuredWidth();
                int measuredHeight3 = getMeasuredHeight();
                if (j95.u5) {
                    L = 0;
                } else {
                    L = hl.L(90.0f);
                }
                canvas.clipRect(0.0f, 0.0f, measuredWidth2, ((measuredHeight3 - L) + f2) - hl.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i3].getX() - hl.L(8.0f), undoViewArr2[i3].getY() - hl.L(8.0f));
                } else {
                    float x = undoViewArr2[i3].getX() - hl.L(8.0f);
                    float y2 = undoViewArr2[i3].getY();
                    if (j95.u5) {
                        L2 = 0;
                    } else {
                        L2 = hl.L(90.0f);
                    }
                    canvas.translate(x, ((y2 - L2) + f2) - hl.L(26.0f));
                }
                if (undoViewArr2[i3].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i3].getMeasuredWidth(), undoViewArr2[i3].getMeasuredHeight(), (int) (undoViewArr2[i3].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i3].getScaleX(), undoViewArr[i3].getScaleY(), undoViewArr[i3].getMeasuredWidth() / 2.0f, undoViewArr[i3].getMeasuredHeight() / 2.0f);
                undoViewArr[i3].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f6 = (1.0f - this.a0) * this.c;
        ValueAnimator valueAnimator = this.O0;
        GradientDrawable gradientDrawable = this.b0;
        GradientDrawable gradientDrawable2 = this.c0;
        if (valueAnimator != null && (ka5Var2 = this.F) != null && (ka5Var3 = this.E) != null) {
            boolean z4 = ka5Var2.W;
            boolean z5 = ka5Var3.W;
            if (z4 != z5) {
                if (!z5) {
                    alpha = 1.0f - ka5Var3.getAlpha();
                } else {
                    alpha = ka5Var3.getAlpha();
                }
                f = alpha * f6;
            } else if (!z5) {
                f = 0.0f;
            } else {
                f = f6;
            }
            int i4 = (int) (f * 255.0f);
            gradientDrawable.setAlpha(i4);
            gradientDrawable2.setAlpha(i4);
        } else {
            ka5 ka5Var8 = this.E;
            float f7 = 255.0f * f6;
            if (ka5Var8 != null) {
                gradientDrawable.setAlpha((int) ((1.0f - ka5Var8.a0) * f7));
                gradientDrawable2.setAlpha((int) ((1.0f - this.E.a0) * f7));
            } else {
                int i5 = (int) f7;
                gradientDrawable.setAlpha(i5);
                gradientDrawable2.setAlpha(i5);
            }
        }
        this.l0.setAlpha(f6);
        vc2 vc2Var = this.j0;
        d7 d7Var = this.m0;
        ImageView imageView = this.w;
        if (vc2Var != null && vc2Var.b.rtmp_stream) {
            d7Var.setAlpha(0.0f);
            d7Var.setVisibility(4);
            imageView.setAlpha(f6);
            imageView.setVisibility(0);
            if (j95.u5) {
                imageView.setTranslationX((1.0f - this.a0) * (-hl.L(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            d7Var.setAlpha(f6);
            d7Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth3 = getMeasuredWidth();
        TextView textView = this.e0;
        int measuredWidth4 = getMeasuredWidth();
        TextView textView2 = this.f0;
        float currentActionBarHeight = ((a.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - hl.L(1.0f);
        c43 c43Var = this.d0;
        float f8 = c43Var.g;
        float A = qd4.A(1.0f, f8, measuredWidth3 - textView.getMeasuredWidth(), (measuredWidth4 - textView2.getMeasuredWidth()) * f8) - hl.L(21.0f);
        if (j95.v5) {
            i2 = hl.L(328.0f);
        } else if (j95.u5) {
            i2 = hl.L(180.0f);
        } else {
            i2 = 0;
        }
        float f9 = A - i2;
        textView.setTranslationX(f9);
        textView2.setTranslationX(f9);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        a81 a81Var = this.g0;
        a81Var.setTranslationX(f9 - hl.L(36.0f));
        a81Var.setTranslationY((a.getCurrentActionBarHeight() - a81Var.getMeasuredHeight()) / 2.0f);
        d7Var.setTranslationX(f9 - hl.L(44.0f));
        textView.setAlpha((1.0f - c43Var.g) * f6);
        textView2.setAlpha(c43Var.g * f6);
        a81Var.setAlpha(f6);
        float f10 = this.P;
        int i6 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        tt ttVar = this.J;
        if (i6 != 0) {
            float f11 = f10 + 0.07272727f;
            this.P = f11;
            if (f11 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            ttVar.invalidate();
        }
        boolean z6 = this.M;
        float f12 = this.O;
        if (z6) {
            if (f12 != 1.0f) {
                float f13 = f12 + 0.10666667f;
                this.O = f13;
                if (f13 > 1.0f) {
                    this.O = 1.0f;
                } else {
                    invalidate();
                }
            }
        } else if (f12 != 0.0f) {
            float f14 = f12 - 0.10666667f;
            this.O = f14;
            if (f14 < 0.0f) {
                this.O = 0.0f;
            } else {
                invalidate();
            }
        }
        if (j95.u5) {
            ttVar.setTranslationY(hl.L(16.0f));
        } else {
            ttVar.setTranslationY((hl.L(8.0f) * this.a0) + ((1.0f - this.a0) * a.getCurrentActionBarHeight()) + hl.L(8.0f));
        }
        ttVar.setAlpha(this.O * this.c);
        ttVar.setScaleX((this.O * 0.5f) + 0.5f);
        ttVar.setScaleY((this.O * 0.5f) + 0.5f);
        if (j95.v5) {
            this.V = true;
            super.dispatchDraw(canvas);
            this.V = false;
        } else {
            super.dispatchDraw(canvas);
        }
        c75 c75Var = this.H;
        if (c75Var.getVisibility() == 0) {
            for (int i7 = 0; i7 < c75Var.getChildCount(); i7++) {
                o95 o95Var = (o95) c75Var.getChildAt(i7);
                if (o95Var.getVisibility() == 0 && o95Var.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(c75Var.getX() + o95Var.getX(), c75Var.getY() + o95Var.getY());
                    canvas.scale(o95Var.getScaleX(), o95Var.getScaleY(), o95Var.getMeasuredWidth() / 2.0f, o95Var.getMeasuredHeight() / 2.0f);
                    o95Var.c(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = this.U;
        t85 t85Var = this.G;
        if (z) {
            if ((view instanceof ka5) && ((ka5) view).y0) {
                float y = t85Var.getY() - getTop();
                float measuredHeight = (t85Var.getMeasuredHeight() + y) - t85Var.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof ka5) {
                    ka5 ka5Var = (ka5) view;
                    if (ka5Var != this.E && ka5Var != this.F && !this.V && !ka5Var.y0) {
                        if (ka5Var.c != null) {
                            float y2 = t85Var.getY() - getTop();
                            float measuredHeight2 = (t85Var.getMeasuredHeight() + y2) - t85Var.getTranslationY();
                            float f = this.c;
                            if (ka5Var.d == null) {
                                f = 0.0f;
                            }
                            canvas.save();
                            float f2 = 1.0f - f;
                            canvas.clipRect(0.0f, y2 * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight2 * f2));
                            boolean drawChild2 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild2;
                        } else if (j95.v5) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild3 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild3;
                        } else {
                            return super.drawChild(canvas, view, j);
                        }
                    }
                } else if (!this.T) {
                    return super.drawChild(canvas, view, j);
                }
            }
        }
        return true;
    }

    public final void e(ka5 ka5Var) {
        this.I.remove(ka5Var);
        long B1 = r47.B1(ka5Var.x.a.peer);
        LongSparseIntArray longSparseIntArray = this.x;
        longSparseIntArray.put(B1, longSparseIntArray.get(B1, 0) - 1);
    }

    public final void f() {
        mb5 mb5Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            mb5Var = this;
            ofFloat.addUpdateListener(new bt4(mb5Var, this.z0, this.s0, this.t0, (byte) 1));
            mb5Var.C0.addListener(new lb5(mb5Var, (byte) 2));
            mb5Var.C0.setDuration(350L);
            mb5Var.C0.setInterpolator(k43.f);
            mb5Var.C0.start();
            mb5Var.h = System.currentTimeMillis();
        } else {
            mb5Var = this;
        }
        mb5Var.B0 = false;
        mb5Var.u0 = false;
    }

    public abstract void g(boolean z);

    public UndoView getUndoView() {
        View[] viewArr = this.L0;
        if (viewArr[0].getVisibility() == 0) {
            UndoView undoView = viewArr[0];
            viewArr[0] = viewArr[1];
            viewArr[1] = undoView;
            undoView.d(2, true);
            removeView(viewArr[0]);
            addView(viewArr[0]);
        }
        return viewArr[0];
    }

    public final void h(defpackage.wc2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb5.h(wc2):void");
    }

    public final void i(TLRPC.GroupCallParticipant groupCallParticipant, float f) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i < arrayList.size()) {
                if (r47.B1(((ka5) arrayList.get(i)).x.a.peer) == r47.B1(groupCallParticipant.peer)) {
                    ((ka5) arrayList.get(i)).setAmplitude(f);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public abstract void j();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredWidth;
        int i4;
        int i5;
        boolean z = j95.v5;
        View view = this.n0;
        if (z) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = hl.L(328.0f);
        } else if (j95.u5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = hl.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        if (j95.u5 && !j95.v5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.o0.setVisibility(i3);
        a81 a81Var = this.g0;
        a81Var.getLayoutParams().height = hl.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i2);
        ViewGroup.LayoutParams layoutParams = a81Var.getLayoutParams();
        int L = hl.L(46.0f);
        if (!this.f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (j95.u5) {
            i4 = hl.L(45.0f);
        } else {
            i4 = 0;
        }
        marginLayoutParams.rightMargin = i4;
        for (int i6 = 0; i6 < 2; i6++) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.L0[i6].getLayoutParams();
            if (this.N0) {
                marginLayoutParams2.rightMargin = hl.L(344.0f);
            } else {
                if (j95.u5) {
                    i5 = hl.L(180.0f);
                } else {
                    i5 = 0;
                }
                marginLayoutParams2.rightMargin = i5;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(vc2 vc2Var) {
        this.j0 = vc2Var;
    }

    public void setIsTablet(boolean z) {
        int i;
        int i2;
        int i3;
        if (this.N0 != z) {
            this.N0 = z;
            d41 d41Var = this.l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d41Var.getLayoutParams();
            if (z) {
                i = 85;
            } else {
                i = 51;
            }
            layoutParams.gravity = i;
            if (z) {
                i2 = hl.L(328.0f);
            } else {
                i2 = 0;
            }
            layoutParams.rightMargin = i2;
            if (z) {
                i3 = -hl.L(8.0f);
            } else {
                i3 = 0;
            }
            layoutParams.bottomMargin = i3;
            if (this.N0) {
                d41Var.setImageDrawable(getContext().getDrawable(2131232089));
                return;
            }
            gd0 gd0Var = new gd0(false);
            gd0Var.a(-1);
            d41Var.setImageDrawable(gd0Var);
        }
    }

    public void setProgressToHideUi(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidate();
            ka5 ka5Var = this.E;
            if (ka5Var != null) {
                ka5Var.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z) {
        jc0 jc0Var;
        boolean z2;
        boolean z3;
        int L;
        long j;
        TLRPC.Chat M0;
        TLRPC.User user;
        if (this.b && !this.N0 && this.e != null && this.r == null && this.j0 != null) {
            int i = this.k0.a;
            long j2 = 500;
            if (System.currentTimeMillis() - this.P0 < 500) {
                if (this.Q0 == null) {
                    ea5 ea5Var = new ea5(this, (byte) 3);
                    this.Q0 = ea5Var;
                    hl.d3(ea5Var, (System.currentTimeMillis() - this.P0) + 50);
                    return;
                }
                return;
            }
            this.P0 = System.currentTimeMillis();
            SpannableStringBuilder spannableStringBuilder = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int m = this.j0.P.m();
                jc0Var = this.K;
                if (i2 >= m) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i2));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j = j2;
                    if (r47.B1(this.e.a.peer) != r47.B1(groupCallParticipant.peer)) {
                        long B1 = r47.B1(groupCallParticipant.peer);
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i3 == 0) {
                                this.N = r47.B1(groupCallParticipant.peer);
                            }
                            if (i3 < 3) {
                                if (B1 > 0) {
                                    user = uc7.s1(i).X1(Long.valueOf(B1));
                                    M0 = null;
                                } else {
                                    M0 = uc7.s1(i).M0(Long.valueOf(B1));
                                    user = null;
                                }
                                if (user != null || M0 != null) {
                                    jc0Var.b(i3, i, groupCallParticipant);
                                    if (i3 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(lbc.k(user, true), new y7c(hl.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(M0.title, new y7c(hl.o()), 0);
                                    }
                                }
                            }
                            i3++;
                            if (i3 == 3) {
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    j = j2;
                }
                i2++;
                j2 = j;
            }
            if (i3 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z4 = this.M;
            TextView textView = this.L;
            if (!z4 && z2) {
                z3 = false;
            } else if (!z2 && z4) {
                this.M = z2;
                invalidate();
                return;
            } else {
                if (z4 && z2) {
                    tt ttVar = this.J;
                    this.Q = ttVar.getLeft();
                    this.S = ttVar.getRight();
                    this.R = textView.getLeft();
                    this.P = 0.0f;
                }
                z3 = z;
            }
            if (!z2) {
                this.M = z2;
                invalidate();
                return;
            }
            String J0 = ob6.J0(i3, "MembersAreSpeakingToast");
            int indexOf = J0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            textView.setText(spannableStringBuilder2);
            if (i3 == 0) {
                L = 0;
            } else if (i3 == 1) {
                L = hl.L(40.0f);
            } else if (i3 == 2) {
                L = hl.L(64.0f);
            } else {
                L = hl.L(88.0f);
            }
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = L;
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = hl.L(16.0f);
            this.M = z2;
            invalidate();
            while (i3 < 3) {
                jc0Var.b(i3, i, null);
                i3++;
            }
            jc0Var.a(z3);
        } else if (this.M) {
            this.M = false;
            this.O = 0.0f;
        }
    }
}
