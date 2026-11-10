package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cq;
public final class b extends FrameLayout {
    public final h6 f17601a;
    public a f17602b;
    public cq f17603c;
    public boolean d;

    public b(Context context, h6 h6Var) {
        super(context);
        this.f17601a = h6Var;
    }

    public final void a(int i7, boolean z9) {
        if (this.f17603c == null) {
            cq cqVar = new cq(getContext(), this.f17601a);
            this.f17603c = cqVar;
            cqVar.setReverse(this.d);
            addView(this.f17603c, ha.e(-1, 28, 48));
        }
        this.f17603c.f32735a.c(i7, z9);
    }

    public final void b(boolean z9, boolean z10) {
        super.setEnabled(z9);
        this.f17602b.e(z9, z10);
    }

    public final void c(boolean z9, boolean z10) {
        a aVar = this.f17602b;
        if (aVar.d == null) {
            if (!z9) {
                return;
            }
            cp cpVar = new cp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.f17597e = cpVar;
            cpVar.f32729f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f17597e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, ha.e(46, 46, 17));
        }
        te.a aVar2 = aVar.f17594a;
        if (!aVar2.f55499f && aVar2.f55498e == 0.0f) {
            aVar.f17597e.f32727c = -1L;
        }
        aVar2.a(z9, z10);
    }

    @Override
    public void setEnabled(boolean z9) {
        b(z9, false);
    }
}
