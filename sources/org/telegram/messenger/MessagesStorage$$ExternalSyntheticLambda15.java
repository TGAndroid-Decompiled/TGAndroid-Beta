package org.telegram.messenger;

import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.Theme;

public final class MessagesStorage$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;
    public final Object f$3;
    public final int f$4;

    public MessagesStorage$$ExternalSyntheticLambda15(int i, long j, long j2, ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2) {
        this.$r8$classId = 3;
        this.f$4 = i;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$0 = actionBarMenuSubItem;
        this.f$3 = actionBarMenuSubItem2;
    }

    @Override
    public final void run() {
        int color;
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$loadPendingTasks$20(this.f$1, this.f$2, (TLMethod) this.f$3, this.f$4);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$loadBotInfo$199(this.f$1, this.f$2, (Utilities.Callback) this.f$3, this.f$4);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$loadFullChat$67(this.f$1, (TLRPC.TL_messages_chatFull) this.f$3, this.f$4, this.f$2);
                break;
            default:
                int i = this.f$4;
                MessagesController messagesController = MessagesController.getInstance(i);
                long j = this.f$1;
                long j2 = this.f$2;
                boolean zIsDialogMuted = messagesController.isDialogMuted(j, j2);
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) this.f$0;
                ActionBarMenuSubItem actionBarMenuSubItem2 = (ActionBarMenuSubItem) this.f$3;
                if (zIsDialogMuted) {
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGreenText2, false);
                    actionBarMenuSubItem2.setVisibility(8);
                } else {
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
                    actionBarMenuSubItem2.setVisibility(0);
                    if (MessagesController.getInstance(i).isDialogNotificationsSoundEnabled(j, j2)) {
                        actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    color = color2;
                }
                actionBarMenuSubItem.setTextColor(color);
                actionBarMenuSubItem.setIconColor(color);
                actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(0.1f, color));
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda15(BaseController baseController, long j, long j2, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = obj;
        this.f$4 = i;
    }

    public MessagesStorage$$ExternalSyntheticLambda15(MessagesController messagesController, long j, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i, long j2) {
        this.$r8$classId = 2;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$3 = tL_messages_chatFull;
        this.f$4 = i;
        this.f$2 = j2;
    }
}
