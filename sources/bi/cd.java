package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u91;
public final class cd extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f4467a;
    public final u91 f4468b;
    public final bd f4469c;
    public final FrameLayout d;
    public final lw0 e;
    public final long f4470f;

    public cd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var, lw0 lw0Var) {
        super(context);
        u91 om0Var;
        om0 om0Var2;
        int i12;
        this.e = lw0Var;
        this.f4467a = i10;
        this.f4470f = j10;
        setOrientation(1);
        if (lw0Var == null) {
            om0Var = new u91(context, null);
        } else {
            om0Var = new om0(context, u6Var, lw0Var);
        }
        u91 u91Var = om0Var;
        this.f4468b = u91Var;
        bd bdVar = new bd(context, i10, z10, j10, i11, u6Var);
        this.f4469c = bdVar;
        if (lw0Var == null) {
            om0Var2 = null;
        } else {
            om0Var2 = (om0) u91Var;
        }
        bdVar.f4397g = om0Var2;
        u91Var.setAdapter(bdVar);
        if (lw0Var == null) {
            i12 = 3;
        } else {
            i12 = -2;
        }
        View n10 = u91Var.n(i12, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23355d7, view, u6Var);
        if (lw0Var == null) {
            this.d = null;
            addView(n10, gb1.r(-1, 48));
            addView(view, new LinearLayout.LayoutParams(gb1.I(-1.0f), gb1.I(1.0f / AndroidUtilities.density)));
            setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, u6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            frameLayout.addView(n10, gb1.i(-1, 48, 48));
        }
        addView(u91Var, gb1.r(-1, -1));
    }

    public final void a(boolean z10) {
        int i10;
        bd bdVar = this.f4469c;
        u91 u91Var = this.f4468b;
        lw0 lw0Var = this.e;
        if (lw0Var == null) {
            bdVar.i();
            u91Var.o(z10);
            return;
        }
        ArrayList arrayList = bdVar.f4398i;
        ArrayList arrayList2 = bdVar.f4398i;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i11 |= 1 << ((t61) arrayList.get(i12)).f32885z;
        }
        View currentView = u91Var.getCurrentView();
        if (currentView instanceof ad) {
            i10 = ((ad) currentView).d;
        } else {
            i10 = 0;
        }
        bdVar.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((t61) arrayList2.get(i14)).f32885z;
        }
        if (i11 != i13) {
            u91Var.onTouchEvent(null);
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((t61) arrayList2.get(i15)).f32885z == i10) {
                        break;
                    }
                    i15++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            u91Var.setPosition(i15);
            u91Var.J();
            u91Var.o(false);
            lw0Var.l();
        } else if (!z10) {
            u91Var.o(false);
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

    public mm0 getCurrentListView() {
        View currentView = this.f4468b.getCurrentView();
        if (!(currentView instanceof ad)) {
            return null;
        }
        return ((ad) currentView).f4289a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public u91 getViewPager() {
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
        notificationCenter.addObserver(this, i10);
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
                u91 u91Var = this.f4468b;
                qVar.c(u91Var);
                for (View view : u91Var.getViewPages()) {
                    if (view instanceof ad) {
                        qVar.b(((ad) view).f4289a);
                    }
                }
            }
        }
    }
}
