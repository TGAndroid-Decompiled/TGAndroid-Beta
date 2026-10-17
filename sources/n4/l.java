package n4;

import ab.o0;
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
    public boolean f17101c;
    public o0 e;
    public final Object f17099a = new Object();
    public final k f17100b = new k(this);
    public WeakReference d = new WeakReference(null);

    public final void C(n nVar, Handler handler) {
        synchronized (this.f17099a) {
            try {
                this.d = new WeakReference(nVar);
                o0 o0Var = this.e;
                if (o0Var != null) {
                    o0Var.removeCallbacksAndMessages(null);
                }
                this.e = new o0(this, handler.getLooper(), 7);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(n nVar, Handler handler) {
        long j10;
        boolean z10;
        boolean z11;
        if (this.f17101c) {
            boolean z12 = false;
            this.f17101c = false;
            handler.removeMessages(1);
            y yVar = nVar.f17108g;
            if (yVar == null) {
                j10 = 0;
            } else {
                j10 = yVar.e;
            }
            if (yVar != null && yVar.f17133a == 3) {
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
        o0 o0Var;
        KeyEvent keyEvent;
        long j10;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f17099a) {
                nVar = (n) this.d.get();
                o0Var = this.e;
            }
            if (nVar != null && o0Var != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                t c10 = nVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(nVar, o0Var);
                    return false;
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (this.f17101c) {
                        o0Var.removeMessages(1);
                        this.f17101c = false;
                        y yVar = nVar.f17108g;
                        if (yVar == null) {
                            j10 = 0;
                        } else {
                            j10 = yVar.e;
                        }
                        if ((j10 & 32) != 0) {
                            y();
                        }
                        return true;
                    }
                    this.f17101c = true;
                    o0Var.sendMessageDelayed(o0Var.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                } else {
                    a(nVar, o0Var);
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

    public void u(z zVar) {
    }

    public void v(z zVar) {
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
