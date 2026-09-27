package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import ci.qc;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class a0 {
    public final Context f10197a;
    public final int f10198b;
    public final e6 f10199c;
    public final o2 d;
    public final Runnable e;
    public int f10200f;
    public int f10201g;
    public boolean h;
    public boolean f10202i;
    public final ArrayList f10203j;
    public final ArrayList f10204k;
    public TL_account.TL_businessBotRecipients f10205l;
    public int f10206m;
    public boolean f10207n;

    public a0(o2 o2Var, Runnable runnable) {
        this.f10203j = new ArrayList();
        this.f10204k = new ArrayList();
        this.f10206m = -4;
        this.f10197a = o2Var.getContext();
        this.f10198b = o2Var.getCurrentAccount();
        this.d = o2Var;
        this.e = runnable;
        this.f10199c = o2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, l61 l61Var, boolean z10) {
        String str;
        String str2;
        l61Var.U();
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
                str = org.telegram.messenger.l0.g(R.string.FilterExistingChats, a4.a.u(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = v7.k0.s(str, ", ");
                }
                str = org.telegram.messenger.l0.g(R.string.FilterNewChats, a4.a.u(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = v7.k0.s(str, ", ");
                }
                str = org.telegram.messenger.l0.g(R.string.FilterContacts, a4.a.u(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = v7.k0.s(str, ", ");
                }
                str = org.telegram.messenger.l0.g(R.string.FilterNonContacts, a4.a.u(str));
            }
            ArrayList arrayList2 = this.f10203j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder h = v7.k0.h(str, " + ");
                    h.append(arrayList2.size());
                    str = h.toString();
                } else {
                    StringBuilder u10 = a4.a.u(str);
                    u10.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str = u10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            x51 f7 = x51.f(LocaleController.getString(R.string.BusinessChatsIncluded), str, 101);
            f7.f30298g = z10;
            arrayList.add(f7);
        }
        boolean z11 = this.f10202i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = org.telegram.messenger.l0.g(R.string.FilterExistingChats, a4.a.u(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = v7.k0.s(str3, ", ");
                    }
                    str3 = org.telegram.messenger.l0.g(R.string.FilterNewChats, a4.a.u(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = v7.k0.s(str3, ", ");
                    }
                    str3 = org.telegram.messenger.l0.g(R.string.FilterContacts, a4.a.u(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = v7.k0.s(str3, ", ");
                    }
                    str3 = org.telegram.messenger.l0.g(R.string.FilterNonContacts, a4.a.u(str3));
                }
            }
            ArrayList arrayList3 = this.f10204k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder h10 = v7.k0.h(str3, " + ");
                    h10.append(arrayList3.size());
                    str3 = h10.toString();
                } else {
                    StringBuilder u11 = a4.a.u(str3);
                    u11.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str3 = u11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            x51 f10 = x51.f(LocaleController.getString(R.string.BusinessChatsExcluded), str3, 103);
            f10.f30298g = z10;
            arrayList.add(f10);
        }
        l61Var.T();
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
        ArrayList arrayList2 = this.f10204k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f10203j;
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
        ArrayList arrayList2 = this.f10204k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f10203j;
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
            return this.f10201g;
        }
        return this.f10200f;
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
            arrayList = this.f10204k;
        } else {
            arrayList = this.f10203j;
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
            arrayList = this.f10204k;
        } else {
            arrayList = this.f10203j;
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f10205l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f10204k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f10203j;
            }
            if (arrayList.size() == this.f10205l.users.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!this.f10205l.users.contains(arrayList.get(i10))) {
                        return true;
                    }
                }
                if (this.f10202i && !this.h) {
                    if (arrayList2.size() == this.f10205l.exclude_users.size()) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (!this.f10205l.exclude_users.contains(arrayList2.get(i11))) {
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

    public final boolean h(x51 x51Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i10;
        int i11;
        int i12 = x51Var.d;
        o2 o2Var = this.d;
        boolean z12 = false;
        if (i12 != 101 && i12 != 103) {
            Runnable runnable = this.e;
            if (i12 == 102) {
                runnable.run();
                return true;
            } else if (i12 == 104) {
                runnable.run();
                return true;
            } else if (x51Var.f15754a != 11) {
                return false;
            } else {
                boolean z13 = x51Var.f30312w;
                String peerName = MessagesController.getInstance(this.f10198b).getPeerName(x51Var.f30313x);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f10197a, 0, this.f10199c);
                if (!z13) {
                    i10 = R.string.BusinessRecipientsRemoveExcludeTitle;
                } else {
                    i10 = R.string.BusinessRecipientsRemoveIncludeTitle;
                }
                String string = LocaleController.getString(i10);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.R = string;
                if (!z13) {
                    i11 = R.string.BusinessRecipientsRemoveExcludeMessage;
                } else {
                    i11 = R.string.BusinessRecipientsRemoveIncludeMessage;
                }
                c2Var.T = LocaleController.formatString(i11, peerName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new com.google.firebase.messaging.i(this, z13, x51Var, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (o2Var != null) {
                    o2Var.showDialog(c2Var);
                    return true;
                }
                c2Var.show();
                return true;
            }
        }
        if (i12 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f10203j;
        } else {
            arrayList = this.f10204k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f31904x = 2;
        usersSelectActivity.G = false;
        if (this.f10202i && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.F = z11;
        usersSelectActivity.G = false;
        if (!z10 && this.f10207n) {
            z12 = true;
        }
        usersSelectActivity.H = z12;
        usersSelectActivity.f31900n = new ai.k(1, this, z10);
        if (o2Var != null) {
            o2Var.presentFragment(usersSelectActivity);
            return true;
        }
        o2 U = LaunchActivity.U();
        if (U == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f19631a = true;
        U.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f10202i = true;
        this.f10205l = tL_businessBotRecipients;
        ArrayList arrayList = this.f10203j;
        ArrayList arrayList2 = this.f10204k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f10201g = 0;
            this.f10200f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f10200f = 0;
            this.f10201g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f10205l.users);
            return;
        }
        this.f10200f = tL_businessBotRecipients.flags & (-49);
        this.f10201g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f10205l.users);
        arrayList2.addAll(this.f10205l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f10202i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f10205l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f10205l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f10205l;
        ArrayList arrayList = this.f10203j;
        ArrayList arrayList2 = this.f10204k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f10201g = 0;
            this.f10200f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f10200f = 0;
            this.f10201g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f10205l.users);
            return;
        }
        this.f10200f = tL_businessBotRecipients2.flags & (-49);
        this.f10201g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f10205l.users);
        arrayList2.addAll(this.f10205l.exclude_users);
    }

    public final boolean k(t61 t61Var) {
        if (!this.h && this.f10203j.isEmpty() && this.f10200f == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View z12 = t61Var.z1(101);
            int i10 = -this.f10206m;
            this.f10206m = i10;
            AndroidUtilities.shakeViewSpring(z12, i10);
            t61Var.y0(t61Var.y1(101));
            return false;
        }
        return true;
    }

    public a0(Context context, int i10, qc qcVar, e6 e6Var) {
        this.f10203j = new ArrayList();
        this.f10204k = new ArrayList();
        this.f10206m = -4;
        this.f10197a = context;
        this.f10198b = i10;
        this.d = null;
        this.e = qcVar;
        this.f10199c = e6Var;
    }
}
