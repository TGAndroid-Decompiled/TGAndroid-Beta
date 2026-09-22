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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
public final class uc implements Runnable {
    public final int f5635a;
    public final Object f5636b;

    public uc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5635a = 1;
        this.f5636b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5636b;
        y2.e eVar = (y2.e) tVar.f7923a.get();
        if (eVar != null) {
            int b10 = tVar.f7925c.b();
            y2.f fVar = eVar.f46261a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f46278n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f46279o != null) {
                        return;
                    }
                    fVar.f46278n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f46279o == null) {
                            Context context = fVar.f46268a;
                            String str = e2.d0.f7885a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f46279o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f46279o = c10;
                        }
                        fVar.f46276l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f46272g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f46273i, fVar.f46276l);
                        fVar.h = elapsedRealtime;
                        fVar.f46273i = 0L;
                        fVar.f46275k = 0L;
                        fVar.f46274j = 0L;
                        y2.r rVar = fVar.f46271f;
                        rVar.f46302a.clear();
                        rVar.f46304c = -1;
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
        switch (this.f5635a) {
            case 0:
                xc xcVar = (xc) this.f5636b;
                MediaMetadataRetriever mediaMetadataRetriever = xcVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(xcVar.f5791j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(xcVar.f5788f, xcVar.f5789g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(xcVar.f5788f / bitmap.getWidth(), xcVar.f5789g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (xcVar.h) {
                                if (xcVar.f5794m == null) {
                                    xcVar.f5794m = new Path();
                                }
                                xcVar.f5794m.rewind();
                                xcVar.f5794m.addCircle(xcVar.f5788f / 2.0f, xcVar.f5789g / 2.0f, Math.min(xcVar.f5788f, xcVar.f5789g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(xcVar.f5794m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, xcVar.f5793l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    AndroidUtilities.runOnUIThread(new b9(3, xcVar, bitmap));
                    return;
                }
                return;
            case 1:
                com.google.firebase.messaging.k.a((Intent) this.f5636b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.f5636b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4257a).edit();
                    String str = (String) cVar.f4258b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4259c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.f0 f0Var = (com.google.firebase.messaging.f0) this.f5636b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + f0Var.f7312a.getAction() + " finishing.");
                f0Var.f7313b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.f5636b;
                fVar.getClass();
                try {
                    ll0 currentListView = ((di.i) fVar.M0).R.getCurrentListView();
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
                ((ei.h0) this.f5636b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.f5636b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.f5636b).d();
                return;
            case 9:
                ((ei.x0) this.f5636b).c();
                return;
            case 10:
                ((ei.x0) this.f5636b).c();
                return;
            case 11:
                ((ei.y0) this.f5636b).a();
                return;
            case 12:
                ((ei.z0) this.f5636b).a();
                return;
            case 13:
                ((ei.j3) this.f5636b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5636b).unlock();
                return;
            case 15:
                ei.p4 p4Var = (ei.p4) this.f5636b;
                p4Var.Q = p4Var.f8550r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.f5636b).f9880y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5636b).getClass();
                return;
            case 18:
                hg.d dVar = (hg.d) this.f5636b;
                dVar.f10244c.Y2.N(true);
                dVar.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5636b).link);
                org.telegram.ui.Components.vc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.m0 m0Var = (hg.m0) this.f5636b;
                w51 w51Var = m0Var.f10354d0;
                if (w51Var != null) {
                    w51Var.N(true);
                }
                m0Var.T(true);
                return;
            case 21:
                hg.v0 v0Var = (hg.v0) ((a6.m) this.f5636b).f307b;
                v0Var.f10439c.Y2.N(true);
                v0Var.b0();
                return;
            case 22:
                hg.x0 x0Var = (hg.x0) this.f5636b;
                x0Var.f10464c.Y2.N(true);
                x0Var.V(true);
                return;
            case 23:
                hg.h1 h1Var = (hg.h1) this.f5636b;
                h1Var.f10302a.Y2.N(true);
                h1Var.Y(true);
                return;
            case 24:
                ((ai.e4) this.f5636b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.c2) this.f5636b).f10238a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5636b;
                ((Context) mVar.f7331b).unregisterReceiver((i2.b) mVar.f7332c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5636b;
                if (bVar.f10622c.f7330a) {
                    bVar.f10620a.f10623a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.e0 e0Var = (i2.e0) this.f5636b;
                e2.c cVar2 = e0Var.E;
                Context context = e0Var.e;
                String str2 = e2.d0.f7885a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar2.f7883f = valueOf;
                e2.b bVar2 = new e2.b(cVar2, valueOf, 0);
                e2.z zVar = (e2.z) cVar2.f7882c;
                if (zVar.f7940a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.e0 e0Var2 = ((i2.b0) this.f5636b).f10623a;
                e0Var2.t1(null);
                e0Var2.m1(0, 0);
                return;
        }
    }

    public uc(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.f5635a = 29;
        this.f5636b = b0Var;
    }

    public uc(Object obj, int i10) {
        this.f5635a = i10;
        this.f5636b = obj;
    }
}
