package nh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.a6;
public abstract class c extends FrameLayout {
    public final LinearLayout f14069a;
    public float f14070b;
    public final Rect f14071c;
    public final Rect d;
    public final Paint e;

    public c(Context context) {
        super(context);
        this.f14071c = new Rect();
        this.d = new Rect();
        this.e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f14069a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, a6.c(-1.0f, -1));
    }

    public void setLensVisibility(float f7) {
        this.f14070b = f7;
        int dp = AndroidUtilities.dp(f7 * 7.0f);
        Rect rect = this.f14071c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
