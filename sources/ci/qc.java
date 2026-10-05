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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;
public final class qc implements Runnable {
    public final int f5801a;
    public final Object f5802b;

    public qc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5801a = 1;
        this.f5802b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5802b;
        y2.e eVar = (y2.e) tVar.f8580a.get();
        if (eVar != null) {
            int b10 = tVar.f8582c.b();
            y2.f fVar = eVar.f50385a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f50403n;
                    if (i11 != 0 && !fVar.f50395e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f50404o != null) {
                        return;
                    }
                    fVar.f50403n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f50404o == null) {
                            Context context = fVar.f50392a;
                            String str = e2.d0.f8538a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f50404o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f50404o = c10;
                        }
                        fVar.f50401l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f50397g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f50398i, fVar.f50401l);
                        fVar.h = elapsedRealtime;
                        fVar.f50398i = 0L;
                        fVar.f50400k = 0L;
                        fVar.f50399j = 0L;
                        y2.q qVar = fVar.f50396f;
                        qVar.f50427a.clear();
                        qVar.f50429c = -1;
                        qVar.d = 0;
                        qVar.f50430e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        Bitmap bitmap = null;
        switch (this.f5801a) {
            case 0:
                tc tcVar = (tc) this.f5802b;
                MediaMetadataRetriever mediaMetadataRetriever = tcVar.f6028e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(tcVar.f6032j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(tcVar.f6029f, tcVar.f6030g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(tcVar.f6029f / bitmap.getWidth(), tcVar.f6030g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (tcVar.h) {
                                if (tcVar.f6035m == null) {
                                    tcVar.f6035m = new Path();
                                }
                                tcVar.f6035m.rewind();
                                tcVar.f6035m.addCircle(tcVar.f6029f / 2.0f, tcVar.f6030g / 2.0f, Math.min(tcVar.f6029f, tcVar.f6030g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(tcVar.f6035m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, tcVar.f6034l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    AndroidUtilities.runOnUIThread(new x8(3, tcVar, bitmap));
                    return;
                }
                return;
            case 1:
                com.google.firebase.messaging.k.a((Intent) this.f5802b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.f5802b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4603a).edit();
                    String str = (String) cVar.f4604b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4605c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.e0 e0Var = (com.google.firebase.messaging.e0) this.f5802b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.f7881a.getAction() + " finishing.");
                e0Var.f7882b.trySetResult(null);
                return;
            case 4:
                di.k kVar = (di.k) this.f5802b;
                bw0 bw0Var = kVar.S;
                if (bw0Var != null && kVar.Y != -1) {
                    bw0Var.a();
                    return;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                ((ei.i0) this.f5802b).invalidateSelf();
                return;
            case 7:
                ((ei.j0) this.f5802b).invalidateSelf();
                return;
            case 8:
                ((ei.l0) this.f5802b).d();
                return;
            case 9:
                ((ei.y0) this.f5802b).c();
                return;
            case 10:
                ((ei.y0) this.f5802b).c();
                return;
            case 11:
                ((ei.z0) this.f5802b).a();
                return;
            case 12:
                ((ei.a1) this.f5802b).a();
                return;
            case 13:
                ((ei.k3) this.f5802b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5802b).unlock();
                return;
            case 15:
                ei.q4 q4Var = (ei.q4) this.f5802b;
                q4Var.Q = q4Var.f9289r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.f5802b).f10741y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5802b).getClass();
                return;
            case 18:
                hg.d dVar = (hg.d) this.f5802b;
                dVar.f11138c.f26034f3.N(true);
                dVar.T(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5802b).link);
                org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.l0 l0Var = (hg.l0) this.f5802b;
                w61 w61Var = l0Var.f11256d0;
                if (w61Var != null) {
                    w61Var.N(true);
                }
                l0Var.R(true);
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) ((xa.c) this.f5802b).f49828b;
                u0Var.f11350c.f26034f3.N(true);
                u0Var.b0();
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.f5802b;
                w0Var.f11379c.f26034f3.N(true);
                w0Var.T(true);
                return;
            case 23:
                hg.g1 g1Var = (hg.g1) this.f5802b;
                g1Var.f11198a.f26034f3.N(true);
                g1Var.X(true);
                return;
            case 24:
                ((ai.e4) this.f5802b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.b2) this.f5802b).f11129a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5802b;
                ((Context) mVar.f7903b).unregisterReceiver((i2.b) mVar.f7904c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5802b;
                if (bVar.f11562c.f7902a) {
                    bVar.f11560a.f11570a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.f0 f0Var = (i2.f0) this.f5802b;
                e2.c cVar2 = f0Var.E;
                Context context = f0Var.f11611e;
                String str2 = e2.d0.f8538a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar2.f8536f = valueOf;
                e2.b bVar2 = new e2.b(cVar2, valueOf, 0);
                e2.z zVar = (e2.z) cVar2.f8534c;
                if (zVar.f8599a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.f0 f0Var2 = ((i2.c0) this.f5802b).f11570a;
                f0Var2.t1(null);
                f0Var2.m1(0, 0);
                return;
        }
    }

    public qc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5801a = 29;
        this.f5802b = c0Var;
    }

    public qc(Object obj, int i10) {
        this.f5801a = i10;
        this.f5802b = obj;
    }
}
