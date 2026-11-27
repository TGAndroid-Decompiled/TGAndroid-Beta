package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public class skb extends FrameLayout implements snb {
    public static final int W = 0;
    public boolean E;
    public final vnb F;
    public boolean G;
    public byte H;
    public boolean I;
    public float J;
    public float K;
    public ul L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public PorterDuffColorFilter Q;
    public CharSequence R;
    public boolean S;
    public Paint T;
    public boolean U;
    public int V;
    public final ema a;
    public final ema b;
    public final in c;
    public final ema d;
    public final e29 e;
    public Switch f;
    public final ImageView h;
    public byte n;
    public boolean r;
    public int s;
    public byte w;
    public int x;
    public boolean y;

    public skb(int i, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        this.s = 71;
        this.w = (byte) 50;
        this.x = 21;
        this.F = vnbVar;
        this.n = i;
        ema emaVar = new ema(context);
        this.a = emaVar;
        if (z) {
            i2 = aob.j5;
        } else {
            i2 = aob.G6;
        }
        yob.W(emaVar, i2, vnbVar);
        emaVar.setTextSize(16);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        emaVar.setGravity(i3);
        emaVar.setImportantForAccessibility(2);
        addView(emaVar, tre.c(-1.0f, -2));
        ema emaVar2 = new ema(context);
        this.b = emaVar2;
        if (z) {
            i4 = aob.p5;
        } else {
            i4 = aob.y6;
        }
        yob.W(emaVar2, i4, vnbVar);
        emaVar2.setTextSize(13);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        emaVar2.setGravity(i5);
        emaVar2.setImportantForAccessibility(2);
        addView(emaVar2, tre.c(-1.0f, -2));
        in inVar = new in(context, false, true, true);
        this.c = inVar;
        if (z) {
            i6 = aob.n5;
        } else {
            i6 = aob.I6;
        }
        yob.U(inVar, i6, vnbVar);
        inVar.setPadding(0, hl.L(18.0f), 0, hl.L(18.0f));
        inVar.setTextSize(hl.L(16.0f));
        if (ob6.a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        inVar.setGravity(i7);
        inVar.setImportantForAccessibility(2);
        inVar.setTranslationY(hl.L(-2.0f));
        addView(inVar);
        ema emaVar3 = new ema(context);
        this.d = emaVar3;
        Boolean bool = Boolean.FALSE;
        if (!emaVar3.Q) {
            emaVar3.o0 = true;
            emaVar3.q0 = bool;
            emaVar3.m();
            emaVar3.b();
        }
        emaVar3.r0 = 18;
        emaVar3.m();
        if (z) {
            i8 = aob.n5;
        } else {
            i8 = aob.I6;
        }
        yob.W(emaVar3, i8, vnbVar);
        if (ob6.a0) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        emaVar3.setGravity(i9);
        emaVar3.setTextSize(16);
        emaVar3.setImportantForAccessibility(2);
        emaVar3.setVisibility(8);
        addView(emaVar3);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (z) {
            i10 = aob.J5;
        } else {
            i10 = aob.m6;
        }
        yob.s(imageView, i10, vnbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z2) {
            Switch r3 = new Switch(context, vnbVar);
            this.f = r3;
            int i11 = aob.M6;
            int i12 = aob.N6;
            int i13 = aob.d6;
            r3.d(i11, i12, i13, i13);
            addView(this.f, tre.d(37, 20.0f, (ob6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public static SpannableStringBuilder b(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        lf4 lf4Var = new lf4();
        lf4Var.f = aob.w0(null, aob.Ck, false);
        lf4Var.n = false;
        spannableStringBuilder.setSpan(lf4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        int i;
        ema emaVar = this.a;
        if (emaVar.getTag() instanceof Integer) {
            i = ((Integer) emaVar.getTag()).intValue();
        } else {
            i = aob.G6;
        }
        vnb vnbVar = this.F;
        int v0 = aob.v0(i, vnbVar);
        if (i != aob.j5 && i != aob.G6) {
            v0 = e(v0);
        }
        if (this.N) {
            emaVar.setTextColor(v0);
        }
        if (this.O) {
            e29 e29Var = this.e;
            if (e29Var.getTag() instanceof Integer) {
                int intValue = ((Integer) e29Var.getTag()).intValue();
                int v02 = aob.v0(intValue, vnbVar);
                if (intValue != aob.J5 && intValue != aob.m6) {
                    v02 = e(v02);
                }
                if (v02 != this.P || e29Var.getColorFilter() != this.Q) {
                    this.P = v02;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN);
                    this.Q = porterDuffColorFilter;
                    e29Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(aob.v0(aob.y6, vnbVar)));
        int i2 = aob.I6;
        this.c.setTextColor(e(aob.v0(i2, vnbVar)));
        this.d.setTextColor(e(aob.v0(i2, vnbVar)));
    }

    public final int c(boolean z) {
        if (this.S) {
            if (z) {
                return 52;
            }
            return 58;
        } else if (z) {
            return 65;
        } else {
            return 71;
        }
    }

    public final boolean d() {
        Switch r0 = this.f;
        if (r0 != null && r0.h) {
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f;
        float e;
        float f2;
        float e2;
        float f3 = 1.0f;
        if (this.I || this.K != 0.0f) {
            if (this.T == null) {
                Paint paint = new Paint(1);
                this.T = paint;
                paint.setColor(aob.v0(aob.O5, this.F));
            }
            boolean z = this.U;
            float f4 = this.J;
            if (z) {
                f = f4 + 0.016f;
                this.J = f;
                if (f > 1.0f) {
                    this.J = 1.0f;
                    this.U = false;
                    f = 1.0f;
                }
            } else {
                f = f4 - 0.016f;
                this.J = f;
                if (f < 0.0f) {
                    this.J = 0.0f;
                    this.U = true;
                    f = 0.0f;
                }
            }
            int i = this.V;
            if (i > 0) {
                this.V = i - 15;
            } else {
                boolean z2 = this.I;
                float f5 = this.K;
                if (z2) {
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.10666667f;
                        this.K = f6;
                        if (f6 > 1.0f) {
                            this.K = 1.0f;
                        }
                    }
                } else if (f5 != 0.0f) {
                    float f7 = f5 - 0.10666667f;
                    this.K = f7;
                    if (f7 < 0.0f) {
                        this.K = 0.0f;
                    }
                }
            }
            this.T.setAlpha((int) (((f * 0.4f) + 0.6f) * this.K * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = hl.P;
            rectF.set((getMeasuredWidth() - hl.L(21.0f)) - hl.L(this.H), measuredHeight - hl.L(3.0f), getMeasuredWidth() - hl.L(21.0f), hl.L(3.0f) + measuredHeight);
            if (ob6.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), this.T);
            invalidate();
        }
        float f8 = 1.0f - this.K;
        ul ulVar = this.L;
        if (ulVar == null) {
            e = 1.0f;
        } else {
            e = 1.0f - ulVar.e();
        }
        float f9 = f8 * e;
        if (isEnabled()) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        this.c.setAlpha(f9 * f2);
        float f10 = 1.0f - this.K;
        ul ulVar2 = this.L;
        if (ulVar2 == null) {
            e2 = 1.0f;
        } else {
            e2 = 1.0f - ulVar2.e();
        }
        float f11 = f10 * e2;
        if (!isEnabled()) {
            f3 = 0.5f;
        }
        this.d.setAlpha(f11 * f3);
        super.dispatchDraw(canvas);
        ul ulVar3 = this.L;
        if (ulVar3 != null) {
            ulVar3.setBounds((getWidth() - this.L.s) - hl.L(18.0f), (getHeight() - this.L.s) / 2, getWidth() - hl.L(18.0f), (getHeight() + this.L.s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i, int i2, int i3) {
        float f;
        boolean o;
        this.s = c(true);
        e29 e29Var = this.e;
        e29Var.setVisibility(0);
        e29Var.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        if (ob6.a0) {
            f = 0.0f;
        } else {
            f = -3.0f;
        }
        e29Var.setTranslationX(hl.L(f));
        e29Var.setImageResource(i3);
        this.O = false;
        e29Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        vnb vnbVar = this.F;
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        n57 n57Var = new n57((byte) 1);
        n57Var.b(i, i2);
        n57Var.b = o;
        e29Var.setBackground(n57Var);
    }

    public final void g(int i, int i2) {
        vnb vnbVar = this.F;
        int v0 = aob.v0(i2, vnbVar);
        ema emaVar = this.a;
        emaVar.setTextColor(v0);
        emaVar.setTag(Integer.valueOf(i2));
        this.N = true;
        if (i >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(aob.v0(i, vnbVar), PorterDuff.Mode.SRC_IN);
            e29 e29Var = this.e;
            e29Var.setColorFilter(porterDuffColorFilter);
            e29Var.setTag(Integer.valueOf(i));
            this.O = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f;
    }

    public int getDefaultImageLeft() {
        if (this.S) {
            return 16;
        }
        return 21;
    }

    public e29 getImageView() {
        return this.e;
    }

    public ema getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public in getValueTextView() {
        return this.c;
    }

    public final void h(int i, boolean z, boolean z2) {
        float f;
        this.I = z;
        this.H = i;
        if (!z2) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.K = f;
        }
        invalidate();
    }

    public final void i(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        super.setEnabled(z);
        Switch r5 = this.f;
        if (r5 != null) {
            r5.setEnabled(z);
        }
        ViewPropertyAnimator animate = this.a.animate();
        float f4 = 0.5f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        animate.alpha(f).start();
        ViewPropertyAnimator animate2 = this.b.animate();
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        animate2.alpha(f2).start();
        ViewPropertyAnimator animate3 = this.c.animate();
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.5f;
        }
        animate3.alpha(f3).start();
        ViewPropertyAnimator animate4 = this.d.animate();
        if (z) {
            f4 = 1.0f;
        }
        animate4.alpha(f4).start();
    }

    public final void j(int i) {
        ema emaVar = this.a;
        if (i <= 0) {
            emaVar.i(null);
            return;
        }
        emaVar.i(new hc(i, this.F, getContext(), false));
        emaVar.setDrawablePadding(hl.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z) {
        this.x = getDefaultImageLeft();
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = null;
        in inVar = this.c;
        inVar.c(null, false, true);
        this.e.setVisibility(8);
        inVar.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z;
        setWillNotDraw(!z);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z2;
        Switch r6 = this.f;
        if (r6 != null) {
            r6.setVisibility(0);
            this.f.c(z, false);
        }
        setWillNotDraw(!this.r);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void m(String str, boolean z, int i, int i2, boolean z2) {
        int i3;
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(str, false);
        emaVar.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i2, i2, i);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f = r11;
            int i4 = aob.M6;
            int i5 = aob.N6;
            int i6 = aob.d6;
            r11.d(i4, i5, i6, i6);
            Switch r112 = this.f;
            if (ob6.a0) {
                i3 = 3;
            } else {
                i3 = 5;
            }
            addView(r112, tre.d(37, 20.0f, i3 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r113 = this.f;
        if (r113 != null) {
            r113.setVisibility(0);
            this.f.c(z, false);
        }
        this.r = z2;
        setWillNotDraw(!z2);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void n(int i, String str, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(str, false);
        emaVar.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r1 = this.f;
        if (r1 != null) {
            r1.setVisibility(0);
            this.f.c(z, false);
        }
        e29 e29Var = this.e;
        e29Var.setVisibility(0);
        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
        e29Var.setImageResource(i);
        this.r = false;
        setWillNotDraw(true);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void o(int i, CharSequence charSequence, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = null;
        in inVar = this.c;
        inVar.c(null, false, true);
        e29 e29Var = this.e;
        e29Var.setImageResource(i);
        e29Var.setVisibility(0);
        inVar.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        float f;
        if (this.r) {
            vnb vnbVar = this.F;
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = aob.j0;
            }
            Paint paint2 = paint;
            if (this.e.getVisibility() == 0) {
                if (this.y) {
                    i = 72;
                } else {
                    i = this.s;
                }
            } else {
                i = this.n;
            }
            int L = hl.L(i);
            if (ob6.a0) {
                f = 0.0f;
            } else {
                f = L;
            }
            float f2 = f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!ob6.a0) {
                L = 0;
            }
            canvas.drawLine(f2, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ema emaVar = this.a;
        CharSequence text = emaVar.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        in inVar = this.c;
        if (!isEmpty) {
            CharSequence text2 = inVar.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb = new StringBuilder();
            sb.append(emaVar.getText());
            if (!TextUtils.isEmpty(inVar.getText())) {
                sb.append('\n');
                sb.append(inVar.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredWidth2;
        int i5;
        int L;
        int measuredWidth3;
        int measuredWidth4;
        float f;
        int measuredWidth5;
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i3 - i;
        ema emaVar = this.d;
        int textHeight = emaVar.getTextHeight();
        in inVar = this.c;
        int max = ((i8 - Math.max(textHeight, inVar.getTextHeight())) / 2) + 1;
        if (ob6.a0) {
            measuredWidth = hl.L(this.n - 6);
        } else {
            measuredWidth = (i9 - inVar.getMeasuredWidth()) - hl.L(this.n - 6);
        }
        if (this.E && !ob6.a0) {
            measuredWidth = (i9 - inVar.getMeasuredWidth()) - hl.L(this.n);
        }
        inVar.layout(measuredWidth, max, inVar.getMeasuredWidth() + measuredWidth, inVar.getMeasuredHeight() + max);
        if (ob6.a0) {
            measuredWidth2 = hl.L(this.n - 6);
        } else {
            measuredWidth2 = (i9 - emaVar.getMeasuredWidth()) - hl.L(this.n - 6);
        }
        emaVar.layout(measuredWidth2, max, emaVar.getMeasuredWidth() + measuredWidth2, emaVar.getMeasuredHeight() + max);
        boolean z2 = ob6.a0;
        e29 e29Var = this.e;
        ema emaVar2 = this.a;
        if (z2) {
            int measuredWidth6 = getMeasuredWidth() - emaVar2.getMeasuredWidth();
            if (e29Var.getVisibility() == 0) {
                i7 = this.s;
            } else {
                i7 = this.n;
            }
            L = measuredWidth6 - hl.L(i7);
        } else {
            if (e29Var.getVisibility() == 0) {
                i5 = this.s;
            } else {
                i5 = this.n;
            }
            L = hl.L(i5);
        }
        ema emaVar3 = this.b;
        if (emaVar3.getVisibility() == 0) {
            if (this.w > 50) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            float f2 = i6;
            int L2 = hl.L(1.0f) + ik8.D(f2, (i8 - emaVar2.getTextHeight()) - emaVar3.getTextHeight(), 2);
            emaVar2.layout(L, L2, emaVar2.getMeasuredWidth() + L, emaVar2.getMeasuredHeight() + L2);
            int L3 = hl.L(f2) + emaVar2.getTextHeight() + L2;
            emaVar3.layout(L, L3, emaVar3.getMeasuredWidth() + L, emaVar3.getMeasuredHeight() + L3);
        } else {
            int L4 = hl.L(1.0f) + ((i8 - emaVar2.getTextHeight()) / 2);
            emaVar2.layout(L, L4, emaVar2.getMeasuredWidth() + L, emaVar2.getMeasuredHeight() + L4);
        }
        if (e29Var.getVisibility() == 0) {
            if (this.w > 50) {
                f = 0.0f;
            } else {
                f = 2.0f;
            }
            int L5 = hl.L(1.0f) + ((((i8 - e29Var.getMeasuredHeight()) / 2) + hl.L(f)) - e29Var.getPaddingTop());
            if (!ob6.a0) {
                measuredWidth5 = hl.L(this.x);
            } else {
                measuredWidth5 = (i9 - e29Var.getMeasuredWidth()) - hl.L(this.x);
            }
            e29Var.layout(measuredWidth5, L5, e29Var.getMeasuredWidth() + measuredWidth5, e29Var.getMeasuredHeight() + L5);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L6 = hl.L(1.0f) + ((i8 - imageView.getMeasuredHeight()) / 2);
            if (ob6.a0) {
                measuredWidth4 = hl.L(23.0f);
            } else {
                measuredWidth4 = (i9 - imageView.getMeasuredWidth()) - hl.L(23.0f);
            }
            imageView.layout(measuredWidth4, L6, imageView.getMeasuredWidth() + measuredWidth4, imageView.getMeasuredHeight() + L6);
        }
        Switch r9 = this.f;
        if (r9 != null && r9.getVisibility() == 0) {
            int measuredHeight = (i8 - this.f.getMeasuredHeight()) / 2;
            if (ob6.a0) {
                measuredWidth3 = hl.L(22.0f);
            } else {
                measuredWidth3 = (i9 - this.f.getMeasuredWidth()) - hl.L(22.0f);
            }
            Switch r10 = this.f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(this.w);
        int i7 = this.M;
        in inVar = this.c;
        if (i7 != 0 && i7 != size && (charSequence = this.R) != null) {
            inVar.c(TextUtils.ellipsize(charSequence, inVar.getPaint(), hl.q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z = this.E;
        byte b = this.n;
        ema emaVar = this.b;
        ema emaVar2 = this.d;
        ema emaVar3 = this.a;
        if (z) {
            emaVar3.measure(ik8.f(b + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
            emaVar.measure(ik8.f(this.n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
            int L2 = (size - hl.L(this.n + 103)) - emaVar3.getTextWidth();
            if (ob6.a0) {
                i5 = Integer.MIN_VALUE;
            } else {
                i5 = 1073741824;
            }
            inVar.measure(View.MeasureSpec.makeMeasureSpec(L2, i5), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
            int L3 = (size - hl.L(this.n + 103)) - emaVar3.getTextWidth();
            if (ob6.a0) {
                i6 = Integer.MIN_VALUE;
            } else {
                i6 = 1073741824;
            }
            emaVar2.measure(View.MeasureSpec.makeMeasureSpec(L3, i6), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        } else {
            int L4 = size - hl.L(b);
            if (ob6.a0) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = 1073741824;
            }
            inVar.measure(View.MeasureSpec.makeMeasureSpec(L4, i3), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
            int L5 = size - hl.L(this.n);
            if (ob6.a0) {
                i4 = Integer.MIN_VALUE;
            } else {
                i4 = 1073741824;
            }
            emaVar2.measure(View.MeasureSpec.makeMeasureSpec(L5, i4), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
            int max = Math.max(inVar.d(), emaVar2.getTextWidth());
            emaVar3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - hl.L(this.n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
            emaVar.measure(View.MeasureSpec.makeMeasureSpec((size - hl.L(this.n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        }
        e29 e29Var = this.e;
        if (e29Var.getVisibility() == 0) {
            e29Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        Switch r0 = this.f;
        if (r0 != null) {
            r0.measure(View.MeasureSpec.makeMeasureSpec(hl.L(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, L + (this.r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z) {
        this.s = c(false);
        this.x = 18;
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = null;
        in inVar = this.c;
        inVar.c(null, false, true);
        e29 e29Var = this.e;
        e29Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof b29) {
            e29Var.setAnimation((b29) drawable);
        } else {
            e29Var.setImageDrawable(drawable);
        }
        e29Var.setVisibility(0);
        inVar.setVisibility(8);
        this.h.setVisibility(8);
        e29Var.setPadding(0, hl.L(6.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        CharSequence ellipsize;
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = charSequence2;
        in inVar = this.c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, inVar.getPaint(), hl.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        inVar.c(ellipsize, z, true);
        inVar.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z, int i, int i2, int i3, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(str, false);
        emaVar.i(null);
        this.R = str2;
        in inVar = this.c;
        inVar.c(TextUtils.ellipsize(str2, inVar.getPaint(), hl.q.x / 2.5f, TextUtils.TruncateAt.END), z, true);
        inVar.setVisibility(0);
        this.d.setVisibility(8);
        f(i2, i3, i);
        this.h.setVisibility(8);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        u(charSequence, charSequence2, false, i, z);
    }

    public void setChecked(boolean z) {
        this.f.c(z, true);
    }

    public void setCompactLayout(boolean z) {
        this.S = z;
    }

    @Override
    public void setEnabled(boolean z) {
        i(z, true);
    }

    public void setImageLeft(int i) {
        this.x = i;
    }

    public void setNeedDivider(boolean z) {
        if (this.r != z) {
            this.r = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i) {
        this.s = i;
    }

    public void setPrioritizeTitleOverValue(boolean z) {
        if (this.E != z) {
            this.E = z;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ema emaVar = this.b;
        if (!isEmpty) {
            emaVar.setVisibility(0);
            emaVar.l(charSequence, false);
            return;
        }
        emaVar.setVisibility(8);
    }

    public void setTextColor(int i) {
        this.N = false;
        this.a.setTextColor(i);
    }

    public void setValueSticker(String str) {
        if (this.L == null) {
            ul ulVar = new ul(hl.L(30.0f), this);
            this.L = ulVar;
            if (this.G) {
                ulVar.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.I();
        }
        addOnAttachStateChangeListener(new fh8(imageReceiver, (byte) 1));
        imageReceiver.e0(str, "30_30", null, null, 0L);
        this.L.g(new g6(imageReceiver, (byte) 7), true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z) {
        this.s = c(false);
        this.x = 18;
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = charSequence2;
        in inVar = this.c;
        inVar.c(charSequence2, false, true);
        e29 e29Var = this.e;
        e29Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof b29) {
            e29Var.setAnimation((b29) drawable);
        } else {
            e29Var.setImageDrawable(drawable);
        }
        e29Var.setVisibility(0);
        inVar.setVisibility(0);
        this.h.setVisibility(8);
        e29Var.setPadding(0, hl.L(6.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        e29 e29Var = this.e;
        e29Var.setVisibility(0);
        in inVar = this.c;
        if (charSequence2 != null) {
            float h = kg5.h(charSequence, emaVar.getTextPaint());
            this.R = charSequence2;
            inVar.c(TextUtils.ellipsize(charSequence2, inVar.getPaint(), (int) Math.max(1.0f, hl.q.x - ((h + hl.L(this.s)) + hl.L(16.0f))), TextUtils.TruncateAt.END), z, true);
        } else {
            inVar.c("", z, true);
        }
        inVar.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        e29Var.setTranslationX(0.0f);
        e29Var.setTranslationY(0.0f);
        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
        e29Var.setImageResource(i);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r9 = this.f;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    @Override
    public final void updateColors() {
        vnb vnbVar = this.F;
        if (!this.N && !this.O) {
            try {
                int v0 = aob.v0(aob.y6, vnbVar);
                int v02 = aob.v0(aob.I6, vnbVar);
                int e = e(v0);
                int e2 = e(v02);
                if (e == v0 && e2 == v02) {
                    return;
                }
                this.b.setTextColor(e);
                this.c.setTextColor(e2);
                this.d.setTextColor(e2);
                return;
            } catch (Exception e3) {
                cc4.g(e3, true);
                return;
            }
        }
        try {
            a();
        } catch (Exception e4) {
            cc4.g(e4, true);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = null;
        in inVar = this.c;
        inVar.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        inVar.setVisibility(8);
        this.d.setVisibility(8);
        e29 e29Var = this.e;
        e29Var.setVisibility(8);
        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z) {
        CharSequence ellipsize;
        in inVar = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, inVar.getPaint(), hl.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        inVar.c(ellipsize, z, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i) {
        return i;
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.L == null) {
            ul ulVar = new ul(hl.L(30.0f), this);
            this.L = ulVar;
            if (this.G) {
                ulVar.a();
            }
        }
        this.L.h(document, 1, true);
        invalidate();
    }

    public skb(Context context, vnb vnbVar) {
        this(20, vnbVar, context, false, false);
    }

    public skb(int i, Context context, boolean z) {
        this(i, null, context, z, false);
    }

    public skb(Context context) {
        this(20, null, context, false, false);
    }
}
