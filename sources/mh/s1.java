package mh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.s00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.py;
public final class s1 implements Runnable {
    public final int f14728a;
    public final g5 f14729b;

    public s1(g5 g5Var, int i10) {
        this.f14728a = i10;
        this.f14729b = g5Var;
    }

    @Override
    public final void run() {
        String str;
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        m4 m4Var;
        int i10 = this.f14728a;
        g5 g5Var = this.f14729b;
        switch (i10) {
            case 0:
                g5.p0(g5Var);
                return;
            case 1:
                new e0(g5Var.getContext()).show();
                return;
            case 2:
                g5Var.dismiss();
                return;
            case 3:
                g5.W(g5Var);
                return;
            case 4:
                g5.Y(g5Var);
                return;
            case 5:
                g5Var.f14097g0.setLoading(false);
                g5Var.q2(0, true, null);
                return;
            case 6:
                new e0(g5Var.getContext()).show();
                return;
            case 7:
                g5.v0(g5Var);
                return;
            case 8:
                g5.b0(g5Var);
                return;
            case 9:
                g5Var.onBackPressed();
                return;
            case 10:
                g5.g1(g5Var);
                return;
            case 11:
                g5Var.W1(true);
                return;
            case 12:
                g5Var.U1();
                return;
            case 13:
                g5Var.S1();
                return;
            case 14:
                g5.n0(g5Var);
                return;
            case 15:
                g5Var.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = g5Var.K1();
                if (U != null && K1 != null) {
                    py pyVar = new py(org.telegram.messenger.y3.e(4, "onlySelect", "dialogsType", true));
                    pyVar.f40278z2 = new androidx.car.app.utils.a(g5Var, K1, pyVar, 8);
                    U.presentFragment(pyVar);
                    return;
                }
                return;
            case 16:
                g5Var.Y1();
                return;
            case 17:
                long A1 = g5Var.A1();
                if (A1 != 0) {
                    g5Var.X1(A1);
                    return;
                }
                return;
            case 18:
                g5Var.onBackPressed();
                return;
            case 19:
                g5Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 20:
                if (g5Var.B1() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(g5Var.B1().title);
                    sb.append(" #");
                    str = l.d.l(g5Var.B1().num, ',', sb);
                } else {
                    str = "";
                }
                ic M = g5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f27778j = 5000;
                M.f27788t = true;
                M.j();
                s00 s00Var = g5Var.X;
                if (s00Var != null) {
                    s00Var.c(true);
                    return;
                }
                return;
            case 21:
                g5Var.d.u0(((g5) g5Var.N0.d).M0.length - 1);
                return;
            case 22:
                g5Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 23:
                c5 c5Var = g5Var.f14087b0;
                qh.d dVar = g5Var.f14097g0;
                n4 n4Var = g5Var.J0.h;
                if (n4Var != null && (m4Var = n4Var.f14477c) != null) {
                    imageReceiver = ((p4) m4Var).d;
                } else {
                    imageReceiver = null;
                }
                org.telegram.ui.Components.p9 p9Var = c5Var.d[0];
                if (imageReceiver != null && p9Var != null && p9Var.getImageReceiver() != null) {
                    hj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    hj0 lottieAnimation2 = p9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.Q(lottieAnimation.r(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        p9Var.setImageDrawable(lottieAnimation);
                    }
                }
                c5Var.f13799b.setAlpha(1.0f);
                c5Var.f13801c.setAlpha(0.0f);
                if (g5Var.f14109n0 && g5Var.W != null && g5Var.A0 != null && g5Var.G1() >= 0 && g5Var.A0.b(g5Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = g5Var.A0.b(g5Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = g5Var.A0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new w1(g5Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), true, true);
                dVar.f(null, true);
                dVar.setOnClickListener(new k1(g5Var, 2));
                return;
            default:
                g5Var.getClass();
                new fg.n1((org.telegram.ui.ActionBar.p2) new fg.x1(g5Var, 3), 12, false).show();
                return;
        }
    }
}
