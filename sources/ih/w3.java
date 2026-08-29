package ih;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.j6;
import jh.k7;
import jh.s7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.u51;
public final class w3 extends org.telegram.ui.ActionBar.f3 {
    public long f9490b;

    public w3(Context context, long j10, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.c6 c6Var, Utilities.Callback0Return callback0Return) {
        super(context, c6Var, false, false);
        this.f9490b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = j6.b(context, 20.0f, g6.G6, true, c6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, i7.f6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = j6.b(context, 14.0f, g6.f23433y6, false, c6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, i7.f6.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        nh.d dVar = new nh.d(context, c6Var, true);
        k7 G = s7.y(this.currentAccount, false).G(j10, true);
        u51 u51Var = new u51(context, this.currentAccount, 0, false, new bh.v(2, this, G), new a9.s(22, this, dVar), null, c6Var);
        u51Var.setSpanCount(3);
        u51Var.setOverScrollMode(2);
        u51Var.setScrollEnabled(false);
        linearLayout.addView(u51Var, i7.f6.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, i7.f6.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new u3(this, G, savedStarGift, callback0Return, 0));
        setCustomView(linearLayout);
    }
}
