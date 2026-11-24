package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class tpc implements View.OnClickListener {
    public final byte a;
    public final ypc b;

    public tpc(ypc ypcVar, byte b) {
        this.a = b;
        this.b = ypcVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ypc ypcVar = this.b;
        switch (b) {
            case 0:
                if (ypcVar.y != null) {
                    gl.t1(ypcVar.O);
                    ypcVar.l0(ypcVar.y, null);
                    return;
                }
                return;
            case 1:
                if (ypcVar.y != null) {
                    gl.t1(ypcVar.O);
                    ypcVar.l0(ypcVar.y, null);
                    return;
                }
                return;
            case 2:
                ClipboardManager clipboardManager = (ClipboardManager) ypcVar.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(ypcVar.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            ypcVar.O.setText(coerceToText.toString().trim());
                            l7 l7Var = ypcVar.O;
                            l7Var.setSelection(l7Var.length());
                            return;
                        }
                        ypcVar.T = false;
                        ypcVar.o0(true);
                        return;
                    }
                    ypcVar.T = false;
                    ypcVar.o0(true);
                    return;
                }
                ypcVar.T = false;
                ypcVar.o0(true);
                return;
            default:
                ypcVar.h0();
                return;
        }
    }
}
