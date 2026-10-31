package ag;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.cd;
import org.telegram.messenger.gs;
import org.telegram.messenger.h20;
import org.telegram.messenger.ip;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.ux;
public final class q2 implements org.telegram.ui.ActionBar.u1, ux {
    public final int f688a;
    public final KeyEvent.Callback f689b;
    public final Object f690c;
    public final Object d;
    public final Object e;
    public final Object f691f;

    public q2(a2 a2Var, m2 m2Var, int i10, h3 h3Var, TextView textView, q20 q20Var) {
        this.f689b = a2Var;
        this.f690c = m2Var;
        this.f688a = i10;
        this.d = h3Var;
        this.e = textView;
        this.f691f = q20Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        a2 a2Var = (a2) this.f689b;
        m2 m2Var = (m2) this.f690c;
        h3 h3Var = (h3) this.d;
        TextView textView = (TextView) this.e;
        q20 q20Var = (q20) this.f691f;
        String obj = a2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            i3 f7 = i3.f(this.f688a);
            if (h3Var == null) {
                i11 = -1;
            } else {
                i11 = h3Var.f551a;
            }
            h3 d = f7.d(obj);
            if (d != null && d.f551a != i11) {
                org.telegram.messenger.i0.E3(a2Var);
                textView.setText(cd.L0(2131752662, null));
                m2Var.a(Boolean.TRUE);
                return;
            }
            q20Var.a(obj);
            x1Var.dismiss();
            return;
        }
        org.telegram.messenger.i0.E3(a2Var);
        m2Var.a(Boolean.FALSE);
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f689b;
        final TLRPC.User user = (TLRPC.User) this.f690c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final ay ayVar2 = (ay) this.f691f;
        Pattern pattern = LaunchActivity.D1;
        final long j10 = ((gs) arrayList.get(0)).f15760a;
        final TLRPC.Chat L0 = vp.r1(launchActivity.O).L0(Long.valueOf(-j10));
        final int i12 = this.f688a;
        if (L0 != null && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            vp.r1(i12).K(false, L0, user, new ip() {
                @Override
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.D1;
                    org.telegram.messenger.i0.g3(new org.telegram.messenger.fi(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, L0, ayVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String L02 = cd.L0(2131754463, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L02;
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
            x1Var.T = org.telegram.messenger.i0.W2(cd.a0("AddMembersAlertNamesText", null, 2131754399, h20.p(user), str));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            alertDialog$Builder.k(cd.L0(2131754463, null), new org.telegram.ui.ActionBar.u1() {
                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.D1;
                    Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                    long j11 = -j10;
                    g10.putLong("chat_id", j11);
                    un unVar = new un(g10);
                    int i14 = i12;
                    org.telegram.messenger.zs.f(i14).k(org.telegram.messenger.zs.f19690t, new Object[0]);
                    org.telegram.messenger.vp.r1(i14).n(j11, user, str3, unVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).U(unVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public q2(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, ay ayVar) {
        this.f689b = launchActivity;
        this.f688a = i10;
        this.f690c = user;
        this.d = str;
        this.e = str2;
        this.f691f = ayVar;
    }
}
