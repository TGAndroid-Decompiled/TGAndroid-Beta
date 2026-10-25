package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y4;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.c10;
public abstract class t0 extends c {
    public final Context K;
    public final u6 L;
    public boolean M;

    public t0(Context context, u6 u6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.M = false;
        this.K = context;
        this.L = u6Var;
        new c10(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i10) {
        ArrayList arrayList = this.f14011r;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        if (!this.J) {
            int size = i10 - arrayList.size();
            if (!arrayList.isEmpty()) {
                size--;
            }
            if (size >= 0) {
                ArrayList arrayList2 = this.f14012s;
                if (size < arrayList2.size()) {
                    return (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f14011r;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        if (!this.M) {
            if (this.J) {
                return i10 + 3;
            }
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f14012s;
            if (!isEmpty && !arrayList2.isEmpty()) {
                i10++;
            }
            return arrayList2.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f14011r;
        if ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        int i13 = e1Var.f47738f;
        View view = e1Var.f47735a;
        boolean z10 = true;
        ArrayList arrayList = this.f14011r;
        if (i13 == 0) {
            if (!arrayList.isEmpty()) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (i11 >= 0 && i11 < arrayList.size()) {
                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                i12 = 2;
            } else {
                if (!this.J) {
                    int size = i11 - arrayList.size();
                    if (!this.f14010n && !arrayList.isEmpty()) {
                        size--;
                    }
                    i12 = size;
                    if (i12 >= 0) {
                        ArrayList arrayList2 = this.f14012s;
                        if (i12 < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i12);
                        }
                    }
                }
                tL_messageMediaVenue = null;
                i12 = i10;
            }
            y4 y4Var = (y4) view;
            if (i10 == h() - 1 || (!this.f14010n && !arrayList.isEmpty() && i10 == arrayList.size())) {
                z10 = false;
            }
            y4Var.b(tL_messageMediaVenue, i12, z10, false);
        } else if (i13 == 1) {
            if (i10 == 0 && !arrayList.isEmpty()) {
                ((z3) view).setText(LocaleController.getString(R.string.LocationOnMap));
            } else {
                ((z3) view).setText(LocaleController.getString(R.string.NearbyVenue));
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View z3Var;
        u6 u6Var = this.L;
        Context context = this.K;
        if (i10 == 0) {
            z3Var = new y4(context, u6Var);
        } else {
            z3Var = new z3(context, u6Var);
        }
        return new s4.e1(z3Var);
    }
}
