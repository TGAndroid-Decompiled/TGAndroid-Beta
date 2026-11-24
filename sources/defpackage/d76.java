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
public final class d76 extends FrameLayout implements bs5 {
    public final wla E;
    public final TextView F;
    public final TextView G;
    public final cm2[] H;
    public final cm2[] I;
    public int J;
    public ValueAnimator K;
    public i76 L;
    public final Paint M;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final zf2 h;
    public final LinearLayout n;
    public final wla r;
    public final wla s;
    public CharSequence w;
    public final be0 x;
    public final pb0 y;

    public d76(int i, Context context, boolean z) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.H = new cm2[1];
        this.I = new cm2[1];
        this.M = new Paint(1);
        this.c = i;
        this.d = z;
        zf2 zf2Var = new zf2(this, context);
        this.h = zf2Var;
        zf2Var.setOrientation(0);
        addView(zf2Var, nme.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.y = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.x = be0Var;
        be0Var.setRoundRadius(gl.L(11.0f));
        zf2Var.addView(be0Var, nme.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        zf2Var.addView(linearLayout, nme.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, nme.o(-2, -2));
        wla wlaVar = new wla(context);
        this.r = wlaVar;
        wlaVar.setTextColor(-1);
        wlaVar.setTextSize(1, 14.0f);
        wlaVar.setGravity(3);
        wlaVar.setTypeface(gl.o());
        linearLayout2.addView(wlaVar, nme.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        wla wlaVar2 = new wla(context);
        this.s = wlaVar2;
        wlaVar2.setTextColor(bkb.p1(0.55f, -1));
        wlaVar2.setTextSize(1, 12.0f);
        wlaVar2.setGravity(5);
        linearLayout2.addView(wlaVar2, nme.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        wla wlaVar3 = new wla(context);
        this.E = wlaVar3;
        wlaVar3.setTextColor(-1);
        wlaVar3.setTextSize(1, 14.0f);
        wlaVar3.setShadowLayer(gl.L(2.5f), 0.0f, gl.L(1.5f), bkb.p1(0.6f, -16777216));
        kk7.i(wlaVar3);
        linearLayout.addView(wlaVar3, nme.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gl.L(4.66f), 0, gl.L(4.66f), 0);
        textView.setVisibility(8);
        zf2Var.addView(textView, nme.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        zf2Var.addView(textView2, nme.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
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
        i76 i76Var = this.L;
        if (i76Var != null && this.e != null) {
            this.J = i76Var.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ni4(this, (byte) 20));
            this.K.addListener(new v85(this, (byte) 12));
            this.K.setDuration(350L);
            this.K.setInterpolator(s33.h);
            this.K.start();
        }
    }

    @Override
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void g(Canvas canvas, float f) {
        zf2 zf2Var = this.h;
        if (zf2Var.getBackground() == null) {
            int p1 = bkb.p1(f * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(p1);
            RectF rectF = gl.P;
            rectF.set(zf2Var.getX(), zf2Var.getY(), zf2Var.getX() + zf2Var.getWidth(), zf2Var.getY() + zf2Var.getHeight());
            canvas.drawRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), paint);
        }
        draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(i76 i76Var) {
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
        this.L = i76Var;
        zf2 zf2Var = this.h;
        if ((i76Var == null || this.J != i76Var.a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                zf2Var.invalidate();
            }
        }
        int i5 = (i76Var.c > 0L ? 1 : (i76Var.c == 0L ? 0 : -1));
        be0 be0Var = this.x;
        pb0 pb0Var = this.y;
        int i6 = this.c;
        if (i5 >= 0) {
            TLRPC.User V1 = na7.q1(i6).V1(Long.valueOf(i76Var.c));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
            str = l7c.l(V1);
        } else {
            TLRPC.Chat K0 = na7.q1(i6).K0(Long.valueOf(-i76Var.c));
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
            if (K0 == null) {
                str = "";
            } else {
                str = K0.title;
            }
        }
        int b = de5.b(i6, (int) i76Var.g, 3);
        int b2 = de5.b(i6, (int) i76Var.g, 4);
        int b3 = de5.b(i6, (int) i76Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z4 = i76Var.b;
        String str3 = " ";
        boolean z5 = this.d;
        float f = 1.0f;
        wla wlaVar = this.E;
        if (z4 && i76Var.g <= 0) {
            z = z5;
        } else {
            if (i76Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + i76Var.h));
                z = z5;
                cm2 cm2Var = new cm2(0, new vd1(getContext(), i76Var.h));
                cm2Var.s = gl.L(1.0f);
                spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z = z5;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, wlaVar.getPaint(), gl.L(100.0f), TextUtils.TruncateAt.END));
            if (z) {
                i = 33;
                spannableStringBuilder.setSpan(new b76(), 0, spannableStringBuilder.length(), 33);
            } else {
                i = 33;
            }
            spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), i);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b4 = de5.b(i6, (int) i76Var.g, 1);
        int b5 = de5.b(i6, (int) i76Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = i76Var.f;
        if (tL_textWithEntities != null) {
            CharSequence j0 = k27.j0(tL_textWithEntities, false, false, wlaVar.getPaint());
            this.w = j0;
            Typeface typeface = gl.a;
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
            if (subSequence.length() > b4 && !i76Var.b) {
                i4 = 0;
                this.w = this.w.subSequence(0, b4);
            } else {
                i4 = 0;
            }
            CharSequence charSequence = this.w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                gm[] gmVarArr = (gm[]) spannable.getSpans(i4, charSequence.length(), gm.class);
                su3[] su3VarArr = (su3[]) spannable.getSpans(i4, this.w.length(), su3.class);
                if (gmVarArr.length + su3VarArr.length > b5 && !i76Var.b) {
                    ArrayList arrayList = new ArrayList();
                    int i9 = 0;
                    while (i9 < gmVarArr.length) {
                        gm[] gmVarArr2 = gmVarArr;
                        int i10 = i9;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(gmVarArr2[i9])), Integer.valueOf(spannable.getSpanEnd(gmVarArr2[i10]))));
                        i9 = i10 + 1;
                        gmVarArr = gmVarArr2;
                    }
                    int i11 = 0;
                    while (i11 < su3VarArr.length) {
                        int i12 = i11;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(su3VarArr[i11])), Integer.valueOf(spannable.getSpanEnd(su3VarArr[i12]))));
                        i11 = i12 + 1;
                    }
                    Collections.sort(arrayList, new mz2((byte) 27));
                    if (!(this.w instanceof SpannableStringBuilder)) {
                        this.w = new SpannableStringBuilder(this.w);
                    }
                    for (int size = arrayList.size() - 1; size >= b5; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!i76Var.b) {
                this.w = gl.K2(this.w);
            }
            spannableStringBuilder.append(this.w);
        } else {
            z2 = true;
            str2 = " ";
            this.w = "";
        }
        wlaVar.setText(vu3.m(spannableStringBuilder, wlaVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.e = null;
        if (i76Var.b && i76Var.g <= 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.n.setVisibility(i2);
        long j = i76Var.g;
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
            zf2Var.setWillNotDraw(!z3);
            zf2Var.invalidate();
            wlaVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = gl.L(13.0f);
            int i14 = bkb.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b, b2});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            zf2Var.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            if (!z) {
                f = 0.65f;
            }
            float f2 = f;
            this.f = f2;
            drawable2.setAlpha((int) (f2 * 255.0f));
            if (!i76Var.e) {
                textView.setVisibility(0);
                textView.setText(jva.X0(false, "⭐️ ".concat(k96.E(i76Var.g, ',')), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(bkb.b0(gl.L(13.0f), bkb.p1(0.25f, b3)));
                textView2.setText(jva.X0(false, "⭐️ ".concat(k96.E(i76Var.g, ',')), 0.75f, this.H, gl.L(0.66f), 1.0f));
                cm2 cm2Var2 = this.H[0];
                if (cm2Var2 != null) {
                    cm2Var2.a = this.b;
                }
            }
        } else if (i76Var.b) {
            this.a = false;
            zf2Var.setWillNotDraw(z2);
            ShapeDrawable b0 = bkb.b0(gl.L(13.0f), -16777216);
            this.e = b0;
            zf2Var.setBackground(b0);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha(127);
            wlaVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) cf3.k(i6, i76Var.c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) k96.M0(2131748633, null));
            spannableStringBuilder2.setSpan(new a76((byte) 0), length2, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(k96.M0(2131748636, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            zf2Var.setWillNotDraw(true);
            wlaVar.setShadowLayer(gl.L(2.5f), 0.0f, gl.L(1.5f), bkb.p1(0.6f, -16777216));
            this.e = null;
            zf2Var.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        zf2Var.invalidate();
    }

    public void setDrawStar(boolean z) {
        this.b = z;
        cm2 cm2Var = this.H[0];
        if (cm2Var != null && cm2Var.a != z) {
            cm2Var.a = z;
            this.F.invalidate();
        }
    }

    @Override
    public void setScrimHidden(boolean z) {
        tb4.a(this, z);
    }
}
