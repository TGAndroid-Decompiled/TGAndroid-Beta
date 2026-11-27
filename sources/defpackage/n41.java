package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class n41 extends n9c implements fn7 {
    public static id e;

    public static int c0(ArrayList arrayList) {
        boolean z = true;
        boolean z2 = false;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && z) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                    z = false;
                                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                z2 = true;
            }
        }
        if (!z || (z && z2)) {
            return 0;
        }
        if (z) {
            return 2;
        }
        return 1;
    }

    public static void f0(Activity activity, int i, TL_account.TL_businessChatLink tL_businessChatLink, vnb vnbVar) {
        View view;
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        e Q = LaunchActivity.Q();
        Activity W = hl.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof wma) && ((wma) Q.getFragmentView()).Q() > hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        id[] idVarArr = new id[1];
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String M0 = ob6.M0(2131752680, null);
        id idVar = alertDialog$Builder2.a;
        idVar.S = M0;
        k41 k41Var = new k41(activity, vnbVar);
        ls6.d0(i).O(hl.F0(), true);
        k41Var.setInputType(49153);
        k41Var.setTextSize(1, 18.0f);
        k41Var.setText(tL_businessChatLink.title);
        int i2 = aob.j5;
        yob.X(k41Var, i2, vnbVar);
        yob.l(k41Var, 34, aob.Oi, vnbVar);
        yob.l(k41Var, 30, aob.Ne, null);
        k41Var.setHintText(ob6.M0(2131752682, null));
        k41Var.setSingleLine(true);
        k41Var.setFocusable(true);
        yob.F(k41Var, aob.k6, aob.l6, aob.p7, vnbVar);
        k41Var.setImeOptions(6);
        k41Var.setBackgroundDrawable(null);
        k41Var.setPadding(0, 0, hl.L(42.0f), 0);
        LinearLayout m = bs2.m(activity, 1);
        TextView textView = new TextView(activity);
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131752681, null));
        m.addView(textView, tre.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        m.addView(k41Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(m);
        idVar.a = hl.L(292.0f);
        k41Var.setOnEditorActionListener(new af(k41Var, i, tL_businessChatLink, idVarArr, view, (byte) 1));
        alertDialog$Builder2.j(ob6.M0(2131751319, null), new bf(k41Var, i, tL_businessChatLink, (byte) 1));
        alertDialog$Builder2.g(ob6.M0(2131752570, null), new rm0((byte) 14));
        if (z) {
            e = idVar;
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new i41(view, (byte) 0));
            e.setOnShowListener(new ig(k41Var, (byte) 2));
            e.q(250L);
        } else {
            idVar.P = new y0(view, k41Var, (byte) 11);
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new o1(k41Var, (byte) 9));
            idVarArr[0].setOnShowListener(new j41((byte) 0, view, k41Var));
            idVarArr[0].show();
        }
        idVarArr[0].k0 = false;
        k41Var.setSelection(k41Var.getText().length());
    }

    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        String a0;
        String M0 = ob6.M0(2131752691, null);
        String M02 = ob6.M0(2131752684, null);
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.p = M02;
        b8cVar.k = 2131623940;
        arrayList.add(b8cVar);
        l9cVar.V();
        r41 d = r41.d(this.currentAccount);
        if (d.b.size() < uc7.s1(d.a).l4.u2.f()) {
            b8c c = b8c.c(1, 2131231844, ob6.M0(2131752690, null));
            c.r = true;
            arrayList.add(c);
        }
        ArrayList arrayList2 = r41.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ?? obj2 = new Object();
            obj2.a = (TL_account.TL_businessChatLink) obj;
            b8c b8cVar2 = new b8c(29);
            b8cVar2.H = obj2;
            arrayList.add(b8cVar2);
        }
        l9cVar.U();
        TLRPC.User f = yac.h(this.currentAccount).f();
        String k = c00.k(new StringBuilder(), uc7.s1(this.currentAccount).N2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String p = lbc.p(f);
        if (p != null) {
            arrayList3.add(k.concat(p));
        }
        ArrayList v = lv2.r(this.currentAccount).v(6);
        ArrayList v2 = lv2.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f.phone) && v != null && v2 != null && (c0(v) != 1 || c0(v2) != 2)) {
            StringBuilder l = c00.l(k, "+");
            l.append(f.phone);
            arrayList3.add(l.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                a0 = ob6.a0(null, null, 2131752685, arrayList3.get(0), arrayList3.get(1));
            } else {
                a0 = ob6.a0(null, null, 2131752686, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a0);
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj3 = arrayList3.get(i);
                i++;
                String str = (String) obj3;
                int indexOf = a0.indexOf(str);
                if (indexOf > -1) {
                    vi viVar = new vi(c00.i("https://", str), (rmb) null);
                    viVar.f = this;
                    spannableString.setSpan(viVar, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(b8c.C(spannableString));
        }
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131752691, null);
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        if (b8cVar.a == 29) {
            Object obj = b8cVar.H;
            if (obj instanceof m41) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((m41) obj).a;
                fu5 I = fu5.I(this, view);
                I.b(2131232108, ob6.M0(2131751732, null), new fv0(tL_businessChatLink, (byte) 10), false);
                I.b(2131232368, ob6.M0(2131748679, null), new Runnable(this) {
                    public final n41 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        n41 n41Var = this.b;
                        switch (b) {
                            case 0:
                                n41Var.d0(tL_businessChatLink2);
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n41Var.getResourceProvider(), n41Var.getParentActivity());
                                String M0 = ob6.M0(2131752688, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131752689, null);
                                alertDialog$Builder.j(ob6.M0(2131746048, null), new h01(n41Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                n41Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, n41Var.getResourceProvider());
                                    return;
                                }
                                return;
                            default:
                                Intent intent = new Intent(n41Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                n41Var.startActivityForResult(intent, 500);
                                return;
                        }
                    }
                }, false);
                I.b(2131232121, ob6.M0(2131746005, null), new Runnable(this) {
                    public final n41 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        n41 n41Var = this.b;
                        switch (b) {
                            case 0:
                                n41Var.d0(tL_businessChatLink2);
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n41Var.getResourceProvider(), n41Var.getParentActivity());
                                String M0 = ob6.M0(2131752688, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131752689, null);
                                alertDialog$Builder.j(ob6.M0(2131746048, null), new h01(n41Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                n41Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, n41Var.getResourceProvider());
                                    return;
                                }
                                return;
                            default:
                                Intent intent = new Intent(n41Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                n41Var.startActivityForResult(intent, 500);
                                return;
                        }
                    }
                }, false);
                I.b(2131232113, ob6.M0(2131751563, null), new Runnable(this) {
                    public final n41 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        n41 n41Var = this.b;
                        switch (b) {
                            case 0:
                                n41Var.d0(tL_businessChatLink2);
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n41Var.getResourceProvider(), n41Var.getParentActivity());
                                String M0 = ob6.M0(2131752688, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131752689, null);
                                alertDialog$Builder.j(ob6.M0(2131746048, null), new h01(n41Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                n41Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, n41Var.getResourceProvider());
                                    return;
                                }
                                return;
                            default:
                                Intent intent = new Intent(n41Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                n41Var.startActivityForResult(intent, 500);
                                return;
                        }
                    }
                }, true);
                I.X(this.a.W0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(ob6.M0(2131752691, null));
        this.b.setBackground(null);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    public final void d0(TL_account.TL_businessChatLink tL_businessChatLink) {
        f0(getParentActivity(), this.currentAccount, tL_businessChatLink, this.resourceProvider);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i != jn7.J1 && i != jn7.k0) {
            if (i == jn7.K1) {
                Bundle j = qu6.j(6, "chatMode");
                j.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new zu1(j));
                return;
            } else if (i == jn7.L1) {
                r41.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        wa waVar = this.a;
        if (waVar != null && (l9cVar = waVar.g3) != null) {
            l9cVar.O(true);
        }
    }

    public final void e0(TL_account.TL_businessChatLink tL_businessChatLink) {
        r41.d(this.currentAccount).a(this, tL_businessChatLink.link);
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        id idVar = e;
        if (idVar != null && idVar.isShowing()) {
            if (z) {
                e.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.J1);
        getNotificationCenter().b(this, jn7.K1);
        getNotificationCenter().b(this, jn7.L1);
        getNotificationCenter().b(this, jn7.k0);
        r41 d = r41.d(this.currentAccount);
        if (!d.d) {
            d.e(true, true);
        } else {
            d.e(false, true);
        }
        lv2.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.J1);
        getNotificationCenter().n(this, jn7.K1);
        getNotificationCenter().n(this, jn7.L1);
        getNotificationCenter().n(this, jn7.k0);
        v21.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
