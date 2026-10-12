package ii;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.s80;
public final class u5 implements View.OnClickListener {
    public final int f12735a;
    public final e6 f12736b;

    public u5(e6 e6Var, int i10) {
        this.f12735a = i10;
        this.f12736b = e6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f12735a) {
            case 0:
                e6 e6Var = this.f12736b;
                a aVar = e6Var.f12409x;
                if (aVar != null && aVar.f12234e) {
                    boolean z10 = !aVar.f12235f;
                    aVar.f12235f = z10;
                    ((CheckBoxBase) e6Var.f12403e.f4801b).f(-1, z10, true);
                    b6 b6Var = e6Var.f12410y;
                    if (b6Var != null) {
                        a aVar2 = e6Var.f12409x;
                        boolean z11 = aVar2.f12235f;
                        x3 x3Var = ((f3) b6Var).f12419a;
                        aVar2.f12235f = z11;
                        i2 i2Var = x3Var.H3;
                        if (i2Var != null) {
                            i2Var.d();
                            x3Var.H3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                e6 e6Var2 = this.f12736b;
                b6 b6Var2 = e6Var2.f12410y;
                if (b6Var2 != null) {
                    a aVar3 = e6Var2.f12409x;
                    x3 x3Var2 = ((f3) b6Var2).f12419a;
                    if (aVar3 != null && (aVar3.f12232b instanceof TL_iv.pageBlockPreformatted) && (set = ki.k.f14892a.f14913x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f12232b;
                        s80 J = x3Var2.f12807f3.J(view);
                        J.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, x3Var2.f12805e3)));
                        J.Z = true;
                        J.X = AndroidUtilities.dp(350.0f);
                        J.i(new p2(x3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            J.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        J.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            J.i(new gg.t(x3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        J.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
