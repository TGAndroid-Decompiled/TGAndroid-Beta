package ai;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.im0;
public final class ld extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f1783a;
    public final d91 f1784b;
    public final kd f1785c;

    public ld(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1783a = i10;
        setOrientation(1);
        d91 d91Var = new d91(context, null);
        this.f1784b = d91Var;
        kd kdVar = new kd(context, i10, z10, j10, i11, d6Var);
        this.f1785c = kdVar;
        d91Var.setAdapter(kdVar);
        View n10 = d91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d7, d6Var));
        addView(n10, w7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
        addView(d91Var, w7.z5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21060h5, d6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f1785c.i();
            this.f1784b.o(true);
        }
    }

    public im0 getCurrentListView() {
        View currentView = this.f1784b.getCurrentView();
        if (!(currentView instanceof jd)) {
            return null;
        }
        return ((jd) currentView).f1580a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f1785c.i();
        this.f1784b.o(false);
        NotificationCenter.getInstance(this.f1783a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f1783a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
