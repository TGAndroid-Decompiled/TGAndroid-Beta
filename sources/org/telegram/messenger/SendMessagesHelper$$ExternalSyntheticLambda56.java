package org.telegram.messenger;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda52;
import org.telegram.ui.ThemeActivity;

public final class SendMessagesHelper$$ExternalSyntheticLambda56 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public SendMessagesHelper$$ExternalSyntheticLambda56(SendMessagesHelper sendMessagesHelper, boolean z, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, ChatActivity chatActivity) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = z;
        this.f$2 = messageObject;
        this.f$3 = keyboardButtonProto;
        this.f$4 = chatActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        TL_account.contentSettings contentsettings;
        boolean z = this.f$1;
        Object obj = this.f$4;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f$1, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (ChatActivity) obj, alertDialog, i);
                break;
            case 1:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) obj4;
                chatMessageCellDelegate.getClass();
                ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21 = new ArticleViewer$$ExternalSyntheticLambda21(17, chatMessageCellDelegate, (ChatMessageCell) obj3);
                if (!((boolean[]) obj2)[0]) {
                    articleViewer$$ExternalSyntheticLambda21.run(Boolean.FALSE);
                } else if (!z && ((contentsettings = (TL_account.contentSettings) obj) == null || !contentsettings.sensitive_can_change)) {
                    articleViewer$$ExternalSyntheticLambda21.run(Boolean.TRUE);
                } else {
                    ChatActivity chatActivity = ChatActivity.this;
                    ThemeActivity.verifyAge(((BaseFragment) chatActivity).currentAccount, chatActivity.getParentActivity(), new ArticleViewer$$ExternalSyntheticLambda21(18, chatMessageCellDelegate, articleViewer$$ExternalSyntheticLambda21), chatActivity.getResourceProvider());
                }
                break;
            default:
                NumberPicker numberPicker = (NumberPicker) obj4;
                NumberPicker numberPicker2 = (NumberPicker) obj3;
                NumberPicker numberPicker3 = (NumberPicker) obj2;
                if (z) {
                    AlertsCreator.checkPickerDate(numberPicker, numberPicker2, numberPicker3);
                }
                int value = numberPicker3.getValue();
                int value2 = numberPicker2.getValue();
                int value3 = numberPicker.getValue();
                PassportActivity$$ExternalSyntheticLambda52 passportActivity$$ExternalSyntheticLambda52 = (PassportActivity$$ExternalSyntheticLambda52) obj;
                PassportActivity passportActivity = (PassportActivity) passportActivity$$ExternalSyntheticLambda52.f$0;
                if (passportActivity$$ExternalSyntheticLambda52.f$1 == 8) {
                    int[] iArr = passportActivity.currentExpireDate;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    passportActivity.getClass();
                }
                ((EditTextBoldCursor) passportActivity$$ExternalSyntheticLambda52.f$2).setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public SendMessagesHelper$$ExternalSyntheticLambda56(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean[] zArr, boolean z, TL_account.contentSettings contentsettings) {
        this.f$0 = chatMessageCellDelegate;
        this.f$2 = chatMessageCell;
        this.f$3 = zArr;
        this.f$1 = z;
        this.f$4 = contentsettings;
    }

    public SendMessagesHelper$$ExternalSyntheticLambda56(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, PassportActivity$$ExternalSyntheticLambda52 passportActivity$$ExternalSyntheticLambda52) {
        this.f$1 = z;
        this.f$0 = numberPicker;
        this.f$2 = numberPicker2;
        this.f$3 = numberPicker3;
        this.f$4 = passportActivity$$ExternalSyntheticLambda52;
    }
}
