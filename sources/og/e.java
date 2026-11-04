package og;

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
import b8.mf;
import ci.wb;
import ii.v3;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import k2.p1;
import mi.b0;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.r1;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.xp;
import org.telegram.ui.xd;
import za.p;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Drawable I;
    public y J;
    public final e6 K;
    public final b0 L;
    public DecimalFormat M;
    public boolean f21074a;
    public final LinearLayout f21075b;
    public p[] f21076c;
    public final TextView d;
    public final TextView f21077e;
    public final ImageView f21078f;
    public final RadialProgressView h;
    public final SimpleDateFormat f21079n;
    public final SimpleDateFormat f21080r;
    public final SimpleDateFormat f21081s;
    public final SimpleDateFormat f21082w;
    public final SimpleDateFormat f21083x;
    public boolean f21084y;

    public e(Context context, e6 e6Var) {
        super(context);
        this.f21079n = new SimpleDateFormat("E, ");
        this.f21080r = new SimpleDateFormat("MMM dd");
        this.f21081s = new SimpleDateFormat("d MMM yyyy");
        this.f21082w = new SimpleDateFormat("d MMM");
        this.f21083x = new SimpleDateFormat(" HH:mm");
        this.H = true;
        this.L = new b0(this, 2);
        this.K = e6Var;
        setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f21075b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(g0.o());
        TextView textView2 = new TextView(context);
        this.f21077e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f21078f = imageView;
        imageView.setImageResource(2131231268);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(g0.L(12.0f));
        radialProgressView.setStrokeWidth(g0.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, mf.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, mf.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, mf.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, mf.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, mf.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i3 = k6.f27988j5;
        TextView textView = this.d;
        e6 e6Var = this.K;
        r6.V(textView, i3, e6Var);
        r6.V(this.f21077e, i3, e6Var);
        int i10 = k6.Uj;
        r6.t(this.f21078f, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(k6.w0(i10, e6Var));
        this.I = getContext().getResources().getDrawable(2131232752).mutate();
        int L = g0.L(4.0f);
        this.J = k6.k0(L, L, L, L, k6.w0(k6.f27954h5, e6Var), k6.w0(k6.f27972i6, e6Var), -16777216);
        xp xpVar = new xp(this.I, this.J, g0.L(3.0f), g0.L(3.0f));
        xpVar.f40447x = true;
        setBackground(xpVar);
    }

    public final void c(int i3, long j10, ArrayList arrayList, boolean z10, int i10, float f10) {
        String str;
        boolean z11;
        int i11;
        int i12;
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int length = this.f21076c.length;
        int i17 = 2;
        boolean z13 = true;
        int i18 = 0;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z14 = this.f21074a;
        TextView textView = this.d;
        if (z14) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j10)));
        } else {
            if (this.f21084y) {
                textView.setText(this.f21082w.format(new Date(j10)) + " — " + this.f21081s.format(new Date(604800000 + j10)));
            } else {
                Date date = new Date(j10);
                boolean z15 = this.E;
                SimpleDateFormat simpleDateFormat = this.f21080r;
                if (z15) {
                    str = a(simpleDateFormat.format(date));
                } else {
                    str = a(this.f21079n.format(date)) + a(simpleDateFormat.format(date));
                }
                textView.setText(str);
            }
            if (this.E) {
                this.f21077e.setText(this.f21083x.format(Long.valueOf(j10)));
            }
        }
        long j11 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((f) arrayList.get(i19)).f21096n) {
                j11 += ((f) arrayList.get(i19)).f21085a.f20366a[i3];
            }
        }
        int i20 = 0;
        while (i20 < length) {
            p pVar = this.f21076c[i20];
            int i21 = i20 % 2;
            if (i10 != z13 && i10 != i17) {
                i12 = i20;
            } else {
                i12 = i20 / 2;
            }
            f fVar = (f) arrayList.get(i12);
            boolean z16 = fVar.f21096n;
            ng.a aVar = fVar.f21085a;
            if (!z16) {
                ((LinearLayout) pVar.d).setVisibility(8);
                z12 = z13;
                i14 = i20;
                i15 = i17;
            } else {
                LinearLayout linearLayout = (LinearLayout) pVar.d;
                TextView textView2 = (TextView) pVar.f60313c;
                TextView textView3 = (TextView) pVar.f60312b;
                o5 o5Var = (o5) pVar.f60311a;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i18);
                int i22 = i20;
                long j12 = aVar.f20366a[i3];
                if (i10 == z13) {
                    if (i21 == 0) {
                        if (this.M == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.M = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i16 = 6;
                            this.M.setMaximumFractionDigits(6);
                            this.M.setGroupingUsed(false);
                        } else {
                            i16 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.M;
                        if (j12 > 1000000000) {
                            i16 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i16);
                        charSequence = xd.K("TON " + this.M.format(j12 / 1.0E9d), o5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + r1.i().f(((float) j12) / f10, "USD");
                    }
                } else if (i10 == 2) {
                    if (i21 == 0) {
                        charSequence = wb.a1(false, p1.l(j12, ' ', new StringBuilder("XTR ")), 0.7f, null);
                    } else {
                        charSequence = "≈" + r1.i().f(((float) j12) / f10, "USD");
                    }
                } else {
                    float f11 = (float) j12;
                    if (j12 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j12));
                    } else {
                        int i23 = 0;
                        while (f11 >= 1000.0f && i23 < g0.f22592g0.length - 1) {
                            f11 /= 1000.0f;
                            i23++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f11)) + g0.f22592g0[i23];
                    }
                }
                o5Var.setText(charSequence);
                int i24 = 2131752250;
                if (i10 == 1) {
                    if (i21 == 0) {
                        i24 = 2131752251;
                    }
                    textView3.setText(bd.a0(null, null, i24, aVar.d));
                } else if (i10 == 2) {
                    if (i21 == 0) {
                        i24 = 2131752249;
                    }
                    textView3.setText(wb.a1(false, bd.a0(null, null, i24, aVar.d), 0.7f, null));
                } else {
                    textView3.setText(aVar.d);
                }
                int i25 = aVar.f20371g;
                e6 e6Var = this.K;
                if (i25 >= 0 && k6.f1(i25)) {
                    r6.V(o5Var, aVar.f20371g, e6Var);
                } else {
                    q6 q6Var = r6.f28514a;
                    o5Var.setTag(2131296709, null);
                    if (k6.D0().q()) {
                        i13 = aVar.f20372i;
                    } else {
                        i13 = aVar.h;
                    }
                    o5Var.setTextColor(i13);
                }
                int i26 = k6.f27988j5;
                r6.V(textView3, i26, e6Var);
                if (this.F && textView2 != null) {
                    textView2.setVisibility(0);
                    r6.V(textView2, i26, e6Var);
                    i14 = i22;
                    float f12 = ((float) ((f) arrayList.get(i14)).f21085a.f20366a[i3]) / ((float) j11);
                    if (f12 < 0.1f && f12 != 0.0f) {
                        i15 = 2;
                        z12 = true;
                        textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 * 100.0f), "%"));
                    } else {
                        i15 = 2;
                        z12 = true;
                        Locale locale = Locale.ENGLISH;
                        textView2.setText(Math.round(f12 * 100.0f) + "%");
                    }
                } else {
                    i14 = i22;
                    i15 = 2;
                    z12 = true;
                }
            }
            int i27 = i14 + 1;
            i17 = i15;
            z13 = z12;
            i18 = 0;
            i20 = i27;
        }
        boolean z17 = z13;
        boolean z18 = this.G;
        ImageView imageView = this.f21078f;
        if (z18) {
            int i28 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i28 > 0) {
                z11 = z17;
            } else {
                z11 = false;
            }
            this.H = z11;
            if (i28 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            return;
        }
        this.H = false;
        imageView.setVisibility(8);
    }

    public final void d(boolean z10, boolean z11) {
        b0 b0Var = this.L;
        if (z10) {
            g0.i3(b0Var, 300L);
            return;
        }
        g0.r(b0Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f21078f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new v3(this, 4)).start();
        }
    }

    public void setSize(int i3) {
        LinearLayout linearLayout = this.f21075b;
        linearLayout.removeAllViews();
        this.f21076c = new p[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            p[] pVarArr = this.f21076c;
            ?? obj = new Object();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            obj.d = linearLayout2;
            linearLayout2.setPadding(g0.L(4.0f), g0.L(2.0f), g0.L(4.0f), g0.L(2.0f));
            if (this.F) {
                TextView textView = new TextView(getContext());
                obj.f60313c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = g0.L(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(g0.o());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            obj.f60312b = textView2;
            linearLayout2.addView(textView2, mf.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            o5 o5Var = new o5(getContext());
            obj.f60311a = o5Var;
            linearLayout2.addView(o5Var, mf.o(-1, -2));
            textView2.setGravity(8388611);
            o5Var.setGravity(8388613);
            o5Var.setTypeface(g0.o());
            o5Var.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            pVarArr[i10] = obj;
            linearLayout.addView((LinearLayout) this.f21076c[i10].d);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f21084y = z10;
    }
}
