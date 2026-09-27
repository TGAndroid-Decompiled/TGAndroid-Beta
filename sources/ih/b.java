package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import le.c;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.yq;
import w7.y5;
public final class b extends FrameLayout {
    public final e6 f11189a;
    public a f11190b;
    public yq f11191c;
    public boolean d;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f11189a = e6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f11191c == null) {
            yq yqVar = new yq(getContext(), this.f11189a);
            this.f11191c = yqVar;
            yqVar.setReverse(this.d);
            addView(this.f11191c, y5.e(-1, 28, 48));
        }
        this.f11191c.f30761a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f11190b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f11190b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            vp vpVar = new vp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = vpVar;
            vpVar.f29729f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, y5.e(46, 46, 17));
        }
        c cVar = aVar.f11184a;
        if (!cVar.f14203f && cVar.e == 0.0f) {
            aVar.e.f29728c = -1L;
        }
        cVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
