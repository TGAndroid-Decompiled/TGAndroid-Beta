package ag;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.w7;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.df;
import org.telegram.ui.fp;
import org.telegram.ui.h8;
import org.telegram.ui.ho;
import org.telegram.ui.iq;
import org.telegram.ui.le;
import org.telegram.ui.oo;
import org.telegram.ui.qp;
import org.telegram.ui.un;
import org.telegram.ui.xc;
import org.telegram.ui.zg;
import org.telegram.ui.zl;
public final class k0 implements RequestDelegate {
    public final int f598a;
    public final Object f599b;
    public final Object f600c;

    public k0(int i10, Object obj, Object obj2) {
        this.f598a = i10;
        this.f599b = obj;
        this.f600c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        n6 n6Var;
        int i10;
        switch (this.f598a) {
            case 0:
                org.telegram.messenger.i0.g3(new a3.l0((s0) this.f599b, tLObject, (TL_account.TL_businessChatLink) this.f600c, 3));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new a1.f(8, (j1) this.f599b, (qq) this.f600c));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new a3.l0((n3) this.f599b, tLObject, (SharedPreferences) this.f600c, 8));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new q0((jg.v2) this.f599b, tLObject, (jg.t2) this.f600c, tL_error, 6));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new li.s(tLObject, (vp) this.f599b, (mg.s1) this.f600c, 6));
                return;
            case 5:
                vp vpVar = (vp) this.f599b;
                vg vgVar = (vg) this.f600c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    vpVar.V3(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.users.size(); i11++) {
                        TLRPC.User user = tL_contacts_found.users.get(i11);
                        if (!user.self && !h20.x(user) && !h20.A(user.f19942id)) {
                            arrayList3.add(user);
                        }
                    }
                    org.telegram.messenger.i0.g3(new k2.u(26, vgVar, arrayList3));
                    return;
                }
                return;
            case 6:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f599b, (Runnable) this.f600c, tLObject, tL_error);
                return;
            case 7:
                ((VoIPService) this.f599b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f600c, tLObject, tL_error);
                return;
            case 8:
                ((VoIPService) this.f599b).lambda$startOutgoingCall$10((byte[]) this.f600c, tLObject, tL_error);
                return;
            case 9:
                ((VoIPService) this.f599b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.f600c, tLObject, tL_error);
                return;
            case 10:
                o6 o6Var = (o6) this.f599b;
                ArrayList arrayList4 = (ArrayList) this.f600c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList5 = null;
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i12);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                b8.G(d20.f15147s0);
                                File K = b8.K(tL_wallPaper.document, str, true, true);
                                int size2 = arrayList4.size();
                                String str2 = str;
                                Boolean bool = str2;
                                int i13 = 0;
                                Bitmap bitmap = str2;
                                while (i13 < size2) {
                                    r6 r6Var = (r6) arrayList4.get(i13);
                                    if (r6Var.f20741o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(K.exists());
                                        }
                                        if (bitmap != 0 || bool.booleanValue()) {
                                            arrayList2 = arrayList4;
                                            bitmap = o6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), K, r6Var);
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(r6Var);
                                        } else {
                                            String r10 = b8.r(null, tL_wallPaper.document);
                                            if (o6Var.f20631b == null) {
                                                o6Var.f20631b = new HashMap();
                                            }
                                            n6 n6Var2 = (n6) o6Var.f20631b.get(r10);
                                            if (n6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList4;
                                                obj.f20616b = new ArrayList();
                                                obj.f20615a = tL_wallPaper;
                                                o6Var.f20631b.put(r10, obj);
                                                n6Var = obj;
                                            } else {
                                                arrayList2 = arrayList4;
                                                n6Var = n6Var2;
                                            }
                                            n6Var.f20616b.add(r6Var);
                                        }
                                    } else {
                                        arrayList2 = arrayList4;
                                    }
                                    i13++;
                                    arrayList4 = arrayList2;
                                    bitmap = bitmap;
                                }
                                arrayList = arrayList4;
                                if (bitmap != 0) {
                                    bitmap.recycle();
                                }
                                i12++;
                                arrayList4 = arrayList;
                                str = null;
                            }
                        }
                        arrayList = arrayList4;
                        i12++;
                        arrayList4 = arrayList;
                        str = null;
                    }
                    org.telegram.messenger.i0.g3(new j0((Object) o6Var, (Object) arrayList5, true, 10));
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.i0.g3(new li.s((s6) this.f599b, tLObject, (s6) this.f600c, 21));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new q0((Object) ((h8) this.f599b), (Object) tL_error, tLObject, (Object) ((Calendar) this.f600c), 22));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new org.telegram.ui.p1((xc) this.f599b, tLObject, (s6) this.f600c, 10));
                return;
            case 14:
                org.telegram.messenger.i0.g3(new org.telegram.ui.p1((le) this.f599b, tLObject, (Context) this.f600c, 13));
                return;
            case 15:
                un unVar = (un) this.f599b;
                TLObject tLObject2 = (TLObject) this.f600c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    org.telegram.messenger.i0.g3(new df(unVar, i10, 6));
                    return;
                }
                return;
            case 16:
                org.telegram.messenger.i0.g3(new org.telegram.ui.p1((un) this.f599b, tLObject, (TLRPC.User) this.f600c, 21));
                return;
            case 17:
                org.telegram.messenger.i0.g3(new q0((Object) ((un) this.f599b), (Object) tLObject, (Object) tL_error, (Object) ((hs) this.f600c), 28));
                return;
            case 18:
                un unVar2 = (un) this.f599b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f600c;
                if (tL_error == null) {
                    unVar2.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(new zg(3, unVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.i0.g3(new zg(4, unVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 19:
                org.telegram.messenger.i0.g3(new org.telegram.ui.p1((zl) this.f599b, tLObject, (jj) this.f600c, 23));
                return;
            case 20:
                oo ooVar = (oo) this.f599b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f600c;
                TLRPC.UserFull userFull = ooVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    ooVar.getMessagesStorage().j2(ooVar.D0, false);
                }
                org.telegram.messenger.i0.g3(new ho(ooVar, 2));
                return;
            case 21:
                org.telegram.messenger.i0.g3(new zg(16, (qp) this.f599b, (org.telegram.ui.ActionBar.x1[]) this.f600c));
                return;
            case 22:
                org.telegram.messenger.i0.g3(new fp((iq) this.f599b, tL_error, tLObject, (TwoStepVerificationActivity) this.f600c, 1));
                return;
            case 23:
                b5 b5Var = (b5) this.f599b;
                zs.f(b5Var.e).d(new a5(b5Var, (ArrayList) this.f600c, tLObject, 0));
                return;
            case 24:
                org.telegram.messenger.i0.g3(new li.s((w7) this.f599b, (org.telegram.ui.ActionBar.x1) this.f600c, tLObject, 26));
                return;
            case 25:
                org.telegram.messenger.i0.g3(new cd(9, (bi) this.f599b, (TLRPC.TL_attachMenuBot) this.f600c));
                return;
            case 26:
                org.telegram.messenger.i0.g3(new cd(8, (bi) this.f599b, (vh) this.f600c));
                return;
            case 27:
                org.telegram.messenger.i0.g3(new jg((bp) this.f599b, tLObject, (s6) this.f600c, 2));
                return;
            case 28:
                org.telegram.messenger.i0.g3(new at(12, (j00) this.f599b, (Pair) this.f600c));
                return;
            default:
                org.telegram.messenger.i0.g3(new fp((Object) ((j00) this.f599b), (Object) tL_error, (Object) tLObject, (Object) ((q20) this.f600c), 11));
                return;
        }
    }
}
