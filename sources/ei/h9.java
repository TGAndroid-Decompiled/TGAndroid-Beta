package ei;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import b8.nc;
import b8.yd;
import gi.va;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.x80;
public final class h9 implements Runnable {
    public final int f10396a;
    public final Object f10397b;
    public final Object f10398c;
    public final Object d;

    public h9(Object obj, Object obj2, Object obj3, int i3) {
        this.f10396a = i3;
        this.f10397b = obj;
        this.f10398c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int[] iArr;
        File file;
        int i3;
        boolean contains;
        int i10;
        boolean z10;
        ConcurrentHashMap concurrentHashMap;
        SQLiteCursor sQLiteCursor;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        Pair pair = null;
        SQLiteCursor sQLiteCursor2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        boolean z11 = false;
        switch (this.f10396a) {
            case 0:
                r9 r9Var = ((i9) this.f10397b).d;
                r9Var.f10939o0.D(r9Var.h, ((r6) this.f10398c).d, (ArrayList) this.d);
                return;
            case 1:
                aa aaVar = (aa) this.f10397b;
                TLObject tLObject = (TLObject) this.f10398c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                z5 z5Var = aaVar.f10105f;
                int i14 = aaVar.f10102b;
                aa.f10100g = System.currentTimeMillis();
                if (tLObject != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject;
                    hp.s1(i14).Y3(tL_stories_storyViews.users, false);
                    if (!aaVar.d(tL_stories_getStoriesViews.f27248id, tL_stories_storyViews)) {
                        aaVar.d = 0;
                        aaVar.f10104e = false;
                        return;
                    }
                    hs.f(i14).k(324, new Object[0]);
                }
                aaVar.d = 0;
                if (aaVar.f10104e) {
                    org.telegram.messenger.g0.r(z5Var);
                    org.telegram.messenger.g0.i3(z5Var, 10000L);
                    return;
                }
                return;
            case 2:
                l9.y yVar = (l9.y) this.f10397b;
                l9.e0 e0Var = (l9.e0) this.f10398c;
                try {
                    try {
                        e0Var.o(((l9.q) this.d).apply(yd.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e12) {
                    e = e12;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 3:
                l9.e0 e0Var2 = (l9.e0) this.f10397b;
                m2.s sVar = (m2.s) this.f10398c;
                o4.r1 r1Var = (o4.r1) this.d;
                try {
                    if (!(e0Var2.f18157a instanceof l9.a)) {
                        sVar.run();
                        e0Var2.m(r1Var);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 4:
                gi.x1 x1Var = (gi.x1) this.f10397b;
                TLObject tLObject2 = (TLObject) this.d;
                ArrayList arrayList2 = x1Var.f13821w;
                gi.y1 y1Var = x1Var.O;
                ArrayList arrayList3 = x1Var.f13820s;
                if (TextUtils.equals((String) this.f10398c, x1Var.I)) {
                    x1Var.f13823y = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    x1Var.E.clear();
                    x1Var.f13818n.clear();
                    x1Var.f13823y++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    if (tLObject2 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                        arrayList3.addAll(tL_messages_stickers.stickers);
                        x1Var.f13823y = tL_messages_stickers.stickers.size() + x1Var.f13823y;
                    }
                    x1Var.J = x1Var.I;
                    x1Var.f();
                    gi.m1.z1(y1Var.f13914b, 0, 0);
                    y1Var.f13917f.c(false);
                    y1Var.f13916e.n(false);
                    return;
                }
                return;
            case 5:
                gi.z2 z2Var = (gi.z2) this.f10397b;
                Object obj = this.f10398c;
                String str = (String) this.d;
                float f10 = z2Var.L;
                if (obj != null) {
                    int min = (int) Math.min(org.telegram.messenger.g0.f22608q.x / 3.0f, org.telegram.messenger.g0.L(330.0f));
                    if (obj instanceof ye) {
                        ye yeVar = (ye) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        z2Var.c(yeVar, options);
                        gi.f7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c2 = z2Var.c(yeVar, options);
                        if (c2 != null && c2.getHeight() / c2.getWidth() < f10) {
                            if (yeVar.T == 0 && yeVar.U == 0 && !c2.isRecycled()) {
                                iArr2 = nc.b(c2, true);
                                yeVar.T = iArr2[0];
                                yeVar.U = iArr2[1];
                            } else {
                                int i15 = yeVar.T;
                                if (i15 != 0 && (i3 = yeVar.U) != 0) {
                                    iArr2 = new int[]{i15, i3};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c2;
                    } else if ((obj instanceof gi.f7) && (file = ((gi.f7) obj).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        gi.f7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    } else {
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                org.telegram.messenger.g0.h3(new h9(z2Var, str, pair, 6));
                return;
            case 6:
                gi.z2 z2Var2 = (gi.z2) this.f10397b;
                String str2 = (String) this.f10398c;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr3 = (int[]) pair2.second;
                Paint paint = z2Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        gi.z2.f14007g0.put(str2, bitmap);
                        HashMap hashMap = gi.z2.f14006f0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (!TextUtils.equals(str2, z2Var2.S)) {
                        gi.z2.d(str2);
                        return;
                    }
                    z2Var2.f14008a = bitmap;
                    if (iArr3 == null) {
                        paint.setShader(null);
                        z2Var2.f14014e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        z2Var2.f14014e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    z2Var2.h();
                    z2Var2.invalidate();
                    return;
                }
                return;
            case 7:
                gi.c3 c3Var = (gi.c3) this.f10397b;
                TLObject tLObject3 = (TLObject) this.f10398c;
                hp hpVar = (hp) this.d;
                c3Var.f12483r = true;
                c3Var.d = false;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    hpVar.Y3(tL_contacts_resolvedPeer.users, false);
                    hpVar.S3(tL_contacts_resolvedPeer.chats, false);
                    qr.a0(c3Var.f12486x.f12559a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    c3Var.E();
                    return;
                }
                return;
            case 8:
                String[] strArr = (String[]) this.f10397b;
                int[][] iArr4 = (int[][]) this.f10398c;
                ai.z3 z3Var = (ai.z3) this.d;
                for (int i16 = 0; i16 < strArr.length; i16++) {
                    String str3 = strArr[i16];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr4[i16], 0L);
                    }
                }
                org.telegram.messenger.g0.h3(z3Var);
                return;
            case 9:
                AnimatedFileNative.d((String) this.f10397b, ((int[][]) this.f10398c)[0], 0L);
                org.telegram.messenger.g0.h3((ai.z3) this.d);
                return;
            case 10:
                gi.o8 o8Var = (gi.o8) this.f10397b;
                TLObject tLObject4 = (TLObject) this.f10398c;
                hp hpVar2 = (hp) this.d;
                gi.t8 t8Var = o8Var.f13340a0;
                o8Var.f13348w.setLoading(false);
                if (tLObject4 != null) {
                    int i17 = gi.t8.V1;
                    ArrayList O0 = t8Var.O0();
                    for (int i18 = 0; i18 < O0.size(); i18++) {
                        TLRPC.User user = (TLRPC.User) O0.get(i18);
                        if (user != null && (contains = o8Var.f13342c.contains(Long.valueOf(user.f27150id))) != user.close_friend) {
                            user.close_friend = contains;
                            if (contains) {
                                i10 = user.flags2 | 4;
                            } else {
                                i10 = user.flags2 & (-5);
                            }
                            user.flags2 = i10;
                            hpVar2.X3(user, false, false);
                        }
                    }
                }
                t8Var.M0();
                if (t8Var.R1) {
                    t8Var.N0(new gi.r8(1, t8Var.f28583a, (ArrayList) null), new y3(t8Var, 1), false);
                    return;
                }
                t8Var.M0();
                t8Var.f13621j1.D(0);
                return;
            case 11:
                ((gi.f7) this.f10398c).O0 = (File) this.d;
                gi.o9 o9Var = ((va) this.f10397b).f13714e1;
                if (o9Var != null) {
                    o9Var.f13923b.f35594g3.O(false);
                    return;
                }
                return;
            case 12:
                va vaVar = (va) this.f10397b;
                Bitmap bitmap2 = (Bitmap) this.f10398c;
                Runnable runnable = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), vaVar.C0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 13:
                ArrayList arrayList4 = (ArrayList) this.d;
                HashMap hashMap2 = (HashMap) this.f10397b;
                u10 u10Var = (u10) this.f10398c;
                ArrayList arrayList5 = new ArrayList();
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(i19);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f27150id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj2 = new Object();
                    obj2.f15148a = user2;
                    obj2.f15149b = z10;
                    arrayList5.add(obj2);
                }
                u10Var.a(arrayList5);
                return;
            case 14:
                ii.p1 p1Var = (ii.p1) this.d;
                ((boolean[]) this.f10397b)[0] = false;
                if (((TLObject) this.f10398c) instanceof TLRPC.TL_boolTrue) {
                    p1Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 15:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ii.a3 a3Var = ((ii.v2) this.f10397b).d;
                if (((TLObject) this.f10398c) instanceof TLRPC.TL_boolTrue) {
                    ii.s2 s2Var = a3Var.E;
                    s2Var.getClass();
                    s2Var.y("emoji_status_access_requested", org.telegram.ui.web.w0.A("cancelled", "status"));
                    return;
                }
                new fc(a3Var.f14816r0, a3Var.G).Y(tL_error).k(true);
                return;
            case 16:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f10398c;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                fc.a0((ii.q3) this.f10397b).I(2131623993, bd.M0(2131754333, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131754334, ii.k.J0(connectedbotstarref.commission_permille), l10.p((TLRPC.User) this.d)))).j();
                return;
            case 17:
                ii.q3.D0((ii.q3) this.f10397b, (TLObject) this.f10398c, (org.telegram.ui.ActionBar.s1) this.d);
                return;
            case 18:
                w2.g0 g0Var = (w2.g0) this.d;
                l2.f fVar = ((k2.z0) this.f10397b).f16790c;
                g9.s1 f11 = ((g9.f0) this.f10398c).f();
                l2.e eVar = fVar.d;
                d2.e1 e1Var = fVar.h;
                e1Var.getClass();
                eVar.getClass();
                eVar.f17690b = g9.i0.q(f11);
                if (!f11.isEmpty()) {
                    eVar.f17692e = (w2.g0) f11.get(0);
                    g0Var.getClass();
                    eVar.f17693f = g0Var;
                }
                if (((w2.g0) eVar.d) == null) {
                    eVar.d = l2.e.g(e1Var, (g9.i0) eVar.f17690b, (w2.g0) eVar.f17692e, (d2.k1) eVar.f17689a);
                }
                eVar.u(e1Var.y0());
                return;
            case 19:
                Pair pair3 = (Pair) this.f10398c;
                ((k2.f1) this.f10397b).f16503b.h.x(((Integer) pair3.first).intValue(), (w2.g0) pair3.second, (v7.s) this.d);
                return;
            case 20:
                Pair pair4 = (Pair) this.f10398c;
                ((k2.f1) this.f10397b).f16503b.h.A(((Integer) pair4.first).intValue(), (w2.g0) pair4.second, (Exception) this.d);
                return;
            case 21:
                kg.s sVar2 = (kg.s) this.d;
                int i20 = ((kg.e0) this.f10397b).f16980t0;
                hp s12 = hp.s1(i20);
                Iterator it = ((HashSet) this.f10398c).iterator();
                while (it.hasNext()) {
                    Pair pair5 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair5.first).booleanValue();
                    Long l10 = (Long) pair5.second;
                    long longValue = l10.longValue();
                    if (booleanValue) {
                        concurrentHashMap = s12.Q;
                    } else {
                        concurrentHashMap = s12.P;
                    }
                    ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    qr a02 = qr.a0(i20);
                    if (booleanValue) {
                        try {
                            sQLiteCursor = a02.f24936b.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                            try {
                                try {
                                    if (sQLiteCursor.next()) {
                                        i11 = sQLiteCursor.intValue(0);
                                        sQLiteCursor.dispose();
                                    }
                                    i11 = 0;
                                    sQLiteCursor.dispose();
                                } catch (Exception e13) {
                                    e = e13;
                                    a02.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    i11 = 0;
                                    concurrentHashMap2.put(l10, Integer.valueOf(i11));
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor2 = sQLiteCursor;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            sQLiteCursor = null;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        sQLiteCursor = a02.f24936b.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                        if (sQLiteCursor.next()) {
                            int intValue = sQLiteCursor.intValue(0);
                            int intValue2 = sQLiteCursor.intValue(1);
                            if (intValue2 <= intValue) {
                                i11 = intValue2;
                                sQLiteCursor.dispose();
                            }
                        }
                        i11 = 0;
                        sQLiteCursor.dispose();
                    }
                    concurrentHashMap2.put(l10, Integer.valueOf(i11));
                }
                org.telegram.messenger.g0.h3(sVar2);
                return;
            case 22:
                ((kg.c0) this.f10397b).a((a0.h) this.f10398c, (ArrayList) this.d);
                return;
            case 23:
                kg.e1 e1Var2 = (kg.e1) this.f10397b;
                String str4 = (String) this.f10398c;
                TLObject tLObject5 = (TLObject) this.d;
                e1Var2.F0 = 0;
                if (str4.equals(e1Var2.E0) && (tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject5;
                    ArrayList arrayList6 = e1Var2.B0;
                    if (arrayList6 != null) {
                        i12 = arrayList6.size();
                    } else {
                        i12 = 0;
                    }
                    e1Var2.F("sticker_search_".concat(str4), tL_messages_stickers2.stickers);
                    ArrayList arrayList7 = e1Var2.B0;
                    if (arrayList7 != null) {
                        i13 = arrayList7.size();
                    } else {
                        i13 = 0;
                    }
                    if (!e1Var2.f17008p0 && (arrayList = e1Var2.B0) != null && !arrayList.isEmpty()) {
                        e1Var2.H();
                        x80 x80Var = e1Var2.W;
                        if (e1Var2.K() > 0) {
                            z11 = true;
                        }
                        x80Var.a(z11);
                        e1Var2.f17008p0 = true;
                    }
                    if (i12 != i13) {
                        e1Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                kg.e1 e1Var3 = (kg.e1) this.f10397b;
                a0.h hVar = (a0.h) this.f10398c;
                e1Var3.f17009q0 = null;
                e1Var3.Y(hVar, (ArrayList) this.d, true);
                return;
            case 25:
                kg.v1 v1Var = (kg.v1) this.f10397b;
                ArrayList arrayList8 = (ArrayList) this.d;
                v1Var.f17220q = arrayList8;
                v1Var.f17221r = (HashMap) this.f10398c;
                v1Var.f17222s = true;
                v1Var.f17206a.b2(arrayList8);
                return;
            case 26:
                kg.w1 w1Var = (kg.w1) this.f10397b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str5 = ((TLRPC.TL_messages_searchStickerSets) this.f10398c).f27115q;
                kg.y1 y1Var2 = w1Var.f17228a;
                String str6 = y1Var2.S;
                b31 b31Var = y1Var2.f17235e;
                if (str5.equals(str6)) {
                    w1Var.a();
                    b31Var.f32078b.h.getProgressDrawable().f36918e = false;
                    y1Var2.O = 0;
                    b31Var.b(true);
                    y1Var2.F.addAll(tL_messages_foundStickerSets.sets);
                    y1Var2.f();
                    return;
                }
                return;
            case 27:
                lg.c cVar = (lg.c) this.f10397b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f10398c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar.f18249a.b(false);
                    fc.d0(tL_error2);
                    return;
                } else if (tLObject6 instanceof TLRPC.TL_boolFalse) {
                    cVar.f18249a.b(false);
                    org.telegram.messenger.k5.p(null, 2131743889, fc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 28:
                lg.m mVar = (lg.m) this.f10397b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f10398c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error3 != null) {
                    mVar.f18358f.b(false);
                    fc.d0(tL_error3);
                    return;
                } else if (tLObject7 instanceof TLRPC.TL_boolFalse) {
                    mVar.f18358f.b(false);
                    org.telegram.messenger.k5.p(null, 2131743889, fc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.F != null) {
                        mVar.getMessagesController().W2(mVar.getUserConfig().f(), 0, true, null);
                    }
                    mVar.finishFragment();
                    return;
                }
            default:
                lg.z zVar = (lg.z) this.f10397b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList9 = zVar.f18525b;
                if (((TLObject) this.f10398c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList9.contains(tL_businessChatLink)) {
                        arrayList9.remove(tL_businessChatLink);
                        hs.f(zVar.f18524a).k(125, new Object[0]);
                    }
                    zVar.f();
                    return;
                }
                org.telegram.messenger.a8.g(new RuntimeException("Unexpected response from server!"), true);
                return;
        }
    }

    public h9(Object obj, ArrayList arrayList, Cloneable cloneable, int i3) {
        this.f10396a = i3;
        this.f10397b = obj;
        this.d = arrayList;
        this.f10398c = cloneable;
    }

    public h9(ArrayList arrayList, HashMap hashMap, u10 u10Var) {
        this.f10396a = 13;
        this.d = arrayList;
        this.f10397b = hashMap;
        this.f10398c = u10Var;
    }
}
