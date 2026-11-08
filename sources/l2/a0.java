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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.an;
import org.telegram.ui.el;
import org.telegram.ui.jl;
import org.telegram.ui.lm;
import org.telegram.ui.q8;
import org.telegram.ui.sw;
import org.telegram.ui.uw;
import org.telegram.ui.vw;
import org.telegram.ui.ww;
public final class a0 implements Runnable {
    public final int f17740a;
    public final int f17741b;
    public final int f17742c;
    public final Object d;
    public final Object f17743e;

    public a0(int i7, int i10, String str, String str2) {
        this.f17740a = 9;
        this.f17741b = i7;
        this.d = str;
        this.f17743e = str2;
        this.f17742c = i10;
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
        int i14 = this.f17740a;
        int i15 = 0;
        int i16 = this.f17741b;
        int i17 = this.f17742c;
        Object obj = this.f17743e;
        Object obj2 = this.d;
        switch (i14) {
            case 0:
                i0 i0Var = ((c0) obj2).f17774a;
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
                qpVar.q4(true, messagesStorage.f26731w, ((TLRPC.updates_Difference) obj).pts, this.f17741b, this.f17742c);
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
                ((an) obj2).didReceivedNotification(i16, i17, (Object[]) obj);
                return;
            case 11:
                el elVar = (el) obj2;
                elVar.getClass();
                ij messageObject = ((org.telegram.ui.Cells.t0) obj).getMessageObject();
                jl jlVar = elVar.f45331a;
                an anVar = jlVar.Q;
                int f12 = messageObject.f1();
                if (ij.B0(messageObject.f23262k) == jlVar.Q.f43744b7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                anVar.xb(this.f17741b, f12, true, i10, true, 0, Integer.valueOf(i17), null, null);
                return;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                an anVar2 = ((lm) obj2).f47557a;
                if (anVar2.O1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    anVar2.O1.setTranslationY(org.telegram.messenger.camera.q.D(520.0f, iArr[1] - m3Var.getTop(), i16));
                    anVar2.O1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + i17);
                    anVar2.O1.w();
                    return;
                }
                return;
            default:
                final uw uwVar = (uw) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                vw vwVar = uwVar.f50433g;
                ww wwVar = uwVar.h;
                ArrayList arrayList2 = wwVar.R1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i21 = dialog.pinnedNum;
                    wwVar.W0 = null;
                    vwVar.f50782a.invalidate();
                    int N0 = vwVar.f50784c.N0();
                    if (N0 == i16 - 1) {
                        vwVar.f50784c.m(N0).requestLayout();
                    }
                    if (wwVar.getMessagesController().C2(dialog.f26960id, false)) {
                        wwVar.getMessagesController().j2();
                        vwVar.f50792y.D();
                        vwVar.q(true);
                        return;
                    }
                    qp messagesController = wwVar.getMessagesController();
                    long j3 = dialog.f26960id;
                    if (wwVar.W2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int d = messagesController.d(i11, -1, j3);
                    if (d != 2 || i17 != 0) {
                        vwVar.f50792y.D();
                        vwVar.q(true);
                    }
                    if (wwVar.W2 == 0) {
                        if (d == 2) {
                            boolean z9 = iz.f23430q1;
                            if (z9) {
                                iz.f23430q1 = !z9;
                                SharedPreferences.Editor edit = qp.e1().edit();
                                edit.putBoolean("archiveHidden", iz.f23430q1);
                                edit.apply();
                            }
                            vwVar.f50792y.D();
                            if (i17 == 0) {
                                wwVar.M4(true, true);
                                vwVar.q(true);
                                wwVar.z3();
                            } else {
                                vwVar.q(true);
                                if (!iz.f23430q1 && vwVar.f50784c.L0() == 0) {
                                    wwVar.f51558e2 = true;
                                    sw swVar = vwVar.f50782a;
                                    if (iz.f23427p1) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    swVar.w0(0, -org.telegram.messenger.g0.L(f10), null);
                                }
                            }
                            i13 = ((f2) wwVar).currentAccount;
                            wwVar.R1.add(0, (TLRPC.Dialog) wwVar.d4(i13, vwVar.f50789s, wwVar.W2, false).get(0));
                            vwVar.q(true);
                            org.telegram.messenger.g0.i3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            uwVar.h.M4(false, true);
                                            return;
                                        default:
                                            uwVar.h.M4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (d == 1) {
                            v4.d1 K = vwVar.f50782a.K(0);
                            if (K != null) {
                                View view = K.f57043a;
                                if (view instanceof t2) {
                                    t2 t2Var = (t2) view;
                                    if (t2Var.f30392a2.f39868n == 2) {
                                        t2Var.f30397b2 = true;
                                        t2Var.f30402c2 = 0.0f;
                                        k6.f28163u1.T(true, 0.0f);
                                        k6.f28163u1.start();
                                        t2Var.invalidate();
                                    }
                                }
                            }
                            org.telegram.messenger.g0.i3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            uwVar.h.M4(false, true);
                                            return;
                                        default:
                                            uwVar.h.M4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences e12 = qp.e1();
                        i15 = (e12.getBoolean("archivehint_l", false) || iz.f23430q1) ? 1 : 1;
                        if (i15 == 0) {
                            e12.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView k42 = wwVar.k4();
                        if (k42 != null) {
                            long j10 = dialog.f26960id;
                            if (i15 != 0) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            k42.l(j10, i12, null, new q8(uwVar, dialog, i21, 29));
                        }
                    }
                    if (wwVar.W2 != 0 && wwVar.R1.isEmpty()) {
                        vwVar.f50782a.setEmptyView(null);
                        vwVar.f50791x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f17740a = i11;
        this.d = obj;
        this.f17741b = i7;
        this.f17742c = i10;
        this.f17743e = obj2;
    }

    public a0(Object obj, Object obj2, int i7, int i10, int i11) {
        this.f17740a = i11;
        this.d = obj;
        this.f17743e = obj2;
        this.f17741b = i7;
        this.f17742c = i10;
    }

    public a0(qs qsVar, int i7, Object[] objArr, int i10) {
        this.f17740a = 8;
        this.d = qsVar;
        this.f17741b = i7;
        this.f17743e = objArr;
        this.f17742c = i10;
    }
}
