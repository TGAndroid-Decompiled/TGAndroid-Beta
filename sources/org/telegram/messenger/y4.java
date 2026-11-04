package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.LaunchActivity;
public final class y4 implements Runnable {
    public final int f26521a;
    public final Object f26522b;
    public final Object f26523c;

    public y4(int i3, Object obj, Object obj2) {
        this.f26521a = i3;
        this.f26522b = obj;
        this.f26523c = obj2;
    }

    private final void a() {
        int i3;
        li liVar = (li) this.f26522b;
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.f26523c;
        try {
            liVar.getMessagesStorage().f24936b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            liVar.getMessagesStorage().f24936b.beginTransaction();
            liVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = liVar.getMessagesStorage().f24936b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i10 = 0; i10 < tL_contacts_topPeers.categories.size(); i10++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i10);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    i3 = 1;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    i3 = 2;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                    i3 = 3;
                } else {
                    i3 = 0;
                }
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, zi.C1(tL_topPeer.peer));
                    executeFast.bindInteger(2, i3);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            liVar.getMessagesStorage().f24936b.commitTransaction();
            g0.h3(new xf(liVar, 6));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        String str;
        org.telegram.ui.Components.t5 t5Var;
        long U;
        long S;
        float f10;
        float K;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        int i3 = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r6 = null;
        r6 = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        r6 = null;
        String str2 = null;
        Drawable drawable = null;
        sQLitePreparedStatement = null;
        boolean z12 = true;
        int i10 = 0;
        switch (this.f26521a) {
            case 0:
                g5 g5Var = (g5) this.f26522b;
                SparseArray sparseArray = (SparseArray) this.f26523c;
                if (!g5Var.f22663s) {
                    g5Var.f22663s = true;
                    HashMap hashMap = new HashMap();
                    HashMap H = g5Var.H();
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : H.entrySet()) {
                        d5 d5Var = (d5) entry.getValue();
                        for (int i11 = 0; i11 < d5Var.f22152g.size(); i11++) {
                            hashMap2.put((String) d5Var.f22152g.get(i11), d5Var.f22148b);
                        }
                    }
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        d5 d5Var2 = (d5) sparseArray.valueAt(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 >= d5Var2.f22152g.size()) {
                                break;
                            }
                            String str3 = (String) hashMap2.get((String) d5Var2.f22152g.get(i13));
                            if (str3 != null) {
                                d5Var2.f22148b = str3;
                                hashMap.put(str3, d5Var2);
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (r2.f25040a) {
                        a8.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
                    }
                    g5Var.getMessagesStorage().Z0(hashMap, true, false);
                    return;
                }
                return;
            case 1:
                r5 r5Var = (r5) this.f26522b;
                q5 q5Var = (q5) this.f26523c;
                r5Var.f25082g--;
                SparseIntArray sparseIntArray = r5Var.f25078b;
                int i14 = sparseIntArray.get(q5Var.index) - 1;
                if (i14 == 0) {
                    sparseIntArray.delete(q5Var.index);
                    r5Var.f25079c.remove(q5Var);
                    r5Var.f25077a.add(q5Var);
                    return;
                }
                sparseIntArray.put(q5Var.index, i14);
                return;
            case 2:
                ((o00) this.f26522b).a((ArrayList) this.f26523c);
                return;
            case 3:
                hp.s1(((x6) this.f26522b).f26347a).O3((TLRPC.Updates) ((TLObject) this.f26523c), false);
                return;
            case 4:
                qr qrVar = (qr) this.f26522b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.f26523c;
                try {
                    try {
                        sQLitePreparedStatement = qrVar.f24936b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                        tL_factCheck.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                        sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 5:
                i7 i7Var = (i7) this.f26522b;
                boolean[] zArr = (boolean[]) this.f26523c;
                if (i7Var.f23514y && zArr[0]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i15 = i7Var.J;
                if (i15 > 0 && i7Var.f23461a0 >= i15 && i7Var.f23485j && i7Var.W0 < 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j10 = i7Var.f23464b0;
                if (j10 != 0 && (z10 || i7Var.f23461a0 == j10 || z11)) {
                    try {
                        i7Var.k(1, false, true);
                        return;
                    } catch (Exception unused) {
                        i7Var.j(0, true);
                        return;
                    }
                }
                i7Var.s(-1);
                return;
            case 6:
                i7 i7Var2 = (i7) this.f26522b;
                ArrayList arrayList = (ArrayList) this.f26523c;
                System.currentTimeMillis();
                try {
                } catch (Exception e11) {
                    a8.g(e11, false);
                    if (g0.F1(e11)) {
                        LaunchActivity.D(1);
                    } else if (g0.G1(e11)) {
                        az.h(i7Var2.L0);
                    }
                }
                if (i7Var2.S0 != null) {
                    int size = arrayList.size();
                    int i16 = (size * 16) + 4;
                    cg.c0 c0Var = i7.f23459l1;
                    if (c0Var == null) {
                        i7.f23459l1 = new cg.c0(i16);
                    } else {
                        c0Var.b();
                    }
                    i7.f23459l1.c(size);
                    for (int i17 = 0; i17 < size; i17++) {
                        g7 g7Var = (g7) arrayList.get(i17);
                        i7.f23459l1.d(g7Var.f22670a);
                        i7.f23459l1.d(g7Var.f22671b);
                    }
                    synchronized (i7Var2) {
                        RandomAccessFile randomAccessFile = i7Var2.S0;
                        if (randomAccessFile != null) {
                            randomAccessFile.seek(0L);
                            i7Var2.S0.write(i7.f23459l1.f4634a, 0, i16);
                            i7Var2.Y0 = false;
                            if (i7Var2.Z0) {
                                try {
                                    i7Var2.S0.getChannel().close();
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                i7Var2.S0.close();
                                i7Var2.S0 = null;
                            }
                            System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 7:
                w7 w7Var = (w7) this.f26522b;
                cs[] csVarArr = (cs[]) this.f26523c;
                w7Var.getNotificationCenter().n(csVarArr[0], 138);
                w7Var.getNotificationCenter().n(csVarArr[0], 139);
                return;
            case 8:
                w7 w7Var2 = (w7) this.f26522b;
                w7Var2.getDownloadController().I.removeAll((ArrayList) this.f26523c);
                w7Var2.getNotificationCenter().k(304, new Object[0]);
                return;
            case 9:
                i7 i7Var3 = (i7) ((w7) this.f26522b).f26174w.get(w7.r("mp4", (TLRPC.FileLocation) this.f26523c));
                if (i7Var3 != null) {
                    if (i7Var3.f23514y) {
                        i7Var3.q(false);
                    }
                    i7Var3.V0 = true;
                    i7Var3.W0 = Integer.MAX_VALUE;
                    ((ArrayList) i7Var3.f23473e1.d).remove(i7Var3);
                    i7Var3.f23473e1.a(i7Var3);
                    i7Var3.f23473e1.b(false);
                    return;
                }
                return;
            case 10:
                ((i7) this.f26522b).f23460a = true;
                ((mg.f) this.f26523c).b(false);
                return;
            case 11:
                String str4 = (String) this.f26522b;
                Throwable th3 = (Throwable) this.f26523c;
                try {
                    a8.j().f21474a.write(a8.j().f21475b.format(System.currentTimeMillis()) + " E/tmessages: " + str4 + "\n");
                    a8.j().f21474a.write(th3.toString());
                    StackTraceElement[] stackTrace = th3.getStackTrace();
                    while (i10 < stackTrace.length) {
                        a8.j().f21474a.write(a8.j().f21475b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i10] + "\n");
                        i10++;
                    }
                    a8.j().f21474a.flush();
                    return;
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
            case 12:
                f8 f8Var = (f8) this.f26522b;
                List list = (List) this.f26523c;
                f8Var.getClass();
                try {
                    f8Var.c();
                    f8Var.f22463c.beginTransaction();
                    while (i10 < list.size()) {
                        f8Var.f22463c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((di.b) list.get(i10)).f9180a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                        i10++;
                    }
                } catch (Throwable th4) {
                    try {
                        a8.g(th4, true);
                    } finally {
                        f8Var.f22463c.commitTransaction();
                    }
                }
                return;
            case 13:
                ((r8) this.f26522b).getMessagesController().X3((TLRPC.User) this.f26523c, false, false);
                return;
            case 14:
                ((r8) this.f26522b).getMediaDataController().P1((TLRPC.TL_messages_stickerSet) this.f26523c);
                return;
            case 15:
                g0.h3(new y4(((zb) this.f26522b).l(), (Runnable) this.f26523c));
                return;
            case 16:
                zb zbVar = (zb) this.f26522b;
                zbVar.B.add((qb) this.f26523c);
                zbVar.U(null, 0);
                return;
            case 17:
                Runnable runnable = (Runnable) this.f26522b;
                w7.L = (SparseArray) this.f26523c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 18:
                mb mbVar = (mb) this.f26522b;
                nb nbVar = mbVar.f24183a;
                zb zbVar2 = mbVar.f24186e;
                ub ubVar = new ub(zbVar2, nbVar, (String) this.f26523c);
                nbVar.f24357t = ubVar;
                zbVar2.f26768n.add(ubVar);
                zbVar2.V(false);
                return;
            case 19:
                ob obVar = (ob) this.f26522b;
                BitmapDrawable bitmapDrawable = (Drawable) this.f26523c;
                zb zbVar3 = obVar.f24519e;
                db dbVar = zbVar3.f26760e;
                nb nbVar2 = obVar.f24518c;
                if (bitmapDrawable instanceof ch0) {
                    ch0 ch0Var = (ch0) bitmapDrawable;
                    Drawable drawable2 = (Drawable) dbVar.f(nbVar2.d);
                    if (drawable2 == null) {
                        dbVar.l(nbVar2.d, ch0Var);
                        drawable = ch0Var;
                    } else {
                        ch0Var.C(false);
                        drawable = drawable2;
                    }
                    zbVar3.H(nbVar2.d);
                    str = nbVar2.d;
                } else if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
                    org.telegram.ui.Components.t5 t5Var2 = (org.telegram.ui.Components.t5) bitmapDrawable;
                    if (t5Var2.f38271o0) {
                        String str5 = nbVar2.d;
                        ThreadLocal threadLocal = zb.I;
                        BitmapDrawable y9 = zbVar3.y(str5);
                        if (y9 == null) {
                            dbVar.l(nbVar2.d, t5Var2);
                            t5Var = t5Var2;
                        } else {
                            t5Var2.u();
                            t5Var = y9;
                        }
                        zbVar3.H(nbVar2.d);
                        str = nbVar2.d;
                        drawable = t5Var;
                    }
                    String str6 = str2;
                    drawable = bitmapDrawable;
                    str = str6;
                } else if (bitmapDrawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) bitmapDrawable;
                    BitmapDrawable z13 = zbVar3.z(nbVar2.d);
                    if (z13 == null) {
                        if (nbVar2.d.endsWith("_f")) {
                            zbVar3.d.l(nbVar2.d, bitmapDrawable2);
                            z12 = false;
                            bitmapDrawable = bitmapDrawable2;
                        } else if (!nbVar2.d.endsWith("_isc") && !nbVar2.d.endsWith("_nocache") && bitmapDrawable2.getBitmap().getWidth() <= g0.f22607p * 80.0f && bitmapDrawable2.getBitmap().getHeight() <= g0.f22607p * 80.0f) {
                            zbVar3.f26758b.l(nbVar2.d, bitmapDrawable2);
                            bitmapDrawable = bitmapDrawable2;
                        } else {
                            bitmapDrawable = bitmapDrawable2;
                            if (!nbVar2.d.endsWith("_nocache")) {
                                zbVar3.f26759c.l(nbVar2.d, bitmapDrawable2);
                                bitmapDrawable = bitmapDrawable2;
                            }
                        }
                    } else {
                        g0.z2(bitmapDrawable2.getBitmap());
                        bitmapDrawable = z13;
                    }
                    if (z12) {
                        zbVar3.H(nbVar2.d);
                        str2 = nbVar2.d;
                    }
                    String str62 = str2;
                    drawable = bitmapDrawable;
                    str = str62;
                } else {
                    str = null;
                }
                zbVar3.f26773s.e(new fg(obVar, drawable, str, 26), nbVar2.f24340a);
                return;
            case 20:
                ((yb) this.f26522b).d.v.remove((String) this.f26523c);
                return;
            case 21:
                String[] strArr = MediaController.W1;
                ((MediaController) this.f26522b).R((zi) this.f26523c, true);
                return;
            case 22:
                MediaController mediaController = (MediaController) this.f26522b;
                File file = (File) this.f26523c;
                String[] strArr2 = MediaController.W1;
                try {
                    int i18 = mediaController.f21327l0 + 1;
                    mediaController.f21327l0 = i18;
                    m51 m51Var = mediaController.f21326k0;
                    if (m51Var != null) {
                        m51Var.m0();
                    }
                    m51 m51Var2 = new m51(false, false);
                    mediaController.f21326k0 = m51Var2;
                    m51Var2.K = new e5.u(mediaController, i18, 14);
                    m51Var2.j0(Uri.fromFile(file), "other");
                    mediaController.f21326k0.x0(3);
                    mediaController.f21326k0.h0();
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    m51 m51Var3 = mediaController.f21326k0;
                    if (m51Var3 != null) {
                        m51Var3.m0();
                        mediaController.f21326k0 = null;
                        return;
                    }
                    return;
                }
            case 23:
                String[] strArr3 = MediaController.W1;
                w7.G(((c) this.f26522b).f21919a).X((TLRPC.TL_document) this.f26523c, null, 1, 1);
                return;
            case 24:
                ((MediaController) ((mi.b0) this.f26522b).f19470b).f21358y1.add((ByteBuffer) this.f26523c);
                return;
            case 25:
                kg.m1 m1Var = (kg.m1) this.f26522b;
                zi ziVar = (zi) this.f26523c;
                MediaController mediaController2 = (MediaController) m1Var.f17100c;
                m51 m51Var4 = mediaController2.f21324j0;
                if ((m51Var4 != null || mediaController2.F0 != null) && !mediaController2.f21320h0) {
                    try {
                        m51 m51Var5 = mediaController2.F0;
                        if (m51Var5 != null) {
                            U = m51Var5.U();
                            S = ((MediaController) m1Var.f17100c).F0.S();
                            if (S >= 0 && U > 0) {
                                float f11 = (float) U;
                                K = ((float) ((MediaController) m1Var.f17100c).F0.K()) / f11;
                                f10 = ((float) S) / f11;
                                if (f10 >= 1.0f) {
                                    return;
                                }
                            }
                            return;
                        }
                        U = m51Var4.U();
                        S = ((MediaController) m1Var.f17100c).f21324j0.S();
                        if (U >= 0) {
                            f10 = ((float) S) / ((float) U);
                        } else {
                            f10 = 0.0f;
                        }
                        K = ((float) ((MediaController) m1Var.f17100c).f21324j0.K()) / ((float) U);
                        if (U != -9223372036854775807L) {
                            if (S >= 0) {
                                if (((MediaController) m1Var.f17100c).f21346u0 != 0.0f) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                        MediaController mediaController3 = (MediaController) m1Var.f17100c;
                        ziVar.f26855h0 = (int) (U / 1000);
                        ziVar.f26828b0 = f10;
                        ziVar.f26851g0 = (int) (S / 1000);
                        ziVar.f26841e0 = K;
                        if (f10 >= 0.0f && mediaController3.f21332o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController4 = (MediaController) m1Var.f17100c;
                            if (elapsedRealtime - mediaController4.f21334p0 >= 1000) {
                                String str7 = mediaController4.f21332o0;
                                mediaController4.f21334p0 = SystemClock.elapsedRealtime();
                                Utilities.f21387e.c(new oe(str7, 0, f10));
                            }
                        }
                        hs.f(ziVar.I1).k(148, Integer.valueOf(ziVar.f1()), Float.valueOf(f10));
                        return;
                    } catch (Exception e15) {
                        a8.g(e15, true);
                        return;
                    }
                }
                return;
            case 26:
                ve veVar = (ve) this.f26522b;
                zi ziVar2 = (zi) this.f26523c;
                TLRPC.Document F0 = ziVar2.F0();
                TLRPC.Document document = ziVar2.f26839d3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    veVar.d.put(w7.r(null, F0), ziVar2);
                    w7 G = w7.G(veVar.f25853a.f21919a);
                    if (!zi.S5(ziVar2.f26868k)) {
                        i3 = 0;
                    }
                    G.X(F0, ziVar2, 3, i3);
                    return;
                }
                return;
            case 27:
                a();
                return;
            case 28:
                boolean[] zArr2 = (boolean[]) this.f26522b;
                dh dhVar = (dh) this.f26523c;
                if (!zArr2[0]) {
                    dhVar.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            default:
                li liVar = (li) this.f26522b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.f26523c;
                try {
                    SQLiteCursor queryFinalized = liVar.getMessagesStorage().f24936b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.f27028id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        liVar.L0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        g0.h3(new uf(liVar, tL_messages_stickerSet, 1));
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    a8.g(th5, true);
                    return;
                }
        }
    }

    public y4(SparseArray sparseArray, Runnable runnable) {
        this.f26521a = 17;
        this.f26523c = sparseArray;
        this.f26522b = runnable;
    }
}
