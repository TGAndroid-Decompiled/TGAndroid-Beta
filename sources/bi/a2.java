package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
public final class a2 implements Runnable {
    public final int f4251a;
    public final h7 f4252b;

    public a2(h7 h7Var, int i10) {
        this.f4251a = i10;
        this.f4252b = h7Var;
    }

    @Override
    public final void run() {
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        j6 j6Var;
        String str;
        int i10 = this.f4251a;
        h7 h7Var = this.f4252b;
        switch (i10) {
            case 0:
                h7Var.getBulletinFactory().R(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 1:
                h7Var.getBulletinFactory().R(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 2:
                h7Var.getClass();
                new tg.y0((org.telegram.ui.ActionBar.r2) new v4(h7Var, 0), 12, false).show();
                return;
            case 3:
                h7.t0(h7Var);
                return;
            case 4:
                h7Var.dismiss();
                return;
            case 5:
                new q0(h7Var.getContext()).show();
                return;
            case 6:
                h7.Y(h7Var);
                return;
            case 7:
                h7.Z(h7Var);
                return;
            case 8:
                h7.g1(h7Var);
                return;
            case 9:
                h7Var.f4747k0.setLoading(false);
                h7Var.U2(0, true, null);
                return;
            case 10:
                new q0(h7Var.getContext()).show();
                return;
            case 11:
                h7.B0(h7Var);
                return;
            case 12:
                h7Var.onBackPressed();
                return;
            case 13:
                h7.U(h7Var);
                return;
            case 14:
                long U1 = h7Var.U1();
                if (U1 != 0) {
                    h7Var.u2(U1);
                    return;
                }
                return;
            case 15:
                h7.c0(h7Var);
                return;
            case 16:
                h7Var.t2(true);
                return;
            case 17:
                h7Var.p2();
                return;
            case 18:
                h7Var.m2();
                return;
            case 19:
                h7.q0(h7Var);
                return;
            case 20:
                h7Var.dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique e22 = h7Var.e2();
                if (U != null && e22 != null) {
                    cy cyVar = new cy(vh.c(4, "onlySelect", "dialogsType", true));
                    cyVar.C2 = new androidx.car.app.utils.a(h7Var, e22, cyVar, 2);
                    U.presentFragment(cyVar);
                    return;
                }
                return;
            case 21:
                h7Var.w2();
                return;
            case 22:
                h7Var.B2();
                return;
            case 23:
                h7Var.onBackPressed();
                return;
            case 24:
                b7 b7Var = h7Var.f4737f0;
                fi.d dVar = h7Var.f4747k0;
                k6 k6Var = h7Var.P0.h;
                if (k6Var != null && (j6Var = k6Var.f4957c) != null) {
                    imageReceiver = ((m6) j6Var).d;
                } else {
                    imageReceiver = null;
                }
                org.telegram.ui.Components.y9 y9Var = b7Var.d[0];
                if (imageReceiver != null && y9Var != null && y9Var.getImageReceiver() != null) {
                    xj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    xj0 lottieAnimation2 = y9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        y9Var.setImageDrawable(lottieAnimation);
                    }
                }
                b7Var.f4345b.setAlpha(1.0f);
                b7Var.f4347c.setAlpha(0.0f);
                if (h7Var.f4759r0 && h7Var.Z != null && h7Var.G0 != null && h7Var.a2() >= 0 && h7Var.G0.c(h7Var.a2()) >= 0) {
                    dVar.setFilled(false);
                    int c10 = h7Var.G0.c(h7Var.a2());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = h7Var.G0.get(c10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.c6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.i(spannableStringBuilder, true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new w2(h7Var, c10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.i(LocaleController.getString(R.string.OK), true, true);
                dVar.g(null, true);
                dVar.setOnClickListener(new z1(h7Var, 7));
                return;
            case 25:
                if (h7Var.V1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(h7Var.V1().title);
                    sb2.append(" #");
                    str = org.telegram.messenger.t.i(h7Var.V1().num, ',', sb2);
                } else {
                    str = "";
                }
                org.telegram.ui.Components.qc M = h7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f31887j = 5000;
                M.f31898u = true;
                M.j();
                z00 z00Var = h7Var.f4727a0;
                if (z00Var != null) {
                    z00Var.c(true);
                    return;
                }
                return;
            default:
                h7Var.d.v0(((h7) h7Var.T0.d).S0.length - 1);
                return;
        }
    }
}
