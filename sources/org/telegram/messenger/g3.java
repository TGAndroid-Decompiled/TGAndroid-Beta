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
    public final int f18410a;
    public final Object f18411b;
    public final Object f18412c;

    public g3(int i10, Object obj, Object obj2) {
        this.f18410a = i10;
        this.f18411b = obj;
        this.f18412c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18410a) {
            case 0:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f18411b, (FileLoaderPriorityQueue) this.f18412c);
                return;
            case 1:
                ((ImageLoader) this.f18411b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f18412c);
                return;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f18411b).lambda$onPostExecute$0((String) this.f18412c);
                return;
            case 3:
                ((ImageLoader.CacheOutTask) this.f18411b).lambda$onPostExecute$1((Drawable) this.f18412c);
                return;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f18411b).lambda$removeTask$0((String) this.f18412c);
                return;
            case 5:
                ((MediaController.AnonymousClass2) this.f18411b).lambda$run$0((ByteBuffer) this.f18412c);
                return;
            case 6:
                ((MediaController.AnonymousClass5) this.f18411b).lambda$run$1((MessageObject) this.f18412c);
                return;
            case 7:
                ((MediaController.MediaLoader) this.f18411b).lambda$addMessageToLoad$7((MessageObject) this.f18412c);
                return;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f18411b).lambda$run$0((ArrayList) this.f18412c);
                return;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f18411b).lambda$run$0((ArrayList) this.f18412c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f18411b).lambda$run$0((String) this.f18412c);
                return;
            case 11:
                ((BetaUpdaterController) this.f18411b).lambda$downloadUpdate$4((File) this.f18412c);
                return;
            case 12:
                BirthdayController.a((BirthdayController) this.f18411b, (TLObject) this.f18412c);
                return;
            case 13:
                ((ChatMessagesMetadataController) this.f18411b).lambda$loadStoriesForMessages$0((ArrayList) this.f18412c);
                return;
            case 14:
                ChatThemeController.lambda$getWallpaperBitmap$7((File) this.f18411b, (ResultCallback) this.f18412c);
                return;
            case 15:
                ((ResultCallback) this.f18411b).onComplete((Bitmap) this.f18412c);
                return;
            case 16:
                ((ChatThemeController) this.f18411b).lambda$processUpdate$14((TLRPC.ChatFull) this.f18412c);
                return;
            case 17:
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11((File) this.f18411b, (Utilities.Callback) this.f18412c);
                return;
            case 18:
                ((Utilities.Callback) this.f18411b).run((eg.a) this.f18412c);
                return;
            case 19:
                ((ChatThemeController) this.f18411b).lambda$requestNextChatThemes$20((ResultCallback) this.f18412c);
                return;
            case 20:
                ChatThemeController.lambda$saveWallpaperBitmap$8((File) this.f18411b, (Bitmap) this.f18412c);
                return;
            case 21:
                ((ContactsController) this.f18411b).lambda$addContact$50((TLRPC.User) this.f18412c);
                return;
            case 22:
                ((ContactsController) this.f18411b).lambda$deleteAllContacts$8((Runnable) this.f18412c);
                return;
            case 23:
                ((ContactsController) this.f18411b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f18412c);
                return;
            case 24:
                ((ContactsController) this.f18411b).lambda$applyContactsUpdates$46((Long) this.f18412c);
                return;
            case 25:
                ((ContactsController) this.f18411b).lambda$migratePhoneBookToV7$12((SparseArray) this.f18412c);
                return;
            case 26:
                ((ContactsController) this.f18411b).lambda$deleteContactsUndoable$53((HashMap) this.f18412c);
                return;
            case 27:
                ((DispatchQueuePoolBackground) this.f18411b).lambda$execute$0((DispatchQueue) this.f18412c);
                return;
            case 28:
                ((DownloadController) this.f18411b).lambda$deleteRecentFiles$13((ArrayList) this.f18412c);
                return;
            default:
                ((DownloadController) this.f18411b).lambda$loadAutoDownloadConfig$1((TLObject) this.f18412c);
                return;
        }
    }
}
