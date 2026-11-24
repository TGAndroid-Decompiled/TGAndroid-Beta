package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
public final class sk1 {
    public float a;
    public float b;
    public int c;
    public StaticLayout d;
    public TextPaint e;
    public final ArrayList f = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public cm h;
    public final uk1 i;

    public sk1(uk1 uk1Var) {
        this.i = uk1Var;
    }

    public final void a(int i, TextPaint textPaint, CharSequence charSequence) {
        this.e = textPaint;
        this.c = i;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.d = staticLayout;
        uk1 uk1Var = this.i;
        k27 k27Var = uk1Var.Q0;
        ArrayList arrayList = this.f;
        if (k27Var != null && k27Var.N0) {
            arrayList.clear();
        } else {
            qla.b(uk1Var, staticLayout, -1, i, null, arrayList);
        }
        this.h = gm.update(0, (View) uk1Var, false, this.h, this.d);
    }
}
