package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m38 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final px4 e;
    public final de0 f;
    public final tx4 h;
    public TLRPC.Document n;

    public m38(vnb vnbVar, Context context, boolean z) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        px4 px4Var = new px4(frameLayout, vnbVar, false);
        this.e = px4Var;
        frameLayout.setBackground(px4Var);
        addView(frameLayout, tre.e(-1, -1, 119));
        iye.b(frameLayout, 0.025f, 1.25f);
        de0 de0Var = new de0(context);
        this.f = de0Var;
        frameLayout.addView(de0Var, tre.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z) {
            tx4 tx4Var = new tx4(context);
            this.h = tx4Var;
            addView(tx4Var, tre.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
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
            i3 = hl.L(4.0f);
            i2 = hl.L(4.0f);
        } else {
            i2 = 0;
            i3 = 0;
        }
        setPadding(i3, 0, i2, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        px4 px4Var = this.e;
        px4Var.d(stargiftattributebackdrop);
        px4Var.e(this.c);
    }

    public final void b(boolean z, boolean z2) {
        float f;
        this.e.f(z, z2);
        if (z) {
            f = 0.9f;
        } else {
            f = 1.0f;
        }
        de0 de0Var = this.f;
        if (z2) {
            de0Var.animate().scaleX(f).scaleY(f).start();
            return;
        }
        de0Var.animate().cancel();
        de0Var.setScaleX(f);
        de0Var.setScaleY(f);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        de0 de0Var = this.f;
        if (document == null) {
            de0Var.b();
            this.n = null;
        } else if (this.n == document) {
        } else {
            this.n = document;
            TLRPC.PhotoSize w = xb4.w(document.thumbs, hl.L(100.0f), false, null, false);
            de0Var.j(jn5.b(document), "100_100", jn5.c(w, document), "100_100", lp3.f(document, aob.a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
