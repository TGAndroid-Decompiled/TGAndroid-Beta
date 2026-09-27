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
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
public final class qc implements Runnable {
    public final int f5390a;
    public final Object f5391b;

    public qc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5390a = 1;
        this.f5391b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5391b;
        y2.e eVar = (y2.e) tVar.f7910a.get();
        if (eVar != null) {
            int b10 = tVar.f7912c.b();
            y2.f fVar = eVar.f46592a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f46609n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f46610o != null) {
                        return;
                    }
                    fVar.f46609n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f46610o == null) {
                            Context context = fVar.f46599a;
                            String str = e2.d0.f7872a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.s6.c(networkCountryIso);
                                    fVar.f46610o = c10;
                                }
                            }
                            c10 = v7.s6.c(Locale.getDefault().getCountry());
                            fVar.f46610o = c10;
                        }
                        fVar.f46607l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f46603g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f46604i, fVar.f46607l);
                        fVar.h = elapsedRealtime;
                        fVar.f46604i = 0L;
                        fVar.f46606k = 0L;
                        fVar.f46605j = 0L;
                        y2.q qVar = fVar.f46602f;
                        qVar.f46630a.clear();
                        qVar.f46632c = -1;
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
        switch (this.f5390a) {
            case 0:
                tc tcVar = (tc) this.f5391b;
                MediaMetadataRetriever mediaMetadataRetriever = tcVar.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(tcVar.f5604j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(tcVar.f5601f, tcVar.f5602g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(tcVar.f5601f / bitmap.getWidth(), tcVar.f5602g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (tcVar.h) {
                                if (tcVar.f5607m == null) {
                                    tcVar.f5607m = new Path();
                                }
                                tcVar.f5607m.rewind();
                                tcVar.f5607m.addCircle(tcVar.f5601f / 2.0f, tcVar.f5602g / 2.0f, Math.min(tcVar.f5601f, tcVar.f5602g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(tcVar.f5607m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, tcVar.f5606l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    AndroidUtilities.runOnUIThread(new x8(3, tcVar, bitmap));
                    return;
                }
                return;
            case 1:
                com.google.firebase.messaging.k.a((Intent) this.f5391b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.f5391b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4254a).edit();
                    String str = (String) cVar.f4255b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4256c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.f0 f0Var = (com.google.firebase.messaging.f0) this.f5391b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + f0Var.f7299a.getAction() + " finishing.");
                f0Var.f7300b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.f5391b;
                fVar.getClass();
                try {
                    yl0 currentListView = ((di.i) fVar.L0).R.getCurrentListView();
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
                ((ei.h0) this.f5391b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.f5391b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.f5391b).d();
                return;
            case 9:
                ((ei.x0) this.f5391b).c();
                return;
            case 10:
                ((ei.x0) this.f5391b).c();
                return;
            case 11:
                ((ei.y0) this.f5391b).a();
                return;
            case 12:
                ((ei.z0) this.f5391b).a();
                return;
            case 13:
                ((ei.j3) this.f5391b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5391b).unlock();
                return;
            case 15:
                ei.p4 p4Var = (ei.p4) this.f5391b;
                p4Var.Q = p4Var.f8538r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.f5391b).f9871y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5391b).getClass();
                return;
            case 18:
                hg.c cVar2 = (hg.c) this.f5391b;
                cVar2.f10228c.Y2.N(true);
                cVar2.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5391b).link);
                org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.l0 l0Var = (hg.l0) this.f5391b;
                l61 l61Var = l0Var.f10337d0;
                if (l61Var != null) {
                    l61Var.N(true);
                }
                l0Var.T(true);
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) ((a6.m) this.f5391b).f307b;
                u0Var.f10422c.Y2.N(true);
                u0Var.b0();
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.f5391b;
                w0Var.f10449c.Y2.N(true);
                w0Var.V(true);
                return;
            case 23:
                hg.g1 g1Var = (hg.g1) this.f5391b;
                g1Var.f10287a.Y2.N(true);
                g1Var.Y(true);
                return;
            case 24:
                ((ai.e4) this.f5391b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.b2) this.f5391b).f10222a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5391b;
                ((Context) mVar.f7318b).unregisterReceiver((i2.b) mVar.f7319c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5391b;
                if (bVar.f10612c.f7317a) {
                    bVar.f10610a.f10619a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.f0 f0Var2 = (i2.f0) this.f5391b;
                e2.c cVar3 = f0Var2.E;
                Context context = f0Var2.e;
                String str2 = e2.d0.f7872a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar3.f7870f = valueOf;
                e2.b bVar2 = new e2.b(cVar3, valueOf, 0);
                e2.z zVar = (e2.z) cVar3.f7869c;
                if (zVar.f7927a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.f0 f0Var3 = ((i2.c0) this.f5391b).f10619a;
                f0Var3.t1(null);
                f0Var3.m1(0, 0);
                return;
        }
    }

    public qc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5390a = 29;
        this.f5391b = c0Var;
    }

    public qc(Object obj, int i10) {
        this.f5390a = i10;
        this.f5391b = obj;
    }
}
