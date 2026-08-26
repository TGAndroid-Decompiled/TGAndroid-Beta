package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;

public class BotInlineKeyboard {

    public enum BackgroundColor {
        NONE,
        PRIMARY,
        SUCCESS,
        DANGER
    }

    public static class Builder {
        private final ArrayList<Button[]> buttons = new ArrayList<>();
        private int separators;

        public void addBotKeyboard(TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup) {
            for (int i = 0; i < tL_replyInlineMarkup.rows.size(); i++) {
                ArrayList<TL_keyboard.KeyboardInlineButton> arrayList = tL_replyInlineMarkup.rows.get(i).buttons;
                ButtonBot[] buttonBotArr = new ButtonBot[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    buttonBotArr[i2] = new ButtonBot(arrayList.get(i2));
                }
                this.buttons.add(buttonBotArr);
            }
        }

        public void addContinueThreadKeyboard() {
            this.buttons.add(new Button[]{new ButtonCustom(4, R.string.BotForumContinueChat, 0)});
        }

        public void addGiftOfferKeyboard() {
            this.buttons.add(new Button[]{new ButtonCustom(5, R.string.GiftOfferDecline, R.drawable.filled_bot_decline_24), new ButtonCustom(6, R.string.GiftOfferAccept, R.drawable.filled_bot_approve_24)});
        }

        public void addKeyboardSource(Source source) {
            if (source == null) {
                return;
            }
            int rowsCount = source.getRowsCount();
            for (int i = 0; i < rowsCount; i++) {
                int columnsCount = source.getColumnsCount(i);
                Button[] buttonArr = new Button[columnsCount];
                for (int i2 = 0; i2 < columnsCount; i2++) {
                    buttonArr[i2] = source.getButton(i, i2);
                }
                this.buttons.add(buttonArr);
                if (source.hasSeparator(i)) {
                    addSeparator();
                }
            }
        }

        public void addSeparator() {
            if (this.buttons.isEmpty()) {
                return;
            }
            this.separators |= 1 << (this.buttons.size() - 1);
        }

        public void addSharingOfferKeyboard() {
            this.buttons.add(new Button[]{new ButtonCustom(7, R.string.DisableSharingOfferDecline, R.drawable.filled_bot_decline_24), new ButtonCustom(8, R.string.DisableSharingOfferAccept, R.drawable.filled_bot_approve_24)});
        }

        public void addSuggestionKeyboard() {
            this.buttons.add(new Button[]{new ButtonCustom(1, R.string.PostSuggestionsInlineDecline, R.drawable.filled_bot_decline_24), new ButtonCustom(2, R.string.PostSuggestionsInlineAccept, R.drawable.filled_bot_approve_24)});
            this.buttons.add(new Button[]{new ButtonCustom(3, R.string.PostSuggestionsInlineEdit, R.drawable.filled_bot_suggest_24)});
        }

        public Source build() {
            ArrayList<Button[]> arrayList = this.buttons;
            return new KeyboardSourceArray((Button[][]) arrayList.toArray(new Button[arrayList.size()][]), this.separators);
        }

        public boolean isEmpty() {
            return this.buttons.isEmpty();
        }

        public boolean isNotEmpty() {
            return !this.buttons.isEmpty();
        }
    }

    public static abstract class Button {
        public BackgroundColor getColor() {
            return BackgroundColor.NONE;
        }

        public long getIconEmoji() {
            return 0L;
        }

        public int getIconRes() {
            return 0;
        }

        public abstract String getText();
    }

    public static class ButtonBot extends Button {
        public final TL_keyboard.KeyboardInlineButton button;

        public ButtonBot(TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
            this.button = keyboardInlineButton;
        }

        @Override
        public BackgroundColor getColor() {
            TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.button.style;
            if (keyboardButtonStyle != null) {
                if (keyboardButtonStyle.bg_success) {
                    return BackgroundColor.SUCCESS;
                }
                if (keyboardButtonStyle.bg_danger) {
                    return BackgroundColor.DANGER;
                }
                if (keyboardButtonStyle.bg_primary) {
                    return BackgroundColor.PRIMARY;
                }
            }
            return BackgroundColor.NONE;
        }

        @Override
        public long getIconEmoji() {
            TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.button.style;
            if (keyboardButtonStyle != null) {
                return keyboardButtonStyle.icon;
            }
            return 0L;
        }

        @Override
        public String getText() {
            return this.button.text;
        }
    }

    public static class ButtonCustom extends Button {
        public static final int GIFT_OFFER_ACCEPT = 6;
        public static final int GIFT_OFFER_DECLINE = 5;
        public static final int OPEN_MESSAGE_THREAD = 4;
        public static final int SHARING_OFFER_ACCEPT = 8;
        public static final int SHARING_OFFER_DECLINE = 7;
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
        public int getIconRes() {
            return this.icon;
        }

        @Override
        public String getText() {
            return LocaleController.getString(this.text);
        }
    }

    public static class KeyboardSourceArray implements Source {
        private final Button[][] buttons;
        private final int separators;

        @Override
        public Button getButton(int i, int i2) {
            return this.buttons[i][i2];
        }

        @Override
        public int getColumnsCount(int i) {
            return this.buttons[i].length;
        }

        @Override
        public int getRowsCount() {
            return this.buttons.length;
        }

        @Override
        public boolean hasSeparator(int i) {
            return ((1 << i) & this.separators) != 0;
        }

        @Override
        public final boolean isEmpty() {
            return Source.CC.$default$isEmpty(this);
        }

        private KeyboardSourceArray(Button[][] buttonArr, int i) {
            this.buttons = buttonArr;
            this.separators = i;
        }
    }

    public interface Source {

        public abstract class CC {
            public static boolean $default$isEmpty(Source source) {
                return source.getRowsCount() == 0;
            }
        }

        Button getButton(int i, int i2);

        int getColumnsCount(int i);

        int getRowsCount();

        boolean hasSeparator(int i);

        boolean isEmpty();
    }
}
