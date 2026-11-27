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
public final class lta extends FrameLayout {
    public final de0 a;
    public final qta b;
    public final in c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f;

    public lta(Context context) {
        super(context);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(13.0f));
        addView(de0Var, tre.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        qta qtaVar = new qta(context);
        this.b = qtaVar;
        qtaVar.e = hl.L(18.0f);
        qtaVar.a.setStrokeWidth(hl.L(3.0f));
        addView(qtaVar, tre.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        in inVar = new in(context, false, false, false);
        this.c = inVar;
        inVar.setTypeface(hl.o());
        inVar.setGravity(17);
        inVar.setTextSize(hl.L(12.0f));
        inVar.setTextColor(-1);
        addView(inVar, tre.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        iye.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        de0 de0Var = this.a;
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            de0Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(hl.L(26.0f), hl.L(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(hl.L(26.0f));
            shapeDrawable.setIntrinsicHeight(hl.L(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(hl.L(13.0f), hl.L(13.0f), hl.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            de0Var.setImageDrawable(shapeDrawable);
            return;
        }
        de0Var.setAlpha(1.0f);
        de0Var.setImageDrawable(aob.K(hl.L(26.0f), aob.p1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        de0 de0Var = this.a;
        if (stargiftattributepattern == null) {
            de0Var.setAlpha(0.25f);
            de0Var.setScaleX(0.75f);
            de0Var.setScaleY(0.75f);
            de0Var.setTranslationY(0.0f);
            de0Var.setAnimatedEmojiDrawable(null);
            de0Var.setImageResource(2131231976);
            return;
        }
        de0Var.setAlpha(1.0f);
        de0Var.setScaleX(0.95f);
        de0Var.setScaleY(0.95f);
        de0Var.setTranslationY(hl.L(2.0f));
        wl l = wl.l(yac.t0, 9, stargiftattributepattern.document);
        l.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        de0Var.setAnimatedEmojiDrawable(l);
    }

    public final void c(boolean z, float f) {
        this.f = f;
        qta qtaVar = this.b;
        qtaVar.d = f;
        if (!z) {
            qtaVar.b.e(true, f);
        }
        qtaVar.invalidate();
        this.c.c(Math.round(f * 100.0f) + "%", z, true);
    }
}
