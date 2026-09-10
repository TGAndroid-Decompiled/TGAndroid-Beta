package gg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import bi.wc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class e0 {
    public final Context f8859a;
    public final int f8860b;
    public final f6 f8861c;
    public final p2 d;
    public final Runnable e;
    public int f8862f;
    public int f8863g;
    public boolean h;
    public boolean f8864i;
    public final ArrayList f8865j;
    public final ArrayList f8866k;
    public TL_account.TL_businessBotRecipients f8867l;
    public int f8868m;
    public boolean f8869n;

    public e0(p2 p2Var, Runnable runnable) {
        this.f8865j = new ArrayList();
        this.f8866k = new ArrayList();
        this.f8868m = -4;
        this.f8859a = p2Var.getContext();
        this.f8860b = p2Var.getCurrentAccount();
        this.d = p2Var;
        this.e = runnable;
        this.f8861c = p2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, j61 j61Var, boolean z10) {
        String str;
        String str2;
        j61Var.U();
        int d = d();
        String str3 = "";
        if (!this.h) {
            if ((d & 1) == 0) {
                str = "";
            } else {
                if (TextUtils.isEmpty("")) {
                    str2 = "";
                } else {
                    str2 = ", ";
                }
                str = org.telegram.messenger.a2.h(R.string.FilterExistingChats, a4.a.u(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = r6.t(str, ", ");
                }
                str = org.telegram.messenger.a2.h(R.string.FilterNewChats, a4.a.u(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = r6.t(str, ", ");
                }
                str = org.telegram.messenger.a2.h(R.string.FilterContacts, a4.a.u(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = r6.t(str, ", ");
                }
                str = org.telegram.messenger.a2.h(R.string.FilterNonContacts, a4.a.u(str));
            }
            ArrayList arrayList2 = this.f8865j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder g10 = w.f.g(str, " + ");
                    g10.append(arrayList2.size());
                    str = g10.toString();
                } else {
                    StringBuilder u10 = a4.a.u(str);
                    u10.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str = u10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            v51 f7 = v51.f(LocaleController.getString(R.string.BusinessChatsIncluded), str, 101);
            f7.f27825g = z10;
            arrayList.add(f7);
        }
        boolean z11 = this.f8864i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = org.telegram.messenger.a2.h(R.string.FilterExistingChats, a4.a.u(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = r6.t(str3, ", ");
                    }
                    str3 = org.telegram.messenger.a2.h(R.string.FilterNewChats, a4.a.u(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = r6.t(str3, ", ");
                    }
                    str3 = org.telegram.messenger.a2.h(R.string.FilterContacts, a4.a.u(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = r6.t(str3, ", ");
                    }
                    str3 = org.telegram.messenger.a2.h(R.string.FilterNonContacts, a4.a.u(str3));
                }
            }
            ArrayList arrayList3 = this.f8866k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder g11 = w.f.g(str3, " + ");
                    g11.append(arrayList3.size());
                    str3 = g11.toString();
                } else {
                    StringBuilder u11 = a4.a.u(str3);
                    u11.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str3 = u11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            v51 f10 = v51.f(LocaleController.getString(R.string.BusinessChatsExcluded), str3, 103);
            f10.f27825g = z10;
            arrayList.add(f10);
        }
        j61Var.T();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessBotRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessBotRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_inputBusinessBotRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_inputBusinessBotRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z14;
        ArrayList arrayList2 = this.f8866k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f8865j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i10)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(((Long) arrayList2.get(i11)).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i11));
                } else {
                    tL_inputBusinessBotRecipients.exclude_users.add(inputUser2);
                }
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients c() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int d = d();
        tL_businessBotRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessBotRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessBotRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_businessBotRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_businessBotRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_businessBotRecipients.exclude_selected = z14;
        ArrayList arrayList2 = this.f8866k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f8865j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList.get(i10));
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (messagesController2.getInputUser(((Long) arrayList2.get(i11)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i11));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList2.get(i11));
                }
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        if (this.h) {
            return this.f8863g;
        }
        return this.f8862f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int d = d();
        tL_inputBusinessRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_inputBusinessRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_inputBusinessRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z14;
        if (z14) {
            arrayList = this.f8866k;
        } else {
            arrayList = this.f8865j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i10)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_inputBusinessRecipients.users.add(inputUser);
                }
            }
        }
        return tL_inputBusinessRecipients;
    }

    public final TL_account.TL_businessRecipients f() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int d = d();
        tL_businessRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_businessRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_businessRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_businessRecipients.exclude_selected = z14;
        if (z14) {
            arrayList = this.f8866k;
        } else {
            arrayList = this.f8865j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_businessRecipients.users.add((Long) arrayList.get(i10));
                }
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f8867l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f8866k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f8865j;
            }
            if (arrayList.size() == this.f8867l.users.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!this.f8867l.users.contains(arrayList.get(i10))) {
                        return true;
                    }
                }
                if (this.f8864i && !this.h) {
                    if (arrayList2.size() == this.f8867l.exclude_users.size()) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (!this.f8867l.exclude_users.contains(arrayList2.get(i11))) {
                                return true;
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean h(v51 v51Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12 = v51Var.d;
        p2 p2Var = this.d;
        if (i12 != 101 && i12 != 103) {
            Runnable runnable = this.e;
            if (i12 == 102) {
                runnable.run();
                return true;
            } else if (i12 == 104) {
                runnable.run();
                return true;
            } else if (v51Var.f14046a != 11) {
                return false;
            } else {
                boolean z13 = v51Var.f27839w;
                String peerName = MessagesController.getInstance(this.f8860b).getPeerName(v51Var.f27840x);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f8859a, 0, this.f8861c);
                if (!z13) {
                    i10 = R.string.BusinessRecipientsRemoveExcludeTitle;
                } else {
                    i10 = R.string.BusinessRecipientsRemoveIncludeTitle;
                }
                String string = LocaleController.getString(i10);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                if (!z13) {
                    i11 = R.string.BusinessRecipientsRemoveExcludeMessage;
                } else {
                    i11 = R.string.BusinessRecipientsRemoveIncludeMessage;
                }
                d2Var.T = LocaleController.formatString(i11, peerName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new com.google.firebase.messaging.i(this, z13, v51Var, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (p2Var != null) {
                    p2Var.showDialog(d2Var);
                    return true;
                }
                d2Var.show();
                return true;
            }
        }
        if (i12 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f8865j;
        } else {
            arrayList = this.f8866k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f30728x = 2;
        usersSelectActivity.G = false;
        if (this.f8864i && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.F = z11;
        usersSelectActivity.G = false;
        if (!z10 && this.f8869n) {
            z12 = true;
        } else {
            z12 = false;
        }
        usersSelectActivity.H = z12;
        usersSelectActivity.f30724n = new d0(0, this, z10);
        if (p2Var != null) {
            p2Var.presentFragment(usersSelectActivity);
            return true;
        }
        p2 U = LaunchActivity.U();
        if (U == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f18485a = true;
        U.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f8864i = true;
        this.f8867l = tL_businessBotRecipients;
        ArrayList arrayList = this.f8865j;
        ArrayList arrayList2 = this.f8866k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f8863g = 0;
            this.f8862f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f8862f = 0;
            this.f8863g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f8867l.users);
            return;
        }
        this.f8862f = tL_businessBotRecipients.flags & (-49);
        this.f8863g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f8867l.users);
        arrayList2.addAll(this.f8867l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f8864i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f8867l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f8867l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f8867l;
        ArrayList arrayList = this.f8865j;
        ArrayList arrayList2 = this.f8866k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f8863g = 0;
            this.f8862f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f8862f = 0;
            this.f8863g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f8867l.users);
            return;
        }
        this.f8862f = tL_businessBotRecipients2.flags & (-49);
        this.f8863g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f8867l.users);
        arrayList2.addAll(this.f8867l.exclude_users);
    }

    public final boolean k(r61 r61Var) {
        if (!this.h && this.f8865j.isEmpty() && this.f8862f == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View x12 = r61Var.x1(101);
            int i10 = -this.f8868m;
            this.f8868m = i10;
            AndroidUtilities.shakeViewSpring(x12, i10);
            r61Var.x0(r61Var.w1(101));
            return false;
        }
        return true;
    }

    public e0(Context context, int i10, wc wcVar, f6 f6Var) {
        this.f8865j = new ArrayList();
        this.f8866k = new ArrayList();
        this.f8868m = -4;
        this.f8859a = context;
        this.f8860b = i10;
        this.d = null;
        this.e = wcVar;
        this.f8861c = f6Var;
    }
}
