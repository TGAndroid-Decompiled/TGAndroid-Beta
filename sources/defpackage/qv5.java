package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qv5 extends LinearLayout {
    public boolean a;
    public final wv5 b;

    public qv5(wv5 wv5Var, Context context) {
        super(context);
        this.b = wv5Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        wv5 wv5Var = this.b;
        ArrayList arrayList = wv5Var.s1;
        if (wv5Var.v1 == 0) {
            int size2 = View.MeasureSpec.getSize(i);
            int L = gm.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) wv5Var.p1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = wv5Var.w1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, wv5Var.w1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (wv5Var.w1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(wv5Var.w1);
                        arrayList.add(size, wv5Var.w1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
