package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import le.c;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.xq;
import w7.x5;
public final class b extends FrameLayout {
    public final d6 f11186a;
    public a f11187b;
    public xq f11188c;
    public boolean d;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f11186a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f11188c == null) {
            xq xqVar = new xq(getContext(), this.f11186a);
            this.f11188c = xqVar;
            xqVar.setReverse(this.d);
            addView(this.f11188c, x5.e(-1, 28, 48));
        }
        this.f11188c.f30034a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f11187b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f11187b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            up upVar = new up(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = upVar;
            upVar.f28533f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
        }
        c cVar = aVar.f11181a;
        if (!cVar.f13963f && cVar.e == 0.0f) {
            aVar.e.f28532c = -1L;
        }
        cVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
