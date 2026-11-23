package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import bi.o2;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.sr;
import org.telegram.messenger.w10;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
import org.telegram.ui.vw;
import org.telegram.ui.w91;
public final class m1 implements org.telegram.ui.ActionBar.q1, vw {
    public final int f18475a;
    public final KeyEvent.Callback f18476b;
    public final Object f18477c;
    public final Object d;
    public final Object f18478e;
    public final Object f18479f;

    public m1(z0 z0Var, o2 o2Var, int i7, v1 v1Var, TextView textView, w10 w10Var) {
        this.f18476b = z0Var;
        this.f18477c = o2Var;
        this.f18475a = i7;
        this.d = v1Var;
        this.f18478e = textView;
        this.f18479f = w10Var;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(bx bxVar) {
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        z0 z0Var = (z0) this.f18476b;
        o2 o2Var = (o2) this.f18477c;
        v1 v1Var = (v1) this.d;
        TextView textView = (TextView) this.f18478e;
        w10 w10Var = (w10) this.f18479f;
        String obj = z0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            w1 f10 = w1.f(this.f18475a);
            if (v1Var == null) {
                i10 = -1;
            } else {
                i10 = v1Var.f18601a;
            }
            v1 d = f10.d(obj);
            if (d != null && d.f18601a != i10) {
                org.telegram.messenger.g0.D3(z0Var);
                textView.setText(gd.N0(2131752650, null));
                o2Var.a(Boolean.TRUE);
                return;
            }
            w10Var.a(obj);
            t1Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.D3(z0Var);
        o2Var.a(Boolean.FALSE);
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f18476b;
        final TLRPC.User user = (TLRPC.User) this.f18477c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f18478e;
        final bx bxVar2 = (bx) this.f18479f;
        String str4 = LaunchActivity.C1;
        final long j3 = ((sr) arrayList.get(0)).f26946a;
        final TLRPC.Chat O0 = mp.u1(launchActivity.P).O0(Long.valueOf(-j3));
        final int i11 = this.f18475a;
        if (O0 != null && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            mp.u1(i11).K(O0, user, new zo() {
                @Override
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str5) {
                    String str6 = LaunchActivity.C1;
                    org.telegram.messenger.g0.g3(new bi.z4(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i11, O0, bxVar2, user, j3, str5));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String N0 = gd.N0(2131754460, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
            t1Var.U = org.telegram.messenger.g0.W2(gd.a0("AddMembersAlertNamesText", null, 2131754396, n10.q(user), str));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            alertDialog$Builder.k(gd.N0(2131754460, null), new org.telegram.ui.ActionBar.q1() {
                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                    String str5 = LaunchActivity.C1;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    long j10 = -j3;
                    k10.putLong("chat_id", j10);
                    bn bnVar = new bn(k10);
                    int i13 = i11;
                    org.telegram.messenger.ks.f(i13).k(org.telegram.messenger.ks.f25289t, new Object[0]);
                    org.telegram.messenger.mp.u1(i13).n(j10, user, str3, bnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(bnVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public m1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, bx bxVar) {
        this.f18476b = launchActivity;
        this.f18475a = i7;
        this.f18477c = user;
        this.d = str;
        this.f18478e = str2;
        this.f18479f = bxVar;
    }
}
