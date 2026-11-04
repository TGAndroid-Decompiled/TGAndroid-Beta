package lh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dq;
public final class b extends FrameLayout {
    public final e6 f18535a;
    public a f18536b;
    public dq f18537c;
    public boolean d;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f18535a = e6Var;
    }

    public final void a(int i3, boolean z10) {
        if (this.f18537c == null) {
            dq dqVar = new dq(getContext(), this.f18535a);
            this.f18537c = dqVar;
            dqVar.setReverse(this.d);
            addView(this.f18537c, mf.e(-1, 28, 48));
        }
        this.f18537c.f33180a.c(i3, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f18536b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f18536b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            cp cpVar = new cp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.f18531e = cpVar;
            cpVar.f32790f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f18531e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, mf.e(46, 46, 17));
        }
        qe.a aVar2 = aVar.f18528a;
        if (!aVar2.f53841f && aVar2.f53840e == 0.0f) {
            aVar.f18531e.f32788c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
