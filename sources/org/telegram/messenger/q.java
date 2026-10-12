package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q implements Runnable {
    public final int f18622a;
    public final Object f18623b;
    public final Object f18624c;

    public q(int i10, Object obj, Object obj2) {
        this.f18622a = i10;
        this.f18623b = obj;
        this.f18624c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18622a) {
            case 0:
                AudioRecorderV2Controller.lambda$runOnMainThreadAndWait$0((Runnable) this.f18623b, (CountDownLatch) this.f18624c);
                return;
            case 1:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f18623b, (FileLoaderPriorityQueue) this.f18624c);
                return;
            case 2:
                ((ImageLoader) this.f18623b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f18624c);
                return;
            case 3:
                ((ImageLoader.ArtworkLoadTask) this.f18623b).lambda$onPostExecute$0((String) this.f18624c);
                return;
            case 4:
                ((ImageLoader.CacheOutTask) this.f18623b).lambda$onPostExecute$1((Drawable) this.f18624c);
                return;
            case 5:
                ((ImageLoader.ThumbGenerateTask) this.f18623b).lambda$removeTask$0((String) this.f18624c);
                return;
            case 6:
                ((MediaController.AnonymousClass2) this.f18623b).lambda$run$0((ByteBuffer) this.f18624c);
                return;
            case 7:
                ((MediaController.AnonymousClass5) this.f18623b).lambda$run$1((MessageObject) this.f18624c);
                return;
            case 8:
                ((MediaController.MediaLoader) this.f18623b).lambda$addMessageToLoad$7((MessageObject) this.f18624c);
                return;
            case 9:
                ((MediaDataController.AnonymousClass2) this.f18623b).lambda$run$0((ArrayList) this.f18624c);
                return;
            case 10:
                ((MediaDataController.AnonymousClass3) this.f18623b).lambda$run$0((ArrayList) this.f18624c);
                return;
            case 11:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f18623b).lambda$run$0((String) this.f18624c);
                return;
            case 12:
                ((BetaUpdaterController) this.f18623b).lambda$downloadUpdate$4((File) this.f18624c);
                return;
            case 13:
                BirthdayController.a((BirthdayController) this.f18623b, (TLObject) this.f18624c);
                return;
            case 14:
                ((ChatMessagesMetadataController) this.f18623b).lambda$loadStoriesForMessages$0((ArrayList) this.f18624c);
                return;
            case 15:
                ChatThemeController.lambda$getWallpaperBitmap$7((File) this.f18623b, (ResultCallback) this.f18624c);
                return;
            case 16:
                ((ResultCallback) this.f18623b).onComplete((Bitmap) this.f18624c);
                return;
            case 17:
                ((ChatThemeController) this.f18623b).lambda$processUpdate$14((TLRPC.ChatFull) this.f18624c);
                return;
            case 18:
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11((File) this.f18623b, (Utilities.Callback) this.f18624c);
                return;
            case 19:
                ((Utilities.Callback) this.f18623b).run((dg.a) this.f18624c);
                return;
            case 20:
                ((ChatThemeController) this.f18623b).lambda$requestNextChatThemes$20((ResultCallback) this.f18624c);
                return;
            case 21:
                ChatThemeController.lambda$saveWallpaperBitmap$8((File) this.f18623b, (Bitmap) this.f18624c);
                return;
            case 22:
                ((ContactsController) this.f18623b).lambda$addContact$50((TLRPC.User) this.f18624c);
                return;
            case 23:
                ((ContactsController) this.f18624c).lambda$deleteAllContacts$8((Runnable) this.f18623b);
                return;
            case 24:
                ((ContactsController) this.f18623b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f18624c);
                return;
            case 25:
                ((ContactsController) this.f18623b).lambda$applyContactsUpdates$46((Long) this.f18624c);
                return;
            case 26:
                ((ContactsController) this.f18623b).lambda$migratePhoneBookToV7$12((SparseArray) this.f18624c);
                return;
            case 27:
                ((ContactsController) this.f18623b).lambda$deleteContactsUndoable$53((HashMap) this.f18624c);
                return;
            case 28:
                ((DispatchQueuePoolBackground) this.f18623b).lambda$execute$0((DispatchQueue) this.f18624c);
                return;
            default:
                ((DownloadController) this.f18623b).lambda$deleteRecentFiles$13((ArrayList) this.f18624c);
                return;
        }
    }

    public q(ContactsController contactsController, Runnable runnable) {
        this.f18622a = 23;
        this.f18624c = contactsController;
        this.f18623b = runnable;
    }
}
