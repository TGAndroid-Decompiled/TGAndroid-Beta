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
import ki.n3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.r1;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.w5;
import org.telegram.ui.xd;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Drawable I;
    public y J;
    public final i6 K;
    public final o L;
    public DecimalFormat M;
    public boolean f21488a;
    public final LinearLayout f21489b;
    public c0[] f21490c;
    public final TextView d;
    public final TextView f21491e;
    public final ImageView f21492f;
    public final RadialProgressView h;
    public final SimpleDateFormat f21493n;
    public final SimpleDateFormat f21494r;
    public final SimpleDateFormat f21495s;
    public final SimpleDateFormat f21496w;
    public final SimpleDateFormat f21497x;
    public boolean f21498y;

    public e(Context context, i6 i6Var) {
        super(context);
        this.f21493n = new SimpleDateFormat("E, ");
        this.f21494r = new SimpleDateFormat("MMM dd");
        this.f21495s = new SimpleDateFormat("d MMM yyyy");
        this.f21496w = new SimpleDateFormat("d MMM");
        this.f21497x = new SimpleDateFormat(" HH:mm");
        this.H = true;
        this.L = new o(this, 4);
        this.K = i6Var;
        setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f21489b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(g0.o());
        TextView textView2 = new TextView(context);
        this.f21491e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f21492f = imageView;
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
        int i7 = n6.f29502j5;
        TextView textView = this.d;
        i6 i6Var = this.K;
        u6.U(textView, i7, i6Var);
        u6.U(this.f21491e, i7, i6Var);
        int i10 = n6.Xj;
        u6.s(this.f21492f, i10, i6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(n6.w0(i10, i6Var));
        this.I = getContext().getResources().getDrawable(2131232756).mutate();
        int L = g0.L(4.0f);
        this.J = n6.k0(L, L, L, L, n6.w0(n6.f29467h5, i6Var), n6.w0(n6.f29486i6, i6Var), -16777216);
        mq mqVar = new mq(this.I, this.J, g0.L(3.0f), g0.L(3.0f));
        mqVar.f37616x = true;
        setBackground(mqVar);
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
        int length = this.f21490c.length;
        int i17 = 2;
        boolean z13 = true;
        int i18 = 0;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z14 = this.f21488a;
        TextView textView = this.d;
        if (z14) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j3)));
        } else {
            if (this.f21498y) {
                textView.setText(this.f21496w.format(new Date(j3)) + " — " + this.f21495s.format(new Date(604800000 + j3)));
            } else {
                Date date = new Date(j3);
                boolean z15 = this.E;
                SimpleDateFormat simpleDateFormat = this.f21494r;
                if (z15) {
                    str = a(simpleDateFormat.format(date));
                } else {
                    str = a(this.f21493n.format(date)) + a(simpleDateFormat.format(date));
                }
                textView.setText(str);
            }
            if (this.E) {
                this.f21491e.setText(this.f21497x.format(Long.valueOf(j3)));
            }
        }
        long j10 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((f) arrayList.get(i19)).f21510n) {
                j10 += ((f) arrayList.get(i19)).f21499a.f20974a[i7];
            }
        }
        int i20 = 0;
        while (i20 < length) {
            c0 c0Var = this.f21490c[i20];
            int i21 = i20 % 2;
            if (i10 != z13 && i10 != i17) {
                i12 = i20;
            } else {
                i12 = i20 / 2;
            }
            f fVar = (f) arrayList.get(i12);
            boolean z16 = fVar.f21510n;
            mg.a aVar = fVar.f21499a;
            if (!z16) {
                ((LinearLayout) c0Var.f910e).setVisibility(8);
                z12 = z13;
                i14 = i20;
                i15 = i17;
            } else {
                LinearLayout linearLayout = (LinearLayout) c0Var.f910e;
                TextView textView2 = (TextView) c0Var.d;
                TextView textView3 = (TextView) c0Var.f909c;
                w5 w5Var = (w5) c0Var.f908b;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i18);
                int i22 = i20;
                long j11 = aVar.f20974a[i7];
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
                        charSequence = xd.K("TON " + this.M.format(j11 / 1.0E9d), w5Var.getPaint(), 0.82f, 0.0f, false);
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
                        while (f11 >= 1000.0f && i23 < g0.f24102g0.length - 1) {
                            f11 /= 1000.0f;
                            i23++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f11)) + g0.f24102g0[i23];
                    }
                }
                w5Var.setText(charSequence);
                int i24 = 2131752239;
                if (i10 == 1) {
                    if (i21 == 0) {
                        i24 = 2131752240;
                    }
                    textView3.setText(gd.a0(null, null, i24, aVar.d));
                } else if (i10 == 2) {
                    if (i21 == 0) {
                        i24 = 2131752238;
                    }
                    textView3.setText(pb.b1(false, gd.a0(null, null, i24, aVar.d), 0.7f, null));
                } else {
                    textView3.setText(aVar.d);
                }
                int i25 = aVar.f20979g;
                i6 i6Var = this.K;
                if (i25 >= 0 && n6.f1(i25)) {
                    u6.U(w5Var, aVar.f20979g, i6Var);
                } else {
                    t6 t6Var = u6.f30082a;
                    w5Var.setTag(2131296709, null);
                    if (n6.D0().q()) {
                        i13 = aVar.f20980i;
                    } else {
                        i13 = aVar.h;
                    }
                    w5Var.setTextColor(i13);
                }
                int i26 = n6.f29502j5;
                u6.U(textView3, i26, i6Var);
                if (this.F && textView2 != null) {
                    textView2.setVisibility(0);
                    u6.U(textView2, i26, i6Var);
                    i14 = i22;
                    float f12 = ((float) ((f) arrayList.get(i14)).f21499a.f20974a[i7]) / ((float) j10);
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
        ImageView imageView = this.f21492f;
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
        this.f21492f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new n3(this, 3)).start();
        }
    }

    public void setSize(int i7) {
        LinearLayout linearLayout = this.f21489b;
        linearLayout.removeAllViews();
        this.f21490c = new c0[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f21490c[i10] = new c0(this);
            linearLayout.addView((LinearLayout) this.f21490c[i10].f910e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f21498y = z10;
    }
}
