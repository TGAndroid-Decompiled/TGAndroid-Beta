package jh;

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
    public final org.telegram.ui.Components.t9 f12947a;
    public final b4 f12948b;
    public final org.telegram.ui.Components.o6 f12949c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f12950e;
    public float f12951f;

    public v3(Context context) {
        super(context);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f12947a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(t9Var, i7.f6.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        b4 b4Var = new b4(context);
        this.f12948b = b4Var;
        b4Var.f11796e = AndroidUtilities.dp(18.0f);
        b4Var.f11793a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(b4Var, i7.f6.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f12949c = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(12.0f));
        o6Var.setTextColor(-1);
        addView(o6Var, i7.f6.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        i7.h6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f12950e = null;
        org.telegram.ui.Components.t9 t9Var = this.f12947a;
        t9Var.setScaleX(1.0f);
        t9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            t9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            t9Var.setImageDrawable(shapeDrawable);
            return;
        }
        t9Var.setAlpha(1.0f);
        t9Var.setImageDrawable(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.g6.l1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f12950e = stargiftattributepattern;
        org.telegram.ui.Components.t9 t9Var = this.f12947a;
        if (stargiftattributepattern == null) {
            t9Var.setAlpha(0.25f);
            t9Var.setScaleX(0.75f);
            t9Var.setScaleY(0.75f);
            t9Var.setTranslationY(0.0f);
            t9Var.setAnimatedEmojiDrawable(null);
            t9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        t9Var.setAlpha(1.0f);
        t9Var.setScaleX(0.95f);
        t9Var.setScaleY(0.95f);
        t9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        t9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f9, boolean z10) {
        this.f12951f = f9;
        b4 b4Var = this.f12948b;
        b4Var.d = f9;
        if (!z10) {
            b4Var.f11794b.d(f9, true);
        }
        b4Var.invalidate();
        this.f12949c.c(Math.round(f9 * 100.0f) + "%", z10, true);
    }
}
