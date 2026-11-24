package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class rz4 extends FrameLayout {
    public final LinearLayout a;
    public float b;
    public final Rect c;
    public final Rect d;
    public final Paint e;

    public rz4(Context context) {
        super(context);
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Paint(1);
        setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, qoe.c(-1.0f, -1));
    }

    public void setLensVisibility(float f) {
        this.b = f;
        int L = gm.L(f * 7.0f);
        Rect rect = this.c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i = -L;
        rect2.inset(i, i);
    }
}
