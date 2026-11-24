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
public abstract class l95 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public h85 E;
    public boolean E0;
    public h85 F;
    public float F0;
    public final r65 G;
    public float G0;
    public final a55 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final st J;
    public float J0;
    public final hc0 K;
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
    public iu4 Q0;
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
    public final k33 d0;
    public gc2 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final s71 g0;
    public long h;
    public boolean h0;
    public final ez3 i0;
    public fc2 j0;
    public final h75 k0;
    public final v31 l0;
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
    public final on y;
    public int y0;
    public float z0;

    public l95(LaunchActivity launchActivity, r65 r65Var, a55 a55Var, ArrayList arrayList, fc2 fc2Var, h75 h75Var) {
        super(launchActivity);
        this.x = new LongSparseIntArray();
        this.y = new on(null);
        this.P = 1.0f;
        this.W = true;
        final e55 e55Var = (e55) this;
        this.i0 = new ez3(e55Var, (byte) 13);
        this.z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = r65Var;
        this.H = a55Var;
        this.I = arrayList;
        this.j0 = fc2Var;
        this.k0 = h75Var;
        v31 v31Var = new v31(launchActivity, (byte) 2);
        this.l0 = v31Var;
        ed0 ed0Var = new ed0(false);
        ed0Var.a(-1);
        v31Var.setImageDrawable(ed0Var);
        v31Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        v31Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        v31Var.setBackground(bkb.f0(bm2.o(-1, 55), 1, -1));
        View view = new View(launchActivity);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, bm2.o(-16777216, 114)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, nme.c(120.0f, -1));
        View view2 = new View(launchActivity);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, bm2.o(-16777216, 114)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility(8);
        addView(view2, nme.e(160, -1, 5));
        addView(v31Var, nme.e(56, -1, 51));
        v31Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                e55 e55Var2 = e55Var;
                switch (b) {
                    case 0:
                        e55Var2.R0.onBackPressed();
                        return;
                    default:
                        if (e55Var2.b) {
                            boolean z = !e55Var2.f;
                            e55Var2.f = z;
                            e55Var2.d0.a(z, true);
                            e55Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        c7 c7Var = new c7((byte) 2, launchActivity, e55Var);
        this.m0 = c7Var;
        int L = gl.L(20.0f);
        int o = bm2.o(-1, 100);
        ff0 i0 = bkb.i0(L, L, L, L, 0, o, o);
        s71 s71Var = new s71(e55Var, launchActivity, i0, (byte) 9);
        this.g0 = s71Var;
        s71Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                byte b = r2;
                e55 e55Var2 = e55Var;
                switch (b) {
                    case 0:
                        e55Var2.R0.onBackPressed();
                        return;
                    default:
                        if (e55Var2.b) {
                            boolean z = !e55Var2.f;
                            e55Var2.f = z;
                            e55Var2.d0.a(z, true);
                            e55Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i0.setCallback(s71Var);
        addView(s71Var);
        k33 k33Var = new k33(launchActivity, 2131232300, -1);
        this.d0 = k33Var;
        k33Var.i = -gl.L(1.0f);
        k33Var.j = gl.L(2.0f);
        k33Var.k = gl.L(1.0f);
        k33Var.invalidateSelf();
        c7Var.setImageDrawable(k33Var);
        c7Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        addView(c7Var, nme.e(56, -1, 51));
        TextView textView = new TextView(launchActivity);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131752587, null));
        TextView textView2 = new TextView(launchActivity);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131752586, null));
        addView(textView, nme.e(-2, -2, 51));
        addView(textView2, nme.e(-2, -2, 51));
        ImageView imageView = new ImageView(launchActivity);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231277);
        imageView.setContentDescription(k96.M0(2131754807, null));
        int L2 = gl.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(bkb.f0(bm2.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new xf3(e55Var, h75Var, (byte) 22));
        addView(imageView, nme.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        st stVar = new st(e55Var, launchActivity, bkb.b0(gl.L(18.0f), bm2.o(bkb.w0(null, bkb.jh, false), 204)), (byte) 18);
        this.J = stVar;
        hc0 hc0Var = new hc0(launchActivity, true);
        this.K = hc0Var;
        hc0Var.setStyle(10);
        stVar.setClipChildren(false);
        stVar.setClipToPadding(false);
        stVar.addView(hc0Var, nme.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(launchActivity);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        stVar.addView(textView3, nme.e(-2, -2, 16));
        addView(stVar, nme.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i = 0; i < 2; i++) {
            this.L0[i] = new xr1(e55Var, launchActivity);
            this.L0[i].setHideAnimationType(2);
            this.L0[i].setAdditionalTranslationY(gl.L(10.0f));
            addView(this.L0[i], nme.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.g0.setVisibility(8);
        setIsTablet(h75.v5);
    }

    public void setUiVisible(boolean z) {
        if (this.W != z) {
            this.W = z;
            h75 h75Var = ((e55) this).R0;
            e55 e55Var = h75Var.T3;
            if (e55Var != null) {
                h75Var.o5.a(!e55Var.W, true);
            }
            ez3 ez3Var = this.i0;
            if (z && this.b) {
                if (!this.h0) {
                    this.h0 = true;
                    gl.d3(ez3Var, 3000L);
                }
            } else {
                this.h0 = false;
                gl.r(ez3Var);
            }
            h85 h85Var = this.E;
            if (h85Var != null) {
                h85Var.requestLayout();
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
            ofFloat.addUpdateListener(new i95(this, (byte) 0));
            this.K0.addListener(new k95(this, (byte) 1));
            ValueAnimator valueAnimator = this.K0;
            s33 s33Var = s33.f;
            valueAnimator.setInterpolator(s33Var);
            ValueAnimator valueAnimator2 = this.K0;
            if (z) {
                j = 350;
            } else {
                j = 200;
            }
            valueAnimator2.setDuration(j);
            this.K0.setInterpolator(s33Var);
            h85 h85Var = this.E;
            if (h85Var != null) {
                d85 d85Var = h85Var.a;
                ValueAnimator valueAnimator3 = this.K0;
                if (d85Var.F) {
                    d85Var.H.add(valueAnimator3);
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
        h85 h85Var = this.E;
        if (h85Var != null) {
            if (h85Var.o0 || h85Var.p0 != 0.0f) {
                h85Var.o0 = false;
                h85Var.p0 = 0.0f;
                h85Var.a.invalidate();
                h85Var.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        h85 h85Var;
        int i2;
        h85 h85Var2;
        h85 h85Var3;
        float f;
        float alpha;
        float f2;
        int L;
        int L2;
        UndoView[] undoViewArr;
        if (h75.v5) {
            this.T = true;
            super.dispatchDraw(canvas);
            this.T = false;
        }
        this.U = true;
        super.dispatchDraw(canvas);
        this.U = false;
        if (this.F != null || this.E != null) {
            r65 r65Var = this.G;
            float y = r65Var.getY() - getTop();
            float measuredHeight = (r65Var.getMeasuredHeight() + y) - r65Var.getTranslationY();
            float f3 = this.c;
            canvas.save();
            boolean z3 = h75.v5;
            if (!z3 && (h85Var = this.E) != null && !h85Var.P && h85Var.c != null) {
                float f4 = 1.0f - f3;
                canvas.clipRect(0.0f, y * f4, getMeasuredWidth(), (getMeasuredHeight() * f3) + (measuredHeight * f4));
            } else if (z3) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            h85 h85Var4 = this.F;
            if (h85Var4 != null && h85Var4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            h85 h85Var5 = this.E;
            if (h85Var5 != null && h85Var5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = gl.P;
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
                    if (!h75.u5 && !h75.v5) {
                        i = gl.L(90.0f);
                    } else {
                        i = 0;
                    }
                    canvas.clipRect(0, 0, measuredWidth, measuredHeight2 - i);
                }
                canvas.translate(this.E.getX(), this.E.getY());
                h85 h85Var6 = this.E;
                float f5 = this.J0;
                if (h85Var6.o0 != z || h85Var6.p0 != f5) {
                    h85Var6.o0 = z;
                    h85Var6.p0 = f5;
                    h85Var6.a.invalidate();
                    h85Var6.invalidate();
                }
                h85 h85Var7 = this.E;
                if (!this.A0 && this.C0 == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                h85Var7.i(this.z0, this.v0, this.w0, this.s0, this.t0, z2);
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i3 = 0; i3 < 2; i3++) {
            UndoView[] undoViewArr2 = this.L0;
            if (undoViewArr2[i3].getVisibility() == 0) {
                canvas.save();
                if (h75.u5) {
                    f2 = 0.0f;
                } else {
                    f2 = (1.0f - this.a0) * (-gl.L(90.0f));
                }
                float measuredWidth2 = getMeasuredWidth();
                int measuredHeight3 = getMeasuredHeight();
                if (h75.u5) {
                    L = 0;
                } else {
                    L = gl.L(90.0f);
                }
                canvas.clipRect(0.0f, 0.0f, measuredWidth2, ((measuredHeight3 - L) + f2) - gl.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i3].getX() - gl.L(8.0f), undoViewArr2[i3].getY() - gl.L(8.0f));
                } else {
                    float x = undoViewArr2[i3].getX() - gl.L(8.0f);
                    float y2 = undoViewArr2[i3].getY();
                    if (h75.u5) {
                        L2 = 0;
                    } else {
                        L2 = gl.L(90.0f);
                    }
                    canvas.translate(x, ((y2 - L2) + f2) - gl.L(26.0f));
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
        if (valueAnimator != null && (h85Var2 = this.F) != null && (h85Var3 = this.E) != null) {
            boolean z4 = h85Var2.W;
            boolean z5 = h85Var3.W;
            if (z4 != z5) {
                if (!z5) {
                    alpha = 1.0f - h85Var3.getAlpha();
                } else {
                    alpha = h85Var3.getAlpha();
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
            h85 h85Var8 = this.E;
            float f7 = 255.0f * f6;
            if (h85Var8 != null) {
                gradientDrawable.setAlpha((int) ((1.0f - h85Var8.a0) * f7));
                gradientDrawable2.setAlpha((int) ((1.0f - this.E.a0) * f7));
            } else {
                int i5 = (int) f7;
                gradientDrawable.setAlpha(i5);
                gradientDrawable2.setAlpha(i5);
            }
        }
        this.l0.setAlpha(f6);
        fc2 fc2Var = this.j0;
        c7 c7Var = this.m0;
        ImageView imageView = this.w;
        if (fc2Var != null && fc2Var.b.rtmp_stream) {
            c7Var.setAlpha(0.0f);
            c7Var.setVisibility(4);
            imageView.setAlpha(f6);
            imageView.setVisibility(0);
            if (h75.u5) {
                imageView.setTranslationX((1.0f - this.a0) * (-gl.L(72.0f)));
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
        float currentActionBarHeight = ((a.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - gl.L(1.0f);
        k33 k33Var = this.d0;
        float f8 = k33Var.g;
        float A = tb4.A(1.0f, f8, measuredWidth3 - textView.getMeasuredWidth(), (measuredWidth4 - textView2.getMeasuredWidth()) * f8) - gl.L(21.0f);
        if (h75.v5) {
            i2 = gl.L(328.0f);
        } else if (h75.u5) {
            i2 = gl.L(180.0f);
        } else {
            i2 = 0;
        }
        float f9 = A - i2;
        textView.setTranslationX(f9);
        textView2.setTranslationX(f9);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        s71 s71Var = this.g0;
        s71Var.setTranslationX(f9 - gl.L(36.0f));
        s71Var.setTranslationY((a.getCurrentActionBarHeight() - s71Var.getMeasuredHeight()) / 2.0f);
        c7Var.setTranslationX(f9 - gl.L(44.0f));
        textView.setAlpha((1.0f - k33Var.g) * f6);
        textView2.setAlpha(k33Var.g * f6);
        s71Var.setAlpha(f6);
        float f10 = this.P;
        int i6 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        st stVar = this.J;
        if (i6 != 0) {
            float f11 = f10 + 0.07272727f;
            this.P = f11;
            if (f11 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            stVar.invalidate();
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
        if (h75.u5) {
            stVar.setTranslationY(gl.L(16.0f));
        } else {
            stVar.setTranslationY((gl.L(8.0f) * this.a0) + ((1.0f - this.a0) * a.getCurrentActionBarHeight()) + gl.L(8.0f));
        }
        stVar.setAlpha(this.O * this.c);
        stVar.setScaleX((this.O * 0.5f) + 0.5f);
        stVar.setScaleY((this.O * 0.5f) + 0.5f);
        if (h75.v5) {
            this.V = true;
            super.dispatchDraw(canvas);
            this.V = false;
        } else {
            super.dispatchDraw(canvas);
        }
        a55 a55Var = this.H;
        if (a55Var.getVisibility() == 0) {
            for (int i7 = 0; i7 < a55Var.getChildCount(); i7++) {
                m75 m75Var = (m75) a55Var.getChildAt(i7);
                if (m75Var.getVisibility() == 0 && m75Var.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(a55Var.getX() + m75Var.getX(), a55Var.getY() + m75Var.getY());
                    canvas.scale(m75Var.getScaleX(), m75Var.getScaleY(), m75Var.getMeasuredWidth() / 2.0f, m75Var.getMeasuredHeight() / 2.0f);
                    m75Var.c(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = this.U;
        r65 r65Var = this.G;
        if (z) {
            if ((view instanceof h85) && ((h85) view).y0) {
                float y = r65Var.getY() - getTop();
                float measuredHeight = (r65Var.getMeasuredHeight() + y) - r65Var.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof h85) {
                    h85 h85Var = (h85) view;
                    if (h85Var != this.E && h85Var != this.F && !this.V && !h85Var.y0) {
                        if (h85Var.c != null) {
                            float y2 = r65Var.getY() - getTop();
                            float measuredHeight2 = (r65Var.getMeasuredHeight() + y2) - r65Var.getTranslationY();
                            float f = this.c;
                            if (h85Var.d == null) {
                                f = 0.0f;
                            }
                            canvas.save();
                            float f2 = 1.0f - f;
                            canvas.clipRect(0.0f, y2 * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight2 * f2));
                            boolean drawChild2 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild2;
                        } else if (h75.v5) {
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

    public final void e(h85 h85Var) {
        this.I.remove(h85Var);
        long B1 = k27.B1(h85Var.x.a.peer);
        LongSparseIntArray longSparseIntArray = this.x;
        longSparseIntArray.put(B1, longSparseIntArray.get(B1, 0) - 1);
    }

    public final void f() {
        l95 l95Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            l95Var = this;
            ofFloat.addUpdateListener(new xq4(l95Var, this.z0, this.s0, this.t0, (byte) 1));
            l95Var.C0.addListener(new k95(l95Var, (byte) 2));
            l95Var.C0.setDuration(350L);
            l95Var.C0.setInterpolator(s33.f);
            l95Var.C0.start();
            l95Var.h = System.currentTimeMillis();
        } else {
            l95Var = this;
        }
        l95Var.B0 = false;
        l95Var.u0 = false;
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

    public final void h(defpackage.gc2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l95.h(gc2):void");
    }

    public final void i(TLRPC.GroupCallParticipant groupCallParticipant, float f) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i < arrayList.size()) {
                if (k27.B1(((h85) arrayList.get(i)).x.a.peer) == k27.B1(groupCallParticipant.peer)) {
                    ((h85) arrayList.get(i)).setAmplitude(f);
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
        boolean z = h75.v5;
        View view = this.n0;
        if (z) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = gl.L(328.0f);
        } else if (h75.u5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = gl.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        if (h75.u5 && !h75.v5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.o0.setVisibility(i3);
        s71 s71Var = this.g0;
        s71Var.getLayoutParams().height = gl.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i2);
        ViewGroup.LayoutParams layoutParams = s71Var.getLayoutParams();
        int L = gl.L(46.0f);
        if (!this.f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (h75.u5) {
            i4 = gl.L(45.0f);
        } else {
            i4 = 0;
        }
        marginLayoutParams.rightMargin = i4;
        for (int i6 = 0; i6 < 2; i6++) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.L0[i6].getLayoutParams();
            if (this.N0) {
                marginLayoutParams2.rightMargin = gl.L(344.0f);
            } else {
                if (h75.u5) {
                    i5 = gl.L(180.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l95.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(fc2 fc2Var) {
        this.j0 = fc2Var;
    }

    public void setIsTablet(boolean z) {
        int i;
        int i2;
        int i3;
        if (this.N0 != z) {
            this.N0 = z;
            v31 v31Var = this.l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v31Var.getLayoutParams();
            if (z) {
                i = 85;
            } else {
                i = 51;
            }
            layoutParams.gravity = i;
            if (z) {
                i2 = gl.L(328.0f);
            } else {
                i2 = 0;
            }
            layoutParams.rightMargin = i2;
            if (z) {
                i3 = -gl.L(8.0f);
            } else {
                i3 = 0;
            }
            layoutParams.bottomMargin = i3;
            if (this.N0) {
                v31Var.setImageDrawable(getContext().getDrawable(2131232089));
                return;
            }
            ed0 ed0Var = new ed0(false);
            ed0Var.a(-1);
            v31Var.setImageDrawable(ed0Var);
        }
    }

    public void setProgressToHideUi(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidate();
            h85 h85Var = this.E;
            if (h85Var != null) {
                h85Var.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z) {
        hc0 hc0Var;
        boolean z2;
        boolean z3;
        int i;
        long j;
        TLRPC.Chat K0;
        TLRPC.User user;
        int i2 = 0;
        if (this.b && !this.N0 && this.e != null && this.r == null && this.j0 != null) {
            int i3 = this.k0.a;
            long j2 = 500;
            if (System.currentTimeMillis() - this.P0 < 500) {
                if (this.Q0 == null) {
                    iu4 iu4Var = new iu4(this, (byte) 18);
                    this.Q0 = iu4Var;
                    gl.d3(iu4Var, (System.currentTimeMillis() - this.P0) + 50);
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
                hc0Var = this.K;
                if (i4 >= m) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i4));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j = j2;
                    if (k27.B1(this.e.a.peer) == k27.B1(groupCallParticipant.peer)) {
                        i = i4;
                    } else {
                        long B1 = k27.B1(groupCallParticipant.peer);
                        i = i4;
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i5 == 0) {
                                this.N = k27.B1(groupCallParticipant.peer);
                            }
                            if (i5 < 3) {
                                if (B1 > 0) {
                                    user = na7.q1(i3).V1(Long.valueOf(B1));
                                    K0 = null;
                                } else {
                                    K0 = na7.q1(i3).K0(Long.valueOf(B1));
                                    user = null;
                                }
                                if (user != null || K0 != null) {
                                    hc0Var.b(i5, i3, groupCallParticipant);
                                    if (i5 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(l7c.k(user, true), new z3c(gl.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(K0.title, new z3c(gl.o()), 0);
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
                    st stVar = this.J;
                    this.Q = stVar.getLeft();
                    this.S = stVar.getRight();
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
            String J0 = k96.J0(i5, "MembersAreSpeakingToast");
            int indexOf = J0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            textView.setText(spannableStringBuilder2);
            if (i5 != 0) {
                if (i5 == 1) {
                    i2 = gl.L(40.0f);
                } else if (i5 == 2) {
                    i2 = gl.L(64.0f);
                } else {
                    i2 = gl.L(88.0f);
                }
            }
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i2;
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = gl.L(16.0f);
            this.M = z2;
            invalidate();
            while (i5 < 3) {
                hc0Var.b(i5, i3, null);
                i5++;
            }
            hc0Var.a(z3);
        } else if (this.M) {
            this.M = false;
            this.O = 0.0f;
        }
    }
}
