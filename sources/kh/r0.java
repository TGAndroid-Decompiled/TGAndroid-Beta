package kh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.k6;
import org.telegram.ui.pn;
public final class r0 implements eg {
    public final TL_stars.TL_starGiftUnique f10888a;
    public final u0 f10889b;

    public r0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f10889b = u0Var;
        this.f10888a = tL_starGiftUnique;
    }

    @Override
    public final void A1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
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
        u0 u0Var = this.f10889b;
        k6 k6Var = u0Var.f10949w;
        e6 e6Var = u0Var.f10943b;
        i10 = ((org.telegram.ui.ActionBar.g3) u0Var).currentAccount;
        e6Var.a(this.f10888a, UserConfig.getInstance(i10).getClientUserId(), u0Var.f10946n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
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
                k6Var.setTextColor(u0Var.getThemedColor(j6.f20097p7));
                return;
            } else {
                k6Var.setTextColor(u0Var.getThemedColor(j6.f20256y6));
                return;
            }
        }
        k6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new cg.l0(this, 8));
    }

    @Override
    public final int g1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem i1() {
        return null;
    }

    @Override
    public final boolean k1(long j10) {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final void q1(CharSequence charSequence, boolean z4, boolean z10) {
        a(charSequence);
    }

    @Override
    public final TLRPC.Peer r() {
        return null;
    }

    @Override
    public final boolean t1() {
        return false;
    }

    @Override
    public final pn u0() {
        return null;
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void E1() {
    }

    @Override
    public final void E2() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void v1() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void B(boolean z4) {
    }

    @Override
    public final void Y(boolean z4) {
    }

    @Override
    public final void f1(int i10) {
    }

    @Override
    public final void k2(int i10) {
    }

    @Override
    public final void o2(boolean z4) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void K(float f10, int i10) {
    }

    @Override
    public final void y1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override
    public final void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
