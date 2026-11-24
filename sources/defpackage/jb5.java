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
public abstract class jb5 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public ha5 E;
    public boolean E0;
    public ha5 F;
    public float F0;
    public final p85 G;
    public float G0;
    public final y65 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final su J;
    public float J0;
    public final hd0 K;
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
    public qn4 Q0;
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
    public final v43 d0;
    public rd2 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final a91 g0;
    public long h;
    public boolean h0;
    public final o04 i0;
    public qd2 j0;
    public final g95 k0;
    public final c51 l0;
    public final c7 m0;
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
    public final po y;
    public int y0;
    public float z0;

    public jb5(LaunchActivity launchActivity, p85 p85Var, y65 y65Var, ArrayList arrayList, qd2 qd2Var, g95 g95Var) {
        super(launchActivity);
        this.x = new LongSparseIntArray();
        this.y = new po(null);
        this.P = 1.0f;
        this.W = true;
        final c75 c75Var = (c75) this;
        this.i0 = new o04(c75Var, (byte) 13);
        this.z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = p85Var;
        this.H = y65Var;
        this.I = arrayList;
        this.j0 = qd2Var;
        this.k0 = g95Var;
        c51 c51Var = new c51(launchActivity, (byte) 2);
        this.l0 = c51Var;
        ee0 ee0Var = new ee0(false);
        ee0Var.a(-1);
        c51Var.setImageDrawable(ee0Var);
        c51Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c51Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        c51Var.setBackground(cmb.f0(on2.p(-1, 55), 1, -1));
        View view = new View(launchActivity);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, on2.p(-16777216, 114)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, qoe.c(120.0f, -1));
        View view2 = new View(launchActivity);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, on2.p(-16777216, 114)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility(8);
        addView(view2, qoe.e(160, -1, 5));
        addView(c51Var, qoe.e(56, -1, 51));
        c51Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                c75 c75Var2 = c75Var;
                switch (b) {
                    case 0:
                        c75Var2.R0.onBackPressed();
                        return;
                    default:
                        if (c75Var2.b) {
                            boolean z = !c75Var2.f;
                            c75Var2.f = z;
                            c75Var2.d0.a(z, true);
                            c75Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        c7 c7Var = new c7((byte) 2, launchActivity, c75Var);
        this.m0 = c7Var;
        int L = gm.L(20.0f);
        int p = on2.p(-1, 100);
        fg0 i0 = cmb.i0(L, L, L, L, 0, p, p);
        a91 a91Var = new a91(c75Var, launchActivity, i0, (byte) 9);
        this.g0 = a91Var;
        a91Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                c75 c75Var2 = c75Var;
                switch (b) {
                    case 0:
                        c75Var2.R0.onBackPressed();
                        return;
                    default:
                        if (c75Var2.b) {
                            boolean z = !c75Var2.f;
                            c75Var2.f = z;
                            c75Var2.d0.a(z, true);
                            c75Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i0.setCallback(a91Var);
        addView(a91Var);
        v43 v43Var = new v43(launchActivity, 2131232301, -1);
        this.d0 = v43Var;
        v43Var.i = -gm.L(1.0f);
        v43Var.j = gm.L(2.0f);
        v43Var.k = gm.L(1.0f);
        v43Var.invalidateSelf();
        c7Var.setImageDrawable(v43Var);
        c7Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        addView(c7Var, qoe.e(56, -1, 51));
        TextView textView = new TextView(launchActivity);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131752552, null));
        TextView textView2 = new TextView(launchActivity);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gm.o());
        textView2.setText(jb6.M0(2131752551, null));
        addView(textView, qoe.e(-2, -2, 51));
        addView(textView2, qoe.e(-2, -2, 51));
        ImageView imageView = new ImageView(launchActivity);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231278);
        imageView.setContentDescription(jb6.M0(2131754807, null));
        int L2 = gm.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(cmb.f0(on2.p(-1, 55), 1, -1));
        imageView.setOnClickListener(new tf3(c75Var, g95Var, (byte) 23));
        addView(imageView, qoe.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        su suVar = new su(c75Var, launchActivity, cmb.b0(gm.L(18.0f), on2.p(cmb.w0(null, cmb.jh, false), 204)), (byte) 19);
        this.J = suVar;
        hd0 hd0Var = new hd0(launchActivity, true);
        this.K = hd0Var;
        hd0Var.setStyle(10);
        suVar.setClipChildren(false);
        suVar.setClipToPadding(false);
        suVar.addView(hd0Var, qoe.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(launchActivity);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        suVar.addView(textView3, qoe.e(-2, -2, 16));
        addView(suVar, qoe.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i = 0; i < 2; i++) {
            this.L0[i] = new kt1(c75Var, launchActivity);
            this.L0[i].setHideAnimationType(2);
            this.L0[i].setAdditionalTranslationY(gm.L(10.0f));
            addView(this.L0[i], qoe.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.g0.setVisibility(8);
        setIsTablet(g95.v5);
    }

    public void setUiVisible(boolean z) {
        if (this.W != z) {
            this.W = z;
            g95 g95Var = ((c75) this).R0;
            c75 c75Var = g95Var.T3;
            if (c75Var != null) {
                g95Var.o5.a(!c75Var.W, true);
            }
            o04 o04Var = this.i0;
            if (z && this.b) {
                if (!this.h0) {
                    this.h0 = true;
                    gm.d3(o04Var, 3000L);
                }
            } else {
                this.h0 = false;
                gm.r(o04Var);
            }
            ha5 ha5Var = this.E;
            if (ha5Var != null) {
                ha5Var.requestLayout();
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
            ofFloat.addUpdateListener(new gb5(this, (byte) 0));
            this.K0.addListener(new ib5(this, (byte) 1));
            ValueAnimator valueAnimator = this.K0;
            d53 d53Var = d53.f;
            valueAnimator.setInterpolator(d53Var);
            ValueAnimator valueAnimator2 = this.K0;
            if (z) {
                j = 350;
            } else {
                j = 200;
            }
            valueAnimator2.setDuration(j);
            this.K0.setInterpolator(d53Var);
            ha5 ha5Var = this.E;
            if (ha5Var != null) {
                da5 da5Var = ha5Var.a;
                ValueAnimator valueAnimator3 = this.K0;
                if (da5Var.F) {
                    da5Var.H.add(valueAnimator3);
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
        ha5 ha5Var = this.E;
        if (ha5Var != null) {
            if (ha5Var.o0 || ha5Var.p0 != 0.0f) {
                ha5Var.o0 = false;
                ha5Var.p0 = 0.0f;
                ha5Var.a.invalidate();
                ha5Var.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        ha5 ha5Var;
        int i2;
        ha5 ha5Var2;
        ha5 ha5Var3;
        float f;
        float alpha;
        float f2;
        int L;
        int L2;
        UndoView[] undoViewArr;
        if (g95.v5) {
            this.T = true;
            super.dispatchDraw(canvas);
            this.T = false;
        }
        this.U = true;
        super.dispatchDraw(canvas);
        this.U = false;
        if (this.F != null || this.E != null) {
            p85 p85Var = this.G;
            float y = p85Var.getY() - getTop();
            float measuredHeight = (p85Var.getMeasuredHeight() + y) - p85Var.getTranslationY();
            float f3 = this.c;
            canvas.save();
            boolean z3 = g95.v5;
            if (!z3 && (ha5Var = this.E) != null && !ha5Var.P && ha5Var.c != null) {
                float f4 = 1.0f - f3;
                canvas.clipRect(0.0f, y * f4, getMeasuredWidth(), (getMeasuredHeight() * f3) + (measuredHeight * f4));
            } else if (z3) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            ha5 ha5Var4 = this.F;
            if (ha5Var4 != null && ha5Var4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            ha5 ha5Var5 = this.E;
            if (ha5Var5 != null && ha5Var5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = gm.P;
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
                    if (!g95.u5 && !g95.v5) {
                        i = gm.L(90.0f);
                    } else {
                        i = 0;
                    }
                    canvas.clipRect(0, 0, measuredWidth, measuredHeight2 - i);
                }
                canvas.translate(this.E.getX(), this.E.getY());
                ha5 ha5Var6 = this.E;
                float f5 = this.J0;
                if (ha5Var6.o0 != z || ha5Var6.p0 != f5) {
                    ha5Var6.o0 = z;
                    ha5Var6.p0 = f5;
                    ha5Var6.a.invalidate();
                    ha5Var6.invalidate();
                }
                ha5 ha5Var7 = this.E;
                if (!this.A0 && this.C0 == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ha5Var7.i(this.z0, this.v0, this.w0, this.s0, this.t0, z2);
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i3 = 0; i3 < 2; i3++) {
            UndoView[] undoViewArr2 = this.L0;
            if (undoViewArr2[i3].getVisibility() == 0) {
                canvas.save();
                if (g95.u5) {
                    f2 = 0.0f;
                } else {
                    f2 = (1.0f - this.a0) * (-gm.L(90.0f));
                }
                float measuredWidth2 = getMeasuredWidth();
                int measuredHeight3 = getMeasuredHeight();
                if (g95.u5) {
                    L = 0;
                } else {
                    L = gm.L(90.0f);
                }
                canvas.clipRect(0.0f, 0.0f, measuredWidth2, ((measuredHeight3 - L) + f2) - gm.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i3].getX() - gm.L(8.0f), undoViewArr2[i3].getY() - gm.L(8.0f));
                } else {
                    float x = undoViewArr2[i3].getX() - gm.L(8.0f);
                    float y2 = undoViewArr2[i3].getY();
                    if (g95.u5) {
                        L2 = 0;
                    } else {
                        L2 = gm.L(90.0f);
                    }
                    canvas.translate(x, ((y2 - L2) + f2) - gm.L(26.0f));
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
        if (valueAnimator != null && (ha5Var2 = this.F) != null && (ha5Var3 = this.E) != null) {
            boolean z4 = ha5Var2.W;
            boolean z5 = ha5Var3.W;
            if (z4 != z5) {
                if (!z5) {
                    alpha = 1.0f - ha5Var3.getAlpha();
                } else {
                    alpha = ha5Var3.getAlpha();
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
            ha5 ha5Var8 = this.E;
            float f7 = 255.0f * f6;
            if (ha5Var8 != null) {
                gradientDrawable.setAlpha((int) ((1.0f - ha5Var8.a0) * f7));
                gradientDrawable2.setAlpha((int) ((1.0f - this.E.a0) * f7));
            } else {
                int i5 = (int) f7;
                gradientDrawable.setAlpha(i5);
                gradientDrawable2.setAlpha(i5);
            }
        }
        this.l0.setAlpha(f6);
        qd2 qd2Var = this.j0;
        c7 c7Var = this.m0;
        ImageView imageView = this.w;
        if (qd2Var != null && qd2Var.b.rtmp_stream) {
            c7Var.setAlpha(0.0f);
            c7Var.setVisibility(4);
            imageView.setAlpha(f6);
            imageView.setVisibility(0);
            if (g95.u5) {
                imageView.setTranslationX((1.0f - this.a0) * (-gm.L(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            c7Var.setAlpha(f6);
            c7Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth3 = getMeasuredWidth();
        TextView textView = this.e0;
        int measuredWidth4 = getMeasuredWidth();
        TextView textView2 = this.f0;
        float currentActionBarHeight = ((a.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - gm.L(1.0f);
        v43 v43Var = this.d0;
        float f8 = v43Var.g;
        float A = td4.A(1.0f, f8, measuredWidth3 - textView.getMeasuredWidth(), (measuredWidth4 - textView2.getMeasuredWidth()) * f8) - gm.L(21.0f);
        if (g95.v5) {
            i2 = gm.L(328.0f);
        } else if (g95.u5) {
            i2 = gm.L(180.0f);
        } else {
            i2 = 0;
        }
        float f9 = A - i2;
        textView.setTranslationX(f9);
        textView2.setTranslationX(f9);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        a91 a91Var = this.g0;
        a91Var.setTranslationX(f9 - gm.L(36.0f));
        a91Var.setTranslationY((a.getCurrentActionBarHeight() - a91Var.getMeasuredHeight()) / 2.0f);
        c7Var.setTranslationX(f9 - gm.L(44.0f));
        textView.setAlpha((1.0f - v43Var.g) * f6);
        textView2.setAlpha(v43Var.g * f6);
        a91Var.setAlpha(f6);
        float f10 = this.P;
        int i6 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        su suVar = this.J;
        if (i6 != 0) {
            float f11 = f10 + 0.07272727f;
            this.P = f11;
            if (f11 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            suVar.invalidate();
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
        if (g95.u5) {
            suVar.setTranslationY(gm.L(16.0f));
        } else {
            suVar.setTranslationY((gm.L(8.0f) * this.a0) + ((1.0f - this.a0) * a.getCurrentActionBarHeight()) + gm.L(8.0f));
        }
        suVar.setAlpha(this.O * this.c);
        suVar.setScaleX((this.O * 0.5f) + 0.5f);
        suVar.setScaleY((this.O * 0.5f) + 0.5f);
        if (g95.v5) {
            this.V = true;
            super.dispatchDraw(canvas);
            this.V = false;
        } else {
            super.dispatchDraw(canvas);
        }
        y65 y65Var = this.H;
        if (y65Var.getVisibility() == 0) {
            for (int i7 = 0; i7 < y65Var.getChildCount(); i7++) {
                l95 l95Var = (l95) y65Var.getChildAt(i7);
                if (l95Var.getVisibility() == 0 && l95Var.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(y65Var.getX() + l95Var.getX(), y65Var.getY() + l95Var.getY());
                    canvas.scale(l95Var.getScaleX(), l95Var.getScaleY(), l95Var.getMeasuredWidth() / 2.0f, l95Var.getMeasuredHeight() / 2.0f);
                    l95Var.c(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = this.U;
        p85 p85Var = this.G;
        if (z) {
            if ((view instanceof ha5) && ((ha5) view).y0) {
                float y = p85Var.getY() - getTop();
                float measuredHeight = (p85Var.getMeasuredHeight() + y) - p85Var.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof ha5) {
                    ha5 ha5Var = (ha5) view;
                    if (ha5Var != this.E && ha5Var != this.F && !this.V && !ha5Var.y0) {
                        if (ha5Var.c != null) {
                            float y2 = p85Var.getY() - getTop();
                            float measuredHeight2 = (p85Var.getMeasuredHeight() + y2) - p85Var.getTranslationY();
                            float f = this.c;
                            if (ha5Var.d == null) {
                                f = 0.0f;
                            }
                            canvas.save();
                            float f2 = 1.0f - f;
                            canvas.clipRect(0.0f, y2 * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight2 * f2));
                            boolean drawChild2 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild2;
                        } else if (g95.v5) {
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

    public final void e(ha5 ha5Var) {
        this.I.remove(ha5Var);
        long B1 = k47.B1(ha5Var.x.a.peer);
        LongSparseIntArray longSparseIntArray = this.x;
        longSparseIntArray.put(B1, longSparseIntArray.get(B1, 0) - 1);
    }

    public final void f() {
        jb5 jb5Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            jb5Var = this;
            ofFloat.addUpdateListener(new ys4(jb5Var, this.z0, this.s0, this.t0, (byte) 1));
            jb5Var.C0.addListener(new ib5(jb5Var, (byte) 2));
            jb5Var.C0.setDuration(350L);
            jb5Var.C0.setInterpolator(d53.f);
            jb5Var.C0.start();
            jb5Var.h = System.currentTimeMillis();
        } else {
            jb5Var = this;
        }
        jb5Var.B0 = false;
        jb5Var.u0 = false;
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

    public final void h(defpackage.rd2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb5.h(rd2):void");
    }

    public final void i(TLRPC.GroupCallParticipant groupCallParticipant, float f) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i < arrayList.size()) {
                if (k47.B1(((ha5) arrayList.get(i)).x.a.peer) == k47.B1(groupCallParticipant.peer)) {
                    ((ha5) arrayList.get(i)).setAmplitude(f);
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
        boolean z = g95.v5;
        View view = this.n0;
        if (z) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = gm.L(328.0f);
        } else if (g95.u5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = gm.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        if (g95.u5 && !g95.v5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.o0.setVisibility(i3);
        a91 a91Var = this.g0;
        a91Var.getLayoutParams().height = gm.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i2);
        ViewGroup.LayoutParams layoutParams = a91Var.getLayoutParams();
        int L = gm.L(46.0f);
        if (!this.f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (g95.u5) {
            i4 = gm.L(45.0f);
        } else {
            i4 = 0;
        }
        marginLayoutParams.rightMargin = i4;
        for (int i6 = 0; i6 < 2; i6++) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.L0[i6].getLayoutParams();
            if (this.N0) {
                marginLayoutParams2.rightMargin = gm.L(344.0f);
            } else {
                if (g95.u5) {
                    i5 = gm.L(180.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(qd2 qd2Var) {
        this.j0 = qd2Var;
    }

    public void setIsTablet(boolean z) {
        int i;
        int i2;
        int i3;
        if (this.N0 != z) {
            this.N0 = z;
            c51 c51Var = this.l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c51Var.getLayoutParams();
            if (z) {
                i = 85;
            } else {
                i = 51;
            }
            layoutParams.gravity = i;
            if (z) {
                i2 = gm.L(328.0f);
            } else {
                i2 = 0;
            }
            layoutParams.rightMargin = i2;
            if (z) {
                i3 = -gm.L(8.0f);
            } else {
                i3 = 0;
            }
            layoutParams.bottomMargin = i3;
            if (this.N0) {
                c51Var.setImageDrawable(getContext().getDrawable(2131232090));
                return;
            }
            ee0 ee0Var = new ee0(false);
            ee0Var.a(-1);
            c51Var.setImageDrawable(ee0Var);
        }
    }

    public void setProgressToHideUi(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidate();
            ha5 ha5Var = this.E;
            if (ha5Var != null) {
                ha5Var.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z) {
        hd0 hd0Var;
        boolean z2;
        boolean z3;
        int i;
        long j;
        TLRPC.Chat L0;
        TLRPC.User user;
        int i2 = 0;
        if (this.b && !this.N0 && this.e != null && this.r == null && this.j0 != null) {
            int i3 = this.k0.a;
            long j2 = 500;
            if (System.currentTimeMillis() - this.P0 < 500) {
                if (this.Q0 == null) {
                    qn4 qn4Var = new qn4(this, (byte) 25);
                    this.Q0 = qn4Var;
                    gm.d3(qn4Var, (System.currentTimeMillis() - this.P0) + 50);
                    return;
                }
                return;
            }
            this.P0 = System.currentTimeMillis();
            int i4 = 0;
            int i5 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m = this.j0.P.m();
                hd0Var = this.K;
                if (i4 >= m) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i4));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j = j2;
                    if (k47.B1(this.e.a.peer) == k47.B1(groupCallParticipant.peer)) {
                        i = i4;
                    } else {
                        long B1 = k47.B1(groupCallParticipant.peer);
                        i = i4;
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i5 == 0) {
                                this.N = k47.B1(groupCallParticipant.peer);
                            }
                            if (i5 < 3) {
                                if (B1 > 0) {
                                    user = oc7.r1(i3).W1(Long.valueOf(B1));
                                    L0 = null;
                                } else {
                                    L0 = oc7.r1(i3).L0(Long.valueOf(B1));
                                    user = null;
                                }
                                if (user != null || L0 != null) {
                                    hd0Var.b(i5, i3, groupCallParticipant);
                                    if (i5 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(m9c.k(user, true), new z5c(gm.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(L0.title, new z5c(gm.o()), 0);
                                    }
                                }
                            }
                            i5++;
                            if (i5 == 3) {
                                break;
                            }
                        }
                    }
                } else {
                    i = i4;
                    j = j2;
                }
                i4 = i + 1;
                j2 = j;
            }
            if (i5 == 0) {
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
                    su suVar = this.J;
                    this.Q = suVar.getLeft();
                    this.S = suVar.getRight();
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
            String J0 = jb6.J0(i5, "MembersAreSpeakingToast");
            int indexOf = J0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            textView.setText(spannableStringBuilder2);
            if (i5 != 0) {
                if (i5 == 1) {
                    i2 = gm.L(40.0f);
                } else if (i5 == 2) {
                    i2 = gm.L(64.0f);
                } else {
                    i2 = gm.L(88.0f);
                }
            }
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i2;
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = gm.L(16.0f);
            this.M = z2;
            invalidate();
            while (i5 < 3) {
                hd0Var.b(i5, i3, null);
                i5++;
            }
            hd0Var.a(z3);
        } else if (this.M) {
            this.M = false;
            this.O = 0.0f;
        }
    }
}
