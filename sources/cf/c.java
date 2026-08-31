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
    public boolean f2468e;
    public boolean f2469f;
    public boolean f2470g;
    public PictureInPictureParams h;
    public boolean f2476n;
    public final ArrayList f2465a = new ArrayList();
    public final ArrayList f2466b = new ArrayList();
    public final HashMap f2467c = new HashMap();
    public float f2471i = -1.0f;
    public final ff.a f2472j = new ff.a("enter");
    public final ff.a f2473k = new ff.a("leave");
    public final Choreographer f2474l = Choreographer.getInstance();
    public final b f2475m = new b(this, 0);
    public final h f2477o = new h(this, 2);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z4) {
        d(0.0f);
        this.f2473k.a();
        ArrayList arrayList = this.f2466b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((df.b) obj).getClass();
        }
        if (this.f2476n) {
            this.f2476n = false;
            this.f2474l.removeFrameCallback(this.f2475m);
        }
        this.f2469f = false;
        ArrayList arrayList2 = this.f2465a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((df.c) obj2).b();
        }
    }

    public final void b() {
        this.f2469f = true;
        int i10 = 0;
        this.f2470g = false;
        ArrayList arrayList = this.f2465a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((df.c) obj).e();
        }
        ff.a aVar = this.f2472j;
        long j10 = aVar.f6229b;
        ArrayList arrayList2 = this.f2466b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((df.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f6230c = SystemClock.uptimeMillis();
        if (this.f2476n) {
            return;
        }
        this.f2476n = true;
        this.f2474l.postFrameCallback(this.f2475m);
    }

    public final void c(boolean z4) {
        ArrayList arrayList = this.f2465a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((df.c) obj).d();
        }
        ff.a aVar = this.f2473k;
        long j10 = aVar.f6229b;
        ArrayList arrayList2 = this.f2466b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((df.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f6230c = SystemClock.uptimeMillis();
        if (this.f2476n) {
            return;
        }
        this.f2476n = true;
        this.f2474l.postFrameCallback(this.f2475m);
    }

    public final void d(float f10) {
        if (f10 != this.f2471i) {
            this.f2471i = f10;
            ArrayList arrayList = this.f2466b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ef.e eVar = (ef.e) ((df.b) obj);
                eVar.f5048o = f10;
                g gVar = eVar.f5040f;
                if (gVar != null) {
                    gVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (e2.c.s(launchActivity) && ((f) launchActivity.f34154j0.f13330e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f2469f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f2470g != isStashed) {
                this.f2470g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f2465a;
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
        this.f2468e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        h hVar = this.f2477o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(hVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(hVar, intentFilter);
        }
    }
}
