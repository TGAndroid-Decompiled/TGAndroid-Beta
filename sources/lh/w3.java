package lh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import mh.l7;
import mh.t7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i61;
public final class w3 extends org.telegram.ui.ActionBar.h3 {
    public long f13060b;

    public w3(Context context, long j10, TL_stars.SavedStarGift savedStarGift, g6 g6Var, Utilities.Callback0Return callback0Return) {
        super(context, g6Var, false, false);
        this.f13060b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = k7.g6.b(context, 20.0f, k6.G6, true, g6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, k7.c6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = k7.g6.b(context, 14.0f, k6.f22036y6, false, g6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, k7.c6.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        qh.d dVar = new qh.d(context, g6Var, true);
        l7 G = t7.y(this.currentAccount, false).G(j10, true);
        i61 i61Var = new i61(context, this.currentAccount, 0, false, new eh.w(2, this, G), new c1.b(25, this, dVar), null, g6Var);
        i61Var.setSpanCount(3);
        i61Var.setOverScrollMode(2);
        i61Var.setScrollEnabled(false);
        linearLayout.addView(i61Var, k7.c6.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, k7.c6.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new u3(this, G, savedStarGift, callback0Return, 0));
        setCustomView(linearLayout);
    }
}
