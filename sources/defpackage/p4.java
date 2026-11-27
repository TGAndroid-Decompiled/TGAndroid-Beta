package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p4 extends ClickableSpan {
    public final int a;
    public final v4 b;
    public final int c;

    public p4(int i, v4 v4Var, int i2) {
        this.a = i;
        this.b = v4Var;
        this.c = i2;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
