package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class xea extends ue3 {
    public final yea b5;

    public xea(yea yeaVar, Context context) {
        super(context, true);
        this.b5 = yeaVar;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        yea yeaVar = this.b5;
        ArrayList arrayList = yeaVar.f;
        sca scaVar = yeaVar.s;
        if (scaVar != null && scaVar.getAdapter() == yeaVar) {
            yeaVar.s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((up9) arrayList.get(R)).b;
            }
            return false;
        }
        return false;
    }
}
