package ji;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.v51;
public final class w implements TextWatcher {
    public final x f14305a;

    public w(x xVar) {
        this.f14305a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f14305a;
        TL_iv.RichMessage richMessage = xVar.f14346i0;
        if (richMessage != null && richMessage != null) {
            xVar.f14346i0 = null;
            xVar.f14343f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            v51 v51Var = xVar.Z;
            if (v51Var != null) {
                v51Var.N(true);
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
