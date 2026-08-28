package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c70;
import org.telegram.ui.ho;
import org.telegram.ui.qn;
import org.telegram.ui.ta1;
import org.telegram.ui.w10;
import org.telegram.ui.x10;
public final class oa extends x10 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f8693d0;
    public static DecimalFormat f8694e0;
    public FrameLayout L;
    public ag.j M;
    public na N;
    public fh.l2 O;
    public c00 P;
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public org.telegram.ui.Components.j6 S;
    public TextView T;
    public kh.d U;
    public fh.d2 V;
    public kh.d W;
    public ta1 X;
    public kh.d Y;
    public kh.d Z;
    public boolean f8695a0;
    public boolean f8696b0;
    public o9 f8697c0;

    public oa() {
        this.I = true;
    }

    public static void A0(oa oaVar, Context context) {
        if (MessagesController.getInstance(oaVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(oaVar.currentAccount);
        } else {
            new fa(context, oaVar.resourceProvider).show();
        }
    }

    public static void E0(wy0 wy0Var, int i9, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.b6 b6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((ty0) wy0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        q80 q80Var = new q80(textView, AndroidUtilities.dp(90.0f), 0, b6Var);
        q80Var.a(org.telegram.ui.ActionBar.f6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.f6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(q80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final v7 y10 = v7.y(i9, false);
            final long j10 = starGift.f22607id;
            final bg.i iVar = new bg.i(textView, 16);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                    int i12;
                    v7 v7Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i10 == (i12 = NotificationCenter.starGiftsLoaded) && (J = (v7Var = v7.this).J(j10)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(v7Var.f9045a).removeObserver(notificationCenterDelegateArr[0], i12);
                        iVar.run(J);
                    }
                }
            }};
            int i10 = y10.f9045a;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
            int i11 = NotificationCenter.starGiftsLoaded;
            notificationCenter.addObserver(notificationCenterDelegate, i11);
            TL_stars.StarGift J = y10.J(j10);
            if (J != null) {
                zArr[0] = true;
                NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegateArr[0], i11);
                iVar.run(J);
            }
        } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
        } else {
            int i12 = starGift.availability_remains;
            if (i12 <= 0) {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i12, LocaleController.formatNumber(starGift.availability_total, ','));
            }
            textView.setText(formatPluralStringComma);
        }
    }

    public static void F0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new l9(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder H0(TL_stars.StarsAmount starsAmount) {
        return I0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i9;
        if (f8694e0 == null) {
            f8694e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f8694e0.format(j10 / 1.0E9d);
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
                sb2.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z10 = false;
            if (i10 < 0 && j11 > 0) {
                d = 1.0E9d;
                i9 = -1;
            } else if (i10 > 0 && j11 < 0) {
                d = 1.0E9d;
                i9 = 1;
            } else {
                d = 1.0E9d;
                i9 = 0;
            }
            long j12 = i9 + j11;
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
                sb3.append(LocaleController.formatNumber(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f8694e0;
                int i12 = starsAmount.nanos;
                double d9 = i12;
                if (i12 < 0) {
                    d9 += d;
                }
                String format2 = decimalFormat.format(d9 / d);
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
                sb4.append(LocaleController.formatNumber(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i9;
        boolean z10;
        if (f8694e0 == null) {
            f8694e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f8694e0.format(starsAmount.amount / 1.0E9d);
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
                i9 = -1;
                d = 1.0E9d;
            } else if (i10 > 0 && j10 < 0) {
                d = 1.0E9d;
                i9 = 1;
            } else {
                d = 1.0E9d;
                i9 = 0;
            }
            long j11 = i9 + j10;
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
                sb2.append(LocaleController.formatNumber(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f8694e0;
                int i12 = starsAmount.nanos;
                double d9 = i12;
                if (i12 < 0) {
                    d9 += d;
                }
                String format2 = decimalFormat.format(d9 / d);
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

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i9;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f8694e0 == null) {
                f8694e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f8694e0.format(starsAmount.amount / 1.0E9d);
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
            i9 = -1;
            d = 1.0E9d;
        } else if (i10 > 0 && j10 < 0) {
            d = 1.0E9d;
            i9 = 1;
        } else {
            d = 1.0E9d;
            i9 = 0;
        }
        long j11 = i9 + j10;
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
            sb2.append(LocaleController.formatNumber(Math.abs(j11), ','));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (f8694e0 == null) {
                f8694e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f8694e0;
            int i12 = starsAmount.nanos;
            double d9 = i12;
            if (i12 < 0) {
                d9 += d;
            }
            String format2 = decimalFormat.format(d9 / d);
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
        if (f8693d0 == null) {
            f8693d0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f8693d0.format(j10 / 1.0E9d);
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
        throw new UnsupportedOperationException("Method not decompiled: gh.oa.N0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
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
        eq eqVar = new eq(R.drawable.diamond, 0);
        eqVar.recolorDrawable = false;
        eqVar.translate(0.0f, f11);
        eqVar.spaceScaleX = f12;
        eqVar.setScale(f10, f10);
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10, eq[] eqVarArr) {
        return U0(false, charSequence, f10, eqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f10, eq[] eqVarArr, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        eq eqVar;
        int i9;
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
                i9 = R.drawable.mini_gram_72;
            } else {
                i9 = R.drawable.msg_premium_liststar;
            }
            eqVar = new eq(i9, 0);
            if (eqVarArr != null) {
                eqVarArr[0] = eqVar;
            }
        }
        eqVar.translate(0.0f, f11);
        eqVar.spaceScaleX = f12;
        if (z10) {
            float f13 = f10 * 0.2f;
            eqVar.setScale(f13, f13);
        } else {
            eqVar.setScale(f10, f10);
        }
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, eq[] eqVarArr) {
        eq eqVar;
        int i9;
        float f10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            if (z10) {
                i9 = R.drawable.mini_gram_72;
            } else {
                i9 = R.drawable.msg_premium_liststar;
            }
            eqVar = new eq(i9, 0);
            float f11 = 1.13f;
            if (z10) {
                f10 = 0.222f;
            } else {
                f10 = 1.13f;
            }
            if (z10) {
                f11 = 0.222f;
            }
            eqVar.setScale(f10, f11);
        }
        if (eqVarArr != null) {
            eqVarArr[0] = eqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, eq[] eqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, eqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, eq[] eqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i9;
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
            i9 = R.drawable.mini_gram_72;
        } else {
            i9 = R.drawable.star_small_inner;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            if (eqVarArr != null && eqVarArr.length > 0) {
                eqVar = new eq(i9, 0);
                eqVarArr[0] = eqVar;
            } else {
                eqVar = new eq(i9, 0);
            }
        }
        if (z10) {
            f10 *= 0.33f;
        } else {
            eqVar.recolorDrawable = false;
        }
        eqVar.setScale(f10, f10);
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static o8 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i9;
        int currentAccount = imageReceiver.getCurrentAccount();
        final m8 m8Var = new m8(z10, currentAccount, str, imageReceiver, new boolean[1]);
        m8Var.run();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(currentAccount);
        if (z10) {
            i9 = NotificationCenter.didUpdateTonGiftStickers;
        } else {
            i9 = NotificationCenter.didUpdatePremiumGiftStickers;
        }
        return new o8(notificationCenter.listen(view, i9, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        m8Var.run();
                        return;
                    default:
                        m8Var.run();
                        return;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        m8Var.run();
                        return;
                    default:
                        m8Var.run();
                        return;
                }
            }
        }), 0);
    }

    public static void Z0(ImageReceiver imageReceiver, TLRPC.Document document, int i9) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i9);
        imageReceiver.setImage(ImageLocation.getForDocument(document), e2.c.l(i9, "_", i9), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.l(i9, "_", i9), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.f22947a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i9) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        Z0(imageReceiver, document, i9);
    }

    public static void b1(org.telegram.ui.Components.o9 o9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 1000) {
            str = "2⃣";
        } else if (j10 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        Y0(o9Var, imageReceiver, str, false);
    }

    public static o8 c1(org.telegram.ui.Components.o9 o9Var, ImageReceiver imageReceiver, int i9) {
        String str;
        if (i9 != 3) {
            if (i9 != 6) {
                if (i9 != 12) {
                    if (i9 != 24) {
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
        return Y0(o9Var, imageReceiver, str, false);
    }

    public static void d1(org.telegram.ui.Components.o9 o9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 10000000000L) {
            str = "2⃣";
        } else if (j10 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        Y0(o9Var, imageReceiver, str, true);
    }

    public static void e1(Context context, int i9, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.b6 b6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j11 = ll.j(context, b6Var, false, false);
        LinearLayout f10 = ll.f(context, 1);
        f10.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, g7.e6.t(-1, 150, 7, 0, 0, 0, 10));
        n9 n9Var = new n9(context, 70, 0);
        frameLayout.addView(n9Var, g7.e6.c(-1.0f, -1));
        ag.j jVar = new ag.j(context, 1, 2);
        ag.a aVar = jVar.f205b;
        aVar.f181w = org.telegram.ui.ActionBar.f6.fk;
        aVar.f182x = org.telegram.ui.ActionBar.f6.gk;
        aVar.b();
        jVar.setStarParticlesView(n9Var);
        frameLayout.addView(jVar, g7.e6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        jVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView h = j3.r0.h(f10, textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(20.0f), -6915073));
        h.setTextColor(-1);
        h.setTextSize(1, 11.33f);
        h.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        h.setGravity(17);
        h.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i10 = boost.multiplier;
        if (i10 == 0) {
            i10 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        eq eqVar = new eq(R.drawable.mini_boost_badge, 2);
        eqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
        h.setText(spannableStringBuilder);
        f10.addView(h, g7.e6.t(-2, 20, 17, 20, 4, 20, 4));
        wy0 wy0Var = new wy0(context, b6Var);
        wy0Var.k(LocaleController.getString(R.string.BoostFrom), i9, j10, new y7(f3VarArr, j10, 2));
        wy0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            e5.w wVar = new e5.w(f3VarArr, j10, boost, 4);
            f3VarArr = f3VarArr;
            wy0Var.g(string, string2, wVar);
        }
        wy0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        wy0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f10.addView(wy0Var, g7.e6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        l80 l80Var = new l80(context, b6Var);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.f(context, 7)));
        l80Var.setGravity(17);
        f10.addView(l80Var, g7.e6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new e8(f3VarArr, 1));
        f10.addView(dVar, g7.e6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        j11.customView = f10;
        f3VarArr[0] = j11;
        j11.useBackgroundTopPadding = false;
        j11.fixNavigationBar();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        jVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new fh.o1(jVar, 16));
    }

    public static x0 f1(Context context, int i9, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.b6 b6Var) {
        gf.a resellAmount;
        gf.b bVar = gf.b.f7749a;
        if (tL_starGiftUnique == null) {
            resellAmount = gf.a.g(MessagesController.getInstance(i9).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(gf.b.f7750b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        x0 x0Var = new x0(context, b6Var, i9, resellAmount, new fh.f1(8, callback2, r8));
        x0[] x0VarArr = {x0Var};
        x0Var.show();
        return x0VarArr[0];
    }

    public static void g1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9;
        int i10;
        kh.d dVar;
        CharSequence l10;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        long j11;
        boolean z11 = false;
        org.telegram.ui.ActionBar.f3 j12 = ll.j(context, b6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        linearLayout.addView(textView, g7.e6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        fc0 fc0Var = new fc0(context, b6Var);
        fc0Var.setForceForceUseCenter(true);
        fc0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        fc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23312uf, b6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23325vf, b6Var));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        editTextBoldCursor.setGravity(i9);
        editTextBoldCursor.setOnFocusChangeListener(new q8(fc0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, g7.e6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, g7.e6.o(-1, -2, 1.0f, 119));
        fc0Var.e(editTextBoldCursor);
        fc0Var.addView(linearLayout2, g7.e6.e(-1, -2, 48));
        linearLayout.addView(fc0Var, g7.e6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false));
        fc0Var.addView(textView2, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        l80 l80Var = new l80(context, null);
        l80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.f(context, 8)), true));
        l80Var.setTextSize(1, 12.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        linearLayout.addView(l80Var, g7.e6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final kh.d i12 = ll.i(24, context, b6Var, true);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            i10 = R.string.PaidContentUpdateButton;
        } else {
            i10 = R.string.PaidContentButton;
        }
        i12.g(LocaleController.getString(i10), false, true);
        linearLayout.addView(i12, g7.e6.n(-1, 48));
        if (i13 > 0 && z10) {
            dVar = ll.i(24, context, b6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, g7.e6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        } else {
            dVar = null;
        }
        j12.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {j12};
        if (i13 <= 0) {
            l10 = "";
        } else {
            l10 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l10);
        editTextBoldCursor.addTextChangedListener(new m9(editTextBoldCursor, fc0Var, j10, z10, i12, textView2));
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
                i12.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new t8(editTextBoldCursor2, f3VarArr2, 2));
                return true;
            }
        });
        i12.setOnClickListener(new s8(zArr, callback2, editTextBoldCursor, i12, f3VarArr2));
        if (dVar != null) {
            kh.d dVar2 = dVar;
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(new s8(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2));
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new eh.l(editTextBoldCursor, 2));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof qn) {
            z11 = ((qn) R).P9();
        }
        t8 t8Var = new t8(f3VarArr, editTextBoldCursor);
        if (z11) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        AndroidUtilities.runOnUIThread(t8Var, j11);
    }

    public static org.telegram.ui.ActionBar.f3 h1(final android.content.Context r59, final boolean r60, final long r61, final int r63, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r64, final org.telegram.ui.ActionBar.b6 r65) {
        throw new UnsupportedOperationException("Method not decompiled: gh.oa.h1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.b6):org.telegram.ui.ActionBar.f3");
    }

    public static void i1(Activity activity, int i9, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.b6 b6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i10;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f22609id = tL_messageActionPaymentRefunded.charge.f22508id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i9, starsTransaction, b6Var);
    }

    public static void j1(Context context, int i9, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.b6 b6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i9).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f22609id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i9, starsTransaction, b6Var);
    }

    public static void w0(gh.oa r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: gh.oa.w0(gh.oa, int):void");
    }

    public static void y0(oa oaVar, l41 l41Var, Boolean bool, String str) {
        if (oaVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                oc.a0(oaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) l41Var.B, new Object[0])), R.raw.stars_topup).j();
                oaVar.P.c(true);
                v7.y(oaVar.currentAccount, false).T(true);
            } else if (str != null) {
                org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, oc.a0(oaVar), R.raw.error, 36);
            }
        }
    }

    public static void z0(oa oaVar) {
        v7.y(oaVar.currentAccount, false).u();
        bg.g3.d0(1, BirthdayController.getInstance(oaVar.currentAccount).getState());
    }

    public final void G0(ArrayList arrayList, z41 z41Var) {
        int i9;
        if (getParentActivity() == null) {
            return;
        }
        v7 y10 = v7.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        l41 l41Var = new l41(-2);
        l41Var.f30332c = (fh.l2) super.q0(getParentActivity());
        arrayList.add(l41Var);
        arrayList.add(l41.k(this.Q));
        kh.d dVar = this.Z;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            dVar.setVisibility(i9);
        }
        arrayList.add(l41.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(mh.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.f6.uj), R.drawable.filled_earn_stars, ho.c0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(l41.B(null));
        }
        if (y10.f9048e && !arrayList2.isEmpty()) {
            org.telegram.ui.Cells.j2.l(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                int i11 = ga.f8164a;
                l41 J = l41.J(ga.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i10);
                arrayList.add(J);
            }
            if (y10.f9065x) {
                arrayList.add(l41.o(arrayList.size(), 33));
            } else if (!y10.f9066y) {
                l41 c10 = l41.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.f30344q = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.B(null));
        }
        boolean O = y10.O(0);
        this.f8695a0 = O;
        if (O) {
            arrayList.add(l41.p(this.N, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(l41.l(this.O));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new na(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.O = new fh.l2(this, context, 1);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        boolean z10 = true;
        frameLayout.setClickable(true);
        ag.j jVar = new ag.j(context, 1, 2);
        this.M = jVar;
        ag.a aVar = jVar.f205b;
        aVar.f181w = org.telegram.ui.ActionBar.f6.fk;
        aVar.f182x = org.telegram.ui.ActionBar.f6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.f44315e);
        this.L.addView(this.M, g7.e6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        l0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.f(context, 5)), true), this.L, null);
        this.f44314c.setOverScrollMode(2);
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.f44314c.setItemAnimator(nVar);
        this.f44314c.setOnItemClickListener(new eh.j(this, 3));
        c00 c00Var = new c00(getParentActivity());
        this.P = c00Var;
        this.f44319s.addView(c00Var, g7.e6.c(-1.0f, -1));
        v7 y10 = v7.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getParentActivity(), false, true, false);
        this.S = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        c70 c70Var = new c70(this.S, 42.0f, this.currentAccount);
        int i9 = R.raw.star_reaction;
        mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(42.0f), "s" + R.raw.star_reaction, AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = c70Var.f37081b;
        imageReceiver.setImageBitmap(mi0Var);
        imageReceiver.setAutoRepeat(2);
        c70Var.f37084f = false;
        c70Var.h = -AndroidUtilities.dp(3.0f);
        this.R.setSpan(c70Var, 0, 1, 33);
        this.Q.addView(this.S, g7.e6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.T = textView;
        textView.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.T.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, this.resourceProvider));
        this.Q.addView(this.T, g7.e6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        fh.d2 d2Var = new fh.d2(this, getParentActivity(), 2);
        this.V = d2Var;
        frameLayout2.addView(d2Var);
        kh.d dVar = new kh.d(getParentActivity(), this.resourceProvider, true);
        this.W = dVar;
        dVar.e();
        this.W.g("", false, true);
        this.W.setOnClickListener(new View.OnClickListener(this) {
            public final oa f8306b;

            {
                this.f8306b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        oa.A0(this.f8306b, context);
                        return;
                    default:
                        new fa(context, this.f8306b.resourceProvider).show();
                        return;
                }
            }
        });
        this.V.addView(this.W, g7.e6.e(-1, 48, 119));
        ta1 ta1Var = new ta1(this, getParentActivity(), 3);
        this.X = ta1Var;
        frameLayout2.addView(ta1Var);
        kh.d dVar2 = new kh.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Y.g(spannableStringBuilder, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final oa f8306b;

            {
                this.f8306b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        oa.A0(this.f8306b, context);
                        return;
                    default:
                        new fa(context, this.f8306b.resourceProvider).show();
                        return;
                }
            }
        });
        this.X.addView(this.Y, g7.e6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        kh.d dVar3 = new kh.d(getParentActivity(), this.resourceProvider, true);
        this.U = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new eq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.U.g(spannableStringBuilder2, false, true);
        this.U.setOnClickListener(new View.OnClickListener(this) {
            public final oa f8354b;

            {
                this.f8354b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        oa oaVar = this.f8354b;
                        oaVar.presentFragment(new r(0, oaVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        oa.z0(this.f8354b);
                        return;
                }
            }
        });
        this.X.addView(this.U, g7.e6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, g7.e6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        kh.d dVar4 = new kh.d(getParentActivity(), this.resourceProvider, false);
        this.Z = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new eq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.Z.g(spannableStringBuilder3, false, true);
        this.Z.setOnClickListener(new View.OnClickListener(this) {
            public final oa f8354b;

            {
                this.f8354b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        oa oaVar = this.f8354b;
                        oaVar.presentFragment(new r(0, oaVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        oa.z0(this.f8354b);
                        return;
                }
            }
        });
        this.Q.addView(this.Z, g7.e6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        o9 o9Var = this.f8697c0;
        if (o9Var != null) {
            o9Var.N(false);
        }
        c0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = c0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1((y10.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starOptionsLoaded) {
            r0();
            o9 o9Var = this.f8697c0;
            if (o9Var != null) {
                o9Var.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            k0();
        } else if (i9 == NotificationCenter.starTransactionsLoaded) {
            v7 y10 = v7.y(this.currentAccount, false);
            if (this.f8695a0 != y10.O(0)) {
                this.f8695a0 = y10.O(0);
                r0();
                o9 o9Var2 = this.f8697c0;
                if (o9Var2 != null) {
                    o9Var2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                k0();
            }
        } else if (i9 == NotificationCenter.starSubscriptionsLoaded) {
            o9 o9Var3 = this.f8697c0;
            if (o9Var3 != null) {
                o9Var3.N(true);
            }
        } else if (i9 == NotificationCenter.starBalanceUpdated) {
            k1();
        } else if (i9 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            k1();
        }
    }

    public final void k1() {
        int i9;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        v7 y10 = v7.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) I0(y10.p(), 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        kh.d dVar = this.W;
        if (y10.p().amount > 0) {
            i9 = R.string.StarsBuyMore;
        } else {
            i9 = R.string.StarsBuy;
        }
        dVar.g(LocaleController.getString(i9), true, true);
        TLRPC.TL_payments_starsRevenueStats h = c0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        float f10;
        int i9;
        float f11;
        this.f8696b0 = z10;
        float f12 = 1.0f;
        int i10 = 0;
        if (z11) {
            this.V.setVisibility(0);
            this.X.setVisibility(0);
            ViewPropertyAnimator animate = this.V.animate();
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animate.alpha(f11).withEndAction(new Runnable(this) {
                public final oa f8446b;

                {
                    this.f8446b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f8446b.V.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f8446b.X.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.X.animate();
            if (!z10) {
                f12 = 0.0f;
            }
            animate2.alpha(f12).withEndAction(new Runnable(this) {
                public final oa f8446b;

                {
                    this.f8446b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f8446b.V.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f8446b.X.setVisibility(8);
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
        ta1 ta1Var = this.X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ta1Var.setAlpha(f10);
        fh.d2 d2Var = this.V;
        if (z10) {
            f12 = 0.0f;
        }
        d2Var.setAlpha(f12);
        ta1 ta1Var2 = this.X;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        ta1Var2.setVisibility(i9);
        fh.d2 d2Var2 = this.V;
        if (z10) {
            i10 = 8;
        }
        d2Var2.setVisibility(i10);
    }

    @Override
    public final f2.r0 m0() {
        o9 o9Var = new o9(this, this.f44314c, getParentActivity(), this.currentAccount, this.classGuid, new bh.c(this, 18), getResourceProvider());
        this.f8697c0 = o9Var;
        o9Var.f35188r = false;
        return o9Var;
    }

    @Override
    public final w10 n0() {
        return new z9(this, getParentActivity());
    }

    @Override
    public final zf.w1 o0() {
        return new n9(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        v7.y(this.currentAccount, false).T(true);
        v7.y(this.currentAccount, false).S();
        v7.y(this.currentAccount, false).z();
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
        ag.j jVar = this.M;
        if (jVar != null) {
            jVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ag.j jVar = this.M;
        if (jVar != null) {
            jVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override
    public final boolean p0() {
        na naVar = this.N;
        boolean z10 = false;
        if (naVar != null && (naVar.getParent() instanceof View)) {
            if ((this.f44314c.getHeight() - this.f44314c.getPaddingBottom()) - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override
    public final View q0(Context context) {
        throw null;
    }
}
