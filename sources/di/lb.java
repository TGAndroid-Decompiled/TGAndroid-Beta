package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.o00;
import org.telegram.ui.p00;
import org.telegram.ui.p50;
import org.telegram.ui.qn;
import org.telegram.ui.rv;
import org.telegram.ui.z51;
public final class lb extends p00 implements is {
    public static DecimalFormat f9013w0;
    public static DecimalFormat f9014x0;
    public FrameLayout S;
    public vg.m T;
    public kb U;
    public it0 V;
    public bi.o2 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a f9015a0;
    public int f9017c0;
    public int f9018d0;
    public boolean f9019e0;
    public boolean f9020f0;
    public bi.o2 f9022h0;
    public nz f9023i0;
    public LinearLayout f9024j0;
    public SpannableStringBuilder f9025k0;
    public org.telegram.ui.Components.h6 f9026l0;
    public TextView m0;
    public hi.d f9027n0;
    public bi.g2 f9028o0;
    public hi.d f9029p0;
    public z51 f9030q0;
    public hi.d f9031r0;
    public hi.d f9032s0;
    public boolean f9033t0;
    public boolean f9034u0;
    public bi.x5 f9035v0;
    public int f9016b0 = -1;
    public final ch.w f9021g0 = new ch.w(this, 20);

    public lb() {
        this.N = true;
    }

    public static void A0(lb lbVar, Context context) {
        if (np.s1(lbVar.currentAccount).v2()) {
            org.telegram.ui.b.b(lbVar.currentAccount);
        } else {
            new cb(context, lbVar.resourceProvider).show();
        }
    }

    public static void B0(lb lbVar) {
        u8.y(lbVar.currentAccount, false).u();
        wg.c1.l1(1, org.telegram.messenger.v1.a(lbVar.currentAccount).b());
    }

    public static void C0(di.lb r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: di.lb.C0(di.lb, int):void");
    }

