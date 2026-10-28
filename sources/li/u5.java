package li;

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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.l80;
public final class u5 implements View.OnClickListener {
    public final int f17533a;
    public final d6 f17534b;

    public u5(d6 d6Var, int i10) {
        this.f17533a = i10;
        this.f17534b = d6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f17533a) {
            case 0:
                d6 d6Var = this.f17534b;
                a aVar = d6Var.f17201x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f17055f;
                    aVar.f17055f = z10;
                    ((CheckBoxBase) d6Var.e.f4466b).f(-1, z10, true);
                    a6 a6Var = d6Var.f17202y;
                    if (a6Var != null) {
                        a aVar2 = d6Var.f17201x;
                        boolean z11 = aVar2.f17055f;
                        v3 v3Var = ((d3) a6Var).f17188a;
                        aVar2.f17055f = z11;
                        f2 f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
                            v3Var.R3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                d6 d6Var2 = this.f17534b;
                a6 a6Var2 = d6Var2.f17202y;
                if (a6Var2 != null) {
                    a aVar3 = d6Var2.f17201x;
                    v3 v3Var2 = ((d3) a6Var2).f17188a;
                    if (aVar3 != null && (aVar3.f17053b instanceof TL_iv.pageBlockPreformatted) && (set = ni.k.f18886a.f18905x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f17053b;
                        l80 P = v3Var2.f17556p3.P(view);
                        P.W(y6.c0(AndroidUtilities.dp(3.0f), y6.w0(y6.f23357d6, v3Var2.f17554o3)));
                        P.Z = true;
                        P.X = AndroidUtilities.dp(350.0f);
                        P.i(new m2(v3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            P.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        P.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            P.i(new jg.f1(v3Var2, aVar3, str, 6), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        P.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
