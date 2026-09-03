package bf;

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
    public boolean f1796f;
    public boolean f1797g;
    public PictureInPictureParams h;
    public boolean f1803n;
    public final ArrayList f1793a = new ArrayList();
    public final ArrayList f1794b = new ArrayList();
    public final HashMap f1795c = new HashMap();
    public float f1798i = -1.0f;
    public final ef.a f1799j = new ef.a("enter");
    public final ef.a f1800k = new ef.a("leave");
    public final Choreographer f1801l = Choreographer.getInstance();
    public final b f1802m = new b(this, 0);
    public final h f1804o = new h(this, 1);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z4) {
        d(0.0f);
        this.f1800k.a();
        ArrayList arrayList = this.f1794b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((cf.b) obj).getClass();
        }
        if (this.f1803n) {
            this.f1803n = false;
            this.f1801l.removeFrameCallback(this.f1802m);
        }
        this.f1796f = false;
        ArrayList arrayList2 = this.f1793a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((cf.c) obj2).b();
        }
    }

    public final void b() {
        this.f1796f = true;
        int i10 = 0;
        this.f1797g = false;
        ArrayList arrayList = this.f1793a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((cf.c) obj).e();
        }
        ef.a aVar = this.f1799j;
        long j10 = aVar.f5195b;
        ArrayList arrayList2 = this.f1794b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((cf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f5196c = SystemClock.uptimeMillis();
        if (this.f1803n) {
            return;
        }
        this.f1803n = true;
        this.f1801l.postFrameCallback(this.f1802m);
    }

    public final void c(boolean z4) {
        ArrayList arrayList = this.f1793a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((cf.c) obj).d();
        }
        ef.a aVar = this.f1800k;
        long j10 = aVar.f5195b;
        ArrayList arrayList2 = this.f1794b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((cf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f5196c = SystemClock.uptimeMillis();
        if (this.f1803n) {
            return;
        }
        this.f1803n = true;
        this.f1801l.postFrameCallback(this.f1802m);
    }

    public final void d(float f10) {
        if (f10 != this.f1798i) {
            this.f1798i = f10;
            ArrayList arrayList = this.f1794b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                df.e eVar = (df.e) ((cf.b) obj);
                eVar.f4345o = f10;
                g gVar = eVar.f4337f;
                if (gVar != null) {
                    gVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (e2.c.s(launchActivity) && ((f) launchActivity.f31606j0.e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f1796f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f1797g != isStashed) {
                this.f1797g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f1793a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((cf.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((cf.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        h hVar = this.f1804o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(hVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(hVar, intentFilter);
        }
    }
}
