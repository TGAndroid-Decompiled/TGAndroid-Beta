package ih;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.o6;
import org.telegram.ui.jn;
public final class s0 implements hg {
    public final TL_stars.TL_starGiftUnique f9368a;
    public final v0 f9369b;

    public s0(v0 v0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f9369b = v0Var;
        this.f9368a = tL_starGiftUnique;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        boolean z10;
        v0 v0Var = this.f9369b;
        o6 o6Var = v0Var.f9431w;
        f6 f6Var = v0Var.f9424b;
        i10 = ((org.telegram.ui.ActionBar.f3) v0Var).currentAccount;
        f6Var.a(this.f9368a, UserConfig.getInstance(i10).getClientUserId(), v0Var.f9428n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        v0Var.B = codePointCount;
        int i12 = v0Var.A;
        if (i12 > 0 && (i11 = i12 - codePointCount) <= 15) {
            if (i11 < -9999) {
                i11 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i11, ',');
            if (o6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o6Var.c(formatNumber, z10, true);
            if (o6Var.getVisibility() != 0) {
                o6Var.setVisibility(0);
                o6Var.setAlpha(0.0f);
                o6Var.setScaleX(0.5f);
                o6Var.setScaleY(0.5f);
            }
            o6Var.animate().setListener(null).cancel();
            o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i11 < 0) {
                o6Var.setTextColor(v0Var.getThemedColor(g6.f23279p7));
                return;
            } else {
                o6Var.setTextColor(v0Var.getThemedColor(g6.f23433y6));
                return;
            }
        }
        o6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ag.m0(this, 8));
    }

    @Override
    public final int b1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final boolean f1(long j10) {
        return false;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final jn o0() {
        return null;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final TLRPC.Peer q() {
        return null;
    }

    @Override
    public final void v1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void k0() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void U(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void k2(boolean z10) {
    }

    @Override
    public final void v(float f9) {
    }

    @Override
    public final void x(boolean z10) {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void I(float f9, int i10) {
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
