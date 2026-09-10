package bi;

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
import org.telegram.ui.Components.wr;
public final class h8 {
    public boolean f2793a;
    public final Object f2794b;
    public Object f2795c;
    public final Object d;
    public final Object e;
    public final Object f2796f;
    public final Object f2797g;
    public Object h;
    public Object f2798i;
    public Object f2799j;

    public h8(Context context, hi.y1 y1Var, b2.e eVar, a6.i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2794b = applicationContext;
        this.f2795c = y1Var;
        this.f2799j = eVar;
        this.f2798i = iVar;
        String str = e2.d0.f7188a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.e = Build.VERSION.SDK_INT >= 23 ? new k2.c(this) : null;
        this.f2796f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.f12073c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f2797g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        boolean z10;
        String name;
        if (this.f2793a && !bVar.equals((k2.b) this.h)) {
            this.h = bVar;
            k2.e0 e0Var = (k2.e0) ((hi.y1) this.f2795c).f9976b;
            Looper myLooper = Looper.myLooper();
            if (e0Var.f12106i0 == myLooper) {
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
            Looper looper = e0Var.f12106i0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            e2.d.f(sb2.toString(), z10);
            k2.b bVar2 = e0Var.f12125y;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                e0Var.f12125y = bVar;
                k2.n nVar = e0Var.f12121t;
                if (nVar != null) {
                    nVar.L();
                }
            }
        }
    }

    public void b(g8 g8Var) {
        if (g8Var != null) {
            this.f2795c = g8Var;
        }
        boolean z10 = false;
        if (g8Var != null) {
            float f7 = g8Var.d;
            float f10 = g8Var.f2752c;
            PointF[] pointFArr = g8Var.f2751b;
            if (!this.f2793a) {
                ((org.telegram.ui.Components.d6) this.e).d(f10, true);
                ((org.telegram.ui.Components.d6) this.f2796f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.d6[]) this.f2797g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.d6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (g8Var != null) {
            z10 = true;
        }
        this.f2793a = z10;
        ((e0) this.f2794b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        a6.i iVar = (a6.i) this.f2798i;
        a6.i iVar2 = null;
        if (iVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) iVar.f301b;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            iVar2 = new a6.i(audioDeviceInfo, 27);
        }
        this.f2798i = iVar2;
        a(k2.b.c((Context) this.f2794b, (b2.e) this.f2799j, iVar2));
    }

    public h8(e0 e0Var) {
        Paint paint = new Paint(1);
        this.f2798i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f2799j = new Path();
        this.f2794b = e0Var;
        wr wrVar = wr.f28820g;
        this.d = new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 320L, wrVar);
        this.e = new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar);
        this.f2796f = new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar);
        this.f2797g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar)};
    }
}
