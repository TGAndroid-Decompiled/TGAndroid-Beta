package defpackage;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
public final class zq1 implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;

    public zq1(nm7 nm7Var, int i, Object[] objArr, int i2) {
        this.a = (byte) 11;
        this.d = nm7Var;
        this.b = i;
        this.e = objArr;
        this.c = i2;
    }

    @Override
    public final void run() {
        int i;
        int[] iArr;
        hg5 hg5Var;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        byte b = this.a;
        int i6 = 0;
        int i7 = this.b;
        int i8 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((yv1) obj2).didReceivedNotification(i7, i8, (Object[]) obj);
                return;
            case 1:
                k47 messageObject = ((cm1) obj).getMessageObject();
                yv1 yv1Var = ((cu1) obj2).a.R;
                int e1 = messageObject.e1();
                if (k47.B0(messageObject.k) == yv1Var.d7) {
                    i = 1;
                } else {
                    i = 0;
                }
                yv1Var.sb(this.b, e1, true, i, true, 0, Integer.valueOf(i8), null, null);
                return;
            case 2:
                rc2 rc2Var = (rc2) obj;
                yv1 yv1Var2 = ((iv1) obj2).a;
                if (yv1Var2.P1 != null) {
                    rc2Var.getLocationInWindow(new int[2]);
                    yv1Var2.P1.setTranslationY(b10.z(520.0f, iArr[1] - hg5Var.getTop(), i7));
                    yv1Var2.P1.o(0.0f, (-gm.L(16.0f)) + iArr[0] + i8);
                    yv1Var2.P1.v();
                    return;
                }
                return;
            case 3:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i7, (String) obj2, (String) obj, i8);
                return;
            case 4:
                final lk3 lk3Var = (lk3) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                mk3 mk3Var = lk3Var.h;
                nk3 nk3Var = lk3Var.i;
                ArrayList arrayList = nk3Var.T1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i9 = dialog.pinnedNum;
                    nk3Var.Y0 = null;
                    mk3Var.a.invalidate();
                    int M0 = mk3Var.c.M0();
                    if (M0 == i7 - 1) {
                        mk3Var.c.m(M0).requestLayout();
                    }
                    if (nk3Var.getMessagesController().D2(dialog.id, false)) {
                        nk3Var.getMessagesController().f2();
                        mk3Var.y.D();
                        mk3Var.b(true);
                        return;
                    }
                    oc7 messagesController = nk3Var.getMessagesController();
                    long j = dialog.id;
                    if (nk3Var.Y2 == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    int b2 = messagesController.b(i2, -1, j);
                    if (b2 != 2 || i8 != 0) {
                        mk3Var.y.D();
                        mk3Var.b(true);
                    }
                    if (nk3Var.Y2 == 0) {
                        if (b2 == 2) {
                            boolean z = gda.m1;
                            if (z) {
                                gda.m1 = !z;
                                SharedPreferences.Editor edit = oc7.d1().edit();
                                edit.putBoolean("archiveHidden", gda.m1);
                                edit.apply();
                            }
                            mk3Var.y.D();
                            if (i8 == 0) {
                                nk3Var.U4(true, true);
                                mk3Var.b(true);
                                nk3Var.I2();
                            } else {
                                mk3Var.b(true);
                                if (!gda.m1 && mk3Var.c.K0() == 0) {
                                    nk3Var.g2 = true;
                                    jk3 jk3Var = mk3Var.a;
                                    if (gda.l1) {
                                        f = 76.0f;
                                    } else {
                                        f = 70.0f;
                                    }
                                    jk3Var.x0(0, -gm.L(f), null);
                                }
                            }
                            i4 = ((d) nk3Var).currentAccount;
                            nk3Var.T1.add(0, (TLRPC.Dialog) nk3Var.o3(i4, mk3Var.s, nk3Var.Y2, false).get(0));
                            mk3Var.b(true);
                            gm.d3(new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r2;
                                    lk3 lk3Var2 = lk3Var;
                                    switch (b3) {
                                        case 0:
                                            lk3Var2.i.U4(false, true);
                                            return;
                                        default:
                                            lk3Var2.i.U4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (b2 == 1) {
                            u69 K = mk3Var.a.K(0);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof hg3) {
                                    hg3 hg3Var = (hg3) view;
                                    if (hg3Var.b2.n == 2) {
                                        hg3Var.c2 = true;
                                        hg3Var.d2 = 0.0f;
                                        cmb.t1.O(true, 0.0f);
                                        cmb.t1.start();
                                        hg3Var.invalidate();
                                    }
                                }
                            }
                            gm.d3(new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r2;
                                    lk3 lk3Var2 = lk3Var;
                                    switch (b3) {
                                        case 0:
                                            lk3Var2.i.U4(false, true);
                                            return;
                                        default:
                                            lk3Var2.i.U4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences d1 = oc7.d1();
                        if (d1.getBoolean("archivehint_l", false) || gda.m1) {
                            i6 = 1;
                        }
                        if (i6 == 0) {
                            d1.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView w3 = nk3Var.w3();
                        if (w3 != null) {
                            long j2 = dialog.id;
                            if (i6 != 0) {
                                i3 = 2;
                            } else {
                                i3 = 3;
                            }
                            w3.l(j2, i3, null, new wc7(lk3Var, dialog, i9, (byte) 19));
                        }
                    }
                    if (nk3Var.Y2 != 0 && nk3Var.T1.isEmpty()) {
                        mk3Var.a.setEmptyView(null);
                        mk3Var.x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                h74 h74Var = ((c74) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                h74Var.q1(surface);
                h74Var.U = surface;
                h74Var.f1(i7, i8);
                return;
            case 6:
                String str = (String) obj;
                fn5 fn5Var = ((pm5) obj2).b;
                if (i7 != 1) {
                    fn5Var.s.c(new jm5(fn5Var, str, (byte) 1));
                }
                nm7.f(i8).k(144, str, Integer.valueOf(i7));
                return;
            case 7:
                oc7 oc7Var = (oc7) obj2;
                oc7Var.i1.clear();
                oc7Var.p1.clear();
                cf7 messagesStorage = oc7Var.getMessagesStorage();
                messagesStorage.G();
                oc7Var.u4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                oc7Var.N1().p();
                return;
            case 8:
                xb7 xb7Var = (xb7) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                xb7Var.h.d4(photos_photos.users, false);
                xb7Var.d(i7, i8, photos_photos);
                return;
            case 9:
                xb7 xb7Var2 = (xb7) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                oc7 oc7Var2 = xb7Var2.h;
                oc7Var2.d4(messages_messages.users, false);
                oc7Var2.X3(messages_messages.chats, false);
                TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
                tL_photos_photos.count = messages_messages.count;
                int i10 = 0;
                while (i6 < messages_messages.messages.size()) {
                    TLRPC.MessageAction messageAction = messages_messages.messages.get(i6).action;
                    if (messageAction != null) {
                        TLRPC.Photo photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            tL_photos_photos.photos.add(photo);
                            i6++;
                        }
                    }
                    i10++;
                    i6++;
                }
                if (i7 == 0 && messages_messages.messages.size() >= messages_messages.count) {
                    tL_photos_photos.count -= i10;
                }
                xb7Var2.d(i7, i8, tL_photos_photos);
                return;
            case 10:
                cf7 cf7Var = (cf7) obj2;
                byte[] bArr = (byte[]) obj;
                try {
                    SQLitePreparedStatement executeFast = cf7Var.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
                    executeFast.bindInteger(1, i7);
                    executeFast.bindInteger(2, i8);
                    if (bArr != null) {
                        i5 = bArr.length;
                    } else {
                        i5 = 1;
                    }
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i5);
                    if (bArr != null) {
                        nativeByteBuffer.writeBytes(bArr);
                    }
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    return;
                } catch (Exception e) {
                    cf7Var.n(e, true);
                    return;
                }
            default:
                nm7 nm7Var = (nm7) obj2;
                nm7Var.l((Object[]) obj, i7, false);
                nm7Var.q.remove(i8);
                return;
        }
    }

    public zq1(int i, int i2, String str, String str2) {
        this.a = (byte) 3;
        this.b = i;
        this.d = str;
        this.e = str2;
        this.c = i2;
    }

    public zq1(Object obj, int i, int i2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
        this.e = obj2;
    }

    public zq1(Object obj, Object obj2, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }
}
