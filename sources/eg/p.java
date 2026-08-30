package eg;

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
    public float f5415a;
    public float f5416b;
    public int f5417c;
    public TextPaint d;
    public final ArrayList e;
    public Object f5418f;
    public final Object f5419g;
    public Object h;
    public final Object f5420i;

    public p() {
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f5415a = 1.0f;
        this.f5418f = new HashMap();
        this.f5419g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f5420i = paint;
        this.e = new ArrayList();
        this.f5416b = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.f5417c = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f5415a = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f5415a = 0.75f;
        } else {
            this.f5415a = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f5415a * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        org.telegram.ui.Cells.v0 v0Var;
        this.d = textPaint;
        this.f5417c = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f5418f = staticLayout;
        org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f5420i;
        MessageObject messageObject = v0Var2.E0;
        ArrayList arrayList = this.e;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            ih.k.b(v0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = u5.update(0, (View) v0Var, false, (q5) this.h, (StaticLayout) this.f5418f);
    }

    public p(org.telegram.ui.Cells.v0 v0Var) {
        this.f5420i = v0Var;
        this.e = new ArrayList();
        this.f5419g = new AtomicReference();
    }
}
