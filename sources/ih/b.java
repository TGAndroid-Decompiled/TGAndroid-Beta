package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zq;
import w7.z5;
public final class b extends FrameLayout {
    public final d6 f12181a;
    public a f12182b;
    public zq f12183c;
    public boolean d;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f12181a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f12183c == null) {
            zq zqVar = new zq(getContext(), this.f12181a);
            this.f12183c = zqVar;
            zqVar.setReverse(this.d);
            addView(this.f12183c, z5.e(-1, 28, 48));
        }
        this.f12183c.f33595a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f12182b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f12182b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            wp wpVar = new wp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f12178e = wpVar;
            wpVar.f32594f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f12178e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, z5.e(46, 46, 17));
        }
        le.b bVar = aVar.f12175a;
        if (!bVar.f15436f && bVar.f15435e == 0.0f) {
            aVar.f12178e.f32592c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
