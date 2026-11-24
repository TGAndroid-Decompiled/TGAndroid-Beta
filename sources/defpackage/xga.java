package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class xga extends hg3 {
    public final yga b5;

    public xga(yga ygaVar, Context context) {
        super(context, true);
        this.b5 = ygaVar;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        yga ygaVar = this.b5;
        ArrayList arrayList = ygaVar.f;
        sea seaVar = ygaVar.s;
        if (seaVar != null && seaVar.getAdapter() == ygaVar) {
            ygaVar.s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((vr9) arrayList.get(R)).b;
            }
            return false;
        }
        return false;
    }
}
