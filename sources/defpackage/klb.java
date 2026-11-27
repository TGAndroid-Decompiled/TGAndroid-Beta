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
public final class klb implements u37 {
    public final float A;
    public final zu1 B;
    public final LinearGradient C;
    public final float D;
    public final pn E;
    public final o47 F;
    public final NinePatchDrawable G;
    public final nr1 H;
    public final dm I;
    public float J;
    public float K;
    public final float L;
    public final int M;
    public final int N;
    public final vnb O;
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
    public final r47 k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final StaticLayout q;
    public final StaticLayout r;
    public final wb2 s;
    public final d79 t;
    public final m12 u;
    public final Matrix v;
    public final Paint w;
    public final int x;
    public final float y;
    public final float z;

    public klb(wb2 wb2Var, zu1 zu1Var, d79 d79Var, m12 m12Var, vnb vnbVar) {
        boolean z;
        boolean z2;
        int i;
        StaticLayout staticLayout;
        int i2;
        int i3;
        boolean z3;
        t37 O1;
        Object[] spans;
        boolean z4;
        Paint paint = new Paint(1);
        this.b = paint;
        this.E = new pn(null);
        PointF pointF = new PointF();
        this.P = pointF;
        this.Q = new RectF();
        this.R = new RectF();
        this.O = vnbVar;
        if (wb2Var.getMessageObject().B2 != null && wb2Var.getMessageObject().B2.size() <= 1 && !wb2Var.getMessageObject().B2.isEmpty() && ((o47) wb2Var.getMessageObject().B2.get(0)).e.getLineCount() <= 10) {
            this.s = wb2Var;
            this.t = d79Var;
            this.u = m12Var;
            this.B = zu1Var;
            nr1 nr1Var = zu1Var.a0;
            this.H = nr1Var;
            if (nr1Var != null && nr1Var.getEditField() != null && nr1Var.getEditField().getLayout() != null) {
                nr1Var.getRecordCircle();
                paint.setFilterBitmap(true);
                this.k = wb2Var.getMessageObject();
                if (!wb2Var.getTransitionParams().w0) {
                    wb2Var.draw(new Canvas());
                }
                wb2Var.setEnterTransitionInProgress(true);
                Editable editText = nr1Var.getEditText();
                CharSequence charSequence = wb2Var.getMessageObject().v;
                this.n = false;
                if (nr1Var.E6 != 0 && SystemClock.uptimeMillis() - nr1Var.E6 < 1500) {
                    z = true;
                } else {
                    z = false;
                }
                this.o = z;
                nr1Var.getEditField().getLayout().getHeight();
                TextPaint textPaint = aob.o2;
                Typeface typeface = hl.a;
                if (wb2Var.getMessageObject().P1 != 0) {
                    if (wb2Var.getMessageObject().P1 == wb2Var.getMessageObject().Q1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    switch (Math.max(wb2Var.getMessageObject().P1, wb2Var.getMessageObject().Q1)) {
                        case 0:
                        case 1:
                        case 2:
                            if (z4) {
                                textPaint = aob.y2[0];
                                break;
                            } else {
                                textPaint = aob.y2[2];
                                break;
                            }
                        case 3:
                            if (z4) {
                                textPaint = aob.y2[1];
                                break;
                            } else {
                                textPaint = aob.y2[3];
                                break;
                            }
                        case 4:
                            if (z4) {
                                textPaint = aob.y2[2];
                                break;
                            } else {
                                textPaint = aob.y2[4];
                                break;
                            }
                        case 5:
                            if (z4) {
                                textPaint = aob.y2[3];
                                break;
                            } else {
                                textPaint = aob.y2[5];
                                break;
                            }
                        case 6:
                            if (z4) {
                                textPaint = aob.y2[4];
                                break;
                            } else {
                                textPaint = aob.y2[5];
                                break;
                            }
                        default:
                            textPaint = aob.y2[5];
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
                    CharSequence J3 = hl.J3(editText, iArr);
                    if (iArr[0] > 0) {
                        i = nr1Var.getEditField().getLayout().getLineTop(nr1Var.getEditField().getLayout().getLineForOffset(iArr[0]));
                        nr1Var.getEditField().getLayout().getLineBottom(nr1Var.getEditField().getLayout().getLineForOffset(J3.length() + iArr[0]));
                    } else {
                        i = 0;
                    }
                    hm.cloneSpans(charSequence);
                    charSequence = pv3.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = nr1Var.getEditField().getTextSize() / textPaint.getTextSize();
                this.D = textSize;
                int lineCount = nr1Var.getEditField().getLayout().getLineCount();
                int width = (int) (nr1Var.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                    this.q = staticLayout;
                } else {
                    StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.q = staticLayout2;
                    staticLayout = staticLayout2;
                }
                this.I = hm.update(2, (View) null, this.I, staticLayout);
                yic.b(nr1Var.getEditField(), zu1Var.m1, pointF);
                float f = pointF.y;
                this.z = pointF.x;
                this.A = ((hl.L(10.0f) + f) - nr1Var.getEditField().getScrollY()) + i;
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
                float L = hl.L(4.0f) + f;
                this.j = L;
                if (this.H.a1()) {
                    this.j = L - hl.L(12.0f);
                }
                this.y = f + nr1Var.getEditField().getMeasuredHeight();
                o47 o47Var = (o47) wb2Var.getMessageObject().B2.get(0);
                this.F = o47Var;
                StaticLayout staticLayout3 = o47Var.e;
                int i5 = aob.Wc;
                double h = vm2.h(aob.v0(i5, this.O));
                int i6 = aob.Le;
                if (Math.abs(h - vm2.h(aob.v0(i6, this.O))) > 0.20000000298023224d) {
                    this.n = true;
                    this.p = true;
                }
                this.M = aob.v0(i6, this.O);
                this.N = aob.v0(i5, this.O);
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
                            spannableString.setSpan(new fy2((byte) 1), this.q.getLineStart(i10), this.q.getLineEnd(i10), 0);
                            float lineLeft2 = this.q.getLineLeft(i10);
                            if (lineLeft2 < f3) {
                                f3 = lineLeft2;
                            }
                        } else {
                            spannableString2.setSpan(new fy2((byte) 1), this.q.getLineStart(i10), this.q.getLineEnd(i10), 0);
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
                this.m = this.q.getWidth() - ((o47) wb2Var.getMessageObject().B2.get(0)).e.getWidth();
                if (wb2Var.getMessageObject().N1() != 0 && wb2Var.Q7 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.c = z3;
                if (z3) {
                    ema emaVar = ((fd2[]) zu1Var.c0.b)[0].c;
                    yic.b(emaVar, zu1Var.m1, this.P);
                    PointF pointF2 = this.P;
                    this.e = pointF2.x;
                    this.g = pointF2.y;
                    this.f = ((View) emaVar.getParent()).getWidth();
                    ema emaVar2 = ((fd2[]) zu1Var.c0.b)[0].d;
                    yic.b(emaVar2, zu1Var.m1, this.P);
                    float f4 = this.P.y;
                    this.h = emaVar.getTextColor();
                    this.i = emaVar2.getTextColor();
                    this.j -= hl.L(46.0f);
                }
                this.T = d79Var.getPaddingBottom() - (zu1Var.od - nr1Var.getRestingFieldHeight());
                this.v = new Matrix();
                Paint paint2 = new Paint(1);
                this.w = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, hl.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.C = linearGradient;
                paint2.setShader(linearGradient);
                this.x = wb2Var.getMessageObject().m1;
                nr1Var.getEditField().setAlpha(0.0f);
                nr1Var.setTextTransitionIsRunning(true);
                StaticLayout staticLayout6 = wb2Var.Q7;
                if (staticLayout6 != null && staticLayout6.getText().length() > 1 && wb2Var.Q7.getPrimaryHorizontal(0) != 0.0f) {
                    this.L = wb2Var.Q7.getWidth() - wb2Var.Q7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new nk(this, nr1Var, m12Var, (byte) 6));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) m12Var.c).add(this);
                m12Var.a();
                ((ViewGroup) m12Var.d).invalidate();
                this.E.d();
                ofFloat.addListener(new la5(this, m12Var, wb2Var, nr1Var, zu1Var));
                if (xea.o() == 2 && (O1 = wb2Var.O1(true)) != null) {
                    int v0 = aob.v0(aob.Je, this.O);
                    Rect rect = O1.o;
                    if (O1.F == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(O1.b(50.0f), O1.b(40.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rect.set(O1.getBounds());
                        Paint paint3 = new Paint(1);
                        paint3.setColor(-1);
                        O1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        O1.c(canvas, paint3);
                        O1.F = new NinePatchDrawable(createBitmap, jue.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klb.a(android.graphics.Canvas):void");
    }

    public final int b(int i) {
        return aob.v0(i, this.O);
    }
}
