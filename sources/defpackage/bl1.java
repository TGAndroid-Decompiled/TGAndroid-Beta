package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
public final class bl1 {
    public float a;
    public float b;
    public int c;
    public StaticLayout d;
    public TextPaint e;
    public final ArrayList f = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public dm h;
    public final dl1 i;

    public bl1(dl1 dl1Var) {
        this.i = dl1Var;
    }

    public final void a(int i, TextPaint textPaint, CharSequence charSequence) {
        this.e = textPaint;
        this.c = i;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.d = staticLayout;
        dl1 dl1Var = this.i;
        r47 r47Var = dl1Var.Q0;
        ArrayList arrayList = this.f;
        if (r47Var != null && r47Var.N0) {
            arrayList.clear();
        } else {
            npa.b(dl1Var, staticLayout, -1, i, null, arrayList);
        }
        this.h = hm.update(0, (View) dl1Var, false, this.h, this.d);
    }
}
