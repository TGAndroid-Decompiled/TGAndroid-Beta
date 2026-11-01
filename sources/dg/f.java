package dg;

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
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.u1;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.n5;
import org.telegram.ui.le;
import rh.h8;
import w7.b6;
public class f extends FrameLayout {
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public y I;
    public final p6 J;
    public final androidx.activity.i K;
    public DecimalFormat L;
    public boolean f5899a;
    public final LinearLayout f5900b;
    public ji.f[] f5901c;
    public final TextView d;
    public final TextView e;
    public final ImageView f5902f;
    public final RadialProgressView h;
    public final SimpleDateFormat f5903n;
    public final SimpleDateFormat f5904r;
    public final SimpleDateFormat f5905s;
    public final SimpleDateFormat f5906w;
    public final SimpleDateFormat f5907x;
    public boolean f5908y;

    public f(Context context, p6 p6Var) {
        super(context);
        this.f5903n = new SimpleDateFormat("E, ");
        this.f5904r = new SimpleDateFormat("MMM dd");
        this.f5905s = new SimpleDateFormat("d MMM yyyy");
        this.f5906w = new SimpleDateFormat("d MMM");
        this.f5907x = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new androidx.activity.i(this, 17);
        this.J = p6Var;
        setPadding(i0.L(8.0f), i0.L(8.0f), i0.L(8.0f), i0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f5900b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(i0.o());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(i0.o());
        ImageView imageView = new ImageView(context);
        this.f5902f = imageView;
        imageView.setImageResource(2131231269);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(i0.L(12.0f));
        radialProgressView.setStrokeWidth(i0.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, b6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, b6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, b6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, b6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, b6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = t6.f21038j5;
        TextView textView = this.d;
        p6 p6Var = this.J;
        a7.V(textView, i10, p6Var);
        a7.V(this.e, i10, p6Var);
        int i11 = t6.Uj;
        a7.t(this.f5902f, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(t6.w0(i11, p6Var));
        this.H = getContext().getResources().getDrawable(2131232751).mutate();
        int L = i0.L(4.0f);
        this.I = t6.k0(L, L, L, L, t6.w0(t6.f21002h5, p6Var), t6.w0(t6.f21021i6, p6Var), -16777216);
        eq eqVar = new eq(this.H, this.I, i0.L(3.0f), i0.L(3.0f));
        eqVar.f25909x = true;
        setBackground(eqVar);
    }

    public final void c(int i10, long j10, ArrayList arrayList, boolean z10, int i11, float f7) {
        String str;
        boolean z11;
        int i12;
        int i13;
        CharSequence charSequence;
        int i14;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int length = this.f5901c.length;
        int i18 = 2;
        boolean z13 = true;
        int i19 = 0;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z14 = this.f5899a;
        TextView textView = this.d;
        if (z14) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j10)));
        } else {
            if (this.f5908y) {
                textView.setText(this.f5906w.format(new Date(j10)) + " — " + this.f5905s.format(new Date(604800000 + j10)));
            } else {
                Date date = new Date(j10);
                boolean z15 = this.D;
                SimpleDateFormat simpleDateFormat = this.f5904r;
                if (z15) {
                    str = a(simpleDateFormat.format(date));
                } else {
                    str = a(this.f5903n.format(date)) + a(simpleDateFormat.format(date));
                }
                textView.setText(str);
            }
            if (this.D) {
                this.e.setText(this.f5907x.format(Long.valueOf(j10)));
            }
        }
        long j11 = 0;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            if (((g) arrayList.get(i20)).f5919n) {
                j11 += ((g) arrayList.get(i20)).f5909a.f4158a[i10];
            }
        }
        int i21 = 0;
        while (i21 < length) {
            ji.f fVar = this.f5901c[i21];
            int i22 = i21 % 2;
            if (i11 != z13 && i11 != i18) {
                i13 = i21;
            } else {
                i13 = i21 / 2;
            }
            g gVar = (g) arrayList.get(i13);
            boolean z16 = gVar.f5919n;
            cg.a aVar = gVar.f5909a;
            if (!z16) {
                ((LinearLayout) fVar.e).setVisibility(8);
                z12 = z13;
                i15 = i21;
                i16 = i18;
            } else {
                LinearLayout linearLayout = (LinearLayout) fVar.e;
                TextView textView2 = (TextView) fVar.d;
                TextView textView3 = (TextView) fVar.f10443c;
                n5 n5Var = (n5) fVar.f10442b;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i19);
                int i23 = i21;
                long j12 = aVar.f4158a[i10];
                if (i11 == z13) {
                    if (i22 == 0) {
                        if (this.L == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.L = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i17 = 6;
                            this.L.setMaximumFractionDigits(6);
                            this.L.setGroupingUsed(false);
                        } else {
                            i17 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.L;
                        if (j12 > 1000000000) {
                            i17 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i17);
                        charSequence = le.K("TON " + this.L.format(j12 / 1.0E9d), n5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + u1.i().f(((float) j12) / f7, "USD");
                    }
                } else if (i11 == 2) {
                    if (i22 == 0) {
                        charSequence = h8.a1(false, i0.a.k(j12, ' ', new StringBuilder("XTR ")), 0.7f, null);
                    } else {
                        charSequence = "≈" + u1.i().f(((float) j12) / f7, "USD");
                    }
                } else {
                    float f10 = (float) j12;
                    if (j12 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j12));
                    } else {
                        int i24 = 0;
                        while (f10 >= 1000.0f && i24 < i0.f16156g0.length - 1) {
                            f10 /= 1000.0f;
                            i24++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f10)) + i0.f16156g0[i24];
                    }
                }
                n5Var.setText(charSequence);
                int i25 = 2131752250;
                if (i11 == 1) {
                    if (i22 == 0) {
                        i25 = 2131752251;
                    }
                    textView3.setText(dd.a0(null, null, i25, aVar.d));
                } else if (i11 == 2) {
                    if (i22 == 0) {
                        i25 = 2131752249;
                    }
                    textView3.setText(h8.a1(false, dd.a0(null, null, i25, aVar.d), 0.7f, null));
                } else {
                    textView3.setText(aVar.d);
                }
                int i26 = aVar.f4162g;
                p6 p6Var = this.J;
                if (i26 >= 0 && t6.f1(i26)) {
                    a7.V(n5Var, aVar.f4162g, p6Var);
                } else {
                    z6 z6Var = a7.f20158a;
                    n5Var.setTag(2131296709, null);
                    if (t6.D0().q()) {
                        i14 = aVar.f4163i;
                    } else {
                        i14 = aVar.h;
                    }
                    n5Var.setTextColor(i14);
                }
                int i27 = t6.f21038j5;
                a7.V(textView3, i27, p6Var);
                if (this.E && textView2 != null) {
                    textView2.setVisibility(0);
                    a7.V(textView2, i27, p6Var);
                    i15 = i23;
                    float f11 = ((float) ((g) arrayList.get(i15)).f5909a.f4158a[i10]) / ((float) j11);
                    if (f11 < 0.1f && f11 != 0.0f) {
                        i16 = 2;
                        z12 = true;
                        textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f11 * 100.0f), "%"));
                    } else {
                        i16 = 2;
                        z12 = true;
                        Locale locale = Locale.ENGLISH;
                        textView2.setText(Math.round(f11 * 100.0f) + "%");
                    }
                } else {
                    i15 = i23;
                    i16 = 2;
                    z12 = true;
                }
            }
            int i28 = i15 + 1;
            i18 = i16;
            z13 = z12;
            i19 = 0;
            i21 = i28;
        }
        boolean z17 = z13;
        boolean z18 = this.F;
        ImageView imageView = this.f5902f;
        if (z18) {
            int i29 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i29 > 0) {
                z11 = z17;
            } else {
                z11 = false;
            }
            this.G = z11;
            if (i29 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            return;
        }
        this.G = false;
        imageView.setVisibility(8);
    }

    public final void d(boolean z10, boolean z11) {
        androidx.activity.i iVar = this.K;
        if (z10) {
            i0.h3(iVar, 300L);
            return;
        }
        i0.r(iVar);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f5902f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new bg.e(this, 2)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f5900b;
        linearLayout.removeAllViews();
        this.f5901c = new ji.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f5901c[i11] = new ji.f(this);
            linearLayout.addView((LinearLayout) this.f5901c[i11].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f5908y = z10;
    }
}
