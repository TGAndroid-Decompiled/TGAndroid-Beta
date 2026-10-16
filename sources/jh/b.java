package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.jr;
import w7.z5;
public final class b extends FrameLayout {
    public final c6 f13102a;
    public a f13103b;
    public jr f13104c;
    public boolean d;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f13102a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f13104c == null) {
            jr jrVar = new jr(getContext(), this.f13102a);
            this.f13104c = jrVar;
            jrVar.setReverse(this.d);
            addView(this.f13104c, z5.e(-1, 28, 48));
        }
        this.f13104c.f26123a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f13103b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f13103b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            gq gqVar = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = gqVar;
            gqVar.f25087f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, z5.e(46, 46, 17));
        }
        ne.b bVar = aVar.f13097a;
        if (!bVar.f16004f && bVar.e == 0.0f) {
            aVar.e.f25086c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
