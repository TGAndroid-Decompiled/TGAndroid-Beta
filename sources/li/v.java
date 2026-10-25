package li;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j71;
public final class v implements TextWatcher {
    public final w f17536a;

    public v(w wVar) {
        this.f17536a = wVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        w wVar = this.f17536a;
        TL_iv.RichMessage richMessage = wVar.f17590i0;
        if (richMessage != null && richMessage != null) {
            wVar.f17590i0 = null;
            wVar.f17587f0.i(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            j71 j71Var = wVar.Z;
            if (j71Var != null) {
                j71Var.O(true);
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
