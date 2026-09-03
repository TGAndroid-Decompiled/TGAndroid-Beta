package lh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.rl0;
public final class ia extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f12611a;
    public final l81 f12612b;
    public final ha f12613c;

    public ia(Context context, int i10, boolean z4, long j10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12611a = i10;
        setOrientation(1);
        l81 l81Var = new l81(context, null);
        this.f12612b = l81Var;
        ha haVar = new ha(context, i10, z4, j10, i11, f6Var);
        this.f12613c = haVar;
        l81Var.setAdapter(haVar);
        View n10 = l81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19882d7, f6Var));
        addView(n10, k7.b6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(1.0f / AndroidUtilities.density)));
        addView(l81Var, k7.b6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f12613c.i();
            this.f12612b.o(true);
        }
    }

    public rl0 getCurrentListView() {
        View currentView = this.f12612b.getCurrentView();
        if (!(currentView instanceof ga)) {
            return null;
        }
        return ((ga) currentView).f12496a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f12613c.i();
        this.f12612b.o(false);
        NotificationCenter.getInstance(this.f12611a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f12611a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
