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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.LaunchActivity;
public final class rc implements Runnable {
    public final int f5914a;
    public final Object f5915b;

    public rc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5914a = 1;
        this.f5915b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5915b;
        y2.e eVar = (y2.e) tVar.f8573a.get();
        if (eVar != null) {
            int b10 = tVar.f8575c.b();
            y2.f fVar = eVar.f51753a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f51771n;
                    if (i11 != 0 && !fVar.f51763e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f51772o != null) {
                        return;
                    }
                    fVar.f51771n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f51772o == null) {
                            Context context = fVar.f51760a;
                            String str = e2.d0.f8531a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f51772o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f51772o = c10;
                        }
                        fVar.f51769l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f51765g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f51766i, fVar.f51769l);
                        fVar.h = elapsedRealtime;
                        fVar.f51766i = 0L;
                        fVar.f51768k = 0L;
                        fVar.f51767j = 0L;
                        y2.q qVar = fVar.f51764f;
                        qVar.f51795a.clear();
                        qVar.f51797c = -1;
                        qVar.d = 0;
                        qVar.f51798e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        Bitmap bitmap = null;
        switch (this.f5914a) {
            case 0:
                uc ucVar = (uc) this.f5915b;
                MediaMetadataRetriever mediaMetadataRetriever = ucVar.f6108e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(ucVar.f6112j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(ucVar.f6109f, ucVar.f6110g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(ucVar.f6109f / bitmap.getWidth(), ucVar.f6110g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.u(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.u(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.x(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.x(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (ucVar.h) {
                                if (ucVar.f6115m == null) {
                                    ucVar.f6115m = new Path();
                                }
                                ucVar.f6115m.rewind();
                                ucVar.f6115m.addCircle(ucVar.f6109f / 2.0f, ucVar.f6110g / 2.0f, Math.min(ucVar.f6109f, ucVar.f6110g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(ucVar.f6115m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, ucVar.f6114l);
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
                com.google.firebase.messaging.k.a((Intent) this.f5915b);
                return;
            case 2:
                u5 u5Var = (u5) this.f5915b;
                synchronized (((ArrayDeque) u5Var.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) u5Var.f6064a).edit();
                    String str = (String) u5Var.f6065b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) u5Var.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) u5Var.f6066c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.e0 e0Var = (com.google.firebase.messaging.e0) this.f5915b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.f7929a.getAction() + " finishing.");
                e0Var.f7930b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.f5915b;
                fVar.getClass();
                try {
                    sm0 currentListView = ((di.i) fVar.M0).R.getCurrentListView();
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
                ((ei.h0) this.f5915b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.f5915b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.f5915b).d();
                return;
            case 9:
                ((ei.x0) this.f5915b).c();
                return;
            case 10:
                ((ei.x0) this.f5915b).c();
                return;
            case 11:
                ((ei.y0) this.f5915b).a();
                return;
            case 12:
                ((ei.z0) this.f5915b).a();
                return;
            case 13:
                ((ei.j3) this.f5915b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5915b).unlock();
                return;
            case 15:
                ei.o4 o4Var = (ei.o4) this.f5915b;
                o4Var.Q = o4Var.f9264r;
                return;
            case 16:
                ai.w8 w8Var = ((gg.n1) this.f5915b).f10746y;
                if (w8Var != null) {
                    w8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5915b).getClass();
                return;
            case 18:
                hg.d dVar = (hg.d) this.f5915b;
                dVar.f11188c.W2.N(true);
                dVar.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5915b).link);
                org.telegram.ui.Components.ad.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.l0 l0Var = (hg.l0) this.f5915b;
                e71 e71Var = l0Var.f11307d0;
                if (e71Var != null) {
                    e71Var.N(true);
                }
                l0Var.U(true);
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) ((a4.l) this.f5915b).f297b;
                u0Var.f11400c.W2.N(true);
                u0Var.b0();
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.f5915b;
                w0Var.f11422c.W2.N(true);
                w0Var.V(true);
                return;
            case 23:
                hg.g1 g1Var = (hg.g1) this.f5915b;
                g1Var.f11244a.W2.N(true);
                g1Var.Y(true);
                return;
            case 24:
                ((ai.f4) this.f5915b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.c2) this.f5915b).f11181a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5915b;
                ((Context) mVar.f7951b).unregisterReceiver((i2.b) mVar.f7952c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5915b;
                if (bVar.f11611c.f7950a) {
                    bVar.f11609a.f11619a.A1(3, false);
                    return;
                }
                return;
            case 28:
                i2.f0 f0Var = (i2.f0) this.f5915b;
                e2.c cVar = f0Var.E;
                Context context = f0Var.f11660e;
                String str2 = e2.d0.f8531a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar.f8529f = valueOf;
                e2.b bVar2 = new e2.b(cVar, valueOf, 0);
                e2.z zVar = (e2.z) cVar.f8527c;
                if (zVar.f8592a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.f0 f0Var2 = ((i2.c0) this.f5915b).f11619a;
                f0Var2.v1(null);
                f0Var2.o1(0, 0);
                return;
        }
    }

    public rc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5914a = 29;
        this.f5915b = c0Var;
    }

    public rc(Object obj, int i10) {
        this.f5914a = i10;
        this.f5915b = obj;
    }
}
