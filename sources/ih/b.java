package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.mr;
import w7.x5;
public final class b extends FrameLayout {
    public final e6 f12229a;
    public a f12230b;
    public mr f12231c;
    public boolean d;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f12229a = e6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f12231c == null) {
            mr mrVar = new mr(getContext(), this.f12229a);
            this.f12231c = mrVar;
            mrVar.setReverse(this.d);
            addView(this.f12231c, x5.e(-1, 28, 48));
        }
        this.f12231c.f28891a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f12230b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f12230b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            jq jqVar = new jq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f12226e = jqVar;
            jqVar.f27759f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f12226e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
        }
        me.b bVar = aVar.f12223a;
        if (!bVar.f16338f && bVar.f16337e == 0.0f) {
            aVar.f12226e.f27757c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
