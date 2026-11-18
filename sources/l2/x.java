package l2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import hi.m3;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.gb;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ob;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.uo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.h01;
import org.telegram.ui.ax;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.fl;
import org.telegram.ui.kl;
import org.telegram.ui.mm;
import org.telegram.ui.yw;
public final class x implements Runnable {
    public final int f19590a;
    public final int f19591b;
    public final int f19592c;
    public final Object d;
    public final Object f19593e;

    public x(int i7, int i10, String str, String str2) {
        this.f19590a = 9;
        this.f19591b = i7;
        this.d = str;
        this.f19593e = str2;
        this.f19592c = i10;
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
        int i14 = this.f19590a;
        int i15 = 0;
        int i16 = this.f19591b;
        int i17 = this.f19592c;
        Object obj = this.f19593e;
        Object obj2 = this.d;
        switch (i14) {
            case 0:
                f0 f0Var = ((z) obj2).f19597a;
                Surface surface = new Surface((SurfaceTexture) obj);
                f0Var.x1(surface);
                f0Var.U = surface;
                f0Var.q1(i16, i17);
                return;
            case 1:
                String str = (String) obj;
                ec ecVar = ((ob) obj2).f26049b;
                if (i16 != 1) {
                    ecVar.f23692s.c(new gb(ecVar, str, 1));
                }
                ks.f(i17).k(143, str, Integer.valueOf(i16));
                return;
            case 2:
                ((ri) obj2).A1((List) obj, i16, i17, true);
                return;
            case 3:
                ri riVar = (ri) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        riVar.getMessagesStorage().f27054b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = riVar.getMessagesStorage().f27054b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
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
                    SQLitePreparedStatement executeFast2 = riVar.getMessagesStorage().f27054b.executeFast("UPDATE reactions SET date = ?");
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
                mp mpVar = (mp) obj2;
                mpVar.f25756s1.clear();
                mpVar.f25820z1.clear();
                tr messagesStorage = mpVar.getMessagesStorage();
                messagesStorage.H();
                mpVar.y4(true, messagesStorage.f27065w, ((TLRPC.updates_Difference) obj).pts, this.f19591b, this.f19592c);
                mpVar.R1().q();
                return;
            case 5:
                uo uoVar = (uo) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                uoVar.h.f4(photos_photos.users, false);
                uoVar.d(i16, i17, photos_photos);
                return;
            case 6:
                uo uoVar2 = (uo) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                mp mpVar2 = uoVar2.h;
                mpVar2.f4(messages_messages.users, false);
                mpVar2.Z3(messages_messages.chats, false);
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
                uoVar2.d(i16, i17, tL_photos_photos);
                return;
            case 7:
                tr trVar = (tr) obj2;
                byte[] bArr = (byte[]) obj;
                trVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = trVar.f27054b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
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
                    trVar.o(e11, true);
                    return;
                }
            case 8:
                ks ksVar = (ks) obj2;
                ksVar.l((Object[]) obj, i16, false);
                ksVar.f25252q.remove(i17);
                return;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i16, (String) obj2, (String) obj, i17);
                return;
            case 10:
                ((bn) obj2).didReceivedNotification(i16, i17, (Object[]) obj);
                return;
            case 11:
                fl flVar = (fl) obj2;
                flVar.getClass();
                fj messageObject = ((org.telegram.ui.Cells.v0) obj).getMessageObject();
                kl klVar = flVar.f47687a;
                bn bnVar = klVar.R;
                int e12 = messageObject.e1();
                if (fj.B0(messageObject.f23965k) == klVar.R.f45972d7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                bnVar.Bb(this.f19591b, e12, true, i10, true, 0, Integer.valueOf(i17), null, null);
                return;
            case 12:
                r1 r1Var = (r1) obj;
                bn bnVar2 = ((mm) obj2).f49896a;
                if (bnVar2.P1 != null) {
                    r1Var.getLocationInWindow(new int[2]);
                    bnVar2.P1.setTranslationY(org.telegram.ui.Cells.c0.i(520.0f, iArr[1] - m3Var.getTop(), i16));
                    bnVar2.P1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + i17);
                    bnVar2.P1.x();
                    return;
                }
                return;
            default:
                final ax axVar = (ax) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                bx bxVar = axVar.f45682g;
                cx cxVar = axVar.h;
                ArrayList arrayList2 = cxVar.T1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i21 = dialog.pinnedNum;
                    cxVar.Y0 = null;
                    bxVar.f46298a.invalidate();
                    int N0 = bxVar.f46300c.N0();
                    if (N0 == i16 - 1) {
                        bxVar.f46300c.m(N0).requestLayout();
                    }
                    if (cxVar.getMessagesController().I2(dialog.f28407id, false)) {
                        cxVar.getMessagesController().l2();
                        bxVar.f46308y.D();
                        bxVar.q(true);
                        return;
                    }
                    mp messagesController = cxVar.getMessagesController();
                    long j3 = dialog.f28407id;
                    if (cxVar.Y2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int d = messagesController.d(i11, -1, j3);
                    if (d != 2 || i17 != 0) {
                        bxVar.f46308y.D();
                        bxVar.q(true);
                    }
                    if (cxVar.Y2 == 0) {
                        if (d == 2) {
                            boolean z10 = bz.f23190q1;
                            if (z10) {
                                bz.f23190q1 = !z10;
                                SharedPreferences.Editor edit = mp.g1().edit();
                                edit.putBoolean("archiveHidden", bz.f23190q1);
                                edit.apply();
                            }
                            bxVar.f46308y.D();
                            if (i17 == 0) {
                                cxVar.U4(true, true);
                                bxVar.q(true);
                                cxVar.z3();
                            } else {
                                bxVar.q(true);
                                if (!bz.f23190q1 && bxVar.f46300c.L0() == 0) {
                                    cxVar.f46670g2 = true;
                                    yw ywVar = bxVar.f46298a;
                                    if (bz.f23187p1) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    ywVar.w0(0, -org.telegram.messenger.g0.L(f10), null);
                                }
                            }
                            i13 = ((h2) cxVar).currentAccount;
                            cxVar.T1.add(0, (TLRPC.Dialog) cxVar.d4(i13, bxVar.f46305s, cxVar.Y2, false).get(0));
                            bxVar.q(true);
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            axVar.h.U4(false, true);
                                            return;
                                        default:
                                            axVar.h.U4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (d == 1) {
                            v4.f1 K = bxVar.f46298a.K(0);
                            if (K != null) {
                                View view = K.f59123a;
                                if (view instanceof u2) {
                                    u2 u2Var = (u2) view;
                                    if (u2Var.f31899b2.f33599n == 2) {
                                        u2Var.f31904c2 = true;
                                        u2Var.d2 = 0.0f;
                                        n6.f29705u1.T(true, 0.0f);
                                        n6.f29705u1.start();
                                        u2Var.invalidate();
                                    }
                                }
                            }
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            axVar.h.U4(false, true);
                                            return;
                                        default:
                                            axVar.h.U4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences g12 = mp.g1();
                        i15 = (g12.getBoolean("archivehint_l", false) || bz.f23190q1) ? 1 : 1;
                        if (i15 == 0) {
                            g12.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView l42 = cxVar.l4();
                        if (l42 != null) {
                            long j10 = dialog.f28407id;
                            if (i15 != 0) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            l42.l(j10, i12, null, new h01(axVar, dialog, i21, 3));
                        }
                    }
                    if (cxVar.Y2 != 0 && cxVar.T1.isEmpty()) {
                        bxVar.f46298a.setEmptyView(null);
                        bxVar.f46307x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public x(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f19590a = i11;
        this.d = obj;
        this.f19591b = i7;
        this.f19592c = i10;
        this.f19593e = obj2;
    }

    public x(Object obj, Object obj2, int i7, int i10, int i11) {
        this.f19590a = i11;
        this.d = obj;
        this.f19593e = obj2;
        this.f19591b = i7;
        this.f19592c = i10;
    }

    public x(ks ksVar, int i7, Object[] objArr, int i10) {
        this.f19590a = 8;
        this.d = ksVar;
        this.f19591b = i7;
        this.f19593e = objArr;
        this.f19592c = i10;
    }
}
