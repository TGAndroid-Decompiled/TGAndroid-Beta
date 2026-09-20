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
    public boolean f4693a;
    public final Object f4694b;
    public Object f4695c;
    public final Object d;
    public final Object e;
    public final Object f4696f;
    public final Object f4697g;
    public Object h;
    public Object f4698i;
    public Object f4699j;

    public g7(Context context, k2.v vVar, b2.e eVar, a6.m mVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4694b = applicationContext;
        this.f4695c = vVar;
        this.f4699j = eVar;
        this.f4698i = mVar;
        String str = e2.d0.f7888a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.e = Build.VERSION.SDK_INT >= 23 ? new k2.c(this) : null;
        this.f4696f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.f13230c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f4697g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        boolean z10;
        String name;
        if (this.f4693a && !bVar.equals((k2.b) this.h)) {
            this.h = bVar;
            k2.f0 f0Var = (k2.f0) ((k2.v) this.f4695c).f13386b;
            Looper myLooper = Looper.myLooper();
            if (f0Var.f13269i0 == myLooper) {
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
            Looper looper = f0Var.f13269i0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            e2.d.f(sb2.toString(), z10);
            k2.b bVar2 = f0Var.f13288y;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                f0Var.f13288y = bVar;
                k2.n nVar = f0Var.f13284t;
                if (nVar != null) {
                    nVar.G();
                }
            }
        }
    }

    public void b(f7 f7Var) {
        if (f7Var != null) {
            this.f4695c = f7Var;
        }
        boolean z10 = false;
        if (f7Var != null) {
            float f7 = f7Var.d;
            float f10 = f7Var.f4665c;
            PointF[] pointFArr = f7Var.f4664b;
            if (!this.f4693a) {
                ((org.telegram.ui.Components.d6) this.e).d(f10, true);
                ((org.telegram.ui.Components.d6) this.f4696f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.d6[]) this.f4697g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.d6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (f7Var != null) {
            z10 = true;
        }
        this.f4693a = z10;
        ((a0) this.f4694b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        a6.m mVar = (a6.m) this.f4698i;
        a6.m mVar2 = null;
        if (mVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) mVar.f307b;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            mVar2 = new a6.m(audioDeviceInfo, 29);
        }
        this.f4698i = mVar2;
        a(k2.b.c((Context) this.f4694b, (b2.e) this.f4699j, mVar2));
    }

    public g7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f4698i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f4699j = new Path();
        this.f4694b = a0Var;
        qr qrVar = qr.f27643g;
        this.d = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 320L, qrVar);
        this.e = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar);
        this.f4696f = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar);
        this.f4697g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, qrVar)};
    }
}
