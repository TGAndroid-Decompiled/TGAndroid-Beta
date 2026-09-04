package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.vq;
import w7.x5;
public final class b extends FrameLayout {
    public final f6 f13727a;
    public a f13728b;
    public vq f13729c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f13727a = f6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f13729c == null) {
            vq vqVar = new vq(getContext(), this.f13727a);
            this.f13729c = vqVar;
            vqVar.setReverse(this.d);
            addView(this.f13729c, x5.e(-1, 28, 48));
        }
        this.f13729c.f31962a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f13728b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f13728b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            sp spVar = new sp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f13724e = spVar;
            spVar.f30386f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f13724e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
        }
        le.b bVar = aVar.f13721a;
        if (!bVar.f15369f && bVar.f15368e == 0.0f) {
            aVar.f13724e.f30384c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
