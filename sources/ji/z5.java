package ji;

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
import org.telegram.ui.Components.l80;
public final class z5 implements View.OnClickListener {
    public final int f13719a;
    public final i6 f13720b;

    public z5(i6 i6Var, int i10) {
        this.f13719a = i10;
        this.f13720b = i6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f13719a) {
            case 0:
                i6 i6Var = this.f13720b;
                a aVar = i6Var.f13345x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f13109f;
                    aVar.f13109f = z10;
                    ((CheckBoxBase) i6Var.e.f6641b).f(-1, z10, true);
                    f6 f6Var = i6Var.f13346y;
                    if (f6Var != null) {
                        a aVar2 = i6Var.f13345x;
                        boolean z11 = aVar2.f13109f;
                        x3 x3Var = ((f3) f6Var).f13271a;
                        aVar2.f13109f = z11;
                        h2 h2Var = x3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                            x3Var.H3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                i6 i6Var2 = this.f13720b;
                f6 f6Var2 = i6Var2.f13346y;
                if (f6Var2 != null) {
                    a aVar3 = i6Var2.f13345x;
                    x3 x3Var2 = ((f3) f6Var2).f13271a;
                    if (aVar3 != null && (aVar3.f13107b instanceof TL_iv.pageBlockPreformatted) && (set = li.k.f14761a.f14780x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f13107b;
                        l80 R = x3Var2.f13630f3.R(view);
                        R.W(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, x3Var2.f13628e3)));
                        R.Z = true;
                        R.X = AndroidUtilities.dp(350.0f);
                        R.i(new o2(x3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            R.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        R.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            R.i(new hg.t(x3Var2, aVar3, str, 18), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        R.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
