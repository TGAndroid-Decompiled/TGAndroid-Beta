package mh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.tl0;
public final class ia extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f14276a;
    public final m81 f14277b;
    public final ha f14278c;

    public ia(Context context, int i10, boolean z4, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f14276a = i10;
        setOrientation(1);
        m81 m81Var = new m81(context, null);
        this.f14277b = m81Var;
        ha haVar = new ha(context, i10, z4, j10, i11, g6Var);
        this.f14278c = haVar;
        m81Var.setAdapter(haVar);
        View n10 = m81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, g6Var));
        addView(n10, k7.c6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(k7.c6.z(-1.0f), k7.c6.z(1.0f / AndroidUtilities.density)));
        addView(m81Var, k7.c6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f14278c.i();
            this.f14277b.o(true);
        }
    }

    public tl0 getCurrentListView() {
        View currentView = this.f14277b.getCurrentView();
        if (!(currentView instanceof ga)) {
            return null;
        }
        return ((ga) currentView).f14129a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f14278c.i();
        this.f14277b.o(false);
        NotificationCenter.getInstance(this.f14276a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f14276a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
