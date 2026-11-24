package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
public final class by3 extends InputConnectionWrapper {
    public final EditText a;
    public final nf5 b;

    public by3(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i;
        nf5 nf5Var = new nf5((byte) 19);
        this.a = editText;
        this.b = nf5Var;
        if (wx3.j != null) {
            wx3 a = wx3.a();
            if (a.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            sk skVar = a.e;
            skVar.getClass();
            Bundle bundle = editorInfo.extras;
            rf7 rf7Var = (rf7) ((e7a) skVar.c).a;
            int a2 = rf7Var.a(4);
            if (a2 != 0) {
                i = rf7Var.b.getInt(a2 + rf7Var.a);
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
        if (!hi2.y(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        if (hi2.y(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
