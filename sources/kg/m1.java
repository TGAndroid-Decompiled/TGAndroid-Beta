package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import bi.i2;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.sr;
import org.telegram.messenger.x10;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
public final class m1 implements org.telegram.ui.ActionBar.r1, ww {
    public final int f18384a;
    public final KeyEvent.Callback f18385b;
    public final Object f18386c;
    public final Object d;
    public final Object f18387e;
    public final Object f18388f;

    public m1(a1 a1Var, i2 i2Var, int i7, v1 v1Var, TextView textView, x10 x10Var) {
        this.f18385b = a1Var;
        this.f18386c = i2Var;
        this.f18384a = i7;
        this.d = v1Var;
        this.f18387e = textView;
        this.f18388f = x10Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        a1 a1Var = (a1) this.f18385b;
        i2 i2Var = (i2) this.f18386c;
        v1 v1Var = (v1) this.d;
        TextView textView = (TextView) this.f18387e;
        x10 x10Var = (x10) this.f18388f;
        String obj = a1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            w1 f10 = w1.f(this.f18384a);
            if (v1Var == null) {
                i10 = -1;
            } else {
                i10 = v1Var.f18509a;
            }
            v1 d = f10.d(obj);
            if (d != null && d.f18509a != i10) {
                org.telegram.messenger.g0.D3(a1Var);
                textView.setText(gd.M0(2131752651, null));
                i2Var.a(Boolean.TRUE);
                return;
            }
            x10Var.a(obj);
            u1Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.D3(a1Var);
        i2Var.a(Boolean.FALSE);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f18385b;
        final TLRPC.User user = (TLRPC.User) this.f18386c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f18387e;
        final cx cxVar2 = (cx) this.f18388f;
        String str4 = LaunchActivity.C1;
        final long j3 = ((sr) arrayList.get(0)).f26847a;
        final TLRPC.Chat O0 = mp.u1(launchActivity.P).O0(Long.valueOf(-j3));
        final int i11 = this.f18384a;
        if (O0 != null && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            mp.u1(i11).K(O0, user, new zo() {
                @Override
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str5) {
                    String str6 = LaunchActivity.C1;
                    org.telegram.messenger.g0.g3(new bi.t4(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i11, O0, cxVar2, user, j3, str5));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = gd.M0(2131754461, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0("AddMembersAlertNamesText", null, 2131754397, o10.q(user), str));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.k(gd.M0(2131754461, null), new org.telegram.ui.ActionBar.r1() {
                @Override
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                    String str5 = LaunchActivity.C1;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    long j10 = -j3;
                    k10.putLong("chat_id", j10);
                    bn bnVar = new bn(k10);
                    int i13 = i11;
                    org.telegram.messenger.ks.f(i13).k(org.telegram.messenger.ks.f25192t, new Object[0]);
                    org.telegram.messenger.mp.u1(i13).n(j10, user, str3, bnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(bnVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public m1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, cx cxVar) {
        this.f18385b = launchActivity;
        this.f18384a = i7;
        this.f18386c = user;
        this.d = str;
        this.f18387e = str2;
        this.f18388f = cxVar;
    }
}
