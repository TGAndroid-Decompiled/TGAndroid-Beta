package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wq;
import w7.x5;
public final class b extends FrameLayout {
    public final e6 f11198a;
    public a f11199b;
    public wq f11200c;
    public boolean d;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f11198a = e6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f11200c == null) {
            wq wqVar = new wq(getContext(), this.f11198a);
            this.f11200c = wqVar;
            wqVar.setReverse(this.d);
            addView(this.f11200c, x5.e(-1, 28, 48));
        }
        this.f11200c.f29766a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f11199b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f11199b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            tp tpVar = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = tpVar;
            tpVar.f28160f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
        }
        le.b bVar = aVar.f11193a;
        if (!bVar.f13973f && bVar.e == 0.0f) {
            aVar.e.f28159c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
