package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rt5 extends LinearLayout {
    public boolean a;
    public final xt5 b;

    public rt5(xt5 xt5Var, Context context) {
        super(context);
        this.b = xt5Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        xt5 xt5Var = this.b;
        ArrayList arrayList = xt5Var.s1;
        if (xt5Var.v1 == 0) {
            int size2 = View.MeasureSpec.getSize(i);
            int L = gl.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) xt5Var.p1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = xt5Var.w1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, xt5Var.w1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (xt5Var.w1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(xt5Var.w1);
                        arrayList.add(size, xt5Var.w1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
