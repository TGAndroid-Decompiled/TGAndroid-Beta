package gh;

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
public final class x3 extends FrameLayout {
    public final org.telegram.ui.Components.o9 f9144a;
    public final d4 f9145b;
    public final org.telegram.ui.Components.j6 f9146c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f9147e;
    public float f9148f;

    public x3(Context context) {
        super(context);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f9144a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(o9Var, g7.e6.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        d4 d4Var = new d4(context);
        this.f9145b = d4Var;
        d4Var.f7962e = AndroidUtilities.dp(18.0f);
        d4Var.f7959a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(d4Var, g7.e6.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f9146c = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(17);
        j6Var.setTextSize(AndroidUtilities.dp(12.0f));
        j6Var.setTextColor(-1);
        addView(j6Var, g7.e6.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        g7.g6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f9147e = null;
        org.telegram.ui.Components.o9 o9Var = this.f9144a;
        o9Var.setScaleX(1.0f);
        o9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            o9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            o9Var.setImageDrawable(shapeDrawable);
            return;
        }
        o9Var.setAlpha(1.0f);
        o9Var.setImageDrawable(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.f6.l1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f9147e = stargiftattributepattern;
        org.telegram.ui.Components.o9 o9Var = this.f9144a;
        if (stargiftattributepattern == null) {
            o9Var.setAlpha(0.25f);
            o9Var.setScaleX(0.75f);
            o9Var.setScaleY(0.75f);
            o9Var.setTranslationY(0.0f);
            o9Var.setAnimatedEmojiDrawable(null);
            o9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        o9Var.setAlpha(1.0f);
        o9Var.setScaleX(0.95f);
        o9Var.setScaleY(0.95f);
        o9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.k5 m10 = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        o9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f10, boolean z10) {
        this.f9148f = f10;
        d4 d4Var = this.f9145b;
        d4Var.d = f10;
        if (!z10) {
            d4Var.f7960b.d(f10, true);
        }
        d4Var.invalidate();
        this.f9146c.c(Math.round(f10 * 100.0f) + "%", z10, true);
    }
}
