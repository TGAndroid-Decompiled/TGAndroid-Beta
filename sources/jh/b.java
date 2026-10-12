package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.jr;
import w7.a6;
public final class b extends FrameLayout {
    public final c6 f13098a;
    public a f13099b;
    public jr f13100c;
    public boolean d;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f13098a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f13100c == null) {
            jr jrVar = new jr(getContext(), this.f13098a);
            this.f13100c = jrVar;
            jrVar.setReverse(this.d);
            addView(this.f13100c, a6.e(-1, 28, 48));
        }
        this.f13100c.f26455a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f13099b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f13099b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            gq gqVar = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = gqVar;
            gqVar.f25399f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, a6.e(46, 46, 17));
        }
        ne.b bVar = aVar.f13093a;
        if (!bVar.f16293f && bVar.e == 0.0f) {
            aVar.e.f25398c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
