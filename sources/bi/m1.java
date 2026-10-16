package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ed;
import org.telegram.ui.fo;
import org.telegram.ui.hm;
import org.telegram.ui.jd;
import org.telegram.ui.of;
import org.telegram.ui.qe;
public final class m1 implements RequestDelegate {
    public final int f3295a;
    public final Object f3296b;
    public final Object f3297c;

    public m1(int i10, Object obj, Object obj2) {
        this.f3295a = i10;
        this.f3296b = obj;
        this.f3297c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.a6 a6Var;
        int i10;
        switch (this.f3295a) {
            case 0:
                t1 t1Var = (t1) this.f3296b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f3297c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(t1Var.e).lambda$processUpdates$377(updates, false);
                    return;
                }
                return;
            case 1:
                h5 h5Var = (h5) this.f3296b;
                di.ea eaVar = (di.ea) this.f3297c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(h5Var.f3126l.C2).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new d5(eaVar, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.l0((f8) this.f3296b, tLObject, (Runnable) this.f3297c, 9));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((i8) this.f3296b, tLObject, (Utilities.Callback) this.f3297c, tL_error, 3));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.l0((bc) this.f3296b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f3297c, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.l0((di.c2) this.f3296b, (String) this.f3297c, tLObject, 13));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.l0((di.u3) this.f3296b, tLObject, (MessagesController) this.f3297c, 16));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.l0((di.x9) this.f3296b, tLObject, (MessagesController) this.f3297c, 19));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.l0((boolean[]) this.f3296b, tLObject, (fi.u1) this.f3297c, 25));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.l0((fi.f4) this.f3296b, tLObject, (org.telegram.ui.ActionBar.a2) this.f3297c, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((hg.c) this.f3296b, tL_error, (String) this.f3297c, tLObject, 12));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hg.t((hg.j1) this.f3296b, (String) this.f3297c, tLObject, 1));
                return;
            case 12:
                hg.c2 c2Var = (hg.c2) this.f3296b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f3297c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new hg.t(c2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 4));
                    return;
                }
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new hg.t((ig.y) this.f3296b, tLObject, (TL_account.TL_businessChatLink) this.f3297c, 10));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new fi.q3(15, (ig.k0) this.f3296b, (org.telegram.ui.Components.o8) this.f3297c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new hg.t((ig.f2) this.f3296b, tLObject, (SharedPreferences) this.f3297c, 15));
                return;
            case 16:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f3296b, (Runnable) this.f3297c, tLObject, tL_error);
                return;
            case 17:
                ((VoIPService) this.f3296b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f3297c, tLObject, tL_error);
                return;
            case 18:
                ((VoIPService) this.f3296b).lambda$startOutgoingCall$10((byte[]) this.f3297c, tLObject, tL_error);
                return;
            case 19:
                ((VoIPService) this.f3296b).lambda$startConferenceGroupCall$32((AccountInstance) this.f3297c, tLObject, tL_error);
                return;
            case 20:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f3296b;
                ArrayList arrayList3 = (ArrayList) this.f3297c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i11 = 0;
                    ArrayList arrayList4 = null;
                    while (i11 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i11);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                int size2 = arrayList3.size();
                                int i12 = 0;
                                Bitmap bitmap = null;
                                Boolean bool = null;
                                while (i12 < size2) {
                                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) arrayList3.get(i12);
                                    if (e6Var.f19456o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.b6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, e6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(e6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (b6Var.f19349b == null) {
                                                b6Var.f19349b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.a6 a6Var2 = (org.telegram.ui.ActionBar.a6) b6Var.f19349b.get(attachFileName);
                                            if (a6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f19319b = new ArrayList();
                                                obj.f19318a = tL_wallPaper;
                                                b6Var.f19349b.put(attachFileName, obj);
                                                a6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                a6Var = a6Var2;
                                            }
                                            a6Var.f19319b.add(e6Var);
                                        }
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    i12++;
                                    arrayList3 = arrayList2;
                                }
                                arrayList = arrayList3;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                i11++;
                                arrayList3 = arrayList;
                            }
                        }
                        arrayList = arrayList3;
                        i11++;
                        arrayList3 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new di.x0((Object) b6Var, (Object) arrayList4, true, 10));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.ActionBar.f6) this.f3296b, tLObject, (org.telegram.ui.ActionBar.f6) this.f3297c, 7));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((org.telegram.ui.l8) this.f3296b, tL_error, tLObject, (Calendar) this.f3297c, 1));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.t1((ed) this.f3296b, tLObject, (org.telegram.ui.ActionBar.f6) this.f3297c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.t1((qe) this.f3296b, tLObject, (Context) this.f3297c, 12));
                return;
            case 25:
                fo foVar = (fo) this.f3296b;
                TLObject tLObject2 = (TLObject) this.f3297c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new of(foVar, i10, 5));
                    return;
                }
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.t1((fo) this.f3296b, tLObject, (TLRPC.User) this.f3297c, 21));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((fo) this.f3296b, tLObject, tL_error, (MessagesStorage) this.f3297c, 7));
                return;
            case 28:
                fo foVar2 = (fo) this.f3296b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f3297c;
                if (tL_error == null) {
                    foVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new jd(12, foVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new jd(13, foVar2, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.t1((hm) this.f3296b, tLObject, (MessageObject) this.f3297c, 23));
                return;
        }
    }
}
