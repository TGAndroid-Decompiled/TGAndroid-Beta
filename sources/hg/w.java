package hg;

import ai.g5;
import ai.h3;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
import w7.x5;
public final class w extends f71 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 d;

    public static void Y(w wVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(wVar.getParentActivity(), wVar.currentAccount, tL_businessChatLink, wVar.resourceProvider);
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

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, e6 e6Var) {
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
        if (R != null && (R.getFragmentView() instanceof sw0) && ((sw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.R = string;
        t tVar = new t(activity, e6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        tVar.setInputType(49153);
        tVar.setTextSize(1, 18.0f);
        tVar.setText(tL_businessChatLink.title);
        int i11 = i6.f20905j5;
        tVar.setTextColor(i6.w0(i11, e6Var));
        tVar.setHintColor(i6.w0(i6.Xh, e6Var));
        tVar.setCursorColor(i6.x0(null, i6.Wd, false));
        tVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        tVar.setSingleLine(true);
        tVar.setFocusable(true);
        tVar.setLineColors(i6.w0(i6.f20925k6, e6Var), i6.w0(i6.f20943l6, e6Var), i6.w0(i6.f21018p7, e6Var));
        tVar.setImeOptions(6);
        tVar.setBackgroundDrawable(null);
        tVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        TextView textView = new TextView(activity);
        bi.o(i11, e6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        e7.addView(textView, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(tVar, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(e7);
        b2Var.f20407a = AndroidUtilities.dp(292.0f);
        tVar.setOnEditorActionListener(new q(tVar, i10, tL_businessChatLink, b2VarArr, view2, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new gg.c2(tVar, i10, tL_businessChatLink, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new d2.c(29));
        if (z10) {
            d = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new r(0, view2));
            d.setOnShowListener(new s(0, tVar));
            d.q(250L);
        } else {
            b2Var.O = new h3(16, view2, tVar);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new g5(tVar, 2));
            b2VarArr[0].setOnShowListener(new o(view2, tVar, 0));
            b2VarArr[0].show();
        }
        b2VarArr[0].f20421h0 = false;
        tVar.setSelection(tVar.getText().length());
    }

    @Override
    public final void U(ArrayList arrayList, c71 c71Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        p61 p61Var = new p61(2);
        p61Var.f29734l = string;
        p61Var.f29737o = string2;
        p61Var.f29733k = i10;
        arrayList.add(p61Var);
        c71Var.U();
        z d10 = z.d(this.currentAccount);
        if (d10.f11462b.size() < MessagesController.getInstance(d10.f11461a).businessChatLinksLimit) {
            p61 c10 = p61.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f29739q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).f11462b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f11412a = (TL_account.TL_businessChatLink) obj;
            p61 p61Var2 = new p61(29);
            p61Var2.G = obj2;
            arrayList.add(p61Var2);
        }
        c71Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String t10 = a1.g.t(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(t10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder j3 = sc.v.j(t10, "+");
            j3.append(currentUser.phone);
            arrayList3.add(j3.toString());
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
                    o4 o4Var = new o4(sc.v.i("https://", str), (t11) null);
                    o4Var.f29384f = this;
                    spannableString.setSpan(o4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(p61.B(spannableString));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void W(p61 p61Var, View view) {
        if (p61Var.d == 1) {
            z d10 = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.f11461a).sendRequest(createbusinesschatlink, new y(d10, 1));
        } else if (p61Var.f17125a == 29) {
            Object obj = p61Var.G;
            if (obj instanceof v) {
                Bundle f7 = org.telegram.ui.Cells.c1.f(6, "chatMode");
                f7.putString("business_link", ((v) obj).f11412a.link);
                presentFragment(new zn(f7));
            }
        }
    }

    @Override
    public final boolean X(p61 p61Var, View view) {
        if (p61Var.f17125a == 29) {
            Object obj = p61Var.G;
            if (obj instanceof v) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((v) obj).f11412a;
                p80 H = p80.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new rc(tL_businessChatLink, 19), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final w f11344b;

                    {
                        this.f11344b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f11344b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Y(this.f11344b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f11344b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                wVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(wVar2.getThemedColor(i6.f21037q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final w f11344b;

                    {
                        this.f11344b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f11344b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Y(this.f11344b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f11344b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                wVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(wVar2.getThemedColor(i6.f21037q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final w f11344b;

                    {
                        this.f11344b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f11344b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.Y(this.f11344b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f11344b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                wVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(wVar2.getThemedColor(i6.f21037q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f26290a.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f26290a.p1();
        e71 e71Var = this.f26290a;
        e71Var.W2.f25280r = false;
        this.actionBar.B(e71Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle f7 = org.telegram.ui.Cells.c1.f(6, "chatMode");
                f7.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new zn(f7));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        e71 e71Var = this.f26290a;
        if (e71Var != null && (c71Var = e71Var.W2) != null) {
            c71Var.N(true);
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
        z d10 = z.d(this.currentAccount);
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
        tc.e();
        super.onFragmentDestroy();
    }
}
