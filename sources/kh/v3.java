package kh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import lh.l7;
import lh.t7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
public final class v3 extends org.telegram.ui.ActionBar.g3 {
    public long f11005b;

    public v3(Context context, long j10, TL_stars.SavedStarGift savedStarGift, f6 f6Var, Utilities.Callback0Return callback0Return) {
        super(context, f6Var, false, false);
        this.f11005b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = k7.f6.b(context, 20.0f, j6.G6, true, f6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, k7.b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = k7.f6.b(context, 14.0f, j6.f20256y6, false, f6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, k7.b6.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ph.d dVar = new ph.d(context, f6Var, true);
        l7 G = t7.y(this.currentAccount, false).G(j10, true);
        g61 g61Var = new g61(context, this.currentAccount, 0, false, new dh.v(2, this, G), new c1.b(25, this, dVar), null, f6Var);
        g61Var.setSpanCount(3);
        g61Var.setOverScrollMode(2);
        g61Var.setScrollEnabled(false);
        linearLayout.addView(g61Var, k7.b6.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, k7.b6.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new t3(this, G, savedStarGift, callback0Return, 0));
        setCustomView(linearLayout);
    }
}
