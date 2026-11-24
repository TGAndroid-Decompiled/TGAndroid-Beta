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
public final class d96 extends FrameLayout implements au5 {
    public final xna E;
    public final TextView F;
    public final TextView G;
    public final pn2[] H;
    public final pn2[] I;
    public int J;
    public ValueAnimator K;
    public i96 L;
    public final Paint M;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final nh2 h;
    public final LinearLayout n;
    public final xna r;
    public final xna s;
    public CharSequence w;
    public final bf0 x;
    public final pc0 y;

    public d96(int i, Context context, boolean z) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.H = new pn2[1];
        this.I = new pn2[1];
        this.M = new Paint(1);
        this.c = i;
        this.d = z;
        nh2 nh2Var = new nh2(this, context);
        this.h = nh2Var;
        nh2Var.setOrientation(0);
        addView(nh2Var, qoe.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.y = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.x = bf0Var;
        bf0Var.setRoundRadius(gm.L(11.0f));
        nh2Var.addView(bf0Var, qoe.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        nh2Var.addView(linearLayout, qoe.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, qoe.o(-2, -2));
        xna xnaVar = new xna(context);
        this.r = xnaVar;
        xnaVar.setTextColor(-1);
        xnaVar.setTextSize(1, 14.0f);
        xnaVar.setGravity(3);
        xnaVar.setTypeface(gm.o());
        linearLayout2.addView(xnaVar, qoe.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        xna xnaVar2 = new xna(context);
        this.s = xnaVar2;
        xnaVar2.setTextColor(cmb.p1(0.55f, -1));
        xnaVar2.setTextSize(1, 12.0f);
        xnaVar2.setGravity(5);
        linearLayout2.addView(xnaVar2, qoe.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        xna xnaVar3 = new xna(context);
        this.E = xnaVar3;
        xnaVar3.setTextColor(-1);
        xnaVar3.setTextSize(1, 14.0f);
        xnaVar3.setShadowLayer(gm.L(2.5f), 0.0f, gm.L(1.5f), cmb.p1(0.6f, -16777216));
        nm7.i(xnaVar3);
        linearLayout.addView(xnaVar3, qoe.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gm.L(4.66f), 0, gm.L(4.66f), 0);
        textView.setVisibility(8);
        nh2Var.addView(textView, qoe.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        nh2Var.addView(textView2, qoe.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
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
        i96 i96Var = this.L;
        if (i96Var != null && this.e != null) {
            this.J = i96Var.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new fh4(this, (byte) 22));
            this.K.addListener(new v85(this, (byte) 14));
            this.K.setDuration(350L);
            this.K.setInterpolator(d53.h);
            this.K.start();
        }
    }

    @Override
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void g(Canvas canvas, float f) {
        nh2 nh2Var = this.h;
        if (nh2Var.getBackground() == null) {
            int p1 = cmb.p1(f * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(p1);
            RectF rectF = gm.P;
            rectF.set(nh2Var.getX(), nh2Var.getY(), nh2Var.getX() + nh2Var.getWidth(), nh2Var.getY() + nh2Var.getHeight());
            canvas.drawRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), paint);
        }
        draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(i96 i96Var) {
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
        this.L = i96Var;
        nh2 nh2Var = this.h;
        if ((i96Var == null || this.J != i96Var.a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                nh2Var.invalidate();
            }
        }
        int i5 = (i96Var.c > 0L ? 1 : (i96Var.c == 0L ? 0 : -1));
        bf0 bf0Var = this.x;
        pc0 pc0Var = this.y;
        int i6 = this.c;
        if (i5 >= 0) {
            TLRPC.User W1 = oc7.r1(i6).W1(Long.valueOf(i96Var.c));
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
            str = m9c.l(W1);
        } else {
            TLRPC.Chat L0 = oc7.r1(i6).L0(Long.valueOf(-i96Var.c));
            pc0Var.p(L0);
            bf0Var.f(L0, pc0Var);
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
        }
        int b = bg5.b(i6, (int) i96Var.g, 3);
        int b2 = bg5.b(i6, (int) i96Var.g, 4);
        int b3 = bg5.b(i6, (int) i96Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z4 = i96Var.b;
        String str3 = " ";
        boolean z5 = this.d;
        float f = 1.0f;
        xna xnaVar = this.E;
        if (z4 && i96Var.g <= 0) {
            z = z5;
        } else {
            if (i96Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + i96Var.h));
                z = z5;
                pn2 pn2Var = new pn2(0, new df1(getContext(), i96Var.h));
                pn2Var.s = gm.L(1.0f);
                spannableStringBuilder.setSpan(pn2Var, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z = z5;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, xnaVar.getPaint(), gm.L(100.0f), TextUtils.TruncateAt.END));
            if (z) {
                i = 33;
                spannableStringBuilder.setSpan(new b96(), 0, spannableStringBuilder.length(), 33);
            } else {
                i = 33;
            }
            spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), i);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b4 = bg5.b(i6, (int) i96Var.g, 1);
        int b5 = bg5.b(i6, (int) i96Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = i96Var.f;
        if (tL_textWithEntities != null) {
            CharSequence j0 = k47.j0(tL_textWithEntities, false, false, xnaVar.getPaint());
            this.w = j0;
            Typeface typeface = gm.a;
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
            if (subSequence.length() > b4 && !i96Var.b) {
                i4 = 0;
                this.w = this.w.subSequence(0, b4);
            } else {
                i4 = 0;
            }
            CharSequence charSequence = this.w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                gn[] gnVarArr = (gn[]) spannable.getSpans(i4, charSequence.length(), gn.class);
                dw3[] dw3VarArr = (dw3[]) spannable.getSpans(i4, this.w.length(), dw3.class);
                if (gnVarArr.length + dw3VarArr.length > b5 && !i96Var.b) {
                    ArrayList arrayList = new ArrayList();
                    int i9 = 0;
                    while (i9 < gnVarArr.length) {
                        gn[] gnVarArr2 = gnVarArr;
                        int i10 = i9;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(gnVarArr2[i9])), Integer.valueOf(spannable.getSpanEnd(gnVarArr2[i10]))));
                        i9 = i10 + 1;
                        gnVarArr = gnVarArr2;
                    }
                    int i11 = 0;
                    while (i11 < dw3VarArr.length) {
                        int i12 = i11;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(dw3VarArr[i11])), Integer.valueOf(spannable.getSpanEnd(dw3VarArr[i12]))));
                        i11 = i12 + 1;
                    }
                    Collections.sort(arrayList, new x03((byte) 28));
                    if (!(this.w instanceof SpannableStringBuilder)) {
                        this.w = new SpannableStringBuilder(this.w);
                    }
                    for (int size = arrayList.size() - 1; size >= b5; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!i96Var.b) {
                this.w = gm.J2(this.w);
            }
            spannableStringBuilder.append(this.w);
        } else {
            z2 = true;
            str2 = " ";
            this.w = "";
        }
        xnaVar.setText(gw3.m(spannableStringBuilder, xnaVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.e = null;
        if (i96Var.b && i96Var.g <= 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.n.setVisibility(i2);
        long j = i96Var.g;
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
            nh2Var.setWillNotDraw(!z3);
            nh2Var.invalidate();
            xnaVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = gm.L(13.0f);
            int i14 = cmb.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b, b2});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            nh2Var.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            if (!z) {
                f = 0.65f;
            }
            float f2 = f;
            this.f = f2;
            drawable2.setAlpha((int) (f2 * 255.0f));
            if (!i96Var.e) {
                textView.setVisibility(0);
                textView.setText(nxa.Y0(false, "⭐️ ".concat(jb6.E(i96Var.g, ',')), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(cmb.b0(gm.L(13.0f), cmb.p1(0.25f, b3)));
                textView2.setText(nxa.Y0(false, "⭐️ ".concat(jb6.E(i96Var.g, ',')), 0.75f, this.H, gm.L(0.66f), 1.0f));
                pn2 pn2Var2 = this.H[0];
                if (pn2Var2 != null) {
                    pn2Var2.a = this.b;
                }
            }
        } else if (i96Var.b) {
            this.a = false;
            nh2Var.setWillNotDraw(z2);
            ShapeDrawable b0 = cmb.b0(gm.L(13.0f), -16777216);
            this.e = b0;
            nh2Var.setBackground(b0);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha(127);
            xnaVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) pg3.k(i6, i96Var.c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) jb6.M0(2131748582, null));
            spannableStringBuilder2.setSpan(new a96((byte) 0), length2, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(jb6.M0(2131748585, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            nh2Var.setWillNotDraw(true);
            xnaVar.setShadowLayer(gm.L(2.5f), 0.0f, gm.L(1.5f), cmb.p1(0.6f, -16777216));
            this.e = null;
            nh2Var.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        nh2Var.invalidate();
    }

    public void setDrawStar(boolean z) {
        this.b = z;
        pn2 pn2Var = this.H[0];
        if (pn2Var != null && pn2Var.a != z) {
            pn2Var.a = z;
            this.F.invalidate();
        }
    }

    @Override
    public void setScrimHidden(boolean z) {
        td4.a(this, z);
    }
}
