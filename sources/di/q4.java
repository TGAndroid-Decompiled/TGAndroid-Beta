package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.messenger.j10;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 extends FrameLayout {
    public final org.telegram.ui.Components.q9 f9599a;
    public final w4 f9600b;
    public final org.telegram.ui.Components.o6 f9601c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f9602e;
    public float f9603f;

    public q4(Context context) {
        super(context);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f9599a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(13.0f));
        addView(q9Var, c8.ma.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        w4 w4Var = new w4(context);
        this.f9600b = w4Var;
        w4Var.f9986e = org.telegram.messenger.g0.L(18.0f);
        w4Var.f9983a.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        addView(w4Var, c8.ma.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f9601c = o6Var;
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setGravity(17);
        o6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        o6Var.setTextColor(-1);
        addView(o6Var, c8.ma.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        c8.ra.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f9602e = null;
        org.telegram.ui.Components.q9 q9Var = this.f9599a;
        q9Var.setScaleX(1.0f);
        q9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            q9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(org.telegram.messenger.g0.L(26.0f));
            shapeDrawable.setIntrinsicHeight(org.telegram.messenger.g0.L(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            q9Var.setImageDrawable(shapeDrawable);
            return;
        }
        q9Var.setAlpha(1.0f);
        q9Var.setImageDrawable(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.m6.r1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f9602e = stargiftattributepattern;
        org.telegram.ui.Components.q9 q9Var = this.f9599a;
        if (stargiftattributepattern == null) {
            q9Var.setAlpha(0.25f);
            q9Var.setScaleX(0.75f);
            q9Var.setScaleY(0.75f);
            q9Var.setTranslationY(0.0f);
            q9Var.setAnimatedEmojiDrawable(null);
            q9Var.setImageResource(2131231973);
            return;
        }
        q9Var.setAlpha(1.0f);
        q9Var.setScaleX(0.95f);
        q9Var.setScaleY(0.95f);
        q9Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(j10.f24798t0, 9, stargiftattributepattern.document);
        l10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        q9Var.setAnimatedEmojiDrawable(l10);
    }

    public final void c(boolean z10, float f10) {
        this.f9603f = f10;
        w4 w4Var = this.f9600b;
        w4Var.d = f10;
        if (!z10) {
            w4Var.f9984b.e(true, f10);
        }
        w4Var.invalidate();
        this.f9601c.c(Math.round(f10 * 100.0f) + "%", z10, true);
    }
}
