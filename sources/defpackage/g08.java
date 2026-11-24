package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g08 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final kv4 e;
    public final be0 f;
    public final ov4 h;
    public TLRPC.Document n;

    public g08(wjb wjbVar, Context context, boolean z) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        kv4 kv4Var = new kv4(frameLayout, wjbVar, false);
        this.e = kv4Var;
        frameLayout.setBackground(kv4Var);
        addView(frameLayout, nme.e(-1, -1, 119));
        ote.b(frameLayout, 0.025f, 1.25f);
        be0 be0Var = new be0(context);
        this.f = be0Var;
        frameLayout.addView(be0Var, nme.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z) {
            ov4 ov4Var = new ov4(context);
            this.h = ov4Var;
            addView(ov4Var, nme.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i2;
        int i3;
        this.a = tL_starGiftUnique.id;
        boolean z = true;
        if (i % 3 != 1) {
            z = false;
        }
        if (z) {
            i3 = gl.L(4.0f);
            i2 = gl.L(4.0f);
        } else {
            i2 = 0;
            i3 = 0;
        }
        setPadding(i3, 0, i2, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        kv4 kv4Var = this.e;
        kv4Var.d(stargiftattributebackdrop);
        kv4Var.e(this.c);
    }

    public final void b(boolean z, boolean z2) {
        float f;
        this.e.f(z, z2);
        if (z) {
            f = 0.9f;
        } else {
            f = 1.0f;
        }
        be0 be0Var = this.f;
        if (z2) {
            be0Var.animate().scaleX(f).scaleY(f).start();
            return;
        }
        be0Var.animate().cancel();
        be0Var.setScaleX(f);
        be0Var.setScaleY(f);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        be0 be0Var = this.f;
        if (document == null) {
            be0Var.b();
            this.n = null;
        } else if (this.n == document) {
        } else {
            this.n = document;
            TLRPC.PhotoSize w = ba4.w(document.thumbs, gl.L(100.0f), false, null, false);
            be0Var.j(gl5.b(document), "100_100", gl5.c(w, document), "100_100", uo3.f(document, bkb.Z6, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
