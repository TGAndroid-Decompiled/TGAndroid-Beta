package hh;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a20;
import org.telegram.ui.f70;
import org.telegram.ui.jo;
import org.telegram.ui.ra1;
import org.telegram.ui.rn;
import org.telegram.ui.z10;

public final class oa extends a20 implements NotificationCenter.NotificationCenterDelegate {

    public static DecimalFormat f9845d0;

    public static DecimalFormat f9846e0;
    public FrameLayout L;
    public bg.i M;
    public na N;
    public ag.s0 O;
    public f00 P;
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public org.telegram.ui.Components.j6 S;
    public TextView T;
    public lh.d U;
    public ag.p1 V;
    public lh.d W;
    public ra1 X;
    public lh.d Y;
    public lh.d Z;

    public boolean f9847a0;

    public boolean f9848b0;

    public n9 f9849c0;

    public oa() {
        this.I = true;
    }

    public static void A0(oa oaVar) {
        u7.y(oaVar.currentAccount, false).u();
        cg.y2.e0(1, BirthdayController.getInstance(oaVar.currentAccount).getState());
    }

    public static void B0(oa oaVar, Context context) {
        if (MessagesController.getInstance(oaVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(oaVar.currentAccount);
        } else {
            new fa(context, oaVar.resourceProvider).show();
        }
    }

    public static void F0(yy0 yy0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        CharSequence pluralStringComma;
        TextView textView = (TextView) ((vy0) yy0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        u80 u80Var = new u80(textView, AndroidUtilities.dp(90.0f), 0, c6Var);
        u80Var.a(org.telegram.ui.ActionBar.g6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.g6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i11 = starGift.availability_remains;
                textView.setText(i11 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i11, LocaleController.formatNumber(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                pluralStringComma = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                pluralStringComma = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(pluralStringComma);
            return;
        }
        final u7 u7VarY = u7.y(i10, false);
        final long j10 = starGift.f22607id;
        final ag.n0 n0Var = new ag.n0(textView, 18);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                u7 u7Var;
                TL_stars.StarGift starGiftJ;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (starGiftJ = (u7Var = u7VarY).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(u7Var.f10151a).removeObserver(notificationCenterDelegateArr[0], i14);
                n0Var.run(starGiftJ);
            }
        };
        int i12 = u7VarY.f10151a;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i13 = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i13);
        TL_stars.StarGift starGiftJ = u7VarY.J(j10);
        if (starGiftJ != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(i12).removeObserver(notificationCenterDelegateArr[0], i13);
            n0Var.run(starGiftJ);
        }
    }

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new k9(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static android.text.SpannableStringBuilder J0(org.telegram.tgnet.tl.TL_stars.StarsAmount r20, float r21, char r22) {
        throw new UnsupportedOperationException("Method not decompiled: hh.oa.J0(org.telegram.tgnet.tl.TL_stars$StarsAmount, float, char):android.text.SpannableStringBuilder");
    }

    public static android.text.SpannableStringBuilder K0(org.telegram.tgnet.tl.TL_stars.StarsAmount r20, float r21, char r22) {
        throw new UnsupportedOperationException("Method not decompiled: hh.oa.K0(org.telegram.tgnet.tl.TL_stars$StarsAmount, float, char):android.text.SpannableStringBuilder");
    }

    public static android.text.SpannableStringBuilder L0(org.telegram.tgnet.tl.TL_stars.StarsAmount r18) {
        throw new UnsupportedOperationException("Method not decompiled: hh.oa.L0(org.telegram.tgnet.tl.TL_stars$StarsAmount):android.text.SpannableStringBuilder");
    }

    public static String M0(long j10) {
        if (f9845d0 == null) {
            f9845d0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f9845d0.format(j10 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10 < 0 ? "-" : "");
        sb2.append(LocaleController.formatNumber(Math.abs(j10 / 1000000000), ','));
        return sb2.toString();
    }

    public static java.lang.String N0(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: hh.oa.N0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f10) {
        return P0(charSequence, f10, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f10, float f11, float f12) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        cq cqVar = new cq(R.drawable.diamond, 0);
        cqVar.recolorDrawable = false;
        cqVar.translate(0.0f, f11);
        cqVar.spaceScaleX = f12;
        cqVar.setScale(f10, f10);
        spannableString.setSpan(cqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10, cq[] cqVarArr) {
        return U0(false, charSequence, f10, cqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f10, cq[] cqVarArr, float f11, float f12) {
        cq cqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (cqVarArr == null || (cqVar = cqVarArr[0]) == null) {
            cqVar = new cq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (cqVarArr != null) {
                cqVarArr[0] = cqVar;
            }
        }
        cqVar.translate(0.0f, f11);
        cqVar.spaceScaleX = f12;
        if (z10) {
            float f13 = f10 * 0.2f;
            cqVar.setScale(f13, f13);
        } else {
            cqVar.setScale(f10, f10);
        }
        spannableString.setSpan(cqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, cq[] cqVarArr) {
        cq cqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (cqVarArr == null || (cqVar = cqVarArr[0]) == null) {
            cqVar = new cq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            cqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (cqVarArr != null) {
            cqVarArr[0] = cqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(cqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, cq[] cqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, cqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, cq[] cqVarArr) {
        cq cqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (cqVarArr == null || (cqVar = cqVarArr[0]) == null) {
            if (cqVarArr == null || cqVarArr.length <= 0) {
                cqVar = new cq(i10, 0);
            } else {
                cqVar = new cq(i10, 0);
                cqVarArr[0] = cqVar;
            }
        }
        if (z10) {
            f10 *= 0.33f;
        } else {
            cqVar.recolorDrawable = false;
        }
        cqVar.setScale(f10, f10);
        spannableString.setSpan(cqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static n8 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final l8 l8Var = new l8(z10, currentAccount, str, imageReceiver, new boolean[1]);
        l8Var.run();
        final int i10 = 0;
        final int i11 = 1;
        return new n8(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        l8Var.run();
                        break;
                    default:
                        l8Var.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        l8Var.run();
                        break;
                    default:
                        l8Var.run();
                        break;
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), com.google.android.recaptcha.internal.a.l(i10, "_", i10), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.l(i10, "_", i10), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f22999a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        Z0(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void b1(org.telegram.ui.Components.n9 n9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 1000) {
            str = "2⃣";
        } else {
            str = j10 < 2500 ? "3⃣" : "4⃣";
        }
        Y0(n9Var, imageReceiver, str, false);
    }

    public static n8 c1(org.telegram.ui.Components.n9 n9Var, ImageReceiver imageReceiver, int i10) {
        String str;
        if (i10 == 3) {
            str = "2⃣";
        } else if (i10 == 6) {
            str = "3⃣";
        } else if (i10 != 12) {
            str = i10 != 24 ? "1⃣" : "5⃣";
        } else {
            str = "4⃣";
        }
        return Y0(n9Var, imageReceiver, str, false);
    }

    public static void d1(org.telegram.ui.Components.n9 n9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 10000000000L) {
            str = "2⃣";
        } else {
            str = j10 <= 50000000000L ? "1⃣" : "3⃣";
        }
        Y0(n9Var, imageReceiver, str, true);
    }

    public static void e1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.c6 c6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        linearLayoutG.setClipChildren(false);
        linearLayoutG.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayoutG.addView(frameLayout, h7.z5.t(-1, 150, 7, 0, 0, 0, 10));
        m9 m9Var = new m9(context, 70, 0);
        frameLayout.addView(m9Var, h7.z5.c(-1.0f, -1));
        int i11 = 2;
        bg.i iVar = new bg.i(context, 1, 2);
        bg.a aVar = iVar.f2129b;
        aVar.f2107w = org.telegram.ui.ActionBar.g6.fk;
        aVar.f2108x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        iVar.setStarParticlesView(m9Var);
        frameLayout.addView(iVar, h7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        TextView textView = new TextView(context);
        rl.w(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayoutG, textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        textViewI.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), -6915073));
        textViewI.setTextColor(-1);
        textViewI.setTextSize(1, 11.33f);
        textViewI.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        textViewI.setGravity(17);
        textViewI.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i12 = boost.multiplier;
        if (i12 == 0) {
            i12 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i12));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        cq cqVar = new cq(R.drawable.mini_boost_badge, 2);
        cqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
        textViewI.setText(spannableStringBuilder);
        linearLayoutG.addView(textViewI, h7.z5.t(-2, 20, 17, 20, 4, 20, 4));
        yy0 yy0Var = new yy0(context, c6Var);
        yy0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j10, new x7(e3VarArr, j10, i11));
        yy0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            e5.u uVar = new e5.u(e3VarArr, j10, boost, 4);
            e3VarArr = e3VarArr;
            yy0Var.g(string, string2, uVar);
        }
        yy0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) boost.date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) boost.date) * 1000))), null, null);
        yy0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) boost.expires) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) boost.expires) * 1000))), null, null);
        linearLayoutG.addView(yy0Var, h7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        p80 p80Var = new p80(context, c6Var);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.e(context, 7)));
        p80Var.setGravity(17);
        linearLayoutG.addView(p80Var, h7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new d8(e3VarArr, 1));
        linearLayoutG.addView(dVar, h7.z5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        e3VarO.customView = linearLayoutG;
        e3VarArr[0] = e3VarO;
        e3VarO.useBackgroundTopPadding = false;
        e3VarO.fixNavigationBar();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(n2VarU)) {
            e3VarArr[0].makeAttached(n2VarU);
        }
        iVar.setPaused(false);
        e3VarArr[0].show();
        e3VarArr[0].setOnDismissListener(new f2.r(iVar, 27));
    }

    public static x0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        hf.a resellAmount;
        hf.b bVar = hf.b.f8921a;
        if (tL_starGiftUnique == null) {
            resellAmount = hf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else {
            resellAmount = tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(hf.b.f8922b) : tL_starGiftUnique.getResellAmount(bVar);
        }
        x0 x0Var = new x0(context, c6Var, i10, resellAmount, new gh.d1(8, callback2, x0VarArr));
        x0[] x0VarArr = {x0Var};
        x0Var.show();
        return x0VarArr[0];
    }

    public static void g1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        Object[] objArr = 0;
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayout.addView(textView, h7.z5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        jc0 jc0Var = new jc0(context, c6Var);
        jc0Var.setForceForceUseCenter(true);
        jc0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        jc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        lh.d dVarG = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int iDp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), iDp, iDp, iDp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23366uf, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23382vf, c6Var));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new p8(jc0Var, editTextBoldCursor, objArr == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, h7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, h7.z5.o(-1, -2, 1.0f, 119));
        jc0Var.e(editTextBoldCursor);
        jc0Var.addView(linearLayout2, h7.z5.e(-1, -2, 48));
        linearLayout.addView(jc0Var, h7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
        jc0Var.addView(textView2, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.e(context, 8)), true));
        p80Var.setTextSize(1, 12.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        linearLayout.addView(p80Var, h7.z5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final lh.d dVarG2 = rl.g(24, context, c6Var, true);
        dVarG2.g(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(dVarG2, h7.z5.n(-1, 48));
        if (j10 > 0 && z10) {
            dVarG = rl.g(24, context, c6Var, false);
            dVarG.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVarG, h7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        e3VarO.customView = linearLayout;
        final org.telegram.ui.ActionBar.e3[] e3VarArr = {e3VarO};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new l9(editTextBoldCursor, jc0Var, j10, z10, dVarG2, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                if (i11 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                dVarG2.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new s8(editTextBoldCursor2, e3VarArr, 2));
                return true;
            }
        });
        dVarG2.setOnClickListener(new r8(zArr, callback2, editTextBoldCursor, dVarG2, e3VarArr));
        if (dVarG != null) {
            lh.d dVar = dVarG;
            dVar.setOnClickListener(new r8(zArr, callback2, dVar, editTextBoldCursor, e3VarArr));
        }
        r16[0].fixNavigationBar();
        r16[0].setOnDismissListener(new ag.j0(editTextBoldCursor, 4));
        r16[0].show();
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new s8(e3VarArr, editTextBoldCursor), n2VarR instanceof rn ? ((rn) n2VarR).P9() : false ? 200L : 80L);
    }

    public static org.telegram.ui.ActionBar.e3 h1(final Context context, final boolean z10, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        boolean z11;
        final org.telegram.ui.Components.n9 n9Var;
        TL_stars.StarGift starGift;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        boolean z12;
        char c10;
        boolean z13;
        long j11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        String str;
        TLRPC.Peer peer;
        long peerDialogId;
        org.telegram.ui.Components.y8 y8Var;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        ?? r10;
        int i12;
        TextView textViewI;
        int i13;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.e3[] e3VarArr2;
        float f10;
        int i14;
        String string;
        ?? r11;
        ?? r31;
        org.telegram.ui.ActionBar.c6 c6Var3;
        ?? r12;
        org.telegram.ui.ActionBar.e3[] e3VarArr3;
        TL_stars.StarsTransaction starsTransaction3;
        yy0 yy0Var;
        ?? r13;
        yy0 yy0Var2;
        yy0 yy0Var3;
        yy0 yy0Var4;
        ?? r32;
        ?? r33;
        ?? r34;
        ?? r35;
        boolean z14;
        Context context3;
        int i15;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        final org.telegram.ui.ActionBar.e3[] e3VarArr4;
        final Context context4;
        yy0 yy0Var5;
        TL_stars.StarsTransaction starsTransaction4;
        org.telegram.ui.ActionBar.e3[] e3VarArr5;
        yy0 yy0Var6;
        final int i16;
        final org.telegram.ui.ActionBar.e3[] e3VarArr6;
        long j12;
        yy0 yy0Var7;
        long j13;
        ?? r36;
        String str3;
        TL_stars.StarsAmount starsAmount;
        yy0 yy0Var8;
        ?? r37;
        ?? r38;
        TL_stars.StarsTransaction starsTransaction5;
        ?? r15;
        ?? r14;
        int i17;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i18 = starsTransaction.flags;
        boolean z16 = (i18 & 8192) != 0;
        boolean z17 = ((131072 & i18) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i18 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean zPositive = starsAmount2.positive();
        boolean zNegative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        org.telegram.ui.ActionBar.e3[] e3VarArr7 = new org.telegram.ui.ActionBar.e3[1];
        final ?? G = org.telegram.messenger.y1.g(context, 1);
        G.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        G.setClipChildren(false);
        G.setClipToPadding(false);
        String str4 = "";
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift2 = starsTransaction.stargift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                ?? i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                e3VarArr = e3VarArr7;
                e3Var = e3VarO;
                ?? q9Var = new q9(context, matrix, radialGradient, paint, i5Var);
                i5Var.l(q9Var);
                i5Var.i(stargiftattributepattern.document, false);
                q9Var.setOrientation(1);
                org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
                a1(n9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                q9Var.addView(n9Var2, h7.z5.t(160, 160, 17, 0, 20, 0, 0));
                if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    i17 = 2;
                } else {
                    h7.b6.a(n9Var2);
                    i17 = 2;
                    n9Var2.setOnClickListener(new gh.v2(context, i10, tL_starGiftUnique, i17));
                }
                TextView textViewB = h7.d6.b(context, 20.0f, 0, true, null);
                textViewB.setTextColor(-1);
                textViewB.setText(tL_starGiftUnique.title);
                q9Var.addView(textViewB, h7.z5.t(-2, -2, 17, 0, 1, 0, 0));
                TextView textViewB2 = h7.d6.b(context, 13.0f, 0, false, null);
                textViewB2.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                textViewB2.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                q9Var.addView(textViewB2, h7.z5.t(-2, -2, 17, 0, 5, 0, 0));
                TextView textViewB3 = h7.d6.b(context, 18.0f, 0, true, null);
                textViewB3.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                str2 = zPositive ? "+" : "";
                SpannableStringBuilder spannableStringBuilderI0 = I0(starsAmount3);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = str2;
                charSequenceArr[1] = spannableStringBuilderI0;
                charSequenceArr[i17] = " ⭐️";
                textViewB3.setText(T0(starsAmount3, TextUtils.concat(charSequenceArr)));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(textViewB3.getText());
                if (starsTransaction.refund) {
                    G0(spannableStringBuilder2, textViewB3, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    G0(spannableStringBuilder2, textViewB3, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    G0(spannableStringBuilder2, textViewB3, LocaleController.getString(R.string.StarsPending));
                }
                textViewB3.setText(spannableStringBuilder2);
                q9Var.addView(textViewB3, h7.z5.t(-2, -2, 17, 0, 11, 0, 17));
                G.addView(q9Var, h7.z5.n(-1, -2));
                c6Var2 = c6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                r14 = G;
                str4 = "";
                z12 = z18;
            } else {
                e3Var = e3VarO;
                e3VarArr = e3VarArr7;
                z11 = z17;
                n9Var = new org.telegram.ui.Components.n9(context);
                if (starsTransaction.premium_gift) {
                    c1(n9Var, n9Var.getImageReceiver(), starsTransaction.premium_gift_months);
                    G.addView(n9Var, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.posts_search) {
                    dq dqVarA = org.telegram.ui.Cells.q6.a(100, "search");
                    int iDp = AndroidUtilities.dp(40.0f);
                    int iDp2 = AndroidUtilities.dp(40.0f);
                    dqVarA.f27823e = iDp;
                    dqVarA.f27824f = iDp2;
                    n9Var.setImageDrawable(dqVarA);
                } else {
                    starGift = starsTransaction.stargift;
                    if (starGift != null) {
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            n9Var.setImageDrawable(new v4(n9Var, starsTransaction.stargift, 94, 0.44f));
                            G.addView(n9Var, h7.z5.t(94, 94, 17, 0, 2, 0, 10));
                        } else {
                            a1(n9Var.getImageReceiver(), starsTransaction.stargift, 160);
                            G.addView(n9Var, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
                        }
                    } else if (!z19 || starsTransaction.gift) {
                        context2 = context;
                        i11 = i10;
                        starsTransaction2 = starsTransaction;
                        ?? r16 = G;
                        str4 = "";
                        z12 = z18;
                        c10 = 2;
                        z13 = z10;
                        j11 = j10;
                        c6Var2 = c6Var;
                        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                            d1(n9Var, n9Var.getImageReceiver(), starsTransaction2.amount.amount);
                        } else {
                            b1(n9Var, n9Var.getImageReceiver(), starsTransaction2.amount.amount);
                        }
                        r16.addView(n9Var, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
                        r10 = r16;
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        context2 = context;
                        i11 = i10;
                        starsTransaction2 = starsTransaction;
                        ?? r17 = G;
                        c10 = 2;
                        z13 = z10;
                        j11 = j10;
                        c6Var2 = c6Var;
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction2.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                            if (starsTransaction2.photo != null) {
                                n9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                                z12 = z18;
                                n9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            } else {
                                z12 = z18;
                                n9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                                if (z12) {
                                    peer = starsTransaction2.starref_peer;
                                } else {
                                    if (starsTransaction2.subscription && z13) {
                                        peerDialogId = j11;
                                    } else {
                                        peer = starsTransaction2.peer.peer;
                                    }
                                    y8Var = new org.telegram.ui.Components.y8();
                                    if (peerDialogId >= 0) {
                                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                                        y8Var.r(user);
                                        n9Var.e(user, y8Var);
                                    } else {
                                        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                                        y8Var.q(chat);
                                        n9Var.e(chat, y8Var);
                                    }
                                }
                                peerDialogId = DialogObject.getPeerDialogId(peer);
                                y8Var = new org.telegram.ui.Components.y8();
                                if (peerDialogId >= 0) {
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                                    y8Var.r(user2);
                                    n9Var.e(user2, y8Var);
                                } else {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                                    y8Var.q(chat2);
                                    n9Var.e(chat2, y8Var);
                                }
                            }
                            r17.addView(n9Var, h7.z5.t(100, 100, 17, 0, 0, 0, 10));
                            r10 = r17;
                        } else {
                            str4 = "";
                            z12 = z18;
                            if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                str = "ios";
                            } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                str = "android";
                            } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                str = "premiumbot";
                            } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                                str = "fragment";
                            } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                                str = "ads";
                            } else {
                                str = starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?";
                            }
                            dq dqVarA2 = org.telegram.ui.Cells.q6.a(100, str);
                            int iDp3 = AndroidUtilities.dp(40.0f);
                            int iDp4 = AndroidUtilities.dp(40.0f);
                            dqVarA2.f27823e = iDp3;
                            dqVarA2.f27824f = iDp4;
                            n9Var.setImageDrawable(dqVarA2);
                            r10 = r17;
                        }
                    } else {
                        n9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                        TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(0);
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia.photo);
                        } else {
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia.document);
                            } else {
                                imageLocation = null;
                            }
                            n9Var.l(imageLocation, "100_100", null, null, null, 0);
                            G.addView(n9Var, h7.z5.t(100, 100, 17, 0, 0, 0, 10));
                            context2 = context;
                            c10 = 2;
                            View.OnClickListener onClickListener = new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    boolean z20 = z10;
                                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction;
                                    long peerDialogId2 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction6.peer.peer);
                                    ArrayList arrayList = new ArrayList();
                                    for (int i19 = 0; i19 < starsTransaction6.extended_media.size(); i19++) {
                                        TLRPC.MessageMedia messageMedia2 = starsTransaction6.extended_media.get(i19);
                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                        tL_message.f22401id = starsTransaction6.msg_id;
                                        tL_message.dialog_id = peerDialogId2;
                                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                        tL_message.from_id = tL_peerChannel;
                                        long j14 = -peerDialogId2;
                                        tL_peerChannel.channel_id = j14;
                                        TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                        tL_message.peer_id = tL_peerChannel2;
                                        tL_peerChannel2.channel_id = j14;
                                        tL_message.date = starsTransaction6.date;
                                        tL_message.flags |= 512;
                                        tL_message.media = messageMedia2;
                                        tL_message.noforwards = true;
                                        arrayList.add(new MessageObject(i10, tL_message, false, false));
                                    }
                                    if (arrayList.isEmpty()) {
                                        return;
                                    }
                                    PhotoViewer.t1().K2(null, LaunchActivity.R(), c6Var);
                                    PhotoViewer.t1().a2(arrayList, 0, peerDialogId2, 0L, 0L, new r9(n9Var, G, peerDialogId2));
                                }
                            };
                            starsTransaction2 = starsTransaction;
                            z13 = z10;
                            c6Var2 = c6Var;
                            i11 = i10;
                            r10 = G;
                            j11 = j10;
                            n9Var.setOnClickListener(onClickListener);
                            str4 = "";
                            z12 = z18;
                        }
                        imageLocation = forDocument;
                        n9Var.l(imageLocation, "100_100", null, null, null, 0);
                        G.addView(n9Var, h7.z5.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        c10 = 2;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction6 = starsTransaction;
                                long peerDialogId2 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction6.peer.peer);
                                ArrayList arrayList = new ArrayList();
                                for (int i19 = 0; i19 < starsTransaction6.extended_media.size(); i19++) {
                                    TLRPC.MessageMedia messageMedia2 = starsTransaction6.extended_media.get(i19);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.f22401id = starsTransaction6.msg_id;
                                    tL_message.dialog_id = peerDialogId2;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j14 = -peerDialogId2;
                                    tL_peerChannel.channel_id = j14;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j14;
                                    tL_message.date = starsTransaction6.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia2;
                                    tL_message.noforwards = true;
                                    arrayList.add(new MessageObject(i10, tL_message, false, false));
                                }
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), c6Var);
                                PhotoViewer.t1().a2(arrayList, 0, peerDialogId2, 0L, 0L, new r9(n9Var, G, peerDialogId2));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        c6Var2 = c6Var;
                        i11 = i10;
                        r10 = G;
                        j11 = j10;
                        n9Var.setOnClickListener(onClickListener2);
                        str4 = "";
                        z12 = z18;
                    }
                    TextView textView = new TextView(context2);
                    i12 = org.telegram.ui.ActionBar.g6.f23161j5;
                    rl.w(i12, c6Var2, textView, 1, 20.0f);
                    textView.setGravity(17);
                    textView.setText(N0(i11, z13, starsTransaction2));
                    textViewI = org.telegram.ui.Cells.pa.i(r10, textView, h7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
                    textViewI.setTextSize(1, 18.0f);
                    textViewI.setTypeface(AndroidUtilities.bold());
                    textViewI.setGravity(17);
                    if (zPositive) {
                        i13 = org.telegram.ui.ActionBar.g6.uj;
                    } else {
                        i13 = org.telegram.ui.ActionBar.g6.wj;
                    }
                    textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
                    TL_stars.StarsAmount starsAmount4 = starsTransaction2.amount;
                    str2 = zPositive ? "+" : str4;
                    SpannableStringBuilder spannableStringBuilderI1 = I0(starsAmount4);
                    CharSequence[] charSequenceArr2 = new CharSequence[3];
                    charSequenceArr2[0] = str2;
                    charSequenceArr2[1] = spannableStringBuilderI1;
                    charSequenceArr2[c10] = " ⭐️";
                    textViewI.setText(X0(starsAmount4 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(charSequenceArr2), 0.8f, null));
                    spannableStringBuilder = new SpannableStringBuilder(textViewI.getText());
                    if (starsTransaction2.refund) {
                        G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsRefunded));
                    } else if (starsTransaction2.failed) {
                        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var2));
                        G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsFailed));
                    } else if (starsTransaction2.pending) {
                        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yj, c6Var2));
                        G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsPending));
                    }
                    textViewI.setText(spannableStringBuilder);
                    r10.addView(textViewI, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && zPositive) {
                        p80 p80Var = new p80(context2);
                        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
                        p80Var.setTextSize(1, 14.0f);
                        p80Var.setGravity(17);
                        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                        p80Var.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, nh.k.G0(1000 - starsTransaction2.starref_commission_permille))));
                        if (j11 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), 2)) {
                            spannableStringBuilder3.append((CharSequence) " ");
                            spannableStringBuilder3.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new c8(j11, i11, 0)), true));
                        }
                        p80Var.setText(spannableStringBuilder3);
                        r10.addView(p80Var, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                        r14 = r10;
                    } else if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                        TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                        TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                        boolean zIsUserSelf = UserObject.isUserSelf(user3);
                        if (zIsUserSelf) {
                            textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
                            TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                            i14 = 1;
                            textViewI.setText(X0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(I0(starsAmount5), " ⭐️"), 0.8f, null));
                        } else {
                            i14 = 1;
                        }
                        p80 p80Var2 = new p80(context2);
                        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
                        f10 = 16.0f;
                        p80Var2.setTextSize(i14, 16.0f);
                        p80Var2.setGravity(17);
                        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                        p80Var2.setDisablePaddingsOffsetY(i14);
                        if (zIsUserSelf) {
                            int i19 = R.string.ActionGiftStarsSubtitle;
                            Object[] objArr = new Object[i14];
                            objArr[0] = UserObject.getForcedFirstName(user4);
                            string = LocaleController.formatString(i19, objArr);
                        } else {
                            string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                        }
                        e3VarArr2 = e3VarArr;
                        p80Var2.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new e8(context2, e3VarArr2)), true)));
                        r10.addView(p80Var2, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                        r11 = r10;
                    } else {
                        e3VarArr2 = e3VarArr;
                        f10 = 16.0f;
                        r11 = r10;
                        if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                            r11 = r10;
                            TextView textView2 = new TextView(context2);
                            rl.l(i12, c6Var2, textView2, 1, 16.0f);
                            textView2.setGravity(17);
                            textView2.setText(starsTransaction2.description);
                            r10.addView(textView2, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                            r11 = r10;
                        }
                    }
                }
                c6Var2 = c6Var;
                context2 = context;
                i11 = i10;
                starsTransaction2 = starsTransaction;
                r10 = G;
                str4 = "";
                z12 = z18;
                c10 = 2;
                z13 = z10;
                j11 = j10;
                TextView textView3 = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.g6.f23161j5;
                rl.w(i12, c6Var2, textView3, 1, 20.0f);
                textView3.setGravity(17);
                textView3.setText(N0(i11, z13, starsTransaction2));
                textViewI = org.telegram.ui.Cells.pa.i(r10, textView3, h7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
                textViewI.setTextSize(1, 18.0f);
                textViewI.setTypeface(AndroidUtilities.bold());
                textViewI.setGravity(17);
                if (zPositive) {
                    i13 = org.telegram.ui.ActionBar.g6.uj;
                } else {
                    i13 = org.telegram.ui.ActionBar.g6.wj;
                }
                textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
                TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                if (zPositive) {
                }
                SpannableStringBuilder spannableStringBuilderI2 = I0(starsAmount6);
                CharSequence[] charSequenceArr3 = new CharSequence[3];
                charSequenceArr3[0] = str2;
                charSequenceArr3[1] = spannableStringBuilderI2;
                charSequenceArr3[c10] = " ⭐️";
                textViewI.setText(X0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(charSequenceArr3), 0.8f, null));
                spannableStringBuilder = new SpannableStringBuilder(textViewI.getText());
                if (starsTransaction2.refund) {
                    G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var2));
                    G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yj, c6Var2));
                    G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsPending));
                }
                textViewI.setText(spannableStringBuilder);
                r10.addView(textViewI, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message) {
                }
                if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                    e3VarArr2 = e3VarArr;
                    f10 = 16.0f;
                    r11 = r10;
                    if (starsTransaction2.description != null) {
                        r11 = r10;
                        TextView textView4 = new TextView(context2);
                        rl.l(i12, c6Var2, textView4, 1, 16.0f);
                        textView4.setGravity(17);
                        textView4.setText(starsTransaction2.description);
                        r10.addView(textView4, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                        r11 = r10;
                    }
                } else {
                    e3VarArr2 = e3VarArr;
                    f10 = 16.0f;
                    r11 = r10;
                    if (starsTransaction2.description != null) {
                        r11 = r10;
                        TextView textView5 = new TextView(context2);
                        rl.l(i12, c6Var2, textView5, 1, 16.0f);
                        textView5.setGravity(17);
                        textView5.setText(starsTransaction2.description);
                        r10.addView(textView5, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                        r11 = r10;
                    }
                }
            }
            e3VarArr2 = e3VarArr;
            f10 = 16.0f;
            r11 = r14;
        } else {
            e3Var = e3VarO;
            e3VarArr = e3VarArr7;
            z11 = z17;
            n9Var = new org.telegram.ui.Components.n9(context);
            if (starsTransaction.premium_gift) {
                c1(n9Var, n9Var.getImageReceiver(), starsTransaction.premium_gift_months);
                G.addView(n9Var, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
            } else if (starsTransaction.posts_search) {
                dq dqVarA3 = org.telegram.ui.Cells.q6.a(100, "search");
                int iDp5 = AndroidUtilities.dp(40.0f);
                int iDp6 = AndroidUtilities.dp(40.0f);
                dqVarA3.f27823e = iDp5;
                dqVarA3.f27824f = iDp6;
                n9Var.setImageDrawable(dqVarA3);
            } else {
                starGift = starsTransaction.stargift;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        n9Var.setImageDrawable(new v4(n9Var, starsTransaction.stargift, 94, 0.44f));
                        G.addView(n9Var, h7.z5.t(94, 94, 17, 0, 2, 0, 10));
                    } else {
                        a1(n9Var.getImageReceiver(), starsTransaction.stargift, 160);
                        G.addView(n9Var, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
                    }
                } else if (z19) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    ?? r18 = G;
                    str4 = "";
                    z12 = z18;
                    c10 = 2;
                    z13 = z10;
                    j11 = j10;
                    c6Var2 = c6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        d1(n9Var, n9Var.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        b1(n9Var, n9Var.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    r18.addView(n9Var, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
                    r10 = r18;
                } else {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    ?? r19 = G;
                    str4 = "";
                    z12 = z18;
                    c10 = 2;
                    z13 = z10;
                    j11 = j10;
                    c6Var2 = c6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        d1(n9Var, n9Var.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        b1(n9Var, n9Var.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    r19.addView(n9Var, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
                    r10 = r19;
                }
                TextView textView6 = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.g6.f23161j5;
                rl.w(i12, c6Var2, textView6, 1, 20.0f);
                textView6.setGravity(17);
                textView6.setText(N0(i11, z13, starsTransaction2));
                textViewI = org.telegram.ui.Cells.pa.i(r10, textView6, h7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
                textViewI.setTextSize(1, 18.0f);
                textViewI.setTypeface(AndroidUtilities.bold());
                textViewI.setGravity(17);
                if (zPositive) {
                    i13 = org.telegram.ui.ActionBar.g6.uj;
                } else {
                    i13 = org.telegram.ui.ActionBar.g6.wj;
                }
                textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
                TL_stars.StarsAmount starsAmount7 = starsTransaction2.amount;
                if (zPositive) {
                }
                SpannableStringBuilder spannableStringBuilderI3 = I0(starsAmount7);
                CharSequence[] charSequenceArr4 = new CharSequence[3];
                charSequenceArr4[0] = str2;
                charSequenceArr4[1] = spannableStringBuilderI3;
                charSequenceArr4[c10] = " ⭐️";
                textViewI.setText(X0(starsAmount7 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(charSequenceArr4), 0.8f, null));
                spannableStringBuilder = new SpannableStringBuilder(textViewI.getText());
                if (starsTransaction2.refund) {
                    G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var2));
                    G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yj, c6Var2));
                    G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsPending));
                }
                textViewI.setText(spannableStringBuilder);
                r10.addView(textViewI, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message) {
                }
                if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                    e3VarArr2 = e3VarArr;
                    f10 = 16.0f;
                    r11 = r10;
                    if (starsTransaction2.description != null) {
                        r11 = r10;
                        TextView textView7 = new TextView(context2);
                        rl.l(i12, c6Var2, textView7, 1, 16.0f);
                        textView7.setGravity(17);
                        textView7.setText(starsTransaction2.description);
                        r10.addView(textView7, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                        r11 = r10;
                    }
                } else {
                    e3VarArr2 = e3VarArr;
                    f10 = 16.0f;
                    r11 = r10;
                    if (starsTransaction2.description != null) {
                        r11 = r10;
                        TextView textView8 = new TextView(context2);
                        rl.l(i12, c6Var2, textView8, 1, 16.0f);
                        textView8.setGravity(17);
                        textView8.setText(starsTransaction2.description);
                        r10.addView(textView8, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                        r11 = r10;
                    }
                }
            }
            c6Var2 = c6Var;
            context2 = context;
            i11 = i10;
            starsTransaction2 = starsTransaction;
            r10 = G;
            str4 = "";
            z12 = z18;
            c10 = 2;
            z13 = z10;
            j11 = j10;
            TextView textView9 = new TextView(context2);
            i12 = org.telegram.ui.ActionBar.g6.f23161j5;
            rl.w(i12, c6Var2, textView9, 1, 20.0f);
            textView9.setGravity(17);
            textView9.setText(N0(i11, z13, starsTransaction2));
            textViewI = org.telegram.ui.Cells.pa.i(r10, textView9, h7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
            textViewI.setTextSize(1, 18.0f);
            textViewI.setTypeface(AndroidUtilities.bold());
            textViewI.setGravity(17);
            if (zPositive) {
                i13 = org.telegram.ui.ActionBar.g6.uj;
            } else {
                i13 = org.telegram.ui.ActionBar.g6.wj;
            }
            textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
            TL_stars.StarsAmount starsAmount8 = starsTransaction2.amount;
            if (zPositive) {
            }
            SpannableStringBuilder spannableStringBuilderI4 = I0(starsAmount8);
            CharSequence[] charSequenceArr5 = new CharSequence[3];
            charSequenceArr5[0] = str2;
            charSequenceArr5[1] = spannableStringBuilderI4;
            charSequenceArr5[c10] = " ⭐️";
            textViewI.setText(X0(starsAmount8 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(charSequenceArr5), 0.8f, null));
            spannableStringBuilder = new SpannableStringBuilder(textViewI.getText());
            if (starsTransaction2.refund) {
                G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsRefunded));
            } else if (starsTransaction2.failed) {
                textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var2));
                G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsFailed));
            } else if (starsTransaction2.pending) {
                textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yj, c6Var2));
                G0(spannableStringBuilder, textViewI, LocaleController.getString(R.string.StarsPending));
            }
            textViewI.setText(spannableStringBuilder);
            r10.addView(textViewI, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
            if (!starsTransaction2.paid_message) {
            }
            if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                e3VarArr2 = e3VarArr;
                f10 = 16.0f;
                r11 = r10;
                if (starsTransaction2.description != null) {
                    r11 = r10;
                    TextView textView10 = new TextView(context2);
                    rl.l(i12, c6Var2, textView10, 1, 16.0f);
                    textView10.setGravity(17);
                    textView10.setText(starsTransaction2.description);
                    r10.addView(textView10, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    r11 = r10;
                }
            } else {
                e3VarArr2 = e3VarArr;
                f10 = 16.0f;
                r11 = r10;
                if (starsTransaction2.description != null) {
                    r11 = r10;
                    TextView textView11 = new TextView(context2);
                    rl.l(i12, c6Var2, textView11, 1, 16.0f);
                    textView11.setGravity(17);
                    textView11.setText(starsTransaction2.description);
                    r10.addView(textView11, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    r11 = r10;
                }
            }
        }
        r11 = r10;
        yy0 yy0Var9 = new yy0(context2, c6Var2);
        TL_stars.StarGift starGift3 = starsTransaction2.stargift;
        int i20 = 6;
        if (starGift3 == null) {
            TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
            r31 = r11;
            yy0 yy0Var10 = yy0Var9;
            final org.telegram.ui.ActionBar.e3[] e3VarArr8 = e3VarArr2;
            c6Var3 = c6Var2;
            TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction6.peer;
            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                final long peerDialogId2 = DialogObject.getPeerDialogId(starsTransactionPeer2.peer);
                if (starsTransaction6.paid_message) {
                    yy0Var10.k(LocaleController.getString(zPositive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId2, new x7(e3VarArr8, peerDialogId2, 3));
                    if (starsTransaction6.starref_amount != null && starsTransaction6.starref_commission_permille > 0) {
                        yy0Var10.d(X0(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, i0.a.m(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsTransaction6.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                    }
                } else if (z11) {
                    long peerDialogId3 = DialogObject.getPeerDialogId(starsTransaction6.starref_peer);
                    yy0Var10.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new x7(e3VarArr8, j10, 4));
                    yy0Var10.k(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId3, new x7(e3VarArr8, peerDialogId3, 5));
                    yy0Var10.k(LocaleController.getString(R.string.StarAffiliateReferredUser), i10, peerDialogId2, new x7(e3VarArr8, peerDialogId2, 6));
                    yy0Var10.d(nh.k.G0(starsTransaction6.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                    i10 = i10;
                    e3VarArr3 = e3VarArr8;
                    yy0Var3 = yy0Var10;
                    starsTransaction3 = starsTransaction6;
                    r34 = r31;
                    context = context;
                    r13 = yy0Var3;
                    r35 = r34;
                } else if (z12) {
                    yy0Var10.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new v7(i10, context, j10, peerDialogId2, e3VarArr8, c6Var3));
                    yy0Var10 = yy0Var10;
                    yy0Var10.k(LocaleController.getString(R.string.StarAffiliateMiniApp), i10, peerDialogId2, new x7(e3VarArr8, peerDialogId2, 0));
                } else if (z19) {
                    yy0Var10.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId2, new y7(e3VarArr8, starsTransaction6, peerDialogId2, 0));
                    final int i21 = 0;
                    yy0Var10.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i21) {
                                case 0:
                                    e3VarArr8[0].dismiss();
                                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                    if (n2VarU != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                        bundle.putBoolean("my_profile", true);
                                        n2VarU.presentFragment(new ProfileActivity(bundle, null));
                                    }
                                    break;
                                case 1:
                                    e3VarArr8[0].dismiss();
                                    org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                    if (n2VarU2 != null) {
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                        bundle2.putBoolean("my_profile", true);
                                        bundle2.putBoolean("open_gifts", true);
                                        n2VarU2.presentFragment(new ProfileActivity(bundle2, null));
                                    }
                                    break;
                                default:
                                    e3VarArr8[0].dismiss();
                                    org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                                    if (n2VarU3 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                        bundle3.putBoolean("my_profile", true);
                                        bundle3.putBoolean("open_gifts", true);
                                        n2VarU3.presentFragment(new ProfileActivity(bundle3, null));
                                    }
                                    break;
                            }
                        }
                    });
                    String string2 = LocaleController.getString(R.string.StarGiveawayReason);
                    String string3 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                    y7 y7Var = new y7(e3VarArr8, starsTransaction, peerDialogId2, 1);
                    starsTransaction3 = starsTransaction;
                    yy0Var10.g(string2, string3, y7Var);
                    yy0Var10.d(L0(starsTransaction3.amount), LocaleController.getString(R.string.StarGiveawayGift));
                    context = context;
                    i10 = i10;
                    e3VarArr3 = e3VarArr8;
                    r13 = yy0Var10;
                    r35 = r31;
                } else {
                    starsTransaction3 = starsTransaction6;
                    if (!starsTransaction3.subscription || z10) {
                        if (starsTransaction3.premium_gift) {
                            final int i22 = 1;
                            yy0Var10.k(LocaleController.getString(R.string.Gift2To), i10, peerDialogId2, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i22) {
                                        case 0:
                                            e3VarArr8[0].dismiss();
                                            long j14 = peerDialogId2;
                                            if (!UserObject.isService(j14)) {
                                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                                if (n2VarU != null) {
                                                    n2VarU.presentFragment(rn.R9(j14));
                                                }
                                            } else {
                                                we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                            }
                                            break;
                                        case 1:
                                            e3VarArr8[0].dismiss();
                                            long j15 = peerDialogId2;
                                            if (!UserObject.isService(j15)) {
                                                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                                if (n2VarU2 != null) {
                                                    n2VarU2.presentFragment(rn.R9(j15));
                                                }
                                            } else {
                                                we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                            }
                                            break;
                                        default:
                                            e3VarArr8[0].dismiss();
                                            long j16 = peerDialogId2;
                                            if (!UserObject.isService(j16)) {
                                                org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                                                if (n2VarU3 != null) {
                                                    n2VarU3.presentFragment(rn.R9(j16));
                                                }
                                            } else {
                                                we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                            }
                                            break;
                                    }
                                }
                            });
                            yy0Var = yy0Var10;
                            yy0Var.d(LocaleController.formatPluralStringComma("Months", starsTransaction3.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                        } else {
                            yy0Var = yy0Var10;
                            if (!starsTransaction3.posts_search) {
                                final int i23 = 2;
                                e3VarArr3 = e3VarArr8;
                                context = context;
                                yy0Var.k(LocaleController.getString(R.string.StarsTransactionRecipient), i10, peerDialogId2, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i23) {
                                            case 0:
                                                e3VarArr8[0].dismiss();
                                                long j14 = peerDialogId2;
                                                if (!UserObject.isService(j14)) {
                                                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                                    if (n2VarU != null) {
                                                        n2VarU.presentFragment(rn.R9(j14));
                                                    }
                                                } else {
                                                    we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                }
                                                break;
                                            case 1:
                                                e3VarArr8[0].dismiss();
                                                long j15 = peerDialogId2;
                                                if (!UserObject.isService(j15)) {
                                                    org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                                    if (n2VarU2 != null) {
                                                        n2VarU2.presentFragment(rn.R9(j15));
                                                    }
                                                } else {
                                                    we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                }
                                                break;
                                            default:
                                                e3VarArr8[0].dismiss();
                                                long j16 = peerDialogId2;
                                                if (!UserObject.isService(j16)) {
                                                    org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                                                    if (n2VarU3 != null) {
                                                        n2VarU3.presentFragment(rn.R9(j16));
                                                    }
                                                } else {
                                                    we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                }
                                                break;
                                        }
                                    }
                                });
                                r13 = yy0Var;
                                i10 = i10;
                                r35 = r31;
                            }
                        }
                        context = context;
                        i10 = i10;
                        r13 = yy0Var;
                        e3VarArr3 = e3VarArr8;
                        r35 = r31;
                    } else {
                        final int i24 = 0;
                        yy0Var10.k(LocaleController.getString(R.string.StarSubscriptionTo), i10, peerDialogId2, new Runnable() {
                            @Override
                            public final void run() {
                                switch (i24) {
                                    case 0:
                                        e3VarArr8[0].dismiss();
                                        long j14 = peerDialogId2;
                                        if (!UserObject.isService(j14)) {
                                            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                            if (n2VarU != null) {
                                                n2VarU.presentFragment(rn.R9(j14));
                                            }
                                        } else {
                                            we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                        }
                                        break;
                                    case 1:
                                        e3VarArr8[0].dismiss();
                                        long j15 = peerDialogId2;
                                        if (!UserObject.isService(j15)) {
                                            org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                            if (n2VarU2 != null) {
                                                n2VarU2.presentFragment(rn.R9(j15));
                                            }
                                        } else {
                                            we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                        }
                                        break;
                                    default:
                                        e3VarArr8[0].dismiss();
                                        long j16 = peerDialogId2;
                                        if (!UserObject.isService(j16)) {
                                            org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                                            if (n2VarU3 != null) {
                                                n2VarU3.presentFragment(rn.R9(j16));
                                            }
                                        } else {
                                            we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                        }
                                        break;
                                }
                            }
                        });
                        yy0Var2 = yy0Var10;
                        e3VarArr3 = e3VarArr8;
                        r32 = r31;
                        i10 = i10;
                        r13 = yy0Var2;
                        r35 = r32;
                    }
                }
                yy0Var4 = yy0Var10;
                e3VarArr3 = e3VarArr8;
                starsTransaction3 = starsTransaction6;
                r33 = r31;
                yy0Var2 = yy0Var4;
                r32 = r33;
                i10 = i10;
                r13 = yy0Var2;
                r35 = r32;
            } else {
                r12 = yy0Var10;
                e3VarArr3 = e3VarArr8;
                starsTransaction3 = starsTransaction6;
                context = context;
                i10 = i10;
                if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                    if (starsTransaction3.gift) {
                        p80 p80Var3 = new p80(context, c6Var3);
                        p80Var3.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        p80Var3.setEllipsize(TextUtils.TruncateAt.END);
                        int i25 = org.telegram.ui.ActionBar.g6.gc;
                        p80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i25, c6Var3));
                        p80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i25, c6Var3));
                        p80Var3.setTextSize(1, 14.0f);
                        p80Var3.setSingleLine(true);
                        p80Var3.setDisablePaddingsOffsetY(true);
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(p80Var3, 24.0f, i10);
                        String string4 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                        dq dqVarA4 = ja.a(24, "fragment");
                        int iDp7 = AndroidUtilities.dp(f10);
                        int iDp8 = AndroidUtilities.dp(f10);
                        dqVarA4.f27823e = iDp7;
                        dqVarA4.f27824f = iDp8;
                        g5Var.f38316b.setImageBitmap(dqVarA4);
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x  " + ((Object) string4));
                        spannableStringBuilder4.setSpan(g5Var, 0, 1, 33);
                        spannableStringBuilder4.setSpan(new f9(e3VarArr3, context, z15), 3, spannableStringBuilder4.length(), 33);
                        p80Var3.setText(spannableStringBuilder4);
                        r12.i(p80Var3, LocaleController.getString(R.string.StarsTransactionRecipient));
                        r13 = r12;
                        r35 = r31;
                    } else {
                        r12.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                        r13 = r12;
                        r35 = r31;
                    }
                } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                    r12.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                    r13 = r12;
                    r35 = r31;
                } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                    r12.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                    r13 = r12;
                    r35 = r31;
                } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                    r13 = r12;
                    r35 = r31;
                    r12.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                    r13 = r12;
                    r35 = r31;
                }
            }
        } else if (starsTransaction2.stargift_upgrade) {
            if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                starsTransaction5 = starsTransaction2;
                r15 = r11;
            } else {
                oc ocVar = (oc) ((vy0) yy0Var9.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                r15 = r11;
                Context context5 = context2;
                starsTransaction5 = starsTransaction;
                u7.w(i10).M(tL_inputSavedStarGiftUser, new f8(ocVar, i10, context5, c6Var2, 0));
            }
            TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction5.peer;
            if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                long peerDialogId4 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                String string5 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                x7 x7Var = new x7(e3VarArr2, peerDialogId4, 1);
                context4 = context;
                e3VarArr4 = e3VarArr2;
                c6Var3 = c6Var;
                yy0Var9.k(string5, i10, peerDialogId4, x7Var);
                yy0Var8 = yy0Var9;
                i10 = i10;
                starsTransaction3 = starsTransaction5;
                r38 = r15;
                e3VarArr3 = e3VarArr4;
                context = context4;
                r13 = yy0Var8;
                r35 = r38;
            } else {
                e3VarArr4 = e3VarArr2;
                c6Var3 = c6Var;
                yy0Var5 = yy0Var9;
                starsTransaction3 = starsTransaction5;
                r37 = r15;
                e3VarArr3 = e3VarArr4;
                yy0Var3 = yy0Var5;
                r34 = r37;
                context = context;
                r13 = yy0Var3;
                r35 = r34;
            }
        } else {
            e3VarArr4 = e3VarArr2;
            context4 = context2;
            TL_stars.StarsTransaction starsTransaction7 = starsTransaction2;
            c6Var3 = c6Var2;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                String str5 = starGift3.slug;
                if (!TextUtils.isEmpty(str5)) {
                    yy0Var9.g(LocaleController.getString(R.string.Gift2Gift), starsTransaction7.stargift.title + " #" + starsTransaction7.stargift.num, new d5.i(context4, i10, str5, i20));
                }
                final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                long peerDialogId5 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction7.peer).peer);
                if (!starsTransaction7.offer) {
                    if (starsTransaction7.stargift_resale) {
                        if (zNegative) {
                            yy0Var9.d(LocaleController.getString(starsTransaction7.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                        } else {
                            yy0Var9.d(LocaleController.getString(starsTransaction7.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                            j12 = clientUserId;
                        }
                    } else if (starsTransaction7.stargift_drop_original_details) {
                        yy0Var9.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                        peerDialogId5 = clientUserId;
                        j12 = peerDialogId5;
                    } else {
                        yy0Var9.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                    }
                    j12 = peerDialogId5;
                    peerDialogId5 = clientUserId;
                } else if (zNegative) {
                    yy0Var9.d(LocaleController.getString(starsTransaction7.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                    j12 = peerDialogId5;
                    peerDialogId5 = clientUserId;
                } else {
                    yy0Var9.d(LocaleController.getString(starsTransaction7.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                    j12 = clientUserId;
                }
                if (peerDialogId5 != clientUserId) {
                    final long j14 = peerDialogId5;
                    final int i26 = 0;
                    r36 = r11;
                    str3 = "⭐️ ";
                    j13 = clientUserId;
                    yy0Var7 = yy0Var9;
                    yy0Var7.k(LocaleController.getString(R.string.Gift2From), i10, j14, new Runnable() {
                        @Override
                        public final void run() {
                            switch (i26) {
                                case 0:
                                    e3VarArr4[0].dismiss();
                                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                    if (n2VarU != null) {
                                        long j15 = j14;
                                        Bundle bundleH = com.google.android.recaptcha.internal.a.h(j15, "user_id");
                                        if (j15 == clientUserId) {
                                            bundleH.putBoolean("my_profile", true);
                                        }
                                        bundleH.putBoolean("open_gifts", true);
                                        n2VarU.presentFragment(new ProfileActivity(bundleH, null));
                                    }
                                    break;
                                default:
                                    e3VarArr4[0].dismiss();
                                    org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                    if (n2VarU2 != null) {
                                        long j16 = j14;
                                        Bundle bundleH2 = com.google.android.recaptcha.internal.a.h(j16, "user_id");
                                        if (j16 == clientUserId) {
                                            bundleH2.putBoolean("my_profile", true);
                                        }
                                        bundleH2.putBoolean("open_gifts", true);
                                        n2VarU2.presentFragment(new ProfileActivity(bundleH2, null));
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    yy0Var7 = yy0Var9;
                    j13 = clientUserId;
                    r36 = r11;
                    str3 = "⭐️ ";
                }
                if (j12 != j13) {
                    final long j15 = j13;
                    final int i27 = 1;
                    final long j16 = j12;
                    yy0Var7.k(LocaleController.getString(R.string.Gift2To), i10, j16, new Runnable() {
                        @Override
                        public final void run() {
                            switch (i27) {
                                case 0:
                                    e3VarArr4[0].dismiss();
                                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                    if (n2VarU != null) {
                                        long j17 = j16;
                                        Bundle bundleH = com.google.android.recaptcha.internal.a.h(j17, "user_id");
                                        if (j17 == j15) {
                                            bundleH.putBoolean("my_profile", true);
                                        }
                                        bundleH.putBoolean("open_gifts", true);
                                        n2VarU.presentFragment(new ProfileActivity(bundleH, null));
                                    }
                                    break;
                                default:
                                    e3VarArr4[0].dismiss();
                                    org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                    if (n2VarU2 != null) {
                                        long j18 = j16;
                                        Bundle bundleH2 = com.google.android.recaptcha.internal.a.h(j18, "user_id");
                                        if (j18 == j15) {
                                            bundleH2.putBoolean("my_profile", true);
                                        }
                                        bundleH2.putBoolean("open_gifts", true);
                                        n2VarU2.presentFragment(new ProfileActivity(bundleH2, null));
                                    }
                                    break;
                            }
                        }
                    });
                }
                yy0 yy0Var11 = yy0Var7;
                if ((peerDialogId5 == clientUserId || starsTransaction7.stargift_resale) && (starsAmount = starsTransaction7.starref_amount) != null && starsTransaction7.starref_commission_permille > 0) {
                    TL_stars.StarsAmount starsAmount9 = starsTransaction7.amount;
                    if ((starsAmount9 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                        tL_starsTonAmount.amount = starsTransaction7.amount.amount + starsTransaction7.starref_amount.amount;
                        cq[] cqVarArr = new cq[1];
                        yy0Var11.d(W0(starsTransaction7.amount, str3 + ((Object) I0(tL_starsTonAmount)), cqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                        cq cqVar = cqVarArr[0];
                        if (cqVar != null) {
                            cqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var3));
                        }
                    } else {
                        yy0Var11.d(X0(starsTransaction7.amount instanceof TL_stars.TL_starsTonAmount, i0.a.m(Math.abs(Math.round(starsTransaction7.starref_amount.toDouble() + starsAmount9.toDouble())), ',', new StringBuilder(str3)), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                    }
                }
                i10 = i10;
                yy0Var8 = yy0Var11;
                starsTransaction3 = starsTransaction7;
                r38 = r36;
                e3VarArr3 = e3VarArr4;
                context = context4;
                r13 = yy0Var8;
                r35 = r38;
            } else {
                ?? r39 = r11;
                if (starsTransaction7.refund) {
                    yy0Var5 = yy0Var9;
                    starsTransaction3 = starsTransaction7;
                    r37 = r39;
                    e3VarArr3 = e3VarArr4;
                    yy0Var3 = yy0Var5;
                    r34 = r37;
                    context = context;
                    r13 = yy0Var3;
                    r35 = r34;
                } else {
                    long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j10;
                    final long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                    TLRPC.User user5 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId6));
                    if (zPositive) {
                        if (peerDialogId6 != clientUserId2) {
                            String string6 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                            y7 y7Var2 = new y7(e3VarArr4, starsTransaction7, peerDialogId6, 3);
                            String string7 = (user5 == null || UserObject.isDeleted(user5) || UserObject.areGiftsDisabled(peerDialogId6)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                            final int i28 = 0;
                            i16 = i10;
                            Runnable runnable = new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i28) {
                                        case 0:
                                            org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr4[0];
                                            Objects.requireNonNull(e3Var2);
                                            new gh.k2(context4, i16, peerDialogId6, null, new ag.n0(e3Var2, 17)).show();
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.e3 e3Var3 = e3VarArr4[0];
                                            Objects.requireNonNull(e3Var3);
                                            new gh.k2(context4, i16, peerDialogId6, null, new ag.n0(e3Var3, 17)).show();
                                            break;
                                    }
                                }
                            };
                            yy0Var6 = yy0Var9;
                            e3VarArr6 = e3VarArr4;
                            yy0Var6.j(string6, i16, peerDialogId6, y7Var2, string7, runnable);
                        } else {
                            i16 = i10;
                            yy0Var6 = yy0Var9;
                            e3VarArr6 = e3VarArr4;
                        }
                        final int i29 = 1;
                        yy0Var6.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() {
                            @Override
                            public final void run() {
                                switch (i29) {
                                    case 0:
                                        e3VarArr6[0].dismiss();
                                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                        if (n2VarU != null) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                            bundle.putBoolean("my_profile", true);
                                            n2VarU.presentFragment(new ProfileActivity(bundle, null));
                                        }
                                        break;
                                    case 1:
                                        e3VarArr6[0].dismiss();
                                        org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                        if (n2VarU2 != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                            bundle2.putBoolean("my_profile", true);
                                            bundle2.putBoolean("open_gifts", true);
                                            n2VarU2.presentFragment(new ProfileActivity(bundle2, null));
                                        }
                                        break;
                                    default:
                                        e3VarArr6[0].dismiss();
                                        org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                                        if (n2VarU3 != null) {
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                            bundle3.putBoolean("my_profile", true);
                                            bundle3.putBoolean("open_gifts", true);
                                            n2VarU3.presentFragment(new ProfileActivity(bundle3, null));
                                        }
                                        break;
                                }
                            }
                        });
                        starsTransaction4 = starsTransaction;
                        e3VarArr5 = e3VarArr6;
                    } else {
                        long j17 = clientUserId2;
                        if (peerDialogId6 != j17) {
                            final int i30 = 2;
                            yy0Var9.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j17, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i30) {
                                        case 0:
                                            e3VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                            if (n2VarU != null) {
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                bundle.putBoolean("my_profile", true);
                                                n2VarU.presentFragment(new ProfileActivity(bundle, null));
                                            }
                                            break;
                                        case 1:
                                            e3VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                            if (n2VarU2 != null) {
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                bundle2.putBoolean("my_profile", true);
                                                bundle2.putBoolean("open_gifts", true);
                                                n2VarU2.presentFragment(new ProfileActivity(bundle2, null));
                                            }
                                            break;
                                        default:
                                            e3VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                                            if (n2VarU3 != null) {
                                                Bundle bundle3 = new Bundle();
                                                bundle3.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                bundle3.putBoolean("my_profile", true);
                                                bundle3.putBoolean("open_gifts", true);
                                                n2VarU3.presentFragment(new ProfileActivity(bundle3, null));
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        String string8 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                        y7 y7Var3 = new y7(e3VarArr4, starsTransaction, peerDialogId6, 4);
                        starsTransaction4 = starsTransaction;
                        String string9 = (user5 == null || UserObject.isDeleted(user5) || UserObject.areGiftsDisabled(peerDialogId6)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                        final int i31 = 1;
                        Runnable runnable2 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (i31) {
                                    case 0:
                                        org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr4[0];
                                        Objects.requireNonNull(e3Var2);
                                        new gh.k2(context, i10, peerDialogId6, null, new ag.n0(e3Var2, 17)).show();
                                        break;
                                    default:
                                        org.telegram.ui.ActionBar.e3 e3Var3 = e3VarArr4[0];
                                        Objects.requireNonNull(e3Var3);
                                        new gh.k2(context, i10, peerDialogId6, null, new ag.n0(e3Var3, 17)).show();
                                        break;
                                }
                            }
                        };
                        e3VarArr5 = e3VarArr4;
                        yy0Var6 = yy0Var9;
                        yy0Var6.j(string8, i10, peerDialogId6, y7Var3, string9, runnable2);
                    }
                    yy0Var4 = yy0Var6;
                    starsTransaction3 = starsTransaction4;
                    e3VarArr3 = e3VarArr5;
                    r33 = r39;
                    yy0Var2 = yy0Var4;
                    r32 = r33;
                    i10 = i10;
                    r13 = yy0Var2;
                    r35 = r32;
                }
            }
        }
        r13 = r12;
        r35 = r31;
        TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction3.peer;
        if (!(starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) || (starsTransaction3.flags & 256) == 0) {
            z14 = z15;
        } else {
            long peerDialogId7 = DialogObject.getPeerDialogId(starsTransactionPeer4.peer);
            if (z10) {
                peerDialogId7 = j10;
            }
            TLRPC.Chat chat3 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId7));
            if (chat3 != null) {
                ?? p80Var4 = new p80(context, c6Var3);
                p80Var4.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                p80Var4.setEllipsize(TextUtils.TruncateAt.END);
                int i32 = org.telegram.ui.ActionBar.g6.gc;
                p80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i32, c6Var3));
                p80Var4.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i32, c6Var3));
                p80Var4.setTextSize(1, 14.0f);
                p80Var4.setDisablePaddingsOffsetY(true);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(str4);
                if (starsTransaction3.extended_media.isEmpty()) {
                    z14 = z15;
                } else {
                    ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                    int size = arrayList.size();
                    z14 = z15;
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < size) {
                        TLRPC.MessageMedia messageMedia2 = arrayList.get(i33);
                        int i35 = i33 + 1;
                        TLRPC.MessageMedia messageMedia3 = messageMedia2;
                        ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                        int i36 = size;
                        f70 f70Var = new f70(p80Var4, 24.0f, i10);
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                            i15 = i34;
                            forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia3.photo);
                        } else {
                            i15 = i34;
                            if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                                forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia3.document);
                            } else {
                                imageLocation2 = null;
                            }
                            if (imageLocation2 != null) {
                                f70Var.a(6.0f);
                                f70Var.f37952b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                SpannableString spannableString = new SpannableString("x");
                                spannableString.setSpan(f70Var, 0, spannableString.length(), 33);
                                spannableStringBuilder5.append((CharSequence) spannableString);
                                spannableStringBuilder5.append((CharSequence) " ");
                                i34 = i15 + 1;
                            } else {
                                i34 = i15;
                            }
                            if (i34 >= 3) {
                                break;
                            }
                            i33 = i35;
                            size = i36;
                            arrayList = arrayList2;
                        }
                        imageLocation2 = forDocument2;
                        if (imageLocation2 != null) {
                            f70Var.a(6.0f);
                            f70Var.f37952b.setImage(imageLocation2, "24_24", null, null, null, 0);
                            SpannableString spannableString2 = new SpannableString("x");
                            spannableString2.setSpan(f70Var, 0, spannableString2.length(), 33);
                            spannableStringBuilder5.append((CharSequence) spannableString2);
                            spannableStringBuilder5.append((CharSequence) " ");
                            i34 = i15 + 1;
                        } else {
                            i34 = i15;
                        }
                        if (i34 >= 3) {
                            break;
                            break;
                        }
                        i33 = i35;
                        size = i36;
                        arrayList = arrayList2;
                    }
                }
                spannableStringBuilder5.append((CharSequence) " ");
                int length = spannableStringBuilder5.length();
                String publicUsername = ChatObject.getPublicUsername(chat3);
                if (TextUtils.isEmpty(publicUsername)) {
                    spannableStringBuilder5.append((CharSequence) chat3.title);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    i0.a.z(sb2, MessagesController.getInstance(i10).linkPrefix, "/", publicUsername, "/");
                    sb2.append(starsTransaction3.msg_id);
                    spannableStringBuilder5.append((CharSequence) sb2.toString());
                }
                y7 y7Var4 = new y7(e3VarArr3, peerDialogId7, starsTransaction3);
                spannableStringBuilder5.setSpan(new g9(y7Var4), length, spannableStringBuilder5.length(), 33);
                p80Var4.setSingleLine(true);
                p80Var4.setEllipsize(TextUtils.TruncateAt.END);
                p80Var4.setText(spannableStringBuilder5);
                p80Var4.setOnClickListener(new ag.w0(y7Var4, 18));
                r13.i(p80Var4, LocaleController.getString(starsTransaction3.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
            } else {
                z14 = z15;
            }
        }
        if (!TextUtils.isEmpty(starsTransaction3.f22609id) && !z19) {
            String string10 = LocaleController.getString(R.string.StarsTransactionID);
            String str6 = starsTransaction3.f22609id;
            r13.h(string10, str6, str6.length() > 25 ? 9 : 10, new m5(5, e3VarArr3, c6Var3));
        }
        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
            r13.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
        }
        r13.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) starsTransaction3.date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) starsTransaction3.date) * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        TL_stars.StarGift starGift4 = starsTransaction3.stargift;
        if (starGift4 != null) {
            if (starGift4.limited) {
                F0(r13, i10, starGift4, c6Var3);
            }
            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                r13.a(new SpannableStringBuilder(starsTransaction3.description));
            }
        }
        ?? r20 = r35;
        r20.addView(r13, h7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
            r13.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) starsTransaction3.transaction_date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) starsTransaction3.transaction_date) * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
        }
        if (z14) {
            context3 = context;
        } else {
            context3 = context;
            p80 p80Var5 = new p80(context3, c6Var3);
            p80Var5.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var3));
            p80Var5.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var3));
            p80Var5.setTextSize(1, 14.0f);
            p80Var5.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.e(context3, 4)));
            p80Var5.setGravity(17);
            r20.addView(p80Var5, h7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
        }
        lh.d dVar = new lh.d(context3, c6Var3);
        dVar.e();
        if ((starsTransaction3.flags & 32) != 0) {
            dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
        } else {
            dVar.h(LocaleController.getString(R.string.OK));
        }
        r20.addView(dVar, h7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
        e3Var2.customView = r20;
        int i37 = 0;
        e3VarArr3[0] = e3Var2;
        e3Var2.useBackgroundTopPadding = false;
        if ((starsTransaction3.flags & 32) != 0) {
            dVar.setOnClickListener(new ag.q0(context3, starsTransaction3));
        } else {
            dVar.setOnClickListener(new d8(e3VarArr3, i37));
        }
        e3VarArr3[0].fixNavigationBar();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(n2VarU)) {
            e3VarArr3[0].makeAttached(n2VarU);
        }
        e3VarArr3[0].show();
        return e3VarArr3[0];
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
        starsTransaction.f22609id = tL_messageActionPaymentRefunded.charge.f22508id;
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
        starsTransaction.f22609id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i10, starsTransaction, c6Var);
    }

    public static void x0(oa oaVar, int i10) {
        n41 n41VarG;
        char c10;
        String userName;
        boolean z10;
        final boolean z11;
        TLObject tLObject;
        TLObject tLObject2;
        Drawable drawable;
        Drawable drawable2;
        TextView textView;
        TextView textView2;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        int i11;
        String str;
        yy0 yy0Var;
        p80 p80Var;
        int i12;
        org.telegram.ui.g5 g5Var;
        TLRPC.Chat chat;
        boolean z12;
        String userName2;
        boolean z13;
        boolean z14;
        long currentTime;
        int i13;
        int i14;
        final org.telegram.ui.ActionBar.e3[] e3VarArr;
        final int i15;
        ?? r10;
        org.telegram.ui.ActionBar.n2 n2VarU;
        final boolean z15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        TLRPC.User user;
        boolean z16;
        TLObject tLObject3;
        n9 n9Var = oaVar.f9849c0;
        if (n9Var == null || (n41VarG = n9Var.G(i10)) == null) {
            return;
        }
        int i21 = n41VarG.d;
        if (i21 == -1) {
            oaVar.f9849c0.N(true);
            return;
        }
        if (i21 == -2) {
            u7.y(oaVar.currentAccount, false).u();
            cg.y2.e0(1, BirthdayController.getInstance(oaVar.currentAccount).getState());
            return;
        }
        if (i21 == -3) {
            u7.y(oaVar.currentAccount, false).W();
            oaVar.f9849c0.N(true);
            return;
        }
        if (i21 == -4) {
            if (MessagesController.getInstance(oaVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(oaVar.currentAccount);
                return;
            } else {
                oaVar.presentFragment(new nh.s3(oaVar.getUserConfig().getClientUserId()));
                return;
            }
        }
        int i22 = 3;
        if (n41VarG.G(aa.class)) {
            if (n41VarG.G instanceof TL_stars.TL_starsTopupOption) {
                u7.y(oaVar.currentAccount, false).f(oaVar.getParentActivity(), (TL_stars.TL_starsTopupOption) n41VarG.G, new cg.u0(i22, oaVar, n41VarG), null);
                return;
            }
            return;
        }
        if (n41VarG.G(ga.class) && (n41VarG.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = oaVar.getParentActivity();
            int i23 = oaVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) n41VarG.G;
            org.telegram.ui.ActionBar.c6 resourceProvider = oaVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(parentActivity, resourceProvider, false, false);
            e3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.e3[] e3VarArr2 = new org.telegram.ui.ActionBar.e3[1];
            LinearLayout linearLayoutF = org.telegram.messenger.y1.f(parentActivity, 1);
            linearLayoutF.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            linearLayoutF.setClipChildren(false);
            linearLayoutF.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayoutF.addView(frameLayout, h7.z5.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            h9 h9Var = new h9(zArr, e3VarArr2);
            NotificationCenter.getInstance(i23).addObserver(h9Var, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(parentActivity);
            if (peerDialogId >= 0) {
                c10 = 0;
                TLRPC.User user2 = MessagesController.getInstance(i23).getUser(Long.valueOf(peerDialogId));
                userName = UserObject.getUserName(user2);
                boolean zIsBot = UserObject.isBot(user2);
                z10 = !zIsBot;
                z11 = zIsBot;
                tLObject = user2;
            } else {
                c10 = 0;
                TLRPC.Chat chat2 = MessagesController.getInstance(i23).getChat(Long.valueOf(-peerDialogId));
                userName = chat2 == null ? "" : chat2.title;
                z10 = false;
                z11 = false;
                tLObject = chat2;
            }
            String str2 = userName;
            if (starsSubscription.photo == null) {
                TLObject tLObject4 = tLObject;
                n9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                if (peerDialogId >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i23).getUser(Long.valueOf(peerDialogId));
                    y8Var.r(user3);
                    n9Var2.e(user3, y8Var);
                    tLObject3 = tLObject4;
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i23).getChat(Long.valueOf(-peerDialogId));
                    y8Var.q(chat3);
                    n9Var2.e(chat3, y8Var);
                    tLObject2 = tLObject4;
                }
                frameLayout.addView(n9Var2, h7.z5.e(100, 100, 17));
                drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                if (starsSubscription.photo == null) {
                    ImageView imageView = new ImageView(parentActivity);
                    imageView.setImageDrawable(drawable);
                    frameLayout.addView(imageView, h7.z5.e(28, 28, 17));
                    imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                    imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                    imageView.setScaleX(1.1f);
                    imageView.setScaleY(1.1f);
                    ImageView imageView2 = new ImageView(parentActivity);
                    imageView2.setImageDrawable(drawable2);
                    frameLayout.addView(imageView2, h7.z5.e(28, 28, 17));
                    imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                    imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                }
                textView = new TextView(parentActivity);
                rl.w(org.telegram.ui.ActionBar.g6.f23161j5, resourceProvider, textView, 1, 20.0f);
                textView.setGravity(17);
                if (TextUtils.isEmpty(starsSubscription.title)) {
                    textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                } else {
                    textView.setText(starsSubscription.title);
                }
                linearLayoutF.addView(textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
                textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, resourceProvider));
                tL_starsSubscriptionPricing = starsSubscription.pricing;
                i11 = tL_starsSubscriptionPricing.period;
                if (i11 == 2592000) {
                    int i24 = R.string.StarsSubscriptionPrice;
                    Long lValueOf = Long.valueOf(tL_starsSubscriptionPricing.amount);
                    Object[] objArr = new Object[1];
                    objArr[c10] = lValueOf;
                    textView2.setText(X0(false, LocaleController.formatString(i24, objArr), 0.8f, null));
                } else {
                    if (i11 == 300) {
                        str = "5min";
                    } else {
                        str = "min";
                    }
                    textView2.setText(X0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), str), 0.8f, null));
                }
                linearLayoutF.addView(textView2, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
                yy0Var = new yy0(parentActivity, resourceProvider);
                p80Var = new p80(parentActivity, resourceProvider);
                p80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                i12 = org.telegram.ui.ActionBar.g6.gc;
                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                p80Var.setTextSize(1, 14.0f);
                p80Var.setSingleLine(true);
                p80Var.setDisablePaddingsOffsetY(true);
                g5Var = new org.telegram.ui.g5(p80Var, 24.0f, i23);
                if (peerDialogId >= 0) {
                    user = MessagesController.getInstance(i23).getUser(Long.valueOf(peerDialogId));
                    if (user != null || UserObject.isDeleted(user)) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    userName2 = UserObject.getUserName(user);
                    g5Var.e(user);
                    z13 = z16;
                } else {
                    chat = MessagesController.getInstance(i23).getChat(Long.valueOf(-peerDialogId));
                    if (chat == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    userName2 = chat != null ? chat.title : "";
                    g5Var.b(chat);
                    z13 = z12;
                }
                String str3 = userName2;
                z14 = z13;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.setSpan(new i9(e3VarArr2, peerDialogId), 3, spannableStringBuilder.length(), 33);
                p80Var.setText(spannableStringBuilder);
                if (!z14) {
                    if (peerDialogId < 0) {
                        i20 = R.string.StarsSubscriptionChannel;
                    } else if (z10) {
                        i20 = R.string.StarsSubscriptionBusiness;
                    } else {
                        i20 = R.string.StarsSubscriptionBot;
                    }
                    yy0Var.i(p80Var, LocaleController.getString(i20));
                }
                if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                    if (z10) {
                        i19 = R.string.StarsSubscriptionBusinessProduct;
                    } else {
                        i19 = R.string.StarsSubscriptionBotProduct;
                    }
                    yy0Var.c(LocaleController.getString(i19), starsSubscription.title, null, null);
                }
                yy0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) (starsSubscription.until_date - starsSubscription.pricing.period)) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) (starsSubscription.until_date - starsSubscription.pricing.period)) * 1000))), null, null);
                currentTime = ConnectionsManager.getInstance(i23).getCurrentTime();
                if (!starsSubscription.canceled || starsSubscription.bot_canceled) {
                    i13 = R.string.StarsSubscriptionUntilExpires;
                } else {
                    i13 = currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews;
                }
                yy0Var.c(LocaleController.getString(i13), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) starsSubscription.until_date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) starsSubscription.until_date) * 1000))), null, null);
                linearLayoutF.addView(yy0Var, h7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                p80 p80Var2 = new p80(parentActivity, resourceProvider);
                i14 = org.telegram.ui.ActionBar.g6.f23441z6;
                p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
                p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                final int i25 = 1;
                p80Var2.setTextSize(1, 14.0f);
                p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() {
                    @Override
                    public final void run() {
                        Object obj;
                        int i26 = i25;
                        Activity activity = parentActivity;
                        switch (i26) {
                            case 0:
                                if (!activity.isFinishing()) {
                                    Handler handler = g.f5055g;
                                    Method method = g.f5054f;
                                    int i27 = Build.VERSION.SDK_INT;
                                    if (i27 < 28) {
                                        if (((i27 != 26 && i27 != 27) || method != null) && (g.f5053e != null || g.d != null)) {
                                            Object obj2 = g.f5052c.get(activity);
                                            if (obj2 != null && (obj = g.f5051b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                f fVar = new f(activity);
                                                application.registerActivityLifecycleCallbacks(fVar);
                                                handler.post(new a9.o(fVar, obj2, false, 3));
                                                try {
                                                    if (i27 == 26 || i27 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new a9.o(application, fVar, false, 4));
                                                } catch (Throwable th) {
                                                    handler.post(new a9.o(application, fVar, false, 4));
                                                    throw th;
                                                }
                                                break;
                                            }
                                        }
                                        activity.recreate();
                                    } else {
                                        activity.recreate();
                                    }
                                }
                                break;
                            default:
                                we.e.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                                break;
                        }
                    }
                }));
                p80Var2.setGravity(17);
                linearLayoutF.addView(p80Var2, h7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                if (currentTime < starsSubscription.until_date) {
                    i15 = i23;
                    p80 p80Var3 = new p80(parentActivity, resourceProvider);
                    p80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
                    p80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                    p80Var3.setTextSize(1, 14.0f);
                    p80Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                    p80Var3.setSingleLine(false);
                    p80Var3.setMaxLines(4);
                    p80Var3.setGravity(17);
                    linearLayoutF.addView(p80Var3, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    if (starsSubscription.chat_invite_hash == null || starsSubscription.invoice_slug != null) {
                        e3VarArr = e3VarArr2;
                        e3VarArr = e3VarArr2;
                        lh.d dVar = new lh.d(parentActivity, resourceProvider, true);
                        dVar.setRoundRadius(24);
                        r10 = 0;
                        dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                        linearLayoutF.addView(dVar, h7.z5.n(-1, 48));
                        w8 w8Var = new w8(dVar, starsSubscription, i15, e3VarArr, resourceProvider, zArr, parentActivity);
                        i15 = i15;
                        dVar.setOnClickListener(w8Var);
                    }
                    e3Var.customView = linearLayoutF;
                    e3VarArr[r10] = e3Var;
                    e3Var.useBackgroundTopPadding = r10;
                    e3Var.setOnDismissListener(new x8(i15, h9Var));
                    e3VarArr[r10].fixNavigationBar();
                    n2VarU = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(n2VarU)) {
                        e3VarArr[r10].makeAttached(n2VarU);
                    }
                    e3VarArr[r10].show();
                }
                if (starsSubscription.can_refulfill) {
                    p80 p80Var4 = new p80(parentActivity, resourceProvider);
                    p80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
                    p80Var4.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                    p80Var4.setTextSize(1, 14.0f);
                    if (z11) {
                        i17 = R.string.StarsSubscriptionBotRefulfillInfo;
                    } else {
                        i17 = R.string.StarsSubscriptionRefulfillInfo;
                    }
                    p80Var4.setText(LocaleController.formatString(i17, LocaleController.formatDateChat(starsSubscription.until_date)));
                    p80Var4.setSingleLine(false);
                    p80Var4.setMaxLines(4);
                    p80Var4.setGravity(17);
                    linearLayoutF.addView(p80Var4, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    lh.d dVar2 = new lh.d(parentActivity, resourceProvider, true);
                    if (z11) {
                        i18 = R.string.StarsSubscriptionBotRefulfill;
                    } else {
                        i18 = R.string.StarsSubscriptionRefulfill;
                    }
                    dVar2.g(LocaleController.getString(i18), false, true);
                    linearLayoutF.addView(dVar2, h7.z5.n(-1, 48));
                    e3VarArr = e3VarArr2;
                    t8 t8Var = new t8(dVar2, i23, starsSubscription, e3VarArr, peerDialogId, parentActivity, resourceProvider, z10, str2);
                    i15 = i23;
                    dVar2.setOnClickListener(t8Var);
                } else {
                    z15 = z10;
                    i15 = i23;
                    if (starsSubscription.bot_canceled) {
                        p80 p80Var5 = new p80(parentActivity, resourceProvider);
                        p80Var5.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                        p80Var5.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                        p80Var5.setTextSize(1, 14.0f);
                        if (z15) {
                            e3VarArr = e3VarArr2;
                            i16 = R.string.StarsSubscriptionBusinessCancelledText;
                        } else {
                            e3VarArr = e3VarArr2;
                            i16 = R.string.StarsSubscriptionBotCancelledText;
                        }
                        p80Var5.setText(LocaleController.getString(i16));
                        p80Var5.setSingleLine(false);
                        p80Var5.setMaxLines(4);
                        p80Var5.setGravity(17);
                        linearLayoutF.addView(p80Var5, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    } else if (starsSubscription.canceled) {
                        p80 p80Var6 = new p80(parentActivity, resourceProvider);
                        p80Var6.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                        p80Var6.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                        p80Var6.setTextSize(1, 14.0f);
                        p80Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                        p80Var6.setSingleLine(false);
                        p80Var6.setMaxLines(4);
                        p80Var6.setGravity(17);
                        linearLayoutF.addView(p80Var6, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash == null || starsSubscription.invoice_slug != null) {
                            e3VarArr = e3VarArr2;
                            e3VarArr = e3VarArr2;
                            lh.d dVar3 = new lh.d(parentActivity, resourceProvider, true);
                            dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                            linearLayoutF.addView(dVar3, h7.z5.n(-1, 48));
                            u8 u8Var = new u8(dVar3, starsSubscription, i15, e3VarArr, tLObject2, str2);
                            i15 = i15;
                            dVar3.setOnClickListener(u8Var);
                        }
                    } else {
                        e3VarArr = e3VarArr2;
                        final TLObject tLObject5 = tLObject2;
                        p80 p80Var7 = new p80(parentActivity, resourceProvider);
                        p80Var7.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
                        p80Var7.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                        p80Var7.setTextSize(1, 14.0f);
                        p80Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        p80Var7.setSingleLine(false);
                        p80Var7.setMaxLines(4);
                        p80Var7.setGravity(17);
                        linearLayoutF.addView(p80Var7, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        final lh.d dVar4 = new lh.d(parentActivity, resourceProvider, false);
                        dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                        dVar4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                        linearLayoutF.addView(dVar4, h7.z5.n(-1, 48));
                        dVar4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                final lh.d dVar5 = dVar4;
                                if (dVar5.J) {
                                    return;
                                }
                                dVar5.setLoading(true);
                                TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                tL_changeStarsSubscription.subscription_id = starsSubscription2.f22608id;
                                final int i26 = i15;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i26);
                                final TLObject tLObject6 = tLObject5;
                                final boolean z17 = z15;
                                final boolean z18 = z11;
                                final org.telegram.ui.ActionBar.e3[] e3VarArr3 = e3VarArr;
                                connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject7, TLRPC.TL_error tL_error) {
                                        AndroidUtilities.runOnUIThread(new a9(i26, dVar5, tLObject6, starsSubscription2, z17, z18, e3VarArr3));
                                    }
                                });
                            }
                        });
                    }
                }
                e3VarArr = e3VarArr2;
                e3VarArr = e3VarArr2;
                r10 = 0;
                e3Var.customView = linearLayoutF;
                e3VarArr[r10] = e3Var;
                e3Var.useBackgroundTopPadding = r10;
                e3Var.setOnDismissListener(new x8(i15, h9Var));
                e3VarArr[r10].fixNavigationBar();
                n2VarU = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                    e3VarArr[r10].makeAttached(n2VarU);
                }
                e3VarArr[r10].show();
            }
            n9Var2.setRoundRadius(AndroidUtilities.dp(21.0f));
            tLObject3 = tLObject;
            n9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            tLObject2 = tLObject3;
            frameLayout.addView(n9Var2, h7.z5.e(100, 100, 17));
            drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
                ImageView imageView3 = new ImageView(parentActivity);
                imageView3.setImageDrawable(drawable);
                frameLayout.addView(imageView3, h7.z5.e(28, 28, 17));
                imageView3.setTranslationX(AndroidUtilities.dp(34.0f));
                imageView3.setTranslationY(AndroidUtilities.dp(35.0f));
                imageView3.setScaleX(1.1f);
                imageView3.setScaleY(1.1f);
                ImageView imageView4 = new ImageView(parentActivity);
                imageView4.setImageDrawable(drawable2);
                frameLayout.addView(imageView4, h7.z5.e(28, 28, 17));
                imageView4.setTranslationX(AndroidUtilities.dp(34.0f));
                imageView4.setTranslationY(AndroidUtilities.dp(35.0f));
            }
            textView = new TextView(parentActivity);
            rl.w(org.telegram.ui.ActionBar.g6.f23161j5, resourceProvider, textView, 1, 20.0f);
            textView.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
                textView.setText(starsSubscription.title);
            } else {
                textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
            }
            linearLayoutF.addView(textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
            textView2 = new TextView(parentActivity);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, resourceProvider));
            tL_starsSubscriptionPricing = starsSubscription.pricing;
            i11 = tL_starsSubscriptionPricing.period;
            if (i11 == 2592000) {
                int i26 = R.string.StarsSubscriptionPrice;
                Long lValueOf2 = Long.valueOf(tL_starsSubscriptionPricing.amount);
                Object[] objArr2 = new Object[1];
                objArr2[c10] = lValueOf2;
                textView2.setText(X0(false, LocaleController.formatString(i26, objArr2), 0.8f, null));
            } else {
                if (i11 == 300) {
                    str = "5min";
                } else {
                    str = "min";
                }
                textView2.setText(X0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), str), 0.8f, null));
            }
            linearLayoutF.addView(textView2, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
            yy0Var = new yy0(parentActivity, resourceProvider);
            p80Var = new p80(parentActivity, resourceProvider);
            p80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            p80Var.setEllipsize(TextUtils.TruncateAt.END);
            i12 = org.telegram.ui.ActionBar.g6.gc;
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
            p80Var.setTextSize(1, 14.0f);
            p80Var.setSingleLine(true);
            p80Var.setDisablePaddingsOffsetY(true);
            g5Var = new org.telegram.ui.g5(p80Var, 24.0f, i23);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(i23).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                userName2 = UserObject.getUserName(user);
                g5Var.e(user);
                z13 = z16;
            } else {
                chat = MessagesController.getInstance(i23).getChat(Long.valueOf(-peerDialogId));
                if (chat == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (chat != null) {
                }
                g5Var.b(chat);
                z13 = z12;
            }
            String str4 = userName2;
            z14 = z13;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str4));
            spannableStringBuilder2.setSpan(g5Var, 0, 1, 33);
            spannableStringBuilder2.setSpan(new i9(e3VarArr2, peerDialogId), 3, spannableStringBuilder2.length(), 33);
            p80Var.setText(spannableStringBuilder2);
            if (!z14) {
                if (peerDialogId < 0) {
                    i20 = R.string.StarsSubscriptionChannel;
                } else if (z10) {
                    i20 = R.string.StarsSubscriptionBusiness;
                } else {
                    i20 = R.string.StarsSubscriptionBot;
                }
                yy0Var.i(p80Var, LocaleController.getString(i20));
            }
            if (peerDialogId >= 0) {
                if (z10) {
                    i19 = R.string.StarsSubscriptionBusinessProduct;
                } else {
                    i19 = R.string.StarsSubscriptionBotProduct;
                }
                yy0Var.c(LocaleController.getString(i19), starsSubscription.title, null, null);
            }
            yy0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) (starsSubscription.until_date - starsSubscription.pricing.period)) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) (starsSubscription.until_date - starsSubscription.pricing.period)) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i23).getCurrentTime();
            if (starsSubscription.canceled) {
                i13 = R.string.StarsSubscriptionUntilExpires;
            } else {
                i13 = R.string.StarsSubscriptionUntilExpires;
            }
            yy0Var.c(LocaleController.getString(i13), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) starsSubscription.until_date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) starsSubscription.until_date) * 1000))), null, null);
            linearLayoutF.addView(yy0Var, h7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            p80 p80Var8 = new p80(parentActivity, resourceProvider);
            i14 = org.telegram.ui.ActionBar.g6.f23441z6;
            p80Var8.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
            p80Var8.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
            final int i27 = 1;
            p80Var8.setTextSize(1, 14.0f);
            p80Var8.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() {
                @Override
                public final void run() {
                    Object obj;
                    int i28 = i27;
                    Activity activity = parentActivity;
                    switch (i28) {
                        case 0:
                            if (!activity.isFinishing()) {
                                Handler handler = g.f5055g;
                                Method method = g.f5054f;
                                int i29 = Build.VERSION.SDK_INT;
                                if (i29 < 28) {
                                    if (((i29 != 26 && i29 != 27) || method != null) && (g.f5053e != null || g.d != null)) {
                                        Object obj2 = g.f5052c.get(activity);
                                        if (obj2 != null && (obj = g.f5051b.get(activity)) != null) {
                                            Application application = activity.getApplication();
                                            f fVar = new f(activity);
                                            application.registerActivityLifecycleCallbacks(fVar);
                                            handler.post(new a9.o(fVar, obj2, false, 3));
                                            try {
                                                if (i29 == 26 || i29 == 27) {
                                                    Boolean bool = Boolean.FALSE;
                                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                } else {
                                                    activity.recreate();
                                                }
                                                handler.post(new a9.o(application, fVar, false, 4));
                                            } catch (Throwable th) {
                                                handler.post(new a9.o(application, fVar, false, 4));
                                                throw th;
                                            }
                                            break;
                                        }
                                    }
                                    activity.recreate();
                                } else {
                                    activity.recreate();
                                }
                            }
                            break;
                        default:
                            we.e.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                            break;
                    }
                }
            }));
            p80Var8.setGravity(17);
            linearLayoutF.addView(p80Var8, h7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
                i15 = i23;
                p80 p80Var9 = new p80(parentActivity, resourceProvider);
                p80Var9.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
                p80Var9.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                p80Var9.setTextSize(1, 14.0f);
                p80Var9.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                p80Var9.setSingleLine(false);
                p80Var9.setMaxLines(4);
                p80Var9.setGravity(17);
                linearLayoutF.addView(p80Var9, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                if (starsSubscription.chat_invite_hash == null) {
                }
                e3VarArr = e3VarArr2;
                e3VarArr = e3VarArr2;
                lh.d dVar5 = new lh.d(parentActivity, resourceProvider, true);
                dVar5.setRoundRadius(24);
                r10 = 0;
                dVar5.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                linearLayoutF.addView(dVar5, h7.z5.n(-1, 48));
                w8 w8Var2 = new w8(dVar5, starsSubscription, i15, e3VarArr, resourceProvider, zArr, parentActivity);
                i15 = i15;
                dVar5.setOnClickListener(w8Var2);
                e3Var.customView = linearLayoutF;
                e3VarArr[r10] = e3Var;
                e3Var.useBackgroundTopPadding = r10;
                e3Var.setOnDismissListener(new x8(i15, h9Var));
                e3VarArr[r10].fixNavigationBar();
                n2VarU = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                    e3VarArr[r10].makeAttached(n2VarU);
                }
                e3VarArr[r10].show();
            }
            if (starsSubscription.can_refulfill) {
                p80 p80Var10 = new p80(parentActivity, resourceProvider);
                p80Var10.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
                p80Var10.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                p80Var10.setTextSize(1, 14.0f);
                if (z11) {
                    i17 = R.string.StarsSubscriptionBotRefulfillInfo;
                } else {
                    i17 = R.string.StarsSubscriptionRefulfillInfo;
                }
                p80Var10.setText(LocaleController.formatString(i17, LocaleController.formatDateChat(starsSubscription.until_date)));
                p80Var10.setSingleLine(false);
                p80Var10.setMaxLines(4);
                p80Var10.setGravity(17);
                linearLayoutF.addView(p80Var10, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                lh.d dVar6 = new lh.d(parentActivity, resourceProvider, true);
                if (z11) {
                    i18 = R.string.StarsSubscriptionBotRefulfill;
                } else {
                    i18 = R.string.StarsSubscriptionRefulfill;
                }
                dVar6.g(LocaleController.getString(i18), false, true);
                linearLayoutF.addView(dVar6, h7.z5.n(-1, 48));
                e3VarArr = e3VarArr2;
                t8 t8Var2 = new t8(dVar6, i23, starsSubscription, e3VarArr, peerDialogId, parentActivity, resourceProvider, z10, str2);
                i15 = i23;
                dVar6.setOnClickListener(t8Var2);
            } else {
                z15 = z10;
                i15 = i23;
                if (starsSubscription.bot_canceled) {
                    p80 p80Var11 = new p80(parentActivity, resourceProvider);
                    p80Var11.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                    p80Var11.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                    p80Var11.setTextSize(1, 14.0f);
                    if (z15) {
                        e3VarArr = e3VarArr2;
                        i16 = R.string.StarsSubscriptionBusinessCancelledText;
                    } else {
                        e3VarArr = e3VarArr2;
                        i16 = R.string.StarsSubscriptionBotCancelledText;
                    }
                    p80Var11.setText(LocaleController.getString(i16));
                    p80Var11.setSingleLine(false);
                    p80Var11.setMaxLines(4);
                    p80Var11.setGravity(17);
                    linearLayoutF.addView(p80Var11, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                } else if (starsSubscription.canceled) {
                    p80 p80Var12 = new p80(parentActivity, resourceProvider);
                    p80Var12.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                    p80Var12.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                    p80Var12.setTextSize(1, 14.0f);
                    p80Var12.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                    p80Var12.setSingleLine(false);
                    p80Var12.setMaxLines(4);
                    p80Var12.setGravity(17);
                    linearLayoutF.addView(p80Var12, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    if (starsSubscription.chat_invite_hash == null) {
                        e3VarArr = e3VarArr2;
                        e3VarArr = e3VarArr2;
                        lh.d dVar7 = new lh.d(parentActivity, resourceProvider, true);
                        dVar7.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                        linearLayoutF.addView(dVar7, h7.z5.n(-1, 48));
                        u8 u8Var2 = new u8(dVar7, starsSubscription, i15, e3VarArr, tLObject2, str2);
                        i15 = i15;
                        dVar7.setOnClickListener(u8Var2);
                    } else {
                        e3VarArr = e3VarArr2;
                        e3VarArr = e3VarArr2;
                        lh.d dVar8 = new lh.d(parentActivity, resourceProvider, true);
                        dVar8.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                        linearLayoutF.addView(dVar8, h7.z5.n(-1, 48));
                        u8 u8Var3 = new u8(dVar8, starsSubscription, i15, e3VarArr, tLObject2, str2);
                        i15 = i15;
                        dVar8.setOnClickListener(u8Var3);
                    }
                } else {
                    e3VarArr = e3VarArr2;
                    final TLObject tLObject6 = tLObject2;
                    p80 p80Var13 = new p80(parentActivity, resourceProvider);
                    p80Var13.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
                    p80Var13.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
                    p80Var13.setTextSize(1, 14.0f);
                    p80Var13.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                    p80Var13.setSingleLine(false);
                    p80Var13.setMaxLines(4);
                    p80Var13.setGravity(17);
                    linearLayoutF.addView(p80Var13, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    final lh.d dVar9 = new lh.d(parentActivity, resourceProvider, false);
                    dVar9.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                    dVar9.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                    linearLayoutF.addView(dVar9, h7.z5.n(-1, 48));
                    dVar9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            final lh.d dVar10 = dVar9;
                            if (dVar10.J) {
                                return;
                            }
                            dVar10.setLoading(true);
                            TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                            tL_changeStarsSubscription.canceled = Boolean.TRUE;
                            tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                            final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                            tL_changeStarsSubscription.subscription_id = starsSubscription2.f22608id;
                            final int i28 = i15;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i28);
                            final TLObject tLObject7 = tLObject6;
                            final boolean z17 = z15;
                            final boolean z18 = z11;
                            final org.telegram.ui.ActionBar.e3[] e3VarArr3 = e3VarArr;
                            connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject8, TLRPC.TL_error tL_error) {
                                    AndroidUtilities.runOnUIThread(new a9(i28, dVar10, tLObject7, starsSubscription2, z17, z18, e3VarArr3));
                                }
                            });
                        }
                    });
                }
            }
            e3VarArr = e3VarArr2;
            e3VarArr = e3VarArr2;
            r10 = 0;
            e3Var.customView = linearLayoutF;
            e3VarArr[r10] = e3Var;
            e3Var.useBackgroundTopPadding = r10;
            e3Var.setOnDismissListener(new x8(i15, h9Var));
            e3VarArr[r10].fixNavigationBar();
            n2VarU = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
                e3VarArr[r10].makeAttached(n2VarU);
            }
            e3VarArr[r10].show();
        }
    }

    public static void z0(oa oaVar, n41 n41Var, Boolean bool, String str) {
        if (oaVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            mc.a0(oaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) n41Var.B, new Object[0])), R.raw.stars_topup).j();
            oaVar.P.c(true);
            u7.y(oaVar.currentAccount, false).T(true);
        } else if (str != null) {
            org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{str}, mc.a0(oaVar), R.raw.error, 36);
        }
    }

    public final void H0(ArrayList arrayList, b51 b51Var) {
        if (getParentActivity() == null) {
            return;
        }
        u7 u7VarY = u7.y(this.currentAccount, false);
        ArrayList arrayList2 = u7VarY.v;
        ag.s0 s0Var = (ag.s0) super.r0(getParentActivity());
        n41 n41Var = new n41(-2);
        n41Var.f30837c = s0Var;
        arrayList.add(n41Var);
        arrayList.add(n41.k(this.Q));
        lh.d dVar = this.Z;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(n41.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(nh.g.a(-4, getThemedColor(org.telegram.ui.ActionBar.g6.uj), R.drawable.filled_earn_stars, jo.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(n41.B(null));
        }
        if (u7VarY.f10154e && !arrayList2.isEmpty()) {
            org.telegram.ui.Cells.pa.o(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = ga.f9342a;
                n41 n41VarJ = n41.J(ga.class);
                n41VarJ.G = starsSubscription;
                arrayList.add(n41VarJ);
            }
            if (u7VarY.f10171x) {
                arrayList.add(n41.o(arrayList.size(), 33));
            } else if (!u7VarY.f10172y) {
                n41 n41VarC = n41.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                n41VarC.f30849q = true;
                arrayList.add(n41VarC);
            }
            arrayList.add(n41.B(null));
        }
        boolean zO = u7VarY.O(0);
        this.f9847a0 = zO;
        if (zO) {
            arrayList.add(n41.p(this.N, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(n41.l(this.O));
        }
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new na(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.O = new ag.s0(this, context, 2);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setClickable(true);
        bg.i iVar = new bg.i(context, 1, 2);
        this.M = iVar;
        bg.a aVar = iVar.f2129b;
        aVar.f2107w = org.telegram.ui.ActionBar.g6.fk;
        aVar.f2108x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.f36343e);
        this.L.addView(this.M, h7.z5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.e(context, 5)), true), this.L, null);
        this.f36342c.setOverScrollMode(2);
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.f36342c.setItemAnimator(lVar);
        this.f36342c.setOnItemClickListener(new ag.p0(this, 5));
        f00 f00Var = new f00(getParentActivity());
        this.P = f00Var;
        this.f36347s.addView(f00Var, h7.z5.c(-1.0f, -1));
        u7 u7VarY = u7.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getParentActivity(), false, true, false);
        this.S = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        f70 f70Var = new f70(this.S, 42.0f, this.currentAccount);
        oi0 oi0Var = new oi0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), "s" + R.raw.star_reaction, AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = f70Var.f37952b;
        imageReceiver.setImageBitmap(oi0Var);
        imageReceiver.setAutoRepeat(2);
        f70Var.f37955f = false;
        f70Var.h = -AndroidUtilities.dp(3.0f);
        this.R.setSpan(f70Var, 0, 1, 33);
        this.Q.addView(this.S, h7.z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.T = textView;
        textView.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.T.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, this.resourceProvider));
        this.Q.addView(this.T, h7.z5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ag.p1 p1Var = new ag.p1(this, getParentActivity(), 5);
        this.V = p1Var;
        frameLayout2.addView(p1Var);
        lh.d dVar = new lh.d(getParentActivity(), this.resourceProvider, true);
        this.W = dVar;
        dVar.e();
        this.W.g("", false, true);
        final int i10 = 0;
        this.W.setOnClickListener(new View.OnClickListener(this) {

            public final oa f9395b;

            {
                this.f9395b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        oa.B0(this.f9395b, context);
                        break;
                    default:
                        new fa(context, this.f9395b.resourceProvider).show();
                        break;
                }
            }
        });
        this.V.addView(this.W, h7.z5.e(-1, 48, 119));
        ra1 ra1Var = new ra1(this, getParentActivity(), 4);
        this.X = ra1Var;
        frameLayout2.addView(ra1Var);
        lh.d dVar2 = new lh.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new cq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Y.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.Y.setOnClickListener(new View.OnClickListener(this) {

            public final oa f9395b;

            {
                this.f9395b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        oa.B0(this.f9395b, context);
                        break;
                    default:
                        new fa(context, this.f9395b.resourceProvider).show();
                        break;
                }
            }
        });
        this.X.addView(this.Y, h7.z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        lh.d dVar3 = new lh.d(getParentActivity(), this.resourceProvider, true);
        this.U = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new cq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.U.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.U.setOnClickListener(new View.OnClickListener(this) {

            public final oa f9493b;

            {
                this.f9493b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        oa oaVar = this.f9493b;
                        oaVar.presentFragment(new r(0, oaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        oa.A0(this.f9493b);
                        break;
                }
            }
        });
        this.X.addView(this.U, h7.z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, h7.z5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        lh.d dVar4 = new lh.d(getParentActivity(), this.resourceProvider, false);
        this.Z = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new cq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.Z.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.Z.setOnClickListener(new View.OnClickListener(this) {

            public final oa f9493b;

            {
                this.f9493b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        oa oaVar = this.f9493b;
                        oaVar.presentFragment(new r(0, oaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        oa.A0(this.f9493b);
                        break;
                }
            }
        });
        this.Q.addView(this.Z, h7.z5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        n9 n9Var = this.f9849c0;
        if (n9Var != null) {
            n9Var.N(false);
        }
        c0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsH = c0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1(u7VarY.p().amount > 0 && tL_payments_starsRevenueStatsH != null && (tL_starsRevenueStatus = tL_payments_starsRevenueStatsH.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            n9 n9Var = this.f9849c0;
            if (n9Var != null) {
                n9Var.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            u7 u7VarY = u7.y(this.currentAccount, false);
            if (this.f9847a0 != u7VarY.O(0)) {
                this.f9847a0 = u7VarY.O(0);
                s0();
                n9 n9Var2 = this.f9849c0;
                if (n9Var2 != null) {
                    n9Var2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            n9 n9Var3 = this.f9849c0;
            if (n9Var3 != null) {
                n9Var3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            k1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            k1();
        }
    }

    public final void k1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        u7 u7VarY = u7.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) J0(u7VarY.p(), 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        this.W.g(LocaleController.getString(u7VarY.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsH = c0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (tL_payments_starsRevenueStatsH != null && (tL_starsRevenueStatus = tL_payments_starsRevenueStatsH.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        this.f9848b0 = z10;
        if (z11) {
            this.V.setVisibility(0);
            this.X.setVisibility(0);
            final int i10 = 0;
            this.V.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) {

                public final oa f9543b;

                {
                    this.f9543b = this;
                }

                @Override
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z10) {
                                this.f9543b.V.setVisibility(8);
                            }
                            break;
                        default:
                            if (!z10) {
                                this.f9543b.X.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            final int i11 = 1;
            this.X.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) {

                public final oa f9543b;

                {
                    this.f9543b = this;
                }

                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            if (z10) {
                                this.f9543b.V.setVisibility(8);
                            }
                            break;
                        default:
                            if (!z10) {
                                this.f9543b.X.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.V.animate().cancel();
        this.X.animate().cancel();
        this.X.setAlpha(z10 ? 1.0f : 0.0f);
        this.V.setAlpha(z10 ? 0.0f : 1.0f);
        this.X.setVisibility(z10 ? 0 : 8);
        this.V.setVisibility(z10 ? 8 : 0);
    }

    @Override
    public final f2.q0 n0() {
        n9 n9Var = new n9(this, this.f36342c, getParentActivity(), this.currentAccount, this.classGuid, new ch.c(this, 18), getResourceProvider());
        this.f9849c0 = n9Var;
        n9Var.f26942r = false;
        return n9Var;
    }

    @Override
    public final z10 o0() {
        return new z9(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        u7.y(this.currentAccount, false).T(true);
        u7.y(this.currentAccount, false).S();
        u7.y(this.currentAccount, false).z();
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
        bg.i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        bg.i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override
    public final ag.k3 p0() {
        return new m9(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        na naVar = this.N;
        boolean z10 = false;
        if (naVar != null && (naVar.getParent() instanceof View)) {
            if ((this.f36342c.getHeight() - this.f36342c.getPaddingBottom()) - ((View) this.N.getParent()).getBottom() >= 0) {
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
