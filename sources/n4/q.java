package n4;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
public abstract class q {
    public boolean f16340c;
    public androidx.mediarouter.app.c f16341e;
    public final Object f16338a = new Object();
    public final p f16339b = new p(this);
    public WeakReference d = new WeakReference(null);

    public final void C(s sVar, Handler handler) {
        synchronized (this.f16338a) {
            try {
                this.d = new WeakReference(sVar);
                androidx.mediarouter.app.c cVar = this.f16341e;
                if (cVar != null) {
                    cVar.removeCallbacksAndMessages(null);
                }
                this.f16341e = new androidx.mediarouter.app.c(this, handler.getLooper(), 6);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(s sVar, Handler handler) {
        long j3;
        boolean z10;
        boolean z11;
        if (this.f16340c) {
            boolean z12 = false;
            this.f16340c = false;
            handler.removeMessages(1);
            g0 g0Var = sVar.f16349g;
            if (g0Var == null) {
                j3 = 0;
            } else {
                j3 = g0Var.f16311e;
            }
            if (g0Var != null && g0Var.f16308a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((516 & j3) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((j3 & 514) != 0) {
                z12 = true;
            }
            if (z10 && z12) {
                h();
            } else if (!z10 && z11) {
                i();
            }
        }
    }

    public boolean g(Intent intent) {
        s sVar;
        androidx.mediarouter.app.c cVar;
        KeyEvent keyEvent;
        long j3;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f16338a) {
                sVar = (s) this.d.get();
                cVar = this.f16341e;
            }
            if (sVar != null && cVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                a0 c10 = sVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(sVar, cVar);
                    return false;
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (this.f16340c) {
                        cVar.removeMessages(1);
                        this.f16340c = false;
                        g0 g0Var = sVar.f16349g;
                        if (g0Var == null) {
                            j3 = 0;
                        } else {
                            j3 = g0Var.f16311e;
                        }
                        if ((j3 & 32) != 0) {
                            y();
                        }
                        return true;
                    }
                    this.f16340c = true;
                    cVar.sendMessageDelayed(cVar.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                } else {
                    a(sVar, cVar);
                    return true;
                }
            }
        }
        return false;
    }

    public void B() {
    }

    public void f() {
    }

    public void h() {
    }

    public void i() {
    }

    public void m() {
    }

    public void r() {
    }

    public void y() {
    }

    public void z() {
    }

    public void A(long j3) {
    }

    public void b(m mVar) {
    }

    public void q(m mVar) {
    }

    public void s(long j3) {
    }

    public void t(float f7) {
    }

    public void u(h0 h0Var) {
    }

    public void v(h0 h0Var) {
    }

    public void w(int i10) {
    }

    public void x(int i10) {
    }

    public void c(m mVar, int i10) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(Uri uri, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
