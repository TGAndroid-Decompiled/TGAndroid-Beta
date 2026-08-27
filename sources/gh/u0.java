package gh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ag;
import org.telegram.ui.hn;

public final class u0 implements ag {

    public final TL_stars.TL_starGiftUnique f7547a;

    public final x0 f7548b;

    public u0(x0 x0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f7548b = x0Var;
        this.f7547a = tL_starGiftUnique;
    }

    @Override
    public final hn P() {
        return null;
    }

    @Override
    public final int P0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final boolean X0(long j10) {
        return false;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        x0 x0Var = this.f7548b;
        org.telegram.ui.Components.j6 j6Var = x0Var.f7621w;
        x0Var.f7614b.a(this.f7547a, UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) x0Var).currentAccount).getClientUserId(), x0Var.f7618n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int iCodePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        x0Var.B = iCodePointCount;
        int i11 = x0Var.A;
        if (i11 <= 0 || (i10 = i11 - iCodePointCount) > 15) {
            j6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ag.r1(this, 5));
            return;
        }
        if (i10 < -9999) {
            i10 = -9999;
        }
        j6Var.c(LocaleController.formatNumber(i10, ','), j6Var.getVisibility() == 0, true);
        if (j6Var.getVisibility() != 0) {
            j6Var.setVisibility(0);
            j6Var.setAlpha(0.0f);
            j6Var.setScaleX(0.5f);
            j6Var.setScaleY(0.5f);
        }
        j6Var.animate().setListener(null).cancel();
        j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i10 < 0) {
            j6Var.setTextColor(x0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
        } else {
            j6Var.setTextColor(x0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
        }
    }

    @Override
    public final boolean b1() {
        return false;
    }

    @Override
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean g1() {
        return false;
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final TLRPC.Peer l() {
        return null;
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final void n1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void N1() {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void l2() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void G(boolean z10) {
    }

    @Override
    public final void N0(int i10) {
    }

    @Override
    public final void S1(int i10) {
    }

    @Override
    public final void W1(boolean z10) {
    }

    @Override
    public final void n(float f10) {
    }

    @Override
    public final void r(boolean z10) {
    }

    @Override
    public final void A(float f10, int i10) {
    }

    @Override
    public final void o0(int i10, int i11) {
    }

    @Override
    public final void l1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
