package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public abstract class kw1 extends FrameLayout {
    public yd a;
    public iw1 b;
    public boolean c;

    public final void a(iw1 iw1Var, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = iw1Var;
            iw1Var.setVisibility(8);
            addView(iw1Var, layoutParams);
        }
    }

    public final void b(yd ydVar, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = ydVar;
            addView(ydVar, layoutParams);
        }
    }

    public iw1 getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z) {
        int i;
        this.c = z;
        yd ydVar = this.a;
        int i2 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        ydVar.setVisibility(i);
        iw1 iw1Var = this.b;
        if (!z) {
            i2 = 8;
        }
        iw1Var.setVisibility(i2);
    }

    public void setEditSuggestionMode(boolean z) {
        setEditMode(z);
        if (z) {
            this.a.setVisibility(0);
        }
        this.b.a[0].setOnlyIconMode(z);
        this.b.a[1].setOnlyIconMode(z);
    }
}
