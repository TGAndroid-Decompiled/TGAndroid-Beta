package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PopupNotificationActivity;
public final class aj8 implements xy1 {
    public final PopupNotificationActivity a;

    public aj8(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override
    public final int E0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem F0() {
        return null;
    }

    @Override
    public final boolean H0(long j) {
        return false;
    }

    @Override
    public final boolean L0() {
        return false;
    }

    @Override
    public final ou1 R() {
        return null;
    }

    @Override
    public final boolean T0() {
        return false;
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final boolean e1() {
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
    public final void p1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        r47 r47Var = popupNotificationActivity.R;
        if (r47Var != null) {
            uc7.s1(r47Var.K1).P4(0, popupNotificationActivity.L, r47.B0(popupNotificationActivity.R.k), 0L, null);
        }
    }

    @Override
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        ArrayList arrayList = popupNotificationActivity.b0;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i3 = popupNotificationActivity.T;
        if (i3 >= 0 && i3 < arrayList.size()) {
            arrayList.remove(popupNotificationActivity.T);
        }
        uc7.s1(popupNotificationActivity.R.K1).r3(r47.B0(popupNotificationActivity.R.k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override
    public final void B1() {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D1() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void P1() {
    }

    @Override
    public final void S0() {
    }

    @Override
    public final void S1() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void X0() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f0() {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void i0() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void C1(int i) {
    }

    @Override
    public final void D(boolean z) {
    }

    @Override
    public final void E1(boolean z) {
    }

    @Override
    public final void d1(CharSequence charSequence) {
    }

    @Override
    public final void o(float f) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void z0(int i) {
    }

    @Override
    public final void B(float f, int i) {
    }

    @Override
    public final void R0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override
    public final void b1(View view, CharSequence charSequence, boolean z) {
    }

    @Override
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
