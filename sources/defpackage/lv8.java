package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lv8 extends w39 {
    public final ew8 c;

    public lv8(ew8 ew8Var) {
        this.c = ew8Var;
    }

    @Override
    public final int b() {
        return this.c.s;
    }

    @Override
    public final int d(int i) {
        ew8 ew8Var = this.c;
        pv8 pv8Var = (pv8) ew8Var.n.get(ew8Var.f(i));
        if (pv8Var.b != null && i == pv8Var.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        String str;
        int i2;
        ew8 ew8Var = this.c;
        pv8 pv8Var = (pv8) ew8Var.n.get(ew8Var.f(i));
        int i3 = s49Var.f;
        View view = s49Var.a;
        int i4 = 1;
        int i5 = 0;
        if (i3 == 0) {
            ov8 ov8Var = (ov8) view;
            String str2 = pv8Var.b;
            if (ew8Var.x || pv8Var.a != 2) {
                i4 = 0;
            }
            TextView textView = ov8Var.b;
            TextView textView2 = ov8Var.a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(ov8Var.c.y);
            if (i4 != 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            int L = gl.L(15.0f);
            if (i4 != 0) {
                i5 = gl.L(6.0f) + gl.L(20.0f) + gl.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
            }
            int i6 = L + i5;
            if (layoutParams.rightMargin != i6) {
                layoutParams.rightMargin = i6;
                textView2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ArrayList arrayList = pv8Var.c;
        int i7 = i - pv8Var.d;
        if (pv8Var.b == null) {
            i4 = 0;
        }
        ((mv8) view).set((TLRPC.Document) arrayList.get(i7 - i4));
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View mv8Var;
        ew8 ew8Var = this.c;
        if (i == 0) {
            mv8Var = new ov8(ew8Var, viewGroup.getContext());
            mv8Var.setLayoutParams(new e49(-1, gl.L(44.0f)));
        } else {
            mv8Var = new mv8(viewGroup.getContext(), ew8Var.a);
            mv8Var.setLayoutParams(new e49(-1, -2));
        }
        return new s49(mv8Var);
    }
}
