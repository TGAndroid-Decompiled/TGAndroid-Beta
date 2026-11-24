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
public final class kpa extends FrameLayout {
    public final be0 a;
    public final ppa b;
    public final hn c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f;

    public kpa(Context context) {
        super(context);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(13.0f));
        addView(be0Var, nme.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        ppa ppaVar = new ppa(context);
        this.b = ppaVar;
        ppaVar.e = gl.L(18.0f);
        ppaVar.a.setStrokeWidth(gl.L(3.0f));
        addView(ppaVar, nme.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.c = hnVar;
        hnVar.setTypeface(gl.o());
        hnVar.setGravity(17);
        hnVar.setTextSize(gl.L(12.0f));
        hnVar.setTextColor(-1);
        addView(hnVar, nme.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        ote.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        be0 be0Var = this.a;
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            be0Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(gl.L(26.0f), gl.L(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(gl.L(26.0f));
            shapeDrawable.setIntrinsicHeight(gl.L(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(gl.L(13.0f), gl.L(13.0f), gl.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            be0Var.setImageDrawable(shapeDrawable);
            return;
        }
        be0Var.setAlpha(1.0f);
        be0Var.setImageDrawable(bkb.K(gl.L(26.0f), bkb.p1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        be0 be0Var = this.a;
        if (stargiftattributepattern == null) {
            be0Var.setAlpha(0.25f);
            be0Var.setScaleX(0.75f);
            be0Var.setScaleY(0.75f);
            be0Var.setTranslationY(0.0f);
            be0Var.setAnimatedEmojiDrawable(null);
            be0Var.setImageResource(2131231976);
            return;
        }
        be0Var.setAlpha(1.0f);
        be0Var.setScaleX(0.95f);
        be0Var.setScaleY(0.95f);
        be0Var.setTranslationY(gl.L(2.0f));
        vl l = vl.l(y6c.t0, 9, stargiftattributepattern.document);
        l.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        be0Var.setAnimatedEmojiDrawable(l);
    }

    public final void c(boolean z, float f) {
        this.f = f;
        ppa ppaVar = this.b;
        ppaVar.d = f;
        if (!z) {
            ppaVar.b.e(true, f);
        }
        ppaVar.invalidate();
        this.c.c(Math.round(f * 100.0f) + "%", z, true);
    }
}
