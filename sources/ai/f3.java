package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import ci.e9;
import ei.aa;
import ei.h9;
import gi.o8;
import gi.t8;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.vp0;
public final class f3 implements RequestDelegate {
    public final int f644a;
    public final Object f645b;
    public final Object f646c;

    public f3(int i3, Object obj, Object obj2) {
        this.f644a = i3;
        this.f645b = obj;
        this.f646c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.f644a) {
            case 0:
                org.telegram.messenger.g0.h3(new k3((vp0) this.f645b, tL_error, (org.telegram.ui.ActionBar.d2) this.f646c, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new k3((w5) this.f645b, tLObject, (TL_stars.getResaleStarGifts) this.f646c, 3));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new k3((ci.v) this.f645b, tLObject, (Context) this.f646c, 10));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new z3((ci.u) this.f645b, tLObject, (String) this.f646c, tL_error, 5));
                return;
            case 4:
                ci.l6 l6Var = (ci.l6) this.f645b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f646c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    hp.s1(l6Var.f28583a).Y3(tL_payments_uniqueStarGift.users, false);
                    hp.s1(l6Var.f28583a).S3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.h3(new ci.e0(2, l6Var, tL_payments_uniqueStarGift));
                        return;
                    }
                }
                org.telegram.messenger.g0.h3(new ci.e0(3, s1Var, tL_error));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new z3((ci.l6) this.f645b, tLObject, (k3) this.f646c, tL_error, 9));
                return;
            case 6:
                ci.l6 l6Var2 = (ci.l6) this.f645b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f646c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    hp.s1(l6Var2.f28583a).Y3(updates.users, false);
                    hp.s1(l6Var2.f28583a).S3(updates.chats, false);
                }
                org.telegram.messenger.g0.h3(new z3(l6Var2, tL_error, tLObject, inputSavedStarGift, 10));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new k3(tLObject, (ci.o0) this.f645b, (String) this.f646c, 19));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new k3((e9) this.f645b, tLObject, tL_error, (u10) this.f646c, 20));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new k3((e9) this.f645b, tLObject, (Runnable) this.f646c, 21));
                return;
            case 10:
                ei.g1 g1Var = (ei.g1) this.f645b;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f646c;
                if (tLObject instanceof TLRPC.Updates) {
                    hp.s1(g1Var.f10299e).O3(updates2, false);
                    return;
                }
                return;
            case 11:
                ei.b4 b4Var = (ei.b4) this.f645b;
                t8 t8Var = (t8) this.f646c;
                if (tLObject instanceof TLRPC.Updates) {
                    hp.s1(b4Var.f10126x.f10480m2).O3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new ei.y3(t8Var, 0));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new k3((ei.k6) this.f645b, tLObject, (Runnable) this.f646c, 29));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new z3((ei.n6) this.f645b, tLObject, (u10) this.f646c, tL_error, 14));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new h9((aa) this.f645b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f646c, 1));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new h9((gi.x1) this.f645b, (String) this.f646c, tLObject, 4));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new h9((gi.c3) this.f645b, tLObject, (hp) this.f646c, 7));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new h9((o8) this.f645b, tLObject, (hp) this.f646c, 10));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new h9((boolean[]) this.f645b, tLObject, (ii.p1) this.f646c, 14));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new h9((ii.q3) this.f645b, tLObject, (org.telegram.ui.ActionBar.s1) this.f646c, 17));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new h9((kg.e1) this.f645b, (String) this.f646c, tLObject, 23));
                return;
            case 21:
                kg.w1 w1Var = (kg.w1) this.f645b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f646c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.h3(new h9(w1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 26));
                    return;
                }
                return;
            case 22:
                org.telegram.messenger.g0.h3(new h9((lg.z) this.f645b, tLObject, (TL_account.TL_businessChatLink) this.f646c, 29));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new ii.e(23, (lg.j0) this.f645b, (org.telegram.ui.Components.o2) this.f646c));
                return;
            case 24:
                org.telegram.messenger.g0.h3(new lg.y((lg.y1) this.f645b, tLObject, (SharedPreferences) this.f646c, 4));
                return;
            case 25:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f645b, (Runnable) this.f646c, tLObject, tL_error);
                return;
            case 26:
                ((VoIPService) this.f645b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f646c, tLObject, tL_error);
                return;
            case 27:
                ((VoIPService) this.f645b).lambda$startOutgoingCall$10((byte[]) this.f646c, tLObject, tL_error);
                return;
            case 28:
                ((VoIPService) this.f645b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.f646c, tLObject, tL_error);
                return;
            default:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f645b;
                ArrayList arrayList3 = (ArrayList) this.f646c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList4 = null;
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i3);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                w7.G(h10.f22829t0);
                                File K = w7.K(tL_wallPaper.document, str, true, true);
                                int size2 = arrayList3.size();
                                String str2 = str;
                                Boolean bool = str2;
                                int i10 = 0;
                                Bitmap bitmap = str2;
                                while (i10 < size2) {
                                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) arrayList3.get(i10);
                                    if (g6Var.f27537o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(K.exists());
                                        }
                                        if (bitmap != 0 || bool.booleanValue()) {
                                            arrayList2 = arrayList3;
                                            bitmap = org.telegram.ui.ActionBar.d6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), K, g6Var);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(g6Var);
                                        } else {
                                            String r5 = w7.r(null, tL_wallPaper.document);
                                            if (d6Var.f27466b == null) {
                                                d6Var.f27466b = new HashMap();
                                            }
                                            org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) d6Var.f27466b.get(r5);
                                            if (c6Var2 == null) {
                                                ?? obj = new Object();
                                                arrayList2 = arrayList3;
                                                obj.f27452b = new ArrayList();
                                                obj.f27451a = tL_wallPaper;
                                                d6Var.f27466b.put(r5, obj);
                                                c6Var = obj;
                                            } else {
                                                arrayList2 = arrayList3;
                                                c6Var = c6Var2;
                                            }
                                            c6Var.f27452b.add(g6Var);
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
                                i3++;
                                arrayList3 = arrayList;
                                str = null;
                            }
                        }
                        arrayList = arrayList3;
                        i3++;
                        arrayList3 = arrayList;
                        str = null;
                    }
                    org.telegram.messenger.g0.h3(new ci.v6((Object) d6Var, (Object) arrayList4, true, 13));
                    return;
                }
                return;
        }
    }
}
