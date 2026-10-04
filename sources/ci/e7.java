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
import org.telegram.ui.Components.tr;
public final class e7 {
    public boolean f5021a;
    public final Object f5022b;
    public Object f5023c;
    public final Object d;
    public final Object f5024e;
    public final Object f5025f;
    public final Object f5026g;
    public Object h;
    public Object f5027i;
    public Object f5028j;

    public e7(Context context, k2.v vVar, b2.e eVar, k2.e eVar2) {
        Context applicationContext = context.getApplicationContext();
        this.f5022b = applicationContext;
        this.f5023c = vVar;
        this.f5028j = eVar;
        this.f5027i = eVar2;
        String str = e2.d0.f8537a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.f5024e = Build.VERSION.SDK_INT >= 23 ? new k2.c(this) : null;
        this.f5025f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.f14373c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f5026g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        boolean z10;
        String name;
        if (this.f5021a && !bVar.equals((k2.b) this.h)) {
            this.h = bVar;
            k2.f0 f0Var = (k2.f0) ((k2.v) this.f5023c).f14537b;
            Looper myLooper = Looper.myLooper();
            if (f0Var.f14413i0 == myLooper) {
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
            Looper looper = f0Var.f14413i0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            e2.d.f(sb2.toString(), z10);
            k2.b bVar2 = f0Var.f14432y;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                f0Var.f14432y = bVar;
                k2.o oVar = f0Var.f14428t;
                if (oVar != null) {
                    oVar.u();
                }
            }
        }
    }

    public void b(d7 d7Var) {
        if (d7Var != null) {
            this.f5023c = d7Var;
        }
        boolean z10 = false;
        if (d7Var != null) {
            float f7 = d7Var.d;
            float f10 = d7Var.f4912c;
            PointF[] pointFArr = d7Var.f4911b;
            if (!this.f5021a) {
                ((org.telegram.ui.Components.e6) this.f5024e).d(f10, true);
                ((org.telegram.ui.Components.e6) this.f5025f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.e6[]) this.f5026g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.e6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (d7Var != null) {
            z10 = true;
        }
        this.f5021a = z10;
        ((a0) this.f5022b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        k2.e eVar = (k2.e) this.f5027i;
        k2.e eVar2 = null;
        if (eVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) eVar.f14388b;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            eVar2 = new k2.e(audioDeviceInfo, 0);
        }
        this.f5027i = eVar2;
        a(k2.b.c((Context) this.f5022b, (b2.e) this.f5028j, eVar2));
    }

    public e7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f5027i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f5028j = new Path();
        this.f5022b = a0Var;
        tr trVar = tr.f31141g;
        this.d = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 320L, trVar);
        this.f5024e = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar);
        this.f5025f = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar);
        this.f5026g = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar)};
        this.h = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, trVar)};
    }
}
