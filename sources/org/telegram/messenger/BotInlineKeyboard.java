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
            for (int i10 = 0; i10 < tL_replyInlineMarkup.rows.size(); i10++) {
                ArrayList<TL_keyboard.KeyboardInlineButton> arrayList = tL_replyInlineMarkup.rows.get(i10).buttons;
                ButtonBot[] buttonBotArr = new ButtonBot[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    buttonBotArr[i11] = new ButtonBot(arrayList.get(i11));
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
                for (int i10 = 0; i10 < rowsCount; i10++) {
                    int columnsCount = source.getColumnsCount(i10);
                    Button[] buttonArr = new Button[columnsCount];
                    for (int i11 = 0; i11 < columnsCount; i11++) {
                        buttonArr[i11] = source.getButton(i10, i11);
                    }
                    this.buttons.add(buttonArr);
                    if (source.hasSeparator(i10)) {
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
        public final int f19606id;
        public final int text;

        public ButtonCustom(int i10, int i11, int i12) {
            this.f19606id = i10;
            this.text = i11;
            this.icon = i12;
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
        public Button getButton(int i10, int i11) {
            return this.buttons[i10][i11];
        }

        @Override
        public int getColumnsCount(int i10) {
            return this.buttons[i10].length;
        }

        @Override
        public int getRowsCount() {
            return this.buttons.length;
        }

        @Override
        public boolean hasSeparator(int i10) {
            if (((1 << i10) & this.separators) != 0) {
                return true;
            }
            return false;
        }

        @Override
        public final boolean isEmpty() {
            return m0.a(this);
        }

        private KeyboardSourceArray(Button[][] buttonArr, int i10) {
            this.buttons = buttonArr;
            this.separators = i10;
        }
    }

    public interface Source {
        Button getButton(int i10, int i11);

        int getColumnsCount(int i10);

        int getRowsCount();

        boolean hasSeparator(int i10);

        boolean isEmpty();
    }
}
