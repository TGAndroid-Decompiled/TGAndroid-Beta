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
import bi.v3;
import c8.ja;
import di.r9;
import java.util.ArrayList;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class v extends r41 implements is {
    public static org.telegram.ui.ActionBar.t1 f18119e;

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

    public static void g0(Activity activity, int i7, TL_account.TL_businessChatLink tL_businessChatLink, e6 e6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        e2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof st0) && ((st0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String M0 = hd.M0(2131752699, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28392a;
        t1Var.S = M0;
        s sVar = new s(activity, e6Var);
        si.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i10 = j6.f28957j5;
        q6.U(sVar, i10, e6Var);
        q6.l(sVar, 34, j6.Oi, e6Var);
        q6.l(sVar, 30, j6.Ne, null);
        sVar.setHintText(hd.M0(2131752701, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        q6.F(sVar, j6.f28978k6, j6.f28996l6, j6.f29070p7, e6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        q6.U(textView, i10, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0(2131752700, null));
        e10.addView(textView, ja.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(sVar, ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e10);
        t1Var.f29614a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new q(sVar, i7, tL_businessChatLink, t1VarArr, view, 0));
        alertDialog$Builder2.k(hd.M0(2131751354, null), new ai.q1(sVar, i7, tL_businessChatLink, 2));
        alertDialog$Builder2.h(hd.M0(2131752589, null), new i0.b(11));
        if (z10) {
            f18119e = t1Var;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(0, view));
            f18119e.setOnShowListener(new bi.l(sVar, 2));
            f18119e.r(250L);
        } else {
            t1Var.P = new ai.u1(21, view, sVar);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r9(sVar, 5));
            t1VarArr[0].setOnShowListener(new o(view, sVar, 0));
            t1VarArr[0].show();
        }
        t1VarArr[0].f29639k0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        String a02;
        String M0 = hd.M0(2131752710, null);
        String M02 = hd.M0(2131752703, null);
        b41 b41Var = new b41(2);
        b41Var.f33181l = M0;
        b41Var.f33184o = M02;
        b41Var.f33180k = 2131623940;
        arrayList.add(b41Var);
        p41Var.V();
        y d = y.d(this.currentAccount);
        if (d.f18144b.size() < np.s1(d.f18143a).I5) {
            b41 c10 = b41.c(1, 2131231840, hd.M0(2131752709, null));
            c10.f33186q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = y.d(this.currentAccount).f18144b;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ?? obj2 = new Object();
            obj2.f18109a = (TL_account.TL_businessChatLink) obj;
            b41 b41Var2 = new b41(29);
            b41Var2.G = obj2;
            arrayList.add(b41Var2);
        }
        p41Var.U();
        TLRPC.User f10 = m10.i(this.currentAccount).f();
        String s5 = a8.p0.s(new StringBuilder(), np.s1(this.currentAccount).V2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String n10 = q10.n(f10);
        if (n10 != null) {
            arrayList3.add(s5 + n10);
        }
        ArrayList v = g5.r(this.currentAccount).v(6);
        ArrayList v10 = g5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f10.phone) && v != null && v10 != null && (f0(v) != 1 || f0(v10) != 2)) {
            StringBuilder m10 = r.b.m(s5, "+");
            m10.append(f10.phone);
            arrayList3.add(m10.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                a02 = hd.a0(null, null, 2131752704, arrayList3.get(0), arrayList3.get(1));
            } else {
                a02 = hd.a0(null, null, 2131752705, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a02);
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                String str = (String) obj3;
                int indexOf = a02.indexOf(str);
                if (indexOf > -1) {
                    g4 g4Var = new g4(r.b.k("https://", str), (wy0) null);
                    g4Var.f34790f = this;
                    spannableString.setSpan(g4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(b41.C(spannableString));
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131752710, null);
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        if (b41Var.d == 1) {
            y d = y.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f18143a).sendRequest(createbusinesschatlink, new x(d, 1));
        } else if (b41Var.f56015a == 29) {
            Object obj = b41Var.G;
            if (obj instanceof u) {
                Bundle f10 = r.b.f(6, "chatMode");
                f10.putString("business_link", ((u) obj).f18109a.link);
                presentFragment(new an(f10));
            }
        }
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        if (b41Var.f56015a == 29) {
            Object obj = b41Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).f18109a;
                m60 H = m60.H(this, view);
                H.c(2131232104, hd.M0(2131751767, null), new hi.e1(tL_businessChatLink, 25), false);
                H.c(2131232364, hd.M0(2131748925, null), new Runnable(this) {
                    public final v f18031b;

                    {
                        this.f18031b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18031b;
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
                                String M0 = hd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                t1Var.S = M0;
                                t1Var.U = hd.M0(2131752708, null);
                                alertDialog$Builder.k(hd.M0(2131746321, null), new ab.g(24, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    q6.U(textView, j6.f29090q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232117, hd.M0(2131746278, null), new Runnable(this) {
                    public final v f18031b;

                    {
                        this.f18031b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18031b;
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
                                String M0 = hd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                t1Var.S = M0;
                                t1Var.U = hd.M0(2131752708, null);
                                alertDialog$Builder.k(hd.M0(2131746321, null), new ab.g(24, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    q6.U(textView, j6.f29090q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232109, hd.M0(2131751598, null), new Runnable(this) {
                    public final v f18031b;

                    {
                        this.f18031b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18031b;
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
                                String M0 = hd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                t1Var.S = M0;
                                t1Var.U = hd.M0(2131752708, null);
                                alertDialog$Builder.k(hd.M0(2131746321, null), new ab.g(24, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    q6.U(textView, j6.f29090q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f38882a.U0(view, false));
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
        this.simpleActionBar.setTitle(hd.M0(2131752710, null));
        this.f38883b.setBackground(null);
        this.f38882a.r1();
        this.f38882a.setSectionsDrawBackground(true);
        this.f38882a.f39895g3.f38201r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 != ns.J1 && i7 != ns.f25521k0) {
            if (i7 == ns.K1) {
                Bundle f10 = r.b.f(6, "chatMode");
                f10.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new an(f10));
                return;
            } else if (i7 == ns.L1) {
                y.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        v3 v3Var = this.f38882a;
        if (v3Var != null && (p41Var = v3Var.f39895g3) != null) {
            p41Var.O(true);
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f38882a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.t1 t1Var = f18119e;
        if (t1Var != null && t1Var.isShowing()) {
            if (z10) {
                f18119e.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.J1);
        getNotificationCenter().c(this, ns.K1);
        getNotificationCenter().c(this, ns.L1);
        getNotificationCenter().c(this, ns.f25521k0);
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
        getNotificationCenter().n(this, ns.J1);
        getNotificationCenter().n(this, ns.K1);
        getNotificationCenter().n(this, ns.L1);
        getNotificationCenter().n(this, ns.f25521k0);
        xb.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
