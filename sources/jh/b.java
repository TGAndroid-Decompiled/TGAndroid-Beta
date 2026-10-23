package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import w7.z5;
public final class b extends FrameLayout {
    public final d6 f14514a;
    public a f14515b;
    public gr f14516c;
    public boolean d;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f14514a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f14516c == null) {
            gr grVar = new gr(getContext(), this.f14514a);
            this.f14516c = grVar;
            grVar.setReverse(this.d);
            addView(this.f14516c, z5.e(-1, 28, 48));
        }
        this.f14516c.f26655a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f14515b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f14515b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            dq dqVar = new dq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = dqVar;
            dqVar.f25609f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, z5.e(46, 46, 17));
        }
        ne.b bVar = aVar.f14509a;
        if (!bVar.f17384f && bVar.e == 0.0f) {
            aVar.e.f25608c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
