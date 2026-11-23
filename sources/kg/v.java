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
import bi.f6;
import c8.ma;
import di.u9;
import hi.e9;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.p4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class v extends e51 implements gs {
    public static org.telegram.ui.ActionBar.t1 f18539e;

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

    public static void g0(Activity activity, int i7, TL_account.TL_businessChatLink tL_businessChatLink, h6 h6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        g2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof du0) && ((du0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String N0 = hd.N0(2131752687, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28777a;
        t1Var.S = N0;
        s sVar = new s(activity, h6Var);
        si.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i10 = m6.f29489j5;
        t6.U(sVar, i10, h6Var);
        t6.l(sVar, 34, m6.Oi, h6Var);
        t6.l(sVar, 30, m6.Ne, null);
        sVar.setHintText(hd.N0(2131752689, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        t6.F(sVar, m6.f29510k6, m6.f29528l6, m6.f29602p7, h6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = f3.f(activity, 1);
        TextView textView = new TextView(activity);
        t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.N0(2131752688, null));
        f10.addView(textView, ma.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(sVar, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        t1Var.f30010a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new q(sVar, i7, tL_businessChatLink, t1VarArr, view, 0));
        alertDialog$Builder2.k(hd.N0(2131751342, null), new ai.u1(sVar, i7, tL_businessChatLink, 3));
        alertDialog$Builder2.h(hd.N0(2131752577, null), new e9(12));
        if (z10) {
            f18539e = t1Var;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(0, view));
            f18539e.setOnShowListener(new bi.l(sVar, 2));
            f18539e.r(250L);
        } else {
            t1Var.P = new ai.y1(23, view, sVar);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new u9(sVar, 5));
            t1VarArr[0].setOnShowListener(new o(view, sVar, 0));
            t1VarArr[0].show();
        }
        t1VarArr[0].f30035k0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        String a02;
        String N0 = hd.N0(2131752698, null);
        String N02 = hd.N0(2131752691, null);
        o41 o41Var = new o41(2);
        o41Var.f38092m = N0;
        o41Var.f38095p = N02;
        o41Var.f38090k = 2131623940;
        arrayList.add(o41Var);
        c51Var.V();
        z d = z.d(this.currentAccount);
        if (d.f18579b.size() < np.u1(d.f18578a).K5) {
            o41 c10 = o41.c(1, 2131231841, hd.N0(2131752697, null));
            c10.f38097r = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).f18579b;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ?? obj2 = new Object();
            obj2.f18523a = (TL_account.TL_businessChatLink) obj;
            o41 o41Var2 = new o41(29);
            o41Var2.H = obj2;
            arrayList.add(o41Var2);
        }
        c51Var.U();
        TLRPC.User f10 = k10.i(this.currentAccount).f();
        String s5 = a8.p0.s(new StringBuilder(), np.u1(this.currentAccount).X2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String o4 = p10.o(f10);
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
                a02 = hd.a0(null, null, 2131752692, arrayList3.get(0), arrayList3.get(1));
            } else {
                a02 = hd.a0(null, null, 2131752693, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a02);
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                String str = (String) obj3;
                int indexOf = a02.indexOf(str);
                if (indexOf > -1) {
                    p4 p4Var = new p4(p5.c.k("https://", str), (fz0) null);
                    p4Var.f38483f = this;
                    spannableString.setSpan(p4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(o41.C(spannableString));
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131752698, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        if (o41Var.d == 1) {
            z d = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f18578a).sendRequest(createbusinesschatlink, new x(d, 1));
        } else if (o41Var.f56634a == 29) {
            Object obj = o41Var.H;
            if (obj instanceof u) {
                Bundle f10 = p5.c.f(6, "chatMode");
                f10.putString("business_link", ((u) obj).f18523a.link);
                presentFragment(new bn(f10));
            }
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        if (o41Var.f56634a == 29) {
            Object obj = o41Var.H;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).f18523a;
                a70 I = a70.I(this, view);
                I.c(2131232105, hd.N0(2131751755, null), new hi.l(tL_businessChatLink, 29), false);
                I.c(2131232365, hd.N0(2131748732, null), new Runnable(this) {
                    public final v f18444b;

                    {
                        this.f18444b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18444b;
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
                                String N0 = hd.N0(2131752695, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                t1Var.S = N0;
                                t1Var.U = hd.N0(2131752696, null);
                                alertDialog$Builder.k(hd.N0(2131746125, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    t6.U(textView, m6.f29622q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232118, hd.N0(2131746082, null), new Runnable(this) {
                    public final v f18444b;

                    {
                        this.f18444b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18444b;
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
                                String N0 = hd.N0(2131752695, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                t1Var.S = N0;
                                t1Var.U = hd.N0(2131752696, null);
                                alertDialog$Builder.k(hd.N0(2131746125, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    t6.U(textView, m6.f29622q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232110, hd.N0(2131751586, null), new Runnable(this) {
                    public final v f18444b;

                    {
                        this.f18444b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18444b;
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
                                String N0 = hd.N0(2131752695, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                t1Var.S = N0;
                                t1Var.U = hd.N0(2131752696, null);
                                alertDialog$Builder.k(hd.N0(2131746125, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    t6.U(textView, m6.f29622q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                I.X(this.f34681a.U0(view, false));
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
        this.simpleActionBar.setTitle(hd.N0(2131752698, null));
        this.f34682b.setBackground(null);
        this.f34681a.r1();
        this.f34681a.setSectionsDrawBackground(true);
        this.f34681a.f35790g3.f34062r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 != ls.J1 && i7 != ls.f25333k0) {
            if (i7 == ls.K1) {
                Bundle f10 = p5.c.f(6, "chatMode");
                f10.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new bn(f10));
                return;
            } else if (i7 == ls.L1) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        f6 f6Var = this.f34681a;
        if (f6Var != null && (c51Var = f6Var.f35790g3) != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34681a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.t1 t1Var = f18539e;
        if (t1Var != null && t1Var.isShowing()) {
            if (z10) {
                f18539e.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ls.J1);
        getNotificationCenter().c(this, ls.K1);
        getNotificationCenter().c(this, ls.L1);
        getNotificationCenter().c(this, ls.f25333k0);
        z d = z.d(this.currentAccount);
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
        getNotificationCenter().n(this, ls.J1);
        getNotificationCenter().n(this, ls.K1);
        getNotificationCenter().n(this, ls.L1);
        getNotificationCenter().n(this, ls.f25333k0);
        gc.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
