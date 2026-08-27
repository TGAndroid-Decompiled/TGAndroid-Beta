package hh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class i1 extends m41 {
    static {
        m41.setup(new i1());
    }

    public static n41 a(int i10, g1 g1Var) {
        n41 n41VarJ = n41.J(i1.class);
        n41VarJ.f30853u = 1;
        n41VarJ.f30857z = i10;
        n41VarJ.G = g1Var;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        String strJ1;
        j1 j1Var = (j1) view;
        g1 g1Var = (g1) n41Var.G;
        int i10 = n41Var.f30857z;
        Integer[] numArr = new Integer[1];
        j1Var.f9517s = i10 == 0;
        org.telegram.ui.Components.n9 n9Var = j1Var.d;
        TextView textView = j1Var.f9513e;
        gh.y1 y1Var = j1Var.f9512c;
        j1Var.v = g1Var;
        if (i10 == 0) {
            y1Var.d(null);
            y1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = g1Var.f9293c;
            textView.setText(stargiftattributemodel.name);
            j1.a(j1Var, stargiftattributemodel.document, 80, n41Var.G, true);
            n9Var.setColorFilter(null);
            y1Var.f7672w = org.telegram.ui.ActionBar.g6.Oh;
            strJ1 = i5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = g1Var.f9291a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = g1Var.f9292b;
            y1Var.d(stargiftattributebackdrop);
            y1Var.e(stargiftattributepattern);
            y1Var.f7672w = org.telegram.ui.ActionBar.g6.f23053d6;
            textView.setText(stargiftattributebackdrop.name);
            j1.a(j1Var, stargiftattributepattern.document, 48, n41Var.G, false);
            n9Var.setColorFilter(new PorterDuffColorFilter(i0.b.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            strJ1 = i5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = g1Var.f9291a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = g1Var.f9292b;
            y1Var.d(stargiftattributebackdrop2);
            y1Var.e(stargiftattributepattern2);
            y1Var.f7672w = org.telegram.ui.ActionBar.g6.f23053d6;
            textView.setText(stargiftattributepattern2.name);
            j1.a(j1Var, stargiftattributepattern2.document, 64, n41Var.G, false);
            n9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            strJ1 = i5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            strJ1 = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, j1Var.f9510a) : -1);
        j1Var.f9514f.setText(strJ1);
        j1Var.h = numArr[0];
        j1Var.b();
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new j1(context, c6Var);
    }
}
