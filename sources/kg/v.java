package kg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.eb;
import c8.ha;
import fi.h9;
import fi.w3;
import hi.x3;
import java.util.ArrayList;
import jg.a2;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.i4;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class v extends n41 implements ls {
    public static org.telegram.ui.ActionBar.u1 f17560e;

    public static void d0(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
    }

    public static int f0(ArrayList arrayList) {
        boolean z9 = true;
        boolean z10 = false;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i7);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && z9) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                    z9 = false;
                                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (!z9 || (z9 && z10)) {
            return 0;
        }
        if (z9) {
            return 2;
        }
        return 1;
    }

    public static void g0(Activity activity, int i7, TL_account.TL_businessChatLink tL_businessChatLink, f6 f6Var) {
        View view;
        boolean z9;
        AlertDialog$Builder alertDialog$Builder;
        f2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof rt0) && ((rt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        if (z9) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String M0 = id.M0(2131752699, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27296a;
        u1Var.R = M0;
        s sVar = new s(activity, f6Var);
        ui.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i10 = k6.f27960j5;
        r6.V(sVar, i10, f6Var);
        r6.m(sVar, 34, k6.Li, f6Var);
        r6.m(sVar, 30, k6.Ke, null);
        sVar.setHintText(id.M0(2131752701, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        r6.G(sVar, k6.f27981k6, k6.f27999l6, k6.f28073p7, f6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(id.M0(2131752700, null));
        e10.addView(textView, ha.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(sVar, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e10);
        u1Var.f28551a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new p(sVar, i7, tL_businessChatLink, u1VarArr, view, 0));
        alertDialog$Builder2.k(id.M0(2131751355, null), new a2(sVar, i7, tL_businessChatLink, 1));
        alertDialog$Builder2.h(id.M0(2131752589, null), new x3(15));
        if (z9) {
            f17560e = u1Var;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new q(0, view));
            f17560e.setOnShowListener(new r(sVar, 0));
            f17560e.r(250L);
        } else {
            u1Var.O = new ai.f1(23, view, sVar);
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new eb(sVar, 5));
            u1VarArr[0].setOnShowListener(new n(view, sVar, 0));
            u1VarArr[0].show();
        }
        u1VarArr[0].f28574j0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override
    public final void Z(ArrayList arrayList, l41 l41Var) {
        String a02;
        String M0 = id.M0(2131752710, null);
        String M02 = id.M0(2131752703, null);
        x31 x31Var = new x31(2);
        x31Var.f40180l = M0;
        x31Var.f40183o = M02;
        x31Var.f40179k = 2131623940;
        arrayList.add(x31Var);
        l41Var.V();
        y d = y.d(this.currentAccount);
        if (d.f17586b.size() < qp.s1(d.f17585a).H5) {
            x31 c10 = x31.c(1, 2131231840, id.M0(2131752709, null));
            c10.f40185q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = y.d(this.currentAccount).f17586b;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ?? obj2 = new Object();
            obj2.f17552a = (TL_account.TL_businessChatLink) obj;
            x31 x31Var2 = new x31(29);
            x31Var2.G = obj2;
            arrayList.add(x31Var2);
        }
        l41Var.U();
        TLRPC.User f10 = p10.i(this.currentAccount).f();
        String s5 = a8.p0.s(new StringBuilder(), qp.s1(this.currentAccount).U2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String n10 = t10.n(f10);
        if (n10 != null) {
            arrayList3.add(s5 + n10);
        }
        ArrayList v = g5.r(this.currentAccount).v(6);
        ArrayList v10 = g5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f10.phone) && v != null && v10 != null && (f0(v) != 1 || f0(v10) != 2)) {
            StringBuilder j3 = rf.b.j(s5, "+");
            j3.append(f10.phone);
            arrayList3.add(j3.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                a02 = id.a0(null, null, 2131752704, arrayList3.get(0), arrayList3.get(1));
            } else {
                a02 = id.a0(null, null, 2131752705, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a02);
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                String str = (String) obj3;
                int indexOf = a02.indexOf(str);
                if (indexOf > -1) {
                    i4 i4Var = new i4(rf.b.i("https://", str), (uy0) null);
                    i4Var.f34522f = this;
                    spannableString.setSpan(i4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(x31.C(spannableString));
        }
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131752710, null);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        if (x31Var.d == 1) {
            y d = y.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f17585a).sendRequest(createbusinesschatlink, new x(d, 1));
        } else if (x31Var.f54532a == 29) {
            Object obj = x31Var.G;
            if (obj instanceof u) {
                Bundle f10 = rf.b.f(6, "chatMode");
                f10.putString("business_link", ((u) obj).f17552a.link);
                presentFragment(new an(f10));
            }
        }
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        if (x31Var.f54532a == 29) {
            Object obj = x31Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).f17552a;
                k60 H = k60.H(this, view);
                H.c(2131232103, id.M0(2131751767, null), new h9(tL_businessChatLink, 23), false);
                H.c(2131232363, id.M0(2131748926, null), new Runnable(this) {
                    public final v f17458b;

                    {
                        this.f17458b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f17458b;
                        switch (i7) {
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
                                String M0 = id.M0(2131752707, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                u1Var.R = M0;
                                u1Var.T = id.M0(2131752708, null);
                                alertDialog$Builder.k(id.M0(2131746322, null), new ab.g(20, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(id.M0(2131752589, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.f28093q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232116, id.M0(2131746279, null), new Runnable(this) {
                    public final v f17458b;

                    {
                        this.f17458b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f17458b;
                        switch (i7) {
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
                                String M0 = id.M0(2131752707, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                u1Var.R = M0;
                                u1Var.T = id.M0(2131752708, null);
                                alertDialog$Builder.k(id.M0(2131746322, null), new ab.g(20, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(id.M0(2131752589, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.f28093q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232108, id.M0(2131751599, null), new Runnable(this) {
                    public final v f17458b;

                    {
                        this.f17458b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f17458b;
                        switch (i7) {
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
                                String M0 = id.M0(2131752707, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                u1Var.R = M0;
                                u1Var.T = id.M0(2131752708, null);
                                alertDialog$Builder.k(id.M0(2131746322, null), new ab.g(20, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(id.M0(2131752589, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.f28093q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f36243a.U0(view, false));
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
        this.simpleActionBar.setTitle(id.M0(2131752710, null));
        this.f36244b.setBackground(null);
        this.f36243a.r1();
        this.f36243a.setSectionsDrawBackground(true);
        this.f36243a.f37190f3.f35528r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l41 l41Var;
        if (i7 != qs.J1 && i7 != qs.f25025k0) {
            if (i7 == qs.K1) {
                Bundle f10 = rf.b.f(6, "chatMode");
                f10.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new an(f10));
                return;
            } else if (i7 == qs.L1) {
                y.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        w3 w3Var = this.f36243a;
        if (w3Var != null && (l41Var = w3Var.f37190f3) != null) {
            l41Var.O(true);
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f36243a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.ActionBar.u1 u1Var = f17560e;
        if (u1Var != null && u1Var.isShowing()) {
            if (z9) {
                f17560e.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.J1);
        getNotificationCenter().c(this, qs.K1);
        getNotificationCenter().c(this, qs.L1);
        getNotificationCenter().c(this, qs.f25025k0);
        y d = y.d(this.currentAccount);
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
        getNotificationCenter().n(this, qs.J1);
        getNotificationCenter().n(this, qs.K1);
        getNotificationCenter().n(this, qs.L1);
        getNotificationCenter().n(this, qs.f25025k0);
        cc.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
