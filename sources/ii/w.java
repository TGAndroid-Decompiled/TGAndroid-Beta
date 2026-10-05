package ii;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w61;
public final class w implements TextWatcher {
    public final x f12708a;

    public w(x xVar) {
        this.f12708a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f12708a;
        TL_iv.RichMessage richMessage = xVar.f12751i0;
        if (richMessage != null && richMessage != null) {
            xVar.f12751i0 = null;
            xVar.f12748f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            w61 w61Var = xVar.Z;
            if (w61Var != null) {
                w61Var.N(true);
            }
        }
        xVar.N();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
