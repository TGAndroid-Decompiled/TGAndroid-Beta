package jf;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import c3.i0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final LaunchActivity d;
    public boolean e;
    public boolean f9842f;
    public boolean f9843g;
    public PictureInPictureParams h;
    public boolean f9849n;
    public final ArrayList f9839a = new ArrayList();
    public final ArrayList f9840b = new ArrayList();
    public final HashMap f9841c = new HashMap();
    public float f9844i = -1.0f;
    public final mf.a f9845j = new mf.a("enter");
    public final mf.a f9846k = new mf.a("leave");
    public final Choreographer f9847l = Choreographer.getInstance();
    public final b f9848m = new b(this, 0);
    public final androidx.mediarouter.app.f f9850o = new androidx.mediarouter.app.f(this, 4);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f9846k.a();
        ArrayList arrayList = this.f9840b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((lf.e) obj).getClass();
        }
        if (this.f9849n) {
            this.f9849n = false;
            this.f9847l.removeFrameCallback(this.f9848m);
        }
        this.f9842f = false;
        ArrayList arrayList2 = this.f9839a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((kf.b) obj2).b();
        }
    }

    public final void b() {
        this.f9842f = true;
        int i10 = 0;
        this.f9843g = false;
        ArrayList arrayList = this.f9839a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((kf.b) obj).e();
        }
        mf.a aVar = this.f9845j;
        long j10 = aVar.f13058b;
        ArrayList arrayList2 = this.f9840b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((lf.e) obj2).getClass();
        }
        d(0.0f);
        aVar.f13059c = SystemClock.uptimeMillis();
        if (this.f9849n) {
            return;
        }
        this.f9849n = true;
        this.f9847l.postFrameCallback(this.f9848m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f9839a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((kf.b) obj).d();
        }
        mf.a aVar = this.f9846k;
        long j10 = aVar.f13058b;
        ArrayList arrayList2 = this.f9840b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((lf.e) obj2).getClass();
        }
        d(1.0f);
        aVar.f13059c = SystemClock.uptimeMillis();
        if (this.f9849n) {
            return;
        }
        this.f9849n = true;
        this.f9847l.postFrameCallback(this.f9848m);
    }

    public final void d(float f7) {
        if (f7 != this.f9844i) {
            this.f9844i = f7;
            ArrayList arrayList = this.f9840b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                lf.e eVar = (lf.e) obj;
                eVar.f11829o = f7;
                g gVar = eVar.f11821f;
                if (gVar != null) {
                    gVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (i0.t(launchActivity) && ((f) launchActivity.m0.e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f9842f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f9843g != isStashed) {
                this.f9843g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f9839a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((kf.b) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((kf.b) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        androidx.mediarouter.app.f fVar = this.f9850o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(fVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(fVar, intentFilter);
        }
    }
}
