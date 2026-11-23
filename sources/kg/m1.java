package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import bi.o2;
import java.util.ArrayList;
import org.telegram.messenger.ap;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
public final class m1 implements org.telegram.ui.ActionBar.q1, ww {
    public final int f18380a;
    public final KeyEvent.Callback f18381b;
    public final Object f18382c;
    public final Object d;
    public final Object f18383e;
    public final Object f18384f;

    public m1(a1 a1Var, o2 o2Var, int i7, v1 v1Var, TextView textView, y10 y10Var) {
        this.f18381b = a1Var;
        this.f18382c = o2Var;
        this.f18380a = i7;
        this.d = v1Var;
        this.f18383e = textView;
        this.f18384f = y10Var;
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
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        a1 a1Var = (a1) this.f18381b;
        o2 o2Var = (o2) this.f18382c;
        v1 v1Var = (v1) this.d;
        TextView textView = (TextView) this.f18383e;
        y10 y10Var = (y10) this.f18384f;
        String obj = a1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            w1 f10 = w1.f(this.f18380a);
            if (v1Var == null) {
                i10 = -1;
            } else {
                i10 = v1Var.f18505a;
            }
            v1 d = f10.d(obj);
            if (d != null && d.f18505a != i10) {
                org.telegram.messenger.g0.D3(a1Var);
                textView.setText(hd.N0(2131752650, null));
                o2Var.a(Boolean.TRUE);
                return;
            }
            y10Var.a(obj);
            t1Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.D3(a1Var);
        o2Var.a(Boolean.FALSE);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f18381b;
        final TLRPC.User user = (TLRPC.User) this.f18382c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f18383e;
        final cx cxVar2 = (cx) this.f18384f;
        String str4 = LaunchActivity.C1;
        final long j3 = ((tr) arrayList.get(0)).f27037a;
        final TLRPC.Chat O0 = np.u1(launchActivity.P).O0(Long.valueOf(-j3));
        final int i11 = this.f18380a;
        if (O0 != null && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            np.u1(i11).K(O0, user, new ap() {
                @Override
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str5) {
                    String str6 = LaunchActivity.C1;
                    org.telegram.messenger.g0.g3(new bi.z4(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i11, O0, cxVar2, user, j3, str5));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String N0 = hd.N0(2131754460, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
            t1Var.U = org.telegram.messenger.g0.W2(hd.a0("AddMembersAlertNamesText", null, 2131754396, p10.q(user), str));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            alertDialog$Builder.k(hd.N0(2131754460, null), new org.telegram.ui.ActionBar.q1() {
                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                    String str5 = LaunchActivity.C1;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    long j10 = -j3;
                    k10.putLong("chat_id", j10);
                    bn bnVar = new bn(k10);
                    int i13 = i11;
                    org.telegram.messenger.ls.f(i13).k(org.telegram.messenger.ls.f25348t, new Object[0]);
                    org.telegram.messenger.np.u1(i13).n(j10, user, str3, bnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(bnVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public m1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, cx cxVar) {
        this.f18381b = launchActivity;
        this.f18380a = i7;
        this.f18382c = user;
        this.d = str;
        this.f18383e = str2;
        this.f18384f = cxVar;
    }
}
