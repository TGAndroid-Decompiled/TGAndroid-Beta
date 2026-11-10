package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
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
    public final int f4068a;
    public final Object f4069b;
    public final Object f4070c;

    public j(int i7, Object obj, Object obj2) {
        this.f4068a = i7;
        this.f4069b = obj;
        this.f4070c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f4068a) {
            case 0:
                org.telegram.messenger.g0.h3(new aa.s((z) this.f4069b, tLObject, (Context) this.f4070c, 7));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.d0((y) this.f4069b, tLObject, (String) this.f4070c, tL_error, 3));
                return;
            case 2:
                k7 k7Var = (k7) this.f4069b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f4070c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    qp.s1(k7Var.f28669a).Y3(tL_payments_uniqueStarGift.users, false);
                    qp.s1(k7Var.f28669a).S3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.h3(new a1.e(25, k7Var, tL_payments_uniqueStarGift));
                        return;
                    }
                }
                org.telegram.messenger.g0.h3(new a1.e(26, u1Var, tL_error));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.d0((k7) this.f4069b, tLObject, (aa.s) this.f4070c, tL_error, 7));
                return;
            case 4:
                k7 k7Var2 = (k7) this.f4069b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f4070c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(k7Var2.f28669a).Y3(updates.users, false);
                    qp.s1(k7Var2.f28669a).S3(updates.chats, false);
                }
                org.telegram.messenger.g0.h3(new ai.d0(k7Var2, tL_error, tLObject, inputSavedStarGift, 8));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new aa.s((Object) tLObject, (Object) ((v0) this.f4069b), (String) this.f4070c, 16));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new aa.s((ea) this.f4069b, tLObject, tL_error, (c20) this.f4070c, 17));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new aa.s((ea) this.f4069b, tLObject, (Runnable) this.f4070c, 18));
                return;
            case 8:
                di.a4 a4Var = (di.a4) this.f4069b;
                fi.s8 s8Var = (fi.s8) this.f4070c;
                if (tLObject instanceof TLRPC.Updates) {
                    qp.s1(a4Var.f8813x.f9205l2).O3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new di.x3(s8Var, 0));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new aa.s((di.k6) this.f4069b, tLObject, (Runnable) this.f4070c, 27));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new ai.d0((di.n6) this.f4069b, tLObject, (c20) this.f4070c, tL_error));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new aa.s((di.z9) this.f4069b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f4070c, 29));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new fi.x1((fi.y1) this.f4069b, (String) this.f4070c, tLObject, 0));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new fi.x1((fi.e3) this.f4069b, tLObject, (qp) this.f4070c, false, 3));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new fi.x1((fi.n8) this.f4069b, tLObject, (qp) this.f4070c, false, 6));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new fi.x1((boolean[]) this.f4069b, tLObject, (hi.o1) this.f4070c, false, 12));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new fi.x1((hi.q3) this.f4069b, tLObject, (org.telegram.ui.ActionBar.u1) this.f4070c, false, 15));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new fi.x1((jg.i1) this.f4069b, (String) this.f4070c, tLObject, 18));
                return;
            case 18:
                jg.b2 b2Var = (jg.b2) this.f4069b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f4070c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.h3(new fi.x1(b2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 21));
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.g0.h3(new fi.x1((kg.y) this.f4069b, tLObject, (TL_account.TL_businessChatLink) this.f4070c, false, 24));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new ha.b(17, (kg.i0) this.f4069b, (org.telegram.ui.Components.q2) this.f4070c));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new fi.x1((kg.x1) this.f4069b, tLObject, (SharedPreferences) this.f4070c, false, 29));
                return;
            case 22:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f4070c, (Runnable) this.f4069b, tLObject, tL_error);
                return;
            case 23:
                ((VoIPService) this.f4069b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f4070c, tLObject, tL_error);
                return;
            case 24:
                ((VoIPService) this.f4069b).lambda$startOutgoingCall$10((byte[]) this.f4070c, tLObject, tL_error);
                return;
            case 25:
                ((VoIPService) this.f4069b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.f4070c, tLObject, tL_error);
                return;
            case 26:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f4069b;
                ArrayList arrayList3 = (ArrayList) this.f4070c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList4 = null;
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i7);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                org.telegram.messenger.w7.G(p10.f24474s0);
                                File J = org.telegram.messenger.w7.J(tL_wallPaper.document, str, true, true);
                                int size2 = arrayList3.size();
                                String str2 = str;
                                Boolean bool = str2;
                                int i10 = 0;
                                Bitmap bitmap = str2;
                                while (i10 < size2) {
                                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) arrayList3.get(i10);
                                    if (j6Var.f27621o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(J.exists());
                                        }
                                        if (bitmap != 0 || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.g6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, j6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(j6Var);
                                        } else {
                                            String r10 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                                            if (g6Var.f27508b == null) {
                                                g6Var.f27508b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) g6Var.f27508b.get(r10);
                                            if (f6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f27479b = new ArrayList();
                                                obj.f27478a = tL_wallPaper;
                                                g6Var.f27508b.put(r10, obj);
                                                f6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                f6Var = f6Var2;
                                            }
                                            f6Var.f27479b.add(j6Var);
                                        }
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    i10++;
                                    arrayList3 = arrayList2;
                                    bitmap = bitmap;
                                }
                                arrayList = arrayList3;
                                if (bitmap != 0) {
                                    bitmap.recycle();
                                }
                                i7++;
                                arrayList3 = arrayList;
                                str = null;
                            }
                        }
                        arrayList = arrayList3;
                        i7++;
                        arrayList3 = arrayList;
                        str = null;
                    }
                    org.telegram.messenger.g0.h3(new u7((Object) g6Var, (Object) arrayList4, true, 13));
                    return;
                }
                return;
            case 27:
                org.telegram.messenger.g0.h3(new l2.z0((org.telegram.ui.ActionBar.l6) this.f4069b, tLObject, (org.telegram.ui.ActionBar.l6) this.f4070c, 21));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6((org.telegram.ui.h8) this.f4069b, tL_error, tLObject, (Calendar) this.f4070c, 2));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.o1((org.telegram.ui.pc) this.f4069b, tLObject, (org.telegram.ui.ActionBar.l6) this.f4070c, 10));
                return;
        }
    }

    public j(Context context, Runnable runnable) {
        this.f4068a = 22;
        this.f4070c = context;
        this.f4069b = runnable;
    }
}
