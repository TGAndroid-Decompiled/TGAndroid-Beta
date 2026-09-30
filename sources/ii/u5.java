package ii;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b80;
public final class u5 implements View.OnClickListener {
    public final int f11670a;
    public final e6 f11671b;

    public u5(e6 e6Var, int i10) {
        this.f11670a = i10;
        this.f11671b = e6Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f11670a) {
            case 0:
                e6 e6Var = this.f11671b;
                a aVar = e6Var.f11368x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f11207f;
                    aVar.f11207f = z10;
                    ((CheckBoxBase) e6Var.e.f4429b).f(-1, z10, true);
                    b6 b6Var = e6Var.f11369y;
                    if (b6Var != null) {
                        a aVar2 = e6Var.f11368x;
                        boolean z11 = aVar2.f11207f;
                        x3 x3Var = ((f3) b6Var).f11377a;
                        aVar2.f11207f = z11;
                        i2 i2Var = x3Var.Q3;
                        if (i2Var != null) {
                            i2Var.d();
                            x3Var.Q3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                e6 e6Var2 = this.f11671b;
                b6 b6Var2 = e6Var2.f11369y;
                if (b6Var2 != null) {
                    a aVar3 = e6Var2.f11368x;
                    x3 x3Var2 = ((f3) b6Var2).f11377a;
                    if (aVar3 != null && (aVar3.f11205b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f11205b;
                        b80 F = x3Var2.f11748o3.F(view);
                        F.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, x3Var2.f11746n3)));
                        F.Z = true;
                        F.X = AndroidUtilities.dp(350.0f);
                        F.i(new p2(x3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            F.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        F.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            F.i(new gg.t(x3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        F.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
