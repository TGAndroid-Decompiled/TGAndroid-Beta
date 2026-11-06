package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.c61;
import org.telegram.ui.l00;
import org.telegram.ui.n00;
import org.telegram.ui.o00;
import org.telegram.ui.pn;
import org.telegram.ui.q50;
public final class dd extends o00 implements ls {
    public static DecimalFormat f3706v0;
    public static DecimalFormat f3707w0;
    public FrameLayout R;
    public vg.m S;
    public cd T;
    public ht0 U;
    public ec V;
    public View W;
    public te.a X;
    public te.a Y;
    public te.a Z;
    public int f3709b0;
    public int f3710c0;
    public boolean f3711d0;
    public boolean f3712e0;
    public ec f3714g0;
    public jz f3715h0;
    public LinearLayout f3716i0;
    public SpannableStringBuilder f3717j0;
    public org.telegram.ui.Components.j6 f3718k0;
    public TextView f3719l0;
    public fi.d m0;
    public e5 f3720n0;
    public fi.d f3721o0;
    public c61 f3722p0;
    public fi.d f3723q0;
    public fi.d f3724r0;
    public boolean f3725s0;
    public boolean f3726t0;
    public hc f3727u0;
    public int f3708a0 = -1;
    public final a3.f f3713f0 = new a3.f(this, 29);

    public dd() {
        this.M = true;
    }

    public static void A0(dd ddVar, Context context) {
        if (qp.s1(ddVar.currentAccount).v2()) {
            org.telegram.ui.b.b(ddVar.currentAccount);
        } else {
            new uc(context, ddVar.resourceProvider).show();
        }
    }

    public static void B0(dd ddVar) {
        ea.y(ddVar.currentAccount, false).u();
        wg.f1.l1(1, org.telegram.messenger.v1.a(ddVar.currentAccount).b());
    }

    public static void C0(bi.dd r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: bi.dd.C0(bi.dd, int):void");
    }

