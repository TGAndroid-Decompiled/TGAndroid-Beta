package di;

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
import org.telegram.ui.Components.pr;
public final class g7 {
    public boolean f7292a;
    public final Object f7293b;
    public Object f7294c;
    public final Object d;
    public final Object f7295e;
    public final Object f7296f;
    public final Object f7297g;
    public Object h;
    public Object f7298i;
    public Object f7299j;

    public g7(Context context, ji.k5 k5Var, b2.e eVar, ji.u4 u4Var) {
        Context applicationContext = context.getApplicationContext();
        this.f7293b = applicationContext;
        this.f7294c = k5Var;
        this.f7299j = eVar;
        this.f7298i = u4Var;
        String str = e2.d0.f8765a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.f7295e = Build.VERSION.SDK_INT >= 23 ? new k2.c(this) : null;
        this.f7296f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.f14542c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f7297g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        boolean z10;
        String name;
        if (this.f7292a && !bVar.equals((k2.b) this.h)) {
            this.h = bVar;
            k2.d0 d0Var = (k2.d0) ((ji.k5) this.f7294c).f14048b;
            Looper myLooper = Looper.myLooper();
            if (d0Var.f14572i0 == myLooper) {
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
            Looper looper = d0Var.f14572i0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            e2.d.f(sb2.toString(), z10);
            k2.b bVar2 = d0Var.f14591y;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                d0Var.f14591y = bVar;
                k2.n nVar = d0Var.f14587t;
                if (nVar != null) {
                    nVar.x();
                }
            }
        }
    }

    public void b(f7 f7Var) {
        if (f7Var != null) {
            this.f7294c = f7Var;
        }
        boolean z10 = false;
        if (f7Var != null) {
            float f7 = f7Var.d;
            float f10 = f7Var.f7264c;
            PointF[] pointFArr = f7Var.f7263b;
            if (!this.f7292a) {
                ((org.telegram.ui.Components.e6) this.f7295e).d(f10, true);
                ((org.telegram.ui.Components.e6) this.f7296f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.e6[]) this.f7297g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.e6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (f7Var != null) {
            z10 = true;
        }
        this.f7292a = z10;
        ((a0) this.f7293b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        ji.u4 u4Var = (ji.u4) this.f7298i;
        ji.u4 u4Var2 = null;
        if (u4Var == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) u4Var.f14247b;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            u4Var2 = new ji.u4(audioDeviceInfo, 1);
        }
        this.f7298i = u4Var2;
        a(k2.b.c((Context) this.f7293b, (b2.e) this.f7299j, u4Var2));
    }

    public g7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f7298i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f7299j = new Path();
        this.f7293b = a0Var;
        pr prVar = pr.f29494g;
        this.d = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 320L, prVar);
        this.f7295e = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar);
        this.f7296f = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar);
        this.f7297g = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar)};
        this.h = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar)};
    }
}
