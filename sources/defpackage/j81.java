package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class j81 extends jb8 {
    public r59 a;
    public final w81 b;

    public j81(w81 w81Var) {
        this.b = w81Var;
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        sha shaVar;
        r59 listView = this.b.getListView();
        int i2 = 0;
        while (true) {
            if (i2 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i2);
                if (RecyclerView.R(childAt) == i && (childAt instanceof sha)) {
                    shaVar = (sha) childAt;
                    break;
                }
                i2++;
            } else {
                shaVar = null;
                break;
            }
        }
        if (shaVar == null) {
            return null;
        }
        int[] iArr = new int[2];
        shaVar.getLocationInWindow(iArr);
        qb8 qb8Var = new qb8();
        qb8Var.b = iArr[0];
        qb8Var.c = iArr[1];
        qb8Var.d = this.a;
        ImageReceiver imageReceiver = shaVar.c;
        qb8Var.a = imageReceiver;
        qb8Var.e = imageReceiver.p();
        qb8Var.k = shaVar.getScaleX();
        return qb8Var;
    }
}
