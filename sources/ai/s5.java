package ai;

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
public final class s5 extends FrameLayout {
    public final org.telegram.ui.Components.u9 f2152a;
    public final z5 f2153b;
    public final org.telegram.ui.Components.o6 f2154c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f2155f;

    public s5(Context context) {
        super(context);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f2152a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(u9Var, w7.z5.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        z5 z5Var = new z5(context);
        this.f2153b = z5Var;
        z5Var.e = AndroidUtilities.dp(18.0f);
        z5Var.f2541a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(z5Var, w7.z5.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f2154c = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(12.0f));
        o6Var.setTextColor(-1);
        addView(o6Var, w7.z5.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        w7.b6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        org.telegram.ui.Components.u9 u9Var = this.f2152a;
        u9Var.setScaleX(1.0f);
        u9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            u9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            u9Var.setImageDrawable(shapeDrawable);
            return;
        }
        u9Var.setAlpha(1.0f);
        u9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.k6.o1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        org.telegram.ui.Components.u9 u9Var = this.f2152a;
        if (stargiftattributepattern == null) {
            u9Var.setAlpha(0.25f);
            u9Var.setScaleX(0.75f);
            u9Var.setScaleY(0.75f);
            u9Var.setTranslationY(0.0f);
            u9Var.setAnimatedEmojiDrawable(null);
            u9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        u9Var.setAlpha(1.0f);
        u9Var.setScaleX(0.95f);
        u9Var.setScaleY(0.95f);
        u9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        u9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f7, boolean z10) {
        this.f2155f = f7;
        z5 z5Var = this.f2153b;
        z5Var.d = f7;
        if (!z10) {
            z5Var.f2542b.d(f7, true);
        }
        z5Var.invalidate();
        this.f2154c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
