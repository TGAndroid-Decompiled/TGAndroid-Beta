package ah;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lq;
import w7.b6;
public final class b extends FrameLayout {
    public final p6 f829a;
    public a f830b;
    public lq f831c;
    public boolean d;

    public b(Context context, p6 p6Var) {
        super(context);
        this.f829a = p6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f831c == null) {
            lq lqVar = new lq(getContext(), this.f829a);
            this.f831c = lqVar;
            lqVar.setReverse(this.d);
            addView(this.f831c, b6.e(-1, 28, 48));
        }
        this.f831c.f28163a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f830b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f830b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            kp kpVar = new kp(i0.L(18.0f), i0.L(1.7f), -9079435);
            aVar.e = kpVar;
            kpVar.f27864f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, b6.e(46, 46, 17));
        }
        fe.b bVar = aVar.f823a;
        if (!bVar.f7021f && bVar.e == 0.0f) {
            aVar.e.f27863c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
