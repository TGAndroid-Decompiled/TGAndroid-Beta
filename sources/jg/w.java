package jg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.cb;
import fi.ua;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class w extends n71 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.e2 e;

    public static void Z(w wVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        c0(wVar.getParentActivity(), wVar.currentAccount, tL_businessChatLink, wVar.resourceProvider);
    }

    public static int b0(ArrayList arrayList) {
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

    public static void c0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, u6 u6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        r2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof ww0) && ((ww0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        t tVar = new t(activity, u6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        tVar.setInputType(49153);
        tVar.setTextSize(1, 18.0f);
        tVar.setText(tL_businessChatLink.title);
        int i11 = y6.f23465j5;
        f7.V(tVar, i11, u6Var);
        f7.m(tVar, 34, y6.Xh, u6Var);
        f7.m(tVar, 30, y6.Wd, null);
        tVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        tVar.setSingleLine(true);
        tVar.setFocusable(true);
        f7.G(tVar, y6.f23485k6, y6.f23503l6, y6.f23582p7, u6Var);
        tVar.setImeOptions(6);
        tVar.setBackgroundDrawable(null);
        tVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        TextView textView = new TextView(activity);
        f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f7.addView(textView, kb1.o(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(tVar, kb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.o(f7);
        e2Var.f22556a = AndroidUtilities.dp(292.0f);
        tVar.setOnEditorActionListener(new q(tVar, i10, tL_businessChatLink, e2VarArr, view2, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new i2.z(tVar, i10, tL_businessChatLink, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j2.d(27));
        if (z10) {
            e = e2Var;
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new r(0, view2));
            e.setOnShowListener(new s(tVar, 0));
            e.r(250L);
        } else {
            e2Var.O = new ai.n1(24, view2, tVar);
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new cb(tVar, 5));
            e2VarArr[0].setOnShowListener(new o(view2, tVar, 0));
            e2VarArr[0].show();
        }
        e2VarArr[0].f22578j0 = false;
        tVar.setSelection(tVar.getText().length());
    }

    @Override
    public final void V(ArrayList arrayList, k71 k71Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        u61 u61Var = new u61(2);
        u61Var.f33249l = string;
        u61Var.f33252o = string2;
        u61Var.f33248k = i10;
        arrayList.add(u61Var);
        k71Var.V();
        z d = z.d(this.currentAccount);
        if (d.f15908b.size() < MessagesController.getInstance(d.f15907a).businessChatLinksLimit) {
            u61 c10 = u61.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f33254q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).f15908b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f15864a = (TL_account.TL_businessChatLink) obj;
            u61 u61Var2 = new u61(29);
            u61Var2.G = obj2;
            arrayList.add(u61Var2);
        }
        k71Var.U();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String s10 = a1.g.s(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(s10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (b0(privacyRules) != 1 || b0(privacyRules2) != 2)) {
            StringBuilder l4 = b10.l(s10, "+");
            l4.append(currentUser.phone);
            arrayList3.add(l4.toString());
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
                    o4 o4Var = new o4(b10.j("https://", str), (z11) null);
                    o4Var.f31153f = this;
                    spannableString.setSpan(o4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(u61.C(spannableString));
        }
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void X(u61 u61Var, View view) {
        if (u61Var.d == 1) {
            z d = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f15907a).sendRequest(createbusinesschatlink, new y(d, 1));
        } else if (u61Var.f47075a == 29) {
            Object obj = u61Var.G;
            if (obj instanceof v) {
                Bundle g7 = b10.g(6, "chatMode");
                g7.putString("business_link", ((v) obj).f15864a.link);
                presentFragment(new wn(g7));
            }
        }
    }

    @Override
    public final boolean Y(u61 u61Var, View view) {
        if (u61Var.f47075a == 29) {
            Object obj = u61Var.G;
            if (obj instanceof v) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((v) obj).f15864a;
                l80 H = l80.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ua(tL_businessChatLink, 23), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final w f15802b;

                    {
                        this.f15802b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f15802b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Z(this.f15802b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f15802b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.f23599q7, wVar2.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final w f15802b;

                    {
                        this.f15802b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f15802b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Z(this.f15802b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f15802b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.f23599q7, wVar2.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final w f15802b;

                    {
                        this.f15802b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f15802b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Z(this.f15802b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f15802b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.f23599q7, wVar2.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f30764a.V0(view, false));
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
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessLinks));
        this.f30765b.setBackground(null);
        this.f30764a.u1();
        this.f30764a.setSectionsDrawBackground(true);
        this.f30764a.f32504g3.f29878r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle g7 = b10.g(6, "chatMode");
                g7.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new wn(g7));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        m71 m71Var = this.f30764a;
        if (m71Var != null && (k71Var = m71Var.f32504g3) != null) {
            k71Var.O(true);
        }
    }

    @Override
    public final nm0 getListViewForSimpleGlass() {
        return this.f30764a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.e2 e2Var = e;
        if (e2Var != null && e2Var.isShowing()) {
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
        getNotificationCenter().addWeakObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.privacyRulesUpdated);
        z d = z.d(this.currentAccount);
        if (!d.d) {
            d.e(true, true);
        } else {
            d.e(false, true);
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

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
