package org.telegram.messenger;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;
import java.io.IOException;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ChatActivity;

public final class SendMessagesHelper$$ExternalSyntheticLambda56 implements ListenerSet.Event, AlertDialog.OnButtonClickListener {
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public SendMessagesHelper$$ExternalSyntheticLambda56(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.f$0 = eventTime;
        this.f$2 = loadEventInfo;
        this.f$3 = mediaLoadData;
        this.f$4 = iOException;
        this.f$1 = z;
    }

    @Override
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadError((AnalyticsListener.EventTime) this.f$0, (LoadEventInfo) this.f$2, (MediaLoadData) this.f$3, (IOException) this.f$4, this.f$1);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ((SendMessagesHelper) this.f$0).lambda$sendCallback$41(this.f$1, (MessageObject) this.f$2, (TL_keyboard.KeyboardButtonProto) this.f$3, (ChatActivity) this.f$4, alertDialog, i);
    }

    public SendMessagesHelper$$ExternalSyntheticLambda56(SendMessagesHelper sendMessagesHelper, boolean z, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, ChatActivity chatActivity) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = z;
        this.f$2 = messageObject;
        this.f$3 = keyboardButtonProto;
        this.f$4 = chatActivity;
    }
}
