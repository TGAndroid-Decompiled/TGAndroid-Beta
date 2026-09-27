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
import org.telegram.ui.Components.sr;
public final class e7 {
    public boolean f4649a;
    public final Object f4650b;
    public Object f4651c;
    public final Object d;
    public final Object e;
    public final Object f4652f;
    public final Object f4653g;
    public Object h;
    public Object f4654i;
    public Object f4655j;

    public e7(Context context, ei.d5 d5Var, b2.e eVar, a6.m mVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4650b = applicationContext;
        this.f4651c = d5Var;
        this.f4655j = eVar;
        this.f4654i = mVar;
        String str = e2.d0.f7872a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.e = Build.VERSION.SDK_INT >= 23 ? new k2.c(this) : null;
        this.f4652f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.f13221c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f4653g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        boolean z10;
        String name;
        if (this.f4649a && !bVar.equals((k2.b) this.h)) {
            this.h = bVar;
            k2.e0 e0Var = (k2.e0) ((ei.d5) this.f4651c).f8288b;
            Looper myLooper = Looper.myLooper();
            if (e0Var.f13254i0 == myLooper) {
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
            Looper looper = e0Var.f13254i0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            e2.d.f(sb2.toString(), z10);
            k2.b bVar2 = e0Var.f13273y;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                e0Var.f13273y = bVar;
                k2.n nVar = e0Var.f13269t;
                if (nVar != null) {
                    nVar.G();
                }
            }
        }
    }

    public void b(d7 d7Var) {
        if (d7Var != null) {
            this.f4651c = d7Var;
        }
        boolean z10 = false;
        if (d7Var != null) {
            float f7 = d7Var.d;
            float f10 = d7Var.f4546c;
            PointF[] pointFArr = d7Var.f4545b;
            if (!this.f4649a) {
                ((org.telegram.ui.Components.e6) this.e).d(f10, true);
                ((org.telegram.ui.Components.e6) this.f4652f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.e6[]) this.f4653g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.e6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (d7Var != null) {
            z10 = true;
        }
        this.f4649a = z10;
        ((a0) this.f4650b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        a6.m mVar = (a6.m) this.f4654i;
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
        this.f4654i = mVar2;
        a(k2.b.c((Context) this.f4650b, (b2.e) this.f4655j, mVar2));
    }

    public e7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f4654i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f4655j = new Path();
        this.f4650b = a0Var;
        sr srVar = sr.f28360g;
        this.d = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 320L, srVar);
        this.e = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar);
        this.f4652f = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar);
        this.f4653g = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar)};
        this.h = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, srVar)};
    }
}
