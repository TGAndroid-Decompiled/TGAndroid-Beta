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
import org.telegram.messenger.qk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m4;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
import w7.y5;
public final class v extends o61 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 e;

    public static void Y(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
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

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, e6 e6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof cw0) && ((cw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        c2Var.R = string;
        s sVar = new s(activity, e6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i11 = i6.f19164j5;
        sVar.setTextColor(i6.v0(i11, e6Var));
        sVar.setHintColor(i6.v0(i6.Xh, e6Var));
        sVar.setCursorColor(i6.w0(null, i6.Wd, false));
        sVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        sVar.setLineColors(i6.v0(i6.f19185k6, e6Var), i6.v0(i6.f19203l6, e6Var), i6.v0(i6.f19278p7, e6Var));
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout e7 = org.telegram.messenger.l0.e(activity, 1);
        TextView textView = new TextView(activity);
        qk.n(i11, e6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        e7.addView(textView, y5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(sVar, y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(e7);
        c2Var.f18717a = AndroidUtilities.dp(292.0f);
        sVar.setOnEditorActionListener(new p(sVar, i10, tL_businessChatLink, c2VarArr, view2, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new gg.d2(sVar, i10, tL_businessChatLink, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ga.a(1));
        if (z10) {
            e = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new q(0, view2));
            e.setOnShowListener(new r(0, sVar));
            e.q(250L);
        } else {
            c2Var.O = new g3(16, view2, sVar);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new f5(sVar, 2));
            c2VarArr[0].setOnShowListener(new n(view2, sVar, 0));
            c2VarArr[0].show();
        }
        c2VarArr[0].f18730h0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override
    public final void U(ArrayList arrayList, l61 l61Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        x51 x51Var = new x51(2);
        x51Var.f30302l = string;
        x51Var.f30305o = string2;
        x51Var.f30301k = i10;
        arrayList.add(x51Var);
        l61Var.U();
        y d = y.d(this.currentAccount);
        if (d.f10471b.size() < MessagesController.getInstance(d.f10470a).businessChatLinksLimit) {
            x51 c10 = x51.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f30307q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = y.d(this.currentAccount).f10471b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f10405a = (TL_account.TL_businessChatLink) obj;
            x51 x51Var2 = new x51(29);
            x51Var2.G = obj2;
            arrayList.add(x51Var2);
        }
        l61Var.T();
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
            StringBuilder h = v7.k0.h(s10, "+");
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
                    m4 m4Var = new m4(v7.k0.g("https://", str), (d11) null);
                    m4Var.f26340f = this;
                    spannableString.setSpan(m4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(x51.B(spannableString));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void W(x51 x51Var, View view) {
        if (x51Var.d == 1) {
            y d = y.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.f10470a).sendRequest(createbusinesschatlink, new x(d, 1));
        } else if (x51Var.f15754a == 29) {
            Object obj = x51Var.G;
            if (obj instanceof u) {
                Bundle g10 = org.telegram.ui.Cells.c1.g(6, "chatMode");
                g10.putString("business_link", ((u) obj).f10405a.link);
                presentFragment(new xn(g10));
            }
        }
    }

    @Override
    public final boolean X(x51 x51Var, View view) {
        if (x51Var.f15754a == 29) {
            Object obj = x51Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).f10405a;
                a80 H = a80.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new qc(tL_businessChatLink, 19), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final v f10363b;

                    {
                        this.f10363b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v vVar = this.f10363b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.Y(this.f10363b, tL_businessChatLink);
                                return;
                            default:
                                v vVar2 = this.f10363b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                                vVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(i6.f19297q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final v f10363b;

                    {
                        this.f10363b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v vVar = this.f10363b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.Y(this.f10363b, tL_businessChatLink);
                                return;
                            default:
                                v vVar2 = this.f10363b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                                vVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(i6.f19297q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final v f10363b;

                    {
                        this.f10363b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v vVar = this.f10363b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                v.Y(this.f10363b, tL_businessChatLink);
                                return;
                            default:
                                v vVar2 = this.f10363b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                                vVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(i6.f19297q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f27008a.W0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f27008a.q1();
        n61 n61Var = this.f27008a;
        n61Var.Y2.f25959r = false;
        this.actionBar.A(n61Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l61 l61Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle g10 = org.telegram.ui.Cells.c1.g(6, "chatMode");
                g10.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new xn(g10));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                y.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        n61 n61Var = this.f27008a;
        if (n61Var != null && (l61Var = n61Var.Y2) != null) {
            l61Var.N(true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.c2 c2Var = e;
        if (c2Var != null && c2Var.isShowing()) {
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
        y d = y.d(this.currentAccount);
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
        org.telegram.ui.Components.qc.e();
        super.onFragmentDestroy();
    }
}
