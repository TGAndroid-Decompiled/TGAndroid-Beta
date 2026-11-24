package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class urc implements View.OnClickListener {
    public final byte a;
    public final asc b;

    public urc(asc ascVar, byte b) {
        this.a = b;
        this.b = ascVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        asc ascVar = this.b;
        switch (b) {
            case 0:
                if (ascVar.y != null) {
                    gm.t1(ascVar.O);
                    ascVar.m0(ascVar.y, null);
                    return;
                }
                return;
            case 1:
                if (ascVar.y != null) {
                    gm.t1(ascVar.O);
                    ascVar.m0(ascVar.y, null);
                    return;
                }
                return;
            case 2:
                ClipboardManager clipboardManager = (ClipboardManager) ascVar.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(ascVar.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            ascVar.O.setText(coerceToText.toString().trim());
                            l7 l7Var = ascVar.O;
                            l7Var.setSelection(l7Var.length());
                            return;
                        }
                        ascVar.T = false;
                        ascVar.p0(true);
                        return;
                    }
                    ascVar.T = false;
                    ascVar.p0(true);
                    return;
                }
                ascVar.T = false;
                ascVar.p0(true);
                return;
            default:
                ascVar.i0();
                return;
        }
    }
}
