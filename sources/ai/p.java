package ai;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class p extends s4.h0 {
    public final x0 f1616c;

    public p(x0 x0Var) {
        this.f1616c = x0Var;
    }

    @Override
    public final int h() {
        return this.f1616c.f1976s;
    }

    @Override
    public final int j(int i10) {
        x0 x0Var = this.f1616c;
        u uVar = (u) x0Var.f1974n.get(x0Var.f(i10));
        if (uVar.f1940b != null && i10 == uVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        int i11;
        x0 x0Var = this.f1616c;
        u uVar = (u) x0Var.f1974n.get(x0Var.f(i10));
        int i12 = e1Var.f47738f;
        View view = e1Var.f47735a;
        int i13 = 1;
        int i14 = 0;
        if (i12 == 0) {
            t tVar = (t) view;
            String str2 = uVar.f1940b;
            if (x0Var.f1977w || uVar.f1939a != 2) {
                i13 = 0;
            }
            TextView textView = tVar.f1676b;
            TextView textView2 = tVar.f1675a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(tVar.f1677c.f1978x);
            if (i13 != 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            int dp = AndroidUtilities.dp(15.0f);
            if (i13 != 0) {
                i14 = AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
            }
            int i15 = dp + i14;
            if (layoutParams.rightMargin != i15) {
                layoutParams.rightMargin = i15;
                textView2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ArrayList arrayList = uVar.f1941c;
        int i16 = i10 - uVar.d;
        if (uVar.f1940b == null) {
            i13 = 0;
        }
        ((q) view).set((TLRPC.Document) arrayList.get(i16 - i13));
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View qVar;
        x0 x0Var = this.f1616c;
        if (i10 == 0) {
            qVar = new t(x0Var, viewGroup.getContext());
            qVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            qVar = new q(viewGroup.getContext(), x0Var.f1970a);
            qVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.e1(qVar);
    }
}
