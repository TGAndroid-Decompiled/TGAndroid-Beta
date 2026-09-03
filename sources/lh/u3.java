package lh;

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
    public final org.telegram.ui.Components.p9 f13179a;
    public final a4 f13180b;
    public final org.telegram.ui.Components.k6 f13181c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f13182f;

    public u3(Context context) {
        super(context);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f13179a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(p9Var, k7.b6.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        a4 a4Var = new a4(context);
        this.f13180b = a4Var;
        a4Var.e = AndroidUtilities.dp(18.0f);
        a4Var.f12085a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(a4Var, k7.b6.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f13181c = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity(17);
        k6Var.setTextSize(AndroidUtilities.dp(12.0f));
        k6Var.setTextColor(-1);
        addView(k6Var, k7.b6.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        k7.d6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        org.telegram.ui.Components.p9 p9Var = this.f13179a;
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
        p9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.l1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        org.telegram.ui.Components.p9 p9Var = this.f13179a;
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
        this.f13182f = f10;
        a4 a4Var = this.f13180b;
        a4Var.d = f10;
        if (!z4) {
            a4Var.f12086b.d(f10, true);
        }
        a4Var.invalidate();
        this.f13181c.c(Math.round(f10 * 100.0f) + "%", z4, true);
    }
}
