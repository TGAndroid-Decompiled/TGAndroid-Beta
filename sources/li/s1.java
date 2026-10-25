package li;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.ty;
import org.telegram.ui.StickersActivity;
public final class s1 implements ty {
    public final b2 f17465a;

    public s1(b2 b2Var) {
        this.f17465a = b2Var;
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
        g1 focusedEditTextOrNull;
        boolean z10 = false;
        b2 b2Var = this.f17465a;
        if (i10 != 0 && (focusedEditTextOrNull = b2Var.P.getFocusedEditTextOrNull()) != null) {
            b2Var.R0 = focusedEditTextOrNull;
            b2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        b2Var.C0 = z10;
        b2Var.f0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        g1 b02 = b2.b0(this.f17465a);
        if (b02 == null || b02.length() == 0) {
            return false;
        }
        b02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        b2 b2Var = this.f17465a;
        g1 b02 = b2.b0(b2Var);
        if (b02 != null) {
            int c02 = b2.c0(b2Var, b02);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, b02.getPaint().getFontMetricsInt(), false, (int[]) null);
                b02.setText(b02.getText().insert(c02, replaceEmoji));
                int length = c02 + replaceEmoji.length();
                b02.setSelection(length, length);
                if (b02 == b2Var.R0) {
                    b2Var.S0 = length;
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
    public final void t(ArrayList arrayList) {
        this.f17465a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f17465a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.c6 c6Var;
        b2 b2Var = this.f17465a;
        g1 b02 = b2.b0(b2Var);
        if (b02 != null) {
            int c02 = b2.c0(b2Var, b02);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    c6Var = new org.telegram.ui.Components.c6(document, b02.getPaint().getFontMetricsInt());
                } else {
                    c6Var = new org.telegram.ui.Components.c6(j10, b02.getPaint().getFontMetricsInt());
                }
                c6Var.cacheType = org.telegram.ui.Components.t5.g();
                spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
                b02.setText(b02.getText().insert(c02, spannableString));
                int length = c02 + spannableString.length();
                b02.setSelection(length, length);
                if (b02 == b2Var.R0) {
                    b2Var.S0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f17465a.C0;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(p61 p61Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
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
