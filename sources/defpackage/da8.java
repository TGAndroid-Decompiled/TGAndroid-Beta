package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class da8 implements fx2 {
    public final String a;
    public final rcc b;
    public final jo6 c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean h;
    public final PhotoViewer n;

    public da8(PhotoViewer photoViewer, String str, rcc rccVar, jo6 jo6Var, boolean z, int i, int i2, boolean z2) {
        this.n = photoViewer;
        this.a = str;
        this.b = rccVar;
        this.c = jo6Var;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.h = z2;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String E(boolean z) {
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final bu5 I(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final boolean L() {
        if (this.n.y7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void R(String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        v();
        photoViewer.o5.o(this.a, this.b, str, null, true, 0L, null, null, photoViewer.t0(), this.c.c, null, null);
    }

    @Override
    public final Boolean S(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean T() {
        return true;
    }

    @Override
    public final long a() {
        return this.n.D5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean j(int i) {
        return false;
    }

    @Override
    public final void l(String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        v();
        photoViewer.o5.o(this.a, this.b, str, null, false, 0L, null, null, photoViewer.t0(), this.c.c, null, photoViewer.C7);
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final void s(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        v();
        photoViewer.o5.o(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.y7, photoViewer.t0(), this.c.c, null, null);
    }

    @Override
    public final boolean t() {
        pb8 pb8Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.n;
        yv1 yv1Var = photoViewer.k4;
        if ((yv1Var == null || (chat = yv1Var.e) == null || sd2.t(chat)) && (pb8Var = photoViewer.d) != null) {
            if (!pb8Var.R() || photoViewer.k4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v() {
        hx2 e = hx2.e();
        ImageReceiver imageReceiver = e.A;
        jo6 jo6Var = this.c;
        if (jo6Var.c != null) {
            try {
                new File(jo6Var.c).delete();
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            jo6Var.c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        imageReceiver.setAlpha(1.0f);
        imageReceiver.i0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        imageReceiver.h(canvas, null);
        if (e.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / e.C.getWidth(), createBitmap.getHeight() / e.C.getHeight());
            e.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, e.C.getWidth(), e.C.getHeight());
            path.addRoundRect(rectF, e.C.getWidth() / 8.0f, e.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            e.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.n;
        TLRPC.PhotoSize V = fn5.V(createBitmap, photoViewer.e0(), 512.0f, 512.0f, 83);
        bc4.G(photoViewer.U);
        jo6Var.c = bc4.J(V, null, true, true).toString();
    }

    @Override
    public final void w(String str) {
        PhotoViewer photoViewer = this.n;
        pb8 pb8Var = photoViewer.d;
        if (pb8Var != null) {
            boolean R = pb8Var.R();
            jo6 jo6Var = this.c;
            if (R) {
                if (photoViewer.k4 == null) {
                    return;
                }
                photoViewer.B7 = true;
                v();
                photoViewer.o5.o(this.a, this.b, str, null, false, photoViewer.k4.a(), null, null, photoViewer.t0(), jo6Var.c, null, null);
                return;
            }
            photoViewer.B7 = true;
            v();
            jo6Var.h = this.a;
            photoViewer.d.M(photoViewer.O4, this.b, this.d, this.e, this.f, this.h);
            nm7.f(z8c.t0).m(nm7.u3, Boolean.TRUE);
        }
    }

    @Override
    public final k47 x() {
        return null;
    }

    @Override
    public final boolean y() {
        if (this.n.C7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void z(CharSequence charSequence, String str, qy1 qy1Var) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        v();
        photoViewer.o5.o(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.t0(), this.c.c, qy1Var, null);
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void J(t5a t5aVar) {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(TLRPC.Document document) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void K(Object obj, Object obj2) {
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
