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
import c8.na;
import di.u9;
import hi.z9;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.i5;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class v extends d51 implements fs {
    public static org.telegram.ui.ActionBar.t1 f18597e;

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
        g2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof cu0) && ((cu0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String N0 = gd.N0(2131752687, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28835a;
        t1Var.S = N0;
        s sVar = new s(activity, i6Var);
        ri.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i10 = n6.f29559j5;
        u6.U(sVar, i10, i6Var);
        u6.l(sVar, 34, n6.Oi, i6Var);
        u6.l(sVar, 30, n6.Ne, null);
        sVar.setHintText(gd.N0(2131752689, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        u6.F(sVar, n6.f29580k6, n6.f29598l6, n6.f29672p7, i6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = f3.f(activity, 1);
        TextView textView = new TextView(activity);
        u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.N0(2131752688, null));
        f10.addView(textView, na.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(sVar, na.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        t1Var.f30068a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new q(sVar, i7, tL_businessChatLink, t1VarArr, view, 0));
        alertDialog$Builder2.k(gd.N0(2131751342, null), new ai.o1(sVar, i7, tL_businessChatLink, 3));
        alertDialog$Builder2.h(gd.N0(2131752577, null), new z9(12));
        if (z10) {
            f18597e = t1Var;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(0, view));
            f18597e.setOnShowListener(new bi.l(sVar, 2));
            f18597e.r(250L);
        } else {
            t1Var.P = new ai.s1(24, view, sVar);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new u9(sVar, 5));
            t1VarArr[0].setOnShowListener(new o(view, sVar, 0));
            t1VarArr[0].show();
        }
        t1VarArr[0].f30093k0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override
    public final void Z(ArrayList arrayList, b51 b51Var) {
        String a02;
        String N0 = gd.N0(2131752698, null);
        String N02 = gd.N0(2131752691, null);
        n41 n41Var = new n41(2);
        n41Var.f37655m = N0;
        n41Var.f37658p = N02;
        n41Var.f37653k = 2131623940;
        arrayList.add(n41Var);
        b51Var.V();
        z d = z.d(this.currentAccount);
        if (d.f18641b.size() < mp.u1(d.f18640a).K5) {
            n41 c10 = n41.c(1, 2131231844, gd.N0(2131752697, null));
            c10.f37660r = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).f18641b;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ?? obj2 = new Object();
            obj2.f18584a = (TL_account.TL_businessChatLink) obj;
            n41 n41Var2 = new n41(29);
            n41Var2.H = obj2;
            arrayList.add(n41Var2);
        }
        b51Var.U();
        TLRPC.User f10 = i10.i(this.currentAccount).f();
        String s5 = a8.p0.s(new StringBuilder(), mp.u1(this.currentAccount).X2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String o4 = n10.o(f10);
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
                a02 = gd.a0(null, null, 2131752692, arrayList3.get(0), arrayList3.get(1));
            } else {
                a02 = gd.a0(null, null, 2131752693, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a02);
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                String str = (String) obj3;
                int indexOf = a02.indexOf(str);
                if (indexOf > -1) {
                    o4 o4Var = new o4(p5.c.k("https://", str), (ez0) null);
                    o4Var.f38007f = this;
                    spannableString.setSpan(o4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(n41.C(spannableString));
        }
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131752698, null);
    }

    @Override
    public final void b0(n41 n41Var, View view) {
        if (n41Var.d == 1) {
            z d = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f18640a).sendRequest(createbusinesschatlink, new y(d, 1));
        } else if (n41Var.f56712a == 29) {
            Object obj = n41Var.H;
            if (obj instanceof u) {
                Bundle f10 = p5.c.f(6, "chatMode");
                f10.putString("business_link", ((u) obj).f18584a.link);
                presentFragment(new bn(f10));
            }
        }
    }

    @Override
    public final boolean c0(n41 n41Var, View view) {
        if (n41Var.f56712a == 29) {
            Object obj = n41Var.H;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).f18584a;
                x60 I = x60.I(this, view);
                I.c(2131232108, gd.N0(2131751755, null), new hi.w(tL_businessChatLink, 29), false);
                I.c(2131232368, gd.N0(2131748732, null), new Runnable(this) {
                    public final v f18502b;

                    {
                        this.f18502b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18502b;
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
                                String N0 = gd.N0(2131752695, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                t1Var.S = N0;
                                t1Var.U = gd.N0(2131752696, null);
                                alertDialog$Builder.k(gd.N0(2131746125, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    u6.U(textView, n6.f29692q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232121, gd.N0(2131746082, null), new Runnable(this) {
                    public final v f18502b;

                    {
                        this.f18502b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18502b;
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
                                String N0 = gd.N0(2131752695, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                t1Var.S = N0;
                                t1Var.U = gd.N0(2131752696, null);
                                alertDialog$Builder.k(gd.N0(2131746125, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    u6.U(textView, n6.f29692q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232113, gd.N0(2131751586, null), new Runnable(this) {
                    public final v f18502b;

                    {
                        this.f18502b = this;
                    }

                    @Override
                    public final void run() {
                        int i7 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.f18502b;
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
                                String N0 = gd.N0(2131752695, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                t1Var.S = N0;
                                t1Var.U = gd.N0(2131752696, null);
                                alertDialog$Builder.k(gd.N0(2131746125, null), new ab.g(22, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    u6.U(textView, n6.f29692q7, vVar.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                I.X(this.f34213a.U0(view, false));
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
        this.simpleActionBar.setTitle(gd.N0(2131752698, null));
        this.f34214b.setBackground(null);
        this.f34213a.r1();
        this.f34213a.setSectionsDrawBackground(true);
        this.f34213a.f35323g3.f33631r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b51 b51Var;
        if (i7 != ks.J1 && i7 != ks.f25238k0) {
            if (i7 == ks.K1) {
                Bundle f10 = p5.c.f(6, "chatMode");
                f10.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new bn(f10));
                return;
            } else if (i7 == ks.L1) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        bi.i6 i6Var = this.f34213a;
        if (i6Var != null && (b51Var = i6Var.f35323g3) != null) {
            b51Var.O(true);
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34213a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.t1 t1Var = f18597e;
        if (t1Var != null && t1Var.isShowing()) {
            if (z10) {
                f18597e.dismiss();
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
        getNotificationCenter().c(this, ks.f25238k0);
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
        getNotificationCenter().n(this, ks.J1);
        getNotificationCenter().n(this, ks.K1);
        getNotificationCenter().n(this, ks.L1);
        getNotificationCenter().n(this, ks.f25238k0);
        fc.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
