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
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.LaunchActivity;
public final class t6 implements Runnable {
    public final int f18221a;
    public final Object f18222b;
    public final Object f18223c;

    public t6(int i10, Object obj, Object obj2) {
        this.f18221a = i10;
        this.f18222b = obj;
        this.f18223c = obj2;
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
        switch (this.f18221a) {
            case 0:
                ((l10) this.f18222b).a((ArrayList) this.f18223c);
                return;
            case 1:
                wp.r1(((a7) this.f18222b).f14575a).L3((TLRPC.Updates) ((TLObject) this.f18223c), false);
                return;
            case 2:
                is isVar = (is) this.f18222b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.f18223c;
                try {
                    try {
                        sQLitePreparedStatement = isVar.f16333b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
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
                m7 m7Var = (m7) this.f18222b;
                boolean[] zArr = (boolean[]) this.f18223c;
                if (m7Var.f17095y && zArr[0]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i13 = m7Var.J;
                if (i13 > 0 && m7Var.f17043a0 >= i13 && m7Var.f17066j && m7Var.W0 < 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j10 = m7Var.f17046b0;
                if (j10 != 0 && (z10 || m7Var.f17043a0 == j10 || z11)) {
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
                m7 m7Var2 = (m7) this.f18222b;
                ArrayList arrayList = (ArrayList) this.f18223c;
                System.currentTimeMillis();
                try {
                } catch (Exception e7) {
                    f8.g(e7, false);
                    if (i0.F1(e7)) {
                        LaunchActivity.D(1);
                    } else if (i0.G1(e7)) {
                        uz.h(m7Var2.L0);
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
                        m7.l1.d(k7Var.f16576a);
                        m7.l1.d(k7Var.f16577b);
                    }
                    synchronized (m7Var2) {
                        RandomAccessFile randomAccessFile = m7Var2.S0;
                        if (randomAccessFile != null) {
                            randomAccessFile.seek(0L);
                            m7Var2.S0.write(m7.l1.f46586a, 0, i14);
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
                b8 b8Var = (b8) this.f18222b;
                vs[] vsVarArr = (vs[]) this.f18223c;
                b8Var.getNotificationCenter().n(vsVarArr[0], 138);
                b8Var.getNotificationCenter().n(vsVarArr[0], 139);
                return;
            case 6:
                b8 b8Var2 = (b8) this.f18222b;
                b8Var2.getDownloadController().H.removeAll((ArrayList) this.f18223c);
                b8Var2.getNotificationCenter().k(304, new Object[0]);
                return;
            case 7:
                m7 m7Var3 = (m7) ((b8) this.f18222b).f14946w.get(b8.r("mp4", (TLRPC.FileLocation) this.f18223c));
                if (m7Var3 != null) {
                    if (m7Var3.f17095y) {
                        m7Var3.q(false);
                    }
                    m7Var3.V0 = true;
                    m7Var3.W0 = Integer.MAX_VALUE;
                    ((ArrayList) m7Var3.f17054e1.d).remove(m7Var3);
                    m7Var3.f17054e1.a(m7Var3);
                    m7Var3.f17054e1.b(false);
                    return;
                }
                return;
            case 8:
                ((m7) this.f18222b).f17042a = true;
                ((bg.h) this.f18223c).b(false);
                return;
            case 9:
                String str3 = (String) this.f18222b;
                Throwable th2 = (Throwable) this.f18223c;
                try {
                    f8.j().f15709a.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: " + str3 + "\n");
                    f8.j().f15709a.write(th2.toString());
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    while (i12 < stackTrace.length) {
                        f8.j().f15709a.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i12] + "\n");
                        i12++;
                    }
                    f8.j().f15709a.flush();
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 10:
                k8 k8Var = (k8) this.f18222b;
                List list = (List) this.f18223c;
                k8Var.getClass();
                try {
                    k8Var.c();
                    k8Var.f16580c.beginTransaction();
                    while (i12 < list.size()) {
                        k8Var.f16580c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((sh.a) list.get(i12)).f48503a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                        i12++;
                    }
                } catch (Throwable th3) {
                    try {
                        f8.g(th3, true);
                    } finally {
                        k8Var.f16580c.commitTransaction();
                    }
                }
                return;
            case 11:
                ((w8) this.f18222b).getMessagesController().U3((TLRPC.User) this.f18223c, false, false);
                return;
            case 12:
                ((w8) this.f18222b).getMediaDataController().P1((TLRPC.TL_messages_stickerSet) this.f18223c);
                return;
            case 13:
                i0.g3(new t6(15, ((ic) this.f18222b).l(), (Runnable) this.f18223c));
                return;
            case 14:
                ic icVar = (ic) this.f18222b;
                icVar.B.add((zb) this.f18223c);
                icVar.U(null, 0);
                return;
            case 15:
                Runnable runnable = (Runnable) this.f18223c;
                b8.K = (SparseArray) this.f18222b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                vb vbVar = (vb) this.f18222b;
                wb wbVar = vbVar.f18603a;
                ic icVar2 = vbVar.e;
                dc dcVar = new dc(icVar2, wbVar, (String) this.f18223c);
                wbVar.f19025t = dcVar;
                icVar2.f16256n.add(dcVar);
                icVar2.V(false);
                return;
            case 17:
                xb xbVar = (xb) this.f18222b;
                BitmapDrawable bitmapDrawable = (Drawable) this.f18223c;
                ic icVar3 = xbVar.e;
                lb lbVar = icVar3.e;
                wb wbVar2 = xbVar.f19422c;
                if (bitmapDrawable instanceof ci0) {
                    ci0 ci0Var = (ci0) bitmapDrawable;
                    Drawable drawable2 = (Drawable) lbVar.f(wbVar2.d);
                    if (drawable2 == null) {
                        lbVar.l(wbVar2.d, ci0Var);
                        drawable = ci0Var;
                    } else {
                        ci0Var.C(false);
                        drawable = drawable2;
                    }
                    icVar3.H(wbVar2.d);
                    str = wbVar2.d;
                } else if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
                    org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) bitmapDrawable;
                    if (s5Var2.f30195n0) {
                        String str4 = wbVar2.d;
                        ThreadLocal threadLocal = ic.I;
                        BitmapDrawable y3 = icVar3.y(str4);
                        if (y3 == null) {
                            lbVar.l(wbVar2.d, s5Var2);
                            s5Var = s5Var2;
                        } else {
                            s5Var2.u();
                            s5Var = y3;
                        }
                        icVar3.H(wbVar2.d);
                        str = wbVar2.d;
                        drawable = s5Var;
                    }
                    String str5 = str2;
                    drawable = bitmapDrawable;
                    str = str5;
                } else if (bitmapDrawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) bitmapDrawable;
                    BitmapDrawable z13 = icVar3.z(wbVar2.d);
                    if (z13 == null) {
                        if (wbVar2.d.endsWith("_f")) {
                            icVar3.d.l(wbVar2.d, bitmapDrawable2);
                            z12 = false;
                            bitmapDrawable = bitmapDrawable2;
                        } else if (!wbVar2.d.endsWith("_isc") && !wbVar2.d.endsWith("_nocache") && bitmapDrawable2.getBitmap().getWidth() <= i0.f16171p * 80.0f && bitmapDrawable2.getBitmap().getHeight() <= i0.f16171p * 80.0f) {
                            icVar3.f16247b.l(wbVar2.d, bitmapDrawable2);
                            bitmapDrawable = bitmapDrawable2;
                        } else {
                            bitmapDrawable = bitmapDrawable2;
                            if (!wbVar2.d.endsWith("_nocache")) {
                                icVar3.f16248c.l(wbVar2.d, bitmapDrawable2);
                                bitmapDrawable = bitmapDrawable2;
                            }
                        }
                    } else {
                        i0.z2(bitmapDrawable2.getBitmap());
                        bitmapDrawable = z13;
                    }
                    if (z12) {
                        icVar3.H(wbVar2.d);
                        str2 = wbVar2.d;
                    }
                    String str52 = str2;
                    drawable = bitmapDrawable;
                    str = str52;
                } else {
                    str = null;
                }
                icVar3.f16261s.d(new ng(xbVar, drawable, str, 26), wbVar2.f19009a);
                return;
            case 18:
                ((hc) this.f18222b).d.v.remove((String) this.f18223c);
                return;
            case 19:
                String[] strArr = MediaController.U1;
                ((MediaController) this.f18222b).R((kj) this.f18223c, true);
                return;
            case 20:
                MediaController mediaController = (MediaController) this.f18222b;
                File file = (File) this.f18223c;
                String[] strArr2 = MediaController.U1;
                try {
                    int i16 = mediaController.f14462k0 + 1;
                    mediaController.f14462k0 = i16;
                    v61 v61Var = mediaController.f14460j0;
                    if (v61Var != null) {
                        v61Var.m0();
                    }
                    v61 v61Var2 = new v61(false, false);
                    mediaController.f14460j0 = v61Var2;
                    v61Var2.J = new c5.x(mediaController, i16, 13);
                    v61Var2.j0(Uri.fromFile(file), "other");
                    mediaController.f14460j0.x0(3);
                    mediaController.f14460j0.h0();
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    v61 v61Var3 = mediaController.f14460j0;
                    if (v61Var3 != null) {
                        v61Var3.m0();
                        mediaController.f14460j0 = null;
                        return;
                    }
                    return;
                }
            case 21:
                String[] strArr3 = MediaController.U1;
                b8.G(((c) this.f18222b).f15043a).X((TLRPC.TL_document) this.f18223c, null, 1, 1);
                return;
            case 22:
                ((MediaController) ((mg.c2) this.f18222b).f13087b).f14489w1.add((ByteBuffer) this.f18223c);
                return;
            case 23:
                we weVar = (we) this.f18222b;
                kj kjVar = (kj) this.f18223c;
                MediaController mediaController2 = (MediaController) weVar.f19039c;
                v61 v61Var4 = mediaController2.f14458i0;
                if ((v61Var4 != null || mediaController2.E0 != null) && !mediaController2.f14454g0) {
                    try {
                        v61 v61Var5 = mediaController2.E0;
                        if (v61Var5 != null) {
                            U = v61Var5.U();
                            S = ((MediaController) weVar.f19039c).E0.S();
                            if (S >= 0 && U > 0) {
                                float f11 = (float) U;
                                f10 = ((float) ((MediaController) weVar.f19039c).E0.J()) / f11;
                                f7 = ((float) S) / f11;
                                if (f7 >= 1.0f) {
                                    return;
                                }
                            }
                            return;
                        }
                        U = v61Var4.U();
                        S = ((MediaController) weVar.f19039c).f14458i0.S();
                        if (U >= 0) {
                            f7 = ((float) S) / ((float) U);
                        } else {
                            f7 = 0.0f;
                        }
                        float J = ((float) ((MediaController) weVar.f19039c).f14458i0.J()) / ((float) U);
                        if (U != -9223372036854775807L && S >= 0 && ((MediaController) weVar.f19039c).f14481t0 == 0.0f) {
                            f10 = J;
                        }
                        return;
                        MediaController mediaController3 = (MediaController) weVar.f19039c;
                        kjVar.f16679h0 = (int) (U / 1000);
                        kjVar.f16652b0 = f7;
                        kjVar.f16675g0 = (int) (S / 1000);
                        kjVar.f16665e0 = f10;
                        if (f7 >= 0.0f && mediaController3.f14467n0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController4 = (MediaController) weVar.f19039c;
                            if (elapsedRealtime - mediaController4.f14469o0 >= 1000) {
                                String str6 = mediaController4.f14467n0;
                                mediaController4.f14469o0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new ve(str6, 0, f7));
                            }
                        }
                        at.f(kjVar.I1).k(148, Integer.valueOf(kjVar.f1()), Float.valueOf(f7));
                        return;
                    } catch (Exception e13) {
                        f8.g(e13, true);
                        return;
                    }
                }
                return;
            case 24:
                df dfVar = (df) this.f18222b;
                kj kjVar2 = (kj) this.f18223c;
                TLRPC.Document F0 = kjVar2.F0();
                TLRPC.Document document = kjVar2.f16650a3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    dfVar.d.put(b8.r(null, F0), kjVar2);
                    b8 G = b8.G(dfVar.f15373a.f15043a);
                    if (!kj.Q5(kjVar2.f16690k)) {
                        i11 = 0;
                    }
                    G.X(F0, kjVar2, 3, i11);
                    return;
                }
                return;
            case 25:
                vi viVar = (vi) this.f18222b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.f18223c;
                try {
                    viVar.getMessagesStorage().f16333b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    viVar.getMessagesStorage().f16333b.beginTransaction();
                    viVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = viVar.getMessagesStorage().f16333b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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
                            executeFast.bindLong(1, kj.C1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i10);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    viVar.getMessagesStorage().f16333b.commitTransaction();
                    i0.g3(new fg(viVar, 6));
                    return;
                } catch (Exception e14) {
                    f8.g(e14, true);
                    return;
                }
            case 26:
                boolean[] zArr2 = (boolean[]) this.f18222b;
                lh lhVar = (lh) this.f18223c;
                if (!zArr2[0]) {
                    lhVar.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 27:
                vi viVar2 = (vi) this.f18222b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.f18223c;
                try {
                    SQLiteCursor queryFinalized = viVar2.getMessagesStorage().f16333b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.f19821id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        viVar2.L0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        i0.g3(new bg(viVar2, tL_messages_stickerSet, 1));
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    f8.g(th4, true);
                    return;
                }
            case 28:
                r20 r20Var = (r20) this.f18222b;
                ArrayList arrayList2 = (ArrayList) this.f18223c;
                if (r20Var != null) {
                    r20Var.a(arrayList2);
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f18223c;
                if (((AtomicInteger) this.f18222b).decrementAndGet() == 0 && runnable2 != null) {
                    i0.g3(runnable2);
                    return;
                }
                return;
        }
    }
}
