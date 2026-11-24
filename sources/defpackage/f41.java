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
public final class f41 extends n5c implements gk7 {
    public static hd e;

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

    public static void f0(Activity activity, int i, TL_account.TL_businessChatLink tL_businessChatLink, wjb wjbVar) {
        View view;
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        d Q = LaunchActivity.Q();
        Activity W = gl.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof cja) && ((cja) Q.getFragmentView()).Q() > gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        hd[] hdVarArr = new hd[1];
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String M0 = k96.M0(2131752687, null);
        hd hdVar = alertDialog$Builder2.a;
        hdVar.S = M0;
        c41 c41Var = new c41(activity, wjbVar);
        hq6.d0(i).O(gl.F0(), true);
        c41Var.setInputType(49153);
        c41Var.setTextSize(1, 18.0f);
        c41Var.setText(tL_businessChatLink.title);
        int i2 = bkb.i5;
        zkb.X(c41Var, i2, wjbVar);
        zkb.l(c41Var, 34, bkb.Ni, wjbVar);
        zkb.l(c41Var, 30, bkb.Me, null);
        c41Var.setHintText(k96.M0(2131752689, null));
        c41Var.setSingleLine(true);
        c41Var.setFocusable(true);
        zkb.F(c41Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        c41Var.setImeOptions(6);
        c41Var.setBackgroundDrawable(null);
        c41Var.setPadding(0, 0, gl.L(42.0f), 0);
        LinearLayout m = ir2.m(activity, 1);
        TextView textView = new TextView(activity);
        zkb.X(textView, i2, wjbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(k96.M0(2131752688, null));
        m.addView(textView, nme.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        m.addView(c41Var, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(m);
        hdVar.a = gl.L(292.0f);
        c41Var.setOnEditorActionListener(new xf(c41Var, i, tL_businessChatLink, hdVarArr, view, (byte) 1));
        alertDialog$Builder2.j(k96.M0(2131751342, null), new yf(c41Var, i, tL_businessChatLink, (byte) 1));
        alertDialog$Builder2.g(k96.M0(2131752577, null), new qm0((byte) 13));
        if (z) {
            e = hdVar;
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new b41(view, (byte) 0));
            e.setOnShowListener(new jg(c41Var, (byte) 2));
            e.q(250L);
        } else {
            hdVar.P = new x0(view, c41Var, (byte) 11);
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new n1(c41Var, (byte) 9));
            hdVarArr[0].setOnShowListener(new z31(view, c41Var, (byte) 0));
            hdVarArr[0].show();
        }
        hdVarArr[0].k0 = false;
        c41Var.setSelection(c41Var.getText().length());
    }

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        String a0;
        String M0 = k96.M0(2131752698, null);
        String M02 = k96.M0(2131752691, null);
        c4c c4cVar = new c4c(2);
        c4cVar.m = M0;
        c4cVar.p = M02;
        c4cVar.k = 2131623940;
        arrayList.add(c4cVar);
        l5cVar.V();
        j41 d = j41.d(this.currentAccount);
        if (d.b.size() < na7.q1(d.a).k4.m2.f()) {
            c4c c = c4c.c(1, 2131231844, k96.M0(2131752697, null));
            c.r = true;
            arrayList.add(c);
        }
        ArrayList arrayList2 = j41.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ?? obj2 = new Object();
            obj2.a = (TL_account.TL_businessChatLink) obj;
            c4c c4cVar2 = new c4c(29);
            c4cVar2.H = obj2;
            arrayList.add(c4cVar2);
        }
        l5cVar.U();
        TLRPC.User f = y6c.h(this.currentAccount).f();
        String j = b00.j(new StringBuilder(), na7.q1(this.currentAccount).N2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String p = l7c.p(f);
        if (p != null) {
            arrayList3.add(j.concat(p));
        }
        ArrayList v = qu2.r(this.currentAccount).v(6);
        ArrayList v2 = qu2.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f.phone) && v != null && v2 != null && (c0(v) != 1 || c0(v2) != 2)) {
            StringBuilder k = b00.k(j, "+");
            k.append(f.phone);
            arrayList3.add(k.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                a0 = k96.a0(null, null, 2131752692, arrayList3.get(0), arrayList3.get(1));
            } else {
                a0 = k96.a0(null, null, 2131752693, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(a0);
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj3 = arrayList3.get(i);
                i++;
                String str = (String) obj3;
                int indexOf = a0.indexOf(str);
                if (indexOf > -1) {
                    ui uiVar = new ui(b00.h("https://", str), (vib) null);
                    uiVar.f = this;
                    spannableString.setSpan(uiVar, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(c4c.C(spannableString));
        }
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131752698, null);
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        if (c4cVar.a == 29) {
            Object obj = c4cVar.H;
            if (obj instanceof e41) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((e41) obj).a;
                cs5 I = cs5.I(this, view);
                I.b(2131232108, k96.M0(2131751755, null), new nv0(tL_businessChatLink, (byte) 8), false);
                I.b(2131232368, k96.M0(2131748733, null), new Runnable(this) {
                    public final f41 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        f41 f41Var = this.b;
                        switch (b) {
                            case 0:
                                Intent intent = new Intent(f41Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                f41Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                f41Var.d0(tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f41Var.getResourceProvider(), f41Var.getParentActivity());
                                String M0 = k96.M0(2131752695, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131752696, null);
                                alertDialog$Builder.j(k96.M0(2131746128, null), new q31(f41Var, tL_businessChatLink2, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                f41Var.showDialog(hdVar);
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, f41Var.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.b(2131232121, k96.M0(2131746085, null), new Runnable(this) {
                    public final f41 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        f41 f41Var = this.b;
                        switch (b) {
                            case 0:
                                Intent intent = new Intent(f41Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                f41Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                f41Var.d0(tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f41Var.getResourceProvider(), f41Var.getParentActivity());
                                String M0 = k96.M0(2131752695, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131752696, null);
                                alertDialog$Builder.j(k96.M0(2131746128, null), new q31(f41Var, tL_businessChatLink2, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                f41Var.showDialog(hdVar);
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, f41Var.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.b(2131232113, k96.M0(2131751586, null), new Runnable(this) {
                    public final f41 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        f41 f41Var = this.b;
                        switch (b) {
                            case 0:
                                Intent intent = new Intent(f41Var.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                f41Var.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                f41Var.d0(tL_businessChatLink2);
                                return;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f41Var.getResourceProvider(), f41Var.getParentActivity());
                                String M0 = k96.M0(2131752695, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131752696, null);
                                alertDialog$Builder.j(k96.M0(2131746128, null), new q31(f41Var, tL_businessChatLink2, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                f41Var.showDialog(hdVar);
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, f41Var.getResourceProvider());
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
        this.simpleActionBar.setTitle(k96.M0(2131752698, null));
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    public final void d0(TL_account.TL_businessChatLink tL_businessChatLink) {
        f0(getParentActivity(), this.currentAccount, tL_businessChatLink, this.resourceProvider);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if (i != kk7.I1 && i != kk7.j0) {
            if (i == kk7.J1) {
                Bundle j = ls6.j(6, "chatMode");
                j.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new mu1(j));
                return;
            } else if (i == kk7.K1) {
                j41.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        va vaVar = this.a;
        if (vaVar != null && (l5cVar = vaVar.g3) != null) {
            l5cVar.O(true);
        }
    }

    public final void e0(TL_account.TL_businessChatLink tL_businessChatLink) {
        j41.d(this.currentAccount).a(this, tL_businessChatLink.link);
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        hd hdVar = e;
        if (hdVar != null && hdVar.isShowing()) {
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
        getNotificationCenter().b(this, kk7.I1);
        getNotificationCenter().b(this, kk7.J1);
        getNotificationCenter().b(this, kk7.K1);
        getNotificationCenter().b(this, kk7.j0);
        j41 d = j41.d(this.currentAccount);
        if (!d.d) {
            d.e(true, true);
        } else {
            d.e(false, true);
        }
        qu2.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.I1);
        getNotificationCenter().n(this, kk7.J1);
        getNotificationCenter().n(this, kk7.K1);
        getNotificationCenter().n(this, kk7.j0);
        m21.e();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
