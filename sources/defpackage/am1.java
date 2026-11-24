package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
public final class am1 {
    public float a;
    public float b;
    public int c;
    public StaticLayout d;
    public TextPaint e;
    public final ArrayList f = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public cn h;
    public final cm1 i;

    public am1(cm1 cm1Var) {
        this.i = cm1Var;
    }

    public final void a(int i, TextPaint textPaint, CharSequence charSequence) {
        this.e = textPaint;
        this.c = i;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.d = staticLayout;
        cm1 cm1Var = this.i;
        k47 k47Var = cm1Var.Q0;
        ArrayList arrayList = this.f;
        if (k47Var != null && k47Var.N0) {
            arrayList.clear();
        } else {
            rna.b(cm1Var, staticLayout, -1, i, null, arrayList);
        }
        this.h = gn.update(0, (View) cm1Var, false, this.h, this.d);
    }
}
