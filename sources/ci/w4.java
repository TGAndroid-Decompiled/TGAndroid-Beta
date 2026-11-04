package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import b8.mf;
import b8.pf;
import org.telegram.messenger.h10;
import org.telegram.tgnet.tl.TL_stars;
public final class w4 extends FrameLayout {
    public final org.telegram.ui.Components.k9 f6242a;
    public final c5 f6243b;
    public final org.telegram.ui.Components.h6 f6244c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f6245e;
    public float f6246f;

    public w4(Context context) {
        super(context);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f6242a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(13.0f));
        addView(k9Var, mf.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        c5 c5Var = new c5(context);
        this.f6243b = c5Var;
        c5Var.f4916e = org.telegram.messenger.g0.L(18.0f);
        c5Var.f4913a.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        addView(c5Var, mf.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f6244c = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(17);
        h6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        h6Var.setTextColor(-1);
        addView(h6Var, mf.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        pf.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f6245e = null;
        org.telegram.ui.Components.k9 k9Var = this.f6242a;
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            k9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(org.telegram.messenger.g0.L(26.0f));
            shapeDrawable.setIntrinsicHeight(org.telegram.messenger.g0.L(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            k9Var.setImageDrawable(shapeDrawable);
            return;
        }
        k9Var.setAlpha(1.0f);
        k9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.k6.r1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f6245e = stargiftattributepattern;
        org.telegram.ui.Components.k9 k9Var = this.f6242a;
        if (stargiftattributepattern == null) {
            k9Var.setAlpha(0.25f);
            k9Var.setScaleX(0.75f);
            k9Var.setScaleY(0.75f);
            k9Var.setTranslationY(0.0f);
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageResource(2131231972);
            return;
        }
        k9Var.setAlpha(1.0f);
        k9Var.setScaleX(0.95f);
        k9Var.setScaleY(0.95f);
        k9Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(h10.f22829t0, 9, stargiftattributepattern.document);
        l10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        k9Var.setAnimatedEmojiDrawable(l10);
    }

    public final void c(boolean z10, float f10) {
        this.f6246f = f10;
        c5 c5Var = this.f6243b;
        c5Var.d = f10;
        if (!z10) {
            c5Var.f4914b.e(true, f10);
        }
        c5Var.invalidate();
        this.f6244c.c(Math.round(f10 * 100.0f) + "%", z10, true);
    }
}
