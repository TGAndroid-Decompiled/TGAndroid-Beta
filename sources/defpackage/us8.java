package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class us8 extends my0 {
    public long l1;

    public us8(Context context, long j, TL_stars.SavedStarGift savedStarGift, ylb ylbVar, iac iacVar) {
        super(1, ylbVar, context, false);
        this.l1 = 0L;
        J();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b = jxe.b(context, 20.0f, cmb.F6, true, ylbVar);
        b.setText(jb6.M0(2131749814, null));
        linearLayout.addView(b, qoe.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b2 = jxe.b(context, 14.0f, cmb.x6, false, ylbVar);
        b2.setText(jb6.M0(2131749815, null));
        linearLayout.addView(b2, qoe.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        b61 b61Var = new b61(ylbVar, context, true);
        ava D = jva.v(this.a, false).D(j, true);
        q7c q7cVar = new q7c(context, this.a, 0, false, new s87(this, D, (byte) 10), new xr8(this, b61Var, (byte) 2), null, ylbVar);
        q7cVar.setSpanCount(3);
        q7cVar.setOverScrollMode(2);
        q7cVar.setScrollEnabled(false);
        linearLayout.addView(q7cVar, qoe.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        b61Var.i(jb6.M0(2131749816, null), false, true);
        linearLayout.addView(b61Var, qoe.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        b61Var.setEnabled(false);
        b61Var.setOnClickListener(new ef(this, D, savedStarGift, iacVar, (byte) 15));
        this.O = linearLayout;
    }
}
