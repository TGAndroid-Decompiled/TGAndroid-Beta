package defpackage;

import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.View;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.EglRenderer;
public final class eu3 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public eu3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        int i;
        long j;
        boolean z;
        ?? r3;
        ?? r7;
        boolean z2;
        ?? r0;
        ?? r32;
        int i2 = -1;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = true;
        switch (this.a) {
            case 0:
                EglRenderer.i((EglRenderer) this.b, (Looper) this.c);
                return;
            case 1:
                zu3 zu3Var = (zu3) this.b;
                mu1 mu1Var = zu3Var.a;
                u0b u0bVar = new u0b(mu1Var.getParentActivity(), zu3Var.a, k27.j1(((k27) this.c).k), null, mu1Var.a0, mu1Var.getResourceProvider());
                boolean Q7 = mu1Var.Q7();
                u0bVar.i0 = Q7;
                u0bVar.n = Q7;
                mu1Var.showDialog(u0bVar);
                return;
            case 2:
                lv3 lv3Var = (lv3) this.b;
                TLObject tLObject = (TLObject) this.c;
                nv3 nv3Var = lv3Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ew3 ew3Var = nv3Var.r;
                    int i4 = ew3.C1;
                    na7.q1(ew3Var.a).b4(tL_contacts_resolvedPeer.users, false);
                    na7.q1(ew3Var.a).V3(tL_contacts_resolvedPeer.chats, false);
                    ad7.Y(ew3Var.a).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                lv3Var.n = true;
                lv3Var.F();
                return;
            case 3:
                na7.q1(((ax3) this.b).a.a).n5((TLRPC.EmojiStatus) this.c, null);
                return;
            case 4:
                na7.q1(((pz3) this.b).a.d1).n5((TLRPC.EmojiStatus) this.c, null);
                return;
            case 5:
                TLObject tLObject2 = (TLObject) this.c;
                int i5 = ((pz3) this.b).a.d1;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    hq6.d0(i5).L1(tL_messages_stickerSet, true);
                    hq6.d0(i5).S1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 6:
                l04 l04Var = (l04) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.c;
                l04Var.x.f = true;
                ArrayList arrayList = l04Var.H.q1;
                if (!arrayList.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                l04Var.a(true);
                return;
            case 7:
                final s04 s04Var = (s04) this.b;
                final String str = (String) this.c;
                String[] F0 = gl.F0();
                t14 t14Var = s04Var.a.G;
                if (!Arrays.equals(t14Var.X0, F0)) {
                    hq6.d0(t14Var.d1).O(F0, false);
                }
                t14Var.X0 = F0;
                ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                Utilities.u(0, new p8c() {
                    @Override
                    public final void a(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList5;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList6;
                        byte b = r4;
                        ArrayList arrayList7 = arrayList4;
                        String str2 = str;
                        s04 s04Var2 = s04Var;
                        Runnable runnable = (Runnable) obj;
                        switch (b) {
                            case 0:
                                hq6.d0(s04Var2.a.G.d1).a2(true, str2, new ht(s04Var2, arrayList7, runnable, (byte) 15));
                                return;
                            default:
                                t14 t14Var2 = s04Var2.a.G;
                                if (gba.E || y6c.h(t14Var2.d1).p()) {
                                    String I3 = gl.I3((str2 + "").toLowerCase());
                                    int i6 = t14Var2.d1;
                                    ArrayList t0 = hq6.d0(t14Var2.d1).t0(5);
                                    HashSet hashSet = new HashSet();
                                    if (t0 != null) {
                                        for (int i7 = 0; i7 < t0.size(); i7++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i7);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList6 = tL_messages_stickerSet3.documents) != null && !arrayList6.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String I32 = gl.I3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                                    arrayList7.add(new m04(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList8 = hq6.d0(i6).t0[1];
                                    if (arrayList8 != null) {
                                        for (int i8 = 0; i8 < arrayList8.size(); i8++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i8);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String I33 = gl.I3(stickerSetCovered.set.title.toLowerCase());
                                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList5 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet m0 = hq6.d0(i6).m0(hq6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (m0 != null) {
                                                            arrayList5 = m0.documents;
                                                        } else {
                                                            arrayList5 = null;
                                                        }
                                                    } else {
                                                        arrayList5 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                                        arrayList7.add(new m04(stickerSetCovered, arrayList5));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                return;
                        }
                    }
                }, new pz1(s04Var, str, (byte) 17), new p8c() {
                    @Override
                    public final void a(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList5;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList6;
                        byte b = r4;
                        ArrayList arrayList7 = arrayList3;
                        String str2 = str;
                        s04 s04Var2 = s04Var;
                        Runnable runnable = (Runnable) obj;
                        switch (b) {
                            case 0:
                                hq6.d0(s04Var2.a.G.d1).a2(true, str2, new ht(s04Var2, arrayList7, runnable, (byte) 15));
                                return;
                            default:
                                t14 t14Var2 = s04Var2.a.G;
                                if (gba.E || y6c.h(t14Var2.d1).p()) {
                                    String I3 = gl.I3((str2 + "").toLowerCase());
                                    int i6 = t14Var2.d1;
                                    ArrayList t0 = hq6.d0(t14Var2.d1).t0(5);
                                    HashSet hashSet = new HashSet();
                                    if (t0 != null) {
                                        for (int i7 = 0; i7 < t0.size(); i7++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i7);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList6 = tL_messages_stickerSet3.documents) != null && !arrayList6.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String I32 = gl.I3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                                    arrayList7.add(new m04(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList8 = hq6.d0(i6).t0[1];
                                    if (arrayList8 != null) {
                                        for (int i8 = 0; i8 < arrayList8.size(); i8++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i8);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String I33 = gl.I3(stickerSetCovered.set.title.toLowerCase());
                                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList5 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet m0 = hq6.d0(i6).m0(hq6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (m0 != null) {
                                                            arrayList5 = m0.documents;
                                                        } else {
                                                            arrayList5 = null;
                                                        }
                                                    } else {
                                                        arrayList5 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                                        arrayList7.add(new m04(stickerSetCovered, arrayList5));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                return;
                        }
                    }
                }, new pz1(s04Var, arrayList2, (byte) 18), new yt0(s04Var, str, arrayList2, arrayList3, arrayList4));
                return;
            case 8:
                ArrayList arrayList5 = (ArrayList) this.c;
                t04 t04Var = ((s04) this.b).a;
                t04Var.G.W.d(false);
                ArrayList arrayList6 = t04Var.r;
                if (arrayList6.size() >= arrayList5.size()) {
                    z3 = true;
                }
                t04Var.F = z3;
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                t04Var.f();
                return;
            case 9:
                ((y04) this.b).F((String) this.c, "", true, false, false);
                return;
            case 10:
                y04 y04Var = (y04) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i6 = y04Var.M.d1;
                na7.q1(i6).b4(tL_contacts_resolvedPeer2.users, false);
                na7.q1(i6).V3(tL_contacts_resolvedPeer2.chats, false);
                ad7.Y(i6).j1(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                String str2 = y04Var.x;
                y04Var.x = null;
                y04Var.F(str2, "", false, false, false);
                return;
            case 11:
                ((w24) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                return;
            case 12:
                y54 y54Var = (y54) this.b;
                f64 f64Var = (f64) this.c;
                int i7 = y54Var.J - f64Var.c;
                y54Var.J = i7;
                if (f64Var.d) {
                    y54Var.K = f64Var.e;
                    y54Var.L = true;
                }
                if (i7 == 0) {
                    aob aobVar = f64Var.b.a;
                    if (!y54Var.p0.a.p() && aobVar.p()) {
                        y54Var.q0 = -1;
                        y54Var.r0 = 0L;
                    }
                    if (!aobVar.p()) {
                        List asList = Arrays.asList(((dd8) aobVar).k);
                        if (asList.size() == y54Var.p.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        gre.p(z2);
                        for (int i8 = 0; i8 < asList.size(); i8++) {
                            ((v54) y54Var.p.get(i8)).c = (aob) asList.get(i8);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (y54Var.L) {
                        if (f64Var.b.a.p() && y54Var.p0.a.p()) {
                            r3 = true;
                        } else {
                            r3 = false;
                        }
                        boolean b = f64Var.b.b.b(y54Var.p0.b);
                        if (f64Var.b.d == y54Var.p0.s) {
                            r7 = true;
                        } else {
                            r7 = false;
                        }
                        if (r3 != false || (b && r7 != false)) {
                            z4 = false;
                        }
                        if (z4) {
                            i2 = y54Var.l0();
                            if (!aobVar.p() && !f64Var.b.b.c()) {
                                yb8 yb8Var = f64Var.b;
                                rx6 rx6Var = yb8Var.b;
                                long j3 = yb8Var.d;
                                Object obj = rx6Var.a;
                                xnb xnbVar = y54Var.o;
                                aobVar.g(obj, xnbVar);
                                j2 = j3 + xnbVar.e;
                            } else {
                                j2 = f64Var.b.d;
                            }
                        }
                        i = i2;
                        j = j2;
                        z = z4;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = false;
                    }
                    y54Var.L = false;
                    y54Var.w1(f64Var.b, 1, z, y54Var.K, j, i, false);
                    return;
                }
                return;
            case 13:
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList7 = ((t54) this.b).a.t0;
                int size = arrayList7.size();
                while (i3 < size) {
                    Object obj2 = arrayList7.get(i3);
                    i3++;
                    ((lbc) ((cbc) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 14:
                ((s0c) this.b).a((ArrayList) this.c);
                return;
            case 15:
                na7.q1(((v74) this.b).a).R3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 16:
                ad7 ad7Var = (ad7) this.b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.c;
                try {
                    try {
                        sQLitePreparedStatement = ad7Var.b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                        tL_factCheck.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                        sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Throwable th) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            case 17:
                ((e84) this.b).a((Intent) this.c);
                return;
            case 18:
                l94 l94Var = (l94) this.b;
                boolean[] zArr = (boolean[]) this.c;
                if (l94Var.y && zArr[0]) {
                    r0 = true;
                } else {
                    r0 = false;
                }
                int i9 = l94Var.J;
                if (i9 > 0 && l94Var.a0 >= i9 && l94Var.j && l94Var.W0 < 3) {
                    r32 = true;
                } else {
                    r32 = false;
                }
                long j4 = l94Var.b0;
                if (j4 != 0 && (r0 != false || l94Var.a0 == j4 || r32 != false)) {
                    try {
                        l94Var.i(1, false, true);
                        return;
                    } catch (Exception unused) {
                        l94Var.h(0, true);
                        return;
                    }
                }
                l94Var.q(-1);
                return;
            case 19:
                l94 l94Var2 = (l94) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                System.currentTimeMillis();
                try {
                } catch (Exception e2) {
                    fa4.g(e2, false);
                    if (gl.D1(e2)) {
                        LaunchActivity.E(1);
                    } else if (gl.E1(e2)) {
                        gba.h(l94Var2.L0);
                    }
                }
                if (l94Var2.S0 != null) {
                    int size2 = arrayList8.size();
                    int i10 = (size2 << 4) + 4;
                    dm5 dm5Var = l94.l1;
                    if (dm5Var == null) {
                        l94.l1 = new dm5(i10);
                    } else {
                        dm5Var.b();
                    }
                    l94.l1.c(size2);
                    for (int i11 = 0; i11 < size2; i11++) {
                        j94 j94Var = (j94) arrayList8.get(i11);
                        l94.l1.d(j94Var.a);
                        l94.l1.d(j94Var.b);
                    }
                    synchronized (l94Var2) {
                        RandomAccessFile randomAccessFile = l94Var2.S0;
                        if (randomAccessFile != null) {
                            randomAccessFile.seek(0L);
                            l94Var2.S0.write(l94.l1.a, 0, i10);
                            l94Var2.Y0 = false;
                            if (l94Var2.Z0) {
                                try {
                                    l94Var2.S0.getChannel().close();
                                } catch (Exception e3) {
                                    fa4.g(e3, true);
                                }
                                l94Var2.S0.close();
                                l94Var2.S0 = null;
                            }
                            System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 20:
                ba4 ba4Var = (ba4) this.b;
                gk7[] gk7VarArr = (gk7[]) this.c;
                ba4Var.getNotificationCenter().n(gk7VarArr[0], 138);
                ba4Var.getNotificationCenter().n(gk7VarArr[0], 139);
                return;
            case 21:
                ba4 ba4Var2 = (ba4) this.b;
                ba4Var2.getDownloadController().I.removeAll((ArrayList) this.c);
                ba4Var2.getNotificationCenter().k(307, new Object[0]);
                return;
            case 22:
                l94 l94Var3 = (l94) ((ba4) this.b).w.get(ba4.r("mp4", (TLRPC.TL_fileLocationToBeDeprecated) this.c));
                if (l94Var3 != null) {
                    if (l94Var3.y) {
                        l94Var3.o(false);
                    }
                    l94Var3.V0 = true;
                    l94Var3.W0 = Integer.MAX_VALUE;
                    ((ArrayList) l94Var3.e1.d).remove(l94Var3);
                    l94Var3.e1.a(l94Var3);
                    l94Var3.e1.b(false);
                    return;
                }
                return;
            case 23:
                ((l94) this.b).a = true;
                ((u20) this.c).b(false);
                return;
            case 24:
                String str3 = (String) this.b;
                Throwable th2 = (Throwable) this.c;
                try {
                    fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str3 + "\n");
                    fa4.j().a.write(th2.toString());
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    for (int i12 = 0; i12 < stackTrace.length; i12++) {
                        fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i12] + "\n");
                    }
                    fa4.j().a.flush();
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            case 25:
                la4 la4Var = (la4) this.b;
                List list = (List) this.c;
                la4Var.getClass();
                try {
                    la4Var.c();
                    la4Var.c.beginTransaction();
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        la4Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((u61) list.get(i13)).a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 26:
                ((ab4) this.b).getMessagesController().a4((TLRPC.User) this.c, false, false);
                return;
            case 27:
                ((ab4) this.b).getMediaDataController().S1((TLRPC.TL_messages_stickerSet) this.c);
                return;
            case 28:
                ((hd) this.c).dismiss();
                mc4 mc4Var = ((kc4) this.b).F.c;
                p8c p8cVar = mc4Var.x;
                if (p8cVar != null) {
                    p8cVar.a(mc4Var.d);
                }
                mc4Var.finishFragment();
                return;
            default:
                ?? r1 = (pd4) this.b;
                mc4 mc4Var2 = new mc4(r1.r, ((gd4) this.c).m);
                mc4Var2.y = new rc4(r1, (byte) 1);
                mc4Var2.x = new rc4(r1, (byte) 2);
                r1.presentFragment(mc4Var2);
                return;
        }
    }
}
