package jh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy;
public final class t1 implements Runnable {
    public final int f12829a;
    public final h5 f12830b;

    public t1(h5 h5Var, int i10) {
        this.f12829a = i10;
        this.f12830b = h5Var;
    }

    @Override
    public final void run() {
        String str;
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        n4 n4Var;
        int i10 = this.f12829a;
        h5 h5Var = this.f12830b;
        switch (i10) {
            case 0:
                h5.p0(h5Var);
                return;
            case 1:
                new f0(h5Var.getContext()).show();
                return;
            case 2:
                h5Var.dismiss();
                return;
            case 3:
                h5.W(h5Var);
                return;
            case 4:
                h5.Y(h5Var);
                return;
            case 5:
                h5Var.f12173f0.setLoading(false);
                h5Var.q2(0, true, null);
                return;
            case 6:
                new f0(h5Var.getContext()).show();
                return;
            case 7:
                h5.v0(h5Var);
                return;
            case 8:
                h5.b0(h5Var);
                return;
            case 9:
                h5Var.onBackPressed();
                return;
            case 10:
                h5.g1(h5Var);
                return;
            case 11:
                h5Var.W1(true);
                return;
            case 12:
                h5Var.U1();
                return;
            case 13:
                h5Var.S1();
                return;
            case 14:
                h5.n0(h5Var);
                return;
            case 15:
                h5Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = h5Var.K1();
                if (U != null && K1 != null) {
                    fy fyVar = new fy(org.telegram.messenger.x3.e(4, "onlySelect", "dialogsType", true));
                    fyVar.f38379y2 = new androidx.car.app.utils.a(h5Var, K1, fyVar, 8);
                    U.presentFragment(fyVar);
                    return;
                }
                return;
            case 16:
                h5Var.Y1();
                return;
            case 17:
                long A1 = h5Var.A1();
                if (A1 != 0) {
                    h5Var.X1(A1);
                    return;
                }
                return;
            case 18:
                h5Var.onBackPressed();
                return;
            case 19:
                h5Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 20:
                if (h5Var.B1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(h5Var.B1().title);
                    sb2.append(" #");
                    str = j7.l1.m(h5Var.B1().num, ',', sb2);
                } else {
                    str = "";
                }
                mc M = h5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f30652j = 5000;
                M.f30662t = true;
                M.j();
                n00 n00Var = h5Var.W;
                if (n00Var != null) {
                    n00Var.c(true);
                    return;
                }
                return;
            case 21:
                h5Var.d.u0(((h5) h5Var.M0.d).L0.length - 1);
                return;
            case 22:
                h5Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 23:
                d5 d5Var = h5Var.f12163a0;
                nh.d dVar = h5Var.f12173f0;
                o4 o4Var = h5Var.I0.h;
                if (o4Var != null && (n4Var = o4Var.f12544c) != null) {
                    imageReceiver = ((q4) n4Var).d;
                } else {
                    imageReceiver = null;
                }
                org.telegram.ui.Components.t9 t9Var = d5Var.d[0];
                if (imageReceiver != null && t9Var != null && t9Var.getImageReceiver() != null) {
                    xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    xi0 lottieAnimation2 = t9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.Q(lottieAnimation.r(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        t9Var.setImageDrawable(lottieAnimation);
                    }
                }
                d5Var.f11907b.setAlpha(1.0f);
                d5Var.f11909c.setAlpha(0.0f);
                if (h5Var.m0 && h5Var.V != null && h5Var.f12198z0 != null && h5Var.G1() >= 0 && h5Var.f12198z0.b(h5Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = h5Var.f12198z0.b(h5Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = h5Var.f12198z0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new x1(h5Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), true, true);
                dVar.f(null, true);
                dVar.setOnClickListener(new l1(h5Var, 2));
                return;
            default:
                h5Var.getClass();
                new cg.p1((org.telegram.ui.ActionBar.o2) new cg.z1(h5Var, 3), 12, false).show();
                return;
        }
    }
}
