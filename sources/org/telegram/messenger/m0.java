package org.telegram.messenger;

import org.telegram.messenger.BotInlineKeyboard;
public abstract class m0 {
    public static boolean a(BotInlineKeyboard.Source source) {
        if (source.getRowsCount() == 0) {
            return true;
        }
        return false;
    }
}
