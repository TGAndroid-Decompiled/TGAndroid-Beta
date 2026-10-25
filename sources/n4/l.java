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
public abstract class l {
    public boolean f18676c;
    public androidx.mediarouter.app.c e;
    public final Object f18674a = new Object();
    public final k f18675b = new k(this);
    public WeakReference d = new WeakReference(null);

    public final void C(n nVar, Handler handler) {
        synchronized (this.f18674a) {
            try {
                this.d = new WeakReference(nVar);
                androidx.mediarouter.app.c cVar = this.e;
                if (cVar != null) {
                    cVar.removeCallbacksAndMessages(null);
                }
                this.e = new androidx.mediarouter.app.c(this, handler.getLooper(), 7);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(n nVar, Handler handler) {
        long j10;
        boolean z10;
        boolean z11;
        if (this.f18676c) {
            boolean z12 = false;
            this.f18676c = false;
            handler.removeMessages(1);
            z zVar = nVar.f18683g;
            if (zVar == null) {
                j10 = 0;
            } else {
                j10 = zVar.e;
            }
            if (zVar != null && zVar.f18709a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((516 & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((j10 & 514) != 0) {
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
        n nVar;
        androidx.mediarouter.app.c cVar;
        KeyEvent keyEvent;
        long j10;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f18674a) {
                nVar = (n) this.d.get();
                cVar = this.e;
            }
            if (nVar != null && cVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                t c10 = nVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(nVar, cVar);
                    return false;
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (this.f18676c) {
                        cVar.removeMessages(1);
                        this.f18676c = false;
                        z zVar = nVar.f18683g;
                        if (zVar == null) {
                            j10 = 0;
                        } else {
                            j10 = zVar.e;
                        }
                        if ((j10 & 32) != 0) {
                            y();
                        }
                        return true;
                    }
                    this.f18676c = true;
                    cVar.sendMessageDelayed(cVar.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                } else {
                    a(nVar, cVar);
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

    public void A(long j10) {
    }

    public void b(h hVar) {
    }

    public void q(h hVar) {
    }

    public void s(long j10) {
    }

    public void t(float f7) {
    }

    public void u(a0 a0Var) {
    }

    public void v(a0 a0Var) {
    }

    public void w(int i10) {
    }

    public void x(int i10) {
    }

    public void c(h hVar, int i10) {
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
