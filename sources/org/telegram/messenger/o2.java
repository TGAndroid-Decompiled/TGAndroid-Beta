package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_keyboard;
public final class o2 extends n2 {
    public final TL_keyboard.KeyboardInlineButton f26056a;

    public o2(TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        this.f26056a = keyboardInlineButton;
    }

    @Override
    public final int a() {
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f26056a.style;
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
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f26056a.style;
        if (keyboardButtonStyle != null) {
            return keyboardButtonStyle.icon;
        }
        return 0L;
    }

    @Override
    public final String d() {
        return this.f26056a.text;
    }
}
