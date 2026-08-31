package mh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib1;
import org.telegram.ui.l20;
import org.telegram.ui.m20;
import org.telegram.ui.po;
import org.telegram.ui.q70;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
public final class ja extends m20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f14314e0;
    public static DecimalFormat f14315f0;
    public FrameLayout M;
    public gg.i N;
    public ia O;
    public fg.h0 P;
    public s00 Q;
    public LinearLayout R;
    public SpannableStringBuilder S;
    public org.telegram.ui.Components.k6 T;
    public TextView U;
    public qh.d V;
    public eg.s2 W;
    public qh.d X;
    public ib1 Y;
    public qh.d Z;
    public qh.d f14316a0;
    public boolean f14317b0;
    public boolean f14318c0;
    public k9 f14319d0;

    public ja() {
        this.J = true;
    }

    public static void A0(ja jaVar) {
        t7.y(jaVar.currentAccount, false).u();
        hg.v2.e0(1, BirthdayController.getInstance(jaVar.currentAccount).getState());
    }

    public static void B0(ja jaVar, Context context) {
        if (MessagesController.getInstance(jaVar.currentAccount).isFrozen()) {
            org.telegram.ui.c.b(jaVar.currentAccount);
        } else {
            new aa(context, jaVar.resourceProvider).show();
        }
    }

    public static void F0(tz0 tz0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.g6 g6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((qz0) tz0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        l90 l90Var = new l90(textView, AndroidUtilities.dp(90.0f), 0, g6Var);
        l90Var.a(org.telegram.ui.ActionBar.k6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.k6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(l90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final t7 y10 = t7.y(i10, false);
            final long j10 = starGift.f21070id;
            final dg.h0 h0Var = new dg.h0(textView, 23);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    t7 t7Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (t7Var = t7.this).J(j10)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(t7Var.f14828a).removeObserver(notificationCenterDelegateArr[0], i13);
                        h0Var.run(J);
                    }
                }
            }};
            int i11 = y10.f14828a;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
            int i12 = NotificationCenter.starGiftsLoaded;
            notificationCenter.addObserver(notificationCenterDelegate, i12);
            TL_stars.StarGift J = y10.J(j10);
            if (J != null) {
                zArr[0] = true;
                NotificationCenter.getInstance(i11).removeObserver(notificationCenterDelegateArr[0], i12);
                h0Var.run(J);
            }
        } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
        } else {
            int i13 = starGift.availability_remains;
            if (i13 <= 0) {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i13, LocaleController.formatNumber(starGift.availability_total, ','));
            }
            textView.setText(formatPluralStringComma);
        }
    }

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new h9(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f10, char c3) {
        double d;
        int i10;
        if (f14315f0 == null) {
            f14315f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f14315f0.format(j10 / 1.0E9d);
                spannableStringBuilder.append((CharSequence) format);
                int indexOf = format.indexOf(".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                if (starsAmount.negative()) {
                    str = "-";
                }
                sb.append(str);
                sb.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c3));
                spannableStringBuilder.append((CharSequence) sb.toString());
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z4 = false;
            if (i11 < 0 && j11 > 0) {
                d = 1.0E9d;
                i10 = -1;
            } else if (i11 > 0 && j11 < 0) {
                d = 1.0E9d;
                i10 = 1;
            } else {
                d = 1.0E9d;
                i10 = 0;
            }
            long j12 = i10 + j11;
            int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i12 != 0 ? i12 < 0 : i11 < 0) {
                z4 = true;
            }
            if (i11 != 0) {
                StringBuilder sb2 = new StringBuilder();
                if (z4) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(LocaleController.formatNumber(Math.abs(j12), c3));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f14315f0;
                int i13 = starsAmount.nanos;
                double d10 = i13;
                if (i13 < 0) {
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
                StringBuilder sb3 = new StringBuilder();
                if (z4) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(LocaleController.formatNumber(Math.abs(j12), c3));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f10, char c3) {
        double d;
        int i10;
        boolean z4;
        if (f14315f0 == null) {
            f14315f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f14315f0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            if (i11 < 0 && j10 > 0) {
                i10 = -1;
                d = 1.0E9d;
            } else if (i11 > 0 && j10 < 0) {
                d = 1.0E9d;
                i10 = 1;
            } else {
                d = 1.0E9d;
                i10 = 0;
            }
            long j11 = i10 + j10;
            int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i12 != 0 ? i12 < 0 : i11 < 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String str = "";
            if (Math.abs(j11) <= 1000 && starsAmount.nanos != 0) {
                StringBuilder sb = new StringBuilder();
                if (z4) {
                    str = "-";
                }
                sb.append(str);
                sb.append(LocaleController.formatNumber(Math.abs(j11), c3));
                spannableStringBuilder.append((CharSequence) sb.toString());
                DecimalFormat decimalFormat = f14315f0;
                int i13 = starsAmount.nanos;
                double d10 = i13;
                if (i13 < 0) {
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
                StringBuilder sb2 = new StringBuilder();
                if (z4) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(LocaleController.formatNumber(Math.abs(j11), c3));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            } else {
                StringBuilder sb3 = new StringBuilder();
                if (z4) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(AndroidUtilities.formatWholeNumber((int) Math.abs(j11), 0));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f14315f0 == null) {
                f14315f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f14315f0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = starsAmount.amount;
        int i11 = starsAmount.nanos;
        boolean z4 = false;
        if (i11 < 0 && j10 > 0) {
            i10 = -1;
            d = 1.0E9d;
        } else if (i11 > 0 && j10 < 0) {
            d = 1.0E9d;
            i10 = 1;
        } else {
            d = 1.0E9d;
            i10 = 0;
        }
        long j11 = i10 + j10;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0 ? i12 < 0 : i11 < 0) {
            z4 = true;
        }
        if (i11 != 0) {
            StringBuilder sb = new StringBuilder();
            if (z4) {
                str = "-";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(LocaleController.formatNumber(Math.abs(j11), ','));
            spannableStringBuilder.append((CharSequence) sb.toString());
            if (f14315f0 == null) {
                f14315f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f14315f0;
            int i13 = starsAmount.nanos;
            double d10 = i13;
            if (i13 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StarsNano));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", (int) j10));
        return spannableStringBuilder;
    }

    public static String M0(long j10) {
        String str;
        if (f14314e0 == null) {
            f14314e0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f14314e0.format(j10 / 1.0E9d);
        }
        StringBuilder sb = new StringBuilder();
        if (j10 < 0) {
            str = "-";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(LocaleController.formatNumber(Math.abs(j10 / 1000000000), ','));
        return sb.toString();
    }

    public static java.lang.String N0(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: mh.ja.N0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f10) {
        return P0(charSequence, f10, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f10, float f11, float f12) {
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
        oq oqVar = new oq(R.drawable.diamond, 0);
        oqVar.recolorDrawable = false;
        oqVar.translate(0.0f, f11);
        oqVar.spaceScaleX = f12;
        oqVar.setScale(f10, f10);
        spannableString.setSpan(oqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence) {
        return R0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10, oq[] oqVarArr) {
        return U0(false, charSequence, f10, oqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z4) {
        return U0(z4, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z4, CharSequence charSequence, float f10, oq[] oqVarArr, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        oq oqVar;
        int i10;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z4) {
            str = "⭐";
        } else {
            str = "TON";
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (oqVarArr == null || (oqVar = oqVarArr[0]) == null) {
            if (z4) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            oqVar = new oq(i10, 0);
            if (oqVarArr != null) {
                oqVarArr[0] = oqVar;
            }
        }
        oqVar.translate(0.0f, f11);
        oqVar.spaceScaleX = f12;
        if (z4) {
            float f13 = f10 * 0.2f;
            oqVar.setScale(f13, f13);
        } else {
            oqVar.setScale(f10, f10);
        }
        spannableString.setSpan(oqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z4, String str, oq[] oqVarArr) {
        oq oqVar;
        int i10;
        float f10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (oqVarArr == null || (oqVar = oqVarArr[0]) == null) {
            if (z4) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            oqVar = new oq(i10, 0);
            float f11 = 1.13f;
            if (z4) {
                f10 = 0.222f;
            } else {
                f10 = 1.13f;
            }
            if (z4) {
                f11 = 0.222f;
            }
            oqVar.setScale(f10, f11);
        }
        if (oqVarArr != null) {
            oqVarArr[0] = oqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(oqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, oq[] oqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, oqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z4, CharSequence charSequence, float f10, oq[] oqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        oq oqVar;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z4) {
            str = "⭐";
        } else {
            str = "TON";
        }
        if (z4) {
            i10 = R.drawable.mini_gram_72;
        } else {
            i10 = R.drawable.star_small_inner;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (oqVarArr == null || (oqVar = oqVarArr[0]) == null) {
            if (oqVarArr != null && oqVarArr.length > 0) {
                oqVar = new oq(i10, 0);
                oqVarArr[0] = oqVar;
            } else {
                oqVar = new oq(i10, 0);
            }
        }
        if (z4) {
            f10 *= 0.33f;
        } else {
            oqVar.recolorDrawable = false;
        }
        oqVar.setScale(f10, f10);
        spannableString.setSpan(oqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static l8 Y0(View view, ImageReceiver imageReceiver, String str, boolean z4) {
        int i10;
        int currentAccount = imageReceiver.getCurrentAccount();
        final dg.a1 a1Var = new dg.a1(z4, currentAccount, str, imageReceiver, new boolean[1]);
        a1Var.run();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(currentAccount);
        if (z4) {
            i10 = NotificationCenter.didUpdateTonGiftStickers;
        } else {
            i10 = NotificationCenter.didUpdatePremiumGiftStickers;
        }
        return new l8(notificationCenter.listen(view, i10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        a1Var.run();
                        return;
                    default:
                        a1Var.run();
                        return;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        a1Var.run();
                        return;
                    default:
                        a1Var.run();
                        return;
                }
            }
        }), 0);
    }

    public static void Z0(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), e2.c.h(i10, "_", i10), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i10), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21605a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        Z0(imageReceiver, document, i10);
    }

    public static void b1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 1000) {
            str = "2⃣";
        } else if (j10 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        Y0(p9Var, imageReceiver, str, false);
    }

    public static l8 c1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, int i10) {
        String str;
        if (i10 != 3) {
            if (i10 != 6) {
                if (i10 != 12) {
                    if (i10 != 24) {
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
        return Y0(p9Var, imageReceiver, str, false);
    }

    public static void d1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 10000000000L) {
            str = "2⃣";
        } else if (j10 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        Y0(p9Var, imageReceiver, str, true);
    }

    public static void e1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.g6 g6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, k7.c6.t(-1, 150, 7, 0, 0, 0, 10));
        j9 j9Var = new j9(context, 70, 0);
        frameLayout.addView(j9Var, k7.c6.c(-1.0f, -1));
        gg.i iVar = new gg.i(context, 1, 2);
        gg.a aVar = iVar.f7087b;
        aVar.f7065w = org.telegram.ui.ActionBar.k6.fk;
        aVar.f7066x = org.telegram.ui.ActionBar.k6.gk;
        aVar.b();
        iVar.setStarParticlesView(j9Var);
        frameLayout.addView(iVar, k7.c6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.k6.f21766j5, g6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i11 = yh.i(f10, textView, k7.c6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i11.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(20.0f), -6915073));
        i11.setTextColor(-1);
        i11.setTextSize(1, 11.33f);
        i11.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        i11.setGravity(17);
        i11.setTypeface(AndroidUtilities.bold());
        StringBuilder sb = new StringBuilder("x");
        int i12 = boost.multiplier;
        if (i12 == 0) {
            i12 = 1;
        }
        sb.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i12));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        oq oqVar = new oq(R.drawable.mini_boost_badge, 2);
        oqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
        i11.setText(spannableStringBuilder);
        f10.addView(i11, k7.c6.t(-2, 20, 17, 20, 4, 20, 4));
        tz0 tz0Var = new tz0(context, g6Var);
        tz0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j10, new w7(h3VarArr, j10, 2));
        tz0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            i5.v vVar = new i5.v(h3VarArr, j10, boost, 4);
            h3VarArr = h3VarArr;
            tz0Var.g(string, string2, vVar);
        }
        tz0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        tz0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f10.addView(tz0Var, k7.c6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        g90 g90Var = new g90(context, g6Var);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21720gc, g6Var));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.f(context, 7)));
        g90Var.setGravity(17);
        f10.addView(g90Var, k7.c6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        qh.d dVar = new qh.d(context, g6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new c8(h3VarArr, 1));
        f10.addView(dVar, k7.c6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        o10.customView = f10;
        h3VarArr[0] = o10;
        o10.useBackgroundTopPadding = false;
        o10.fixNavigationBar();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            h3VarArr[0].makeAttached(U);
        }
        iVar.setPaused(false);
        h3VarArr[0].show();
        h3VarArr[0].setOnDismissListener(new lh.c3(iVar, 13));
    }

    public static v0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        mf.a resellAmount;
        mf.b bVar = mf.b.f13651a;
        if (tL_starGiftUnique == null) {
            resellAmount = mf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(mf.b.f13652b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        v0 v0Var = new v0(context, g6Var, i10, resellAmount, new lh.a1(8, callback2, r8));
        v0[] v0VarArr = {v0Var};
        v0Var.show();
        return v0VarArr[0];
    }

    public static void g1(Context context, long j10, boolean z4, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        int i11;
        CharSequence l10;
        org.telegram.ui.ActionBar.h3[] h3VarArr;
        long j11;
        boolean z10 = false;
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        linearLayout.addView(textView, k7.c6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        cd0 cd0Var = new cd0(context, g6Var);
        cd0Var.setForceForceUseCenter(true);
        cd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        cd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        qh.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21970uf, g6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21988vf, g6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new n8(cd0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, k7.c6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, k7.c6.o(-1, -2, 1.0f, 119));
        cd0Var.e(editTextBoldCursor);
        cd0Var.addView(linearLayout2, k7.c6.e(-1, -2, 48));
        linearLayout.addView(cd0Var, k7.c6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A6, false));
        cd0Var.addView(textView2, k7.c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        g90 g90Var = new g90(context, null);
        g90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.f(context, 8)), true));
        g90Var.setTextSize(1, 12.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21720gc, g6Var));
        linearLayout.addView(g90Var, k7.c6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        p10.g(LocaleController.getString(i11), false, true);
        linearLayout.addView(p10, k7.c6.n(-1, 48));
        if (i13 > 0 && z4) {
            dVar = org.telegram.messenger.y3.p(24, context, g6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, k7.c6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        o10.customView = linearLayout;
        final org.telegram.ui.ActionBar.h3[] h3VarArr2 = {o10};
        if (i13 <= 0) {
            l10 = "";
        } else {
            l10 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l10);
        editTextBoldCursor.addTextChangedListener(new i9(editTextBoldCursor, cd0Var, j10, z4, p10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                if (i14 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                p10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new q8(editTextBoldCursor2, h3VarArr2, 2));
                return true;
            }
        });
        p10.setOnClickListener(new p8(zArr, callback2, editTextBoldCursor, p10, h3VarArr2));
        if (dVar != null) {
            qh.d dVar2 = dVar;
            p8 p8Var = new p8(zArr, callback2, dVar2, editTextBoldCursor, h3VarArr2);
            h3VarArr = h3VarArr2;
            dVar2.setOnClickListener(p8Var);
        } else {
            h3VarArr = h3VarArr2;
        }
        h3VarArr[0].fixNavigationBar();
        h3VarArr[0].setOnDismissListener(new fg.d0(editTextBoldCursor, 4));
        h3VarArr[0].show();
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof xn) {
            z10 = ((xn) R).P9();
        }
        q8 q8Var = new q8(h3VarArr, editTextBoldCursor);
        if (z10) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        AndroidUtilities.runOnUIThread(q8Var, j11);
    }

    public static org.telegram.ui.ActionBar.h3 h1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final org.telegram.ui.ActionBar.g6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: mh.ja.h1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.g6):org.telegram.ui.ActionBar.h3");
    }

    public static void i1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.g6 g6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f21072id = tL_messageActionPaymentRefunded.charge.f20971id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i10, starsTransaction, g6Var);
    }

    public static void j1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.g6 g6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f21072id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i10, starsTransaction, g6Var);
    }

    public static void x0(mh.ja r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: mh.ja.x0(mh.ja, int):void");
    }

    public static void z0(ja jaVar, j51 j51Var, Boolean bool, String str) {
        if (jaVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                qc.a0(jaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) j51Var.B, new Object[0])), R.raw.stars_topup).j();
                jaVar.Q.c(true);
                t7.y(jaVar.currentAccount, false).T(true);
            } else if (str != null) {
                yh.s(R.string.UnknownErrorCode, new Object[]{str}, qc.a0(jaVar), R.raw.error, 36);
            }
        }
    }

    public final void H0(ArrayList arrayList, x51 x51Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        t7 y10 = t7.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        j51 j51Var = new j51(-2);
        j51Var.f28007c = (fg.h0) super.r0(getParentActivity());
        arrayList.add(j51Var);
        arrayList.add(j51.k(this.R));
        qh.d dVar = this.f14316a0;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(j51.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(sh.f.a(-4, getThemedColor(org.telegram.ui.ActionBar.k6.uj), R.drawable.filled_earn_stars, po.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(j51.B(null));
        }
        if (y10.f14831e && !arrayList2.isEmpty()) {
            yh.r(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = ba.f13764a;
                j51 J = j51.J(ba.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(J);
            }
            if (y10.f14848x) {
                arrayList.add(j51.o(arrayList.size(), 33));
            } else if (!y10.f14849y) {
                j51 c3 = j51.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c3.f28019q = true;
                arrayList.add(c3);
            }
            arrayList.add(j51.B(null));
        }
        boolean O = y10.O(0);
        this.f14317b0 = O;
        if (O) {
            arrayList.add(j51.p(this.O, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(j51.l(this.P));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        this.O = new ia(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.P = new fg.h0(this, context, 2);
        super.createView(context);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        boolean z4 = true;
        frameLayout.setClickable(true);
        gg.i iVar = new gg.i(context, 1, 2);
        this.N = iVar;
        gg.a aVar = iVar.f7087b;
        aVar.f7065w = org.telegram.ui.ActionBar.k6.fk;
        aVar.f7066x = org.telegram.ui.ActionBar.k6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.f38942e);
        this.M.addView(this.N, k7.c6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.f(context, 5)), true), this.M, null);
        this.f38941c.setOverScrollMode(2);
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.f38941c.setItemAnimator(lVar);
        this.f38941c.setOnItemClickListener(new ag.h(this, 8));
        s00 s00Var = new s00(getParentActivity());
        this.Q = s00Var;
        this.f38946s.addView(s00Var, k7.c6.c(-1.0f, -1));
        t7 y10 = t7.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.R = linearLayout;
        linearLayout.setOrientation(1);
        this.R.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getParentActivity(), false, true, false);
        this.T = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.T.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.resourceProvider));
        this.S = new SpannableStringBuilder("S");
        q70 q70Var = new q70(this.T, 42.0f, this.currentAccount);
        int i10 = R.raw.star_reaction;
        ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(42.0f), "s" + R.raw.star_reaction, AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = q70Var.f40362b;
        imageReceiver.setImageBitmap(ij0Var);
        imageReceiver.setAutoRepeat(2);
        q70Var.f40365f = false;
        q70Var.h = -AndroidUtilities.dp(3.0f);
        this.S.setSpan(q70Var, 0, 1, 33);
        this.R.addView(this.T, k7.c6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.U = textView;
        textView.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.U.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, this.resourceProvider));
        this.R.addView(this.U, k7.c6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        eg.s2 s2Var = new eg.s2(this, getParentActivity(), 8);
        this.W = s2Var;
        frameLayout2.addView(s2Var);
        qh.d dVar = new qh.d(getParentActivity(), this.resourceProvider, true);
        this.X = dVar;
        dVar.e();
        this.X.g("", false, true);
        this.X.setOnClickListener(new View.OnClickListener(this) {
            public final ja f14127b;

            {
                this.f14127b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        ja.B0(this.f14127b, context);
                        return;
                    default:
                        new aa(context, this.f14127b.resourceProvider).show();
                        return;
                }
            }
        });
        this.W.addView(this.X, k7.c6.e(-1, 48, 119));
        ib1 ib1Var = new ib1(this, getParentActivity(), 4);
        this.Y = ib1Var;
        frameLayout2.addView(ib1Var);
        qh.d dVar2 = new qh.d(getParentActivity(), this.resourceProvider, true);
        this.Z = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new oq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Z.g(spannableStringBuilder, false, true);
        this.Z.setOnClickListener(new View.OnClickListener(this) {
            public final ja f14127b;

            {
                this.f14127b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        ja.B0(this.f14127b, context);
                        return;
                    default:
                        new aa(context, this.f14127b.resourceProvider).show();
                        return;
                }
            }
        });
        this.Y.addView(this.Z, k7.c6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        qh.d dVar3 = new qh.d(getParentActivity(), this.resourceProvider, true);
        this.V = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new oq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.V.g(spannableStringBuilder2, false, true);
        this.V.setOnClickListener(new View.OnClickListener(this) {
            public final ja f14183b;

            {
                this.f14183b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ja jaVar = this.f14183b;
                        jaVar.presentFragment(new p(0, jaVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        ja.A0(this.f14183b);
                        return;
                }
            }
        });
        this.Y.addView(this.V, k7.c6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.R.addView(frameLayout2, k7.c6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        qh.d dVar4 = new qh.d(getParentActivity(), this.resourceProvider, false);
        this.f14316a0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new oq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f14316a0.g(spannableStringBuilder3, false, true);
        this.f14316a0.setOnClickListener(new View.OnClickListener(this) {
            public final ja f14183b;

            {
                this.f14183b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ja jaVar = this.f14183b;
                        jaVar.presentFragment(new p(0, jaVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        ja.A0(this.f14183b);
                        return;
                }
            }
        });
        this.R.addView(this.f14316a0, k7.c6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        k9 k9Var = this.f14319d0;
        if (k9Var != null) {
            k9Var.N(false);
        }
        a0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = a0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1((y10.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            k9 k9Var = this.f14319d0;
            if (k9Var != null) {
                k9Var.N(true);
            }
            if (this.K == 0 && this.L < 0) {
                this.L = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            t7 y10 = t7.y(this.currentAccount, false);
            if (this.f14317b0 != y10.O(0)) {
                this.f14317b0 = y10.O(0);
                s0();
                k9 k9Var2 = this.f14319d0;
                if (k9Var2 != null) {
                    k9Var2.N(true);
                }
                if (this.K == 0 && this.L < 0) {
                    this.L = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            k9 k9Var3 = this.f14319d0;
            if (k9Var3 != null) {
                k9Var3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            k1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            k1();
        }
    }

    public final void k1() {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z4 = false;
        t7 y10 = t7.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.S);
        spannableStringBuilder.append((CharSequence) J0(y10.p(), 0.66f, ' '));
        this.T.setText(spannableStringBuilder);
        qh.d dVar = this.X;
        if (y10.p().amount > 0) {
            i10 = R.string.StarsBuyMore;
        } else {
            i10 = R.string.StarsBuy;
        }
        dVar.g(LocaleController.getString(i10), true, true);
        TLRPC.TL_payments_starsRevenueStats h = a0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z4 = true;
        }
        l1(z4, true);
    }

    public final void l1(final boolean z4, boolean z10) {
        float f10;
        int i10;
        float f11;
        this.f14318c0 = z4;
        float f12 = 1.0f;
        int i11 = 0;
        if (z10) {
            this.W.setVisibility(0);
            this.Y.setVisibility(0);
            ViewPropertyAnimator animate = this.W.animate();
            if (z4) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animate.alpha(f11).withEndAction(new Runnable(this) {
                public final ja f14268b;

                {
                    this.f14268b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z4) {
                                this.f14268b.W.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z4) {
                                this.f14268b.Y.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.Y.animate();
            if (!z4) {
                f12 = 0.0f;
            }
            animate2.alpha(f12).withEndAction(new Runnable(this) {
                public final ja f14268b;

                {
                    this.f14268b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z4) {
                                this.f14268b.W.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z4) {
                                this.f14268b.Y.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.W.animate().cancel();
        this.Y.animate().cancel();
        ib1 ib1Var = this.Y;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ib1Var.setAlpha(f10);
        eg.s2 s2Var = this.W;
        if (z4) {
            f12 = 0.0f;
        }
        s2Var.setAlpha(f12);
        ib1 ib1Var2 = this.Y;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ib1Var2.setVisibility(i10);
        eg.s2 s2Var2 = this.W;
        if (z4) {
            i11 = 8;
        }
        s2Var2.setVisibility(i11);
    }

    @Override
    public final f2.p0 n0() {
        k9 k9Var = new k9(this, this.f38941c, getParentActivity(), this.currentAccount, this.classGuid, new eg.p1(this, 19), getResourceProvider());
        this.f14319d0 = k9Var;
        k9Var.f32957r = false;
        return k9Var;
    }

    @Override
    public final l20 o0() {
        return new u9(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        t7.y(this.currentAccount, false).T(true);
        t7.y(this.currentAccount, false).S();
        t7.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onPause() {
        super.onPause();
        gg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        gg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override
    public final fg.p2 p0() {
        return new j9(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        ia iaVar = this.O;
        boolean z4 = false;
        if (iaVar != null && (iaVar.getParent() instanceof View)) {
            if ((this.f38941c.getHeight() - this.f38941c.getPaddingBottom()) - ((View) this.O.getParent()).getBottom() >= 0) {
                z4 = true;
            }
        }
        return !z4;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }
}
