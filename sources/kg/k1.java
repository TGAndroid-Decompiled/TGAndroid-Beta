package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ap;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
public final class k1 implements org.telegram.ui.ActionBar.q1, sw {
    public final int f17980a;
    public final KeyEvent.Callback f17981b;
    public final Object f17982c;
    public final Object d;
    public final Object f17983e;
    public final Object f17984f;

    public k1(x0 x0Var, bi.o1 o1Var, int i7, u1 u1Var, TextView textView, z10 z10Var) {
        this.f17981b = x0Var;
        this.f17982c = o1Var;
        this.f17980a = i7;
        this.d = u1Var;
        this.f17983e = textView;
        this.f17984f = z10Var;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        x0 x0Var = (x0) this.f17981b;
        bi.o1 o1Var = (bi.o1) this.f17982c;
        u1 u1Var = (u1) this.d;
        TextView textView = (TextView) this.f17983e;
        z10 z10Var = (z10) this.f17984f;
        String obj = x0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            v1 f10 = v1.f(this.f17980a);
            if (u1Var == null) {
                i10 = -1;
            } else {
                i10 = u1Var.f18113a;
            }
            u1 d = f10.d(obj);
            if (d != null && d.f18113a != i10) {
                org.telegram.messenger.g0.E3(x0Var);
                textView.setText(hd.M0(2131752662, null));
                o1Var.a(Boolean.TRUE);
                return;
            }
            z10Var.a(obj);
            t1Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.E3(x0Var);
        o1Var.a(Boolean.FALSE);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f17981b;
        final TLRPC.User user = (TLRPC.User) this.f17982c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f17983e;
        final yw ywVar2 = (yw) this.f17984f;
        String str4 = LaunchActivity.C1;
        final long j3 = ((ur) arrayList.get(0)).f26860a;
        final TLRPC.Chat M0 = np.s1(launchActivity.P).M0(Long.valueOf(-j3));
        final int i11 = this.f17980a;
        if (M0 != null && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            np.s1(i11).K(M0, user, new ap() {
                @Override
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str5) {
                    String str6 = LaunchActivity.C1;
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.ei(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i11, M0, ywVar2, user, j3, str5));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M02 = hd.M0(2131754463, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M02;
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            t1Var.U = org.telegram.messenger.g0.X2(hd.a0("AddMembersAlertNamesText", null, 2131754399, q10.p(user), str));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            alertDialog$Builder.k(hd.M0(2131754463, null), new org.telegram.ui.ActionBar.q1() {
                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                    String str5 = LaunchActivity.C1;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    long j10 = -j3;
                    k10.putLong("chat_id", j10);
                    an anVar = new an(k10);
                    int i13 = i11;
                    org.telegram.messenger.ns.f(i13).k(org.telegram.messenger.ns.f25572t, new Object[0]);
                    org.telegram.messenger.np.s1(i13).n(j10, user, str3, anVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(anVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public k1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, yw ywVar) {
        this.f17981b = launchActivity;
        this.f17980a = i7;
        this.f17982c = user;
        this.d = str;
        this.f17983e = str2;
        this.f17984f = ywVar;
    }
}
