package bg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import nh.e6;
import nh.f5;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.il0;
public final class y1 extends il0 {
    public final Context f2614c;
    public final ga d;
    public final e6 f2615e;
    public final boolean f2616f;
    public final f5 h;

    public y1(f5 f5Var, Context context, ga gaVar, e6 e6Var, boolean z10) {
        this.h = f5Var;
        this.f2614c = context;
        this.d = gaVar;
        this.f2615e = e6Var;
        this.f2616f = z10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f2149o0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f2149o0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        f5 f5Var = this.h;
        ArrayList arrayList = f5Var.f2149o0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject.GroupedMessages groupedMessages = f5Var.f2150p0;
            if (groupedMessages != null && (position = groupedMessages.getPosition(messageObject)) != null) {
                if (position.minY != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            MessageObject.GroupedMessages groupedMessages2 = f5Var.f2150p0;
            if (groupedMessages2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            s1Var.X3(messageObject, groupedMessages2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        c2 c2Var = this.h.f2160z0;
        Context context = this.f2614c;
        if (i10 == 1) {
            return new f2.n1(new w1(this, context, c2Var));
        }
        x1 x1Var = new x1(this, context, UserConfig.selectedAccount, c2Var);
        x1Var.J7 = true;
        return new f2.n1(x1Var);
    }
}
