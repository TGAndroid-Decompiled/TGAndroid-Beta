package fi;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
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
import org.telegram.messenger.c20;
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.g31;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
public final class x1 implements Runnable {
    public final int f13072a;
    public final Object f13073b;
    public final Object f13074c;
    public final Object d;

    public x1(Object obj, Object obj2, Object obj3, int i7) {
        this.f13072a = i7;
        this.f13074c = obj;
        this.f13073b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int[] iArr;
        File file;
        int i7;
        boolean contains;
        int i10;
        boolean z9;
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
        boolean z10 = false;
        switch (this.f13072a) {
            case 0:
                y1 y1Var = (y1) this.f13074c;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList2 = y1Var.f13150w;
                z1 z1Var = y1Var.N;
                ArrayList arrayList3 = y1Var.f13149s;
                if (TextUtils.equals((String) this.f13073b, y1Var.H)) {
                    y1Var.f13152y = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    y1Var.D.clear();
                    y1Var.f13147n.clear();
                    y1Var.f13152y++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList3.addAll(tL_messages_stickers.stickers);
                        y1Var.f13152y = tL_messages_stickers.stickers.size() + y1Var.f13152y;
                    }
                    y1Var.I = y1Var.H;
                    y1Var.f();
                    m1.z1(z1Var.f13235b, 0, 0);
                    z1Var.f13238f.c(false);
                    z1Var.f13237e.n(false);
                    return;
                }
                return;
            case 1:
                b3 b3Var = (b3) this.f13074c;
                Object obj = this.d;
                String str = (String) this.f13073b;
                float f10 = b3Var.K;
                if (obj != null) {
                    int min = (int) Math.min(org.telegram.messenger.g0.f22563q.x / 3.0f, org.telegram.messenger.g0.L(330.0f));
                    if (obj instanceof gf) {
                        gf gfVar = (gf) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        b3Var.c(gfVar, options);
                        e7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = b3Var.c(gfVar, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f10) {
                            if (gfVar.T == 0 && gfVar.U == 0 && !c10.isRecycled()) {
                                iArr2 = a8.ba.b(c10, true);
                                gfVar.T = iArr2[0];
                                gfVar.U = iArr2[1];
                            } else {
                                int i14 = gfVar.T;
                                if (i14 != 0 && (i7 = gfVar.U) != 0) {
                                    iArr2 = new int[]{i14, i7};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c10;
                    } else if ((obj instanceof e7) && (file = ((e7) obj).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        e7.C(options2, min);
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
                org.telegram.messenger.g0.h3(new x1(b3Var, str, pair, 2));
                return;
            case 2:
                b3 b3Var2 = (b3) this.f13074c;
                String str2 = (String) this.f13073b;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr3 = (int[]) pair2.second;
                Paint paint = b3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        b3.f11652f0.put(str2, bitmap);
                        HashMap hashMap = b3.f11651e0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (!TextUtils.equals(str2, b3Var2.R)) {
                        b3.d(str2);
                        return;
                    }
                    b3Var2.f11653a = bitmap;
                    if (iArr3 == null) {
                        paint.setShader(null);
                        b3Var2.f11658e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        b3Var2.f11658e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    b3Var2.h();
                    b3Var2.invalidate();
                    return;
                }
                return;
            case 3:
                e3 e3Var = (e3) this.f13074c;
                TLObject tLObject2 = (TLObject) this.d;
                qp qpVar = (qp) this.f13073b;
                e3Var.f11869r = true;
                e3Var.d = false;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    qpVar.Y3(tL_contacts_resolvedPeer.users, false);
                    qpVar.S3(tL_contacts_resolvedPeer.chats, false);
                    yr.a0(e3Var.f11872x.f11956a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    e3Var.E();
                    return;
                }
                return;
            case 4:
                String[] strArr = (String[]) this.f13074c;
                int[][] iArr4 = (int[][]) this.f13073b;
                ai.d0 d0Var = (ai.d0) this.d;
                for (int i15 = 0; i15 < strArr.length; i15++) {
                    String str3 = strArr[i15];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr4[i15], 0L);
                    }
                }
                org.telegram.messenger.g0.h3(d0Var);
                return;
            case 5:
                AnimatedFileNative.d((String) this.f13073b, ((int[][]) this.f13074c)[0], 0L);
                org.telegram.messenger.g0.h3((ai.d0) this.d);
                return;
            case 6:
                n8 n8Var = (n8) this.f13074c;
                TLObject tLObject3 = (TLObject) this.d;
                qp qpVar2 = (qp) this.f13073b;
                s8 s8Var = n8Var.W;
                n8Var.f12493w.setLoading(false);
                if (tLObject3 != null) {
                    int i16 = s8.U1;
                    ArrayList O0 = s8Var.O0();
                    for (int i17 = 0; i17 < O0.size(); i17++) {
                        TLRPC.User user = (TLRPC.User) O0.get(i17);
                        if (user != null && (contains = n8Var.f12487c.contains(Long.valueOf(user.f27105id))) != user.close_friend) {
                            user.close_friend = contains;
                            if (contains) {
                                i10 = user.flags2 | 4;
                            } else {
                                i10 = user.flags2 & (-5);
                            }
                            user.flags2 = i10;
                            qpVar2.X3(user, false, false);
                        }
                    }
                }
                s8Var.M0();
                if (s8Var.Q1) {
                    s8Var.N0(new q8(1, s8Var.f28616a, (ArrayList) null), new di.w3(s8Var, 1), false);
                    return;
                }
                s8Var.M0();
                s8Var.f12803i1.E(0);
                return;
            case 7:
                ((e7) this.f13073b).O0 = (File) this.d;
                o9 o9Var = ((va) this.f13074c).f12947d1;
                if (o9Var != null) {
                    o9Var.f11667b.f37190f3.O(false);
                    return;
                }
                return;
            case 8:
                va vaVar = (va) this.f13074c;
                Bitmap bitmap2 = (Bitmap) this.f13073b;
                Runnable runnable = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), vaVar.B0.getMatrix(), true);
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
                    } catch (Throwable unused) {
                    }
                }
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 9:
                m9.y yVar = (m9.y) this.f13074c;
                m9.e0 e0Var = (m9.e0) this.f13073b;
                try {
                    try {
                        e0Var.o(((m9.q) this.d).apply(c8.s9.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused2) {
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
            case 10:
                m9.e0 e0Var2 = (m9.e0) this.f13074c;
                org.telegram.ui.web.w wVar = (org.telegram.ui.web.w) this.f13073b;
                p4.m1 m1Var = (p4.m1) this.d;
                try {
                    if (!(e0Var2.f19989a instanceof m9.a)) {
                        wVar.run();
                        e0Var2.m(m1Var);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 11:
                ArrayList arrayList4 = (ArrayList) this.f13074c;
                HashMap hashMap2 = (HashMap) this.f13073b;
                c20 c20Var = (c20) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(i18);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f27105id));
                    if (bool != null && bool.booleanValue()) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    ?? obj2 = new Object();
                    obj2.f14834a = user2;
                    obj2.f14835b = z9;
                    arrayList5.add(obj2);
                }
                c20Var.a(arrayList5);
                return;
            case 12:
                hi.o1 o1Var = (hi.o1) this.f13073b;
                ((boolean[]) this.f13074c)[0] = false;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    o1Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 13:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f13073b;
                hi.a3 a3Var = ((hi.v2) this.f13074c).d;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    hi.s2 s2Var = a3Var.D;
                    s2Var.getClass();
                    s2Var.y("emoji_status_access_requested", org.telegram.ui.web.x0.A("cancelled", "status"));
                    return;
                }
                new hc(a3Var.f14531q0, a3Var.F).Y(tL_error).k(true);
                return;
            case 14:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f13073b;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                hc.a0((hi.q3) this.f13074c).I(2131623993, id.M0(2131754333, null), org.telegram.messenger.g0.X2(id.a0(null, null, 2131754334, hi.j.J0(connectedbotstarref.commission_permille), t10.p((TLRPC.User) this.d)))).j();
                return;
            case 15:
                hi.q3.D0((hi.q3) this.f13074c, (TLObject) this.d, (org.telegram.ui.ActionBar.u1) this.f13073b);
                return;
            case 16:
                jg.u uVar = (jg.u) this.d;
                int i19 = ((jg.h0) this.f13074c).f16760s0;
                qp s12 = qp.s1(i19);
                Iterator it = ((HashSet) this.f13073b).iterator();
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair3.first).booleanValue();
                    Long l10 = (Long) pair3.second;
                    long longValue = l10.longValue();
                    if (booleanValue) {
                        concurrentHashMap = s12.P;
                    } else {
                        concurrentHashMap = s12.O;
                    }
                    ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    yr a02 = yr.a0(i19);
                    if (booleanValue) {
                        try {
                            sQLiteCursor = a02.f26721b.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
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
                        sQLiteCursor = a02.f26721b.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
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
                org.telegram.messenger.g0.h3(uVar);
                return;
            case 17:
                ((jg.f0) this.f13074c).a((a0.h) this.d, (ArrayList) this.f13073b);
                return;
            case 18:
                jg.i1 i1Var = (jg.i1) this.f13074c;
                String str4 = (String) this.f13073b;
                TLObject tLObject4 = (TLObject) this.d;
                i1Var.E0 = 0;
                if (str4.equals(i1Var.D0) && (tLObject4 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject4;
                    ArrayList arrayList6 = i1Var.A0;
                    if (arrayList6 != null) {
                        i12 = arrayList6.size();
                    } else {
                        i12 = 0;
                    }
                    i1Var.F("sticker_search_".concat(str4), tL_messages_stickers2.stickers);
                    ArrayList arrayList7 = i1Var.A0;
                    if (arrayList7 != null) {
                        i13 = arrayList7.size();
                    } else {
                        i13 = 0;
                    }
                    if (!i1Var.f16791o0 && (arrayList = i1Var.A0) != null && !arrayList.isEmpty()) {
                        i1Var.H();
                        b90 b90Var = i1Var.V;
                        if (i1Var.K() > 0) {
                            z10 = true;
                        }
                        b90Var.a(z10);
                        i1Var.f16791o0 = true;
                    }
                    if (i12 != i13) {
                        i1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                jg.i1 i1Var2 = (jg.i1) this.f13074c;
                a0.h hVar = (a0.h) this.d;
                i1Var2.f16792p0 = null;
                i1Var2.Y(hVar, (ArrayList) this.f13073b, true);
                return;
            case 20:
                jg.z1 z1Var2 = (jg.z1) this.f13074c;
                ArrayList arrayList8 = (ArrayList) this.f13073b;
                z1Var2.f17006q = arrayList8;
                z1Var2.f17007r = (HashMap) this.d;
                z1Var2.f17008s = true;
                z1Var2.f16992a.m1(arrayList8);
                return;
            case 21:
                jg.b2 b2Var = (jg.b2) this.f13074c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str5 = ((TLRPC.TL_messages_searchStickerSets) this.f13073b).f27070q;
                jg.d2 d2Var = b2Var.f16672a;
                String str6 = d2Var.R;
                g31 g31Var = d2Var.f16700e;
                if (str5.equals(str6)) {
                    b2Var.a();
                    g31Var.f33809b.h.getProgressDrawable().f36677e = false;
                    d2Var.N = 0;
                    g31Var.b(true);
                    d2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    d2Var.f();
                    return;
                }
                return;
            case 22:
                kg.c cVar = (kg.c) this.f13074c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f13073b;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar.f17318a.b(false);
                    hc.d0(tL_error2);
                    return;
                } else if (tLObject5 instanceof TLRPC.TL_boolFalse) {
                    cVar.f17318a.b(false);
                    org.telegram.messenger.k5.p(null, 2131743882, hc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 23:
                kg.m mVar = (kg.m) this.f13074c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f13073b;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error3 != null) {
                    mVar.f17429f.b(false);
                    hc.d0(tL_error3);
                    return;
                } else if (tLObject6 instanceof TLRPC.TL_boolFalse) {
                    mVar.f17429f.b(false);
                    org.telegram.messenger.k5.p(null, 2131743882, hc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.E != null) {
                        mVar.getMessagesController().W2(mVar.getUserConfig().f(), 0, true, null);
                    }
                    mVar.finishFragment();
                    return;
                }
            case 24:
                kg.y yVar2 = (kg.y) this.f13074c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f13073b;
                ArrayList arrayList9 = yVar2.f17586b;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList9.contains(tL_businessChatLink)) {
                        arrayList9.remove(tL_businessChatLink);
                        qs.f(yVar2.f17585a).k(125, new Object[0]);
                    }
                    yVar2.f();
                    return;
                }
                org.telegram.messenger.a8.g(new RuntimeException("Unexpected response from server!"), true);
                return;
            case 25:
                kg.y yVar3 = (kg.y) this.f13074c;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f13073b;
                ConnectionsManager.getInstance(yVar3.f17585a).sendRequest(deletebusinesschatlink, new bi.j(19, yVar3, (TL_account.TL_businessChatLink) this.d));
                return;
            case 26:
                kg.i0 i0Var = (kg.i0) this.f13074c;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                kg.f.a(i0Var.f28616a).b();
                i0Var.dismiss();
                ((TL_account.TL_connectedBot) this.f13073b).recipients = tL_businessBotRecipients;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    hc.a0(T).Q(2131623989, 36, id.a0(null, null, 2131752784, t10.p(i0Var.Q1))).j();
                    return;
                }
                return;
            case 27:
                kg.s0 s0Var = (kg.s0) this.f13074c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f13073b;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error4 != null) {
                    s0Var.f17523a.b(false);
                    hc.d0(tL_error4);
                    return;
                } else if (tLObject7 instanceof TLRPC.TL_boolFalse) {
                    s0Var.f17523a.b(false);
                    org.telegram.messenger.k5.p(null, 2131743882, hc.a0(s0Var), null);
                    return;
                } else {
                    s0Var.finishFragment();
                    return;
                }
            case 28:
                kg.c1.Z((kg.c1) this.f13074c, (TLRPC.TL_error) this.f13073b, (TLObject) this.d);
                return;
            default:
                kg.x1 x1Var = (kg.x1) this.f13074c;
                TLObject tLObject8 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f13073b;
                ArrayList arrayList10 = x1Var.d;
                if (tLObject8 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList10.clear();
                    arrayList10.addAll(((TLRPC.TL_help_timezonesList) tLObject8).timezones);
                    SerializedData serializedData = new SerializedData(tLObject8.getObjectSize());
                    tLObject8.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    qs.f(x1Var.f17580a).k(214, new Object[0]);
                }
                x1Var.f17582c = true;
                x1Var.f17581b = false;
                return;
        }
    }

    public x1(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f13072a = i7;
        this.f13074c = obj;
        this.d = obj2;
        this.f13073b = obj3;
    }

    public x1(String str, int[][] iArr, ai.d0 d0Var) {
        this.f13072a = 5;
        this.f13073b = str;
        this.f13074c = iArr;
        this.d = d0Var;
    }
}
