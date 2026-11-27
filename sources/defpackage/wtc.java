package defpackage;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.ui.Wallet.WalletEngine2;
public final class wtc implements TextView.OnEditorActionListener {
    public final byte a;
    public final Object b;

    public wtc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                euc eucVar = (euc) obj;
                if (i == 6) {
                    c51 c51Var = eucVar.e0;
                    if (c51Var.e0) {
                        c51Var.performClick();
                        return true;
                    }
                }
                return false;
            default:
                zuc zucVar = (zuc) obj;
                EditText editText = zucVar.a;
                if (keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160)) {
                    z = true;
                } else {
                    z = false;
                }
                if (i != 5 && !z) {
                    return false;
                }
                if (keyEvent != null && (keyEvent.getAction() != 1 || keyEvent.isCanceled())) {
                    return true;
                }
                String lowerCase = editText.getText().toString().trim().toLowerCase();
                if (!lowerCase.isEmpty() && zucVar.b()) {
                    zucVar.setError(false);
                    zucVar.a();
                    Runnable runnable = zucVar.r;
                    if (runnable == null) {
                        return true;
                    }
                    editText.post(runnable);
                    return true;
                }
                String str = null;
                if (!lowerCase.isEmpty()) {
                    String[] mnemonicWordlist = WalletEngine2.getMnemonicWordlist();
                    int length = mnemonicWordlist.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            String str2 = mnemonicWordlist[i2];
                            if (str2.startsWith(lowerCase)) {
                                str = str2;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                if (str != null) {
                    editText.setText(str);
                    editText.setSelection(str.length());
                    zucVar.setError(false);
                    zucVar.a();
                    Runnable runnable2 = zucVar.r;
                    if (runnable2 == null) {
                        return true;
                    }
                    editText.post(runnable2);
                    return true;
                }
                zucVar.setError(true);
                return true;
        }
    }
}
