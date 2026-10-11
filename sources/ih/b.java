package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.mr;
import w7.x5;
public final class b extends FrameLayout {
    public final d6 f12228a;
    public a f12229b;
    public mr f12230c;
    public boolean d;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f12228a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f12230c == null) {
            mr mrVar = new mr(getContext(), this.f12228a);
            this.f12230c = mrVar;
            mrVar.setReverse(this.d);
            addView(this.f12230c, x5.e(-1, 28, 48));
        }
        this.f12230c.f28841a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f12229b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f12229b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            jq jqVar = new jq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f12225e = jqVar;
            jqVar.f27727f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f12225e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
        }
        me.b bVar = aVar.f12222a;
        if (!bVar.f16366f && bVar.f16365e == 0.0f) {
            aVar.f12225e.f27725c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
