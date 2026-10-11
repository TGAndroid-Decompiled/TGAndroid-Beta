package oh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.x5;
public abstract class c extends FrameLayout {
    public final LinearLayout f17200a;
    public float f17201b;
    public final Rect f17202c;
    public final Rect d;
    public final Paint f17203e;

    public c(Context context) {
        super(context);
        this.f17202c = new Rect();
        this.d = new Rect();
        this.f17203e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f17200a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, x5.d(-1.0f, -1));
    }

    public void setLensVisibility(float f7) {
        this.f17201b = f7;
        int dp = AndroidUtilities.dp(f7 * 7.0f);
        Rect rect = this.f17202c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
