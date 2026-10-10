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
import org.telegram.ui.Components.is;
public final class e7 {
    public boolean f5030a;
    public final Object f5031b;
    public Object f5032c;
    public final Object d;
    public final Object f5033e;
    public final Object f5034f;
    public final Object f5035g;
    public Object h;
    public Object f5036i;
    public Object f5037j;

    public e7(Context context, ei.c5 c5Var, b2.e eVar, a4.l lVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5031b = applicationContext;
        this.f5032c = c5Var;
        this.f5037j = eVar;
        this.f5036i = lVar;
        String str = e2.d0.f8532a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.f5033e = new k2.c(this);
        this.f5034f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.f14409c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f5035g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        boolean z10;
        String name;
        if (this.f5030a && !bVar.equals((k2.b) this.h)) {
            this.h = bVar;
            k2.d0 d0Var = (k2.d0) ((ei.c5) this.f5032c).f8999b;
            Looper myLooper = Looper.myLooper();
            if (d0Var.f14437h0 == myLooper) {
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
            Looper looper = d0Var.f14437h0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            e2.d.f(sb2.toString(), z10);
            k2.b bVar2 = d0Var.f14456x;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                d0Var.f14456x = bVar;
                k2.n nVar = d0Var.f14452s;
                if (nVar != null) {
                    nVar.Z();
                }
            }
        }
    }

    public void b(d7 d7Var) {
        if (d7Var != null) {
            this.f5032c = d7Var;
        }
        boolean z10 = false;
        if (d7Var != null) {
            float f7 = d7Var.d;
            float f10 = d7Var.f4945c;
            PointF[] pointFArr = d7Var.f4944b;
            if (!this.f5030a) {
                ((org.telegram.ui.Components.g6) this.f5033e).d(f10, true);
                ((org.telegram.ui.Components.g6) this.f5034f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.g6[]) this.f5035g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.g6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (d7Var != null) {
            z10 = true;
        }
        this.f5030a = z10;
        ((a0) this.f5031b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        a4.l lVar = (a4.l) this.f5036i;
        a4.l lVar2 = null;
        if (lVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) lVar.f297b;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            lVar2 = new a4.l(audioDeviceInfo, 25);
        }
        this.f5036i = lVar2;
        a(k2.b.c((Context) this.f5031b, (b2.e) this.f5037j, lVar2));
    }

    public e7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f5036i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f5037j = new Path();
        this.f5031b = a0Var;
        is isVar = is.f27444g;
        this.d = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 320L, isVar);
        this.f5033e = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar);
        this.f5034f = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar);
        this.f5035g = new org.telegram.ui.Components.g6[]{new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar)};
        this.h = new org.telegram.ui.Components.g6[]{new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, isVar)};
    }
}
