package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.messenger.i10;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 extends FrameLayout {
    public final org.telegram.ui.Components.p9 f9563a;
    public final w4 f9564b;
    public final org.telegram.ui.Components.n6 f9565c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f9566e;
    public float f9567f;

    public q4(Context context) {
        super(context);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f9563a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(13.0f));
        addView(p9Var, c8.na.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        w4 w4Var = new w4(context);
        this.f9564b = w4Var;
        w4Var.f9950e = org.telegram.messenger.g0.L(18.0f);
        w4Var.f9947a.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        addView(w4Var, c8.na.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f9565c = n6Var;
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setGravity(17);
        n6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        n6Var.setTextColor(-1);
        addView(n6Var, c8.na.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        c8.sa.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f9566e = null;
        org.telegram.ui.Components.p9 p9Var = this.f9563a;
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            p9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(org.telegram.messenger.g0.L(26.0f));
            shapeDrawable.setIntrinsicHeight(org.telegram.messenger.g0.L(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            p9Var.setImageDrawable(shapeDrawable);
            return;
        }
        p9Var.setAlpha(1.0f);
        p9Var.setImageDrawable(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.n6.r1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f9566e = stargiftattributepattern;
        org.telegram.ui.Components.p9 p9Var = this.f9563a;
        if (stargiftattributepattern == null) {
            p9Var.setAlpha(0.25f);
            p9Var.setScaleX(0.75f);
            p9Var.setScaleY(0.75f);
            p9Var.setTranslationY(0.0f);
            p9Var.setAnimatedEmojiDrawable(null);
            p9Var.setImageResource(2131231976);
            return;
        }
        p9Var.setAlpha(1.0f);
        p9Var.setScaleX(0.95f);
        p9Var.setScaleY(0.95f);
        p9Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.Components.o5 l10 = org.telegram.ui.Components.o5.l(i10.f24637t0, 9, stargiftattributepattern.document);
        l10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        p9Var.setAnimatedEmojiDrawable(l10);
    }

    public final void c(boolean z10, float f10) {
        this.f9567f = f10;
        w4 w4Var = this.f9564b;
        w4Var.d = f10;
        if (!z10) {
            w4Var.f9948b.e(true, f10);
        }
        w4Var.invalidate();
        this.f9565c.c(Math.round(f10 * 100.0f) + "%", z10, true);
    }
}
