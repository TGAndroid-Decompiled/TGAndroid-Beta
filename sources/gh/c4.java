package gh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.m7;
import hh.u7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

public final class c4 extends org.telegram.ui.ActionBar.e3 {

    public long f7184b;

    public c4(Context context, long j10, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.c6 c6Var, Utilities.Callback0Return callback0Return) {
        super(context, c6Var, false, false);
        this.f7184b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textViewB = h7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.G6, true, c6Var);
        textViewB.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(textViewB, h7.z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView textViewB2 = h7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.f23423y6, false, c6Var);
        textViewB2.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(textViewB2, h7.z5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        lh.d dVar = new lh.d(context, c6Var, true);
        m7 m7VarG = u7.y(this.currentAccount, false).G(j10, true);
        b4 b4Var = new b4(context, this.currentAccount, 0, false, new cg.u0(1, this, m7VarG), new ag.h0(20, this, dVar), null, c6Var);
        b4Var.setSpanCount(3);
        b4Var.setOverScrollMode(2);
        b4Var.setScrollEnabled(false);
        linearLayout.addView(b4Var, h7.z5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, h7.z5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new a4(this, m7VarG, savedStarGift, callback0Return, 0));
        setCustomView(linearLayout);
    }
}
