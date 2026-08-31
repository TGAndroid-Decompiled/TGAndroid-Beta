package ch;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
public abstract class c extends FrameLayout {
    public final LinearLayout f2530a;
    public float f2531b;
    public final Rect f2532c;
    public final Rect d;
    public final Paint f2533e;

    public c(Context context) {
        super(context);
        this.f2532c = new Rect();
        this.d = new Rect();
        this.f2533e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f2530a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c6.c(-1.0f, -1));
    }

    public void setLensVisibility(float f10) {
        this.f2531b = f10;
        int dp = AndroidUtilities.dp(f10 * 7.0f);
        Rect rect = this.f2532c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
