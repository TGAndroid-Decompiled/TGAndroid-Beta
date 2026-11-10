package ng;

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
import bi.dd;
import c8.ha;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import m.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.r1;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xp;
import org.telegram.ui.zd;
public class e extends FrameLayout {
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public y I;
    public final h6 J;
    public final f3 K;
    public DecimalFormat L;
    public boolean f20562a;
    public final LinearLayout f20563b;
    public ui.e[] f20564c;
    public final TextView d;
    public final TextView f20565e;
    public final ImageView f20566f;
    public final RadialProgressView h;
    public final SimpleDateFormat f20567n;
    public final SimpleDateFormat f20568r;
    public final SimpleDateFormat f20569s;
    public final SimpleDateFormat f20570w;
    public final SimpleDateFormat f20571x;
    public boolean f20572y;

    public e(Context context, h6 h6Var) {
        super(context);
        this.f20567n = new SimpleDateFormat("E, ");
        this.f20568r = new SimpleDateFormat("MMM dd");
        this.f20569s = new SimpleDateFormat("d MMM yyyy");
        this.f20570w = new SimpleDateFormat("d MMM");
        this.f20571x = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new f3(this, 2);
        this.J = h6Var;
        setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f20563b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(g0.o());
        TextView textView2 = new TextView(context);
        this.f20565e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f20566f = imageView;
        imageView.setImageResource(2131231268);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(g0.L(12.0f));
        radialProgressView.setStrokeWidth(g0.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, ha.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, ha.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, ha.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, ha.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, ha.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i7 = m6.f27998j5;
        TextView textView = this.d;
        h6 h6Var = this.J;
        t6.U(textView, i7, h6Var);
        t6.U(this.f20565e, i7, h6Var);
        int i10 = m6.Uj;
        t6.s(this.f20566f, i10, h6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(m6.w0(i10, h6Var));
        this.H = getContext().getResources().getDrawable(2131232754).mutate();
        int L = g0.L(4.0f);
        this.I = m6.k0(L, L, L, L, m6.w0(m6.f27963h5, h6Var), m6.w0(m6.f27982i6, h6Var), -16777216);
        xp xpVar = new xp(this.H, this.I, g0.L(3.0f), g0.L(3.0f));
        xpVar.f40383x = true;
        setBackground(xpVar);
    }

    public final void c(int i7, long j3, ArrayList arrayList, boolean z9, int i10, float f10) {
        String str;
        boolean z10;
        int i11;
        int i12;
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int length = this.f20564c.length;
        int i17 = 2;
        boolean z12 = true;
        int i18 = 0;
        if (z9) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z13 = this.f20562a;
        TextView textView = this.d;
        if (z13) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j3)));
        } else {
            if (this.f20572y) {
                textView.setText(this.f20570w.format(new Date(j3)) + " — " + this.f20569s.format(new Date(604800000 + j3)));
            } else {
                Date date = new Date(j3);
                boolean z14 = this.D;
                SimpleDateFormat simpleDateFormat = this.f20568r;
                if (z14) {
                    str = a(simpleDateFormat.format(date));
                } else {
                    str = a(this.f20567n.format(date)) + a(simpleDateFormat.format(date));
                }
                textView.setText(str);
            }
            if (this.D) {
                this.f20565e.setText(this.f20571x.format(Long.valueOf(j3)));
            }
        }
        long j10 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((f) arrayList.get(i19)).f20584n) {
                j10 += ((f) arrayList.get(i19)).f20573a.f20021a[i7];
            }
        }
        int i20 = 0;
        while (i20 < length) {
            ui.e eVar = this.f20564c[i20];
            int i21 = i20 % 2;
            if (i10 != z12 && i10 != i17) {
                i12 = i20;
            } else {
                i12 = i20 / 2;
            }
            f fVar = (f) arrayList.get(i12);
            boolean z15 = fVar.f20584n;
            mg.a aVar = fVar.f20573a;
            if (!z15) {
                ((LinearLayout) eVar.f56941e).setVisibility(8);
                z11 = z12;
                i14 = i20;
                i15 = i17;
            } else {
                LinearLayout linearLayout = (LinearLayout) eVar.f56941e;
                TextView textView2 = (TextView) eVar.d;
                TextView textView3 = (TextView) eVar.f56940c;
                p5 p5Var = (p5) eVar.f56939b;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i18);
                int i22 = i20;
                long j11 = aVar.f20021a[i7];
                if (i10 == z12) {
                    if (i21 == 0) {
                        if (this.L == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.L = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i16 = 6;
                            this.L.setMaximumFractionDigits(6);
                            this.L.setGroupingUsed(false);
                        } else {
                            i16 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.L;
                        if (j11 > 1000000000) {
                            i16 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i16);
                        charSequence = zd.K("TON " + this.L.format(j11 / 1.0E9d), p5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + r1.i().f(((float) j11) / f10, "USD");
                    }
                } else if (i10 == 2) {
                    if (i21 == 0) {
                        charSequence = dd.a1(false, jg.g.m(j11, ' ', new StringBuilder("XTR ")), 0.7f, null);
                    } else {
                        charSequence = "≈" + r1.i().f(((float) j11) / f10, "USD");
                    }
                } else {
                    float f11 = (float) j11;
                    if (j11 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j11));
                    } else {
                        int i23 = 0;
                        while (f11 >= 1000.0f && i23 < g0.f22551g0.length - 1) {
                            f11 /= 1000.0f;
                            i23++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f11)) + g0.f22551g0[i23];
                    }
                }
                p5Var.setText(charSequence);
                int i24 = 2131752250;
                if (i10 == 1) {
                    if (i21 == 0) {
                        i24 = 2131752251;
                    }
                    textView3.setText(id.a0(null, null, i24, aVar.d));
                } else if (i10 == 2) {
                    if (i21 == 0) {
                        i24 = 2131752249;
                    }
                    textView3.setText(dd.a1(false, id.a0(null, null, i24, aVar.d), 0.7f, null));
                } else {
                    textView3.setText(aVar.d);
                }
                int i25 = aVar.f20026g;
                h6 h6Var = this.J;
                if (i25 >= 0 && m6.f1(i25)) {
                    t6.U(p5Var, aVar.f20026g, h6Var);
                } else {
                    s6 s6Var = t6.f28530a;
                    p5Var.setTag(2131296709, null);
                    if (m6.D0().q()) {
                        i13 = aVar.f20027i;
                    } else {
                        i13 = aVar.h;
                    }
                    p5Var.setTextColor(i13);
                }
                int i26 = m6.f27998j5;
                t6.U(textView3, i26, h6Var);
                if (this.E && textView2 != null) {
                    textView2.setVisibility(0);
                    t6.U(textView2, i26, h6Var);
                    i14 = i22;
                    float f12 = ((float) ((f) arrayList.get(i14)).f20573a.f20021a[i7]) / ((float) j10);
                    if (f12 < 0.1f && f12 != 0.0f) {
                        i15 = 2;
                        z11 = true;
                        textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 * 100.0f), "%"));
                    } else {
                        i15 = 2;
                        z11 = true;
                        Locale locale = Locale.ENGLISH;
                        textView2.setText(Math.round(f12 * 100.0f) + "%");
                    }
                } else {
                    i14 = i22;
                    i15 = 2;
                    z11 = true;
                }
            }
            int i27 = i14 + 1;
            i17 = i15;
            z12 = z11;
            i18 = 0;
            i20 = i27;
        }
        boolean z16 = z12;
        boolean z17 = this.F;
        ImageView imageView = this.f20566f;
        if (z17) {
            int i28 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i28 > 0) {
                z10 = z16;
            } else {
                z10 = false;
            }
            this.G = z10;
            if (i28 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            return;
        }
        this.G = false;
        imageView.setVisibility(8);
    }

    public final void d(boolean z9, boolean z10) {
        f3 f3Var = this.K;
        if (z9) {
            g0.i3(f3Var, 300L);
            return;
        }
        g0.r(f3Var);
        RadialProgressView radialProgressView = this.h;
        if (z10) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f20566f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new m.a(this, 2)).start();
        }
    }

    public void setSize(int i7) {
        LinearLayout linearLayout = this.f20563b;
        linearLayout.removeAllViews();
        this.f20564c = new ui.e[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f20564c[i10] = new ui.e(this);
            linearLayout.addView((LinearLayout) this.f20564c[i10].f56941e);
        }
    }

    public void setUseWeek(boolean z9) {
        this.f20572y = z9;
    }
}
