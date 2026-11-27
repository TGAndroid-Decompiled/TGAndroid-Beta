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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
public final class aq1 implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;

    public aq1(jn7 jn7Var, int i, Object[] objArr, int i2) {
        this.a = (byte) 11;
        this.d = jn7Var;
        this.b = i;
        this.e = objArr;
        this.c = i2;
    }

    @Override
    public final void run() {
        int i;
        int[] iArr;
        kg5 kg5Var;
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
                ((zu1) obj2).didReceivedNotification(i7, i8, (Object[]) obj);
                return;
            case 1:
                r47 messageObject = ((dl1) obj).getMessageObject();
                zu1 zu1Var = ((dt1) obj2).a.R;
                int e1 = messageObject.e1();
                if (r47.B0(messageObject.k) == zu1Var.d7) {
                    i = 1;
                } else {
                    i = 0;
                }
                zu1Var.tb(this.b, e1, true, i, true, 0, Integer.valueOf(i8), null, null);
                return;
            case 2:
                wb2 wb2Var = (wb2) obj;
                zu1 zu1Var2 = ((ju1) obj2).a;
                if (zu1Var2.P1 != null) {
                    wb2Var.getLocationInWindow(new int[2]);
                    zu1Var2.P1.setTranslationY(c00.A(520.0f, iArr[1] - kg5Var.getTop(), i7));
                    zu1Var2.P1.o(0.0f, (-hl.L(16.0f)) + iArr[0] + i8);
                    zu1Var2.P1.v();
                    return;
                }
                return;
            case 3:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i7, (String) obj2, (String) obj, i8);
                return;
            case 4:
                final sj3 sj3Var = (sj3) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                tj3 tj3Var = sj3Var.h;
                uj3 uj3Var = sj3Var.i;
                ArrayList arrayList = uj3Var.T1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i9 = dialog.pinnedNum;
                    uj3Var.Y0 = null;
                    tj3Var.a.invalidate();
                    int M0 = tj3Var.c.M0();
                    if (M0 == i7 - 1) {
                        tj3Var.c.m(M0).requestLayout();
                    }
                    if (uj3Var.getMessagesController().G2(dialog.id, false)) {
                        uj3Var.getMessagesController().g2();
                        tj3Var.y.D();
                        tj3Var.b(true);
                        return;
                    }
                    uc7 messagesController = uj3Var.getMessagesController();
                    long j = dialog.id;
                    if (uj3Var.Y2 == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    int b2 = messagesController.b(i2, -1, j);
                    if (b2 != 2 || i8 != 0) {
                        tj3Var.y.D();
                        tj3Var.b(true);
                    }
                    if (uj3Var.Y2 == 0) {
                        if (b2 == 2) {
                            boolean z = xea.m1;
                            if (z) {
                                xea.m1 = !z;
                                SharedPreferences.Editor edit = uc7.e1().edit();
                                edit.putBoolean("archiveHidden", xea.m1);
                                edit.apply();
                            }
                            tj3Var.y.D();
                            if (i8 == 0) {
                                uj3Var.U4(true, true);
                                tj3Var.b(true);
                                uj3Var.I2();
                            } else {
                                tj3Var.b(true);
                                if (!xea.m1 && tj3Var.c.K0() == 0) {
                                    uj3Var.g2 = true;
                                    qj3 qj3Var = tj3Var.a;
                                    if (xea.l1) {
                                        f = 76.0f;
                                    } else {
                                        f = 70.0f;
                                    }
                                    qj3Var.y0(0, -hl.L(f), null);
                                }
                            }
                            i4 = ((e) uj3Var).currentAccount;
                            uj3Var.T1.add(0, (TLRPC.Dialog) uj3Var.o3(i4, tj3Var.s, uj3Var.Y2, false).get(0));
                            tj3Var.b(true);
                            hl.d3(new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r2;
                                    sj3 sj3Var2 = sj3Var;
                                    switch (b3) {
                                        case 0:
                                            sj3Var2.i.U4(false, true);
                                            return;
                                        default:
                                            sj3Var2.i.U4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (b2 == 1) {
                            f89 L = tj3Var.a.L(0);
                            if (L != null) {
                                View view = L.a;
                                if (view instanceof of3) {
                                    of3 of3Var = (of3) view;
                                    if (of3Var.b2.n == 2) {
                                        of3Var.c2 = true;
                                        of3Var.d2 = 0.0f;
                                        aob.u1.O(true, 0.0f);
                                        aob.u1.start();
                                        of3Var.invalidate();
                                    }
                                }
                            }
                            hl.d3(new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r2;
                                    sj3 sj3Var2 = sj3Var;
                                    switch (b3) {
                                        case 0:
                                            sj3Var2.i.U4(false, true);
                                            return;
                                        default:
                                            sj3Var2.i.U4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences e12 = uc7.e1();
                        if (e12.getBoolean("archivehint_l", false) || xea.m1) {
                            i6 = 1;
                        }
                        if (i6 == 0) {
                            e12.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView w3 = uj3Var.w3();
                        if (w3 != null) {
                            long j2 = dialog.id;
                            if (i6 != 0) {
                                i3 = 2;
                            } else {
                                i3 = 3;
                            }
                            w3.l(j2, i3, null, new ze7(sj3Var, dialog, i9, (byte) 19));
                        }
                    }
                    if (uj3Var.Y2 != 0 && uj3Var.T1.isEmpty()) {
                        tj3Var.a.setEmptyView(null);
                        tj3Var.x.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                s64 s64Var = ((n64) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                s64Var.q1(surface);
                s64Var.U = surface;
                s64Var.f1(i7, i8);
                return;
            case 6:
                String str = (String) obj;
                in5 in5Var = ((sm5) obj2).b;
                if (i7 != 1) {
                    in5Var.s.c(new mm5(in5Var, str, (byte) 2));
                }
                jn7.f(i8).k(144, str, Integer.valueOf(i7));
                return;
            case 7:
                uc7 uc7Var = (uc7) obj2;
                uc7Var.i1.clear();
                uc7Var.p1.clear();
                jf7 messagesStorage = uc7Var.getMessagesStorage();
                messagesStorage.G();
                uc7Var.A4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                uc7Var.O1().p();
                return;
            case 8:
                dc7 dc7Var = (dc7) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                dc7Var.h.j4(photos_photos.users, false);
                dc7Var.d(i7, i8, photos_photos);
                return;
            case 9:
                dc7 dc7Var2 = (dc7) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                uc7 uc7Var2 = dc7Var2.h;
                uc7Var2.j4(messages_messages.users, false);
                uc7Var2.c4(messages_messages.chats, false);
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
                dc7Var2.d(i7, i8, tL_photos_photos);
                return;
            case 10:
                jf7 jf7Var = (jf7) obj2;
                byte[] bArr = (byte[]) obj;
                try {
                    SQLitePreparedStatement executeFast = jf7Var.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
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
                    jf7Var.n(e, true);
                    return;
                }
            default:
                jn7 jn7Var = (jn7) obj2;
                jn7Var.l((Object[]) obj, i7, false);
                jn7Var.q.remove(i8);
                return;
        }
    }

    public aq1(int i, int i2, String str, String str2) {
        this.a = (byte) 3;
        this.b = i;
        this.d = str;
        this.e = str2;
        this.c = i2;
    }

    public aq1(Object obj, int i, int i2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
        this.e = obj2;
    }

    public aq1(Object obj, Object obj2, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }
}
