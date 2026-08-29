package af;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final LaunchActivity d;
    public boolean f374e;
    public boolean f375f;
    public boolean f376g;
    public PictureInPictureParams h;
    public boolean f382n;
    public final ArrayList f371a = new ArrayList();
    public final ArrayList f372b = new ArrayList();
    public final HashMap f373c = new HashMap();
    public float f377i = -1.0f;
    public final df.a f378j = new df.a("enter");
    public final df.a f379k = new df.a("leave");
    public final Choreographer f380l = Choreographer.getInstance();
    public final b f381m = new b(this, 0);
    public final c f383o = new c(this, 0);

    public d(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f379k.a();
        ArrayList arrayList = this.f372b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((bf.b) obj).getClass();
        }
        if (this.f382n) {
            this.f382n = false;
            this.f380l.removeFrameCallback(this.f381m);
        }
        this.f375f = false;
        ArrayList arrayList2 = this.f371a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((bf.c) obj2).b();
        }
    }

    public final void b() {
        this.f375f = true;
        int i10 = 0;
        this.f376g = false;
        ArrayList arrayList = this.f371a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((bf.c) obj).e();
        }
        df.a aVar = this.f378j;
        long j10 = aVar.f5542b;
        ArrayList arrayList2 = this.f372b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((bf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f5543c = SystemClock.uptimeMillis();
        if (this.f382n) {
            return;
        }
        this.f382n = true;
        this.f380l.postFrameCallback(this.f381m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f371a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((bf.c) obj).d();
        }
        df.a aVar = this.f379k;
        long j10 = aVar.f5542b;
        ArrayList arrayList2 = this.f372b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((bf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f5543c = SystemClock.uptimeMillis();
        if (this.f382n) {
            return;
        }
        this.f382n = true;
        this.f380l.postFrameCallback(this.f381m);
    }

    public final void d(float f9) {
        if (f9 != this.f377i) {
            this.f377i = f9;
            ArrayList arrayList = this.f372b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                cf.e eVar = (cf.e) ((bf.b) obj);
                eVar.f3056o = f9;
                h hVar = eVar.f3048f;
                if (hVar != null) {
                    hVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (com.google.android.recaptcha.internal.a.u(launchActivity) && ((g) launchActivity.f35579i0.f16691e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f375f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
            b();
            this.d.enterPictureInPictureMode(this.h);
        }
    }

    public final void g(PictureInPictureUiState pictureInPictureUiState) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            if (i10 >= 35) {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed() + " " + pictureInPictureUiState.isTransitioningToPip());
                if (pictureInPictureUiState.isTransitioningToPip() && e()) {
                    b();
                }
            } else {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed());
            }
            boolean isStashed = pictureInPictureUiState.isStashed();
            if (this.f376g != isStashed) {
                this.f376g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f371a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((bf.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((bf.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.f374e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        c cVar = this.f383o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(cVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(cVar, intentFilter);
        }
    }
}
