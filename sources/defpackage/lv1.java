package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public abstract class lv1 extends FrameLayout {
    public zc a;
    public jv1 b;
    public boolean c;

    public final void a(jv1 jv1Var, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = jv1Var;
            jv1Var.setVisibility(8);
            addView(jv1Var, layoutParams);
        }
    }

    public final void b(zc zcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = zcVar;
            addView(zcVar, layoutParams);
        }
    }

    public jv1 getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z) {
        int i;
        this.c = z;
        zc zcVar = this.a;
        int i2 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        zcVar.setVisibility(i);
        jv1 jv1Var = this.b;
        if (!z) {
            i2 = 8;
        }
        jv1Var.setVisibility(i2);
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
