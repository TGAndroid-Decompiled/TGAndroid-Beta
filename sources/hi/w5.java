package hi;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
import org.telegram.ui.Components.w70;
public final class w5 implements View.OnClickListener {
    public final int f9929a;
    public final g6 f9930b;

    public w5(g6 g6Var, int i10) {
        this.f9929a = i10;
        this.f9930b = g6Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f9929a) {
            case 0:
                g6 g6Var = this.f9930b;
                a aVar = g6Var.f9626x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f9423f;
                    aVar.f9423f = z10;
                    ((CheckBoxBase) g6Var.e.f3253b).f(-1, z10, true);
                    d6 d6Var = g6Var.f9627y;
                    if (d6Var != null) {
                        a aVar2 = g6Var.f9626x;
                        boolean z11 = aVar2.f9423f;
                        z3 z3Var = ((h3) d6Var).f9636a;
                        aVar2.f9423f = z11;
                        k2 k2Var = z3Var.J3;
                        if (k2Var != null) {
                            k2Var.d();
                            z3Var.J3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                g6 g6Var2 = this.f9930b;
                d6 d6Var2 = g6Var2.f9627y;
                if (d6Var2 != null) {
                    a aVar3 = g6Var2.f9626x;
                    z3 z3Var2 = ((h3) d6Var2).f9636a;
                    if (aVar3 != null && (aVar3.f9421b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f9421b;
                        w70 a02 = z3Var2.f10001h3.a0(view);
                        a02.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, z3Var2.f9999g3)));
                        a02.Z = true;
                        a02.X = AndroidUtilities.dp(350.0f);
                        a02.i(new r2(z3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            a02.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        a02.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            a02.i(new gg.a0((ViewGroup) z3Var2, (Object) aVar3, str, 7), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        a02.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
