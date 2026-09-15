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
    public final e6 f11196a;
    public a f11197b;
    public wq f11198c;
    public boolean d;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f11196a = e6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f11198c == null) {
            wq wqVar = new wq(getContext(), this.f11196a);
            this.f11198c = wqVar;
            wqVar.setReverse(this.d);
            addView(this.f11198c, x5.e(-1, 28, 48));
        }
        this.f11198c.f29769a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f11197b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f11197b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            tp tpVar = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = tpVar;
            tpVar.f28163f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
        }
        le.b bVar = aVar.f11191a;
        if (!bVar.f13975f && bVar.e == 0.0f) {
            aVar.e.f28162c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
