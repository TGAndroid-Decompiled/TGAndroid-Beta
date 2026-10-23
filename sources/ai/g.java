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
import org.telegram.messenger.MessagesController;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class g implements RequestDelegate {
    public final int f1330a;
    public final Object f1331b;
    public final Object f1332c;

    public g(int i10, Object obj, Object obj2) {
        this.f1330a = i10;
        this.f1331b = obj;
        this.f1332c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f1330a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.l0((x) this.f1331b, tLObject, (Context) this.f1332c, 1));
                return;
            case 1:
                l7.W((l7) this.f1331b, (org.telegram.ui.ActionBar.c2) this.f1332c, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new y0((Object) ((l7) this.f1331b), tLObject, (Object) ((a3.l0) this.f1332c), tL_error, 3));
                return;
            case 3:
                l7.S((l7) this.f1331b, (TL_stars.InputSavedStarGift) this.f1332c, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.l0(tLObject, (u0) this.f1331b, (String) this.f1332c, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.l0((ha) this.f1331b, tLObject, tL_error, (Utilities.Callback) this.f1332c, 12));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.l0((ha) this.f1331b, tLObject, (Runnable) this.f1332c, 13));
                return;
            case 7:
                ci.h1 h1Var = (ci.h1) this.f1331b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f1332c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(h1Var.e).lambda$processUpdates$377(updates, false);
                    return;
                }
                return;
            case 8:
                ci.g4 g4Var = (ci.g4) this.f1331b;
                ei.r9 r9Var = (ei.r9) this.f1332c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(g4Var.f5359l.C2).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new ci.d4(r9Var, 0));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.l0((ci.s6) this.f1331b, tLObject, (Runnable) this.f1332c, 24));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new y0((Object) ((ci.v6) this.f1331b), tLObject, (Object) ((Utilities.Callback) this.f1332c), tL_error, 9));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new a3.l0((ci.ia) this.f1331b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f1332c, 26));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ei.z1((ei.a2) this.f1331b, (String) this.f1332c, tLObject, 0));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ei.z1((ei.p3) this.f1331b, tLObject, (MessagesController) this.f1332c, false, 3));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ei.z1((ei.k9) this.f1331b, tLObject, (MessagesController) this.f1332c, false, 6));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ei.z1((boolean[]) this.f1331b, tLObject, (gi.r1) this.f1332c, false, 10));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ei.z1((gi.u3) this.f1331b, tLObject, (org.telegram.ui.ActionBar.c2) this.f1332c, false, 13));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new y0((hg.c) this.f1331b, tL_error, (String) this.f1332c, tLObject, 18));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ei.z1((hg.j1) this.f1331b, (String) this.f1332c, tLObject, 16));
                return;
            case 19:
                hg.c2 c2Var = (hg.c2) this.f1331b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f1332c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new ei.z1(c2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 19));
                    return;
                }
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.y) this.f1331b, tLObject, (TL_account.TL_businessChatLink) this.f1332c, false, 25));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new hi.t(4, (ig.j0) this.f1331b, (org.telegram.ui.Components.d2) this.f1332c));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new ig.d2((ig.e2) this.f1331b, tLObject, (SharedPreferences) this.f1332c, 0));
                return;
            case 23:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f1332c, (Runnable) this.f1331b, tLObject, tL_error);
                return;
            case 24:
                ((VoIPService) this.f1331b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f1332c, tLObject, tL_error);
                return;
            case 25:
                ((VoIPService) this.f1331b).lambda$startOutgoingCall$10((byte[]) this.f1332c, tLObject, tL_error);
                return;
            case 26:
                ((VoIPService) this.f1331b).lambda$startConferenceGroupCall$32((AccountInstance) this.f1332c, tLObject, tL_error);
                return;
            case 27:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f1331b;
                ArrayList arrayList3 = (ArrayList) this.f1332c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i10 = 0;
                    ArrayList arrayList4 = null;
                    while (i10 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i10);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                int size2 = arrayList3.size();
                                int i11 = 0;
                                Bitmap bitmap = null;
                                Boolean bool = null;
                                while (i11 < size2) {
                                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) arrayList3.get(i11);
                                    if (i6Var.f20975o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.f6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, i6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(i6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (f6Var.f20894b == null) {
                                                f6Var.f20894b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) f6Var.f20894b.get(attachFileName);
                                            if (e6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f20875b = new ArrayList();
                                                obj.f20874a = tL_wallPaper;
                                                f6Var.f20894b.put(attachFileName, obj);
                                                e6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                e6Var = e6Var2;
                                            }
                                            e6Var.f20875b.add(i6Var);
                                        }
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    i11++;
                                    arrayList3 = arrayList2;
                                }
                                arrayList = arrayList3;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                i10++;
                                arrayList3 = arrayList;
                            }
                        }
                        arrayList = arrayList3;
                        i10++;
                        arrayList3 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new y7((Object) f6Var, (Object) arrayList4, true, 13));
                    return;
                }
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new ig.d2((org.telegram.ui.ActionBar.j6) this.f1331b, tLObject, (org.telegram.ui.ActionBar.j6) this.f1332c, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.k8) this.f1331b, tL_error, tLObject, (Calendar) this.f1332c, 7));
                return;
        }
    }

    public g(Context context, Runnable runnable) {
        this.f1330a = 23;
        this.f1332c = context;
        this.f1331b = runnable;
    }
}
