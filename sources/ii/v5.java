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
import org.telegram.ui.Components.p80;
public final class v5 implements View.OnClickListener {
    public final int f12752a;
    public final f6 f12753b;

    public v5(f6 f6Var, int i10) {
        this.f12752a = i10;
        this.f12753b = f6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f12752a) {
            case 0:
                f6 f6Var = this.f12753b;
                a aVar = f6Var.f12423x;
                if (aVar != null && aVar.f12235e) {
                    boolean z10 = !aVar.f12236f;
                    aVar.f12236f = z10;
                    ((CheckBoxBase) f6Var.f12417e.f4802b).f(-1, z10, true);
                    c6 c6Var = f6Var.f12424y;
                    if (c6Var != null) {
                        a aVar2 = f6Var.f12423x;
                        boolean z11 = aVar2.f12236f;
                        x3 x3Var = ((f3) c6Var).f12410a;
                        aVar2.f12236f = z11;
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
                f6 f6Var2 = this.f12753b;
                c6 c6Var2 = f6Var2.f12424y;
                if (c6Var2 != null) {
                    a aVar3 = f6Var2.f12423x;
                    x3 x3Var2 = ((f3) c6Var2).f12410a;
                    if (aVar3 != null && (aVar3.f12233b instanceof TL_iv.pageBlockPreformatted) && (set = li.k.f15659a.f15680x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f12233b;
                        p80 J = x3Var2.f12808f3.J(view);
                        J.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, x3Var2.f12806e3)));
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