    public static void D0(dd ddVar, r31 r31Var, Boolean bool, String str) {
        if (ddVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                org.telegram.ui.Components.hc.a0(ddVar).I(2131624226, org.telegram.messenger.hd.M0(2131745160, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) r31Var.B, "StarsAcquiredInfo", new Object[0]))).j();
                ddVar.f3715h0.c(true);
                ea.y(ddVar.currentAccount, false).S(true);
            } else if (str != null) {
                org.telegram.ui.Components.hc.a0(ddVar).Q(2131624011, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, str)).j();
            }
        }
    }

    public static void H0(sx0 sx0Var, int i7, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence K;
        CharSequence charSequence;
        TextView textView = (TextView) ((px0) sx0Var.c(org.telegram.messenger.hd.M0(2131750299, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        b80 b80Var = new b80(textView, org.telegram.messenger.g0.L(90.0f), 0, f6Var);
        b80Var.a(org.telegram.ui.ActionBar.k6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.k6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(b80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final ea y10 = ea.y(i7, false);
            final long j3 = starGift.f27181id;
            final ai.i iVar = new ai.i(textView, 9);
            final boolean[] zArr = {false};
            final ls[] lsVarArr = {new ls() {
                @Override
                public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                    int i12;
                    ea eaVar;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i10 == (i12 = qs.F3) && (J = (eaVar = ea.this).J(j3)) != null) {
                        zArr2[0] = true;
                        qs.f(eaVar.f3807a).n(lsVarArr[0], i12);
                        iVar.a(J);
                    }
                }
            }};
            int i10 = y10.f3807a;
            qs f10 = qs.f(i10);
            ls lsVar = lsVarArr[0];
            int i11 = qs.F3;
            f10.b(lsVar, i11);
            TL_stars.StarGift J = y10.J(j3);
            if (J != null) {
                zArr[0] = true;
                qs.f(i10).n(lsVarArr[0], i11);
                iVar.a(J);
            }
        } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = org.telegram.messenger.hd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = org.telegram.messenger.hd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + org.telegram.messenger.hd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
        } else {
            int i12 = starGift.availability_remains;
            if (i12 <= 0) {
                K = org.telegram.messenger.hd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                K = org.telegram.messenger.hd.K("Gift2Availability4Value", i12, ',', org.telegram.messenger.hd.E(starGift.availability_total, ','));
            }
            textView.setText(K);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new cc(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        return M0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
        if (f3707w0 == null) {
            f3707w0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 != 0) {
                String format = f3707w0.format(j3 / 1.0E9d);
                spannableStringBuilder.append((CharSequence) format);
                int indexOf = format.indexOf(".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (starsAmount.negative()) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(org.telegram.messenger.hd.E(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z9 = false;
            if (i10 < 0 && j10 > 0) {
                i7 = -1;
                d = 1.0E9d;
            } else if (i10 > 0 && j10 < 0) {
                d = 1.0E9d;
                i7 = 1;
            } else {
                d = 1.0E9d;
                i7 = 0;
            }
            long j11 = i7 + j10;
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 != 0 ? i11 < 0 : i10 < 0) {
                z9 = true;
            }
            if (i10 != 0) {
                StringBuilder sb3 = new StringBuilder();
                if (z9) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(org.telegram.messenger.hd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f3707w0;
                int i12 = starsAmount.nanos;
                double d2 = i12;
                if (i12 < 0) {
                    d2 += d;
                }
                String format2 = decimalFormat.format(d2 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z9) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(org.telegram.messenger.hd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder N0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
        boolean z9;
        if (f3707w0 == null) {
            f3707w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f3707w0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j3 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            if (i10 < 0 && j3 > 0) {
                i7 = -1;
                d = 1.0E9d;
            } else if (i10 > 0 && j3 < 0) {
                d = 1.0E9d;
                i7 = 1;
            } else {
                d = 1.0E9d;
                i7 = 0;
            }
            long j10 = i7 + j3;
            int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i11 != 0 ? i11 < 0 : i10 < 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            String str = "";
            if (Math.abs(j10) <= 1000 && starsAmount.nanos != 0) {
                StringBuilder sb2 = new StringBuilder();
                if (z9) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(org.telegram.messenger.hd.E(Math.abs(j10), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f3707w0;
                int i12 = starsAmount.nanos;
                double d2 = i12;
                if (i12 < 0) {
                    d2 += d;
                }
                String format2 = decimalFormat.format(d2 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    String substring = format2.substring(indexOf2);
                    if (substring.length() > 1) {
                        spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
                    }
                }
            } else if (starsAmount.amount <= 1000) {
                StringBuilder sb3 = new StringBuilder();
                if (z9) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(org.telegram.messenger.hd.E(Math.abs(j10), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z9) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(org.telegram.messenger.g0.o0((int) Math.abs(j10), 0));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder O0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i7;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f3707w0 == null) {
                f3707w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f3707w0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = starsAmount.amount;
        int i10 = starsAmount.nanos;
        boolean z9 = false;
        if (i10 < 0 && j3 > 0) {
            i7 = -1;
            d = 1.0E9d;
        } else if (i10 > 0 && j3 < 0) {
            d = 1.0E9d;
            i7 = 1;
        } else {
            d = 1.0E9d;
            i7 = 0;
        }
        long j10 = i7 + j3;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 != 0 ? i11 < 0 : i10 < 0) {
            z9 = true;
        }
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z9) {
                str = "-";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(org.telegram.messenger.hd.E(Math.abs(j10), ','));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (f3707w0 == null) {
                f3707w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f3707w0;
            int i12 = starsAmount.nanos;
            double d2 = i12;
            if (i12 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat.format(d2 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.hd.M0(2131745085, null));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.H(',', "Stars", (int) j3));
        return spannableStringBuilder;
    }

    public static String P0(long j3) {
        String str;
        if (f3706v0 == null) {
            f3706v0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return f3706v0.format(j3 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (j3 < 0) {
            str = "-";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(org.telegram.messenger.hd.E(Math.abs(j3 / 1000000000), ','));
        return sb2.toString();
    }

    public static java.lang.String Q0(int r6, boolean r7, org.telegram.tgnet.tl.TL_stars.StarsTransaction r8) {
        throw new UnsupportedOperationException("Method not decompiled: bi.dd.Q0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10) {
        return S0(charSequence, f10, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f10, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString("💎 ");
        wp wpVar = new wp(2131231054, 0);
        wpVar.d = false;
        wpVar.f40055r = 0.0f;
        wpVar.f40056s = f11;
        wpVar.G = f12;
        wpVar.H = f10;
        wpVar.I = f10;
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "💎", "💎️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "💎", "💎 ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "💎");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder T0(CharSequence charSequence) {
        return U0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f10, wp[] wpVarArr) {
        return X0(false, charSequence, f10, wpVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z9) {
        return X0(z9, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z9, CharSequence charSequence, float f10, wp[] wpVarArr, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        wp wpVar;
        int i7;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z9) {
            str = "⭐";
        } else {
            str = "TON";
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            if (z9) {
                i7 = 2131231957;
            } else {
                i7 = 2131232307;
            }
            wpVar = new wp(i7, 0);
            if (wpVarArr != null) {
                wpVarArr[0] = wpVar;
            }
        }
        wpVar.f40055r = 0.0f;
        wpVar.f40056s = f11;
        wpVar.G = f12;
        if (z9) {
            wpVar.d = false;
            float f13 = f10 * 0.2f;
            wpVar.H = f13;
            wpVar.I = f13;
        } else {
            wpVar.H = f10;
            wpVar.I = f10;
        }
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z9, String str, wp[] wpVarArr) {
        wp wpVar;
        int i7;
        float f10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            if (z9) {
                i7 = 2131231957;
            } else {
                i7 = 2131232307;
            }
            wpVar = new wp(i7, 0);
            float f11 = 1.13f;
            if (z9) {
                f10 = 0.222f;
            } else {
                f10 = 1.13f;
            }
            if (z9) {
                f11 = 0.222f;
            }
            wpVar.H = f10;
            wpVar.I = f11;
        }
        if (z9) {
            wpVar.d = false;
        }
        if (wpVarArr != null) {
            wpVarArr[0] = wpVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(TL_stars.StarsAmount starsAmount, String str, wp[] wpVarArr) {
        return a1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, wpVarArr);
    }

    public static SpannableStringBuilder a1(boolean z9, CharSequence charSequence, float f10, wp[] wpVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i7;
        wp wpVar;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z9) {
            str = "⭐";
        } else {
            str = "TON";
        }
        if (z9) {
            i7 = 2131231957;
        } else {
            i7 = 2131232752;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            if (wpVarArr != null && wpVarArr.length > 0) {
                wpVar = new wp(i7, 0);
                wpVarArr[0] = wpVar;
            } else {
                wpVar = new wp(i7, 0);
            }
        }
        wpVar.d = false;
        if (z9) {
            f10 *= 0.33f;
        }
        wpVar.H = f10;
        wpVar.I = f10;
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static pb b1(View view, ImageReceiver imageReceiver, String str, boolean z9) {
        int i7;
        int i10 = imageReceiver.d;
        final nb nbVar = new nb(z9, i10, str, imageReceiver, new boolean[1]);
        nbVar.run();
        qs f10 = qs.f(i10);
        if (z9) {
            i7 = qs.X2;
        } else {
            i7 = qs.W2;
        }
        return new pb(f10.h(view, i7, new c20() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        nbVar.run();
                        return;
                    default:
                        nbVar.run();
                        return;
                }
            }
        }), qs.f(i10).h(view, qs.f25094y0, new c20() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        nbVar.run();
                        return;
                    default:
                        nbVar.run();
                        return;
                }
            }
        }), 0);
    }

    public static void c1(ImageReceiver imageReceiver, TLRPC.Document document, int i7) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, i7, false, null, false);
        imageReceiver.r0(org.telegram.messenger.hc.b(document), com.google.android.recaptcha.internal.a.j(i7, "_", i7), org.telegram.messenger.hc.c(w10, document), com.google.android.recaptcha.internal.a.j(i7, "_", i7), org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f27792a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void d1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i7) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        c1(imageReceiver, document, i7);
    }

    public static void e1(org.telegram.ui.Components.l9 l9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 1000) {
            str = "2⃣";
        } else if (j3 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        b1(l9Var, imageReceiver, str, false);
    }

    public static pb f1(org.telegram.ui.Components.l9 l9Var, ImageReceiver imageReceiver, int i7) {
        String str;
        if (i7 != 3) {
            if (i7 != 6) {
                if (i7 != 12) {
                    if (i7 != 24) {
                        str = "1⃣";
                    } else {
                        str = "5⃣";
                    }
                } else {
                    str = "4⃣";
                }
            } else {
                str = "3⃣";
            }
        } else {
            str = "2⃣";
        }
        return b1(l9Var, imageReceiver, str, false);
    }

    public static void g1(org.telegram.ui.Components.l9 l9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 10000000000L) {
            str = "2⃣";
        } else if (j3 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        b1(l9Var, imageReceiver, str, true);
    }

    public static void h1(Context context, int i7, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.f6 f6Var) {
        ?? r18;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ha.t(-1, 150, 7, 0, 0, 0, 10));
        gc gcVar = new gc(context, 70, 0, 0);
        frameLayout.addView(gcVar, c8.ha.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.f57295b;
        fVar.f57279z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        mVar.setStarParticlesView(gcVar);
        frameLayout.addView(mVar, c8.ha.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.v2[] v2VarArr = new org.telegram.ui.ActionBar.v2[1];
        textView.setText(org.telegram.messenger.hd.H(' ', "BoostStars", (int) boost.stars));
        ?? f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), -6915073));
        f11.setTextColor(-1);
        f11.setTextSize(1, 11.33f);
        f11.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.33f), 0);
        f11.setGravity(17);
        f11.setTypeface(org.telegram.messenger.g0.o());
        StringBuilder sb2 = new StringBuilder("x");
        int i10 = boost.multiplier;
        if (i10 == 0) {
            i10 = 1;
        }
        sb2.append(org.telegram.messenger.hd.H(' ', "BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        wp wpVar = new wp(2131231928, 2);
        wpVar.f40055r = 0.0f;
        wpVar.f40056s = org.telegram.messenger.g0.L(0.66f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        f11.setText(spannableStringBuilder);
        f10.addView(f11, c8.ha.t(-2, 20, 17, 20, 4, 20, 4));
        sx0 sx0Var = new sx0(context, f6Var);
        sx0Var.n(org.telegram.messenger.hd.M0(2131753627, null), i7, j3, new qa(v2VarArr, j3, 6));
        sx0Var.c(org.telegram.messenger.hd.M0(2131753626, null), org.telegram.messenger.hd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = org.telegram.messenger.hd.M0(2131753615, null);
            String M02 = org.telegram.messenger.hd.M0(2131753614, null);
            r18 = 0;
            d3 d3Var = new d3(v2VarArr, j3, boost, 2);
            v2VarArr = v2VarArr;
            sx0Var.i(M0, M02, d3Var);
        } else {
            r18 = 0;
        }
        String M03 = org.telegram.messenger.hd.M0(2131753662, null);
        String format = org.telegram.messenger.hd.E0().s0().format(new Date(boost.date * 1000));
        String format2 = org.telegram.messenger.hd.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[r18] = format;
        objArr[1] = format2;
        sx0Var.c(M03, org.telegram.messenger.hd.a0(null, null, 2131742784, objArr), null, null);
        String M04 = org.telegram.messenger.hd.M0(2131753607, null);
        String format3 = org.telegram.messenger.hd.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = org.telegram.messenger.hd.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[r18] = format3;
        objArr2[1] = format4;
        sx0Var.c(M04, org.telegram.messenger.hd.a0(null, null, 2131742784, objArr2), null, null);
        f10.addView(sx0Var, c8.ha.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        w70 w70Var = new w70(context, f6Var);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.f28258z6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131744927, null), new pa(context, 2)));
        w70Var.setGravity(17);
        f10.addView(w70Var, c8.ha.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.i(org.telegram.messenger.hd.M0(2131747830, null), r18, true);
        dVar.setOnClickListener(new va(v2VarArr, 1));
        f10.addView(dVar, c8.ha.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        l10.N = f10;
        v2VarArr[0] = l10;
        l10.T0 = false;
        l10.N();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            v2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        v2VarArr[0].show();
        v2VarArr[0].n(new ab(mVar, 0));
    }

    public static h1 i1(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var) {
        cg.a resellAmount;
        cg.b bVar = cg.b.f6162a;
        if (tL_starGiftUnique == null) {
            resellAmount = cg.a.g(((org.telegram.messenger.j0) qp.s1(i7).f24927x7.f24444p.f13555b).f23432c, bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f6163b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        h1 h1Var = new h1(context, f6Var, i7, resellAmount, new ai.f1(6, v10Var, r8));
        h1[] h1VarArr = {h1Var};
        h1Var.show();
        return h1VarArr[0];
    }

    public static void j1(Context context, long j3, boolean z9, final v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        int i10;
        CharSequence l10;
        org.telegram.ui.ActionBar.v2[] v2VarArr;
        long j10;
        boolean z10 = false;
        org.telegram.ui.ActionBar.v2 l11 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        fi.d dVar = null;
        textView.setText(org.telegram.messenger.hd.M0(2131747731, null));
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, f6Var);
        linearLayout.addView(textView, c8.ha.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        lb0 lb0Var = new lb0(context, f6Var);
        lb0Var.setForceForceUseCenter(true);
        lb0Var.setText(org.telegram.messenger.hd.M0(2131747732, null));
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i11, f6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.r6.D(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27948ig, f6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.f27967jg, f6Var);
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor.setGravity(i7);
        editTextBoldCursor.setOnFocusChangeListener(new bb(lb0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232752);
        linearLayout2.addView(imageView, c8.ha.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, c8.ha.p(-1, -2, 1.0f, 119));
        lb0Var.e(editTextBoldCursor);
        lb0Var.addView(linearLayout2, c8.ha.e(-1, -2, 48));
        linearLayout.addView(lb0Var, c8.ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.A6, null);
        lb0Var.addView(textView2, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        w70 w70Var = new w70(context, null);
        w70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131747734, null), new pa(context, 3)), true));
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.f28258z6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        linearLayout.addView(w70Var, c8.ha.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i12 > 0) {
            i10 = 2131747730;
        } else {
            i10 = 2131747736;
        }
        h.i(org.telegram.messenger.hd.M0(i10, null), false, true);
        linearLayout.addView(h, c8.ha.o(-1, 48));
        if (i12 > 0 && z9) {
            fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var, false);
            h7.i(org.telegram.messenger.hd.M0(2131747735, null), false, false);
            linearLayout.addView(h7, c8.ha.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = h7;
        }
        l11.N = linearLayout;
        final org.telegram.ui.ActionBar.v2[] v2VarArr2 = {l11};
        if (i12 <= 0) {
            l10 = "";
        } else {
            l10 = Long.toString(j3);
        }
        editTextBoldCursor.setText(l10);
        editTextBoldCursor.addTextChangedListener(new dc(editTextBoldCursor, lb0Var, j3, z9, h, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                if (i13 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                h.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                v10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new gb(editTextBoldCursor2, v2VarArr2, 1));
                return true;
            }
        });
        db dbVar = new db(zArr, v10Var, editTextBoldCursor, h, v2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        h.setOnClickListener(dbVar);
        if (dVar != null) {
            fi.d dVar2 = dVar;
            db dbVar2 = new db(zArr, v10Var, dVar2, editTextBoldCursor2, v2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            v2VarArr = v2VarArr2;
            dVar2.setOnClickListener(dbVar2);
        } else {
            v2VarArr = v2VarArr2;
        }
        v2VarArr[0].N();
        v2VarArr[0].setOnDismissListener(new eb(editTextBoldCursor2, 0));
        v2VarArr[0].show();
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            z10 = ((an) Q).pa();
        }
        gb gbVar = new gb(v2VarArr, editTextBoldCursor2);
        if (z10) {
            j10 = 200;
        } else {
            j10 = 80;
        }
        org.telegram.messenger.g0.i3(gbVar, j10);
    }

    public static org.telegram.ui.ActionBar.v2 k1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final org.telegram.ui.ActionBar.f6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: bi.dd.k1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.f6):org.telegram.ui.ActionBar.v2");
    }

    public static void l1(Activity activity, int i7, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i10;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f27183id = tL_messageActionPaymentRefunded.charge.f27082id;
        starsTransaction.refund = true;
        k1(activity, false, 0L, i7, starsTransaction, f6Var);
    }

    public static void m1(Context context, int i7, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = qp.s1(i7).z1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f27183id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i7, starsTransaction, f6Var);
    }

    public static CharSequence s1(SpannableStringBuilder spannableStringBuilder, boolean z9) {
        wp[] wpVarArr;
        a5.q c10;
        if (z9 && com.google.android.recaptcha.internal.a.u(spannableStringBuilder)) {
            for (wp wpVar : (wp[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wp.class)) {
                Drawable drawable = wpVar.f40051c;
                if (drawable != null && !(drawable instanceof a5.q) && (c10 = a5.q.c(org.telegram.messenger.t0.f25555b.getResources(), 2131231958, null)) != null) {
                    c10.setBounds(wpVar.f40051c.getBounds());
                    wpVar.f40051c = c10;
                    wpVar.d = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public final void J0() {
        q1();
        pj0 pj0Var = this.f48165c;
        if (pj0Var != null && this.U != null && pj0Var.getLayoutParams() != null) {
            int C = org.telegram.messenger.camera.q.C(48.0f, this.f3709b0, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.camera.q.C(48.0f, this.f3710c0, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.messenger.g0.B3(this.f48165c, 0, C, 0, C2);
            pj0 pj0Var2 = this.f48165c;
            int i7 = -C;
            pj0Var2.setPadding(pj0Var2.getPaddingLeft(), i7, this.f48165c.getPaddingRight(), this.f3710c0 - C2);
            this.U.z(i7, -C2);
        }
    }

    public final void K0(ArrayList arrayList, f41 f41Var) {
        boolean z9;
        pj0 pj0Var;
        int i7;
        n1("FILL_BEFORE");
        ht0 ht0Var = this.U;
        if (ht0Var != null && ht0Var.f34422e0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f3708a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        ea y10 = ea.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        r31 r31Var = new r31(-2);
        r31Var.f37591c = (l00) super.o0(getParentActivity());
        arrayList.add(r31Var);
        arrayList.add(r31.k(this.f3716i0));
        fi.d dVar = this.f3724r0;
        if (dVar != null) {
            if (getMessagesController().X5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            dVar.setVisibility(i7);
        }
        arrayList.add(r31.C(null));
        if (getMessagesController().f24777g6) {
            arrayList.add(hi.f.i(-4, getThemedColor(org.telegram.ui.ActionBar.k6.ik), pn.i0(org.telegram.messenger.hd.M0(2131743767, null)), org.telegram.messenger.hd.M0(2131743768, null)));
            arrayList.add(r31.C(null));
        }
        if (y10.f3810e && !arrayList2.isEmpty()) {
            arrayList.add(r31.u(org.telegram.messenger.hd.M0(2131745204, null)));
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                int i11 = vc.f4927b;
                r31 K = r31.K(vc.class);
                K.G = (TL_stars.StarsSubscription) arrayList2.get(i10);
                arrayList.add(K);
            }
            if (y10.f3827x) {
                arrayList.add(r31.q(arrayList.size(), 33));
            } else if (!y10.f3828y) {
                r31 c10 = r31.c(-3, 2131230871, org.telegram.messenger.hd.M0(2131745203, null));
                c10.f37603q = true;
                arrayList.add(c10);
            }
            arrayList.add(r31.C(null));
        }
        boolean N = y10.N(0);
        this.f3725s0 = N;
        if (N) {
            this.f3708a0 = arrayList.size();
            arrayList.add(r31.n(this.V, -2));
            if (z9 && (pj0Var = this.f48165c) != null) {
                a3.f fVar = this.f3713f0;
                pj0Var.removeCallbacks(fVar);
                this.f48165c.post(fVar);
            }
        } else {
            arrayList.add(r31.m(this.f3714g0));
        }
        n1("FILL_AFTER");
    }

    @Override
    public final View createView(final Context context) {
        boolean z9;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7;
        this.G = false;
        this.E = org.telegram.messenger.g0.L(238.0f);
        ht0 ht0Var = new ht0(context);
        this.U = ht0Var;
        boolean z10 = true;
        ht0Var.setDebugLoggingEnabled(true);
        this.U.setCommonInsetsManagedExternally(true);
        if (!this.f3711d0) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
                i7 = 0;
            } else {
                i7 = org.telegram.messenger.g0.f22531m;
            }
            this.f3709b0 = i7;
            this.f3710c0 = org.telegram.messenger.g0.f22532n;
        }
        this.U.setGeometry(new d6.i(this, 11));
        this.U.z(-org.telegram.messenger.camera.q.C(48.0f, this.f3709b0, -org.telegram.messenger.g0.L(8.0f)), -org.telegram.messenger.camera.q.C(48.0f, this.f3710c0, -org.telegram.messenger.g0.L(8.0f)));
        ht0 ht0Var2 = this.U;
        ht0Var2.getClass();
        this.V = new ec(25, context, ht0Var2);
        this.T = new cd(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.f3714g0 = new ec(0, context, this);
        super.createView(context);
        n00 n00Var = this.f48170s;
        getBaseSimpleGlass().f(n00Var, this.f48165c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f21027n = this.U;
        this.f48165c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f21028o = new g(1, this, new f(1, n00Var));
        FrameLayout frameLayout = this.T.d;
        View view = new View(getParentActivity());
        this.W = view;
        view.setAlpha(0.0f);
        ht0 ht0Var3 = this.U;
        ht0Var3.addView(this.W, ht0Var3.indexOfChild(frameLayout), c8.ha.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        ka kaVar = new ka(this, 0);
        xq xqVar = xq.h;
        te.a aVar = new te.a(0, kaVar, xqVar, 380L, false);
        this.X = aVar;
        this.Y = new te.a(1, new ka(this, 1), xqVar, 380L, false);
        this.Z = new te.a(2, new ka(this, 2), xqVar, 380L, false);
        if (!this.f48165c.canScrollVertically(-1) && !this.simpleActionBar.s()) {
            z9 = false;
        } else {
            z9 = true;
        }
        aVar.a(z9, false);
        this.Y.a(this.U.f34422e0, false);
        this.f48165c.j(new ai.b(this, 5));
        q1();
        fh.g c10 = getBaseSimpleGlass().f21018c.c(frameLayout, null, false);
        c10.p(c8.g0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
        if (q4Var2 != null && ((ActionBarLayout) q4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        frameLayout2.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 2);
        this.S = mVar;
        vg.f fVar = mVar.f57295b;
        fVar.f57279z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        this.S.setStarParticlesView(this.f48166e);
        this.R.addView(this.S, c8.ha.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(org.telegram.messenger.hd.M0(2131744216, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131744213, null), new pa(context, 0)), true), this.R, null);
        this.f48165c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.f56954m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.f48165c.setItemAnimator(kVar);
        this.f48165c.setOnItemClickListener(new ai.k(this, 1));
        jz jzVar = new jz(getParentActivity());
        this.f3715h0 = jzVar;
        this.f48170s.addView(jzVar, c8.ha.c(-1.0f, -1));
        ea y10 = ea.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f3716i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f3716i0.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getParentActivity(), false, true, false);
        this.f3718k0 = j6Var;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f3718k0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f3718k0.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(this.f3718k0, org.telegram.ui.ActionBar.k6.G6, this.resourceProvider);
        this.f3717j0 = new SpannableStringBuilder("S");
        q50 q50Var = new q50(42.0f, this.currentAccount, this.f3718k0);
        zg0 zg0Var = new zg0(2131624217, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = q50Var.f49083b;
        imageReceiver.w0(zg0Var);
        imageReceiver.W(2);
        q50Var.f49086f = false;
        q50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.f3717j0.setSpan(q50Var, 0, 1, 33);
        this.f3716i0.addView(this.f3718k0, c8.ha.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.f3719l0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f3719l0.setGravity(17);
        this.f3719l0.setText(org.telegram.messenger.hd.M0(2131742791, null));
        org.telegram.ui.ActionBar.r6.V(this.f3719l0, org.telegram.ui.ActionBar.k6.f28258z6, this.resourceProvider);
        this.f3716i0.addView(this.f3719l0, c8.ha.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        e5 e5Var = new e5(1, getParentActivity(), this);
        this.f3720n0 = e5Var;
        frameLayout3.addView(e5Var);
        fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.f3721o0 = dVar;
        dVar.f();
        this.f3721o0.i("", false, true);
        this.f3721o0.setOnClickListener(new View.OnClickListener(this) {
            public final dd f4986b;

            {
                this.f4986b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        dd.A0(this.f4986b, context);
                        return;
                    default:
                        new uc(context, this.f4986b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f3720n0.addView(this.f3721o0, c8.ha.e(-1, 48, 119));
        c61 c61Var = new c61(3, getParentActivity(), this);
        this.f3722p0 = c61Var;
        frameLayout3.addView(c61Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.f3723q0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(2131231977, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131744966, null));
        this.f3723q0.i(spannableStringBuilder, false, true);
        this.f3723q0.setOnClickListener(new View.OnClickListener(this) {
            public final dd f4986b;

            {
                this.f4986b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        dd.A0(this.f4986b, context);
                        return;
                    default:
                        new uc(context, this.f4986b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f3722p0.addView(this.f3723q0, c8.ha.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        fi.d dVar3 = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.m0 = dVar3;
        dVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(2131231973, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131745023, null));
        this.m0.i(spannableStringBuilder2, false, true);
        this.m0.setOnClickListener(new View.OnClickListener(this) {
            public final dd f3889b;

            {
                this.f3889b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        dd ddVar = this.f3889b;
                        ddVar.presentFragment(new z(0, ddVar.getUserConfig().e()));
                        return;
                    default:
                        dd.B0(this.f3889b);
                        return;
                }
            }
        });
        this.f3722p0.addView(this.m0, c8.ha.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f3716i0.addView(frameLayout3, c8.ha.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        fi.d dVar4 = new fi.d(getParentActivity(), this.resourceProvider, false);
        this.f3724r0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new wp(2131231891, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.hd.M0(2131744214, null));
        this.f3724r0.i(spannableStringBuilder3, false, true);
        this.f3724r0.setOnClickListener(new View.OnClickListener(this) {
            public final dd f3889b;

            {
                this.f3889b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        dd ddVar = this.f3889b;
                        ddVar.presentFragment(new z(0, ddVar.getUserConfig().e()));
                        return;
                    default:
                        dd.B0(this.f3889b);
                        return;
                }
            }
        });
        this.f3716i0.addView(this.f3724r0, c8.ha.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        hc hcVar = this.f3727u0;
        if (hcVar != null) {
            hcVar.O(false);
        }
        n0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = n0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (y10.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = false;
        }
        p1(z10, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.f25076v3;
        int i12 = qs.A3;
        int i13 = qs.f25104z3;
        if (i7 == i13 || i7 == i12 || i7 == i11) {
            n1("NOTIFICATION_" + i7);
        }
        if (i7 == i11) {
            u0();
            hc hcVar = this.f3727u0;
            if (hcVar != null) {
                hcVar.O(true);
            }
            h0();
        } else if (i7 == i13) {
            ea y10 = ea.y(this.currentAccount, false);
            if (this.f3725s0 != y10.N(0)) {
                this.f3725s0 = y10.N(0);
                u0();
                hc hcVar2 = this.f3727u0;
                if (hcVar2 != null) {
                    hcVar2.O(false);
                }
                h0();
            }
        } else if (i7 == i12) {
            hc hcVar3 = this.f3727u0;
            if (hcVar3 != null) {
                hcVar3.O(true);
            }
        } else if (i7 == qs.f25097y3) {
            o1();
        } else if (i7 == qs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override
    public final void h0() {
        ht0 ht0Var;
        n1("RESTORE_BEFORE");
        super.h0();
        if (this.f3712e0 && (ht0Var = this.U) != null && this.f3708a0 != -1) {
            ht0Var.a();
        }
        this.f3712e0 = false;
        n1("RESTORE_AFTER");
    }

    @Override
    public final void i0() {
        this.f48170s.addView(this.U, c8.ha.c(-1.0f, -1));
        this.U.u(this.f48165c, new ka(this, 3));
        ht0 ht0Var = this.U;
        cd cdVar = this.T;
        ht0Var.x(cdVar, cdVar.f3610b, new a3.l(26));
        this.U.y(this.T.d);
        this.T.d.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ht0 ht0Var = this.U;
        if (ht0Var == null || motionEvent == null || ht0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.f3610b.f36904b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final v4.g0 k0() {
        hc hcVar = new hc(this, this.f48165c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 8), getResourceProvider(), 0);
        this.f3727u0 = hcVar;
        hcVar.f33473r = false;
        return hcVar;
    }

    @Override
    public final v4.b0 l0(Context context) {
        ht0 ht0Var = this.U;
        ht0Var.getClass();
        return new jg.i0(5, ht0Var, false);
    }

    @Override
    public final ug.q1 m0() {
        return new gc(getParentActivity(), 75, 1, 0);
    }

    public final void n1(String str) {
        boolean z9;
        int top;
        int height;
        if (this.U != null) {
            StringBuilder u10 = a8.p0.u("Stars event=", str, " row=");
            u10.append(this.f3708a0);
            u10.append(" hasTransactions=");
            u10.append(this.f3725s0);
            u10.append(" savedPosition=");
            u10.append(this.P);
            u10.append(" savedOffset=");
            u10.append(this.Q);
            u10.append(" savedPinned=");
            u10.append(this.f3712e0);
            u10.append(" boundaryAttached=");
            ec ecVar = this.V;
            if (ecVar != null && ecVar.getParent() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            u10.append(z9);
            u10.append(" boundaryTop=");
            ec ecVar2 = this.V;
            if (ecVar2 == null) {
                top = 0;
            } else {
                top = ecVar2.getTop();
            }
            u10.append(top);
            u10.append(" boundaryHeight=");
            ec ecVar3 = this.V;
            if (ecVar3 == null) {
                height = 0;
            } else {
                height = ecVar3.getHeight();
            }
            u10.append(height);
            Log.d("SiblingScroll", u10.toString());
            ht0 ht0Var = this.U;
            if (!ht0Var.f34414a) {
                return;
            }
            ht0Var.f34416b = Math.max(ht0Var.f34416b, Math.min(60, Math.max(0, 30)));
            ht0Var.f(str, null, 0, 0, true);
        }
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    public final void o1() {
        int i7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z9 = false;
        ea y10 = ea.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f3717j0);
        spannableStringBuilder.append((CharSequence) M0(y10.p(), 0.66f, ' '));
        this.f3718k0.setText(spannableStringBuilder);
        fi.d dVar = this.f3721o0;
        if (y10.p().amount > 0) {
            i7 = 2131745151;
        } else {
            i7 = 2131745152;
        }
        dVar.i(org.telegram.messenger.hd.M0(i7, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = n0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z9 = true;
        }
        p1(z9, true);
    }

    @Override
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.f25076v3);
        qs.f(this.currentAccount).c(this, qs.f25097y3);
        qs.f(this.currentAccount).c(this, qs.f25104z3);
        qs.f(this.currentAccount).c(this, qs.A3);
        qs.f(this.currentAccount).c(this, qs.C3);
        ea.y(this.currentAccount, false).S(true);
        ea.y(this.currentAccount, false).R();
        ea.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        pj0 pj0Var = this.f48165c;
        if (pj0Var != null) {
            pj0Var.removeCallbacks(this.f3713f0);
        }
        super.onFragmentDestroy();
        qs.f(this.currentAccount).n(this, qs.f25076v3);
        qs.f(this.currentAccount).n(this, qs.f25097y3);
        qs.f(this.currentAccount).n(this, qs.f25104z3);
        qs.f(this.currentAccount).n(this, qs.A3);
        qs.f(this.currentAccount).n(this, qs.C3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f3711d0 = true;
        this.f3709b0 = i10;
        this.f3710c0 = i12;
        J0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.S;
        if (mVar != null) {
            mVar.setPaused(true);
            this.S.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.S;
        if (mVar != null) {
            mVar.setPaused(false);
            this.S.setDialogVisible(false);
        }
    }

    public final void p1(final boolean z9, boolean z10) {
        float f10;
        int i7;
        float f11;
        this.f3726t0 = z9;
        float f12 = 1.0f;
        int i10 = 0;
        if (z10) {
            this.f3720n0.setVisibility(0);
            this.f3722p0.setVisibility(0);
            ViewPropertyAnimator animate = this.f3720n0.animate();
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animate.alpha(f11).withEndAction(new Runnable(this) {
                public final dd f4588b;

                {
                    this.f4588b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z9) {
                                this.f4588b.f3720n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z9) {
                                this.f4588b.f3722p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f3722p0.animate();
            if (!z9) {
                f12 = 0.0f;
            }
            animate2.alpha(f12).withEndAction(new Runnable(this) {
                public final dd f4588b;

                {
                    this.f4588b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z9) {
                                this.f4588b.f3720n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z9) {
                                this.f4588b.f3722p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.f3720n0.animate().cancel();
        this.f3722p0.animate().cancel();
        c61 c61Var = this.f3722p0;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        c61Var.setAlpha(f10);
        e5 e5Var = this.f3720n0;
        if (z9) {
            f12 = 0.0f;
        }
        e5Var.setAlpha(f12);
        c61 c61Var2 = this.f3722p0;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        c61Var2.setVisibility(i7);
        e5 e5Var2 = this.f3720n0;
        if (z9) {
            i10 = 8;
        }
        e5Var2.setVisibility(i10);
    }

    @Override
    public final float q0() {
        pj0 pj0Var = this.f48165c;
        if (pj0Var == null) {
            return 0.0f;
        }
        return pj0Var.getY();
    }

    public final void q1() {
        if (this.W == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f3709b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.W.setLayoutParams(layoutParams);
        }
        r1();
    }

    @Override
    public final View r0() {
        return this.U;
    }

    public final void r1() {
        float f10;
        View view = this.W;
        if (view == null) {
            return;
        }
        te.a aVar = this.X;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f55370e;
        }
        te.a aVar2 = this.Y;
        if (aVar2 != null) {
            f11 = aVar2.f55370e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * org.telegram.messenger.g0.L(44.0f)));
    }

    @Override
    public final void s0(boolean z9) {
        te.a aVar = this.Z;
        if (aVar != null && aVar.f55371f != z9) {
            aVar.a(z9, true);
        }
    }

    @Override
    public final void u0() {
        boolean z9;
        n1("SAVE_BEFORE");
        super.u0();
        ht0 ht0Var = this.U;
        if (ht0Var != null && ht0Var.f34422e0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f3712e0 = z9;
        pj0 pj0Var = this.f48165c;
        if (pj0Var != null && this.P >= 0) {
            this.Q -= pj0Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
