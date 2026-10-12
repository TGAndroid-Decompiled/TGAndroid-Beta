package ig;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.t4;
import bi.v2;
import di.x8;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import w7.a6;
public final class v extends c71 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.a2 d;

    public static void Y(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
    }

    public static int a0(ArrayList arrayList) {
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

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, c6 c6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        m2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof ow0) && ((ow0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = string;
        s sVar = new s(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i11 = g6.f20007j5;
        sVar.setTextColor(g6.w0(i11, c6Var));
        sVar.setHintColor(g6.w0(g6.Xh, c6Var));
        sVar.setCursorColor(g6.x0(null, g6.Wd, false));
        sVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        sVar.setLineColors(g6.w0(g6.f20028k6, c6Var), g6.w0(g6.f20045l6, c6Var), g6.w0(g6.f20122p7, c6Var));
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.q.f(activity, 1);
        TextView textView = new TextView(activity);
        yh.n(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f7.addView(textView, a6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(sVar, a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(f7);
        a2Var.f19557a = AndroidUtilities.dp(292.0f);
        sVar.setOnEditorActionListener(new p(sVar, i10, tL_businessChatLink, a2VarArr, view2, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new hg.b2(sVar, i10, tL_businessChatLink, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fi.c2(22));
        if (z10) {
            d = a2Var;
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new q(0, view2));
            d.setOnShowListener(new r(0, sVar));
            d.q(250L);
        } else {
            a2Var.O = new v2(16, view2, sVar);
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new t4(sVar, 2));
            a2VarArr[0].setOnShowListener(new n(view2, sVar, 0));
            a2VarArr[0].show();
        }
        a2VarArr[0].f19570h0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override
    public final void U(ArrayList arrayList, z61 z61Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        l61 l61Var = new l61(2);
        l61Var.f26954l = string;
        l61Var.f26957o = string2;
        l61Var.f26953k = i10;
        arrayList.add(l61Var);
        z61Var.U();
        y d10 = y.d(this.currentAccount);
        if (d10.f11698b.size() < MessagesController.getInstance(d10.f11697a).businessChatLinksLimit) {
            l61 c10 = l61.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f26959q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = y.d(this.currentAccount).f11698b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f11632a = (TL_account.TL_businessChatLink) obj;
            l61 l61Var2 = new l61(29);
            l61Var2.G = obj2;
            arrayList.add(l61Var2);
        }
        z61Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String s10 = a1.g.s(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(s10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder i13 = t8.b.i(s10, "+");
            i13.append(currentUser.phone);
            arrayList3.add(i13.toString());
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
                    o4 o4Var = new o4(t8.b.h("https://", str), (p11) null);
                    o4Var.f27828f = this;
                    spannableString.setSpan(o4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(l61.B(spannableString));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void W(l61 l61Var, View view) {
        if (l61Var.d == 1) {
            y d10 = y.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.f11697a).sendRequest(createbusinesschatlink, new x(d10, 1));
        } else if (l61Var.f43203a == 29) {
            Object obj = l61Var.G;
            if (obj instanceof u) {
                Bundle g10 = org.telegram.ui.Cells.d0.g(6, "chatMode");
                g10.putString("business_link", ((u) obj).f11632a.link);
                presentFragment(new fo(g10));
            }
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        if (l61Var.f43203a == 29) {
            Object obj = l61Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).f11632a;
                m80 H = m80.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new x8(tL_businessChatLink, 28), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final v f11592b;

                    {
                        this.f11592b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v vVar = this.f11592b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.Y(this.f11592b, tL_businessChatLink);
                                return;
                            default:
                                v vVar2 = this.f11592b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.h0(15, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                vVar2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(g6.f20139q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final v f11592b;

                    {
                        this.f11592b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v vVar = this.f11592b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.Y(this.f11592b, tL_businessChatLink);
                                return;
                            default:
                                v vVar2 = this.f11592b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.h0(15, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                vVar2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(g6.f20139q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final v f11592b;

                    {
                        this.f11592b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v vVar = this.f11592b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.Y(this.f11592b, tL_businessChatLink);
                                return;
                            default:
                                v vVar2 = this.f11592b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.h0(15, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                vVar2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(g6.f20139q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f23964a.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f23964a.p1();
        b71 b71Var = this.f23964a;
        b71Var.W2.f31780r = false;
        this.actionBar.A(b71Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z61 z61Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle g10 = org.telegram.ui.Cells.d0.g(6, "chatMode");
                g10.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new fo(g10));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                y.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        b71 b71Var = this.f23964a;
        if (b71Var != null && (z61Var = b71Var.W2) != null) {
            z61Var.N(true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.a2 a2Var = d;
        if (a2Var != null && a2Var.isShowing()) {
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
        y d10 = y.d(this.currentAccount);
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
        sc.e();
        super.onFragmentDestroy();
    }
}
