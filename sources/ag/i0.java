package ag;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.m5;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import w7.b6;
public final class i0 extends r51 implements us {
    public static org.telegram.ui.ActionBar.x1 e;

    public static void c0(i0 i0Var, TL_account.TL_businessChatLink tL_businessChatLink) {
        f0(i0Var.getParentActivity(), i0Var.currentAccount, tL_businessChatLink, i0Var.resourceProvider);
    }

    public static int e0(ArrayList arrayList) {
        boolean z10 = true;
        boolean z11 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i10);
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

    public static void f0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, p6 p6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.i0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof uu0) && ((uu0) Q.getFragmentView()).Q() > org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String L0 = cd.L0(2131752699, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.f20134a;
        x1Var.R = L0;
        f0 f0Var = new f0(activity, p6Var);
        ui.b0(i10).M(org.telegram.messenger.i0.G0(), true);
        f0Var.setInputType(49153);
        f0Var.setTextSize(1, 18.0f);
        f0Var.setText(tL_businessChatLink.title);
        int i11 = t6.f21037j5;
        a7.V(f0Var, i11, p6Var);
        a7.m(f0Var, 34, t6.Li, p6Var);
        a7.m(f0Var, 30, t6.Ke, null);
        f0Var.setHintText(cd.L0(2131752701, null));
        f0Var.setSingleLine(true);
        f0Var.setFocusable(true);
        a7.G(f0Var, t6.f21058k6, t6.f21076l6, t6.f21153p7, p6Var);
        f0Var.setImeOptions(6);
        f0Var.setBackgroundDrawable(null);
        f0Var.setPadding(0, 0, org.telegram.messenger.i0.L(42.0f), 0);
        LinearLayout e7 = m5.e(activity, 1);
        TextView textView = new TextView(activity);
        a7.V(textView, i11, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(cd.L0(2131752700, null));
        e7.addView(textView, b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(f0Var, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e7);
        x1Var.f21468a = org.telegram.messenger.i0.L(292.0f);
        f0Var.setOnEditorActionListener(new a0(f0Var, i10, tL_businessChatLink, x1VarArr, view, 0));
        alertDialog$Builder2.k(cd.L0(2131751355, null), new b0(f0Var, i10, tL_businessChatLink, 0));
        alertDialog$Builder2.h(cd.L0(2131752589, null), new aa.a(6));
        if (z10) {
            e = x1Var;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new c0(0, view));
            e.setOnShowListener(new d0(f0Var, 0));
            e.r(250L);
        } else {
            x1Var.O = new e0(0, view, f0Var);
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new x(f0Var, 0));
            x1VarArr[0].setOnShowListener(new y(view, f0Var, 0));
            x1VarArr[0].show();
        }
        x1VarArr[0].f21490j0 = false;
        f0Var.setSelection(f0Var.getText().length());
    }

    @Override
    public final void Y(ArrayList arrayList, p51 p51Var) {
        String a02;
        String L0 = cd.L0(2131752710, null);
        String L02 = cd.L0(2131752703, null);
        a51 a51Var = new a51(2);
        a51Var.f24292l = L0;
        a51Var.f24295o = L02;
        a51Var.f24291k = 2131623940;
        arrayList.add(a51Var);
        p51Var.V();
        s0 d = s0.d(this.currentAccount);
        if (d.f702b.size() < vp.r1(d.f701a).I5) {
            a51 c10 = a51.c(1, 2131231839, cd.L0(2131752709, null));
            c10.f24297q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = s0.d(this.currentAccount).f702b;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ?? obj2 = new Object();
            obj2.f539a = (TL_account.TL_businessChatLink) obj;
            a51 a51Var2 = new a51(29);
            a51Var2.G = obj2;
            arrayList.add(a51Var2);
        }
        p51Var.U();
        TLRPC.User f7 = d20.i(this.currentAccount).f();
        String r10 = a1.g.r(new StringBuilder(), vp.r1(this.currentAccount).U2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String n10 = h20.n(f7);
        if (n10 != null) {
            arrayList3.add(r10 + n10);
        }
        ArrayList v = i5.r(this.currentAccount).v(6);
        ArrayList v10 = i5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f7.phone) && v != null && v10 != null && (e0(v) != 1 || e0(v10) != 2)) {
            StringBuilder i12 = sc.e.i(r10, "+");
            i12.append(f7.phone);
            arrayList3.add(i12.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                a02 = cd.a0(null, null, 2131752704, arrayList3.get(0), arrayList3.get(1));
            } else {
                a02 = cd.a0(null, null, 2131752705, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a02);
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                String str = (String) obj3;
                int indexOf = a02.indexOf(str);
                if (indexOf > -1) {
                    f4 f4Var = new f4(sc.e.h("https://", str), (yz0) null);
                    f4Var.f25957f = this;
                    spannableString.setSpan(f4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(a51.C(spannableString));
        }
    }

    @Override
    public final CharSequence Z() {
        return cd.L0(2131752710, null);
    }

    @Override
    public final void a0(a51 a51Var, View view) {
        if (a51Var.d == 1) {
            s0 d = s0.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f701a).sendRequest(createbusinesschatlink, new m0(d, 1));
        } else if (a51Var.f7680a == 29) {
            Object obj = a51Var.G;
            if (obj instanceof h0) {
                Bundle i10 = org.telegram.ui.Cells.f1.i(6, "chatMode");
                i10.putString("business_link", ((h0) obj).f539a.link);
                presentFragment(new un(i10));
            }
        }
    }

    @Override
    public final boolean b0(a51 a51Var, View view) {
        if (a51Var.f7680a == 29) {
            Object obj = a51Var.G;
            if (obj instanceof h0) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((h0) obj).f539a;
                z60 H = z60.H(this, view);
                H.c(2131232102, cd.L0(2131751767, null), new a3.d(tL_businessChatLink, 4), false);
                H.c(2131232362, cd.L0(2131748935, null), new Runnable(this) {
                    public final i0 f814b;

                    {
                        this.f814b = this;
                    }

                    @Override
                    public final void run() {
                        int i10 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        i0 i0Var = this.f814b;
                        switch (i10) {
                            case 0:
                                i0Var.getClass();
                                Intent intent = new Intent(i0Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                i0Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                i0.c0(i0Var, tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getParentActivity(), i0Var.getResourceProvider());
                                String L0 = cd.L0(2131752707, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = L0;
                                x1Var.T = cd.L0(2131752708, null);
                                alertDialog$Builder.k(cd.L0(2131746336, null), new m(1, i0Var, tL_businessChatLink2));
                                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                                i0Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    a7.V(textView, t6.f21170q7, i0Var.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232115, cd.L0(2131746293, null), new Runnable(this) {
                    public final i0 f814b;

                    {
                        this.f814b = this;
                    }

                    @Override
                    public final void run() {
                        int i10 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        i0 i0Var = this.f814b;
                        switch (i10) {
                            case 0:
                                i0Var.getClass();
                                Intent intent = new Intent(i0Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                i0Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                i0.c0(i0Var, tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getParentActivity(), i0Var.getResourceProvider());
                                String L0 = cd.L0(2131752707, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = L0;
                                x1Var.T = cd.L0(2131752708, null);
                                alertDialog$Builder.k(cd.L0(2131746336, null), new m(1, i0Var, tL_businessChatLink2));
                                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                                i0Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    a7.V(textView, t6.f21170q7, i0Var.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232107, cd.L0(2131751599, null), new Runnable(this) {
                    public final i0 f814b;

                    {
                        this.f814b = this;
                    }

                    @Override
                    public final void run() {
                        int i10 = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        i0 i0Var = this.f814b;
                        switch (i10) {
                            case 0:
                                i0Var.getClass();
                                Intent intent = new Intent(i0Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                i0Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                i0.c0(i0Var, tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getParentActivity(), i0Var.getResourceProvider());
                                String L0 = cd.L0(2131752707, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = L0;
                                x1Var.T = cd.L0(2131752708, null);
                                alertDialog$Builder.k(cd.L0(2131746336, null), new m(1, i0Var, tL_businessChatLink2));
                                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                                i0Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    a7.V(textView, t6.f21170q7, i0Var.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f29837a.U0(view, false));
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
        this.simpleActionBar.setTitle(cd.L0(2131752710, null));
        this.f29838b.setBackground(null);
        this.f29837a.r1();
        this.f29837a.setSectionsDrawBackground(true);
        this.f29837a.f30819f3.f29295r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if (i10 != zs.J1 && i10 != zs.f19638k0) {
            if (i10 == zs.K1) {
                Bundle i12 = org.telegram.ui.Cells.f1.i(6, "chatMode");
                i12.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new un(i12));
                return;
            } else if (i10 == zs.L1) {
                s0.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        ii iiVar = this.f29837a;
        if (iiVar != null && (p51Var = iiVar.f30819f3) != null) {
            p51Var.O(true);
        }
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.f29837a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.x1 x1Var = e;
        if (x1Var != null && x1Var.isShowing()) {
            if (z10) {
                e.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.J1);
        getNotificationCenter().c(this, zs.K1);
        getNotificationCenter().c(this, zs.L1);
        getNotificationCenter().c(this, zs.f19638k0);
        s0 d = s0.d(this.currentAccount);
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
        getNotificationCenter().n(this, zs.J1);
        getNotificationCenter().n(this, zs.K1);
        getNotificationCenter().n(this, zs.L1);
        getNotificationCenter().n(this, zs.f19638k0);
        wb.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
