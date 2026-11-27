package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class zz5 implements oj3, fd {
    public final int a;
    public final KeyEvent.Callback b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public zz5(f42 f42Var, ku0 ku0Var, int i, a19 a19Var, TextView textView, pcc pccVar) {
        this.b = f42Var;
        this.c = ku0Var;
        this.a = i;
        this.d = a19Var;
        this.e = textView;
        this.f = pccVar;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final uj3 uj3Var2 = (uj3) this.f;
        String str4 = LaunchActivity.C1;
        final long j = ((if7) arrayList.get(0)).a;
        final TLRPC.Chat M0 = uc7.s1(launchActivity.P).M0(Long.valueOf(-j));
        final int i3 = this.a;
        if (M0 != null && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            uc7.s1(i3).I(M0, user, new ic7() {
                @Override
                public final void a(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str5) {
                    String str6 = LaunchActivity.C1;
                    hl.c3(new v06(LaunchActivity.this, str2, tL_chatAdminRights2, z3, str3, i3, M0, uj3Var2, user, j, str5));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M02 = ob6.M0(2131754456, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M02;
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            idVar.U = hl.S2(ob6.a0("AddMembersAlertNamesText", null, 2131754392, lbc.r(user), str));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.j(ob6.M0(2131754456, null), new fd() {
                @Override
                public final void w(id idVar2, int i4) {
                    String str5 = LaunchActivity.C1;
                    Bundle l = bs2.l("scrollToTopOnResume", true);
                    long j2 = -j;
                    l.putLong("chat_id", j2);
                    zu1 zu1Var = new zu1(l);
                    int i5 = i3;
                    jn7.f(i5).k(jn7.s, new Object[0]);
                    uc7.s1(i5).k(j2, user, str3, zu1Var, false, null, null);
                    ((ActionBarLayout) LaunchActivity.this.N()).U(zu1Var, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override
    public final void w(id idVar, int i) {
        int i2;
        f42 f42Var = (f42) this.b;
        ku0 ku0Var = (ku0) this.c;
        a19 a19Var = (a19) this.d;
        TextView textView = (TextView) this.e;
        pcc pccVar = (pcc) this.f;
        String obj = f42Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b19 f = b19.f(this.a);
            if (a19Var == null) {
                i2 = -1;
            } else {
                i2 = a19Var.a;
            }
            a19 d = f.d(obj);
            if (d != null && d.a != i2) {
                hl.z3(f42Var);
                textView.setText(ob6.M0(2131752643, null));
                ku0Var.a(Boolean.TRUE);
                return;
            }
            pccVar.a(obj);
            idVar.dismiss();
            return;
        }
        hl.z3(f42Var);
        ku0Var.a(Boolean.FALSE);
    }

    public zz5(LaunchActivity launchActivity, int i, TLRPC.User user, String str, String str2, uj3 uj3Var) {
        this.b = launchActivity;
        this.a = i;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = uj3Var;
    }
}
