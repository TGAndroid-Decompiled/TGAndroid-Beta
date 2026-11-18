package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.va;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e51;
public final class o6 extends org.telegram.ui.ActionBar.x2 {
    public long f3920m1;

    public o6(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.i6 i6Var, p10 p10Var) {
        super(1, context, i6Var, false);
        this.f3920m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = va.b(context, 20.0f, org.telegram.ui.ActionBar.n6.G6, true, i6Var);
        b10.setText(gd.M0(2131749865, null));
        linearLayout.addView(b10, ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = va.b(context, 14.0f, org.telegram.ui.ActionBar.n6.f29786y6, false, i6Var);
        b11.setText(gd.M0(2131749866, null));
        linearLayout.addView(b11, ma.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.d dVar = new hi.d(context, i6Var, true);
        di.o8 G = di.x8.y(this.f30187a, false).G(j3, true);
        e51 e51Var = new e51(context, this.f30187a, 0, false, new l6(0, this, G), new ab.g(5, this, dVar), null, i6Var);
        e51Var.setSpanCount(3);
        e51Var.setOverScrollMode(2);
        e51Var.setScrollEnabled(false);
        linearLayout.addView(e51Var, ma.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(gd.M0(2131749867, null), false, true);
        linearLayout.addView(dVar, ma.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new m6(this, G, savedStarGift, p10Var, 0));
        this.O = linearLayout;
    }
}
