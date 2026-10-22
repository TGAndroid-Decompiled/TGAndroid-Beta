package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.ApplicationLoader;
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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d70;
import org.telegram.ui.io;
import org.telegram.ui.qa1;
import org.telegram.ui.qn;
import org.telegram.ui.v10;
import org.telegram.ui.x10;
import org.telegram.ui.y10;
public final class md extends y10 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f1847h0;
    public static DecimalFormat f1848i0;
    public FrameLayout P;
    public tg.n Q;
    public ld R;
    public ic S;
    public z00 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.q6 W;
    public TextView X;
    public ei.d Y;
    public ah.x Z;
    public ei.d f1849a0;
    public qa1 f1850b0;
    public ei.d f1851c0;
    public ei.d f1852d0;
    public boolean f1853e0;
    public boolean f1854f0;
    public lc f1855g0;

    public md() {
        this.M = true;
    }

    public static void A0(md mdVar, h61 h61Var, Boolean bool, String str) {
        if (mdVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                org.telegram.ui.Components.xc.a0(mdVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h61Var.B, new Object[0])), R.raw.stars_topup).j();
                mdVar.T.c(true);
                ga.y(mdVar.currentAccount, false).T(true);
            } else if (str != null) {
                i2.e.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(mdVar), R.raw.error, 36);
            }
        }
    }

    public static void B0(md mdVar) {
        ga.y(mdVar.currentAccount, false).u();
        ug.m1.f0(1, BirthdayController.getInstance(mdVar.currentAccount).getState());
    }

    public static void C0(md mdVar, Context context) {
        if (MessagesController.getInstance(mdVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(mdVar.currentAccount);
        } else {
            new dd(context, mdVar.resourceProvider).show();
        }
    }

    public static void G0(l01 l01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.d6 d6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((i01) l01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ca0 ca0Var = new ca0(textView, AndroidUtilities.dp(90.0f), 0, d6Var);
        ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.h6.m1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ca0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final ga y3 = ga.y(i10, false);
            final long j10 = starGift.f20503id;
            final r0 r0Var = new r0(textView, 5);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    ga gaVar;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (gaVar = ga.this).J(j10)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(gaVar.f1363a).removeObserver(notificationCenterDelegateArr[0], i13);
                        r0Var.run(J);
                    }
                }
            }};
            int i11 = y3.f1363a;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
            int i12 = NotificationCenter.starGiftsLoaded;
            notificationCenter.addObserver(notificationCenterDelegate, i12);
            TL_stars.StarGift J = y3.J(j10);
            if (J != null) {
                zArr[0] = true;
                NotificationCenter.getInstance(i11).removeObserver(notificationCenterDelegateArr[0], i12);
                r0Var.run(J);
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

    public static void H0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new gc(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount) {
        return K0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (f1848i0 == null) {
            f1848i0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f1848i0.format(j10 / 1.0E9d);
                spannableStringBuilder.append((CharSequence) format);
                int indexOf = format.indexOf(".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (starsAmount.negative()) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
            if (i11 < 0 && j11 > 0) {
                i10 = -1;
                d = 1.0E9d;
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
                sb3.append(LocaleController.formatNumber(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f1848i0;
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
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(LocaleController.formatNumber(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        boolean z10;
        if (f1848i0 == null) {
            f1848i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f1848i0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
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
                sb2.append(LocaleController.formatNumber(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f1848i0;
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
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
                    }
                }
            } else if (starsAmount.amount <= 1000) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(LocaleController.formatNumber(Math.abs(j11), c10));
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

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f1848i0 == null) {
                f1848i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f1848i0.format(starsAmount.amount / 1.0E9d);
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
            if (f1848i0 == null) {
                f1848i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f1848i0;
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

    public static String N0(long j10) {
        String str;
        if (f1847h0 == null) {
            f1847h0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f1847h0.format(j10 / 1.0E9d);
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

    public static java.lang.String O0(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: ai.md.O0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f7) {
        return Q0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f7, float f10, float f11) {
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
        yq yqVar = new yq(R.drawable.diamond, 0);
        yqVar.recolorDrawable = false;
        yqVar.translate(0.0f, f10);
        yqVar.spaceScaleX = f11;
        yqVar.setScale(f7, f7);
        spannableString.setSpan(yqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder R0(CharSequence charSequence) {
        return S0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f7, yq[] yqVarArr) {
        return V0(false, charSequence, f7, yqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, boolean z10) {
        return V0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return V0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(boolean z10, CharSequence charSequence, float f7, yq[] yqVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        yq yqVar;
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
        if (yqVarArr == null || (yqVar = yqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            yqVar = new yq(i10, 0);
            if (yqVarArr != null) {
                yqVarArr[0] = yqVar;
            }
        }
        yqVar.translate(0.0f, f10);
        yqVar.spaceScaleX = f11;
        if (z10) {
            yqVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            yqVar.setScale(f12, f12);
        } else {
            yqVar.setScale(f7, f7);
        }
        spannableString.setSpan(yqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(boolean z10, String str, yq[] yqVarArr) {
        yq yqVar;
        int i10;
        float f7;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (yqVarArr == null || (yqVar = yqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            yqVar = new yq(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f7 = 0.222f;
            } else {
                f7 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            yqVar.setScale(f7, f10);
        }
        if (z10) {
            yqVar.recolorDrawable = false;
        }
        if (yqVarArr != null) {
            yqVarArr[0] = yqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(yqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder X0(TL_stars.StarsAmount starsAmount, String str, yq[] yqVarArr) {
        return Y0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, yqVarArr);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f7, yq[] yqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        yq yqVar;
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
        if (yqVarArr == null || (yqVar = yqVarArr[0]) == null) {
            if (yqVarArr != null && yqVarArr.length > 0) {
                yqVar = new yq(i10, 0);
                yqVarArr[0] = yqVar;
            } else {
                yqVar = new yq(i10, 0);
            }
        }
        yqVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        yqVar.setScale(f7, f7);
        spannableString.setSpan(yqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static fb Z0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i10;
        int currentAccount = imageReceiver.getCurrentAccount();
        final db dbVar = new db(z10, currentAccount, str, imageReceiver, new boolean[1]);
        dbVar.run();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(currentAccount);
        if (z10) {
            i10 = NotificationCenter.didUpdateTonGiftStickers;
        } else {
            i10 = NotificationCenter.didUpdatePremiumGiftStickers;
        }
        return new fb(notificationCenter.listen(view, i10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        dbVar.run();
                        return;
                    default:
                        dbVar.run();
                        return;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        dbVar.run();
                        return;
                    default:
                        dbVar.run();
                        return;
                }
            }
        }), 0);
    }

    public static void a1(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f20935a7, 0.35f), 0L, null, null, 0);
    }

    public static void b1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        a1(imageReceiver, document, i10);
    }

    public static void c1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 1000) {
            str = "2⃣";
        } else if (j10 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        Z0(w9Var, imageReceiver, str, false);
    }

    public static fb d1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, int i10) {
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
        return Z0(w9Var, imageReceiver, str, false);
    }

    public static void e1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 10000000000L) {
            str = "2⃣";
        } else if (j10 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        Z0(w9Var, imageReceiver, str, true);
    }

    public static void f1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.d6 d6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i11 = ok.i(1, context, d6Var, false);
        LinearLayout e = ok.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e.addView(frameLayout, w7.z5.t(-1, 150, 7, 0, 0, 0, 10));
        kc kcVar = new kc(context, 70, 0);
        frameLayout.addView(kcVar, w7.z5.c(-1.0f, -1));
        tg.n nVar = new tg.n(context, 1, 2);
        tg.g gVar = nVar.f47111b;
        gVar.f47095z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        nVar.setStarParticlesView(kcVar);
        frameLayout.addView(nVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.c1.r(org.telegram.ui.ActionBar.h6.f21099j5, d6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        i12.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), -6915073));
        i12.setTextColor(-1);
        i12.setTextSize(1, 11.33f);
        i12.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        i12.setGravity(17);
        i12.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i13 = boost.multiplier;
        if (i13 == 0) {
            i13 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        yq yqVar = new yq(R.drawable.mini_boost_badge, 2);
        yqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
        i12.setText(spannableStringBuilder);
        e.addView(i12, w7.z5.t(-2, 20, 17, 20, 4, 20, 4));
        l01 l01Var = new l01(context, d6Var);
        l01Var.n(LocaleController.getString(R.string.BoostFrom), i10, j10, new ka(f3VarArr, j10, 2));
        l01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            a3.i0 i0Var = new a3.i0(f3VarArr, j10, boost, 3);
            f3VarArr = f3VarArr;
            l01Var.i(string, string2, i0Var);
        }
        l01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        l01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        e.addView(l01Var, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        x90 x90Var = new x90(context, d6Var);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21398z6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21052gc, d6Var));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ra(context, 3)));
        x90Var.setGravity(17);
        e.addView(x90Var, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ei.d dVar = new ei.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new sa(f3VarArr, 1));
        e.addView(dVar, w7.z5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = e;
        f3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new a3.d(nVar, 20));
    }

    public static l1 g1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        ag.a resellAmount;
        ag.b bVar = ag.b.f633a;
        if (tL_starGiftUnique == null) {
            resellAmount = ag.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(ag.b.f634b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        l1 l1Var = new l1(context, d6Var, i10, resellAmount, new o2(5, callback2, r8));
        l1[] l1VarArr = {l1Var};
        l1Var.show();
        return l1VarArr[0];
    }

    public static void h1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        int i11;
        CharSequence l4;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        long j11;
        boolean z11 = false;
        org.telegram.ui.ActionBar.f3 i12 = ok.i(1, context, d6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        ok.j(20.0f, R.string.PaidContentTitle, 1, textView);
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        linearLayout.addView(textView, w7.z5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        sd0 sd0Var = new sd0(context, d6Var);
        sd0Var.setForceForceUseCenter(true);
        sd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        sd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        ei.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21317uf, d6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21335vf, d6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new hb(sd0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.z5.o(-1, -2, 1.0f, 119));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(linearLayout2, w7.z5.e(-1, -2, 48));
        linearLayout.addView(sd0Var, w7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A6, false));
        sd0Var.addView(textView2, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        x90 x90Var = new x90(context, null);
        x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new ra(context, 4)), true));
        x90Var.setTextSize(1, 12.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21398z6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21052gc, d6Var));
        linearLayout.addView(x90Var, w7.z5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ei.d f7 = ok.f(24, context, d6Var, true);
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        f7.g(LocaleController.getString(i11), false, true);
        linearLayout.addView(f7, w7.z5.n(-1, 48));
        if (i14 > 0 && z10) {
            dVar = ok.f(24, context, d6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i12.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {i12};
        if (i14 <= 0) {
            l4 = "";
        } else {
            l4 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l4);
        editTextBoldCursor.addTextChangedListener(new hc(editTextBoldCursor, sd0Var, j10, z10, f7, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                if (i15 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                f7.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new kb(editTextBoldCursor2, f3VarArr2, 2));
                return true;
            }
        });
        f7.setOnClickListener(new jb(zArr, callback2, editTextBoldCursor, f7, f3VarArr2));
        if (dVar != null) {
            ei.d dVar2 = dVar;
            jb jbVar = new jb(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2);
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(jbVar);
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new bb(editTextBoldCursor, 1));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof qn) {
            z11 = ((qn) R).U9();
        }
        kb kbVar = new kb(f3VarArr, editTextBoldCursor);
        if (z11) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        AndroidUtilities.runOnUIThread(kbVar, j11);
    }

    public static org.telegram.ui.ActionBar.f3 i1(final android.content.Context r59, final boolean r60, final long r61, final int r63, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r64, final org.telegram.ui.ActionBar.d6 r65) {
        throw new UnsupportedOperationException("Method not decompiled: ai.md.i1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.d6):org.telegram.ui.ActionBar.f3");
    }

    public static void j1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.d6 d6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f20505id = tL_messageActionPaymentRefunded.charge.f20407id;
        starsTransaction.refund = true;
        i1(activity, false, 0L, i10, starsTransaction, d6Var);
    }

    public static void k1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.d6 d6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f20505id = tL_payments_paymentReceiptStars.transaction_id;
        i1(context, false, 0L, i10, starsTransaction, d6Var);
    }

    public static CharSequence n1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        yq[] yqVarArr;
        x4.o c10;
        if (z10 && com.google.android.gms.internal.play_billing.k3.s(spannableStringBuilder)) {
            for (yq yqVar : (yq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yq.class)) {
                Drawable drawable = yqVar.drawable;
                if (drawable != null && !(drawable instanceof x4.o) && (c10 = x4.o.c(ApplicationLoader.applicationContext.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(yqVar.drawable.getBounds());
                    yqVar.drawable = c10;
                    yqVar.recolorDrawable = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void y0(ai.md r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: ai.md.y0(ai.md, int):void");
    }

    public final void I0(ArrayList arrayList, u61 u61Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        ga y3 = ga.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        h61 h61Var = new h61(-2);
        h61Var.f26779c = (v10) super.r0(getParentActivity());
        arrayList.add(h61Var);
        arrayList.add(h61.k(this.U));
        ei.d dVar = this.f1852d0;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(h61.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(gi.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.h6.uj), R.drawable.filled_earn_stars, io.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(h61.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            i2.e.p(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = ed.f1238a;
                h61 J = h61.J(ed.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(J);
            }
            if (y3.f1382x) {
                arrayList.add(h61.o(arrayList.size(), 33));
            } else if (!y3.f1383y) {
                h61 c10 = h61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.f26790q = true;
                arrayList.add(c10);
            }
            arrayList.add(h61.B(null));
        }
        boolean O = y3.O(0);
        this.f1853e0 = O;
        if (O) {
            arrayList.add(h61.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(h61.l(this.S));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new ld(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new ic(this, context, 0);
        super.createView(context);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        boolean z10 = true;
        frameLayout.setClickable(true);
        tg.n nVar = new tg.n(context, 1, 2);
        this.Q = nVar;
        tg.g gVar = nVar.f47111b;
        gVar.f47095z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, w7.z5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new ra(context, 1)), true), this.P, null);
        this.f43328c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.f45954m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.f43328c.setItemAnimator(kVar);
        this.f43328c.setOnItemClickListener(new wa(this, 0));
        z00 z00Var = new z00(getParentActivity());
        this.T = z00Var;
        this.f43332s.addView(z00Var, w7.z5.c(-1.0f, -1));
        ga y3 = ga.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), false, true, false);
        this.W = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        d70 d70Var = new d70(this.W, 42.0f, this.currentAccount);
        vj0 vj0Var = new vj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = d70Var.f36284b;
        imageReceiver.setImageBitmap(vj0Var);
        imageReceiver.setAutoRepeat(2);
        d70Var.f36286f = false;
        d70Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(d70Var, 0, 1, 33);
        this.U.addView(this.W, w7.z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21398z6, this.resourceProvider));
        this.U.addView(this.X, w7.z5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ah.x xVar = new ah.x(this, getParentActivity(), 2);
        this.Z = xVar;
        frameLayout2.addView(xVar);
        ei.d dVar = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.f1849a0 = dVar;
        dVar.e();
        this.f1849a0.g("", false, true);
        this.f1849a0.setOnClickListener(new View.OnClickListener(this) {
            public final md f2455b;

            {
                this.f2455b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        md.C0(this.f2455b, context);
                        return;
                    default:
                        new dd(context, this.f2455b.resourceProvider).show();
                        return;
                }
            }
        });
        this.Z.addView(this.f1849a0, w7.z5.e(-1, 48, 119));
        qa1 qa1Var = new qa1(this, getParentActivity(), 2);
        this.f1850b0 = qa1Var;
        frameLayout2.addView(qa1Var);
        ei.d dVar2 = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.f1851c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new yq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.f1851c0.g(spannableStringBuilder, false, true);
        this.f1851c0.setOnClickListener(new View.OnClickListener(this) {
            public final md f2455b;

            {
                this.f2455b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        md.C0(this.f2455b, context);
                        return;
                    default:
                        new dd(context, this.f2455b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f1850b0.addView(this.f1851c0, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ei.d dVar3 = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new yq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final md f2511b;

            {
                this.f2511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        md mdVar = this.f2511b;
                        mdVar.presentFragment(new x(0, mdVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        md.B0(this.f2511b);
                        return;
                }
            }
        });
        this.f1850b0.addView(this.Y, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.z5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ei.d dVar4 = new ei.d(getParentActivity(), this.resourceProvider, false);
        this.f1852d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new yq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f1852d0.g(spannableStringBuilder3, false, true);
        this.f1852d0.setOnClickListener(new View.OnClickListener(this) {
            public final md f2511b;

            {
                this.f2511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        md mdVar = this.f2511b;
                        mdVar.presentFragment(new x(0, mdVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        md.B0(this.f2511b);
                        return;
                }
            }
        });
        this.U.addView(this.f1852d0, w7.z5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        l1();
        lc lcVar = this.f1855g0;
        if (lcVar != null) {
            lcVar.N(false);
        }
        k0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = k0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (y3.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = false;
        }
        m1(z10, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            lc lcVar = this.f1855g0;
            if (lcVar != null) {
                lcVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            ga y3 = ga.y(this.currentAccount, false);
            if (this.f1853e0 != y3.O(0)) {
                this.f1853e0 = y3.O(0);
                t0();
                lc lcVar2 = this.f1855g0;
                if (lcVar2 != null) {
                    lcVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            lc lcVar3 = this.f1855g0;
            if (lcVar3 != null) {
                lcVar3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            l1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            l1();
        }
    }

    public final void l1() {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        ga y3 = ga.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) K0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        ei.d dVar = this.f1849a0;
        if (y3.p().amount > 0) {
            i10 = R.string.StarsBuyMore;
        } else {
            i10 = R.string.StarsBuy;
        }
        dVar.g(LocaleController.getString(i10), true, true);
        TLRPC.TL_payments_starsRevenueStats h = k0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        m1(z10, true);
    }

    public final void m1(final boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        this.f1854f0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.Z.setVisibility(0);
            this.f1850b0.setVisibility(0);
            ViewPropertyAnimator animate = this.Z.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final md f2550b;

                {
                    this.f2550b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f2550b.Z.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f2550b.f1850b0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f1850b0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final md f2550b;

                {
                    this.f2550b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f2550b.Z.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f2550b.f1850b0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.Z.animate().cancel();
        this.f1850b0.animate().cancel();
        qa1 qa1Var = this.f1850b0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        qa1Var.setAlpha(f7);
        ah.x xVar = this.Z;
        if (z10) {
            f11 = 0.0f;
        }
        xVar.setAlpha(f11);
        qa1 qa1Var2 = this.f1850b0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        qa1Var2.setVisibility(i10);
        ah.x xVar2 = this.Z;
        if (z10) {
            i11 = 8;
        }
        xVar2.setVisibility(i11);
    }

    @Override
    public final s4.g0 n0() {
        lc lcVar = new lc(this, this.f43328c, getParentActivity(), this.currentAccount, this.classGuid, new q(this, 6), getResourceProvider());
        this.f1855g0 = lcVar;
        lcVar.f30864r = false;
        return lcVar;
    }

    @Override
    public final x10 o0() {
        return new wc(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        ga.y(this.currentAccount, false).T(true);
        ga.y(this.currentAccount, false).S();
        ga.y(this.currentAccount, false).z();
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
        tg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override
    public final sg.x1 p0() {
        return new kc(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        ld ldVar = this.R;
        boolean z10 = false;
        if (ldVar != null && (ldVar.getParent() instanceof View)) {
            if ((this.f43328c.getHeight() - this.f43328c.getPaddingBottom()) - ((View) this.R.getParent()).getBottom() >= 0) {
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
