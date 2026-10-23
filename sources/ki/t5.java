package ki;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.j80;
public final class t5 implements View.OnClickListener {
    public final int f15591a;
    public final c6 f15592b;

    public t5(c6 c6Var, int i10) {
        this.f15591a = i10;
        this.f15592b = c6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f15591a) {
            case 0:
                c6 c6Var = this.f15592b;
                a aVar = c6Var.f15245x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f15143f;
                    aVar.f15143f = z10;
                    ((CheckBoxBase) c6Var.e.f1569b).f(-1, z10, true);
                    z5 z5Var = c6Var.f15246y;
                    if (z5Var != null) {
                        a aVar2 = c6Var.f15245x;
                        boolean z11 = aVar2.f15143f;
                        w3 w3Var = ((e3) z5Var).f15303a;
                        aVar2.f15143f = z11;
                        h2 h2Var = w3Var.K3;
                        if (h2Var != null) {
                            h2Var.d();
                            w3Var.K3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                c6 c6Var2 = this.f15592b;
                z5 z5Var2 = c6Var2.f15246y;
                if (z5Var2 != null) {
                    a aVar3 = c6Var2.f15245x;
                    w3 w3Var2 = ((e3) z5Var2).f15303a;
                    if (aVar3 != null && (aVar3.f15141b instanceof TL_iv.pageBlockPreformatted) && (set = mi.k.f17024a.f17046x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f15141b;
                        j80 M = w3Var2.f15656i3.M(view);
                        M.W(k6.c0(AndroidUtilities.dp(3.0f), k6.w0(k6.f21183d6, w3Var2.f15654h3)));
                        M.Z = true;
                        M.X = AndroidUtilities.dp(350.0f);
                        M.i(new o2(w3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            M.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        M.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            M.i(new ig.d2(w3Var2, aVar3, str, 5), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        M.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
