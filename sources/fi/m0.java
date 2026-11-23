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
import c8.na;
import di.pb;
import di.za;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.z60;
public final class m0 extends FrameLayout implements z60 {
    public final xh.l E;
    public final TextView F;
    public final TextView G;
    public final nq[] H;
    public final nq[] I;
    public int J;
    public ValueAnimator K;
    public r0 L;
    public final Paint M;
    public boolean f12236a;
    public boolean f12237b;
    public final int f12238c;
    public final boolean d;
    public Drawable f12239e;
    public float f12240f;
    public final za h;
    public final LinearLayout f12241n;
    public final xh.l f12242r;
    public final xh.l f12243s;
    public CharSequence f12244w;
    public final q9 f12245x;
    public final org.telegram.ui.Components.b9 f12246y;

    public m0(int i7, Context context, boolean z10) {
        super(context);
        this.f12236a = false;
        this.f12237b = true;
        this.f12240f = 0.5f;
        this.H = new nq[1];
        this.I = new nq[1];
        this.M = new Paint(1);
        this.f12238c = i7;
        this.d = z10;
        za zaVar = new za(this, context);
        this.h = zaVar;
        zaVar.setOrientation(0);
        addView(zaVar, na.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f12246y = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        q9 q9Var = new q9(context);
        this.f12245x = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        zaVar.addView(q9Var, na.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        zaVar.addView(linearLayout, na.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f12241n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, na.o(-2, -2));
        xh.l lVar = new xh.l(context);
        this.f12242r = lVar;
        lVar.setTextColor(-1);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(3);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(lVar, na.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        xh.l lVar2 = new xh.l(context);
        this.f12243s = lVar2;
        lVar2.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.55f, -1));
        lVar2.setTextSize(1, 12.0f);
        lVar2.setGravity(5);
        linearLayout2.addView(lVar2, na.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        xh.l lVar3 = new xh.l(context);
        this.E = lVar3;
        lVar3.setTextColor(-1);
        lVar3.setTextSize(1, 14.0f);
        lVar3.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.m6.r1(0.6f, -16777216));
        ls.i(lVar3);
        linearLayout.addView(lVar3, na.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        textView.setVisibility(8);
        zaVar.addView(textView, na.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        zaVar.addView(textView2, na.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.f12239e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f12240f * 255.0f));
                this.h.invalidate();
            }
        }
        r0 r0Var = this.L;
        if (r0Var != null && this.f12239e != null) {
            this.J = r0Var.f12478a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 16));
            this.K.addListener(new ai.f0(this, 10));
            this.K.setDuration(350L);
            this.K.setInterpolator(nr.h);
            this.K.start();
        }
    }

    @Override
    public final void f(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        za zaVar = this.h;
        if (zaVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(f10 * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(zaVar.getX(), zaVar.getY(), zaVar.getX() + zaVar.getWidth(), zaVar.getY() + zaVar.getHeight());
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

    public void set(r0 r0Var) {
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
        this.L = r0Var;
        za zaVar = this.h;
        if ((r0Var == null || this.J != r0Var.f12478a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.f12239e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f12240f * 255.0f));
                zaVar.invalidate();
            }
        }
        int i13 = (r0Var.f12480c > 0L ? 1 : (r0Var.f12480c == 0L ? 0 : -1));
        q9 q9Var = this.f12245x;
        org.telegram.ui.Components.b9 b9Var = this.f12246y;
        int i14 = this.f12238c;
        if (i13 >= 0) {
            TLRPC.User c22 = np.u1(i14).c2(Long.valueOf(r0Var.f12480c));
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
            str = p10.l(c22);
        } else {
            TLRPC.Chat O0 = np.u1(i14).O0(Long.valueOf(-r0Var.f12480c));
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
        }
        int b10 = t.b(i14, (int) r0Var.f12483g, 3);
        int b11 = t.b(i14, (int) r0Var.f12483g, 4);
        int b12 = t.b(i14, (int) r0Var.f12483g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z13 = r0Var.f12479b;
        String str3 = " ";
        boolean z14 = this.d;
        float f10 = 1.0f;
        xh.l lVar = this.E;
        if (z13 && r0Var.f12483g <= 0) {
            z10 = z14;
        } else {
            if (r0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + r0Var.h));
                z10 = z14;
                nq nqVar = new nq(0, new i0(getContext(), r0Var.h));
                nqVar.f37908s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z14;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, lVar.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i7 = 33;
                spannableStringBuilder.setSpan(new k0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i7 = 33;
            }
            spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), i7);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = t.b(i14, (int) r0Var.f12483g, 1);
        int b14 = t.b(i14, (int) r0Var.f12483g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = r0Var.f12482f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = gj.j0(tL_textWithEntities, false, false, lVar.getPaint());
            this.f12244w = j02;
            Typeface typeface = org.telegram.messenger.g0.f23982a;
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
            this.f12244w = subSequence;
            if (subSequence.length() > b13 && !r0Var.f12479b) {
                i12 = 0;
                this.f12244w = this.f12244w.subSequence(0, b13);
            } else {
                i12 = 0;
            }
            CharSequence charSequence = this.f12244w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannable.getSpans(i12, charSequence.length(), org.telegram.ui.Components.y5.class);
                org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spannable.getSpans(i12, this.f12244w.length(), org.telegram.messenger.g6.class);
                if (y5VarArr.length + g6VarArr.length > b14 && !r0Var.f12479b) {
                    ArrayList arrayList = new ArrayList();
                    int i17 = 0;
                    while (i17 < y5VarArr.length) {
                        org.telegram.ui.Components.y5[] y5VarArr2 = y5VarArr;
                        int i18 = i17;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(y5VarArr2[i17])), Integer.valueOf(spannable.getSpanEnd(y5VarArr2[i18]))));
                        i17 = i18 + 1;
                        y5VarArr = y5VarArr2;
                    }
                    int i19 = 0;
                    while (i19 < g6VarArr.length) {
                        int i20 = i19;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(g6VarArr[i19])), Integer.valueOf(spannable.getSpanEnd(g6VarArr[i20]))));
                        i19 = i20 + 1;
                    }
                    Collections.sort(arrayList, new a3.c(23));
                    if (!(this.f12244w instanceof SpannableStringBuilder)) {
                        this.f12244w = new SpannableStringBuilder(this.f12244w);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.f12244w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!r0Var.f12479b) {
                this.f12244w = org.telegram.messenger.g0.N2(this.f12244w);
            }
            spannableStringBuilder.append(this.f12244w);
        } else {
            z11 = true;
            str2 = " ";
            this.f12244w = "";
        }
        lVar.setText(org.telegram.messenger.j6.m(spannableStringBuilder, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.f12239e = null;
        if (r0Var.f12479b && r0Var.f12483g <= 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f12241n.setVisibility(i10);
        long j3 = r0Var.f12483g;
        int i21 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TextView textView = this.G;
        TextView textView2 = this.F;
        if (i21 > 0) {
            if (j3 >= 250) {
                z12 = z11;
            } else {
                z12 = false;
            }
            this.f12236a = z12;
            zaVar.setWillNotDraw(!z12);
            zaVar.invalidate();
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i22 = org.telegram.ui.ActionBar.m6.f29282a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.f12239e = gradientDrawable;
            zaVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.f12239e;
            if (!z10) {
                f10 = 0.65f;
            }
            float f11 = f10;
            this.f12240f = f11;
            drawable2.setAlpha((int) (f11 * 255.0f));
            if (!r0Var.f12481e) {
                textView.setVisibility(0);
                textView.setText(pb.Y0(false, i5.c.l(r0Var.f12483g, ',', new StringBuilder("⭐️ ")), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.m6.r1(0.25f, b12)));
                textView2.setText(pb.Y0(false, i5.c.l(r0Var.f12483g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, org.telegram.messenger.g0.L(0.66f), 1.0f));
                nq nqVar2 = this.H[0];
                if (nqVar2 != null) {
                    nqVar2.f37901a = this.f12237b;
                }
            }
        } else if (r0Var.f12479b) {
            this.f12236a = false;
            zaVar.setWillNotDraw(z11);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(13.0f), -16777216);
            this.f12239e = d02;
            zaVar.setBackground(d02);
            Drawable drawable3 = this.f12239e;
            this.f12240f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.n5.l(i14, r0Var.f12480c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) hd.N0(2131748632, null));
            spannableStringBuilder2.setSpan(new j0(0), length2, spannableStringBuilder2.length(), 33);
            this.f12242r.setText(spannableStringBuilder2);
            this.f12243s.setText(hd.N0(2131748635, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f12236a = false;
            zaVar.setWillNotDraw(true);
            lVar.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.m6.r1(0.6f, -16777216));
            this.f12239e = null;
            zaVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        zaVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.f12237b = z10;
        nq nqVar = this.H[0];
        if (nqVar != null && nqVar.f37901a != z10) {
            nqVar.f37901a = z10;
            this.F.invalidate();
        }
    }

    @Override
    public void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }
}
