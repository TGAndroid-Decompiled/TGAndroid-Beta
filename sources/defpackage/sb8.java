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
public final class sb8 implements pw2 {
    public final String a;
    public final oec b;
    public final no6 c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean h;
    public final PhotoViewer n;

    public sb8(PhotoViewer photoViewer, String str, oec oecVar, no6 no6Var, boolean z, int i, int i2, boolean z2) {
        this.n = photoViewer;
        this.a = str;
        this.b = oecVar;
        this.c = no6Var;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.h = z2;
    }

    @Override
    public final boolean A() {
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
    public final void F(CharSequence charSequence, String str, rx1 rx1Var) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        q();
        photoViewer.o5.o(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.s0(), this.c.c, rx1Var, null);
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final fu5 J(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final boolean M() {
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
        q();
        photoViewer.o5.o(this.a, this.b, str, null, true, 0L, null, null, photoViewer.s0(), this.c.c, null, null);
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
        q();
        photoViewer.o5.o(this.a, this.b, str, null, false, 0L, null, null, photoViewer.s0(), this.c.c, null, photoViewer.C7);
    }

    @Override
    public final boolean n() {
        return true;
    }

    public final void q() {
        rw2 e = rw2.e();
        ImageReceiver imageReceiver = e.A;
        no6 no6Var = this.c;
        if (no6Var.c != null) {
            try {
                new File(no6Var.c).delete();
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            no6Var.c = null;
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
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, e.C.getWidth(), e.C.getHeight());
            path.addRoundRect(rectF, e.C.getWidth() / 8.0f, e.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            e.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.n;
        TLRPC.PhotoSize V = in5.V(createBitmap, photoViewer.d0(), 512.0f, 512.0f, 83);
        xb4.G(photoViewer.U);
        no6Var.c = xb4.J(V, null, true, true).toString();
    }

    @Override
    public final void t(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        q();
        photoViewer.o5.o(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.y7, photoViewer.s0(), this.c.c, null, null);
    }

    @Override
    public final boolean u() {
        ed8 ed8Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.n;
        zu1 zu1Var = photoViewer.k4;
        if ((zu1Var == null || (chat = zu1Var.e) == null || xc2.t(chat)) && (ed8Var = photoViewer.d) != null) {
            if (!ed8Var.Q() || photoViewer.k4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void w(String str) {
        PhotoViewer photoViewer = this.n;
        ed8 ed8Var = photoViewer.d;
        if (ed8Var != null) {
            boolean Q = ed8Var.Q();
            no6 no6Var = this.c;
            if (Q) {
                if (photoViewer.k4 == null) {
                    return;
                }
                photoViewer.B7 = true;
                q();
                photoViewer.o5.o(this.a, this.b, str, null, false, photoViewer.k4.a(), null, null, photoViewer.s0(), no6Var.c, null, null);
                return;
            }
            photoViewer.B7 = true;
            q();
            no6Var.h = this.a;
            photoViewer.d.L(photoViewer.O4, this.b, this.d, this.e, this.f, this.h);
            jn7.f(yac.t0).m(jn7.u3, Boolean.TRUE);
        }
    }

    @Override
    public final r47 x() {
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
    public final void N() {
    }

    @Override
    public final void O() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void K(k7a k7aVar) {
    }

    @Override
    public final void m(TLRPC.Document document) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void s(TLRPC.Document document) {
    }

    @Override
    public final void z(TLRPC.Document document) {
    }

    @Override
    public final void L(Object obj, Object obj2) {
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void v(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
