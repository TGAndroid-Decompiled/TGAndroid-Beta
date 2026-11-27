package defpackage;

import java.util.Arrays;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
public final class roa implements Runnable {
    public final byte a;
    public final woa b;

    public roa(woa woaVar, byte b) {
        this.a = b;
        this.b = woaVar;
    }

    @Override
    public final void run() {
        wa waVar;
        l9c l9cVar;
        byte b = this.a;
        woa woaVar = this.b;
        switch (b) {
            case 0:
                if (!Arrays.equals(woaVar.n, DictationAsr.I()) && woaVar.getParentActivity() != null && woaVar.a != null) {
                    woaVar.d0(woaVar.getParentActivity());
                    woaVar.a.g3.O(true);
                    return;
                } else if (woaVar.s != DictationAsr.l() && (waVar = woaVar.a) != null && (l9cVar = waVar.g3) != null) {
                    l9cVar.O(true);
                    return;
                } else {
                    woaVar.f0();
                    return;
                }
            default:
                woaVar.showDialog(new xk8((e) woaVar, 8, true));
                return;
        }
    }
}
