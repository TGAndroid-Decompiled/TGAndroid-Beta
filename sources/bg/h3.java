package bg;

import android.content.Context;
import android.graphics.Bitmap;
import ih.b5;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import jh.h5;
import jh.r5;
import jh.s7;
import lh.c6;
import lh.g6;
import lh.r9;
import nh.e9;
import nh.y8;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.de;
import org.telegram.ui.f8;
import org.telegram.ui.tc;
import org.telegram.ui.te;
import org.telegram.ui.tm;
import org.telegram.ui.tn;
public final class h3 implements RequestDelegate {
    public final int f2290a;
    public final Object f2291b;
    public final Object f2292c;

    public h3(int i10, Object obj, Object obj2) {
        this.f2290a = i10;
        this.f2291b = obj;
        this.f2292c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        a6 a6Var;
        int i10;
        switch (this.f2290a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((u3) this.f2291b, tLObject, (s3) this.f2292c, tL_error, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (MessagesController) this.f2291b, (eg.d2) this.f2292c, 6));
                return;
            case 2:
                MessagesController messagesController = (MessagesController) this.f2291b;
                tm tmVar = (tm) this.f2292c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.users.size(); i11++) {
                        TLRPC.User user = tL_contacts_found.users.get(i11);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f22539id)) {
                            arrayList3.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ef.c(5, tmVar, arrayList3));
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((gr0) this.f2291b, tL_error, (org.telegram.ui.ActionBar.o2) this.f2292c, 12));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((b5) this.f2291b, tLObject, (TL_stars.getResaleStarGifts) this.f2292c, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((jh.q) this.f2291b, tLObject, (Context) this.f2292c, 17));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((h5) this.f2291b, tLObject, (androidx.car.app.utils.b) this.f2292c, tL_error, 8));
                return;
            case 7:
                h5.f1((h5) this.f2291b, (TL_stars.InputSavedStarGift) this.f2292c, tLObject, tL_error);
                return;
            case 8:
                h5.V0((h5) this.f2291b, (org.telegram.ui.ActionBar.c2) this.f2292c, tLObject, tL_error);
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((s7) this.f2291b, tLObject, tL_error, (Utilities.Callback) this.f2292c, 26));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((s7) this.f2291b, tLObject, (Runnable) this.f2292c, 27));
                return;
            case 11:
                lh.d1 d1Var = (lh.d1) this.f2291b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f2292c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(d1Var.f15456e).processUpdates(updates, false);
                    return;
                }
                return;
            case 12:
                lh.w3 w3Var = (lh.w3) this.f2291b;
                e9 e9Var = (e9) this.f2292c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(w3Var.f16362l.f15545y2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new lh.t3(e9Var, 0));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new l3.m((c6) this.f2291b, tLObject, (Runnable) this.f2292c, 7));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((g6) this.f2291b, tLObject, (Utilities.Callback) this.f2292c, tL_error, 15));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new l3.m((r9) this.f2291b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f2292c, 9));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new l3.m((nh.x1) this.f2291b, (String) this.f2292c, tLObject, 10));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new l3.m((nh.m3) this.f2291b, tLObject, (MessagesController) this.f2292c, 13));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new l3.m((y8) this.f2291b, tLObject, (MessagesController) this.f2292c, 16));
                return;
            case 19:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f2291b, (Runnable) this.f2292c, tLObject, tL_error);
                return;
            case 20:
                ((VoIPService) this.f2291b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f2292c, tLObject, tL_error);
                return;
            case 21:
                ((VoIPService) this.f2291b).lambda$startOutgoingCall$10((byte[]) this.f2292c, tLObject, tL_error);
                return;
            case 22:
                ((VoIPService) this.f2291b).lambda$startConferenceGroupCall$32((AccountInstance) this.f2292c, tLObject, tL_error);
                return;
            case 23:
                b6 b6Var = (b6) this.f2291b;
                ArrayList arrayList4 = (ArrayList) this.f2292c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i12 = 0;
                    ArrayList arrayList5 = null;
                    while (i12 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i12);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                int size2 = arrayList4.size();
                                int i13 = 0;
                                Bitmap bitmap = null;
                                Boolean bool = null;
                                while (i13 < size2) {
                                    e6 e6Var = (e6) arrayList4.get(i13);
                                    if (e6Var.f22914o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(pathToAttach.exists());
                                        }
                                        if (bitmap != null || bool.booleanValue()) {
                                            arrayList2 = arrayList4;
                                            bitmap = b6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, e6Var);
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(e6Var);
                                        } else {
                                            String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                            if (b6Var.f22770b == null) {
                                                b6Var.f22770b = new HashMap();
                                            }
                                            a6 a6Var2 = (a6) b6Var.f22770b.get(attachFileName);
                                            if (a6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList4;
                                                obj.f22755b = new ArrayList();
                                                obj.f22754a = tL_wallPaper;
                                                b6Var.f22770b.put(attachFileName, obj);
                                                a6Var = obj;
                                            } else {
                                                arrayList2 = arrayList4;
                                                a6Var = a6Var2;
                                            }
                                            a6Var.f22755b.add(e6Var);
                                        }
                                    } else {
                                        arrayList2 = arrayList4;
                                    }
                                    i13++;
                                    arrayList4 = arrayList2;
                                }
                                arrayList = arrayList4;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                i12++;
                                arrayList4 = arrayList;
                            }
                        }
                        arrayList = arrayList4;
                        i12++;
                        arrayList4 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new r5((Object) b6Var, (Object) arrayList5, true, 8));
                    return;
                }
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new l3.m((f6) this.f2291b, tLObject, (f6) this.f2292c, 27));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((f8) this.f2291b, tL_error, tLObject, (Calendar) this.f2292c, 26));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.u1((tc) this.f2291b, tLObject, (f6) this.f2292c, 10));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.u1((de) this.f2291b, tLObject, (Context) this.f2292c, 12));
                return;
            case 28:
                tn tnVar = (tn) this.f2291b;
                TLObject tLObject2 = (TLObject) this.f2292c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new te(tnVar, i10, 5));
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.u1((tn) this.f2291b, tLObject, (TLRPC.User) this.f2292c, 20));
                return;
        }
    }
}
