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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class m51 extends n7c implements jm7 {
    public static he e;

    public static int d0(ArrayList arrayList) {
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

    public static void g0(Activity activity, int i, TL_account.TL_businessChatLink tL_businessChatLink, ylb ylbVar) {
        View view;
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        d Q = LaunchActivity.Q();
        Activity W = gm.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof ela) && ((ela) Q.getFragmentView()).Q() > gm.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        he[] heVarArr = new he[1];
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String M0 = jb6.M0(2131752652, null);
        he heVar = alertDialog$Builder2.a;
        heVar.S = M0;
        j51 j51Var = new j51(activity, ylbVar);
        hs6.d0(i).O(gm.F0(), true);
        j51Var.setInputType(49153);
        j51Var.setTextSize(1, 18.0f);
        j51Var.setText(tL_businessChatLink.title);
        int i2 = cmb.i5;
        anb.X(j51Var, i2, ylbVar);
        anb.l(j51Var, 34, cmb.Ni, ylbVar);
        anb.l(j51Var, 30, cmb.Me, null);
        j51Var.setHintText(jb6.M0(2131752654, null));
        j51Var.setSingleLine(true);
        j51Var.setFocusable(true);
        anb.F(j51Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        j51Var.setImeOptions(6);
        j51Var.setBackgroundDrawable(null);
        j51Var.setPadding(0, 0, gm.L(42.0f), 0);
        LinearLayout l = td4.l(activity, 1);
        TextView textView = new TextView(activity);
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131752653, null));
        l.addView(textView, qoe.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        l.addView(j51Var, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(l);
        heVar.a = gm.L(292.0f);
        j51Var.setOnEditorActionListener(new xg(j51Var, i, tL_businessChatLink, heVarArr, view, (byte) 1));
        alertDialog$Builder2.j(jb6.M0(2131751291, null), new yg(j51Var, i, tL_businessChatLink, (byte) 1));
        alertDialog$Builder2.g(jb6.M0(2131752542, null), new qn0((byte) 13));
        if (z) {
            e = heVar;
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new i51(view, (byte) 0));
            e.setOnShowListener(new jh(j51Var, (byte) 2));
            e.q(250L);
        } else {
            heVar.P = new x0(view, j51Var, (byte) 12);
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new n1(j51Var, (byte) 9));
            heVarArr[0].setOnShowListener(new g51(view, j51Var, (byte) 0));
            heVarArr[0].show();
        }
        heVarArr[0].k0 = false;
        j51Var.setSelection(j51Var.getText().length());
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        String a0;
        String M0 = jb6.M0(2131752663, null);
        String M02 = jb6.M0(2131752656, null);
        c6c c6cVar = new c6c(2);
        c6cVar.m = M0;
        c6cVar.p = M02;
        c6cVar.k = 2131623940;
        arrayList.add(c6cVar);
        l7cVar.V();
        q51 d = q51.d(this.currentAccount);
        if (d.b.size() < oc7.r1(d.a).l4.m2.f()) {
            c6c c = c6c.c(1, 2131231845, jb6.M0(2131752662, null));
            c.r = true;
            arrayList.add(c);
        }
        ArrayList arrayList2 = q51.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ?? obj2 = new Object();
            obj2.a = (TL_account.TL_businessChatLink) obj;
            c6c c6cVar2 = new c6c(29);
            c6cVar2.H = obj2;
            arrayList.add(c6cVar2);
        }
        l7cVar.U();
        TLRPC.User f = z8c.h(this.currentAccount).f();
        String j = b10.j(new StringBuilder(), oc7.r1(this.currentAccount).N2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String p = m9c.p(f);
        if (p != null) {
            arrayList3.add(j.concat(p));
        }
        ArrayList v = bw2.r(this.currentAccount).v(6);
        ArrayList v2 = bw2.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f.phone) && v != null && v2 != null && (d0(v) != 1 || d0(v2) != 2)) {
            StringBuilder k = b10.k(j, "+");
            k.append(f.phone);
            arrayList3.add(k.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                a0 = jb6.a0(null, null, 2131752657, arrayList3.get(0), arrayList3.get(1));
            } else {
                a0 = jb6.a0(null, null, 2131752658, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a0);
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj3 = arrayList3.get(i);
                i++;
                String str = (String) obj3;
                int indexOf = a0.indexOf(str);
                if (indexOf > -1) {
                    uj ujVar = new uj(b10.h("https://", str), (wkb) null);
                    ujVar.f = this;
                    spannableString.setSpan(ujVar, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(c6c.C(spannableString));
        }
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131752663, null);
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        if (c6cVar.a == 29) {
            Object obj = c6cVar.H;
            if (obj instanceof l51) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((l51) obj).a;
                bu5 I = bu5.I(this, view);
                I.b(2131232109, jb6.M0(2131751704, null), new yt0(tL_businessChatLink, (byte) 11), false);
                I.b(2131232369, jb6.M0(2131748682, null), new Runnable(this) {
                    public final m51 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        m51 m51Var = this.b;
                        switch (b) {
                            case 0:
                                Intent intent = new Intent(m51Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                m51Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                m51Var.e0(tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m51Var.getResourceProvider(), m51Var.getParentActivity());
                                String M0 = jb6.M0(2131752660, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131752661, null);
                                alertDialog$Builder.j(jb6.M0(2131746054, null), new g11(m51Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                m51Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, m51Var.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.b(2131232122, jb6.M0(2131746011, null), new Runnable(this) {
                    public final m51 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        m51 m51Var = this.b;
                        switch (b) {
                            case 0:
                                Intent intent = new Intent(m51Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                m51Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                m51Var.e0(tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m51Var.getResourceProvider(), m51Var.getParentActivity());
                                String M0 = jb6.M0(2131752660, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131752661, null);
                                alertDialog$Builder.j(jb6.M0(2131746054, null), new g11(m51Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                m51Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, m51Var.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.b(2131232114, jb6.M0(2131751535, null), new Runnable(this) {
                    public final m51 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        m51 m51Var = this.b;
                        switch (b) {
                            case 0:
                                Intent intent = new Intent(m51Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                m51Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                m51Var.e0(tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m51Var.getResourceProvider(), m51Var.getParentActivity());
                                String M0 = jb6.M0(2131752660, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131752661, null);
                                alertDialog$Builder.j(jb6.M0(2131746054, null), new g11(m51Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                m51Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, m51Var.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                I.X(this.a.V0(view, false));
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
        this.simpleActionBar.setTitle(jb6.M0(2131752663, null));
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if (i != nm7.J1 && i != nm7.k0) {
            if (i == nm7.K1) {
                Bundle j = kt6.j(6, "chatMode");
                j.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new yv1(j));
                return;
            } else if (i == nm7.L1) {
                q51.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        va vaVar = this.a;
        if (vaVar != null && (l7cVar = vaVar.g3) != null) {
            l7cVar.O(true);
        }
    }

    public final void e0(TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(getParentActivity(), this.currentAccount, tL_businessChatLink, this.resourceProvider);
    }

    public final void f0(TL_account.TL_businessChatLink tL_businessChatLink) {
        q51.d(this.currentAccount).a(this, tL_businessChatLink.link);
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        he heVar = e;
        if (heVar != null && heVar.isShowing()) {
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
        getNotificationCenter().b(this, nm7.J1);
        getNotificationCenter().b(this, nm7.K1);
        getNotificationCenter().b(this, nm7.L1);
        getNotificationCenter().b(this, nm7.k0);
        q51 d = q51.d(this.currentAccount);
        if (!d.d) {
            d.e(true, true);
        } else {
            d.e(false, true);
        }
        bw2.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.J1);
        getNotificationCenter().n(this, nm7.K1);
        getNotificationCenter().n(this, nm7.L1);
        getNotificationCenter().n(this, nm7.k0);
        u31.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
