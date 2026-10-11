package ii;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e71;
public final class w implements TextWatcher {
    public final x f12754a;

    public w(x xVar) {
        this.f12754a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f12754a;
        TL_iv.RichMessage richMessage = xVar.f12797i0;
        if (richMessage != null && richMessage != null) {
            xVar.f12797i0 = null;
            xVar.f12794f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            e71 e71Var = xVar.Z;
            if (e71Var != null) {
                e71Var.N(true);
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
