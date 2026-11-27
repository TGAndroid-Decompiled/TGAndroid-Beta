package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wy8 extends j79 {
    public final pz8 c;

    public wy8(pz8 pz8Var) {
        this.c = pz8Var;
    }

    @Override
    public final int b() {
        return this.c.s;
    }

    @Override
    public final int d(int i) {
        pz8 pz8Var = this.c;
        az8 az8Var = (az8) pz8Var.n.get(pz8Var.f(i));
        if (az8Var.b != null && i == az8Var.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String str;
        int i2;
        pz8 pz8Var = this.c;
        az8 az8Var = (az8) pz8Var.n.get(pz8Var.f(i));
        int i3 = f89Var.f;
        View view = f89Var.a;
        int i4 = 1;
        int i5 = 0;
        if (i3 == 0) {
            zy8 zy8Var = (zy8) view;
            String str2 = az8Var.b;
            if (pz8Var.x || az8Var.a != 2) {
                i4 = 0;
            }
            TextView textView = zy8Var.b;
            TextView textView2 = zy8Var.a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(zy8Var.c.y);
            if (i4 != 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            int L = hl.L(15.0f);
            if (i4 != 0) {
                i5 = hl.L(6.0f) + hl.L(20.0f) + hl.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
            }
            int i6 = L + i5;
            if (layoutParams.rightMargin != i6) {
                layoutParams.rightMargin = i6;
                textView2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ArrayList arrayList = az8Var.c;
        int i7 = i - az8Var.d;
        if (az8Var.b == null) {
            i4 = 0;
        }
        ((xy8) view).set((TLRPC.Document) arrayList.get(i7 - i4));
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View xy8Var;
        pz8 pz8Var = this.c;
        if (i == 0) {
            xy8Var = new zy8(pz8Var, viewGroup.getContext());
            xy8Var.setLayoutParams(new r79(-1, hl.L(44.0f)));
        } else {
            xy8Var = new xy8(viewGroup.getContext(), pz8Var.a);
            xy8Var.setLayoutParams(new r79(-1, -2));
        }
        return new f89(xy8Var);
    }
}
