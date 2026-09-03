package lf;

import org.telegram.tgnet.tl.TL_keyboard;
public abstract class c {
    public static TL_keyboard.ButtonTypeProto a(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        if (keyboardButtonProto != null) {
            TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
            if (cls.isInstance(type)) {
                return (TL_keyboard.ButtonTypeProto) cls.cast(type);
            }
            return null;
        }
        return null;
    }

    public static boolean b(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        if (!c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeWebView.class) && !c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class)) {
            return false;
        }
        return true;
    }

    public static boolean c(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        if (a(keyboardButtonProto, cls) != null) {
            return true;
        }
        return false;
    }
}
