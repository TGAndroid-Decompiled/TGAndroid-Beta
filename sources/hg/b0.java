package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import ci.rc;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class b0 {
    public final Context f11158a;
    public final int f11159b;
    public final e6 f11160c;
    public final n2 d;
    public final Runnable f11161e;
    public int f11162f;
    public int f11163g;
    public boolean h;
    public boolean f11164i;
    public final ArrayList f11165j;
    public final ArrayList f11166k;
    public TL_account.TL_businessBotRecipients f11167l;
    public int f11168m;
    public boolean f11169n;

    public b0(n2 n2Var, Runnable runnable) {
        this.f11165j = new ArrayList();
        this.f11166k = new ArrayList();
        this.f11168m = -4;
        this.f11158a = n2Var.getContext();
        this.f11159b = n2Var.getCurrentAccount();
        this.d = n2Var;
        this.f11161e = runnable;
        this.f11160c = n2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, d71 d71Var, boolean z10) {
        String str;
        String str2;
        d71Var.U();
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
                str = org.telegram.messenger.q.g(R.string.FilterExistingChats, a1.g.v(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = sc.v.v(str, ", ");
                }
                str = org.telegram.messenger.q.g(R.string.FilterNewChats, a1.g.v(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = sc.v.v(str, ", ");
                }
                str = org.telegram.messenger.q.g(R.string.FilterContacts, a1.g.v(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = sc.v.v(str, ", ");
                }
                str = org.telegram.messenger.q.g(R.string.FilterNonContacts, a1.g.v(str));
            }
            ArrayList arrayList2 = this.f11165j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder j3 = sc.v.j(str, " + ");
                    j3.append(arrayList2.size());
                    str = j3.toString();
                } else {
                    StringBuilder v = a1.g.v(str);
                    v.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str = v.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            q61 f7 = q61.f(LocaleController.getString(R.string.BusinessChatsIncluded), str, 101);
            f7.f30059g = z10;
            arrayList.add(f7);
        }
        boolean z11 = this.f11164i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = org.telegram.messenger.q.g(R.string.FilterExistingChats, a1.g.v(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = sc.v.v(str3, ", ");
                    }
                    str3 = org.telegram.messenger.q.g(R.string.FilterNewChats, a1.g.v(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = sc.v.v(str3, ", ");
                    }
                    str3 = org.telegram.messenger.q.g(R.string.FilterContacts, a1.g.v(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = sc.v.v(str3, ", ");
                    }
                    str3 = org.telegram.messenger.q.g(R.string.FilterNonContacts, a1.g.v(str3));
                }
            }
            ArrayList arrayList3 = this.f11166k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder j10 = sc.v.j(str3, " + ");
                    j10.append(arrayList3.size());
                    str3 = j10.toString();
                } else {
                    StringBuilder v9 = a1.g.v(str3);
                    v9.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str3 = v9.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            q61 f10 = q61.f(LocaleController.getString(R.string.BusinessChatsExcluded), str3, 103);
            f10.f30059g = z10;
            arrayList.add(f10);
        }
        d71Var.T();
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
        ArrayList arrayList2 = this.f11166k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f11165j;
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
        ArrayList arrayList2 = this.f11166k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f11165j;
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
            return this.f11163g;
        }
        return this.f11162f;
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
            arrayList = this.f11166k;
        } else {
            arrayList = this.f11165j;
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
            arrayList = this.f11166k;
        } else {
            arrayList = this.f11165j;
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f11167l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f11166k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f11165j;
            }
            if (arrayList.size() == this.f11167l.users.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!this.f11167l.users.contains(arrayList.get(i10))) {
                        return true;
                    }
                }
                if (this.f11164i && !this.h) {
                    if (arrayList2.size() == this.f11167l.exclude_users.size()) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (!this.f11167l.exclude_users.contains(arrayList2.get(i11))) {
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

    public final boolean h(q61 q61Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i10;
        int i11;
        int i12 = q61Var.d;
        n2 n2Var = this.d;
        boolean z12 = false;
        if (i12 != 101 && i12 != 103) {
            Runnable runnable = this.f11161e;
            if (i12 == 102) {
                runnable.run();
                return true;
            } else if (i12 == 104) {
                runnable.run();
                return true;
            } else if (q61Var.f17129a != 11) {
                return false;
            } else {
                boolean z13 = q61Var.f30073w;
                String peerName = MessagesController.getInstance(this.f11159b).getPeerName(q61Var.f30074x);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f11158a, 0, this.f11160c);
                if (!z13) {
                    i10 = R.string.BusinessRecipientsRemoveExcludeTitle;
                } else {
                    i10 = R.string.BusinessRecipientsRemoveIncludeTitle;
                }
                String string = LocaleController.getString(i10);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                b2Var.R = string;
                if (!z13) {
                    i11 = R.string.BusinessRecipientsRemoveExcludeMessage;
                } else {
                    i11 = R.string.BusinessRecipientsRemoveIncludeMessage;
                }
                b2Var.T = LocaleController.formatString(i11, peerName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new com.google.firebase.messaging.i(this, z13, q61Var, 1));
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
            arrayList = this.f11165j;
        } else {
            arrayList = this.f11166k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f34639x = 2;
        usersSelectActivity.G = false;
        if (this.f11164i && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.F = z11;
        usersSelectActivity.G = false;
        if (!z10 && this.f11169n) {
            z12 = true;
        }
        usersSelectActivity.H = z12;
        usersSelectActivity.f34635n = new ai.k(1, this, z10);
        if (n2Var != null) {
            n2Var.presentFragment(usersSelectActivity);
            return true;
        }
        n2 U = LaunchActivity.U();
        if (U == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f21361a = true;
        U.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f11164i = true;
        this.f11167l = tL_businessBotRecipients;
        ArrayList arrayList = this.f11165j;
        ArrayList arrayList2 = this.f11166k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f11163g = 0;
            this.f11162f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f11162f = 0;
            this.f11163g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f11167l.users);
            return;
        }
        this.f11162f = tL_businessBotRecipients.flags & (-49);
        this.f11163g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f11167l.users);
        arrayList2.addAll(this.f11167l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f11164i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f11167l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f11167l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f11167l;
        ArrayList arrayList = this.f11165j;
        ArrayList arrayList2 = this.f11166k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f11163g = 0;
            this.f11162f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f11162f = 0;
            this.f11163g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f11167l.users);
            return;
        }
        this.f11162f = tL_businessBotRecipients2.flags & (-49);
        this.f11163g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f11167l.users);
        arrayList2.addAll(this.f11167l.exclude_users);
    }

    public final boolean k(l71 l71Var) {
        if (!this.h && this.f11165j.isEmpty() && this.f11162f == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View z12 = l71Var.z1(101);
            int i10 = -this.f11168m;
            this.f11168m = i10;
            AndroidUtilities.shakeViewSpring(z12, i10);
            l71Var.x0(l71Var.y1(101));
            return false;
        }
        return true;
    }

    public b0(Context context, int i10, rc rcVar, e6 e6Var) {
        this.f11165j = new ArrayList();
        this.f11166k = new ArrayList();
        this.f11168m = -4;
        this.f11158a = context;
        this.f11159b = i10;
        this.d = null;
        this.f11161e = rcVar;
        this.f11160c = e6Var;
    }
}
