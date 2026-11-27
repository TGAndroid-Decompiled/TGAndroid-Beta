package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;
public final class i02 implements hj, fd, bm3, on5, qc6, pz6, bs9, if7, lc5, cf7, f73 {
    public final byte a;
    public final long b;
    public final Object c;

    public i02(long j, ta0 ta0Var) {
        this.a = (byte) 10;
        this.b = j;
        this.c = ta0Var;
    }

    @Override
    public final void A(boolean z) {
        zu1 zu1Var = ((l1c) this.c).s;
        if (ik8.A(zu1Var)) {
            zu1Var.Ia(this.b, false);
        }
    }

    @Override
    public final void a(String str) {
        r9b r9bVar = (r9b) this.c;
        uc7.s1(r9bVar.a0.a).O1().q(this.b, str, new j9b(r9bVar, (byte) 2));
    }

    @Override
    public final Object apply(Object obj) {
        ta0 ta0Var = (ta0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = ta0Var.a;
        pm8 pm8Var = ta0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(qm8.a(pm8Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(qm8.a(pm8Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 6:
                float[] fArr = FragmentContextView.W0;
                r7a.B(((hd6) obj).h.K1).q0(p7a.d(messageMedia, this.b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.C1;
                r7a.B(((int[]) obj)[0]).q0(p7a.d(messageMedia, this.b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public final void c(TLRPC.TL_error tL_error, String str) {
        pcc pccVar = (pcc) this.c;
        if (str == null) {
            bn3.K(tL_error);
        }
        hl.d3(new ym3(pccVar, str), Math.max(0L, (this.b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public final h73 createDataSource() {
        return new gfc(((kfc) this.c).h.createDataSource(), this.b);
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        dzb dzbVar = (dzb) this.c;
        e eVar = dzbVar.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i2 = 0;
        while (i2 < size) {
            uc7 messagesController = eVar.getMessagesController();
            kc kcVar = new kc((byte) 10);
            long j = this.b;
            messagesController.j(j, (TLRPC.User) arrayList.get(i2), i, null, eVar, false, kcVar, null, new dg1(dzbVar, tL_messages_invitedUsers, iArr, size, arrayList, j), false);
            i2++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        try {
            return yx6Var.o(xw6Var, po5.u(ft6.a(xw6Var.c, (Bundle) this.c)), 0, this.b);
        } catch (RuntimeException e) {
            efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return fne.b(e);
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        switch (this.a) {
            case 4:
                h01 h01Var = (h01) this.c;
                long j = this.b;
                mn5 p = imageReceiver.p();
                if (z && p != null) {
                    Bitmap bitmap = p.c;
                    if (bitmap == null) {
                        Drawable drawable = p.d;
                        if (drawable instanceof BitmapDrawable) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                        }
                    }
                    h01Var.onComplete(new Pair(Long.valueOf(j), bitmap));
                    return;
                }
                return;
            default:
                ResultCallback resultCallback = (ResultCallback) this.c;
                long j2 = this.b;
                mn5 p2 = imageReceiver.p();
                if (z && p2 != null && !p2.c.isRecycled()) {
                    Bitmap bitmap2 = p2.c;
                    if (bitmap2 == null) {
                        Drawable drawable2 = p2.d;
                        if (drawable2 instanceof BitmapDrawable) {
                            bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
                        }
                    }
                    if (bitmap2 != null) {
                        if (resultCallback != null) {
                            resultCallback.onComplete(new Pair(Long.valueOf(j2), bitmap2));
                        }
                        Utilities.e.c(new we2(j2, bitmap2, (byte) 1));
                        return;
                    } else if (resultCallback != null) {
                        resultCallback.onComplete(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 1:
                gx9 gx9Var = ((uj3) obj).D0.e0;
                sl3 sl3Var = (sl3) gx9Var.y0.f(j);
                if (sl3Var != null) {
                    gx9Var.y0.l(j);
                    gx9Var.u0.remove(sl3Var);
                    gx9Var.w0.remove(sl3Var);
                    gx9Var.v0.remove(sl3Var);
                    gx9Var.f();
                    kf7.a0(gx9Var.t0).a.c(new kt(gx9Var, j, (byte) 15));
                    return;
                }
                return;
            default:
                ((dj3) obj).a.getMediaDataController().Q1(j);
                return;
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        boolean q1;
        n12 n12Var = (n12) this.c;
        f12 f12Var = n12Var.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
        long j = this.b;
        if (f12Var != chatAttachAlertPhotoLayout && f12Var != n12Var.k2) {
            if (!f12Var.K(z, i, i2, j, n12Var.b1())) {
                n12Var.A4 = true;
                n12Var.dismiss();
            }
            q1 = false;
        } else {
            q1 = n12Var.q1(z, i, i2, j, n12Var.b1());
        }
        ox1 ox1Var = n12Var.b2;
        if (ox1Var != null) {
            ox1Var.f(!q1);
            n12Var.b2 = null;
        }
    }

    @Override
    public final void z(int i, Drawable drawable) {
        byte b = this.a;
    }

    public i02(bn3 bn3Var, long j, pcc pccVar) {
        this.a = (byte) 3;
        this.b = j;
        this.c = pccVar;
    }

    public i02(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    private final void h(ImageReceiver imageReceiver) {
    }

    private final void i(ImageReceiver imageReceiver) {
    }

    @Override
    public final void d(TLRPC.User user) {
    }

    private final void e(int i, Drawable drawable) {
    }

    private final void g(int i, Drawable drawable) {
    }
}
