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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
public final class qc implements Runnable {
    public final int f5800a;
    public final Object f5801b;

    public qc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f5800a = 1;
        this.f5801b = intent;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f5801b;
        y2.e eVar = (y2.e) tVar.f8579a.get();
        if (eVar != null) {
            int b10 = tVar.f8581c.b();
            y2.f fVar = eVar.f50370a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f50388n;
                    if (i11 != 0 && !fVar.f50380e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f50389o != null) {
                        return;
                    }
                    fVar.f50388n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f50389o == null) {
                            Context context = fVar.f50377a;
                            String str = e2.d0.f8537a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f50389o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f50389o = c10;
                        }
                        fVar.f50386l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f50382g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f50383i, fVar.f50386l);
                        fVar.h = elapsedRealtime;
                        fVar.f50383i = 0L;
                        fVar.f50385k = 0L;
                        fVar.f50384j = 0L;
                        y2.q qVar = fVar.f50381f;
                        qVar.f50412a.clear();
                        qVar.f50414c = -1;
                        qVar.d = 0;
                        qVar.f50415e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        Bitmap bitmap = null;
        switch (this.f5800a) {
            case 0:
                tc tcVar = (tc) this.f5801b;
                MediaMetadataRetriever mediaMetadataRetriever = tcVar.f6027e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(tcVar.f6031j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(tcVar.f6028f, tcVar.f6029g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(tcVar.f6028f / bitmap.getWidth(), tcVar.f6029g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (tcVar.h) {
                                if (tcVar.f6034m == null) {
                                    tcVar.f6034m = new Path();
                                }
                                tcVar.f6034m.rewind();
                                tcVar.f6034m.addCircle(tcVar.f6028f / 2.0f, tcVar.f6029g / 2.0f, Math.min(tcVar.f6028f, tcVar.f6029g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(tcVar.f6034m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, tcVar.f6033l);
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
                com.google.firebase.messaging.k.a((Intent) this.f5801b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.f5801b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4602a).edit();
                    String str = (String) cVar.f4603b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4604c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.e0 e0Var = (com.google.firebase.messaging.e0) this.f5801b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.f7880a.getAction() + " finishing.");
                e0Var.f7881b.trySetResult(null);
                return;
            case 4:
                di.k kVar = (di.k) this.f5801b;
                aw0 aw0Var = kVar.S;
                if (aw0Var != null && kVar.Y != -1) {
                    aw0Var.Z();
                    return;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                ((ei.i0) this.f5801b).invalidateSelf();
                return;
            case 7:
                ((ei.j0) this.f5801b).invalidateSelf();
                return;
            case 8:
                ((ei.l0) this.f5801b).d();
                return;
            case 9:
                ((ei.y0) this.f5801b).c();
                return;
            case 10:
                ((ei.y0) this.f5801b).c();
                return;
            case 11:
                ((ei.z0) this.f5801b).a();
                return;
            case 12:
                ((ei.a1) this.f5801b).a();
                return;
            case 13:
                ((ei.k3) this.f5801b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.f5801b).unlock();
                return;
            case 15:
                ei.q4 q4Var = (ei.q4) this.f5801b;
                q4Var.Q = q4Var.f9288r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.f5801b).f10740y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.f5801b).getClass();
                return;
            case 18:
                hg.c cVar2 = (hg.c) this.f5801b;
                cVar2.f11136c.f25245f3.N(true);
                cVar2.T(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f5801b).link);
                org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.l0 l0Var = (hg.l0) this.f5801b;
                u61 u61Var = l0Var.f11257d0;
                if (u61Var != null) {
                    u61Var.N(true);
                }
                l0Var.R(true);
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) ((xa.c) this.f5801b).f49813b;
                u0Var.f11350c.f25245f3.N(true);
                u0Var.b0();
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.f5801b;
                w0Var.f11381c.f25245f3.N(true);
                w0Var.T(true);
                return;
            case 23:
                hg.g1 g1Var = (hg.g1) this.f5801b;
                g1Var.f11202a.f25245f3.N(true);
                g1Var.X(true);
                return;
            case 24:
                ((ai.e4) this.f5801b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.b2) this.f5801b).f11129a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5801b;
                ((Context) mVar.f7902b).unregisterReceiver((i2.b) mVar.f7903c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.f5801b;
                if (bVar.f11561c.f7901a) {
                    bVar.f11559a.f11569a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.f0 f0Var = (i2.f0) this.f5801b;
                e2.c cVar3 = f0Var.E;
                Context context = f0Var.f11610e;
                String str2 = e2.d0.f8537a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar3.f8535f = valueOf;
                e2.b bVar2 = new e2.b(cVar3, valueOf, 0);
                e2.z zVar = (e2.z) cVar3.f8533c;
                if (zVar.f8598a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.f0 f0Var2 = ((i2.c0) this.f5801b).f11569a;
                f0Var2.t1(null);
                f0Var2.m1(0, 0);
                return;
        }
    }

    public qc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5800a = 29;
        this.f5801b = c0Var;
    }

    public qc(Object obj, int i10) {
        this.f5800a = i10;
        this.f5801b = obj;
    }
}
