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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;
public final class rz1 implements gj, ed, jl3, ll5, ma6, lx6, jo9, yc7, ka5, sc7, m63 {
    public final byte a;
    public final long b;
    public final Object c;

    public rz1(long j, ra0 ra0Var) {
        this.a = (byte) 10;
        this.b = j;
        this.c = ra0Var;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        switch (this.a) {
            case 4:
                q31 q31Var = (q31) this.c;
                long j = this.b;
                jl5 p = imageReceiver.p();
                if (z && p != null) {
                    Bitmap bitmap = p.c;
                    if (bitmap == null) {
                        Drawable drawable = p.d;
                        if (drawable instanceof BitmapDrawable) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                        }
                    }
                    q31Var.onComplete(new Pair(Long.valueOf(j), bitmap));
                    return;
                }
                return;
            default:
                ResultCallback resultCallback = (ResultCallback) this.c;
                long j2 = this.b;
                jl5 p2 = imageReceiver.p();
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
                        Utilities.e.c(new zd2(j2, bitmap2, (byte) 1));
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
    public final void E(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final void a(String str) {
        t5b t5bVar = (t5b) this.c;
        na7.q1(t5bVar.a0.a).M1().q(this.b, str, new m5b(t5bVar, (byte) 2));
    }

    @Override
    public final Object apply(Object obj) {
        ra0 ra0Var = (ra0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = ra0Var.a;
        cj8 cj8Var = ra0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(dj8.a(cj8Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(dj8.a(cj8Var)));
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
                z3a.B(((db6) obj).h.K1).q0(x3a.d(messageMedia, this.b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.C1;
                z3a.B(((int[]) obj)[0]).q0(x3a.d(messageMedia, this.b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public final void c(TLRPC.TL_error tL_error, String str) {
        p8c p8cVar = (p8c) this.c;
        if (str == null) {
            jm3.G(tL_error);
        }
        gl.d3(new gm3(p8cVar, str), Math.max(0L, (this.b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public final o63 createDataSource() {
        return new gbc(((lbc) this.c).h.createDataSource(), this.b);
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        bvb bvbVar = (bvb) this.c;
        d dVar = bvbVar.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i2 = 0;
        while (i2 < size) {
            na7 messagesController = dVar.getMessagesController();
            jc jcVar = new jc((byte) 10);
            long j = this.b;
            messagesController.j(j, (TLRPC.User) arrayList.get(i2), i, null, dVar, false, jcVar, null, new sf1(bvbVar, tL_messages_invitedUsers, iArr, size, arrayList, j));
            i2++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public final void k(boolean z) {
        mu1 mu1Var = ((kxb) this.c).s;
        if (ug8.A(mu1Var)) {
            mu1Var.xa(this.b, false);
        }
    }

    @Override
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        try {
            return tv6Var.o(su6Var, mm5.u(br6.a(su6Var.c, (Bundle) this.c)), 0, this.b);
        } catch (RuntimeException e) {
            lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return jie.b(e);
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        boolean p1;
        x02 x02Var = (x02) this.c;
        p02 p02Var = x02Var.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
        long j = this.b;
        if (p02Var != chatAttachAlertPhotoLayout && p02Var != x02Var.k2) {
            if (!p02Var.M(z, i, i2, j, x02Var.a1())) {
                x02Var.A4 = true;
                x02Var.dismiss();
            }
            p1 = false;
        } else {
            p1 = x02Var.p1(z, i, i2, j, x02Var.a1());
        }
        bx1 bx1Var = x02Var.b2;
        if (bx1Var != null) {
            bx1Var.f(!p1);
            x02Var.b2 = null;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 1:
                mt9 mt9Var = ((cj3) obj).D0.e0;
                al3 al3Var = (al3) mt9Var.y0.f(j);
                if (al3Var != null) {
                    mt9Var.y0.l(j);
                    mt9Var.u0.remove(al3Var);
                    mt9Var.w0.remove(al3Var);
                    mt9Var.v0.remove(al3Var);
                    mt9Var.f();
                    ad7.Y(mt9Var.t0).a.c(new et(mt9Var, j, (byte) 15));
                    return;
                }
                return;
            default:
                ((ji3) obj).a.getMediaDataController().Q1(j);
                return;
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    public rz1(jm3 jm3Var, long j, p8c p8cVar) {
        this.a = (byte) 3;
        this.b = j;
        this.c = p8cVar;
    }

    public rz1(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    private final void h(ImageReceiver imageReceiver) {
    }

    private final void i(ImageReceiver imageReceiver) {
    }

    @Override
    public final void e(TLRPC.User user) {
    }

    private final void d(int i, Drawable drawable) {
    }

    private final void g(int i, Drawable drawable) {
    }
}
