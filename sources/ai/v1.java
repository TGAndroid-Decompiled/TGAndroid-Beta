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
import org.telegram.ui.Components.id;
import org.telegram.ui.ad;
import org.telegram.ui.bo;
import org.telegram.ui.dm;
import org.telegram.ui.gf;
import org.telegram.ui.le;
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
        org.telegram.ui.ActionBar.d6 d6Var;
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
                w5 w5Var = (w5) this.f1600b;
                ci.ia iaVar = (ci.ia) this.f1601c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(w5Var.f1658l.C2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new s5(iaVar, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.k0((t8) this.f1600b, tLObject, (Runnable) this.f1601c, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i5((x8) this.f1600b, tLObject, (Utilities.Callback) this.f1601c, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.k0((sc) this.f1600b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f1601c, 8));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.d2) this.f1600b, (String) this.f1601c, tLObject, 12));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.w3) this.f1600b, tLObject, (MessagesController) this.f1601c, 15));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.ba) this.f1600b, tLObject, (MessagesController) this.f1601c, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.k0((boolean[]) this.f1600b, tLObject, (ei.v1) this.f1601c, 25));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.k0((ei.e4) this.f1600b, tLObject, (org.telegram.ui.ActionBar.c2) this.f1601c, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new i5((gg.c) this.f1600b, tL_error, (String) this.f1601c, tLObject));
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
                AndroidUtilities.runOnUIThread(new gg.t((hg.y) this.f1600b, tLObject, (TL_account.TL_businessChatLink) this.f1601c, 7));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.x1(3, (hg.l0) this.f1600b, (id) this.f1601c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.t((hg.f2) this.f1600b, tLObject, (SharedPreferences) this.f1601c, 12));
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
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f1600b;
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
                                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList3.get(i12);
                                    if (h6Var.f18731o.equals(tL_wallPaper.slug)) {
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
                                            if (e6Var.f18624b == null) {
                                                e6Var.f18624b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) e6Var.f18624b.get(attachFileName);
                                            if (d6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f18597b = new ArrayList();
                                                obj.f18596a = tL_wallPaper;
                                                e6Var.f18624b.put(attachFileName, obj);
                                                d6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                d6Var = d6Var2;
                                            }
                                            d6Var.f18597b.add(h6Var);
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
                    AndroidUtilities.runOnUIThread(new ci.y0((Object) e6Var, (Object) arrayList4, true, 10));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((org.telegram.ui.ActionBar.i6) this.f1600b, tLObject, (org.telegram.ui.ActionBar.i6) this.f1601c, 3));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((Object) ((org.telegram.ui.j8) this.f1600b), (Object) tL_error, tLObject, (Object) ((Calendar) this.f1601c), 3));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.q1((ad) this.f1600b, tLObject, (org.telegram.ui.ActionBar.i6) this.f1601c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.q1((le) this.f1600b, tLObject, (Context) this.f1601c, 12));
                return;
            case 25:
                bo boVar = (bo) this.f1600b;
                TLObject tLObject2 = (TLObject) this.f1601c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new gf(boVar, i10, 5));
                    return;
                }
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.q1((bo) this.f1600b, tLObject, (TLRPC.User) this.f1601c, 20));
                return;
            case 27:
                bo boVar2 = (bo) this.f1600b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f1601c;
                if (tL_error == null) {
                    boVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.l4(28, boVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.l4(29, boVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((org.telegram.ui.ActionBar.o2) ((bo) this.f1600b), tLObject, (TLObject) tL_error, (Object) ((MessagesStorage) this.f1601c), 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.q1((dm) this.f1600b, tLObject, (MessageObject) this.f1601c, 23));
                return;
        }
    }
}
