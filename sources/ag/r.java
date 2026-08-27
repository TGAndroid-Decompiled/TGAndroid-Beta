package ag;

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
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t5;

public final class r {

    public float f627a;

    public float f628b;

    public int f629c;
    public TextPaint d;

    public final ArrayList f630e;

    public Object f631f;

    public final Object f632g;
    public Object h;

    public final Object f633i;

    public r() {
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f627a = 1.0f;
        this.f631f = new HashMap();
        this.f632g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f633i = paint;
        this.f630e = new ArrayList();
        this.f628b = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.f629c = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f627a = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f627a = 0.75f;
        } else {
            this.f627a = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f627a * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        org.telegram.ui.Cells.v0 v0Var;
        this.d = textPaint;
        this.f629c = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f631f = staticLayout;
        org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f633i;
        MessageObject messageObject = v0Var2.D0;
        ArrayList arrayList = this.f630e;
        if (messageObject == null || !messageObject.isSpoilersRevealed) {
            v0Var = v0Var2;
            eh.k.b(v0Var, staticLayout, -1, i10, null, arrayList);
        } else {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        }
        this.h = t5.update(0, (View) v0Var, false, (p5) this.h, (StaticLayout) this.f631f);
    }

    public r(org.telegram.ui.Cells.v0 v0Var) {
        this.f633i = v0Var;
        this.f630e = new ArrayList();
        this.f632g = new AtomicReference();
    }
}
