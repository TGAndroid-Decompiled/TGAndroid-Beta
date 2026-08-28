package bg;

import android.content.Context;
import android.graphics.Bitmap;
import fh.p5;
import gh.k5;
import gh.u5;
import gh.v7;
import ih.b4;
import ih.f6;
import ih.h3;
import ih.j6;
import ih.v9;
import ih.y3;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import kh.n9;
import kh.p3;
import kh.t9;
import mh.u3;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.eb0;
import org.telegram.ui.g8;
import org.telegram.ui.k6;
public final class j0 implements RequestDelegate {
    public final int f1843a;
    public final Object f1844b;
    public final Object f1845c;

    public j0(int i9, Object obj, Object obj2) {
        this.f1843a = i9;
        this.f1844b = obj;
        this.f1845c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        z5 z5Var;
        switch (this.f1843a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (MessagesController) this.f1844b, (m2) this.f1845c, 5));
                return;
            case 1:
                MessagesController messagesController = (MessagesController) this.f1844b;
                eb0 eb0Var = (eb0) this.f1845c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i9 = 0; i9 < tL_contacts_found.users.size(); i9++) {
                        TLRPC.User user = tL_contacts_found.users.get(i9);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f22527id)) {
                            arrayList3.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a1.e(12, eb0Var, arrayList3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((vq0) this.f1844b, tL_error, (org.telegram.ui.ActionBar.o2) this.f1845c, 12));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((p5) this.f1844b, tLObject, (TL_stars.getResaleStarGifts) this.f1845c, 15));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((gh.r) this.f1844b, tLObject, (Context) this.f1845c, 16));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((k5) this.f1844b, tLObject, (androidx.car.app.utils.b) this.f1845c, tL_error, 6));
                return;
            case 6:
                k5.f1((k5) this.f1844b, (TL_stars.InputSavedStarGift) this.f1845c, tLObject, tL_error);
                return;
            case 7:
                k5.V0((k5) this.f1844b, (org.telegram.ui.ActionBar.c2) this.f1845c, tLObject, tL_error);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((v7) this.f1844b, tLObject, tL_error, (Utilities.Callback) this.f1845c, 25));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((v7) this.f1844b, tLObject, (Runnable) this.f1845c, 26));
                return;
            case 10:
                ih.f1 f1Var = (ih.f1) this.f1844b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f1845c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(f1Var.f11401e).processUpdates(updates, false);
                    return;
                }
                return;
            case 11:
                b4 b4Var = (b4) this.f1844b;
                t9 t9Var = (t9) this.f1845c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(b4Var.f11268l.f11609y2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new y3(t9Var, 0));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new h3((f6) this.f1844b, tLObject, (Runnable) this.f1845c, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((j6) this.f1844b, tLObject, (Utilities.Callback) this.f1845c, tL_error, 12));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new h3((v9) this.f1844b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f1845c, 7));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new h3((kh.a2) this.f1844b, (String) this.f1845c, tLObject, 10));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new h3((p3) this.f1845c, tLObject, (MessagesController) this.f1844b, 13));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new h3((n9) this.f1845c, tLObject, (MessagesController) this.f1844b, 16));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new h3((boolean[]) this.f1844b, tLObject, (mh.r1) this.f1845c, 20));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new h3((u3) this.f1844b, tLObject, (org.telegram.ui.ActionBar.c2) this.f1845c, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((of.c) this.f1844b, tL_error, (String) this.f1845c, tLObject, 22));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new h3((of.f1) this.f1844b, (String) this.f1845c, tLObject, 26));
                return;
            case 22:
                of.w1 w1Var = (of.w1) this.f1844b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f1845c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new h3(w1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 29));
                    return;
                }
                return;
            case 23:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f1844b, (Runnable) this.f1845c, tLObject, tL_error);
                return;
            case 24:
                ((VoIPService) this.f1844b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f1845c, tLObject, tL_error);
                return;
            case 25:
                ((VoIPService) this.f1844b).lambda$startOutgoingCall$10((byte[]) this.f1845c, tLObject, tL_error);
                return;
            case 26:
                ((VoIPService) this.f1844b).lambda$startConferenceGroupCall$32((AccountInstance) this.f1845c, tLObject, tL_error);
                return;
            case 27:
                a6 a6Var = (a6) this.f1844b;
                ArrayList arrayList4 = (ArrayList) this.f1845c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i10 = 0;
                    ArrayList arrayList5 = null;
                    while (i10 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i10);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                int size2 = arrayList4.size();
                                int i11 = 0;
                                Bitmap bitmap = null;
                                Boolean bool = null;
                                while (i11 < size2) {
                                    d6 d6Var = (d6) arrayList4.get(i11);
                                    if (d6Var.f22878o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList4;
                                            bitmap = a6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, d6Var);
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(d6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (a6Var.f22740b == null) {
                                                a6Var.f22740b = new HashMap();
                                            }
                                            z5 z5Var2 = (z5) a6Var.f22740b.get(attachFileName);
                                            if (z5Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList4;
                                                obj.f24015b = new ArrayList();
                                                obj.f24014a = tL_wallPaper;
                                                a6Var.f22740b.put(attachFileName, obj);
                                                z5Var = obj;
                                            } else {
                                                arrayList2 = arrayList4;
                                                z5Var = z5Var2;
                                            }
                                            z5Var.f24015b.add(d6Var);
                                        }
                                    } else {
                                        arrayList2 = arrayList4;
                                    }
                                    i11++;
                                    arrayList4 = arrayList2;
                                }
                                arrayList = arrayList4;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                i10++;
                                arrayList4 = arrayList;
                            }
                        }
                        arrayList = arrayList4;
                        i10++;
                        arrayList4 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new u5((Object) a6Var, (Object) arrayList5, true, 8));
                    return;
                }
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((e6) this.f1844b, tLObject, (e6) this.f1845c, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k6((g8) this.f1844b, tL_error, tLObject, (Calendar) this.f1845c, 2));
                return;
        }
    }

    public j0(Object obj, MessagesController messagesController, int i9) {
        this.f1843a = i9;
        this.f1845c = obj;
        this.f1844b = messagesController;
    }
}
