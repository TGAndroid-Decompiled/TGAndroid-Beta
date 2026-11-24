package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public abstract class yu1 extends FrameLayout {
    public yc a;
    public wu1 b;
    public boolean c;

    public final void a(wu1 wu1Var, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = wu1Var;
            wu1Var.setVisibility(8);
            addView(wu1Var, layoutParams);
        }
    }

    public final void b(yc ycVar, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = ycVar;
            addView(ycVar, layoutParams);
        }
    }

    public wu1 getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z) {
        int i;
        this.c = z;
        yc ycVar = this.a;
        int i2 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        ycVar.setVisibility(i);
        wu1 wu1Var = this.b;
        if (!z) {
            i2 = 8;
        }
        wu1Var.setVisibility(i2);
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
