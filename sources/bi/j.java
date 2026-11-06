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
    public final int f4071a;
    public final Object f4072b;
    public final Object f4073c;

    public j(int i7, Object obj, Object obj2) {
        this.f4071a = i7;
        this.f4072b = obj;
        this.f4073c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f4071a) {
            case 0:
                org.telegram.messenger.g0.h3(new aa.s((z) this.f4072b, tLObject, (Context) this.f4073c, 7));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.d0((y) this.f4072b, tLObject, (String) this.f4073c, tL_error, 3));
                return;
            case 2:
                k7 k7Var = (k7) this.f4072b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f4073c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    qp.s1(k7Var.f28612a).Y3(tL_payments_uniqueStarGift.users, false);
                    qp.s1(k7Var.f28612a).S3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.h3(new a1.e(25, k7Var, tL_payments_uniqueStarGift));
                        return;
                    }
                }
                org.telegram.messenger.g0.h3(new a1.e(26, u1Var, tL_error));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.d0((k7) this.f4072b, tLObject, (aa.s) this.f4073c, tL_error, 7));
                return;
            case 4:
                k7 k7Var2 = (k7) this.f4072b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f4073c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(k7Var2.f28612a).Y3(updates.users, false);
                    qp.s1(k7Var2.f28612a).S3(updates.chats, false);
                }
                org.telegram.messenger.g0.h3(new ai.d0(k7Var2, tL_error, tLObject, inputSavedStarGift, 8));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new aa.s((Object) tLObject, (Object) ((v0) this.f4072b), (String) this.f4073c, 16));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new aa.s((ea) this.f4072b, tLObject, tL_error, (c20) this.f4073c, 17));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new aa.s((ea) this.f4072b, tLObject, (Runnable) this.f4073c, 18));
                return;
            case 8:
                di.z3 z3Var = (di.z3) this.f4072b;
                fi.s8 s8Var = (fi.s8) this.f4073c;
                if (tLObject instanceof TLRPC.Updates) {
                    qp.s1(z3Var.f10013x.f9168l2).O3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new di.w3(s8Var, 0));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new aa.s((di.j6) this.f4072b, tLObject, (Runnable) this.f4073c, 27));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new ai.d0((di.m6) this.f4072b, tLObject, (c20) this.f4073c, tL_error));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new aa.s((di.y9) this.f4072b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f4073c, 29));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new fi.x1((fi.y1) this.f4072b, (String) this.f4073c, tLObject, 0));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new fi.x1((fi.e3) this.f4072b, tLObject, (qp) this.f4073c, false, 3));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new fi.x1((fi.n8) this.f4072b, tLObject, (qp) this.f4073c, false, 6));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new fi.x1((boolean[]) this.f4072b, tLObject, (hi.o1) this.f4073c, false, 12));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new fi.x1((hi.q3) this.f4072b, tLObject, (org.telegram.ui.ActionBar.u1) this.f4073c, false, 15));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new fi.x1((jg.i1) this.f4072b, (String) this.f4073c, tLObject, 18));
                return;
            case 18:
                jg.b2 b2Var = (jg.b2) this.f4072b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f4073c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.h3(new fi.x1(b2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 21));
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.g0.h3(new fi.x1((kg.y) this.f4072b, tLObject, (TL_account.TL_businessChatLink) this.f4073c, false, 24));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new ha.b(17, (kg.i0) this.f4072b, (org.telegram.ui.Components.r2) this.f4073c));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new fi.x1((kg.x1) this.f4072b, tLObject, (SharedPreferences) this.f4073c, false, 29));
                return;
            case 22:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f4073c, (Runnable) this.f4072b, tLObject, tL_error);
                return;
            case 23:
                ((VoIPService) this.f4072b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f4073c, tLObject, tL_error);
                return;
            case 24:
                ((VoIPService) this.f4072b).lambda$startOutgoingCall$10((byte[]) this.f4073c, tLObject, tL_error);
                return;
            case 25:
                ((VoIPService) this.f4072b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.f4073c, tLObject, tL_error);
                return;
            case 26:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f4072b;
                ArrayList arrayList3 = (ArrayList) this.f4073c;
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
                                org.telegram.messenger.w7.G(p10.f24459s0);
                                File K = org.telegram.messenger.w7.K(tL_wallPaper.document, str, true, true);
                                int size2 = arrayList3.size();
                                String str2 = str;
                                Boolean bool = str2;
                                int i10 = 0;
                                Bitmap bitmap = str2;
                                while (i10 < size2) {
                                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList3.get(i10);
                                    if (h6Var.f27527o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(K.exists());
                                        }
                                        if (bitmap != 0 || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), K, h6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(h6Var);
                                        } else {
                                            String r10 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                                            if (e6Var.f27456b == null) {
                                                e6Var.f27456b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) e6Var.f27456b.get(r10);
                                            if (d6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f27441b = new ArrayList();
                                                obj.f27440a = tL_wallPaper;
                                                e6Var.f27456b.put(r10, obj);
                                                d6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                d6Var = d6Var2;
                                            }
                                            d6Var.f27441b.add(h6Var);
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
                    org.telegram.messenger.g0.h3(new u7((Object) e6Var, (Object) arrayList4, true, 13));
                    return;
                }
                return;
            case 27:
                org.telegram.messenger.g0.h3(new l2.z0((org.telegram.ui.ActionBar.j6) this.f4072b, tLObject, (org.telegram.ui.ActionBar.j6) this.f4073c, 21));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6((org.telegram.ui.h8) this.f4072b, tL_error, tLObject, (Calendar) this.f4073c, 2));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.o1((org.telegram.ui.pc) this.f4072b, tLObject, (org.telegram.ui.ActionBar.j6) this.f4073c, 10));
                return;
        }
    }

    public j(Context context, Runnable runnable) {
        this.f4071a = 22;
        this.f4073c = context;
        this.f4072b = runnable;
    }
}
