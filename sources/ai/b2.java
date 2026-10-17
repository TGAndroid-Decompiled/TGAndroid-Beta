package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
public final class b2 implements Runnable {
    public final int f1012a;
    public final k7 f1013b;

    public b2(k7 k7Var, int i10) {
        this.f1012a = i10;
        this.f1013b = k7Var;
    }

    @Override
    public final void run() {
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        n6 n6Var;
        String str;
        int i10 = this.f1012a;
        k7 k7Var = this.f1013b;
        switch (i10) {
            case 0:
                k7.I0(k7Var);
                return;
            case 1:
                k7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 2:
                k7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 3:
                k7Var.getClass();
                new sg.x0((org.telegram.ui.ActionBar.n2) new z4(k7Var, 0), 12, false).show();
                return;
            case 4:
                k7.x0(k7Var);
                return;
            case 5:
                k7Var.dismiss();
                return;
            case 6:
                new o0(k7Var.getContext()).show();
                return;
            case 7:
                k7.a0(k7Var);
                return;
            case 8:
                k7.b0(k7Var);
                return;
            case 9:
                k7Var.f1685k0.setLoading(false);
                k7Var.M2(0, true, null);
                return;
            case 10:
                new o0(k7Var.getContext()).show();
                return;
            case 11:
                k7.C0(k7Var);
                return;
            case 12:
                k7Var.onBackPressed();
                return;
            case 13:
                k7.W(k7Var);
                return;
            case 14:
                long N1 = k7Var.N1();
                if (N1 != 0) {
                    k7Var.m2(N1);
                    return;
                }
                return;
            case 15:
                k7Var.l2(true);
                return;
            case 16:
                k7Var.h2();
                return;
            case 17:
                k7Var.f2();
                return;
            case 18:
                k7.u0(k7Var);
                return;
            case 19:
                k7Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique X1 = k7Var.X1();
                if (U != null && X1 != null) {
                    ey eyVar = new ey(wh.d(4, "onlySelect", "dialogsType", true));
                    eyVar.C2 = new s2(k7Var, X1, eyVar, 0);
                    U.presentFragment(eyVar);
                    return;
                }
                return;
            case 20:
                k7Var.o2();
                return;
            case 21:
                k7Var.t2();
                return;
            case 22:
                k7Var.onBackPressed();
                return;
            case 23:
                e7 e7Var = k7Var.f1675f0;
                ei.d dVar = k7Var.f1685k0;
                o6 o6Var = k7Var.P0.h;
                if (o6Var != null && (n6Var = o6Var.f1950c) != null) {
                    imageReceiver = ((q6) n6Var).d;
                } else {
                    imageReceiver = null;
                }
                org.telegram.ui.Components.w9 w9Var = e7Var.d[0];
                if (imageReceiver != null && w9Var != null && w9Var.getImageReceiver() != null) {
                    uj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    uj0 lottieAnimation2 = w9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        w9Var.setImageDrawable(lottieAnimation);
                    }
                }
                e7Var.f1212b.setAlpha(1.0f);
                e7Var.f1214c.setAlpha(0.0f);
                if (k7Var.f1697r0 && k7Var.Z != null && k7Var.G0 != null && k7Var.T1() >= 0 && k7Var.G0.b(k7Var.T1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = k7Var.G0.b(k7Var.T1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = k7Var.G0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new a3(k7Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), true, true);
                dVar.f(null, true);
                dVar.setOnClickListener(new c2(k7Var, 7));
                return;
            case 24:
                if (k7Var.O1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(k7Var.O1().title);
                    sb2.append(" #");
                    str = org.telegram.messenger.q.h(k7Var.O1().num, ',', sb2);
                } else {
                    str = "";
                }
                org.telegram.ui.Components.qc M = k7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f29639j = 5000;
                M.f29649t = true;
                M.j();
                z00 z00Var = k7Var.f1665a0;
                if (z00Var != null) {
                    z00Var.c(true);
                    return;
                }
                return;
            default:
                k7Var.d.u0(((k7) k7Var.T0.d).S0.length - 1);
                return;
        }
    }
}
