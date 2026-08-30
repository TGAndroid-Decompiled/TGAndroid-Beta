package dg;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import kh.b5;
import lh.g5;
import lh.p6;
import lh.r5;
import lh.t7;
import nh.h6;
import nh.r9;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.af;
import org.telegram.ui.am;
import org.telegram.ui.ih;
import org.telegram.ui.j8;
import org.telegram.ui.ke;
import org.telegram.ui.xn;
import org.telegram.ui.yb;
import org.telegram.ui.zc;
import ph.f8;
public final class d3 implements RequestDelegate {
    public final int f4452a;
    public final Object f4453b;
    public final Object f4454c;

    public d3(int i10, Object obj, Object obj2) {
        this.f4452a = i10;
        this.f4453b = obj;
        this.f4454c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        d6 d6Var;
        int i10;
        switch (this.f4452a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((q3) this.f4453b, tLObject, (o3) this.f4454c, tL_error, 3));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (MessagesController) this.f4453b, (gg.c2) this.f4454c, 6));
                return;
            case 2:
                MessagesController messagesController = (MessagesController) this.f4453b;
                vk vkVar = (vk) this.f4454c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.users.size(); i11++) {
                        TLRPC.User user = tL_contacts_found.users.get(i11);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f19331id)) {
                            arrayList3.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new gf.c(5, vkVar, arrayList3));
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((or0) this.f4453b, tL_error, (org.telegram.ui.ActionBar.p2) this.f4454c, 14));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((b5) this.f4453b, tLObject, (TL_stars.getResaleStarGifts) this.f4454c, 17));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((lh.q) this.f4453b, tLObject, (Context) this.f4454c, 19));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((g5) this.f4453b, tLObject, (androidx.car.app.utils.b) this.f4454c, tL_error, 8));
                return;
            case 7:
                g5.f1((g5) this.f4453b, (TL_stars.InputSavedStarGift) this.f4454c, tLObject, tL_error);
                return;
            case 8:
                g5.V0((g5) this.f4453b, (org.telegram.ui.ActionBar.d2) this.f4454c, tLObject, tL_error);
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((t7) this.f4453b, tLObject, tL_error, (Utilities.Callback) this.f4454c, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((t7) this.f4453b, tLObject, (Runnable) this.f4454c, 29));
                return;
            case 11:
                nh.e1 e1Var = (nh.e1) this.f4453b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f4454c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(e1Var.e).processUpdates(updates, false);
                    return;
                }
                return;
            case 12:
                nh.w3 w3Var = (nh.w3) this.f4453b;
                f8 f8Var = (f8) this.f4454c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(w3Var.f16027l.f15263z2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new nh.t3(f8Var, 0));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new p6((nh.d6) this.f4453b, tLObject, (Runnable) this.f4454c, 7));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((h6) this.f4453b, tLObject, (Utilities.Callback) this.f4454c, tL_error, 14));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new p6((r9) this.f4453b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f4454c, 9));
                return;
            case 16:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f4453b, (Runnable) this.f4454c, tLObject, tL_error);
                return;
            case 17:
                ((VoIPService) this.f4453b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f4454c, tLObject, tL_error);
                return;
            case 18:
                ((VoIPService) this.f4453b).lambda$startOutgoingCall$10((byte[]) this.f4454c, tLObject, tL_error);
                return;
            case 19:
                ((VoIPService) this.f4453b).lambda$startConferenceGroupCall$32((AccountInstance) this.f4454c, tLObject, tL_error);
                return;
            case 20:
                e6 e6Var = (e6) this.f4453b;
                ArrayList arrayList4 = (ArrayList) this.f4454c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i12 = 0;
                    ArrayList arrayList5 = null;
                    while (i12 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i12);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                int size2 = arrayList4.size();
                                int i13 = 0;
                                Bitmap bitmap = null;
                                Boolean bool = null;
                                while (i13 < size2) {
                                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList4.get(i13);
                                    if (h6Var.f19772o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList4;
                                            bitmap = e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, h6Var);
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(h6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (e6Var.f19670b == null) {
                                                e6Var.f19670b = new HashMap();
                                            }
                                            d6 d6Var2 = (d6) e6Var.f19670b.get(attachFileName);
                                            if (d6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList4;
                                                obj.f19644b = new ArrayList();
                                                obj.f19643a = tL_wallPaper;
                                                e6Var.f19670b.put(attachFileName, obj);
                                                d6Var = obj;
                                            } else {
                                                arrayList2 = arrayList4;
                                                d6Var = d6Var2;
                                            }
                                            d6Var.f19644b.add(h6Var);
                                        }
                                    } else {
                                        arrayList2 = arrayList4;
                                    }
                                    i13++;
                                    arrayList4 = arrayList2;
                                }
                                arrayList = arrayList4;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                i12++;
                                arrayList4 = arrayList;
                            }
                        }
                        arrayList = arrayList4;
                        i12++;
                        arrayList4 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new r5((Object) e6Var, (Object) arrayList5, true, 6));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new p6((i6) this.f4453b, tLObject, (i6) this.f4454c, 20));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((j8) this.f4453b, tL_error, tLObject, (Calendar) this.f4454c, 24));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((zc) this.f4453b, tLObject, (i6) this.f4454c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((ke) this.f4453b, tLObject, (Context) this.f4454c, 12));
                return;
            case 25:
                xn xnVar = (xn) this.f4453b;
                TLObject tLObject2 = (TLObject) this.f4454c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new af(xnVar, i10, 5));
                    return;
                }
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((xn) this.f4453b, tLObject, (TLRPC.User) this.f4454c, 20));
                return;
            case 27:
                xn xnVar2 = (xn) this.f4453b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f4454c;
                if (tL_error == null) {
                    xnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new yb(16, xnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new yb(17, xnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 28:
                AndroidUtilities.runOnUIThread(new ih((Object) ((xn) this.f4453b), (Object) tLObject, (Object) tL_error, (Object) ((MessagesStorage) this.f4454c), 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((am) this.f4453b, tLObject, (MessageObject) this.f4454c, 23));
                return;
        }
    }
}
