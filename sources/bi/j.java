package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
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
public final class j implements RequestDelegate {
    public final int f4852a;
    public final Object f4853b;
    public final Object f4854c;

    public j(int i10, Object obj, Object obj2) {
        this.f4852a = i10;
        this.f4853b = obj;
        this.f4854c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.s6 s6Var;
        switch (this.f4852a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.l0((y) this.f4853b, tLObject, (Context) this.f4854c, 6));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.e0((x) this.f4853b, tLObject, (String) this.f4854c, tL_error, 3));
                return;
            case 2:
                h7.W((h7) this.f4853b, (org.telegram.ui.ActionBar.e2) this.f4854c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.e0((h7) this.f4853b, tLObject, (a3.l0) this.f4854c, tL_error, 7));
                return;
            case 4:
                h7.S((h7) this.f4853b, (TL_stars.InputSavedStarGift) this.f4854c, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.l0(tLObject, (v0) this.f4853b, (String) this.f4854c, 15));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.l0((ca) this.f4853b, tLObject, tL_error, (Utilities.Callback) this.f4854c, 16));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.l0((ca) this.f4853b, tLObject, (Runnable) this.f4854c, 17));
                return;
            case 8:
                di.h1 h1Var = (di.h1) this.f4853b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f4854c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(h1Var.e).lambda$processUpdates$379(updates, false);
                    return;
                }
                return;
            case 9:
                di.h4 h4Var = (di.h4) this.f4853b;
                fi.n9 n9Var = (fi.n9) this.f4854c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(h4Var.f8626l.f9021r2).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new di.e4(n9Var, 0));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new a3.l0((di.s6) this.f4853b, tLObject, (Runnable) this.f4854c, 26));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ai.e0((di.v6) this.f4853b, tLObject, (Utilities.Callback) this.f4854c, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new a3.l0((di.ha) this.f4853b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f4854c, 28));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new e2.m0((fi.y1) this.f4853b, (String) this.f4854c, tLObject, 1));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new e2.m0((fi.n3) this.f4853b, tLObject, (MessagesController) this.f4854c, 4));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new e2.m0((fi.g9) this.f4853b, tLObject, (MessagesController) this.f4854c, 7));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new e2.m0((boolean[]) this.f4853b, tLObject, (hi.y1) this.f4854c, 11));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new e2.m0((hi.d4) this.f4853b, tLObject, (org.telegram.ui.ActionBar.e2) this.f4854c, 14));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ai.e0((ig.c) this.f4853b, tL_error, (String) this.f4854c, tLObject, 21));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new e2.m0((ig.j1) this.f4853b, (String) this.f4854c, tLObject, 20));
                return;
            case 20:
                ig.b2 b2Var = (ig.b2) this.f4853b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f4854c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new e2.m0(b2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 23));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.z) this.f4853b, tLObject, (TL_account.TL_businessChatLink) this.f4854c, 26));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new hi.u2(21, (jg.k0) this.f4853b, (org.telegram.ui.Components.h2) this.f4854c));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new jg.f1((Object) ((jg.g2) this.f4853b), tLObject, (Object) ((SharedPreferences) this.f4854c), 1));
                return;
            case 24:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f4854c, (Runnable) this.f4853b, tLObject, tL_error);
                return;
            case 25:
                ((VoIPService) this.f4853b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f4854c, tLObject, tL_error);
                return;
            case 26:
                ((VoIPService) this.f4853b).lambda$startOutgoingCall$10((byte[]) this.f4854c, tLObject, tL_error);
                return;
            case 27:
                ((VoIPService) this.f4853b).lambda$startConferenceGroupCall$32((AccountInstance) this.f4854c, tLObject, tL_error);
                return;
            case 28:
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) this.f4853b;
                ArrayList arrayList3 = (ArrayList) this.f4854c;
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
                                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) arrayList3.get(i11);
                                    if (w6Var.f23224o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.t6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, w6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(w6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (t6Var.f23105b == null) {
                                                t6Var.f23105b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) t6Var.f23105b.get(attachFileName);
                                            if (s6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f23087b = new ArrayList();
                                                obj.f23086a = tL_wallPaper;
                                                t6Var.f23105b.put(attachFileName, obj);
                                                s6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                s6Var = s6Var2;
                                            }
                                            s6Var.f23087b.add(w6Var);
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
                    AndroidUtilities.runOnUIThread(new u7((Object) t6Var, (Object) arrayList4, true, 13));
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new jg.f1((Object) ((org.telegram.ui.ActionBar.x6) this.f4853b), tLObject, (Object) ((org.telegram.ui.ActionBar.x6) this.f4854c), 23));
                return;
        }
    }

    public j(Context context, Runnable runnable) {
        this.f4852a = 24;
        this.f4854c = context;
        this.f4853b = runnable;
    }
}
