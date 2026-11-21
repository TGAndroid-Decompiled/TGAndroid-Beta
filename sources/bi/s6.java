package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.va;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
public final class s6 extends org.telegram.ui.ActionBar.w2 {
    public long f4092m1;

    public s6(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.h6 h6Var, p10 p10Var) {
        super(1, context, h6Var, false);
        this.f4092m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = va.b(context, 20.0f, org.telegram.ui.ActionBar.m6.G6, true, h6Var);
        b10.setText(gd.N0(2131749864, null));
        linearLayout.addView(b10, ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = va.b(context, 14.0f, org.telegram.ui.ActionBar.m6.f29770y6, false, h6Var);
        b11.setText(gd.N0(2131749865, null));
        linearLayout.addView(b11, ma.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.e eVar = new hi.e(context, h6Var, true);
        di.p8 G = di.y8.y(this.f30170a, false).G(j3, true);
        h51 h51Var = new h51(context, this.f30170a, 0, false, new p6(0, this, G), new ab.g(5, this, eVar), null, h6Var);
        h51Var.setSpanCount(3);
        h51Var.setOverScrollMode(2);
        h51Var.setScrollEnabled(false);
        linearLayout.addView(h51Var, ma.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        eVar.i(gd.N0(2131749866, null), false, true);
        linearLayout.addView(eVar, ma.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        eVar.setEnabled(false);
        eVar.setOnClickListener(new q6(this, G, savedStarGift, p10Var, 0));
        this.O = linearLayout;
    }
}
