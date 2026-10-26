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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class w extends m71 implements NotificationCenter.NotificationCenterDelegate {
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
        if (R != null && (R.getFragmentView() instanceof vw0) && ((vw0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f)) {
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
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        e2Var.R = string;
        t tVar = new t(activity, u6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        tVar.setInputType(49153);
        tVar.setTextSize(1, 18.0f);
        tVar.setText(tL_businessChatLink.title);
        int i11 = y6.f23464j5;
        f7.V(tVar, i11, u6Var);
        f7.m(tVar, 34, y6.Xh, u6Var);
        f7.m(tVar, 30, y6.Wd, null);
        tVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        tVar.setSingleLine(true);
        tVar.setFocusable(true);
        f7.G(tVar, y6.f23484k6, y6.f23502l6, y6.f23581p7, u6Var);
        tVar.setImeOptions(6);
        tVar.setBackgroundDrawable(null);
        tVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        TextView textView = new TextView(activity);
        f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f7.addView(textView, gb1.o(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(tVar, gb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.o(f7);
        e2Var.f22555a = AndroidUtilities.dp(292.0f);
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
        e2VarArr[0].f22577j0 = false;
        tVar.setSelection(tVar.getText().length());
    }

    @Override
    public final void V(ArrayList arrayList, j71 j71Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        t61 t61Var = new t61(2);
        t61Var.f32875l = string;
        t61Var.f32878o = string2;
        t61Var.f32874k = i10;
        arrayList.add(t61Var);
        j71Var.V();
        z d = z.d(this.currentAccount);
        if (d.f15909b.size() < MessagesController.getInstance(d.f15908a).businessChatLinksLimit) {
            t61 c10 = t61.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f32880q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).f15909b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f15865a = (TL_account.TL_businessChatLink) obj;
            t61 t61Var2 = new t61(29);
            t61Var2.G = obj2;
            arrayList.add(t61Var2);
        }
        j71Var.U();
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
                    o4 o4Var = new o4(b10.j("https://", str), (y11) null);
                    o4Var.f31151f = this;
                    spannableString.setSpan(o4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(t61.C(spannableString));
        }
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void X(t61 t61Var, View view) {
        if (t61Var.d == 1) {
            z d = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f15908a).sendRequest(createbusinesschatlink, new y(d, 1));
        } else if (t61Var.f47040a == 29) {
            Object obj = t61Var.G;
            if (obj instanceof v) {
                Bundle g7 = b10.g(6, "chatMode");
                g7.putString("business_link", ((v) obj).f15865a.link);
                presentFragment(new un(g7));
            }
        }
    }

    @Override
    public final boolean Y(t61 t61Var, View view) {
        if (t61Var.f47040a == 29) {
            Object obj = t61Var.G;
            if (obj instanceof v) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((v) obj).f15865a;
                k80 H = k80.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ua(tL_businessChatLink, 23), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final w f15803b;

                    {
                        this.f15803b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f15803b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Z(this.f15803b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f15803b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.f23598q7, wVar2.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final w f15803b;

                    {
                        this.f15803b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f15803b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Z(this.f15803b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f15803b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.f23598q7, wVar2.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final w f15803b;

                    {
                        this.f15803b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f15803b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Z(this.f15803b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f15803b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.f23598q7, wVar2.getResourceProvider());
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f30419a.V0(view, false));
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
        this.f30420b.setBackground(null);
        this.f30419a.u1();
        this.f30419a.setSectionsDrawBackground(true);
        this.f30419a.f32152g3.f29507r = false;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle g7 = b10.g(6, "chatMode");
                g7.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new un(g7));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        l71 l71Var = this.f30419a;
        if (l71Var != null && (j71Var = l71Var.f32152g3) != null) {
            j71Var.O(true);
        }
    }

    @Override
    public final mm0 getListViewForSimpleGlass() {
        return this.f30419a;
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
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
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
