package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stars;
public final class kra extends FrameLayout {
    public final bf0 a;
    public final pra b;
    public final io c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f;

    public kra(Context context) {
        super(context);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(13.0f));
        addView(bf0Var, qoe.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        pra praVar = new pra(context);
        this.b = praVar;
        praVar.e = gm.L(18.0f);
        praVar.a.setStrokeWidth(gm.L(3.0f));
        addView(praVar, qoe.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        io ioVar = new io(context, false, false, false);
        this.c = ioVar;
        ioVar.setTypeface(gm.o());
        ioVar.setGravity(17);
        ioVar.setTextSize(gm.L(12.0f));
        ioVar.setTextColor(-1);
        addView(ioVar, qoe.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        rve.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        bf0 bf0Var = this.a;
        bf0Var.setScaleX(1.0f);
        bf0Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            bf0Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(gm.L(26.0f), gm.L(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(gm.L(26.0f));
            shapeDrawable.setIntrinsicHeight(gm.L(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(gm.L(13.0f), gm.L(13.0f), gm.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            bf0Var.setImageDrawable(shapeDrawable);
            return;
        }
        bf0Var.setAlpha(1.0f);
        bf0Var.setImageDrawable(cmb.K(gm.L(26.0f), cmb.p1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        bf0 bf0Var = this.a;
        if (stargiftattributepattern == null) {
            bf0Var.setAlpha(0.25f);
            bf0Var.setScaleX(0.75f);
            bf0Var.setScaleY(0.75f);
            bf0Var.setTranslationY(0.0f);
            bf0Var.setAnimatedEmojiDrawable(null);
            bf0Var.setImageResource(2131231977);
            return;
        }
        bf0Var.setAlpha(1.0f);
        bf0Var.setScaleX(0.95f);
        bf0Var.setScaleY(0.95f);
        bf0Var.setTranslationY(gm.L(2.0f));
        vm l = vm.l(z8c.t0, 9, stargiftattributepattern.document);
        l.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        bf0Var.setAnimatedEmojiDrawable(l);
    }

    public final void c(boolean z, float f) {
        this.f = f;
        pra praVar = this.b;
        praVar.d = f;
        if (!z) {
            praVar.b.e(true, f);
        }
        praVar.invalidate();
        this.c.c(Math.round(f * 100.0f) + "%", z, true);
    }
}
