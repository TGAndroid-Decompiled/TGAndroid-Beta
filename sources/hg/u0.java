package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.t00;
public abstract class u0 extends c {
    public final Context K;
    public final f6 L;
    public boolean M;

    public u0(Context context, f6 f6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.M = false;
        this.K = context;
        this.L = f6Var;
        new t00(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i10) {
        ArrayList arrayList = this.f10999r;
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
                ArrayList arrayList2 = this.f11000s;
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
        ArrayList arrayList = this.f10999r;
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
            ArrayList arrayList2 = this.f11000s;
            if (!isEmpty && !arrayList2.isEmpty()) {
                i10++;
            }
            return arrayList2.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f10999r;
        if ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        int i13 = c1Var.f45742f;
        View view = c1Var.f45738a;
        boolean z10 = true;
        ArrayList arrayList = this.f10999r;
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
                    if (!this.f10998n && !arrayList.isEmpty()) {
                        size--;
                    }
                    i12 = size;
                    if (i12 >= 0) {
                        ArrayList arrayList2 = this.f11000s;
                        if (i12 < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i12);
                        }
                    }
                }
                tL_messageMediaVenue = null;
                i12 = i10;
            }
            t4 t4Var = (t4) view;
            if (i10 == h() - 1 || (!this.f10998n && !arrayList.isEmpty() && i10 == arrayList.size())) {
                z10 = false;
            }
            t4Var.b(tL_messageMediaVenue, i12, z10, false);
        } else if (i13 == 1) {
            if (i10 == 0 && !arrayList.isEmpty()) {
                ((u3) view).setText(LocaleController.getString(R.string.LocationOnMap));
            } else {
                ((u3) view).setText(LocaleController.getString(R.string.NearbyVenue));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View u3Var;
        f6 f6Var = this.L;
        Context context = this.K;
        if (i10 == 0) {
            u3Var = new t4(context, f6Var);
        } else {
            u3Var = new u3(context, f6Var);
        }
        return new s4.c1(u3Var);
    }
}
