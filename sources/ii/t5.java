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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.n70;
public final class t5 implements View.OnClickListener {
    public final int f11633a;
    public final d6 f11634b;

    public t5(d6 d6Var, int i10) {
        this.f11633a = i10;
        this.f11634b = d6Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f11633a) {
            case 0:
                d6 d6Var = this.f11634b;
                a aVar = d6Var.f11342x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f11203f;
                    aVar.f11203f = z10;
                    ((CheckBoxBase) d6Var.e.f4608b).f(-1, z10, true);
                    a6 a6Var = d6Var.f11343y;
                    if (a6Var != null) {
                        a aVar2 = d6Var.f11342x;
                        boolean z11 = aVar2.f11203f;
                        w3 w3Var = ((e3) a6Var).f11354a;
                        aVar2.f11203f = z11;
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
                d6 d6Var2 = this.f11634b;
                a6 a6Var2 = d6Var2.f11343y;
                if (a6Var2 != null) {
                    a aVar3 = d6Var2.f11342x;
                    w3 w3Var2 = ((e3) a6Var2).f11354a;
                    if (aVar3 != null && (aVar3.f11201b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f11201b;
                        n70 D = w3Var2.f11711h3.D(view);
                        D.W(i6.b0(AndroidUtilities.dp(3.0f), i6.v0(i6.f18836d6, w3Var2.f11709g3)));
                        D.Z = true;
                        D.X = AndroidUtilities.dp(350.0f);
                        D.i(new o2(w3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            D.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        D.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            D.i(new gg.t(w3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        D.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
