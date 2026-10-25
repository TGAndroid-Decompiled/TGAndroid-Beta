package jg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import bi.z3;
import fi.ua;
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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class b0 {
    public final Context f15629a;
    public final int f15630b;
    public final u6 f15631c;
    public final r2 d;
    public final Runnable e;
    public int f15632f;
    public int f15633g;
    public boolean h;
    public boolean f15634i;
    public final ArrayList f15635j;
    public final ArrayList f15636k;
    public TL_account.TL_businessBotRecipients f15637l;
    public int f15638m;
    public boolean f15639n;

    public b0(r2 r2Var, Runnable runnable) {
        this.f15635j = new ArrayList();
        this.f15636k = new ArrayList();
        this.f15638m = -4;
        this.f15629a = r2Var.getContext();
        this.f15630b = r2Var.getCurrentAccount();
        this.d = r2Var;
        this.e = runnable;
        this.f15631c = r2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, j71 j71Var, boolean z10) {
        String str;
        String str2;
        j71Var.V();
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
                str = org.telegram.messenger.t.h(R.string.FilterExistingChats, a1.g.u(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = b10.u(str, ", ");
                }
                str = org.telegram.messenger.t.h(R.string.FilterNewChats, a1.g.u(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = b10.u(str, ", ");
                }
                str = org.telegram.messenger.t.h(R.string.FilterContacts, a1.g.u(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = b10.u(str, ", ");
                }
                str = org.telegram.messenger.t.h(R.string.FilterNonContacts, a1.g.u(str));
            }
            ArrayList arrayList2 = this.f15635j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder l4 = b10.l(str, " + ");
                    l4.append(arrayList2.size());
                    str = l4.toString();
                } else {
                    StringBuilder u10 = a1.g.u(str);
                    u10.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str = u10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            t61 f7 = t61.f(LocaleController.getString(R.string.BusinessChatsIncluded), str, 101);
            f7.f32868g = z10;
            arrayList.add(f7);
        }
        boolean z11 = this.f15634i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = org.telegram.messenger.t.h(R.string.FilterExistingChats, a1.g.u(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = b10.u(str3, ", ");
                    }
                    str3 = org.telegram.messenger.t.h(R.string.FilterNewChats, a1.g.u(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = b10.u(str3, ", ");
                    }
                    str3 = org.telegram.messenger.t.h(R.string.FilterContacts, a1.g.u(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = b10.u(str3, ", ");
                    }
                    str3 = org.telegram.messenger.t.h(R.string.FilterNonContacts, a1.g.u(str3));
                }
            }
            ArrayList arrayList3 = this.f15636k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder l10 = b10.l(str3, " + ");
                    l10.append(arrayList3.size());
                    str3 = l10.toString();
                } else {
                    StringBuilder u11 = a1.g.u(str3);
                    u11.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str3 = u11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            t61 f10 = t61.f(LocaleController.getString(R.string.BusinessChatsExcluded), str3, 103);
            f10.f32868g = z10;
            arrayList.add(f10);
        }
        j71Var.U();
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
        ArrayList arrayList2 = this.f15636k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f15635j;
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
        ArrayList arrayList2 = this.f15636k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f15635j;
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
            return this.f15633g;
        }
        return this.f15632f;
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
            arrayList = this.f15636k;
        } else {
            arrayList = this.f15635j;
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
            arrayList = this.f15636k;
        } else {
            arrayList = this.f15635j;
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f15637l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f15636k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f15635j;
            }
            if (arrayList.size() == this.f15637l.users.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!this.f15637l.users.contains(arrayList.get(i10))) {
                        return true;
                    }
                }
                if (this.f15634i && !this.h) {
                    if (arrayList2.size() == this.f15637l.exclude_users.size()) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (!this.f15637l.exclude_users.contains(arrayList2.get(i11))) {
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

    public final boolean h(t61 t61Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i10;
        int i11;
        int i12 = t61Var.d;
        r2 r2Var = this.d;
        boolean z12 = false;
        if (i12 != 101 && i12 != 103) {
            Runnable runnable = this.e;
            if (i12 == 102) {
                runnable.run();
                return true;
            } else if (i12 == 104) {
                runnable.run();
                return true;
            } else if (t61Var.f47037a != 11) {
                return false;
            } else {
                boolean z13 = t61Var.f32882w;
                String peerName = MessagesController.getInstance(this.f15630b).getPeerName(t61Var.f32883x);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f15629a, 0, this.f15631c);
                if (!z13) {
                    i10 = R.string.BusinessRecipientsRemoveExcludeTitle;
                } else {
                    i10 = R.string.BusinessRecipientsRemoveIncludeTitle;
                }
                String string = LocaleController.getString(i10);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                e2Var.R = string;
                if (!z13) {
                    i11 = R.string.BusinessRecipientsRemoveExcludeMessage;
                } else {
                    i11 = R.string.BusinessRecipientsRemoveIncludeMessage;
                }
                e2Var.T = LocaleController.formatString(i11, peerName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z3(this, z13, t61Var, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (r2Var != null) {
                    r2Var.showDialog(e2Var);
                    return true;
                }
                e2Var.show();
                return true;
            }
        }
        if (i12 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f15635j;
        } else {
            arrayList = this.f15636k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f36327x = 2;
        usersSelectActivity.G = false;
        if (this.f15634i && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.F = z11;
        usersSelectActivity.G = false;
        if (!z10 && this.f15639n) {
            z12 = true;
        }
        usersSelectActivity.H = z12;
        usersSelectActivity.f36323n = new di.f(1, this, z10);
        if (r2Var != null) {
            r2Var.presentFragment(usersSelectActivity);
            return true;
        }
        r2 U = LaunchActivity.U();
        if (U == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f22926a = true;
        U.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f15634i = true;
        this.f15637l = tL_businessBotRecipients;
        ArrayList arrayList = this.f15635j;
        ArrayList arrayList2 = this.f15636k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f15633g = 0;
            this.f15632f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f15632f = 0;
            this.f15633g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f15637l.users);
            return;
        }
        this.f15632f = tL_businessBotRecipients.flags & (-49);
        this.f15633g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f15637l.users);
        arrayList2.addAll(this.f15637l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f15634i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f15637l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f15637l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f15637l;
        ArrayList arrayList = this.f15635j;
        ArrayList arrayList2 = this.f15636k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f15633g = 0;
            this.f15632f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f15632f = 0;
            this.f15633g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f15637l.users);
            return;
        }
        this.f15632f = tL_businessBotRecipients2.flags & (-49);
        this.f15633g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f15637l.users);
        arrayList2.addAll(this.f15637l.exclude_users);
    }

    public final boolean k(r71 r71Var) {
        if (!this.h && this.f15635j.isEmpty() && this.f15632f == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View E1 = r71Var.E1(101);
            int i10 = -this.f15638m;
            this.f15638m = i10;
            AndroidUtilities.shakeViewSpring(E1, i10);
            r71Var.y0(r71Var.D1(101));
            return false;
        }
        return true;
    }

    public b0(Context context, int i10, ua uaVar, u6 u6Var) {
        this.f15635j = new ArrayList();
        this.f15636k = new ArrayList();
        this.f15638m = -4;
        this.f15629a = context;
        this.f15630b = i10;
        this.d = null;
        this.e = uaVar;
        this.f15631c = u6Var;
    }
}
