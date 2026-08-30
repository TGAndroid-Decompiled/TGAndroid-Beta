package cf;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.h;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final LaunchActivity d;
    public boolean e;
    public boolean f2274f;
    public boolean f2275g;
    public PictureInPictureParams h;
    public boolean f2281n;
    public final ArrayList f2271a = new ArrayList();
    public final ArrayList f2272b = new ArrayList();
    public final HashMap f2273c = new HashMap();
    public float f2276i = -1.0f;
    public final ff.a f2277j = new ff.a("enter");
    public final ff.a f2278k = new ff.a("leave");
    public final Choreographer f2279l = Choreographer.getInstance();
    public final b f2280m = new b(this, 0);
    public final h f2282o = new h(this, 2);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z4) {
        d(0.0f);
        this.f2278k.a();
        ArrayList arrayList = this.f2272b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((df.b) obj).getClass();
        }
        if (this.f2281n) {
            this.f2281n = false;
            this.f2279l.removeFrameCallback(this.f2280m);
        }
        this.f2274f = false;
        ArrayList arrayList2 = this.f2271a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((df.c) obj2).b();
        }
    }

    public final void b() {
        this.f2274f = true;
        int i10 = 0;
        this.f2275g = false;
        ArrayList arrayList = this.f2271a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((df.c) obj).e();
        }
        ff.a aVar = this.f2277j;
        long j10 = aVar.f6110b;
        ArrayList arrayList2 = this.f2272b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((df.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f6111c = SystemClock.uptimeMillis();
        if (this.f2281n) {
            return;
        }
        this.f2281n = true;
        this.f2279l.postFrameCallback(this.f2280m);
    }

    public final void c(boolean z4) {
        ArrayList arrayList = this.f2271a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((df.c) obj).d();
        }
        ff.a aVar = this.f2278k;
        long j10 = aVar.f6110b;
        ArrayList arrayList2 = this.f2272b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((df.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f6111c = SystemClock.uptimeMillis();
        if (this.f2281n) {
            return;
        }
        this.f2281n = true;
        this.f2279l.postFrameCallback(this.f2280m);
    }

    public final void d(float f10) {
        if (f10 != this.f2276i) {
            this.f2276i = f10;
            ArrayList arrayList = this.f2272b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ef.f fVar = (ef.f) ((df.b) obj);
                fVar.f5207o = f10;
                g gVar = fVar.f5199f;
                if (gVar != null) {
                    gVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (e2.c.s(launchActivity) && ((f) launchActivity.f31632j0.e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f2274f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f2275g != isStashed) {
                this.f2275g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f2271a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((df.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((df.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        h hVar = this.f2282o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(hVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(hVar, intentFilter);
        }
    }
}
