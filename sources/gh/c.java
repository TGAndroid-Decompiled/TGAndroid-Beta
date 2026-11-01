package gh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.i0;
import w7.b6;
public abstract class c extends FrameLayout {
    public final LinearLayout f7529a;
    public float f7530b;
    public final Rect f7531c;
    public final Rect d;
    public final Paint e;

    public c(Context context) {
        super(context);
        this.f7531c = new Rect();
        this.d = new Rect();
        this.e = new Paint(1);
        setPadding(i0.L(8.0f), i0.L(8.0f), i0.L(8.0f), i0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f7529a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, b6.c(-1.0f, -1));
    }

    public void setLensVisibility(float f7) {
        this.f7530b = f7;
        int L = i0.L(f7 * 7.0f);
        Rect rect = this.f7531c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -L;
        rect2.inset(i10, i10);
    }
}
