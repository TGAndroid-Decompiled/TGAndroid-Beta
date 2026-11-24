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
public final class pm implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public pm(String str, ArrayList arrayList) {
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
                rm rmVar = (rm) this.b;
                nm7.f(rmVar.e).d(new qm(rmVar, (ArrayList) this.c, tLObject, (byte) 0));
                return;
            case 1:
                gm.c3(new op6((i30) this.b, (he) this.c, tLObject, (byte) 10));
                return;
            case 2:
                gm.c3(new op6(tLObject, (oc7) this.b, (z0a) this.c));
                return;
            case 3:
                oc7 oc7Var = (oc7) this.b;
                u35 u35Var = (u35) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    oc7Var.d4(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < tL_contacts_found.users.size(); i2++) {
                        TLRPC.User user = tL_contacts_found.users.get(i2);
                        if (!user.self && !m9c.z(user) && !m9c.C(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    gm.c3(new x30(u35Var, arrayList, (byte) 11));
                    return;
                }
                return;
            case 4:
                gm.c3(new l97(tLObject, (ArrayList) this.c, (String) this.b, tL_error, (byte) 12));
                return;
            case 5:
                gm.c3(new op6((Object) ((au0) this.b), tLObject, (Object) ((Context) this.c), (byte) 26));
                return;
            case 6:
                gm.c3(new l97((zt0) this.b, tLObject, (String) this.c, tL_error, (byte) 13));
                return;
            case 7:
                gm.c3(new op6((Object) ((boolean[]) this.b), tLObject, (Object) ((qu0) this.c), (byte) 27));
                return;
            case 8:
                gm.c3(new tv0((q51) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (byte) 7));
                return;
            case 9:
                gm.c3(new l97((k91) this.b, tL_error, tLObject, (Calendar) this.c, (byte) 19));
                return;
            case 10:
                mh1 mh1Var = (mh1) this.b;
                mh1Var.getClass();
                gm.c3(new tv0(mh1Var, tLObject, (he) this.c, (byte) 18));
                return;
            case 11:
                gm.c3(new tv0((ti1) this.b, tLObject, (bmb) this.c, (byte) 19));
                return;
            case 12:
                gm.c3(new tv0((ik1) this.b, tLObject, (Activity) this.c, (byte) 22));
                return;
            case 13:
                yv1 yv1Var = (yv1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                yv1Var.getClass();
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    gm.c3(new vm1(yv1Var, i, (byte) 5));
                    return;
                }
                return;
            case 14:
                gm.c3(new co1((yv1) this.b, tLObject, (TLRPC.User) this.c, (byte) 3));
                return;
            case 15:
                yv1 yv1Var2 = (yv1) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                yv1Var2.getClass();
                if (tL_error == null) {
                    yv1Var2.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new uj1(yv1Var2, tL_messages_sendScheduledMessages, (byte) 15));
                    return;
                } else if (tL_error.text != null) {
                    gm.c3(new uj1(yv1Var2, tL_error, (byte) 16));
                    return;
                } else {
                    return;
                }
            case 16:
                gm.c3(new xo1((yv1) this.b, tLObject, tL_error, (cf7) this.c, (byte) 1));
                return;
            case 17:
                gm.c3(new co1((bu1) this.b, tLObject, (k47) this.c, (byte) 5));
                return;
            case 18:
                gm.c3(new lx1((i22) this.b, (TLRPC.TL_attachMenuBot) this.c, (byte) 9));
                return;
            case 19:
                gm.c3(new lx1((i22) this.b, (b22) this.c, (byte) 8));
                return;
            case 20:
                ba2 ba2Var = (ba2) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = ba2Var.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    ba2Var.getMessagesStorage().g2(ba2Var.E0, false);
                }
                gm.c3(new v92(ba2Var, (byte) 2));
                return;
            case 21:
                gm.c3(new ra2((ib2) this.b, (he[]) this.c, (byte) 1));
                return;
            case 22:
                ke2 ke2Var = (ke2) this.b;
                ke2Var.getClass();
                gm.c3(new xo1(ke2Var, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (byte) 9));
                return;
            case 23:
                gm.c3(new co1((gf2) this.b, tLObject, (bmb) this.c, (byte) 20));
                return;
            case 24:
                gm.c3(new ra2((yg2) this.b, (ge7) this.c, (byte) 19));
                return;
            case 25:
                ConnectionsManager.lambda$sendRequestTyped$3((Executor) this.b, (jac) this.c, tLObject, tL_error);
                return;
            case 26:
                bw2 bw2Var = (bw2) this.b;
                dm8 dm8Var = (dm8) this.c;
                if (tL_error == null) {
                    bw2Var.a0.clear();
                    bw2Var.Z.clear();
                    bw2Var.n0 = 0;
                    bw2Var.s = false;
                    bw2Var.e = false;
                    bw2Var.h = false;
                    bw2Var.b = false;
                    bw2Var.r = false;
                    bw2Var.w = "";
                    gm.c3(new mv2(bw2Var, dm8Var, (byte) 1));
                    return;
                }
                gm.c3(dm8Var);
                return;
            case 27:
                bw2 bw2Var2 = (bw2) this.b;
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
                    bw2Var2.getMessagesController().T3(updates, false);
                    for (int i4 = 0; i4 < updates.users.size(); i4++) {
                        TLRPC.User user3 = updates.users.get(i4);
                        if (user3.id == user2.id) {
                            Utilities.h.c(new mv2(bw2Var2, user3, (byte) 2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user3.id;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(tL_contact);
                            bw2Var2.getMessagesStorage().Z0(arrayList2, false);
                            if (!TextUtils.isEmpty(user3.phone)) {
                                bw2.m(0, user3.first_name, user3.last_name);
                                bw2Var2.getMessagesStorage().e(user3.phone, "");
                                yv2 yv2Var = (yv2) bw2Var2.a0.get(user3.phone);
                                if (yv2Var != null && (indexOf = yv2Var.g.indexOf(user3.phone)) != -1) {
                                    yv2Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    gm.c3(new co1(bw2Var2, updates, user2, (byte) 29));
                    return;
                }
                return;
            case 28:
                bw2 bw2Var3 = (bw2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    gm.c3(new co1(bw2Var3, editor, (Vector) tLObject, (byte) 27));
                    return;
                }
                return;
            default:
                gm.c3(new pz2((kw3) this.b, tLObject, (k47) this.c, (byte) 17));
                return;
        }
    }

    public pm(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
