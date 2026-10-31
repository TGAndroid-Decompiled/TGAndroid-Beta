package kg;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.o5;
public final class o {
    public float f11202a;
    public float f11203b;
    public int f11204c;
    public TextPaint d;
    public final ArrayList e;
    public Object f11205f;
    public final Object f11206g;
    public Object h;
    public final Object f11207i;

    public o() {
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f11202a = 1.0f;
        this.f11205f = new HashMap();
        this.f11206g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f11207i = paint;
        this.e = new ArrayList();
        this.f11203b = 1000.0f / org.telegram.messenger.i0.f16027r;
        this.f11204c = 25;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(-1);
        int o10 = tz.o();
        if (o10 == 0) {
            this.f11202a = 0.25f;
        } else if (o10 != 1) {
            this.f11202a = 0.75f;
        } else {
            this.f11202a = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(this.f11202a * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        org.telegram.ui.Cells.s0 s0Var;
        this.d = textPaint;
        this.f11204c = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f11205f = staticLayout;
        org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) this.f11207i;
        jj jjVar = s0Var2.P0;
        ArrayList arrayList = this.e;
        if (jjVar != null && jjVar.L0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            s0Var = s0Var2;
        } else {
            s0Var = s0Var2;
            nh.i.b(s0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = o5.update(0, (View) s0Var, false, (k5) this.h, (StaticLayout) this.f11205f);
    }

    public o(org.telegram.ui.Cells.s0 s0Var) {
        this.f11207i = s0Var;
        this.e = new ArrayList();
        this.f11206g = new AtomicReference();
    }
}
