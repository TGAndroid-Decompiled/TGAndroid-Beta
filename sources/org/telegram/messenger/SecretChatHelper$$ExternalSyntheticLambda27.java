package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class SecretChatHelper$$ExternalSyntheticLambda27 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseController f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public SecretChatHelper$$ExternalSyntheticLambda27(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((SecretChatHelper) this.f$0).lambda$startSecretChat$28((Context) this.f$1, (AlertDialog) this.f$2, (byte[]) this.f$3, (TLRPC.User) this.f$4, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$checkCanOpenChat$452((AlertDialog) this.f$2, (Browser.Progress) this.f$1, (BaseFragment) this.f$3, (Bundle) this.f$4, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f$1, (Theme.ThemeInfo) this.f$2, (TLRPC.TL_inputThemeSettings) this.f$3, (Theme.ThemeAccent) this.f$4, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f$1, (SendMessagesHelper.DelayedMessage) this.f$2, (String) this.f$3, (MessageObject) this.f$4, tLObject, tL_error);
                break;
        }
    }

    public SecretChatHelper$$ExternalSyntheticLambda27(MessagesController messagesController, AlertDialog alertDialog, Browser.Progress progress, BaseFragment baseFragment, Bundle bundle) {
        this.$r8$classId = 1;
        this.f$0 = messagesController;
        this.f$2 = alertDialog;
        this.f$1 = progress;
        this.f$3 = baseFragment;
        this.f$4 = bundle;
    }
}
