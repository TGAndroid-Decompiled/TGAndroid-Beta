package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
public final class ku7 implements ama, vv7, on5, dq7, nl0, nr7, NativeLifecycleLock.NativeDisposer, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativePointerRunnable, fd, jcc, yma {
    public final byte a;

    public ku7(byte b) {
        this.a = b;
    }

    public static Font e(Object obj) {
        return (Font) obj;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        return l2d.b;
    }

    @Override
    public final Typeface a() {
        switch (this.a) {
            case 2:
                return hl.n1("fonts/rmedium.ttf");
            case 3:
                return hl.n1("fonts/rmediumitalic.ttf");
            case 4:
                return Typeface.create("serif", 1);
            case 5:
                return hl.n1("fonts/rcondensedbold.ttf");
            case 6:
                return hl.n1("fonts/rmono.ttf");
            default:
                return hl.n1("fonts/mw_bold.ttf");
        }
    }

    @Override
    public final String c(int i) {
        if (i == 0) {
            return ob6.M0(2131753792, null);
        }
        if (i == 1) {
            return ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(1, "Minutes", new Object[0]));
        }
        if (i == 2) {
            return ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(5, "Minutes", new Object[0]));
        }
        if (i == 3) {
            return ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(1, "Hours", new Object[0]));
        }
        if (i == 4) {
            return ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(5, "Hours", new Object[0]));
        }
        return "";
    }

    @Override
    public final Object call(long j) {
        return PeerConnectionFactory.j(j);
    }

    @Override
    public final void d(Object obj, float f) {
        lu7 lu7Var = (lu7) obj;
        lu7Var.s = f;
        lu7Var.f();
    }

    @Override
    public final void dispose(long j) {
        switch (this.a) {
            case 13:
                PeerConnection.lambda$dispose$48(j);
                return;
            default:
                PeerConnectionFactory.n(j);
                return;
        }
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return nza.b1(false, ob6.H(',', "Stars", num2.intValue()), 0.66f, null);
        }
        return ob6.E(num2.intValue(), ',');
    }

    @Override
    public final void j(int i) {
        xea.X0 = i;
        xea.x();
    }

    @Override
    public final int l(vnb vnbVar, boolean z) {
        Bitmap bitmap = fz8.a;
        return (((int) qu6.d(ehd.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public final void run(long j) {
        PeerConnectionFactory.e(j);
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        b29 y;
        if (z && !z2 && (y = imageReceiver.y()) != null) {
            y.start();
        }
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 17:
                idVar.dismiss();
                return;
            case 18:
                idVar.dismiss();
                return;
            case 19:
                Drawable[] drawableArr = PhotoViewer.d9;
                return;
            case 20:
                idVar.dismiss();
                return;
            case 21:
                idVar.dismiss();
                return;
            case 22:
            case 23:
            default:
                idVar.dismiss();
                return;
            case 24:
                RectF rectF = ProfileActivity.Z6;
                idVar.dismiss();
                return;
            case 25:
                idVar.dismiss();
                return;
        }
    }

    @Override
    public final void m() {
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }
}
