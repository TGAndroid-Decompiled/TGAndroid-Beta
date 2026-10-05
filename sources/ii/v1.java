package ii;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.oy;
import org.telegram.ui.StickersActivity;
public final class v1 implements oy {
    public final e2 f12696a;

    public v1(e2 e2Var) {
        this.f12696a = e2Var;
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
        i1 focusedEditTextOrNull;
        boolean z10 = false;
        e2 e2Var = this.f12696a;
        if (i10 != 0 && (focusedEditTextOrNull = e2Var.P.getFocusedEditTextOrNull()) != null) {
            e2Var.R0 = focusedEditTextOrNull;
            e2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        e2Var.C0 = z10;
        e2Var.e0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        i1 Z = e2.Z(this.f12696a);
        if (Z == null || Z.length() == 0) {
            return false;
        }
        Z.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        e2 e2Var = this.f12696a;
        i1 Z = e2.Z(e2Var);
        if (Z != null) {
            int b02 = e2.b0(e2Var, Z);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, Z.getPaint().getFontMetricsInt(), false, (int[]) null);
                Z.setText(Z.getText().insert(b02, replaceEmoji));
                int length = b02 + replaceEmoji.length();
                Z.setSelection(length, length);
                if (Z == e2Var.R0) {
                    e2Var.S0 = length;
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
        this.f12696a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f12696a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.z5 z5Var;
        e2 e2Var = this.f12696a;
        i1 Z = e2.Z(e2Var);
        if (Z != null) {
            int b02 = e2.b0(e2Var, Z);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    z5Var = new org.telegram.ui.Components.z5(document, Z.getPaint().getFontMetricsInt());
                } else {
                    z5Var = new org.telegram.ui.Components.z5(j3, Z.getPaint().getFontMetricsInt());
                }
                z5Var.cacheType = org.telegram.ui.Components.q5.g();
                spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
                Z.setText(Z.getText().insert(b02, spannableString));
                int length = b02 + spannableString.length();
                Z.setSelection(length, length);
                if (Z == e2Var.R0) {
                    e2Var.S0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f12696a.C0;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(d61 d61Var) {
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
