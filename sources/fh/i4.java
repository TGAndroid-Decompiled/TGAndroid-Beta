package fh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.n7;
import gh.v7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
public final class i4 extends org.telegram.ui.ActionBar.f3 {
    public long f6519b;

    public i4(Context context, long j10, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.b6 b6Var, Utilities.Callback0Return callback0Return) {
        super(context, b6Var, false, false);
        this.f6519b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = g7.i6.b(context, 20.0f, org.telegram.ui.ActionBar.f6.G6, true, b6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, g7.e6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = g7.i6.b(context, 14.0f, org.telegram.ui.ActionBar.f6.f23369y6, false, b6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, g7.e6.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        kh.d dVar = new kh.d(context, b6Var, true);
        n7 G = v7.y(this.currentAccount, false).G(j10, true);
        i51 i51Var = new i51(context, this.currentAccount, 0, false, new bg.y0(1, this, G), new b5.d(19, this, dVar), null, b6Var);
        i51Var.setSpanCount(3);
        i51Var.setOverScrollMode(2);
        i51Var.setScrollEnabled(false);
        linearLayout.addView(i51Var, g7.e6.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, g7.e6.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new g4(this, G, savedStarGift, callback0Return, 0));
        setCustomView(linearLayout);
    }
}
