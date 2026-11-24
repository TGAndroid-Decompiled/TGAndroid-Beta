package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
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
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class nxa extends h15 implements jm7 {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public ft4 T;
    public mxa U;
    public fja V;
    public xd9 W;
    public View X;
    public fn0 Y;
    public fn0 Z;
    public fn0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public xd9 h0;
    public uj4 i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public io l0;
    public TextView m0;
    public b61 n0;
    public ne6 o0;
    public b61 p0;
    public qmb q0;
    public b61 r0;
    public b61 s0;
    public boolean t0;
    public boolean u0;
    public vb v0;
    public int b0 = -1;
    public final nsa g0 = new nsa(this, (byte) 1);

    public nxa() {
        this.N = true;
    }

    public static void C0(mhb mhbVar, int i, TL_stars.StarGift starGift, ylb ylbVar) {
        CharSequence K;
        CharSequence concat;
        TextView textView = (TextView) ((jhb) mhbVar.f(jb6.M0(2131750233, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ta6 ta6Var = new ta6(textView, gm.L(90.0f), 0, ylbVar);
        ta6Var.a(cmb.p1(0.21f, textView.getPaint().getColor()), cmb.p1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ta6Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final jva v = jva.v(i, false);
            final long j = starGift.id;
            final eg9 eg9Var = new eg9(textView, (byte) 12);
            final boolean[] zArr = {false};
            final jm7[] jm7VarArr = {new jm7() {
                @Override
                public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                    int i4;
                    jva jvaVar;
                    TL_stars.StarGift G;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i2 == (i4 = nm7.H3) && (G = (jvaVar = jva.this).G(j)) != null) {
                        zArr2[0] = true;
                        nm7.f(jvaVar.a).n(jm7VarArr[0], i4);
                        eg9Var.a(G);
                    }
                }
            }};
            int i2 = v.a;
            nm7 f = nm7.f(i2);
            jm7 jm7Var = jm7VarArr[0];
            int i3 = nm7.H3;
            f.a(jm7Var, i3);
            TL_stars.StarGift G = v.G(j);
            if (G != null) {
                zArr[0] = true;
                nm7.f(i2).n(jm7VarArr[0], i3);
                eg9Var.a(G);
                return;
            }
            return;
        }
        boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
        int i4 = starGift.availability_remains;
        if (z) {
            if (i4 <= 0) {
                concat = jb6.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                concat = jb6.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(jb6.H(',', "Gift2QuantityIssued2", starGift.availability_total));
            }
            textView.setText(concat);
            return;
        }
        int i5 = starGift.availability_total;
        if (i4 <= 0) {
            K = jb6.H(',', "Gift2Availability2ValueNone", i5);
        } else {
            K = jb6.K("Gift2Availability4Value", i4, ',', jb6.E(i5, ','));
        }
        textView.setText(K);
    }

    public static void D0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new swa(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder G0(TL_stars.StarsAmount starsAmount) {
        return H0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder H0(TL_stars.StarsAmount starsAmount, float f, char c) {
        double d;
        int i;
        if (x0 == null) {
            x0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j = starsAmount.amount;
            if (j % 1000000000 != 0) {
                String format = x0.format(j / 1.0E9d);
                spannableStringBuilder.append((CharSequence) format);
                int indexOf = format.indexOf(".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f), indexOf, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                }
            } else {
                if (starsAmount.negative()) {
                    str = "-";
                }
                spannableStringBuilder.append((CharSequence) str.concat(jb6.E(Math.abs(starsAmount.amount / 1000000000), c)));
                return spannableStringBuilder;
            }
        } else {
            long j2 = starsAmount.amount;
            int i2 = starsAmount.nanos;
            boolean z = false;
            if (i2 < 0 && j2 > 0) {
                i = -1;
                d = 1.0E9d;
            } else if (i2 > 0 && j2 < 0) {
                d = 1.0E9d;
                i = 1;
            } else {
                d = 1.0E9d;
                i = 0;
            }
            long j3 = i + j2;
            int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i3 != 0 ? i3 < 0 : i2 < 0) {
                z = true;
            }
            if (i2 != 0) {
                if (z) {
                    str = "-";
                }
                spannableStringBuilder.append((CharSequence) str.concat(jb6.E(Math.abs(j3), c)));
                DecimalFormat decimalFormat = x0;
                int i4 = starsAmount.nanos;
                double d2 = i4;
                if (i4 < 0) {
                    d2 += d;
                }
                String format2 = decimalFormat.format(d2 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
                }
            } else {
                if (z) {
                    str = "-";
                }
                spannableStringBuilder.append((CharSequence) str.concat(jb6.E(Math.abs(j3), c)));
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount, float f, char c) {
        double d;
        int i;
        boolean z;
        if (x0 == null) {
            x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j = starsAmount.amount;
            int i2 = starsAmount.nanos;
            if (i2 < 0 && j > 0) {
                i = -1;
                d = 1.0E9d;
            } else if (i2 > 0 && j < 0) {
                d = 1.0E9d;
                i = 1;
            } else {
                d = 1.0E9d;
                i = 0;
            }
            long j2 = i + j;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 != 0 ? i3 < 0 : i2 < 0) {
                z = true;
            } else {
                z = false;
            }
            String str = "";
            if (Math.abs(j2) <= 1000 && starsAmount.nanos != 0) {
                if (z) {
                    str = "-";
                }
                spannableStringBuilder.append((CharSequence) str.concat(jb6.E(Math.abs(j2), c)));
                DecimalFormat decimalFormat = x0;
                int i4 = starsAmount.nanos;
                double d2 = i4;
                if (i4 < 0) {
                    d2 += d;
                }
                String format2 = decimalFormat.format(d2 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    String substring = format2.substring(indexOf2);
                    if (substring.length() > 1) {
                        spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
                    }
                }
            } else if (starsAmount.amount <= 1000) {
                if (z) {
                    str = "-";
                }
                spannableStringBuilder.append((CharSequence) str.concat(jb6.E(Math.abs(j2), c)));
                return spannableStringBuilder;
            } else {
                if (z) {
                    str = "-";
                }
                spannableStringBuilder.append((CharSequence) (str + gm.o0((int) Math.abs(j2), 0)));
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            DecimalFormat decimalFormat = x0;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
                x0 = decimalFormat;
            }
            String format = decimalFormat.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = starsAmount.amount;
        int i2 = starsAmount.nanos;
        boolean z = false;
        if (i2 < 0 && j > 0) {
            i = -1;
            d = 1.0E9d;
        } else if (i2 > 0 && j < 0) {
            d = 1.0E9d;
            i = 1;
        } else {
            d = 1.0E9d;
            i = 0;
        }
        long j2 = i + j;
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 != 0 ? i3 < 0 : i2 < 0) {
            z = true;
        }
        if (i2 != 0) {
            if (z) {
                str = "-";
            } else {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str.concat(jb6.E(Math.abs(j2), ',')));
            DecimalFormat decimalFormat2 = x0;
            if (decimalFormat2 == null) {
                decimalFormat2 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
                x0 = decimalFormat2;
            }
            int i4 = starsAmount.nanos;
            double d2 = i4;
            if (i4 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat2.format(d2 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131744773, null));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) jb6.H(',', "Stars", (int) j));
        return spannableStringBuilder;
    }

    public static String K0(long j) {
        String str;
        DecimalFormat decimalFormat = w0;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
            w0 = decimalFormat;
        }
        if (j % 1000000000 != 0) {
            return decimalFormat.format(j / 1.0E9d);
        }
        if (j < 0) {
            str = "-";
        } else {
            str = "";
        }
        return str.concat(jb6.E(Math.abs(j / 1000000000), ','));
    }

    public static String L0(int i, boolean z, TL_stars.StarsTransaction starsTransaction) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (starsTransaction.stargift_drop_original_details) {
            return jb6.M0(2131744621, null);
        }
        if (starsTransaction.posts_search) {
            return jb6.M0(2131744625, null);
        }
        if (starsTransaction.premium_gift) {
            return jb6.M0(2131744624, null);
        }
        if (starsTransaction.phonegroup_message) {
            if (starsTransaction.reaction) {
                i5 = 2131744633;
            } else {
                i5 = 2131744634;
            }
            return jb6.M0(i5, null);
        } else if (starsTransaction.paid_message) {
            return jb6.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        } else {
            if (starsTransaction.floodskip) {
                return jb6.M0(2131744648, null);
            }
            if (!starsTransaction.extended_media.isEmpty()) {
                return jb6.M0(2131744893, null);
            }
            TL_stars.StarsAmount starsAmount = starsTransaction.amount;
            int i6 = starsTransaction.flags;
            if ((131072 & i6) == 0 && (65536 & i6) != 0) {
                return jb6.a0(null, null, 2131744850, bc.J0(starsTransaction.starref_commission_permille));
            }
            if (starsTransaction.stargift != null) {
                if (starsTransaction.stargift_prepaid_upgrade) {
                    return jb6.M0(2131749863, null);
                }
                boolean z2 = starsTransaction.refund;
                boolean z3 = starsTransaction.stargift_auction_bid;
                if (z2) {
                    if (z3) {
                        i4 = 2131749862;
                    } else if (starsAmount.amount > 0) {
                        if (starsTransaction.stargift_upgrade) {
                            i4 = 2131749859;
                        } else {
                            i4 = 2131749860;
                        }
                    } else {
                        i4 = 2131749861;
                    }
                    return jb6.M0(i4, null);
                }
                if (z3) {
                    i3 = 2131749865;
                } else if (starsAmount.amount > 0) {
                    i3 = 2131749864;
                } else if (starsTransaction.stargift_upgrade) {
                    i3 = 2131749856;
                } else {
                    i3 = 2131749857;
                }
                return jb6.M0(i3, null);
            }
            if (starsTransaction.subscription) {
                int i7 = starsTransaction.subscription_period;
                if (i7 == 2592000) {
                    return jb6.M0(2131744852, null);
                }
                if (i7 == 300) {
                    return "5-minute subscription fee";
                }
                if (i7 == 60) {
                    return "Minute subscription fee";
                }
            }
            if ((i6 & 8192) != 0) {
                return jb6.M0(2131744782, null);
            }
            if (starsTransaction.gift) {
                int i8 = 2131744791;
                if (starsTransaction.sent_by != null) {
                    if (m9c.D(oc7.r1(i).W1(Long.valueOf(pg3.n(starsTransaction.sent_by))))) {
                        i8 = 2131744790;
                    }
                    return jb6.M0(i8, null);
                }
                return jb6.M0(2131744791, null);
            }
            String str = starsTransaction.title;
            if (str != null) {
                return str;
            }
            long n = pg3.n(starsTransaction.peer.peer);
            int i9 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            if (i9 != 0) {
                int i10 = z8c.t0;
                if (i9 >= 0) {
                    return m9c.r(oc7.r1(i10).W1(Long.valueOf(n)));
                }
                TLRPC.Chat L0 = oc7.r1(i10).L0(Long.valueOf(-n));
                if (L0 == null) {
                    return "";
                }
                return L0.title;
            }
            TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
            if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                if (!z) {
                    boolean z4 = starsTransaction.refund;
                    TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
                    if (!z4 ? !starsAmount2.negative() : !starsAmount2.positive()) {
                        i2 = 2131744640;
                        return jb6.M0(i2, null);
                    }
                }
                i2 = 2131744610;
                return jb6.M0(i2, null);
            } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                return jb6.M0(2131744650, null);
            } else {
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                    return jb6.M0(2131744651, null);
                }
                return jb6.M0(2131744612, null);
            }
        }
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f) {
        return S0(charSequence, f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f, float f2, float f3) {
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
        pn2 pn2Var = new pn2(2131231057, 0);
        pn2Var.d = false;
        pn2Var.r = 0.0f;
        pn2Var.s = f2;
        pn2Var.H = f3;
        pn2Var.I = f;
        pn2Var.J = f;
        spannableString.setSpan(pn2Var, 0, spannableString.length() - 1, 33);
        gm.I2(spannableStringBuilder, "💎", "💎️");
        gm.I2(spannableStringBuilder, "💎", "💎 ");
        gm.I2(spannableStringBuilder, spannableString, "💎");
        gm.I2(spannableStringBuilder, "XTR", "XTR ");
        gm.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder T0(CharSequence charSequence) {
        return U0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f, pn2[] pn2VarArr) {
        return Y0(false, charSequence, f, pn2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z) {
        return X0(z, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder X0(boolean z, CharSequence charSequence, float f, pn2[] pn2VarArr) {
        return Y0(z, charSequence, f, pn2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Y0(boolean z, CharSequence charSequence, float f, pn2[] pn2VarArr, float f2, float f3) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        pn2 pn2Var;
        int i;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z) {
            str = "⭐";
        } else {
            str = "TON";
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (pn2VarArr == null || (pn2Var = pn2VarArr[0]) == null) {
            if (z) {
                i = 2131231962;
            } else {
                i = 2131232313;
            }
            pn2Var = new pn2(i, 0);
            if (pn2VarArr != null) {
                pn2VarArr[0] = pn2Var;
            }
        }
        pn2Var.r = 0.0f;
        pn2Var.s = f2;
        pn2Var.H = f3;
        if (z) {
            pn2Var.d = false;
            float f4 = f * 0.2f;
            pn2Var.I = f4;
            pn2Var.J = f4;
        } else {
            pn2Var.I = f;
            pn2Var.J = f;
        }
        spannableString.setSpan(pn2Var, 0, spannableString.length() - 1, 33);
        gm.I2(spannableStringBuilder, "⭐", "⭐️");
        gm.I2(spannableStringBuilder, "⭐", "⭐ ");
        gm.I2(spannableStringBuilder, spannableString, "⭐");
        gm.I2(spannableStringBuilder, "XTR", "XTR ");
        gm.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(boolean z, String str, pn2[] pn2VarArr) {
        pn2 pn2Var;
        int i;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (pn2VarArr == null || (pn2Var = pn2VarArr[0]) == null) {
            if (z) {
                i = 2131231962;
            } else {
                i = 2131232313;
            }
            pn2Var = new pn2(i, 0);
            if (z) {
                f = 0.222f;
            } else {
                f = 1.13f;
            }
            pn2Var.I = f;
            pn2Var.J = f;
        }
        if (z) {
            pn2Var.d = false;
        }
        if (pn2VarArr != null) {
            pn2VarArr[0] = pn2Var;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(pn2Var, 0, spannableString.length() - 1, 33);
        gm.I2(spannableStringBuilder, "⭐", "⭐️");
        gm.I2(spannableStringBuilder, "⭐", "⭐ ");
        gm.I2(spannableStringBuilder, spannableString, "⭐");
        gm.I2(spannableStringBuilder, "XTR", "XTR ");
        gm.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a1(TL_stars.StarsAmount starsAmount, String str, pn2[] pn2VarArr) {
        return b1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, pn2VarArr);
    }

    public static android.text.SpannableStringBuilder b1(boolean r5, java.lang.CharSequence r6, float r7, defpackage.pn2[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxa.b1(boolean, java.lang.CharSequence, float, pn2[]):android.text.SpannableStringBuilder");
    }

    public static gwa c1(bf0 bf0Var, ImageReceiver imageReceiver, String str, boolean z) {
        int i;
        int i2 = imageReceiver.d;
        final al3 al3Var = new al3(z, i2, str, imageReceiver, new boolean[1]);
        al3Var.run();
        nm7 f = nm7.f(i2);
        if (z) {
            i = nm7.Z2;
        } else {
            i = nm7.Y2;
        }
        return new gwa(f.h(bf0Var, i, new qac() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                al3 al3Var2 = al3Var;
                Object[] objArr = (Object[]) obj;
                switch (b) {
                    case 0:
                        al3Var2.run();
                        return;
                    default:
                        al3Var2.run();
                        return;
                }
            }
        }), nm7.f(i2).h(bf0Var, nm7.y0, new qac() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                al3 al3Var2 = al3Var;
                Object[] objArr = (Object[]) obj;
                switch (b) {
                    case 0:
                        al3Var2.run();
                        return;
                    default:
                        al3Var2.run();
                        return;
                }
            }
        }), (byte) 0);
    }

    public static void d1(bf0 bf0Var, ImageReceiver imageReceiver, long j) {
        String str;
        if (j <= 1000) {
            str = "2⃣";
        } else if (j < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        c1(bf0Var, imageReceiver, str, false);
    }

    public static void e1(ImageReceiver imageReceiver, TLRPC.Document document, int i) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w = bc4.w(document.thumbs, i, false, null, false);
        imageReceiver.Z(gn5.b(document), td4.n(i, i, "_"), gn5.c(w, document), td4.n(i, i, "_"), eq3.d(document.thumbs, cmb.Z6, 0.35f, false), 0L, null, null, 0);
    }

    public static void f1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        e1(imageReceiver, document, i);
    }

    public static gwa g1(bf0 bf0Var, ImageReceiver imageReceiver, int i) {
        String str;
        if (i != 3) {
            if (i != 6) {
                if (i != 12) {
                    if (i != 24) {
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
        return c1(bf0Var, imageReceiver, str, false);
    }

    public static void h1(bf0 bf0Var, ImageReceiver imageReceiver, long j) {
        String str;
        if (j <= 10000000000L) {
            str = "2⃣";
        } else if (j <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        c1(bf0Var, imageReceiver, str, true);
    }

    public static void i1(Context context, int i, long j, TL_stories.Boost boost, ylb ylbVar) {
        int i2;
        if (context == null) {
            return;
        }
        my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout i3 = hg9.i(context, 1);
        i3.setPadding(0, gm.L(20.0f), 0, gm.L(4.0f));
        i3.setClipChildren(false);
        i3.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        i3.addView(frameLayout, qoe.t(-1, 150, 7, 0, 0, 0, 10));
        uwa uwaVar = new uwa(context, 70, 0);
        frameLayout.addView(uwaVar, qoe.c(-1.0f, -1));
        ft4 ft4Var = new ft4(context, 1, 2);
        vs4 vs4Var = ft4Var.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        ft4Var.setStarParticlesView(uwaVar);
        frameLayout.addView(ft4Var, qoe.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        ft4Var.setPaused(false);
        TextView textView = new TextView(context);
        td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
        textView.setGravity(17);
        my0[] my0VarArr = new my0[1];
        textView.setText(jb6.H(' ', "BoostStars", (int) boost.stars));
        TextView m = wi8.m(i3, textView, qoe.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setBackground(cmb.b0(gm.L(20.0f), -6915073));
        m.setTextColor(-1);
        m.setTextSize(1, 11.33f);
        m.setPadding(gm.L(4.0f), 0, gm.L(8.33f), 0);
        m.setGravity(17);
        m.setTypeface(gm.o());
        int i4 = boost.multiplier;
        if (i4 == 0) {
            i4 = 1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x".concat(jb6.H(' ', "BoostingBoostsCount", i4)));
        pn2 pn2Var = new pn2(2131231933, 2);
        pn2Var.r = 0.0f;
        pn2Var.s = gm.L(0.66f);
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
        m.setText(spannableStringBuilder);
        i3.addView(m, qoe.t(-2, 20, 17, 20, 4, 20, 4));
        mhb mhbVar = new mhb(context, ylbVar);
        mhbVar.n(jb6.M0(2131753592, null), i, j, new rva(my0VarArr, j, (byte) 6));
        mhbVar.f(jb6.M0(2131753591, null), jb6.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = jb6.M0(2131753580, null);
            String M02 = jb6.M0(2131753579, null);
            i2 = 1;
            hq6 hq6Var = new hq6(my0VarArr, j, boost, (byte) 27);
            my0VarArr = my0VarArr;
            mhbVar.i(M0, M02, hq6Var);
        } else {
            i2 = 1;
        }
        String M03 = jb6.M0(2131753627, null);
        String format = jb6.D0().r0().format(new Date(boost.date * 1000));
        String format2 = jb6.D0().o0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[0] = format;
        objArr[i2] = format2;
        mhbVar.f(M03, jb6.a0(null, null, 2131742446, objArr), null, null);
        String M04 = jb6.M0(2131753572, null);
        String format3 = jb6.D0().r0().format(new Date(boost.expires * 1000));
        String format4 = jb6.D0().o0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[0] = format3;
        objArr2[i2] = format4;
        mhbVar.f(M04, jb6.a0(null, null, 2131742446, objArr2), null, null);
        i3.addView(mhbVar, qoe.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        l66 l66Var = new l66(context, ylbVar);
        anb.X(l66Var, cmb.y6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setTextSize(i2, 14.0f);
        l66Var.setText(gm.N2(jb6.M0(2131744615, null), -1, 0, new dh1(context, (byte) 17), null));
        l66Var.setGravity(17);
        i3.addView(l66Var, qoe.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.i(jb6.M0(2131747564, null), false, true);
        b61Var.setOnClickListener(new f5(my0VarArr, (byte) 5));
        i3.addView(b61Var, qoe.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        h.O = i3;
        my0VarArr[0] = h;
        h.T0 = false;
        h.J();
        d S = LaunchActivity.S();
        if (!gm.O1() && !gm.s1(S)) {
            my0VarArr[0].X(S);
        }
        ft4Var.setPaused(false);
        my0VarArr[0].show();
        my0VarArr[0].n(new nsa(ft4Var, (byte) 2));
    }

    public static q2a j1(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, jac jacVar, ylb ylbVar) {
        nk resellAmount;
        ok okVar = ok.a;
        if (tL_starGiftUnique == null) {
            resellAmount = nk.h(oc7.r1(i).l4.o.f(), okVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(ok.b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(okVar);
        }
        q2a q2aVar = new q2a(context, ylbVar, i, resellAmount, new ts9(jacVar, r8, (byte) 13));
        q2a[] q2aVarArr = {q2aVar};
        q2aVar.show();
        return q2aVarArr[0];
    }

    public static void k1(Context context, long j, boolean z, final jac jacVar, ylb ylbVar) {
        int i;
        int i2;
        CharSequence l;
        my0[] my0VarArr;
        long j2;
        boolean z2 = false;
        my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        b61 b61Var = null;
        textView.setText(jb6.M0(2131747465, null));
        textView.setTextSize(1, 20.0f);
        int i3 = cmb.F6;
        anb.X(textView, i3, ylbVar);
        linearLayout.addView(textView, qoe.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        gt7 gt7Var = new gt7(context, ylbVar);
        gt7Var.setForceForceUseCenter(true);
        gt7Var.setText(jb6.M0(2131747466, null));
        gt7Var.setLeftPadding(gm.L(36.0f));
        anb.X(editTextBoldCursor, i3, ylbVar);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = gm.L(16.0f);
        editTextBoldCursor.setPadding(gm.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        anb.C(editTextBoldCursor, cmb.kg, ylbVar);
        anb.l(editTextBoldCursor, 36, cmb.lg, ylbVar);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor.setGravity(i);
        editTextBoldCursor.setOnFocusChangeListener(new ru0(gt7Var, editTextBoldCursor, (byte) 2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232769);
        linearLayout2.addView(imageView, qoe.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, qoe.p(-1, -2, 1.0f, 119));
        gt7Var.e(editTextBoldCursor);
        gt7Var.addView(linearLayout2, qoe.e(-1, -2, 48));
        linearLayout.addView(gt7Var, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        anb.X(textView2, cmb.z6, null);
        gt7Var.addView(textView2, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        l66 l66Var = new l66(context, null);
        l66Var.setText(gm.D2(gm.N2(jb6.M0(2131747468, null), -1, 0, new dh1(context, (byte) 18), null), true));
        l66Var.setTextSize(1, 12.0f);
        anb.X(l66Var, cmb.y6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        linearLayout.addView(l66Var, qoe.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final b61 i4 = mlb.i(24, ylbVar, context, true);
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i5 > 0) {
            i2 = 2131747464;
        } else {
            i2 = 2131747470;
        }
        i4.i(jb6.M0(i2, null), false, true);
        linearLayout.addView(i4, qoe.o(-1, 48));
        if (i5 > 0 && z) {
            b61 i6 = mlb.i(24, ylbVar, context, false);
            i6.i(jb6.M0(2131747469, null), false, false);
            linearLayout.addView(i6, qoe.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            b61Var = i6;
        }
        h.O = linearLayout;
        final my0[] my0VarArr2 = {h};
        if (i5 <= 0) {
            l = "";
        } else {
            l = Long.toString(j);
        }
        editTextBoldCursor.setText(l);
        editTextBoldCursor.addTextChangedListener(new twa(editTextBoldCursor, gt7Var, j, z, i4, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i7, KeyEvent keyEvent) {
                if (i7 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                i4.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                jacVar.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new bwa(editTextBoldCursor2, my0VarArr2, (byte) 1));
                return true;
            }
        });
        zva zvaVar = new zva(zArr, jacVar, editTextBoldCursor, i4, my0VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        i4.setOnClickListener(zvaVar);
        if (b61Var != null) {
            b61 b61Var2 = b61Var;
            zva zvaVar2 = new zva(zArr, jacVar, b61Var2, editTextBoldCursor2, my0VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            my0VarArr = my0VarArr2;
            b61Var2.setOnClickListener(zvaVar2);
        } else {
            my0VarArr = my0VarArr2;
        }
        my0VarArr[0].J();
        my0VarArr[0].setOnDismissListener(new ie4(editTextBoldCursor2, (byte) 3));
        my0VarArr[0].show();
        d Q = LaunchActivity.Q();
        if (Q instanceof yv1) {
            z2 = ((yv1) Q).ea();
        }
        bwa bwaVar = new bwa(my0VarArr, editTextBoldCursor2);
        if (z2) {
            j2 = 200;
        } else {
            j2 = 80;
        }
        gm.d3(bwaVar, j2);
    }

    public static defpackage.my0 l1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final defpackage.ylb r66) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxa.l1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, ylb):my0");
    }

    public static void m1(Activity activity, int i, int i2, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, ylb ylbVar) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i2;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        l1(activity, false, 0L, i, starsTransaction, ylbVar);
    }

    public static void n1(Context context, int i, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, ylb ylbVar) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = oc7.r1(i).x1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        l1(context, false, 0L, i, starsTransaction, ylbVar);
    }

    public static CharSequence t1(CharSequence charSequence, boolean z) {
        pn2[] pn2VarArr;
        sbc c;
        if (z && (charSequence instanceof Spanned)) {
            for (pn2 pn2Var : (pn2[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), pn2.class)) {
                Drawable drawable = pn2Var.c;
                if (drawable != null && !(drawable instanceof sbc) && (c = sbc.c(a.b.getResources(), 2131231963, null)) != null) {
                    c.setBounds(pn2Var.c.getBounds());
                    pn2Var.c = c;
                    pn2Var.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void E0() {
        r1();
        r59 r59Var = this.c;
        if (r59Var != null && this.V != null && r59Var.getLayoutParams() != null) {
            int x = b10.x(48.0f, this.c0, -gm.L(8.0f));
            int x2 = b10.x(48.0f, this.d0, -gm.L(8.0f));
            gm.v3(this.c, 0, x, 0, x2);
            r59 r59Var2 = this.c;
            int i = -x;
            r59Var2.setPadding(r59Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - x2);
            this.V.A(i, -x2);
        }
    }

    public final void F0(ArrayList arrayList, l7c l7cVar) {
        boolean z;
        r59 r59Var;
        int i;
        o1("FILL_BEFORE");
        fja fjaVar = this.V;
        if (fjaVar != null && fjaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        jva v = jva.v(this.currentAccount, false);
        c6c c6cVar = new c6c(-2);
        c6cVar.c = (sb) super.o0(getParentActivity());
        arrayList.add(c6cVar);
        arrayList.add(c6c.k(this.j0));
        b61 b61Var = this.s0;
        if (b61Var != null) {
            if (getMessagesController().l4.w2.f) {
                i = 0;
            } else {
                i = 8;
            }
            b61Var.setVisibility(i);
        }
        arrayList.add(c6c.C(null));
        if (getMessagesController().l4.C2.f) {
            arrayList.add(xb.i(-4, getThemedColor(cmb.kk), ba2.b0(jb6.M0(2131743453, null)), jb6.M0(2131743454, null)));
            arrayList.add(c6c.C(null));
        }
        if (v.e && !v.v.isEmpty()) {
            aq1.o(2131744892, null, arrayList);
            for (int i2 = 0; i2 < v.v.size(); i2++) {
                int i3 = fxa.b;
                c6c K = c6c.K(fxa.class);
                K.H = (TL_stars.StarsSubscription) v.v.get(i2);
                arrayList.add(K);
            }
            if (v.x) {
                arrayList.add(c6c.q(arrayList.size(), 33));
            } else if (!v.y) {
                c6c c = c6c.c(-3, 2131230872, jb6.M0(2131744891, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c6c.C(null));
        }
        boolean K2 = v.K(0);
        this.t0 = K2;
        if (K2) {
            this.b0 = arrayList.size();
            arrayList.add(c6c.n(this.W, -2));
            if (z && (r59Var = this.c) != null) {
                r59Var.removeCallbacks(this.g0);
                this.c.post(this.g0);
            }
        } else {
            arrayList.add(c6c.m(this.h0));
        }
        o1("FILL_AFTER");
    }

    public final void M0(int r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxa.M0(int):void");
    }

    public final void N0(Context context) {
        if (oc7.r1(this.currentAccount).u2()) {
            h5.b(this.currentAccount);
        } else {
            new exa(context, this.resourceProvider).show();
        }
    }

    public final void O0(Context context) {
        new exa(context, this.resourceProvider).show();
    }

    public final void P0() {
        jva.v(this.currentAccount, false).r();
        yw4.f1(true, ok0.a(this.currentAccount).b());
    }

    public final void Q0(c6c c6cVar, Boolean bool, String str) {
        if (getParentActivity() != null) {
            if (bool.booleanValue()) {
                c41.b0(this).I(2131624221, jb6.M0(2131744848, null), gm.S2(jb6.G((int) c6cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                this.i0.c(true);
                jva.v(this.currentAccount, false).P(true);
            } else if (str != null) {
                c41.b0(this).Q(2131624012, 36, jb6.a0(null, null, 2131743565, str)).j();
            }
        }
    }

    @Override
    public final View createView(final Context context) {
        boolean z;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i;
        this.H = false;
        this.F = gm.L(238.0f);
        fja fjaVar = new fja(context);
        this.V = fjaVar;
        boolean z2 = true;
        fjaVar.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
                i = 0;
            } else {
                i = gm.m;
            }
            this.c0 = i;
            this.d0 = gm.n;
        }
        this.V.setGeometry(new x59(this, (byte) 15));
        this.V.A(-b10.x(48.0f, this.c0, -gm.L(8.0f)), -b10.x(48.0f, this.d0, -gm.L(8.0f)));
        fja fjaVar2 = this.V;
        fjaVar2.getClass();
        this.W = new xd9((byte) 7, context, fjaVar2);
        this.U = new mxa(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new xd9((byte) 9, context, this);
        super.createView(context);
        g15 g15Var = this.s;
        getBaseSimpleGlass().f(g15Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new dh0(this, new kwa(g15Var, (byte) 0), (byte) 8);
        FrameLayout frameLayout = this.U.d;
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        fja fjaVar3 = this.V;
        fjaVar3.addView(this.X, fjaVar3.indexOfChild(frameLayout), qoe.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        nva nvaVar = new nva(this, (byte) 0);
        d53 d53Var = d53.h;
        fn0 fn0Var = new fn0(0, nvaVar, d53Var, 380L, false);
        this.Y = fn0Var;
        this.Z = new fn0(1, new nva(this, (byte) 1), d53Var, 380L, false);
        this.a0 = new fn0(2, new nva(this, (byte) 2), d53Var, 380L, false);
        if (!this.c.canScrollVertically(-1) && !this.simpleActionBar.x()) {
            z = false;
        } else {
            z = true;
        }
        fn0Var.a(z, false);
        this.Z.a(this.V.f0, false);
        this.c.j(new so7(this, (byte) 27));
        r1();
        im0 c = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c.p(qqd.l(this.resourceProvider));
        c.q(gm.L(9.66f));
        c.r(gm.L(18.0f));
        frameLayout.setBackground(c);
        tk5 tk5Var2 = this.parentLayout;
        if (tk5Var2 != null && ((ActionBarLayout) tk5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        frameLayout2.setClickable(true);
        ft4 ft4Var = new ft4(context, 1, 2);
        this.T = ft4Var;
        vs4 vs4Var = ft4Var.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, qoe.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(jb6.M0(2131743900, null), gm.D2(gm.N2(jb6.M0(2131743897, null), -1, 0, new dh1(context, (byte) 15), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53Var);
        sc3Var.n(350L);
        this.c.setItemAnimator(sc3Var);
        this.c.setOnItemClickListener(new s19(this, (byte) 12));
        uj4 uj4Var = new uj4(getParentActivity());
        this.i0 = uj4Var;
        this.s.addView(uj4Var, qoe.c(-1.0f, -1));
        jva v = jva.v(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, gm.L(24.0f), 0, gm.L(10.0f));
        io ioVar = new io(getParentActivity(), false, true, false);
        this.l0 = ioVar;
        ioVar.setTypeface(gm.o());
        this.l0.setTextSize(gm.L(32.0f));
        this.l0.setGravity(17);
        anb.U(this.l0, cmb.F6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        on5 on5Var = new on5(42.0f, this.currentAccount, this.l0);
        p09 p09Var = new p09(2131624212, gm.L(42.0f), gm.L(42.0f));
        ImageReceiver imageReceiver = on5Var.b;
        imageReceiver.g0(p09Var);
        imageReceiver.M(2);
        on5Var.f = false;
        on5Var.h = -gm.L(3.0f);
        this.k0.setSpan(on5Var, 0, 1, 33);
        this.j0.addView(this.l0, qoe.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(jb6.M0(2131742453, null));
        anb.X(this.m0, cmb.y6, this.resourceProvider);
        this.j0.addView(this.m0, qoe.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        ne6 ne6Var = new ne6((byte) 25, getParentActivity(), this);
        this.o0 = ne6Var;
        frameLayout3.addView(ne6Var);
        b61 b61Var = new b61(this.resourceProvider, getParentActivity(), true);
        this.p0 = b61Var;
        b61Var.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) {
            public final nxa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                Context context2 = context;
                nxa nxaVar = this.b;
                switch (b) {
                    case 0:
                        nxaVar.N0(context2);
                        return;
                    default:
                        nxaVar.O0(context2);
                        return;
                }
            }
        });
        this.o0.addView(this.p0, qoe.e(-1, 48, 119));
        qmb qmbVar = new qmb((byte) 19, getParentActivity(), this);
        this.q0 = qmbVar;
        frameLayout3.addView(qmbVar);
        b61 b61Var2 = new b61(this.resourceProvider, getParentActivity(), true);
        this.r0 = b61Var2;
        b61Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new pn2(2131231982, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) jb6.M0(2131744654, null));
        this.r0.i(spannableStringBuilder, false, true);
        this.r0.setOnClickListener(new View.OnClickListener(this) {
            public final nxa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                Context context2 = context;
                nxa nxaVar = this.b;
                switch (b) {
                    case 0:
                        nxaVar.N0(context2);
                        return;
                    default:
                        nxaVar.O0(context2);
                        return;
                }
            }
        });
        this.q0.addView(this.r0, qoe.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        b61 b61Var3 = new b61(this.resourceProvider, getParentActivity(), true);
        this.n0 = b61Var3;
        b61Var3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new pn2(2131231978, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131744711, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) {
            public final nxa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                nxa nxaVar = this.b;
                switch (b) {
                    case 0:
                        nxaVar.presentFragment(new au0(0, nxaVar.getUserConfig().e()));
                        return;
                    default:
                        nxaVar.P0();
                        return;
                }
            }
        });
        this.q0.addView(this.n0, qoe.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout3, qoe.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        b61 b61Var4 = new b61(this.resourceProvider, getParentActivity(), false);
        this.s0 = b61Var4;
        b61Var4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new pn2(2131231896, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) jb6.M0(2131743898, null));
        this.s0.i(spannableStringBuilder3, false, true);
        this.s0.setOnClickListener(new View.OnClickListener(this) {
            public final nxa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                nxa nxaVar = this.b;
                switch (b) {
                    case 0:
                        nxaVar.presentFragment(new au0(0, nxaVar.getUserConfig().e()));
                        return;
                    default:
                        nxaVar.P0();
                        return;
                }
            }
        });
        this.j0.addView(this.s0, qoe.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        p1();
        vb vbVar = this.v0;
        if (vbVar != null) {
            vbVar.O(false);
        }
        ku0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = ku0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (v.m().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z2 = false;
        }
        q1(z2, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.x3;
        int i4 = nm7.C3;
        int i5 = nm7.B3;
        if (i == i5 || i == i4 || i == i3) {
            o1("NOTIFICATION_" + i);
        }
        if (i == i3) {
            u0();
            vb vbVar = this.v0;
            if (vbVar != null) {
                vbVar.O(true);
            }
            h0();
        } else if (i == i5) {
            jva v = jva.v(this.currentAccount, false);
            if (this.t0 != v.K(0)) {
                this.t0 = v.K(0);
                u0();
                vb vbVar2 = this.v0;
                if (vbVar2 != null) {
                    vbVar2.O(false);
                }
                h0();
            }
        } else if (i == i4) {
            vb vbVar3 = this.v0;
            if (vbVar3 != null) {
                vbVar3.O(true);
            }
        } else if (i == nm7.A3) {
            p1();
        } else if (i == nm7.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            p1();
        }
    }

    @Override
    public final void h0() {
        fja fjaVar;
        o1("RESTORE_BEFORE");
        super.h0();
        if (this.f0 && (fjaVar = this.V) != null && this.b0 != -1) {
            fjaVar.a();
        }
        this.f0 = false;
        o1("RESTORE_AFTER");
    }

    @Override
    public final void i0() {
        this.s.addView(this.V, qoe.c(-1.0f, -1));
        this.V.v(this.c, new nva(this, (byte) 3));
        fja fjaVar = this.V;
        mxa mxaVar = this.U;
        fjaVar.y(mxaVar, mxaVar.b, new dq9((byte) 29));
        this.V.z(this.U.d);
        this.U.d.setLayoutParams(qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        E0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        fja fjaVar = this.V;
        if (fjaVar == null || motionEvent == null || fjaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final y59 k0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new vh8(this, (byte) 24), getResourceProvider(), (byte) 4);
        this.v0 = vbVar;
        vbVar.r = false;
        return vbVar;
    }

    @Override
    public final u46 l0(Context context) {
        fja fjaVar = this.V;
        fjaVar.getClass();
        return new jg2((Object) fjaVar, (byte) 5);
    }

    @Override
    public final dta m0() {
        return new uwa(getParentActivity(), 75, 1);
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    public final void o1(String str) {
        boolean z;
        int top;
        if (this.V != null) {
            StringBuilder p = wi8.p("Stars event=", str, " row=");
            p.append(this.b0);
            p.append(" hasTransactions=");
            p.append(this.t0);
            p.append(" savedPosition=");
            p.append(this.Q);
            p.append(" savedOffset=");
            p.append(this.R);
            p.append(" savedPinned=");
            p.append(this.f0);
            p.append(" boundaryAttached=");
            xd9 xd9Var = this.W;
            int i = 0;
            if (xd9Var != null && xd9Var.getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            p.append(z);
            p.append(" boundaryTop=");
            xd9 xd9Var2 = this.W;
            if (xd9Var2 == null) {
                top = 0;
            } else {
                top = xd9Var2.getTop();
            }
            p.append(top);
            p.append(" boundaryHeight=");
            xd9 xd9Var3 = this.W;
            if (xd9Var3 != null) {
                i = xd9Var3.getHeight();
            }
            p.append(i);
            Log.d("SiblingScroll", p.toString());
            fja fjaVar = this.V;
            if (!fjaVar.a) {
                return;
            }
            fjaVar.b = Math.max(fjaVar.b, 30);
            fjaVar.f(str, null, 0, 0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.x3);
        nm7.f(this.currentAccount).b(this, nm7.A3);
        nm7.f(this.currentAccount).b(this, nm7.B3);
        nm7.f(this.currentAccount).b(this, nm7.C3);
        nm7.f(this.currentAccount).b(this, nm7.E3);
        jva.v(this.currentAccount, false).P(true);
        jva.v(this.currentAccount, false).O();
        jva.v(this.currentAccount, false).w();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        r59 r59Var = this.c;
        if (r59Var != null) {
            r59Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.x3);
        nm7.f(this.currentAccount).n(this, nm7.A3);
        nm7.f(this.currentAccount).n(this, nm7.B3);
        nm7.f(this.currentAccount).n(this, nm7.C3);
        nm7.f(this.currentAccount).n(this, nm7.E3);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.e0 = true;
        this.c0 = i2;
        this.d0 = i4;
        E0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ft4 ft4Var = this.T;
        if (ft4Var != null) {
            ft4Var.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ft4 ft4Var = this.T;
        if (ft4Var != null) {
            ft4Var.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    public final void p1() {
        int i;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = false;
        jva v = jva.v(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) H0(v.m(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        b61 b61Var = this.p0;
        if (v.m().amount > 0) {
            i = 2131744839;
        } else {
            i = 2131744840;
        }
        b61Var.i(jb6.M0(i, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = ku0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z = true;
        }
        q1(z, true);
    }

    @Override
    public final float q0() {
        r59 r59Var = this.c;
        if (r59Var == null) {
            return 0.0f;
        }
        return r59Var.getY();
    }

    public final void q1(final boolean z, boolean z2) {
        float f;
        int i;
        float f2;
        this.u0 = z;
        ne6 ne6Var = this.o0;
        float f3 = 1.0f;
        int i2 = 0;
        if (z2) {
            ne6Var.setVisibility(0);
            this.q0.setVisibility(0);
            ViewPropertyAnimator animate = this.o0.animate();
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            animate.alpha(f2).withEndAction(new Runnable(this) {
                public final nxa b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z3 = z;
                    nxa nxaVar = this.b;
                    switch (b) {
                        case 0:
                            if (z3) {
                                nxaVar.o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z3) {
                                nxaVar.q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.q0.animate();
            if (!z) {
                f3 = 0.0f;
            }
            animate2.alpha(f3).withEndAction(new Runnable(this) {
                public final nxa b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z3 = z;
                    nxa nxaVar = this.b;
                    switch (b) {
                        case 0:
                            if (z3) {
                                nxaVar.o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z3) {
                                nxaVar.q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        ne6Var.animate().cancel();
        this.q0.animate().cancel();
        qmb qmbVar = this.q0;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        qmbVar.setAlpha(f);
        ne6 ne6Var2 = this.o0;
        if (z) {
            f3 = 0.0f;
        }
        ne6Var2.setAlpha(f3);
        qmb qmbVar2 = this.q0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        qmbVar2.setVisibility(i);
        ne6 ne6Var3 = this.o0;
        if (z) {
            i2 = 8;
        }
        ne6Var3.setVisibility(i2);
    }

    @Override
    public final View r0() {
        return this.V;
    }

    public final void r1() {
        if (this.X == null) {
            return;
        }
        int L = gm.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        s1();
    }

    @Override
    public final void s0(boolean z) {
        fn0 fn0Var = this.a0;
        if (fn0Var != null && fn0Var.f != z) {
            fn0Var.a(z, true);
        }
    }

    public final void s1() {
        float f;
        View view = this.X;
        if (view == null) {
            return;
        }
        fn0 fn0Var = this.Y;
        float f2 = 0.0f;
        if (fn0Var == null) {
            f = 0.0f;
        } else {
            f = fn0Var.e;
        }
        fn0 fn0Var2 = this.Z;
        if (fn0Var2 != null) {
            f2 = fn0Var2.e;
        }
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - f2) * gm.L(44.0f)));
    }

    @Override
    public final void u0() {
        boolean z;
        o1("SAVE_BEFORE");
        super.u0();
        fja fjaVar = this.V;
        if (fjaVar != null && fjaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.f0 = z;
        r59 r59Var = this.c;
        if (r59Var != null && this.Q >= 0) {
            this.R -= r59Var.getPaddingTop();
        }
        o1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
