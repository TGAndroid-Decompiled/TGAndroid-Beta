package gg;

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
import bi.wc;
import bi.y2;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l4;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import w7.a6;
public final class x extends m61 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.d2 d;

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

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, f6 f6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof aw0) && ((aw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        u uVar = new u(activity, f6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        uVar.setInputType(49153);
        uVar.setTextSize(1, 18.0f);
        uVar.setText(tL_businessChatLink.title);
        int i11 = j6.f18034j5;
        uVar.setTextColor(j6.v0(i11, f6Var));
        uVar.setHintColor(j6.v0(j6.Xh, f6Var));
        uVar.setCursorColor(j6.w0(null, j6.Wd, false));
        uVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        uVar.setSingleLine(true);
        uVar.setFocusable(true);
        uVar.setLineColors(j6.v0(j6.f18055k6, f6Var), j6.v0(j6.f18073l6, f6Var), j6.v0(j6.f18144p7, f6Var));
        uVar.setImeOptions(6);
        uVar.setBackgroundDrawable(null);
        uVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        TextView textView = new TextView(activity);
        em.n(i11, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f7.addView(textView, a6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(uVar, a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(f7);
        d2Var.f17609a = AndroidUtilities.dp(292.0f);
        uVar.setOnEditorActionListener(new r(uVar, i10, tL_businessChatLink, d2VarArr, view2, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new fg.e2(uVar, i10, tL_businessChatLink, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new dh.a(23));
        if (z10) {
            d = d2Var;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new s(0, view2));
            d.setOnShowListener(new t(0, uVar));
            d.q(250L);
        } else {
            d2Var.O = new y2(15, view2, uVar);
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new o(uVar, 0));
            d2VarArr[0].setOnShowListener(new p(view2, uVar, 0));
            d2VarArr[0].show();
        }
        d2VarArr[0].f17622h0 = false;
        uVar.setSelection(uVar.getText().length());
    }

    @Override
    public final void U(ArrayList arrayList, j61 j61Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        v51 v51Var = new v51(2);
        v51Var.f27829l = string;
        v51Var.f27832o = string2;
        v51Var.f27828k = i10;
        arrayList.add(v51Var);
        j61Var.U();
        b0 d10 = b0.d(this.currentAccount);
        if (d10.f8817b.size() < MessagesController.getInstance(d10.f8816a).businessChatLinksLimit) {
            v51 c10 = v51.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f27834q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = b0.d(this.currentAccount).f8817b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f9061a = (TL_account.TL_businessChatLink) obj;
            v51 v51Var2 = new v51(29);
            v51Var2.G = obj2;
            arrayList.add(v51Var2);
        }
        j61Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String s10 = a4.a.s(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(s10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder g10 = w.f.g(s10, "+");
            g10.append(currentUser.phone);
            arrayList3.add(g10.toString());
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
                    l4 l4Var = new l4(r6.i("https://", str), (b11) null);
                    l4Var.f24863f = this;
                    spannableString.setSpan(l4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(v51.B(spannableString));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void W(v51 v51Var, View view) {
        if (v51Var.d == 1) {
            b0 d10 = b0.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.f8816a).sendRequest(createbusinesschatlink, new z(d10, 1));
        } else if (v51Var.f14046a == 29) {
            Object obj = v51Var.G;
            if (obj instanceof w) {
                Bundle e = r6.e(6, "chatMode");
                e.putString("business_link", ((w) obj).f9061a.link);
                presentFragment(new eo(e));
            }
        }
    }

    @Override
    public final boolean X(v51 v51Var, View view) {
        if (v51Var.f14046a == 29) {
            Object obj = v51Var.G;
            if (obj instanceof w) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((w) obj).f9061a;
                w70 H = w70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new wc(tL_businessChatLink, 25), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final x f9013b;

                    {
                        this.f9013b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x xVar = this.f9013b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                x.Y(this.f9013b, tL_businessChatLink);
                                return;
                            default:
                                x xVar2 = this.f9013b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new cb(10, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                xVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(j6.f18162q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final x f9013b;

                    {
                        this.f9013b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x xVar = this.f9013b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                x.Y(this.f9013b, tL_businessChatLink);
                                return;
                            default:
                                x xVar2 = this.f9013b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new cb(10, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                xVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(j6.f18162q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final x f9013b;

                    {
                        this.f9013b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x xVar = this.f9013b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                x.Y(this.f9013b, tL_businessChatLink);
                                return;
                            default:
                                x xVar2 = this.f9013b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new cb(10, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                xVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(j6.f18162q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f25171a.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f25171a.o1();
        l61 l61Var = this.f25171a;
        l61Var.Y2.f24250r = false;
        this.actionBar.z(l61Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle e = r6.e(6, "chatMode");
                e.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new eo(e));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                b0.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        l61 l61Var = this.f25171a;
        if (l61Var != null && (j61Var = l61Var.Y2) != null) {
            j61Var.N(true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.d2 d2Var = d;
        if (d2Var != null && d2Var.isShowing()) {
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
        b0 d10 = b0.d(this.currentAccount);
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
        pc.e();
        super.onFragmentDestroy();
    }
}
