package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PopupNotificationActivity;
public final class mf8 implements hy1 {
    public final PopupNotificationActivity a;

    public mf8(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override
    public final bu1 G() {
        return null;
    }

    @Override
    public final boolean H0() {
        return false;
    }

    @Override
    public final boolean Q0() {
        return false;
    }

    @Override
    public final boolean R() {
        return true;
    }

    @Override
    public final void W0() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        k27 k27Var = popupNotificationActivity.R;
        if (k27Var != null) {
            na7.q1(k27Var.K1).G4(0, popupNotificationActivity.L, k27.B0(popupNotificationActivity.R.k), 0L, null);
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final TLRPC.Peer i() {
        return null;
    }

    @Override
    public final int o0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem t0() {
        return null;
    }

    @Override
    public final void u(CharSequence charSequence, boolean z, int i, int i2, long j) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        ArrayList arrayList = popupNotificationActivity.b0;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i3 = popupNotificationActivity.T;
        if (i3 >= 0 && i3 < arrayList.size()) {
            arrayList.remove(popupNotificationActivity.T);
        }
        na7.q1(popupNotificationActivity.R.K1).k3(k27.B0(popupNotificationActivity.R.k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers v() {
        return null;
    }

    @Override
    public final boolean x0(long j) {
        return false;
    }

    @Override
    public final boolean y0() {
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void R0() {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void Z() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f0() {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void A(boolean z) {
    }

    @Override
    public final void P0(CharSequence charSequence) {
    }

    @Override
    public final void f1(int i) {
    }

    @Override
    public final void j1(boolean z) {
    }

    @Override
    public final void k(float f) {
    }

    @Override
    public final void m(boolean z) {
    }

    @Override
    public final void n0(int i) {
    }

    @Override
    public final void w(float f, int i) {
    }

    @Override
    public final void C0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override
    public final void O0(View view, CharSequence charSequence, boolean z) {
    }

    @Override
    public final void k1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
