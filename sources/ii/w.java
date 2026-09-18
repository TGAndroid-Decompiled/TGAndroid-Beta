package ii;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l61;
public final class w implements TextWatcher {
    public final x f11699a;

    public w(x xVar) {
        this.f11699a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f11699a;
        TL_iv.RichMessage richMessage = xVar.f11754i0;
        if (richMessage != null && richMessage != null) {
            xVar.f11754i0 = null;
            xVar.f11751f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            l61 l61Var = xVar.Z;
            if (l61Var != null) {
                l61Var.N(true);
            }
        }
        xVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
