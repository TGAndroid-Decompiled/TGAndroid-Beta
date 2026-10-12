package oh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.w5;
public abstract class c extends FrameLayout {
    public final LinearLayout f16902a;
    public float f16903b;
    public final Rect f16904c;
    public final Rect d;
    public final Paint f16905e;

    public c(Context context) {
        super(context);
        this.f16904c = new Rect();
        this.d = new Rect();
        this.f16905e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f16902a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w5.d(-1.0f, -1));
    }

    public void setLensVisibility(float f7) {
        this.f16903b = f7;
        int dp = AndroidUtilities.dp(f7 * 7.0f);
        Rect rect = this.f16904c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
