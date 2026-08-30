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
import org.telegram.ui.nn;
public final class r0 implements eg {
    public final TL_stars.TL_starGiftUnique f10774a;
    public final u0 f10775b;

    public r0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f10775b = u0Var;
        this.f10774a = tL_starGiftUnique;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override
    public final boolean G0() {
        return true;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        boolean z4;
        u0 u0Var = this.f10775b;
        k6 k6Var = u0Var.f10842w;
        f6 f6Var = u0Var.f10836b;
        i10 = ((org.telegram.ui.ActionBar.g3) u0Var).currentAccount;
        f6Var.a(this.f10774a, UserConfig.getInstance(i10).getClientUserId(), u0Var.f10839n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
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
                k6Var.setTextColor(u0Var.getThemedColor(j6.f20122p7));
                return;
            } else {
                k6Var.setTextColor(u0Var.getThemedColor(j6.f20281y6));
                return;
            }
        }
        k6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new cg.l0(this, 8));
    }

    @Override
    public final int c1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem e1() {
        return null;
    }

    @Override
    public final boolean g1(long j10) {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
        a(charSequence);
    }

    @Override
    public final TLRPC.Peer p() {
        return null;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final nn r0() {
        return null;
    }

    @Override
    public final void y1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void C() {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void E2() {
    }

    @Override
    public final void H1() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void N0() {
    }

    @Override
    public final void V0() {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void b0(boolean z4) {
    }

    @Override
    public final void b1(int i10) {
    }

    @Override
    public final void j2(int i10) {
    }

    @Override
    public final void n2(boolean z4) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void z(boolean z4) {
    }

    @Override
    public final void H(float f10, int i10) {
    }

    @Override
    public final void I0(int i10, int i11) {
    }

    @Override
    public final void v1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
