package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class u3 extends FrameLayout {
    public final org.telegram.ui.Components.p9 f14867a;
    public final a4 f14868b;
    public final org.telegram.ui.Components.k6 f14869c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f14870e;
    public float f14871f;

    public u3(Context context) {
        super(context);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f14867a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(p9Var, k7.c6.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        a4 a4Var = new a4(context);
        this.f14868b = a4Var;
        a4Var.f13689e = AndroidUtilities.dp(18.0f);
        a4Var.f13686a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(a4Var, k7.c6.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f14869c = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity(17);
        k6Var.setTextSize(AndroidUtilities.dp(12.0f));
        k6Var.setTextColor(-1);
        addView(k6Var, k7.c6.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        k7.e6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f14870e = null;
        org.telegram.ui.Components.p9 p9Var = this.f14867a;
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            p9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            p9Var.setImageDrawable(shapeDrawable);
            return;
        }
        p9Var.setAlpha(1.0f);
        p9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.k6.l1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f14870e = stargiftattributepattern;
        org.telegram.ui.Components.p9 p9Var = this.f14867a;
        if (stargiftattributepattern == null) {
            p9Var.setAlpha(0.25f);
            p9Var.setScaleX(0.75f);
            p9Var.setScaleY(0.75f);
            p9Var.setTranslationY(0.0f);
            p9Var.setAnimatedEmojiDrawable(null);
            p9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        p9Var.setAlpha(1.0f);
        p9Var.setScaleX(0.95f);
        p9Var.setScaleY(0.95f);
        p9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.l5 m9 = org.telegram.ui.Components.l5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m9.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        p9Var.setAnimatedEmojiDrawable(m9);
    }

    public final void c(float f10, boolean z4) {
        this.f14871f = f10;
        a4 a4Var = this.f14868b;
        a4Var.d = f10;
        if (!z4) {
            a4Var.f13687b.d(f10, true);
        }
        a4Var.invalidate();
        this.f14869c.c(Math.round(f10 * 100.0f) + "%", z4, true);
    }
}
