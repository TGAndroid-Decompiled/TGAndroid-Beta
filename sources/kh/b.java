package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rp;
public final class b extends FrameLayout {
    public final i6 f18655a;
    public a f18656b;
    public qq f18657c;
    public boolean d;

    public b(Context context, i6 i6Var) {
        super(context);
        this.f18655a = i6Var;
    }

    public final void a(int i7, boolean z10) {
        if (this.f18657c == null) {
            qq qqVar = new qq(getContext(), this.f18655a);
            this.f18657c = qqVar;
            qqVar.setReverse(this.d);
            addView(this.f18657c, na.e(-1, 28, 48));
        }
        this.f18657c.f38979a.c(i7, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f18656b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f18656b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            rp rpVar = new rp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.f18651e = rpVar;
            rpVar.f39375f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f18651e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, na.e(46, 46, 17));
        }
        te.a aVar2 = aVar.f18648a;
        if (!aVar2.f57780f && aVar2.f57779e == 0.0f) {
            aVar.f18651e.f39373c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
