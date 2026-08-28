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
            for (int i9 = 0; i9 < tL_replyInlineMarkup.rows.size(); i9++) {
                ArrayList<TL_keyboard.KeyboardInlineButton> arrayList = tL_replyInlineMarkup.rows.get(i9).buttons;
                ButtonBot[] buttonBotArr = new ButtonBot[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    buttonBotArr[i10] = new ButtonBot(arrayList.get(i10));
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
            if (source != null) {
                int rowsCount = source.getRowsCount();
                for (int i9 = 0; i9 < rowsCount; i9++) {
                    int columnsCount = source.getColumnsCount(i9);
                    Button[] buttonArr = new Button[columnsCount];
                    for (int i10 = 0; i10 < columnsCount; i10++) {
                        buttonArr[i10] = source.getButton(i9, i10);
                    }
                    this.buttons.add(buttonArr);
                    if (source.hasSeparator(i9)) {
                        addSeparator();
                    }
                }
            }
        }

        public void addSeparator() {
            if (!this.buttons.isEmpty()) {
                this.separators |= 1 << (this.buttons.size() - 1);
            }
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
            return new KeyboardSourceArray((Button[][]) arrayList.toArray(new Button[arrayList.size()]), this.separators);
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
        public final int f19635id;
        public final int text;

        public ButtonCustom(int i9, int i10, int i11) {
            this.f19635id = i9;
            this.text = i10;
            this.icon = i11;
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
        public Button getButton(int i9, int i10) {
            return this.buttons[i9][i10];
        }

        @Override
        public int getColumnsCount(int i9) {
            return this.buttons[i9].length;
        }

        @Override
        public int getRowsCount() {
            return this.buttons.length;
        }

        @Override
        public boolean hasSeparator(int i9) {
            if (((1 << i9) & this.separators) != 0) {
                return true;
            }
            return false;
        }

        @Override
        public final boolean isEmpty() {
            return n0.a(this);
        }

        private KeyboardSourceArray(Button[][] buttonArr, int i9) {
            this.buttons = buttonArr;
            this.separators = i9;
        }
    }

    public interface Source {
        Button getButton(int i9, int i10);

        int getColumnsCount(int i9);

        int getRowsCount();

        boolean hasSeparator(int i9);

        boolean isEmpty();
    }
}
