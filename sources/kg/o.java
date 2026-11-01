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
import org.telegram.messenger.kj;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.o5;
public final class o {
    public float f11203a;
    public float f11204b;
    public int f11205c;
    public TextPaint d;
    public final ArrayList e;
    public Object f11206f;
    public final Object f11207g;
    public Object h;
    public final Object f11208i;

    public o() {
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f11203a = 1.0f;
        this.f11206f = new HashMap();
        this.f11207g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f11208i = paint;
        this.e = new ArrayList();
        this.f11204b = 1000.0f / org.telegram.messenger.i0.f16173r;
        this.f11205c = 25;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(-1);
        int o10 = uz.o();
        if (o10 == 0) {
            this.f11203a = 0.25f;
        } else if (o10 != 1) {
            this.f11203a = 0.75f;
        } else {
            this.f11203a = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(this.f11203a * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        org.telegram.ui.Cells.s0 s0Var;
        this.d = textPaint;
        this.f11205c = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f11206f = staticLayout;
        org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) this.f11208i;
        kj kjVar = s0Var2.P0;
        ArrayList arrayList = this.e;
        if (kjVar != null && kjVar.L0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            s0Var = s0Var2;
        } else {
            s0Var = s0Var2;
            nh.i.b(s0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = o5.update(0, (View) s0Var, false, (k5) this.h, (StaticLayout) this.f11206f);
    }

    public o(org.telegram.ui.Cells.s0 s0Var) {
        this.f11208i = s0Var;
        this.e = new ArrayList();
        this.f11207g = new AtomicReference();
    }
}
