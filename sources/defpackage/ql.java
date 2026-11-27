package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.Executor;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ql implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public ql(String str, ArrayList arrayList) {
        this.a = (byte) 4;
        this.c = arrayList;
        this.b = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        int indexOf;
        switch (this.a) {
            case 0:
                sl slVar = (sl) this.b;
                jn7.f(slVar.e).d(new rl(slVar, (ArrayList) this.c, tLObject, (byte) 0));
                return;
            case 1:
                hl.c3(new es6((j20) this.b, (id) this.c, tLObject, (byte) 10));
                return;
            case 2:
                hl.c3(new es6(tLObject, (uc7) this.b, (r2a) this.c));
                return;
            case 3:
                uc7 uc7Var = (uc7) this.b;
                v35 v35Var = (v35) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    uc7Var.j4(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < tL_contacts_found.users.size(); i2++) {
                        TLRPC.User user = tL_contacts_found.users.get(i2);
                        if (!user.self && !lbc.z(user) && !lbc.C(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    hl.c3(new a30(v35Var, arrayList, (byte) 11));
                    return;
                }
                return;
            case 4:
                hl.c3(new o97(tLObject, (ArrayList) this.c, (String) this.b, tL_error, (byte) 12));
                return;
            case 5:
                hl.c3(new es6((Object) ((at0) this.b), tLObject, (Object) ((Context) this.c), (byte) 26));
                return;
            case 6:
                hl.c3(new o97((zs0) this.b, tLObject, (String) this.c, tL_error, (byte) 13));
                return;
            case 7:
                hl.c3(new es6((Object) ((boolean[]) this.b), tLObject, (Object) ((qt0) this.c), (byte) 27));
                return;
            case 8:
                hl.c3(new tu0((r41) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (byte) 7));
                return;
            case 9:
                hl.c3(new o97((j81) this.b, tL_error, tLObject, (Calendar) this.c, (byte) 19));
                return;
            case 10:
                ng1 ng1Var = (ng1) this.b;
                ng1Var.getClass();
                hl.c3(new tu0(ng1Var, tLObject, (id) this.c, (byte) 18));
                return;
            case 11:
                hl.c3(new tu0((uh1) this.b, tLObject, (znb) this.c, (byte) 19));
                return;
            case 12:
                hl.c3(new tu0((ij1) this.b, tLObject, (Activity) this.c, (byte) 22));
                return;
            case 13:
                zu1 zu1Var = (zu1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                zu1Var.getClass();
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    hl.c3(new ul1(zu1Var, i, (byte) 4));
                    return;
                }
                return;
            case 14:
                hl.c3(new on1((zu1) this.b, tLObject, (TLRPC.User) this.c, (byte) 0));
                return;
            case 15:
                hl.c3(new ao1((zu1) this.b, tLObject, tL_error, (kf7) this.c, (byte) 0));
                return;
            case 16:
                zu1 zu1Var2 = (zu1) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                zu1Var2.getClass();
                if (tL_error == null) {
                    zu1Var2.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new jj1(zu1Var2, tL_messages_sendScheduledMessages, (byte) 11));
                    return;
                } else if (tL_error.text != null) {
                    hl.c3(new jj1(zu1Var2, tL_error, (byte) 12));
                    return;
                } else {
                    return;
                }
            case 17:
                hl.c3(new on1((ct1) this.b, tLObject, (r47) this.c, (byte) 5));
                return;
            case 18:
                hl.c3(new dy1((n12) this.b, (g12) this.c, (byte) 7));
                return;
            case 19:
                hl.c3(new dy1((n12) this.b, (TLRPC.TL_attachMenuBot) this.c, (byte) 8));
                return;
            case 20:
                g92 g92Var = (g92) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = g92Var.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    g92Var.getMessagesStorage().l2(g92Var.E0, false);
                }
                hl.c3(new b92(g92Var, (byte) 2));
                return;
            case 21:
                hl.c3(new dy1((na2) this.b, (id[]) this.c, (byte) 29));
                return;
            case 22:
                pd2 pd2Var = (pd2) this.b;
                pd2Var.getClass();
                hl.c3(new ao1(pd2Var, tL_error, tLObject, (TwoStepVerificationActivity) this.c, false, (byte) 9));
                return;
            case 23:
                hl.c3(new on1((me2) this.b, tLObject, (znb) this.c, (byte) 22));
                return;
            case 24:
                hl.c3(new ea2((dg2) this.b, (oe7) this.c, (byte) 17));
                return;
            case 25:
                ConnectionsManager.lambda$sendRequestTyped$3((Executor) this.b, (icc) this.c, tLObject, tL_error);
                return;
            case 26:
                lv2 lv2Var = (lv2) this.b;
                on8 on8Var = (on8) this.c;
                if (tL_error == null) {
                    lv2Var.a0.clear();
                    lv2Var.Z.clear();
                    lv2Var.n0 = 0;
                    lv2Var.s = false;
                    lv2Var.e = false;
                    lv2Var.h = false;
                    lv2Var.b = false;
                    lv2Var.r = false;
                    lv2Var.w = "";
                    hl.c3(new ea2(lv2Var, on8Var, (byte) 29));
                    return;
                }
                hl.c3(on8Var);
                return;
            case 27:
                lv2 lv2Var2 = (lv2) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i3 = 0; i3 < updates.users.size(); i3++) {
                            if (updates.users.get(i3).id == user2.id) {
                                updates.users.get(i3).photo = user2.photo;
                            }
                        }
                    }
                    lv2Var2.getMessagesController().Y3(updates, false);
                    for (int i4 = 0; i4 < updates.users.size(); i4++) {
                        TLRPC.User user3 = updates.users.get(i4);
                        if (user3.id == user2.id) {
                            Utilities.h.c(new bv2(lv2Var2, user3, (byte) 0));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user3.id;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(tL_contact);
                            lv2Var2.getMessagesStorage().d1(arrayList2, false);
                            if (!TextUtils.isEmpty(user3.phone)) {
                                lv2.m(0, user3.first_name, user3.last_name);
                                lv2Var2.getMessagesStorage().e(user3.phone, "");
                                iv2 iv2Var = (iv2) lv2Var2.a0.get(user3.phone);
                                if (iv2Var != null && (indexOf = iv2Var.g.indexOf(user3.phone)) != -1) {
                                    iv2Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    hl.c3(new cv2(lv2Var2, updates, user2, (byte) 0));
                    return;
                }
                return;
            case 28:
                lv2 lv2Var3 = (lv2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    hl.c3(new cv2(lv2Var3, editor, (Vector) tLObject, (byte) 1));
                    return;
                }
                return;
            default:
                hl.c3(new cv2((tv3) this.b, tLObject, (r47) this.c, (byte) 19));
                return;
        }
    }

    public ql(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
