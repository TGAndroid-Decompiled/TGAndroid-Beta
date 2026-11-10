package di;

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
import bi.dd;
import bi.nc;
import c8.ha;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
public final class n0 extends FrameLayout implements j60 {
    public final xh.l D;
    public final TextView E;
    public final TextView F;
    public final wp[] G;
    public final wp[] H;
    public int I;
    public ValueAnimator J;
    public s0 K;
    public final Paint L;
    public boolean f9372a;
    public boolean f9373b;
    public final int f9374c;
    public final boolean d;
    public Drawable f9375e;
    public float f9376f;
    public final nc h;
    public final LinearLayout f9377n;
    public final xh.l f9378r;
    public final xh.l f9379s;
    public CharSequence f9380w;
    public final org.telegram.ui.Components.k9 f9381x;
    public final org.telegram.ui.Components.v8 f9382y;

    public n0(int i7, Context context, boolean z9) {
        super(context);
        this.f9372a = false;
        this.f9373b = true;
        this.f9376f = 0.5f;
        this.G = new wp[1];
        this.H = new wp[1];
        this.L = new Paint(1);
        this.f9374c = i7;
        this.d = z9;
        nc ncVar = new nc(this, context);
        this.h = ncVar;
        ncVar.setOrientation(0);
        addView(ncVar, ha.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f9382y = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f9381x = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        ncVar.addView(k9Var, ha.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ncVar.addView(linearLayout, ha.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f9377n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, ha.o(-2, -2));
        xh.l lVar = new xh.l(context);
        this.f9378r = lVar;
        lVar.setTextColor(-1);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(3);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(lVar, ha.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        xh.l lVar2 = new xh.l(context);
        this.f9379s = lVar2;
        lVar2.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.55f, -1));
        lVar2.setTextSize(1, 12.0f);
        lVar2.setGravity(5);
        linearLayout2.addView(lVar2, ha.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        xh.l lVar3 = new xh.l(context);
        this.D = lVar3;
        lVar3.setTextColor(-1);
        lVar3.setTextSize(1, 14.0f);
        lVar3.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.m6.r1(0.6f, -16777216));
        qs.i(lVar3);
        linearLayout.addView(lVar3, ha.o(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        textView.setVisibility(8);
        ncVar.addView(textView, ha.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        ncVar.addView(textView2, ha.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.f9375e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f9376f * 255.0f));
                this.h.invalidate();
            }
        }
        s0 s0Var = this.K;
        if (s0Var != null && this.f9375e != null) {
            this.I = s0Var.f9719a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 15));
            this.J.addListener(new bi.t5(this, 8));
            this.J.setDuration(350L);
            this.J.setInterpolator(wq.h);
            this.J.start();
        }
    }

    @Override
    public final void g(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        nc ncVar = this.h;
        if (ncVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(f10 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(ncVar.getX(), ncVar.getY(), ncVar.getX() + ncVar.getWidth(), ncVar.getY() + ncVar.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
        }
        draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(s0 s0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z9;
        int i7;
        boolean z10;
        String str2;
        int i10;
        boolean z11;
        int i11;
        CharSequence subSequence;
        int i12;
        this.K = s0Var;
        nc ncVar = this.h;
        if ((s0Var == null || this.I != s0Var.f9719a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.f9375e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f9376f * 255.0f));
                ncVar.invalidate();
            }
        }
        int i13 = (s0Var.f9721c > 0L ? 1 : (s0Var.f9721c == 0L ? 0 : -1));
        org.telegram.ui.Components.k9 k9Var = this.f9381x;
        org.telegram.ui.Components.v8 v8Var = this.f9382y;
        int i14 = this.f9374c;
        if (i13 >= 0) {
            TLRPC.User a22 = qp.s1(i14).a2(Long.valueOf(s0Var.f9721c));
            v8Var.r(a22);
            k9Var.e(a22, v8Var);
            str = t10.k(a22);
        } else {
            TLRPC.Chat M0 = qp.s1(i14).M0(Long.valueOf(-s0Var.f9721c));
            v8Var.q(M0);
            k9Var.e(M0, v8Var);
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
        }
        int b10 = t.b(i14, (int) s0Var.f9724g, 3);
        int b11 = t.b(i14, (int) s0Var.f9724g, 4);
        int b12 = t.b(i14, (int) s0Var.f9724g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = s0Var.f9720b;
        String str3 = " ";
        boolean z13 = this.d;
        float f10 = 1.0f;
        xh.l lVar = this.D;
        if (z12 && s0Var.f9724g <= 0) {
            z9 = z13;
        } else {
            if (s0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + s0Var.h));
                z9 = z13;
                wp wpVar = new wp(0, new j0(getContext(), s0Var.h));
                wpVar.f40039s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z9 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, lVar.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            if (z9) {
                i7 = 33;
                spannableStringBuilder.setSpan(new l0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i7 = 33;
            }
            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), i7);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = t.b(i14, (int) s0Var.f9724g, 1);
        int b14 = t.b(i14, (int) s0Var.f9724g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = s0Var.f9723f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = ij.j0(tL_textWithEntities, false, false, lVar.getPaint());
            this.f9380w = j02;
            Typeface typeface = org.telegram.messenger.g0.f22539a;
            if (j02 == null) {
                z10 = true;
                str2 = " ";
                subSequence = null;
            } else {
                int length = j02.length();
                z10 = true;
                int i15 = 0;
                while (true) {
                    if (i15 < length) {
                        char charAt = j02.charAt(i15);
                        if (!Character.isWhitespace(charAt)) {
                            i11 = length;
                            if (charAt != 10240 && charAt != 12644 && charAt != 65440) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i15++;
                        length = i11;
                    } else {
                        i11 = length;
                        break;
                    }
                }
                int i16 = i11;
                while (true) {
                    if (i15 < i16) {
                        char charAt2 = j02.charAt(i16 - 1);
                        if (!Character.isWhitespace(charAt2)) {
                            str2 = str3;
                            if (charAt2 != 10240 && charAt2 != 12644) {
                                if (charAt2 != 65440) {
                                    break;
                                }
                                i16--;
                                str3 = str2;
                            }
                        } else {
                            str2 = str3;
                        }
                        i16--;
                        str3 = str2;
                    } else {
                        str2 = str3;
                        break;
                    }
                }
                if (i15 <= 0 && i16 >= j02.length()) {
                    subSequence = j02;
                } else {
                    subSequence = j02.subSequence(i15, i16);
                }
            }
            this.f9380w = subSequence;
            if (subSequence.length() > b13 && !s0Var.f9720b) {
                i12 = 0;
                this.f9380w = this.f9380w.subSequence(0, b13);
            } else {
                i12 = 0;
            }
            CharSequence charSequence = this.f9380w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.q5[] q5VarArr = (org.telegram.ui.Components.q5[]) spannable.getSpans(i12, charSequence.length(), org.telegram.ui.Components.q5.class);
                org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spannable.getSpans(i12, this.f9380w.length(), org.telegram.messenger.f6.class);
                if (q5VarArr.length + f6VarArr.length > b14 && !s0Var.f9720b) {
                    ArrayList arrayList = new ArrayList();
                    int i17 = 0;
                    while (i17 < q5VarArr.length) {
                        org.telegram.ui.Components.q5[] q5VarArr2 = q5VarArr;
                        int i18 = i17;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(q5VarArr2[i17])), Integer.valueOf(spannable.getSpanEnd(q5VarArr2[i18]))));
                        i17 = i18 + 1;
                        q5VarArr = q5VarArr2;
                    }
                    int i19 = 0;
                    while (i19 < f6VarArr.length) {
                        int i20 = i19;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(f6VarArr[i19])), Integer.valueOf(spannable.getSpanEnd(f6VarArr[i20]))));
                        i19 = i20 + 1;
                    }
                    Collections.sort(arrayList, new a3.c(23));
                    if (!(this.f9380w instanceof SpannableStringBuilder)) {
                        this.f9380w = new SpannableStringBuilder(this.f9380w);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.f9380w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!s0Var.f9720b) {
                this.f9380w = org.telegram.messenger.g0.N2(this.f9380w);
            }
            spannableStringBuilder.append(this.f9380w);
        } else {
            z10 = true;
            str2 = " ";
            this.f9380w = "";
        }
        lVar.setText(org.telegram.messenger.i6.m(spannableStringBuilder, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.f9375e = null;
        if (s0Var.f9720b && s0Var.f9724g <= 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f9377n.setVisibility(i10);
        long j3 = s0Var.f9724g;
        int i21 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TextView textView = this.F;
        TextView textView2 = this.E;
        if (i21 > 0) {
            if (j3 >= 250) {
                z11 = z10;
            } else {
                z11 = false;
            }
            this.f9372a = z11;
            ncVar.setWillNotDraw(!z11);
            ncVar.invalidate();
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i22 = org.telegram.ui.ActionBar.m6.f27826a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.f9375e = gradientDrawable;
            ncVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.f9375e;
            if (!z9) {
                f10 = 0.65f;
            }
            float f11 = f10;
            this.f9376f = f11;
            drawable2.setAlpha((int) (f11 * 255.0f));
            if (!s0Var.f9722e) {
                textView.setVisibility(0);
                textView.setText(dd.X0(false, jg.g.m(s0Var.f9724g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.m6.r1(0.25f, b12)));
                textView2.setText(dd.X0(false, jg.g.m(s0Var.f9724g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, org.telegram.messenger.g0.L(0.66f), 1.0f));
                wp wpVar2 = this.G[0];
                if (wpVar2 != null) {
                    wpVar2.f40032a = this.f9373b;
                }
            }
        } else if (s0Var.f9720b) {
            this.f9372a = false;
            ncVar.setWillNotDraw(z10);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(13.0f), -16777216);
            this.f9375e = d02;
            ncVar.setBackground(d02);
            Drawable drawable3 = this.f9375e;
            this.f9376f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.m5.l(i14, s0Var.f9721c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) id.M0(2131748825, null));
            spannableStringBuilder2.setSpan(new k0(0), length2, spannableStringBuilder2.length(), 33);
            this.f9378r.setText(spannableStringBuilder2);
            this.f9379s.setText(id.M0(2131748828, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f9372a = false;
            ncVar.setWillNotDraw(true);
            lVar.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.m6.r1(0.6f, -16777216));
            this.f9375e = null;
            ncVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        ncVar.invalidate();
    }

    public void setDrawStar(boolean z9) {
        this.f9373b = z9;
        wp wpVar = this.G[0];
        if (wpVar != null && wpVar.f40032a != z9) {
            wpVar.f40032a = z9;
            this.E.invalidate();
        }
    }
}
