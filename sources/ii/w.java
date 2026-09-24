package ii;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
public final class w implements TextWatcher {
    public final x f11688a;

    public w(x xVar) {
        this.f11688a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f11688a;
        TL_iv.RichMessage richMessage = xVar.f11715i0;
        if (richMessage != null && richMessage != null) {
            xVar.f11715i0 = null;
            xVar.f11712f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            j61 j61Var = xVar.Z;
            if (j61Var != null) {
                j61Var.N(true);
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
