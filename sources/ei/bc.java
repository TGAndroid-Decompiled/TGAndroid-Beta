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
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class bc implements Runnable {
    public final int f8801a;
    public final Object f8802b;

    public bc(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.f8801a = 15;
        this.f8802b = b0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        Object obj;
        Bitmap bitmap = null;
        switch (this.f8801a) {
            case 0:
                ec ecVar = (ec) this.f8802b;
                MediaMetadataRetriever mediaMetadataRetriever = ecVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(ecVar.f8987j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(ecVar.f8984f, ecVar.f8985g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(ecVar.f8984f / bitmap.getWidth(), ecVar.f8985g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (ecVar.h) {
                                if (ecVar.f8990m == null) {
                                    ecVar.f8990m = new Path();
                                }
                                ecVar.f8990m.rewind();
                                ecVar.f8990m.addCircle(ecVar.f8984f / 2.0f, ecVar.f8985g / 2.0f, Math.min(ecVar.f8984f, ecVar.f8985g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(ecVar.f8990m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, ecVar.f8989l);
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
                wc wcVar = (wc) this.f8802b;
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
                ((gi.f0) this.f8802b).invalidateSelf();
                return;
            case 3:
                ((gi.g0) this.f8802b).invalidateSelf();
                return;
            case 4:
                ((gi.i0) this.f8802b).d();
                return;
            case 5:
                ((gi.v0) this.f8802b).c();
                return;
            case 6:
                ((gi.v0) this.f8802b).c();
                return;
            case 7:
                ((gi.w0) this.f8802b).a();
                return;
            case 8:
                ((gi.x0) this.f8802b).a();
                return;
            case 9:
                ((gi.c3) this.f8802b).invalidate();
                return;
            case 10:
                ((AnimationNotificationsLocker) this.f8802b).unlock();
                return;
            case 11:
                gi.e4 e4Var = (gi.e4) this.f8802b;
                e4Var.Q = e4Var.f11188r;
                return;
            case 12:
                ((e2.j0) this.f8802b).getClass();
                return;
            case 13:
                ci.t6 t6Var = ((hg.n1) this.f8802b).f11999y;
                if (t6Var != null) {
                    t6Var.p(3, true);
                    return;
                }
                return;
            case 14:
                i2.h0 h0Var = (i2.h0) this.f8802b;
                e2.c cVar = h0Var.C;
                Context context = h0Var.e;
                String str = e2.m0.f8253a;
                int generateAudioSessionId = c2.i.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((e2.i0) cVar.f8205c).f8238a.getLooper()) {
                    obj = cVar.e;
                } else {
                    if (myLooper == ((e2.i0) cVar.f8204b).f8238a.getLooper()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v7.u6.p(z10);
                    obj = cVar.f8206f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f8206f = valueOf;
                    e2.b bVar = new e2.b(cVar, valueOf, 0);
                    e2.i0 i0Var = (e2.i0) cVar.f8205c;
                    if (i0Var.f8238a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    h0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    h0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 15:
                i2.h0 h0Var2 = ((i2.b0) this.f8802b).f12322a;
                h0Var2.x1(null);
                h0Var2.q1(0, 0);
                return;
            case 16:
                try {
                    i2.q0.f((i2.l1) this.f8802b);
                    return;
                } catch (i2.m e7) {
                    e2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 17:
                ig.c cVar2 = (ig.c) this.f8802b;
                cVar2.f12836c.W2.N(true);
                cVar2.V(true);
                return;
            case 18:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f8802b).link);
                xc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 19:
                ig.k0 k0Var = (ig.k0) this.f8802b;
                s61 s61Var = k0Var.f12946d0;
                if (s61Var != null) {
                    s61Var.N(true);
                }
                k0Var.U(true);
                return;
            case 20:
                ig.t0 t0Var = (ig.t0) ((a6.i) this.f8802b).f306b;
                t0Var.f13032c.W2.N(true);
                t0Var.b0();
                return;
            case 21:
                ig.v0 v0Var = (ig.v0) this.f8802b;
                v0Var.f13057c.W2.N(true);
                v0Var.V(true);
                return;
            case 22:
                ig.f1 f1Var = (ig.f1) this.f8802b;
                f1Var.f12890a.W2.N(true);
                f1Var.Y(true);
                return;
            case 23:
                ((ci.y2) this.f8802b).run(Boolean.FALSE);
                return;
            case 24:
                NotificationCenter.getInstance(((ig.a2) this.f8802b).f12825a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 25:
                j2.f fVar = (j2.f) this.f8802b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4));
                fVar.f13942f.d();
                return;
            case 26:
                ((k2.e) this.f8802b).c();
                return;
            case 27:
                e2.r rVar = (e2.r) this.f8802b;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f8273a) {
                    rVar.e(-1, new j2.e(28));
                    return;
                }
                return;
            case 28:
                k2.t0 t0Var2 = (k2.t0) this.f8802b;
                if (t0Var2.f14801a0 >= 300000) {
                    t0Var2.f14812n.j();
                    t0Var2.f14801a0 = 0L;
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f8802b).f22398b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
        }
    }

    public bc(i2.q0 q0Var, i2.l1 l1Var) {
        this.f8801a = 16;
        this.f8802b = l1Var;
    }

    public bc(Object obj, int i10) {
        this.f8801a = i10;
        this.f8802b = obj;
    }
}
