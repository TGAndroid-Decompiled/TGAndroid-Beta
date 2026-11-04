package ei;

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
import b8.mf;
import ci.gb;
import ci.wb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class p0 extends FrameLayout implements e60 {
    public final yh.l E;
    public final TextView F;
    public final TextView G;
    public final wp[] H;
    public final wp[] I;
    public int J;
    public ValueAnimator K;
    public u0 L;
    public final Paint M;
    public boolean f10741a;
    public boolean f10742b;
    public final int f10743c;
    public final boolean d;
    public Drawable f10744e;
    public float f10745f;
    public final gb h;
    public final LinearLayout f10746n;
    public final yh.l f10747r;
    public final yh.l f10748s;
    public CharSequence f10749w;
    public final org.telegram.ui.Components.k9 f10750x;
    public final org.telegram.ui.Components.u8 f10751y;

    public p0(int i3, Context context, boolean z10) {
        super(context);
        this.f10741a = false;
        this.f10742b = true;
        this.f10745f = 0.5f;
        this.H = new wp[1];
        this.I = new wp[1];
        this.M = new Paint(1);
        this.f10743c = i3;
        this.d = z10;
        gb gbVar = new gb(this, context);
        this.h = gbVar;
        gbVar.setOrientation(0);
        addView(gbVar, mf.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f10751y = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f10750x = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        gbVar.addView(k9Var, mf.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        gbVar.addView(linearLayout, mf.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f10746n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, mf.o(-2, -2));
        yh.l lVar = new yh.l(context);
        this.f10747r = lVar;
        lVar.setTextColor(-1);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(3);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(lVar, mf.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        yh.l lVar2 = new yh.l(context);
        this.f10748s = lVar2;
        lVar2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.55f, -1));
        lVar2.setTextSize(1, 12.0f);
        lVar2.setGravity(5);
        linearLayout2.addView(lVar2, mf.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        yh.l lVar3 = new yh.l(context);
        this.E = lVar3;
        lVar3.setTextColor(-1);
        lVar3.setTextSize(1, 14.0f);
        lVar3.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.k6.r1(0.6f, -16777216));
        hs.i(lVar3);
        linearLayout.addView(lVar3, mf.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        textView.setVisibility(8);
        gbVar.addView(textView, mf.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        gbVar.addView(textView2, mf.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.f10744e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f10745f * 255.0f));
                this.h.invalidate();
            }
        }
        u0 u0Var = this.L;
        if (u0Var != null && this.f10744e != null) {
            this.J = u0Var.f11069a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bh.f(this, 15));
            this.K.addListener(new ai.e1(this, 9));
            this.K.setDuration(350L);
            this.K.setInterpolator(xq.h);
            this.K.start();
        }
    }

    @Override
    public final void g(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        gb gbVar = this.h;
        if (gbVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(f10 * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(gbVar.getX(), gbVar.getY(), gbVar.getX() + gbVar.getWidth(), gbVar.getY() + gbVar.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
        }
        draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(u0 u0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i3;
        boolean z11;
        String str2;
        int i10;
        boolean z12;
        int i11;
        CharSequence subSequence;
        int i12;
        this.L = u0Var;
        gb gbVar = this.h;
        if ((u0Var == null || this.J != u0Var.f11069a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.f10744e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f10745f * 255.0f));
                gbVar.invalidate();
            }
        }
        int i13 = (u0Var.f11071c > 0L ? 1 : (u0Var.f11071c == 0L ? 0 : -1));
        org.telegram.ui.Components.k9 k9Var = this.f10750x;
        org.telegram.ui.Components.u8 u8Var = this.f10751y;
        int i14 = this.f10743c;
        if (i13 >= 0) {
            TLRPC.User a22 = hp.s1(i14).a2(Long.valueOf(u0Var.f11071c));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
            str = l10.k(a22);
        } else {
            TLRPC.Chat M0 = hp.s1(i14).M0(Long.valueOf(-u0Var.f11071c));
            u8Var.q(M0);
            k9Var.e(M0, u8Var);
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
        }
        int b10 = u.b(i14, (int) u0Var.f11074g, 3);
        int b11 = u.b(i14, (int) u0Var.f11074g, 4);
        int b12 = u.b(i14, (int) u0Var.f11074g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z13 = u0Var.f11070b;
        String str3 = " ";
        boolean z14 = this.d;
        float f10 = 1.0f;
        yh.l lVar = this.E;
        if (z13 && u0Var.f11074g <= 0) {
            z10 = z14;
        } else {
            if (u0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + u0Var.h));
                z10 = z14;
                wp wpVar = new wp(0, new l0(getContext(), u0Var.h));
                wpVar.f40046s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z14;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, lVar.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i3 = 33;
                spannableStringBuilder.setSpan(new n0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i3 = 33;
            }
            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), i3);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = u.b(i14, (int) u0Var.f11074g, 1);
        int b14 = u.b(i14, (int) u0Var.f11074g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = u0Var.f11073f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = zi.j0(tL_textWithEntities, false, false, lVar.getPaint());
            this.f10749w = j02;
            Typeface typeface = org.telegram.messenger.g0.f22580a;
            if (j02 == null) {
                z11 = true;
                str2 = " ";
                subSequence = null;
            } else {
                int length = j02.length();
                z11 = true;
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
            this.f10749w = subSequence;
            if (subSequence.length() > b13 && !u0Var.f11070b) {
                i12 = 0;
                this.f10749w = this.f10749w.subSequence(0, b13);
            } else {
                i12 = 0;
            }
            CharSequence charSequence = this.f10749w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannable.getSpans(i12, charSequence.length(), org.telegram.ui.Components.p5.class);
                org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spannable.getSpans(i12, this.f10749w.length(), org.telegram.messenger.f6.class);
                if (p5VarArr.length + f6VarArr.length > b14 && !u0Var.f11070b) {
                    ArrayList arrayList = new ArrayList();
                    int i17 = 0;
                    while (i17 < p5VarArr.length) {
                        org.telegram.ui.Components.p5[] p5VarArr2 = p5VarArr;
                        int i18 = i17;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(p5VarArr2[i17])), Integer.valueOf(spannable.getSpanEnd(p5VarArr2[i18]))));
                        i17 = i18 + 1;
                        p5VarArr = p5VarArr2;
                    }
                    int i19 = 0;
                    while (i19 < f6VarArr.length) {
                        int i20 = i19;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(f6VarArr[i19])), Integer.valueOf(spannable.getSpanEnd(f6VarArr[i20]))));
                        i19 = i20 + 1;
                    }
                    Collections.sort(arrayList, new a3.u(13));
                    if (!(this.f10749w instanceof SpannableStringBuilder)) {
                        this.f10749w = new SpannableStringBuilder(this.f10749w);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.f10749w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!u0Var.f11070b) {
                this.f10749w = org.telegram.messenger.g0.N2(this.f10749w);
            }
            spannableStringBuilder.append(this.f10749w);
        } else {
            z11 = true;
            str2 = " ";
            this.f10749w = "";
        }
        lVar.setText(org.telegram.messenger.i6.m(spannableStringBuilder, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.f10744e = null;
        if (u0Var.f11070b && u0Var.f11074g <= 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f10746n.setVisibility(i10);
        long j10 = u0Var.f11074g;
        int i21 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TextView textView = this.G;
        TextView textView2 = this.F;
        if (i21 > 0) {
            if (j10 >= 250) {
                z12 = z11;
            } else {
                z12 = false;
            }
            this.f10741a = z12;
            gbVar.setWillNotDraw(!z12);
            gbVar.invalidate();
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i22 = org.telegram.ui.ActionBar.k6.f27816a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.f10744e = gradientDrawable;
            gbVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.f10744e;
            if (!z10) {
                f10 = 0.65f;
            }
            float f11 = f10;
            this.f10745f = f11;
            drawable2.setAlpha((int) (f11 * 255.0f));
            if (!u0Var.f11072e) {
                textView.setVisibility(0);
                textView.setText(wb.X0(false, k2.p1.l(u0Var.f11074g, ',', new StringBuilder("⭐️ ")), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.k6.r1(0.25f, b12)));
                textView2.setText(wb.X0(false, k2.p1.l(u0Var.f11074g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, org.telegram.messenger.g0.L(0.66f), 1.0f));
                wp wpVar2 = this.H[0];
                if (wpVar2 != null) {
                    wpVar2.f40039a = this.f10742b;
                }
            }
        } else if (u0Var.f11070b) {
            this.f10741a = false;
            gbVar.setWillNotDraw(z11);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), -16777216);
            this.f10744e = d02;
            gbVar.setBackground(d02);
            Drawable drawable3 = this.f10744e;
            this.f10745f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.m5.l(i14, u0Var.f11071c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) bd.M0(2131748833, null));
            spannableStringBuilder2.setSpan(new m0(0), length2, spannableStringBuilder2.length(), 33);
            this.f10747r.setText(spannableStringBuilder2);
            this.f10748s.setText(bd.M0(2131748836, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f10741a = false;
            gbVar.setWillNotDraw(true);
            lVar.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.k6.r1(0.6f, -16777216));
            this.f10744e = null;
            gbVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        gbVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.f10742b = z10;
        wp wpVar = this.H[0];
        if (wpVar != null && wpVar.f40039a != z10) {
            wpVar.f40039a = z10;
            this.F.invalidate();
        }
    }
}
