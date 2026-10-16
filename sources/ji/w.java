package ji;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a71;
public final class w implements TextWatcher {
    public final x f13584a;

    public w(x xVar) {
        this.f13584a = xVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x xVar = this.f13584a;
        TL_iv.RichMessage richMessage = xVar.f13614i0;
        if (richMessage != null && richMessage != null) {
            xVar.f13614i0 = null;
            xVar.f13611f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            a71 a71Var = xVar.Z;
            if (a71Var != null) {
                a71Var.N(true);
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
