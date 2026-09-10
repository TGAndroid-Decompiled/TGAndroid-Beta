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
public abstract class p {
    public boolean f13802c;
    public androidx.mediarouter.app.c e;
    public final Object f13800a = new Object();
    public final o f13801b = new o(this);
    public WeakReference d = new WeakReference(null);

    public final void C(r rVar, Handler handler) {
        synchronized (this.f13800a) {
            try {
                this.d = new WeakReference(rVar);
                androidx.mediarouter.app.c cVar = this.e;
                if (cVar != null) {
                    cVar.removeCallbacksAndMessages(null);
                }
                this.e = new androidx.mediarouter.app.c(this, handler.getLooper(), 6);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(r rVar, Handler handler) {
        long j3;
        boolean z10;
        boolean z11;
        if (this.f13802c) {
            boolean z12 = false;
            this.f13802c = false;
            handler.removeMessages(1);
            h0 h0Var = rVar.f13809g;
            if (h0Var == null) {
                j3 = 0;
            } else {
                j3 = h0Var.e;
            }
            if (h0Var != null && h0Var.f13774a == 3) {
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
        r rVar;
        androidx.mediarouter.app.c cVar;
        KeyEvent keyEvent;
        long j3;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f13800a) {
                rVar = (r) this.d.get();
                cVar = this.e;
            }
            if (rVar != null && cVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                a0 c10 = rVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(rVar, cVar);
                    return false;
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (this.f13802c) {
                        cVar.removeMessages(1);
                        this.f13802c = false;
                        h0 h0Var = rVar.f13809g;
                        if (h0Var == null) {
                            j3 = 0;
                        } else {
                            j3 = h0Var.e;
                        }
                        if ((j3 & 32) != 0) {
                            y();
                        }
                        return true;
                    }
                    this.f13802c = true;
                    cVar.sendMessageDelayed(cVar.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                } else {
                    a(rVar, cVar);
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

    public void b(l lVar) {
    }

    public void q(l lVar) {
    }

    public void s(long j3) {
    }

    public void t(float f7) {
    }

    public void u(i0 i0Var) {
    }

    public void v(i0 i0Var) {
    }

    public void w(int i10) {
    }

    public void x(int i10) {
    }

    public void c(l lVar, int i10) {
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
