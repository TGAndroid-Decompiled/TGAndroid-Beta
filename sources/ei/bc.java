package ei;

import ai.xc;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
public final class bc implements Runnable {
    public final int f8809a;
    public final Object f8810b;

    public bc(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.f8809a = 15;
        this.f8810b = b0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        Object obj;
        Bitmap bitmap = null;
        switch (this.f8809a) {
            case 0:
                ec ecVar = (ec) this.f8810b;
                MediaMetadataRetriever mediaMetadataRetriever = ecVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(ecVar.f8997j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(ecVar.f8994f, ecVar.f8995g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(ecVar.f8994f / bitmap.getWidth(), ecVar.f8995g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (ecVar.h) {
                                if (ecVar.f9000m == null) {
                                    ecVar.f9000m = new Path();
                                }
                                ecVar.f9000m.rewind();
                                ecVar.f9000m.addCircle(ecVar.f8994f / 2.0f, ecVar.f8995g / 2.0f, Math.min(ecVar.f8994f, ecVar.f8995g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(ecVar.f9000m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, ecVar.f8999l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    AndroidUtilities.runOnUIThread(new p6(12, ecVar, bitmap));
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) this.f8810b;
                xcVar.getClass();
                try {
                    lm0 currentListView = ((fi.g) xcVar.M0).T.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                ((gi.f0) this.f8810b).invalidateSelf();
                return;
            case 3:
                ((gi.g0) this.f8810b).invalidateSelf();
                return;
            case 4:
                ((gi.i0) this.f8810b).d();
                return;
            case 5:
                ((gi.v0) this.f8810b).c();
                return;
            case 6:
                ((gi.v0) this.f8810b).c();
                return;
            case 7:
                ((gi.w0) this.f8810b).a();
                return;
            case 8:
                ((gi.x0) this.f8810b).a();
                return;
            case 9:
                ((gi.c3) this.f8810b).invalidate();
                return;
            case 10:
                ((AnimationNotificationsLocker) this.f8810b).unlock();
                return;
            case 11:
                gi.e4 e4Var = (gi.e4) this.f8810b;
                e4Var.Q = e4Var.f11209r;
                return;
            case 12:
                ((e2.j0) this.f8810b).getClass();
                return;
            case 13:
                ci.t6 t6Var = ((hg.n1) this.f8810b).f12025y;
                if (t6Var != null) {
                    t6Var.p(3, true);
                    return;
                }
                return;
            case 14:
                i2.h0 h0Var = (i2.h0) this.f8810b;
                e2.c cVar = h0Var.C;
                Context context = h0Var.e;
                String str = e2.m0.f8259a;
                int generateAudioSessionId = c2.i.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((e2.i0) cVar.f8211c).f8244a.getLooper()) {
                    obj = cVar.e;
                } else {
                    if (myLooper == ((e2.i0) cVar.f8210b).f8244a.getLooper()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v7.u6.p(z10);
                    obj = cVar.f8212f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f8212f = valueOf;
                    e2.b bVar = new e2.b(cVar, valueOf, 0);
                    e2.i0 i0Var = (e2.i0) cVar.f8211c;
                    if (i0Var.f8244a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    h0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    h0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 15:
                i2.h0 h0Var2 = ((i2.b0) this.f8810b).f12353a;
                h0Var2.x1(null);
                h0Var2.q1(0, 0);
                return;
            case 16:
                try {
                    i2.q0.h((i2.l1) this.f8810b);
                    return;
                } catch (i2.m e7) {
                    e2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 17:
                ig.c cVar2 = (ig.c) this.f8810b;
                cVar2.d.Z2.N(true);
                cVar2.V(true);
                return;
            case 18:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f8810b).link);
                vc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 19:
                ig.j0 j0Var = (ig.j0) this.f8810b;
                a71 a71Var = j0Var.f12972e0;
                if (a71Var != null) {
                    a71Var.N(true);
                }
                j0Var.T(true);
                return;
            case 20:
                ig.s0 s0Var = (ig.s0) ((a6.i) this.f8810b).f307b;
                s0Var.e.Z2.N(true);
                s0Var.b0();
                return;
            case 21:
                ig.u0 u0Var = (ig.u0) this.f8810b;
                u0Var.d.Z2.N(true);
                u0Var.V(true);
                return;
            case 22:
                ig.e1 e1Var = (ig.e1) this.f8810b;
                e1Var.f12910a.Z2.N(true);
                e1Var.Y(true);
                return;
            case 23:
                ((ci.y2) this.f8810b).run(Boolean.FALSE);
                return;
            case 24:
                NotificationCenter.getInstance(((ig.z1) this.f8810b).f13138a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 25:
                j2.e eVar = (j2.e) this.f8810b;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1028, new ih.l(l4));
                eVar.f13987f.d();
                return;
            case 26:
                ((k2.e) this.f8810b).c();
                return;
            case 27:
                e2.r rVar = (e2.r) this.f8810b;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f8279a) {
                    rVar.e(-1, new k2.f(2));
                    return;
                }
                return;
            case 28:
                k2.t0 t0Var = (k2.t0) this.f8810b;
                if (t0Var.f14844a0 >= 300000) {
                    t0Var.f14855n.j();
                    t0Var.f14844a0 = 0L;
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.f3 f3Var = ((org.telegram.ui.Cells.h3) this.f8810b).d;
                f3Var.requestFocus();
                AndroidUtilities.showKeyboard(f3Var);
                return;
        }
    }

    public bc(i2.q0 q0Var, i2.l1 l1Var) {
        this.f8809a = 16;
        this.f8810b = l1Var;
    }

    public bc(Object obj, int i10) {
        this.f8809a = i10;
        this.f8810b = obj;
    }
}
