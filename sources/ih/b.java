package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import le.c;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zq;
import w7.y5;
public final class b extends FrameLayout {
    public final d6 f11200a;
    public a f11201b;
    public zq f11202c;
    public boolean d;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f11200a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f11202c == null) {
            zq zqVar = new zq(getContext(), this.f11200a);
            this.f11202c = zqVar;
            zqVar.setReverse(this.d);
            addView(this.f11202c, y5.e(-1, 28, 48));
        }
        this.f11202c.f31050a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f11201b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f11201b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            wp wpVar = new wp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = wpVar;
            wpVar.f30029f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, y5.e(46, 46, 17));
        }
        c cVar = aVar.f11195a;
        if (!cVar.f14217f && cVar.e == 0.0f) {
            aVar.e.f30028c = -1L;
        }
        cVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
