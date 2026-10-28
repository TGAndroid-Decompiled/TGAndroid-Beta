package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.kb1;
public final class b extends FrameLayout {
    public final u6 f16652a;
    public a f16653b;
    public hr f16654c;
    public boolean d;

    public b(Context context, u6 u6Var) {
        super(context);
        this.f16652a = u6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f16654c == null) {
            hr hrVar = new hr(getContext(), this.f16652a);
            this.f16654c = hrVar;
            hrVar.setReverse(this.d);
            addView(this.f16654c, kb1.i(-1, 28, 48));
        }
        this.f16654c.f29060a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f16653b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f16653b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            gq gqVar = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = gqVar;
            gqVar.f28716f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, kb1.i(46, 46, 17));
        }
        oe.b bVar = aVar.f16646a;
        if (!bVar.f19326f && bVar.e == 0.0f) {
            aVar.e.f28715c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
