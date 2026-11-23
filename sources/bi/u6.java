package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.wa;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g51;
public final class u6 extends org.telegram.ui.ActionBar.w2 {
    public long f4126m1;

    public u6(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.i6 i6Var, o10 o10Var) {
        super(1, context, i6Var, false);
        this.f4126m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = wa.b(context, 20.0f, org.telegram.ui.ActionBar.n6.G6, true, i6Var);
        b10.setText(gd.N0(2131749864, null));
        linearLayout.addView(b10, na.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = wa.b(context, 14.0f, org.telegram.ui.ActionBar.n6.f29843y6, false, i6Var);
        b11.setText(gd.N0(2131749865, null));
        linearLayout.addView(b11, na.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.e eVar = new hi.e(context, i6Var, true);
        di.p8 G = di.y8.y(this.f30223a, false).G(j3, true);
        g51 g51Var = new g51(context, this.f30223a, 0, false, new r6(0, this, G), new ab.g(5, this, eVar), null, i6Var);
        g51Var.setSpanCount(3);
        g51Var.setOverScrollMode(2);
        g51Var.setScrollEnabled(false);
        linearLayout.addView(g51Var, na.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        eVar.i(gd.N0(2131749866, null), false, true);
        linearLayout.addView(eVar, na.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        eVar.setEnabled(false);
        eVar.setOnClickListener(new s6(this, G, savedStarGift, o10Var, 0));
        this.O = linearLayout;
    }
}
