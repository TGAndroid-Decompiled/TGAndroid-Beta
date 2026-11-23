package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.wa;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
public final class u6 extends org.telegram.ui.ActionBar.w2 {
    public long f4126m1;

    public u6(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.h6 h6Var, q10 q10Var) {
        super(1, context, h6Var, false);
        this.f4126m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = wa.b(context, 20.0f, org.telegram.ui.ActionBar.m6.G6, true, h6Var);
        b10.setText(hd.N0(2131749864, null));
        linearLayout.addView(b10, na.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = wa.b(context, 14.0f, org.telegram.ui.ActionBar.m6.f29739y6, false, h6Var);
        b11.setText(hd.N0(2131749865, null));
        linearLayout.addView(b11, na.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.d dVar = new hi.d(context, h6Var, true);
        di.p8 G = di.y8.y(this.f30139a, false).G(j3, true);
        h51 h51Var = new h51(context, this.f30139a, 0, false, new r6(0, this, G), new ab.g(5, this, dVar), null, h6Var);
        h51Var.setSpanCount(3);
        h51Var.setOverScrollMode(2);
        h51Var.setScrollEnabled(false);
        linearLayout.addView(h51Var, na.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(hd.N0(2131749866, null), false, true);
        linearLayout.addView(dVar, na.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new s6(this, G, savedStarGift, q10Var, 0));
        this.O = linearLayout;
    }
}
