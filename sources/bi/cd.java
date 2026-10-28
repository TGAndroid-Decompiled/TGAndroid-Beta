package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v91;
public final class cd extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f4467a;
    public final v91 f4468b;
    public final bd f4469c;
    public final FrameLayout d;
    public final mw0 e;
    public final long f4470f;

    public cd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var, mw0 mw0Var) {
        super(context);
        v91 pm0Var;
        pm0 pm0Var2;
        int i12;
        this.e = mw0Var;
        this.f4467a = i10;
        this.f4470f = j10;
        setOrientation(1);
        if (mw0Var == null) {
            pm0Var = new v91(context, null);
        } else {
            pm0Var = new pm0(context, u6Var, mw0Var);
        }
        v91 v91Var = pm0Var;
        this.f4468b = v91Var;
        bd bdVar = new bd(context, i10, z10, j10, i11, u6Var);
        this.f4469c = bdVar;
        if (mw0Var == null) {
            pm0Var2 = null;
        } else {
            pm0Var2 = (pm0) v91Var;
        }
        bdVar.f4397g = pm0Var2;
        v91Var.setAdapter(bdVar);
        if (mw0Var == null) {
            i12 = 3;
        } else {
            i12 = -2;
        }
        View n10 = v91Var.n(i12, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23358d7, view, u6Var);
        if (mw0Var == null) {
            this.d = null;
            addView(n10, kb1.r(-1, 48));
            addView(view, new LinearLayout.LayoutParams(kb1.I(-1.0f), kb1.I(1.0f / AndroidUtilities.density)));
            setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, u6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            frameLayout.addView(n10, kb1.i(-1, 48, 48));
        }
        addView(v91Var, kb1.r(-1, -1));
    }

    public final void a(boolean z10) {
        int i10;
        bd bdVar = this.f4469c;
        v91 v91Var = this.f4468b;
        mw0 mw0Var = this.e;
        if (mw0Var == null) {
            bdVar.i();
            v91Var.o(z10);
            return;
        }
        ArrayList arrayList = bdVar.f4398i;
        ArrayList arrayList2 = bdVar.f4398i;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i11 |= 1 << ((u61) arrayList.get(i12)).f33262z;
        }
        View currentView = v91Var.getCurrentView();
        if (currentView instanceof ad) {
            i10 = ((ad) currentView).d;
        } else {
            i10 = 0;
        }
        bdVar.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((u61) arrayList2.get(i14)).f33262z;
        }
        if (i11 != i13) {
            v91Var.onTouchEvent(null);
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((u61) arrayList2.get(i15)).f33262z == i10) {
                        break;
                    }
                    i15++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            v91Var.setPosition(i15);
            v91Var.J();
            v91Var.o(false);
            mw0Var.l();
        } else if (!z10) {
            v91Var.o(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        long j10 = this.f4470f;
        if ((i10 == i12 && j10 == 0) || (i10 == NotificationCenter.botStarsTransactionsLoaded && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public nm0 getCurrentListView() {
        View currentView = this.f4468b.getCurrentView();
        if (!(currentView instanceof ad)) {
            return null;
        }
        return ((ad) currentView).f4289a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public v91 getViewPager() {
        return this.f4468b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        a(false);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f4467a);
        if (this.f4470f == 0) {
            i10 = NotificationCenter.starTransactionsLoaded;
        } else {
            i10 = NotificationCenter.botStarsTransactionsLoaded;
        }
        notificationCenter.addWeakObserver(this, i10);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f4467a);
        if (this.f4470f == 0) {
            i10 = NotificationCenter.starTransactionsLoaded;
        } else {
            i10 = NotificationCenter.botStarsTransactionsLoaded;
        }
        notificationCenter.removeObserver(this, i10);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(oi.q qVar) {
        View[] viewPages;
        if (qVar != null) {
            bd bdVar = this.f4469c;
            if (bdVar.h != qVar) {
                bdVar.h = qVar;
                v91 v91Var = this.f4468b;
                qVar.c(v91Var);
                for (View view : v91Var.getViewPages()) {
                    if (view instanceof ad) {
                        qVar.b(((ad) view).f4289a);
                    }
                }
            }
        }
    }
}
