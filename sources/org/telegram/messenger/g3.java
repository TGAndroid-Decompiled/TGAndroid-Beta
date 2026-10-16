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
public final class g3 implements Runnable {
    public final int f16982a;
    public final Object f16983b;
    public final Object f16984c;

    public g3(int i10, Object obj, Object obj2) {
        this.f16982a = i10;
        this.f16983b = obj;
        this.f16984c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16982a) {
            case 0:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f16983b, (FileLoaderPriorityQueue) this.f16984c);
                return;
            case 1:
                ((ImageLoader) this.f16983b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f16984c);
                return;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f16983b).lambda$onPostExecute$0((String) this.f16984c);
                return;
            case 3:
                ((ImageLoader.CacheOutTask) this.f16983b).lambda$onPostExecute$1((Drawable) this.f16984c);
                return;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f16983b).lambda$removeTask$0((String) this.f16984c);
                return;
            case 5:
                ((MediaController.AnonymousClass2) this.f16983b).lambda$run$0((ByteBuffer) this.f16984c);
                return;
            case 6:
                ((MediaController.AnonymousClass5) this.f16983b).lambda$run$1((MessageObject) this.f16984c);
                return;
            case 7:
                ((MediaController.MediaLoader) this.f16983b).lambda$addMessageToLoad$7((MessageObject) this.f16984c);
                return;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f16983b).lambda$run$0((ArrayList) this.f16984c);
                return;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f16983b).lambda$run$0((ArrayList) this.f16984c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f16983b).lambda$run$0((String) this.f16984c);
                return;
            case 11:
                ((BetaUpdaterController) this.f16983b).lambda$downloadUpdate$4((File) this.f16984c);
                return;
            case 12:
                BirthdayController.a((BirthdayController) this.f16983b, (TLObject) this.f16984c);
                return;
            case 13:
                ((ChatMessagesMetadataController) this.f16983b).lambda$loadStoriesForMessages$0((ArrayList) this.f16984c);
                return;
            case 14:
                ChatThemeController.lambda$getWallpaperBitmap$7((File) this.f16983b, (ResultCallback) this.f16984c);
                return;
            case 15:
                ((ResultCallback) this.f16983b).onComplete((Bitmap) this.f16984c);
                return;
            case 16:
                ((ChatThemeController) this.f16983b).lambda$processUpdate$14((TLRPC.ChatFull) this.f16984c);
                return;
            case 17:
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11((File) this.f16983b, (Utilities.Callback) this.f16984c);
                return;
            case 18:
                ((Utilities.Callback) this.f16983b).run((eg.a) this.f16984c);
                return;
            case 19:
                ((ChatThemeController) this.f16983b).lambda$requestNextChatThemes$20((ResultCallback) this.f16984c);
                return;
            case 20:
                ChatThemeController.lambda$saveWallpaperBitmap$8((File) this.f16983b, (Bitmap) this.f16984c);
                return;
            case 21:
                ((ContactsController) this.f16983b).lambda$addContact$50((TLRPC.User) this.f16984c);
                return;
            case 22:
                ((ContactsController) this.f16983b).lambda$deleteAllContacts$8((Runnable) this.f16984c);
                return;
            case 23:
                ((ContactsController) this.f16983b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f16984c);
                return;
            case 24:
                ((ContactsController) this.f16983b).lambda$applyContactsUpdates$46((Long) this.f16984c);
                return;
            case 25:
                ((ContactsController) this.f16983b).lambda$migratePhoneBookToV7$12((SparseArray) this.f16984c);
                return;
            case 26:
                ((ContactsController) this.f16983b).lambda$deleteContactsUndoable$53((HashMap) this.f16984c);
                return;
            case 27:
                ((DispatchQueuePoolBackground) this.f16983b).lambda$execute$0((DispatchQueue) this.f16984c);
                return;
            case 28:
                ((DownloadController) this.f16983b).lambda$deleteRecentFiles$13((ArrayList) this.f16984c);
                return;
            default:
                ((DownloadController) this.f16983b).lambda$loadAutoDownloadConfig$1((TLObject) this.f16984c);
                return;
        }
    }
}
