package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.dp;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.hs;
import org.telegram.messenger.ib;
import org.telegram.messenger.jj;
import org.telegram.messenger.rb;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.am;
import org.telegram.ui.ay;
import org.telegram.ui.fm;
import org.telegram.ui.fn;
import org.telegram.ui.un;
import org.telegram.ui.wx;
import org.telegram.ui.yx;
import org.telegram.ui.zx;
import vh.p2;
public final class a0 implements Runnable {
    public final int f7790a;
    public final int f7791b;
    public final int f7792c;
    public final Object d;
    public final Object e;

    public a0(int i10, int i11, String str, String str2) {
        this.f7790a = 9;
        this.f7791b = i10;
        this.d = str;
        this.e = str2;
        this.f7792c = i11;
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
        int i15 = this.f7790a;
        int i16 = 0;
        int i17 = this.f7791b;
        int i18 = this.f7792c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i15) {
            case 0:
                i0 i0Var = ((c0) obj2).f7821a;
                Surface surface = new Surface((SurfaceTexture) obj);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(i17, i18);
                return;
            case 1:
                String str = (String) obj;
                hc hcVar = ((rb) obj2).f17713b;
                if (i17 != 1) {
                    hcVar.f15868s.c(new ib(hcVar, str, 1));
                }
                zs.f(i18).k(143, str, Integer.valueOf(i17));
                return;
            case 2:
                ((ui) obj2).x1((List) obj, i17, i18, true);
                return;
            case 3:
                ui uiVar = (ui) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        uiVar.getMessagesStorage().f15940b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().f15940b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
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
                    SQLitePreparedStatement executeFast2 = uiVar.getMessagesStorage().f15940b.executeFast("UPDATE reactions SET date = ?");
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
                vp vpVar = (vp) obj2;
                vpVar.f18885r1.clear();
                vpVar.f18932w1.clear();
                hs messagesStorage = vpVar.getMessagesStorage();
                messagesStorage.H();
                vpVar.n4(true, messagesStorage.f15949w, ((TLRPC.updates_Difference) obj).pts, this.f7791b, this.f7792c);
                vpVar.O1().q();
                return;
            case 5:
                dp dpVar = (dp) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                dpVar.h.V3(photos_photos.users, false);
                dpVar.c(i17, i18, photos_photos);
                return;
            case 6:
                dp dpVar2 = (dp) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                vp vpVar2 = dpVar2.h;
                vpVar2.V3(messages_messages.users, false);
                vpVar2.P3(messages_messages.chats, false);
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
                dpVar2.c(i17, i18, tL_photos_photos);
                return;
            case 7:
                hs hsVar = (hs) obj2;
                byte[] bArr = (byte[]) obj;
                hsVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = hsVar.f15940b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
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
                    hsVar.o(e7, true);
                    return;
                }
            case 8:
                zs zsVar = (zs) obj2;
                zsVar.l((Object[]) obj, i17, false);
                zsVar.f19750q.remove(i18);
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
                jj messageObject = ((org.telegram.ui.Cells.s0) obj).getMessageObject();
                fm fmVar = amVar.f35671a;
                un unVar = fmVar.Q;
                int f12 = messageObject.f1();
                if (jj.B0(messageObject.f16337k) == fmVar.Q.f42199b7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                unVar.nb(this.f7791b, f12, true, i11, true, 0, Integer.valueOf(i18), null, null);
                return;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                un unVar2 = ((fn) obj2).f37301a;
                if (unVar2.O1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    unVar2.O1.setTranslationY(z20.D(520.0f, iArr[1] - p2Var.getTop(), i17));
                    unVar2.O1.m(0.0f, (-org.telegram.messenger.i0.L(16.0f)) + iArr[0] + i18);
                    unVar2.O1.u();
                    return;
                }
                return;
            default:
                final yx yxVar = (yx) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                zx zxVar = yxVar.f43903g;
                ay ayVar = yxVar.h;
                ArrayList arrayList2 = ayVar.R1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i22 = dialog.pinnedNum;
                    ayVar.W0 = null;
                    zxVar.f44239a.invalidate();
                    int N0 = zxVar.f44241c.N0();
                    if (N0 == i17 - 1) {
                        zxVar.f44241c.m(N0).requestLayout();
                    }
                    if (ayVar.getMessagesController().B2(dialog.f19797id, false)) {
                        ayVar.getMessagesController().i2();
                        zxVar.f44248y.D();
                        zxVar.q(true);
                        return;
                    }
                    vp messagesController = ayVar.getMessagesController();
                    long j10 = dialog.f19797id;
                    if (ayVar.W2 == 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    int d = messagesController.d(i12, -1, j10);
                    if (d != 2 || i18 != 0) {
                        zxVar.f44248y.D();
                        zxVar.q(true);
                    }
                    if (ayVar.W2 == 0) {
                        if (d == 2) {
                            boolean z10 = tz.f18176q1;
                            if (z10) {
                                tz.f18176q1 = !z10;
                                SharedPreferences.Editor edit = vp.d1().edit();
                                edit.putBoolean("archiveHidden", tz.f18176q1);
                                edit.apply();
                            }
                            zxVar.f44248y.D();
                            if (i18 == 0) {
                                ayVar.L4(true, true);
                                zxVar.q(true);
                                ayVar.y3();
                            } else {
                                zxVar.q(true);
                                if (!tz.f18176q1 && zxVar.f44241c.L0() == 0) {
                                    ayVar.f35796e2 = true;
                                    wx wxVar = zxVar.f44239a;
                                    if (tz.f18173p1) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    wxVar.w0(0, -org.telegram.messenger.i0.L(f7), null);
                                }
                            }
                            i14 = ((k2) ayVar).currentAccount;
                            ayVar.R1.add(0, (TLRPC.Dialog) ayVar.c4(i14, zxVar.f44245s, ayVar.W2, false).get(0));
                            zxVar.q(true);
                            org.telegram.messenger.i0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            yxVar.h.L4(false, true);
                                            return;
                                        default:
                                            yxVar.h.L4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (d == 1) {
                            s4.c1 K = zxVar.f44239a.K(0);
                            if (K != null) {
                                View view = K.f47898a;
                                if (view instanceof v2) {
                                    v2 v2Var = (v2) view;
                                    if (v2Var.a2.f29869n == 2) {
                                        v2Var.f23179b2 = true;
                                        v2Var.f23184c2 = 0.0f;
                                        t6.f21237u1.T(true, 0.0f);
                                        t6.f21237u1.start();
                                        v2Var.invalidate();
                                    }
                                }
                            }
                            org.telegram.messenger.i0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            yxVar.h.L4(false, true);
                                            return;
                                        default:
                                            yxVar.h.L4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences d12 = vp.d1();
                        i16 = (d12.getBoolean("archivehint_l", false) || tz.f18176q1) ? 1 : 1;
                        if (i16 == 0) {
                            d12.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView j42 = ayVar.j4();
                        if (j42 != null) {
                            long j11 = dialog.f19797id;
                            if (i16 != 0) {
                                i13 = 2;
                            } else {
                                i13 = 3;
                            }
                            j42.l(j11, i13, null, new ji0(yxVar, dialog, i22, 16));
                        }
                    }
                    if (ayVar.W2 != 0 && ayVar.R1.isEmpty()) {
                        zxVar.f44239a.setEmptyView(null);
                        zxVar.f44247x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, int i10, int i11, Object obj2, int i12) {
        this.f7790a = i12;
        this.d = obj;
        this.f7791b = i10;
        this.f7792c = i11;
        this.e = obj2;
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f7790a = i12;
        this.d = obj;
        this.e = obj2;
        this.f7791b = i10;
        this.f7792c = i11;
    }

    public a0(zs zsVar, int i10, Object[] objArr, int i11) {
        this.f7790a = 8;
        this.d = zsVar;
        this.f7791b = i10;
        this.e = objArr;
        this.f7792c = i11;
    }
}
