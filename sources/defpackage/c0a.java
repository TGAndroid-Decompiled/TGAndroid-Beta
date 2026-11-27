package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class c0a extends j1a {
    public final View R;
    public final TL_stars.TL_starGiftUnique S;
    public final d0a T;

    public c0a(d0a d0aVar, Context context, c1a c1aVar, View view, w0a w0aVar, vnb vnbVar, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(d0aVar.e, context, c1aVar, view, w0aVar, vnbVar);
        this.T = d0aVar;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}
