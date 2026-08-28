package gh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.wk0;
public final class na extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f8636a;
    public final n71 f8637b;
    public final ma f8638c;

    public na(Context context, int i9, boolean z10, long j10, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f8636a = i9;
        setOrientation(1);
        n71 n71Var = new n71(context, null);
        this.f8637b = n71Var;
        ma maVar = new ma(context, i9, z10, j10, i10, b6Var);
        this.f8638c = maVar;
        n71Var.setAdapter(maVar);
        View n10 = n71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, b6Var));
        addView(n10, g7.e6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(g7.e6.z(-1.0f), g7.e6.z(1.0f / AndroidUtilities.density)));
        addView(n71Var, g7.e6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starTransactionsLoaded) {
            this.f8638c.i();
            this.f8637b.o(true);
        }
    }

    public wk0 getCurrentListView() {
        View currentView = this.f8637b.getCurrentView();
        if (!(currentView instanceof la)) {
            return null;
        }
        return ((la) currentView).f8515a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f8638c.i();
        this.f8637b.o(false);
        NotificationCenter.getInstance(this.f8636a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f8636a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
