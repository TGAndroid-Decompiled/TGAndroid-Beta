package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
public final class t6 implements Runnable {
    public final int f18020a;
    public final Object f18021b;
    public final Object f18022c;

    public t6(int i10, Object obj, Object obj2) {
        this.f18020a = i10;
        this.f18021b = obj;
        this.f18022c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        String str;
        org.telegram.ui.Components.s5 s5Var;
        long U;
        long S;
        float f7;
        float f10;
        int i10;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        int i11 = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r7 = null;
        r7 = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        r7 = null;
        String str2 = null;
        Drawable drawable = null;
        sQLitePreparedStatement = null;
        boolean z12 = true;
        int i12 = 0;
        switch (this.f18020a) {
            case 0:
                ((k10) this.f18021b).a((ArrayList) this.f18022c);
                return;
            case 1:
                vp.r1(((a7) this.f18021b).f14585a).L3((TLRPC.Updates) ((TLObject) this.f18022c), false);
                return;
            case 2:
                hs hsVar = (hs) this.f18021b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.f18022c;
                try {
                    try {
                        sQLitePreparedStatement = hsVar.f15940b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                        tL_factCheck.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                        sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        if (sQLitePreparedStatement != null) {
                            return;
                        }
                        return;
                    }
                } finally {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
            case 3:
                m7 m7Var = (m7) this.f18021b;
                boolean[] zArr = (boolean[]) this.f18022c;
                if (m7Var.f16925y && zArr[0]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i13 = m7Var.J;
                if (i13 > 0 && m7Var.f16873a0 >= i13 && m7Var.f16896j && m7Var.W0 < 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j10 = m7Var.f16876b0;
                if (j10 != 0 && (z10 || m7Var.f16873a0 == j10 || z11)) {
                    try {
                        m7Var.k(1, false, true);
                        return;
                    } catch (Exception unused) {
                        m7Var.j(0, true);
                        return;
                    }
                }
                m7Var.s(-1);
                return;
            case 4:
                m7 m7Var2 = (m7) this.f18021b;
                ArrayList arrayList = (ArrayList) this.f18022c;
                System.currentTimeMillis();
                try {
                } catch (Exception e7) {
                    f8.g(e7, false);
                    if (i0.F1(e7)) {
                        LaunchActivity.D(1);
                    } else if (i0.G1(e7)) {
                        tz.h(m7Var2.L0);
                    }
                }
                if (m7Var2.S0 != null) {
                    int size = arrayList.size();
                    int i14 = (size * 16) + 4;
                    rf.x xVar = m7.l1;
                    if (xVar == null) {
                        m7.l1 = new rf.x(i14);
                    } else {
                        xVar.b();
                    }
                    m7.l1.c(size);
                    for (int i15 = 0; i15 < size; i15++) {
                        k7 k7Var = (k7) arrayList.get(i15);
                        m7.l1.d(k7Var.f16542a);
                        m7.l1.d(k7Var.f16543b);
                    }
                    synchronized (m7Var2) {
                        RandomAccessFile randomAccessFile = m7Var2.S0;
                        if (randomAccessFile != null) {
                            randomAccessFile.seek(0L);
                            m7Var2.S0.write(m7.l1.f46575a, 0, i14);
                            m7Var2.Y0 = false;
                            if (m7Var2.Z0) {
                                try {
                                    m7Var2.S0.getChannel().close();
                                } catch (Exception e10) {
                                    f8.g(e10, true);
                                }
                                m7Var2.S0.close();
                                m7Var2.S0 = null;
                            }
                            System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 5:
                b8 b8Var = (b8) this.f18021b;
                us[] usVarArr = (us[]) this.f18022c;
                b8Var.getNotificationCenter().n(usVarArr[0], 138);
                b8Var.getNotificationCenter().n(usVarArr[0], 139);
                return;
            case 6:
                b8 b8Var2 = (b8) this.f18021b;
                b8Var2.getDownloadController().H.removeAll((ArrayList) this.f18022c);
                b8Var2.getNotificationCenter().k(304, new Object[0]);
                return;
            case 7:
                m7 m7Var3 = (m7) ((b8) this.f18021b).f14746w.get(b8.r("mp4", (TLRPC.FileLocation) this.f18022c));
                if (m7Var3 != null) {
                    if (m7Var3.f16925y) {
                        m7Var3.q(false);
                    }
                    m7Var3.V0 = true;
                    m7Var3.W0 = Integer.MAX_VALUE;
                    ((ArrayList) m7Var3.f16884e1.d).remove(m7Var3);
                    m7Var3.f16884e1.a(m7Var3);
                    m7Var3.f16884e1.b(false);
                    return;
                }
                return;
            case 8:
                ((m7) this.f18021b).f16872a = true;
                ((bg.h) this.f18022c).b(false);
                return;
            case 9:
                String str3 = (String) this.f18021b;
                Throwable th2 = (Throwable) this.f18022c;
                try {
                    f8.j().f15525a.write(f8.j().f15526b.format(System.currentTimeMillis()) + " E/tmessages: " + str3 + "\n");
                    f8.j().f15525a.write(th2.toString());
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    while (i12 < stackTrace.length) {
                        f8.j().f15525a.write(f8.j().f15526b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i12] + "\n");
                        i12++;
                    }
                    f8.j().f15525a.flush();
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 10:
                k8 k8Var = (k8) this.f18021b;
                List list = (List) this.f18022c;
                k8Var.getClass();
                try {
                    k8Var.c();
                    k8Var.f16546c.beginTransaction();
                    while (i12 < list.size()) {
                        k8Var.f16546c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((sh.a) list.get(i12)).f48492a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                        i12++;
                    }
                } catch (Throwable th3) {
                    try {
                        f8.g(th3, true);
                    } finally {
                        k8Var.f16546c.commitTransaction();
                    }
                }
                return;
            case 11:
                ((w8) this.f18021b).getMessagesController().U3((TLRPC.User) this.f18022c, false, false);
                return;
            case 12:
                ((w8) this.f18021b).getMediaDataController().P1((TLRPC.TL_messages_stickerSet) this.f18022c);
                return;
            case 13:
                i0.g3(new t6(15, ((hc) this.f18021b).l(), (Runnable) this.f18022c));
                return;
            case 14:
                hc hcVar = (hc) this.f18021b;
                hcVar.B.add((yb) this.f18022c);
                hcVar.U(null, 0);
                return;
            case 15:
                Runnable runnable = (Runnable) this.f18022c;
                b8.K = (SparseArray) this.f18021b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                ub ubVar = (ub) this.f18021b;
                vb vbVar = ubVar.f18274a;
                hc hcVar2 = ubVar.e;
                cc ccVar = new cc(hcVar2, vbVar, (String) this.f18022c);
                vbVar.f18503t = ccVar;
                hcVar2.f15863n.add(ccVar);
                hcVar2.V(false);
                return;
            case 17:
                wb wbVar = (wb) this.f18021b;
                BitmapDrawable bitmapDrawable = (Drawable) this.f18022c;
                hc hcVar3 = wbVar.e;
                kb kbVar = hcVar3.e;
                vb vbVar2 = wbVar.f19079c;
                if (bitmapDrawable instanceof bi0) {
                    bi0 bi0Var = (bi0) bitmapDrawable;
                    Drawable drawable2 = (Drawable) kbVar.f(vbVar2.d);
                    if (drawable2 == null) {
                        kbVar.l(vbVar2.d, bi0Var);
                        drawable = bi0Var;
                    } else {
                        bi0Var.C(false);
                        drawable = drawable2;
                    }
                    hcVar3.H(vbVar2.d);
                    str = vbVar2.d;
                } else if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
                    org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) bitmapDrawable;
                    if (s5Var2.f30142n0) {
                        String str4 = vbVar2.d;
                        ThreadLocal threadLocal = hc.I;
                        BitmapDrawable y3 = hcVar3.y(str4);
                        if (y3 == null) {
                            kbVar.l(vbVar2.d, s5Var2);
                            s5Var = s5Var2;
                        } else {
                            s5Var2.u();
                            s5Var = y3;
                        }
                        hcVar3.H(vbVar2.d);
                        str = vbVar2.d;
                        drawable = s5Var;
                    }
                    String str5 = str2;
                    drawable = bitmapDrawable;
                    str = str5;
                } else if (bitmapDrawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) bitmapDrawable;
                    BitmapDrawable z13 = hcVar3.z(vbVar2.d);
                    if (z13 == null) {
                        if (vbVar2.d.endsWith("_f")) {
                            hcVar3.d.l(vbVar2.d, bitmapDrawable2);
                            z12 = false;
                            bitmapDrawable = bitmapDrawable2;
                        } else if (!vbVar2.d.endsWith("_isc") && !vbVar2.d.endsWith("_nocache") && bitmapDrawable2.getBitmap().getWidth() <= i0.f16025p * 80.0f && bitmapDrawable2.getBitmap().getHeight() <= i0.f16025p * 80.0f) {
                            hcVar3.f15854b.l(vbVar2.d, bitmapDrawable2);
                            bitmapDrawable = bitmapDrawable2;
                        } else {
                            bitmapDrawable = bitmapDrawable2;
                            if (!vbVar2.d.endsWith("_nocache")) {
                                hcVar3.f15855c.l(vbVar2.d, bitmapDrawable2);
                                bitmapDrawable = bitmapDrawable2;
                            }
                        }
                    } else {
                        i0.z2(bitmapDrawable2.getBitmap());
                        bitmapDrawable = z13;
                    }
                    if (z12) {
                        hcVar3.H(vbVar2.d);
                        str2 = vbVar2.d;
                    }
                    String str52 = str2;
                    drawable = bitmapDrawable;
                    str = str52;
                } else {
                    str = null;
                }
                hcVar3.f15868s.d(new mg(wbVar, drawable, str, 26), vbVar2.f18487a);
                return;
            case 18:
                ((gc) this.f18021b).d.v.remove((String) this.f18022c);
                return;
            case 19:
                String[] strArr = MediaController.U1;
                ((MediaController) this.f18021b).R((jj) this.f18022c, true);
                return;
            case 20:
                MediaController mediaController = (MediaController) this.f18021b;
                File file = (File) this.f18022c;
                String[] strArr2 = MediaController.U1;
                try {
                    int i16 = mediaController.f14461k0 + 1;
                    mediaController.f14461k0 = i16;
                    u61 u61Var = mediaController.f14459j0;
                    if (u61Var != null) {
                        u61Var.m0();
                    }
                    u61 u61Var2 = new u61(false, false);
                    mediaController.f14459j0 = u61Var2;
                    u61Var2.J = new c5.x(mediaController, i16, 13);
                    u61Var2.j0(Uri.fromFile(file), "other");
                    mediaController.f14459j0.x0(3);
                    mediaController.f14459j0.h0();
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    u61 u61Var3 = mediaController.f14459j0;
                    if (u61Var3 != null) {
                        u61Var3.m0();
                        mediaController.f14459j0 = null;
                        return;
                    }
                    return;
                }
            case 21:
                String[] strArr3 = MediaController.U1;
                b8.G(((c) this.f18021b).f14863a).X((TLRPC.TL_document) this.f18022c, null, 1, 1);
                return;
            case 22:
                ((MediaController) ((mg.c2) this.f18021b).f13086b).f14488w1.add((ByteBuffer) this.f18022c);
                return;
            case 23:
                ve veVar = (ve) this.f18021b;
                jj jjVar = (jj) this.f18022c;
                MediaController mediaController2 = (MediaController) veVar.f18517c;
                u61 u61Var4 = mediaController2.f14457i0;
                if ((u61Var4 != null || mediaController2.E0 != null) && !mediaController2.f14453g0) {
                    try {
                        u61 u61Var5 = mediaController2.E0;
                        if (u61Var5 != null) {
                            U = u61Var5.U();
                            S = ((MediaController) veVar.f18517c).E0.S();
                            if (S >= 0 && U > 0) {
                                float f11 = (float) U;
                                f10 = ((float) ((MediaController) veVar.f18517c).E0.J()) / f11;
                                f7 = ((float) S) / f11;
                                if (f7 >= 1.0f) {
                                    return;
                                }
                            }
                            return;
                        }
                        U = u61Var4.U();
                        S = ((MediaController) veVar.f18517c).f14457i0.S();
                        if (U >= 0) {
                            f7 = ((float) S) / ((float) U);
                        } else {
                            f7 = 0.0f;
                        }
                        float J = ((float) ((MediaController) veVar.f18517c).f14457i0.J()) / ((float) U);
                        if (U != -9223372036854775807L && S >= 0 && ((MediaController) veVar.f18517c).f14480t0 == 0.0f) {
                            f10 = J;
                        }
                        return;
                        MediaController mediaController3 = (MediaController) veVar.f18517c;
                        jjVar.f16326h0 = (int) (U / 1000);
                        jjVar.f16299b0 = f7;
                        jjVar.f16322g0 = (int) (S / 1000);
                        jjVar.f16312e0 = f10;
                        if (f7 >= 0.0f && mediaController3.f14466n0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController4 = (MediaController) veVar.f18517c;
                            if (elapsedRealtime - mediaController4.f14468o0 >= 1000) {
                                String str6 = mediaController4.f14466n0;
                                mediaController4.f14468o0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new ue(str6, 0, f7));
                            }
                        }
                        zs.f(jjVar.I1).k(148, Integer.valueOf(jjVar.f1()), Float.valueOf(f7));
                        return;
                    } catch (Exception e13) {
                        f8.g(e13, true);
                        return;
                    }
                }
                return;
            case 24:
                cf cfVar = (cf) this.f18021b;
                jj jjVar2 = (jj) this.f18022c;
                TLRPC.Document F0 = jjVar2.F0();
                TLRPC.Document document = jjVar2.f16297a3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    cfVar.d.put(b8.r(null, F0), jjVar2);
                    b8 G = b8.G(cfVar.f15011a.f14863a);
                    if (!jj.Q5(jjVar2.f16337k)) {
                        i11 = 0;
                    }
                    G.X(F0, jjVar2, 3, i11);
                    return;
                }
                return;
            case 25:
                ui uiVar = (ui) this.f18021b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.f18022c;
                try {
                    uiVar.getMessagesStorage().f15940b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    uiVar.getMessagesStorage().f15940b.beginTransaction();
                    uiVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().f15940b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
                    for (int i17 = 0; i17 < tL_contacts_topPeers.categories.size(); i17++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i17);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                            i10 = 1;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            i10 = 2;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            i10 = 3;
                        } else {
                            i10 = 0;
                        }
                        for (int i18 = 0; i18 < tL_topPeerCategoryPeers.peers.size(); i18++) {
                            TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i18);
                            executeFast.requery();
                            executeFast.bindLong(1, jj.C1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i10);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    uiVar.getMessagesStorage().f15940b.commitTransaction();
                    i0.g3(new eg(uiVar, 6));
                    return;
                } catch (Exception e14) {
                    f8.g(e14, true);
                    return;
                }
            case 26:
                boolean[] zArr2 = (boolean[]) this.f18021b;
                kh khVar = (kh) this.f18022c;
                if (!zArr2[0]) {
                    khVar.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 27:
                ui uiVar2 = (ui) this.f18021b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.f18022c;
                try {
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().f15940b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.f19820id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        uiVar2.L0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        i0.g3(new ag(uiVar2, tL_messages_stickerSet, 1));
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    f8.g(th4, true);
                    return;
                }
            case 28:
                q20 q20Var = (q20) this.f18021b;
                ArrayList arrayList2 = (ArrayList) this.f18022c;
                if (q20Var != null) {
                    q20Var.a(arrayList2);
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f18022c;
                if (((AtomicInteger) this.f18021b).decrementAndGet() == 0 && runnable2 != null) {
                    i0.g3(runnable2);
                    return;
                }
                return;
        }
    }
}
