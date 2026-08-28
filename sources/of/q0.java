package of;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.e00;
public abstract class q0 extends c {
    public final Context G;
    public final b6 H;
    public boolean I;

    public q0(Context context, b6 b6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.I = false;
        this.G = context;
        this.H = b6Var;
        new e00(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i9) {
        ArrayList arrayList = this.f19256r;
        if (!arrayList.isEmpty()) {
            i9--;
        }
        if (i9 >= 0 && i9 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i9);
        }
        if (!this.F) {
            int size = i9 - arrayList.size();
            if (!arrayList.isEmpty()) {
                size--;
            }
            if (size >= 0) {
                ArrayList arrayList2 = this.f19257s;
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
        int i9;
        ArrayList arrayList = this.f19256r;
        if (!arrayList.isEmpty()) {
            i9 = arrayList.size() + 1;
        } else {
            i9 = 0;
        }
        if (!this.I) {
            if (this.F) {
                return i9 + 3;
            }
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f19257s;
            if (!isEmpty && !arrayList2.isEmpty()) {
                i9++;
            }
            return arrayList2.size() + i9;
        }
        return i9;
    }

    @Override
    public final int j(int i9) {
        ArrayList arrayList = this.f19256r;
        if ((i9 == 0 || i9 == arrayList.size() + 1) && !arrayList.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i11;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = true;
        ArrayList arrayList = this.f19256r;
        if (i12 == 0) {
            if (!arrayList.isEmpty()) {
                i10 = i9 - 1;
            } else {
                i10 = i9;
            }
            if (i10 >= 0 && i10 < arrayList.size()) {
                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
                i11 = 2;
            } else {
                if (!this.F) {
                    int size = i10 - arrayList.size();
                    if (!this.f19255n && !arrayList.isEmpty()) {
                        size--;
                    }
                    i11 = size;
                    if (i11 >= 0) {
                        ArrayList arrayList2 = this.f19257s;
                        if (i11 < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i11);
                        }
                    }
                }
                tL_messageMediaVenue = null;
                i11 = i9;
            }
            u4 u4Var = (u4) view;
            if (i9 == h() - 1 || (!this.f19255n && !arrayList.isEmpty() && i9 == arrayList.size())) {
                z10 = false;
            }
            u4Var.b(tL_messageMediaVenue, i11, z10, false);
        } else if (i12 == 1) {
            if (i9 == 0 && !arrayList.isEmpty()) {
                ((v3) view).setText(LocaleController.getString(R.string.LocationOnMap));
            } else {
                ((v3) view).setText(LocaleController.getString(R.string.NearbyVenue));
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View v3Var;
        b6 b6Var = this.H;
        Context context = this.G;
        if (i9 == 0) {
            v3Var = new u4(context, b6Var);
        } else {
            v3Var = new v3(context, b6Var);
        }
        return new f2.q1(v3Var);
    }
}
