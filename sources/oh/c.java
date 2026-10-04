package oh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.z5;
public abstract class c extends FrameLayout {
    public final LinearLayout f17208a;
    public float f17209b;
    public final Rect f17210c;
    public final Rect d;
    public final Paint f17211e;

    public c(Context context) {
        super(context);
        this.f17210c = new Rect();
        this.d = new Rect();
        this.f17211e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f17208a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, z5.c(-1.0f, -1));
    }

    public void setLensVisibility(float f7) {
        this.f17209b = f7;
        int dp = AndroidUtilities.dp(f7 * 7.0f);
        Rect rect = this.f17210c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
