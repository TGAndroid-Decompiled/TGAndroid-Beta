package fg;

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
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.u5;
public final class p {
    public float f6474a;
    public float f6475b;
    public int f6476c;
    public TextPaint d;
    public final ArrayList f6477e;
    public Object f6478f;
    public final Object f6479g;
    public Object h;
    public final Object f6480i;

    public p() {
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f6474a = 1.0f;
        this.f6478f = new HashMap();
        this.f6479g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f6480i = paint;
        this.f6477e = new ArrayList();
        this.f6475b = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.f6476c = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f6474a = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f6474a = 0.75f;
        } else {
            this.f6474a = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f6474a * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        org.telegram.ui.Cells.v0 v0Var;
        this.d = textPaint;
        this.f6476c = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f6478f = staticLayout;
        org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f6480i;
        MessageObject messageObject = v0Var2.E0;
        ArrayList arrayList = this.f6477e;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            jh.k.b(v0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = u5.update(0, (View) v0Var, false, (q5) this.h, (StaticLayout) this.f6478f);
    }

    public p(org.telegram.ui.Cells.v0 v0Var) {
        this.f6480i = v0Var;
        this.f6477e = new ArrayList();
        this.f6479g = new AtomicReference();
    }
}
