package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.ep;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.messenger.is;
import org.telegram.messenger.jb;
import org.telegram.messenger.kj;
import org.telegram.messenger.sb;
import org.telegram.messenger.uz;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.am;
import org.telegram.ui.fm;
import org.telegram.ui.fn;
import org.telegram.ui.un;
import org.telegram.ui.vx;
import org.telegram.ui.xx;
import org.telegram.ui.yx;
import org.telegram.ui.zx;
import vh.p2;
public final class a0 implements Runnable {
    public final int f7791a;
    public final int f7792b;
    public final int f7793c;
    public final Object d;
    public final Object e;

    public a0(int i10, int i11, String str, String str2) {
        this.f7791a = 9;
        this.f7792b = i10;
        this.d = str;
        this.e = str2;
        this.f7793c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int[] iArr;
        p2 p2Var;
        int i12;
        int i13;
        float f7;
        int i14;
        int i15 = this.f7791a;
        int i16 = 0;
        int i17 = this.f7792b;
        int i18 = this.f7793c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i15) {
            case 0:
                i0 i0Var = ((c0) obj2).f7822a;
                Surface surface = new Surface((SurfaceTexture) obj);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(i17, i18);
                return;
            case 1:
                String str = (String) obj;
                ic icVar = ((sb) obj2).f18077b;
                if (i17 != 1) {
                    icVar.f16261s.c(new jb(icVar, str, 1));
                }
                at.f(i18).k(143, str, Integer.valueOf(i17));
                return;
            case 2:
                ((vi) obj2).x1((List) obj, i17, i18, true);
                return;
            case 3:
                vi viVar = (vi) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        viVar.getMessagesStorage().f16333b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = viVar.getMessagesStorage().f16333b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                        executeFast.requery();
                        int i19 = 4;
                        for (int i20 = 0; i20 < arrayList.size(); i20++) {
                            i19 += ((TLRPC.TL_availableReaction) arrayList.get(i20)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i19);
                        nativeByteBuffer.writeInt32(arrayList.size());
                        while (i16 < arrayList.size()) {
                            ((TLRPC.TL_availableReaction) arrayList.get(i16)).serializeToStream(nativeByteBuffer);
                            i16++;
                        }
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i17);
                        executeFast.bindInteger(3, i18);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast2 = viVar.getMessagesStorage().f16333b.executeFast("UPDATE reactions SET date = ?");
                    executeFast2.requery();
                    executeFast2.bindLong(1, i18);
                    executeFast2.step();
                    executeFast2.dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 4:
                wp wpVar = (wp) obj2;
                wpVar.f19228r1.clear();
                wpVar.f19275w1.clear();
                is messagesStorage = wpVar.getMessagesStorage();
                messagesStorage.H();
                wpVar.n4(true, messagesStorage.f16342w, ((TLRPC.updates_Difference) obj).pts, this.f7792b, this.f7793c);
                wpVar.O1().q();
                return;
            case 5:
                ep epVar = (ep) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                epVar.h.V3(photos_photos.users, false);
                epVar.c(i17, i18, photos_photos);
                return;
            case 6:
                ep epVar2 = (ep) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                wp wpVar2 = epVar2.h;
                wpVar2.V3(messages_messages.users, false);
                wpVar2.P3(messages_messages.chats, false);
                TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
                tL_photos_photos.count = messages_messages.count;
                int i21 = 0;
                while (i16 < messages_messages.messages.size()) {
                    TLRPC.MessageAction messageAction = messages_messages.messages.get(i16).action;
                    if (messageAction != null) {
                        TLRPC.Photo photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            tL_photos_photos.photos.add(photo);
                            i16++;
                        }
                    }
                    i21++;
                    i16++;
                }
                if (i17 == 0 && messages_messages.messages.size() >= messages_messages.count) {
                    tL_photos_photos.count -= i21;
                }
                epVar2.c(i17, i18, tL_photos_photos);
                return;
            case 7:
                is isVar = (is) obj2;
                byte[] bArr = (byte[]) obj;
                isVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = isVar.f16333b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
                    executeFast3.bindInteger(1, i17);
                    executeFast3.bindInteger(2, i18);
                    if (bArr != null) {
                        i10 = bArr.length;
                    } else {
                        i10 = 1;
                    }
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i10);
                    if (bArr != null) {
                        nativeByteBuffer2.writeBytes(bArr);
                    }
                    executeFast3.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast3.step();
                    executeFast3.dispose();
                    nativeByteBuffer2.reuse();
                    return;
                } catch (Exception e7) {
                    isVar.o(e7, true);
                    return;
                }
            case 8:
                at atVar = (at) obj2;
                atVar.l((Object[]) obj, i17, false);
                atVar.f14846q.remove(i18);
                return;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i17, (String) obj2, (String) obj, i18);
                return;
            case 10:
                ((un) obj2).didReceivedNotification(i17, i18, (Object[]) obj);
                return;
            case 11:
                am amVar = (am) obj2;
                amVar.getClass();
                kj messageObject = ((org.telegram.ui.Cells.s0) obj).getMessageObject();
                fm fmVar = amVar.f35805a;
                un unVar = fmVar.Q;
                int f12 = messageObject.f1();
                if (kj.B0(messageObject.f16690k) == fmVar.Q.f42010b7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                unVar.sb(this.f7792b, f12, true, i11, true, 0, Integer.valueOf(i18), null, null);
                return;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                un unVar2 = ((fn) obj2).f37191a;
                if (unVar2.O1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    unVar2.O1.setTranslationY(a30.D(520.0f, iArr[1] - p2Var.getTop(), i17));
                    unVar2.O1.m(0.0f, (-org.telegram.messenger.i0.L(16.0f)) + iArr[0] + i18);
                    unVar2.O1.u();
                    return;
                }
                return;
            default:
                final xx xxVar = (xx) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                yx yxVar = xxVar.f43469g;
                zx zxVar = xxVar.h;
                ArrayList arrayList2 = zxVar.R1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i22 = dialog.pinnedNum;
                    zxVar.W0 = null;
                    yxVar.f43733a.invalidate();
                    int N0 = yxVar.f43735c.N0();
                    if (N0 == i17 - 1) {
                        yxVar.f43735c.m(N0).requestLayout();
                    }
                    if (zxVar.getMessagesController().B2(dialog.f19798id, false)) {
                        zxVar.getMessagesController().i2();
                        yxVar.f43742y.D();
                        yxVar.q(true);
                        return;
                    }
                    wp messagesController = zxVar.getMessagesController();
                    long j10 = dialog.f19798id;
                    if (zxVar.W2 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    int d = messagesController.d(i12, -1, j10);
                    if (d != 2 || i18 != 0) {
                        yxVar.f43742y.D();
                        yxVar.q(true);
                    }
                    if (zxVar.W2 == 0) {
                        if (d == 2) {
                            boolean z10 = uz.f18545q1;
                            if (z10) {
                                uz.f18545q1 = !z10;
                                SharedPreferences.Editor edit = wp.d1().edit();
                                edit.putBoolean("archiveHidden", uz.f18545q1);
                                edit.apply();
                            }
                            yxVar.f43742y.D();
                            if (i18 == 0) {
                                zxVar.M4(true, true);
                                yxVar.q(true);
                                zxVar.z3();
                            } else {
                                yxVar.q(true);
                                if (!uz.f18545q1 && yxVar.f43735c.L0() == 0) {
                                    zxVar.f44139e2 = true;
                                    vx vxVar = yxVar.f43733a;
                                    if (uz.f18542p1) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    vxVar.w0(0, -org.telegram.messenger.i0.L(f7), null);
                                }
                            }
                            i14 = ((k2) zxVar).currentAccount;
                            zxVar.R1.add(0, (TLRPC.Dialog) zxVar.d4(i14, yxVar.f43739s, zxVar.W2, false).get(0));
                            yxVar.q(true);
                            org.telegram.messenger.i0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            xxVar.h.M4(false, true);
                                            return;
                                        default:
                                            xxVar.h.M4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (d == 1) {
                            s4.c1 K = yxVar.f43733a.K(0);
                            if (K != null) {
                                View view = K.f47909a;
                                if (view instanceof v2) {
                                    v2 v2Var = (v2) view;
                                    if (v2Var.a2.f29925n == 2) {
                                        v2Var.f23180b2 = true;
                                        v2Var.f23185c2 = 0.0f;
                                        t6.f21238u1.T(true, 0.0f);
                                        t6.f21238u1.start();
                                        v2Var.invalidate();
                                    }
                                }
                            }
                            org.telegram.messenger.i0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            xxVar.h.M4(false, true);
                                            return;
                                        default:
                                            xxVar.h.M4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences d12 = wp.d1();
                        i16 = (d12.getBoolean("archivehint_l", false) || uz.f18545q1) ? 1 : 1;
                        if (i16 == 0) {
                            d12.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView k42 = zxVar.k4();
                        if (k42 != null) {
                            long j11 = dialog.f19798id;
                            if (i16 != 0) {
                                i13 = 2;
                            } else {
                                i13 = 3;
                            }
                            k42.l(j11, i13, null, new ki0(xxVar, dialog, i22, 16));
                        }
                    }
                    if (zxVar.W2 != 0 && zxVar.R1.isEmpty()) {
                        yxVar.f43733a.setEmptyView(null);
                        yxVar.f43741x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, int i10, int i11, Object obj2, int i12) {
        this.f7791a = i12;
        this.d = obj;
        this.f7792b = i10;
        this.f7793c = i11;
        this.e = obj2;
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f7791a = i12;
        this.d = obj;
        this.e = obj2;
        this.f7792b = i10;
        this.f7793c = i11;
    }

    public a0(at atVar, int i10, Object[] objArr, int i11) {
        this.f7791a = 8;
        this.d = atVar;
        this.f7792b = i10;
        this.e = objArr;
        this.f7793c = i11;
    }
}
