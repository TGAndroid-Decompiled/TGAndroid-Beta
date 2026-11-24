package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.ui.Components.RadialProgressView;
public class m06 extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Drawable I;
    public ff0 J;
    public final wjb K;
    public final ez3 L;
    public DecimalFormat M;
    public boolean a;
    public final LinearLayout b;
    public wtc[] c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final RadialProgressView h;
    public final SimpleDateFormat n;
    public final SimpleDateFormat r;
    public final SimpleDateFormat s;
    public final SimpleDateFormat w;
    public final SimpleDateFormat x;
    public boolean y;

    public m06(Context context, wjb wjbVar) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.w = new SimpleDateFormat("d MMM");
        this.x = new SimpleDateFormat(" HH:mm");
        this.H = true;
        this.L = new ez3(this, (byte) 20);
        this.K = wjbVar;
        setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131231271);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(gl.L(12.0f));
        radialProgressView.setStrokeWidth(gl.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, nme.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, nme.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, nme.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, nme.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, nme.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i = bkb.i5;
        TextView textView = this.d;
        wjb wjbVar = this.K;
        zkb.X(textView, i, wjbVar);
        zkb.X(this.e, i, wjbVar);
        int i2 = bkb.Wj;
        zkb.s(this.f, i2, wjbVar, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(bkb.v0(i2, wjbVar));
        this.I = getContext().getResources().getDrawable(2131232759).mutate();
        int L = gl.L(4.0f);
        this.J = bkb.i0(L, L, L, L, bkb.v0(bkb.g5, wjbVar), bkb.v0(bkb.h6, wjbVar), -16777216);
        fm2 fm2Var = new fm2(this.I, this.J, gl.L(3.0f), gl.L(3.0f));
        fm2Var.x = true;
        setBackground(fm2Var);
    }

    public final void c(int i, long j, ArrayList arrayList, boolean z, int i2, float f) {
        String concat;
        boolean z2;
        int i3;
        int i4;
        CharSequence charSequence;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int length = this.c.length;
        int i9 = 2;
        boolean z4 = true;
        int i10 = 0;
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z5 = this.a;
        TextView textView = this.d;
        if (z5) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j)));
        } else {
            if (this.y) {
                textView.setText(this.w.format(new Date(j)) + " — " + this.s.format(new Date(604800000 + j)));
            } else {
                Date date = new Date(j);
                boolean z6 = this.E;
                SimpleDateFormat simpleDateFormat = this.r;
                if (z6) {
                    concat = a(simpleDateFormat.format(date));
                } else {
                    concat = a(this.n.format(date)).concat(a(simpleDateFormat.format(date)));
                }
                textView.setText(concat);
            }
            if (this.E) {
                this.e.setText(this.x.format(Long.valueOf(j)));
            }
        }
        long j2 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((k26) arrayList.get(i11)).n) {
                j2 += ((k26) arrayList.get(i11)).a.a[i];
            }
        }
        int i12 = 0;
        while (i12 < length) {
            wtc wtcVar = this.c[i12];
            int i13 = i12 % 2;
            if (i2 != z4 && i2 != i9) {
                i4 = i12;
            } else {
                i4 = i12 / 2;
            }
            k26 k26Var = (k26) arrayList.get(i4);
            boolean z7 = k26Var.n;
            ek1 ek1Var = k26Var.a;
            if (!z7) {
                ((LinearLayout) wtcVar.d).setVisibility(8);
                z3 = z4;
                i6 = i12;
                i7 = i9;
            } else {
                LinearLayout linearLayout = (LinearLayout) wtcVar.d;
                TextView textView2 = (TextView) wtcVar.b;
                TextView textView3 = (TextView) wtcVar.c;
                fm fmVar = (fm) wtcVar.a;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i10);
                int i14 = i12;
                long j3 = ek1Var.a[i];
                if (i2 == z4) {
                    if (i13 == 0) {
                        if (this.M == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.M = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i8 = 6;
                            this.M.setMaximumFractionDigits(6);
                            this.M.setGroupingUsed(false);
                        } else {
                            i8 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.M;
                        if (j3 > 1000000000) {
                            i8 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i8);
                        charSequence = zi1.L("TON " + this.M.format(j3 / 1.0E9d), fmVar.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + ci0.h().e(((float) j3) / f, "USD");
                    }
                } else if (i2 == 2) {
                    if (i13 == 0) {
                        charSequence = jva.a1(false, "XTR ".concat(k96.E(j3, ' ')), 0.7f, null);
                    } else {
                        charSequence = "≈" + ci0.h().e(((float) j3) / f, "USD");
                    }
                } else {
                    float f2 = (float) j3;
                    if (j3 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j3));
                    } else {
                        int i15 = 0;
                        while (f2 >= 1000.0f && i15 < gl.g0.length - 1) {
                            f2 /= 1000.0f;
                            i15++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f2)) + gl.g0[i15];
                    }
                }
                fmVar.setText(charSequence);
                int i16 = 2131752238;
                if (i2 == 1) {
                    if (i13 == 0) {
                        i16 = 2131752239;
                    }
                    textView2.setText(k96.a0(null, null, i16, ek1Var.d));
                } else if (i2 == 2) {
                    if (i13 == 0) {
                        i16 = 2131752237;
                    }
                    textView2.setText(jva.a1(false, k96.a0(null, null, i16, ek1Var.d), 0.7f, null));
                } else {
                    textView2.setText(ek1Var.d);
                }
                int i17 = ek1Var.g;
                wjb wjbVar = this.K;
                if (i17 >= 0 && bkb.d1(i17)) {
                    zkb.X(fmVar, ek1Var.g, wjbVar);
                } else {
                    ykb ykbVar = zkb.a;
                    fmVar.setTag(2131296711, null);
                    if (bkb.B0().o()) {
                        i5 = ek1Var.i;
                    } else {
                        i5 = ek1Var.h;
                    }
                    fmVar.setTextColor(i5);
                }
                int i18 = bkb.i5;
                zkb.X(textView2, i18, wjbVar);
                if (this.F && textView3 != null) {
                    textView3.setVisibility(0);
                    zkb.X(textView3, i18, wjbVar);
                    i6 = i14;
                    float f3 = ((float) ((k26) arrayList.get(i6)).a.a[i]) / ((float) j2);
                    if (f3 < 0.1f && f3 != 0.0f) {
                        i7 = 2;
                        z3 = true;
                        textView3.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f3 * 100.0f), "%"));
                    } else {
                        i7 = 2;
                        z3 = true;
                        Locale locale = Locale.ENGLISH;
                        textView3.setText(Math.round(f3 * 100.0f) + "%");
                    }
                } else {
                    i6 = i14;
                    i7 = 2;
                    z3 = true;
                }
            }
            int i19 = i6 + 1;
            i9 = i7;
            z4 = z3;
            i10 = 0;
            i12 = i19;
        }
        boolean z8 = z4;
        boolean z9 = this.G;
        ImageView imageView = this.f;
        if (z9) {
            int i20 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i20 > 0) {
                z2 = z8;
            } else {
                z2 = false;
            }
            this.H = z2;
            if (i20 > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
            return;
        }
        this.H = false;
        imageView.setVisibility(8);
    }

    public final void d(boolean z, boolean z2) {
        ez3 ez3Var = this.L;
        if (z) {
            gl.e3(ez3Var, 300L);
            return;
        }
        gl.r(ez3Var);
        RadialProgressView radialProgressView = this.h;
        if (z2) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new v85(this, (byte) 10)).start();
        }
    }

    public void setSize(int i) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new wtc[i];
        for (int i2 = 0; i2 < i; i2++) {
            wtc[] wtcVarArr = this.c;
            ?? obj = new Object();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            obj.d = linearLayout2;
            linearLayout2.setPadding(gl.L(4.0f), gl.L(2.0f), gl.L(4.0f), gl.L(2.0f));
            if (this.F) {
                TextView textView = new TextView(getContext());
                obj.c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = gl.L(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(gl.o());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            obj.b = textView2;
            linearLayout2.addView(textView2, nme.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            fm fmVar = new fm(getContext());
            obj.a = fmVar;
            linearLayout2.addView(fmVar, nme.o(-1, -2));
            textView2.setGravity(8388611);
            fmVar.setGravity(8388613);
            fmVar.setTypeface(gl.o());
            fmVar.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            wtcVarArr[i2] = obj;
            linearLayout.addView((LinearLayout) this.c[i2].d);
        }
    }

    public void setUseWeek(boolean z) {
        this.y = z;
    }
}
