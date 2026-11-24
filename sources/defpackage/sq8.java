package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class sq8 extends fx0 {
    public long l1;

    public sq8(Context context, long j, TL_stars.SavedStarGift savedStarGift, wjb wjbVar, h8c h8cVar) {
        super(1, wjbVar, context, false);
        this.l1 = 0L;
        K();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b = hve.b(context, 20.0f, bkb.F6, true, wjbVar);
        b.setText(k96.M0(2131749865, null));
        linearLayout.addView(b, nme.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b2 = hve.b(context, 14.0f, bkb.x6, false, wjbVar);
        b2.setText(k96.M0(2131749866, null));
        linearLayout.addView(b2, nme.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        u41 u41Var = new u41(wjbVar, context, true);
        xsa D = gta.v(this.a, false).D(j, true);
        q5c q5cVar = new q5c(context, this.a, 0, false, new w77(this, D, (byte) 8), new kq8(this, u41Var, (byte) 1), null, wjbVar);
        q5cVar.setSpanCount(3);
        q5cVar.setOverScrollMode(2);
        q5cVar.setScrollEnabled(false);
        linearLayout.addView(q5cVar, nme.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        u41Var.i(k96.M0(2131749867, null), false, true);
        linearLayout.addView(u41Var, nme.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        u41Var.setEnabled(false);
        u41Var.setOnClickListener(new ee(this, D, savedStarGift, h8cVar, (byte) 15));
        this.O = linearLayout;
    }
}
