package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sp;
public final class b extends FrameLayout {
    public final i6 f18560a;
    public a f18561b;
    public rq f18562c;
    public boolean d;

    public b(Context context, i6 i6Var) {
        super(context);
        this.f18560a = i6Var;
    }

    public final void a(int i7, boolean z10) {
        if (this.f18562c == null) {
            rq rqVar = new rq(getContext(), this.f18560a);
            this.f18562c = rqVar;
            rqVar.setReverse(this.d);
            addView(this.f18562c, ma.e(-1, 28, 48));
        }
        this.f18562c.f39274a.c(i7, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f18561b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f18561b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            sp spVar = new sp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.f18556e = spVar;
            spVar.f39810f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f18556e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, ma.e(46, 46, 17));
        }
        te.a aVar2 = aVar.f18553a;
        if (!aVar2.f57658f && aVar2.f57657e == 0.0f) {
            aVar.f18556e.f39808c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
