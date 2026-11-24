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
public final class d12 implements gk, ee, um3, ln5, lc6, lz6, kq9, af7, ic5, ue7, y73 {
    public final byte a;
    public final long b;
    public final Object c;

    public d12(long j, rb0 rb0Var) {
        this.a = (byte) 10;
        this.b = j;
        this.c = rb0Var;
    }

    @Override
    public final void B0(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void a(String str) {
        v7b v7bVar = (v7b) this.c;
        oc7.r1(v7bVar.a0.a).N1().q(this.b, str, new n7b(v7bVar, (byte) 2));
    }

    @Override
    public final Object apply(Object obj) {
        rb0 rb0Var = (rb0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = rb0Var.a;
        fl8 fl8Var = rb0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(gl8.a(fl8Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(gl8.a(fl8Var)));
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
                a6a.B(((cd6) obj).h.K1).q0(y5a.d(messageMedia, this.b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.C1;
                a6a.B(((int[]) obj)[0]).q0(y5a.d(messageMedia, this.b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        switch (this.a) {
            case 4:
                g11 g11Var = (g11) this.c;
                long j = this.b;
                jn5 p = imageReceiver.p();
                if (z && p != null) {
                    Bitmap bitmap = p.c;
                    if (bitmap == null) {
                        Drawable drawable = p.d;
                        if (drawable instanceof BitmapDrawable) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                        }
                    }
                    g11Var.onComplete(new Pair(Long.valueOf(j), bitmap));
                    return;
                }
                return;
            default:
                ResultCallback resultCallback = (ResultCallback) this.c;
                long j2 = this.b;
                jn5 p2 = imageReceiver.p();
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
                        Utilities.e.c(new kf2(j2, bitmap2, (byte) 1));
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
    public final void c(TLRPC.TL_error tL_error, String str) {
        qac qacVar = (qac) this.c;
        if (str == null) {
            un3.G(tL_error);
        }
        gm.d3(new rn3(qacVar, str), Math.max(0L, (this.b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public final a83 createDataSource() {
        return new jdc(((ndc) this.c).h.createDataSource(), this.b);
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        cxb cxbVar = (cxb) this.c;
        d dVar = cxbVar.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i2 = 0;
        while (i2 < size) {
            oc7 messagesController = dVar.getMessagesController();
            jd jdVar = new jd((byte) 10);
            long j = this.b;
            messagesController.j(j, (TLRPC.User) arrayList.get(i2), i, null, dVar, false, jdVar, null, new ah1(cxbVar, tL_messages_invitedUsers, iArr, size, arrayList, j), false);
            i2++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 1:
                ov9 ov9Var = ((nk3) obj).D0.e0;
                lm3 lm3Var = (lm3) ov9Var.y0.f(j);
                if (lm3Var != null) {
                    ov9Var.y0.l(j);
                    ov9Var.u0.remove(lm3Var);
                    ov9Var.w0.remove(lm3Var);
                    ov9Var.v0.remove(lm3Var);
                    ov9Var.f();
                    cf7.Y(ov9Var.t0).a.c(new fu(ov9Var, j, (byte) 15));
                    return;
                }
                return;
            default:
                ((uj3) obj).a.getMediaDataController().Q1(j);
                return;
        }
    }

    @Override
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        try {
            return tx6Var.o(sw6Var, mo5.u(bt6.a(sw6Var.c, (Bundle) this.c)), 0, this.b);
        } catch (RuntimeException e) {
            ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return kke.b(e);
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        boolean p1;
        i22 i22Var = (i22) this.c;
        a22 a22Var = i22Var.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
        long j = this.b;
        if (a22Var != chatAttachAlertPhotoLayout && a22Var != i22Var.k2) {
            if (!a22Var.K(z, i, i2, j, i22Var.a1())) {
                i22Var.A4 = true;
                i22Var.dismiss();
            }
            p1 = false;
        } else {
            p1 = i22Var.p1(z, i, i2, j, i22Var.a1());
        }
        oy1 oy1Var = i22Var.b2;
        if (oy1Var != null) {
            oy1Var.f(!p1);
            i22Var.b2 = null;
        }
    }

    @Override
    public final void z(boolean z) {
        yv1 yv1Var = ((mzb) this.c).s;
        if (wi8.A(yv1Var)) {
            yv1Var.Ha(this.b, false);
        }
    }

    public d12(un3 un3Var, long j, qac qacVar) {
        this.a = (byte) 3;
        this.b = j;
        this.c = qacVar;
    }

    public d12(Object obj, long j, byte b) {
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
