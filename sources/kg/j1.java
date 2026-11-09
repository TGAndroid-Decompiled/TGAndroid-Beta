package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import di.s2;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.dp;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sw;
import org.telegram.ui.y91;
import org.telegram.ui.yw;
public final class j1 implements org.telegram.ui.ActionBar.r1, sw {
    public final int f17412a;
    public final KeyEvent.Callback f17413b;
    public final Object f17414c;
    public final Object d;
    public final Object f17415e;
    public final Object f17416f;

    public j1(x0 x0Var, s2 s2Var, int i7, s1 s1Var, TextView textView, c20 c20Var) {
        this.f17413b = x0Var;
        this.f17414c = s2Var;
        this.f17412a = i7;
        this.d = s1Var;
        this.f17415e = textView;
        this.f17416f = c20Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(yw ywVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        x0 x0Var = (x0) this.f17413b;
        s2 s2Var = (s2) this.f17414c;
        s1 s1Var = (s1) this.d;
        TextView textView = (TextView) this.f17415e;
        c20 c20Var = (c20) this.f17416f;
        String obj = x0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            t1 f10 = t1.f(this.f17412a);
            if (s1Var == null) {
                i10 = -1;
            } else {
                i10 = s1Var.f17532a;
            }
            s1 d = f10.d(obj);
            if (d != null && d.f17532a != i10) {
                org.telegram.messenger.g0.F3(x0Var);
                textView.setText(id.M0(2131752662, null));
                s2Var.a(Boolean.TRUE);
                return;
            }
            c20Var.a(obj);
            u1Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.F3(x0Var);
        s2Var.a(Boolean.FALSE);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f17413b;
        final TLRPC.User user = (TLRPC.User) this.f17414c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f17415e;
        final yw ywVar2 = (yw) this.f17416f;
        String str4 = LaunchActivity.B1;
        final long j3 = ((xr) arrayList.get(0)).f26520a;
        final TLRPC.Chat M0 = qp.s1(launchActivity.O).M0(Long.valueOf(-j3));
        final int i11 = this.f17412a;
        if (M0 != null && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            qp.s1(i11).K(M0, user, new dp() {
                @Override
                public final void a(boolean z11, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str5) {
                    String str6 = LaunchActivity.B1;
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.gi(LaunchActivity.this, str2, tL_chatAdminRights2, z11, str3, i11, M0, ywVar2, user, j3, str5));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M02 = id.M0(2131754463, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M02;
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            u1Var.T = org.telegram.messenger.g0.X2(id.a0("AddMembersAlertNamesText", null, 2131754399, t10.p(user), str));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            alertDialog$Builder.k(id.M0(2131754463, null), new org.telegram.ui.ActionBar.r1() {
                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                    String str5 = LaunchActivity.B1;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    long j10 = -j3;
                    k10.putLong("chat_id", j10);
                    cn cnVar = new cn(k10);
                    int i13 = i11;
                    org.telegram.messenger.qs.f(i13).k(org.telegram.messenger.qs.f25076t, new Object[0]);
                    org.telegram.messenger.qp.s1(i13).n(j10, user, str3, cnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(cnVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public j1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, yw ywVar) {
        this.f17413b = launchActivity;
        this.f17412a = i7;
        this.f17414c = user;
        this.d = str;
        this.f17415e = str2;
        this.f17416f = ywVar;
    }
}
