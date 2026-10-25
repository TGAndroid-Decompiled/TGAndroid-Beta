package bi;

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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c20;
import org.telegram.ui.d20;
import org.telegram.ui.j70;
import org.telegram.ui.mo;
import org.telegram.ui.un;
import org.telegram.ui.xa1;
import org.telegram.ui.z10;
public final class dd extends d20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f4511v0;
    public static DecimalFormat f4512w0;
    public FrameLayout R;
    public ug.n S;
    public cd T;
    public lw0 U;
    public cc V;
    public View W;
    public oe.b X;
    public oe.b Y;
    public oe.b Z;
    public int f4514b0;
    public int f4515c0;
    public boolean f4516d0;
    public boolean f4517e0;
    public cc f4519g0;
    public z00 f4520h0;
    public LinearLayout f4521i0;
    public SpannableStringBuilder f4522j0;
    public org.telegram.ui.Components.s6 f4523k0;
    public TextView f4524l0;
    public fi.d m0;
    public bh.r f4525n0;
    public fi.d f4526o0;
    public xa1 f4527p0;
    public fi.d f4528q0;
    public fi.d f4529r0;
    public boolean f4530s0;
    public boolean f4531t0;
    public fc f4532u0;
    public int f4513a0 = -1;
    public final u6 f4518f0 = new u6(this, 1);

    public dd() {
        this.M = true;
    }

    public static void D0(w01 w01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.u6 u6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((t01) w01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ea0 ea0Var = new ea0(textView, AndroidUtilities.dp(90.0f), 0, u6Var);
        ea0Var.a(org.telegram.ui.ActionBar.y6.o1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.y6.o1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ea0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final ca y3 = ca.y(i10, false);
            final long j10 = starGift.f22254id;
            final ai.i iVar = new ai.i(textView, 9);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    ca caVar;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (caVar = ca.this).J(j10)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(caVar.f4441a).removeObserver(notificationCenterDelegateArr[0], i13);
                        iVar.run(J);
                    }
                }
            }};
            int i11 = y3.f4441a;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
            int i12 = NotificationCenter.starGiftsLoaded;
            notificationCenter.addObserver(notificationCenterDelegate, i12);
            TL_stars.StarGift J = y3.J(j10);
            if (J != null) {
                zArr[0] = true;
                NotificationCenter.getInstance(i11).removeObserver(notificationCenterDelegateArr[0], i12);
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
            int i13 = starGift.availability_remains;
            if (i13 <= 0) {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i13, LocaleController.formatNumber(starGift.availability_total, ','));
            }
            textView.setText(formatPluralStringComma);
        }
    }

    public static void E0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ac(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder H0(TL_stars.StarsAmount starsAmount) {
        return I0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (f4512w0 == null) {
            f4512w0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f4512w0.format(j10 / 1.0E9d);
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
                DecimalFormat decimalFormat = f4512w0;
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

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        boolean z10;
        if (f4512w0 == null) {
            f4512w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f4512w0.format(starsAmount.amount / 1.0E9d);
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
                DecimalFormat decimalFormat = f4512w0;
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

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f4512w0 == null) {
                f4512w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f4512w0.format(starsAmount.amount / 1.0E9d);
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
            if (f4512w0 == null) {
                f4512w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f4512w0;
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

    public static String L0(long j10) {
        String str;
        if (f4511v0 == null) {
            f4511v0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f4511v0.format(j10 / 1.0E9d);
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

    public static java.lang.String M0(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: bi.dd.M0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder N0(CharSequence charSequence, float f7) {
        return O0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f7, float f10, float f11) {
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
        zq zqVar = new zq(R.drawable.diamond, 0);
        zqVar.recolorDrawable = false;
        zqVar.translate(0.0f, f10);
        zqVar.spaceScaleX = f11;
        zqVar.setScale(f7, f7);
        spannableString.setSpan(zqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder P0(CharSequence charSequence) {
        return Q0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f7, zq[] zqVarArr) {
        return T0(false, charSequence, f7, zqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, boolean z10) {
        return T0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return T0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(boolean z10, CharSequence charSequence, float f7, zq[] zqVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        zq zqVar;
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
        if (zqVarArr == null || (zqVar = zqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            zqVar = new zq(i10, 0);
            if (zqVarArr != null) {
                zqVarArr[0] = zqVar;
            }
        }
        zqVar.translate(0.0f, f10);
        zqVar.spaceScaleX = f11;
        if (z10) {
            zqVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            zqVar.setScale(f12, f12);
        } else {
            zqVar.setScale(f7, f7);
        }
        spannableString.setSpan(zqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder U0(boolean z10, String str, zq[] zqVarArr) {
        zq zqVar;
        int i10;
        float f7;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (zqVarArr == null || (zqVar = zqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            zqVar = new zq(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f7 = 0.222f;
            } else {
                f7 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            zqVar.setScale(f7, f10);
        }
        if (z10) {
            zqVar.recolorDrawable = false;
        }
        if (zqVarArr != null) {
            zqVarArr[0] = zqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(zqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(TL_stars.StarsAmount starsAmount, String str, zq[] zqVarArr) {
        return W0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, zqVarArr);
    }

    public static SpannableStringBuilder W0(boolean z10, CharSequence charSequence, float f7, zq[] zqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        zq zqVar;
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
        if (zqVarArr == null || (zqVar = zqVarArr[0]) == null) {
            if (zqVarArr != null && zqVarArr.length > 0) {
                zqVar = new zq(i10, 0);
                zqVarArr[0] = zqVar;
            } else {
                zqVar = new zq(i10, 0);
            }
        }
        zqVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        zqVar.setScale(f7, f7);
        spannableString.setSpan(zqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static fb X0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
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

    public static void Y0(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23297a7, 0.35f), 0L, null, null, 0);
    }

    public static void Z0(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        Y0(imageReceiver, document, i10);
    }

    public static void a1(org.telegram.ui.Components.y9 y9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 1000) {
            str = "2⃣";
        } else if (j10 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        X0(y9Var, imageReceiver, str, false);
    }

    public static fb b1(org.telegram.ui.Components.y9 y9Var, ImageReceiver imageReceiver, int i10) {
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
        return X0(y9Var, imageReceiver, str, false);
    }

    public static void c1(org.telegram.ui.Components.y9 y9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 10000000000L) {
            str = "2⃣";
        } else if (j10 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        X0(y9Var, imageReceiver, str, true);
    }

    public static void d1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.u6 u6Var) {
        ?? r17;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.k3 i11 = vh.i(1, context, u6Var, false);
        ?? d = vh.d(context, 1);
        d.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        d.addView(frameLayout, gb1.x(-1, 150, 7, 0, 0, 0, 10));
        ec ecVar = new ec(context, 70, 0);
        frameLayout.addView(ecVar, gb1.g(-1.0f, -1));
        ug.n nVar = new ug.n(context, 1, 2);
        ug.g gVar = nVar.f49813b;
        gVar.f49797z = org.telegram.ui.ActionBar.y6.fk;
        gVar.A = org.telegram.ui.ActionBar.y6.gk;
        gVar.b();
        nVar.setStarParticlesView(ecVar);
        frameLayout.addView(nVar, gb1.h(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23462j5, u6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.k3[] k3VarArr = new org.telegram.ui.ActionBar.k3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        ?? e = vh.e(d, textView, gb1.x(-1, -2, 17, 20, 0, 20, 4), context);
        e.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(20.0f), -6915073));
        e.setTextColor(-1);
        e.setTextSize(1, 11.33f);
        e.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        e.setGravity(17);
        e.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i12 = boost.multiplier;
        if (i12 == 0) {
            i12 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i12));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        zq zqVar = new zq(R.drawable.mini_boost_badge, 2);
        zqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
        e.setText(spannableStringBuilder);
        d.addView(e, gb1.x(-2, 20, 17, 20, 4, 20, 4));
        w01 w01Var = new w01(context, u6Var);
        w01Var.n(LocaleController.getString(R.string.BoostFrom), i10, j10, new ja(k3VarArr, j10, 3));
        w01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            r17 = 0;
            a3.i0 i0Var = new a3.i0(k3VarArr, j10, boost, 3);
            k3VarArr = k3VarArr;
            w01Var.i(string, string2, i0Var);
        } else {
            r17 = 0;
        }
        String string3 = LocaleController.getString(R.string.BoostDate);
        int i13 = R.string.formatDateAtTime;
        String format = LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000));
        String format2 = LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[r17] = format;
        objArr[1] = format2;
        w01Var.c(string3, LocaleController.formatString(i13, objArr), null, null);
        String string4 = LocaleController.getString(R.string.BoostUntil);
        int i14 = R.string.formatDateAtTime;
        String format3 = LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000));
        String format4 = LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[r17] = format3;
        objArr2[1] = format4;
        w01Var.c(string4, LocaleController.formatString(i14, objArr2), null, null);
        d.addView(w01Var, gb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        z90 z90Var = new z90(context, u6Var);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ra(context, 3)));
        z90Var.setGravity(17);
        d.addView(z90Var, gb1.o(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.i(LocaleController.getString(R.string.OK), r17, true);
        dVar.setOnClickListener(new sa(k3VarArr, 1));
        d.addView(dVar, gb1.o(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = d;
        k3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            k3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        k3VarArr[0].show();
        k3VarArr[0].setOnDismissListener(new u6(nVar, 2));
    }

    public static k1 e1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.u6 u6Var) {
        bg.a resellAmount;
        bg.b bVar = bg.b.f3980a;
        if (tL_starGiftUnique == null) {
            resellAmount = bg.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(bg.b.f3981b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        k1 k1Var = new k1(context, u6Var, i10, resellAmount, new ai.n1(6, callback2, r8));
        k1[] k1VarArr = {k1Var};
        k1Var.show();
        return k1VarArr[0];
    }

    public static void f1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        int i11;
        CharSequence l4;
        org.telegram.ui.ActionBar.k3[] k3VarArr;
        long j11;
        boolean z11 = false;
        org.telegram.ui.ActionBar.k3 i12 = vh.i(1, context, u6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.d3.o(R.string.PaidContentTitle, textView, 1, 20.0f);
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i13, u6Var);
        linearLayout.addView(textView, gb1.o(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        rd0 rd0Var = new rd0(context, u6Var);
        rd0Var.setForceForceUseCenter(true);
        rd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        rd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i13, u6Var);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        fi.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.f7.D(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23680uf, u6Var);
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.y6.f23698vf, u6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new gb(rd0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, gb1.t(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, gb1.s(-1, -2, 1.0f, 119));
        rd0Var.e(editTextBoldCursor);
        rd0Var.addView(linearLayout2, gb1.i(-1, -2, 48));
        linearLayout.addView(rd0Var, gb1.r(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.A6, null);
        rd0Var.addView(textView2, gb1.h(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        z90 z90Var = new z90(context, null);
        z90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new ra(context, 4)), true));
        z90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        linearLayout.addView(z90Var, gb1.o(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final fi.d f7 = vh.f(24, context, u6Var, true);
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        f7.i(LocaleController.getString(i11), false, true);
        linearLayout.addView(f7, gb1.r(-1, 48));
        if (i14 > 0 && z10) {
            dVar = vh.f(24, context, u6Var, false);
            dVar.i(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, gb1.o(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i12.customView = linearLayout;
        final org.telegram.ui.ActionBar.k3[] k3VarArr2 = {i12};
        if (i14 <= 0) {
            l4 = "";
        } else {
            l4 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l4);
        editTextBoldCursor.addTextChangedListener(new bc(editTextBoldCursor, rd0Var, j10, z10, f7, textView2));
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
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new jb(editTextBoldCursor2, k3VarArr2, 1));
                return true;
            }
        });
        f7.setOnClickListener(new ib(zArr, callback2, editTextBoldCursor, f7, k3VarArr2));
        if (dVar != null) {
            fi.d dVar2 = dVar;
            ib ibVar = new ib(zArr, callback2, dVar2, editTextBoldCursor, k3VarArr2);
            k3VarArr = k3VarArr2;
            dVar2.setOnClickListener(ibVar);
        } else {
            k3VarArr = k3VarArr2;
        }
        k3VarArr[0].fixNavigationBar();
        k3VarArr[0].setOnDismissListener(new cb(editTextBoldCursor, 1));
        k3VarArr[0].show();
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R instanceof un) {
            z11 = ((un) R).Z9();
        }
        jb jbVar = new jb(k3VarArr, editTextBoldCursor);
        if (z11) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        AndroidUtilities.runOnUIThread(jbVar, j11);
    }

    public static org.telegram.ui.ActionBar.k3 g1(final android.content.Context r59, final boolean r60, final long r61, final int r63, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r64, final org.telegram.ui.ActionBar.u6 r65) {
        throw new UnsupportedOperationException("Method not decompiled: bi.dd.g1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.u6):org.telegram.ui.ActionBar.k3");
    }

    public static void h1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.u6 u6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f22256id = tL_messageActionPaymentRefunded.charge.f22155id;
        starsTransaction.refund = true;
        g1(activity, false, 0L, i10, starsTransaction, u6Var);
    }

    public static void i1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.u6 u6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f22256id = tL_payments_paymentReceiptStars.transaction_id;
        g1(context, false, 0L, i10, starsTransaction, u6Var);
    }

    public static CharSequence o1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        zq[] zqVarArr;
        y4.o c10;
        if (z10 && c3.h0.t(spannableStringBuilder)) {
            for (zq zqVar : (zq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zq.class)) {
                Drawable drawable = zqVar.drawable;
                if (drawable != null && !(drawable instanceof y4.o) && (c10 = y4.o.c(ApplicationLoader.applicationContext.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(zqVar.drawable.getBounds());
                    zqVar.drawable = c10;
                    zqVar.recolorDrawable = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void w0(dd ddVar, Context context) {
        if (MessagesController.getInstance(ddVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(ddVar.currentAccount);
        } else {
            new uc(context, ddVar.resourceProvider).show();
        }
    }

    public static void x0(dd ddVar) {
        ca.y(ddVar.currentAccount, false).u();
        vg.n1.e0(1, BirthdayController.getInstance(ddVar.currentAccount).getState());
    }

    public static void y0(bi.dd r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: bi.dd.y0(bi.dd, int):void");
    }

    public static void z0(dd ddVar, t61 t61Var, Boolean bool, String str) {
        if (ddVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                org.telegram.ui.Components.wc.b0(ddVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) t61Var.B, new Object[0])), R.raw.stars_topup).j();
                ddVar.f4520h0.c(true);
                ca.y(ddVar.currentAccount, false).T(true);
            } else if (str != null) {
                ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.wc.b0(ddVar), R.raw.error, 36);
            }
        }
    }

    public final void F0() {
        m1();
        mm0 mm0Var = this.f38713c;
        if (mm0Var != null && this.U != null && mm0Var.getLayoutParams() != null) {
            int g7 = org.telegram.ui.d3.g(48.0f, this.f4514b0, -AndroidUtilities.dp(8.0f));
            int g10 = org.telegram.ui.d3.g(48.0f, this.f4515c0, -AndroidUtilities.dp(8.0f));
            AndroidUtilities.setViewLayoutMargins(this.f38713c, 0, g7, 0, g10);
            mm0 mm0Var2 = this.f38713c;
            int i10 = -g7;
            mm0Var2.setPadding(mm0Var2.getPaddingLeft(), i10, this.f38713c.getPaddingRight(), this.f4515c0 - g10);
            this.U.z(i10, -g10);
        }
    }

    public final void G0(ArrayList arrayList, j71 j71Var) {
        boolean z10;
        mm0 mm0Var;
        int i10;
        j1("FILL_BEFORE");
        lw0 lw0Var = this.U;
        if (lw0Var != null && lw0Var.f30308e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4513a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        ca y3 = ca.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        t61 t61Var = new t61(-2);
        t61Var.f32866c = (z10) super.k0(getParentActivity());
        arrayList.add(t61Var);
        arrayList.add(t61.k(this.f4521i0));
        fi.d dVar = this.f4529r0;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(t61.C(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(hi.g.a(-4, getThemedColor(org.telegram.ui.ActionBar.y6.uj), R.drawable.filled_earn_stars, mo.e0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(t61.C(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            ic.a.p(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = vc.f5579a;
                t61 K = t61.K(vc.class);
                K.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(K);
            }
            if (y3.f4460x) {
                arrayList.add(t61.q(arrayList.size(), 33));
            } else if (!y3.f4461y) {
                t61 c10 = t61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.f32877q = true;
                arrayList.add(c10);
            }
            arrayList.add(t61.C(null));
        }
        boolean O = y3.O(0);
        this.f4530s0 = O;
        if (O) {
            this.f4513a0 = arrayList.size();
            arrayList.add(t61.n(this.V, -2));
            if (z10 && (mm0Var = this.f38713c) != null) {
                u6 u6Var = this.f4518f0;
                mm0Var.removeCallbacks(u6Var);
                this.f38713c.post(u6Var);
            }
        } else {
            arrayList.add(t61.m(this.f4519g0));
        }
        j1("FILL_AFTER");
    }

    @Override
    public final View createView(final Context context) {
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        lw0 lw0Var = new lw0(context);
        this.U = lw0Var;
        boolean z11 = true;
        lw0Var.setDebugLoggingEnabled(true);
        this.U.setCommonInsetsManagedExternally(true);
        if (!this.f4516d0) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
                i10 = 0;
            } else {
                i10 = AndroidUtilities.statusBarHeight;
            }
            this.f4514b0 = i10;
            this.f4515c0 = AndroidUtilities.navigationBarHeight;
        }
        this.U.setGeometry(new rb.c(this, 10));
        this.U.z(-org.telegram.ui.d3.g(48.0f, this.f4514b0, -AndroidUtilities.dp(8.0f)), -org.telegram.ui.d3.g(48.0f, this.f4515c0, -AndroidUtilities.dp(8.0f)));
        lw0 lw0Var2 = this.U;
        lw0Var2.getClass();
        this.V = new cc(lw0Var2, context, 24);
        this.T = new cd(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.f4519g0 = new cc(this, context, 0);
        super.createView(context);
        c20 c20Var = this.f38717s;
        getBaseSimpleGlass().e(c20Var, this.f38713c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.f38720y.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().h = this.U;
        this.f38713c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f19424i = new g(1, this, new f(1, c20Var));
        FrameLayout frameLayout = this.T.d;
        View view = new View(getParentActivity());
        this.W = view;
        view.setAlpha(0.0f);
        lw0 lw0Var3 = this.U;
        lw0Var3.addView(this.W, lw0Var3.indexOfChild(frameLayout), gb1.i(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        ab abVar = new ab(this, 0);
        ds dsVar = ds.h;
        oe.b bVar = new oe.b(0, abVar, dsVar, 380L, false);
        this.X = bVar;
        this.Y = new oe.b(1, new ab(this, 1), dsVar, 380L, false);
        this.Z = new oe.b(2, new ab(this, 2), dsVar, 380L, false);
        if (!this.f38713c.canScrollVertically(-1) && !this.simpleActionBar.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        bVar.a(z10, false);
        this.Y.a(this.U.f30308e0, false);
        this.f38713c.j(new ai.b(this, 6));
        m1();
        eh.d c10 = getBaseSimpleGlass().f19421c.c(frameLayout, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.parentLayout;
        if (j5Var2 != null && ((ActionBarLayout) j5Var2).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        frameLayout2.setClickable(true);
        ug.n nVar = new ug.n(context, 1, 2);
        this.S = nVar;
        ug.g gVar = nVar.f49813b;
        gVar.f49797z = org.telegram.ui.ActionBar.y6.fk;
        gVar.A = org.telegram.ui.ActionBar.y6.gk;
        gVar.b();
        this.S.setStarParticlesView(this.e);
        this.R.addView(this.S, gb1.h(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        f0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new ra(context, 1)), true), this.R, null);
        this.f38713c.setOverScrollMode(2);
        s4.l lVar = new s4.l();
        lVar.f47760m = false;
        lVar.C = false;
        lVar.o(dsVar);
        lVar.n(350L);
        this.f38713c.setItemAnimator(lVar);
        this.f38713c.setOnItemClickListener(new ai.k(this, 1));
        z00 z00Var = new z00(getParentActivity());
        this.f4520h0 = z00Var;
        this.f38717s.addView(z00Var, gb1.g(-1.0f, -1));
        ca y3 = ca.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f4521i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f4521i0.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getParentActivity(), false, true, false);
        this.f4523k0 = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        this.f4523k0.setTextSize(AndroidUtilities.dp(32.0f));
        this.f4523k0.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(this.f4523k0, org.telegram.ui.ActionBar.y6.G6, this.resourceProvider);
        this.f4522j0 = new SpannableStringBuilder("S");
        j70 j70Var = new j70(this.f4523k0, 42.0f, this.currentAccount);
        xj0 xj0Var = new xj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = j70Var.f40470b;
        imageReceiver.setImageBitmap(xj0Var);
        imageReceiver.setAutoRepeat(2);
        j70Var.f40472f = false;
        j70Var.h = -AndroidUtilities.dp(3.0f);
        this.f4522j0.setSpan(j70Var, 0, 1, 33);
        this.f4521i0.addView(this.f4523k0, gb1.h(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.f4524l0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f4524l0.setGravity(17);
        this.f4524l0.setText(LocaleController.getString(R.string.YourStarsBalance));
        org.telegram.ui.ActionBar.f7.V(this.f4524l0, org.telegram.ui.ActionBar.y6.f23765z6, this.resourceProvider);
        this.f4521i0.addView(this.f4524l0, gb1.h(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        bh.r rVar = new bh.r(this, getParentActivity(), 2);
        this.f4525n0 = rVar;
        frameLayout3.addView(rVar);
        fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.f4526o0 = dVar;
        dVar.f();
        this.f4526o0.i("", false, true);
        this.f4526o0.setOnClickListener(new View.OnClickListener(this) {
            public final dd f5706b;

            {
                this.f5706b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        dd.w0(this.f5706b, context);
                        return;
                    default:
                        new uc(context, this.f5706b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f4525n0.addView(this.f4526o0, gb1.i(-1, 48, 119));
        xa1 xa1Var = new xa1(this, getParentActivity(), 3);
        this.f4527p0 = xa1Var;
        frameLayout3.addView(xa1Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.f4528q0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new zq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.f4528q0.i(spannableStringBuilder, false, true);
        this.f4528q0.setOnClickListener(new View.OnClickListener(this) {
            public final dd f5706b;

            {
                this.f5706b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        dd.w0(this.f5706b, context);
                        return;
                    default:
                        new uc(context, this.f5706b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f4527p0.addView(this.f4528q0, gb1.t(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        fi.d dVar3 = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.m0 = dVar3;
        dVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new zq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.m0.i(spannableStringBuilder2, false, true);
        this.m0.setOnClickListener(new View.OnClickListener(this) {
            public final dd f5778b;

            {
                this.f5778b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        dd ddVar = this.f5778b;
                        ddVar.presentFragment(new y(0, ddVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        dd.x0(this.f5778b);
                        return;
                }
            }
        });
        this.f4527p0.addView(this.m0, gb1.t(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f4521i0.addView(frameLayout3, gb1.h(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        fi.d dVar4 = new fi.d(getParentActivity(), this.resourceProvider, false);
        this.f4529r0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new zq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f4529r0.i(spannableStringBuilder3, false, true);
        this.f4529r0.setOnClickListener(new View.OnClickListener(this) {
            public final dd f5778b;

            {
                this.f5778b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        dd ddVar = this.f5778b;
                        ddVar.presentFragment(new y(0, ddVar.getUserConfig().getClientUserId()));
                        return;
                    default:
                        dd.x0(this.f5778b);
                        return;
                }
            }
        });
        this.f4521i0.addView(this.f4529r0, gb1.h(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        fc fcVar = this.f4532u0;
        if (fcVar != null) {
            fcVar.O(false);
        }
        m0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = m0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (y3.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z11 = false;
        }
        l1(z11, false);
        return this.fragmentView;
    }

    @Override
    public final void d0() {
        lw0 lw0Var;
        j1("RESTORE_BEFORE");
        super.d0();
        if (this.f4517e0 && (lw0Var = this.U) != null && this.f4513a0 != -1) {
            lw0Var.a();
        }
        this.f4517e0 = false;
        j1("RESTORE_AFTER");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        if (i10 == i12 || i10 == NotificationCenter.starSubscriptionsLoaded || i10 == NotificationCenter.starOptionsLoaded) {
            j1("NOTIFICATION_" + i10);
        }
        if (i10 == NotificationCenter.starOptionsLoaded) {
            q0();
            fc fcVar = this.f4532u0;
            if (fcVar != null) {
                fcVar.O(true);
            }
            d0();
        } else if (i10 == i12) {
            ca y3 = ca.y(this.currentAccount, false);
            if (this.f4530s0 != y3.O(0)) {
                this.f4530s0 = y3.O(0);
                q0();
                fc fcVar2 = this.f4532u0;
                if (fcVar2 != null) {
                    fcVar2.O(false);
                }
                d0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            fc fcVar3 = this.f4532u0;
            if (fcVar3 != null) {
                fcVar3.O(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            k1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            k1();
        }
    }

    @Override
    public final void e0() {
        this.f38717s.addView(this.U, gb1.g(-1.0f, -1));
        this.U.u(this.f38713c, new ab(this, 3));
        lw0 lw0Var = this.U;
        cd cdVar = this.T;
        lw0Var.x(cdVar, cdVar.f4468b, new ag.w(29));
        this.U.y(this.T.d);
        this.T.d.setLayoutParams(gb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        F0();
    }

    @Override
    public final s4.h0 g0() {
        fc fcVar = new fc(this, this.f38713c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 9), getResourceProvider());
        this.f4532u0 = fcVar;
        fcVar.f29505r = false;
        return fcVar;
    }

    @Override
    public final s4.c0 h0(Context context) {
        lw0 lw0Var = this.U;
        lw0Var.getClass();
        return new ig.j0(5, lw0Var, false);
    }

    @Override
    public final tg.x1 i0() {
        return new ec(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        lw0 lw0Var = this.U;
        if (lw0Var == null || motionEvent == null || lw0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.f4468b.f33314b == 0) {
            return true;
        }
        return false;
    }

    public final void j1(String str) {
        boolean z10;
        int top;
        int height;
        if (this.U != null) {
            StringBuilder v = a1.g.v("Stars event=", str, " row=");
            v.append(this.f4513a0);
            v.append(" hasTransactions=");
            v.append(this.f4530s0);
            v.append(" savedPosition=");
            v.append(this.P);
            v.append(" savedOffset=");
            v.append(this.Q);
            v.append(" savedPinned=");
            v.append(this.f4517e0);
            v.append(" boundaryAttached=");
            cc ccVar = this.V;
            if (ccVar != null && ccVar.getParent() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            v.append(z10);
            v.append(" boundaryTop=");
            cc ccVar2 = this.V;
            if (ccVar2 == null) {
                top = 0;
            } else {
                top = ccVar2.getTop();
            }
            v.append(top);
            v.append(" boundaryHeight=");
            cc ccVar3 = this.V;
            if (ccVar3 == null) {
                height = 0;
            } else {
                height = ccVar3.getHeight();
            }
            v.append(height);
            Log.d("SiblingScroll", v.toString());
            lw0 lw0Var = this.U;
            if (!lw0Var.f30301a) {
                return;
            }
            lw0Var.f30303b = Math.max(lw0Var.f30303b, Math.min(60, Math.max(0, 30)));
            lw0Var.f(str, null, 0, 0, true);
        }
    }

    @Override
    public final View k0(Context context) {
        throw null;
    }

    public final void k1() {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        ca y3 = ca.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f4522j0);
        spannableStringBuilder.append((CharSequence) I0(y3.p(), 0.66f, ' '));
        this.f4523k0.setText(spannableStringBuilder);
        fi.d dVar = this.f4526o0;
        if (y3.p().amount > 0) {
            i10 = R.string.StarsBuyMore;
        } else {
            i10 = R.string.StarsBuy;
        }
        dVar.i(LocaleController.getString(i10), true, true);
        TLRPC.TL_payments_starsRevenueStats h = m0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        this.f4531t0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.f4525n0.setVisibility(0);
            this.f4527p0.setVisibility(0);
            ViewPropertyAnimator animate = this.f4525n0.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final dd f5863b;

                {
                    this.f5863b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f5863b.f4525n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f5863b.f4527p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f4527p0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final dd f5863b;

                {
                    this.f5863b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f5863b.f4525n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f5863b.f4527p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.f4525n0.animate().cancel();
        this.f4527p0.animate().cancel();
        xa1 xa1Var = this.f4527p0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        xa1Var.setAlpha(f7);
        bh.r rVar = this.f4525n0;
        if (z10) {
            f11 = 0.0f;
        }
        rVar.setAlpha(f11);
        xa1 xa1Var2 = this.f4527p0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        xa1Var2.setVisibility(i10);
        bh.r rVar2 = this.f4525n0;
        if (z10) {
            i11 = 8;
        }
        rVar2.setVisibility(i11);
    }

    @Override
    public final float m0() {
        mm0 mm0Var = this.f38713c;
        if (mm0Var == null) {
            return 0.0f;
        }
        return mm0Var.getY();
    }

    public final void m1() {
        if (this.W == null) {
            return;
        }
        int dp = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f4514b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != dp) {
            layoutParams.height = dp;
            this.W.setLayoutParams(layoutParams);
        }
        n1();
    }

    @Override
    public final View n0() {
        return this.U;
    }

    public final void n1() {
        float f7;
        View view = this.W;
        if (view == null) {
            return;
        }
        oe.b bVar = this.X;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        oe.b bVar2 = this.Y;
        if (bVar2 != null) {
            f10 = bVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f10) * AndroidUtilities.dp(44.0f)));
    }

    @Override
    public final void o0(boolean z10) {
        oe.b bVar = this.Z;
        if (bVar != null && bVar.f19327f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        ca.y(this.currentAccount, false).T(true);
        ca.y(this.currentAccount, false).S();
        ca.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        mm0 mm0Var = this.f38713c;
        if (mm0Var != null) {
            mm0Var.removeCallbacks(this.f4518f0);
        }
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f4516d0 = true;
        this.f4514b0 = i11;
        this.f4515c0 = i13;
        F0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ug.n nVar = this.S;
        if (nVar != null) {
            nVar.setPaused(true);
            this.S.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ug.n nVar = this.S;
        if (nVar != null) {
            nVar.setPaused(false);
            this.S.setDialogVisible(false);
        }
    }

    @Override
    public final void q0() {
        boolean z10;
        j1("SAVE_BEFORE");
        super.q0();
        lw0 lw0Var = this.U;
        if (lw0Var != null && lw0Var.f30308e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4517e0 = z10;
        mm0 mm0Var = this.f38713c;
        if (mm0Var != null && this.P >= 0) {
            this.Q -= mm0Var.getPaddingTop();
        }
        j1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
