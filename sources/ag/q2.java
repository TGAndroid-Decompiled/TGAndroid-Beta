package ag;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.dd;
import org.telegram.messenger.hs;
import org.telegram.messenger.i20;
import org.telegram.messenger.jp;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nb1;
import org.telegram.ui.tx;
import org.telegram.ui.zx;
public final class q2 implements org.telegram.ui.ActionBar.u1, tx {
    public final int f688a;
    public final KeyEvent.Callback f689b;
    public final Object f690c;
    public final Object d;
    public final Object e;
    public final Object f691f;

    public q2(a2 a2Var, m2 m2Var, int i10, h3 h3Var, TextView textView, r20 r20Var) {
        this.f689b = a2Var;
        this.f690c = m2Var;
        this.f688a = i10;
        this.d = h3Var;
        this.e = textView;
        this.f691f = r20Var;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        a2 a2Var = (a2) this.f689b;
        m2 m2Var = (m2) this.f690c;
        h3 h3Var = (h3) this.d;
        TextView textView = (TextView) this.e;
        r20 r20Var = (r20) this.f691f;
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
                textView.setText(dd.L0(2131752662, null));
                m2Var.a(Boolean.TRUE);
                return;
            }
            r20Var.a(obj);
            x1Var.dismiss();
            return;
        }
        org.telegram.messenger.i0.E3(a2Var);
        m2Var.a(Boolean.FALSE);
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f689b;
        final TLRPC.User user = (TLRPC.User) this.f690c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final zx zxVar2 = (zx) this.f691f;
        Pattern pattern = LaunchActivity.D1;
        final long j10 = ((hs) arrayList.get(0)).f16109a;
        final TLRPC.Chat L0 = wp.r1(launchActivity.O).L0(Long.valueOf(-j10));
        final int i12 = this.f688a;
        if (L0 != null && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            wp.r1(i12).K(false, L0, user, new jp() {
                @Override
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.D1;
                    org.telegram.messenger.i0.g3(new org.telegram.messenger.gi(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, L0, zxVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String L02 = dd.L0(2131754463, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L02;
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
            x1Var.T = org.telegram.messenger.i0.W2(dd.a0("AddMembersAlertNamesText", null, 2131754399, i20.p(user), str));
            alertDialog$Builder.h(dd.L0(2131752589, null), null);
            alertDialog$Builder.k(dd.L0(2131754463, null), new org.telegram.ui.ActionBar.u1() {
                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.D1;
                    Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                    long j11 = -j10;
                    g10.putLong("chat_id", j11);
                    un unVar = new un(g10);
                    int i14 = i12;
                    org.telegram.messenger.at.f(i14).k(org.telegram.messenger.at.f14786t, new Object[0]);
                    org.telegram.messenger.wp.r1(i14).n(j11, user, str3, unVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).U(unVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public q2(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, zx zxVar) {
        this.f689b = launchActivity;
        this.f688a = i10;
        this.f690c = user;
        this.d = str;
        this.e = str2;
        this.f691f = zxVar;
    }
}
