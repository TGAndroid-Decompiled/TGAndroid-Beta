package ki;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.t61;
public final class w implements TextWatcher {
    public final x f15581a;

    public w(x xVar) {
        this.f15581a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f15581a;
        TL_iv.RichMessage richMessage = xVar.f15636i0;
        if (richMessage != null && richMessage != null) {
            xVar.f15636i0 = null;
            xVar.f15633f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            t61 t61Var = xVar.Z;
            if (t61Var != null) {
                t61Var.N(true);
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
