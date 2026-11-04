package k2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import gi.l3;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bb;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jb;
import org.telegram.messenger.li;
import org.telegram.messenger.po;
import org.telegram.messenger.qr;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.al;
import org.telegram.ui.fl;
import org.telegram.ui.hm;
import org.telegram.ui.pw;
import org.telegram.ui.rw;
import org.telegram.ui.sw;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
public final class a0 implements Runnable {
    public final int f16439a;
    public final int f16440b;
    public final int f16441c;
    public final Object d;
    public final Object f16442e;

    public a0(int i3, int i10, String str, String str2) {
        this.f16439a = 9;
        this.f16440b = i3;
        this.d = str;
        this.f16442e = str2;
        this.f16441c = i10;
    }

    @Override
    public final void run() {
        int i3;
        int i10;
        int[] iArr;
        l3 l3Var;
        int i11;
        boolean z10;
        int i12;
        float f10;
        int i13;
        int i14 = this.f16439a;
        int i15 = 0;
        int i16 = this.f16440b;
        int i17 = this.f16441c;
        Object obj = this.f16442e;
        Object obj2 = this.d;
        switch (i14) {
            case 0:
                i0 i0Var = ((c0) obj2).f16459a;
                Surface surface = new Surface((SurfaceTexture) obj);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(i16, i17);
                return;
            case 1:
                String str = (String) obj;
                zb zbVar = ((jb) obj2).f23659b;
                if (i16 != 1) {
                    zbVar.f26773s.c(new bb(zbVar, str, 1));
                }
                hs.f(i17).k(143, str, Integer.valueOf(i16));
                return;
            case 2:
                ((li) obj2).x1((List) obj, i16, i17, true);
                return;
            case 3:
                li liVar = (li) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        liVar.getMessagesStorage().f24936b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = liVar.getMessagesStorage().f24936b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
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
                    SQLitePreparedStatement executeFast2 = liVar.getMessagesStorage().f24936b.executeFast("UPDATE reactions SET date = ?");
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
                hp hpVar = (hp) obj2;
                hpVar.f23115s1.clear();
                hpVar.f23161x1.clear();
                qr messagesStorage = hpVar.getMessagesStorage();
                messagesStorage.H();
                hpVar.q4(true, messagesStorage.f24947w, ((TLRPC.updates_Difference) obj).pts, this.f16440b, this.f16441c);
                hpVar.P1().q();
                return;
            case 5:
                po poVar = (po) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                poVar.h.Y3(photos_photos.users, false);
                poVar.d(i16, i17, photos_photos);
                return;
            case 6:
                po poVar2 = (po) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                hp hpVar2 = poVar2.h;
                hpVar2.Y3(messages_messages.users, false);
                hpVar2.S3(messages_messages.chats, false);
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
                poVar2.d(i16, i17, tL_photos_photos);
                return;
            case 7:
                qr qrVar = (qr) obj2;
                byte[] bArr = (byte[]) obj;
                qrVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = qrVar.f24936b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
                    executeFast3.bindInteger(1, i16);
                    executeFast3.bindInteger(2, i17);
                    if (bArr != null) {
                        i3 = bArr.length;
                    } else {
                        i3 = 1;
                    }
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i3);
                    if (bArr != null) {
                        nativeByteBuffer2.writeBytes(bArr);
                    }
                    executeFast3.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast3.step();
                    executeFast3.dispose();
                    nativeByteBuffer2.reuse();
                    return;
                } catch (Exception e11) {
                    qrVar.o(e11, true);
                    return;
                }
            case 8:
                hs hsVar = (hs) obj2;
                hsVar.l((Object[]) obj, i16, false);
                hsVar.f23367q.remove(i17);
                return;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i16, (String) obj2, (String) obj, i17);
                return;
            case 10:
                ((wm) obj2).didReceivedNotification(i16, i17, (Object[]) obj);
                return;
            case 11:
                al alVar = (al) obj2;
                alVar.getClass();
                zi messageObject = ((org.telegram.ui.Cells.t0) obj).getMessageObject();
                fl flVar = alVar.f43794a;
                wm wmVar = flVar.R;
                int f12 = messageObject.f1();
                if (zi.B0(messageObject.f26868k) == flVar.R.f51272c7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                wmVar.xb(this.f16440b, f12, true, i10, true, 0, Integer.valueOf(i17), null, null);
                return;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                wm wmVar2 = ((hm) obj2).f45934a;
                if (wmVar2.P1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    wmVar2.P1.setTranslationY(org.telegram.messenger.camera.q.D(520.0f, iArr[1] - l3Var.getTop(), i16));
                    wmVar2.P1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + i17);
                    wmVar2.P1.w();
                    return;
                }
                return;
            default:
                final sw swVar = (sw) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                tw twVar = swVar.f49629g;
                uw uwVar = swVar.h;
                ArrayList arrayList2 = uwVar.S1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i21 = dialog.pinnedNum;
                    uwVar.X0 = null;
                    twVar.f49897a.invalidate();
                    int N0 = twVar.f49899c.N0();
                    if (N0 == i16 - 1) {
                        twVar.f49899c.m(N0).requestLayout();
                    }
                    if (uwVar.getMessagesController().C2(dialog.f27005id, false)) {
                        uwVar.getMessagesController().j2();
                        twVar.f49907y.D();
                        twVar.q(true);
                        return;
                    }
                    hp messagesController = uwVar.getMessagesController();
                    long j10 = dialog.f27005id;
                    if (uwVar.X2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int d = messagesController.d(i11, -1, j10);
                    if (d != 2 || i17 != 0) {
                        twVar.f49907y.D();
                        twVar.q(true);
                    }
                    if (uwVar.X2 == 0) {
                        if (d == 2) {
                            boolean z11 = az.f21657q1;
                            if (z11) {
                                az.f21657q1 = !z11;
                                SharedPreferences.Editor edit = hp.e1().edit();
                                edit.putBoolean("archiveHidden", az.f21657q1);
                                edit.apply();
                            }
                            twVar.f49907y.D();
                            if (i17 == 0) {
                                uwVar.M4(true, true);
                                twVar.q(true);
                                uwVar.z3();
                            } else {
                                twVar.q(true);
                                if (!az.f21657q1 && twVar.f49899c.L0() == 0) {
                                    uwVar.f50232f2 = true;
                                    pw pwVar = twVar.f49897a;
                                    if (az.f21654p1) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    pwVar.w0(0, -org.telegram.messenger.g0.L(f10), null);
                                }
                            }
                            i13 = ((d2) uwVar).currentAccount;
                            uwVar.S1.add(0, (TLRPC.Dialog) uwVar.d4(i13, twVar.f49904s, uwVar.X2, false).get(0));
                            twVar.q(true);
                            org.telegram.messenger.g0.i3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            swVar.h.M4(false, true);
                                            return;
                                        default:
                                            swVar.h.M4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (d == 1) {
                            u4.d1 K = twVar.f49897a.K(0);
                            if (K != null) {
                                View view = K.f55540a;
                                if (view instanceof t2) {
                                    t2 t2Var = (t2) view;
                                    if (t2Var.f30473b2.f38689n == 2) {
                                        t2Var.c2 = true;
                                        t2Var.f30482d2 = 0.0f;
                                        k6.f28191u1.T(true, 0.0f);
                                        k6.f28191u1.start();
                                        t2Var.invalidate();
                                    }
                                }
                            }
                            org.telegram.messenger.g0.i3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            swVar.h.M4(false, true);
                                            return;
                                        default:
                                            swVar.h.M4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences e12 = hp.e1();
                        if (!e12.getBoolean("archivehint_l", false) && !az.f21657q1) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            e12.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView k42 = uwVar.k4();
                        if (k42 != null) {
                            long j11 = dialog.f27005id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            k42.l(j11, i12, null, new rw(swVar, dialog, i21, 0));
                        }
                    }
                    if (uwVar.X2 != 0 && uwVar.S1.isEmpty()) {
                        twVar.f49897a.setEmptyView(null);
                        twVar.f49906x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, int i3, int i10, Object obj2, int i11) {
        this.f16439a = i11;
        this.d = obj;
        this.f16440b = i3;
        this.f16441c = i10;
        this.f16442e = obj2;
    }

    public a0(Object obj, Object obj2, int i3, int i10, int i11) {
        this.f16439a = i11;
        this.d = obj;
        this.f16442e = obj2;
        this.f16440b = i3;
        this.f16441c = i10;
    }

    public a0(hs hsVar, int i3, Object[] objArr, int i10) {
        this.f16439a = 8;
        this.d = hsVar;
        this.f16440b = i3;
        this.f16442e = objArr;
        this.f16441c = i10;
    }
}
