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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a20;
import org.telegram.ui.b20;
import org.telegram.ui.h70;
import org.telegram.ui.ko;
import org.telegram.ui.sn;
import org.telegram.ui.va1;
public final class nd extends b20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f1910j0;
    public static DecimalFormat f1911k0;
    public FrameLayout R;
    public tg.n S;
    public md T;
    public jc U;
    public z00 V;
    public LinearLayout W;
    public SpannableStringBuilder X;
    public org.telegram.ui.Components.q6 Y;
    public TextView Z;
    public ei.d f1912a0;
    public ah.x f1913b0;
    public ei.d f1914c0;
    public va1 f1915d0;
    public ei.d f1916e0;
    public ei.d f1917f0;
    public boolean f1918g0;
    public boolean f1919h0;
    public mc f1920i0;

    public nd() {
        this.M = true;
    }

    public static void A0(nd ndVar, m61 m61Var, Boolean bool, String str) {
        if (ndVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                org.telegram.ui.Components.xc.a0(ndVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) m61Var.B, new Object[0])), R.raw.stars_topup).j();
                ndVar.V.c(true);
                ha.y(ndVar.currentAccount, false).T(true);
            } else if (str != null) {
                i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(ndVar), R.raw.error, 36);
            }
        }
    }

    public static void B0(nd ndVar) {
        ha.y(ndVar.currentAccount, false).u();
        ug.l1.e0(1, BirthdayController.getInstance(ndVar.currentAccount).getState());
    }

    public static void C0(nd ndVar, Context context) {
        if (MessagesController.getInstance(ndVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(ndVar.currentAccount);
        } else {
            new ed(context, ndVar.resourceProvider).show();
        }
    }

    public static void G0(o01 o01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.g6 g6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((l01) o01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        da0 da0Var = new da0(textView, AndroidUtilities.dp(90.0f), 0, g6Var);
        da0Var.a(org.telegram.ui.ActionBar.k6.o1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.k6.o1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(da0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final ha y3 = ha.y(i10, false);
            final long j10 = starGift.f20567id;
            final r0 r0Var = new r0(textView, 5);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    ha haVar;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (haVar = ha.this).J(j10)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(haVar.f1413a).removeObserver(notificationCenterDelegateArr[0], i13);
                        r0Var.run(J);
                    }
                }
            }};
            int i11 = y3.f1413a;
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
        spannableString.setSpan(new hc(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount) {
        return K0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (f1911k0 == null) {
            f1911k0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f1911k0.format(j10 / 1.0E9d);
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
                DecimalFormat decimalFormat = f1911k0;
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
        if (f1911k0 == null) {
            f1911k0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f1911k0.format(starsAmount.amount / 1.0E9d);
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
                DecimalFormat decimalFormat = f1911k0;
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
            if (f1911k0 == null) {
                f1911k0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f1911k0.format(starsAmount.amount / 1.0E9d);
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
            if (f1911k0 == null) {
                f1911k0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f1911k0;
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
        if (f1910j0 == null) {
            f1910j0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f1910j0.format(j10 / 1.0E9d);
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
        throw new UnsupportedOperationException("Method not decompiled: ai.nd.O0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
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
        xq xqVar = new xq(R.drawable.diamond, 0);
        xqVar.recolorDrawable = false;
        xqVar.translate(0.0f, f10);
        xqVar.spaceScaleX = f11;
        xqVar.setScale(f7, f7);
        spannableString.setSpan(xqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder S0(CharSequence charSequence, float f7, xq[] xqVarArr) {
        return V0(false, charSequence, f7, xqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, boolean z10) {
        return V0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return V0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(boolean z10, CharSequence charSequence, float f7, xq[] xqVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        xq xqVar;
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
        if (xqVarArr == null || (xqVar = xqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            xqVar = new xq(i10, 0);
            if (xqVarArr != null) {
                xqVarArr[0] = xqVar;
            }
        }
        xqVar.translate(0.0f, f10);
        xqVar.spaceScaleX = f11;
        if (z10) {
            xqVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            xqVar.setScale(f12, f12);
        } else {
            xqVar.setScale(f7, f7);
        }
        spannableString.setSpan(xqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(boolean z10, String str, xq[] xqVarArr) {
        xq xqVar;
        int i10;
        float f7;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (xqVarArr == null || (xqVar = xqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            xqVar = new xq(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f7 = 0.222f;
            } else {
                f7 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            xqVar.setScale(f7, f10);
        }
        if (z10) {
            xqVar.recolorDrawable = false;
        }
        if (xqVarArr != null) {
            xqVarArr[0] = xqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(xqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder X0(TL_stars.StarsAmount starsAmount, String str, xq[] xqVarArr) {
        return Y0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, xqVarArr);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f7, xq[] xqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        xq xqVar;
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
        if (xqVarArr == null || (xqVar = xqVarArr[0]) == null) {
            if (xqVarArr != null && xqVarArr.length > 0) {
                xqVar = new xq(i10, 0);
                xqVarArr[0] = xqVar;
            } else {
                xqVar = new xq(i10, 0);
            }
        }
        xqVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        xqVar.setScale(f7, f7);
        spannableString.setSpan(xqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static gb Z0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i10;
        int currentAccount = imageReceiver.getCurrentAccount();
        final eb ebVar = new eb(z10, currentAccount, str, imageReceiver, new boolean[1]);
        ebVar.run();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(currentAccount);
        if (z10) {
            i10 = NotificationCenter.didUpdateTonGiftStickers;
        } else {
            i10 = NotificationCenter.didUpdatePremiumGiftStickers;
        }
        return new gb(notificationCenter.listen(view, i10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        ebVar.run();
                        return;
                    default:
                        ebVar.run();
                        return;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        ebVar.run();
                        return;
                    default:
                        ebVar.run();
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21125a7, 0.35f), 0L, null, null, 0);
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

    public static gb d1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, int i10) {
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

    public static void f1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.g6 g6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 j11 = sl.j(1, context, g6Var, false);
        LinearLayout e = sl.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e.addView(frameLayout, w7.z5.t(-1, 150, 7, 0, 0, 0, 10));
        lc lcVar = new lc(context, 70, 0);
        frameLayout.addView(lcVar, w7.z5.c(-1.0f, -1));
        tg.n nVar = new tg.n(context, 1, 2);
        tg.g gVar = nVar.f47547b;
        gVar.f47531z = org.telegram.ui.ActionBar.k6.fk;
        gVar.A = org.telegram.ui.ActionBar.k6.gk;
        gVar.b();
        nVar.setStarParticlesView(lcVar);
        frameLayout.addView(nVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.f21289j5, g6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView f7 = sl.f(e, textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        f7.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(20.0f), -6915073));
        f7.setTextColor(-1);
        f7.setTextSize(1, 11.33f);
        f7.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        f7.setGravity(17);
        f7.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i11 = boost.multiplier;
        if (i11 == 0) {
            i11 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i11));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        xq xqVar = new xq(R.drawable.mini_boost_badge, 2);
        xqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(xqVar, 0, 1, 33);
        f7.setText(spannableStringBuilder);
        e.addView(f7, w7.z5.t(-2, 20, 17, 20, 4, 20, 4));
        o01 o01Var = new o01(context, g6Var);
        o01Var.n(LocaleController.getString(R.string.BoostFrom), i10, j10, new la(h3VarArr, j10, 2));
        o01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            a3.i0 i0Var = new a3.i0(h3VarArr, j10, boost, 3);
            h3VarArr = h3VarArr;
            o01Var.i(string, string2, i0Var);
        }
        o01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        o01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        e.addView(o01Var, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        y90 y90Var = new y90(context, g6Var);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.f21588z6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21242gc, g6Var);
        y90Var.setTextSize(1, 14.0f);
        y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new sa(context, 3)));
        y90Var.setGravity(17);
        e.addView(y90Var, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.i(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new ta(h3VarArr, 1));
        e.addView(dVar, w7.z5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        j11.customView = e;
        h3VarArr[0] = j11;
        j11.useBackgroundTopPadding = false;
        j11.fixNavigationBar();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            h3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        h3VarArr[0].show();
        h3VarArr[0].setOnDismissListener(new a3.d(nVar, 20));
    }

    public static l1 g1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        ag.a resellAmount;
        ag.b bVar = ag.b.f633a;
        if (tL_starGiftUnique == null) {
            resellAmount = ag.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(ag.b.f634b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        l1 l1Var = new l1(context, g6Var, i10, resellAmount, new o2(5, callback2, r8));
        l1[] l1VarArr = {l1Var};
        l1Var.show();
        return l1VarArr[0];
    }

    public static void h1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        int i11;
        CharSequence l4;
        org.telegram.ui.ActionBar.h3[] h3VarArr;
        long j11;
        boolean z11 = false;
        org.telegram.ui.ActionBar.h3 j12 = sl.j(1, context, g6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        sl.n(R.string.PaidContentTitle, textView, 1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i12, g6Var);
        linearLayout.addView(textView, w7.z5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        vd0 vd0Var = new vd0(context, g6Var);
        vd0Var.setForceForceUseCenter(true);
        vd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        vd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i12, g6Var);
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
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21507uf, g6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.f21525vf, g6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new ib(vd0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.z5.o(-1, -2, 1.0f, 119));
        vd0Var.e(editTextBoldCursor);
        vd0Var.addView(linearLayout2, w7.z5.e(-1, -2, 48));
        linearLayout.addView(vd0Var, w7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.A6, null);
        vd0Var.addView(textView2, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        y90 y90Var = new y90(context, null);
        y90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new sa(context, 4)), true));
        y90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.f21588z6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21242gc, g6Var);
        linearLayout.addView(y90Var, w7.z5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ei.d g10 = sl.g(24, context, g6Var, true);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        g10.i(LocaleController.getString(i11), false, true);
        linearLayout.addView(g10, w7.z5.n(-1, 48));
        if (i13 > 0 && z10) {
            dVar = sl.g(24, context, g6Var, false);
            dVar.i(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        j12.customView = linearLayout;
        final org.telegram.ui.ActionBar.h3[] h3VarArr2 = {j12};
        if (i13 <= 0) {
            l4 = "";
        } else {
            l4 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l4);
        editTextBoldCursor.addTextChangedListener(new ic(editTextBoldCursor, vd0Var, j10, z10, g10, textView2));
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
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new lb(editTextBoldCursor2, h3VarArr2, 2));
                return true;
            }
        });
        g10.setOnClickListener(new kb(zArr, callback2, editTextBoldCursor, g10, h3VarArr2));
        if (dVar != null) {
            ei.d dVar2 = dVar;
            kb kbVar = new kb(zArr, callback2, dVar2, editTextBoldCursor, h3VarArr2);
            h3VarArr = h3VarArr2;
            dVar2.setOnClickListener(kbVar);
        } else {
            h3VarArr = h3VarArr2;
        }
        h3VarArr[0].fixNavigationBar();
        h3VarArr[0].setOnDismissListener(new cb(editTextBoldCursor, 1));
        h3VarArr[0].show();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof sn) {
            z11 = ((sn) R).U9();
        }
        lb lbVar = new lb(h3VarArr, editTextBoldCursor);
        if (z11) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        AndroidUtilities.runOnUIThread(lbVar, j11);
    }

    public static org.telegram.ui.ActionBar.h3 i1(final android.content.Context r59, final boolean r60, final long r61, final int r63, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r64, final org.telegram.ui.ActionBar.g6 r65) {
        throw new UnsupportedOperationException("Method not decompiled: ai.nd.i1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.g6):org.telegram.ui.ActionBar.h3");
    }

    public static void j1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.g6 g6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f20569id = tL_messageActionPaymentRefunded.charge.f20471id;
        starsTransaction.refund = true;
        i1(activity, false, 0L, i10, starsTransaction, g6Var);
    }

    public static void k1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.g6 g6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f20569id = tL_payments_paymentReceiptStars.transaction_id;
        i1(context, false, 0L, i10, starsTransaction, g6Var);
    }

    public static CharSequence n1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        xq[] xqVarArr;
        x4.o c10;
        if (z10 && com.google.android.gms.internal.play_billing.k3.s(spannableStringBuilder)) {
            for (xq xqVar : (xq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), xq.class)) {
                Drawable drawable = xqVar.drawable;
                if (drawable != null && !(drawable instanceof x4.o) && (c10 = x4.o.c(ApplicationLoader.applicationContext.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(xqVar.drawable.getBounds());
                    xqVar.drawable = c10;
                    xqVar.recolorDrawable = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void y0(ai.nd r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: ai.nd.y0(ai.nd, int):void");
    }

    public final void I0(ArrayList arrayList, b71 b71Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        ha y3 = ha.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        m61 m61Var = new m61(-2);
        m61Var.f28553c = (jc) super.r0(getParentActivity());
        arrayList.add(m61Var);
        arrayList.add(m61.k(this.W));
        ei.d dVar = this.f1917f0;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(m61.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(gi.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.k6.uj), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(m61.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            i2.o1.q(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = fd.f1326a;
                m61 J = m61.J(fd.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(J);
            }
            if (y3.f1432x) {
                arrayList.add(m61.o(arrayList.size(), 33));
            } else if (!y3.f1433y) {
                m61 c10 = m61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.f28564q = true;
                arrayList.add(c10);
            }
            arrayList.add(m61.B(null));
        }
        boolean O = y3.O(0);
        this.f1918g0 = O;
        if (O) {
            arrayList.add(m61.p(this.T, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(m61.l(this.U));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.T = new md(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.U = new jc(this, context, 0);
        super.createView(context);
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        boolean z10 = true;
        frameLayout.setClickable(true);
        tg.n nVar = new tg.n(context, 1, 2);
        this.S = nVar;
        tg.g gVar = nVar.f47547b;
        gVar.f47531z = org.telegram.ui.ActionBar.k6.fk;
        gVar.A = org.telegram.ui.ActionBar.k6.gk;
        gVar.b();
        this.S.setStarParticlesView(this.e);
        this.R.addView(this.S, w7.z5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new sa(context, 1)), true), this.R, null);
        this.f35826c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.f46377m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.f35826c.setItemAnimator(kVar);
        this.f35826c.setOnItemClickListener(new xa(this, 0));
        z00 z00Var = new z00(getParentActivity());
        this.V = z00Var;
        this.f35830s.addView(z00Var, w7.z5.c(-1.0f, -1));
        ha y3 = ha.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        this.W.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), false, true, false);
        this.Y = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        this.Y.setTextSize(AndroidUtilities.dp(32.0f));
        this.Y.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(this.Y, org.telegram.ui.ActionBar.k6.G6, this.resourceProvider);
        this.X = new SpannableStringBuilder("S");
        h70 h70Var = new h70(this.Y, 42.0f, this.currentAccount);
        yj0 yj0Var = new yj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = h70Var.f37765b;
        imageReceiver.setImageBitmap(yj0Var);
        imageReceiver.setAutoRepeat(2);
        h70Var.f37767f = false;
        h70Var.h = -AndroidUtilities.dp(3.0f);
        this.X.setSpan(h70Var, 0, 1, 33);
        this.W.addView(this.Y, w7.z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.Z = textView;
        textView.setTextSize(1, 14.0f);
        this.Z.setGravity(17);
        this.Z.setText(LocaleController.getString(R.string.YourStarsBalance));
        org.telegram.ui.ActionBar.r6.W(this.Z, org.telegram.ui.ActionBar.k6.f21588z6, this.resourceProvider);
        this.W.addView(this.Z, w7.z5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ah.x xVar = new ah.x(this, getParentActivity(), 2);
        this.f1913b0 = xVar;
        frameLayout2.addView(xVar);
        ei.d dVar = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.f1914c0 = dVar;
        dVar.f();
        this.f1914c0.i("", false, true);
        this.f1914c0.setOnClickListener(new View.OnClickListener(this) {
            public final nd f2518b;

            {
                this.f2518b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        nd.C0(this.f2518b, context);
                        return;
                    default:
                        new ed(context, this.f2518b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f1913b0.addView(this.f1914c0, w7.z5.e(-1, 48, 119));
        va1 va1Var = new va1(this, getParentActivity(), 2);
        this.f1915d0 = va1Var;
        frameLayout2.addView(va1Var);
        ei.d dVar2 = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.f1916e0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new xq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.f1916e0.i(spannableStringBuilder, false, true);
        this.f1916e0.setOnClickListener(new View.OnClickListener(this) {
            public final nd f2518b;

            {
                this.f2518b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        nd.C0(this.f2518b, context);
                        return;
                    default:
                        new ed(context, this.f2518b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f1915d0.addView(this.f1916e0, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ei.d dVar3 = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.f1912a0 = dVar3;
        dVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new xq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.f1912a0.i(spannableStringBuilder2, false, true);
        this.f1912a0.setOnClickListener(new View.OnClickListener(this) {
            public final nd f2554b;

            {
                this.f2554b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nd ndVar = this.f2554b;
                        ndVar.presentFragment(new x(0, ndVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        nd.B0(this.f2554b);
                        return;
                }
            }
        });
        this.f1915d0.addView(this.f1912a0, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.W.addView(frameLayout2, w7.z5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ei.d dVar4 = new ei.d(getParentActivity(), this.resourceProvider, false);
        this.f1917f0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new xq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f1917f0.i(spannableStringBuilder3, false, true);
        this.f1917f0.setOnClickListener(new View.OnClickListener(this) {
            public final nd f2554b;

            {
                this.f2554b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nd ndVar = this.f2554b;
                        ndVar.presentFragment(new x(0, ndVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        nd.B0(this.f2554b);
                        return;
                }
            }
        });
        this.W.addView(this.f1917f0, w7.z5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        l1();
        mc mcVar = this.f1920i0;
        if (mcVar != null) {
            mcVar.N(false);
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
            mc mcVar = this.f1920i0;
            if (mcVar != null) {
                mcVar.N(true);
            }
            if (this.P == 0 && this.Q < 0) {
                this.Q = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            ha y3 = ha.y(this.currentAccount, false);
            if (this.f1918g0 != y3.O(0)) {
                this.f1918g0 = y3.O(0);
                t0();
                mc mcVar2 = this.f1920i0;
                if (mcVar2 != null) {
                    mcVar2.N(true);
                }
                if (this.P == 0 && this.Q < 0) {
                    this.Q = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            mc mcVar3 = this.f1920i0;
            if (mcVar3 != null) {
                mcVar3.N(true);
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
        ha y3 = ha.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.X);
        spannableStringBuilder.append((CharSequence) K0(y3.p(), 0.66f, ' '));
        this.Y.setText(spannableStringBuilder);
        ei.d dVar = this.f1914c0;
        if (y3.p().amount > 0) {
            i10 = R.string.StarsBuyMore;
        } else {
            i10 = R.string.StarsBuy;
        }
        dVar.i(LocaleController.getString(i10), true, true);
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
        this.f1919h0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.f1913b0.setVisibility(0);
            this.f1915d0.setVisibility(0);
            ViewPropertyAnimator animate = this.f1913b0.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final nd f983b;

                {
                    this.f983b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f983b.f1913b0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f983b.f1915d0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f1915d0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final nd f983b;

                {
                    this.f983b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f983b.f1913b0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f983b.f1915d0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.f1913b0.animate().cancel();
        this.f1915d0.animate().cancel();
        va1 va1Var = this.f1915d0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        va1Var.setAlpha(f7);
        ah.x xVar = this.f1913b0;
        if (z10) {
            f11 = 0.0f;
        }
        xVar.setAlpha(f11);
        va1 va1Var2 = this.f1915d0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        va1Var2.setVisibility(i10);
        ah.x xVar2 = this.f1913b0;
        if (z10) {
            i11 = 8;
        }
        xVar2.setVisibility(i11);
    }

    @Override
    public final s4.g0 n0() {
        mc mcVar = new mc(this, this.f35826c, getParentActivity(), this.currentAccount, this.classGuid, new q(this, 6), getResourceProvider());
        this.f1920i0 = mcVar;
        mcVar.f24972r = false;
        return mcVar;
    }

    @Override
    public final a20 o0() {
        return new xc(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        ha.y(this.currentAccount, false).T(true);
        ha.y(this.currentAccount, false).S();
        ha.y(this.currentAccount, false).z();
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
        tg.n nVar = this.S;
        if (nVar != null) {
            nVar.setPaused(true);
            this.S.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.S;
        if (nVar != null) {
            nVar.setPaused(false);
            this.S.setDialogVisible(false);
        }
    }

    @Override
    public final sg.x1 p0() {
        return new lc(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        md mdVar = this.T;
        boolean z10 = false;
        if (mdVar != null && (mdVar.getParent() instanceof View)) {
            if ((this.f35826c.getHeight() - this.f35826c.getPaddingBottom()) - ((View) this.T.getParent()).getBottom() >= 0) {
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
