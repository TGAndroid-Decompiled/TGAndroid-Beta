package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j28 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final lx4 e;
    public final bf0 f;
    public final px4 h;
    public TLRPC.Document n;

    public j28(ylb ylbVar, Context context, boolean z) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        lx4 lx4Var = new lx4(frameLayout, ylbVar, false);
        this.e = lx4Var;
        frameLayout.setBackground(lx4Var);
        addView(frameLayout, qoe.e(-1, -1, 119));
        rve.b(frameLayout, 0.025f, 1.25f);
        bf0 bf0Var = new bf0(context);
        this.f = bf0Var;
        frameLayout.addView(bf0Var, qoe.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z) {
            px4 px4Var = new px4(context);
            this.h = px4Var;
            addView(px4Var, qoe.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
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
            i3 = gm.L(4.0f);
            i2 = gm.L(4.0f);
        } else {
            i2 = 0;
            i3 = 0;
        }
        setPadding(i3, 0, i2, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        lx4 lx4Var = this.e;
        lx4Var.d(stargiftattributebackdrop);
        lx4Var.e(this.c);
    }

    public final void b(boolean z, boolean z2) {
        float f;
        this.e.f(z, z2);
        if (z) {
            f = 0.9f;
        } else {
            f = 1.0f;
        }
        bf0 bf0Var = this.f;
        if (z2) {
            bf0Var.animate().scaleX(f).scaleY(f).start();
            return;
        }
        bf0Var.animate().cancel();
        bf0Var.setScaleX(f);
        bf0Var.setScaleY(f);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        bf0 bf0Var = this.f;
        if (document == null) {
            bf0Var.b();
            this.n = null;
        } else if (this.n == document) {
        } else {
            this.n = document;
            TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(100.0f), false, null, false);
            bf0Var.j(gn5.b(document), "100_100", gn5.c(w, document), "100_100", eq3.f(document, cmb.Z6, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
