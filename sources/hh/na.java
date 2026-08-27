package hh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.zk0;

public final class na extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {

    public final int f9792a;

    public final p71 f9793b;

    public final ma f9794c;

    public na(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9792a = i10;
        setOrientation(1);
        p71 p71Var = new p71(context, null);
        this.f9793b = p71Var;
        ma maVar = new ma(context, i10, z10, j10, i11, c6Var);
        this.f9794c = maVar;
        p71Var.setAdapter(maVar);
        View viewN = p71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var));
        addView(viewN, h7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(h7.z5.z(-1.0f), h7.z5.z(1.0f / AndroidUtilities.density)));
        addView(p71Var, h7.z5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f9794c.i();
            this.f9793b.o(true);
        }
    }

    public zk0 getCurrentListView() {
        View currentView = this.f9793b.getCurrentView();
        if (currentView instanceof la) {
            return ((la) currentView).f9688a;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f9794c.i();
        this.f9793b.o(false);
        NotificationCenter.getInstance(this.f9792a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f9792a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
