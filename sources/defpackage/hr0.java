package defpackage;

import org.telegram.tgnet.tl.TL_keyboard;
public final class hr0 extends gr0 {
    public final TL_keyboard.KeyboardInlineButton a;

    public hr0(TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        this.a = keyboardInlineButton;
    }

    @Override
    public final int a() {
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.a.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_success) {
                return 3;
            }
            if (keyboardButtonStyle.bg_danger) {
                return 4;
            }
            if (keyboardButtonStyle.bg_primary) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final long b() {
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.a.style;
        if (keyboardButtonStyle != null) {
            return keyboardButtonStyle.icon;
        }
        return 0L;
    }

    @Override
    public final String d() {
        return this.a.text;
    }
}
