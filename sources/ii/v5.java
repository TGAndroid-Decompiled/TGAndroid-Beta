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
public final class v5 implements View.OnClickListener {
    public final int f12706a;
    public final f6 f12707b;

    public v5(f6 f6Var, int i10) {
        this.f12706a = i10;
        this.f12707b = f6Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f12706a) {
            case 0:
                f6 f6Var = this.f12707b;
                a aVar = f6Var.f12377x;
                if (aVar != null && aVar.f12189e) {
                    boolean z10 = !aVar.f12190f;
                    aVar.f12190f = z10;
                    ((CheckBoxBase) f6Var.f12371e.f4716b).f(-1, z10, true);
                    c6 c6Var = f6Var.f12378y;
                    if (c6Var != null) {
                        a aVar2 = f6Var.f12377x;
                        boolean z11 = aVar2.f12190f;
                        x3 x3Var = ((f3) c6Var).f12362a;
                        aVar2.f12190f = z11;
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
                f6 f6Var2 = this.f12707b;
                c6 c6Var2 = f6Var2.f12378y;
                if (c6Var2 != null) {
                    a aVar3 = f6Var2.f12377x;
                    x3 x3Var2 = ((f3) c6Var2).f12362a;
                    if (aVar3 != null && (aVar3.f12187b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f12187b;
                        b80 f02 = x3Var2.f12770o3.f0(view);
                        f02.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20822d6, x3Var2.f12768n3)));
                        f02.Z = true;
                        f02.X = AndroidUtilities.dp(350.0f);
                        f02.i(new p2(x3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            f02.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        f02.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            f02.i(new gg.t(x3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        f02.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
