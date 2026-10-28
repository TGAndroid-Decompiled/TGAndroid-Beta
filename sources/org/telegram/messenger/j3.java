package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f20400a;
    public final Object f20401b;
    public final Object f20402c;

    public j3(int i10, Object obj, Object obj2) {
        this.f20400a = i10;
        this.f20401b = obj;
        this.f20402c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20400a) {
            case 0:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f20401b, (FileLoaderPriorityQueue) this.f20402c);
                return;
            case 1:
                ((ImageLoader) this.f20401b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f20402c);
                return;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f20401b).lambda$onPostExecute$0((String) this.f20402c);
                return;
            case 3:
                ((ImageLoader.CacheOutTask) this.f20401b).lambda$onPostExecute$1((Drawable) this.f20402c);
                return;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f20401b).lambda$removeTask$0((String) this.f20402c);
                return;
            case 5:
                ((MediaController.AnonymousClass2) this.f20401b).lambda$run$0((ByteBuffer) this.f20402c);
                return;
            case 6:
                ((MediaController.AnonymousClass5) this.f20401b).lambda$run$1((MessageObject) this.f20402c);
                return;
            case 7:
                ((MediaController.MediaLoader) this.f20401b).lambda$addMessageToLoad$7((MessageObject) this.f20402c);
                return;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f20401b).lambda$run$0((ArrayList) this.f20402c);
                return;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f20401b).lambda$run$0((ArrayList) this.f20402c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f20401b).lambda$run$0((String) this.f20402c);
                return;
            case 11:
                ((BetaUpdaterController) this.f20401b).lambda$downloadUpdate$4((File) this.f20402c);
                return;
            case 12:
                BirthdayController.a((BirthdayController) this.f20401b, (TLObject) this.f20402c);
                return;
            case 13:
                ChatMessagesMetadataController.a((ChatMessagesMetadataController) this.f20401b, (ArrayList) this.f20402c);
                return;
            case 14:
                ChatThemeController.lambda$getWallpaperBitmap$7((File) this.f20401b, (ResultCallback) this.f20402c);
                return;
            case 15:
                ((ResultCallback) this.f20401b).onComplete((Bitmap) this.f20402c);
                return;
            case 16:
                ((ChatThemeController) this.f20401b).lambda$processUpdate$14((TLRPC.ChatFull) this.f20402c);
                return;
            case 17:
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11((File) this.f20401b, (Utilities.Callback) this.f20402c);
                return;
            case 18:
                ((Utilities.Callback) this.f20401b).run((fg.a) this.f20402c);
                return;
            case 19:
                ((ChatThemeController) this.f20401b).lambda$requestNextChatThemes$20((ResultCallback) this.f20402c);
                return;
            case 20:
                ChatThemeController.lambda$saveWallpaperBitmap$8((File) this.f20401b, (Bitmap) this.f20402c);
                return;
            case 21:
                ((ContactsController) this.f20401b).lambda$addContact$50((TLRPC.User) this.f20402c);
                return;
            case 22:
                ((ContactsController) this.f20401b).lambda$deleteAllContacts$8((Runnable) this.f20402c);
                return;
            case 23:
                ((ContactsController) this.f20401b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f20402c);
                return;
            case 24:
                ((ContactsController) this.f20401b).lambda$applyContactsUpdates$46((Long) this.f20402c);
                return;
            case 25:
                ((ContactsController) this.f20401b).lambda$migratePhoneBookToV7$12((SparseArray) this.f20402c);
                return;
            case 26:
                ((ContactsController) this.f20401b).lambda$deleteContactsUndoable$53((HashMap) this.f20402c);
                return;
            case 27:
                ((DispatchQueuePoolBackground) this.f20401b).lambda$execute$0((DispatchQueue) this.f20402c);
                return;
            case 28:
                ((DownloadController) this.f20401b).lambda$deleteRecentFiles$13((ArrayList) this.f20402c);
                return;
            default:
                ((DownloadController) this.f20401b).lambda$loadAutoDownloadConfig$1((TLObject) this.f20402c);
                return;
        }
    }
}
