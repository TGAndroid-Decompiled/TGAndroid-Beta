package ji;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z61;
public final class w implements TextWatcher {
    public final x f13581a;

    public w(x xVar) {
        this.f13581a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f13581a;
        TL_iv.RichMessage richMessage = xVar.f13611i0;
        if (richMessage != null && richMessage != null) {
            xVar.f13611i0 = null;
            xVar.f13608f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            z61 z61Var = xVar.Z;
            if (z61Var != null) {
                z61Var.N(true);
            }
        }
        xVar.Q();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
