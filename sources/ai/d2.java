package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
public final class d2 implements Runnable {
    public final int f1123a;
    public final l7 f1124b;

    public d2(l7 l7Var, int i10) {
        this.f1123a = i10;
        this.f1124b = l7Var;
    }

    @Override
    public final void run() {
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        o6 o6Var;
        String str;
        int i10 = this.f1123a;
        l7 l7Var = this.f1124b;
        switch (i10) {
            case 0:
                l7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 1:
                l7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 2:
                l7Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.o2) new a5(l7Var, 0), 12, false).show();
                return;
            case 3:
                l7.t0(l7Var);
                return;
            case 4:
                l7Var.dismiss();
                return;
            case 5:
                new o0(l7Var.getContext()).show();
                return;
            case 6:
                l7.Y(l7Var);
                return;
            case 7:
                l7.Z(l7Var);
                return;
            case 8:
                l7.g1(l7Var);
                return;
            case 9:
                l7Var.f1730k0.setLoading(false);
                l7Var.U2(0, true, null);
                return;
            case 10:
                new o0(l7Var.getContext()).show();
                return;
            case 11:
                l7.B0(l7Var);
                return;
            case 12:
                l7Var.onBackPressed();
                return;
            case 13:
                l7.U(l7Var);
                return;
            case 14:
                long U1 = l7Var.U1();
                if (U1 != 0) {
                    l7Var.u2(U1);
                    return;
                }
                return;
            case 15:
                l7.c0(l7Var);
                return;
            case 16:
                l7Var.t2(true);
                return;
            case 17:
                l7Var.p2();
                return;
            case 18:
                l7Var.m2();
                return;
            case 19:
                l7.q0(l7Var);
                return;
            case 20:
                l7Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique e22 = l7Var.e2();
                if (U != null && e22 != null) {
                    ey eyVar = new ey(org.telegram.messenger.v0.e(4, "onlySelect", "dialogsType", true));
                    eyVar.C2 = new u2(l7Var, e22, eyVar, 0);
                    U.presentFragment(eyVar);
                    return;
                }
                return;
            case 21:
                l7Var.w2();
                return;
            case 22:
                l7Var.B2();
                return;
            case 23:
                l7Var.onBackPressed();
                return;
            case 24:
                f7 f7Var = l7Var.f1720f0;
                ei.d dVar = l7Var.f1730k0;
                p6 p6Var = l7Var.P0.h;
                if (p6Var != null && (o6Var = p6Var.f1993c) != null) {
                    imageReceiver = ((r6) o6Var).d;
                } else {
                    imageReceiver = null;
                }
                org.telegram.ui.Components.w9 w9Var = f7Var.d[0];
                if (imageReceiver != null && w9Var != null && w9Var.getImageReceiver() != null) {
                    yj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    yj0 lottieAnimation2 = w9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        w9Var.setImageDrawable(lottieAnimation);
                    }
                }
                f7Var.f1266b.setAlpha(1.0f);
                f7Var.f1268c.setAlpha(0.0f);
                if (l7Var.f1742r0 && l7Var.Z != null && l7Var.G0 != null && l7Var.a2() >= 0 && l7Var.G0.b(l7Var.a2()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = l7Var.G0.b(l7Var.a2());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = l7Var.G0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.i(spannableStringBuilder, true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new a3(l7Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.i(LocaleController.getString(R.string.OK), true, true);
                dVar.g(null, true);
                dVar.setOnClickListener(new c2(l7Var, 7));
                return;
            case 25:
                if (l7Var.V1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(l7Var.V1().title);
                    sb2.append(" #");
                    str = i2.o1.m(l7Var.V1().num, ',', sb2);
                } else {
                    str = "";
                }
                org.telegram.ui.Components.qc M = l7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f29832j = 5000;
                M.f29842t = true;
                M.j();
                z00 z00Var = l7Var.f1710a0;
                if (z00Var != null) {
                    z00Var.c(true);
                    return;
                }
                return;
            default:
                l7Var.d.u0(((l7) l7Var.T0.d).S0.length - 1);
                return;
        }
    }
}
