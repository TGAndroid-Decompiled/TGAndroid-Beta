package ii;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w51;
public final class w implements TextWatcher {
    public final x f11698a;

    public w(x xVar) {
        this.f11698a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f11698a;
        TL_iv.RichMessage richMessage = xVar.f11753i0;
        if (richMessage != null && richMessage != null) {
            xVar.f11753i0 = null;
            xVar.f11750f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            w51 w51Var = xVar.Z;
            if (w51Var != null) {
                w51Var.N(true);
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
