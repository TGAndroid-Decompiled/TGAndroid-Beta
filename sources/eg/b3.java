package eg;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import lh.b5;
import mh.g5;
import mh.p6;
import mh.r5;
import mh.t7;
import oh.d6;
import oh.h6;
import oh.r9;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.af;
import org.telegram.ui.am;
import org.telegram.ui.fc;
import org.telegram.ui.ih;
import org.telegram.ui.j8;
import org.telegram.ui.ke;
import org.telegram.ui.xn;
import org.telegram.ui.zc;
import qh.d8;
public final class b3 implements RequestDelegate {
    public final int f5097a;
    public final Object f5098b;
    public final Object f5099c;

    public b3(int i10, Object obj, Object obj2) {
        this.f5097a = i10;
        this.f5098b = obj;
        this.f5099c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        e6 e6Var;
        int i10;
        switch (this.f5097a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((o3) this.f5098b, tLObject, (m3) this.f5099c, tL_error, 3));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (MessagesController) this.f5098b, (hg.c2) this.f5099c, 6));
                return;
            case 2:
                MessagesController messagesController = (MessagesController) this.f5098b;
                xk xkVar = (xk) this.f5099c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.users.size(); i11++) {
                        TLRPC.User user = tL_contacts_found.users.get(i11);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20990id)) {
                            arrayList3.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new gf.c(7, xkVar, arrayList3));
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((pr0) this.f5098b, tL_error, (org.telegram.ui.ActionBar.p2) this.f5099c, 15));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((b5) this.f5098b, tLObject, (TL_stars.getResaleStarGifts) this.f5099c, 18));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((mh.p) this.f5098b, tLObject, (Context) this.f5099c, 19));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((g5) this.f5098b, tLObject, (androidx.car.app.utils.b) this.f5099c, tL_error, 8));
                return;
            case 7:
                g5.f1((g5) this.f5098b, (TL_stars.InputSavedStarGift) this.f5099c, tLObject, tL_error);
                return;
            case 8:
                g5.V0((g5) this.f5098b, (org.telegram.ui.ActionBar.d2) this.f5099c, tLObject, tL_error);
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((t7) this.f5098b, tLObject, tL_error, (Utilities.Callback) this.f5099c, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((t7) this.f5098b, tLObject, (Runnable) this.f5099c, 29));
                return;
            case 11:
                oh.e1 e1Var = (oh.e1) this.f5098b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f5099c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(e1Var.f17005e).processUpdates(updates, false);
                    return;
                }
                return;
            case 12:
                oh.y3 y3Var = (oh.y3) this.f5098b;
                d8 d8Var = (d8) this.f5099c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(y3Var.f17950l.f17133z2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new oh.v3(d8Var, 0));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new p6((d6) this.f5098b, tLObject, (Runnable) this.f5099c, 9));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((h6) this.f5098b, tLObject, (Utilities.Callback) this.f5099c, tL_error, 15));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new p6((r9) this.f5098b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f5099c, 11));
                return;
            case 16:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f5098b, (Runnable) this.f5099c, tLObject, tL_error);
                return;
            case 17:
                ((VoIPService) this.f5098b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f5099c, tLObject, tL_error);
                return;
            case 18:
                ((VoIPService) this.f5098b).lambda$startOutgoingCall$10((byte[]) this.f5099c, tLObject, tL_error);
                return;
            case 19:
                ((VoIPService) this.f5098b).lambda$startConferenceGroupCall$32((AccountInstance) this.f5099c, tLObject, tL_error);
                return;
            case 20:
                f6 f6Var = (f6) this.f5098b;
                ArrayList arrayList4 = (ArrayList) this.f5099c;
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
                                    i6 i6Var = (i6) arrayList4.get(i13);
                                    if (i6Var.f21479o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList4;
                                            bitmap = f6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, i6Var);
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(i6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (f6Var.f21366b == null) {
                                                f6Var.f21366b = new HashMap();
                                            }
                                            e6 e6Var2 = (e6) f6Var.f21366b.get(attachFileName);
                                            if (e6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList4;
                                                obj.f21335b = new ArrayList();
                                                obj.f21334a = tL_wallPaper;
                                                f6Var.f21366b.put(attachFileName, obj);
                                                e6Var = obj;
                                            } else {
                                                arrayList2 = arrayList4;
                                                e6Var = e6Var2;
                                            }
                                            e6Var.f21335b.add(i6Var);
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
                    AndroidUtilities.runOnUIThread(new r5((Object) f6Var, (Object) arrayList5, true, 6));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new p6((j6) this.f5098b, tLObject, (j6) this.f5099c, 20));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((j8) this.f5098b, tL_error, tLObject, (Calendar) this.f5099c, 24));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((zc) this.f5098b, tLObject, (j6) this.f5099c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((ke) this.f5098b, tLObject, (Context) this.f5099c, 12));
                return;
            case 25:
                xn xnVar = (xn) this.f5098b;
                TLObject tLObject2 = (TLObject) this.f5099c;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((xn) this.f5098b, tLObject, (TLRPC.User) this.f5099c, 20));
                return;
            case 27:
                xn xnVar2 = (xn) this.f5098b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f5099c;
                if (tL_error == null) {
                    xnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new fc(15, xnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new fc(16, xnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 28:
                AndroidUtilities.runOnUIThread(new ih((Object) ((xn) this.f5098b), (Object) tLObject, (Object) tL_error, (Object) ((MessagesStorage) this.f5099c), 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((am) this.f5098b, tLObject, (MessageObject) this.f5099c, 23));
                return;
        }
    }
}
