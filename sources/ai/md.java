package ai;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.mm0;
public final class md extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f1837a;
    public final l91 f1838b;
    public final ld f1839c;

    public md(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f1837a = i10;
        setOrientation(1);
        l91 l91Var = new l91(context, null);
        this.f1838b = l91Var;
        ld ldVar = new ld(context, i10, z10, j10, i11, g6Var);
        this.f1839c = ldVar;
        l91Var.setAdapter(ldVar);
        View n10 = l91Var.n(3, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d7, view, g6Var);
        addView(n10, w7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
        addView(l91Var, w7.z5.n(-1, -1));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, this, g6Var);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f1839c.i();
            this.f1838b.o(true);
        }
    }

    public mm0 getCurrentListView() {
        View currentView = this.f1838b.getCurrentView();
        if (!(currentView instanceof kd)) {
            return null;
        }
        return ((kd) currentView).f1641a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f1839c.i();
        this.f1838b.o(false);
        NotificationCenter.getInstance(this.f1837a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f1837a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
