package ei;

import ai.wc;
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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class bc implements Runnable {
    public final int f8802a;
    public final Object f8803b;

    public bc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f8802a = 15;
        this.f8803b = c0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        Object obj;
        Bitmap bitmap = null;
        switch (this.f8802a) {
            case 0:
                ec ecVar = (ec) this.f8803b;
                MediaMetadataRetriever mediaMetadataRetriever = ecVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(ecVar.f8988j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(ecVar.f8985f, ecVar.f8986g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(ecVar.f8985f / bitmap.getWidth(), ecVar.f8986g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (ecVar.h) {
                                if (ecVar.f8991m == null) {
                                    ecVar.f8991m = new Path();
                                }
                                ecVar.f8991m.rewind();
                                ecVar.f8991m.addCircle(ecVar.f8985f / 2.0f, ecVar.f8986g / 2.0f, Math.min(ecVar.f8985f, ecVar.f8986g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(ecVar.f8991m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, ecVar.f8990l);
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
                wc wcVar = (wc) this.f8803b;
                wcVar.getClass();
                try {
                    im0 currentListView = ((fi.g) wcVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                ((gi.f0) this.f8803b).invalidateSelf();
                return;
            case 3:
                ((gi.g0) this.f8803b).invalidateSelf();
                return;
            case 4:
                ((gi.i0) this.f8803b).d();
                return;
            case 5:
                ((gi.v0) this.f8803b).c();
                return;
            case 6:
                ((gi.v0) this.f8803b).c();
                return;
            case 7:
                ((gi.w0) this.f8803b).a();
                return;
            case 8:
                ((gi.x0) this.f8803b).a();
                return;
            case 9:
                ((gi.c3) this.f8803b).invalidate();
                return;
            case 10:
                ((AnimationNotificationsLocker) this.f8803b).unlock();
                return;
            case 11:
                gi.e4 e4Var = (gi.e4) this.f8803b;
                e4Var.Q = e4Var.f11189r;
                return;
            case 12:
                ((e2.j0) this.f8803b).getClass();
                return;
            case 13:
                ci.u6 u6Var = ((hg.n1) this.f8803b).f12000y;
                if (u6Var != null) {
                    u6Var.p(3, true);
                    return;
                }
                return;
            case 14:
                i2.i0 i0Var = (i2.i0) this.f8803b;
                e2.c cVar = i0Var.C;
                Context context = i0Var.e;
                String str = e2.m0.f8254a;
                int generateAudioSessionId = c2.i.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((e2.i0) cVar.f8206c).f8239a.getLooper()) {
                    obj = cVar.e;
                } else {
                    if (myLooper == ((e2.i0) cVar.f8205b).f8239a.getLooper()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v7.u6.p(z10);
                    obj = cVar.f8207f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f8207f = valueOf;
                    e2.b bVar = new e2.b(cVar, valueOf, 0);
                    e2.i0 i0Var2 = (e2.i0) cVar.f8206c;
                    if (i0Var2.f8239a.getLooper().getThread().isAlive()) {
                        i0Var2.d(bVar);
                    }
                    i0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    i0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 15:
                i2.i0 i0Var3 = ((i2.c0) this.f8803b).f12327a;
                i0Var3.x1(null);
                i0Var3.q1(0, 0);
                return;
            case 16:
                try {
                    i2.r0.g((i2.m1) this.f8803b);
                    return;
                } catch (i2.n e7) {
                    e2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 17:
                ig.c cVar2 = (ig.c) this.f8803b;
                cVar2.f12838c.W2.N(true);
                cVar2.V(true);
                return;
            case 18:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f8803b).link);
                xc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 19:
                ig.k0 k0Var = (ig.k0) this.f8803b;
                t61 t61Var = k0Var.f12948d0;
                if (t61Var != null) {
                    t61Var.N(true);
                }
                k0Var.U(true);
                return;
            case 20:
                ig.t0 t0Var = (ig.t0) ((a6.i) this.f8803b).f307b;
                t0Var.f13034c.W2.N(true);
                t0Var.b0();
                return;
            case 21:
                ig.v0 v0Var = (ig.v0) this.f8803b;
                v0Var.f13059c.W2.N(true);
                v0Var.V(true);
                return;
            case 22:
                ig.f1 f1Var = (ig.f1) this.f8803b;
                f1Var.f12892a.W2.N(true);
                f1Var.Y(true);
                return;
            case 23:
                ((ci.z2) this.f8803b).run(Boolean.FALSE);
                return;
            case 24:
                NotificationCenter.getInstance(((ig.a2) this.f8803b).f12827a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 25:
                j2.f fVar = (j2.f) this.f8803b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4));
                fVar.f13944f.d();
                return;
            case 26:
                ((k2.e) this.f8803b).c();
                return;
            case 27:
                e2.r rVar = (e2.r) this.f8803b;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f8274a) {
                    rVar.e(-1, new j2.e(28));
                    return;
                }
                return;
            case 28:
                k2.t0 t0Var2 = (k2.t0) this.f8803b;
                if (t0Var2.f14803a0 >= 300000) {
                    t0Var2.f14814n.j();
                    t0Var2.f14803a0 = 0L;
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f8803b).f22401b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
        }
    }

    public bc(i2.r0 r0Var, i2.m1 m1Var) {
        this.f8802a = 16;
        this.f8803b = m1Var;
    }

    public bc(Object obj, int i10) {
        this.f8802a = i10;
        this.f8803b = obj;
    }
}
