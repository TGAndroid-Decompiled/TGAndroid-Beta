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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
import org.telegram.ui.fm;
import org.telegram.ui.gf;
import org.telegram.ui.qh;
import org.telegram.ui.qo;
import org.telegram.ui.rq;
import org.telegram.ui.yo;
import org.telegram.ui.yp;
public final class o2 implements RequestDelegate {
    public final int f3299a;
    public final Object f3300b;
    public final Object f3301c;

    public o2(int i10, Object obj, Object obj2) {
        this.f3299a = i10;
        this.f3300b = obj;
        this.f3301c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        switch (this.f3299a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.k0((p2) this.f3300b, (String) this.f3301c, tLObject, 4));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.k0((o4) this.f3300b, tLObject, (MessagesController) this.f3301c, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.k0((kb) this.f3300b, tLObject, (MessagesController) this.f3301c, 10));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new a3.k0((boolean[]) this.f3300b, tLObject, (di.y1) this.f3301c, 15));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.k0((di.h4) this.f3300b, tLObject, (org.telegram.ui.ActionBar.d2) this.f3301c, 18));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((fg.c) this.f3300b, tL_error, (String) this.f3301c, tLObject, 8));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.k0((fg.l1) this.f3300b, (String) this.f3301c, tLObject, 23));
                return;
            case 7:
                fg.f2 f2Var = (fg.f2) this.f3300b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f3301c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new a3.k0(f2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 26));
                    return;
                }
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.k0((gg.b0) this.f3300b, tLObject, (TL_account.TL_businessChatLink) this.f3301c, 29));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new fg.s1(3, (gg.p0) this.f3300b, (org.telegram.ui.Components.zd) this.f3301c));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new gg.a0((gg.o2) this.f3300b, tLObject, (SharedPreferences) this.f3301c, 4));
                return;
            case 11:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f3300b, (Runnable) this.f3301c, tLObject, tL_error);
                return;
            case 12:
                ((VoIPService) this.f3300b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f3301c, tLObject, tL_error);
                return;
            case 13:
                ((VoIPService) this.f3300b).lambda$startOutgoingCall$10((byte[]) this.f3301c, tLObject, tL_error);
                return;
            case 14:
                ((VoIPService) this.f3300b).lambda$startConferenceGroupCall$32((AccountInstance) this.f3301c, tLObject, tL_error);
                return;
            case 15:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f3300b;
                ArrayList arrayList3 = (ArrayList) this.f3301c;
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
                                    if (h6Var.f17803o.equals(tL_wallPaper.slug)) {
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
                                            if (e6Var.f17694b == null) {
                                                e6Var.f17694b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) e6Var.f17694b.get(attachFileName);
                                            if (d6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f17657b = new ArrayList();
                                                obj.f17656a = tL_wallPaper;
                                                e6Var.f17694b.put(attachFileName, obj);
                                                d6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                d6Var = d6Var2;
                                            }
                                            d6Var.f17657b.add(h6Var);
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
                    AndroidUtilities.runOnUIThread(new c1((Object) e6Var, (Object) arrayList4, true, 10));
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new gg.a0((org.telegram.ui.ActionBar.i6) this.f3300b, tLObject, (org.telegram.ui.ActionBar.i6) this.f3301c, 25));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((org.telegram.ui.h8) this.f3300b, tL_error, tLObject, (Calendar) this.f3301c, 29));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((org.telegram.ui.ad) this.f3300b, tLObject, (org.telegram.ui.ActionBar.i6) this.f3301c, 10));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((org.telegram.ui.le) this.f3300b, tLObject, (Context) this.f3301c, 12));
                return;
            case 20:
                eo eoVar = (eo) this.f3300b;
                TLObject tLObject2 = (TLObject) this.f3301c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new gf(eoVar, i10, 5));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((eo) this.f3300b, tLObject, (TLRPC.User) this.f3301c, 20));
                return;
            case 22:
                eo eoVar2 = (eo) this.f3300b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f3301c;
                if (tL_error == null) {
                    eoVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new qh(1, eoVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new qh(2, eoVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((eo) this.f3300b, tLObject, tL_error, (MessagesStorage) this.f3301c, 5));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((fm) this.f3300b, tLObject, (MessageObject) this.f3301c, 23));
                return;
            case 25:
                yo yoVar = (yo) this.f3300b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f3301c;
                TLRPC.UserFull userFull = yoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    yoVar.getMessagesStorage().updateUserInfo(yoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new qo(yoVar, 2));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new qh(14, (yp) this.f3300b, (org.telegram.ui.ActionBar.d2[]) this.f3301c));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((rq) this.f3300b, tL_error, tLObject, (TwoStepVerificationActivity) this.f3301c, false, 8));
                return;
            case 28:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) this.f3300b;
                NotificationCenter.getInstance(l5Var.e).doOnIdle(new org.telegram.ui.Components.k5(l5Var, (ArrayList) this.f3301c, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.a0((org.telegram.ui.Components.j8) this.f3300b, (org.telegram.ui.ActionBar.d2) this.f3301c, tLObject, 29));
                return;
        }
    }
}
