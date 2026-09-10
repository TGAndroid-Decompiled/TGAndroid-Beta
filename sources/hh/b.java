package hh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.zp;
import w7.a6;
public final class b extends FrameLayout {
    public final f6 f9416a;
    public a f9417b;
    public cr f9418c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f9416a = f6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f9418c == null) {
            cr crVar = new cr(getContext(), this.f9416a);
            this.f9418c = crVar;
            crVar.setReverse(this.d);
            addView(this.f9418c, a6.e(-1, 28, 48));
        }
        this.f9418c.f22215a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f9417b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f9417b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            zp zpVar = new zp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = zpVar;
            zpVar.f29784f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, a6.e(46, 46, 17));
        }
        le.b bVar = aVar.f9411a;
        if (!bVar.f12870f && bVar.e == 0.0f) {
            aVar.e.f29783c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
