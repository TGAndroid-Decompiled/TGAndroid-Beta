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
import org.telegram.ui.Components.p80;
public final class v5 implements View.OnClickListener {
    public final int f12753a;
    public final f6 f12754b;

    public v5(f6 f6Var, int i10) {
        this.f12753a = i10;
        this.f12754b = f6Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f12753a) {
            case 0:
                f6 f6Var = this.f12754b;
                a aVar = f6Var.f12424x;
                if (aVar != null && aVar.f12236e) {
                    boolean z10 = !aVar.f12237f;
                    aVar.f12237f = z10;
                    ((CheckBoxBase) f6Var.f12418e.f4803b).f(-1, z10, true);
                    c6 c6Var = f6Var.f12425y;
                    if (c6Var != null) {
                        a aVar2 = f6Var.f12424x;
                        boolean z11 = aVar2.f12237f;
                        x3 x3Var = ((f3) c6Var).f12411a;
                        aVar2.f12237f = z11;
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
                f6 f6Var2 = this.f12754b;
                c6 c6Var2 = f6Var2.f12425y;
                if (c6Var2 != null) {
                    a aVar3 = f6Var2.f12424x;
                    x3 x3Var2 = ((f3) c6Var2).f12411a;
                    if (aVar3 != null && (aVar3.f12234b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f12234b;
                        p80 E = x3Var2.f12809f3.E(view);
                        E.W(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, x3Var2.f12807e3)));
                        E.Z = true;
                        E.X = AndroidUtilities.dp(350.0f);
                        E.i(new p2(x3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            E.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        E.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            E.i(new gg.t(x3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        E.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
