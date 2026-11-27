package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class oia extends of3 {
    public final pia b5;

    public oia(pia piaVar, Context context) {
        super(context, true);
        this.b5 = piaVar;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        pia piaVar = this.b5;
        ArrayList arrayList = piaVar.f;
        jga jgaVar = piaVar.s;
        if (jgaVar != null && jgaVar.getAdapter() == piaVar) {
            piaVar.s.getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S < arrayList.size()) {
                return ((mt9) arrayList.get(S)).b;
            }
            return false;
        }
        return false;
    }
}
