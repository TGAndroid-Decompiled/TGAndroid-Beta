package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class dra extends a8c {
    static {
        a8c.h(new a8c());
    }

    public static b8c i(int i, cra craVar) {
        b8c K = b8c.K(dra.class);
        K.v = 1;
        K.A = i;
        K.H = craVar;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        String str;
        era eraVar = (era) view;
        cra craVar = (cra) b8cVar.H;
        int i = b8cVar.A;
        Integer[] numArr = new Integer[1];
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        eraVar.s = z2;
        de0 de0Var = eraVar.d;
        TextView textView = eraVar.e;
        px4 px4Var = eraVar.c;
        eraVar.w = craVar;
        if (i == 0) {
            px4Var.d(null);
            px4Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = craVar.c;
            textView.setText(stargiftattributemodel.name);
            eraVar.b(80, b8cVar.H, stargiftattributemodel.document, true);
            de0Var.setColorFilter(null);
            px4Var.y = aob.Fi;
            str = wua.A1(stargiftattributemodel.rarity, numArr);
        } else if (i == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = craVar.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = craVar.b;
            px4Var.d(stargiftattributebackdrop);
            px4Var.e(stargiftattributepattern);
            px4Var.y = aob.d6;
            textView.setText(stargiftattributebackdrop.name);
            eraVar.b(48, b8cVar.H, stargiftattributepattern.document, false);
            de0Var.setColorFilter(new PorterDuffColorFilter(vm2.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = wua.A1(stargiftattributebackdrop.rarity, numArr);
        } else if (i == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = craVar.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = craVar.b;
            px4Var.d(stargiftattributebackdrop2);
            px4Var.e(stargiftattributepattern2);
            px4Var.y = aob.d6;
            textView.setText(stargiftattributepattern2.name);
            eraVar.b(64, b8cVar.H, stargiftattributepattern2.document, false);
            de0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = wua.A1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i == 0) {
            yob.X(textView, aob.j5, eraVar.a);
        } else {
            yob.q(textView);
            textView.setTextColor(-1);
        }
        eraVar.f.setText(str);
        eraVar.h = numArr[0];
        eraVar.a();
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new era(context, vnbVar);
    }
}
