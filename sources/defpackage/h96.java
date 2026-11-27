package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class h96 extends FrameLayout implements eu5 {
    public final tpa E;
    public final TextView F;
    public final TextView G;
    public final wm2[] H;
    public final wm2[] I;
    public int J;
    public ValueAnimator K;
    public m96 L;
    public final Paint M;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final rg2 h;
    public final LinearLayout n;
    public final tpa r;
    public final tpa s;
    public CharSequence w;
    public final de0 x;
    public final rb0 y;

    public h96(int i, Context context, boolean z) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.H = new wm2[1];
        this.I = new wm2[1];
        this.M = new Paint(1);
        this.c = i;
        this.d = z;
        rg2 rg2Var = new rg2(this, context);
        this.h = rg2Var;
        rg2Var.setOrientation(0);
        addView(rg2Var, tre.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.y = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.x = de0Var;
        de0Var.setRoundRadius(hl.L(11.0f));
        rg2Var.addView(de0Var, tre.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        rg2Var.addView(linearLayout, tre.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, tre.o(-2, -2));
        tpa tpaVar = new tpa(context);
        this.r = tpaVar;
        tpaVar.setTextColor(-1);
        tpaVar.setTextSize(1, 14.0f);
        tpaVar.setGravity(3);
        tpaVar.setTypeface(hl.o());
        linearLayout2.addView(tpaVar, tre.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        tpa tpaVar2 = new tpa(context);
        this.s = tpaVar2;
        tpaVar2.setTextColor(aob.p1(0.55f, -1));
        tpaVar2.setTextSize(1, 12.0f);
        tpaVar2.setGravity(5);
        linearLayout2.addView(tpaVar2, tre.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        tpa tpaVar3 = new tpa(context);
        this.E = tpaVar3;
        tpaVar3.setTextColor(-1);
        tpaVar3.setTextSize(1, 14.0f);
        tpaVar3.setShadowLayer(hl.L(2.5f), 0.0f, hl.L(1.5f), aob.p1(0.6f, -16777216));
        jn7.i(tpaVar3);
        linearLayout.addView(tpaVar3, tre.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(hl.L(4.66f), 0, hl.L(4.66f), 0);
        textView.setVisibility(8);
        rg2Var.addView(textView, tre.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        rg2Var.addView(textView2, tre.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                this.h.invalidate();
            }
        }
        m96 m96Var = this.L;
        if (m96Var != null && this.e != null) {
            this.J = m96Var.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ch4(this, (byte) 22));
            this.K.addListener(new ad5(this, (byte) 11));
            this.K.setDuration(350L);
            this.K.setInterpolator(k43.h);
            this.K.start();
        }
    }

    @Override
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void f(Canvas canvas, float f) {
        rg2 rg2Var = this.h;
        if (rg2Var.getBackground() == null) {
            int p1 = aob.p1(f * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(p1);
            RectF rectF = hl.P;
            rectF.set(rg2Var.getX(), rg2Var.getY(), rg2Var.getX() + rg2Var.getWidth(), rg2Var.getY() + rg2Var.getHeight());
            canvas.drawRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), paint);
        }
        draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(m96 m96Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z;
        int i;
        boolean z2;
        String str2;
        int i2;
        boolean z3;
        int i3;
        CharSequence subSequence;
        int i4;
        this.L = m96Var;
        rg2 rg2Var = this.h;
        if ((m96Var == null || this.J != m96Var.a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                rg2Var.invalidate();
            }
        }
        int i5 = (m96Var.c > 0L ? 1 : (m96Var.c == 0L ? 0 : -1));
        de0 de0Var = this.x;
        rb0 rb0Var = this.y;
        int i6 = this.c;
        if (i5 >= 0) {
            TLRPC.User X1 = uc7.s1(i6).X1(Long.valueOf(m96Var.c));
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
            str = lbc.l(X1);
        } else {
            TLRPC.Chat M0 = uc7.s1(i6).M0(Long.valueOf(-m96Var.c));
            rb0Var.p(M0);
            de0Var.f(M0, rb0Var);
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
        }
        int b = eg5.b(i6, (int) m96Var.g, 3);
        int b2 = eg5.b(i6, (int) m96Var.g, 4);
        int b3 = eg5.b(i6, (int) m96Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z4 = m96Var.b;
        String str3 = " ";
        boolean z5 = this.d;
        float f = 1.0f;
        tpa tpaVar = this.E;
        if (z4 && m96Var.g <= 0) {
            z = z5;
        } else {
            if (m96Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + m96Var.h));
                z = z5;
                wm2 wm2Var = new wm2(0, new ee1(getContext(), m96Var.h));
                wm2Var.s = hl.L(1.0f);
                spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z = z5;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, tpaVar.getPaint(), hl.L(100.0f), TextUtils.TruncateAt.END));
            if (z) {
                i = 33;
                spannableStringBuilder.setSpan(new f96(), 0, spannableStringBuilder.length(), 33);
            } else {
                i = 33;
            }
            spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), i);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b4 = eg5.b(i6, (int) m96Var.g, 1);
        int b5 = eg5.b(i6, (int) m96Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = m96Var.f;
        if (tL_textWithEntities != null) {
            CharSequence j0 = r47.j0(tL_textWithEntities, false, false, tpaVar.getPaint());
            this.w = j0;
            Typeface typeface = hl.a;
            if (j0 == null) {
                z2 = true;
                str2 = " ";
                subSequence = null;
            } else {
                int length = j0.length();
                z2 = true;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        char charAt = j0.charAt(i7);
                        if (!Character.isWhitespace(charAt)) {
                            i3 = length;
                            if (charAt != 10240 && charAt != 12644 && charAt != 65440) {
                                break;
                            }
                        } else {
                            i3 = length;
                        }
                        i7++;
                        length = i3;
                    } else {
                        i3 = length;
                        break;
                    }
                }
                int i8 = i3;
                while (true) {
                    if (i7 < i8) {
                        char charAt2 = j0.charAt(i8 - 1);
                        if (!Character.isWhitespace(charAt2)) {
                            str2 = str3;
                            if (charAt2 != 10240 && charAt2 != 12644 && charAt2 != 65440) {
                                break;
                            }
                        } else {
                            str2 = str3;
                        }
                        i8--;
                        str3 = str2;
                    } else {
                        str2 = str3;
                        break;
                    }
                }
                if (i7 <= 0 && i8 >= j0.length()) {
                    subSequence = j0;
                } else {
                    subSequence = j0.subSequence(i7, i8);
                }
            }
            this.w = subSequence;
            if (subSequence.length() > b4 && !m96Var.b) {
                i4 = 0;
                this.w = this.w.subSequence(0, b4);
            } else {
                i4 = 0;
            }
            CharSequence charSequence = this.w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                hm[] hmVarArr = (hm[]) spannable.getSpans(i4, charSequence.length(), hm.class);
                mv3[] mv3VarArr = (mv3[]) spannable.getSpans(i4, this.w.length(), mv3.class);
                if (hmVarArr.length + mv3VarArr.length > b5 && !m96Var.b) {
                    ArrayList arrayList = new ArrayList();
                    int i9 = 0;
                    while (i9 < hmVarArr.length) {
                        hm[] hmVarArr2 = hmVarArr;
                        int i10 = i9;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(hmVarArr2[i9])), Integer.valueOf(spannable.getSpanEnd(hmVarArr2[i10]))));
                        i9 = i10 + 1;
                        hmVarArr = hmVarArr2;
                    }
                    int i11 = 0;
                    while (i11 < mv3VarArr.length) {
                        int i12 = i11;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(mv3VarArr[i11])), Integer.valueOf(spannable.getSpanEnd(mv3VarArr[i12]))));
                        i11 = i12 + 1;
                    }
                    Collections.sort(arrayList, new f03((byte) 28));
                    if (!(this.w instanceof SpannableStringBuilder)) {
                        this.w = new SpannableStringBuilder(this.w);
                    }
                    for (int size = arrayList.size() - 1; size >= b5; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!m96Var.b) {
                this.w = hl.J2(this.w);
            }
            spannableStringBuilder.append(this.w);
        } else {
            z2 = true;
            str2 = " ";
            this.w = "";
        }
        tpaVar.setText(pv3.m(spannableStringBuilder, tpaVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.e = null;
        if (m96Var.b && m96Var.g <= 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.n.setVisibility(i2);
        long j = m96Var.g;
        int i13 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TextView textView = this.G;
        TextView textView2 = this.F;
        if (i13 > 0) {
            if (j >= 250) {
                z3 = z2;
            } else {
                z3 = false;
            }
            this.a = z3;
            rg2Var.setWillNotDraw(!z3);
            rg2Var.invalidate();
            tpaVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = hl.L(13.0f);
            int i14 = aob.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b, b2});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            rg2Var.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            if (!z) {
                f = 0.65f;
            }
            float f2 = f;
            this.f = f2;
            drawable2.setAlpha((int) (f2 * 255.0f));
            if (!m96Var.e) {
                textView.setVisibility(0);
                textView.setText(nza.Y0(false, "⭐️ ".concat(ob6.E(m96Var.g, ',')), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(aob.b0(hl.L(13.0f), aob.p1(0.25f, b3)));
                textView2.setText(nza.Y0(false, "⭐️ ".concat(ob6.E(m96Var.g, ',')), 0.75f, this.H, hl.L(0.66f), 1.0f));
                wm2 wm2Var2 = this.H[0];
                if (wm2Var2 != null) {
                    wm2Var2.a = this.b;
                }
            }
        } else if (m96Var.b) {
            this.a = false;
            rg2Var.setWillNotDraw(z2);
            ShapeDrawable b0 = aob.b0(hl.L(13.0f), -16777216);
            this.e = b0;
            rg2Var.setBackground(b0);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha(127);
            tpaVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) wf3.k(i6, m96Var.c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131748579, null));
            spannableStringBuilder2.setSpan(new e96((byte) 0), length2, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(ob6.M0(2131748582, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            rg2Var.setWillNotDraw(true);
            tpaVar.setShadowLayer(hl.L(2.5f), 0.0f, hl.L(1.5f), aob.p1(0.6f, -16777216));
            this.e = null;
            rg2Var.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        rg2Var.invalidate();
    }

    public void setDrawStar(boolean z) {
        this.b = z;
        wm2 wm2Var = this.H[0];
        if (wm2Var != null && wm2Var.a != z) {
            wm2Var.a = z;
            this.F.invalidate();
        }
    }

    @Override
    public void setScrimHidden(boolean z) {
        qd4.a(this, z);
    }
}
