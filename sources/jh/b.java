package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dr;
import w7.z5;
public final class b extends FrameLayout {
    public final g6 f14560a;
    public a f14561b;
    public dr f14562c;
    public boolean d;

    public b(Context context, g6 g6Var) {
        super(context);
        this.f14560a = g6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f14562c == null) {
            dr drVar = new dr(getContext(), this.f14560a);
            this.f14562c = drVar;
            drVar.setReverse(this.d);
            addView(this.f14562c, z5.e(-1, 28, 48));
        }
        this.f14562c.f25811a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f14561b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f14561b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            cq cqVar = new cq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = cqVar;
            cqVar.f25433f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, z5.e(46, 46, 17));
        }
        ne.b bVar = aVar.f14554a;
        if (!bVar.f17447f && bVar.e == 0.0f) {
            aVar.e.f25432c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
