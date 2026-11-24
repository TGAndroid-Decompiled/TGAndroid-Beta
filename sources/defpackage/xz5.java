package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class xz5 implements hk3, ee {
    public final int a;
    public final KeyEvent.Callback b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public xz5(a52 a52Var, jv0 jv0Var, int i, oz8 oz8Var, TextView textView, qac qacVar) {
        this.b = a52Var;
        this.c = jv0Var;
        this.a = i;
        this.d = oz8Var;
        this.e = textView;
        this.f = qacVar;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final nk3 nk3Var2 = (nk3) this.f;
        String str4 = LaunchActivity.C1;
        final long j = ((bf7) arrayList.get(0)).a;
        final TLRPC.Chat L0 = oc7.r1(launchActivity.P).L0(Long.valueOf(-j));
        final int i3 = this.a;
        if (L0 != null && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            oc7.r1(i3).G(L0, user, new cc7() {
                @Override
                public final void a(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str5) {
                    String str6 = LaunchActivity.C1;
                    gm.c3(new u06(LaunchActivity.this, str2, tL_chatAdminRights2, z3, str3, i3, L0, nk3Var2, user, j, str5));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = jb6.M0(2131754460, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
            heVar.U = gm.S2(jb6.a0("AddMembersAlertNamesText", null, 2131754396, m9c.r(user), str));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.j(jb6.M0(2131754460, null), new ee() {
                @Override
                public final void r(he heVar2, int i4) {
                    String str5 = LaunchActivity.C1;
                    Bundle l = ts2.l("scrollToTopOnResume", true);
                    long j2 = -j;
                    l.putLong("chat_id", j2);
                    yv1 yv1Var = new yv1(l);
                    int i5 = i3;
                    nm7.f(i5).k(nm7.s, new Object[0]);
                    oc7.r1(i5).k(j2, user, str3, yv1Var, false, null, null);
                    ((ActionBarLayout) LaunchActivity.this.N()).U(yv1Var, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    @Override
    public final void r(he heVar, int i) {
        int i2;
        a52 a52Var = (a52) this.b;
        jv0 jv0Var = (jv0) this.c;
        oz8 oz8Var = (oz8) this.d;
        TextView textView = (TextView) this.e;
        qac qacVar = (qac) this.f;
        String obj = a52Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            pz8 f = pz8.f(this.a);
            if (oz8Var == null) {
                i2 = -1;
            } else {
                i2 = oz8Var.a;
            }
            oz8 d = f.d(obj);
            if (d != null && d.a != i2) {
                gm.z3(a52Var);
                textView.setText(jb6.M0(2131752615, null));
                jv0Var.a(Boolean.TRUE);
                return;
            }
            qacVar.a(obj);
            heVar.dismiss();
            return;
        }
        gm.z3(a52Var);
        jv0Var.a(Boolean.FALSE);
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    public xz5(LaunchActivity launchActivity, int i, TLRPC.User user, String str, String str2, nk3 nk3Var) {
        this.b = launchActivity;
        this.a = i;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = nk3Var;
    }
}
