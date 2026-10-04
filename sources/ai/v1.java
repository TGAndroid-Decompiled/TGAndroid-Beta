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
import org.telegram.ui.Components.ld;
import org.telegram.ui.ad;
import org.telegram.ui.hf;
import org.telegram.ui.me;
import org.telegram.ui.oh;
import org.telegram.ui.yn;
import org.telegram.ui.zl;
public final class v1 implements RequestDelegate {
    public final int f1736a;
    public final Object f1737b;
    public final Object f1738c;

    public v1(int i10, Object obj, Object obj2) {
        this.f1736a = i10;
        this.f1737b = obj;
        this.f1738c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        switch (this.f1736a) {
            case 0:
                d2 d2Var = (d2) this.f1737b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f1738c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(d2Var.f756e).processUpdates(updates, false);
                    return;
                }
                return;
            case 1:
                v5 v5Var = (v5) this.f1737b;
                ci.ea eaVar = (ci.ea) this.f1738c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(v5Var.f1756l.C2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r5(eaVar, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.k0((u8) this.f1737b, tLObject, (Runnable) this.f1738c, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h5((x8) this.f1737b, tLObject, (Utilities.Callback) this.f1738c, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.k0((sc) this.f1737b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f1738c, 8));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.d2) this.f1737b, (String) this.f1738c, tLObject, 12));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.v3) this.f1737b, tLObject, (MessagesController) this.f1738c, 15));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.x9) this.f1737b, tLObject, (MessagesController) this.f1738c, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.k0((boolean[]) this.f1737b, tLObject, (ei.w1) this.f1738c, 25));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.k0((ei.f4) this.f1737b, tLObject, (org.telegram.ui.ActionBar.b2) this.f1738c, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new h5((gg.c) this.f1737b, tL_error, (String) this.f1738c, tLObject));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.t((gg.k1) this.f1737b, (String) this.f1738c, tLObject, 1));
                return;
            case 12:
                gg.e2 e2Var = (gg.e2) this.f1737b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f1738c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new gg.t(e2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 4));
                    return;
                }
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new gg.t((hg.y) this.f1737b, tLObject, (TL_account.TL_businessChatLink) this.f1738c, 7));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.x1(3, (hg.l0) this.f1737b, (ld) this.f1738c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.t((hg.f2) this.f1737b, tLObject, (SharedPreferences) this.f1738c, 12));
                return;
            case 16:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f1737b, (Runnable) this.f1738c, tLObject, tL_error);
                return;
            case 17:
                ((VoIPService) this.f1737b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f1738c, tLObject, tL_error);
                return;
            case 18:
                ((VoIPService) this.f1737b).lambda$startOutgoingCall$10((byte[]) this.f1738c, tLObject, tL_error);
                return;
            case 19:
                ((VoIPService) this.f1737b).lambda$startConferenceGroupCall$32((AccountInstance) this.f1738c, tLObject, tL_error);
                return;
            case 20:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f1737b;
                ArrayList arrayList3 = (ArrayList) this.f1738c;
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
                                    if (f6Var.f20623o.equals(tL_wallPaper.slug)) {
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
                                            if (c6Var.f20508b == null) {
                                                c6Var.f20508b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) c6Var.f20508b.get(attachFileName);
                                            if (b6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f20475b = new ArrayList();
                                                obj.f20474a = tL_wallPaper;
                                                c6Var.f20508b.put(attachFileName, obj);
                                                b6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                b6Var = b6Var2;
                                            }
                                            b6Var.f20475b.add(f6Var);
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
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.ActionBar.h6) this.f1737b, tLObject, (org.telegram.ui.ActionBar.h6) this.f1738c, 6));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((org.telegram.ui.k8) this.f1737b), (Object) tL_error, tLObject, (Object) ((Calendar) this.f1738c), 3));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((ad) this.f1737b, tLObject, (org.telegram.ui.ActionBar.h6) this.f1738c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((me) this.f1737b, tLObject, (Context) this.f1738c, 13));
                return;
            case 25:
                yn ynVar = (yn) this.f1737b;
                TLObject tLObject2 = (TLObject) this.f1738c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new hf(ynVar, i10, 5));
                    return;
                }
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((yn) this.f1737b, tLObject, (TLRPC.User) this.f1738c, 20));
                return;
            case 27:
                yn ynVar2 = (yn) this.f1737b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f1738c;
                if (tL_error == null) {
                    ynVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new oh(2, ynVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new oh(3, ynVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((org.telegram.ui.ActionBar.n2) ((yn) this.f1737b), tLObject, (TLObject) tL_error, (Object) ((MessagesStorage) this.f1738c), 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((zl) this.f1737b, tLObject, (MessageObject) this.f1738c, 23));
                return;
        }
    }
}
