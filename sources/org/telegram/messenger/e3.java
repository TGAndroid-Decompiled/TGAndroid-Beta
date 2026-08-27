package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.SparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class e3 implements Runnable {

    public final int f20099a;

    public final Object f20100b;

    public final Object f20101c;

    public e3(int i10, Object obj, Object obj2) {
        this.f20099a = i10;
        this.f20100b = obj;
        this.f20101c = obj2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20099a) {
            case 0:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f20100b, (FileLoaderPriorityQueue) this.f20101c);
                break;
            case 1:
                ((ImageLoader) this.f20100b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f20101c);
                break;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f20100b).lambda$onPostExecute$0((String) this.f20101c);
                break;
            case 3:
                ((ImageLoader.CacheOutTask) this.f20100b).lambda$onPostExecute$1((Drawable) this.f20101c);
                break;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f20100b).lambda$removeTask$0((String) this.f20101c);
                break;
            case 5:
                ((MediaController.AnonymousClass2) this.f20100b).lambda$run$0((ByteBuffer) this.f20101c);
                break;
            case 6:
                ((MediaController.AnonymousClass5) this.f20100b).lambda$run$1((MessageObject) this.f20101c);
                break;
            case 7:
                ((MediaController.MediaLoader) this.f20100b).lambda$addMessageToLoad$7((MessageObject) this.f20101c);
                break;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f20100b).lambda$run$0((ArrayList) this.f20101c);
                break;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f20100b).lambda$run$0((ArrayList) this.f20101c);
                break;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f20100b).lambda$run$0((String) this.f20101c);
                break;
            case 11:
                ((BetaUpdaterController) this.f20100b).lambda$downloadUpdate$4((File) this.f20101c);
                break;
            case 12:
                ((BirthdayController) this.f20100b).lambda$check$2((TLObject) this.f20101c);
                break;
            case 13:
                ((ChatMessagesMetadataController) this.f20100b).lambda$loadStoriesForMessages$0((ArrayList) this.f20101c);
                break;
            case 14:
                ChatThemeController.lambda$getWallpaperBitmap$7((File) this.f20100b, (ResultCallback) this.f20101c);
                break;
            case 15:
                ((ResultCallback) this.f20100b).onComplete((Bitmap) this.f20101c);
                break;
            case 16:
                ((ChatThemeController) this.f20100b).lambda$processUpdate$14((TLRPC.ChatFull) this.f20101c);
                break;
            case 17:
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11((File) this.f20100b, (Utilities.Callback) this.f20101c);
                break;
            case 18:
                ((Utilities.Callback) this.f20100b).run((mf.a) this.f20101c);
                break;
            case 19:
                ((ChatThemeController) this.f20100b).lambda$requestNextChatThemes$20((ResultCallback) this.f20101c);
                break;
            case 20:
                ChatThemeController.lambda$saveWallpaperBitmap$8((File) this.f20100b, (Bitmap) this.f20101c);
                break;
            case 21:
                CodeHighlighting.lambda$highlight$4((ArrayList) this.f20100b, (Spannable) this.f20101c);
                break;
            case 22:
                ((ContactsController) this.f20100b).lambda$addContact$50((TLRPC.User) this.f20101c);
                break;
            case 23:
                ((ContactsController) this.f20100b).lambda$deleteAllContacts$8((Runnable) this.f20101c);
                break;
            case 24:
                ((ContactsController) this.f20100b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f20101c);
                break;
            case 25:
                ((ContactsController) this.f20100b).lambda$applyContactsUpdates$46((Long) this.f20101c);
                break;
            case 26:
                ((ContactsController) this.f20100b).lambda$migratePhoneBookToV7$12((SparseArray) this.f20101c);
                break;
            case 27:
                ((ContactsController) this.f20100b).lambda$deleteContactsUndoable$53((HashMap) this.f20101c);
                break;
            case 28:
                ((DispatchQueuePoolBackground) this.f20100b).lambda$execute$0((DispatchQueue) this.f20101c);
                break;
            default:
                ((DownloadController) this.f20100b).lambda$deleteRecentFiles$13((ArrayList) this.f20101c);
                break;
        }
    }
}
