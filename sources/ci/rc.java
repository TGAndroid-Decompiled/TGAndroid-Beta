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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
public final class rc implements Runnable {
    public final int f5465a;
    public final Object f5466b;

    public rc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5465a = 1;
        this.f5466b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5466b;
        y2.e eVar = (y2.e) tVar.f7909a.get();
        if (eVar != null) {
            int b10 = tVar.f7911c.b();
            y2.f fVar = eVar.f46219a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f46236n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f46237o != null) {
                        return;
                    }
                    fVar.f46236n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f46237o == null) {
                            Context context = fVar.f46226a;
                            String str = e2.d0.f7871a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f46237o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f46237o = c10;
                        }
                        fVar.f46234l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f46230g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f46231i, fVar.f46234l);
                        fVar.h = elapsedRealtime;
                        fVar.f46231i = 0L;
                        fVar.f46233k = 0L;
                        fVar.f46232j = 0L;
                        y2.r rVar = fVar.f46229f;
                        rVar.f46260a.clear();
                        rVar.f46262c = -1;
                        rVar.d = 0;
                        rVar.e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        Bitmap bitmap = null;
        switch (this.f5465a) {
            case 0:
                uc ucVar = (uc) this.f5466b;
                MediaMetadataRetriever mediaMetadataRetriever = ucVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(ucVar.f5648j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(ucVar.f5645f, ucVar.f5646g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(ucVar.f5645f / bitmap.getWidth(), ucVar.f5646g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (ucVar.h) {
                                if (ucVar.f5651m == null) {
                                    ucVar.f5651m = new Path();
                                }
                                ucVar.f5651m.rewind();
                                ucVar.f5651m.addCircle(ucVar.f5645f / 2.0f, ucVar.f5646g / 2.0f, Math.min(ucVar.f5645f, ucVar.f5646g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(ucVar.f5651m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, ucVar.f5650l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    AndroidUtilities.runOnUIThread(new y8(3, ucVar, bitmap));
                    return;
                }
                return;
            case 1:
                com.google.firebase.messaging.k.a((Intent) this.f5466b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.f5466b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4252a).edit();
                    String str = (String) cVar.f4253b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4254c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.f0 f0Var = (com.google.firebase.messaging.f0) this.f5466b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + f0Var.f7298a.getAction() + " finishing.");
                f0Var.f7299b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.f5466b;
                fVar.getClass();
                try {
                    ml0 currentListView = ((di.i) fVar.M0).R.getCurrentListView();
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
                ((ei.h0) this.f5466b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.f5466b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.f5466b).d();
                return;
            case 9:
                ((ei.x0) this.f5466b).c();
                return;
            case 10:
                ((ei.x0) this.f5466b).c();
                return;
            case 11:
                ((ei.y0) this.f5466b).a();
                return;
            case 12:
                ((ei.z0) this.f5466b).a();
                return;
            case 13:
                ((ei.j3) this.f5466b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5466b).unlock();
                return;
            case 15:
                ei.p4 p4Var = (ei.p4) this.f5466b;
                p4Var.Q = p4Var.f8536r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.f5466b).f9866y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5466b).getClass();
                return;
            case 18:
                hg.d dVar = (hg.d) this.f5466b;
                dVar.f10230c.Y2.N(true);
                dVar.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5466b).link);
                org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.m0 m0Var = (hg.m0) this.f5466b;
                v51 v51Var = m0Var.f10340d0;
                if (v51Var != null) {
                    v51Var.N(true);
                }
                m0Var.T(true);
                return;
            case 21:
                hg.v0 v0Var = (hg.v0) ((a6.m) this.f5466b).f307b;
                v0Var.f10425c.Y2.N(true);
                v0Var.b0();
                return;
            case 22:
                hg.x0 x0Var = (hg.x0) this.f5466b;
                x0Var.f10450c.Y2.N(true);
                x0Var.V(true);
                return;
            case 23:
                hg.h1 h1Var = (hg.h1) this.f5466b;
                h1Var.f10288a.Y2.N(true);
                h1Var.Y(true);
                return;
            case 24:
                ((ai.e4) this.f5466b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.c2) this.f5466b).f10224a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5466b;
                ((Context) mVar.f7317b).unregisterReceiver((i2.b) mVar.f7318c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5466b;
                if (bVar.f10609c.f7316a) {
                    bVar.f10607a.f10616a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.f0 f0Var2 = (i2.f0) this.f5466b;
                e2.c cVar2 = f0Var2.E;
                Context context = f0Var2.e;
                String str2 = e2.d0.f7871a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar2.f7869f = valueOf;
                e2.b bVar2 = new e2.b(cVar2, valueOf, 0);
                e2.z zVar = (e2.z) cVar2.f7868c;
                if (zVar.f7926a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.f0 f0Var3 = ((i2.c0) this.f5466b).f10616a;
                f0Var3.t1(null);
                f0Var3.m1(0, 0);
                return;
        }
    }

    public rc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5465a = 29;
        this.f5466b = c0Var;
    }

    public rc(Object obj, int i10) {
        this.f5465a = i10;
        this.f5466b = obj;
    }
}
