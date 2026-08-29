package jh;

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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f70;
import org.telegram.ui.ko;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.ua1;
import org.telegram.ui.y10;
import org.telegram.ui.z10;
public final class ia extends z10 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f12273d0;
    public static DecimalFormat f12274e0;
    public FrameLayout L;
    public dg.i M;
    public ha N;
    public cg.h0 O;
    public n00 P;
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public org.telegram.ui.Components.o6 S;
    public TextView T;
    public nh.d U;
    public bg.x2 V;
    public nh.d W;
    public ua1 X;
    public nh.d Y;
    public nh.d Z;
    public boolean f12275a0;
    public boolean f12276b0;
    public j9 f12277c0;

    public ia() {
        this.I = true;
    }

    public static void A0(ia iaVar) {
        s7.y(iaVar.currentAccount, false).u();
        eg.w2.e0(1, BirthdayController.getInstance(iaVar.currentAccount).getState());
    }

    public static void B0(ia iaVar, Context context) {
        if (MessagesController.getInstance(iaVar.currentAccount).isFrozen()) {
            org.telegram.ui.c.b(iaVar.currentAccount);
        } else {
            new z9(context, iaVar.resourceProvider).show();
        }
    }

    public static void F0(hz0 hz0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((ez0) hz0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        d90 d90Var = new d90(textView, AndroidUtilities.dp(90.0f), 0, c6Var);
        d90Var.a(org.telegram.ui.ActionBar.g6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.g6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(d90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final s7 y8 = s7.y(i10, false);
            final long j10 = starGift.f22619id;
            final ag.i0 i0Var = new ag.i0(textView, 23);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    s7 s7Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (s7Var = s7.this).J(j10)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(s7Var.f12787a).removeObserver(notificationCenterDelegateArr[0], i13);
                        i0Var.run(J);
                    }
                }
            }};
            int i11 = y8.f12787a;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
            int i12 = NotificationCenter.starGiftsLoaded;
            notificationCenter.addObserver(notificationCenterDelegate, i12);
            TL_stars.StarGift J = y8.J(j10);
            if (J != null) {
                zArr[0] = true;
                NotificationCenter.getInstance(i11).removeObserver(notificationCenterDelegateArr[0], i12);
                i0Var.run(J);
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
        spannableString.setSpan(new g9(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f9, char c3) {
        double d;
        int i10;
        if (f12274e0 == null) {
            f12274e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f12274e0.format(j10 / 1.0E9d);
                spannableStringBuilder.append((CharSequence) format);
                int indexOf = format.indexOf(".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), indexOf, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (starsAmount.negative()) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c3));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
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
                z10 = true;
            }
            if (i11 != 0) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(LocaleController.formatNumber(Math.abs(j12), c3));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f12274e0;
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
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), length + 1, spannableStringBuilder.length(), 33);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(LocaleController.formatNumber(Math.abs(j12), c3));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f9, char c3) {
        double d;
        int i10;
        boolean z10;
        if (f12274e0 == null) {
            f12274e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f12274e0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), indexOf, spannableStringBuilder.length(), 33);
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
                sb2.append(LocaleController.formatNumber(Math.abs(j11), c3));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f12274e0;
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
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), length + 1, spannableStringBuilder.length(), 33);
                    }
                }
            } else if (starsAmount.amount <= 1000) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(LocaleController.formatNumber(Math.abs(j11), c3));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(AndroidUtilities.formatWholeNumber((int) Math.abs(j11), 0));
                spannableStringBuilder.append((CharSequence) sb4.toString());
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
            if (f12274e0 == null) {
                f12274e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f12274e0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = starsAmount.amount;
        int i11 = starsAmount.nanos;
        boolean z10 = false;
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
            z10 = true;
        }
        if (i11 != 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                str = "-";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(LocaleController.formatNumber(Math.abs(j11), ','));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (f12274e0 == null) {
                f12274e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f12274e0;
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
        if (f12273d0 == null) {
            f12273d0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f12273d0.format(j10 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (j10 < 0) {
            str = "-";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(LocaleController.formatNumber(Math.abs(j10 / 1000000000), ','));
        return sb2.toString();
    }

    public static java.lang.String N0(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: jh.ia.N0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f9) {
        return P0(charSequence, f9, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f9, float f10, float f11) {
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
        iq iqVar = new iq(R.drawable.diamond, 0);
        iqVar.recolorDrawable = false;
        iqVar.translate(0.0f, f10);
        iqVar.spaceScaleX = f11;
        iqVar.setScale(f9, f9);
        spannableString.setSpan(iqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f9, iq[] iqVarArr) {
        return U0(false, charSequence, f9, iqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f9, iq[] iqVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        iq iqVar;
        int i10;
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
        if (iqVarArr == null || (iqVar = iqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            iqVar = new iq(i10, 0);
            if (iqVarArr != null) {
                iqVarArr[0] = iqVar;
            }
        }
        iqVar.translate(0.0f, f10);
        iqVar.spaceScaleX = f11;
        if (z10) {
            float f12 = f9 * 0.2f;
            iqVar.setScale(f12, f12);
        } else {
            iqVar.setScale(f9, f9);
        }
        spannableString.setSpan(iqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, iq[] iqVarArr) {
        iq iqVar;
        int i10;
        float f9;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (iqVarArr == null || (iqVar = iqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            iqVar = new iq(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f9 = 0.222f;
            } else {
                f9 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            iqVar.setScale(f9, f10);
        }
        if (iqVarArr != null) {
            iqVarArr[0] = iqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(iqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, iq[] iqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, iqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f9, iq[] iqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        iq iqVar;
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
            i10 = R.drawable.mini_gram_72;
        } else {
            i10 = R.drawable.star_small_inner;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (iqVarArr == null || (iqVar = iqVarArr[0]) == null) {
            if (iqVarArr != null && iqVarArr.length > 0) {
                iqVar = new iq(i10, 0);
                iqVarArr[0] = iqVar;
            } else {
                iqVar = new iq(i10, 0);
            }
        }
        if (z10) {
            f9 *= 0.33f;
        } else {
            iqVar.recolorDrawable = false;
        }
        iqVar.setScale(f9, f9);
        spannableString.setSpan(iqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static k8 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i10;
        int currentAccount = imageReceiver.getCurrentAccount();
        final ag.d1 d1Var = new ag.d1(z10, currentAccount, str, imageReceiver, new boolean[1]);
        d1Var.run();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(currentAccount);
        if (z10) {
            i10 = NotificationCenter.didUpdateTonGiftStickers;
        } else {
            i10 = NotificationCenter.didUpdatePremiumGiftStickers;
        }
        return new k8(notificationCenter.listen(view, i10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        d1Var.run();
                        return;
                    default:
                        d1Var.run();
                        return;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        d1Var.run();
                        return;
                    default:
                        d1Var.run();
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), com.google.android.recaptcha.internal.a.k(i10, "_", i10), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.k(i10, "_", i10), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23009a7, 0.35f), 0L, null, null, 0);
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

    public static void b1(org.telegram.ui.Components.t9 t9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 1000) {
            str = "2⃣";
        } else if (j10 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        Y0(t9Var, imageReceiver, str, false);
    }

    public static k8 c1(org.telegram.ui.Components.t9 t9Var, ImageReceiver imageReceiver, int i10) {
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
        return Y0(t9Var, imageReceiver, str, false);
    }

    public static void d1(org.telegram.ui.Components.t9 t9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 10000000000L) {
            str = "2⃣";
        } else if (j10 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        Y0(t9Var, imageReceiver, str, true);
    }

    public static void e1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.c6 c6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, i7.f6.t(-1, 150, 7, 0, 0, 0, 10));
        i9 i9Var = new i9(context, 70, 0);
        frameLayout.addView(i9Var, i7.f6.c(-1.0f, -1));
        dg.i iVar = new dg.i(context, 1, 2);
        dg.a aVar = iVar.f5590b;
        aVar.f5568w = org.telegram.ui.ActionBar.g6.fk;
        aVar.f5569x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        iVar.setStarParticlesView(i9Var);
        frameLayout.addView(iVar, i7.f6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i11 = th.i(g10, textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i11.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), -6915073));
        i11.setTextColor(-1);
        i11.setTextSize(1, 11.33f);
        i11.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        i11.setGravity(17);
        i11.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i12 = boost.multiplier;
        if (i12 == 0) {
            i12 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i12));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        iq iqVar = new iq(R.drawable.mini_boost_badge, 2);
        iqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
        i11.setText(spannableStringBuilder);
        g10.addView(i11, i7.f6.t(-2, 20, 17, 20, 4, 20, 4));
        hz0 hz0Var = new hz0(context, c6Var);
        hz0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j10, new v7(f3VarArr, j10, 2));
        hz0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            g5.v vVar = new g5.v(f3VarArr, j10, boost, 4);
            f3VarArr = f3VarArr;
            hz0Var.g(string, string2, vVar);
        }
        hz0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        hz0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        g10.addView(hz0Var, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        y80 y80Var = new y80(context, c6Var);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.e(context, 7)));
        y80Var.setGravity(17);
        g10.addView(y80Var, i7.f6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new b8(f3VarArr, 1));
        g10.addView(dVar, i7.f6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        q6.customView = g10;
        f3VarArr[0] = q6;
        q6.useBackgroundTopPadding = false;
        q6.fixNavigationBar();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        iVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new o(iVar, 11));
    }

    public static w0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        kf.a resellAmount;
        kf.b bVar = kf.b.f13635a;
        if (tL_starGiftUnique == null) {
            resellAmount = kf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(kf.b.f13636b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        w0 w0Var = new w0(context, c6Var, i10, resellAmount, new ih.b1(8, callback2, r8));
        w0[] w0VarArr = {w0Var};
        w0Var.show();
        return w0VarArr[0];
    }

    public static void g1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        int i11;
        CharSequence l10;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        long j11;
        boolean z11 = false;
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        linearLayout.addView(textView, i7.f6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        uc0 uc0Var = new uc0(context, c6Var);
        uc0Var.setForceForceUseCenter(true);
        uc0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        uc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        nh.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23374uf, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23392vf, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new m8(uc0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, i7.f6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, i7.f6.o(-1, -2, 1.0f, 119));
        uc0Var.e(editTextBoldCursor);
        uc0Var.addView(linearLayout2, i7.f6.e(-1, -2, 48));
        linearLayout.addView(uc0Var, i7.f6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
        uc0Var.addView(textView2, i7.f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        y80 y80Var = new y80(context, null);
        y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.e(context, 8)), true));
        y80Var.setTextSize(1, 12.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        linearLayout.addView(y80Var, i7.f6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        o10.g(LocaleController.getString(i11), false, true);
        linearLayout.addView(o10, i7.f6.n(-1, 48));
        if (i13 > 0 && z10) {
            dVar = org.telegram.messenger.x3.o(24, context, c6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, i7.f6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        q6.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {q6};
        if (i13 <= 0) {
            l10 = "";
        } else {
            l10 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l10);
        editTextBoldCursor.addTextChangedListener(new h9(editTextBoldCursor, uc0Var, j10, z10, o10, textView2));
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
                o10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new p8(editTextBoldCursor2, f3VarArr2, 2));
                return true;
            }
        });
        o10.setOnClickListener(new o8(zArr, callback2, editTextBoldCursor, o10, f3VarArr2));
        if (dVar != null) {
            nh.d dVar2 = dVar;
            o8 o8Var = new o8(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2);
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(o8Var);
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new cg.d0(editTextBoldCursor, 4));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof tn) {
            z11 = ((tn) R).P9();
        }
        p8 p8Var = new p8(f3VarArr, editTextBoldCursor);
        if (z11) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        AndroidUtilities.runOnUIThread(p8Var, j11);
    }

    public static org.telegram.ui.ActionBar.f3 h1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final org.telegram.ui.ActionBar.c6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: jh.ia.h1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.c6):org.telegram.ui.ActionBar.f3");
    }

    public static void i1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.c6 c6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f22621id = tL_messageActionPaymentRefunded.charge.f22520id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i10, starsTransaction, c6Var);
    }

    public static void j1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.c6 c6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f22621id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i10, starsTransaction, c6Var);
    }

    public static void x0(jh.ia r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: jh.ia.x0(jh.ia, int):void");
    }

    public static void z0(ia iaVar, w41 w41Var, Boolean bool, String str) {
        if (iaVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                tc.a0(iaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) w41Var.B, new Object[0])), R.raw.stars_topup).j();
                iaVar.P.c(true);
                s7.y(iaVar.currentAccount, false).T(true);
            } else if (str != null) {
                th.r(R.string.UnknownErrorCode, new Object[]{str}, tc.a0(iaVar), R.raw.error, 36);
            }
        }
    }

    public final void H0(ArrayList arrayList, k51 k51Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        s7 y8 = s7.y(this.currentAccount, false);
        ArrayList arrayList2 = y8.v;
        w41 w41Var = new w41(-2);
        w41Var.f34293c = (cg.h0) super.r0(getParentActivity());
        arrayList.add(w41Var);
        arrayList.add(w41.k(this.Q));
        nh.d dVar = this.Z;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(w41.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(ph.f.a(-4, getThemedColor(org.telegram.ui.ActionBar.g6.uj), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(w41.B(null));
        }
        if (y8.f12790e && !arrayList2.isEmpty()) {
            th.p(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = aa.f11747a;
                w41 J = w41.J(aa.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(J);
            }
            if (y8.f12807x) {
                arrayList.add(w41.o(arrayList.size(), 33));
            } else if (!y8.f12808y) {
                w41 c3 = w41.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c3.f34305q = true;
                arrayList.add(c3);
            }
            arrayList.add(w41.B(null));
        }
        boolean O = y8.O(0);
        this.f12275a0 = O;
        if (O) {
            arrayList.add(w41.p(this.N, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(w41.l(this.O));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new ha(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.O = new cg.h0(this, context, 2);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        boolean z10 = true;
        frameLayout.setClickable(true);
        dg.i iVar = new dg.i(context, 1, 2);
        this.M = iVar;
        dg.a aVar = iVar.f5590b;
        aVar.f5568w = org.telegram.ui.ActionBar.g6.fk;
        aVar.f5569x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.f45016e);
        this.L.addView(this.M, i7.f6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.e(context, 5)), true), this.L, null);
        this.f45015c.setOverScrollMode(2);
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.f45015c.setItemAnimator(lVar);
        this.f45015c.setOnItemClickListener(new bg.o(this, 7));
        n00 n00Var = new n00(getParentActivity());
        this.P = n00Var;
        this.f45020s.addView(n00Var, i7.f6.c(-1.0f, -1));
        s7 y8 = s7.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), false, true, false);
        this.S = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        f70 f70Var = new f70(this.S, 42.0f, this.currentAccount);
        int i10 = R.raw.star_reaction;
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(42.0f), "s" + R.raw.star_reaction, AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = f70Var.f38011b;
        imageReceiver.setImageBitmap(xi0Var);
        imageReceiver.setAutoRepeat(2);
        f70Var.f38014f = false;
        f70Var.h = -AndroidUtilities.dp(3.0f);
        this.R.setSpan(f70Var, 0, 1, 33);
        this.Q.addView(this.S, i7.f6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.T = textView;
        textView.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.T.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, this.resourceProvider));
        this.Q.addView(this.T, i7.f6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        bg.x2 x2Var = new bg.x2(this, getParentActivity(), 8);
        this.V = x2Var;
        frameLayout2.addView(x2Var);
        nh.d dVar = new nh.d(getParentActivity(), this.resourceProvider, true);
        this.W = dVar;
        dVar.e();
        this.W.g("", false, true);
        this.W.setOnClickListener(new View.OnClickListener(this) {
            public final ia f12071b;

            {
                this.f12071b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        ia.B0(this.f12071b, context);
                        return;
                    default:
                        new z9(context, this.f12071b.resourceProvider).show();
                        return;
                }
            }
        });
        this.V.addView(this.W, i7.f6.e(-1, 48, 119));
        ua1 ua1Var = new ua1(this, getParentActivity(), 4);
        this.X = ua1Var;
        frameLayout2.addView(ua1Var);
        nh.d dVar2 = new nh.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new iq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Y.g(spannableStringBuilder, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final ia f12071b;

            {
                this.f12071b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        ia.B0(this.f12071b, context);
                        return;
                    default:
                        new z9(context, this.f12071b.resourceProvider).show();
                        return;
                }
            }
        });
        this.X.addView(this.Y, i7.f6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        nh.d dVar3 = new nh.d(getParentActivity(), this.resourceProvider, true);
        this.U = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new iq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.U.g(spannableStringBuilder2, false, true);
        this.U.setOnClickListener(new View.OnClickListener(this) {
            public final ia f12128b;

            {
                this.f12128b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ia iaVar = this.f12128b;
                        iaVar.presentFragment(new q(0, iaVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        ia.A0(this.f12128b);
                        return;
                }
            }
        });
        this.X.addView(this.U, i7.f6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, i7.f6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        nh.d dVar4 = new nh.d(getParentActivity(), this.resourceProvider, false);
        this.Z = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new iq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.Z.g(spannableStringBuilder3, false, true);
        this.Z.setOnClickListener(new View.OnClickListener(this) {
            public final ia f12128b;

            {
                this.f12128b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ia iaVar = this.f12128b;
                        iaVar.presentFragment(new q(0, iaVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        ia.A0(this.f12128b);
                        return;
                }
            }
        });
        this.Q.addView(this.Z, i7.f6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        j9 j9Var = this.f12277c0;
        if (j9Var != null) {
            j9Var.N(false);
        }
        b0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1((y8.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            j9 j9Var = this.f12277c0;
            if (j9Var != null) {
                j9Var.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            s7 y8 = s7.y(this.currentAccount, false);
            if (this.f12275a0 != y8.O(0)) {
                this.f12275a0 = y8.O(0);
                s0();
                j9 j9Var2 = this.f12277c0;
                if (j9Var2 != null) {
                    j9Var2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            j9 j9Var3 = this.f12277c0;
            if (j9Var3 != null) {
                j9Var3.N(true);
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
        boolean z10 = false;
        s7 y8 = s7.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) J0(y8.p(), 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        nh.d dVar = this.W;
        if (y8.p().amount > 0) {
            i10 = R.string.StarsBuyMore;
        } else {
            i10 = R.string.StarsBuy;
        }
        dVar.g(LocaleController.getString(i10), true, true);
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        float f9;
        int i10;
        float f10;
        this.f12276b0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.V.setVisibility(0);
            this.X.setVisibility(0);
            ViewPropertyAnimator animate = this.V.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final ia f12212b;

                {
                    this.f12212b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f12212b.V.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f12212b.X.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.X.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final ia f12212b;

                {
                    this.f12212b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f12212b.V.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f12212b.X.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.V.animate().cancel();
        this.X.animate().cancel();
        ua1 ua1Var = this.X;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ua1Var.setAlpha(f9);
        bg.x2 x2Var = this.V;
        if (z10) {
            f11 = 0.0f;
        }
        x2Var.setAlpha(f11);
        ua1 ua1Var2 = this.X;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ua1Var2.setVisibility(i10);
        bg.x2 x2Var2 = this.V;
        if (z10) {
            i11 = 8;
        }
        x2Var2.setVisibility(i11);
    }

    @Override
    public final f2.p0 n0() {
        j9 j9Var = new j9(this, this.f45015c, getParentActivity(), this.currentAccount, this.classGuid, new bg.t1(this, 19), getResourceProvider());
        this.f12277c0 = j9Var;
        j9Var.f29939r = false;
        return j9Var;
    }

    @Override
    public final y10 o0() {
        return new t9(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        s7.y(this.currentAccount, false).T(true);
        s7.y(this.currentAccount, false).S();
        s7.y(this.currentAccount, false).z();
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
        dg.i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        dg.i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override
    public final cg.s2 p0() {
        return new i9(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        ha haVar = this.N;
        boolean z10 = false;
        if (haVar != null && (haVar.getParent() instanceof View)) {
            if ((this.f45015c.getHeight() - this.f45015c.getPaddingBottom()) - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }
}
