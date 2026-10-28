package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
public final class bd extends n91 {
    public final Context f4393a;
    public final int f4394b;
    public final boolean f4395c;
    public final int d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final long f4396f;
    public pm0 f4397g;
    public oi.q h;
    public final ArrayList f4398i = new ArrayList();

    public bd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f4393a = context;
        this.f4394b = i10;
        this.f4395c = z10;
        this.d = i11;
        this.e = u6Var;
        this.f4396f = j10;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        pm0 pm0Var = this.f4397g;
        if (pm0Var != null) {
            pm0Var.L(view);
        }
    }

    @Override
    public final View d(int i10) {
        ad adVar = new ad(this.f4393a, this.f4395c, this.f4396f, i10, this.f4394b, this.d, this.e);
        if (this.f4397g != null) {
            adVar.setClipChildren(false);
            adVar.setClipToPadding(false);
            s71 s71Var = adVar.f4289a;
            s71Var.setClipToPadding(false);
            s71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
            s71Var.f32504g3.f29878r = false;
            s71Var.setCaptureSectionsDecoratorAllowed(true);
            s71Var.setOverScrollMode(0);
            oi.q qVar = this.h;
            if (qVar != null) {
                qVar.b(s71Var);
            }
        }
        return adVar;
    }

    @Override
    public final int e() {
        return this.f4398i.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int h = h(i10);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return LocaleController.getString(R.string.StarsTransactionsOutgoing);
            }
            return LocaleController.getString(R.string.StarsTransactionsIncoming);
        }
        return LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f4398i;
            if (i10 < arrayList.size()) {
                return ((u61) arrayList.get(i10)).f33262z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f4398i;
        arrayList.clear();
        long j10 = this.f4396f;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f4394b;
        if (i10 == 0) {
            ca y3 = ca.y(i11, this.f4395c);
            arrayList.add(u61.D(0));
            if (y3.O(1)) {
                arrayList.add(u61.D(1));
            }
            if (y3.O(2)) {
                arrayList.add(u61.D(2));
                return;
            }
            return;
        }
        m0 g7 = m0.g(i11);
        arrayList.add(u61.D(0));
        if (!g7.k(j10).f5002a[1].isEmpty()) {
            arrayList.add(u61.D(1));
        }
        if (!g7.k(j10).f5002a[2].isEmpty()) {
            arrayList.add(u61.D(2));
        }
    }
}
