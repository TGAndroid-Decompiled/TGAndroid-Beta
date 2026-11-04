package ai;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.rf;
import ci.e9;
import ci.v8;
import org.telegram.messenger.bd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
public final class t4 extends org.telegram.ui.ActionBar.t2 {
    public long f987j1;

    public t4(Context context, long j10, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.e6 e6Var, m10 m10Var) {
        super(1, context, e6Var, false);
        this.f987j1 = 0L;
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = rf.b(context, 20.0f, org.telegram.ui.ActionBar.k6.G6, true, e6Var);
        b10.setText(bd.M0(2131749889, null));
        linearLayout.addView(b10, mf.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f28273y6, false, e6Var);
        b11.setText(bd.M0(2131749890, null));
        linearLayout.addView(b11, mf.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        v8 G = e9.y(this.f28583a, false).G(j10, true);
        l41 l41Var = new l41(context, this.f28583a, 0, false, new q4(0, this, G), new n(3, this, dVar), null, e6Var);
        l41Var.setSpanCount(3);
        l41Var.setOverScrollMode(2);
        l41Var.setScrollEnabled(false);
        linearLayout.addView(l41Var, mf.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(bd.M0(2131749891, null), false, true);
        linearLayout.addView(dVar, mf.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new r4(this, G, savedStarGift, m10Var, 0));
        this.O = linearLayout;
    }
}
