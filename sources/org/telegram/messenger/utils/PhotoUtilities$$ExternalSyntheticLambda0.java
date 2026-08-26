package org.telegram.messenger.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import com.android.billingclient.api.zzcu;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda24;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5;
import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda8;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class PhotoUtilities$$ExternalSyntheticLambda0 implements SynchronizationGuard.CriticalSection, DelegatingScheduledFuture.Resolver, ImageUpdater.ImageUpdaterDelegate, StoryEntry.DecodeBitmap {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;

    public PhotoUtilities$$ExternalSyntheticLambda0(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = j;
        this.f$2 = obj3;
    }

    @Override
    public ScheduledFuture addCompleter(final zzcu zzcuVar) {
        switch (this.$r8$classId) {
            case 2:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = (DelegatingScheduledExecutorService) this.f$0;
                return delegatingScheduledExecutorService.scheduler.schedule(new DelegatingScheduledExecutorService$$ExternalSyntheticLambda5(delegatingScheduledExecutorService, (Runnable) this.f$1, zzcuVar, 1), this.f$3, (TimeUnit) this.f$2);
            default:
                final DelegatingScheduledExecutorService delegatingScheduledExecutorService2 = (DelegatingScheduledExecutorService) this.f$0;
                final Callable callable = (Callable) this.f$1;
                return delegatingScheduledExecutorService2.scheduler.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        DelegatingScheduledExecutorService delegatingScheduledExecutorService3 = delegatingScheduledExecutorService2;
                        return delegatingScheduledExecutorService3.delegate.submit(new ExoPlayerImpl$$ExternalSyntheticLambda24(29, callable, zzcuVar));
                    }
                }, this.f$3, (TimeUnit) this.f$2);
        }
    }

    @Override
    public boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public Bitmap decode(BitmapFactory.Options options) {
        long j = this.f$3;
        PreviewView previewView = (PreviewView) this.f$0;
        StoryEntry storyEntry = (StoryEntry) this.f$1;
        if (!storyEntry.isVideo) {
            return BitmapFactory.decodeFile((String) this.f$2, options);
        }
        String str = storyEntry.thumbPath;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(previewView.getContext().getContentResolver(), j, 1, options);
        } catch (Throwable unused) {
            previewView.invalidate();
            return null;
        }
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didStartUpload(this, z, z2);
    }

    @Override
    public void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f$1;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f$2;
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            fileLocationArr[0] = photoSize2.location;
            fileLocationArr2[0] = photoSize.location;
            return;
        }
        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
        if (inputFile != null) {
            tL_photos_uploadProfilePhoto.file = inputFile;
            tL_photos_uploadProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadProfilePhoto.video = inputFile2;
            int i = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        ChatActivity chatActivity = (ChatActivity) this.f$0;
        chatActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new PhotoUtilities$$ExternalSyntheticLambda2(chatActivity, fileLocationArr, str, fileLocationArr2, this.f$3));
    }

    @Override
    public Object execute() {
        Uploader uploader = (Uploader) this.f$0;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) uploader.eventStore;
        sQLiteEventStore.getClass();
        Iterable iterable = (Iterable) this.f$1;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + SQLiteEventStore.toIdList(iterable);
            SQLiteDatabase db = sQLiteEventStore.getDb();
            db.beginTransaction();
            try {
                db.compileStatement(str).execute();
                Cursor cursorRawQuery = db.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        sQLiteEventStore.recordLogEventDropped(cursorRawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                db.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                db.setTransactionSuccessful();
                db.endTransaction();
            } catch (Throwable th2) {
                db.endTransaction();
                throw th2;
            }
        }
        sQLiteEventStore.inTransaction(new LivePlayer$$ExternalSyntheticLambda8(uploader.clock.getTime() + this.f$3, (AutoValue_TransportContext) this.f$2));
        return null;
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    @Override
    public void onUploadProgressChanged(float f) {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$onUploadProgressChanged(this, f);
    }

    @Override
    public boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    public PhotoUtilities$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = j;
    }
}