    public static void D0(lb lbVar, b41 b41Var, Boolean bool, String str) {
        if (lbVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                org.telegram.ui.Components.cc.a0(lbVar).I(2131624227, hd.M0(2131745159, null), org.telegram.messenger.g0.X2(hd.G((int) b41Var.B, "StarsAcquiredInfo", new Object[0]))).j();
                lbVar.f9023i0.c(true);
                u8.y(lbVar.currentAccount, false).S(true);
            } else if (str != null) {
                org.telegram.ui.Components.cc.a0(lbVar).Q(2131624012, 36, hd.a0(null, null, 2131743878, str)).j();
            }
        }
    }

    public static void H0(vx0 vx0Var, int i7, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        CharSequence K;
        CharSequence charSequence;
        TextView textView = (TextView) ((sx0) vx0Var.c(hd.M0(2131750300, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        e80 e80Var = new e80(textView, org.telegram.messenger.g0.L(90.0f), 0, e6Var);
        e80Var.a(org.telegram.ui.ActionBar.j6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.j6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(e80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final u8 y10 = u8.y(i7, false);
            final long j3 = starGift.f28280id;
            final ai.g0 g0Var = new ai.g0(textView, 13);
            final boolean[] zArr = {false};
            final is[] isVarArr = {new is() {
                @Override
                public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                    int i12;
                    u8 u8Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i10 == (i12 = ns.F3) && (J = (u8Var = u8.this).J(j3)) != null) {
                        zArr2[0] = true;
                        ns.f(u8Var.f9529a).n(isVarArr[0], i12);
                        g0Var.a(J);
                    }
                }
            }};
            int i10 = y10.f9529a;
            ns f10 = ns.f(i10);
            is isVar = isVarArr[0];
            int i11 = ns.F3;
            f10.b(isVar, i11);
            TL_stars.StarGift J = y10.J(j3);
            if (J != null) {
                zArr[0] = true;
                ns.f(i10).n(isVarArr[0], i11);
                g0Var.a(J);
            }
        } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = hd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = hd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + hd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
        } else {
            int i12 = starGift.availability_remains;
            if (i12 <= 0) {
                K = hd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                K = hd.K("Gift2Availability4Value", i12, ',', hd.E(starGift.availability_total, ','));
            }
            textView.setText(K);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new na(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        return M0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
        if (f9014x0 == null) {
            f9014x0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 != 0) {
                String format = f9014x0.format(j3 / 1.0E9d);
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
                sb2.append(hd.E(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z10 = false;
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
                z10 = true;
            }
            if (i10 != 0) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(hd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f9014x0;
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
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(hd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder N0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
        boolean z10;
        if (f9014x0 == null) {
            f9014x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f9014x0.format(starsAmount.amount / 1.0E9d);
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
                z10 = true;
            } else {
                z10 = false;
            }
            String str = "";
            if (Math.abs(j10) <= 1000 && starsAmount.nanos != 0) {
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(hd.E(Math.abs(j10), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f9014x0;
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
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(hd.E(Math.abs(j10), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
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
            if (f9014x0 == null) {
                f9014x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f9014x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = starsAmount.amount;
        int i10 = starsAmount.nanos;
        boolean z10 = false;
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
            sb2.append(hd.E(Math.abs(j10), ','));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (f9014x0 == null) {
                f9014x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f9014x0;
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
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131745084, null));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) hd.H(',', "Stars", (int) j3));
        return spannableStringBuilder;
    }

    public static String P0(long j3) {
        String str;
        if (f9013w0 == null) {
            f9013w0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return f9013w0.format(j3 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (j3 < 0) {
            str = "-";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(hd.E(Math.abs(j3 / 1000000000), ','));
        return sb2.toString();
    }

    public static java.lang.String Q0(int r6, boolean r7, org.telegram.tgnet.tl.TL_stars.StarsTransaction r8) {
        throw new UnsupportedOperationException("Method not decompiled: di.lb.Q0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
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
        eq eqVar = new eq(2131231054, 0);
        eqVar.d = false;
        eqVar.f34414r = 0.0f;
        eqVar.f34415s = f11;
        eqVar.H = f12;
        eqVar.I = f10;
        eqVar.J = f10;
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder U0(CharSequence charSequence, float f10, eq[] eqVarArr) {
        return X0(false, charSequence, f10, eqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z10) {
        return X0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, eq[] eqVarArr, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        eq eqVar;
        int i7;
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
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            if (z10) {
                i7 = 2131231957;
            } else {
                i7 = 2131232308;
            }
            eqVar = new eq(i7, 0);
            if (eqVarArr != null) {
                eqVarArr[0] = eqVar;
            }
        }
        eqVar.f34414r = 0.0f;
        eqVar.f34415s = f11;
        eqVar.H = f12;
        if (z10) {
            eqVar.d = false;
            float f13 = f10 * 0.2f;
            eqVar.I = f13;
            eqVar.J = f13;
        } else {
            eqVar.I = f10;
            eqVar.J = f10;
        }
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z10, String str, eq[] eqVarArr) {
        eq eqVar;
        int i7;
        float f10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            if (z10) {
                i7 = 2131231957;
            } else {
                i7 = 2131232308;
            }
            eqVar = new eq(i7, 0);
            float f11 = 1.13f;
            if (z10) {
                f10 = 0.222f;
            } else {
                f10 = 1.13f;
            }
            if (z10) {
                f11 = 0.222f;
            }
            eqVar.I = f10;
            eqVar.J = f11;
        }
        if (z10) {
            eqVar.d = false;
        }
        if (eqVarArr != null) {
            eqVarArr[0] = eqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(TL_stars.StarsAmount starsAmount, String str, eq[] eqVarArr) {
        return a1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, eqVarArr);
    }

    public static SpannableStringBuilder a1(boolean z10, CharSequence charSequence, float f10, eq[] eqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i7;
        eq eqVar;
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
            i7 = 2131231957;
        } else {
            i7 = 2131232753;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            if (eqVarArr != null && eqVarArr.length > 0) {
                eqVar = new eq(i7, 0);
                eqVarArr[0] = eqVar;
            } else {
                eqVar = new eq(i7, 0);
            }
        }
        eqVar.d = false;
        if (z10) {
            f10 *= 0.33f;
        }
        eqVar.I = f10;
        eqVar.J = f10;
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static ba b1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i7;
        int i10 = imageReceiver.d;
        final z9 z9Var = new z9(z10, i10, str, imageReceiver, new boolean[1]);
        z9Var.run();
        ns f10 = ns.f(i10);
        if (z10) {
            i7 = ns.X2;
        } else {
            i7 = ns.W2;
        }
        return new ba(f10.h(view, i7, new z10() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        z9Var.run();
                        return;
                    default:
                        z9Var.run();
                        return;
                }
            }
        }), ns.f(i10).h(view, ns.f25608y0, new z10() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        z9Var.run();
                        return;
                    default:
                        z9Var.run();
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
        imageReceiver.r0(org.telegram.messenger.gc.b(document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.gc.c(w10, document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.f28792a7, 0.35f, false), 0L, null, null, 0);
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

    public static void e1(org.telegram.ui.Components.i9 i9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 1000) {
            str = "2⃣";
        } else if (j3 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        b1(i9Var, imageReceiver, str, false);
    }

    public static ba f1(org.telegram.ui.Components.i9 i9Var, ImageReceiver imageReceiver, int i7) {
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
        return b1(i9Var, imageReceiver, str, false);
    }

    public static void g1(org.telegram.ui.Components.i9 i9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 10000000000L) {
            str = "2⃣";
        } else if (j3 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        b1(i9Var, imageReceiver, str, true);
    }

    public static void h1(Context context, int i7, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.e6 e6Var) {
        ?? r18;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ja.t(-1, 150, 7, 0, 0, 0, 10));
        qa qaVar = new qa(context, 70, 0, 0);
        frameLayout.addView(qaVar, c8.ja.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.f58893b;
        fVar.f58877z = org.telegram.ui.ActionBar.j6.Wk;
        fVar.A = org.telegram.ui.ActionBar.j6.Xk;
        fVar.b();
        mVar.setStarParticlesView(qaVar);
        frameLayout.addView(mVar, c8.ja.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.u2[] u2VarArr = new org.telegram.ui.ActionBar.u2[1];
        textView.setText(hd.H(' ', "BoostStars", (int) boost.stars));
        ?? f11 = i20.f(f10, textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), -6915073));
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
        sb2.append(hd.H(' ', "BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        eq eqVar = new eq(2131231928, 2);
        eqVar.f34414r = 0.0f;
        eqVar.f34415s = org.telegram.messenger.g0.L(0.66f);
        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
        f11.setText(spannableStringBuilder);
        f10.addView(f11, c8.ja.t(-2, 20, 17, 20, 4, 20, 4));
        vx0 vx0Var = new vx0(context, e6Var);
        vx0Var.n(hd.M0(2131753627, null), i7, j3, new e9(u2VarArr, j3, 6));
        vx0Var.c(hd.M0(2131753626, null), hd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = hd.M0(2131753615, null);
            String M02 = hd.M0(2131753614, null);
            r18 = 0;
            bi.m1 m1Var = new bi.m1(u2VarArr, j3, boost, 4);
            u2VarArr = u2VarArr;
            vx0Var.i(M0, M02, m1Var);
        } else {
            r18 = 0;
        }
        String M03 = hd.M0(2131753662, null);
        String format = hd.E0().s0().format(new Date(boost.date * 1000));
        String format2 = hd.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[r18] = format;
        objArr[1] = format2;
        vx0Var.c(M03, hd.a0(null, null, 2131742783, objArr), null, null);
        String M04 = hd.M0(2131753607, null);
        String format3 = hd.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = hd.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[r18] = format3;
        objArr2[1] = format4;
        vx0Var.c(M04, hd.a0(null, null, 2131742783, objArr2), null, null);
        f10.addView(vx0Var, c8.ja.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        z70 z70Var = new z70(context, e6Var);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(2131744926, null), new ai.a(context, 4)));
        z70Var.setGravity(17);
        f10.addView(z70Var, c8.ja.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.i(hd.M0(2131747831, null), r18, true);
        dVar.setOnClickListener(new ai.q2(u2VarArr, 2));
        f10.addView(dVar, c8.ja.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        k10.O = f10;
        u2VarArr[0] = k10;
        k10.U0 = false;
        k10.O();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            u2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        u2VarArr[0].show();
        u2VarArr[0].n(new ch.w(mVar, 21));
    }

    public static v0 i1(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        cg.a resellAmount;
        cg.b bVar = cg.b.f4990a;
        if (tL_starGiftUnique == null) {
            resellAmount = cg.a.g(((org.telegram.messenger.j0) np.s1(i7).f25451y7.f25864p.f15881b).f24498c, bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f4991b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        v0 v0Var = new v0(context, e6Var, i7, resellAmount, new ai.v1(11, s10Var, r8));
        v0[] v0VarArr = {v0Var};
        v0Var.show();
        return v0VarArr[0];
    }

    public static void j1(Context context, long j3, boolean z10, final s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7;
        int i10;
        CharSequence l10;
        org.telegram.ui.ActionBar.u2[] u2VarArr;
        long j10;
        boolean z11 = false;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        hi.d dVar = null;
        textView.setText(hd.M0(2131747732, null));
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
        linearLayout.addView(textView, c8.ja.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        mb0 mb0Var = new mb0(context, e6Var);
        mb0Var.setForceForceUseCenter(true);
        mb0Var.setText(hd.M0(2131747733, null));
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i11, e6Var);
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
        org.telegram.ui.ActionBar.q6.C(editTextBoldCursor, org.telegram.ui.ActionBar.j6.f29005lg, e6Var);
        org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.j6.f29022mg, e6Var);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor.setGravity(i7);
        editTextBoldCursor.setOnFocusChangeListener(new n9(mb0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232753);
        linearLayout2.addView(imageView, c8.ja.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, c8.ja.p(-1, -2, 1.0f, 119));
        mb0Var.e(editTextBoldCursor);
        mb0Var.addView(linearLayout2, c8.ja.e(-1, -2, 48));
        linearLayout.addView(mb0Var, c8.ja.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.A6, null);
        mb0Var.addView(textView2, c8.ja.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        z70 z70Var = new z70(context, null);
        z70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131747735, null), new ai.a(context, 5)), true));
        z70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        linearLayout.addView(z70Var, c8.ja.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final hi.d g10 = i20.g(24, context, e6Var, true);
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i12 > 0) {
            i10 = 2131747731;
        } else {
            i10 = 2131747737;
        }
        g10.i(hd.M0(i10, null), false, true);
        linearLayout.addView(g10, c8.ja.o(-1, 48));
        if (i12 > 0 && z10) {
            hi.d g11 = i20.g(24, context, e6Var, false);
            g11.i(hd.M0(2131747736, null), false, false);
            linearLayout.addView(g11, c8.ja.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = g11;
        }
        k10.O = linearLayout;
        final org.telegram.ui.ActionBar.u2[] u2VarArr2 = {k10};
        if (i12 <= 0) {
            l10 = "";
        } else {
            l10 = Long.toString(j3);
        }
        editTextBoldCursor.setText(l10);
        editTextBoldCursor.addTextChangedListener(new oa(editTextBoldCursor, mb0Var, j3, z10, g10, textView2));
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
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                s10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new s9(editTextBoldCursor2, u2VarArr2, 1));
                return true;
            }
        });
        p9 p9Var = new p9(zArr, s10Var, editTextBoldCursor, g10, u2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        g10.setOnClickListener(p9Var);
        if (dVar != null) {
            hi.d dVar2 = dVar;
            p9 p9Var2 = new p9(zArr, s10Var, dVar2, editTextBoldCursor2, u2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            u2VarArr = u2VarArr2;
            dVar2.setOnClickListener(p9Var2);
        } else {
            u2VarArr = u2VarArr2;
        }
        u2VarArr[0].O();
        u2VarArr[0].setOnDismissListener(new q9(editTextBoldCursor2, 0));
        u2VarArr[0].show();
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            z11 = ((an) Q).sa();
        }
        s9 s9Var = new s9(u2VarArr, editTextBoldCursor2);
        if (z11) {
            j10 = 200;
        } else {
            j10 = 80;
        }
        org.telegram.messenger.g0.i3(s9Var, j10);
    }

    public static org.telegram.ui.ActionBar.u2 k1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final org.telegram.ui.ActionBar.e6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: di.lb.k1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.e6):org.telegram.ui.ActionBar.u2");
    }

    public static void l1(Activity activity, int i7, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.e6 e6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i10;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f28282id = tL_messageActionPaymentRefunded.charge.f28181id;
        starsTransaction.refund = true;
        k1(activity, false, 0L, i7, starsTransaction, e6Var);
    }

    public static void m1(Context context, int i7, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.e6 e6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = np.s1(i7).z1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f28282id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i7, starsTransaction, e6Var);
    }

    public static CharSequence s1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        eq[] eqVarArr;
        a5.q c10;
        if (z10 && com.google.android.gms.internal.vision.e2.s(spannableStringBuilder)) {
            for (eq eqVar : (eq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), eq.class)) {
                Drawable drawable = eqVar.f34410c;
                if (drawable != null && !(drawable instanceof a5.q) && (c10 = a5.q.c(org.telegram.messenger.t0.f26609b.getResources(), 2131231958, null)) != null) {
                    c10.setBounds(eqVar.f34410c.getBounds());
                    eqVar.f34410c = c10;
                    eqVar.d = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public final void J0() {
        q1();
        uj0 uj0Var = this.f50075c;
        if (uj0Var != null && this.V != null && uj0Var.getLayoutParams() != null) {
            int C = i20.C(48.0f, this.f9017c0, -org.telegram.messenger.g0.L(8.0f));
            int C2 = i20.C(48.0f, this.f9018d0, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.messenger.g0.A3(this.f50075c, 0, C, 0, C2);
            uj0 uj0Var2 = this.f50075c;
            int i7 = -C;
            uj0Var2.setPadding(uj0Var2.getPaddingLeft(), i7, this.f50075c.getPaddingRight(), this.f9018d0 - C2);
            this.V.z(i7, -C2);
        }
    }

    public final void K0(ArrayList arrayList, p41 p41Var) {
        boolean z10;
        uj0 uj0Var;
        int i7;
        n1("FILL_BEFORE");
        it0 it0Var = this.V;
        if (it0Var != null && it0Var.f35713f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9016b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        u8 y10 = u8.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        b41 b41Var = new b41(-2);
        b41Var.f33177c = (rv) super.o0(getParentActivity());
        arrayList.add(b41Var);
        arrayList.add(b41.k(this.f9024j0));
        hi.d dVar = this.f9032s0;
        if (dVar != null) {
            if (getMessagesController().Y5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            dVar.setVisibility(i7);
        }
        arrayList.add(b41.C(null));
        if (getMessagesController().f25300h6) {
            arrayList.add(ki.g.i(-4, getThemedColor(org.telegram.ui.ActionBar.j6.lk), qn.i0(hd.M0(2131743766, null)), hd.M0(2131743767, null)));
            arrayList.add(b41.C(null));
        }
        if (y10.f9532e && !arrayList2.isEmpty()) {
            arrayList.add(b41.u(hd.M0(2131745203, null)));
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                int i11 = db.f8421b;
                b41 K = b41.K(db.class);
                K.G = (TL_stars.StarsSubscription) arrayList2.get(i10);
                arrayList.add(K);
            }
            if (y10.f9549x) {
                arrayList.add(b41.q(arrayList.size(), 33));
            } else if (!y10.f9550y) {
                b41 c10 = b41.c(-3, 2131230871, hd.M0(2131745202, null));
                c10.f33189q = true;
                arrayList.add(c10);
            }
            arrayList.add(b41.C(null));
        }
        boolean N = y10.N(0);
        this.f9033t0 = N;
        if (N) {
            this.f9016b0 = arrayList.size();
            arrayList.add(b41.n(this.W, -2));
            if (z10 && (uj0Var = this.f50075c) != null) {
                ch.w wVar = this.f9021g0;
                uj0Var.removeCallbacks(wVar);
                this.f50075c.post(wVar);
            }
        } else {
            arrayList.add(b41.m(this.f9022h0));
        }
        n1("FILL_AFTER");
    }

    @Override
    public final View createView(final Context context) {
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7;
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        it0 it0Var = new it0(context);
        this.V = it0Var;
        boolean z11 = true;
        it0Var.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.f9019e0) {
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
                i7 = 0;
            } else {
                i7 = org.telegram.messenger.g0.f23605m;
            }
            this.f9017c0 = i7;
            this.f9018d0 = org.telegram.messenger.g0.f23606n;
        }
        this.V.setGeometry(new ob.c(this, 15));
        this.V.z(-i20.C(48.0f, this.f9017c0, -org.telegram.messenger.g0.L(8.0f)), -i20.C(48.0f, this.f9018d0, -org.telegram.messenger.g0.L(8.0f)));
        it0 it0Var2 = this.V;
        it0Var2.getClass();
        this.W = new bi.o2(26, context, it0Var2);
        this.U = new kb(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.f9022h0 = new bi.o2(1, context, this);
        super.createView(context);
        o00 o00Var = this.f50080s;
        getBaseSimpleGlass().f(o00Var, this.f50075c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f56051n = this.V;
        this.f50075c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f56052o = new f(1, this, new e(1, o00Var));
        FrameLayout frameLayout = this.U.d;
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        it0 it0Var3 = this.V;
        it0Var3.addView(this.X, it0Var3.indexOfChild(frameLayout), c8.ja.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        a9 a9Var = new a9(this, 0);
        er erVar = er.h;
        te.a aVar = new te.a(0, a9Var, erVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new a9(this, 1), erVar, 380L, false);
        this.f9015a0 = new te.a(2, new a9(this, 2), erVar, 380L, false);
        if (!this.f50075c.canScrollVertically(-1) && !this.simpleActionBar.v()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar.a(z10, false);
        this.Z.a(this.V.f35713f0, false);
        this.f50075c.j(new bi.z4(this, 9));
        q1();
        fh.g c10 = getBaseSimpleGlass().f56042c.c(frameLayout, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.ActionBar.o4 o4Var2 = this.parentLayout;
        if (o4Var2 != null && ((ActionBarLayout) o4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        frameLayout2.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 2);
        this.T = mVar;
        vg.f fVar = mVar.f58893b;
        fVar.f58877z = org.telegram.ui.ActionBar.j6.Wk;
        fVar.A = org.telegram.ui.ActionBar.j6.Xk;
        fVar.b();
        this.T.setStarParticlesView(this.f50076e);
        this.S.addView(this.T, c8.ja.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(hd.M0(2131744215, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131744212, null), new ai.a(context, 2)), true), this.S, null);
        this.f50075c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(erVar);
        kVar.n(350L);
        this.f50075c.setItemAnimator(kVar);
        this.f50075c.setOnItemClickListener(new bi.b6(this, 2));
        nz nzVar = new nz(getParentActivity());
        this.f9023i0 = nzVar;
        this.f50080s.addView(nzVar, c8.ja.c(-1.0f, -1));
        u8 y10 = u8.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f9024j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f9024j0.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getParentActivity(), false, true, false);
        this.f9026l0 = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f9026l0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f9026l0.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(this.f9026l0, org.telegram.ui.ActionBar.j6.G6, this.resourceProvider);
        this.f9025k0 = new SpannableStringBuilder("S");
        p50 p50Var = new p50(42.0f, this.currentAccount, this.f9026l0);
        ch0 ch0Var = new ch0(2131624218, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = p50Var.f50132b;
        imageReceiver.w0(ch0Var);
        imageReceiver.W(2);
        p50Var.f50135f = false;
        p50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.f9025k0.setSpan(p50Var, 0, 1, 33);
        this.f9024j0.addView(this.f9026l0, c8.ja.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(hd.M0(2131742790, null));
        org.telegram.ui.ActionBar.q6.U(this.m0, org.telegram.ui.ActionBar.j6.f29260z6, this.resourceProvider);
        this.f9024j0.addView(this.m0, c8.ja.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        bi.g2 g2Var = new bi.g2(3, getParentActivity(), this);
        this.f9028o0 = g2Var;
        frameLayout3.addView(g2Var);
        hi.d dVar = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.f9029p0 = dVar;
        dVar.f();
        this.f9029p0.i("", false, true);
        this.f9029p0.setOnClickListener(new View.OnClickListener(this) {
            public final lb f8875b;

            {
                this.f8875b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        lb.A0(this.f8875b, context);
                        return;
                    default:
                        new cb(context, this.f8875b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f9028o0.addView(this.f9029p0, c8.ja.e(-1, 48, 119));
        z51 z51Var = new z51(4, getParentActivity(), this);
        this.f9030q0 = z51Var;
        frameLayout3.addView(z51Var);
        hi.d dVar2 = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.f9031r0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new eq(2131231977, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.M0(2131744965, null));
        this.f9031r0.i(spannableStringBuilder, false, true);
        this.f9031r0.setOnClickListener(new View.OnClickListener(this) {
            public final lb f8875b;

            {
                this.f8875b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        lb.A0(this.f8875b, context);
                        return;
                    default:
                        new cb(context, this.f8875b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f9030q0.addView(this.f9031r0, c8.ja.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        hi.d dVar3 = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.f9027n0 = dVar3;
        dVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new eq(2131231973, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) hd.M0(2131745022, null));
        this.f9027n0.i(spannableStringBuilder2, false, true);
        this.f9027n0.setOnClickListener(new View.OnClickListener(this) {
            public final lb f9339b;

            {
                this.f9339b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        lb lbVar = this.f9339b;
                        lbVar.presentFragment(new t(0, lbVar.getUserConfig().e()));
                        return;
                    default:
                        lb.B0(this.f9339b);
                        return;
                }
            }
        });
        this.f9030q0.addView(this.f9027n0, c8.ja.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f9024j0.addView(frameLayout3, c8.ja.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        hi.d dVar4 = new hi.d(getParentActivity(), this.resourceProvider, false);
        this.f9032s0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new eq(2131231891, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) hd.M0(2131744213, null));
        this.f9032s0.i(spannableStringBuilder3, false, true);
        this.f9032s0.setOnClickListener(new View.OnClickListener(this) {
            public final lb f9339b;

            {
                this.f9339b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        lb lbVar = this.f9339b;
                        lbVar.presentFragment(new t(0, lbVar.getUserConfig().e()));
                        return;
                    default:
                        lb.B0(this.f9339b);
                        return;
                }
            }
        });
        this.f9024j0.addView(this.f9032s0, c8.ja.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        bi.x5 x5Var = this.f9035v0;
        if (x5Var != null) {
            x5Var.O(false);
        }
        e0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (y10.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z11 = false;
        }
        p1(z11, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.f25590v3;
        int i12 = ns.A3;
        int i13 = ns.f25618z3;
        if (i7 == i13 || i7 == i12 || i7 == i11) {
            n1("NOTIFICATION_" + i7);
        }
        if (i7 == i11) {
            u0();
            bi.x5 x5Var = this.f9035v0;
            if (x5Var != null) {
                x5Var.O(true);
            }
            h0();
        } else if (i7 == i13) {
            u8 y10 = u8.y(this.currentAccount, false);
            if (this.f9033t0 != y10.N(0)) {
                this.f9033t0 = y10.N(0);
                u0();
                bi.x5 x5Var2 = this.f9035v0;
                if (x5Var2 != null) {
                    x5Var2.O(false);
                }
                h0();
            }
        } else if (i7 == i12) {
            bi.x5 x5Var3 = this.f9035v0;
            if (x5Var3 != null) {
                x5Var3.O(true);
            }
        } else if (i7 == ns.f25611y3) {
            o1();
        } else if (i7 == ns.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override
    public final void h0() {
        it0 it0Var;
        n1("RESTORE_BEFORE");
        super.h0();
        if (this.f9020f0 && (it0Var = this.V) != null && this.f9016b0 != -1) {
            it0Var.a();
        }
        this.f9020f0 = false;
        n1("RESTORE_AFTER");
    }

    @Override
    public final void i0() {
        this.f50080s.addView(this.V, c8.ja.c(-1.0f, -1));
        this.V.u(this.f50075c, new a9(this, 3));
        it0 it0Var = this.V;
        kb kbVar = this.U;
        it0Var.x(kbVar, kbVar.f8930b, new o(5));
        this.V.y(this.U.d);
        this.U.d.setLayoutParams(c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        it0 it0Var = this.V;
        if (it0Var == null || motionEvent == null || it0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.f8930b.f41298b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final v4.h0 k0() {
        bi.x5 x5Var = new bi.x5(this, this.f50075c, getParentActivity(), this.currentAccount, this.classGuid, new bi.b(this, 19), getResourceProvider(), 1);
        this.f9035v0 = x5Var;
        x5Var.f38199r = false;
        return x5Var;
    }

    @Override
    public final v4.b0 l0(Context context) {
        it0 it0Var = this.V;
        it0Var.getClass();
        return new jg.i0(5, it0Var, false);
    }

    @Override
    public final ug.s1 m0() {
        return new qa(getParentActivity(), 75, 1, 0);
    }

    public final void n1(String str) {
        boolean z10;
        int top;
        int height;
        if (this.V != null) {
            StringBuilder u10 = a8.p0.u("Stars event=", str, " row=");
            u10.append(this.f9016b0);
            u10.append(" hasTransactions=");
            u10.append(this.f9033t0);
            u10.append(" savedPosition=");
            u10.append(this.Q);
            u10.append(" savedOffset=");
            u10.append(this.R);
            u10.append(" savedPinned=");
            u10.append(this.f9020f0);
            u10.append(" boundaryAttached=");
            bi.o2 o2Var = this.W;
            if (o2Var != null && o2Var.getParent() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u10.append(z10);
            u10.append(" boundaryTop=");
            bi.o2 o2Var2 = this.W;
            if (o2Var2 == null) {
                top = 0;
            } else {
                top = o2Var2.getTop();
            }
            u10.append(top);
            u10.append(" boundaryHeight=");
            bi.o2 o2Var3 = this.W;
            if (o2Var3 == null) {
                height = 0;
            } else {
                height = o2Var3.getHeight();
            }
            u10.append(height);
            Log.d("SiblingScroll", u10.toString());
            it0 it0Var = this.V;
            if (!it0Var.f35703a) {
                return;
            }
            it0Var.f35705b = Math.max(it0Var.f35705b, Math.min(60, Math.max(0, 30)));
            it0Var.f(str, null, 0, 0, true);
        }
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    public final void o1() {
        int i7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        u8 y10 = u8.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f9025k0);
        spannableStringBuilder.append((CharSequence) M0(y10.p(), 0.66f, ' '));
        this.f9026l0.setText(spannableStringBuilder);
        hi.d dVar = this.f9029p0;
        if (y10.p().amount > 0) {
            i7 = 2131745150;
        } else {
            i7 = 2131745151;
        }
        dVar.i(hd.M0(i7, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        p1(z10, true);
    }

    @Override
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.f25590v3);
        ns.f(this.currentAccount).c(this, ns.f25611y3);
        ns.f(this.currentAccount).c(this, ns.f25618z3);
        ns.f(this.currentAccount).c(this, ns.A3);
        ns.f(this.currentAccount).c(this, ns.C3);
        u8.y(this.currentAccount, false).S(true);
        u8.y(this.currentAccount, false).R();
        u8.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        uj0 uj0Var = this.f50075c;
        if (uj0Var != null) {
            uj0Var.removeCallbacks(this.f9021g0);
        }
        super.onFragmentDestroy();
        ns.f(this.currentAccount).n(this, ns.f25590v3);
        ns.f(this.currentAccount).n(this, ns.f25611y3);
        ns.f(this.currentAccount).n(this, ns.f25618z3);
        ns.f(this.currentAccount).n(this, ns.A3);
        ns.f(this.currentAccount).n(this, ns.C3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f9019e0 = true;
        this.f9017c0 = i10;
        this.f9018d0 = i12;
        J0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    public final void p1(final boolean z10, boolean z11) {
        float f10;
        int i7;
        float f11;
        this.f9034u0 = z10;
        float f12 = 1.0f;
        int i10 = 0;
        if (z11) {
            this.f9028o0.setVisibility(0);
            this.f9030q0.setVisibility(0);
            ViewPropertyAnimator animate = this.f9028o0.animate();
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animate.alpha(f11).withEndAction(new Runnable(this) {
                public final lb f8372b;

                {
                    this.f8372b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f8372b.f9028o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f8372b.f9030q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f9030q0.animate();
            if (!z10) {
                f12 = 0.0f;
            }
            animate2.alpha(f12).withEndAction(new Runnable(this) {
                public final lb f8372b;

                {
                    this.f8372b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f8372b.f9028o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f8372b.f9030q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.f9028o0.animate().cancel();
        this.f9030q0.animate().cancel();
        z51 z51Var = this.f9030q0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        z51Var.setAlpha(f10);
        bi.g2 g2Var = this.f9028o0;
        if (z10) {
            f12 = 0.0f;
        }
        g2Var.setAlpha(f12);
        z51 z51Var2 = this.f9030q0;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        z51Var2.setVisibility(i7);
        bi.g2 g2Var2 = this.f9028o0;
        if (z10) {
            i10 = 8;
        }
        g2Var2.setVisibility(i10);
    }

    @Override
    public final float q0() {
        uj0 uj0Var = this.f50075c;
        if (uj0Var == null) {
            return 0.0f;
        }
        return uj0Var.getY();
    }

    public final void q1() {
        if (this.X == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f9017c0;
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
        te.a aVar = this.Y;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f57085e;
        }
        te.a aVar2 = this.Z;
        if (aVar2 != null) {
            f11 = aVar2.f57085e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * org.telegram.messenger.g0.L(44.0f)));
    }

    @Override
    public final void s0(boolean z10) {
        te.a aVar = this.f9015a0;
        if (aVar != null && aVar.f57086f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public final void u0() {
        boolean z10;
        n1("SAVE_BEFORE");
        super.u0();
        it0 it0Var = this.V;
        if (it0Var != null && it0Var.f35713f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9020f0 = z10;
        uj0 uj0Var = this.f50075c;
        if (uj0Var != null && this.Q >= 0) {
            this.R -= uj0Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
