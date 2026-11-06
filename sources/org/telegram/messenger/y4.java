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
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
public final class y4 implements Runnable {
    public final int f26577a;
    public final Object f26578b;
    public final Object f26579c;

    public y4(int i7, Object obj, Object obj2) {
        this.f26577a = i7;
        this.f26578b = obj;
        this.f26579c = obj2;
    }

    private final void a() {
        int i7;
        ui uiVar = (ui) this.f26578b;
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.f26579c;
        try {
            uiVar.getMessagesStorage().f26698b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            uiVar.getMessagesStorage().f26698b.beginTransaction();
            uiVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().f26698b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i10 = 0; i10 < tL_contacts_topPeers.categories.size(); i10++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i10);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    i7 = 1;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    i7 = 2;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                    i7 = 3;
                } else {
                    i7 = 0;
                }
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, ij.C1(tL_topPeer.peer));
                    executeFast.bindInteger(2, i7);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            uiVar.getMessagesStorage().f26698b.commitTransaction();
            g0.h3(new fg(uiVar, 6));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        String str;
        org.telegram.ui.Components.v5 v5Var;
        long U;
        long S;
        float f10;
        float K;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        int i7 = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r6 = null;
        r6 = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        r6 = null;
        String str2 = null;
        Drawable drawable = null;
        sQLitePreparedStatement = null;
        boolean z11 = true;
        int i10 = 0;
        switch (this.f26577a) {
            case 0:
                g5 g5Var = (g5) this.f26578b;
                SparseArray sparseArray = (SparseArray) this.f26579c;
                if (!g5Var.f22600s) {
                    g5Var.f22600s = true;
                    HashMap hashMap = new HashMap();
                    HashMap H = g5Var.H();
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : H.entrySet()) {
                        d5 d5Var = (d5) entry.getValue();
                        for (int i11 = 0; i11 < d5Var.f21968g.size(); i11++) {
                            hashMap2.put((String) d5Var.f21968g.get(i11), d5Var.f21964b);
                        }
                    }
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        d5 d5Var2 = (d5) sparseArray.valueAt(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 >= d5Var2.f21968g.size()) {
                                break;
                            }
                            String str3 = (String) hashMap2.get((String) d5Var2.f21968g.get(i13));
                            if (str3 != null) {
                                d5Var2.f21964b = str3;
                                hashMap.put(str3, d5Var2);
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (r2.f25199a) {
                        a8.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
                    }
                    g5Var.getMessagesStorage().Z0(hashMap, true, false);
                    return;
                }
                return;
            case 1:
                r5 r5Var = (r5) this.f26578b;
                q5 q5Var = (q5) this.f26579c;
                r5Var.f25242g--;
                SparseIntArray sparseIntArray = r5Var.f25238b;
                int i14 = sparseIntArray.get(q5Var.index) - 1;
                if (i14 == 0) {
                    sparseIntArray.delete(q5Var.index);
                    r5Var.f25239c.remove(q5Var);
                    r5Var.f25237a.add(q5Var);
                    return;
                }
                sparseIntArray.put(q5Var.index, i14);
                return;
            case 2:
                ((w00) this.f26578b).a((ArrayList) this.f26579c);
                return;
            case 3:
                qp.s1(((x6) this.f26578b).f26436a).O3((TLRPC.Updates) ((TLObject) this.f26579c), false);
                return;
            case 4:
                yr yrVar = (yr) this.f26578b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.f26579c;
                try {
                    try {
                        sQLitePreparedStatement = yrVar.f26698b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
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
                i7 i7Var = (i7) this.f26578b;
                boolean[] zArr = (boolean[]) this.f26579c;
                if (i7Var.f23131y && zArr[0]) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i15 = i7Var.J;
                if (i15 > 0 && i7Var.f23078a0 >= i15 && i7Var.f23102j && i7Var.W0 < 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long j3 = i7Var.f23081b0;
                if (j3 != 0 && (z9 || i7Var.f23078a0 == j3 || z10)) {
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
                i7 i7Var2 = (i7) this.f26578b;
                ArrayList arrayList = (ArrayList) this.f26579c;
                System.currentTimeMillis();
                try {
                } catch (Exception e11) {
                    a8.g(e11, false);
                    if (g0.F1(e11)) {
                        LaunchActivity.D(1);
                    } else if (g0.G1(e11)) {
                        iz.h(i7Var2.L0);
                    }
                }
                if (i7Var2.S0 != null) {
                    int size = arrayList.size();
                    int i16 = (size * 16) + 4;
                    bg.d0 d0Var = i7.l1;
                    if (d0Var == null) {
                        i7.l1 = new bg.d0(i16);
                    } else {
                        d0Var.b();
                    }
                    i7.l1.c(size);
                    for (int i17 = 0; i17 < size; i17++) {
                        g7 g7Var = (g7) arrayList.get(i17);
                        i7.l1.d(g7Var.f22607a);
                        i7.l1.d(g7Var.f22608b);
                    }
                    synchronized (i7Var2) {
                        RandomAccessFile randomAccessFile = i7Var2.S0;
                        if (randomAccessFile != null) {
                            randomAccessFile.seek(0L);
                            i7Var2.S0.write(i7.l1.f3267a, 0, i16);
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
                w7 w7Var = (w7) this.f26578b;
                ls[] lsVarArr = (ls[]) this.f26579c;
                w7Var.getNotificationCenter().n(lsVarArr[0], 138);
                w7Var.getNotificationCenter().n(lsVarArr[0], 139);
                return;
            case 8:
                w7 w7Var2 = (w7) this.f26578b;
                w7Var2.getDownloadController().H.removeAll((ArrayList) this.f26579c);
                w7Var2.getNotificationCenter().k(304, new Object[0]);
                return;
            case 9:
                i7 i7Var3 = (i7) ((w7) this.f26578b).f26268w.get(w7.r("mp4", (TLRPC.FileLocation) this.f26579c));
                if (i7Var3 != null) {
                    if (i7Var3.f23131y) {
                        i7Var3.q(false);
                    }
                    i7Var3.V0 = true;
                    i7Var3.W0 = Integer.MAX_VALUE;
                    ((ArrayList) i7Var3.f23090e1.d).remove(i7Var3);
                    i7Var3.f23090e1.a(i7Var3);
                    i7Var3.f23090e1.b(false);
                    return;
                }
                return;
            case 10:
                ((i7) this.f26578b).f23077a = true;
                ((lg.f) this.f26579c).b(false);
                return;
            case 11:
                String str4 = (String) this.f26578b;
                Throwable th3 = (Throwable) this.f26579c;
                try {
                    a8.j().f21400a.write(a8.j().f21401b.format(System.currentTimeMillis()) + " E/tmessages: " + str4 + "\n");
                    a8.j().f21400a.write(th3.toString());
                    StackTraceElement[] stackTrace = th3.getStackTrace();
                    while (i10 < stackTrace.length) {
                        a8.j().f21400a.write(a8.j().f21401b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i10] + "\n");
                        i10++;
                    }
                    a8.j().f21400a.flush();
                    return;
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
            case 12:
                f8 f8Var = (f8) this.f26578b;
                List list = (List) this.f26579c;
                f8Var.getClass();
                try {
                    f8Var.c();
                    f8Var.f22361c.beginTransaction();
                    while (i10 < list.size()) {
                        f8Var.f22361c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((ci.b) list.get(i10)).f6417a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                        i10++;
                    }
                } catch (Throwable th4) {
                    try {
                        a8.g(th4, true);
                    } finally {
                        f8Var.f22361c.commitTransaction();
                    }
                }
                return;
            case 13:
                ((r8) this.f26578b).getMessagesController().X3((TLRPC.User) this.f26579c, false, false);
                return;
            case 14:
                ((r8) this.f26578b).getMediaDataController().P1((TLRPC.TL_messages_stickerSet) this.f26579c);
                return;
            case 15:
                g0.h3(new y4(((gc) this.f26578b).l(), (Runnable) this.f26579c));
                return;
            case 16:
                gc gcVar = (gc) this.f26578b;
                gcVar.B.add((xb) this.f26579c);
                gcVar.U(null, 0);
                return;
            case 17:
                Runnable runnable = (Runnable) this.f26578b;
                w7.K = (SparseArray) this.f26579c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 18:
                tb tbVar = (tb) this.f26578b;
                ub ubVar = tbVar.f25601a;
                gc gcVar2 = tbVar.f25604e;
                bc bcVar = new bc(gcVar2, ubVar, (String) this.f26579c);
                ubVar.f25758t = bcVar;
                gcVar2.f22627n.add(bcVar);
                gcVar2.V(false);
                return;
            case 19:
                vb vbVar = (vb) this.f26578b;
                BitmapDrawable bitmapDrawable = (Drawable) this.f26579c;
                gc gcVar3 = vbVar.f25963e;
                kb kbVar = gcVar3.f22619e;
                ub ubVar2 = vbVar.f25962c;
                if (bitmapDrawable instanceof zg0) {
                    zg0 zg0Var = (zg0) bitmapDrawable;
                    Drawable drawable2 = (Drawable) kbVar.f(ubVar2.d);
                    if (drawable2 == null) {
                        kbVar.l(ubVar2.d, zg0Var);
                        drawable = zg0Var;
                    } else {
                        zg0Var.C(false);
                        drawable = drawable2;
                    }
                    gcVar3.H(ubVar2.d);
                    str = ubVar2.d;
                } else if (bitmapDrawable instanceof org.telegram.ui.Components.v5) {
                    org.telegram.ui.Components.v5 v5Var2 = (org.telegram.ui.Components.v5) bitmapDrawable;
                    if (v5Var2.f38840n0) {
                        String str5 = ubVar2.d;
                        ThreadLocal threadLocal = gc.I;
                        BitmapDrawable y10 = gcVar3.y(str5);
                        if (y10 == null) {
                            kbVar.l(ubVar2.d, v5Var2);
                            v5Var = v5Var2;
                        } else {
                            v5Var2.u();
                            v5Var = y10;
                        }
                        gcVar3.H(ubVar2.d);
                        str = ubVar2.d;
                        drawable = v5Var;
                    }
                    String str6 = str2;
                    drawable = bitmapDrawable;
                    str = str6;
                } else if (bitmapDrawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) bitmapDrawable;
                    BitmapDrawable z12 = gcVar3.z(ubVar2.d);
                    if (z12 == null) {
                        if (ubVar2.d.endsWith("_f")) {
                            gcVar3.d.l(ubVar2.d, bitmapDrawable2);
                            z11 = false;
                            bitmapDrawable = bitmapDrawable2;
                        } else if (!ubVar2.d.endsWith("_isc") && !ubVar2.d.endsWith("_nocache") && bitmapDrawable2.getBitmap().getWidth() <= g0.f22543p * 80.0f && bitmapDrawable2.getBitmap().getHeight() <= g0.f22543p * 80.0f) {
                            gcVar3.f22617b.l(ubVar2.d, bitmapDrawable2);
                            bitmapDrawable = bitmapDrawable2;
                        } else {
                            bitmapDrawable = bitmapDrawable2;
                            if (!ubVar2.d.endsWith("_nocache")) {
                                gcVar3.f22618c.l(ubVar2.d, bitmapDrawable2);
                                bitmapDrawable = bitmapDrawable2;
                            }
                        }
                    } else {
                        g0.z2(bitmapDrawable2.getBitmap());
                        bitmapDrawable = z12;
                    }
                    if (z11) {
                        gcVar3.H(ubVar2.d);
                        str2 = ubVar2.d;
                    }
                    String str62 = str2;
                    drawable = bitmapDrawable;
                    str = str62;
                } else {
                    str = null;
                }
                gcVar3.f22632s.d(new ng(vbVar, drawable, str, 26), ubVar2.f25741a);
                return;
            case 20:
                ((fc) this.f26578b).d.v.remove((String) this.f26579c);
                return;
            case 21:
                String[] strArr = MediaController.V1;
                ((MediaController) this.f26578b).R((ij) this.f26579c, true);
                return;
            case 22:
                MediaController mediaController = (MediaController) this.f26578b;
                File file = (File) this.f26579c;
                String[] strArr2 = MediaController.V1;
                try {
                    int i18 = mediaController.f21272k0 + 1;
                    mediaController.f21272k0 = i18;
                    t51 t51Var = mediaController.f21270j0;
                    if (t51Var != null) {
                        t51Var.m0();
                    }
                    t51 t51Var2 = new t51(false, false);
                    mediaController.f21270j0 = t51Var2;
                    t51Var2.J = new f5.u(mediaController, i18, 10);
                    t51Var2.j0(Uri.fromFile(file), "other");
                    mediaController.f21270j0.x0(3);
                    mediaController.f21270j0.h0();
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    t51 t51Var3 = mediaController.f21270j0;
                    if (t51Var3 != null) {
                        t51Var3.m0();
                        mediaController.f21270j0 = null;
                        return;
                    }
                    return;
                }
            case 23:
                String[] strArr3 = MediaController.V1;
                w7.G(((c) this.f26578b).f21729a).W((TLRPC.TL_document) this.f26579c, null, 1, 1);
                return;
            case 24:
                ((MediaController) ((m.f3) this.f26578b).f19102b).f21301x1.add((ByteBuffer) this.f26579c);
                return;
            case 25:
                jg.q1 q1Var = (jg.q1) this.f26578b;
                ij ijVar = (ij) this.f26579c;
                MediaController mediaController2 = (MediaController) q1Var.f16895c;
                t51 t51Var4 = mediaController2.f21268i0;
                if ((t51Var4 != null || mediaController2.E0 != null) && !mediaController2.f21264g0) {
                    try {
                        t51 t51Var5 = mediaController2.E0;
                        if (t51Var5 != null) {
                            U = t51Var5.U();
                            S = ((MediaController) q1Var.f16895c).E0.S();
                            if (S >= 0 && U > 0) {
                                float f11 = (float) U;
                                K = ((float) ((MediaController) q1Var.f16895c).E0.K()) / f11;
                                f10 = ((float) S) / f11;
                                if (f10 >= 1.0f) {
                                    return;
                                }
                            }
                            return;
                        }
                        U = t51Var4.U();
                        S = ((MediaController) q1Var.f16895c).f21268i0.S();
                        if (U >= 0) {
                            f10 = ((float) S) / ((float) U);
                        } else {
                            f10 = 0.0f;
                        }
                        K = ((float) ((MediaController) q1Var.f16895c).f21268i0.K()) / ((float) U);
                        if (U != -9223372036854775807L) {
                            if (S >= 0) {
                                if (((MediaController) q1Var.f16895c).f21290t0 != 0.0f) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                        MediaController mediaController3 = (MediaController) q1Var.f16895c;
                        ijVar.f23231h0 = (int) (U / 1000);
                        ijVar.f23204b0 = f10;
                        ijVar.f23227g0 = (int) (S / 1000);
                        ijVar.f23217e0 = K;
                        if (f10 >= 0.0f && mediaController3.f21277n0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController4 = (MediaController) q1Var.f16895c;
                            if (elapsedRealtime - mediaController4.f21278o0 >= 1000) {
                                String str7 = mediaController4.f21277n0;
                                mediaController4.f21278o0 = SystemClock.elapsedRealtime();
                                Utilities.f21333e.c(new ve(str7, 0, f10));
                            }
                        }
                        qs.f(ijVar.I1).k(148, Integer.valueOf(ijVar.f1()), Float.valueOf(f10));
                        return;
                    } catch (Exception e15) {
                        a8.g(e15, true);
                        return;
                    }
                }
                return;
            case 26:
                cf cfVar = (cf) this.f26578b;
                ij ijVar2 = (ij) this.f26579c;
                TLRPC.Document F0 = ijVar2.F0();
                TLRPC.Document document = ijVar2.f23215d3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    cfVar.d.put(w7.r(null, F0), ijVar2);
                    w7 G = w7.G(cfVar.f21809a.f21729a);
                    if (!ij.S5(ijVar2.f23244k)) {
                        i7 = 0;
                    }
                    G.W(F0, ijVar2, 3, i7);
                    return;
                }
                return;
            case 27:
                a();
                return;
            case 28:
                boolean[] zArr2 = (boolean[]) this.f26578b;
                mh mhVar = (mh) this.f26579c;
                if (!zArr2[0]) {
                    mhVar.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            default:
                ui uiVar = (ui) this.f26578b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.f26579c;
                try {
                    SQLiteCursor queryFinalized = uiVar.getMessagesStorage().f26698b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.f26980id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        uiVar.L0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        g0.h3(new cg(uiVar, tL_messages_stickerSet, 1));
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
        this.f26577a = 17;
        this.f26579c = sparseArray;
        this.f26578b = runnable;
    }
}
