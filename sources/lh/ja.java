package lh;

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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.m20;
import org.telegram.ui.n20;
import org.telegram.ui.pb1;
import org.telegram.ui.r70;
import org.telegram.ui.ro;
import org.telegram.ui.zn;
public final class ja extends n20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f12667e0;
    public static DecimalFormat f12668f0;
    public FrameLayout M;
    public fg.i N;
    public ia O;
    public eg.h0 P;
    public s00 Q;
    public LinearLayout R;
    public SpannableStringBuilder S;
    public org.telegram.ui.Components.k6 T;
    public TextView U;
    public ph.d V;
    public dg.u2 W;
    public ph.d X;
    public pb1 Y;
    public ph.d Z;
    public ph.d f12669a0;
    public boolean f12670b0;
    public boolean f12671c0;
    public k9 f12672d0;

    public ja() {
        this.J = true;
    }

    public static void A0(ja jaVar) {
        t7.y(jaVar.currentAccount, false).u();
        gg.v2.e0(1, BirthdayController.getInstance(jaVar.currentAccount).getState());
    }

    public static void B0(ja jaVar, Context context) {
        if (MessagesController.getInstance(jaVar.currentAccount).isFrozen()) {
            org.telegram.ui.c.b(jaVar.currentAccount);
        } else {
            new aa(context, jaVar.resourceProvider).show();
        }
    }

    public static void F0(sz0 sz0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((pz0) sz0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        k90 k90Var = new k90(textView, AndroidUtilities.dp(90.0f), 0, f6Var);
        k90Var.a(org.telegram.ui.ActionBar.j6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.j6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(k90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final t7 y10 = t7.y(i10, false);
            final long j10 = starGift.f19384id;
            final cg.h0 h0Var = new cg.h0(textView, 23);
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
                        NotificationCenter.getInstance(t7Var.f13133a).removeObserver(notificationCenterDelegateArr[0], i13);
                        h0Var.run(J);
                    }
                }
            }};
            int i11 = y10.f13133a;
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
        if (f12668f0 == null) {
            f12668f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f12668f0.format(j10 / 1.0E9d);
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
                DecimalFormat decimalFormat = f12668f0;
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
        if (f12668f0 == null) {
            f12668f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f12668f0.format(starsAmount.amount / 1.0E9d);
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
                DecimalFormat decimalFormat = f12668f0;
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
            if (f12668f0 == null) {
                f12668f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f12668f0.format(starsAmount.amount / 1.0E9d);
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
            if (f12668f0 == null) {
                f12668f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f12668f0;
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
        if (f12667e0 == null) {
            f12667e0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f12667e0.format(j10 / 1.0E9d);
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
        throw new UnsupportedOperationException("Method not decompiled: lh.ja.N0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
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
        lq lqVar = new lq(R.drawable.diamond, 0);
        lqVar.recolorDrawable = false;
        lqVar.translate(0.0f, f11);
        lqVar.spaceScaleX = f12;
        lqVar.setScale(f10, f10);
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10, lq[] lqVarArr) {
        return U0(false, charSequence, f10, lqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z4) {
        return U0(z4, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z4, CharSequence charSequence, float f10, lq[] lqVarArr, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        lq lqVar;
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
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            if (z4) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            lqVar = new lq(i10, 0);
            if (lqVarArr != null) {
                lqVarArr[0] = lqVar;
            }
        }
        lqVar.translate(0.0f, f11);
        lqVar.spaceScaleX = f12;
        if (z4) {
            float f13 = f10 * 0.2f;
            lqVar.setScale(f13, f13);
        } else {
            lqVar.setScale(f10, f10);
        }
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z4, String str, lq[] lqVarArr) {
        lq lqVar;
        int i10;
        float f10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            if (z4) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            lqVar = new lq(i10, 0);
            float f11 = 1.13f;
            if (z4) {
                f10 = 0.222f;
            } else {
                f10 = 1.13f;
            }
            if (z4) {
                f11 = 0.222f;
            }
            lqVar.setScale(f10, f11);
        }
        if (lqVarArr != null) {
            lqVarArr[0] = lqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, lq[] lqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, lqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z4, CharSequence charSequence, float f10, lq[] lqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        lq lqVar;
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
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            if (lqVarArr != null && lqVarArr.length > 0) {
                lqVar = new lq(i10, 0);
                lqVarArr[0] = lqVar;
            } else {
                lqVar = new lq(i10, 0);
            }
        }
        if (z4) {
            f10 *= 0.33f;
        } else {
            lqVar.recolorDrawable = false;
        }
        lqVar.setScale(f10, f10);
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
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
        final cg.b1 b1Var = new cg.b1(z4, currentAccount, str, imageReceiver, new boolean[1]);
        b1Var.run();
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
                        b1Var.run();
                        return;
                    default:
                        b1Var.run();
                        return;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        b1Var.run();
                        return;
                    default:
                        b1Var.run();
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), e2.c.h(i10, "_", i10), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i10), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f19827a7, 0.35f), 0L, null, null, 0);
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

    public static void e1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, k7.b6.t(-1, 150, 7, 0, 0, 0, 10));
        j9 j9Var = new j9(context, 70, 0);
        frameLayout.addView(j9Var, k7.b6.c(-1.0f, -1));
        fg.i iVar = new fg.i(context, 1, 2);
        fg.a aVar = iVar.f6156b;
        aVar.f6135w = org.telegram.ui.ActionBar.j6.fk;
        aVar.f6136x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        iVar.setStarParticlesView(j9Var);
        frameLayout.addView(iVar, k7.b6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.f19987j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i11 = ai.i(f10, textView, k7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i11.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), -6915073));
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
        lq lqVar = new lq(R.drawable.mini_boost_badge, 2);
        lqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
        i11.setText(spannableStringBuilder);
        f10.addView(i11, k7.b6.t(-2, 20, 17, 20, 4, 20, 4));
        sz0 sz0Var = new sz0(context, f6Var);
        sz0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j10, new w7(g3VarArr, j10, 2));
        sz0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            i5.v vVar = new i5.v(g3VarArr, j10, boost, 4);
            g3VarArr = g3VarArr;
            sz0Var.g(string, string2, vVar);
        }
        sz0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        sz0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f10.addView(sz0Var, k7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        f90 f90Var = new f90(context, f6Var);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20273z6, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, f6Var));
        f90Var.setTextSize(1, 14.0f);
        f90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.f(context, 7)));
        f90Var.setGravity(17);
        f10.addView(f90Var, k7.b6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new c8(g3VarArr, 1));
        f10.addView(dVar, k7.b6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        o10.customView = f10;
        g3VarArr[0] = o10;
        o10.useBackgroundTopPadding = false;
        o10.fixNavigationBar();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            g3VarArr[0].makeAttached(U);
        }
        iVar.setPaused(false);
        g3VarArr[0].show();
        g3VarArr[0].setOnDismissListener(new b(iVar, 12));
    }

    public static w0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        lf.a resellAmount;
        lf.b bVar = lf.b.f12056a;
        if (tL_starGiftUnique == null) {
            resellAmount = lf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(lf.b.f12057b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        w0 w0Var = new w0(context, f6Var, i10, resellAmount, new kh.a1(8, callback2, r8));
        w0[] w0VarArr = {w0Var};
        w0Var.show();
        return w0VarArr[0];
    }

    public static void g1(Context context, long j10, boolean z4, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        CharSequence l10;
        org.telegram.ui.ActionBar.g3[] g3VarArr;
        long j11;
        boolean z10 = false;
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        linearLayout.addView(textView, k7.b6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        bd0 bd0Var = new bd0(context, f6Var);
        bd0Var.setForceForceUseCenter(true);
        bd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        bd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        ph.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20191uf, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20209vf, f6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new n8(bd0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, k7.b6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, k7.b6.o(-1, -2, 1.0f, 119));
        bd0Var.e(editTextBoldCursor);
        bd0Var.addView(linearLayout2, k7.b6.e(-1, -2, 48));
        linearLayout.addView(bd0Var, k7.b6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
        bd0Var.addView(textView2, k7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        f90 f90Var = new f90(context, null);
        f90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.f(context, 8)), true));
        f90Var.setTextSize(1, 12.0f);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20273z6, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, f6Var));
        linearLayout.addView(f90Var, k7.b6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        p10.g(LocaleController.getString(i11), false, true);
        linearLayout.addView(p10, k7.b6.n(-1, 48));
        if (i13 > 0 && z4) {
            dVar = org.telegram.messenger.y3.p(24, context, f6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, k7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        o10.customView = linearLayout;
        final org.telegram.ui.ActionBar.g3[] g3VarArr2 = {o10};
        if (i13 <= 0) {
            l10 = "";
        } else {
            l10 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l10);
        editTextBoldCursor.addTextChangedListener(new i9(editTextBoldCursor, bd0Var, j10, z4, p10, textView2));
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
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new q8(editTextBoldCursor2, g3VarArr2, 2));
                return true;
            }
        });
        p10.setOnClickListener(new p8(zArr, callback2, editTextBoldCursor, p10, g3VarArr2));
        if (dVar != null) {
            ph.d dVar2 = dVar;
            p8 p8Var = new p8(zArr, callback2, dVar2, editTextBoldCursor, g3VarArr2);
            g3VarArr = g3VarArr2;
            dVar2.setOnClickListener(p8Var);
        } else {
            g3VarArr = g3VarArr2;
        }
        g3VarArr[0].fixNavigationBar();
        g3VarArr[0].setOnDismissListener(new eg.d0(editTextBoldCursor, 4));
        g3VarArr[0].show();
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof zn) {
            z10 = ((zn) R).P9();
        }
        q8 q8Var = new q8(g3VarArr, editTextBoldCursor);
        if (z10) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        AndroidUtilities.runOnUIThread(q8Var, j11);
    }

    public static org.telegram.ui.ActionBar.g3 h1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final org.telegram.ui.ActionBar.f6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: lh.ja.h1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.f6):org.telegram.ui.ActionBar.g3");
    }

    public static void i1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f19386id = tL_messageActionPaymentRefunded.charge.f19287id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i10, starsTransaction, f6Var);
    }

    public static void j1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f19386id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i10, starsTransaction, f6Var);
    }

    public static void x0(lh.ja r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: lh.ja.x0(lh.ja, int):void");
    }

    public static void z0(ja jaVar, i51 i51Var, Boolean bool, String str) {
        if (jaVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                qc.a0(jaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) i51Var.B, new Object[0])), R.raw.stars_topup).j();
                jaVar.Q.c(true);
                t7.y(jaVar.currentAccount, false).T(true);
            } else if (str != null) {
                ai.r(R.string.UnknownErrorCode, new Object[]{str}, qc.a0(jaVar), R.raw.error, 36);
            }
        }
    }

    public final void H0(ArrayList arrayList, w51 w51Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        t7 y10 = t7.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        i51 i51Var = new i51(-2);
        i51Var.f25579c = (eg.h0) super.r0(getParentActivity());
        arrayList.add(i51Var);
        arrayList.add(i51.k(this.R));
        ph.d dVar = this.f12669a0;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(i51.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(rh.f.a(-4, getThemedColor(org.telegram.ui.ActionBar.j6.uj), R.drawable.filled_earn_stars, ro.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(i51.B(null));
        }
        if (y10.e && !arrayList2.isEmpty()) {
            ai.q(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = ba.f12161a;
                i51 J = i51.J(ba.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(J);
            }
            if (y10.f13152x) {
                arrayList.add(i51.o(arrayList.size(), 33));
            } else if (!y10.f13153y) {
                i51 c3 = i51.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c3.f25590q = true;
                arrayList.add(c3);
            }
            arrayList.add(i51.B(null));
        }
        boolean O = y10.O(0);
        this.f12670b0 = O;
        if (O) {
            arrayList.add(i51.p(this.O, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(i51.l(this.P));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        this.O = new ia(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.P = new eg.h0(this, context, 2);
        super.createView(context);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        boolean z4 = true;
        frameLayout.setClickable(true);
        fg.i iVar = new fg.i(context, 1, 2);
        this.N = iVar;
        fg.a aVar = iVar.f6156b;
        aVar.f6135w = org.telegram.ui.ActionBar.j6.fk;
        aVar.f6136x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.e);
        this.M.addView(this.N, k7.b6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.f(context, 5)), true), this.M, null);
        this.f36318c.setOverScrollMode(2);
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.f36318c.setItemAnimator(lVar);
        this.f36318c.setOnItemClickListener(new dg.n(this, 7));
        s00 s00Var = new s00(getParentActivity());
        this.Q = s00Var;
        this.f36322s.addView(s00Var, k7.b6.c(-1.0f, -1));
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
        this.T.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.resourceProvider));
        this.S = new SpannableStringBuilder("S");
        r70 r70Var = new r70(this.T, 42.0f, this.currentAccount);
        gj0 gj0Var = new gj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = r70Var.f37725b;
        imageReceiver.setImageBitmap(gj0Var);
        imageReceiver.setAutoRepeat(2);
        r70Var.f37727f = false;
        r70Var.h = -AndroidUtilities.dp(3.0f);
        this.S.setSpan(r70Var, 0, 1, 33);
        this.R.addView(this.T, k7.b6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.U = textView;
        textView.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.U.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20273z6, this.resourceProvider));
        this.R.addView(this.U, k7.b6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        dg.u2 u2Var = new dg.u2(this, getParentActivity(), 8);
        this.W = u2Var;
        frameLayout2.addView(u2Var);
        ph.d dVar = new ph.d(getParentActivity(), this.resourceProvider, true);
        this.X = dVar;
        dVar.e();
        this.X.g("", false, true);
        this.X.setOnClickListener(new View.OnClickListener(this) {
            public final ja f12494b;

            {
                this.f12494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        ja.B0(this.f12494b, context);
                        return;
                    default:
                        new aa(context, this.f12494b.resourceProvider).show();
                        return;
                }
            }
        });
        this.W.addView(this.X, k7.b6.e(-1, 48, 119));
        pb1 pb1Var = new pb1(this, getParentActivity(), 4);
        this.Y = pb1Var;
        frameLayout2.addView(pb1Var);
        ph.d dVar2 = new ph.d(getParentActivity(), this.resourceProvider, true);
        this.Z = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new lq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Z.g(spannableStringBuilder, false, true);
        this.Z.setOnClickListener(new View.OnClickListener(this) {
            public final ja f12494b;

            {
                this.f12494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        ja.B0(this.f12494b, context);
                        return;
                    default:
                        new aa(context, this.f12494b.resourceProvider).show();
                        return;
                }
            }
        });
        this.Y.addView(this.Z, k7.b6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ph.d dVar3 = new ph.d(getParentActivity(), this.resourceProvider, true);
        this.V = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new lq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.V.g(spannableStringBuilder2, false, true);
        this.V.setOnClickListener(new View.OnClickListener(this) {
            public final ja f12544b;

            {
                this.f12544b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ja jaVar = this.f12544b;
                        jaVar.presentFragment(new q(0, jaVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        ja.A0(this.f12544b);
                        return;
                }
            }
        });
        this.Y.addView(this.V, k7.b6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.R.addView(frameLayout2, k7.b6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ph.d dVar4 = new ph.d(getParentActivity(), this.resourceProvider, false);
        this.f12669a0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new lq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f12669a0.g(spannableStringBuilder3, false, true);
        this.f12669a0.setOnClickListener(new View.OnClickListener(this) {
            public final ja f12544b;

            {
                this.f12544b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ja jaVar = this.f12544b;
                        jaVar.presentFragment(new q(0, jaVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        ja.A0(this.f12544b);
                        return;
                }
            }
        });
        this.R.addView(this.f12669a0, k7.b6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        k9 k9Var = this.f12672d0;
        if (k9Var != null) {
            k9Var.N(false);
        }
        b0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1((y10.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            k9 k9Var = this.f12672d0;
            if (k9Var != null) {
                k9Var.N(true);
            }
            if (this.K == 0 && this.L < 0) {
                this.L = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            t7 y10 = t7.y(this.currentAccount, false);
            if (this.f12670b0 != y10.O(0)) {
                this.f12670b0 = y10.O(0);
                s0();
                k9 k9Var2 = this.f12672d0;
                if (k9Var2 != null) {
                    k9Var2.N(true);
                }
                if (this.K == 0 && this.L < 0) {
                    this.L = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            k9 k9Var3 = this.f12672d0;
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
        ph.d dVar = this.X;
        if (y10.p().amount > 0) {
            i10 = R.string.StarsBuyMore;
        } else {
            i10 = R.string.StarsBuy;
        }
        dVar.g(LocaleController.getString(i10), true, true);
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z4 = true;
        }
        l1(z4, true);
    }

    public final void l1(final boolean z4, boolean z10) {
        float f10;
        int i10;
        float f11;
        this.f12671c0 = z4;
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
                public final ja f12604b;

                {
                    this.f12604b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z4) {
                                this.f12604b.W.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z4) {
                                this.f12604b.Y.setVisibility(8);
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
                public final ja f12604b;

                {
                    this.f12604b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z4) {
                                this.f12604b.W.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z4) {
                                this.f12604b.Y.setVisibility(8);
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
        pb1 pb1Var = this.Y;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        pb1Var.setAlpha(f10);
        dg.u2 u2Var = this.W;
        if (z4) {
            f12 = 0.0f;
        }
        u2Var.setAlpha(f12);
        pb1 pb1Var2 = this.Y;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        pb1Var2.setVisibility(i10);
        dg.u2 u2Var2 = this.W;
        if (z4) {
            i11 = 8;
        }
        u2Var2.setVisibility(i11);
    }

    @Override
    public final f2.o0 n0() {
        k9 k9Var = new k9(this, this.f36318c, getParentActivity(), this.currentAccount, this.classGuid, new dg.r1(this, 19), getResourceProvider());
        this.f12672d0 = k9Var;
        k9Var.f30148r = false;
        return k9Var;
    }

    @Override
    public final m20 o0() {
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
        fg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override
    public final eg.q2 p0() {
        return new j9(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        ia iaVar = this.O;
        boolean z4 = false;
        if (iaVar != null && (iaVar.getParent() instanceof View)) {
            if ((this.f36318c.getHeight() - this.f36318c.getPaddingBottom()) - ((View) this.O.getParent()).getBottom() >= 0) {
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
