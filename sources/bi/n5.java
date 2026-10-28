package bi;

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
import org.telegram.ui.Components.kb1;
public final class n5 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f5127a;
    public final u5 f5128b;
    public final org.telegram.ui.Components.s6 f5129c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f5130f;

    public n5(Context context) {
        super(context);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f5127a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(y9Var, kb1.h(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        u5 u5Var = new u5(context);
        this.f5128b = u5Var;
        u5Var.e = AndroidUtilities.dp(18.0f);
        u5Var.f5514a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(u5Var, kb1.h(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.f5129c = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(17);
        s6Var.setTextSize(AndroidUtilities.dp(12.0f));
        s6Var.setTextColor(-1);
        addView(s6Var, kb1.h(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        kb1.b(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        org.telegram.ui.Components.y9 y9Var = this.f5127a;
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            y9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            y9Var.setImageDrawable(shapeDrawable);
            return;
        }
        y9Var.setAlpha(1.0f);
        y9Var.setImageDrawable(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.y6.o1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        org.telegram.ui.Components.y9 y9Var = this.f5127a;
        if (stargiftattributepattern == null) {
            y9Var.setAlpha(0.25f);
            y9Var.setScaleX(0.75f);
            y9Var.setScaleY(0.75f);
            y9Var.setTranslationY(0.0f);
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        y9Var.setAlpha(1.0f);
        y9Var.setScaleX(0.95f);
        y9Var.setScaleY(0.95f);
        y9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.t5 m10 = org.telegram.ui.Components.t5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        y9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f7, boolean z10) {
        this.f5130f = f7;
        u5 u5Var = this.f5128b;
        u5Var.d = f7;
        if (!z10) {
            u5Var.f5515b.d(f7, true);
        }
        u5Var.invalidate();
        this.f5129c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
