package hi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
public final class x implements TextWatcher {
    public final y f9931a;

    public x(y yVar) {
        this.f9931a = yVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        y yVar = this.f9931a;
        TL_iv.RichMessage richMessage = yVar.f9971i0;
        if (richMessage != null && richMessage != null) {
            yVar.f9971i0 = null;
            yVar.f9968f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            j61 j61Var = yVar.Z;
            if (j61Var != null) {
                j61Var.N(true);
            }
        }
        yVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
