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
import bi.d6;
import c8.ma;
import di.t9;
import hi.f9;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class v extends b51 implements fs {
    public static org.telegram.ui.ActionBar.u1 f18499e;

    public static void d0(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
    }

    public static int f0(ArrayList arrayList) {
        boolean z10 = true;
        boolean z11 = false;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i7);
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

    public static void g0(Activity activity, int i7, TL_account.TL_businessChatLink tL_businessChatLink, i6 i6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        h2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof au0) && ((au0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String M0 = gd.M0(2131752688, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f28746a;
        u1Var.S = M0;
        s sVar = new s(activity, i6Var);
        ri.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i10 = n6.f29504j5;
        u6.U(sVar, i10, i6Var);
        u6.l(sVar, 34, n6.Oi, i6Var);
        u6.l(sVar, 30, n6.Ne, null);
        sVar.setHintText(gd.M0(2131752690, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        u6.F(sVar, n6.f29525k6, n6.f29543l6, n6.f29617p7, i6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = f3.f(activity, 1);
        TextView textView = new TextView(activity);
        u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.M0(2131752689, null));
        f10.addView(textView, ma.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(sVar, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        u1Var.f30026a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new q(sVar, i7, tL_businessChatLink, u1VarArr, view, 0));
        alertDialog$Builder2.k(gd.M0(2131751343, null), new ai.r1(sVar, i7, tL_businessChatLink, 3));
        alertDialog$Builder2.h(gd.M0(2131752578, null), new f9(12));
        if (z10) {
            f18499e = u1Var;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new r(0, view));
            f18499e.setOnShowListener(new bi.l(sVar, 2));
            f18499e.r(250L);
        } else {
            u1Var.P = new ai.v1(23, view, sVar);
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new t9(sVar, 5));
            u1VarArr[0].setOnShowListener(new o(view, sVar, 0));
            u1VarArr[0].show();
        }
        u1VarArr[0].f30051k0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override
    public final void Z(ArrayList arrayList, z41 z41Var) {
        String a02;
        String M0 = gd.M0(2131752699, null);
        String M02 = gd.M0(2131752692, null);
        l41 l41Var = new l41(2);
        l41Var.f37018m = M0;
        l41Var.f37021p = M02;
        l41Var.f37016k = 2131623940;
        arrayList.add(l41Var);
        z41Var.V();
        y d = y.d(this.currentAccount);
        if (d.f18539b.size() < mp.u1(d.f18538a).K5) {
            l41 c10 = l41.c(1, 2131231841, gd.M0(2131752698, null));
            c10.f37023r = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = y.d(this.currentAccount).f18539b;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ?? obj2 = new Object();
            obj2.f18493a = (TL_account.TL_businessChatLink) obj;
            l41 l41Var2 = new l41(29);
            l41Var2.H = obj2;
            arrayList.add(l41Var2);
        }
        z41Var.U();
        TLRPC.User f10 = j10.i(this.currentAccount).f();
        String s5 = a8.p0.s(new StringBuilder(), mp.u1(this.currentAccount).X2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String o4 = o10.o(f10);
        if (o4 != null) {
            arrayList3.add(s5 + o4);
        }
        ArrayList v = i5.r(this.currentAccount).v(6);
        ArrayList v10 = i5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f10.phone) && v != null && v10 != null && (f0(v) != 1 || f0(v10) != 2)) {
            StringBuilder n10 = p5.c.n(s5, "+");
            n10.append(f10.phone);
            arrayList3.add(n10.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                a02 = gd.a0(null, null, 2131752693, arrayList3.get(0), arrayList3.get(1));
            } else {
                a02 = gd.a0(null, null, 2131752694, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a02);
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                String str = (String) obj3;
                int indexOf = a02.indexOf(str);
                if (indexOf > -1) {
                    o4 o4Var = new o4(p5.c.k("https://", str), (dz0) null);
                    o4Var.f37953f = this;
                    spannableString.setSpan(o4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(l41.C(spannableString));
        }
    }

    @Override
    public final CharSequence a0() {
        return gd.M0(2131752699, null);
    }

    @Override
    public final void b0(l41 l41Var, View view) {
        if (l41Var.d == 1) {
            y d = y.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f18538a).sendRequest(createbusinesschatlink, new x(d, 1));
        } else if (l41Var.f56589a == 29) {
            Object obj = l41Var.H;
            if (obj instanceof u) {
                Bundle f10 = p5.c.f(6, "chatMode");
                f10.putString("business_link", ((u) obj).f18493a.link);
                presentFragment(new bn(f10));
            }
        }
    }

    @Override
    public final boolean c0(l41 l41Var, View view) {
        if (l41Var.f56589a == 29) {
            Object obj = l41Var.H;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).f18493a;
                y60 I = y60.I(this, view);
                I.c(2131232105, gd.M0(2131751756, null), new hi.k(tL_businessChatLink, 29), false);
                I.c(2131232365, gd.M0(2131748733, null), new Runnable(this) {
                    public final v f18411b;

                    {
                        this.f18411b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18411b;
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
                                String M0 = gd.M0(2131752696, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                                u1Var.S = M0;
                                u1Var.U = gd.M0(2131752697, null);
                                alertDialog$Builder.k(gd.M0(2131746126, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    u6.U(textView, n6.f29637q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232118, gd.M0(2131746083, null), new Runnable(this) {
                    public final v f18411b;

                    {
                        this.f18411b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18411b;
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
                                String M0 = gd.M0(2131752696, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                                u1Var.S = M0;
                                u1Var.U = gd.M0(2131752697, null);
                                alertDialog$Builder.k(gd.M0(2131746126, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    u6.U(textView, n6.f29637q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232110, gd.M0(2131751587, null), new Runnable(this) {
                    public final v f18411b;

                    {
                        this.f18411b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18411b;
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
                                String M0 = gd.M0(2131752696, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                                u1Var.S = M0;
                                u1Var.U = gd.M0(2131752697, null);
                                alertDialog$Builder.k(gd.M0(2131746126, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    u6.U(textView, n6.f29637q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                I.X(this.f33530a.U0(view, false));
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
        this.simpleActionBar.setTitle(gd.M0(2131752699, null));
        this.f33531b.setBackground(null);
        this.f33530a.r1();
        this.f33530a.setSectionsDrawBackground(true);
        this.f33530a.f34607g3.f42809r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if (i7 != ks.J1 && i7 != ks.f25141k0) {
            if (i7 == ks.K1) {
                Bundle f10 = p5.c.f(6, "chatMode");
                f10.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new bn(f10));
                return;
            } else if (i7 == ks.L1) {
                y.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        d6 d6Var = this.f33530a;
        if (d6Var != null && (z41Var = d6Var.f34607g3) != null) {
            z41Var.O(true);
        }
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f33530a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.u1 u1Var = f18499e;
        if (u1Var != null && u1Var.isShowing()) {
            if (z10) {
                f18499e.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.J1);
        getNotificationCenter().c(this, ks.K1);
        getNotificationCenter().c(this, ks.L1);
        getNotificationCenter().c(this, ks.f25141k0);
        y d = y.d(this.currentAccount);
        if (!d.d) {
            d.e(true, true);
        } else {
            d.e(false, true);
        }
        i5.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.J1);
        getNotificationCenter().n(this, ks.K1);
        getNotificationCenter().n(this, ks.L1);
        getNotificationCenter().n(this, ks.f25141k0);
        gc.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
