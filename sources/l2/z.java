package l2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import fi.m3;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.ib;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qb;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.yo;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.cn;
import org.telegram.ui.gl;
import org.telegram.ui.ll;
import org.telegram.ui.nm;
import org.telegram.ui.q8;
import org.telegram.ui.uw;
import org.telegram.ui.ww;
import org.telegram.ui.xw;
import org.telegram.ui.yw;
public final class z implements Runnable {
    public final int f18097a;
    public final int f18098b;
    public final int f18099c;
    public final Object d;
    public final Object f18100e;

    public z(int i7, int i10, String str, String str2) {
        this.f18097a = 9;
        this.f18098b = i7;
        this.d = str;
        this.f18100e = str2;
        this.f18099c = i10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int[] iArr;
        m3 m3Var;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14 = this.f18097a;
        int i15 = 0;
        int i16 = this.f18098b;
        int i17 = this.f18099c;
        Object obj = this.f18100e;
        Object obj2 = this.d;
        switch (i14) {
            case 0:
                i0 i0Var = ((c0) obj2).f17772a;
                Surface surface = new Surface((SurfaceTexture) obj);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(i16, i17);
                return;
            case 1:
                String str = (String) obj;
                gc gcVar = ((qb) obj2).f24687b;
                if (i16 != 1) {
                    gcVar.f22651s.c(new ib(gcVar, str, 1));
                }
                qs.f(i17).k(143, str, Integer.valueOf(i16));
                return;
            case 2:
                ((ui) obj2).x1((List) obj, i16, i17, true);
                return;
            case 3:
                ui uiVar = (ui) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        uiVar.getMessagesStorage().f26721b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().f26721b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
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
                    SQLitePreparedStatement executeFast2 = uiVar.getMessagesStorage().f26721b.executeFast("UPDATE reactions SET date = ?");
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
                qp qpVar = (qp) obj2;
                qpVar.f24881r1.clear();
                qpVar.f24926w1.clear();
                yr messagesStorage = qpVar.getMessagesStorage();
                messagesStorage.H();
                qpVar.q4(true, messagesStorage.f26731w, ((TLRPC.updates_Difference) obj).pts, this.f18098b, this.f18099c);
                qpVar.P1().q();
                return;
            case 5:
                yo yoVar = (yo) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                yoVar.h.Y3(photos_photos.users, false);
                yoVar.d(i16, i17, photos_photos);
                return;
            case 6:
                yo yoVar2 = (yo) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                qp qpVar2 = yoVar2.h;
                qpVar2.Y3(messages_messages.users, false);
                qpVar2.S3(messages_messages.chats, false);
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
                yoVar2.d(i16, i17, tL_photos_photos);
                return;
            case 7:
                yr yrVar = (yr) obj2;
                byte[] bArr = (byte[]) obj;
                yrVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = yrVar.f26721b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
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
                    yrVar.o(e11, true);
                    return;
                }
            case 8:
                qs qsVar = (qs) obj2;
                qsVar.l((Object[]) obj, i16, false);
                qsVar.f25138q.remove(i17);
                return;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i16, (String) obj2, (String) obj, i17);
                return;
            case 10:
                ((cn) obj2).didReceivedNotification(i16, i17, (Object[]) obj);
                return;
            case 11:
                gl glVar = (gl) obj2;
                glVar.getClass();
                ij messageObject = ((org.telegram.ui.Cells.t0) obj).getMessageObject();
                ll llVar = glVar.f46031a;
                cn cnVar = llVar.Q;
                int e12 = messageObject.e1();
                if (ij.B0(messageObject.f23262k) == llVar.Q.f44399b7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                cnVar.Ab(this.f18098b, e12, true, i10, true, 0, Integer.valueOf(i17), null, null);
                return;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                cn cnVar2 = ((nm) obj2).f48207a;
                if (cnVar2.O1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    cnVar2.O1.setTranslationY(org.telegram.messenger.camera.q.D(520.0f, iArr[1] - m3Var.getTop(), i16));
                    cnVar2.O1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + i17);
                    cnVar2.O1.w();
                    return;
                }
                return;
            default:
                final ww wwVar = (ww) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                xw xwVar = wwVar.f51489g;
                yw ywVar = wwVar.h;
                ArrayList arrayList2 = ywVar.S1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i21 = dialog.pinnedNum;
                    ywVar.X0 = null;
                    xwVar.f51772a.invalidate();
                    int N0 = xwVar.f51774c.N0();
                    if (N0 == i16 - 1) {
                        xwVar.f51774c.m(N0).requestLayout();
                    }
                    if (ywVar.getMessagesController().C2(dialog.f26960id, false)) {
                        ywVar.getMessagesController().j2();
                        xwVar.f51782y.D();
                        xwVar.q(true);
                        return;
                    }
                    qp messagesController = ywVar.getMessagesController();
                    long j3 = dialog.f26960id;
                    if (ywVar.X2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int d = messagesController.d(i11, -1, j3);
                    if (d != 2 || i17 != 0) {
                        xwVar.f51782y.D();
                        xwVar.q(true);
                    }
                    if (ywVar.X2 == 0) {
                        if (d == 2) {
                            boolean z9 = iz.f23430q1;
                            if (z9) {
                                iz.f23430q1 = !z9;
                                SharedPreferences.Editor edit = qp.e1().edit();
                                edit.putBoolean("archiveHidden", iz.f23430q1);
                                edit.apply();
                            }
                            xwVar.f51782y.D();
                            if (i17 == 0) {
                                ywVar.M4(true, true);
                                xwVar.q(true);
                                ywVar.z3();
                            } else {
                                xwVar.q(true);
                                if (!iz.f23430q1 && xwVar.f51774c.L0() == 0) {
                                    ywVar.f52239f2 = true;
                                    uw uwVar = xwVar.f51772a;
                                    if (iz.f23427p1) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    uwVar.w0(0, -org.telegram.messenger.g0.L(f10), null);
                                }
                            }
                            i13 = ((f2) ywVar).currentAccount;
                            ywVar.S1.add(0, (TLRPC.Dialog) ywVar.d4(i13, xwVar.f51779s, ywVar.X2, false).get(0));
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
                            v4.d1 K = xwVar.f51772a.K(0);
                            if (K != null) {
                                View view = K.f57056a;
                                if (view instanceof t2) {
                                    t2 t2Var = (t2) view;
                                    if (t2Var.f30396a2.f39980n == 2) {
                                        t2Var.f30401b2 = true;
                                        t2Var.f30406c2 = 0.0f;
                                        l6.f28176u1.T(true, 0.0f);
                                        l6.f28176u1.start();
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
                        SharedPreferences e13 = qp.e1();
                        i15 = (e13.getBoolean("archivehint_l", false) || iz.f23430q1) ? 1 : 1;
                        if (i15 == 0) {
                            e13.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView k42 = ywVar.k4();
                        if (k42 != null) {
                            long j10 = dialog.f26960id;
                            if (i15 != 0) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            k42.l(j10, i12, null, new q8(wwVar, dialog, i21, 29));
                        }
                    }
                    if (ywVar.X2 != 0 && ywVar.S1.isEmpty()) {
                        xwVar.f51772a.setEmptyView(null);
                        xwVar.f51781x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f18097a = i11;
        this.d = obj;
        this.f18098b = i7;
        this.f18099c = i10;
        this.f18100e = obj2;
    }

    public z(Object obj, Object obj2, int i7, int i10, int i11) {
        this.f18097a = i11;
        this.d = obj;
        this.f18100e = obj2;
        this.f18098b = i7;
        this.f18099c = i10;
    }

    public z(qs qsVar, int i7, Object[] objArr, int i10) {
        this.f18097a = 8;
        this.d = qsVar;
        this.f18098b = i7;
        this.f18100e = objArr;
        this.f18099c = i10;
    }
}
