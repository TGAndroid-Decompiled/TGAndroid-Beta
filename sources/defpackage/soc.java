package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.Wallet.c;
public class soc extends FrameLayout implements jm7 {
    public static Typeface k0;
    public static Typeface l0;
    public final moc E;
    public final FrameLayout F;
    public View.OnClickListener G;
    public final ey0 H;
    public final xd9 I;
    public final Paint J;
    public float K;
    public final ln L;
    public final View M;
    public final LinearLayout N;
    public final poc O;
    public final poc P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final byte T;
    public float U;
    public float V;
    public int W;
    public boolean a;
    public c a0;
    public float b;
    public float[] b0;
    public final Matrix c;
    public int c0;
    public final Matrix d;
    public int d0;
    public final Matrix e;
    public float e0;
    public final RectF f;
    public float f0;
    public final ln g0;
    public float h;
    public final ln h0;
    public bpc i0;
    public boolean j0;
    public boolean n;
    public float r;
    public float s;
    public final Matrix w;
    public final Matrix x;
    public final Matrix y;

    public soc(Context context, int i, int i2) {
        super(context);
        this.b = 1.0f;
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new RectF();
        this.s = 1.0f;
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new Matrix();
        this.J = new Paint(193);
        Runnable runnable = new Runnable(this) {
            public final soc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                soc socVar = this.b;
                switch (b) {
                    case 0:
                        socVar.I.invalidate();
                        return;
                    case 1:
                        socVar.O.invalidate();
                        socVar.P.invalidate();
                        return;
                    default:
                        socVar.H.invalidate();
                        return;
                }
            }
        };
        d53 d53Var = d53.h;
        this.L = new ln(runnable, 240L, d53Var, 0);
        this.W = z8c.t0;
        this.g0 = new ln(new Runnable(this) {
            public final soc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                soc socVar = this.b;
                switch (b) {
                    case 0:
                        socVar.I.invalidate();
                        return;
                    case 1:
                        socVar.O.invalidate();
                        socVar.P.invalidate();
                        return;
                    default:
                        socVar.H.invalidate();
                        return;
                }
            }
        }, 240L, d53Var, 0);
        this.h0 = new ln(new Runnable(this) {
            public final soc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                soc socVar = this.b;
                switch (b) {
                    case 0:
                        socVar.I.invalidate();
                        return;
                    case 1:
                        socVar.O.invalidate();
                        socVar.P.invalidate();
                        return;
                    default:
                        socVar.H.invalidate();
                        return;
                }
            }
        }, 240L, d53Var, 0);
        this.S = i;
        this.T = i2;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        moc mocVar = new moc(getContext(), this.S, i2);
        this.E = mocVar;
        this.F = mocVar.getFrontFace();
        float[] fArr = this.b0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.E.setOnClickListener(this.G);
        addView(this.E, 0, qoe.c(-2.0f, -1));
        ey0 ey0Var = new ey0((byte) 9, context, this);
        this.H = ey0Var;
        Typeface typeface = l0;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                fl.e();
                typeface = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
                l0 = typeface;
            } else {
                typeface = gm.n1("fonts/rmono.ttf");
                l0 = typeface;
            }
        }
        ey0Var.setTypeface(typeface);
        ey0Var.setTextColor(-1);
        ey0Var.setTextSize(1, 13.0f);
        ey0Var.setEllipsize(TextUtils.TruncateAt.END);
        ey0Var.setMaxLines(1);
        ey0Var.setSingleLine();
        this.F.addView(ey0Var, qoe.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        xd9 xd9Var = new xd9((byte) 16, context, this);
        this.I = xd9Var;
        this.F.addView(xd9Var, qoe.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.F.addView(view, qoe.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.F.addView(linearLayout, d);
        poc pocVar = new poc(this, context, (byte) 0);
        this.O = pocVar;
        pocVar.getDrawable().N = gm.L(4096.0f);
        pocVar.c.m(0.35f, 320L, 3.5f, d53Var);
        pocVar.setScaleProperty(0.6f);
        pocVar.setTypeface(gm.n1("fonts/gram.ttf"));
        pocVar.setTextSize(gm.L(23.0f));
        pocVar.setTextColor(-1);
        pocVar.setIgnoreRTL(true);
        linearLayout.addView(pocVar, qoe.o(-1, 28));
        poc pocVar2 = new poc(this, context, (byte) 1);
        this.P = pocVar2;
        pocVar2.c.m(0.35f, 320L, 3.5f, d53Var);
        pocVar2.setScaleProperty(0.6f);
        pocVar2.setTypeface(gm.n1("fonts/gram.ttf"));
        pocVar2.setTextSize(gm.L(14.0f));
        pocVar2.setTextColor(-7868417);
        pocVar2.setLayoutDirection(0);
        pocVar2.setTextDirection(3);
        pocVar2.setGravity(19);
        pocVar2.setIgnoreRTL(true);
        linearLayout.addView(pocVar2, qoe.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder((str.length() / 4) + str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(' ');
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static SpannableStringBuilder e(long j) {
        return c.u(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(c.t(j, false))), 0.8f);
    }

    public static String f(String str) {
        char c;
        String[] split = str.split(" ");
        if (split.length < 2) {
            return str;
        }
        int length = split.length / 2;
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                if (i == length) {
                    c = '\n';
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            sb.append(split[i]);
        }
        return sb.toString();
    }

    public static void k(View view, Matrix matrix) {
        if (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            k(view2, matrix);
            matrix.preTranslate(view.getLeft() - view2.getScrollX(), view.getTop() - view2.getScrollY());
            matrix.preConcat(view.getMatrix());
            return;
        }
        matrix.reset();
    }

    public final float a() {
        float c = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.F.getWidth()) / 336.0f) - this.Q.leftMargin) - gm.L(8.0f));
        if (c <= 0.0f) {
            return 1.0f;
        }
        return Math.min(1.0f, max / c);
    }

    public final void b(final Canvas canvas, float f) {
        float f2;
        float height = getFrontFace().getHeight();
        float width = getFrontFace().getWidth() / 1640.0f;
        Context context = getContext();
        Typeface typeface = k0;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                fl.e();
                typeface = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
                k0 = typeface;
            } else {
                typeface = gm.n1("fonts/rmono.ttf");
                k0 = typeface;
            }
        }
        Paint paint = this.J;
        paint.setTypeface(typeface);
        paint.setTextSize(47.345238f * width);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = this.b0;
        int b = bqc.b(0, fArr);
        int b2 = bqc.b(1, fArr);
        if (fArr != null && fArr.length >= 18) {
            f2 = fArr[8];
        } else {
            f2 = 0.0f;
        }
        paint.setColor(on2.f(f2, b, b2));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f3 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f4 = width * 27.333332f;
        final String[] split = f(this.R).split("\\n");
        canvas.save();
        canvas.translate(width * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        c(f, new lcc(this, (byte) 5), new Runnable() {
            @Override
            public final void run() {
                soc socVar = soc.this;
                socVar.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f5 = f4;
                float f6 = f3;
                Paint paint2 = socVar.J;
                Canvas canvas2 = canvas;
                canvas2.drawText(str, 0.0f, (-f5) + f6, paint2);
                if (strArr.length > 1) {
                    canvas2.drawText(strArr[1], 0.0f, f5 + f6, paint2);
                }
            }
        });
        canvas.restore();
    }

    public final void c(float f, roc rocVar, Runnable runnable) {
        float f2;
        if (f > 0.0f) {
            f2 = gm.L(5.0f);
        } else {
            f2 = 0.0f;
        }
        rocVar.a(f2, gm.L(1.0f), Color.argb((int) (89.0f * f), 0, 0, 0));
        runnable.run();
        if (f <= 0.0f) {
            return;
        }
        rocVar.a(gm.N(1.5f), 0.0f, Color.argb((int) (f * 140.0f), 0, 0, 0));
        this.j0 = true;
        runnable.run();
        this.j0 = false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.e4) {
            Object obj = objArr[0];
            c cVar = this.a0;
            if (obj == cVar) {
                l(cVar);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (isAttachedToWindow() && view.isAttachedToWindow() && getRootView() == view.getRootView()) {
            FrameLayout frameLayout = this.F;
            View view2 = (View) frameLayout.getParent();
            moc mocVar = this.E;
            Matrix matrix2 = this.w;
            matrix2.set((Matrix) mocVar.e.d);
            bdb bdbVar = mocVar.f;
            matrix2.preTranslate(bdbVar.getLeft(), bdbVar.getTop());
            k((View) view2.getParent(), matrix);
            matrix.preConcat(matrix2);
            matrix.preTranslate(frameLayout.getLeft() - view2.getScrollX(), frameLayout.getTop() - view2.getScrollY());
            matrix.preConcat(frameLayout.getMatrix());
            Matrix matrix3 = this.x;
            k(view, matrix3);
            Matrix matrix4 = this.y;
            if (matrix3.invert(matrix4)) {
                matrix.postConcat(matrix4);
                return true;
            }
            return false;
        }
        return false;
    }

    public View getBalanceAnchor() {
        return this.M;
    }

    public LinearLayout getBalanceLayout() {
        return this.N;
    }

    public io getBalanceView() {
        return this.O;
    }

    public TextView getCardHolderView() {
        return this.H;
    }

    public float getCardRotationX() {
        return this.E.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.E.getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.F;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.F.indexOfChild(this.H);
        int indexOfChild2 = this.F.indexOfChild(this.N);
        if (indexOfChild < 0) {
            if (indexOfChild2 < 0) {
                return this.F.getChildCount();
            }
            return indexOfChild2;
        } else if (indexOfChild2 < 0) {
            return indexOfChild;
        } else {
            return Math.min(indexOfChild, indexOfChild2);
        }
    }

    public ArrayList<RectF> getStickerObstacles() {
        poc pocVar;
        RectF rectF;
        ArrayList<RectF> arrayList = new ArrayList<>();
        FrameLayout frameLayout = this.F;
        float width = frameLayout.getWidth() / 336.0f;
        float a = a();
        poc pocVar2 = this.O;
        float c = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f = layoutParams.leftMargin;
        float f2 = layoutParams.topMargin;
        float bottom = ((pocVar2.getBottom() + pocVar2.getTop()) / 2.0f) + f2;
        float height = (pocVar2.getHeight() * a) / 2.0f;
        arrayList.add(new RectF(f, bottom - height, (pocVar2.getDrawable().c() * a) + f, bottom + height));
        ey0 ey0Var = this.H;
        arrayList.add(new RectF(ey0Var.getLeft(), ey0Var.getTop(), ey0Var.getLeft() + Math.min(ey0Var.getWidth(), ey0Var.getPaint().measureText(ey0Var.getText().toString())), ey0Var.getBottom()));
        arrayList.add(new RectF(frameLayout.getWidth() - (34.0f * width), 18.0f * width, frameLayout.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, frameLayout.getWidth(), frameLayout.getHeight());
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        arrayList.add(rectF2);
        arrayList.add(new RectF(f, pocVar.getTop() + f2, c + f, f2 + pocVar.getBottom()));
        if (this.a) {
            rectF = new RectF(this.f);
        } else {
            rectF = new RectF();
        }
        arrayList.add(rectF);
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.b0;
    }

    public io getUsdBalanceView() {
        return this.P;
    }

    public final void h(Path path, float f, float f2) {
        path.rewind();
        float f3 = 336 - this.T;
        path.addRoundRect(((f3 - 48.0f) * f) / 336.0f, 0.36097562f * f2, (f3 * f) / 336.0f, 0.5365854f * f2, (f * 8.0f) / 336.0f, 0.03902439f * f2, Path.Direction.CW);
    }

    public final void i(float f, float f2) {
        if (this.U == f && this.V == f2) {
            return;
        }
        this.U = f;
        if (f == 0.0f) {
            this.n = false;
        }
        this.V = f2;
        this.O.invalidate();
        this.P.invalidate();
    }

    public final void j(int i, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        boolean z = false;
        spannableString.setSpan(new qoc(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) jb6.M0(2131749290, null));
        spannableStringBuilder.setSpan(new yl(this, (byte) 4), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round((j / 1.0E9d) * oc7.r1(i).l4.k.i * 100.0d);
        poc pocVar = this.P;
        cj0.h();
        if (round % 100 == 0) {
            z = true;
        }
        pocVar.setText(cj0.f("USD", 2, round, z));
    }

    public final void l(c cVar) {
        if (cVar != null) {
            int i = cVar.a;
            setCardHolder(m9c.r(z8c.h(i).f()).toUpperCase());
            if (cVar.x() != null) {
                setCardNumber(d(cVar.x().toUpperCase()));
            }
            if (cVar.M()) {
                j(i, cVar.z());
            }
        }
    }

    public final void m() {
        float f;
        int i;
        double d;
        int f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (this.i0 != null) {
            float[] fArr = this.b0;
            char c = '\t';
            int i2 = 2;
            char c2 = 1;
            float f7 = 0.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = bqc.c;
            float[] fArr3 = new float[42];
            int i3 = 0;
            while (true) {
                char c3 = c;
                if (i3 >= i2) {
                    break;
                }
                int i4 = i3 << 2;
                int i5 = i4 + 10;
                char c4 = c2;
                if (fArr.length >= 18 && fArr[i5] >= f7) {
                    fArr3[i3 + 28] = 0.6f;
                    int i6 = (int) fArr[i5];
                    int i7 = i3 * 3;
                    int i8 = i7 + 30;
                    float f8 = ((i6 >> 16) & 255) / 255.0f;
                    f3 = f7;
                    float f9 = ((i6 >> 8) & 255) / 255.0f;
                    float f10 = (i6 & 255) / 255.0f;
                    float min = Math.min(f8, Math.min(f9, f10));
                    float max = Math.max(f8, Math.max(f9, f10)) - min;
                    float f11 = (fArr2[i2] * 0.0722f) + (fArr2[c4] * 0.7152f) + (fArr2[0] * 0.2126f);
                    float min2 = Math.min(1.0f, max / 0.15f);
                    int i9 = (max > f3 ? 1 : (max == f3 ? 0 : -1));
                    if (i9 > 0) {
                        f4 = (f8 - min) / max;
                    } else {
                        f4 = f3;
                    }
                    fArr3[i8] = td4.A(f4, f11, min2, f11);
                    int i10 = i7 + 31;
                    if (i9 > 0) {
                        f5 = (f9 - min) / max;
                    } else {
                        f5 = f3;
                    }
                    fArr3[i10] = td4.A(f5, f11, min2, f11);
                    int i11 = i7 + 32;
                    if (i9 > 0) {
                        f6 = (f10 - min) / max;
                    } else {
                        f6 = f3;
                    }
                    fArr3[i11] = td4.A(f6, f11, min2, f11);
                    int i12 = (int) fArr[i5];
                    int i13 = (int) fArr[i4 + 11];
                    int n = bqc.n(-16216082, i12, i13);
                    int n2 = bqc.n(-15291399, i12, i13);
                    for (int i14 = 0; i14 < 3; i14++) {
                        int i15 = 16 - (i14 << 3);
                        float h = bqc.h(n, i15) * 0.73f;
                        float h2 = bqc.h(n2, i15) * 0.73f;
                        int i16 = i3 * 12;
                        fArr3[i16 + i14] = (h + h2) / 2.0f;
                        fArr3[i16 + 3 + i14] = h;
                        fArr3[i16 + 6 + i14] = h2;
                        fArr3[i16 + 9 + i14] = h;
                    }
                } else {
                    f3 = f7;
                    System.arraycopy(bqc.b, 0, fArr3, i3 * 12, 12);
                    fArr3[i3 + 28] = 1.0f;
                    System.arraycopy(fArr2, 0, fArr3, (i3 * 3) + 30, 3);
                }
                i3++;
                c = c3;
                c2 = c4;
                f7 = f3;
                i2 = 2;
            }
            char c5 = c2;
            float f12 = f7;
            int i17 = 0;
            for (int i18 = i2; i17 < i18; i18 = 2) {
                int i19 = i17 << 2;
                int i20 = i19 + 10;
                if (fArr.length >= 18 && fArr[i20] >= f12) {
                    f2 = on2.f(0.2f, ((int) fArr[i19 + 12]) | (-16777216), ((int) fArr[i19 + 11]) | (-16777216));
                } else {
                    f2 = on2.f(0.2f, -16611884, -16748084);
                }
                int i21 = i17 * 3;
                fArr3[i21 + 36] = ((f2 >> 16) & 255) / 255.0f;
                fArr3[i21 + 37] = ((f2 >> 8) & 255) / 255.0f;
                fArr3[i21 + 38] = (f2 & 255) / 255.0f;
                i17++;
            }
            System.arraycopy(fArr, 6, fArr3, 24, 4);
            float[] fArr4 = this.b0;
            if (fArr4 != null && fArr4.length > 8) {
                f = Math.max(f12, Math.min(1.0f, fArr4[8]));
            } else {
                f = 1.0f;
            }
            bpc bpcVar = this.i0;
            float R1 = gm.R1(fArr3[30], fArr3[33], f);
            float R12 = gm.R1(fArr3[31], fArr3[34], f);
            float R13 = gm.R1(fArr3[32], fArr3[35], f);
            float[] fArr5 = bpc.j;
            float[] a = bpc.a(R1, R12, R13);
            float f13 = a[0];
            float f14 = a[c5];
            float f15 = a[2];
            if (f13 == bpcVar.e && f14 == bpcVar.f && f15 == bpcVar.g) {
                return;
            }
            bpcVar.e = f13;
            bpcVar.f = f14;
            bpcVar.g = f15;
            float[] fArr6 = bpc.k;
            if (fArr6 == null) {
                fArr6 = bpc.a(0.0f, 0.47809f, 1.0f);
                bpc.k = fArr6;
            }
            float f16 = fArr6[0];
            float f17 = fArr6[c5];
            double d2 = (f16 - f17) / 1.4142135623730951d;
            double d3 = ((f16 + f17) - (fArr6[2] * 2.0f)) / 2.449489742783178d;
            double d4 = (f13 - f14) / 1.4142135623730951d;
            double d5 = ((f13 + f14) - (f15 * 2.0f)) / 2.449489742783178d;
            int i22 = 0;
            double IEEEremainder = Math.IEEEremainder(Math.atan2(d5, d4) - Math.atan2(d3, d2), 6.283185307179586d);
            double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(d4, d5) / Math.hypot(d2, d3));
            double cos = Math.cos(IEEEremainder);
            double sin = Math.sin(IEEEremainder) / 1.7320508075688772d;
            double d6 = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
            double d7 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
            float[] fArr7 = new float[20];
            int i23 = 0;
            while (true) {
                i = 3;
                if (i23 >= 3) {
                    break;
                }
                int i24 = i22;
                while (i24 < i) {
                    if (i23 == i24) {
                        d = d6;
                    } else {
                        d = d7;
                    }
                    if (i24 == (i23 + 1) % 3) {
                        d -= min3 * sin;
                    } else if (i24 == (i23 + 2) % 3) {
                        d = (min3 * sin) + d;
                    }
                    int i25 = i22;
                    double d8 = sin;
                    fArr7[(i23 * 5) + i24] = (float) d;
                    i24++;
                    i22 = i25;
                    sin = d8;
                    i = 3;
                }
                i23++;
            }
            int i26 = i22;
            int i27 = i26;
            while (i27 < i) {
                float f18 = (fArr5[2] * fArr7[i27 + 10]) + (fArr5[c5] * fArr7[i27 + 5]) + (fArr5[i26] * fArr7[i27]);
                for (int i28 = i26; i28 < 3; i28++) {
                    int i29 = (i28 * 5) + i27;
                    fArr7[i29] = (fArr5[i27] - f18) + fArr7[i29];
                }
                i27++;
                i = 3;
            }
            fArr7[18] = 1.0f;
            bpcVar.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
            bpcVar.invalidateSelf();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        if (getParent() instanceof View) {
            view = (View) getParent();
        } else {
            view = null;
        }
        if (view != null) {
            view.setTranslationZ(gm.L(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.a0 != null) {
            nm7.f(this.W).b(this, nm7.e4);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        if (getParent() instanceof View) {
            view = (View) getParent();
        } else {
            view = null;
        }
        if (view != null) {
            view.setTranslationZ(0.0f);
        }
        super.onDetachedFromWindow();
        if (this.a0 != null) {
            nm7.f(this.W).n(this, nm7.e4);
        }
    }

    public void setAdditionalTilt(float f) {
        this.r = f;
        this.E.setAdditionalTilt(f);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i) {
        this.S = i;
        this.E.setCardIcon(i);
    }

    public void setCardNumber(String str) {
        if (str != null && !str.equals(this.R)) {
            this.R = str;
            this.E.setHasCardNumber(true);
            this.I.invalidate();
        }
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
        this.E.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z) {
        this.a = z;
        this.O.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f) {
        this.E.setScaleX(f);
        this.E.setScaleY(f);
    }

    public void setStickerStyle(float[] fArr) {
        this.b0 = fArr;
        m();
        this.O.invalidate();
        this.I.invalidate();
        this.E.setStickerStyle(fArr);
        this.P.setTextColor(on2.f(fArr[8], bqc.p(-7868417, 0, fArr), bqc.p(-7868417, 3, fArr)));
        this.H.invalidate();
    }

    public void setUseGyroscope(float f) {
        this.s = f;
        this.E.setUseGyroscope(f);
    }

    public soc(Context context) {
        this(context, 2131232829, 46);
    }
}
