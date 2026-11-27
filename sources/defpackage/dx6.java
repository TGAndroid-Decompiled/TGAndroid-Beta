package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
public abstract class dx6 {
    public final byte a;
    public final Object b;
    public boolean c;
    public WeakReference d;
    public final MediaSession.Callback e;
    public Handler f;

    public dx6(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new Object();
                this.e = new cx6(this, (byte) 1);
                this.d = new WeakReference(null);
                return;
            default:
                this.b = new Object();
                this.e = new cx6(this, (byte) 0);
                this.d = new WeakReference(null);
                return;
        }
    }

    private boolean j(Intent intent) {
        gx6 gx6Var;
        d1 d1Var;
        KeyEvent keyEvent;
        long j;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.b) {
                gx6Var = (gx6) this.d.get();
                d1Var = (d1) this.f;
            }
            if (gx6Var != null && d1Var != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                ry6 c = gx6Var.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    b(gx6Var, d1Var);
                    return false;
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (this.c) {
                        d1Var.removeMessages(1);
                        this.c = false;
                        sf8 sf8Var = gx6Var.g;
                        if (sf8Var == null) {
                            j = 0;
                        } else {
                            j = sf8Var.e;
                        }
                        if ((j & 32) != 0) {
                            S();
                        }
                        return true;
                    }
                    this.c = true;
                    d1Var.sendMessageDelayed(d1Var.obtainMessage(1, c), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                } else {
                    b(gx6Var, d1Var);
                    return true;
                }
            }
        }
        return false;
    }

    public void A(String str, Bundle bundle) {
        byte b = this.a;
    }

    public void G(long j) {
        byte b = this.a;
    }

    public void M(int i) {
        byte b = this.a;
    }

    public void P(int i) {
        byte b = this.a;
    }

    public void S() {
        byte b = this.a;
    }

    public void V() {
        byte b = this.a;
    }

    public void Y(long j) {
        byte b = this.a;
    }

    public final void a(ex6 ex6Var, Handler handler) {
        long j;
        boolean z;
        boolean z2;
        if (this.c) {
            boolean z3 = false;
            this.c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = ex6Var.f;
            if (playbackStateCompat == null) {
                j = 0;
            } else {
                j = playbackStateCompat.e;
            }
            if (playbackStateCompat != null && playbackStateCompat.a == 3) {
                z = true;
            } else {
                z = false;
            }
            if ((516 & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((j & 514) != 0) {
                z3 = true;
            }
            if (z) {
                if (z3) {
                    k();
                }
            } else if (z2) {
                n();
            }
        }
    }

    public final void b(gx6 gx6Var, Handler handler) {
        long j;
        boolean z;
        boolean z2;
        if (this.c) {
            boolean z3 = false;
            this.c = false;
            handler.removeMessages(1);
            sf8 sf8Var = gx6Var.g;
            if (sf8Var == null) {
                j = 0;
            } else {
                j = sf8Var.e;
            }
            if (sf8Var != null && sf8Var.a == 3) {
                z = true;
            } else {
                z = false;
            }
            if ((516 & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((j & 514) != 0) {
                z3 = true;
            }
            if (z) {
                if (z3) {
                    k();
                }
            } else if (z2) {
                n();
            }
        }
    }

    public final void c0(ex6 ex6Var, Handler handler) {
        synchronized (this.b) {
            this.d = new WeakReference(ex6Var);
            d1 d1Var = (d1) this.f;
            d1 d1Var2 = null;
            if (d1Var != null) {
                d1Var.removeCallbacksAndMessages(null);
            }
            if (handler != null) {
                d1Var2 = new d1(this, handler.getLooper(), (byte) 12);
            }
            this.f = d1Var2;
        }
    }

    public final void d0(gx6 gx6Var, Handler handler) {
        synchronized (this.b) {
            this.d = new WeakReference(gx6Var);
            d1 d1Var = (d1) this.f;
            if (d1Var != null) {
                d1Var.removeCallbacksAndMessages(null);
            }
            this.f = new d1(this, handler.getLooper(), (byte) 11);
        }
    }

    public boolean i(Intent intent) {
        ex6 ex6Var;
        d1 d1Var;
        KeyEvent keyEvent;
        long j;
        switch (this.a) {
            case 0:
                return j(intent);
            default:
                if (Build.VERSION.SDK_INT >= 27) {
                    return false;
                }
                synchronized (this.b) {
                    ex6Var = (ex6) this.d.get();
                    d1Var = (d1) this.f;
                }
                if (ex6Var == null || d1Var == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                    return false;
                }
                sy6 c = ex6Var.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(ex6Var, d1Var);
                    return false;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (this.c) {
                        d1Var.removeMessages(1);
                        this.c = false;
                        PlaybackStateCompat playbackStateCompat = ex6Var.f;
                        if (playbackStateCompat == null) {
                            j = 0;
                        } else {
                            j = playbackStateCompat.e;
                        }
                        if ((j & 32) != 0) {
                            S();
                        }
                    } else {
                        this.c = true;
                        d1Var.sendMessageDelayed(d1Var.obtainMessage(1, c), ViewConfiguration.getDoubleTapTimeout());
                    }
                } else {
                    a(ex6Var, d1Var);
                }
                return true;
        }
    }

    public void k() {
        byte b = this.a;
    }

    public void n() {
        byte b = this.a;
    }

    public void q(String str, Bundle bundle) {
        byte b = this.a;
    }

    public void x(String str, Bundle bundle) {
        byte b = this.a;
    }

    private void T() {
    }

    private void U() {
    }

    private void W() {
    }

    private void X() {
    }

    private void l() {
    }

    private void m() {
    }

    private void o() {
    }

    private void p() {
    }

    public void F() {
    }

    public void b0() {
    }

    public void h() {
    }

    public void w() {
    }

    private void H(long j) {
    }

    private void I(long j) {
    }

    private void N(int i) {
    }

    private void O(int i) {
    }

    private void Q(int i) {
    }

    private void R(int i) {
    }

    private void Z(long j) {
    }

    private void a0(long j) {
    }

    public void E(os6 os6Var) {
    }

    public void J(float f) {
    }

    public void K(u29 u29Var) {
    }

    public void L(u29 u29Var) {
    }

    public void c(os6 os6Var) {
    }

    public void f(String str) {
    }

    public void t(String str) {
    }

    private void B(String str, Bundle bundle) {
    }

    private void C(String str, Bundle bundle) {
    }

    private void r(String str, Bundle bundle) {
    }

    private void s(String str, Bundle bundle) {
    }

    private void y(String str, Bundle bundle) {
    }

    private void z(String str, Bundle bundle) {
    }

    public void D(Uri uri, Bundle bundle) {
    }

    public void d(os6 os6Var, int i) {
    }

    public void g(String str, Bundle bundle) {
    }

    public void u(String str, Bundle bundle) {
    }

    public void v(Uri uri, Bundle bundle) {
    }

    public void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
