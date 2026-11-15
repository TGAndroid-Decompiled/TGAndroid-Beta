package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.sa;
import di.l8;
import di.u8;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u41;
public final class h4 extends org.telegram.ui.ActionBar.u2 {
    public long f3568m1;

    public h4(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.e6 e6Var, r10 r10Var) {
        super(1, context, e6Var, false);
        this.f3568m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = sa.b(context, 20.0f, org.telegram.ui.ActionBar.j6.G6, true, e6Var);
        b10.setText(hd.M0(2131749881, null));
        linearLayout.addView(b10, ja.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = sa.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f29241y6, false, e6Var);
        b11.setText(hd.M0(2131749882, null));
        linearLayout.addView(b11, ja.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        l8 G = u8.y(this.f29679a, false).G(j3, true);
        u41 u41Var = new u41(context, this.f29679a, 0, false, new e4(0, this, G), new ab.g(6, this, dVar), null, e6Var);
        u41Var.setSpanCount(3);
        u41Var.setOverScrollMode(2);
        u41Var.setScrollEnabled(false);
        linearLayout.addView(u41Var, ja.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(hd.M0(2131749883, null), false, true);
        linearLayout.addView(dVar, ja.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new f4(this, G, savedStarGift, r10Var, 0));
        this.O = linearLayout;
    }
}
