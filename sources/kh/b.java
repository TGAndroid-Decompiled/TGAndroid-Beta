package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.hr;
public final class b extends FrameLayout {
    public final u6 f16653a;
    public a f16654b;
    public hr f16655c;
    public boolean d;

    public b(Context context, u6 u6Var) {
        super(context);
        this.f16653a = u6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f16655c == null) {
            hr hrVar = new hr(getContext(), this.f16653a);
            this.f16655c = hrVar;
            hrVar.setReverse(this.d);
            addView(this.f16655c, gb1.i(-1, 28, 48));
        }
        this.f16655c.f29040a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f16654b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f16654b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            gq gqVar = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = gqVar;
            gqVar.f28679f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, gb1.i(46, 46, 17));
        }
        oe.b bVar = aVar.f16647a;
        if (!bVar.f19327f && bVar.e == 0.0f) {
            aVar.e.f28678c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
