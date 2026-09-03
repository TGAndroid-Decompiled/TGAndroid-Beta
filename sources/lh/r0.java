package lh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.k6;
import org.telegram.ui.nn;
public final class r0 implements eg {
    public final TL_stars.TL_starGiftUnique f12919a;
    public final u0 f12920b;

    public r0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f12920b = u0Var;
        this.f12919a = tL_starGiftUnique;
    }

    @Override
    public final void C1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override
    public final boolean H0() {
        return true;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        boolean z4;
        u0 u0Var = this.f12920b;
        k6 k6Var = u0Var.f12991w;
        f6 f6Var = u0Var.f12984b;
        i10 = ((org.telegram.ui.ActionBar.h3) u0Var).currentAccount;
        f6Var.a(this.f12919a, UserConfig.getInstance(i10).getClientUserId(), u0Var.f12988n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        u0Var.C = codePointCount;
        int i12 = u0Var.B;
        if (i12 > 0 && (i11 = i12 - codePointCount) <= 15) {
            if (i11 < -9999) {
                i11 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i11, ',');
            if (k6Var.getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            k6Var.c(formatNumber, z4, true);
            if (k6Var.getVisibility() != 0) {
                k6Var.setVisibility(0);
                k6Var.setAlpha(0.0f);
                k6Var.setScaleX(0.5f);
                k6Var.setScaleY(0.5f);
            }
            k6Var.animate().setListener(null).cancel();
            k6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i11 < 0) {
                k6Var.setTextColor(u0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21878p7));
                return;
            } else {
                k6Var.setTextColor(u0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f22038y6));
                return;
            }
        }
        k6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new dg.l0(this, 8));
    }

    @Override
    public final int f1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem h1() {
        return null;
    }

    @Override
    public final boolean j1(long j10) {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final TLRPC.Peer p() {
        return null;
    }

    @Override
    public final nn r0() {
        return null;
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z4, boolean z10) {
        a(charSequence);
    }

    @Override
    public final boolean u1() {
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void F2() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void J2() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void M1() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void s2() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void A(boolean z4) {
    }

    @Override
    public final void Y(boolean z4) {
    }

    @Override
    public final void e1(int i10) {
    }

    @Override
    public final void p2(int i10) {
    }

    @Override
    public final void t2(boolean z4) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void G(float f10, int i10) {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override
    public final void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
