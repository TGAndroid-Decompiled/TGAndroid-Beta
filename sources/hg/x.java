package hg;

import ai.f5;
import ai.g3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.rc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ul;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.m4;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
import w7.x5;
public final class x extends y51 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 d;

    public static void Y(x xVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(xVar.getParentActivity(), xVar.currentAccount, tL_businessChatLink, xVar.resourceProvider);
    }

    public static int a0(ArrayList arrayList) {
        char c10 = 65535;
        boolean z10 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i10);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && c10 == 65535) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                    c10 = 0;
                                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                    c10 = 1;
                                } else {
                                    c10 = 2;
                                }
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (c10 == 0 || (c10 == 65535 && z10)) {
            return 0;
        }
        if (c10 == 2) {
            return 2;
        }
        return 1;
    }

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, d6 d6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, d6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, d6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        b2Var.R = string;
        u uVar = new u(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        uVar.setInputType(49153);
        uVar.setTextSize(1, 18.0f);
        uVar.setText(tL_businessChatLink.title);
        int i11 = h6.f18895j5;
        uVar.setTextColor(h6.v0(i11, d6Var));
        uVar.setHintColor(h6.v0(h6.Xh, d6Var));
        uVar.setCursorColor(h6.w0(null, h6.Wd, false));
        uVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        uVar.setSingleLine(true);
        uVar.setFocusable(true);
        uVar.setLineColors(h6.v0(h6.f18916k6, d6Var), h6.v0(h6.f18934l6, d6Var), h6.v0(h6.f19008p7, d6Var));
        uVar.setImeOptions(6);
        uVar.setBackgroundDrawable(null);
        uVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.z0.f(activity, 1);
        TextView textView = new TextView(activity);
        ul.o(i11, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f7.addView(textView, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(uVar, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(f7);
        b2Var.f18447a = AndroidUtilities.dp(292.0f);
        uVar.setOnEditorActionListener(new q(uVar, i10, tL_businessChatLink, b2VarArr, view2, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new gg.d2(uVar, i10, tL_businessChatLink, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r(0));
        if (z10) {
            d = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new s(0, view2));
            d.setOnShowListener(new t(0, uVar));
            d.q(250L);
        } else {
            b2Var.O = new g3(16, view2, uVar);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new f5(uVar, 2));
            b2VarArr[0].setOnShowListener(new o(view2, uVar, 0));
            b2VarArr[0].show();
        }
        b2VarArr[0].f18460h0 = false;
        uVar.setSelection(uVar.getText().length());
    }

    @Override
    public final void U(ArrayList arrayList, v51 v51Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        h51 h51Var = new h51(2);
        h51Var.f24507l = string;
        h51Var.f24510o = string2;
        h51Var.f24506k = i10;
        arrayList.add(h51Var);
        v51Var.U();
        a0 d10 = a0.d(this.currentAccount);
        if (d10.f10193b.size() < MessagesController.getInstance(d10.f10192a).businessChatLinksLimit) {
            h51 c10 = h51.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f24512q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = a0.d(this.currentAccount).f10193b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f10438a = (TL_account.TL_businessChatLink) obj;
            h51 h51Var2 = new h51(29);
            h51Var2.G = obj2;
            arrayList.add(h51Var2);
        }
        v51Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String t10 = a4.a.t(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(t10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder h = w.c.h(t10, "+");
            h.append(currentUser.phone);
            arrayList3.add(h.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                formatString = LocaleController.formatString(R.string.BusinessLinksFooterTwoLinks, arrayList3.get(0), arrayList3.get(1));
            } else {
                formatString = LocaleController.formatString(R.string.BusinessLinksFooterOneLink, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(formatString);
            int size2 = arrayList3.size();
            while (i11 < size2) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                String str = (String) obj3;
                int indexOf = formatString.indexOf(str);
                if (indexOf > -1) {
                    m4 m4Var = new m4(q3.i("https://", str), (n01) null);
                    m4Var.f26084f = this;
                    spannableString.setSpan(m4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(h51.B(spannableString));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void W(h51 h51Var, View view) {
        if (h51Var.d == 1) {
            a0 d10 = a0.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.f10192a).sendRequest(createbusinesschatlink, new z(d10, 1));
        } else if (h51Var.f15508a == 29) {
            Object obj = h51Var.G;
            if (obj instanceof w) {
                Bundle e = q3.e(6, "chatMode");
                e.putString("business_link", ((w) obj).f10438a.link);
                presentFragment(new xn(e));
            }
        }
    }

    @Override
    public final boolean X(h51 h51Var, View view) {
        if (h51Var.f15508a == 29) {
            Object obj = h51Var.G;
            if (obj instanceof w) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((w) obj).f10438a;
                o70 H = o70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new rc(tL_businessChatLink, 19), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final x f10366b;

                    {
                        this.f10366b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x xVar = this.f10366b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                x.Y(this.f10366b, tL_businessChatLink);
                                return;
                            default:
                                x xVar2 = this.f10366b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                                xVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(h6.f19026q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final x f10366b;

                    {
                        this.f10366b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x xVar = this.f10366b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                x.Y(this.f10366b, tL_businessChatLink);
                                return;
                            default:
                                x xVar2 = this.f10366b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                                xVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(h6.f19026q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final x f10366b;

                    {
                        this.f10366b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x xVar = this.f10366b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                x.Y(this.f10366b, tL_businessChatLink);
                                return;
                            default:
                                x xVar2 = this.f10366b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                                xVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(h6.f19026q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f30163a.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f30163a.p1();
        x51 x51Var = this.f30163a;
        x51Var.Y2.f28662r = false;
        this.actionBar.z(x51Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle e = q3.e(6, "chatMode");
                e.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new xn(e));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                a0.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        x51 x51Var = this.f30163a;
        if (x51Var != null && (v51Var = x51Var.Y2) != null) {
            v51Var.N(true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.b2 b2Var = d;
        if (b2Var != null && b2Var.isShowing()) {
            if (z10) {
                d.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        a0 d10 = a0.d(this.currentAccount);
        if (!d10.d) {
            d10.e(true, true);
        } else {
            d10.e(false, true);
        }
        ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        qc.e();
        super.onFragmentDestroy();
    }
}
