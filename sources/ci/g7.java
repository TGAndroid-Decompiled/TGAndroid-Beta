package ci;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class g7 {
    public boolean f4691a;
    public final Object f4692b;
    public Object f4693c;
    public final Object d;
    public final Object e;
    public final Object f4694f;
    public final Object f4695g;
    public Object h;
    public Object f4696i;
    public Object f4697j;

    public g7(Context context, k2.v vVar, b2.e eVar, k2.e eVar2) {
        Context applicationContext = context.getApplicationContext();
        this.f4692b = applicationContext;
        this.f4693c = vVar;
        this.f4697j = eVar;
        this.f4696i = eVar2;
        String str = e2.d0.f7887a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.e = Build.VERSION.SDK_INT >= 23 ? new k2.c(this) : null;
        this.f4694f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.f13230c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f4695g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        boolean z10;
        String name;
        if (this.f4691a && !bVar.equals((k2.b) this.h)) {
            this.h = bVar;
            k2.f0 f0Var = (k2.f0) ((k2.v) this.f4693c).f13386b;
            Looper myLooper = Looper.myLooper();
            if (f0Var.f13268i0 == myLooper) {
                z10 = true;
            } else {
                z10 = false;
            }
            StringBuilder sb2 = new StringBuilder("Current looper (");
            String str = "null";
            if (myLooper == null) {
                name = "null";
            } else {
                name = myLooper.getThread().getName();
            }
            sb2.append(name);
            sb2.append(") is not the playback looper (");
            Looper looper = f0Var.f13268i0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            e2.d.f(sb2.toString(), z10);
            k2.b bVar2 = f0Var.f13287y;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                f0Var.f13287y = bVar;
                k2.o oVar = f0Var.f13283t;
                if (oVar != null) {
                    oVar.E();
                }
            }
        }
    }

    public void b(f7 f7Var) {
        if (f7Var != null) {
            this.f4693c = f7Var;
        }
        boolean z10 = false;
        if (f7Var != null) {
            float f7 = f7Var.d;
            float f10 = f7Var.f4663c;
            PointF[] pointFArr = f7Var.f4662b;
            if (!this.f4691a) {
                ((org.telegram.ui.Components.d6) this.e).d(f10, true);
                ((org.telegram.ui.Components.d6) this.f4694f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.d6[]) this.f4695g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.d6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (f7Var != null) {
            z10 = true;
        }
        this.f4691a = z10;
        ((a0) this.f4692b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        k2.e eVar = (k2.e) this.f4696i;
        k2.e eVar2 = null;
        if (eVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) eVar.f13244b;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            eVar2 = new k2.e(audioDeviceInfo, 0);
        }
        this.f4696i = eVar2;
        a(k2.b.c((Context) this.f4692b, (b2.e) this.f4697j, eVar2));
    }

    public g7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f4696i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f4697j = new Path();
        this.f4692b = a0Var;
        qr qrVar = qr.f27654g;
        this.d = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 320L, qrVar);
        this.e = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar);
        this.f4694f = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar);
        this.f4695g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar)};
    }
}
