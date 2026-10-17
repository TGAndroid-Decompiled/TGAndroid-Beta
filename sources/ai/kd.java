package ai;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.im0;
public final class kd extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f1734a;
    public final c91 f1735b;
    public final jd f1736c;

    public kd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1734a = i10;
        setOrientation(1);
        c91 c91Var = new c91(context, null);
        this.f1735b = c91Var;
        jd jdVar = new jd(context, i10, z10, j10, i11, d6Var);
        this.f1736c = jdVar;
        c91Var.setAdapter(jdVar);
        View n10 = c91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d7, d6Var));
        addView(n10, w7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
        addView(c91Var, w7.z5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, d6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f1736c.i();
            this.f1735b.o(true);
        }
    }

    public im0 getCurrentListView() {
        View currentView = this.f1735b.getCurrentView();
        if (!(currentView instanceof id)) {
            return null;
        }
        return ((id) currentView).f1530a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f1736c.i();
        this.f1735b.o(false);
        NotificationCenter.getInstance(this.f1734a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f1734a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
