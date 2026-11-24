package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public class av9 extends FrameLayout implements tjb {
    public static float[] l0;
    public static Path m0;
    public boolean E;
    public float F;
    public final ff0 G;
    public float H;
    public final int[] I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final wjb O;
    public final z10 P;
    public boolean Q;
    public float R;
    public float S;
    public int T;
    public ArrayList U;
    public CharSequence V;
    public long W;
    public int a;
    public float a0;
    public final u7 b;
    public int b0;
    public final Paint c;
    public StaticLayout[] c0;
    public final Paint d;
    public TextPaint d0;
    public final int e;
    public float e0;
    public final int f;
    public int f0;
    public long g0;
    public int h;
    public float h0;
    public final RectF i0;
    public int j0;
    public int k0;
    public final lm n;
    public int r;
    public float s;
    public float w;
    public boolean x;
    public zu9 y;

    public av9(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.n = new lm(this, 0L, 60L, s33.g);
        this.s = -100.0f;
        this.w = -1.0f;
        this.I = new int[]{16842910, 16842919};
        this.J = 1.0f;
        this.M = 3;
        this.a0 = 0.0f;
        this.b0 = -1;
        this.e0 = 1.0f;
        this.h0 = -1.0f;
        this.i0 = new RectF();
        this.j0 = -1;
        this.O = wjbVar;
        setWillNotDraw(false);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i = bkb.Lj;
        int v0 = bkb.v0(i, wjbVar);
        this.a = v0;
        paint.setColor(v0);
        this.f = gl.L(32.0f);
        this.e = gl.L(24.0f);
        this.H = gl.L(6.0f);
        ff0 f0 = bkb.f0(bm2.o(bkb.v0(i, wjbVar), 40), 1, gl.L(16.0f));
        this.G = f0;
        f0.setCallback(this);
        f0.setVisible(true, false);
        z10 z10Var = new z10(this, context, context, (byte) 2);
        this.P = z10Var;
        z10Var.y = true;
        addView(z10Var, nme.c(-2.0f, -1));
        setImportantForAccessibility(1);
        u7 u7Var = new u7(this, z);
        this.b = u7Var;
        setAccessibilityDelegate(u7Var);
    }

    private int getTimestampLabelWidth() {
        int i;
        int i2 = this.f;
        float f = i2 / 2.0f;
        int i3 = 0;
        if (this.W > 600000) {
            i = gl.L(42.0f);
        } else {
            i = 0;
        }
        float f2 = f + i;
        float measuredWidth = getMeasuredWidth() - (i2 / 2.0f);
        if (this.W > 600000) {
            i3 = gl.L(42.0f);
        }
        return (int) (Math.abs(f2 - (measuredWidth - i3)) - gl.L(66.0f));
    }

    private void setTimestampIndex(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            if (i >= 0 && i < this.U.size()) {
                this.P.setText((CharSequence) ((Pair) this.U.get(this.j0)).second);
            }
        }
    }

    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        int i;
        char c;
        float floatValue;
        float floatValue2;
        char c2;
        float f;
        char c3;
        float f2;
        float L = gl.L(2.0f);
        ArrayList arrayList = this.U;
        if (arrayList != null && !arrayList.isEmpty()) {
            float f3 = rectF.bottom;
            int i2 = this.f;
            float f4 = i2 / 2.0f;
            float measuredWidth = getMeasuredWidth() - (i2 / 2.0f);
            gl.P.set(rectF);
            float L2 = gl.L(this.a0 * 1.0f) / 2.0f;
            Path path = m0;
            if (path == null) {
                path = new Path();
                m0 = path;
            }
            path.reset();
            float L3 = gl.L(4.0f) / (measuredWidth - f4);
            int i3 = 0;
            while (true) {
                i = -1;
                if (i3 < this.U.size()) {
                    if (((Float) ((Pair) this.U.get(i3)).first).floatValue() >= L3) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 < 0) {
                i3 = 0;
            }
            char c4 = 1;
            int size = this.U.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (1.0f - ((Float) ((Pair) this.U.get(size)).first).floatValue() >= L3) {
                    i = size + 1;
                    break;
                } else {
                    size--;
                }
            }
            if (i < 0) {
                i = this.U.size();
            }
            int i4 = i3;
            while (i4 <= i) {
                float f5 = 0.0f;
                if (i4 == i3) {
                    floatValue = 0.0f;
                    c = 0;
                } else {
                    c = 0;
                    floatValue = ((Float) ((Pair) this.U.get(i4 - 1)).first).floatValue();
                }
                if (i4 == i) {
                    floatValue2 = 1.0f;
                } else {
                    floatValue2 = ((Float) ((Pair) this.U.get(i4)).first).floatValue();
                }
                while (i4 != i && i4 != 0) {
                    c2 = c4;
                    if (i4 >= this.U.size() - 1 || ((Float) ((Pair) this.U.get(i4)).first).floatValue() - floatValue > L3) {
                        break;
                    }
                    i4++;
                    floatValue2 = ((Float) ((Pair) this.U.get(i4)).first).floatValue();
                    c4 = c2;
                }
                c2 = c4;
                RectF rectF2 = gl.P;
                float R1 = gl.R1(f4, measuredWidth, floatValue);
                if (i4 > 0) {
                    f = L2;
                } else {
                    f = 0.0f;
                }
                rectF2.left = R1 + f;
                float R12 = gl.R1(f4, measuredWidth, floatValue2);
                if (i4 < i) {
                    f5 = L2;
                }
                float f6 = R12 - f5;
                rectF2.right = f6;
                float f7 = rectF.right;
                if (f6 > f7) {
                    c3 = c2;
                } else {
                    c3 = c;
                }
                if (c3 != 0) {
                    rectF2.right = f7;
                    f6 = f7;
                }
                float f8 = rectF.left;
                if (f6 < f8) {
                    f2 = L3;
                } else {
                    float f9 = rectF2.left;
                    if (f9 < f8) {
                        rectF2.left = f8;
                    } else {
                        f8 = f9;
                    }
                    float[] fArr = l0;
                    if (fArr == null) {
                        fArr = new float[8];
                        l0 = fArr;
                    }
                    f2 = L3;
                    if (i4 != i3 && (c3 == 0 || f8 < rectF.left)) {
                        float f10 = 0.7f * L * this.a0;
                        if (i4 >= i) {
                            fArr[7] = f10;
                            fArr[6] = f10;
                            fArr[c2] = f10;
                            fArr[c] = f10;
                            fArr[5] = L;
                            fArr[4] = L;
                            fArr[3] = L;
                            fArr[2] = L;
                        } else {
                            fArr[5] = f10;
                            fArr[4] = f10;
                            fArr[3] = f10;
                            fArr[2] = f10;
                            fArr[7] = f10;
                            fArr[6] = f10;
                            fArr[c2] = f10;
                            fArr[c] = f10;
                        }
                    } else {
                        fArr[7] = L;
                        fArr[6] = L;
                        fArr[c2] = L;
                        fArr[c] = L;
                        float f11 = 0.7f * L * this.a0;
                        fArr[5] = f11;
                        fArr[4] = f11;
                        fArr[3] = f11;
                        fArr[2] = f11;
                    }
                    m0.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (c3 != 0) {
                        break;
                    }
                }
                i4++;
                c4 = c2;
                L3 = f2;
            }
            canvas.drawPath(m0, paint);
            return;
        }
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    public final StaticLayout b(int i, CharSequence charSequence) {
        if (this.d0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.d0 = textPaint;
            textPaint.setTextSize(gl.L(12.0f));
        }
        this.d0.setColor(bkb.v0(bkb.Ij, this.O));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.d0, i).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(gl.L(400.0f), i)).build();
    }

    public final int c() {
        return Math.max((int) (this.w * (getMeasuredWidth() - this.f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        ff0 ff0Var = this.G;
        int i = this.e;
        int i2 = this.f;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.Q) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.S) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.R) > viewConfiguration.getScaledTouchSlop()) {
                        this.Q = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        int measuredHeight = (getMeasuredHeight() - i) / 2;
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            if (this.h - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.h + i + measuredHeight) {
                                int x = ((int) motionEvent.getX()) - (i / 2);
                                this.h = x;
                                if (x < c()) {
                                    this.h = c();
                                } else if (this.h > getMeasuredWidth() - i2) {
                                    this.h = getMeasuredWidth() - i2;
                                }
                            }
                            this.r = (int) (motionEvent.getX() - this.h);
                            this.x = true;
                            this.y.y();
                            if (ff0Var != null) {
                                ff0Var.setState(this.I);
                                ff0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.x) {
                    int x2 = (int) (motionEvent.getX() - this.r);
                    this.h = x2;
                    if (x2 < c()) {
                        this.h = c();
                    } else if (this.h > getMeasuredWidth() - i2) {
                        this.h = getMeasuredWidth() - i2;
                    }
                    if (this.E) {
                        if (this.N) {
                            float measuredWidth = (getMeasuredWidth() - i2) / 2;
                            float f = this.h;
                            if (f >= measuredWidth) {
                                f(false, (f - measuredWidth) / measuredWidth);
                            } else {
                                f(false, -Math.max(0.01f, 1.0f - ((measuredWidth - f) / measuredWidth)));
                            }
                        } else {
                            f(false, this.h / (getMeasuredWidth() - i2));
                        }
                    }
                    if (ff0Var != null) {
                        ff0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                    invalidate();
                    return true;
                }
            }
        } else {
            this.Q = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.S) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight2 = (getMeasuredHeight() - i) / 2;
                    if (this.h - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.h + i + measuredHeight2) {
                        int x3 = ((int) motionEvent.getX()) - (i / 2);
                        this.h = x3;
                        if (x3 < c()) {
                            this.h = c();
                        } else if (this.h > getMeasuredWidth() - i2) {
                            this.h = getMeasuredWidth() - i2;
                        }
                    }
                    this.r = (int) (motionEvent.getX() - this.h);
                    this.x = true;
                }
            }
            if (this.x) {
                if (motionEvent.getAction() == 1) {
                    if (this.N) {
                        float measuredWidth2 = (getMeasuredWidth() - i2) / 2;
                        float f2 = this.h;
                        if (f2 >= measuredWidth2) {
                            f(false, (f2 - measuredWidth2) / measuredWidth2);
                        } else {
                            f(false, -Math.max(0.01f, 1.0f - ((measuredWidth2 - f2) / measuredWidth2)));
                        }
                    } else {
                        f(true, this.h / (getMeasuredWidth() - i2));
                    }
                }
                if (ff0Var != null) {
                    ff0Var.setState(StateSet.NOTHING);
                }
                this.y.y();
                this.x = false;
                gl.d3(new am6(this, (byte) 20), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z, float f) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.s = f;
            return;
        }
        this.s = -100.0f;
        boolean z2 = this.N;
        int i = this.f;
        if (z2) {
            float measuredWidth = (getMeasuredWidth() - i) / 2;
            if (f < 0.0f) {
                ceil = Math.ceil(((-(f + 1.0f)) * measuredWidth) + measuredWidth);
            } else {
                ceil = Math.ceil((f * measuredWidth) + measuredWidth);
            }
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i) * f);
        }
        int i2 = (int) ceil;
        int i3 = this.h;
        if (i3 != i2) {
            if (z) {
                this.K = i3;
                this.J = 0.0f;
            }
            this.h = i2;
            if (i2 < c()) {
                this.h = c();
            } else if (this.h > getMeasuredWidth() - i) {
                this.h = getMeasuredWidth() - i;
            }
            invalidate();
        }
    }

    public final void f(boolean z, float f) {
        zu9 zu9Var = this.y;
        if (zu9Var != null) {
            zu9Var.j(z, f);
        }
        int i = this.L;
        if (i > 1) {
            int round = Math.round((i - 1) * f);
            if (!z && round != this.T) {
                gl.W3(this);
            }
            this.T = round;
        }
    }

    public final void g(k27 k27Var) {
        boolean z;
        Integer z2;
        String str;
        if (k27Var == null) {
            this.U = null;
            this.b0 = -1;
            this.a0 = 0.0f;
            StaticLayout[] staticLayoutArr = this.c0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        Long valueOf = Long.valueOf(((long) k27Var.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            this.U = null;
            this.b0 = -1;
            this.a0 = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.c0;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        CharSequence charSequence = k27Var.z;
        if (k27Var.d5()) {
            if (k27Var.B == null && (str = k27Var.k.media.webpage.description) != null) {
                k27Var.B = SpannableString.valueOf(str);
                k27.h(k27Var.N3(), k27Var.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = k27Var.B;
        }
        if (charSequence != this.V) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.W != valueOf.longValue()) {
            this.V = charSequence;
            this.W = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.k0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.U = null;
                this.b0 = -1;
                this.a0 = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.c0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                g4c[] g4cVarArr = (g4c[]) spanned.getSpans(0, spanned.length(), g4c.class);
                this.U = new ArrayList();
                if (z) {
                    this.a0 = 0.0f;
                }
                if (this.d0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.d0 = textPaint;
                    textPaint.setTextSize(gl.L(12.0f));
                    this.d0.setColor(-1);
                }
                for (g4c g4cVar : g4cVarArr) {
                    if (g4cVar != null && g4cVar.getURL() != null && g4cVar.d != null && g4cVar.getURL().startsWith("audio?")) {
                        if (Utilities.z(g4cVar.getURL().substring(6)).intValue() >= 0) {
                            float intValue = ((float) (z2.intValue() * 1000)) / ((float) valueOf.longValue());
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g4cVar.d);
                            vu3.l(spannableStringBuilder, this.d0.getFontMetricsInt(), false);
                            this.U.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                        }
                    }
                }
                Collections.sort(this.U, new fx7((byte) 20));
            } catch (Exception e) {
                fa4.g(e, true);
                this.U = null;
                this.b0 = -1;
                this.a0 = 0.0f;
                StaticLayout[] staticLayoutArr4 = this.c0;
                if (staticLayoutArr4 != null) {
                    staticLayoutArr4[1] = null;
                    staticLayoutArr4[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.s;
        }
        return this.h / (getMeasuredWidth() - this.f);
    }

    public yu9 getSeekBarAccessibilityDelegate() {
        return this.b;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int L = gl.L(14.0f) + (getMeasuredHeight() / 2);
        z10 z10Var = this.P;
        int measuredHeight = (z10Var.getMeasuredHeight() / 2) + L;
        int i6 = this.f / 2;
        if (this.W > 600000) {
            i5 = gl.L(42.0f);
        } else {
            i5 = 0;
        }
        int L2 = gl.L(8.0f) + gl.L(25.0f) + i6 + i5;
        z10Var.layout(L2, measuredHeight - z10Var.getMeasuredHeight(), z10Var.getMeasuredWidth() + L2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.k0 = timestampLabelWidth;
        this.P.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.s != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.s);
            this.s = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f) {
        this.F = f;
        invalidate();
    }

    public void setDelegate(zu9 zu9Var) {
        this.y = zu9Var;
    }

    public void setInnerColor(int i) {
        this.c.setColor(i);
    }

    public void setLineWidth(int i) {
        this.M = i;
    }

    public void setMinProgress(float f) {
        this.w = f;
        float progress = getProgress();
        float f2 = this.w;
        if (progress < f2) {
            e(false, f2);
        }
        invalidate();
    }

    public void setOuterColor(int i) {
        this.d.setColor(i);
        ff0 ff0Var = this.G;
        if (ff0Var != null) {
            bkb.F1(ff0Var, bm2.o(i, 40), true);
        }
    }

    public void setProgress(float f) {
        e(false, f);
    }

    public void setReportChanges(boolean z) {
        this.E = z;
    }

    public void setSeparatorsCount(int i) {
        this.L = i;
    }

    public void setTwoSided(boolean z) {
        this.N = z;
    }

    @Override
    public final void updateColors() {
        int v0;
        try {
            Paint paint = this.d;
            if (paint != null && paint.getColor() == this.a && (v0 = bkb.v0(bkb.Lj, this.O)) != this.a) {
                this.a = v0;
                setOuterColor(v0);
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.G) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public av9(Context context) {
        this(null, context, false);
    }
}
