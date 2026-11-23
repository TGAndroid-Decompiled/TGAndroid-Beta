package ng;

import ab.c0;
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
import c8.ma;
import di.pb;
import j6.o;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import ki.m3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.r1;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.x5;
import org.telegram.ui.xd;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Drawable I;
    public y J;
    public final h6 K;
    public final o L;
    public DecimalFormat M;
    public boolean f21519a;
    public final LinearLayout f21520b;
    public c0[] f21521c;
    public final TextView d;
    public final TextView f21522e;
    public final ImageView f21523f;
    public final RadialProgressView h;
    public final SimpleDateFormat f21524n;
    public final SimpleDateFormat f21525r;
    public final SimpleDateFormat f21526s;
    public final SimpleDateFormat f21527w;
    public final SimpleDateFormat f21528x;
    public boolean f21529y;

    public e(Context context, h6 h6Var) {
        super(context);
        this.f21524n = new SimpleDateFormat("E, ");
        this.f21525r = new SimpleDateFormat("MMM dd");
        this.f21526s = new SimpleDateFormat("d MMM yyyy");
        this.f21527w = new SimpleDateFormat("d MMM");
        this.f21528x = new SimpleDateFormat(" HH:mm");
        this.H = true;
        this.L = new o(this, 4);
        this.K = h6Var;
        setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f21520b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(g0.o());
        TextView textView2 = new TextView(context);
        this.f21522e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f21523f = imageView;
        imageView.setImageResource(2131231268);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(g0.L(12.0f));
        radialProgressView.setStrokeWidth(g0.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, ma.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, ma.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, ma.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, ma.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, ma.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i7 = m6.f29489j5;
        TextView textView = this.d;
        h6 h6Var = this.K;
        t6.U(textView, i7, h6Var);
        t6.U(this.f21522e, i7, h6Var);
        int i10 = m6.Xj;
        t6.s(this.f21523f, i10, h6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(m6.w0(i10, h6Var));
        this.I = getContext().getResources().getDrawable(2131232756).mutate();
        int L = g0.L(4.0f);
        this.J = m6.k0(L, L, L, L, m6.w0(m6.f29454h5, h6Var), m6.w0(m6.f29473i6, h6Var), -16777216);
        oq oqVar = new oq(this.I, this.J, g0.L(3.0f), g0.L(3.0f));
        oqVar.f38338x = true;
        setBackground(oqVar);
    }

    public final void c(int i7, long j3, ArrayList arrayList, boolean z10, int i10, float f10) {
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
        int length = this.f21521c.length;
        int i17 = 2;
        boolean z13 = true;
        int i18 = 0;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z14 = this.f21519a;
        TextView textView = this.d;
        if (z14) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j3)));
        } else {
            if (this.f21529y) {
                textView.setText(this.f21527w.format(new Date(j3)) + " — " + this.f21526s.format(new Date(604800000 + j3)));
            } else {
                Date date = new Date(j3);
                boolean z15 = this.E;
                SimpleDateFormat simpleDateFormat = this.f21525r;
                if (z15) {
                    str = a(simpleDateFormat.format(date));
                } else {
                    str = a(this.f21524n.format(date)) + a(simpleDateFormat.format(date));
                }
                textView.setText(str);
            }
            if (this.E) {
                this.f21522e.setText(this.f21528x.format(Long.valueOf(j3)));
            }
        }
        long j10 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((f) arrayList.get(i19)).f21541n) {
                j10 += ((f) arrayList.get(i19)).f21530a.f21005a[i7];
            }
        }
        int i20 = 0;
        while (i20 < length) {
            c0 c0Var = this.f21521c[i20];
            int i21 = i20 % 2;
            if (i10 != z13 && i10 != i17) {
                i12 = i20;
            } else {
                i12 = i20 / 2;
            }
            f fVar = (f) arrayList.get(i12);
            boolean z16 = fVar.f21541n;
            mg.a aVar = fVar.f21530a;
            if (!z16) {
                ((LinearLayout) c0Var.f910e).setVisibility(8);
                z12 = z13;
                i14 = i20;
                i15 = i17;
            } else {
                LinearLayout linearLayout = (LinearLayout) c0Var.f910e;
                TextView textView2 = (TextView) c0Var.d;
                TextView textView3 = (TextView) c0Var.f909c;
                x5 x5Var = (x5) c0Var.f908b;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i18);
                int i22 = i20;
                long j11 = aVar.f21005a[i7];
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
                        if (j11 > 1000000000) {
                            i16 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i16);
                        charSequence = xd.K("TON " + this.M.format(j11 / 1.0E9d), x5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + r1.i().f(((float) j11) / f10, "USD");
                    }
                } else if (i10 == 2) {
                    if (i21 == 0) {
                        charSequence = pb.b1(false, i5.c.l(j11, ' ', new StringBuilder("XTR ")), 0.7f, null);
                    } else {
                        charSequence = "≈" + r1.i().f(((float) j11) / f10, "USD");
                    }
                } else {
                    float f11 = (float) j11;
                    if (j11 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j11));
                    } else {
                        int i23 = 0;
                        while (f11 >= 1000.0f && i23 < g0.f24030g0.length - 1) {
                            f11 /= 1000.0f;
                            i23++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f11)) + g0.f24030g0[i23];
                    }
                }
                x5Var.setText(charSequence);
                int i24 = 2131752238;
                if (i10 == 1) {
                    if (i21 == 0) {
                        i24 = 2131752239;
                    }
                    textView3.setText(hd.a0(null, null, i24, aVar.d));
                } else if (i10 == 2) {
                    if (i21 == 0) {
                        i24 = 2131752237;
                    }
                    textView3.setText(pb.b1(false, hd.a0(null, null, i24, aVar.d), 0.7f, null));
                } else {
                    textView3.setText(aVar.d);
                }
                int i25 = aVar.f21010g;
                h6 h6Var = this.K;
                if (i25 >= 0 && m6.f1(i25)) {
                    t6.U(x5Var, aVar.f21010g, h6Var);
                } else {
                    s6 s6Var = t6.f30068a;
                    x5Var.setTag(2131296711, null);
                    if (m6.D0().q()) {
                        i13 = aVar.f21011i;
                    } else {
                        i13 = aVar.h;
                    }
                    x5Var.setTextColor(i13);
                }
                int i26 = m6.f29489j5;
                t6.U(textView3, i26, h6Var);
                if (this.F && textView2 != null) {
                    textView2.setVisibility(0);
                    t6.U(textView2, i26, h6Var);
                    i14 = i22;
                    float f12 = ((float) ((f) arrayList.get(i14)).f21530a.f21005a[i7]) / ((float) j10);
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
        ImageView imageView = this.f21523f;
        if (z18) {
            int i28 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
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
        o oVar = this.L;
        if (z10) {
            g0.h3(oVar, 300L);
            return;
        }
        g0.r(oVar);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f21523f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new m3(this, 3)).start();
        }
    }

    public void setSize(int i7) {
        LinearLayout linearLayout = this.f21520b;
        linearLayout.removeAllViews();
        this.f21521c = new c0[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f21521c[i10] = new c0(this);
            linearLayout.addView((LinearLayout) this.f21521c[i10].f910e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f21529y = z10;
    }
}
