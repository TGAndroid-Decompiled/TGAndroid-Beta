package ki;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.uy;
public final class o implements uy {
    public final q f15409a;

    public o(q qVar) {
        this.f15409a = qVar;
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
        q qVar = this.f15409a;
        if (i10 != 0 && (focusedEditTextOrNull = qVar.f15448r.getFocusedEditTextOrNull()) != null) {
            qVar.F = focusedEditTextOrNull;
            qVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        qVar.f15452y = z10;
        qVar.V();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        h1 P = q.P(this.f15409a);
        if (P == null || P.length() == 0) {
            return false;
        }
        P.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        q qVar = this.f15409a;
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
        org.telegram.ui.Components.a6 a6Var;
        q qVar = this.f15409a;
        h1 P = q.P(qVar);
        if (P != null) {
            int Q = q.Q(qVar, P);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    a6Var = new org.telegram.ui.Components.a6(document, P.getPaint().getFontMetricsInt());
                } else {
                    a6Var = new org.telegram.ui.Components.a6(j10, P.getPaint().getFontMetricsInt());
                }
                a6Var.cacheType = org.telegram.ui.Components.r5.g();
                spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
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
        return this.f15409a.f15452y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o(c61 c61Var) {
    }

    @Override
    public final void q() {
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
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void y(long j10) {
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
