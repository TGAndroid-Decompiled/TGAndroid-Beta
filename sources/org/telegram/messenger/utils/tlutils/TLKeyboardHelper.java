package org.telegram.messenger.utils.tlutils;

import org.telegram.tgnet.tl.TL_keyboard;

public abstract class TLKeyboardHelper {
    public static TL_keyboard.ButtonTypeProto getType(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        if (keyboardButtonProto == null) {
            return null;
        }
        TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
        if (cls.isInstance(type)) {
            return (TL_keyboard.ButtonTypeProto) cls.cast(type);
        }
        return null;
    }

    public static boolean isType(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        return getType(keyboardButtonProto, cls) != null;
    }
}
