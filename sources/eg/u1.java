package eg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.rl0;
import qh.h5;
import qh.n4;
public final class u1 extends rl0 {
    public final Context f5503c;
    public final ba d;
    public final h5 f5504e;
    public final boolean f5505f;
    public final n4 h;

    public u1(n4 n4Var, Context context, ba baVar, h5 h5Var, boolean z4) {
        this.h = n4Var;
        this.f5503c = context;
        this.d = baVar;
        this.f5504e = h5Var;
        this.f5505f = z4;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f5554p0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f5554p0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        boolean z11;
        n4 n4Var = this.h;
        ArrayList arrayList = n4Var.f5554p0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject.GroupedMessages groupedMessages = n4Var.f5555q0;
            if (groupedMessages != null && (position = groupedMessages.getPosition(messageObject)) != null) {
                if (position.minY != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z4 = z11;
            } else {
                z4 = false;
            }
            MessageObject.GroupedMessages groupedMessages2 = n4Var.f5555q0;
            if (groupedMessages2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            t1Var.X3(messageObject, groupedMessages2, z10, z4, false, false);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        a9.a aVar = this.h.A0;
        Context context = this.f5503c;
        if (i10 == 1) {
            return new f2.m1(new s1(this, context, aVar));
        }
        t1 t1Var = new t1(this, context, UserConfig.selectedAccount, aVar);
        t1Var.K7 = true;
        return new f2.m1(t1Var);
    }
}
