package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ei.bc;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.i71;
import w7.z5;
public final class g1 extends o2 {
    public final CharSequence f12933a;
    public final ArrayList f12934b;
    public final int f12935c;
    public final int d;
    public final int e;
    public bc f12936f;
    public hi.t h;
    public i71 f12937n;
    public boolean f12938r;

    public g1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f12933a = charSequence;
        this.f12934b = arrayList;
        this.f12935c = i10;
        this.d = i11;
        this.e = i12;
        this.f12938r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f12934b;
        if (arrayList.size() != 1 || ((d1) arrayList.get(0)).f12892a != 0 || ((d1) arrayList.get(0)).f12893b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f12934b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((d1) i2.o1.i(1, arrayList)).f12893b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f12933a);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21126a7, frameLayout, null);
        i71 i71Var = new i71(this, new hg.o(this, 9), new e1.c(this, 21), null);
        this.f12937n = i71Var;
        i71Var.t1();
        this.actionBar.setAdaptiveBackground(this.f12937n);
        frameLayout.addView(this.f12937n, z5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        hi.t tVar = this.h;
        if (tVar != null) {
            tVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f12938r) {
            ArrayList arrayList = this.f12934b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                bc bcVar = this.f12936f;
                if (bcVar != null) {
                    bcVar.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        super.onThemeColorsChanged();
        try {
            if (this.f12937n != null) {
                for (int i11 = 0; i11 < this.f12937n.getChildCount(); i11++) {
                    View childAt = this.f12937n.getChildAt(i11);
                    if ((childAt instanceof w8) && ((w8) childAt).f23916b == -1) {
                        if (this.f12938r) {
                            i10 = k6.f21220f6;
                        } else {
                            i10 = k6.f21201e6;
                        }
                        r6.i(i10, childAt, null);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
