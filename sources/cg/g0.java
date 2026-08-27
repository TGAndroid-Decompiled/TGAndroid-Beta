package cg;

import android.content.Context;
import android.graphics.Bitmap;
import gh.i5;
import hh.t5;
import hh.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import jh.b6;
import jh.f6;
import jh.r9;
import jh.u3;
import jh.x3;
import lh.k9;
import lh.o3;
import lh.q9;
import nh.s3;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.fe;
import org.telegram.ui.h8;
import org.telegram.ui.ib0;
import org.telegram.ui.rn;
import org.telegram.ui.vc;
import org.telegram.ui.ve;

public final class g0 implements RequestDelegate {

    public final int f2687a;

    public final Object f2688b;

    public final Object f2689c;

    public g0(int i10, Object obj, Object obj2) {
        this.f2687a = i10;
        this.f2688b = obj;
        this.f2689c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        switch (this.f2687a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(tLObject, (MessagesController) this.f2688b, (f2) this.f2689c, 5));
                break;
            case 1:
                MessagesController messagesController = (MessagesController) this.f2688b;
                ib0 ib0Var = (ib0) this.f2689c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f22527id)) {
                            arrayList2.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a1.e(22, ib0Var, arrayList2));
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((wq0) this.f2688b, tL_error, (org.telegram.ui.ActionBar.n2) this.f2689c, 12));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((i5) this.f2688b, tLObject, (TL_stars.getResaleStarGifts) this.f2689c, 15));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((hh.r) this.f2688b, tLObject, (Context) this.f2689c, 17));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((hh.i5) this.f2688b, tLObject, (androidx.car.app.utils.a) this.f2689c, tL_error, 6));
                break;
            case 6:
                hh.i5.f1((hh.i5) this.f2688b, (TL_stars.InputSavedStarGift) this.f2689c, tLObject, tL_error);
                break;
            case 7:
                hh.i5.V0((hh.i5) this.f2688b, (org.telegram.ui.ActionBar.b2) this.f2689c, tLObject, tL_error);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((u7) this.f2688b, tLObject, tL_error, (Utilities.Callback) this.f2689c, 26));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((u7) this.f2688b, tLObject, (Runnable) this.f2689c, 27));
                break;
            case 10:
                jh.d1 d1Var = (jh.d1) this.f2688b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f2689c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(d1Var.f13177e).processUpdates(updates, false);
                }
                break;
            case 11:
                x3 x3Var = (x3) this.f2688b;
                q9 q9Var = (q9) this.f2689c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(x3Var.f14128l.f13296y2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new u3(q9Var, 0));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new j3.m((b6) this.f2688b, tLObject, (Runnable) this.f2689c, 7));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f6) this.f2688b, tLObject, (Utilities.Callback) this.f2689c, tL_error, 13));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new j3.m((r9) this.f2688b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f2689c, 9));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new j3.m((lh.y1) this.f2688b, (String) this.f2689c, tLObject, 10));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new j3.m((o3) this.f2689c, tLObject, (MessagesController) this.f2688b, 13));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new j3.m((k9) this.f2689c, tLObject, (MessagesController) this.f2688b, 16));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new j3.m((boolean[]) this.f2688b, tLObject, (nh.q1) this.f2689c, 20));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new j3.m((s3) this.f2688b, tLObject, (org.telegram.ui.ActionBar.b2) this.f2689c, 23));
                break;
            case 20:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f2688b, (Runnable) this.f2689c, tLObject, tL_error);
                break;
            case 21:
                ((VoIPService) this.f2688b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f2689c, tLObject, tL_error);
                break;
            case 22:
                ((VoIPService) this.f2688b).lambda$startOutgoingCall$10((byte[]) this.f2689c, tLObject, tL_error);
                break;
            case 23:
                ((VoIPService) this.f2688b).lambda$startConferenceGroupCall$32((AccountInstance) this.f2689c, tLObject, tL_error);
                break;
            case 24:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f2688b;
                ArrayList arrayList3 = (ArrayList) this.f2689c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i11 = 0;
                    ArrayList arrayList4 = null;
                    while (true) {
                        boolean z10 = true;
                        if (i11 >= size) {
                            AndroidUtilities.runOnUIThread(new t5(b6Var, arrayList4, z10, 8));
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i11);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                    int size2 = arrayList3.size();
                                    int i12 = 0;
                                    Bitmap bitmapB = null;
                                    Boolean boolValueOf = null;
                                    while (i12 < size2) {
                                        e6 e6Var = (e6) arrayList3.get(i12);
                                        if (e6Var.f22895o.equals(tL_wallPaper.slug)) {
                                            if (boolValueOf == null) {
                                                boolValueOf = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmapB != null || boolValueOf.booleanValue()) {
                                                arrayList3 = arrayList3;
                                                bitmapB = org.telegram.ui.ActionBar.b6.b(bitmapB, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, e6Var);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(e6Var);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (b6Var.f22788b == null) {
                                                    b6Var.f22788b = new HashMap();
                                                }
                                                a6 a6Var = (a6) b6Var.f22788b.get(attachFileName);
                                                if (a6Var == null) {
                                                    a6Var = new a6();
                                                    a6Var.f22735b = new ArrayList();
                                                    a6Var.f22734a = tL_wallPaper;
                                                    b6Var.f22788b.put(attachFileName, a6Var);
                                                }
                                                a6Var.f22735b.add(e6Var);
                                            }
                                        } else {
                                            arrayList3 = arrayList3;
                                        }
                                        i12++;
                                        arrayList3 = arrayList3;
                                    }
                                    arrayList = arrayList3;
                                    if (bitmapB != null) {
                                        bitmapB.recycle();
                                    }
                                } else {
                                    arrayList = arrayList3;
                                }
                            } else {
                                arrayList = arrayList3;
                            }
                            i11++;
                            arrayList3 = arrayList;
                        }
                    }
                }
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new i3((org.telegram.ui.ActionBar.f6) this.f2688b, tLObject, (org.telegram.ui.ActionBar.f6) this.f2689c, 2));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((h8) this.f2688b, tL_error, tLObject, (Calendar) this.f2689c, 28));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.u1((vc) this.f2688b, tLObject, (org.telegram.ui.ActionBar.f6) this.f2689c, 10));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.u1((fe) this.f2688b, tLObject, (Context) this.f2689c, 12));
                break;
            default:
                rn rnVar = (rn) this.f2688b;
                TLObject tLObject2 = (TLObject) this.f2689c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new ve(rnVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                }
                break;
        }
    }

    public g0(Object obj, MessagesController messagesController, int i10) {
        this.f2687a = i10;
        this.f2689c = obj;
        this.f2688b = messagesController;
    }
}
