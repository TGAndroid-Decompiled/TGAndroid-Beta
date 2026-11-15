package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lp;
public final class b extends FrameLayout {
    public final e6 f18167a;
    public a f18168b;
    public kq f18169c;
    public boolean d;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f18167a = e6Var;
    }

    public final void a(int i7, boolean z10) {
        if (this.f18169c == null) {
            kq kqVar = new kq(getContext(), this.f18167a);
            this.f18169c = kqVar;
            kqVar.setReverse(this.d);
            addView(this.f18169c, ja.e(-1, 28, 48));
        }
        this.f18169c.f36574a.c(i7, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f18168b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f18168b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            lp lpVar = new lp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.f18163e = lpVar;
            lpVar.f36872f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f18163e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, ja.e(46, 46, 17));
        }
        te.a aVar2 = aVar.f18160a;
        if (!aVar2.f57086f && aVar2.f57085e == 0.0f) {
            aVar.f18163e.f36870c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
