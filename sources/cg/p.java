package cg;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.y5;
public final class p {
    public float f3251a;
    public float f3252b;
    public int f3253c;
    public TextPaint d;
    public final ArrayList f3254e;
    public Object f3255f;
    public final Object f3256g;
    public Object h;
    public final Object f3257i;

    public p() {
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f3251a = 1.0f;
        this.f3255f = new HashMap();
        this.f3256g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f3257i = paint;
        this.f3254e = new ArrayList();
        this.f3252b = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.f3253c = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f3251a = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f3251a = 0.75f;
        } else {
            this.f3251a = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f3251a * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        org.telegram.ui.Cells.v0 v0Var;
        this.d = textPaint;
        this.f3253c = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f3255f = staticLayout;
        org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f3257i;
        MessageObject messageObject = v0Var2.D0;
        ArrayList arrayList = this.f3254e;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            gh.k.b(v0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = y5.update(0, (View) v0Var, false, (u5) this.h, (StaticLayout) this.f3255f);
    }

    public p(org.telegram.ui.Cells.v0 v0Var) {
        this.f3257i = v0Var;
        this.f3254e = new ArrayList();
        this.f3256g = new AtomicReference();
    }
}
