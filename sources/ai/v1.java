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
import org.telegram.ui.Components.nd;
import org.telegram.ui.cm;
import org.telegram.ui.hf;
import org.telegram.ui.je;
import org.telegram.ui.ug;
import org.telegram.ui.yc;
import org.telegram.ui.zn;
public final class v1 implements RequestDelegate {
    public final int f1816a;
    public final Object f1817b;
    public final Object f1818c;

    public v1(int i10, Object obj, Object obj2) {
        this.f1816a = i10;
        this.f1817b = obj;
        this.f1818c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        switch (this.f1816a) {
            case 0:
                d2 d2Var = (d2) this.f1817b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f1818c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(d2Var.f809e).lambda$processUpdates$377(updates, false);
                    return;
                }
                return;
            case 1:
                w5 w5Var = (w5) this.f1817b;
                ci.fa faVar = (ci.fa) this.f1818c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(w5Var.f1860l.C2).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new s5(faVar, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.k0((v8) this.f1817b, tLObject, (Runnable) this.f1818c, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i5((y8) this.f1817b, tLObject, (Utilities.Callback) this.f1818c, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.k0((tc) this.f1817b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f1818c, 8));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.c2) this.f1817b, (String) this.f1818c, tLObject, 12));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.u3) this.f1817b, tLObject, (MessagesController) this.f1818c, 15));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.y9) this.f1817b, tLObject, (MessagesController) this.f1818c, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.k0((boolean[]) this.f1817b, tLObject, (ei.v1) this.f1818c, 25));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.k0((ei.e4) this.f1817b, tLObject, (org.telegram.ui.ActionBar.a2) this.f1818c, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new i5((gg.c) this.f1817b, tL_error, (String) this.f1818c, tLObject));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.t((gg.j1) this.f1817b, (String) this.f1818c, tLObject, 1));
                return;
            case 12:
                gg.d2 d2Var2 = (gg.d2) this.f1817b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f1818c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new gg.t(d2Var2, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 4));
                    return;
                }
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new gg.t((hg.z) this.f1817b, tLObject, (TL_account.TL_businessChatLink) this.f1818c, 7));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.w1(3, (hg.l0) this.f1817b, (nd) this.f1818c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.t((hg.g2) this.f1817b, tLObject, (SharedPreferences) this.f1818c, 12));
                return;
            case 16:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f1817b, (Runnable) this.f1818c, tLObject, tL_error);
                return;
            case 17:
                ((VoIPService) this.f1817b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f1818c, tLObject, tL_error);
                return;
            case 18:
                ((VoIPService) this.f1817b).lambda$startOutgoingCall$10((byte[]) this.f1818c, tLObject, tL_error);
                return;
            case 19:
                ((VoIPService) this.f1817b).lambda$startConferenceGroupCall$32((AccountInstance) this.f1818c, tLObject, tL_error);
                return;
            case 20:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f1817b;
                ArrayList arrayList3 = (ArrayList) this.f1818c;
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
                                    if (f6Var.f20654o.equals(tL_wallPaper.slug)) {
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
                                            if (c6Var.f20548b == null) {
                                                c6Var.f20548b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) c6Var.f20548b.get(attachFileName);
                                            if (b6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f20510b = new ArrayList();
                                                obj.f20509a = tL_wallPaper;
                                                c6Var.f20548b.put(attachFileName, obj);
                                                b6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                b6Var = b6Var2;
                                            }
                                            b6Var.f20510b.add(f6Var);
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
                    AndroidUtilities.runOnUIThread(new ci.x0((Object) c6Var, (Object) arrayList4, true, 12));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.ActionBar.g6) this.f1817b, tLObject, (org.telegram.ui.ActionBar.g6) this.f1818c, 7));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((org.telegram.ui.f8) this.f1817b), (Object) tL_error, tLObject, (Object) ((Calendar) this.f1818c), 3));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.q1((yc) this.f1817b, tLObject, (org.telegram.ui.ActionBar.g6) this.f1818c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.q1((je) this.f1817b, tLObject, (Context) this.f1818c, 12));
                return;
            case 25:
                zn znVar = (zn) this.f1817b;
                TLObject tLObject2 = (TLObject) this.f1818c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new hf(znVar, i10, 5));
                    return;
                }
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.q1((zn) this.f1817b, tLObject, (TLRPC.User) this.f1818c, 21));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.ActionBar.m2) ((zn) this.f1817b), tLObject, (TLObject) tL_error, (Object) ((MessagesStorage) this.f1818c), 9));
                return;
            case 28:
                zn znVar2 = (zn) this.f1817b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f1818c;
                if (tL_error == null) {
                    znVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ug(5, znVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ug(6, znVar2, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.q1((cm) this.f1817b, tLObject, (MessageObject) this.f1818c, 23));
                return;
        }
    }
}
