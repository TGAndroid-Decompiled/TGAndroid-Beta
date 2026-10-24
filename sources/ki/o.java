package ki;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sy;
public final class o implements sy {
    public final q f15469a;

    public o(q qVar) {
        this.f15469a = qVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void i(int i10) {
        h1 focusedEditTextOrNull;
        boolean z10 = false;
        q qVar = this.f15469a;
        if (i10 != 0 && (focusedEditTextOrNull = qVar.f15508r.getFocusedEditTextOrNull()) != null) {
            qVar.F = focusedEditTextOrNull;
            qVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        qVar.f15512y = z10;
        qVar.V();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        h1 P = q.P(this.f15469a);
        if (P == null || P.length() == 0) {
            return false;
        }
        P.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        q qVar = this.f15469a;
        h1 P = q.P(qVar);
        if (P != null) {
            int Q = q.Q(qVar, P);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, P.getPaint().getFontMetricsInt(), false, (int[]) null);
                P.setText(P.getText().insert(Q, replaceEmoji));
                int length = Q + replaceEmoji.length();
                P.setSelection(length, length);
                if (P == qVar.F) {
                    qVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.y5 y5Var;
        q qVar = this.f15469a;
        h1 P = q.P(qVar);
        if (P != null) {
            int Q = q.Q(qVar, P);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    y5Var = new org.telegram.ui.Components.y5(document, P.getPaint().getFontMetricsInt());
                } else {
                    y5Var = new org.telegram.ui.Components.y5(j10, P.getPaint().getFontMetricsInt());
                }
                y5Var.cacheType = org.telegram.ui.Components.p5.g();
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                P.setText(P.getText().insert(Q, spannableString));
                int length = Q + spannableString.length();
                P.setSelection(length, length);
                if (P == qVar.F) {
                    qVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f15469a.f15512y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(h61 h61Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j10) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
