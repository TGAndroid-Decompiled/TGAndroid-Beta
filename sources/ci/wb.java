package ci;

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
import b8.cd;
import b8.mf;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k00;
import org.telegram.ui.k50;
import org.telegram.ui.l00;
import org.telegram.ui.ln;
import org.telegram.ui.s51;
import org.telegram.ui.wm;
public final class wb extends l00 implements cs {
    public static DecimalFormat f6274w0;
    public static DecimalFormat f6275x0;
    public FrameLayout S;
    public wg.m T;
    public vb U;
    public gt0 V;
    public ai.x2 W;
    public View X;
    public qe.a Y;
    public qe.a Z;
    public qe.a f6276a0;
    public int f6278c0;
    public int f6279d0;
    public boolean f6280e0;
    public boolean f6281f0;
    public ai.x2 f6283h0;
    public gz f6284i0;
    public LinearLayout f6285j0;
    public SpannableStringBuilder f6286k0;
    public org.telegram.ui.Components.h6 f6287l0;
    public TextView m0;
    public gi.d f6288n0;
    public ai.o2 f6289o0;
    public gi.d f6290p0;
    public s51 f6291q0;
    public gi.d f6292r0;
    public gi.d f6293s0;
    public boolean f6294t0;
    public boolean f6295u0;
    public ai.f6 f6296v0;
    public int f6277b0 = -1;
    public final d1 f6282g0 = new d1(this, 9);

    public wb() {
        this.N = true;
    }

    public static void A0(wb wbVar, Context context) {
        if (hp.s1(wbVar.currentAccount).v2()) {
            org.telegram.ui.b.b(wbVar.currentAccount);
        } else {
            new nb(context, wbVar.resourceProvider).show();
        }
    }

    public static void B0(wb wbVar) {
        e9.y(wbVar.currentAccount, false).u();
        xg.e1.l1(1, org.telegram.messenger.v1.a(wbVar.currentAccount).b());
    }

    public static void C0(ci.wb r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: ci.wb.C0(ci.wb, int):void");
    }

