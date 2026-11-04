package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_keyboard;
public final class n2 extends m2 {
    public final TL_keyboard.KeyboardInlineButton f24304a;

    public n2(TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        this.f24304a = keyboardInlineButton;
    }

    @Override
    public final int a() {
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f24304a.style;
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
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f24304a.style;
        if (keyboardButtonStyle != null) {
            return keyboardButtonStyle.icon;
        }
        return 0L;
    }

    @Override
    public final String d() {
        return this.f24304a.text;
    }
}
