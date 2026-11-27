package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class huc implements View.OnClickListener {
    public final byte a;
    public final muc b;

    public huc(muc mucVar, byte b) {
        this.a = b;
        this.b = mucVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        muc mucVar = this.b;
        switch (b) {
            case 0:
                if (mucVar.y != null) {
                    hl.t1(mucVar.O);
                    mucVar.l0(mucVar.y, null);
                    return;
                }
                return;
            case 1:
                if (mucVar.y != null) {
                    hl.t1(mucVar.O);
                    mucVar.l0(mucVar.y, null);
                    return;
                }
                return;
            case 2:
                ClipboardManager clipboardManager = (ClipboardManager) mucVar.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(mucVar.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            mucVar.O.setText(coerceToText.toString().trim());
                            m7 m7Var = mucVar.O;
                            m7Var.setSelection(m7Var.length());
                            return;
                        }
                        mucVar.T = false;
                        mucVar.o0(true);
                        return;
                    }
                    mucVar.T = false;
                    mucVar.o0(true);
                    return;
                }
                mucVar.T = false;
                mucVar.o0(true);
                return;
            default:
                mucVar.h0();
                return;
        }
    }
}
