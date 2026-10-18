package ki;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.s61;
public final class w implements TextWatcher {
    public final x f15580a;

    public w(x xVar) {
        this.f15580a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f15580a;
        TL_iv.RichMessage richMessage = xVar.f15635i0;
        if (richMessage != null && richMessage != null) {
            xVar.f15635i0 = null;
            xVar.f15632f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            s61 s61Var = xVar.Z;
            if (s61Var != null) {
                s61Var.N(true);
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
