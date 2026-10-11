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
public final class d3 implements Runnable {
    public final int f17648a;
    public final Object f17649b;
    public final Object f17650c;

    public d3(int i10, Object obj, Object obj2) {
        this.f17648a = i10;
        this.f17649b = obj;
        this.f17650c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17648a) {
            case 0:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f17649b, (FileLoaderPriorityQueue) this.f17650c);
                return;
            case 1:
                ((ImageLoader) this.f17649b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f17650c);
                return;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f17649b).lambda$onPostExecute$0((String) this.f17650c);
                return;
            case 3:
                ((ImageLoader.CacheOutTask) this.f17649b).lambda$onPostExecute$1((Drawable) this.f17650c);
                return;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f17649b).lambda$removeTask$0((String) this.f17650c);
                return;
            case 5:
                ((MediaController.AnonymousClass2) this.f17649b).lambda$run$0((ByteBuffer) this.f17650c);
                return;
            case 6:
                ((MediaController.AnonymousClass5) this.f17649b).lambda$run$1((MessageObject) this.f17650c);
                return;
            case 7:
                ((MediaController.MediaLoader) this.f17649b).lambda$addMessageToLoad$7((MessageObject) this.f17650c);
                return;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f17649b).lambda$run$0((ArrayList) this.f17650c);
                return;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f17649b).lambda$run$0((ArrayList) this.f17650c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f17649b).lambda$run$0((String) this.f17650c);
                return;
            case 11:
                ((BetaUpdaterController) this.f17649b).lambda$downloadUpdate$4((File) this.f17650c);
                return;
            case 12:
                BirthdayController.a((BirthdayController) this.f17649b, (TLObject) this.f17650c);
                return;
            case 13:
                ((ChatMessagesMetadataController) this.f17649b).lambda$loadStoriesForMessages$0((ArrayList) this.f17650c);
                return;
            case 14:
                ChatThemeController.lambda$getWallpaperBitmap$7((File) this.f17649b, (ResultCallback) this.f17650c);
                return;
            case 15:
                ((ResultCallback) this.f17649b).onComplete((Bitmap) this.f17650c);
                return;
            case 16:
                ((ChatThemeController) this.f17649b).lambda$processUpdate$14((TLRPC.ChatFull) this.f17650c);
                return;
            case 17:
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11((File) this.f17649b, (Utilities.Callback) this.f17650c);
                return;
            case 18:
                ((Utilities.Callback) this.f17649b).run((dg.a) this.f17650c);
                return;
            case 19:
                ((ChatThemeController) this.f17649b).lambda$requestNextChatThemes$20((ResultCallback) this.f17650c);
                return;
            case 20:
                ChatThemeController.lambda$saveWallpaperBitmap$8((File) this.f17649b, (Bitmap) this.f17650c);
                return;
            case 21:
                ((ContactsController) this.f17649b).lambda$addContact$50((TLRPC.User) this.f17650c);
                return;
            case 22:
                ((ContactsController) this.f17649b).lambda$deleteAllContacts$8((Runnable) this.f17650c);
                return;
            case 23:
                ((ContactsController) this.f17649b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f17650c);
                return;
            case 24:
                ((ContactsController) this.f17649b).lambda$applyContactsUpdates$46((Long) this.f17650c);
                return;
            case 25:
                ((ContactsController) this.f17649b).lambda$migratePhoneBookToV7$12((SparseArray) this.f17650c);
                return;
            case 26:
                ((ContactsController) this.f17649b).lambda$deleteContactsUndoable$53((HashMap) this.f17650c);
                return;
            case 27:
                ((DispatchQueuePoolBackground) this.f17649b).lambda$execute$0((DispatchQueue) this.f17650c);
                return;
            case 28:
                ((DownloadController) this.f17649b).lambda$deleteRecentFiles$13((ArrayList) this.f17650c);
                return;
            default:
                ((DownloadController) this.f17649b).lambda$loadAutoDownloadConfig$1((TLObject) this.f17650c);
                return;
        }
    }
}
