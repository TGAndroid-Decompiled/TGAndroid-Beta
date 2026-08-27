package hh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;

public final class v1 implements Runnable {

    public final int f10199a;

    public final i5 f10200b;

    public v1(i5 i5Var, int i10) {
        this.f10199a = i10;
        this.f10200b = i5Var;
    }

    @Override
    public final void run() {
        String strM;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        o4 o4Var;
        int i10 = this.f10199a;
        i5 i5Var = this.f10200b;
        switch (i10) {
            case 0:
                i5.p0(i5Var);
                break;
            case 1:
                new g0(i5Var.getContext()).show();
                break;
            case 2:
                i5Var.dismiss();
                break;
            case 3:
                i5.W(i5Var);
                break;
            case 4:
                i5.Y(i5Var);
                break;
            case 5:
                i5Var.f9461f0.setLoading(false);
                i5Var.q2(0, true, null);
                break;
            case 6:
                new g0(i5Var.getContext()).show();
                break;
            case 7:
                i5.v0(i5Var);
                break;
            case 8:
                i5.b0(i5Var);
                break;
            case 9:
                i5Var.onBackPressed();
                break;
            case 10:
                i5.g1(i5Var);
                break;
            case 11:
                i5Var.W1(true);
                break;
            case 12:
                i5Var.U1();
                break;
            case 13:
                i5Var.S1();
                break;
            case 14:
                i5.n0(i5Var);
                break;
            case 15:
                i5Var.dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = i5Var.K1();
                if (n2VarU != null && tL_starGiftUniqueK1 != null) {
                    gy gyVar = new gy(org.telegram.messenger.y1.e(4, "onlySelect", "dialogsType", true));
                    gyVar.f38621y2 = new ag.l0(i5Var, tL_starGiftUniqueK1, gyVar, 8);
                    n2VarU.presentFragment(gyVar);
                    break;
                }
                break;
            case 16:
                i5Var.Y1();
                break;
            case 17:
                long jA1 = i5Var.A1();
                if (jA1 != 0) {
                    i5Var.X1(jA1);
                    break;
                }
                break;
            case 18:
                i5Var.onBackPressed();
                break;
            case 19:
                i5Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 20:
                if (i5Var.B1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i5Var.B1().title);
                    sb2.append(" #");
                    strM = i0.a.m(i5Var.B1().num, ',', sb2);
                } else {
                    strM = "";
                }
                ec ecVarM = i5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, strM)), R.raw.gift_upgrade);
                ecVarM.f28020j = 5000;
                ecVarM.f28030t = true;
                ecVarM.j();
                f00 f00Var = i5Var.W;
                if (f00Var != null) {
                    f00Var.c(true);
                }
                break;
            case 21:
                i5Var.d.u0(((i5) i5Var.M0.d).L0.length - 1);
                break;
            case 22:
                i5Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 23:
                e5 e5Var = i5Var.f9451a0;
                lh.d dVar = i5Var.f9461f0;
                p4 p4Var = i5Var.I0.h;
                ImageReceiver imageReceiver = (p4Var == null || (o4Var = p4Var.f9863c) == null) ? null : ((r4) o4Var).d;
                org.telegram.ui.Components.n9 n9Var = e5Var.d[0];
                if (imageReceiver != null && n9Var != null && n9Var.getImageReceiver() != null) {
                    oi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    oi0 lottieAnimation2 = n9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.Q(lottieAnimation.r(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        n9Var.setImageDrawable(lottieAnimation);
                    }
                }
                e5Var.f9174b.setAlpha(1.0f);
                e5Var.f9176c.setAlpha(0.0f);
                if (i5Var.m0 && i5Var.V != null && i5Var.f9486z0 != null && i5Var.G1() >= 0 && i5Var.f9486z0.b(i5Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int iB = i5Var.f9486z0.b(i5Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = i5Var.f9486z0.get(iB);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new z1(i5Var, iB, 0));
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new n1(i5Var, 2));
                }
                break;
            default:
                i5Var.getClass();
                new ag.g2((org.telegram.ui.ActionBar.n2) new ag.r2(i5Var, 3), 12, false).show();
                break;
        }
    }
}
