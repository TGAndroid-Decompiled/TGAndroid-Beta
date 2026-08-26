package org.telegram.messenger.voip;

import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.BusinessLinksController;

public final class VoIPService$$ExternalSyntheticLambda120 implements SynchronizationGuard.CriticalSection, ListenerSet.Event, NativeInstance.PayloadCallback, MediaDataController.KeywordResultCallback, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public VoIPService$$ExternalSyntheticLambda120(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = positionInfo;
        this.f$2 = positionInfo2;
    }

    @Override
    public Object execute() {
        ((Uploader) this.f$0).workScheduler.schedule((AutoValue_TransportContext) this.f$2, this.f$1 + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 2:
                Player.Listener listener = (Player.Listener) obj;
                int i = this.f$1;
                listener.onPositionDiscontinuity(i);
                listener.onPositionDiscontinuity((Player.PositionInfo) this.f$0, (Player.PositionInfo) this.f$2, i);
                break;
            default:
                ((AnalyticsListener) obj).onMediaItemTransition((AnalyticsListener.EventTime) this.f$0, (MediaItem) this.f$2, this.f$1);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        BusinessLinksActivity.AnonymousClass1 anonymousClass1 = (BusinessLinksActivity.AnonymousClass1) this.f$0;
        String string = anonymousClass1.getText().toString();
        if (string.length() > 32) {
            AndroidUtilities.shakeView(anonymousClass1);
            return;
        }
        BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.f$1);
        TL_account.TL_businessChatLink tL_businessChatLinkFindLink = businessLinksController.findLink(((TL_account.TL_businessChatLink) this.f$2).link);
        if (tL_businessChatLinkFindLink != null) {
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            tL_inputBusinessChatLink.message = tL_businessChatLinkFindLink.message;
            tL_inputBusinessChatLink.entities = tL_businessChatLinkFindLink.entities;
            tL_inputBusinessChatLink.title = string;
            businessLinksController.editLink(tL_businessChatLinkFindLink, tL_inputBusinessChatLink, null);
        }
        alertDialog.dismiss();
    }

    @Override
    public void run(int i, String str) {
        ((VoIPService) this.f$0).lambda$createGroupInstance$66(this.f$1, (boolean[]) this.f$2, i, str);
    }

    public VoIPService$$ExternalSyntheticLambda120(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        StickersSearchAdapter.AnonymousClass1 anonymousClass1 = (StickersSearchAdapter.AnonymousClass1) this.f$0;
        StickersSearchAdapter stickersSearchAdapter = StickersSearchAdapter.this;
        if (this.f$1 != stickersSearchAdapter.emojiSearchId) {
            return;
        }
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i)).emoji;
            HashMap map = (HashMap) this.f$2;
            ArrayList arrayList2 = map != null ? (ArrayList) map.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                anonymousClass1.clear();
                HashMap map2 = stickersSearchAdapter.emojiStickers;
                if (!map2.containsKey(arrayList2)) {
                    map2.put(arrayList2, str2);
                    stickersSearchAdapter.emojiArrays.add(arrayList2);
                    z = true;
                }
            }
        }
        if (z) {
            stickersSearchAdapter.notifyDataSetChanged();
        }
    }

    public VoIPService$$ExternalSyntheticLambda120(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }
}
