package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
public final class ohb implements n17 {
    public final float A;
    public final mu1 B;
    public final LinearGradient C;
    public final float D;
    public final on E;
    public final h27 F;
    public final NinePatchDrawable G;
    public final ar1 H;
    public final cm I;
    public float J;
    public float K;
    public final float L;
    public final int M;
    public final int N;
    public final wjb O;
    public final PointF P;
    public final RectF Q;
    public final RectF R;
    public float[] S;
    public final float T;
    public float a;
    public final Paint b;
    public final boolean c;
    public final ValueAnimator d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final float j;
    public final k27 k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final StaticLayout q;
    public final StaticLayout r;
    public final gb2 s;
    public final o39 t;
    public final w02 u;
    public final Matrix v;
    public final Paint w;
    public final int x;
    public final float y;
    public final float z;

    public ohb(gb2 gb2Var, mu1 mu1Var, o39 o39Var, w02 w02Var, wjb wjbVar) {
        boolean z;
        boolean z2;
        int i;
        StaticLayout staticLayout;
        int i2;
        int i3;
        boolean z3;
        m17 O1;
        Object[] spans;
        boolean z4;
        Paint paint = new Paint(1);
        this.b = paint;
        this.E = new on(null);
        PointF pointF = new PointF();
        this.P = pointF;
        this.Q = new RectF();
        this.R = new RectF();
        this.O = wjbVar;
        if (gb2Var.getMessageObject().B2 != null && gb2Var.getMessageObject().B2.size() <= 1 && !gb2Var.getMessageObject().B2.isEmpty() && ((h27) gb2Var.getMessageObject().B2.get(0)).e.getLineCount() <= 10) {
            this.s = gb2Var;
            this.t = o39Var;
            this.u = w02Var;
            this.B = mu1Var;
            ar1 ar1Var = mu1Var.a0;
            this.H = ar1Var;
            if (ar1Var != null && ar1Var.getEditField() != null && ar1Var.getEditField().getLayout() != null) {
                ar1Var.getRecordCircle();
                paint.setFilterBitmap(true);
                this.k = gb2Var.getMessageObject();
                if (!gb2Var.getTransitionParams().w0) {
                    gb2Var.draw(new Canvas());
                }
                gb2Var.setEnterTransitionInProgress(true);
                Editable editText = ar1Var.getEditText();
                CharSequence charSequence = gb2Var.getMessageObject().v;
                this.n = false;
                if (ar1Var.s6 != 0 && SystemClock.uptimeMillis() - ar1Var.s6 < 1500) {
                    z = true;
                } else {
                    z = false;
                }
                this.o = z;
                ar1Var.getEditField().getLayout().getHeight();
                TextPaint textPaint = bkb.n2;
                Typeface typeface = gl.a;
                if (gb2Var.getMessageObject().P1 != 0) {
                    if (gb2Var.getMessageObject().P1 == gb2Var.getMessageObject().Q1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    switch (Math.max(gb2Var.getMessageObject().P1, gb2Var.getMessageObject().Q1)) {
                        case 0:
                        case 1:
                        case 2:
                            if (z4) {
                                textPaint = bkb.x2[0];
                                break;
                            } else {
                                textPaint = bkb.x2[2];
                                break;
                            }
                        case 3:
                            if (z4) {
                                textPaint = bkb.x2[1];
                                break;
                            } else {
                                textPaint = bkb.x2[3];
                                break;
                            }
                        case 4:
                            if (z4) {
                                textPaint = bkb.x2[2];
                                break;
                            } else {
                                textPaint = bkb.x2[4];
                                break;
                            }
                        case 5:
                            if (z4) {
                                textPaint = bkb.x2[3];
                                break;
                            } else {
                                textPaint = bkb.x2[5];
                                break;
                            }
                        case 6:
                            if (z4) {
                                textPaint = bkb.x2[4];
                                break;
                            } else {
                                textPaint = bkb.x2[5];
                                break;
                            }
                        default:
                            textPaint = bkb.x2[5];
                            break;
                    }
                    if (textPaint != null) {
                        textPaint.getTextSize();
                    }
                }
                if ((charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (editText.length() == charSequence.length() && !z2) {
                    i = 0;
                } else {
                    this.n = true;
                    int[] iArr = new int[1];
                    CharSequence K3 = gl.K3(editText, iArr);
                    if (iArr[0] > 0) {
                        i = ar1Var.getEditField().getLayout().getLineTop(ar1Var.getEditField().getLayout().getLineForOffset(iArr[0]));
                        ar1Var.getEditField().getLayout().getLineBottom(ar1Var.getEditField().getLayout().getLineForOffset(K3.length() + iArr[0]));
                    } else {
                        i = 0;
                    }
                    gm.cloneSpans(charSequence);
                    charSequence = vu3.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = ar1Var.getEditField().getTextSize() / textPaint.getTextSize();
                this.D = textSize;
                int lineCount = ar1Var.getEditField().getLayout().getLineCount();
                int width = (int) (ar1Var.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                    this.q = staticLayout;
                } else {
                    StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.q = staticLayout2;
                    staticLayout = staticLayout2;
                }
                this.I = gm.update(2, (View) null, this.I, staticLayout);
                zec.b(ar1Var.getEditField(), mu1Var.m1, pointF);
                float f = pointF.y;
                this.z = pointF.x;
                this.A = ((gl.L(10.0f) + f) - ar1Var.getEditField().getScrollY()) + i;
                this.l = 0.0f;
                float f2 = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.q.getLineCount(); i4++) {
                    float lineLeft = this.q.getLineLeft(i4);
                    if (lineLeft < f2) {
                        f2 = lineLeft;
                    }
                }
                if (f2 != Float.MAX_VALUE) {
                    this.l = f2;
                }
                this.q.getHeight();
                float L = gl.L(4.0f) + f;
                this.j = L;
                if (this.H.W0()) {
                    this.j = L - gl.L(12.0f);
                }
                this.y = f + ar1Var.getEditField().getMeasuredHeight();
                h27 h27Var = (h27) gb2Var.getMessageObject().B2.get(0);
                this.F = h27Var;
                StaticLayout staticLayout3 = h27Var.e;
                int i5 = bkb.Vc;
                double h = bm2.h(bkb.v0(i5, this.O));
                int i6 = bkb.Ke;
                if (Math.abs(h - bm2.h(bkb.v0(i6, this.O))) > 0.20000000298023224d) {
                    this.n = true;
                    this.p = true;
                }
                this.M = bkb.v0(i6, this.O);
                this.N = bkb.v0(i5, this.O);
                if (staticLayout3.getLineCount() == this.q.getLineCount()) {
                    lineCount = staticLayout3.getLineCount();
                    int i7 = 0;
                    int i8 = 0;
                    i2 = 0;
                    while (true) {
                        if (i7 < lineCount) {
                            StaticLayout staticLayout4 = this.q;
                            int i9 = i8;
                            if (staticLayout4.getLineRight(i7) == staticLayout4.getWidth() && staticLayout4.getLineLeft(i7) != 0.0f) {
                                i2++;
                                i8 = i9;
                            } else {
                                i8 = i9 + 1;
                            }
                            if (staticLayout3.getLineEnd(i7) != this.q.getLineEnd(i7)) {
                                this.n = true;
                            } else {
                                i7++;
                            }
                        }
                    }
                    i3 = i8;
                } else {
                    this.n = true;
                    i2 = 0;
                    i3 = 0;
                }
                if (!this.n && i2 > 0 && i3 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f3 = Float.MAX_VALUE;
                    for (int i10 = 0; i10 < lineCount; i10++) {
                        StaticLayout staticLayout5 = this.q;
                        if (staticLayout5.getLineRight(i10) == staticLayout5.getWidth() && staticLayout5.getLineLeft(i10) != 0.0f) {
                            spannableString.setSpan(new lx2((byte) 1), this.q.getLineStart(i10), this.q.getLineEnd(i10), 0);
                            float lineLeft2 = this.q.getLineLeft(i10);
                            if (lineLeft2 < f3) {
                                f3 = lineLeft2;
                            }
                        } else {
                            spannableString2.setSpan(new lx2((byte) 1), this.q.getLineStart(i10), this.q.getLineEnd(i10), 0);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.q = hyphenationFrequency.setAlignment(alignment).build();
                        this.r = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.q = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.r = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.m = this.q.getWidth() - ((h27) gb2Var.getMessageObject().B2.get(0)).e.getWidth();
                if (gb2Var.getMessageObject().N1() != 0 && gb2Var.Q7 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.c = z3;
                if (z3) {
                    jia jiaVar = ((pc2[]) mu1Var.c0.b)[0].c;
                    zec.b(jiaVar, mu1Var.m1, this.P);
                    PointF pointF2 = this.P;
                    this.e = pointF2.x;
                    this.g = pointF2.y;
                    this.f = ((View) jiaVar.getParent()).getWidth();
                    jia jiaVar2 = ((pc2[]) mu1Var.c0.b)[0].d;
                    zec.b(jiaVar2, mu1Var.m1, this.P);
                    float f4 = this.P.y;
                    this.h = jiaVar.getTextColor();
                    this.i = jiaVar2.getTextColor();
                    this.j -= gl.L(46.0f);
                }
                this.T = o39Var.getPaddingBottom() - (mu1Var.ad - ar1Var.getRestingFieldHeight());
                this.v = new Matrix();
                Paint paint2 = new Paint(1);
                this.w = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, gl.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.C = linearGradient;
                paint2.setShader(linearGradient);
                this.x = gb2Var.getMessageObject().m1;
                ar1Var.getEditField().setAlpha(0.0f);
                ar1Var.setTextTransitionIsRunning(true);
                StaticLayout staticLayout6 = gb2Var.Q7;
                if (staticLayout6 != null && staticLayout6.getText().length() > 1 && gb2Var.Q7.getPrimaryHorizontal(0) != 0.0f) {
                    this.L = gb2Var.Q7.getWidth() - gb2Var.Q7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new nk(this, ar1Var, w02Var, (byte) 6));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) w02Var.c).add(this);
                w02Var.a();
                ((ViewGroup) w02Var.d).invalidate();
                this.E.d();
                ofFloat.addListener(new i85(this, w02Var, gb2Var, ar1Var, mu1Var));
                if (gba.o() == 2 && (O1 = gb2Var.O1(true)) != null) {
                    int v0 = bkb.v0(bkb.Ie, this.O);
                    Rect rect = O1.o;
                    if (O1.F == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(O1.b(50.0f), O1.b(40.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rect.set(O1.getBounds());
                        Paint paint3 = new Paint(1);
                        paint3.setColor(-1);
                        O1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        O1.c(canvas, paint3);
                        O1.F = new NinePatchDrawable(createBitmap, rpe.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                        O1.setBounds(rect);
                    }
                    if (O1.G != v0) {
                        O1.G = v0;
                        O1.F.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
                    }
                    this.G = O1.F;
                }
            }
        }
    }

    @Override
    public final void a(android.graphics.Canvas r63) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohb.a(android.graphics.Canvas):void");
    }

    public final int b(int i) {
        return bkb.v0(i, this.O);
    }
}
