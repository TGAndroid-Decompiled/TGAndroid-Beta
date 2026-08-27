package hh;

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

public final class v3 extends FrameLayout {

    public final org.telegram.ui.Components.n9 f10206a;

    public final b4 f10207b;

    public final org.telegram.ui.Components.j6 f10208c;
    public TL_stars.starGiftAttributeBackdrop d;

    public TL_stars.starGiftAttributePattern f10209e;

    public float f10210f;

    public v3(Context context) {
        super(context);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f10206a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(n9Var, h7.z5.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        b4 b4Var = new b4(context);
        this.f10207b = b4Var;
        b4Var.f9003e = AndroidUtilities.dp(18.0f);
        b4Var.f9000a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(b4Var, h7.z5.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f10208c = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(17);
        j6Var.setTextSize(AndroidUtilities.dp(12.0f));
        j6Var.setTextColor(-1);
        addView(j6Var, h7.z5.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        h7.b6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f10209e = null;
        org.telegram.ui.Components.n9 n9Var = this.f10206a;
        n9Var.setScaleX(1.0f);
        n9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop == null) {
            n9Var.setAlpha(1.0f);
            n9Var.setImageDrawable(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.g6.l1(0.25f, -1)));
            return;
        }
        n9Var.setAlpha(1.0f);
        OvalShape ovalShape = new OvalShape();
        ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
        shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
        shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        n9Var.setImageDrawable(shapeDrawable);
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f10209e = stargiftattributepattern;
        org.telegram.ui.Components.n9 n9Var = this.f10206a;
        if (stargiftattributepattern == null) {
            n9Var.setAlpha(0.25f);
            n9Var.setScaleX(0.75f);
            n9Var.setScaleY(0.75f);
            n9Var.setTranslationY(0.0f);
            n9Var.setAnimatedEmojiDrawable(null);
            n9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        n9Var.setAlpha(1.0f);
        n9Var.setScaleX(0.95f);
        n9Var.setScaleY(0.95f);
        n9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.k5 k5VarM = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        k5VarM.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        n9Var.setAnimatedEmojiDrawable(k5VarM);
    }

    public final void c(float f10, boolean z10) {
        this.f10210f = f10;
        b4 b4Var = this.f10207b;
        b4Var.d = f10;
        if (!z10) {
            b4Var.f9001b.d(f10, true);
        }
        b4Var.invalidate();
        this.f10208c.c(Math.round(f10 * 100.0f) + "%", z10, true);
    }
}
