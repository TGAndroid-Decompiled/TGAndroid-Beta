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
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
public final class uc implements Runnable {
    public final int f5638a;
    public final Object f5639b;

    public uc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5638a = 1;
        this.f5639b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5639b;
        y2.e eVar = (y2.e) tVar.f7926a.get();
        if (eVar != null) {
            int b10 = tVar.f7928c.b();
            y2.f fVar = eVar.f46288a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f46305n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f46306o != null) {
                        return;
                    }
                    fVar.f46305n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f46306o == null) {
                            Context context = fVar.f46295a;
                            String str = e2.d0.f7888a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f46306o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f46306o = c10;
                        }
                        fVar.f46303l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f46299g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f46300i, fVar.f46303l);
                        fVar.h = elapsedRealtime;
                        fVar.f46300i = 0L;
                        fVar.f46302k = 0L;
                        fVar.f46301j = 0L;
                        y2.r rVar = fVar.f46298f;
                        rVar.f46329a.clear();
                        rVar.f46331c = -1;
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
        switch (this.f5638a) {
            case 0:
                xc xcVar = (xc) this.f5639b;
                MediaMetadataRetriever mediaMetadataRetriever = xcVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(xcVar.f5794j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(xcVar.f5791f, xcVar.f5792g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(xcVar.f5791f / bitmap.getWidth(), xcVar.f5792g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (xcVar.h) {
                                if (xcVar.f5797m == null) {
                                    xcVar.f5797m = new Path();
                                }
                                xcVar.f5797m.rewind();
                                xcVar.f5797m.addCircle(xcVar.f5791f / 2.0f, xcVar.f5792g / 2.0f, Math.min(xcVar.f5791f, xcVar.f5792g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(xcVar.f5797m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, xcVar.f5796l);
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
                com.google.firebase.messaging.k.a((Intent) this.f5639b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.f5639b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4260a).edit();
                    String str = (String) cVar.f4261b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4262c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.f0 f0Var = (com.google.firebase.messaging.f0) this.f5639b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + f0Var.f7315a.getAction() + " finishing.");
                f0Var.f7316b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.f5639b;
                fVar.getClass();
                try {
                    ml0 currentListView = ((di.i) fVar.L0).R.getCurrentListView();
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
                ((ei.h0) this.f5639b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.f5639b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.f5639b).d();
                return;
            case 9:
                ((ei.x0) this.f5639b).c();
                return;
            case 10:
                ((ei.x0) this.f5639b).c();
                return;
            case 11:
                ((ei.y0) this.f5639b).a();
                return;
            case 12:
                ((ei.z0) this.f5639b).a();
                return;
            case 13:
                ((ei.j3) this.f5639b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5639b).unlock();
                return;
            case 15:
                ei.p4 p4Var = (ei.p4) this.f5639b;
                p4Var.Q = p4Var.f8553r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.f5639b).f9884y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5639b).getClass();
                return;
            case 18:
                hg.c cVar2 = (hg.c) this.f5639b;
                cVar2.f10240c.Y2.N(true);
                cVar2.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5639b).link);
                org.telegram.ui.Components.vc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.l0 l0Var = (hg.l0) this.f5639b;
                x51 x51Var = l0Var.f10349d0;
                if (x51Var != null) {
                    x51Var.N(true);
                }
                l0Var.T(true);
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) ((a6.m) this.f5639b).f307b;
                u0Var.f10434c.Y2.N(true);
                u0Var.b0();
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.f5639b;
                w0Var.f10461c.Y2.N(true);
                w0Var.V(true);
                return;
            case 23:
                hg.g1 g1Var = (hg.g1) this.f5639b;
                g1Var.f10299a.Y2.N(true);
                g1Var.Y(true);
                return;
            case 24:
                ((ai.e4) this.f5639b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.b2) this.f5639b).f10234a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5639b;
                ((Context) mVar.f7334b).unregisterReceiver((i2.b) mVar.f7335c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5639b;
                if (bVar.f10623c.f7333a) {
                    bVar.f10621a.f10624a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.e0 e0Var = (i2.e0) this.f5639b;
                e2.c cVar3 = e0Var.E;
                Context context = e0Var.e;
                String str2 = e2.d0.f7888a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar3.f7886f = valueOf;
                e2.b bVar2 = new e2.b(cVar3, valueOf, 0);
                e2.z zVar = (e2.z) cVar3.f7885c;
                if (zVar.f7943a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.e0 e0Var2 = ((i2.b0) this.f5639b).f10624a;
                e0Var2.t1(null);
                e0Var2.m1(0, 0);
                return;
        }
    }

    public uc(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.f5638a = 29;
        this.f5639b = b0Var;
    }

    public uc(Object obj, int i10) {
        this.f5638a = i10;
        this.f5639b = obj;
    }
}
