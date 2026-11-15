package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import di.u8;
import fi.r9;
import hi.l8;
import hi.q8;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wp0;
public final class v2 implements RequestDelegate {
    public final int f3934a;
    public final Object f3935b;
    public final Object f3936c;

    public v2(int i7, Object obj, Object obj2) {
        this.f3934a = i7;
        this.f3935b = obj;
        this.f3936c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.f3934a) {
            case 0:
                org.telegram.messenger.g0.h3(new aa.r((wp0) this.f3935b, tL_error, (org.telegram.ui.ActionBar.e2) this.f3936c, 6));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new aa.r((o5) this.f3935b, tLObject, (TL_stars.getResaleStarGifts) this.f3936c, 9));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new aa.r((di.t) this.f3935b, tLObject, (Context) this.f3936c, 13));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.r((Object) ((di.s) this.f3935b), (Object) tLObject, (String) this.f3936c, (Object) tL_error, 6));
                return;
            case 4:
                di.c6 c6Var2 = (di.c6) this.f3935b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f3936c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    np.s1(c6Var2.f29679a).Y3(tL_payments_uniqueStarGift.users, false);
                    np.s1(c6Var2.f29679a).S3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.h3(new c1.c(27, c6Var2, tL_payments_uniqueStarGift));
                        return;
                    }
                }
                org.telegram.messenger.g0.h3(new c1.c(28, t1Var, tL_error));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ai.r((di.c6) this.f3935b, tLObject, (aa.r) this.f3936c, tL_error, 10));
                return;
            case 6:
                di.c6 c6Var3 = (di.c6) this.f3935b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f3936c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.s1(c6Var3.f29679a).Y3(updates.users, false);
                    np.s1(c6Var3.f29679a).S3(updates.chats, false);
                }
                org.telegram.messenger.g0.h3(new ai.r(c6Var3, tL_error, tLObject, inputSavedStarGift, 11));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new aa.r((Object) tLObject, (Object) ((di.k0) this.f3935b), (String) this.f3936c, 22));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new aa.r((u8) this.f3935b, tLObject, tL_error, (z10) this.f3936c, 23));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new aa.r((u8) this.f3935b, tLObject, (Runnable) this.f3936c, 24));
                return;
            case 10:
                fi.t3 t3Var = (fi.t3) this.f3935b;
                q8 q8Var = (q8) this.f3936c;
                if (tLObject instanceof TLRPC.Updates) {
                    np.s1(t3Var.f12360x.f11497m2).O3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new fi.q3(q8Var, 0));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new fi.s5((fi.c6) this.f3935b, tLObject, (Runnable) this.f3936c, 2));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new ai.r((fi.g6) this.f3935b, tLObject, (z10) this.f3936c, tL_error, 15));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new fi.s5((Object) ((r9) this.f3935b), (Object) tLObject, (Object) ((TL_stories.TL_stories_getStoriesViews) this.f3936c), 4));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new fi.s5((Object) ((hi.x1) this.f3935b), (Object) ((String) this.f3936c), tLObject, 7));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new fi.s5((hi.c3) this.f3935b, tLObject, (np) this.f3936c, 10));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new fi.s5((l8) this.f3935b, tLObject, (np) this.f3936c, 13));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new fi.s5((Object) ((jg.h1) this.f3935b), (Object) ((String) this.f3936c), tLObject, 18));
                return;
            case 18:
                jg.a2 a2Var = (jg.a2) this.f3935b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f3936c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.h3(new fi.s5((Object) a2Var, (Object) tL_messages_searchStickerSets, (Object) ((TLRPC.TL_messages_foundStickerSets) tLObject), 21));
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.g0.h3(new fi.s5((Object) ((kg.y) this.f3935b), (Object) tLObject, (Object) ((TL_account.TL_businessChatLink) this.f3936c), 24));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new hi.h4(27, (kg.i0) this.f3935b, (org.telegram.ui.Components.a2) this.f3936c));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new fi.s5((kg.z1) this.f3935b, tLObject, (SharedPreferences) this.f3936c, 29));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new ki.n((boolean[]) this.f3935b, tLObject, (ki.p1) this.f3936c, 1));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new ki.n((ki.n3) this.f3935b, tLObject, (org.telegram.ui.ActionBar.t1) this.f3936c, 4));
                return;
            case 24:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f3935b, (Runnable) this.f3936c, tLObject, tL_error);
                return;
            case 25:
                ((VoIPService) this.f3935b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f3936c, tLObject, tL_error);
                return;
            case 26:
                ((VoIPService) this.f3935b).lambda$startOutgoingCall$10((byte[]) this.f3936c, tLObject, tL_error);
                return;
            case 27:
                ((VoIPService) this.f3935b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.f3936c, tLObject, tL_error);
                return;
            case 28:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f3935b;
                ArrayList arrayList3 = (ArrayList) this.f3936c;
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
                                w7.G(m10.f24940t0);
                                File J = w7.J(tL_wallPaper.document, str, true, true);
                                int size2 = arrayList3.size();
                                String str2 = str;
                                Boolean bool = str2;
                                int i10 = 0;
                                Bitmap bitmap = str2;
                                while (i10 < size2) {
                                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) arrayList3.get(i10);
                                    if (g6Var.f28614o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(J.exists());
                                        }
                                        if (bitmap != 0 || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.d6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, g6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(g6Var);
                                        } else {
                                            String r10 = w7.r(null, tL_wallPaper.document);
                                            if (d6Var.f28509b == null) {
                                                d6Var.f28509b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.c6 c6Var4 = (org.telegram.ui.ActionBar.c6) d6Var.f28509b.get(r10);
                                            if (c6Var4 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f28498b = new ArrayList();
                                                obj.f28497a = tL_wallPaper;
                                                d6Var.f28509b.put(r10, obj);
                                                c6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                c6Var = c6Var4;
                                            }
                                            c6Var.f28498b.add(g6Var);
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
                    org.telegram.messenger.g0.h3(new di.m6((Object) d6Var, (Object) arrayList4, true, 13));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new ki.n((org.telegram.ui.ActionBar.i6) this.f3935b, tLObject, (org.telegram.ui.ActionBar.i6) this.f3936c, 22));
                return;
        }
    }
}
