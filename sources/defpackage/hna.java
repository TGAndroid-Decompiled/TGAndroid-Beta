package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class hna extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(int i, gna gnaVar) {
        c4c K = c4c.K(hna.class);
        K.v = 1;
        K.A = i;
        K.H = gnaVar;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        String str;
        ina inaVar = (ina) view;
        gna gnaVar = (gna) c4cVar.H;
        int i = c4cVar.A;
        Integer[] numArr = new Integer[1];
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        inaVar.s = z2;
        be0 be0Var = inaVar.d;
        TextView textView = inaVar.e;
        kv4 kv4Var = inaVar.c;
        inaVar.w = gnaVar;
        if (i == 0) {
            kv4Var.d(null);
            kv4Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = gnaVar.c;
            textView.setText(stargiftattributemodel.name);
            inaVar.b(80, c4cVar.H, stargiftattributemodel.document, true);
            be0Var.setColorFilter(null);
            kv4Var.y = bkb.Ei;
            str = vqa.z1(stargiftattributemodel.rarity, numArr);
        } else if (i == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = gnaVar.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = gnaVar.b;
            kv4Var.d(stargiftattributebackdrop);
            kv4Var.e(stargiftattributepattern);
            kv4Var.y = bkb.c6;
            textView.setText(stargiftattributebackdrop.name);
            inaVar.b(48, c4cVar.H, stargiftattributepattern.document, false);
            be0Var.setColorFilter(new PorterDuffColorFilter(bm2.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = vqa.z1(stargiftattributebackdrop.rarity, numArr);
        } else if (i == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = gnaVar.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = gnaVar.b;
            kv4Var.d(stargiftattributebackdrop2);
            kv4Var.e(stargiftattributepattern2);
            kv4Var.y = bkb.c6;
            textView.setText(stargiftattributepattern2.name);
            inaVar.b(64, c4cVar.H, stargiftattributepattern2.document, false);
            be0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = vqa.z1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i == 0) {
            zkb.X(textView, bkb.i5, inaVar.a);
        } else {
            zkb.q(textView);
            textView.setTextColor(-1);
        }
        inaVar.f.setText(str);
        inaVar.h = numArr[0];
        inaVar.a();
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ina(context, wjbVar);
    }
}
