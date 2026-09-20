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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.v70;
public final class t5 implements View.OnClickListener {
    public final int f11637a;
    public final d6 f11638b;

    public t5(d6 d6Var, int i10) {
        this.f11637a = i10;
        this.f11638b = d6Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f11637a) {
            case 0:
                d6 d6Var = this.f11638b;
                a aVar = d6Var.f11346x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f11207f;
                    aVar.f11207f = z10;
                    ((CheckBoxBase) d6Var.e.f4614b).f(-1, z10, true);
                    a6 a6Var = d6Var.f11347y;
                    if (a6Var != null) {
                        a aVar2 = d6Var.f11346x;
                        boolean z11 = aVar2.f11207f;
                        w3 w3Var = ((e3) a6Var).f11358a;
                        aVar2.f11207f = z11;
                        h2 h2Var = w3Var.J3;
                        if (h2Var != null) {
                            h2Var.d();
                            w3Var.J3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                d6 d6Var2 = this.f11638b;
                a6 a6Var2 = d6Var2.f11347y;
                if (a6Var2 != null) {
                    a aVar3 = d6Var2.f11346x;
                    w3 w3Var2 = ((e3) a6Var2).f11358a;
                    if (aVar3 != null && (aVar3.f11205b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f11205b;
                        v70 F = w3Var2.f11715h3.F(view);
                        F.W(j6.b0(AndroidUtilities.dp(3.0f), j6.v0(j6.f19094d6, w3Var2.f11713g3)));
                        F.Z = true;
                        F.X = AndroidUtilities.dp(350.0f);
                        F.i(new o2(w3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
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
                            F.i(new gg.t(w3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
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
