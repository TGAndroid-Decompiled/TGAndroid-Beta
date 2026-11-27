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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class nza extends m15 implements fn7 {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public it4 T;
    public mza U;
    public wka V;
    public nf9 W;
    public View X;
    public fm0 Y;
    public fm0 Z;
    public fm0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public nf9 h0;
    public tj4 i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public in l0;
    public TextView m0;
    public c51 n0;
    public d26 o0;
    public c51 p0;
    public oob q0;
    public c51 r0;
    public c51 s0;
    public boolean t0;
    public boolean u0;
    public wb v0;
    public int b0 = -1;
    public final uoa g0 = new uoa(this, (byte) 10);

    public nza() {
        this.N = true;
    }

    public static void C0(hjb hjbVar, int i, TL_stars.StarGift starGift, vnb vnbVar) {
        CharSequence K;
        CharSequence concat;
        TextView textView = (TextView) ((ejb) hjbVar.f(ob6.M0(2131750261, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ya6 ya6Var = new ya6(textView, hl.L(90.0f), 0, vnbVar);
        ya6Var.a(aob.p1(0.21f, textView.getPaint().getColor()), aob.p1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ya6Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final jxa v = jxa.v(i, false);
            final long j = starGift.id;
            final sh9 sh9Var = new sh9(textView, (byte) 12);
            final boolean[] zArr = {false};
            final fn7[] fn7VarArr = {new fn7() {
                @Override
                public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                    int i4;
                    jxa jxaVar;
                    TL_stars.StarGift G;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i2 == (i4 = jn7.H3) && (G = (jxaVar = jxa.this).G(j)) != null) {
                        zArr2[0] = true;
                        jn7.f(jxaVar.a).n(fn7VarArr[0], i4);
                        sh9Var.a(G);
                    }
                }
            }};
            int i2 = v.a;
            jn7 f = jn7.f(i2);
            fn7 fn7Var = fn7VarArr[0];
            int i3 = jn7.H3;
            f.a(fn7Var, i3);
            TL_stars.StarGift G = v.G(j);
            if (G != null) {
                zArr[0] = true;
                jn7.f(i2).n(fn7VarArr[0], i3);
                sh9Var.a(G);
                return;
            }
            return;
        }
        boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
        int i4 = starGift.availability_remains;
        if (z) {
            if (i4 <= 0) {
                concat = ob6.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                concat = ob6.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(ob6.H(',', "Gift2QuantityIssued2", starGift.availability_total));
            }
            textView.setText(concat);
            return;
        }
        int i5 = starGift.availability_total;
        if (i4 <= 0) {
            K = ob6.H(',', "Gift2Availability2ValueNone", i5);
        } else {
            K = ob6.K("Gift2Availability4Value", i4, ',', ob6.E(i5, ','));
        }
        textView.setText(K);
    }

    public static void D0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new sya(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
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
                spannableStringBuilder.append((CharSequence) str.concat(ob6.E(Math.abs(starsAmount.amount / 1000000000), c)));
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
                spannableStringBuilder.append((CharSequence) str.concat(ob6.E(Math.abs(j3), c)));
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
                spannableStringBuilder.append((CharSequence) str.concat(ob6.E(Math.abs(j3), c)));
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
                spannableStringBuilder.append((CharSequence) str.concat(ob6.E(Math.abs(j2), c)));
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
                spannableStringBuilder.append((CharSequence) str.concat(ob6.E(Math.abs(j2), c)));
                return spannableStringBuilder;
            } else {
                if (z) {
                    str = "-";
                }
                spannableStringBuilder.append((CharSequence) (str + hl.o0((int) Math.abs(j2), 0)));
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
            spannableStringBuilder.append((CharSequence) str.concat(ob6.E(Math.abs(j2), ',')));
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
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131744741, null));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) ob6.H(',', "Stars", (int) j));
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
        return str.concat(ob6.E(Math.abs(j / 1000000000), ','));
    }

    public static String L0(int i, boolean z, TL_stars.StarsTransaction starsTransaction) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (starsTransaction.stargift_drop_original_details) {
            return ob6.M0(2131744589, null);
        }
        if (starsTransaction.posts_search) {
            return ob6.M0(2131744593, null);
        }
        if (starsTransaction.premium_gift) {
            return ob6.M0(2131744592, null);
        }
        if (starsTransaction.phonegroup_message) {
            if (starsTransaction.reaction) {
                i5 = 2131744601;
            } else {
                i5 = 2131744602;
            }
            return ob6.M0(i5, null);
        } else if (starsTransaction.paid_message) {
            return ob6.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        } else {
            if (starsTransaction.floodskip) {
                return ob6.M0(2131744616, null);
            }
            if (!starsTransaction.extended_media.isEmpty()) {
                return ob6.M0(2131744861, null);
            }
            TL_stars.StarsAmount starsAmount = starsTransaction.amount;
            int i6 = starsTransaction.flags;
            if ((131072 & i6) == 0 && (65536 & i6) != 0) {
                return ob6.a0(null, null, 2131744818, cc.J0(starsTransaction.starref_commission_permille));
            }
            if (starsTransaction.stargift != null) {
                if (starsTransaction.stargift_prepaid_upgrade) {
                    return ob6.M0(2131749876, null);
                }
                boolean z2 = starsTransaction.refund;
                boolean z3 = starsTransaction.stargift_auction_bid;
                if (z2) {
                    if (z3) {
                        i4 = 2131749875;
                    } else if (starsAmount.amount > 0) {
                        if (starsTransaction.stargift_upgrade) {
                            i4 = 2131749872;
                        } else {
                            i4 = 2131749873;
                        }
                    } else {
                        i4 = 2131749874;
                    }
                    return ob6.M0(i4, null);
                }
                if (z3) {
                    i3 = 2131749878;
                } else if (starsAmount.amount > 0) {
                    i3 = 2131749877;
                } else if (starsTransaction.stargift_upgrade) {
                    i3 = 2131749869;
                } else {
                    i3 = 2131749870;
                }
                return ob6.M0(i3, null);
            }
            if (starsTransaction.subscription) {
                int i7 = starsTransaction.subscription_period;
                if (i7 == 2592000) {
                    return ob6.M0(2131744820, null);
                }
                if (i7 == 300) {
                    return "5-minute subscription fee";
                }
                if (i7 == 60) {
                    return "Minute subscription fee";
                }
            }
            if ((i6 & 8192) != 0) {
                return ob6.M0(2131744750, null);
            }
            if (starsTransaction.gift) {
                int i8 = 2131744759;
                if (starsTransaction.sent_by != null) {
                    if (lbc.D(uc7.s1(i).X1(Long.valueOf(wf3.n(starsTransaction.sent_by))))) {
                        i8 = 2131744758;
                    }
                    return ob6.M0(i8, null);
                }
                return ob6.M0(2131744759, null);
            }
            String str = starsTransaction.title;
            if (str != null) {
                return str;
            }
            long n = wf3.n(starsTransaction.peer.peer);
            int i9 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            if (i9 != 0) {
                int i10 = yac.t0;
                if (i9 >= 0) {
                    return lbc.r(uc7.s1(i10).X1(Long.valueOf(n)));
                }
                TLRPC.Chat M0 = uc7.s1(i10).M0(Long.valueOf(-n));
                if (M0 == null) {
                    return "";
                }
                return M0.title;
            }
            TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
            if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                if (!z) {
                    boolean z4 = starsTransaction.refund;
                    TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
                    if (!z4 ? !starsAmount2.negative() : !starsAmount2.positive()) {
                        i2 = 2131744608;
                        return ob6.M0(i2, null);
                    }
                }
                i2 = 2131744578;
                return ob6.M0(i2, null);
            } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                return ob6.M0(2131744618, null);
            } else {
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                    return ob6.M0(2131744619, null);
                }
                return ob6.M0(2131744580, null);
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
        wm2 wm2Var = new wm2(2131231056, 0);
        wm2Var.d = false;
        wm2Var.r = 0.0f;
        wm2Var.s = f2;
        wm2Var.H = f3;
        wm2Var.I = f;
        wm2Var.J = f;
        spannableString.setSpan(wm2Var, 0, spannableString.length() - 1, 33);
        hl.I2(spannableStringBuilder, "💎", "💎️");
        hl.I2(spannableStringBuilder, "💎", "💎 ");
        hl.I2(spannableStringBuilder, spannableString, "💎");
        hl.I2(spannableStringBuilder, "XTR", "XTR ");
        hl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder T0(CharSequence charSequence) {
        return U0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f, wm2[] wm2VarArr) {
        return Y0(false, charSequence, f, wm2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z) {
        return X0(z, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder X0(boolean z, CharSequence charSequence, float f, wm2[] wm2VarArr) {
        return Y0(z, charSequence, f, wm2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Y0(boolean z, CharSequence charSequence, float f, wm2[] wm2VarArr, float f2, float f3) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        wm2 wm2Var;
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
        if (wm2VarArr == null || (wm2Var = wm2VarArr[0]) == null) {
            if (z) {
                i = 2131231961;
            } else {
                i = 2131232312;
            }
            wm2Var = new wm2(i, 0);
            if (wm2VarArr != null) {
                wm2VarArr[0] = wm2Var;
            }
        }
        wm2Var.r = 0.0f;
        wm2Var.s = f2;
        wm2Var.H = f3;
        if (z) {
            wm2Var.d = false;
            float f4 = f * 0.2f;
            wm2Var.I = f4;
            wm2Var.J = f4;
        } else {
            wm2Var.I = f;
            wm2Var.J = f;
        }
        spannableString.setSpan(wm2Var, 0, spannableString.length() - 1, 33);
        hl.I2(spannableStringBuilder, "⭐", "⭐️");
        hl.I2(spannableStringBuilder, "⭐", "⭐ ");
        hl.I2(spannableStringBuilder, spannableString, "⭐");
        hl.I2(spannableStringBuilder, "XTR", "XTR ");
        hl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(boolean z, String str, wm2[] wm2VarArr) {
        wm2 wm2Var;
        int i;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (wm2VarArr == null || (wm2Var = wm2VarArr[0]) == null) {
            if (z) {
                i = 2131231961;
            } else {
                i = 2131232312;
            }
            wm2Var = new wm2(i, 0);
            if (z) {
                f = 0.222f;
            } else {
                f = 1.13f;
            }
            wm2Var.I = f;
            wm2Var.J = f;
        }
        if (z) {
            wm2Var.d = false;
        }
        if (wm2VarArr != null) {
            wm2VarArr[0] = wm2Var;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(wm2Var, 0, spannableString.length() - 1, 33);
        hl.I2(spannableStringBuilder, "⭐", "⭐️");
        hl.I2(spannableStringBuilder, "⭐", "⭐ ");
        hl.I2(spannableStringBuilder, spannableString, "⭐");
        hl.I2(spannableStringBuilder, "XTR", "XTR ");
        hl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a1(TL_stars.StarsAmount starsAmount, String str, wm2[] wm2VarArr) {
        return b1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, wm2VarArr);
    }

    public static android.text.SpannableStringBuilder b1(boolean r5, java.lang.CharSequence r6, float r7, defpackage.wm2[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nza.b1(boolean, java.lang.CharSequence, float, wm2[]):android.text.SpannableStringBuilder");
    }

    public static gya c1(de0 de0Var, ImageReceiver imageReceiver, String str, boolean z) {
        int i;
        int i2 = imageReceiver.d;
        final hk3 hk3Var = new hk3(z, i2, str, imageReceiver, new boolean[1]);
        hk3Var.run();
        jn7 f = jn7.f(i2);
        if (z) {
            i = jn7.Z2;
        } else {
            i = jn7.Y2;
        }
        return new gya(f.h(de0Var, i, new pcc() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                hk3 hk3Var2 = hk3Var;
                Object[] objArr = (Object[]) obj;
                switch (b) {
                    case 0:
                        hk3Var2.run();
                        return;
                    default:
                        hk3Var2.run();
                        return;
                }
            }
        }), jn7.f(i2).h(de0Var, jn7.y0, new pcc() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                hk3 hk3Var2 = hk3Var;
                Object[] objArr = (Object[]) obj;
                switch (b) {
                    case 0:
                        hk3Var2.run();
                        return;
                    default:
                        hk3Var2.run();
                        return;
                }
            }
        }), (byte) 0);
    }

    public static void d1(de0 de0Var, ImageReceiver imageReceiver, long j) {
        String str;
        if (j <= 1000) {
            str = "2⃣";
        } else if (j < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        c1(de0Var, imageReceiver, str, false);
    }

    public static void e1(ImageReceiver imageReceiver, TLRPC.Document document, int i) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w = xb4.w(document.thumbs, i, false, null, false);
        imageReceiver.Z(jn5.b(document), qd4.m(i, i, "_"), jn5.c(w, document), qd4.m(i, i, "_"), lp3.d(document.thumbs, aob.a7, 0.35f, false), 0L, null, null, 0);
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

    public static gya g1(de0 de0Var, ImageReceiver imageReceiver, int i) {
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
        return c1(de0Var, imageReceiver, str, false);
    }

    public static void h1(de0 de0Var, ImageReceiver imageReceiver, long j) {
        String str;
        if (j <= 10000000000L) {
            str = "2⃣";
        } else if (j <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        c1(de0Var, imageReceiver, str, true);
    }

    public static void i1(Context context, int i, long j, TL_stories.Boost boost, vnb vnbVar) {
        int i2;
        if (context == null) {
            return;
        }
        nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout j2 = uh9.j(context, 1);
        j2.setPadding(0, hl.L(20.0f), 0, hl.L(4.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j2.addView(frameLayout, tre.t(-1, 150, 7, 0, 0, 0, 10));
        uya uyaVar = new uya(context, 70, 0);
        frameLayout.addView(uyaVar, tre.c(-1.0f, -1));
        it4 it4Var = new it4(context, 1, 2);
        ys4 ys4Var = it4Var.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        it4Var.setStarParticlesView(uyaVar);
        frameLayout.addView(it4Var, tre.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        it4Var.setPaused(false);
        TextView textView = new TextView(context);
        qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
        textView.setGravity(17);
        nx0[] nx0VarArr = new nx0[1];
        textView.setText(ob6.H(' ', "BoostStars", (int) boost.stars));
        TextView m = ik8.m(j2, textView, tre.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setBackground(aob.b0(hl.L(20.0f), -6915073));
        m.setTextColor(-1);
        m.setTextSize(1, 11.33f);
        m.setPadding(hl.L(4.0f), 0, hl.L(8.33f), 0);
        m.setGravity(17);
        m.setTypeface(hl.o());
        int i3 = boost.multiplier;
        if (i3 == 0) {
            i3 = 1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x".concat(ob6.H(' ', "BoostingBoostsCount", i3)));
        wm2 wm2Var = new wm2(2131231932, 2);
        wm2Var.r = 0.0f;
        wm2Var.s = hl.L(0.66f);
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
        m.setText(spannableStringBuilder);
        j2.addView(m, tre.t(-2, 20, 17, 20, 4, 20, 4));
        hjb hjbVar = new hjb(context, vnbVar);
        hjbVar.n(ob6.M0(2131753620, null), i, j, new rxa(nx0VarArr, j, (byte) 6));
        hjbVar.f(ob6.M0(2131753619, null), ob6.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = ob6.M0(2131753608, null);
            String M02 = ob6.M0(2131753607, null);
            i2 = 1;
            cq6 cq6Var = new cq6(nx0VarArr, j, boost, (byte) 28);
            nx0VarArr = nx0VarArr;
            hjbVar.i(M0, M02, cq6Var);
        } else {
            i2 = 1;
        }
        String M03 = ob6.M0(2131753655, null);
        String format = ob6.D0().r0().format(new Date(boost.date * 1000));
        String format2 = ob6.D0().o0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[0] = format;
        objArr[i2] = format2;
        hjbVar.f(M03, ob6.a0(null, null, 2131742414, objArr), null, null);
        String M04 = ob6.M0(2131753600, null);
        String format3 = ob6.D0().r0().format(new Date(boost.expires * 1000));
        String format4 = ob6.D0().o0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[0] = format3;
        objArr2[i2] = format4;
        hjbVar.f(M04, ob6.a0(null, null, 2131742414, objArr2), null, null);
        j2.addView(hjbVar, tre.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        p66 p66Var = new p66(context, vnbVar);
        yob.X(p66Var, aob.z6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        p66Var.setTextSize(i2, 14.0f);
        p66Var.setText(hl.N2(ob6.M0(2131744583, null), -1, 0, new xf1(context, (byte) 17), null));
        p66Var.setGravity(17);
        j2.addView(p66Var, tre.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.i(ob6.M0(2131747558, null), false, true);
        c51Var.setOnClickListener(new g5(nx0VarArr, (byte) 5));
        j2.addView(c51Var, tre.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        h.O = j2;
        nx0VarArr[0] = h;
        h.T0 = false;
        h.J();
        e S = LaunchActivity.S();
        if (!hl.O1() && !hl.s1(S)) {
            nx0VarArr[0].X(S);
        }
        it4Var.setPaused(false);
        nx0VarArr[0].show();
        nx0VarArr[0].n(new uoa(it4Var, (byte) 11));
    }

    public static h4a j1(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, icc iccVar, vnb vnbVar) {
        oj resellAmount;
        pj pjVar = pj.a;
        if (tL_starGiftUnique == null) {
            resellAmount = oj.h(uc7.s1(i).l4.o.f(), pjVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(pj.b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(pjVar);
        }
        h4a h4aVar = new h4a(context, vnbVar, i, resellAmount, new ku9(iccVar, r8, (byte) 12));
        h4a[] h4aVarArr = {h4aVar};
        h4aVar.show();
        return h4aVarArr[0];
    }

    public static void k1(Context context, long j, boolean z, final icc iccVar, vnb vnbVar) {
        int i;
        int i2;
        CharSequence l;
        nx0[] nx0VarArr;
        long j2;
        boolean z2 = false;
        nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        c51 c51Var = null;
        textView.setText(ob6.M0(2131747459, null));
        textView.setTextSize(1, 20.0f);
        int i3 = aob.G6;
        yob.X(textView, i3, vnbVar);
        linearLayout.addView(textView, tre.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        lu7 lu7Var = new lu7(context, vnbVar);
        lu7Var.setForceForceUseCenter(true);
        lu7Var.setText(ob6.M0(2131747460, null));
        lu7Var.setLeftPadding(hl.L(36.0f));
        yob.X(editTextBoldCursor, i3, vnbVar);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = hl.L(16.0f);
        editTextBoldCursor.setPadding(hl.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        yob.C(editTextBoldCursor, aob.lg, vnbVar);
        yob.l(editTextBoldCursor, 36, aob.mg, vnbVar);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor.setGravity(i);
        editTextBoldCursor.setOnFocusChangeListener(new rt0(lu7Var, editTextBoldCursor, (byte) 2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232775);
        linearLayout2.addView(imageView, tre.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, tre.p(-1, -2, 1.0f, 119));
        lu7Var.e(editTextBoldCursor);
        lu7Var.addView(linearLayout2, tre.e(-1, -2, 48));
        linearLayout.addView(lu7Var, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        yob.X(textView2, aob.A6, null);
        lu7Var.addView(textView2, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        p66 p66Var = new p66(context, null);
        p66Var.setText(hl.D2(hl.N2(ob6.M0(2131747462, null), -1, 0, new xf1(context, (byte) 18), null), true));
        p66Var.setTextSize(1, 12.0f);
        yob.X(p66Var, aob.z6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        linearLayout.addView(p66Var, tre.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final c51 i4 = xnb.i(24, vnbVar, context, true);
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i5 > 0) {
            i2 = 2131747458;
        } else {
            i2 = 2131747464;
        }
        i4.i(ob6.M0(i2, null), false, true);
        linearLayout.addView(i4, tre.o(-1, 48));
        if (i5 > 0 && z) {
            c51 i6 = xnb.i(24, vnbVar, context, false);
            i6.i(ob6.M0(2131747463, null), false, false);
            linearLayout.addView(i6, tre.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            c51Var = i6;
        }
        h.O = linearLayout;
        final nx0[] nx0VarArr2 = {h};
        if (i5 <= 0) {
            l = "";
        } else {
            l = Long.toString(j);
        }
        editTextBoldCursor.setText(l);
        editTextBoldCursor.addTextChangedListener(new tya(editTextBoldCursor, lu7Var, j, z, i4, textView2));
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
                iccVar.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new aya(editTextBoldCursor2, nx0VarArr2, (byte) 1));
                return true;
            }
        });
        yxa yxaVar = new yxa(zArr, iccVar, editTextBoldCursor, i4, nx0VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        i4.setOnClickListener(yxaVar);
        if (c51Var != null) {
            c51 c51Var2 = c51Var;
            yxa yxaVar2 = new yxa(zArr, iccVar, c51Var2, editTextBoldCursor2, nx0VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            nx0VarArr = nx0VarArr2;
            c51Var2.setOnClickListener(yxaVar2);
        } else {
            nx0VarArr = nx0VarArr2;
        }
        nx0VarArr[0].J();
        nx0VarArr[0].setOnDismissListener(new fe4(editTextBoldCursor2, (byte) 3));
        nx0VarArr[0].show();
        e Q = LaunchActivity.Q();
        if (Q instanceof zu1) {
            z2 = ((zu1) Q).fa();
        }
        aya ayaVar = new aya(nx0VarArr, editTextBoldCursor2);
        if (z2) {
            j2 = 200;
        } else {
            j2 = 80;
        }
        hl.d3(ayaVar, j2);
    }

    public static defpackage.nx0 l1(final android.content.Context r61, final boolean r62, final long r63, final int r65, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r66, final defpackage.vnb r67) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nza.l1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, vnb):nx0");
    }

    public static void m1(Activity activity, int i, int i2, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, vnb vnbVar) {
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
        l1(activity, false, 0L, i, starsTransaction, vnbVar);
    }

    public static void n1(Context context, int i, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, vnb vnbVar) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = uc7.s1(i).y1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        l1(context, false, 0L, i, starsTransaction, vnbVar);
    }

    public static CharSequence t1(CharSequence charSequence, boolean z) {
        wm2[] wm2VarArr;
        rdc c;
        if (z && (charSequence instanceof Spanned)) {
            for (wm2 wm2Var : (wm2[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), wm2.class)) {
                Drawable drawable = wm2Var.c;
                if (drawable != null && !(drawable instanceof rdc) && (c = rdc.c(a.b.getResources(), 2131231962, null)) != null) {
                    c.setBounds(wm2Var.c.getBounds());
                    wm2Var.c = c;
                    wm2Var.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void E0() {
        r1();
        d79 d79Var = this.c;
        if (d79Var != null && this.V != null && d79Var.getLayoutParams() != null) {
            int y = c00.y(48.0f, this.c0, -hl.L(8.0f));
            int y2 = c00.y(48.0f, this.d0, -hl.L(8.0f));
            hl.v3(this.c, 0, y, 0, y2);
            d79 d79Var2 = this.c;
            int i = -y;
            d79Var2.setPadding(d79Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - y2);
            this.V.A(i, -y2);
        }
    }

    public final void F0(ArrayList arrayList, l9c l9cVar) {
        boolean z;
        d79 d79Var;
        int i;
        o1("FILL_BEFORE");
        wka wkaVar = this.V;
        if (wkaVar != null && wkaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        jxa v = jxa.v(this.currentAccount, false);
        b8c b8cVar = new b8c(-2);
        b8cVar.c = (tb) super.n0(getParentActivity());
        arrayList.add(b8cVar);
        arrayList.add(b8c.k(this.j0));
        c51 c51Var = this.s0;
        if (c51Var != null) {
            if (getMessagesController().l4.E2.f) {
                i = 0;
            } else {
                i = 8;
            }
            c51Var.setVisibility(i);
        }
        arrayList.add(b8c.C(null));
        if (getMessagesController().l4.K2.f) {
            arrayList.add(yb.i(-4, getThemedColor(aob.lk), g92.a0(ob6.M0(2131743421, null)), ob6.M0(2131743422, null)));
            arrayList.add(b8c.C(null));
        }
        if (v.e && !v.v.isEmpty()) {
            bp1.o(2131744860, null, arrayList);
            for (int i2 = 0; i2 < v.v.size(); i2++) {
                int i3 = fza.b;
                b8c K = b8c.K(fza.class);
                K.H = (TL_stars.StarsSubscription) v.v.get(i2);
                arrayList.add(K);
            }
            if (v.x) {
                arrayList.add(b8c.q(arrayList.size(), 33));
            } else if (!v.y) {
                b8c c = b8c.c(-3, 2131230871, ob6.M0(2131744859, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(b8c.C(null));
        }
        boolean K2 = v.K(0);
        this.t0 = K2;
        if (K2) {
            this.b0 = arrayList.size();
            arrayList.add(b8c.n(this.W, -2));
            if (z && (d79Var = this.c) != null) {
                d79Var.removeCallbacks(this.g0);
                this.c.post(this.g0);
            }
        } else {
            arrayList.add(b8c.m(this.h0));
        }
        o1("FILL_AFTER");
    }

    public final void M0(int r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nza.M0(int):void");
    }

    public final void N0(Context context) {
        if (uc7.s1(this.currentAccount).x2()) {
            i5.b(this.currentAccount);
        } else {
            new eza(context, this.resourceProvider).show();
        }
    }

    public final void O0(Context context) {
        new eza(context, this.resourceProvider).show();
    }

    public final void P0() {
        jxa.v(this.currentAccount, false).r();
        bx4.g1(true, pj0.a(this.currentAccount).b());
    }

    public final void Q0(b8c b8cVar, Boolean bool, String str) {
        if (getParentActivity() != null) {
            if (bool.booleanValue()) {
                d31.b0(this).I(2131624221, ob6.M0(2131744816, null), hl.S2(ob6.G((int) b8cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                this.i0.c(true);
                jxa.v(this.currentAccount, false).Q(true);
            } else if (str != null) {
                d31.b0(this).Q(2131624012, 36, ob6.a0(null, null, 2131743533, str)).j();
            }
        }
    }

    @Override
    public final View createView(final Context context) {
        boolean z;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i;
        this.H = false;
        this.F = hl.L(238.0f);
        wka wkaVar = new wka(context);
        this.V = wkaVar;
        boolean z2 = true;
        wkaVar.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
                i = 0;
            } else {
                i = hl.m;
            }
            this.c0 = i;
            this.d0 = hl.n;
        }
        this.V.setGeometry(new ve9(this, (byte) 12));
        this.V.A(-c00.y(48.0f, this.c0, -hl.L(8.0f)), -c00.y(48.0f, this.d0, -hl.L(8.0f)));
        wka wkaVar2 = this.V;
        wkaVar2.getClass();
        this.W = new nf9((byte) 7, context, wkaVar2);
        this.U = new mza(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new nf9((byte) 9, context, this);
        super.createView(context);
        l15 l15Var = this.s;
        getBaseSimpleGlass().h(l15Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new dg0(this, new kya(l15Var, (byte) 0), (byte) 9);
        FrameLayout frameLayout = this.U.d;
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        wka wkaVar3 = this.V;
        wkaVar3.addView(this.X, wkaVar3.indexOfChild(frameLayout), tre.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        nxa nxaVar = new nxa(this, (byte) 0);
        k43 k43Var = k43.h;
        fm0 fm0Var = new fm0(0, nxaVar, k43Var, 380L, false);
        this.Y = fm0Var;
        this.Z = new fm0(1, new nxa(this, (byte) 1), k43Var, 380L, false);
        this.a0 = new fm0(2, new nxa(this, (byte) 2), k43Var, 380L, false);
        if (!this.c.canScrollVertically(-1) && !this.simpleActionBar.z()) {
            z = false;
        } else {
            z = true;
        }
        fm0Var.a(z, false);
        this.Z.a(this.V.f0, false);
        this.c.j(new e98(this, (byte) 26));
        r1();
        jl0 c = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c.p(dtd.l(this.resourceProvider));
        c.q(hl.L(9.66f));
        c.r(hl.L(18.0f));
        frameLayout.setBackground(c);
        wk5 wk5Var2 = this.parentLayout;
        if (wk5Var2 != null && ((ActionBarLayout) wk5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        frameLayout2.setClickable(true);
        it4 it4Var = new it4(context, 1, 2);
        this.T = it4Var;
        ys4 ys4Var = it4Var.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, tre.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        i0(ob6.M0(2131743868, null), hl.D2(hl.N2(ob6.M0(2131743865, null), -1, 0, new xf1(context, (byte) 15), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43Var);
        zb3Var.n(350L);
        this.c.setItemAnimator(zb3Var);
        this.c.setOnItemClickListener(new t39(this, (byte) 11));
        tj4 tj4Var = new tj4(getParentActivity());
        this.i0 = tj4Var;
        this.s.addView(tj4Var, tre.c(-1.0f, -1));
        jxa v = jxa.v(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, hl.L(24.0f), 0, hl.L(10.0f));
        in inVar = new in(getParentActivity(), false, true, false);
        this.l0 = inVar;
        inVar.setTypeface(hl.o());
        this.l0.setTextSize(hl.L(32.0f));
        this.l0.setGravity(17);
        yob.U(this.l0, aob.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        rn5 rn5Var = new rn5(42.0f, this.currentAccount, this.l0);
        b29 b29Var = new b29(2131624212, hl.L(42.0f), hl.L(42.0f));
        ImageReceiver imageReceiver = rn5Var.b;
        imageReceiver.g0(b29Var);
        imageReceiver.M(2);
        rn5Var.f = false;
        rn5Var.h = -hl.L(3.0f);
        this.k0.setSpan(rn5Var, 0, 1, 33);
        this.j0.addView(this.l0, tre.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(ob6.M0(2131742421, null));
        yob.X(this.m0, aob.z6, this.resourceProvider);
        this.j0.addView(this.m0, tre.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        d26 d26Var = new d26((byte) 27, getParentActivity(), this);
        this.o0 = d26Var;
        frameLayout3.addView(d26Var);
        c51 c51Var = new c51(this.resourceProvider, getParentActivity(), true);
        this.p0 = c51Var;
        c51Var.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) {
            public final nza b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                Context context2 = context;
                nza nzaVar = this.b;
                switch (b) {
                    case 0:
                        nzaVar.N0(context2);
                        return;
                    default:
                        nzaVar.O0(context2);
                        return;
                }
            }
        });
        this.o0.addView(this.p0, tre.e(-1, 48, 119));
        oob oobVar = new oob((byte) 19, getParentActivity(), this);
        this.q0 = oobVar;
        frameLayout3.addView(oobVar);
        c51 c51Var2 = new c51(this.resourceProvider, getParentActivity(), true);
        this.r0 = c51Var2;
        c51Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wm2(2131231981, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) ob6.M0(2131744622, null));
        this.r0.i(spannableStringBuilder, false, true);
        this.r0.setOnClickListener(new View.OnClickListener(this) {
            public final nza b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                Context context2 = context;
                nza nzaVar = this.b;
                switch (b) {
                    case 0:
                        nzaVar.N0(context2);
                        return;
                    default:
                        nzaVar.O0(context2);
                        return;
                }
            }
        });
        this.q0.addView(this.r0, tre.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        c51 c51Var3 = new c51(this.resourceProvider, getParentActivity(), true);
        this.n0 = c51Var3;
        c51Var3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wm2(2131231977, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) ob6.M0(2131744679, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) {
            public final nza b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                nza nzaVar = this.b;
                switch (b) {
                    case 0:
                        nzaVar.presentFragment(new at0(0, nzaVar.getUserConfig().e()));
                        return;
                    default:
                        nzaVar.P0();
                        return;
                }
            }
        });
        this.q0.addView(this.n0, tre.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout3, tre.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        c51 c51Var4 = new c51(this.resourceProvider, getParentActivity(), false);
        this.s0 = c51Var4;
        c51Var4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new wm2(2131231895, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) ob6.M0(2131743866, null));
        this.s0.i(spannableStringBuilder3, false, true);
        this.s0.setOnClickListener(new View.OnClickListener(this) {
            public final nza b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                nza nzaVar = this.b;
                switch (b) {
                    case 0:
                        nzaVar.presentFragment(new at0(0, nzaVar.getUserConfig().e()));
                        return;
                    default:
                        nzaVar.P0();
                        return;
                }
            }
        });
        this.j0.addView(this.s0, tre.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        p1();
        wb wbVar = this.v0;
        if (wbVar != null) {
            wbVar.O(false);
        }
        kt0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = kt0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (v.m().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z2 = false;
        }
        q1(z2, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.x3;
        int i4 = jn7.C3;
        int i5 = jn7.B3;
        if (i == i5 || i == i4 || i == i3) {
            o1("NOTIFICATION_" + i);
        }
        if (i == i3) {
            t0();
            wb wbVar = this.v0;
            if (wbVar != null) {
                wbVar.O(true);
            }
            g0();
        } else if (i == i5) {
            jxa v = jxa.v(this.currentAccount, false);
            if (this.t0 != v.K(0)) {
                this.t0 = v.K(0);
                t0();
                wb wbVar2 = this.v0;
                if (wbVar2 != null) {
                    wbVar2.O(false);
                }
                g0();
            }
        } else if (i == i4) {
            wb wbVar3 = this.v0;
            if (wbVar3 != null) {
                wbVar3.O(true);
            }
        } else if (i == jn7.A3) {
            p1();
        } else if (i == jn7.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            p1();
        }
    }

    @Override
    public final void g0() {
        wka wkaVar;
        o1("RESTORE_BEFORE");
        super.g0();
        if (this.f0 && (wkaVar = this.V) != null && this.b0 != -1) {
            wkaVar.a();
        }
        this.f0 = false;
        o1("RESTORE_AFTER");
    }

    @Override
    public final void h0() {
        this.s.addView(this.V, tre.c(-1.0f, -1));
        this.V.v(this.c, new nxa(this, (byte) 3));
        wka wkaVar = this.V;
        mza mzaVar = this.U;
        wkaVar.y(mzaVar, mzaVar.b, new bya((byte) 0));
        this.V.z(this.U.d);
        this.U.d.setLayoutParams(tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        E0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        wka wkaVar = this.V;
        if (wkaVar == null || motionEvent == null || wkaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final j79 j0() {
        wb wbVar = new wb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new hj8(this, (byte) 24), getResourceProvider(), (byte) 4);
        this.v0 = wbVar;
        wbVar.r = false;
        return wbVar;
    }

    @Override
    public final x46 k0(Context context) {
        wka wkaVar = this.V;
        wkaVar.getClass();
        return new of2((Object) wkaVar, (byte) 5);
    }

    @Override
    public final eva l0() {
        return new uya(getParentActivity(), 75, 1);
    }

    @Override
    public final View n0(Context context) {
        throw null;
    }

    public final void o1(String str) {
        boolean z;
        int top;
        if (this.V != null) {
            StringBuilder p = ik8.p("Stars event=", str, " row=");
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
            nf9 nf9Var = this.W;
            int i = 0;
            if (nf9Var != null && nf9Var.getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            p.append(z);
            p.append(" boundaryTop=");
            nf9 nf9Var2 = this.W;
            if (nf9Var2 == null) {
                top = 0;
            } else {
                top = nf9Var2.getTop();
            }
            p.append(top);
            p.append(" boundaryHeight=");
            nf9 nf9Var3 = this.W;
            if (nf9Var3 != null) {
                i = nf9Var3.getHeight();
            }
            p.append(i);
            Log.d("SiblingScroll", p.toString());
            wka wkaVar = this.V;
            if (!wkaVar.a) {
                return;
            }
            wkaVar.b = Math.max(wkaVar.b, 30);
            wkaVar.f(str, null, 0, 0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.x3);
        jn7.f(this.currentAccount).b(this, jn7.A3);
        jn7.f(this.currentAccount).b(this, jn7.B3);
        jn7.f(this.currentAccount).b(this, jn7.C3);
        jn7.f(this.currentAccount).b(this, jn7.E3);
        jxa.v(this.currentAccount, false).Q(true);
        jxa.v(this.currentAccount, false).P();
        jxa.v(this.currentAccount, false).w();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        d79 d79Var = this.c;
        if (d79Var != null) {
            d79Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.x3);
        jn7.f(this.currentAccount).n(this, jn7.A3);
        jn7.f(this.currentAccount).n(this, jn7.B3);
        jn7.f(this.currentAccount).n(this, jn7.C3);
        jn7.f(this.currentAccount).n(this, jn7.E3);
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
        it4 it4Var = this.T;
        if (it4Var != null) {
            it4Var.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        it4 it4Var = this.T;
        if (it4Var != null) {
            it4Var.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override
    public final float p0() {
        d79 d79Var = this.c;
        if (d79Var == null) {
            return 0.0f;
        }
        return d79Var.getY();
    }

    public final void p1() {
        int i;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = false;
        jxa v = jxa.v(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) H0(v.m(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        c51 c51Var = this.p0;
        if (v.m().amount > 0) {
            i = 2131744807;
        } else {
            i = 2131744808;
        }
        c51Var.i(ob6.M0(i, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = kt0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z = true;
        }
        q1(z, true);
    }

    @Override
    public final View q0() {
        return this.V;
    }

    public final void q1(final boolean z, boolean z2) {
        float f;
        int i;
        float f2;
        this.u0 = z;
        d26 d26Var = this.o0;
        float f3 = 1.0f;
        int i2 = 0;
        if (z2) {
            d26Var.setVisibility(0);
            this.q0.setVisibility(0);
            ViewPropertyAnimator animate = this.o0.animate();
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            animate.alpha(f2).withEndAction(new Runnable(this) {
                public final nza b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z3 = z;
                    nza nzaVar = this.b;
                    switch (b) {
                        case 0:
                            if (z3) {
                                nzaVar.o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z3) {
                                nzaVar.q0.setVisibility(8);
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
                public final nza b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z3 = z;
                    nza nzaVar = this.b;
                    switch (b) {
                        case 0:
                            if (z3) {
                                nzaVar.o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z3) {
                                nzaVar.q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        d26Var.animate().cancel();
        this.q0.animate().cancel();
        oob oobVar = this.q0;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        oobVar.setAlpha(f);
        d26 d26Var2 = this.o0;
        if (z) {
            f3 = 0.0f;
        }
        d26Var2.setAlpha(f3);
        oob oobVar2 = this.q0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        oobVar2.setVisibility(i);
        d26 d26Var3 = this.o0;
        if (z) {
            i2 = 8;
        }
        d26Var3.setVisibility(i2);
    }

    @Override
    public final void r0(boolean z) {
        fm0 fm0Var = this.a0;
        if (fm0Var != null && fm0Var.f != z) {
            fm0Var.a(z, true);
        }
    }

    public final void r1() {
        if (this.X == null) {
            return;
        }
        int L = hl.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        s1();
    }

    public final void s1() {
        float f;
        View view = this.X;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.Y;
        float f2 = 0.0f;
        if (fm0Var == null) {
            f = 0.0f;
        } else {
            f = fm0Var.e;
        }
        fm0 fm0Var2 = this.Z;
        if (fm0Var2 != null) {
            f2 = fm0Var2.e;
        }
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - f2) * hl.L(44.0f)));
    }

    @Override
    public final void t0() {
        boolean z;
        o1("SAVE_BEFORE");
        super.t0();
        wka wkaVar = this.V;
        if (wkaVar != null && wkaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.f0 = z;
        d79 d79Var = this.c;
        if (d79Var != null && this.Q >= 0) {
            this.R -= d79Var.getPaddingTop();
        }
        o1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
