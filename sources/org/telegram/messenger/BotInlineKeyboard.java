package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public class BotInlineKeyboard {

    public static abstract class Button {
        public abstract int getIcon();

        public abstract String getText();
    }

    public static class ButtonBot extends Button {
        public final TLRPC.KeyboardButton button;

        @Override
        public int getIcon() {
            return 0;
        }

        public ButtonBot(TLRPC.KeyboardButton keyboardButton) {
            this.button = keyboardButton;
        }

        @Override
        public String getText() {
            return this.button.text;
        }
    }

    public static class ButtonCustom extends Button {
        public static final int SUGGESTION_ACCEPT = 2;
        public static final int SUGGESTION_DECLINE = 1;
        public static final int SUGGESTION_EDIT = 3;
        public final int icon;
        public final int id;
        public final int text;

        public ButtonCustom(int i, int i2, int i3) {
            this.id = i;
            this.text = i2;
            this.icon = i3;
        }

        @Override
        public String getText() {
            return LocaleController.getString(this.text);
        }

        @Override
        public int getIcon() {
            return this.icon;
        }
    }

    public interface Source {
        Button getButton(int i, int i2);

        int getColumnsCount(int i);

        int getRowsCount();

        boolean hasSeparator(int i);

        boolean isEmpty();

        public abstract class CC {
            public static boolean $default$isEmpty(Source source) {
                return source.getRowsCount() == 0;
            }
        }
    }

    public static Source fromBot(TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup, boolean z) {
        int i = 0;
        Button[][] buttonArr = new Button[tL_replyInlineMarkup.rows.size() + (z ? 2 : 0)];
        for (int i2 = 0; i2 < tL_replyInlineMarkup.rows.size(); i2++) {
            ArrayList<TLRPC.KeyboardButton> arrayList = tL_replyInlineMarkup.rows.get(i2).buttons;
            buttonArr[i2] = new ButtonBot[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                buttonArr[i2][i3] = new ButtonBot(arrayList.get(i3));
            }
        }
        if (z) {
            int size = !tL_replyInlineMarkup.rows.isEmpty() ? 1 << (tL_replyInlineMarkup.rows.size() - 1) : 0;
            int size2 = tL_replyInlineMarkup.rows.size();
            ButtonCustom buttonCustom = new ButtonCustom(1, R.string.PostSuggestionsInlineDecline, R.drawable.filled_bot_decline_24);
            ButtonCustom buttonCustom2 = new ButtonCustom(2, R.string.PostSuggestionsInlineAccept, R.drawable.filled_bot_approve_24);
            Button[] buttonArr2 = new Button[2];
            buttonArr2[0] = buttonCustom;
            buttonArr2[1] = buttonCustom2;
            buttonArr[size2] = buttonArr2;
            int size3 = tL_replyInlineMarkup.rows.size() + 1;
            Button[] buttonArr3 = new Button[1];
            buttonArr3[0] = new ButtonCustom(3, R.string.PostSuggestionsInlineEdit, R.drawable.filled_bot_suggest_24);
            buttonArr[size3] = buttonArr3;
            i = size;
        }
        return new KeyboardSourceArray(buttonArr, i);
    }

    public static Source fromSuggestion() {
        return new KeyboardSourceArray(new Button[][]{new Button[]{new ButtonCustom(1, R.string.PostSuggestionsInlineDecline, R.drawable.filled_bot_decline_24), new ButtonCustom(2, R.string.PostSuggestionsInlineAccept, R.drawable.filled_bot_approve_24)}, new Button[]{new ButtonCustom(3, R.string.PostSuggestionsInlineEdit, R.drawable.filled_bot_suggest_24)}}, 0);
    }

    public static class KeyboardSourceArray implements Source {
        private final Button[][] buttons;
        private final int separators;

        @Override
        public boolean isEmpty() {
            return Source.CC.$default$isEmpty(this);
        }

        private KeyboardSourceArray(Button[][] buttonArr, int i) {
            this.buttons = buttonArr;
            this.separators = i;
        }

        @Override
        public int getRowsCount() {
            return this.buttons.length;
        }

        @Override
        public int getColumnsCount(int i) {
            return this.buttons[i].length;
        }

        @Override
        public Button getButton(int i, int i2) {
            return this.buttons[i][i2];
        }

        @Override
        public boolean hasSeparator(int i) {
            return ((1 << i) & this.separators) != 0;
        }
    }
}
