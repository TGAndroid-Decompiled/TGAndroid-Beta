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
public final class b88 implements vv2 {
    public final String a;
    public final oac b;
    public final jm6 c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean h;
    public final PhotoViewer n;

    public b88(PhotoViewer photoViewer, String str, oac oacVar, jm6 jm6Var, boolean z, int i, int i2, boolean z2) {
        this.n = photoViewer;
        this.a = str;
        this.b = oacVar;
        this.c = jm6Var;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.h = z2;
    }

    @Override
    public final boolean A(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String C(boolean z) {
        return null;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final cs5 F(ViewGroup viewGroup) {
        return null;
    }

    public final void G() {
        xv2 e = xv2.e();
        ImageReceiver imageReceiver = e.A;
        jm6 jm6Var = this.c;
        if (jm6Var.c != null) {
            try {
                new File(jm6Var.c).delete();
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            jm6Var.c = null;
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
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, e.C.getWidth(), e.C.getHeight());
            path.addRoundRect(rectF, e.C.getWidth() / 8.0f, e.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            e.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.f9;
        PhotoViewer photoViewer = this.n;
        TLRPC.PhotoSize V = fl5.V(createBitmap, photoViewer.e0(), 512.0f, 512.0f, 83);
        ba4.G(photoViewer.U);
        jm6Var.c = ba4.J(V, null, true, true).toString();
    }

    @Override
    public final boolean K() {
        if (this.n.z7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean O(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void P(String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.C7 = true;
        G();
        photoViewer.p5.o(this.a, this.b, str, null, true, 0L, null, null, photoViewer.t0(), this.c.c, null, null);
    }

    @Override
    public final void Q(CharSequence charSequence, String str, pz1 pz1Var) {
        PhotoViewer photoViewer = this.n;
        photoViewer.C7 = true;
        G();
        photoViewer.p5.o(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.t0(), this.c.c, pz1Var, null);
    }

    @Override
    public final Boolean R(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean S() {
        return true;
    }

    @Override
    public final long a() {
        return this.n.E5;
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
        photoViewer.C7 = true;
        G();
        photoViewer.p5.o(this.a, this.b, str, null, false, 0L, null, null, photoViewer.t0(), this.c.c, null, photoViewer.D7);
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final void s(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.C7 = true;
        G();
        photoViewer.p5.o(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.z7, photoViewer.t0(), this.c.c, null, null);
    }

    @Override
    public final boolean t() {
        o98 o98Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.n;
        mu1 mu1Var = photoViewer.l4;
        if ((mu1Var == null || (chat = mu1Var.e) == null || hc2.t(chat)) && (o98Var = photoViewer.d) != null) {
            if (!o98Var.Q() || photoViewer.l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void v(String str) {
        PhotoViewer photoViewer = this.n;
        o98 o98Var = photoViewer.d;
        if (o98Var != null) {
            boolean Q = o98Var.Q();
            jm6 jm6Var = this.c;
            if (Q) {
                if (photoViewer.l4 == null) {
                    return;
                }
                photoViewer.C7 = true;
                G();
                photoViewer.p5.o(this.a, this.b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.t0(), jm6Var.c, null, null);
                return;
            }
            photoViewer.C7 = true;
            G();
            jm6Var.h = this.a;
            photoViewer.d.L(photoViewer.P4, this.b, this.d, this.e, this.f, this.h);
            kk7.f(y6c.t0).m(kk7.t3, Boolean.TRUE);
        }
    }

    @Override
    public final k27 w() {
        return null;
    }

    @Override
    public final boolean x() {
        if (this.n.D7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void L() {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void H(s3a s3aVar) {
    }

    @Override
    public final void m(TLRPC.Document document) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void y(TLRPC.Document document) {
    }

    @Override
    public final void I(Object obj, Object obj2) {
    }

    @Override
    public final void N(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