    public static void D0(wb wbVar, r31 r31Var, Boolean bool, String str) {
        if (wbVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                org.telegram.ui.Components.fc.a0(wbVar).I(2131624226, bd.M0(2131745169, null), org.telegram.messenger.g0.X2(bd.G((int) r31Var.B, "StarsAcquiredInfo", new Object[0]))).j();
                wbVar.f6284i0.c(true);
                e9.y(wbVar.currentAccount, false).S(true);
            } else if (str != null) {
                org.telegram.ui.Components.fc.a0(wbVar).Q(2131624011, 36, bd.a0(null, null, 2131743888, str)).j();
            }
        }
    }

    public static void H0(rx0 rx0Var, int i3, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        CharSequence K;
        CharSequence charSequence;
        TextView textView = (TextView) ((ox0) rx0Var.c(bd.M0(2131750308, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        x70 x70Var = new x70(textView, org.telegram.messenger.g0.L(90.0f), 0, e6Var);
        x70Var.a(org.telegram.ui.ActionBar.k6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.k6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(x70Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final e9 y9 = e9.y(i3, false);
            final long j10 = starGift.f27230id;
            final ai.v2 v2Var = new ai.v2(textView, 13);
            final boolean[] zArr = {false};
            final cs[] csVarArr = {new cs() {
                @Override
                public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                    int i12;
                    e9 e9Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i10 == (i12 = hs.F3) && (J = (e9Var = e9.this).J(j10)) != null) {
                        zArr2[0] = true;
                        hs.f(e9Var.f5029a).n(csVarArr[0], i12);
                        v2Var.a(J);
                    }
                }
            }};
            int i10 = y9.f5029a;
            hs f10 = hs.f(i10);
            cs csVar = csVarArr[0];
            int i11 = hs.F3;
            f10.b(csVar, i11);
            TL_stars.StarGift J = y9.J(j10);
            if (J != null) {
                zArr[0] = true;
                hs.f(i10).n(csVarArr[0], i11);
                v2Var.a(J);
            }
        } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = bd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = bd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + bd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
        } else {
            int i12 = starGift.availability_remains;
            if (i12 <= 0) {
                K = bd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                K = bd.K("Gift2Availability4Value", i12, ',', bd.E(starGift.availability_total, ','));
            }
            textView.setText(K);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ya(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        return M0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f10, char c2) {
        double d;
        int i3;
        if (f6275x0 == null) {
            f6275x0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f6275x0.format(j10 / 1.0E9d);
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
                sb2.append(bd.E(Math.abs(starsAmount.amount / 1000000000), c2));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z10 = false;
            if (i10 < 0 && j11 > 0) {
                i3 = -1;
                d = 1.0E9d;
            } else if (i10 > 0 && j11 < 0) {
                d = 1.0E9d;
                i3 = 1;
            } else {
                d = 1.0E9d;
                i3 = 0;
            }
            long j12 = i3 + j11;
            int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i11 != 0 ? i11 < 0 : i10 < 0) {
                z10 = true;
            }
            if (i10 != 0) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(bd.E(Math.abs(j12), c2));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f6275x0;
                int i12 = starsAmount.nanos;
                double d10 = i12;
                if (i12 < 0) {
                    d10 += d;
                }
                String format2 = decimalFormat.format(d10 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(bd.E(Math.abs(j12), c2));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder N0(TL_stars.StarsAmount starsAmount, float f10, char c2) {
        double d;
        int i3;
        boolean z10;
        if (f6275x0 == null) {
            f6275x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f6275x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            if (i10 < 0 && j10 > 0) {
                i3 = -1;
                d = 1.0E9d;
            } else if (i10 > 0 && j10 < 0) {
                d = 1.0E9d;
                i3 = 1;
            } else {
                d = 1.0E9d;
                i3 = 0;
            }
            long j11 = i3 + j10;
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 != 0 ? i11 < 0 : i10 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str = "";
            if (Math.abs(j11) <= 1000 && starsAmount.nanos != 0) {
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(bd.E(Math.abs(j11), c2));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f6275x0;
                int i12 = starsAmount.nanos;
                double d10 = i12;
                if (i12 < 0) {
                    d10 += d;
                }
                String format2 = decimalFormat.format(d10 / d);
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
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(bd.E(Math.abs(j11), c2));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(org.telegram.messenger.g0.o0((int) Math.abs(j11), 0));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder O0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i3;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f6275x0 == null) {
                f6275x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f6275x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = starsAmount.amount;
        int i10 = starsAmount.nanos;
        boolean z10 = false;
        if (i10 < 0 && j10 > 0) {
            i3 = -1;
            d = 1.0E9d;
        } else if (i10 > 0 && j10 < 0) {
            d = 1.0E9d;
            i3 = 1;
        } else {
            d = 1.0E9d;
            i3 = 0;
        }
        long j11 = i3 + j10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 != 0 ? i11 < 0 : i10 < 0) {
            z10 = true;
        }
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                str = "-";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(bd.E(Math.abs(j11), ','));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (f6275x0 == null) {
                f6275x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f6275x0;
            int i12 = starsAmount.nanos;
            double d10 = i12;
            if (i12 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131745094, null));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) bd.H(',', "Stars", (int) j10));
        return spannableStringBuilder;
    }

    public static String P0(long j10) {
        String str;
        if (f6274w0 == null) {
            f6274w0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f6274w0.format(j10 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (j10 < 0) {
            str = "-";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(bd.E(Math.abs(j10 / 1000000000), ','));
        return sb2.toString();
    }

    public static java.lang.String Q0(int r6, boolean r7, org.telegram.tgnet.tl.TL_stars.StarsTransaction r8) {
        throw new UnsupportedOperationException("Method not decompiled: ci.wb.Q0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
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
        wpVar.f40045r = 0.0f;
        wpVar.f40046s = f11;
        wpVar.H = f12;
        wpVar.I = f10;
        wpVar.J = f10;
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

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z10) {
        return X0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, wp[] wpVarArr, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        wp wpVar;
        int i3;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z10) {
            str = "⭐";
        } else {
            str = "TON";
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            if (z10) {
                i3 = 2131231957;
            } else {
                i3 = 2131232307;
            }
            wpVar = new wp(i3, 0);
            if (wpVarArr != null) {
                wpVarArr[0] = wpVar;
            }
        }
        wpVar.f40045r = 0.0f;
        wpVar.f40046s = f11;
        wpVar.H = f12;
        if (z10) {
            wpVar.d = false;
            float f13 = f10 * 0.2f;
            wpVar.I = f13;
            wpVar.J = f13;
        } else {
            wpVar.I = f10;
            wpVar.J = f10;
        }
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z10, String str, wp[] wpVarArr) {
        wp wpVar;
        int i3;
        float f10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            if (z10) {
                i3 = 2131231957;
            } else {
                i3 = 2131232307;
            }
            wpVar = new wp(i3, 0);
            float f11 = 1.13f;
            if (z10) {
                f10 = 0.222f;
            } else {
                f10 = 1.13f;
            }
            if (z10) {
                f11 = 0.222f;
            }
            wpVar.I = f10;
            wpVar.J = f11;
        }
        if (z10) {
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

    public static SpannableStringBuilder a1(boolean z10, CharSequence charSequence, float f10, wp[] wpVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i3;
        wp wpVar;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z10) {
            str = "⭐";
        } else {
            str = "TON";
        }
        if (z10) {
            i3 = 2131231957;
        } else {
            i3 = 2131232750;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            if (wpVarArr != null && wpVarArr.length > 0) {
                wpVar = new wp(i3, 0);
                wpVarArr[0] = wpVar;
            } else {
                wpVar = new wp(i3, 0);
            }
        }
        wpVar.d = false;
        if (z10) {
            f10 *= 0.33f;
        }
        wpVar.I = f10;
        wpVar.J = f10;
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static ma b1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i3;
        int i10 = imageReceiver.d;
        final ka kaVar = new ka(z10, i10, str, imageReceiver, new boolean[1]);
        kaVar.run();
        hs f10 = hs.f(i10);
        if (z10) {
            i3 = hs.X2;
        } else {
            i3 = hs.W2;
        }
        return new ma(f10.h(view, i3, new u10() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        kaVar.run();
                        return;
                    default:
                        kaVar.run();
                        return;
                }
            }
        }), hs.f(i10).h(view, hs.f23340y0, new u10() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        kaVar.run();
                        return;
                    default:
                        kaVar.run();
                        return;
                }
            }
        }), 0);
    }

    public static void c1(ImageReceiver imageReceiver, TLRPC.Document document, int i3) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, i3, false, null, false);
        imageReceiver.r0(org.telegram.messenger.ac.b(document), com.google.android.recaptcha.internal.a.i(i3, "_", i3), org.telegram.messenger.ac.c(w10, document), com.google.android.recaptcha.internal.a.i(i3, "_", i3), org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f27824a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void d1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i3) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        c1(imageReceiver, document, i3);
    }

    public static void e1(org.telegram.ui.Components.k9 k9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 1000) {
            str = "2⃣";
        } else if (j10 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        b1(k9Var, imageReceiver, str, false);
    }

    public static ma f1(org.telegram.ui.Components.k9 k9Var, ImageReceiver imageReceiver, int i3) {
        String str;
        if (i3 != 3) {
            if (i3 != 6) {
                if (i3 != 12) {
                    if (i3 != 24) {
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
        return b1(k9Var, imageReceiver, str, false);
    }

    public static void g1(org.telegram.ui.Components.k9 k9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 10000000000L) {
            str = "2⃣";
        } else if (j10 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        b1(k9Var, imageReceiver, str, true);
    }

    public static void h1(Context context, int i3, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.e6 e6Var) {
        ?? r18;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, mf.t(-1, 150, 7, 0, 0, 0, 10));
        bb bbVar = new bb(context, 70, 0, 0);
        frameLayout.addView(bbVar, mf.c(-1.0f, -1));
        wg.m mVar = new wg.m(context, 1, 2);
        wg.f fVar = mVar.f57666b;
        fVar.f57650z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        mVar.setStarParticlesView(bbVar);
        frameLayout.addView(mVar, mf.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.t2[] t2VarArr = new org.telegram.ui.ActionBar.t2[1];
        textView.setText(bd.H(' ', "BoostStars", (int) boost.stars));
        ?? f11 = org.telegram.messenger.camera.q.f(f10, textView, mf.t(-1, -2, 17, 20, 0, 20, 4), context);
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
        sb2.append(bd.H(' ', "BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        wp wpVar = new wp(2131231928, 2);
        wpVar.f40045r = 0.0f;
        wpVar.f40046s = org.telegram.messenger.g0.L(0.66f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        f11.setText(spannableStringBuilder);
        f10.addView(f11, mf.t(-2, 20, 17, 20, 4, 20, 4));
        rx0 rx0Var = new rx0(context, e6Var);
        rx0Var.n(bd.M0(2131753627, null), i3, j10, new o9(t2VarArr, j10, 6));
        rx0Var.c(bd.M0(2131753626, null), bd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = bd.M0(2131753615, null);
            String M02 = bd.M0(2131753614, null);
            r18 = 0;
            ai.r1 r1Var = new ai.r1(t2VarArr, j10, boost, 4);
            t2VarArr = t2VarArr;
            rx0Var.i(M0, M02, r1Var);
        } else {
            r18 = 0;
        }
        String M03 = bd.M0(2131753662, null);
        String format = bd.E0().s0().format(new Date(boost.date * 1000));
        String format2 = bd.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[r18] = format;
        objArr[1] = format2;
        rx0Var.c(M03, bd.a0(null, null, 2131742793, objArr), null, null);
        String M04 = bd.M0(2131753607, null);
        String format3 = bd.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = bd.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[r18] = format3;
        objArr2[1] = format4;
        rx0Var.c(M04, bd.a0(null, null, 2131742793, objArr2), null, null);
        f10.addView(rx0Var, mf.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        s70 s70Var = new s70(context, e6Var);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(2131744936, null), new ai.s1(context, 3)));
        s70Var.setGravity(17);
        f10.addView(s70Var, mf.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.i(bd.M0(2131747839, null), r18, true);
        dVar.setOnClickListener(new t9(t2VarArr, 1));
        f10.addView(dVar, mf.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        l10.O = f10;
        t2VarArr[0] = l10;
        l10.U0 = false;
        l10.N();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            t2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        t2VarArr[0].show();
        t2VarArr[0].n(new d1(mVar, 10));
    }

    public static a1 i1(Context context, int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique, n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        dg.a resellAmount;
        dg.b bVar = dg.b.f8925a;
        if (tL_starGiftUnique == null) {
            resellAmount = dg.a.g(((org.telegram.messenger.j0) hp.s1(i3).f23167x7.f24671p.f13798b).f23620c, bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(dg.b.f8926b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        a1 a1Var = new a1(context, e6Var, i3, resellAmount, new ai.o1(10, n10Var, r8));
        a1[] a1VarArr = {a1Var};
        a1Var.show();
        return a1VarArr[0];
    }

    public static void j1(Context context, long j10, boolean z10, final n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        int i10;
        CharSequence l10;
        org.telegram.ui.ActionBar.t2[] t2VarArr;
        long j11;
        boolean z11 = false;
        org.telegram.ui.ActionBar.t2 l11 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        gi.d dVar = null;
        textView.setText(bd.M0(2131747740, null));
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
        linearLayout.addView(textView, mf.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        gb0 gb0Var = new gb0(context, e6Var);
        gb0Var.setForceForceUseCenter(true);
        gb0Var.setText(bd.M0(2131747741, null));
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i11, e6Var);
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
        org.telegram.ui.ActionBar.r6.D(editTextBoldCursor, org.telegram.ui.ActionBar.k6.ig, e6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.f27998jg, e6Var);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        editTextBoldCursor.setGravity(i3);
        editTextBoldCursor.setOnFocusChangeListener(new y9(gb0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232750);
        linearLayout2.addView(imageView, mf.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, mf.p(-1, -2, 1.0f, 119));
        gb0Var.e(editTextBoldCursor);
        gb0Var.addView(linearLayout2, mf.e(-1, -2, 48));
        linearLayout.addView(gb0Var, mf.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.A6, null);
        gb0Var.addView(textView2, mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        s70 s70Var = new s70(context, null);
        s70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131747743, null), new ai.s1(context, 4)), true));
        s70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        linearLayout.addView(s70Var, mf.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 > 0) {
            i10 = 2131747739;
        } else {
            i10 = 2131747745;
        }
        h.i(bd.M0(i10, null), false, true);
        linearLayout.addView(h, mf.o(-1, 48));
        if (i12 > 0 && z10) {
            gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, false);
            h7.i(bd.M0(2131747744, null), false, false);
            linearLayout.addView(h7, mf.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = h7;
        }
        l11.O = linearLayout;
        final org.telegram.ui.ActionBar.t2[] t2VarArr2 = {l11};
        if (i12 <= 0) {
            l10 = "";
        } else {
            l10 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l10);
        editTextBoldCursor.addTextChangedListener(new za(editTextBoldCursor, gb0Var, j10, z10, h, textView2));
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
                n10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new da(editTextBoldCursor2, t2VarArr2, 1));
                return true;
            }
        });
        aa aaVar = new aa(zArr, n10Var, editTextBoldCursor, h, t2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        h.setOnClickListener(aaVar);
        if (dVar != null) {
            gi.d dVar2 = dVar;
            aa aaVar2 = new aa(zArr, n10Var, dVar2, editTextBoldCursor2, t2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            t2VarArr = t2VarArr2;
            dVar2.setOnClickListener(aaVar2);
        } else {
            t2VarArr = t2VarArr2;
        }
        t2VarArr[0].N();
        t2VarArr[0].setOnDismissListener(new ba(editTextBoldCursor2, 0));
        t2VarArr[0].show();
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q instanceof wm) {
            z11 = ((wm) Q).pa();
        }
        da daVar = new da(t2VarArr, editTextBoldCursor2);
        if (z11) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        org.telegram.messenger.g0.i3(daVar, j11);
    }

    public static org.telegram.ui.ActionBar.t2 k1(final android.content.Context r59, final boolean r60, final long r61, final int r63, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r64, final org.telegram.ui.ActionBar.e6 r65) {
        throw new UnsupportedOperationException("Method not decompiled: ci.wb.k1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.e6):org.telegram.ui.ActionBar.t2");
    }

    public static void l1(Activity activity, int i3, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.e6 e6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i10;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f27232id = tL_messageActionPaymentRefunded.charge.f27131id;
        starsTransaction.refund = true;
        k1(activity, false, 0L, i3, starsTransaction, e6Var);
    }

    public static void m1(Context context, int i3, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.e6 e6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = hp.s1(i3).z1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f27232id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i3, starsTransaction, e6Var);
    }

    public static CharSequence s1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        wp[] wpVarArr;
        z4.o c2;
        if (z10 && com.google.android.recaptcha.internal.a.u(spannableStringBuilder)) {
            for (wp wpVar : (wp[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wp.class)) {
                Drawable drawable = wpVar.f40041c;
                if (drawable != null && !(drawable instanceof z4.o) && (c2 = z4.o.c(org.telegram.messenger.t0.f25457b.getResources(), 2131231958, null)) != null) {
                    c2.setBounds(wpVar.f40041c.getBounds());
                    wpVar.f40041c = c2;
                    wpVar.d = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public final void J0() {
        q1();
        tj0 tj0Var = this.f47063c;
        if (tj0Var != null && this.V != null && tj0Var.getLayoutParams() != null) {
            int C = org.telegram.messenger.camera.q.C(48.0f, this.f6278c0, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.camera.q.C(48.0f, this.f6279d0, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.messenger.g0.B3(this.f47063c, 0, C, 0, C2);
            tj0 tj0Var2 = this.f47063c;
            int i3 = -C;
            tj0Var2.setPadding(tj0Var2.getPaddingLeft(), i3, this.f47063c.getPaddingRight(), this.f6279d0 - C2);
            this.V.z(i3, -C2);
        }
    }

    public final void K0(ArrayList arrayList, f41 f41Var) {
        boolean z10;
        tj0 tj0Var;
        int i3;
        n1("FILL_BEFORE");
        gt0 gt0Var = this.V;
        if (gt0Var != null && gt0Var.f34196f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6277b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        e9 y9 = e9.y(this.currentAccount, false);
        ArrayList arrayList2 = y9.v;
        r31 r31Var = new r31(-2);
        r31Var.f37620c = (org.telegram.ui.Components.voip.r0) super.o0(getParentActivity());
        arrayList.add(r31Var);
        arrayList.add(r31.k(this.f6285j0));
        gi.d dVar = this.f6293s0;
        if (dVar != null) {
            if (getMessagesController().X5) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            dVar.setVisibility(i3);
        }
        arrayList.add(r31.C(null));
        if (getMessagesController().f23017g6) {
            arrayList.add(ii.g.i(-4, getThemedColor(org.telegram.ui.ActionBar.k6.ik), ln.i0(bd.M0(2131743776, null)), bd.M0(2131743777, null)));
            arrayList.add(r31.C(null));
        }
        if (y9.f5032e && !arrayList2.isEmpty()) {
            arrayList.add(r31.u(bd.M0(2131745213, null)));
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                int i11 = ob.f5712b;
                r31 K = r31.K(ob.class);
                K.G = (TL_stars.StarsSubscription) arrayList2.get(i10);
                arrayList.add(K);
            }
            if (y9.f5049x) {
                arrayList.add(r31.q(arrayList.size(), 33));
            } else if (!y9.f5050y) {
                r31 c2 = r31.c(-3, 2131230871, bd.M0(2131745212, null));
                c2.f37632q = true;
                arrayList.add(c2);
            }
            arrayList.add(r31.C(null));
        }
        boolean N = y9.N(0);
        this.f6294t0 = N;
        if (N) {
            this.f6277b0 = arrayList.size();
            arrayList.add(r31.n(this.W, -2));
            if (z10 && (tj0Var = this.f47063c) != null) {
                d1 d1Var = this.f6282g0;
                tj0Var.removeCallbacks(d1Var);
                this.f47063c.post(d1Var);
            }
        } else {
            arrayList.add(r31.m(this.f6283h0));
        }
        n1("FILL_AFTER");
    }

    @Override
    public final View createView(final Context context) {
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i3;
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        gt0 gt0Var = new gt0(context);
        this.V = gt0Var;
        boolean z11 = true;
        gt0Var.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.f6280e0) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
                i3 = 0;
            } else {
                i3 = org.telegram.messenger.g0.f22602m;
            }
            this.f6278c0 = i3;
            this.f6279d0 = org.telegram.messenger.g0.f22603n;
        }
        this.V.setGeometry(new android.support.v4.media.c(this, 9));
        this.V.z(-org.telegram.messenger.camera.q.C(48.0f, this.f6278c0, -org.telegram.messenger.g0.L(8.0f)), -org.telegram.messenger.camera.q.C(48.0f, this.f6279d0, -org.telegram.messenger.g0.L(8.0f)));
        gt0 gt0Var2 = this.V;
        gt0Var2.getClass();
        this.W = new ai.x2(26, context, gt0Var2);
        this.U = new vb(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.f6283h0 = new ai.x2(1, context, this);
        super.createView(context);
        k00 k00Var = this.f47068s;
        getBaseSimpleGlass().f(k00Var, this.f47063c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f53533m = this.V;
        this.f47063c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f53534n = new g(1, this, new f(1, k00Var));
        FrameLayout frameLayout = this.U.d;
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        gt0 gt0Var3 = this.V;
        gt0Var3.addView(this.X, gt0Var3.indexOfChild(frameLayout), mf.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        k9 k9Var = new k9(this, 0);
        xq xqVar = xq.h;
        qe.a aVar = new qe.a(0, k9Var, xqVar, 380L, false);
        this.Y = aVar;
        this.Z = new qe.a(1, new k9(this, 1), xqVar, 380L, false);
        this.f6276a0 = new qe.a(2, new k9(this, 2), xqVar, 380L, false);
        if (!this.f47063c.canScrollVertically(-1) && !this.simpleActionBar.s()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar.a(z10, false);
        this.Z.a(this.V.f34196f0, false);
        this.f47063c.j(new ai.j5(this, 8));
        q1();
        gh.g c2 = getBaseSimpleGlass().f53525c.c(frameLayout, null, false);
        c2.p(cd.m(this.resourceProvider));
        c2.q(org.telegram.messenger.g0.L(9.66f));
        c2.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c2);
        org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
        if (q4Var2 != null && ((ActionBarLayout) q4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        frameLayout2.setClickable(true);
        wg.m mVar = new wg.m(context, 1, 2);
        this.T = mVar;
        wg.f fVar = mVar.f57666b;
        fVar.f57650z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        this.T.setStarParticlesView(this.f47064e);
        this.S.addView(this.T, mf.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(bd.M0(2131744225, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131744222, null), new ai.s1(context, 1)), true), this.S, null);
        this.f47063c.setOverScrollMode(2);
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.f47063c.setItemAnimator(kVar);
        this.f47063c.setOnItemClickListener(new ai.j6(this, 2));
        gz gzVar = new gz(getParentActivity());
        this.f6284i0 = gzVar;
        this.f47068s.addView(gzVar, mf.c(-1.0f, -1));
        e9 y9 = e9.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f6285j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f6285j0.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getParentActivity(), false, true, false);
        this.f6287l0 = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f6287l0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f6287l0.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(this.f6287l0, org.telegram.ui.ActionBar.k6.G6, this.resourceProvider);
        this.f6286k0 = new SpannableStringBuilder("S");
        k50 k50Var = new k50(42.0f, this.currentAccount, this.f6287l0);
        ch0 ch0Var = new ch0(2131624217, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = k50Var.f46772b;
        imageReceiver.w0(ch0Var);
        imageReceiver.W(2);
        k50Var.f46775f = false;
        k50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.f6286k0.setSpan(k50Var, 0, 1, 33);
        this.f6285j0.addView(this.f6287l0, mf.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(bd.M0(2131742800, null));
        org.telegram.ui.ActionBar.r6.V(this.m0, org.telegram.ui.ActionBar.k6.f28290z6, this.resourceProvider);
        this.f6285j0.addView(this.m0, mf.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        ai.o2 o2Var = new ai.o2(2, getParentActivity(), this);
        this.f6289o0 = o2Var;
        frameLayout3.addView(o2Var);
        gi.d dVar = new gi.d(getParentActivity(), this.resourceProvider, true);
        this.f6290p0 = dVar;
        dVar.f();
        this.f6290p0.i("", false, true);
        this.f6290p0.setOnClickListener(new View.OnClickListener(this) {
            public final wb f6117b;

            {
                this.f6117b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        wb.A0(this.f6117b, context);
                        return;
                    default:
                        new nb(context, this.f6117b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f6289o0.addView(this.f6290p0, mf.e(-1, 48, 119));
        s51 s51Var = new s51(4, getParentActivity(), this);
        this.f6291q0 = s51Var;
        frameLayout3.addView(s51Var);
        gi.d dVar2 = new gi.d(getParentActivity(), this.resourceProvider, true);
        this.f6292r0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(2131231977, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) bd.M0(2131744975, null));
        this.f6292r0.i(spannableStringBuilder, false, true);
        this.f6292r0.setOnClickListener(new View.OnClickListener(this) {
            public final wb f6117b;

            {
                this.f6117b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        wb.A0(this.f6117b, context);
                        return;
                    default:
                        new nb(context, this.f6117b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f6291q0.addView(this.f6292r0, mf.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        gi.d dVar3 = new gi.d(getParentActivity(), this.resourceProvider, true);
        this.f6288n0 = dVar3;
        dVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(2131231973, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) bd.M0(2131745032, null));
        this.f6288n0.i(spannableStringBuilder2, false, true);
        this.f6288n0.setOnClickListener(new View.OnClickListener(this) {
            public final wb f4938b;

            {
                this.f4938b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f4938b;
                        wbVar.presentFragment(new v(0, wbVar.getUserConfig().e()));
                        return;
                    default:
                        wb.B0(this.f4938b);
                        return;
                }
            }
        });
        this.f6291q0.addView(this.f6288n0, mf.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f6285j0.addView(frameLayout3, mf.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        gi.d dVar4 = new gi.d(getParentActivity(), this.resourceProvider, false);
        this.f6293s0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new wp(2131231891, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) bd.M0(2131744223, null));
        this.f6293s0.i(spannableStringBuilder3, false, true);
        this.f6293s0.setOnClickListener(new View.OnClickListener(this) {
            public final wb f4938b;

            {
                this.f4938b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f4938b;
                        wbVar.presentFragment(new v(0, wbVar.getUserConfig().e()));
                        return;
                    default:
                        wb.B0(this.f4938b);
                        return;
                }
            }
        });
        this.f6285j0.addView(this.f6293s0, mf.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        ai.f6 f6Var = this.f6296v0;
        if (f6Var != null) {
            f6Var.O(false);
        }
        i0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = i0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (y9.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z11 = false;
        }
        p1(z11, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.f23322v3;
        int i12 = hs.A3;
        int i13 = hs.f23350z3;
        if (i3 == i13 || i3 == i12 || i3 == i11) {
            n1("NOTIFICATION_" + i3);
        }
        if (i3 == i11) {
            u0();
            ai.f6 f6Var = this.f6296v0;
            if (f6Var != null) {
                f6Var.O(true);
            }
            h0();
        } else if (i3 == i13) {
            e9 y9 = e9.y(this.currentAccount, false);
            if (this.f6294t0 != y9.N(0)) {
                this.f6294t0 = y9.N(0);
                u0();
                ai.f6 f6Var2 = this.f6296v0;
                if (f6Var2 != null) {
                    f6Var2.O(false);
                }
                h0();
            }
        } else if (i3 == i12) {
            ai.f6 f6Var3 = this.f6296v0;
            if (f6Var3 != null) {
                f6Var3.O(true);
            }
        } else if (i3 == hs.f23343y3) {
            o1();
        } else if (i3 == hs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override
    public final void h0() {
        gt0 gt0Var;
        n1("RESTORE_BEFORE");
        super.h0();
        if (this.f6281f0 && (gt0Var = this.V) != null && this.f6277b0 != -1) {
            gt0Var.a();
        }
        this.f6281f0 = false;
        n1("RESTORE_AFTER");
    }

    @Override
    public final void i0() {
        this.f47068s.addView(this.V, mf.c(-1.0f, -1));
        this.V.u(this.f47063c, new k9(this, 3));
        gt0 gt0Var = this.V;
        vb vbVar = this.U;
        gt0Var.x(vbVar, vbVar.f6215b, new a3.j(22));
        this.V.y(this.U.d);
        this.U.d.setLayoutParams(mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        gt0 gt0Var = this.V;
        if (gt0Var == null || motionEvent == null || gt0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.f6215b.f36384b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final u4.h0 k0() {
        ai.f6 f6Var = new ai.f6(this, this.f47063c, getParentActivity(), this.currentAccount, this.classGuid, new ai.c(this, 18), getResourceProvider(), 1);
        this.f6296v0 = f6Var;
        f6Var.f33698r = false;
        return f6Var;
    }

    @Override
    public final u4.b0 l0(Context context) {
        gt0 gt0Var = this.V;
        gt0Var.getClass();
        return new kg.f0(5, gt0Var, false);
    }

    @Override
    public final vg.t1 m0() {
        return new bb(getParentActivity(), 75, 1, 0);
    }

    public final void n1(String str) {
        boolean z10;
        int top;
        int height;
        if (this.V != null) {
            StringBuilder u10 = a1.g.u("Stars event=", str, " row=");
            u10.append(this.f6277b0);
            u10.append(" hasTransactions=");
            u10.append(this.f6294t0);
            u10.append(" savedPosition=");
            u10.append(this.Q);
            u10.append(" savedOffset=");
            u10.append(this.R);
            u10.append(" savedPinned=");
            u10.append(this.f6281f0);
            u10.append(" boundaryAttached=");
            ai.x2 x2Var = this.W;
            if (x2Var != null && x2Var.getParent() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u10.append(z10);
            u10.append(" boundaryTop=");
            ai.x2 x2Var2 = this.W;
            if (x2Var2 == null) {
                top = 0;
            } else {
                top = x2Var2.getTop();
            }
            u10.append(top);
            u10.append(" boundaryHeight=");
            ai.x2 x2Var3 = this.W;
            if (x2Var3 == null) {
                height = 0;
            } else {
                height = x2Var3.getHeight();
            }
            u10.append(height);
            Log.d("SiblingScroll", u10.toString());
            gt0 gt0Var = this.V;
            if (!gt0Var.f34186a) {
                return;
            }
            gt0Var.f34188b = Math.max(gt0Var.f34188b, Math.min(60, Math.max(0, 30)));
            gt0Var.f(str, null, 0, 0, true);
        }
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    public final void o1() {
        int i3;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        e9 y9 = e9.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f6286k0);
        spannableStringBuilder.append((CharSequence) M0(y9.p(), 0.66f, ' '));
        this.f6287l0.setText(spannableStringBuilder);
        gi.d dVar = this.f6290p0;
        if (y9.p().amount > 0) {
            i3 = 2131745160;
        } else {
            i3 = 2131745161;
        }
        dVar.i(bd.M0(i3, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = i0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        p1(z10, true);
    }

    @Override
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.f23322v3);
        hs.f(this.currentAccount).c(this, hs.f23343y3);
        hs.f(this.currentAccount).c(this, hs.f23350z3);
        hs.f(this.currentAccount).c(this, hs.A3);
        hs.f(this.currentAccount).c(this, hs.C3);
        e9.y(this.currentAccount, false).S(true);
        e9.y(this.currentAccount, false).R();
        e9.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        tj0 tj0Var = this.f47063c;
        if (tj0Var != null) {
            tj0Var.removeCallbacks(this.f6282g0);
        }
        super.onFragmentDestroy();
        hs.f(this.currentAccount).n(this, hs.f23322v3);
        hs.f(this.currentAccount).n(this, hs.f23343y3);
        hs.f(this.currentAccount).n(this, hs.f23350z3);
        hs.f(this.currentAccount).n(this, hs.A3);
        hs.f(this.currentAccount).n(this, hs.C3);
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f6280e0 = true;
        this.f6278c0 = i10;
        this.f6279d0 = i12;
        J0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        wg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        wg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    public final void p1(final boolean z10, boolean z11) {
        float f10;
        int i3;
        float f11;
        this.f6295u0 = z10;
        float f12 = 1.0f;
        int i10 = 0;
        if (z11) {
            this.f6289o0.setVisibility(0);
            this.f6291q0.setVisibility(0);
            ViewPropertyAnimator animate = this.f6289o0.animate();
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animate.alpha(f11).withEndAction(new Runnable(this) {
                public final wb f5654b;

                {
                    this.f5654b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f5654b.f6289o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f5654b.f6291q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f6291q0.animate();
            if (!z10) {
                f12 = 0.0f;
            }
            animate2.alpha(f12).withEndAction(new Runnable(this) {
                public final wb f5654b;

                {
                    this.f5654b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f5654b.f6289o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f5654b.f6291q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.f6289o0.animate().cancel();
        this.f6291q0.animate().cancel();
        s51 s51Var = this.f6291q0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        s51Var.setAlpha(f10);
        ai.o2 o2Var = this.f6289o0;
        if (z10) {
            f12 = 0.0f;
        }
        o2Var.setAlpha(f12);
        s51 s51Var2 = this.f6291q0;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        s51Var2.setVisibility(i3);
        ai.o2 o2Var2 = this.f6289o0;
        if (z10) {
            i10 = 8;
        }
        o2Var2.setVisibility(i10);
    }

    @Override
    public final float q0() {
        tj0 tj0Var = this.f47063c;
        if (tj0Var == null) {
            return 0.0f;
        }
        return tj0Var.getY();
    }

    public final void q1() {
        if (this.X == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f6278c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        r1();
    }

    @Override
    public final View r0() {
        return this.V;
    }

    public final void r1() {
        float f10;
        View view = this.X;
        if (view == null) {
            return;
        }
        qe.a aVar = this.Y;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f53840e;
        }
        qe.a aVar2 = this.Z;
        if (aVar2 != null) {
            f11 = aVar2.f53840e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * org.telegram.messenger.g0.L(44.0f)));
    }

    @Override
    public final void s0(boolean z10) {
        qe.a aVar = this.f6276a0;
        if (aVar != null && aVar.f53841f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public final void u0() {
        boolean z10;
        n1("SAVE_BEFORE");
        super.u0();
        gt0 gt0Var = this.V;
        if (gt0Var != null && gt0Var.f34196f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6281f0 = z10;
        tj0 tj0Var = this.f47063c;
        if (tj0Var != null && this.Q >= 0) {
            this.R -= tj0Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
