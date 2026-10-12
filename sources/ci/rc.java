package ci;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.LaunchActivity;
public final class rc implements Runnable {
    public final int f5913a;
    public final Object f5914b;

    public rc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5913a = 1;
        this.f5914b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5914b;
        y2.e eVar = (y2.e) tVar.f8571a.get();
        if (eVar != null) {
            int b10 = tVar.f8573c.b();
            y2.f fVar = eVar.f51890a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f51908n;
                    if (i11 != 0 && !fVar.f51900e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f51909o != null) {
                        return;
                    }
                    fVar.f51908n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f51909o == null) {
                            Context context = fVar.f51897a;
                            String str = e2.d0.f8529a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f51909o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f51909o = c10;
                        }
                        fVar.f51906l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f51902g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f51903i, fVar.f51906l);
                        fVar.h = elapsedRealtime;
                        fVar.f51903i = 0L;
                        fVar.f51905k = 0L;
                        fVar.f51904j = 0L;
                        y2.q qVar = fVar.f51901f;
                        qVar.f51932a.clear();
                        qVar.f51934c = -1;
                        qVar.d = 0;
                        qVar.f51935e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        Bitmap bitmap = null;
        switch (this.f5913a) {
            case 0:
                uc ucVar = (uc) this.f5914b;
                MediaMetadataRetriever mediaMetadataRetriever = ucVar.f6107e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(ucVar.f6111j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(ucVar.f6108f, ucVar.f6109g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(ucVar.f6108f / bitmap.getWidth(), ucVar.f6109g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.u(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.u(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.x(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.x(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (ucVar.h) {
                                if (ucVar.f6114m == null) {
                                    ucVar.f6114m = new Path();
                                }
                                ucVar.f6114m.rewind();
                                ucVar.f6114m.addCircle(ucVar.f6108f / 2.0f, ucVar.f6109g / 2.0f, Math.min(ucVar.f6108f, ucVar.f6109g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(ucVar.f6114m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, ucVar.f6113l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    AndroidUtilities.runOnUIThread(new y8(3, ucVar, bitmap));
                    return;
                }
                return;
            case 1:
                com.google.firebase.messaging.k.a((Intent) this.f5914b);
                return;
            case 2:
                u5 u5Var = (u5) this.f5914b;
                synchronized (((ArrayDeque) u5Var.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) u5Var.f6063a).edit();
                    String str = (String) u5Var.f6064b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) u5Var.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) u5Var.f6065c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.d0 d0Var = (com.google.firebase.messaging.d0) this.f5914b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.f7925a.getAction() + " finishing.");
                d0Var.f7926b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.f5914b;
                fVar.getClass();
                try {
                    wm0 currentListView = ((di.i) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                a();
                return;
            case 6:
                ((ei.h0) this.f5914b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.f5914b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.f5914b).d();
                return;
            case 9:
                ((ei.x0) this.f5914b).c();
                return;
            case 10:
                ((ei.x0) this.f5914b).c();
                return;
            case 11:
                ((ei.y0) this.f5914b).a();
                return;
            case 12:
                ((ei.z0) this.f5914b).a();
                return;
            case 13:
                ((ei.j3) this.f5914b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5914b).unlock();
                return;
            case 15:
                ei.o4 o4Var = (ei.o4) this.f5914b;
                o4Var.Q = o4Var.f9262r;
                return;
            case 16:
                ai.w8 w8Var = ((gg.n1) this.f5914b).f10745y;
                if (w8Var != null) {
                    w8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5914b).getClass();
                return;
            case 18:
                hg.d dVar = (hg.d) this.f5914b;
                dVar.f11187c.W2.N(true);
                dVar.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5914b).link);
                org.telegram.ui.Components.zc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.l0 l0Var = (hg.l0) this.f5914b;
                h71 h71Var = l0Var.f11306d0;
                if (h71Var != null) {
                    h71Var.N(true);
                }
                l0Var.U(true);
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) ((a4.l) this.f5914b).f297b;
                u0Var.f11399c.W2.N(true);
                u0Var.b0();
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.f5914b;
                w0Var.f11421c.W2.N(true);
                w0Var.V(true);
                return;
            case 23:
                hg.g1 g1Var = (hg.g1) this.f5914b;
                g1Var.f11243a.W2.N(true);
                g1Var.Y(true);
                return;
            case 24:
                ((ai.f4) this.f5914b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.c2) this.f5914b).f11180a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5914b;
                ((Context) mVar.f7948b).unregisterReceiver((i2.b) mVar.f7949c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5914b;
                if (bVar.f11610c.f7947a) {
                    bVar.f11608a.f11618a.A1(3, false);
                    return;
                }
                return;
            case 28:
                i2.f0 f0Var = (i2.f0) this.f5914b;
                e2.c cVar = f0Var.E;
                Context context = f0Var.f11659e;
                String str2 = e2.d0.f8529a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar.f8527f = valueOf;
                e2.b bVar2 = new e2.b(cVar, valueOf, 0);
                e2.z zVar = (e2.z) cVar.f8525c;
                if (zVar.f8590a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.f0 f0Var2 = ((i2.c0) this.f5914b).f11618a;
                f0Var2.v1(null);
                f0Var2.o1(0, 0);
                return;
        }
    }

    public rc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5913a = 29;
        this.f5914b = c0Var;
    }

    public rc(Object obj, int i10) {
        this.f5913a = i10;
        this.f5914b = obj;
    }
}
