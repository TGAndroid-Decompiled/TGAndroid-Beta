package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
public final class qw3 extends InputConnectionWrapper {
    public final EditText a;
    public final pd5 b;

    public qw3(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i;
        pd5 pd5Var = new pd5((byte) 19);
        this.a = editText;
        this.b = pd5Var;
        if (lw3.j != null) {
            lw3 a = lw3.a();
            if (a.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            sj sjVar = a.e;
            sjVar.getClass();
            Bundle bundle = editorInfo.extras;
            pd7 pd7Var = (pd7) ((wtc) sjVar.c).a;
            int a2 = pd7Var.a(4);
            if (a2 != 0) {
                i = pd7Var.b.getInt(a2 + pd7Var.a);
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
        if (!lv6.t(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        if (lv6.t(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
