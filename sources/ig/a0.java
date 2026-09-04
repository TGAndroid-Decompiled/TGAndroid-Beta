package ig;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import di.nb;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class a0 {
    public final Context f11978a;
    public final int f11979b;
    public final f6 f11980c;
    public final n2 d;
    public final Runnable f11981e;
    public int f11982f;
    public int f11983g;
    public boolean h;
    public boolean f11984i;
    public final ArrayList f11985j;
    public final ArrayList f11986k;
    public TL_account.TL_businessBotRecipients f11987l;
    public int f11988m;
    public boolean f11989n;

    public a0(n2 n2Var, Runnable runnable) {
        this.f11985j = new ArrayList();
        this.f11986k = new ArrayList();
        this.f11988m = -4;
        this.f11978a = n2Var.getContext();
        this.f11979b = n2Var.getCurrentAccount();
        this.d = n2Var;
        this.f11981e = runnable;
        this.f11980c = n2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, v51 v51Var, boolean z10) {
        String str;
        String str2;
        v51Var.U();
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
                str = org.telegram.messenger.w1.h(R.string.FilterExistingChats, a4.a.u(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p6.t(str, ", ");
                }
                str = org.telegram.messenger.w1.h(R.string.FilterNewChats, a4.a.u(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p6.t(str, ", ");
                }
                str = org.telegram.messenger.w1.h(R.string.FilterContacts, a4.a.u(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p6.t(str, ", ");
                }
                str = org.telegram.messenger.w1.h(R.string.FilterNonContacts, a4.a.u(str));
            }
            ArrayList arrayList2 = this.f11985j;
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
            h51 f7 = h51.f(LocaleController.getString(R.string.BusinessChatsIncluded), str, 101);
            f7.f26590g = z10;
            arrayList.add(f7);
        }
        boolean z11 = this.f11984i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = org.telegram.messenger.w1.h(R.string.FilterExistingChats, a4.a.u(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p6.t(str3, ", ");
                    }
                    str3 = org.telegram.messenger.w1.h(R.string.FilterNewChats, a4.a.u(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p6.t(str3, ", ");
                    }
                    str3 = org.telegram.messenger.w1.h(R.string.FilterContacts, a4.a.u(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p6.t(str3, ", ");
                    }
                    str3 = org.telegram.messenger.w1.h(R.string.FilterNonContacts, a4.a.u(str3));
                }
            }
            ArrayList arrayList3 = this.f11986k;
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
            h51 f10 = h51.f(LocaleController.getString(R.string.BusinessChatsExcluded), str3, 103);
            f10.f26590g = z10;
            arrayList.add(f10);
        }
        v51Var.T();
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
        ArrayList arrayList2 = this.f11986k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f11985j;
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
        ArrayList arrayList2 = this.f11986k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f11985j;
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
            return this.f11983g;
        }
        return this.f11982f;
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
            arrayList = this.f11986k;
        } else {
            arrayList = this.f11985j;
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
            arrayList = this.f11986k;
        } else {
            arrayList = this.f11985j;
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f11987l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f11986k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f11985j;
            }
            if (arrayList.size() == this.f11987l.users.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!this.f11987l.users.contains(arrayList.get(i10))) {
                        return true;
                    }
                }
                if (this.f11984i && !this.h) {
                    if (arrayList2.size() == this.f11987l.exclude_users.size()) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (!this.f11987l.exclude_users.contains(arrayList2.get(i11))) {
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

    public final boolean h(h51 h51Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i10;
        int i11;
        int i12 = h51Var.d;
        n2 n2Var = this.d;
        boolean z12 = false;
        if (i12 != 101 && i12 != 103) {
            Runnable runnable = this.f11981e;
            if (i12 == 102) {
                runnable.run();
                return true;
            } else if (i12 == 104) {
                runnable.run();
                return true;
            } else if (h51Var.f44071a != 11) {
                return false;
            } else {
                boolean z13 = h51Var.f26604w;
                String peerName = MessagesController.getInstance(this.f11979b).getPeerName(h51Var.f26605x);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f11978a, 0, this.f11980c);
                if (!z13) {
                    i10 = R.string.BusinessRecipientsRemoveExcludeTitle;
                } else {
                    i10 = R.string.BusinessRecipientsRemoveIncludeTitle;
                }
                String string = LocaleController.getString(i10);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.R = string;
                if (!z13) {
                    i11 = R.string.BusinessRecipientsRemoveExcludeMessage;
                } else {
                    i11 = R.string.BusinessRecipientsRemoveIncludeMessage;
                }
                b2Var.T = LocaleController.formatString(i11, peerName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new com.google.firebase.messaging.i(this, z13, h51Var, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (n2Var != null) {
                    n2Var.showDialog(b2Var);
                    return true;
                }
                b2Var.show();
                return true;
            }
        }
        if (i12 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f11985j;
        } else {
            arrayList = this.f11986k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f34246x = 2;
        usersSelectActivity.G = false;
        if (this.f11984i && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.F = z11;
        usersSelectActivity.G = false;
        if (!z10 && this.f11989n) {
            z12 = true;
        }
        usersSelectActivity.H = z12;
        usersSelectActivity.f34242n = new bi.h(1, this, z10);
        if (n2Var != null) {
            n2Var.presentFragment(usersSelectActivity);
            return true;
        }
        n2 U = LaunchActivity.U();
        if (U == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f21142a = true;
        U.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f11984i = true;
        this.f11987l = tL_businessBotRecipients;
        ArrayList arrayList = this.f11985j;
        ArrayList arrayList2 = this.f11986k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f11983g = 0;
            this.f11982f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f11982f = 0;
            this.f11983g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f11987l.users);
            return;
        }
        this.f11982f = tL_businessBotRecipients.flags & (-49);
        this.f11983g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f11987l.users);
        arrayList2.addAll(this.f11987l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f11984i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f11987l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f11987l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f11987l;
        ArrayList arrayList = this.f11985j;
        ArrayList arrayList2 = this.f11986k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f11983g = 0;
            this.f11982f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f11982f = 0;
            this.f11983g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f11987l.users);
            return;
        }
        this.f11982f = tL_businessBotRecipients2.flags & (-49);
        this.f11983g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f11987l.users);
        arrayList2.addAll(this.f11987l.exclude_users);
    }

    public final boolean k(d61 d61Var) {
        if (!this.h && this.f11985j.isEmpty() && this.f11982f == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View x12 = d61Var.x1(101);
            int i10 = -this.f11988m;
            this.f11988m = i10;
            AndroidUtilities.shakeViewSpring(x12, i10);
            d61Var.x0(d61Var.w1(101));
            return false;
        }
        return true;
    }

    public a0(Context context, int i10, nb nbVar, f6 f6Var) {
        this.f11985j = new ArrayList();
        this.f11986k = new ArrayList();
        this.f11988m = -4;
        this.f11978a = context;
        this.f11979b = i10;
        this.d = null;
        this.f11981e = nbVar;
        this.f11980c = f6Var;
    }
}
