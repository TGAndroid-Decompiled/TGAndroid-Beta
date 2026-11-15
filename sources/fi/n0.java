package fi;

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
import c8.ja;
import di.mb;
import di.wa;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.y31;
public final class n0 extends FrameLayout implements l60 {
    public final xh.l E;
    public final TextView F;
    public final TextView G;
    public final eq[] H;
    public final eq[] I;
    public int J;
    public ValueAnimator K;
    public s0 L;
    public final Paint M;
    public boolean f12050a;
    public boolean f12051b;
    public final int f12052c;
    public final boolean d;
    public Drawable f12053e;
    public float f12054f;
    public final wa h;
    public final LinearLayout f12055n;
    public final xh.l f12056r;
    public final xh.l f12057s;
    public CharSequence f12058w;
    public final org.telegram.ui.Components.i9 f12059x;
    public final org.telegram.ui.Components.t8 f12060y;

    public n0(int i7, Context context, boolean z10) {
        super(context);
        this.f12050a = false;
        this.f12051b = true;
        this.f12054f = 0.5f;
        this.H = new eq[1];
        this.I = new eq[1];
        this.M = new Paint(1);
        this.f12052c = i7;
        this.d = z10;
        wa waVar = new wa(this, context);
        this.h = waVar;
        waVar.setOrientation(0);
        addView(waVar, ja.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f12060y = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f12059x = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        waVar.addView(i9Var, ja.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        waVar.addView(linearLayout, ja.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f12055n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, ja.o(-2, -2));
        xh.l lVar = new xh.l(context);
        this.f12056r = lVar;
        lVar.setTextColor(-1);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(3);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(lVar, ja.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        xh.l lVar2 = new xh.l(context);
        this.f12057s = lVar2;
        lVar2.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.55f, -1));
        lVar2.setTextSize(1, 12.0f);
        lVar2.setGravity(5);
        linearLayout2.addView(lVar2, ja.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        xh.l lVar3 = new xh.l(context);
        this.E = lVar3;
        lVar3.setTextColor(-1);
        lVar3.setTextSize(1, 14.0f);
        lVar3.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.j6.r1(0.6f, -16777216));
        ns.i(lVar3);
        linearLayout.addView(lVar3, ja.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        textView.setVisibility(8);
        waVar.addView(textView, ja.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        waVar.addView(textView2, ja.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.f12053e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f12054f * 255.0f));
                this.h.invalidate();
            }
        }
        s0 s0Var = this.L;
        if (s0Var != null && this.f12053e != null) {
            this.J = s0Var.f12297a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 16));
            this.K.addListener(new ai.i0(this, 10));
            this.K.setDuration(350L);
            this.K.setInterpolator(er.h);
            this.K.start();
        }
    }

    @Override
    public final void f(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        wa waVar = this.h;
        if (waVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.j6.r1(f10 * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(waVar.getX(), waVar.getY(), waVar.getX() + waVar.getWidth(), waVar.getY() + waVar.getHeight());
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
        boolean z10;
        int i7;
        boolean z11;
        String str2;
        int i10;
        boolean z12;
        int i11;
        CharSequence subSequence;
        int i12;
        this.L = s0Var;
        wa waVar = this.h;
        if ((s0Var == null || this.J != s0Var.f12297a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.f12053e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f12054f * 255.0f));
                waVar.invalidate();
            }
        }
        int i13 = (s0Var.f12299c > 0L ? 1 : (s0Var.f12299c == 0L ? 0 : -1));
        org.telegram.ui.Components.i9 i9Var = this.f12059x;
        org.telegram.ui.Components.t8 t8Var = this.f12060y;
        int i14 = this.f12052c;
        if (i13 >= 0) {
            TLRPC.User a22 = np.s1(i14).a2(Long.valueOf(s0Var.f12299c));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
            str = q10.k(a22);
        } else {
            TLRPC.Chat M0 = np.s1(i14).M0(Long.valueOf(-s0Var.f12299c));
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
        }
        int b10 = t.b(i14, (int) s0Var.f12302g, 3);
        int b11 = t.b(i14, (int) s0Var.f12302g, 4);
        int b12 = t.b(i14, (int) s0Var.f12302g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z13 = s0Var.f12298b;
        String str3 = " ";
        boolean z14 = this.d;
        float f10 = 1.0f;
        xh.l lVar = this.E;
        if (z13 && s0Var.f12302g <= 0) {
            z10 = z14;
        } else {
            if (s0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + s0Var.h));
                z10 = z14;
                eq eqVar = new eq(0, new j0(getContext(), s0Var.h));
                eqVar.f34416s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z14;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, lVar.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i7 = 33;
                spannableStringBuilder.setSpan(new l0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i7 = 33;
            }
            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), i7);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = t.b(i14, (int) s0Var.f12302g, 1);
        int b14 = t.b(i14, (int) s0Var.f12302g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = s0Var.f12301f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = gj.j0(tL_textWithEntities, false, false, lVar.getPaint());
            this.f12058w = j02;
            Typeface typeface = org.telegram.messenger.g0.f23581a;
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
            this.f12058w = subSequence;
            if (subSequence.length() > b13 && !s0Var.f12298b) {
                i12 = 0;
                this.f12058w = this.f12058w.subSequence(0, b13);
            } else {
                i12 = 0;
            }
            CharSequence charSequence = this.f12058w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannable.getSpans(i12, charSequence.length(), org.telegram.ui.Components.p5.class);
                org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spannable.getSpans(i12, this.f12058w.length(), org.telegram.messenger.g6.class);
                if (p5VarArr.length + g6VarArr.length > b14 && !s0Var.f12298b) {
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
                    while (i19 < g6VarArr.length) {
                        int i20 = i19;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(g6VarArr[i19])), Integer.valueOf(spannable.getSpanEnd(g6VarArr[i20]))));
                        i19 = i20 + 1;
                    }
                    Collections.sort(arrayList, new a3.c(23));
                    if (!(this.f12058w instanceof SpannableStringBuilder)) {
                        this.f12058w = new SpannableStringBuilder(this.f12058w);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.f12058w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!s0Var.f12298b) {
                this.f12058w = org.telegram.messenger.g0.N2(this.f12058w);
            }
            spannableStringBuilder.append(this.f12058w);
        } else {
            z11 = true;
            str2 = " ";
            this.f12058w = "";
        }
        lVar.setText(org.telegram.messenger.j6.m(spannableStringBuilder, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.f12053e = null;
        if (s0Var.f12298b && s0Var.f12302g <= 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f12055n.setVisibility(i10);
        long j3 = s0Var.f12302g;
        int i21 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TextView textView = this.G;
        TextView textView2 = this.F;
        if (i21 > 0) {
            if (j3 >= 250) {
                z12 = z11;
            } else {
                z12 = false;
            }
            this.f12050a = z12;
            waVar.setWillNotDraw(!z12);
            waVar.invalidate();
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i22 = org.telegram.ui.ActionBar.j6.f28784a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.f12053e = gradientDrawable;
            waVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.f12053e;
            if (!z10) {
                f10 = 0.65f;
            }
            float f11 = f10;
            this.f12054f = f11;
            drawable2.setAlpha((int) (f11 * 255.0f));
            if (!s0Var.f12300e) {
                textView.setVisibility(0);
                textView.setText(mb.X0(false, i5.c.l(s0Var.f12302g, ',', new StringBuilder("⭐️ ")), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.j6.r1(0.25f, b12)));
                textView2.setText(mb.X0(false, i5.c.l(s0Var.f12302g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, org.telegram.messenger.g0.L(0.66f), 1.0f));
                eq eqVar2 = this.H[0];
                if (eqVar2 != null) {
                    eqVar2.f34409a = this.f12051b;
                }
            }
        } else if (s0Var.f12298b) {
            this.f12050a = false;
            waVar.setWillNotDraw(z11);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(13.0f), -16777216);
            this.f12053e = d02;
            waVar.setBackground(d02);
            Drawable drawable3 = this.f12053e;
            this.f12054f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.m5.l(i14, s0Var.f12299c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) hd.M0(2131748825, null));
            spannableStringBuilder2.setSpan(new k0(0), length2, spannableStringBuilder2.length(), 33);
            this.f12056r.setText(spannableStringBuilder2);
            this.f12057s.setText(hd.M0(2131748828, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f12050a = false;
            waVar.setWillNotDraw(true);
            lVar.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.j6.r1(0.6f, -16777216));
            this.f12053e = null;
            waVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        waVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.f12051b = z10;
        eq eqVar = this.H[0];
        if (eqVar != null && eqVar.f34409a != z10) {
            eqVar.f34409a = z10;
            this.F.invalidate();
        }
    }
}
