package dg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ql0;
import ph.j5;
import ph.o4;
public final class w1 extends ql0 {
    public final Context f4843c;
    public final ba d;
    public final j5 e;
    public final boolean f4844f;
    public final o4 h;

    public w1(o4 o4Var, Context context, ba baVar, j5 j5Var, boolean z4) {
        this.h = o4Var;
        this.f4843c = context;
        this.d = baVar;
        this.e = j5Var;
        this.f4844f = z4;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f4358p0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f4358p0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        boolean z11;
        o4 o4Var = this.h;
        ArrayList arrayList = o4Var.f4358p0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject.GroupedMessages groupedMessages = o4Var.f4359q0;
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
            MessageObject.GroupedMessages groupedMessages2 = o4Var.f4359q0;
            if (groupedMessages2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            s1Var.X3(messageObject, groupedMessages2, z10, z4, false, false);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        a9.a aVar = this.h.A0;
        Context context = this.f4843c;
        if (i10 == 1) {
            return new f2.l1(new u1(this, context, aVar));
        }
        v1 v1Var = new v1(this, context, UserConfig.selectedAccount, aVar);
        v1Var.K7 = true;
        return new f2.l1(v1Var);
    }
}
