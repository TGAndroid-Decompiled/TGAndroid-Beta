package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
public final class g extends View {
    public final Drawable f2665a;
    public final vd.a f2666b;
    public final int f2667c;
    public h d;

    public g(Context context, int i10) {
        super(context);
        this.f2666b = new vd.a(this, jr.h, 380L);
        this.f2667c = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.f2665a = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.f23261o7, false), PorterDuff.Mode.SRC_IN));
    }

    public final void a(h hVar, boolean z10) {
        boolean z11;
        h hVar2;
        h hVar3;
        if (hVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f2666b.a(z11, z10);
        if (isAttachedToWindow() && (hVar3 = this.d) != null) {
            hVar3.b();
        }
        this.d = hVar;
        if (isAttachedToWindow() && (hVar2 = this.d) != null) {
            hVar2.a(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.d;
        if (hVar != null) {
            hVar.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.d;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f9 = this.f2666b.f49505e;
        if (f9 < 1.0f) {
            canvas.save();
            float f10 = 1.0f - f9;
            canvas.scale(f10, f10, width, height);
            this.f2665a.draw(canvas);
            canvas.restore();
        }
        if (f9 > 0.0f) {
            float f11 = this.f2667c;
            int dp = AndroidUtilities.dp(f11);
            canvas.save();
            canvas.translate((getWidth() - dp) / 2, (getHeight() - dp) / 2);
            canvas.scale(f9, f9, AndroidUtilities.dp(f11) / 2.0f, AndroidUtilities.dp(f11) / 2.0f);
            h hVar = this.d;
            if (hVar != null) {
                hVar.c(canvas, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            }
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(24.0f);
        int i14 = (i10 - dp) / 2;
        int i15 = (i11 - dp) / 2;
        this.f2665a.setBounds(i14, i15, i14 + dp, dp + i15);
    }
}
