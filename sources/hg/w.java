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
import ci.qc;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m4;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
import w7.z5;
public final class w extends x61 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 f11376e;

    public static void X(w wVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(wVar.getParentActivity(), wVar.currentAccount, tL_businessChatLink, wVar.resourceProvider);
    }

    public static int Z(ArrayList arrayList) {
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
        if (R != null && (R.getFragmentView() instanceof lw0) && ((lw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
        b2Var.R = string;
        t tVar = new t(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        tVar.setInputType(49153);
        tVar.setTextSize(1, 18.0f);
        tVar.setText(tL_businessChatLink.title);
        int i11 = i6.f20930j5;
        tVar.setTextColor(i6.v0(i11, d6Var));
        tVar.setHintColor(i6.v0(i6.Xh, d6Var));
        tVar.setCursorColor(i6.w0(null, i6.Wd, false));
        tVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        tVar.setSingleLine(true);
        tVar.setFocusable(true);
        tVar.setLineColors(i6.v0(i6.f20951k6, d6Var), i6.v0(i6.f20969l6, d6Var), i6.v0(i6.f21044p7, d6Var));
        tVar.setImeOptions(6);
        tVar.setBackgroundDrawable(null);
        tVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        TextView textView = new TextView(activity);
        bi.m(i11, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        e7.addView(textView, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(tVar, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(e7);
        b2Var.f20414a = AndroidUtilities.dp(292.0f);
        tVar.setOnEditorActionListener(new q(tVar, i10, tL_businessChatLink, b2VarArr, view2, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new gg.d2(tVar, i10, tL_businessChatLink, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ga.a(1));
        if (z10) {
            f11376e = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new r(0, view2));
            f11376e.setOnShowListener(new s(0, tVar));
            f11376e.q(250L);
        } else {
            b2Var.O = new g3(16, view2, tVar);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new f5(tVar, 2));
            b2VarArr[0].setOnShowListener(new o(view2, tVar, 0));
            b2VarArr[0].show();
        }
        b2VarArr[0].f20428h0 = false;
        tVar.setSelection(tVar.getText().length());
    }

    @Override
    public final void S(ArrayList arrayList, u61 u61Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        g61 g61Var = new g61(2);
        g61Var.f26674l = string;
        g61Var.f26677o = string2;
        g61Var.f26673k = i10;
        arrayList.add(g61Var);
        u61Var.U();
        z d = z.d(this.currentAccount);
        if (d.f11415b.size() < MessagesController.getInstance(d.f11414a).businessChatLinksLimit) {
            g61 c10 = g61.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f26679q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).f11415b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f11365a = (TL_account.TL_businessChatLink) obj;
            g61 g61Var2 = new g61(29);
            g61Var2.G = obj2;
            arrayList.add(g61Var2);
        }
        u61Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String t10 = a4.a.t(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(t10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (Z(privacyRules) != 1 || Z(privacyRules2) != 2)) {
            StringBuilder j3 = sa.e.j(t10, "+");
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
                    m4 m4Var = new m4(sa.e.i("https://", str), (m11) null);
                    m4Var.f28521f = this;
                    spannableString.setSpan(m4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(g61.B(spannableString));
        }
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void U(g61 g61Var, View view) {
        if (g61Var.d == 1) {
            z d = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f11414a).sendRequest(createbusinesschatlink, new y(d, 1));
        } else if (g61Var.f17187a == 29) {
            Object obj = g61Var.G;
            if (obj instanceof v) {
                Bundle h = org.telegram.ui.Cells.c1.h(6, "chatMode");
                h.putString("business_link", ((v) obj).f11365a.link);
                presentFragment(new yn(h));
            }
        }
    }

    @Override
    public final boolean W(g61 g61Var, View view) {
        if (g61Var.f17187a == 29) {
            Object obj = g61Var.G;
            if (obj instanceof v) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((v) obj).f11365a;
                b80 H = b80.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new qc(tL_businessChatLink, 19), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final w f11293b;

                    {
                        this.f11293b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f11293b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.X(this.f11293b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f11293b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                                wVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(wVar2.getThemedColor(i6.f21063q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final w f11293b;

                    {
                        this.f11293b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f11293b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.X(this.f11293b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f11293b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                                wVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(wVar2.getThemedColor(i6.f21063q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final w f11293b;

                    {
                        this.f11293b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w wVar = this.f11293b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                w.X(this.f11293b, tL_businessChatLink);
                                return;
                            default:
                                w wVar2 = this.f11293b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                                wVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(wVar2.getThemedColor(i6.f21063q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f32731a.W0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f32731a.s1();
        w61 w61Var = this.f32731a;
        w61Var.f25250f3.f31313r = false;
        this.actionBar.z(w61Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle h = org.telegram.ui.Cells.c1.h(6, "chatMode");
                h.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new yn(h));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        w61 w61Var = this.f32731a;
        if (w61Var != null && (u61Var = w61Var.f25250f3) != null) {
            u61Var.N(true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.b2 b2Var = f11376e;
        if (b2Var != null && b2Var.isShowing()) {
            if (z10) {
                f11376e.dismiss();
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
        rc.e();
        super.onFragmentDestroy();
    }
}
