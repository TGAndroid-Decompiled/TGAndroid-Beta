package bg;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.y5;
public final class s0 implements fy {
    public final g1 f2498a;

    public s0(g1 g1Var) {
        this.f2498a = g1Var;
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
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        b editText = ((f4) this.f2498a.O0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        f4 f4Var;
        b editText;
        Emoji.EmojiSpan[] emojiSpanArr;
        k kVar = this.f2498a.O0;
        if ((kVar instanceof f4) && (editText = (f4Var = (f4) kVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji(str, f4Var.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
                int length = selectionEnd + replaceEmoji.length();
                editText.setSelection(length, length);
            } catch (Exception e10) {
                FileLog.e(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void n() {
        g1 g1Var = this.f2498a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g1Var.getContext(), 0, g1Var.M1);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new a1.c(this, 6));
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        y5 y5Var;
        b editText = ((f4) this.f2498a.O0).getEditText();
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    y5Var = new y5(document, editText.getPaint().getFontMetricsInt());
                } else {
                    y5Var = new y5(j10, editText.getPaint().getFontMetricsInt());
                }
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                editText.setText(editText.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editText.setSelection(length, length);
            } catch (Exception e10) {
                FileLog.e(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void i(int i10) {
    }

    @Override
    public final void o(s41 s41Var) {
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
