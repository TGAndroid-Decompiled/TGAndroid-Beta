package l2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import hi.l3;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hb;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.pb;
import org.telegram.messenger.si;
import org.telegram.messenger.vo;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.u11;
import org.telegram.ui.an;
import org.telegram.ui.el;
import org.telegram.ui.jl;
import org.telegram.ui.lm;
import org.telegram.ui.uw;
import org.telegram.ui.ww;
import org.telegram.ui.xw;
import org.telegram.ui.yw;
public final class x implements Runnable {
    public final int f19226a;
    public final int f19227b;
    public final int f19228c;
    public final Object d;
    public final Object f19229e;

    public x(int i7, int i10, String str, String str2) {
        this.f19226a = 9;
        this.f19227b = i7;
        this.d = str;
        this.f19229e = str2;
        this.f19228c = i10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int[] iArr;
        l3 l3Var;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14 = this.f19226a;
        int i15 = 0;
        int i16 = this.f19227b;
        int i17 = this.f19228c;
        Object obj = this.f19229e;
        Object obj2 = this.d;
        switch (i14) {
            case 0:
                f0 f0Var = ((z) obj2).f19233a;
                Surface surface = new Surface((SurfaceTexture) obj);
                f0Var.x1(surface);
                f0Var.U = surface;
                f0Var.q1(i16, i17);
                return;
            case 1:
                String str = (String) obj;
                fc fcVar = ((pb) obj2).f25921b;
                if (i16 != 1) {
                    fcVar.f23479s.c(new hb(fcVar, str, 1));
                }
                ns.f(i17).k(143, str, Integer.valueOf(i16));
                return;
            case 2:
                ((si) obj2).x1((List) obj, i16, i17, true);
                return;
            case 3:
                si siVar = (si) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        siVar.getMessagesStorage().f27221b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = siVar.getMessagesStorage().f27221b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                        executeFast.requery();
                        int i18 = 4;
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            i18 += ((TLRPC.TL_availableReaction) arrayList.get(i19)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i18);
                        nativeByteBuffer.writeInt32(arrayList.size());
                        while (i15 < arrayList.size()) {
                            ((TLRPC.TL_availableReaction) arrayList.get(i15)).serializeToStream(nativeByteBuffer);
                            i15++;
                        }
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i16);
                        executeFast.bindInteger(3, i17);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast2 = siVar.getMessagesStorage().f27221b.executeFast("UPDATE reactions SET date = ?");
                    executeFast2.requery();
                    executeFast2.bindLong(1, i17);
                    executeFast2.step();
                    executeFast2.dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 4:
                np npVar = (np) obj2;
                npVar.f25390s1.clear();
                npVar.f25435x1.clear();
                vr messagesStorage = npVar.getMessagesStorage();
                messagesStorage.H();
                npVar.q4(true, messagesStorage.f27232w, ((TLRPC.updates_Difference) obj).pts, this.f19227b, this.f19228c);
                npVar.P1().q();
                return;
            case 5:
                vo voVar = (vo) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                voVar.h.Y3(photos_photos.users, false);
                voVar.d(i16, i17, photos_photos);
                return;
            case 6:
                vo voVar2 = (vo) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                np npVar2 = voVar2.h;
                npVar2.Y3(messages_messages.users, false);
                npVar2.S3(messages_messages.chats, false);
                TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
                tL_photos_photos.count = messages_messages.count;
                int i20 = 0;
                while (i15 < messages_messages.messages.size()) {
                    TLRPC.MessageAction messageAction = messages_messages.messages.get(i15).action;
                    if (messageAction != null) {
                        TLRPC.Photo photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            tL_photos_photos.photos.add(photo);
                            i15++;
                        }
                    }
                    i20++;
                    i15++;
                }
                if (i16 == 0 && messages_messages.messages.size() >= messages_messages.count) {
                    tL_photos_photos.count -= i20;
                }
                voVar2.d(i16, i17, tL_photos_photos);
                return;
            case 7:
                vr vrVar = (vr) obj2;
                byte[] bArr = (byte[]) obj;
                vrVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = vrVar.f27221b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
                    executeFast3.bindInteger(1, i16);
                    executeFast3.bindInteger(2, i17);
                    if (bArr != null) {
                        i7 = bArr.length;
                    } else {
                        i7 = 1;
                    }
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i7);
                    if (bArr != null) {
                        nativeByteBuffer2.writeBytes(bArr);
                    }
                    executeFast3.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast3.step();
                    executeFast3.dispose();
                    nativeByteBuffer2.reuse();
                    return;
                } catch (Exception e11) {
                    vrVar.o(e11, true);
                    return;
                }
            case 8:
                ns nsVar = (ns) obj2;
                nsVar.l((Object[]) obj, i16, false);
                nsVar.f25635q.remove(i17);
                return;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i16, (String) obj2, (String) obj, i17);
                return;
            case 10:
                ((an) obj2).didReceivedNotification(i16, i17, (Object[]) obj);
                return;
            case 11:
                el elVar = (el) obj2;
                elVar.getClass();
                gj messageObject = ((org.telegram.ui.Cells.t0) obj).getMessageObject();
                jl jlVar = elVar.f46852a;
                an anVar = jlVar.R;
                int e12 = messageObject.e1();
                if (gj.B0(messageObject.f23819k) == jlVar.R.f45153c7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                anVar.Bb(this.f19227b, e12, true, i10, true, 0, Integer.valueOf(i17), null, null);
                return;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                an anVar2 = ((lm) obj2).f49001a;
                if (anVar2.P1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    anVar2.P1.setTranslationY(i20.D(520.0f, iArr[1] - l3Var.getTop(), i16));
                    anVar2.P1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + i17);
                    anVar2.P1.w();
                    return;
                }
                return;
            default:
                final ww wwVar = (ww) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                xw xwVar = wwVar.f53013g;
                yw ywVar = wwVar.h;
                ArrayList arrayList2 = ywVar.T1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i21 = dialog.pinnedNum;
                    ywVar.Y0 = null;
                    xwVar.f53335a.invalidate();
                    int N0 = xwVar.f53337c.N0();
                    if (N0 == i16 - 1) {
                        xwVar.f53337c.m(N0).requestLayout();
                    }
                    if (ywVar.getMessagesController().C2(dialog.f28055id, false)) {
                        ywVar.getMessagesController().j2();
                        xwVar.f53345y.D();
                        xwVar.q(true);
                        return;
                    }
                    np messagesController = ywVar.getMessagesController();
                    long j3 = dialog.f28055id;
                    if (ywVar.Y2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int d = messagesController.d(i11, -1, j3);
                    if (d != 2 || i17 != 0) {
                        xwVar.f53345y.D();
                        xwVar.q(true);
                    }
                    if (ywVar.Y2 == 0) {
                        if (d == 2) {
                            boolean z10 = gz.f23977q1;
                            if (z10) {
                                gz.f23977q1 = !z10;
                                SharedPreferences.Editor edit = np.e1().edit();
                                edit.putBoolean("archiveHidden", gz.f23977q1);
                                edit.apply();
                            }
                            xwVar.f53345y.D();
                            if (i17 == 0) {
                                ywVar.M4(true, true);
                                xwVar.q(true);
                                ywVar.z3();
                            } else {
                                xwVar.q(true);
                                if (!gz.f23977q1 && xwVar.f53337c.L0() == 0) {
                                    ywVar.f53645g2 = true;
                                    uw uwVar = xwVar.f53335a;
                                    if (gz.f23974p1) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    uwVar.w0(0, -org.telegram.messenger.g0.L(f10), null);
                                }
                            }
                            i13 = ((e2) ywVar).currentAccount;
                            ywVar.T1.add(0, (TLRPC.Dialog) ywVar.d4(i13, xwVar.f53342s, ywVar.Y2, false).get(0));
                            xwVar.q(true);
                            org.telegram.messenger.g0.i3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            wwVar.h.M4(false, true);
                                            return;
                                        default:
                                            wwVar.h.M4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (d == 1) {
                            v4.e1 K = xwVar.f53335a.K(0);
                            if (K != null) {
                                View view = K.f58535a;
                                if (view instanceof t2) {
                                    t2 t2Var = (t2) view;
                                    if (t2Var.f31549b2.f39596n == 2) {
                                        t2Var.f31554c2 = true;
                                        t2Var.d2 = 0.0f;
                                        j6.f29160u1.T(true, 0.0f);
                                        j6.f29160u1.start();
                                        t2Var.invalidate();
                                    }
                                }
                            }
                            org.telegram.messenger.g0.i3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            wwVar.h.M4(false, true);
                                            return;
                                        default:
                                            wwVar.h.M4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences e13 = np.e1();
                        i15 = (e13.getBoolean("archivehint_l", false) || gz.f23977q1) ? 1 : 1;
                        if (i15 == 0) {
                            e13.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView k42 = ywVar.k4();
                        if (k42 != null) {
                            long j10 = dialog.f28055id;
                            if (i15 != 0) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            k42.l(j10, i12, null, new u11(wwVar, dialog, i21, 2));
                        }
                    }
                    if (ywVar.Y2 != 0 && ywVar.T1.isEmpty()) {
                        xwVar.f53335a.setEmptyView(null);
                        xwVar.f53344x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public x(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f19226a = i11;
        this.d = obj;
        this.f19227b = i7;
        this.f19228c = i10;
        this.f19229e = obj2;
    }

    public x(Object obj, Object obj2, int i7, int i10, int i11) {
        this.f19226a = i11;
        this.d = obj;
        this.f19229e = obj2;
        this.f19227b = i7;
        this.f19228c = i10;
    }

    public x(ns nsVar, int i7, Object[] objArr, int i10) {
        this.f19226a = 8;
        this.d = nsVar;
        this.f19227b = i7;
        this.f19229e = objArr;
        this.f19228c = i10;
    }
}
