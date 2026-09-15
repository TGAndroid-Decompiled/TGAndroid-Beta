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
    public final int f5633a;
    public final Object f5634b;

    public uc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5633a = 1;
        this.f5634b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5634b;
        y2.e eVar = (y2.e) tVar.f7921a.get();
        if (eVar != null) {
            int b10 = tVar.f7923c.b();
            y2.f fVar = eVar.f46265a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f46282n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f46283o != null) {
                        return;
                    }
                    fVar.f46282n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f46283o == null) {
                            Context context = fVar.f46272a;
                            String str = e2.d0.f7883a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f46283o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f46283o = c10;
                        }
                        fVar.f46280l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f46276g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f46277i, fVar.f46280l);
                        fVar.h = elapsedRealtime;
                        fVar.f46277i = 0L;
                        fVar.f46279k = 0L;
                        fVar.f46278j = 0L;
                        y2.r rVar = fVar.f46275f;
                        rVar.f46306a.clear();
                        rVar.f46308c = -1;
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
        switch (this.f5633a) {
            case 0:
                xc xcVar = (xc) this.f5634b;
                MediaMetadataRetriever mediaMetadataRetriever = xcVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(xcVar.f5789j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(xcVar.f5786f, xcVar.f5787g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(xcVar.f5786f / bitmap.getWidth(), xcVar.f5787g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (xcVar.h) {
                                if (xcVar.f5792m == null) {
                                    xcVar.f5792m = new Path();
                                }
                                xcVar.f5792m.rewind();
                                xcVar.f5792m.addCircle(xcVar.f5786f / 2.0f, xcVar.f5787g / 2.0f, Math.min(xcVar.f5786f, xcVar.f5787g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(xcVar.f5792m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, xcVar.f5791l);
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
                com.google.firebase.messaging.k.a((Intent) this.f5634b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.f5634b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4255a).edit();
                    String str = (String) cVar.f4256b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4257c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.f0 f0Var = (com.google.firebase.messaging.f0) this.f5634b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + f0Var.f7310a.getAction() + " finishing.");
                f0Var.f7311b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.f5634b;
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
                ((ei.h0) this.f5634b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.f5634b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.f5634b).d();
                return;
            case 9:
                ((ei.x0) this.f5634b).c();
                return;
            case 10:
                ((ei.x0) this.f5634b).c();
                return;
            case 11:
                ((ei.y0) this.f5634b).a();
                return;
            case 12:
                ((ei.z0) this.f5634b).a();
                return;
            case 13:
                ((ei.j3) this.f5634b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5634b).unlock();
                return;
            case 15:
                ei.p4 p4Var = (ei.p4) this.f5634b;
                p4Var.Q = p4Var.f8548r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.f5634b).f9879y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5634b).getClass();
                return;
            case 18:
                hg.c cVar2 = (hg.c) this.f5634b;
                cVar2.f10235c.Y2.N(true);
                cVar2.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5634b).link);
                org.telegram.ui.Components.vc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.l0 l0Var = (hg.l0) this.f5634b;
                w51 w51Var = l0Var.f10344d0;
                if (w51Var != null) {
                    w51Var.N(true);
                }
                l0Var.T(true);
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) ((a6.m) this.f5634b).f305b;
                u0Var.f10429c.Y2.N(true);
                u0Var.b0();
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.f5634b;
                w0Var.f10456c.Y2.N(true);
                w0Var.V(true);
                return;
            case 23:
                hg.g1 g1Var = (hg.g1) this.f5634b;
                g1Var.f10294a.Y2.N(true);
                g1Var.Y(true);
                return;
            case 24:
                ((ai.e4) this.f5634b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.b2) this.f5634b).f10229a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5634b;
                ((Context) mVar.f7329b).unregisterReceiver((i2.b) mVar.f7330c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5634b;
                if (bVar.f10620c.f7328a) {
                    bVar.f10618a.f10621a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.e0 e0Var = (i2.e0) this.f5634b;
                e2.c cVar3 = e0Var.E;
                Context context = e0Var.e;
                String str2 = e2.d0.f7883a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar3.f7881f = valueOf;
                e2.b bVar2 = new e2.b(cVar3, valueOf, 0);
                e2.z zVar = (e2.z) cVar3.f7880c;
                if (zVar.f7938a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.e0 e0Var2 = ((i2.b0) this.f5634b).f10621a;
                e0Var2.t1(null);
                e0Var2.m1(0, 0);
                return;
        }
    }

    public uc(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.f5633a = 29;
        this.f5634b = b0Var;
    }

    public uc(Object obj, int i10) {
        this.f5633a = i10;
        this.f5634b = obj;
    }
}
