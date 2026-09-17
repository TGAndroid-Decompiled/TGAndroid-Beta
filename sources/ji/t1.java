package ji;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ly;
import org.telegram.ui.StickersActivity;
public final class t1 implements ly {
    public final c2 f14209a;

    public t1(c2 c2Var) {
        this.f14209a = c2Var;
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
        c2 c2Var = this.f14209a;
        if (i10 != 0 && (focusedEditTextOrNull = c2Var.P.getFocusedEditTextOrNull()) != null) {
            c2Var.R0 = focusedEditTextOrNull;
            c2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        c2Var.C0 = z10;
        c2Var.e0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        h1 a02 = c2.a0(this.f14209a);
        if (a02 == null || a02.length() == 0) {
            return false;
        }
        a02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        c2 c2Var = this.f14209a;
        h1 a02 = c2.a0(c2Var);
        if (a02 != null) {
            int b02 = c2.b0(c2Var, a02);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, a02.getPaint().getFontMetricsInt(), false, (int[]) null);
                a02.setText(a02.getText().insert(b02, replaceEmoji));
                int length = b02 + replaceEmoji.length();
                a02.setSelection(length, length);
                if (a02 == c2Var.R0) {
                    c2Var.S0 = length;
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
        this.f14209a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f14209a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.z5 z5Var;
        c2 c2Var = this.f14209a;
        h1 a02 = c2.a0(c2Var);
        if (a02 != null) {
            int b02 = c2.b0(c2Var, a02);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    z5Var = new org.telegram.ui.Components.z5(document, a02.getPaint().getFontMetricsInt());
                } else {
                    z5Var = new org.telegram.ui.Components.z5(j3, a02.getPaint().getFontMetricsInt());
                }
                z5Var.cacheType = org.telegram.ui.Components.q5.g();
                spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
                a02.setText(a02.getText().insert(b02, spannableString));
                int length = b02 + spannableString.length();
                a02.setSelection(length, length);
                if (a02 == c2Var.R0) {
                    c2Var.S0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f14209a.C0;
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
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(d51 d51Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void y(long j3) {
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
