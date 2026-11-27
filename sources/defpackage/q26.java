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
public class q26 extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Drawable I;
    public hf0 J;
    public final vnb K;
    public final zz3 L;
    public DecimalFormat M;
    public boolean a;
    public final LinearLayout b;
    public u8a[] c;
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

    public q26(Context context, vnb vnbVar) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.w = new SimpleDateFormat("d MMM");
        this.x = new SimpleDateFormat(" HH:mm");
        this.H = true;
        this.L = new zz3(this, (byte) 20);
        this.K = vnbVar;
        setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131231271);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(hl.L(12.0f));
        radialProgressView.setStrokeWidth(hl.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, tre.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, tre.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, tre.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, tre.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, tre.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i = aob.j5;
        TextView textView = this.d;
        vnb vnbVar = this.K;
        yob.X(textView, i, vnbVar);
        yob.X(this.e, i, vnbVar);
        int i2 = aob.Xj;
        yob.s(this.f, i2, vnbVar, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(aob.v0(i2, vnbVar));
        this.I = getContext().getResources().getDrawable(2131232777).mutate();
        int L = hl.L(4.0f);
        this.J = aob.i0(L, L, L, L, aob.v0(aob.h5, vnbVar), aob.v0(aob.i6, vnbVar), -16777216);
        zm2 zm2Var = new zm2(this.I, this.J, hl.L(3.0f), hl.L(3.0f));
        zm2Var.x = true;
        setBackground(zm2Var);
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
            if (((o46) arrayList.get(i11)).n) {
                j2 += ((o46) arrayList.get(i11)).a.a[i];
            }
        }
        int i12 = 0;
        while (i12 < length) {
            u8a u8aVar = this.c[i12];
            int i13 = i12 % 2;
            if (i2 != z4 && i2 != i9) {
                i4 = i12;
            } else {
                i4 = i12 / 2;
            }
            o46 o46Var = (o46) arrayList.get(i4);
            boolean z7 = o46Var.n;
            nk1 nk1Var = o46Var.a;
            if (!z7) {
                ((LinearLayout) u8aVar.d).setVisibility(8);
                z3 = z4;
                i6 = i12;
                i7 = i9;
            } else {
                LinearLayout linearLayout = (LinearLayout) u8aVar.d;
                TextView textView2 = (TextView) u8aVar.b;
                TextView textView3 = (TextView) u8aVar.c;
                gm gmVar = (gm) u8aVar.a;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i10);
                int i14 = i12;
                long j3 = nk1Var.a[i];
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
                        charSequence = ij1.L("TON " + this.M.format(j3 / 1.0E9d), gmVar.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + di0.h().e(((float) j3) / f, "USD");
                    }
                } else if (i2 == 2) {
                    if (i13 == 0) {
                        charSequence = nza.b1(false, "XTR ".concat(ob6.E(j3, ' ')), 0.7f, null);
                    } else {
                        charSequence = "≈" + di0.h().e(((float) j3) / f, "USD");
                    }
                } else {
                    float f2 = (float) j3;
                    if (j3 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j3));
                    } else {
                        int i15 = 0;
                        while (f2 >= 1000.0f && i15 < hl.g0.length - 1) {
                            f2 /= 1000.0f;
                            i15++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f2)) + hl.g0[i15];
                    }
                }
                gmVar.setText(charSequence);
                int i16 = 2131752215;
                if (i2 == 1) {
                    if (i13 == 0) {
                        i16 = 2131752216;
                    }
                    textView2.setText(ob6.a0(null, null, i16, nk1Var.d));
                } else if (i2 == 2) {
                    if (i13 == 0) {
                        i16 = 2131752214;
                    }
                    textView2.setText(nza.b1(false, ob6.a0(null, null, i16, nk1Var.d), 0.7f, null));
                } else {
                    textView2.setText(nk1Var.d);
                }
                int i17 = nk1Var.g;
                vnb vnbVar = this.K;
                if (i17 >= 0 && aob.d1(i17)) {
                    yob.X(gmVar, nk1Var.g, vnbVar);
                } else {
                    xob xobVar = yob.a;
                    gmVar.setTag(2131296711, null);
                    if (aob.B0().o()) {
                        i5 = nk1Var.i;
                    } else {
                        i5 = nk1Var.h;
                    }
                    gmVar.setTextColor(i5);
                }
                int i18 = aob.j5;
                yob.X(textView2, i18, vnbVar);
                if (this.F && textView3 != null) {
                    textView3.setVisibility(0);
                    yob.X(textView3, i18, vnbVar);
                    i6 = i14;
                    float f3 = ((float) ((o46) arrayList.get(i6)).a.a[i]) / ((float) j2);
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
        zz3 zz3Var = this.L;
        if (z) {
            hl.d3(zz3Var, 300L);
            return;
        }
        hl.r(zz3Var);
        RadialProgressView radialProgressView = this.h;
        if (z2) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ad5(this, (byte) 9)).start();
        }
    }

    public void setSize(int i) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new u8a[i];
        for (int i2 = 0; i2 < i; i2++) {
            u8a[] u8aVarArr = this.c;
            ?? obj = new Object();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            obj.d = linearLayout2;
            linearLayout2.setPadding(hl.L(4.0f), hl.L(2.0f), hl.L(4.0f), hl.L(2.0f));
            if (this.F) {
                TextView textView = new TextView(getContext());
                obj.c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = hl.L(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(hl.o());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            obj.b = textView2;
            linearLayout2.addView(textView2, tre.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            gm gmVar = new gm(getContext());
            obj.a = gmVar;
            linearLayout2.addView(gmVar, tre.o(-1, -2));
            textView2.setGravity(8388611);
            gmVar.setGravity(8388613);
            gmVar.setTypeface(hl.o());
            gmVar.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            u8aVarArr[i2] = obj;
            linearLayout.addView((LinearLayout) this.c[i2].d);
        }
    }

    public void setUseWeek(boolean z) {
        this.y = z;
    }
}
