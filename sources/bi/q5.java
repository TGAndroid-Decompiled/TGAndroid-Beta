package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;
public final class q5 extends FrameLayout {
    public final org.telegram.ui.Components.l9 f4569a;
    public final y5 f4570b;
    public final org.telegram.ui.Components.j6 f4571c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f4572e;
    public float f4573f;

    public q5(Context context) {
        super(context);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f4569a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(13.0f));
        addView(l9Var, c8.ha.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        y5 y5Var = new y5(context);
        this.f4570b = y5Var;
        y5Var.f5077e = org.telegram.messenger.g0.L(18.0f);
        y5Var.f5074a.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        addView(y5Var, c8.ha.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f4571c = j6Var;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setGravity(17);
        j6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        j6Var.setTextColor(-1);
        addView(j6Var, c8.ha.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        c8.ka.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f4572e = null;
        org.telegram.ui.Components.l9 l9Var = this.f4569a;
        l9Var.setScaleX(1.0f);
        l9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            l9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(org.telegram.messenger.g0.L(26.0f));
            shapeDrawable.setIntrinsicHeight(org.telegram.messenger.g0.L(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            l9Var.setImageDrawable(shapeDrawable);
            return;
        }
        l9Var.setAlpha(1.0f);
        l9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.k6.r1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f4572e = stargiftattributepattern;
        org.telegram.ui.Components.l9 l9Var = this.f4569a;
        if (stargiftattributepattern == null) {
            l9Var.setAlpha(0.25f);
            l9Var.setScaleX(0.75f);
            l9Var.setScaleY(0.75f);
            l9Var.setTranslationY(0.0f);
            l9Var.setAnimatedEmojiDrawable(null);
            l9Var.setImageResource(2131231972);
            return;
        }
        l9Var.setAlpha(1.0f);
        l9Var.setScaleX(0.95f);
        l9Var.setScaleY(0.95f);
        l9Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.Components.i5 l10 = org.telegram.ui.Components.i5.l(p10.f24467s0, 9, stargiftattributepattern.document);
        l10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        l9Var.setAnimatedEmojiDrawable(l10);
    }

    public final void c(boolean z9, float f10) {
        this.f4573f = f10;
        y5 y5Var = this.f4570b;
        y5Var.d = f10;
        if (!z9) {
            y5Var.f5075b.e(true, f10);
        }
        y5Var.invalidate();
        this.f4571c.c(Math.round(f10 * 100.0f) + "%", z9, true);
    }
}
