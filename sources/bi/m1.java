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
import org.telegram.ui.co;
import org.telegram.ui.ef;
import org.telegram.ui.em;
import org.telegram.ui.fh;
import org.telegram.ui.ke;
import org.telegram.ui.zc;
public final class m1 implements RequestDelegate {
    public final int f3327a;
    public final Object f3328b;
    public final Object f3329c;

    public m1(int i10, Object obj, Object obj2) {
        this.f3327a = i10;
        this.f3328b = obj;
        this.f3329c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        switch (this.f3327a) {
            case 0:
                t1 t1Var = (t1) this.f3328b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f3329c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(t1Var.f3745e).processUpdates(updates, false);
                    return;
                }
                return;
            case 1:
                f5 f5Var = (f5) this.f3328b;
                di.ia iaVar = (di.ia) this.f3329c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(f5Var.f2999l.C2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new b5(iaVar, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.k0((b8) this.f3328b, tLObject, (Runnable) this.f3329c, 9));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f8) this.f3328b, tLObject, (Utilities.Callback) this.f3329c, tL_error, 3));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.k0((yb) this.f3328b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f3329c, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.k0((di.d2) this.f3328b, (String) this.f3329c, tLObject, 13));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.k0((di.w3) this.f3328b, tLObject, (MessagesController) this.f3329c, 16));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.k0((di.ba) this.f3328b, tLObject, (MessagesController) this.f3329c, 19));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.k0((boolean[]) this.f3328b, tLObject, (fi.v1) this.f3329c, 25));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.k0((fi.e4) this.f3328b, tLObject, (org.telegram.ui.ActionBar.b2) this.f3329c, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((hg.c) this.f3328b, tL_error, (String) this.f3329c, tLObject, 13));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hg.t((hg.k1) this.f3328b, (String) this.f3329c, tLObject, 1));
                return;
            case 12:
                hg.d2 d2Var = (hg.d2) this.f3328b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f3329c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new hg.t(d2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 4));
                    return;
                }
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new hg.t((ig.y) this.f3328b, tLObject, (TL_account.TL_businessChatLink) this.f3329c, 9));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new fi.j4(13, (ig.k0) this.f3328b, (org.telegram.ui.Components.m8) this.f3329c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new hg.t((ig.f2) this.f3328b, tLObject, (SharedPreferences) this.f3329c, 14));
                return;
            case 16:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f3328b, (Runnable) this.f3329c, tLObject, tL_error);
                return;
            case 17:
                ((VoIPService) this.f3328b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f3329c, tLObject, tL_error);
                return;
            case 18:
                ((VoIPService) this.f3328b).lambda$startOutgoingCall$10((byte[]) this.f3329c, tLObject, tL_error);
                return;
            case 19:
                ((VoIPService) this.f3328b).lambda$startConferenceGroupCall$32((AccountInstance) this.f3329c, tLObject, tL_error);
                return;
            case 20:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f3328b;
                ArrayList arrayList3 = (ArrayList) this.f3329c;
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
                                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList3.get(i12);
                                    if (h6Var.f20529o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, h6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(h6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (e6Var.f20422b == null) {
                                                e6Var.f20422b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) e6Var.f20422b.get(attachFileName);
                                            if (d6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f20395b = new ArrayList();
                                                obj.f20394a = tL_wallPaper;
                                                e6Var.f20422b.put(attachFileName, obj);
                                                d6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                d6Var = d6Var2;
                                            }
                                            d6Var.f20395b.add(h6Var);
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
                    AndroidUtilities.runOnUIThread(new di.y0((Object) e6Var, (Object) arrayList4, true, 10));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.ActionBar.i6) this.f3328b, tLObject, (org.telegram.ui.ActionBar.i6) this.f3329c, 3));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((org.telegram.ui.h8) this.f3328b), (Object) tL_error, tLObject, (Object) ((Calendar) this.f3329c), 3));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((zc) this.f3328b, tLObject, (org.telegram.ui.ActionBar.i6) this.f3329c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((ke) this.f3328b, tLObject, (Context) this.f3329c, 12));
                return;
            case 25:
                co coVar = (co) this.f3328b;
                TLObject tLObject2 = (TLObject) this.f3329c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new ef(coVar, i10, 5));
                    return;
                }
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((co) this.f3328b, tLObject, (TLRPC.User) this.f3329c, 20));
                return;
            case 27:
                co coVar2 = (co) this.f3328b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f3329c;
                if (tL_error == null) {
                    coVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new fh(4, coVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new fh(5, coVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.ActionBar.n2) ((co) this.f3328b), tLObject, (TLObject) tL_error, (Object) ((MessagesStorage) this.f3329c), 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((em) this.f3328b, tLObject, (MessageObject) this.f3329c, 23));
                return;
        }
    }
}
