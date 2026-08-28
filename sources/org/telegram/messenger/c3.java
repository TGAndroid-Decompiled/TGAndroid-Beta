package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
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
public final class c3 implements Runnable {
    public final int f19908a;
    public final Object f19909b;
    public final Object f19910c;

    public c3(int i9, Object obj, Object obj2) {
        this.f19908a = i9;
        this.f19909b = obj;
        this.f19910c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19908a) {
            case 0:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f19909b, (FileLoaderPriorityQueue) this.f19910c);
                return;
            case 1:
                ((ImageLoader) this.f19909b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f19910c);
                return;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f19909b).lambda$onPostExecute$0((String) this.f19910c);
                return;
            case 3:
                ((ImageLoader.CacheOutTask) this.f19909b).lambda$onPostExecute$1((Drawable) this.f19910c);
                return;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f19909b).lambda$removeTask$0((String) this.f19910c);
                return;
            case 5:
                ((MediaController.AnonymousClass2) this.f19909b).lambda$run$0((ByteBuffer) this.f19910c);
                return;
            case 6:
                ((MediaController.AnonymousClass5) this.f19909b).lambda$run$1((MessageObject) this.f19910c);
                return;
            case 7:
                ((MediaController.MediaLoader) this.f19909b).lambda$addMessageToLoad$7((MessageObject) this.f19910c);
                return;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f19909b).lambda$run$0((ArrayList) this.f19910c);
                return;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f19909b).lambda$run$0((ArrayList) this.f19910c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f19909b).lambda$run$0((String) this.f19910c);
                return;
            case 11:
                ((BetaUpdaterController) this.f19909b).lambda$downloadUpdate$4((File) this.f19910c);
                return;
            case 12:
                BirthdayController.a((BirthdayController) this.f19909b, (TLObject) this.f19910c);
                return;
            case 13:
                ChatMessagesMetadataController.a((ChatMessagesMetadataController) this.f19909b, (ArrayList) this.f19910c);
                return;
            case 14:
                ChatThemeController.o((File) this.f19909b, (ResultCallback) this.f19910c);
                return;
            case 15:
                ChatThemeController.s((ResultCallback) this.f19909b, (Bitmap) this.f19910c);
                return;
            case 16:
                ChatThemeController.u((ChatThemeController) this.f19909b, (TLRPC.ChatFull) this.f19910c);
                return;
            case 17:
                ChatThemeController.m((File) this.f19909b, (Utilities.Callback) this.f19910c);
                return;
            case 18:
                ChatThemeController.t((Utilities.Callback) this.f19909b, (lf.a) this.f19910c);
                return;
            case 19:
                ChatThemeController.k((ChatThemeController) this.f19909b, (ResultCallback) this.f19910c);
                return;
            case 20:
                ChatThemeController.f((File) this.f19909b, (Bitmap) this.f19910c);
                return;
            case 21:
                CodeHighlighting.lambda$highlight$4((ArrayList) this.f19909b, (Spannable) this.f19910c);
                return;
            case 22:
                ((ContactsController) this.f19909b).lambda$addContact$50((TLRPC.User) this.f19910c);
                return;
            case 23:
                ((ContactsController) this.f19909b).lambda$deleteAllContacts$8((Runnable) this.f19910c);
                return;
            case 24:
                ((ContactsController) this.f19909b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f19910c);
                return;
            case 25:
                ((ContactsController) this.f19909b).lambda$applyContactsUpdates$46((Long) this.f19910c);
                return;
            case 26:
                ((ContactsController) this.f19909b).lambda$migratePhoneBookToV7$12((SparseArray) this.f19910c);
                return;
            case 27:
                ((ContactsController) this.f19909b).lambda$deleteContactsUndoable$53((HashMap) this.f19910c);
                return;
            case 28:
                ((DispatchQueuePoolBackground) this.f19909b).lambda$execute$0((DispatchQueue) this.f19910c);
                return;
            default:
                ((DownloadController) this.f19909b).lambda$deleteRecentFiles$13((ArrayList) this.f19910c);
                return;
        }
    }
}
