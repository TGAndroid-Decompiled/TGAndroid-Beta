package lg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.pr;
import org.telegram.messenger.u10;
import org.telegram.messenger.uo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;
public final class k1 implements org.telegram.ui.ActionBar.p1, nw {
    public final int f18348a;
    public final KeyEvent.Callback f18349b;
    public final Object f18350c;
    public final Object d;
    public final Object f18351e;
    public final Object f18352f;

    public k1(y0 y0Var, ai.v1 v1Var, int i3, t1 t1Var, TextView textView, u10 u10Var) {
        this.f18349b = y0Var;
        this.f18350c = v1Var;
        this.f18348a = i3;
        this.d = t1Var;
        this.f18351e = textView;
        this.f18352f = u10Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(uw uwVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        y0 y0Var = (y0) this.f18349b;
        ai.v1 v1Var = (ai.v1) this.f18350c;
        t1 t1Var = (t1) this.d;
        TextView textView = (TextView) this.f18351e;
        u10 u10Var = (u10) this.f18352f;
        String obj = y0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            u1 f10 = u1.f(this.f18348a);
            if (t1Var == null) {
                i10 = -1;
            } else {
                i10 = t1Var.f18473a;
            }
            t1 d = f10.d(obj);
            if (d != null && d.f18473a != i10) {
                org.telegram.messenger.g0.F3(y0Var);
                textView.setText(bd.M0(2131752662, null));
                v1Var.a(Boolean.TRUE);
                return;
            }
            u10Var.a(obj);
            s1Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.F3(y0Var);
        v1Var.a(Boolean.FALSE);
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f18349b;
        final TLRPC.User user = (TLRPC.User) this.f18350c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f18351e;
        final uw uwVar2 = (uw) this.f18352f;
        String str4 = LaunchActivity.E1;
        final long j10 = ((pr) arrayList.get(0)).f24797a;
        final TLRPC.Chat M0 = hp.s1(launchActivity.P).M0(Long.valueOf(-j10));
        final int i11 = this.f18348a;
        if (M0 != null && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            hp.s1(i11).K(M0, user, new uo() {
                @Override
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str5) {
                    String str6 = LaunchActivity.E1;
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.xh(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i11, M0, uwVar2, user, j10, str5));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M02 = bd.M0(2131754463, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M02;
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            s1Var.U = org.telegram.messenger.g0.X2(bd.a0("AddMembersAlertNamesText", null, 2131754399, l10.p(user), str));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            alertDialog$Builder.k(bd.M0(2131754463, null), new org.telegram.ui.ActionBar.p1() {
                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
                    String str5 = LaunchActivity.E1;
                    Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                    long j11 = -j10;
                    k10.putLong("chat_id", j11);
                    wm wmVar = new wm(k10);
                    int i13 = i11;
                    org.telegram.messenger.hs.f(i13).k(org.telegram.messenger.hs.f23305t, new Object[0]);
                    org.telegram.messenger.hp.s1(i13).n(j11, user, str3, wmVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(wmVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public k1(LaunchActivity launchActivity, int i3, TLRPC.User user, String str, String str2, uw uwVar) {
        this.f18349b = launchActivity;
        this.f18348a = i3;
        this.f18350c = user;
        this.d = str;
        this.f18351e = str2;
        this.f18352f = uwVar;
    }
}
