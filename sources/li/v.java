package li;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k71;
public final class v implements TextWatcher {
    public final w f17535a;

    public v(w wVar) {
        this.f17535a = wVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        w wVar = this.f17535a;
        TL_iv.RichMessage richMessage = wVar.f17589i0;
        if (richMessage != null && richMessage != null) {
            wVar.f17589i0 = null;
            wVar.f17586f0.i(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            k71 k71Var = wVar.Z;
            if (k71Var != null) {
                k71Var.O(true);
            }
        }
        wVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
