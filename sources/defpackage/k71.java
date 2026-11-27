package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class k71 extends yc8 {
    public d79 a;
    public final w71 b;

    public k71(w71 w71Var) {
        this.b = w71Var;
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        jja jjaVar;
        d79 listView = this.b.getListView();
        int i2 = 0;
        while (true) {
            if (i2 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i2);
                if (RecyclerView.S(childAt) == i && (childAt instanceof jja)) {
                    jjaVar = (jja) childAt;
                    break;
                }
                i2++;
            } else {
                jjaVar = null;
                break;
            }
        }
        if (jjaVar == null) {
            return null;
        }
        int[] iArr = new int[2];
        jjaVar.getLocationInWindow(iArr);
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = this.a;
        ImageReceiver imageReceiver = jjaVar.c;
        fd8Var.a = imageReceiver;
        fd8Var.e = imageReceiver.p();
        fd8Var.k = jjaVar.getScaleX();
        return fd8Var;
    }
}
