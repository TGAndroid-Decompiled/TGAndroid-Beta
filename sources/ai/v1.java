package ai;

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
import org.telegram.ui.Components.md;
import org.telegram.ui.df;
import org.telegram.ui.fh;
import org.telegram.ui.je;
import org.telegram.ui.wn;
import org.telegram.ui.yc;
import org.telegram.ui.zl;
public final class v1 implements RequestDelegate {
    public final int f1599a;
    public final Object f1600b;
    public final Object f1601c;

    public v1(int i10, Object obj, Object obj2) {
        this.f1599a = i10;
        this.f1600b = obj;
        this.f1601c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        switch (this.f1599a) {
            case 0:
                d2 d2Var = (d2) this.f1600b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f1601c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(d2Var.e).processUpdates(updates, false);
                    return;
                }
                return;
            case 1:
                v5 v5Var = (v5) this.f1600b;
                ci.fa faVar = (ci.fa) this.f1601c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(v5Var.f1617l.C2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r5(faVar, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.k0((u8) this.f1600b, tLObject, (Runnable) this.f1601c, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h5((x8) this.f1600b, tLObject, (Utilities.Callback) this.f1601c, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.k0((sc) this.f1600b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f1601c, 8));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.d2) this.f1600b, (String) this.f1601c, tLObject, 12));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.v3) this.f1600b, tLObject, (MessagesController) this.f1601c, 15));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.y9) this.f1600b, tLObject, (MessagesController) this.f1601c, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.k0((boolean[]) this.f1600b, tLObject, (ei.v1) this.f1601c, 25));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.k0((ei.e4) this.f1600b, tLObject, (org.telegram.ui.ActionBar.a2) this.f1601c, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new h5((gg.c) this.f1600b, tL_error, (String) this.f1601c, tLObject));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.t((gg.k1) this.f1600b, (String) this.f1601c, tLObject, 1));
                return;
            case 12:
                gg.e2 e2Var = (gg.e2) this.f1600b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f1601c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new gg.t(e2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 4));
                    return;
                }
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new gg.t((hg.a0) this.f1600b, tLObject, (TL_account.TL_businessChatLink) this.f1601c, 7));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.x1(3, (hg.m0) this.f1600b, (md) this.f1601c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.t((hg.g2) this.f1600b, tLObject, (SharedPreferences) this.f1601c, 12));
                return;
            case 16:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f1600b, (Runnable) this.f1601c, tLObject, tL_error);
                return;
            case 17:
                ((VoIPService) this.f1600b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f1601c, tLObject, tL_error);
                return;
            case 18:
                ((VoIPService) this.f1600b).lambda$startOutgoingCall$10((byte[]) this.f1601c, tLObject, tL_error);
                return;
            case 19:
                ((VoIPService) this.f1600b).lambda$startConferenceGroupCall$32((AccountInstance) this.f1601c, tLObject, tL_error);
                return;
            case 20:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f1600b;
                ArrayList arrayList3 = (ArrayList) this.f1601c;
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
                                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) arrayList3.get(i12);
                                    if (f6Var.f18913o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.c6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, f6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(f6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (c6Var.f18815b == null) {
                                                c6Var.f18815b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) c6Var.f18815b.get(attachFileName);
                                            if (b6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f18779b = new ArrayList();
                                                obj.f18778a = tL_wallPaper;
                                                c6Var.f18815b.put(attachFileName, obj);
                                                b6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                b6Var = b6Var2;
                                            }
                                            b6Var.f18779b.add(f6Var);
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
                    AndroidUtilities.runOnUIThread(new ci.y0((Object) c6Var, (Object) arrayList4, true, 11));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.ActionBar.g6) this.f1600b, tLObject, (org.telegram.ui.ActionBar.g6) this.f1601c, 6));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.h8) this.f1600b, tL_error, tLObject, (Calendar) this.f1601c, 4));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((yc) this.f1600b, tLObject, (org.telegram.ui.ActionBar.g6) this.f1601c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((je) this.f1600b, tLObject, (Context) this.f1601c, 12));
                return;
            case 25:
                wn wnVar = (wn) this.f1600b;
                TLObject tLObject2 = (TLObject) this.f1601c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new df(wnVar, i10, 5));
                    return;
                }
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((wn) this.f1600b, tLObject, (TLRPC.User) this.f1601c, 20));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((wn) this.f1600b, tLObject, tL_error, (MessagesStorage) this.f1601c, 10));
                return;
            case 28:
                wn wnVar2 = (wn) this.f1600b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f1601c;
                if (tL_error == null) {
                    wnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new fh(3, wnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new fh(4, wnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((zl) this.f1600b, tLObject, (MessageObject) this.f1601c, 23));
                return;
        }
    }
}
