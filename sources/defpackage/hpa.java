package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class hpa extends b6c {
    static {
        b6c.h(new b6c());
    }

    public static c6c i(int i, gpa gpaVar) {
        c6c K = c6c.K(hpa.class);
        K.v = 1;
        K.A = i;
        K.H = gpaVar;
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        String str;
        ipa ipaVar = (ipa) view;
        gpa gpaVar = (gpa) c6cVar.H;
        int i = c6cVar.A;
        Integer[] numArr = new Integer[1];
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ipaVar.s = z2;
        bf0 bf0Var = ipaVar.d;
        TextView textView = ipaVar.e;
        lx4 lx4Var = ipaVar.c;
        ipaVar.w = gpaVar;
        if (i == 0) {
            lx4Var.d(null);
            lx4Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = gpaVar.c;
            textView.setText(stargiftattributemodel.name);
            ipaVar.b(80, c6cVar.H, stargiftattributemodel.document, true);
            bf0Var.setColorFilter(null);
            lx4Var.y = cmb.Ei;
            str = wsa.z1(stargiftattributemodel.rarity, numArr);
        } else if (i == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = gpaVar.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = gpaVar.b;
            lx4Var.d(stargiftattributebackdrop);
            lx4Var.e(stargiftattributepattern);
            lx4Var.y = cmb.c6;
            textView.setText(stargiftattributebackdrop.name);
            ipaVar.b(48, c6cVar.H, stargiftattributepattern.document, false);
            bf0Var.setColorFilter(new PorterDuffColorFilter(on2.p(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = wsa.z1(stargiftattributebackdrop.rarity, numArr);
        } else if (i == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = gpaVar.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = gpaVar.b;
            lx4Var.d(stargiftattributebackdrop2);
            lx4Var.e(stargiftattributepattern2);
            lx4Var.y = cmb.c6;
            textView.setText(stargiftattributepattern2.name);
            ipaVar.b(64, c6cVar.H, stargiftattributepattern2.document, false);
            bf0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = wsa.z1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i == 0) {
            anb.X(textView, cmb.i5, ipaVar.a);
        } else {
            anb.q(textView);
            textView.setTextColor(-1);
        }
        ipaVar.f.setText(str);
        ipaVar.h = numArr[0];
        ipaVar.a();
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ipa(context, ylbVar);
    }
}
