package dh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
public final class g extends View {
    public final Drawable f4901a;
    public final xd.a f4902b;
    public final int f4903c;
    public h d;

    public g(Context context, int i10) {
        super(context);
        this.f4902b = new xd.a(this, nr.h, 380L);
        this.f4903c = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.f4901a = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.f20104o7, false), PorterDuff.Mode.SRC_IN));
    }

    public final void a(h hVar, boolean z4) {
        boolean z10;
        h hVar2;
        h hVar3;
        if (hVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4902b.a(z10, z4);
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
        float f10 = this.f4902b.e;
        if (f10 < 1.0f) {
            canvas.save();
            float f11 = 1.0f - f10;
            canvas.scale(f11, f11, width, height);
            this.f4901a.draw(canvas);
            canvas.restore();
        }
        if (f10 > 0.0f) {
            float f12 = this.f4903c;
            int dp = AndroidUtilities.dp(f12);
            canvas.save();
            canvas.translate((getWidth() - dp) / 2, (getHeight() - dp) / 2);
            canvas.scale(f10, f10, AndroidUtilities.dp(f12) / 2.0f, AndroidUtilities.dp(f12) / 2.0f);
            h hVar = this.d;
            if (hVar != null) {
                hVar.c(canvas, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12));
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
        this.f4901a.setBounds(i14, i15, i14 + dp, dp + i15);
    }
}
