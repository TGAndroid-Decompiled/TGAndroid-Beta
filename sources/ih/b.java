package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wq;
import w7.x5;
public final class b extends FrameLayout {
    public final f6 f11199a;
    public a f11200b;
    public wq f11201c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f11199a = f6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f11201c == null) {
            wq wqVar = new wq(getContext(), this.f11199a);
            this.f11201c = wqVar;
            wqVar.setReverse(this.d);
            addView(this.f11201c, x5.e(-1, 28, 48));
        }
        this.f11201c.f29725a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f11200b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f11200b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            tp tpVar = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = tpVar;
            tpVar.f28176f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
        }
        le.b bVar = aVar.f11194a;
        if (!bVar.f13985f && bVar.e == 0.0f) {
            aVar.e.f28175c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
