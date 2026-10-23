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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.i80;
public final class t5 implements View.OnClickListener {
    public final int f15531a;
    public final c6 f15532b;

    public t5(c6 c6Var, int i10) {
        this.f15531a = i10;
        this.f15532b = c6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f15531a) {
            case 0:
                c6 c6Var = this.f15532b;
                a aVar = c6Var.f15187x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f15097f;
                    aVar.f15097f = z10;
                    ((CheckBoxBase) c6Var.e.f1512b).f(-1, z10, true);
                    z5 z5Var = c6Var.f15188y;
                    if (z5Var != null) {
                        a aVar2 = c6Var.f15187x;
                        boolean z11 = aVar2.f15097f;
                        w3 w3Var = ((e3) z5Var).f15245a;
                        aVar2.f15097f = z11;
                        h2 h2Var = w3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                            w3Var.H3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                c6 c6Var2 = this.f15532b;
                z5 z5Var2 = c6Var2.f15188y;
                if (z5Var2 != null) {
                    a aVar3 = c6Var2.f15187x;
                    w3 w3Var2 = ((e3) z5Var2).f15245a;
                    if (aVar3 != null && (aVar3.f15095b instanceof TL_iv.pageBlockPreformatted) && (set = mi.k.f16961a.f16983x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f15095b;
                        i80 M = w3Var2.f15592f3.M(view);
                        M.W(h6.c0(AndroidUtilities.dp(3.0f), h6.w0(h6.f20994d6, w3Var2.f15590e3)));
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
                            M.i(new ig.e2(w3Var2, aVar3, str, 5), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
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
