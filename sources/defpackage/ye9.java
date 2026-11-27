package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.function.IntSupplier;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.tl.TL_iv;
import org.webrtc.FrameDecryptor;
import org.webrtc.FrameEncryptor;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpParameters;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
public final class ye9 implements vt3, lf9, ncc, oj3, fd, qy9, yl9, cg0, nl0, on5, NativeLifecycleLock.NativePointerRunnable, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativeDisposer, t69, ta9, s69, k6b, pg2, if7 {
    public final byte a;
    public final Object b;

    public ye9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void a(String str) {
        eja ejaVar = ((ega) this.b).d;
        eja.b(ejaVar).q(ejaVar.m1, str, new yfa(ejaVar, (byte) 1));
    }

    @Override
    public final void b() {
        nea neaVar = (nea) this.b;
        float progress = 1.0f - (neaVar.d.getProgress() * 0.143f);
        de0 de0Var = neaVar.a;
        de0Var.setScaleX(progress);
        de0Var.setScaleY(progress);
        neaVar.invalidate();
    }

    @Override
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                rf9 rf9Var = (rf9) obj;
                dg9 dg9Var = rf9Var.d;
                mk0 mk0Var = rf9Var.f;
                if (mk0Var != null) {
                    mk0Var.s = true;
                    mk0Var.r = dg9Var.r2;
                }
                if (mk0Var != null) {
                    TL_iv.PageBlock pageBlock = mk0Var.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = mm9.f(dg9Var.getText());
                    }
                }
                yh9 yh9Var = rf9Var.h;
                if (yh9Var != null && rf9Var.f != null) {
                    yh9Var.a.X3();
                    return;
                }
                return;
            case 7:
                ((pl9) obj).g();
                return;
            default:
                xl9 xl9Var = (xl9) obj;
                mk0 mk0Var2 = xl9Var.a;
                if (mk0Var2 != null) {
                    mk0Var2.s = true;
                    mk0Var2.r = xl9Var.r.r2;
                }
                xl9Var.w();
                xh9 xh9Var = xl9Var.F;
                if (xh9Var != null && xl9Var.a != null) {
                    xh9Var.a.X3();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$setParameters$4;
        Boolean lambda$setDirection$5;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                lambda$setParameters$4 = RtpSender.lambda$setParameters$4((RtpParameters) obj, j);
                return lambda$setParameters$4;
            default:
                lambda$setDirection$5 = RtpTransceiver.lambda$setDirection$5((RtpTransceiver.RtpTransceiverDirection) obj, j);
                return lambda$setDirection$5;
        }
    }

    @Override
    public final void d(float r19, float r20, int r21, android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void dispose(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 18:
                ((RtpSender) obj).lambda$dispose$8(j);
                return;
            default:
                ((RtpTransceiver) obj).lambda$dispose$10(j);
                return;
        }
    }

    @Override
    public final boolean e(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                aw9 aw9Var = (aw9) obj;
                ox0 ox0Var = aw9Var.c;
                r47 E = ox0Var.E(i);
                aw9 aw9Var2 = (aw9) ox0Var.d;
                if (E == null) {
                    return false;
                }
                if (!aw9Var.J.u()) {
                    aw9Var.J.e();
                    ox0Var.l(0, aw9Var2.r);
                }
                if (aw9Var.J.u()) {
                    aw9Var.J.h(E, view, 0);
                    if (!aw9Var.J.u()) {
                        ox0Var.l(0, aw9Var2.r);
                    }
                    qg4 qg4Var = aw9Var.K;
                    int e1 = E.e1();
                    qg4Var.a = r47.B0(E.k);
                    qg4Var.b = e1;
                }
                return true;
            default:
                return ((k2a) obj).a1(i, view);
        }
    }

    @Override
    public final void f(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 26:
                y3a y3aVar = (y3a) obj;
                if (y3aVar != null) {
                    y3aVar.c();
                    return;
                }
                return;
            default:
                v5b v5bVar = (v5b) obj;
                if (z) {
                    v5bVar.p(30, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(float f) {
        r47 r47Var = ((ck9) this.b).X;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
        MediaController.z().k0(r47Var, f);
    }

    @Override
    public final fu5 i(dg9 dg9Var) {
        return fu5.I((yg9) ((j09) this.b).b, dg9Var);
    }

    public final void j(int i) {
        ze9 ze9Var = (ze9) this.b;
        ze9Var.c = i;
        ze9Var.e(i);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        if (((pi9[]) this.b)[0] != null && (view instanceof km9)) {
            ((km9) view).A();
        }
    }

    @Override
    public final int l(vnb vnbVar, boolean z) {
        return ((IntSupplier) this.b).getAsInt();
    }

    public final void m(Canvas canvas) {
        dr9 dr9Var = (dr9) this.b;
        Paint paint = dr9Var.K;
        RectF rectF = dr9Var.d;
        dr9Var.d(canvas);
        er9 er9Var = dr9Var.P;
        FrameLayout frameLayout = er9Var.h;
        TextureView textureView = er9Var.n;
        if (frameLayout.getVisibility() == 0 && frameLayout.getWidth() > 0) {
            canvas.save();
            canvas.translate(frameLayout.getLeft(), frameLayout.getTop());
            canvas.concat(frameLayout.getMatrix());
            float L = (1.0f - er9Var.U) * hl.L(12.0f);
            rectF.set(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight());
            canvas.clipRect(rectF);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, L, L, paint);
            if (textureView.isAvailable() && textureView.isAttachedToWindow()) {
                canvas.translate(textureView.getLeft(), textureView.getTop());
                canvas.concat(textureView.getMatrix());
                textureView.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void n(long j, ey7 ey7Var) {
        ivd.a(j, ey7Var, ((oz9) this.b).c);
    }

    @Override
    public final boolean q(defpackage.uj3 r24, java.util.ArrayList r25, java.lang.CharSequence r26, boolean r27, boolean r28, int r29, int r30, defpackage.tzb r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.q(uj3, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, tzb):boolean");
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                RtpReceiver.lambda$setFrameDecryptor$5((FrameDecryptor) obj, j);
                return;
            default:
                RtpSender.lambda$setFrameEncryptor$7((FrameEncryptor) obj, j);
                return;
        }
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        gr9 gr9Var = (gr9) this.b;
        if (z && !z2) {
            gr9Var.a();
        }
    }

    @Override
    public final void w(id idVar, int i) {
        ((lb7) this.b).run();
    }

    @Override
    public final void h(float f) {
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
