package bh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
public abstract class c extends FrameLayout {
    public final LinearLayout f1831a;
    public float f1832b;
    public final Rect f1833c;
    public final Rect d;
    public final Paint e;

    public c(Context context) {
        super(context);
        this.f1833c = new Rect();
        this.d = new Rect();
        this.e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1831a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, b6.c(-1.0f, -1));
    }

    public void setLensVisibility(float f10) {
        this.f1832b = f10;
        int dp = AndroidUtilities.dp(f10 * 7.0f);
        Rect rect = this.f1833c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
