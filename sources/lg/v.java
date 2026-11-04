package lg;

import ai.h4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.ba;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class v extends h41 implements cs {
    public static org.telegram.ui.ActionBar.s1 f18489e;

    public static void d0(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
    }

    public static int f0(ArrayList arrayList) {
        boolean z10 = true;
        boolean z11 = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i3);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && z10) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                    z10 = false;
                                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
                z11 = true;
            }
        }
        if (!z10 || (z10 && z11)) {
            return 0;
        }
        if (z10) {
            return 2;
        }
        return 1;
    }

    public static void g0(Activity activity, int i3, TL_account.TL_businessChatLink tL_businessChatLink, e6 e6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        d2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof qt0) && ((qt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String M0 = bd.M0(2131752699, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.f27343a;
        s1Var.S = M0;
        s sVar = new s(activity, e6Var);
        li.b0(i3).M(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i10 = k6.f27988j5;
        r6.V(sVar, i10, e6Var);
        r6.m(sVar, 34, k6.Li, e6Var);
        r6.m(sVar, 30, k6.Ke, null);
        sVar.setHintText(bd.M0(2131752701, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        r6.G(sVar, k6.f28007k6, k6.f28026l6, k6.f28102p7, e6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        r6.V(textView, i10, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(bd.M0(2131752700, null));
        e10.addView(textView, mf.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(sVar, mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e10);
        s1Var.f28523a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new q(sVar, i3, tL_businessChatLink, s1VarArr, view, 0));
        alertDialog$Builder2.k(bd.M0(2131751355, null), new k2.y(sVar, i3, tL_businessChatLink, 2));
        alertDialog$Builder2.h(bd.M0(2131752589, null), new l2.d(14));
        if (z10) {
            f18489e = s1Var;
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new r(0, view));
            f18489e.setOnShowListener(new ai.p(sVar, 2));
            f18489e.r(250L);
        } else {
            s1Var.P = new ai.o1(27, view, sVar);
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new ba(sVar, 5));
            s1VarArr[0].setOnShowListener(new o(0, view, sVar));
            s1VarArr[0].show();
        }
        s1VarArr[0].f28548k0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        String a02;
        String M0 = bd.M0(2131752710, null);
        String M02 = bd.M0(2131752703, null);
        r31 r31Var = new r31(2);
        r31Var.f37627l = M0;
        r31Var.f37630o = M02;
        r31Var.f37626k = 2131623940;
        arrayList.add(r31Var);
        f41Var.V();
        z d = z.d(this.currentAccount);
        if (d.f18525b.size() < hp.s1(d.f18524a).H5) {
            r31 c2 = r31.c(1, 2131231840, bd.M0(2131752709, null));
            c2.f37632q = true;
            arrayList.add(c2);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).f18525b;
        int size = arrayList2.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ?? obj2 = new Object();
            obj2.f18479a = (TL_account.TL_businessChatLink) obj;
            r31 r31Var2 = new r31(29);
            r31Var2.G = obj2;
            arrayList.add(r31Var2);
        }
        f41Var.U();
        TLRPC.User f10 = h10.i(this.currentAccount).f();
        String s6 = a1.g.s(new StringBuilder(), hp.s1(this.currentAccount).V2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String n4 = l10.n(f10);
        if (n4 != null) {
            arrayList3.add(s6 + n4);
        }
        ArrayList v = g5.r(this.currentAccount).v(6);
        ArrayList v10 = g5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f10.phone) && v != null && v10 != null && (f0(v) != 1 || f0(v10) != 2)) {
            StringBuilder h = t4.c.h(s6, "+");
            h.append(f10.phone);
            arrayList3.add(h.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                a02 = bd.a0(null, null, 2131752704, arrayList3.get(0), arrayList3.get(1));
            } else {
                a02 = bd.a0(null, null, 2131752705, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a02);
            int size2 = arrayList3.size();
            while (i3 < size2) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                String str = (String) obj3;
                int indexOf = a02.indexOf(str);
                if (indexOf > -1) {
                    g4 g4Var = new g4(t4.c.f("https://", str), (ty0) null);
                    g4Var.f33953f = this;
                    spannableString.setSpan(g4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(r31.C(spannableString));
        }
    }

    @Override
    public final CharSequence a0() {
        return bd.M0(2131752710, null);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        if (r31Var.d == 1) {
            z d = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f18524a).sendRequest(createbusinesschatlink, new x(d, 1));
        } else if (r31Var.f54715a == 29) {
            Object obj = r31Var.G;
            if (obj instanceof u) {
                Bundle k10 = org.telegram.ui.Cells.f1.k(6, "chatMode");
                k10.putString("business_link", ((u) obj).f18479a.link);
                presentFragment(new wm(k10));
            }
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        if (r31Var.f54715a == 29) {
            Object obj = r31Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).f18479a;
                f60 H = f60.H(this, view);
                H.c(2131232103, bd.M0(2131751767, null), new n(tL_businessChatLink, 0), false);
                H.c(2131232363, bd.M0(2131748933, null), new Runnable(this) {
                    public final v f18395b;

                    {
                        this.f18395b = this;
                    }

                    @Override
                    public final void run() {
                        int i3 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18395b;
                        switch (i3) {
                            case 0:
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.d0(vVar, tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vVar.getParentActivity(), vVar.getResourceProvider());
                                String M0 = bd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                s1Var.S = M0;
                                s1Var.U = bd.M0(2131752708, null);
                                alertDialog$Builder.k(bd.M0(2131746329, null), new ai.n(26, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                vVar.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.f28122q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232116, bd.M0(2131746286, null), new Runnable(this) {
                    public final v f18395b;

                    {
                        this.f18395b = this;
                    }

                    @Override
                    public final void run() {
                        int i3 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18395b;
                        switch (i3) {
                            case 0:
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.d0(vVar, tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vVar.getParentActivity(), vVar.getResourceProvider());
                                String M0 = bd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                s1Var.S = M0;
                                s1Var.U = bd.M0(2131752708, null);
                                alertDialog$Builder.k(bd.M0(2131746329, null), new ai.n(26, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                vVar.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.f28122q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232108, bd.M0(2131751599, null), new Runnable(this) {
                    public final v f18395b;

                    {
                        this.f18395b = this;
                    }

                    @Override
                    public final void run() {
                        int i3 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18395b;
                        switch (i3) {
                            case 0:
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.d0(vVar, tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vVar.getParentActivity(), vVar.getResourceProvider());
                                String M0 = bd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                s1Var.S = M0;
                                s1Var.U = bd.M0(2131752708, null);
                                alertDialog$Builder.k(bd.M0(2131746329, null), new ai.n(26, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                vVar.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.f28122q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f34298a.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(bd.M0(2131752710, null));
        this.f34299b.setBackground(null);
        this.f34298a.r1();
        this.f34298a.setSectionsDrawBackground(true);
        this.f34298a.f35594g3.f33698r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 != hs.J1 && i3 != hs.f23254k0) {
            if (i3 == hs.K1) {
                Bundle k10 = org.telegram.ui.Cells.f1.k(6, "chatMode");
                k10.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new wm(k10));
                return;
            } else if (i3 == hs.L1) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        h4 h4Var = this.f34298a;
        if (h4Var != null && (f41Var = h4Var.f35594g3) != null) {
            f41Var.O(true);
        }
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f34298a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.s1 s1Var = f18489e;
        if (s1Var != null && s1Var.isShowing()) {
            if (z10) {
                f18489e.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.J1);
        getNotificationCenter().c(this, hs.K1);
        getNotificationCenter().c(this, hs.L1);
        getNotificationCenter().c(this, hs.f23254k0);
        z d = z.d(this.currentAccount);
        if (!d.d) {
            d.e(true, true);
        } else {
            d.e(false, true);
        }
        g5.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.J1);
        getNotificationCenter().n(this, hs.K1);
        getNotificationCenter().n(this, hs.L1);
        getNotificationCenter().n(this, hs.f23254k0);
        ac.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
