package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
public final class s extends EditTextBoldCursor {
    public final h5 f12224b;
    public int f12225c;
    public final p6 d;
    public final f6 f12226e;

    public s(Context context, f6 f6Var) {
        super(context);
        this.f12226e = f6Var;
        this.f12224b = new h5(this);
        p6 p6Var = new p6(false, true, true, false);
        this.d = p6Var;
        p6Var.k(0.2f, 160L, pr.h);
        p6Var.t(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.f29312b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f12225c < 0) {
            i10 = j6.f20907p7;
        } else {
            i10 = j6.P5;
        }
        int a2 = this.f12224b.a(j6.v0(i10, this.f12226e), false);
        p6 p6Var = this.d;
        p6Var.r(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.d;
        if (p6Var != null) {
            this.f12225c = 32 - charSequence.length();
            p6Var.b();
            String str = "";
            if (this.f12225c <= 4) {
                str = "" + this.f12225c;
            }
            p6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
