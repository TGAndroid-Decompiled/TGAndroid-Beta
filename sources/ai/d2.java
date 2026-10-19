package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
public final class d2 implements Runnable {
    public final int f1126a;
    public final k7 f1127b;

    public d2(k7 k7Var, int i10) {
        this.f1126a = i10;
        this.f1127b = k7Var;
    }

    @Override
    public final void run() {
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        n6 n6Var;
        String str;
        int i10 = this.f1126a;
        k7 k7Var = this.f1127b;
        switch (i10) {
            case 0:
                k7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 1:
                k7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 2:
                k7Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.n2) new z4(k7Var, 0), 12, false).show();
                return;
            case 3:
                k7.t0(k7Var);
                return;
            case 4:
                k7Var.dismiss();
                return;
            case 5:
                new o0(k7Var.getContext()).show();
                return;
            case 6:
                k7.Z(k7Var);
                return;
            case 7:
                k7.b0(k7Var);
                return;
            case 8:
                k7Var.f1667k0.setLoading(false);
                k7Var.V2(0, true, null);
                return;
            case 9:
                new o0(k7Var.getContext()).show();
                return;
            case 10:
                k7.f1(k7Var);
                return;
            case 11:
                k7.x0(k7Var);
                return;
            case 12:
                k7Var.onBackPressed();
                return;
            case 13:
                k7.V(k7Var);
                return;
            case 14:
                long V1 = k7Var.V1();
                if (V1 != 0) {
                    k7Var.v2(V1);
                    return;
                }
                return;
            case 15:
                k7.e0(k7Var);
                return;
            case 16:
                k7Var.u2(true);
                return;
            case 17:
                k7Var.q2();
                return;
            case 18:
                k7Var.n2();
                return;
            case 19:
                k7.q0(k7Var);
                return;
            case 20:
                k7Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique f22 = k7Var.f2();
                if (U != null && f22 != null) {
                    cy cyVar = new cy(lk.d(4, "onlySelect", "dialogsType", true));
                    cyVar.C2 = new v2(k7Var, f22, cyVar, 0);
                    U.presentFragment(cyVar);
                    return;
                }
                return;
            case 21:
                k7Var.x2();
                return;
            case 22:
                k7Var.C2();
                return;
            case 23:
                k7Var.onBackPressed();
                return;
            case 24:
                e7 e7Var = k7Var.f1657f0;
                ei.d dVar = k7Var.f1667k0;
                o6 o6Var = k7Var.P0.h;
                if (o6Var != null && (n6Var = o6Var.f1940c) != null) {
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
                if (k7Var.f1679r0 && k7Var.Z != null && k7Var.G0 != null && k7Var.b2() >= 0 && k7Var.G0.b(k7Var.b2()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = k7Var.G0.b(k7Var.b2());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = k7Var.G0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c3(k7Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), true, true);
                dVar.f(null, true);
                dVar.setOnClickListener(new c2(k7Var, 6));
                return;
            case 25:
                if (k7Var.W1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(k7Var.W1().title);
                    sb2.append(" #");
                    str = org.telegram.messenger.g0.h(k7Var.W1().num, ',', sb2);
                } else {
                    str = "";
                }
                org.telegram.ui.Components.qc M = k7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f29596j = 5000;
                M.f29606t = true;
                M.j();
                z00 z00Var = k7Var.f1647a0;
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
