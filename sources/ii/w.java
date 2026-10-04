package ii;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.u61;
public final class w implements TextWatcher {
    public final x f12707a;

    public w(x xVar) {
        this.f12707a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f12707a;
        TL_iv.RichMessage richMessage = xVar.f12750i0;
        if (richMessage != null && richMessage != null) {
            xVar.f12750i0 = null;
            xVar.f12747f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            u61 u61Var = xVar.Z;
            if (u61Var != null) {
                u61Var.N(true);
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
