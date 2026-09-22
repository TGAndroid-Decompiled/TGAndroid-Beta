package ii;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m61;
public final class w implements TextWatcher {
    public final x f11700a;

    public w(x xVar) {
        this.f11700a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f11700a;
        TL_iv.RichMessage richMessage = xVar.f11755i0;
        if (richMessage != null && richMessage != null) {
            xVar.f11755i0 = null;
            xVar.f11752f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            m61 m61Var = xVar.Z;
            if (m61Var != null) {
                m61Var.N(true);
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
