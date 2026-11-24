package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mx8 extends y59 {
    public final gy8 c;

    public mx8(gy8 gy8Var) {
        this.c = gy8Var;
    }

    @Override
    public final int b() {
        return this.c.s;
    }

    @Override
    public final int d(int i) {
        gy8 gy8Var = this.c;
        qx8 qx8Var = (qx8) gy8Var.n.get(gy8Var.f(i));
        if (qx8Var.b != null && i == qx8Var.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        String str;
        int i2;
        gy8 gy8Var = this.c;
        qx8 qx8Var = (qx8) gy8Var.n.get(gy8Var.f(i));
        int i3 = u69Var.f;
        View view = u69Var.a;
        int i4 = 1;
        int i5 = 0;
        if (i3 == 0) {
            px8 px8Var = (px8) view;
            String str2 = qx8Var.b;
            if (gy8Var.x || qx8Var.a != 2) {
                i4 = 0;
            }
            TextView textView = px8Var.b;
            TextView textView2 = px8Var.a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(px8Var.c.y);
            if (i4 != 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            int L = gm.L(15.0f);
            if (i4 != 0) {
                i5 = gm.L(6.0f) + gm.L(20.0f) + gm.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
            }
            int i6 = L + i5;
            if (layoutParams.rightMargin != i6) {
                layoutParams.rightMargin = i6;
                textView2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ArrayList arrayList = qx8Var.c;
        int i7 = i - qx8Var.d;
        if (qx8Var.b == null) {
            i4 = 0;
        }
        ((nx8) view).set((TLRPC.Document) arrayList.get(i7 - i4));
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View nx8Var;
        gy8 gy8Var = this.c;
        if (i == 0) {
            nx8Var = new px8(gy8Var, viewGroup.getContext());
            nx8Var.setLayoutParams(new g69(-1, gm.L(44.0f)));
        } else {
            nx8Var = new nx8(viewGroup.getContext(), gy8Var.a);
            nx8Var.setLayoutParams(new g69(-1, -2));
        }
        return new u69(nx8Var);
    }
}
