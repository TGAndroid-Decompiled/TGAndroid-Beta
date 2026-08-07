package org.telegram.messenger.utils.tlutils;

import org.telegram.tgnet.tl.TL_keyboard;

public abstract class TLKeyboardHelper {
    public static boolean isButtonWebView(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        return isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeWebView.class) || isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
    }

    public static boolean isType(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        return getType(keyboardButtonProto, cls) != null;
    }

    public static TL_keyboard.ButtonTypeProto getType(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        if (keyboardButtonProto != null && cls != null) {
            TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
            if (cls.isInstance(type)) {
                return (TL_keyboard.ButtonTypeProto) cls.cast(type);
            }
        }
        return null;
    }
}
