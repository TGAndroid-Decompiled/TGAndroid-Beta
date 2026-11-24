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
public final class pl implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public pl(String str, ArrayList arrayList) {
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
                rl rlVar = (rl) this.b;
                kk7.f(rlVar.e).d(new ql(rlVar, (ArrayList) this.c, tLObject, (byte) 0));
                return;
            case 1:
                gl.d3(new nn6((i20) this.b, (hd) this.c, tLObject, (byte) 10));
                return;
            case 2:
                gl.d3(new nn6(tLObject, (na7) this.b, (xy9) this.c));
                return;
            case 3:
                na7 na7Var = (na7) this.b;
                x15 x15Var = (x15) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    na7Var.a4(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < tL_contacts_found.users.size(); i2++) {
                        TLRPC.User user = tL_contacts_found.users.get(i2);
                        if (!user.self && !l7c.y(user) && !l7c.B(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    gl.d3(new z20(x15Var, arrayList, (byte) 10));
                    return;
                }
                return;
            case 4:
                gl.d3(new s67(tLObject, (ArrayList) this.c, (String) this.b, tL_error, (byte) 12));
                return;
            case 5:
                gl.d3(new nn6((byte) 25, (ss0) this.b, (Context) this.c, tLObject));
                return;
            case 6:
                gl.d3(new s67((rs0) this.b, tLObject, (String) this.c, tL_error, (byte) 13));
                return;
            case 7:
                gl.d3(new nn6((byte) 26, (boolean[]) this.b, (it0) this.c, tLObject));
                return;
            case 8:
                gl.d3(new fv0((j41) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (byte) 6));
                return;
            case 9:
                gl.d3(new s67((b81) this.b, tL_error, tLObject, (Calendar) this.c, (byte) 19));
                return;
            case 10:
                eg1 eg1Var = (eg1) this.b;
                eg1Var.getClass();
                gl.d3(new fv0(eg1Var, tLObject, (hd) this.c, (byte) 17));
                return;
            case 11:
                gl.d3(new fv0((lh1) this.b, tLObject, (akb) this.c, (byte) 18));
                return;
            case 12:
                gl.d3(new fv0((zi1) this.b, tLObject, (Activity) this.c, (byte) 21));
                return;
            case 13:
                mu1 mu1Var = (mu1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                mu1Var.getClass();
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    gl.d3(new ml1(mu1Var, i, (byte) 5));
                    return;
                }
                return;
            case 14:
                gl.d3(new jn1((mu1) this.b, tLObject, (TLRPC.User) this.c, (byte) 1));
                return;
            case 15:
                gl.d3(new hn1((mu1) this.b, tLObject, tL_error, (ad7) this.c, (byte) 1));
                return;
            case 16:
                mu1 mu1Var2 = (mu1) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                mu1Var2.getClass();
                if (tL_error == null) {
                    mu1Var2.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new aj1(mu1Var2, tL_messages_sendScheduledMessages, (byte) 14));
                    return;
                } else if (tL_error.text != null) {
                    gl.d3(new aj1(mu1Var2, tL_error, (byte) 15));
                    return;
                } else {
                    return;
                }
            case 17:
                gl.d3(new jn1((ps1) this.b, tLObject, (k27) this.c, (byte) 3));
                return;
            case 18:
                gl.d3(new kx1((x02) this.b, (TLRPC.TL_attachMenuBot) this.c, (byte) 8));
                return;
            case 19:
                gl.d3(new kx1((x02) this.b, (q02) this.c, (byte) 7));
                return;
            case 20:
                p82 p82Var = (p82) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = p82Var.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    p82Var.getMessagesStorage().g2(p82Var.E0, false);
                }
                gl.d3(new k82(p82Var, (byte) 2));
                return;
            case 21:
                gl.d3(new n92((x92) this.b, (hd[]) this.c, (byte) 0));
                return;
            case 22:
                zc2 zc2Var = (zc2) this.b;
                zc2Var.getClass();
                gl.d3(new hn1(zc2Var, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (byte) 9));
                return;
            case 23:
                gl.d3(new jn1((vd2) this.b, tLObject, (akb) this.c, (byte) 18));
                return;
            case 24:
                gl.d3(new n92((mf2) this.b, (on7) this.c, (byte) 18));
                return;
            case 25:
                ConnectionsManager.lambda$sendRequestTyped$3((Executor) this.b, (i8c) this.c, tLObject, tL_error);
                return;
            case 26:
                qu2 qu2Var = (qu2) this.b;
                ak8 ak8Var = (ak8) this.c;
                if (tL_error == null) {
                    qu2Var.a0.clear();
                    qu2Var.Z.clear();
                    qu2Var.n0 = 0;
                    qu2Var.s = false;
                    qu2Var.e = false;
                    qu2Var.h = false;
                    qu2Var.b = false;
                    qu2Var.r = false;
                    qu2Var.w = "";
                    gl.d3(new gu2(qu2Var, ak8Var, (byte) 0));
                    return;
                }
                gl.d3(ak8Var);
                return;
            case 27:
                qu2 qu2Var2 = (qu2) this.b;
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
                    qu2Var2.getMessagesController().Q3(updates, false);
                    for (int i4 = 0; i4 < updates.users.size(); i4++) {
                        TLRPC.User user3 = updates.users.get(i4);
                        if (user3.id == user2.id) {
                            Utilities.h.c(new gu2(qu2Var2, user3, (byte) 1));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user3.id;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(tL_contact);
                            qu2Var2.getMessagesStorage().Z0(arrayList2, false);
                            if (!TextUtils.isEmpty(user3.phone)) {
                                qu2.m(0, user3.first_name, user3.last_name);
                                qu2Var2.getMessagesStorage().e(user3.phone, "");
                                nu2 nu2Var = (nu2) qu2Var2.a0.get(user3.phone);
                                if (nu2Var != null && (indexOf = nu2Var.g.indexOf(user3.phone)) != -1) {
                                    nu2Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    gl.d3(new jn1(qu2Var2, updates, user2, (byte) 27));
                    return;
                }
                return;
            case 28:
                qu2 qu2Var3 = (qu2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    gl.d3(new jn1(qu2Var3, editor, (Vector) tLObject, (byte) 25));
                    return;
                }
                return;
            default:
                gl.d3(new mg3((zu3) this.b, tLObject, (k27) this.c, (byte) 15));
                return;
        }
    }

    public pl(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
