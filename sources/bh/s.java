package bh;

import a8.ee;
import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.c61;
public final class s extends c61 {
    public boolean f4123e2;
    public final u f4124f2;

    public s(u uVar, u uVar2, Activity activity, u6 u6Var, int i10) {
        super(uVar2, activity, false, null, 6, false, u6Var, 16, i10);
        this.f4124f2 = uVar;
        this.f4123e2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f4123e2) {
            this.f4123e2 = false;
            this.f4124f2.f4150b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        u uVar = this.f4124f2;
        int i10 = uVar.M;
        ArrayList arrayList = uVar.I;
        LinkedHashMap linkedHashMap = uVar.H;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            c6 c6Var = (c6) linkedHashMap.remove(l4);
            c6Var.setRemoved(new a1.f(23, this, c6Var));
            uVar.Y(c6Var);
            uVar.f4150b.x(l4, true);
            uVar.a0(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            wc.b0(uVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = uVar.h.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                c6 e = a1.e(document, l4, uVar.h.getFontMetricsInt());
                e.cacheType = t5.g();
                e.setAdded();
                arrayList.add(ee.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                uVar.h.getText().insert(editTextSelectionEnd, spannableString);
                uVar.h.setSelection(editTextSelectionEnd + spannableString.length());
                uVar.f4150b.x(l4, true);
                uVar.a0(true);
                uVar.Y(e);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
