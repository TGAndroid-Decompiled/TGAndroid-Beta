package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
public final class lx3 extends InputConnectionWrapper {
    public final EditText a;
    public final qf5 b;

    public lx3(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i;
        qf5 qf5Var = new qf5((byte) 19);
        this.a = editText;
        this.b = qf5Var;
        if (gx3.j != null) {
            gx3 a = gx3.a();
            if (a.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            tj tjVar = a.e;
            tjVar.getClass();
            Bundle bundle = editorInfo.extras;
            zf7 zf7Var = (zf7) ((u8a) tjVar.c).a;
            int a2 = zf7Var.a(4);
            if (a2 != 0) {
                i = zf7Var.b.getInt(a2 + zf7Var.a);
            } else {
                i = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        if (!qx6.v(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        if (qx6.v(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
