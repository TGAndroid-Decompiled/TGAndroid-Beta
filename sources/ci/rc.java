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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
public final class rc implements Runnable {
    public final int f5474a;
    public final Object f5475b;

    public rc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5474a = 1;
        this.f5475b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5475b;
        y2.e eVar = (y2.e) tVar.f7920a.get();
        if (eVar != null) {
            int b10 = tVar.f7922c.b();
            y2.f fVar = eVar.f46655a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f46672n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f46673o != null) {
                        return;
                    }
                    fVar.f46672n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f46673o == null) {
                            Context context = fVar.f46662a;
                            String str = e2.d0.f7882a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.s6.c(networkCountryIso);
                                    fVar.f46673o = c10;
                                }
                            }
                            c10 = v7.s6.c(Locale.getDefault().getCountry());
                            fVar.f46673o = c10;
                        }
                        fVar.f46670l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f46666g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f46667i, fVar.f46670l);
                        fVar.h = elapsedRealtime;
                        fVar.f46667i = 0L;
                        fVar.f46669k = 0L;
                        fVar.f46668j = 0L;
                        y2.q qVar = fVar.f46665f;
                        qVar.f46693a.clear();
                        qVar.f46695c = -1;
                        qVar.d = 0;
                        qVar.e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        Bitmap bitmap = null;
        switch (this.f5474a) {
            case 0:
                uc ucVar = (uc) this.f5475b;
                MediaMetadataRetriever mediaMetadataRetriever = ucVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(ucVar.f5657j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(ucVar.f5654f, ucVar.f5655g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(ucVar.f5654f / bitmap.getWidth(), ucVar.f5655g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (ucVar.h) {
                                if (ucVar.f5660m == null) {
                                    ucVar.f5660m = new Path();
                                }
                                ucVar.f5660m.rewind();
                                ucVar.f5660m.addCircle(ucVar.f5654f / 2.0f, ucVar.f5655g / 2.0f, Math.min(ucVar.f5654f, ucVar.f5655g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(ucVar.f5660m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, ucVar.f5659l);
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
                com.google.firebase.messaging.k.a((Intent) this.f5475b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.f5475b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4259a).edit();
                    String str = (String) cVar.f4260b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4261c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.e0 e0Var = (com.google.firebase.messaging.e0) this.f5475b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.f7302a.getAction() + " finishing.");
                e0Var.f7303b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.f5475b;
                fVar.getClass();
                try {
                    zl0 currentListView = ((di.i) fVar.M0).R.getCurrentListView();
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
                ((ei.h0) this.f5475b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.f5475b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.f5475b).d();
                return;
            case 9:
                ((ei.x0) this.f5475b).c();
                return;
            case 10:
                ((ei.x0) this.f5475b).c();
                return;
            case 11:
                ((ei.y0) this.f5475b).a();
                return;
            case 12:
                ((ei.z0) this.f5475b).a();
                return;
            case 13:
                ((ei.j3) this.f5475b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5475b).unlock();
                return;
            case 15:
                ei.p4 p4Var = (ei.p4) this.f5475b;
                p4Var.Q = p4Var.f8547r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.f5475b).f9877y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5475b).getClass();
                return;
            case 18:
                hg.d dVar = (hg.d) this.f5475b;
                dVar.f10244c.f28778f3.N(true);
                dVar.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5475b).link);
                org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.m0 m0Var = (hg.m0) this.f5475b;
                m61 m61Var = m0Var.f10354d0;
                if (m61Var != null) {
                    m61Var.N(true);
                }
                m0Var.T(true);
                return;
            case 21:
                hg.v0 v0Var = (hg.v0) ((a6.m) this.f5475b).f307b;
                v0Var.f10439c.f28778f3.N(true);
                v0Var.b0();
                return;
            case 22:
                hg.x0 x0Var = (hg.x0) this.f5475b;
                x0Var.f10464c.f28778f3.N(true);
                x0Var.V(true);
                return;
            case 23:
                hg.h1 h1Var = (hg.h1) this.f5475b;
                h1Var.f10302a.f28778f3.N(true);
                h1Var.Y(true);
                return;
            case 24:
                ((ai.e4) this.f5475b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.c2) this.f5475b).f10238a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5475b;
                ((Context) mVar.f7322b).unregisterReceiver((i2.b) mVar.f7323c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5475b;
                if (bVar.f10623c.f7321a) {
                    bVar.f10621a.f10630a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.f0 f0Var = (i2.f0) this.f5475b;
                e2.c cVar2 = f0Var.E;
                Context context = f0Var.e;
                String str2 = e2.d0.f7882a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar2.f7880f = valueOf;
                e2.b bVar2 = new e2.b(cVar2, valueOf, 0);
                e2.z zVar = (e2.z) cVar2.f7879c;
                if (zVar.f7937a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.f0 f0Var2 = ((i2.c0) this.f5475b).f10630a;
                f0Var2.t1(null);
                f0Var2.m1(0, 0);
                return;
        }
    }

    public rc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5474a = 29;
        this.f5475b = c0Var;
    }

    public rc(Object obj, int i10) {
        this.f5474a = i10;
        this.f5475b = obj;
    }
}
