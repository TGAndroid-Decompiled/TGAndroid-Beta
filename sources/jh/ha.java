package jh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.z71;
public final class ha extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f12220a;
    public final z71 f12221b;
    public final ga f12222c;

    public ha(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f12220a = i10;
        setOrientation(1);
        z71 z71Var = new z71(context, null);
        this.f12221b = z71Var;
        ga gaVar = new ga(context, i10, z10, j10, i11, c6Var);
        this.f12222c = gaVar;
        z71Var.setAdapter(gaVar);
        View n10 = z71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, c6Var));
        addView(n10, i7.f6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(i7.f6.z(-1.0f), i7.f6.z(1.0f / AndroidUtilities.density)));
        addView(z71Var, i7.f6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f12222c.i();
            this.f12221b.o(true);
        }
    }

    public jl0 getCurrentListView() {
        View currentView = this.f12221b.getCurrentView();
        if (!(currentView instanceof fa)) {
            return null;
        }
        return ((fa) currentView).f12073a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f12222c.i();
        this.f12221b.o(false);
        NotificationCenter.getInstance(this.f12220a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f12220a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
