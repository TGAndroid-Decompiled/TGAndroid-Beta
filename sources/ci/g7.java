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
    public boolean f4687a;
    public final Object f4688b;
    public Object f4689c;
    public final Object d;
    public final Object e;
    public final Object f4690f;
    public final Object f4691g;
    public Object h;
    public Object f4692i;
    public Object f4693j;

    public g7(Context context, k2.v vVar, b2.e eVar, a6.m mVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4688b = applicationContext;
        this.f4689c = vVar;
        this.f4693j = eVar;
        this.f4692i = mVar;
        String str = e2.d0.f7883a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.e = Build.VERSION.SDK_INT >= 23 ? new k2.c(this) : null;
        this.f4690f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.f13226c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f4691g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        boolean z10;
        String name;
        if (this.f4687a && !bVar.equals((k2.b) this.h)) {
            this.h = bVar;
            k2.g0 g0Var = (k2.g0) ((k2.v) this.f4689c).f13384b;
            Looper myLooper = Looper.myLooper();
            if (g0Var.f13270i0 == myLooper) {
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
            Looper looper = g0Var.f13270i0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            e2.d.f(sb2.toString(), z10);
            k2.b bVar2 = g0Var.f13289y;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                g0Var.f13289y = bVar;
                k2.n nVar = g0Var.f13285t;
                if (nVar != null) {
                    nVar.J();
                }
            }
        }
    }

    public void b(f7 f7Var) {
        if (f7Var != null) {
            this.f4689c = f7Var;
        }
        boolean z10 = false;
        if (f7Var != null) {
            float f7 = f7Var.d;
            float f10 = f7Var.f4659c;
            PointF[] pointFArr = f7Var.f4658b;
            if (!this.f4687a) {
                ((org.telegram.ui.Components.c6) this.e).d(f10, true);
                ((org.telegram.ui.Components.c6) this.f4690f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.c6[]) this.f4691g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.c6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (f7Var != null) {
            z10 = true;
        }
        this.f4687a = z10;
        ((a0) this.f4688b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        a6.m mVar = (a6.m) this.f4692i;
        a6.m mVar2 = null;
        if (mVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) mVar.f305b;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            mVar2 = new a6.m(audioDeviceInfo, 29);
        }
        this.f4692i = mVar2;
        a(k2.b.c((Context) this.f4688b, (b2.e) this.f4693j, mVar2));
    }

    public g7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f4692i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f4693j = new Path();
        this.f4688b = a0Var;
        qr qrVar = qr.f27424g;
        this.d = new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 320L, qrVar);
        this.e = new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar);
        this.f4690f = new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar);
        this.f4691g = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar)};
        this.h = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar)};
    }
}
