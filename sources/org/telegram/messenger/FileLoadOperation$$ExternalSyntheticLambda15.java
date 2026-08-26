package org.telegram.messenger;

import android.util.Pair;
import androidx.collection.LongSparseArray;
import com.android.billingclient.api.zzcl;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;

public final class FileLoadOperation$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;

    public FileLoadOperation$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = serializable;
        this.f$5 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoadOperation) this.f$0).lambda$onFinishLoadingFile$20((File) this.f$1, (File) this.f$2, (File) this.f$3, (File) this.f$4, this.f$5);
                break;
            case 1:
                DefaultAnalyticsCollector defaultAnalyticsCollector = ((MediaSourceList) ((zzcl) this.f$0).zzc).eventListener;
                Pair pair = (Pair) this.f$1;
                defaultAnalyticsCollector.onLoadError(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, (LoadEventInfo) this.f$2, (MediaLoadData) this.f$3, (IOException) this.f$4, this.f$5);
                break;
            case 2:
                MediaSourceEventListener.EventDispatcher eventDispatcher = (MediaSourceEventListener.EventDispatcher) this.f$0;
                ((MediaSourceEventListener) this.f$1).onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, (LoadEventInfo) this.f$2, (MediaLoadData) this.f$3, (IOException) this.f$4, this.f$5);
                break;
            case 3:
                ((ContactsController) this.f$0).lambda$mergePhonebookAndTelegramContacts$41(this.f$5, (ArrayList) this.f$1, (HashMap) this.f$2, (HashMap) this.f$3, (ArrayList) this.f$4);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.f$1, (LongSparseArray) this.f$2, (LongSparseArray) this.f$3, this.f$5, (LongSparseIntArray) this.f$4);
                break;
            case 5:
                ((SendMessagesHelper) this.f$0).lambda$requestUrlAuth$36((TLObject) this.f$1, (TLRPC.TL_messages_requestUrlAuth) this.f$2, (ChatActivity) this.f$3, (String) this.f$4, this.f$5);
                break;
            default:
                ((CameraController) this.f$0).lambda$recordVideo$13(this.f$2, (CameraController.ICameraView) this.f$3, (File) this.f$1, this.f$5, (Runnable) this.f$4);
                break;
        }
    }

    public FileLoadOperation$$ExternalSyntheticLambda15(ContactsController contactsController, boolean z, ArrayList arrayList, HashMap map, HashMap map2, ArrayList arrayList2) {
        this.$r8$classId = 3;
        this.f$0 = contactsController;
        this.f$5 = z;
        this.f$1 = arrayList;
        this.f$2 = map;
        this.f$3 = map2;
        this.f$4 = arrayList2;
    }

    public FileLoadOperation$$ExternalSyntheticLambda15(MessagesController messagesController, TLRPC.messages_Dialogs messages_dialogs, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, boolean z, LongSparseIntArray longSparseIntArray) {
        this.$r8$classId = 4;
        this.f$0 = messagesController;
        this.f$1 = messages_dialogs;
        this.f$2 = longSparseArray;
        this.f$3 = longSparseArray2;
        this.f$5 = z;
        this.f$4 = longSparseIntArray;
    }

    public FileLoadOperation$$ExternalSyntheticLambda15(CameraController cameraController, Object obj, CameraController.ICameraView iCameraView, File file, boolean z, Runnable runnable) {
        this.$r8$classId = 6;
        this.f$0 = cameraController;
        this.f$2 = obj;
        this.f$3 = iCameraView;
        this.f$1 = file;
        this.f$5 = z;
        this.f$4 = runnable;
    }
}
