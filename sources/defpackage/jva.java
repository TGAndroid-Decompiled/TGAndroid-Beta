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
public final class jva extends iz4 implements gk7 {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public er4 T;
    public iva U;
    public dha V;
    public si9 W;
    public View X;
    public fm0 Y;
    public fm0 Z;
    public fm0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public si9 h0;
    public qh4 i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public hn l0;
    public TextView m0;
    public u41 n0;
    public oc6 o0;
    public u41 p0;
    public pkb q0;
    public u41 r0;
    public u41 s0;
    public boolean t0;
    public boolean u0;
    public vb v0;
    public int b0 = -1;
    public final z6a g0 = new z6a(this, (byte) 23);

    public jva() {
        this.N = true;
    }

    public static void B0(mfb mfbVar, int i, TL_stars.StarGift starGift, wjb wjbVar) {
        CharSequence K;
        CharSequence concat;
        TextView textView = (TextView) ((jfb) mfbVar.f(k96.M0(2131750284, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        u86 u86Var = new u86(textView, gl.L(90.0f), 0, wjbVar);
        u86Var.a(bkb.p1(0.21f, textView.getPaint().getColor()), bkb.p1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(u86Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final gta v = gta.v(i, false);
            final long j = starGift.id;
            final ae9 ae9Var = new ae9(textView, (byte) 12);
            final boolean[] zArr = {false};
            final gk7[] gk7VarArr = {new gk7() {
                @Override
                public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                    int i4;
                    gta gtaVar;
                    TL_stars.StarGift G;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i2 == (i4 = kk7.G3) && (G = (gtaVar = gta.this).G(j)) != null) {
                        zArr2[0] = true;
                        kk7.f(gtaVar.a).n(gk7VarArr[0], i4);
                        ae9Var.a(G);
                    }
                }
            }};
            int i2 = v.a;
            kk7 f = kk7.f(i2);
            gk7 gk7Var = gk7VarArr[0];
            int i3 = kk7.G3;
            f.a(gk7Var, i3);
            TL_stars.StarGift G = v.G(j);
            if (G != null) {
                zArr[0] = true;
                kk7.f(i2).n(gk7VarArr[0], i3);
                ae9Var.a(G);
                return;
            }
            return;
        }
        boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
        int i4 = starGift.availability_remains;
        if (z) {
            if (i4 <= 0) {
                concat = k96.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                concat = k96.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(k96.H(',', "Gift2QuantityIssued2", starGift.availability_total));
            }
            textView.setText(concat);
            return;
        }
        int i5 = starGift.availability_total;
        if (i4 <= 0) {
            K = k96.H(',', "Gift2Availability2ValueNone", i5);
        } else {
            K = k96.K("Gift2Availability4Value", i4, ',', k96.E(i5, ','));
        }
        textView.setText(K);
    }

    public static void C0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new oua(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder F0(TL_stars.StarsAmount starsAmount) {
        return G0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder G0(TL_stars.StarsAmount starsAmount, float f, char c) {
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
                spannableStringBuilder.append((CharSequence) str.concat(k96.E(Math.abs(starsAmount.amount / 1000000000), c)));
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
                spannableStringBuilder.append((CharSequence) str.concat(k96.E(Math.abs(j3), c)));
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
                spannableStringBuilder.append((CharSequence) str.concat(k96.E(Math.abs(j3), c)));
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder H0(TL_stars.StarsAmount starsAmount, float f, char c) {
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
                spannableStringBuilder.append((CharSequence) str.concat(k96.E(Math.abs(j2), c)));
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
                spannableStringBuilder.append((CharSequence) str.concat(k96.E(Math.abs(j2), c)));
                return spannableStringBuilder;
            } else {
                if (z) {
                    str = "-";
                }
                spannableStringBuilder.append((CharSequence) (str + gl.o0((int) Math.abs(j2), 0)));
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
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
            spannableStringBuilder.append((CharSequence) str.concat(k96.E(Math.abs(j2), ',')));
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
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131744847, null));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) k96.H(',', "Stars", (int) j));
        return spannableStringBuilder;
    }

    public static String J0(long j) {
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
        return str.concat(k96.E(Math.abs(j / 1000000000), ','));
    }

    public static String K0(int i, boolean z, TL_stars.StarsTransaction starsTransaction) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (starsTransaction.stargift_drop_original_details) {
            return k96.M0(2131744695, null);
        }
        if (starsTransaction.posts_search) {
            return k96.M0(2131744699, null);
        }
        if (starsTransaction.premium_gift) {
            return k96.M0(2131744698, null);
        }
        if (starsTransaction.phonegroup_message) {
            if (starsTransaction.reaction) {
                i5 = 2131744707;
            } else {
                i5 = 2131744708;
            }
            return k96.M0(i5, null);
        } else if (starsTransaction.paid_message) {
            return k96.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        } else {
            if (starsTransaction.floodskip) {
                return k96.M0(2131744722, null);
            }
            if (!starsTransaction.extended_media.isEmpty()) {
                return k96.M0(2131744967, null);
            }
            TL_stars.StarsAmount starsAmount = starsTransaction.amount;
            int i6 = starsTransaction.flags;
            if ((131072 & i6) == 0 && (65536 & i6) != 0) {
                return k96.a0(null, null, 2131744924, bc.I0(starsTransaction.starref_commission_permille));
            }
            if (starsTransaction.stargift != null) {
                if (starsTransaction.stargift_prepaid_upgrade) {
                    return k96.M0(2131749914, null);
                }
                boolean z2 = starsTransaction.refund;
                boolean z3 = starsTransaction.stargift_auction_bid;
                if (z2) {
                    if (z3) {
                        i4 = 2131749913;
                    } else if (starsAmount.amount > 0) {
                        if (starsTransaction.stargift_upgrade) {
                            i4 = 2131749910;
                        } else {
                            i4 = 2131749911;
                        }
                    } else {
                        i4 = 2131749912;
                    }
                    return k96.M0(i4, null);
                }
                if (z3) {
                    i3 = 2131749916;
                } else if (starsAmount.amount > 0) {
                    i3 = 2131749915;
                } else if (starsTransaction.stargift_upgrade) {
                    i3 = 2131749907;
                } else {
                    i3 = 2131749908;
                }
                return k96.M0(i3, null);
            }
            if (starsTransaction.subscription) {
                int i7 = starsTransaction.subscription_period;
                if (i7 == 2592000) {
                    return k96.M0(2131744926, null);
                }
                if (i7 == 300) {
                    return "5-minute subscription fee";
                }
                if (i7 == 60) {
                    return "Minute subscription fee";
                }
            }
            if ((i6 & 8192) != 0) {
                return k96.M0(2131744856, null);
            }
            if (starsTransaction.gift) {
                int i8 = 2131744865;
                if (starsTransaction.sent_by != null) {
                    if (l7c.C(na7.q1(i).V1(Long.valueOf(cf3.n(starsTransaction.sent_by))))) {
                        i8 = 2131744864;
                    }
                    return k96.M0(i8, null);
                }
                return k96.M0(2131744865, null);
            }
            String str = starsTransaction.title;
            if (str != null) {
                return str;
            }
            long n = cf3.n(starsTransaction.peer.peer);
            int i9 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            if (i9 != 0) {
                int i10 = y6c.t0;
                if (i9 >= 0) {
                    return l7c.q(na7.q1(i10).V1(Long.valueOf(n)));
                }
                TLRPC.Chat K0 = na7.q1(i10).K0(Long.valueOf(-n));
                if (K0 == null) {
                    return "";
                }
                return K0.title;
            }
            TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
            if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                if (!z) {
                    boolean z4 = starsTransaction.refund;
                    TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
                    if (!z4 ? !starsAmount2.negative() : !starsAmount2.positive()) {
                        i2 = 2131744714;
                        return k96.M0(i2, null);
                    }
                }
                i2 = 2131744684;
                return k96.M0(i2, null);
            } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                return k96.M0(2131744724, null);
            } else {
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                    return k96.M0(2131744725, null);
                }
                return k96.M0(2131744686, null);
            }
        }
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f) {
        return R0(charSequence, f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f, float f2, float f3) {
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
        cm2 cm2Var = new cm2(2131231056, 0);
        cm2Var.d = false;
        cm2Var.r = 0.0f;
        cm2Var.s = f2;
        cm2Var.H = f3;
        cm2Var.I = f;
        cm2Var.J = f;
        spannableString.setSpan(cm2Var, 0, spannableString.length() - 1, 33);
        gl.J2(spannableStringBuilder, "💎", "💎️");
        gl.J2(spannableStringBuilder, "💎", "💎 ");
        gl.J2(spannableStringBuilder, spannableString, "💎");
        gl.J2(spannableStringBuilder, "XTR", "XTR ");
        gl.J2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder S0(CharSequence charSequence) {
        return T0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, float f, cm2[] cm2VarArr) {
        return X0(false, charSequence, f, cm2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, boolean z) {
        return W0(z, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder V0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return W0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder W0(boolean z, CharSequence charSequence, float f, cm2[] cm2VarArr) {
        return X0(z, charSequence, f, cm2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z, CharSequence charSequence, float f, cm2[] cm2VarArr, float f2, float f3) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        cm2 cm2Var;
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
        if (cm2VarArr == null || (cm2Var = cm2VarArr[0]) == null) {
            if (z) {
                i = 2131231961;
            } else {
                i = 2131232312;
            }
            cm2Var = new cm2(i, 0);
            if (cm2VarArr != null) {
                cm2VarArr[0] = cm2Var;
            }
        }
        cm2Var.r = 0.0f;
        cm2Var.s = f2;
        cm2Var.H = f3;
        if (z) {
            cm2Var.d = false;
            float f4 = f * 0.2f;
            cm2Var.I = f4;
            cm2Var.J = f4;
        } else {
            cm2Var.I = f;
            cm2Var.J = f;
        }
        spannableString.setSpan(cm2Var, 0, spannableString.length() - 1, 33);
        gl.J2(spannableStringBuilder, "⭐", "⭐️");
        gl.J2(spannableStringBuilder, "⭐", "⭐ ");
        gl.J2(spannableStringBuilder, spannableString, "⭐");
        gl.J2(spannableStringBuilder, "XTR", "XTR ");
        gl.J2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z, String str, cm2[] cm2VarArr) {
        cm2 cm2Var;
        int i;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (cm2VarArr == null || (cm2Var = cm2VarArr[0]) == null) {
            if (z) {
                i = 2131231961;
            } else {
                i = 2131232312;
            }
            cm2Var = new cm2(i, 0);
            if (z) {
                f = 0.222f;
            } else {
                f = 1.13f;
            }
            cm2Var.I = f;
            cm2Var.J = f;
        }
        if (z) {
            cm2Var.d = false;
        }
        if (cm2VarArr != null) {
            cm2VarArr[0] = cm2Var;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(cm2Var, 0, spannableString.length() - 1, 33);
        gl.J2(spannableStringBuilder, "⭐", "⭐️");
        gl.J2(spannableStringBuilder, "⭐", "⭐ ");
        gl.J2(spannableStringBuilder, spannableString, "⭐");
        gl.J2(spannableStringBuilder, "XTR", "XTR ");
        gl.J2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(TL_stars.StarsAmount starsAmount, String str, cm2[] cm2VarArr) {
        return a1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, cm2VarArr);
    }

    public static android.text.SpannableStringBuilder a1(boolean r5, java.lang.CharSequence r6, float r7, defpackage.cm2[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.a1(boolean, java.lang.CharSequence, float, cm2[]):android.text.SpannableStringBuilder");
    }

    public static cua b1(be0 be0Var, ImageReceiver imageReceiver, String str, boolean z) {
        int i;
        int i2 = imageReceiver.d;
        final pj3 pj3Var = new pj3(z, i2, str, imageReceiver, new boolean[1]);
        pj3Var.run();
        kk7 f = kk7.f(i2);
        if (z) {
            i = kk7.Y2;
        } else {
            i = kk7.X2;
        }
        return new cua(f.h(be0Var, i, new p8c() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                pj3 pj3Var2 = pj3Var;
                Object[] objArr = (Object[]) obj;
                switch (b) {
                    case 0:
                        pj3Var2.run();
                        return;
                    default:
                        pj3Var2.run();
                        return;
                }
            }
        }), kk7.f(i2).h(be0Var, kk7.x0, new p8c() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                pj3 pj3Var2 = pj3Var;
                Object[] objArr = (Object[]) obj;
                switch (b) {
                    case 0:
                        pj3Var2.run();
                        return;
                    default:
                        pj3Var2.run();
                        return;
                }
            }
        }), (byte) 0);
    }

    public static void c1(be0 be0Var, ImageReceiver imageReceiver, long j) {
        String str;
        if (j <= 1000) {
            str = "2⃣";
        } else if (j < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        b1(be0Var, imageReceiver, str, false);
    }

    public static void d1(ImageReceiver imageReceiver, TLRPC.Document document, int i) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w = ba4.w(document.thumbs, i, false, null, false);
        imageReceiver.Z(gl5.b(document), tb4.m(i, i, "_"), gl5.c(w, document), tb4.m(i, i, "_"), uo3.d(document.thumbs, bkb.Z6, 0.35f, false), 0L, null, null, 0);
    }

    public static void e1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        d1(imageReceiver, document, i);
    }

    public static cua f1(be0 be0Var, ImageReceiver imageReceiver, int i) {
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
        return b1(be0Var, imageReceiver, str, false);
    }

    public static void g1(be0 be0Var, ImageReceiver imageReceiver, long j) {
        String str;
        if (j <= 10000000000L) {
            str = "2⃣";
        } else if (j <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        b1(be0Var, imageReceiver, str, true);
    }

    public static void h1(Context context, int i, long j, TL_stories.Boost boost, wjb wjbVar) {
        int i2;
        if (context == null) {
            return;
        }
        fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout j2 = de9.j(context, 1);
        j2.setPadding(0, gl.L(20.0f), 0, gl.L(4.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j2.addView(frameLayout, nme.t(-1, 150, 7, 0, 0, 0, 10));
        qua quaVar = new qua(context, 70, 0);
        frameLayout.addView(quaVar, nme.c(-1.0f, -1));
        er4 er4Var = new er4(context, 1, 2);
        uq4 uq4Var = er4Var.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        er4Var.setStarParticlesView(quaVar);
        frameLayout.addView(er4Var, nme.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        er4Var.setPaused(false);
        TextView textView = new TextView(context);
        tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
        textView.setGravity(17);
        fx0[] fx0VarArr = new fx0[1];
        textView.setText(k96.H(' ', "BoostStars", (int) boost.stars));
        TextView m = ug8.m(j2, textView, nme.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setBackground(bkb.b0(gl.L(20.0f), -6915073));
        m.setTextColor(-1);
        m.setTextSize(1, 11.33f);
        m.setPadding(gl.L(4.0f), 0, gl.L(8.33f), 0);
        m.setGravity(17);
        m.setTypeface(gl.o());
        int i3 = boost.multiplier;
        if (i3 == 0) {
            i3 = 1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x".concat(k96.H(' ', "BoostingBoostsCount", i3)));
        cm2 cm2Var = new cm2(2131231932, 2);
        cm2Var.r = 0.0f;
        cm2Var.s = gl.L(0.66f);
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
        m.setText(spannableStringBuilder);
        j2.addView(m, nme.t(-2, 20, 17, 20, 4, 20, 4));
        mfb mfbVar = new mfb(context, wjbVar);
        mfbVar.n(k96.M0(2131753624, null), i, j, new ota(fx0VarArr, j, (byte) 6));
        mfbVar.f(k96.M0(2131753623, null), k96.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = k96.M0(2131753612, null);
            String M02 = k96.M0(2131753611, null);
            i2 = 1;
            go6 go6Var = new go6(fx0VarArr, j, boost, (byte) 27);
            fx0VarArr = fx0VarArr;
            mfbVar.i(M0, M02, go6Var);
        } else {
            i2 = 1;
        }
        String M03 = k96.M0(2131753659, null);
        String format = k96.D0().r0().format(new Date(boost.date * 1000));
        String format2 = k96.D0().o0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[0] = format;
        objArr[i2] = format2;
        mfbVar.f(M03, k96.a0(null, null, 2131742520, objArr), null, null);
        String M04 = k96.M0(2131753604, null);
        String format3 = k96.D0().r0().format(new Date(boost.expires * 1000));
        String format4 = k96.D0().o0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[0] = format3;
        objArr2[i2] = format4;
        mfbVar.f(M04, k96.a0(null, null, 2131742520, objArr2), null, null);
        j2.addView(mfbVar, nme.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        l46 l46Var = new l46(context, wjbVar);
        zkb.X(l46Var, bkb.y6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setTextSize(i2, 14.0f);
        l46Var.setText(gl.O2(k96.M0(2131744689, null), -1, 0, new vf1(context, (byte) 17), null));
        l46Var.setGravity(17);
        j2.addView(l46Var, nme.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.i(k96.M0(2131747638, null), false, true);
        u41Var.setOnClickListener(new f5(fx0VarArr, (byte) 5));
        j2.addView(u41Var, nme.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        h.O = j2;
        fx0VarArr[0] = h;
        h.T0 = false;
        h.K();
        d S = LaunchActivity.S();
        if (!gl.O1() && !gl.s1(S)) {
            fx0VarArr[0].X(S);
        }
        er4Var.setPaused(false);
        fx0VarArr[0].show();
        fx0VarArr[0].n(new z6a(er4Var, (byte) 24));
    }

    public static o0a i1(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, i8c i8cVar, wjb wjbVar) {
        nj resellAmount;
        oj ojVar = oj.a;
        if (tL_starGiftUnique == null) {
            resellAmount = nj.h(na7.q1(i).k4.o.f(), ojVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(oj.b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(ojVar);
        }
        o0a o0aVar = new o0a(context, wjbVar, i, resellAmount, new nu9(i8cVar, r8, (byte) 12));
        o0a[] o0aVarArr = {o0aVar};
        o0aVar.show();
        return o0aVarArr[0];
    }

    public static void j1(Context context, long j, boolean z, final i8c i8cVar, wjb wjbVar) {
        int i;
        int i2;
        CharSequence l;
        fx0[] fx0VarArr;
        long j2;
        boolean z2 = false;
        fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        u41 u41Var = null;
        textView.setText(k96.M0(2131747539, null));
        textView.setTextSize(1, 20.0f);
        int i3 = bkb.F6;
        zkb.X(textView, i3, wjbVar);
        linearLayout.addView(textView, nme.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        er7 er7Var = new er7(context, wjbVar);
        er7Var.setForceForceUseCenter(true);
        er7Var.setText(k96.M0(2131747540, null));
        er7Var.setLeftPadding(gl.L(36.0f));
        zkb.X(editTextBoldCursor, i3, wjbVar);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = gl.L(16.0f);
        editTextBoldCursor.setPadding(gl.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        zkb.C(editTextBoldCursor, bkb.kg, wjbVar);
        zkb.l(editTextBoldCursor, 36, bkb.lg, wjbVar);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor.setGravity(i);
        editTextBoldCursor.setOnFocusChangeListener(new jt0(er7Var, editTextBoldCursor, (byte) 2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232757);
        linearLayout2.addView(imageView, nme.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, nme.p(-1, -2, 1.0f, 119));
        er7Var.e(editTextBoldCursor);
        er7Var.addView(linearLayout2, nme.e(-1, -2, 48));
        linearLayout.addView(er7Var, nme.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        zkb.X(textView2, bkb.z6, null);
        er7Var.addView(textView2, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        l46 l46Var = new l46(context, null);
        l46Var.setText(gl.E2(gl.O2(k96.M0(2131747542, null), -1, 0, new vf1(context, (byte) 18), null), true));
        l46Var.setTextSize(1, 12.0f);
        zkb.X(l46Var, bkb.y6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        linearLayout.addView(l46Var, nme.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final u41 i4 = yjb.i(24, wjbVar, context, true);
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i5 > 0) {
            i2 = 2131747538;
        } else {
            i2 = 2131747544;
        }
        i4.i(k96.M0(i2, null), false, true);
        linearLayout.addView(i4, nme.o(-1, 48));
        if (i5 > 0 && z) {
            u41 i6 = yjb.i(24, wjbVar, context, false);
            i6.i(k96.M0(2131747543, null), false, false);
            linearLayout.addView(i6, nme.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            u41Var = i6;
        }
        h.O = linearLayout;
        final fx0[] fx0VarArr2 = {h};
        if (i5 <= 0) {
            l = "";
        } else {
            l = Long.toString(j);
        }
        editTextBoldCursor.setText(l);
        editTextBoldCursor.addTextChangedListener(new pua(editTextBoldCursor, er7Var, j, z, i4, textView2));
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
                i8cVar.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new xta(editTextBoldCursor2, fx0VarArr2, (byte) 1));
                return true;
            }
        });
        vta vtaVar = new vta(zArr, i8cVar, editTextBoldCursor, i4, fx0VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        i4.setOnClickListener(vtaVar);
        if (u41Var != null) {
            u41 u41Var2 = u41Var;
            vta vtaVar2 = new vta(zArr, i8cVar, u41Var2, editTextBoldCursor2, fx0VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            fx0VarArr = fx0VarArr2;
            u41Var2.setOnClickListener(vtaVar2);
        } else {
            fx0VarArr = fx0VarArr2;
        }
        fx0VarArr[0].K();
        fx0VarArr[0].setOnDismissListener(new ic4(editTextBoldCursor2, (byte) 3));
        fx0VarArr[0].show();
        d Q = LaunchActivity.Q();
        if (Q instanceof mu1) {
            z2 = ((mu1) Q).S9();
        }
        xta xtaVar = new xta(fx0VarArr, editTextBoldCursor2);
        if (z2) {
            j2 = 200;
        } else {
            j2 = 80;
        }
        gl.e3(xtaVar, j2);
    }

    public static defpackage.fx0 k1(final android.content.Context r61, final boolean r62, final long r63, final int r65, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r66, final defpackage.wjb r67) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.k1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, wjb):fx0");
    }

    public static void l1(Activity activity, int i, int i2, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, wjb wjbVar) {
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
        k1(activity, false, 0L, i, starsTransaction, wjbVar);
    }

    public static void m1(Context context, int i, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, wjb wjbVar) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = na7.q1(i).w1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i, starsTransaction, wjbVar);
    }

    public static CharSequence s1(CharSequence charSequence, boolean z) {
        cm2[] cm2VarArr;
        r9c c;
        if (z && (charSequence instanceof Spanned)) {
            for (cm2 cm2Var : (cm2[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), cm2.class)) {
                Drawable drawable = cm2Var.c;
                if (drawable != null && !(drawable instanceof r9c) && (c = r9c.c(a.b.getResources(), 2131231962, null)) != null) {
                    c.setBounds(cm2Var.c.getBounds());
                    cm2Var.c = c;
                    cm2Var.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void D0() {
        q1();
        o39 o39Var = this.c;
        if (o39Var != null && this.V != null && o39Var.getLayoutParams() != null) {
            int x = b00.x(48.0f, this.c0, -gl.L(8.0f));
            int x2 = b00.x(48.0f, this.d0, -gl.L(8.0f));
            gl.w3(this.c, 0, x, 0, x2);
            o39 o39Var2 = this.c;
            int i = -x;
            o39Var2.setPadding(o39Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - x2);
            this.V.A(i, -x2);
        }
    }

    public final void E0(ArrayList arrayList, l5c l5cVar) {
        boolean z;
        o39 o39Var;
        int i;
        n1("FILL_BEFORE");
        dha dhaVar = this.V;
        if (dhaVar != null && dhaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        gta v = gta.v(this.currentAccount, false);
        c4c c4cVar = new c4c(-2);
        c4cVar.c = (sb) super.n0(getParentActivity());
        arrayList.add(c4cVar);
        arrayList.add(c4c.k(this.j0));
        u41 u41Var = this.s0;
        if (u41Var != null) {
            if (getMessagesController().k4.w2.f) {
                i = 0;
            } else {
                i = 8;
            }
            u41Var.setVisibility(i);
        }
        arrayList.add(c4c.C(null));
        if (getMessagesController().k4.C2.f) {
            arrayList.add(xb.i(-4, getThemedColor(bkb.kk), p82.a0(k96.M0(2131743527, null)), k96.M0(2131743528, null)));
            arrayList.add(c4c.C(null));
        }
        if (v.e && !v.v.isEmpty()) {
            oo1.o(2131744966, null, arrayList);
            for (int i2 = 0; i2 < v.v.size(); i2++) {
                int i3 = bva.b;
                c4c K = c4c.K(bva.class);
                K.H = (TL_stars.StarsSubscription) v.v.get(i2);
                arrayList.add(K);
            }
            if (v.x) {
                arrayList.add(c4c.q(arrayList.size(), 33));
            } else if (!v.y) {
                c4c c = c4c.c(-3, 2131230871, k96.M0(2131744965, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c4c.C(null));
        }
        boolean K2 = v.K(0);
        this.t0 = K2;
        if (K2) {
            this.b0 = arrayList.size();
            arrayList.add(c4c.n(this.W, -2));
            if (z && (o39Var = this.c) != null) {
                o39Var.removeCallbacks(this.g0);
                this.c.post(this.g0);
            }
        } else {
            arrayList.add(c4c.m(this.h0));
        }
        n1("FILL_AFTER");
    }

    public final void L0(int r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.L0(int):void");
    }

    public final void M0(Context context) {
        if (na7.q1(this.currentAccount).t2()) {
            h5.b(this.currentAccount);
        } else {
            new ava(context, this.resourceProvider).show();
        }
    }

    public final void N0(Context context) {
        new ava(context, this.resourceProvider).show();
    }

    public final void O0() {
        gta.v(this.currentAccount, false).r();
        xu4.f1(true, oj0.a(this.currentAccount).b());
    }

    public final void P0(c4c c4cVar, Boolean bool, String str) {
        if (getParentActivity() != null) {
            if (bool.booleanValue()) {
                u21.b0(this).I(2131624222, k96.M0(2131744922, null), gl.T2(k96.G((int) c4cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                this.i0.c(true);
                gta.v(this.currentAccount, false).P(true);
            } else if (str != null) {
                u21.b0(this).Q(2131624012, 36, k96.a0(null, null, 2131743639, str)).j();
            }
        }
    }

    @Override
    public final View createView(final Context context) {
        boolean z;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i;
        this.H = false;
        this.F = gl.L(238.0f);
        dha dhaVar = new dha(context);
        this.V = dhaVar;
        boolean z2 = true;
        dhaVar.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            ui5 ui5Var = this.parentLayout;
            if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
                i = 0;
            } else {
                i = gl.m;
            }
            this.c0 = i;
            this.d0 = gl.n;
        }
        this.V.setGeometry(new u39(this, (byte) 15));
        this.V.A(-b00.x(48.0f, this.c0, -gl.L(8.0f)), -b00.x(48.0f, this.d0, -gl.L(8.0f)));
        dha dhaVar2 = this.V;
        dhaVar2.getClass();
        this.W = new si9((byte) 6, context, dhaVar2);
        this.U = new iva(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new si9((byte) 8, context, this);
        super.createView(context);
        hz4 hz4Var = this.s;
        getBaseSimpleGlass().f(hz4Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new cg0(this, new gua(hz4Var, (byte) 0), (byte) 8);
        FrameLayout frameLayout = this.U.d;
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        dha dhaVar3 = this.V;
        dhaVar3.addView(this.X, dhaVar3.indexOfChild(frameLayout), nme.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        kta ktaVar = new kta(this, (byte) 0);
        s33 s33Var = s33.h;
        fm0 fm0Var = new fm0(0, ktaVar, s33Var, 380L, false);
        this.Y = fm0Var;
        this.Z = new fm0(1, new kta(this, (byte) 1), s33Var, 380L, false);
        this.a0 = new fm0(2, new kta(this, (byte) 2), s33Var, 380L, false);
        if (!this.c.canScrollVertically(-1) && !this.simpleActionBar.x()) {
            z = false;
        } else {
            z = true;
        }
        fm0Var.a(z, false);
        this.Z.a(this.V.f0, false);
        this.c.j(new n58(this, (byte) 26));
        q1();
        il0 c = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c.p(nod.l(this.resourceProvider));
        c.q(gl.L(9.66f));
        c.r(gl.L(18.0f));
        frameLayout.setBackground(c);
        ui5 ui5Var2 = this.parentLayout;
        if (ui5Var2 != null && ((ActionBarLayout) ui5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        frameLayout2.setClickable(true);
        er4 er4Var = new er4(context, 1, 2);
        this.T = er4Var;
        uq4 uq4Var = er4Var.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, nme.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        i0(k96.M0(2131743974, null), gl.E2(gl.O2(k96.M0(2131743971, null), -1, 0, new vf1(context, (byte) 15), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33Var);
        gb3Var.n(350L);
        this.c.setItemAnimator(gb3Var);
        this.c.setOnItemClickListener(new f09(this, (byte) 11));
        qh4 qh4Var = new qh4(getParentActivity());
        this.i0 = qh4Var;
        this.s.addView(qh4Var, nme.c(-1.0f, -1));
        gta v = gta.v(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, gl.L(24.0f), 0, gl.L(10.0f));
        hn hnVar = new hn(getParentActivity(), false, true, false);
        this.l0 = hnVar;
        hnVar.setTypeface(gl.o());
        this.l0.setTextSize(gl.L(32.0f));
        this.l0.setGravity(17);
        zkb.U(this.l0, bkb.F6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        ol5 ol5Var = new ol5(42.0f, this.currentAccount, this.l0);
        oy8 oy8Var = new oy8(2131624213, gl.L(42.0f), gl.L(42.0f));
        ImageReceiver imageReceiver = ol5Var.b;
        imageReceiver.g0(oy8Var);
        imageReceiver.M(2);
        ol5Var.f = false;
        ol5Var.h = -gl.L(3.0f);
        this.k0.setSpan(ol5Var, 0, 1, 33);
        this.j0.addView(this.l0, nme.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(k96.M0(2131742527, null));
        zkb.X(this.m0, bkb.y6, this.resourceProvider);
        this.j0.addView(this.m0, nme.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        oc6 oc6Var = new oc6((byte) 25, getParentActivity(), this);
        this.o0 = oc6Var;
        frameLayout3.addView(oc6Var);
        u41 u41Var = new u41(this.resourceProvider, getParentActivity(), true);
        this.p0 = u41Var;
        u41Var.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) {
            public final jva b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                Context context2 = context;
                jva jvaVar = this.b;
                switch (b) {
                    case 0:
                        jvaVar.M0(context2);
                        return;
                    default:
                        jvaVar.N0(context2);
                        return;
                }
            }
        });
        this.o0.addView(this.p0, nme.e(-1, 48, 119));
        pkb pkbVar = new pkb((byte) 19, getParentActivity(), this);
        this.q0 = pkbVar;
        frameLayout3.addView(pkbVar);
        u41 u41Var2 = new u41(this.resourceProvider, getParentActivity(), true);
        this.r0 = u41Var2;
        u41Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new cm2(2131231981, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) k96.M0(2131744728, null));
        this.r0.i(spannableStringBuilder, false, true);
        this.r0.setOnClickListener(new View.OnClickListener(this) {
            public final jva b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                Context context2 = context;
                jva jvaVar = this.b;
                switch (b) {
                    case 0:
                        jvaVar.M0(context2);
                        return;
                    default:
                        jvaVar.N0(context2);
                        return;
                }
            }
        });
        this.q0.addView(this.r0, nme.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        u41 u41Var3 = new u41(this.resourceProvider, getParentActivity(), true);
        this.n0 = u41Var3;
        u41Var3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new cm2(2131231977, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) k96.M0(2131744785, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) {
            public final jva b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                jva jvaVar = this.b;
                switch (b) {
                    case 0:
                        jvaVar.presentFragment(new ss0(0, jvaVar.getUserConfig().e()));
                        return;
                    default:
                        jvaVar.O0();
                        return;
                }
            }
        });
        this.q0.addView(this.n0, nme.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout3, nme.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        u41 u41Var4 = new u41(this.resourceProvider, getParentActivity(), false);
        this.s0 = u41Var4;
        u41Var4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new cm2(2131231895, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) k96.M0(2131743972, null));
        this.s0.i(spannableStringBuilder3, false, true);
        this.s0.setOnClickListener(new View.OnClickListener(this) {
            public final jva b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                jva jvaVar = this.b;
                switch (b) {
                    case 0:
                        jvaVar.presentFragment(new ss0(0, jvaVar.getUserConfig().e()));
                        return;
                    default:
                        jvaVar.O0();
                        return;
                }
            }
        });
        this.j0.addView(this.s0, nme.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        vb vbVar = this.v0;
        if (vbVar != null) {
            vbVar.O(false);
        }
        ct0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = ct0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (v.m().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z2 = false;
        }
        p1(z2, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.w3;
        int i4 = kk7.B3;
        int i5 = kk7.A3;
        if (i == i5 || i == i4 || i == i3) {
            n1("NOTIFICATION_" + i);
        }
        if (i == i3) {
            t0();
            vb vbVar = this.v0;
            if (vbVar != null) {
                vbVar.O(true);
            }
            g0();
        } else if (i == i5) {
            gta v = gta.v(this.currentAccount, false);
            if (this.t0 != v.K(0)) {
                this.t0 = v.K(0);
                t0();
                vb vbVar2 = this.v0;
                if (vbVar2 != null) {
                    vbVar2.O(false);
                }
                g0();
            }
        } else if (i == i4) {
            vb vbVar3 = this.v0;
            if (vbVar3 != null) {
                vbVar3.O(true);
            }
        } else if (i == kk7.z3) {
            o1();
        } else if (i == kk7.D3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override
    public final void g0() {
        dha dhaVar;
        n1("RESTORE_BEFORE");
        super.g0();
        if (this.f0 && (dhaVar = this.V) != null && this.b0 != -1) {
            dhaVar.a();
        }
        this.f0 = false;
        n1("RESTORE_AFTER");
    }

    @Override
    public final void h0() {
        this.s.addView(this.V, nme.c(-1.0f, -1));
        this.V.v(this.c, new kta(this, (byte) 3));
        dha dhaVar = this.V;
        iva ivaVar = this.U;
        dhaVar.y(ivaVar, ivaVar.b, new ho9((byte) 28));
        this.V.z(this.U.d);
        this.U.d.setLayoutParams(nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        dha dhaVar = this.V;
        if (dhaVar == null || motionEvent == null || dhaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final w39 j0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new tf8(this, (byte) 24), getResourceProvider(), (byte) 4);
        this.v0 = vbVar;
        vbVar.r = false;
        return vbVar;
    }

    @Override
    public final t26 k0(Context context) {
        dha dhaVar = this.V;
        dhaVar.getClass();
        return new xe2((Object) dhaVar, (byte) 5);
    }

    @Override
    public final cra l0() {
        return new qua(getParentActivity(), 75, 1);
    }

    @Override
    public final View n0(Context context) {
        throw null;
    }

    public final void n1(String str) {
        boolean z;
        int top;
        if (this.V != null) {
            StringBuilder p = ug8.p("Stars event=", str, " row=");
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
            si9 si9Var = this.W;
            int i = 0;
            if (si9Var != null && si9Var.getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            p.append(z);
            p.append(" boundaryTop=");
            si9 si9Var2 = this.W;
            if (si9Var2 == null) {
                top = 0;
            } else {
                top = si9Var2.getTop();
            }
            p.append(top);
            p.append(" boundaryHeight=");
            si9 si9Var3 = this.W;
            if (si9Var3 != null) {
                i = si9Var3.getHeight();
            }
            p.append(i);
            Log.d("SiblingScroll", p.toString());
            dha dhaVar = this.V;
            if (!dhaVar.a) {
                return;
            }
            dhaVar.b = Math.max(dhaVar.b, 30);
            dhaVar.f(str, null, 0, 0, true);
        }
    }

    public final void o1() {
        int i;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = false;
        gta v = gta.v(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) G0(v.m(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        u41 u41Var = this.p0;
        if (v.m().amount > 0) {
            i = 2131744913;
        } else {
            i = 2131744914;
        }
        u41Var.i(k96.M0(i, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = ct0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z = true;
        }
        p1(z, true);
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.w3);
        kk7.f(this.currentAccount).b(this, kk7.z3);
        kk7.f(this.currentAccount).b(this, kk7.A3);
        kk7.f(this.currentAccount).b(this, kk7.B3);
        kk7.f(this.currentAccount).b(this, kk7.D3);
        gta.v(this.currentAccount, false).P(true);
        gta.v(this.currentAccount, false).O();
        gta.v(this.currentAccount, false).w();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        o39 o39Var = this.c;
        if (o39Var != null) {
            o39Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.w3);
        kk7.f(this.currentAccount).n(this, kk7.z3);
        kk7.f(this.currentAccount).n(this, kk7.A3);
        kk7.f(this.currentAccount).n(this, kk7.B3);
        kk7.f(this.currentAccount).n(this, kk7.D3);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.e0 = true;
        this.c0 = i2;
        this.d0 = i4;
        D0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        er4 er4Var = this.T;
        if (er4Var != null) {
            er4Var.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        er4 er4Var = this.T;
        if (er4Var != null) {
            er4Var.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override
    public final float p0() {
        o39 o39Var = this.c;
        if (o39Var == null) {
            return 0.0f;
        }
        return o39Var.getY();
    }

    public final void p1(final boolean z, boolean z2) {
        float f;
        int i;
        float f2;
        this.u0 = z;
        oc6 oc6Var = this.o0;
        float f3 = 1.0f;
        int i2 = 0;
        if (z2) {
            oc6Var.setVisibility(0);
            this.q0.setVisibility(0);
            ViewPropertyAnimator animate = this.o0.animate();
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            animate.alpha(f2).withEndAction(new Runnable(this) {
                public final jva b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z3 = z;
                    jva jvaVar = this.b;
                    switch (b) {
                        case 0:
                            if (z3) {
                                jvaVar.o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z3) {
                                jvaVar.q0.setVisibility(8);
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
                public final jva b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    boolean z3 = z;
                    jva jvaVar = this.b;
                    switch (b) {
                        case 0:
                            if (z3) {
                                jvaVar.o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z3) {
                                jvaVar.q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        oc6Var.animate().cancel();
        this.q0.animate().cancel();
        pkb pkbVar = this.q0;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        pkbVar.setAlpha(f);
        oc6 oc6Var2 = this.o0;
        if (z) {
            f3 = 0.0f;
        }
        oc6Var2.setAlpha(f3);
        pkb pkbVar2 = this.q0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        pkbVar2.setVisibility(i);
        oc6 oc6Var3 = this.o0;
        if (z) {
            i2 = 8;
        }
        oc6Var3.setVisibility(i2);
    }

    @Override
    public final View q0() {
        return this.V;
    }

    public final void q1() {
        if (this.X == null) {
            return;
        }
        int L = gl.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        r1();
    }

    @Override
    public final void r0(boolean z) {
        fm0 fm0Var = this.a0;
        if (fm0Var != null && fm0Var.f != z) {
            fm0Var.a(z, true);
        }
    }

    public final void r1() {
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
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - f2) * gl.L(44.0f)));
    }

    @Override
    public final void t0() {
        boolean z;
        n1("SAVE_BEFORE");
        super.t0();
        dha dhaVar = this.V;
        if (dhaVar != null && dhaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.f0 = z;
        o39 o39Var = this.c;
        if (o39Var != null && this.Q >= 0) {
            this.R -= o39Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
