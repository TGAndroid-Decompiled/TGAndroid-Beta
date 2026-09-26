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
import org.telegram.ui.Components.y70;
public final class u5 implements View.OnClickListener {
    public final int f11656a;
    public final e6 f11657b;

    public u5(e6 e6Var, int i10) {
        this.f11656a = i10;
        this.f11657b = e6Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f11656a) {
            case 0:
                e6 e6Var = this.f11657b;
                a aVar = e6Var.f11354x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f11193f;
                    aVar.f11193f = z10;
                    ((CheckBoxBase) e6Var.e.f4422b).f(-1, z10, true);
                    b6 b6Var = e6Var.f11355y;
                    if (b6Var != null) {
                        a aVar2 = e6Var.f11354x;
                        boolean z11 = aVar2.f11193f;
                        x3 x3Var = ((f3) b6Var).f11363a;
                        aVar2.f11193f = z11;
                        i2 i2Var = x3Var.J3;
                        if (i2Var != null) {
                            i2Var.d();
                            x3Var.J3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                e6 e6Var2 = this.f11657b;
                b6 b6Var2 = e6Var2.f11355y;
                if (b6Var2 != null) {
                    a aVar3 = e6Var2.f11354x;
                    x3 x3Var2 = ((f3) b6Var2).f11363a;
                    if (aVar3 != null && (aVar3.f11191b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f11191b;
                        y70 F = x3Var2.f11728h3.F(view);
                        F.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, x3Var2.f11726g3)));
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
