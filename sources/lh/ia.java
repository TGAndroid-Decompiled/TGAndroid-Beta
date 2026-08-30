package lh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.sl0;
public final class ia extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f12627a;
    public final l81 f12628b;
    public final ha f12629c;

    public ia(Context context, int i10, boolean z4, long j10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12627a = i10;
        setOrientation(1);
        l81 l81Var = new l81(context, null);
        this.f12628b = l81Var;
        ha haVar = new ha(context, i10, z4, j10, i11, f6Var);
        this.f12629c = haVar;
        l81Var.setAdapter(haVar);
        View n10 = l81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, f6Var));
        addView(n10, k7.b6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(1.0f / AndroidUtilities.density)));
        addView(l81Var, k7.b6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f12629c.i();
            this.f12628b.o(true);
        }
    }

    public sl0 getCurrentListView() {
        View currentView = this.f12628b.getCurrentView();
        if (!(currentView instanceof ga)) {
            return null;
        }
        return ((ga) currentView).f12512a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f12629c.i();
        this.f12628b.o(false);
        NotificationCenter.getInstance(this.f12627a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f12627a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
