package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.SparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ImageLoader$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ImageLoader$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ImageLoader) this.f$0).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f$1);
                break;
            case 1:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f$0, (FileLoaderPriorityQueue) this.f$1);
                break;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f$0).lambda$onPostExecute$0((String) this.f$1);
                break;
            case 3:
                ((ImageLoader.CacheOutTask) this.f$0).lambda$onPostExecute$1((Drawable) this.f$1);
                break;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f$0).lambda$removeTask$0((String) this.f$1);
                break;
            case 5:
                ((MediaController.AnonymousClass2) this.f$0).lambda$run$0((ByteBuffer) this.f$1);
                break;
            case 6:
                ((MediaController.AnonymousClass5) this.f$0).lambda$run$1((MessageObject) this.f$1);
                break;
            case 7:
                ((MediaController.MediaLoader) this.f$0).lambda$addMessageToLoad$7((MessageObject) this.f$1);
                break;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f$0).lambda$run$0((ArrayList) this.f$1);
                break;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f$0).lambda$run$0((ArrayList) this.f$1);
                break;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f$0).lambda$run$0((String) this.f$1);
                break;
            case 11:
                ((BetaUpdaterController) this.f$0).lambda$downloadUpdate$4((File) this.f$1);
                break;
            case 12:
                ((BirthdayController) this.f$0).lambda$check$2((TLObject) this.f$1);
                break;
            case 13:
                ((ChatMessagesMetadataController) this.f$0).lambda$loadStoriesForMessages$0((ArrayList) this.f$1);
                break;
            case 14:
                ChatThemeController.lambda$getWallpaperBitmap$7((File) this.f$0, (ResultCallback) this.f$1);
                break;
            case 15:
                ((ResultCallback) this.f$0).onComplete((Bitmap) this.f$1);
                break;
            case 16:
                ((ChatThemeController) this.f$0).lambda$processUpdate$14((TLRPC.ChatFull) this.f$1);
                break;
            case 17:
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11((File) this.f$0, (Utilities.Callback) this.f$1);
                break;
            case 18:
                ((Utilities.Callback) this.f$0).run((WallpaperBitmapHolder) this.f$1);
                break;
            case 19:
                ((ChatThemeController) this.f$0).lambda$requestNextChatThemes$20((ResultCallback) this.f$1);
                break;
            case 20:
                ChatThemeController.lambda$saveWallpaperBitmap$8((File) this.f$0, (Bitmap) this.f$1);
                break;
            case 21:
                CodeHighlighting.lambda$highlight$4((ArrayList) this.f$0, (Spannable) this.f$1);
                break;
            case 22:
                ((ContactsController) this.f$0).lambda$addContact$50((TLRPC.User) this.f$1);
                break;
            case 23:
                ((ContactsController) this.f$0).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f$1);
                break;
            case 24:
                ((ContactsController) this.f$0).lambda$deleteAllContacts$8((Runnable) this.f$1);
                break;
            case 25:
                ((ContactsController) this.f$0).lambda$applyContactsUpdates$46((Long) this.f$1);
                break;
            case 26:
                ((ContactsController) this.f$0).lambda$migratePhoneBookToV7$12((SparseArray) this.f$1);
                break;
            case 27:
                ((ContactsController) this.f$0).lambda$deleteContactsUndoable$53((HashMap) this.f$1);
                break;
            case 28:
                ((DispatchQueuePoolBackground) this.f$0).lambda$execute$0((DispatchQueue) this.f$1);
                break;
            default:
                ((DownloadController) this.f$0).lambda$loadAutoDownloadConfig$1((TLObject) this.f$1);
                break;
        }
    }
}
