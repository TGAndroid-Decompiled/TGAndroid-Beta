package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.or;
import w7.w5;
public final class b extends FrameLayout {
    public final c6 f12227a;
    public a f12228b;
    public or f12229c;
    public boolean d;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f12227a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f12229c == null) {
            or orVar = new or(getContext(), this.f12227a);
            this.f12229c = orVar;
            orVar.setReverse(this.d);
            addView(this.f12229c, w5.e(-1, 28, 48));
        }
        this.f12229c.f29275a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f12228b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f12228b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            lq lqVar = new lq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f12224e = lqVar;
            lqVar.f28253f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f12224e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, w5.e(46, 46, 17));
        }
        me.b bVar = aVar.f12221a;
        if (!bVar.f16089f && bVar.f16088e == 0.0f) {
            aVar.f12224e.f28251c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
