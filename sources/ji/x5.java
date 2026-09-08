package ji;

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
import org.telegram.ui.Components.n70;
public final class x5 implements View.OnClickListener {
    public final int f14359a;
    public final g6 f14360b;

    public x5(g6 g6Var, int i10) {
        this.f14359a = i10;
        this.f14360b = g6Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f14359a) {
            case 0:
                g6 g6Var = this.f14360b;
                a aVar = g6Var.f13964x;
                if (aVar != null && aVar.f13760e) {
                    boolean z10 = !aVar.f13761f;
                    aVar.f13761f = z10;
                    ((CheckBoxBase) g6Var.f13958e.f7209b).f(-1, z10, true);
                    d6 d6Var = g6Var.f13965y;
                    if (d6Var != null) {
                        a aVar2 = g6Var.f13964x;
                        boolean z11 = aVar2.f13761f;
                        v3 v3Var = ((d3) d6Var).f13887a;
                        aVar2.f13761f = z11;
                        g2 g2Var = v3Var.J3;
                        if (g2Var != null) {
                            g2Var.d();
                            v3Var.J3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                g6 g6Var2 = this.f14360b;
                d6 d6Var2 = g6Var2.f13965y;
                if (d6Var2 != null) {
                    a aVar3 = g6Var2.f13964x;
                    v3 v3Var2 = ((d3) d6Var2).f13887a;
                    if (aVar3 != null && (aVar3.f13758b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f13758b;
                        n70 t10 = v3Var2.f14275h3.t(view);
                        t10.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20690d6, v3Var2.f14273g3)));
                        t10.Z = true;
                        t10.X = AndroidUtilities.dp(350.0f);
                        t10.i(new n2(v3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            t10.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        t10.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            t10.i(new hg.t(v3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        t10.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
