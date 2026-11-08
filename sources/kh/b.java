package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cq;
public final class b extends FrameLayout {
    public final f6 f17598a;
    public a f17599b;
    public cq f17600c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f17598a = f6Var;
    }

    public final void a(int i7, boolean z9) {
        if (this.f17600c == null) {
            cq cqVar = new cq(getContext(), this.f17598a);
            this.f17600c = cqVar;
            cqVar.setReverse(this.d);
            addView(this.f17600c, ha.e(-1, 28, 48));
        }
        this.f17600c.f32663a.c(i7, z9);
    }

    public final void b(boolean z9, boolean z10) {
        super.setEnabled(z9);
        this.f17599b.e(z9, z10);
    }

    public final void c(boolean z9, boolean z10) {
        a aVar = this.f17599b;
        if (aVar.d == null) {
            if (!z9) {
                return;
            }
            cp cpVar = new cp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.f17594e = cpVar;
            cpVar.f32657f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f17594e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, ha.e(46, 46, 17));
        }
        te.a aVar2 = aVar.f17591a;
        if (!aVar2.f55487f && aVar2.f55486e == 0.0f) {
            aVar.f17594e.f32655c = -1L;
        }
        aVar2.a(z9, z10);
    }

    @Override
    public void setEnabled(boolean z9) {
        b(z9, false);
    }
}
