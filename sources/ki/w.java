package ki;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b71;
public final class w implements TextWatcher {
    public final x f15642a;

    public w(x xVar) {
        this.f15642a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f15642a;
        TL_iv.RichMessage richMessage = xVar.f15697i0;
        if (richMessage != null && richMessage != null) {
            xVar.f15697i0 = null;
            xVar.f15694f0.i(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            b71 b71Var = xVar.Z;
            if (b71Var != null) {
                b71Var.N(true);
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
