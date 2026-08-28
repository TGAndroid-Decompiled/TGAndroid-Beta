package fh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eg;
import org.telegram.ui.gn;
public final class w0 implements eg {
    public final TL_stars.TL_starGiftUnique f6829a;
    public final z0 f6830b;

    public w0(z0 z0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f6830b = z0Var;
        this.f6829a = tL_starGiftUnique;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers A() {
        return null;
    }

    @Override
    public final int N0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public final gn T() {
        return null;
    }

    @Override
    public final boolean T0(long j10) {
        return false;
    }

    @Override
    public final boolean X0() {
        return false;
    }

    public final void a(CharSequence charSequence) {
        int i9;
        int i10;
        boolean z10;
        z0 z0Var = this.f6830b;
        org.telegram.ui.Components.j6 j6Var = z0Var.f6904w;
        v6 v6Var = z0Var.f6897b;
        i9 = ((org.telegram.ui.ActionBar.f3) z0Var).currentAccount;
        v6Var.a(this.f6829a, UserConfig.getInstance(i9).getClientUserId(), z0Var.f6901n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        z0Var.B = codePointCount;
        int i11 = z0Var.A;
        if (i11 > 0 && (i10 = i11 - codePointCount) <= 15) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i10, ',');
            if (j6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var.c(formatNumber, z10, true);
            if (j6Var.getVisibility() != 0) {
                j6Var.setVisibility(0);
                j6Var.setAlpha(0.0f);
                j6Var.setScaleX(0.5f);
                j6Var.setScaleY(0.5f);
            }
            j6Var.animate().setListener(null).cancel();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                j6Var.setTextColor(z0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
                return;
            } else {
                j6Var.setTextColor(z0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23369y6));
                return;
            }
        }
        j6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ag.e(this, 3));
    }

    @Override
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean f1() {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final void m1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final void G() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void Q1() {
    }

    @Override
    public final void X1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void c2() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void h0() {
    }

    @Override
    public final void h1() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void H(boolean z10) {
    }

    @Override
    public final void K1(int i9) {
    }

    @Override
    public final void L0(int i9) {
    }

    @Override
    public final void T1(boolean z10) {
    }

    @Override
    public final void o(float f10) {
    }

    @Override
    public final void p(boolean z10) {
    }

    @Override
    public final void B(float f10, int i9) {
    }

    @Override
    public final void p0(int i9, int i10) {
    }

    @Override
    public final void k1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
    }

    @Override
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
