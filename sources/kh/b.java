package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.up;
public final class b extends FrameLayout {
    public final h6 f18559a;
    public a f18560b;
    public tq f18561c;
    public boolean d;

    public b(Context context, h6 h6Var) {
        super(context);
        this.f18559a = h6Var;
    }

    public final void a(int i7, boolean z10) {
        if (this.f18561c == null) {
            tq tqVar = new tq(getContext(), this.f18559a);
            this.f18561c = tqVar;
            tqVar.setReverse(this.d);
            addView(this.f18561c, na.e(-1, 28, 48));
        }
        this.f18561c.f39994a.c(i7, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f18560b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f18560b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            up upVar = new up(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.f18555e = upVar;
            upVar.f40503f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f18555e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, na.e(46, 46, 17));
        }
        te.a aVar2 = aVar.f18552a;
        if (!aVar2.f57666f && aVar2.f57665e == 0.0f) {
            aVar.f18555e.f40501c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
