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
public final class d3 implements Runnable {
    public final int f17621a;
    public final Object f17622b;
    public final Object f17623c;

    public d3(int i10, Object obj, Object obj2) {
        this.f17621a = i10;
        this.f17622b = obj;
        this.f17623c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17621a) {
            case 0:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f17622b, (FileLoaderPriorityQueue) this.f17623c);
                return;
            case 1:
                ((ImageLoader) this.f17622b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f17623c);
                return;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f17622b).lambda$onPostExecute$0((String) this.f17623c);
                return;
            case 3:
                ((ImageLoader.CacheOutTask) this.f17622b).lambda$onPostExecute$1((Drawable) this.f17623c);
                return;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f17622b).lambda$removeTask$0((String) this.f17623c);
                return;
            case 5:
                ((MediaController.AnonymousClass2) this.f17622b).lambda$run$0((ByteBuffer) this.f17623c);
                return;
            case 6:
                ((MediaController.AnonymousClass5) this.f17622b).lambda$run$1((MessageObject) this.f17623c);
                return;
            case 7:
                ((MediaController.MediaLoader) this.f17622b).lambda$addMessageToLoad$7((MessageObject) this.f17623c);
                return;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f17622b).lambda$run$0((ArrayList) this.f17623c);
                return;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f17622b).lambda$run$0((ArrayList) this.f17623c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f17622b).lambda$run$0((String) this.f17623c);
                return;
            case 11:
                ((BetaUpdaterController) this.f17622b).lambda$downloadUpdate$4((File) this.f17623c);
                return;
            case 12:
                BirthdayController.a((BirthdayController) this.f17622b, (TLObject) this.f17623c);
                return;
            case 13:
                ChatMessagesMetadataController.a((ChatMessagesMetadataController) this.f17622b, (ArrayList) this.f17623c);
                return;
            case 14:
                ChatThemeController.o((File) this.f17622b, (ResultCallback) this.f17623c);
                return;
            case 15:
                ChatThemeController.s((ResultCallback) this.f17622b, (Bitmap) this.f17623c);
                return;
            case 16:
                ChatThemeController.u((ChatThemeController) this.f17622b, (TLRPC.ChatFull) this.f17623c);
                return;
            case 17:
                ChatThemeController.m((File) this.f17622b, (Utilities.Callback) this.f17623c);
                return;
            case 18:
                ChatThemeController.t((Utilities.Callback) this.f17622b, (dg.a) this.f17623c);
                return;
            case 19:
                ChatThemeController.k((ChatThemeController) this.f17622b, (ResultCallback) this.f17623c);
                return;
            case 20:
                ChatThemeController.f((File) this.f17622b, (Bitmap) this.f17623c);
                return;
            case 21:
                CodeHighlighting.lambda$highlight$4((ArrayList) this.f17622b, (Spannable) this.f17623c);
                return;
            case 22:
                ((ContactsController) this.f17622b).lambda$addContact$50((TLRPC.User) this.f17623c);
                return;
            case 23:
                ((ContactsController) this.f17622b).lambda$deleteAllContacts$8((Runnable) this.f17623c);
                return;
            case 24:
                ((ContactsController) this.f17622b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f17623c);
                return;
            case 25:
                ((ContactsController) this.f17622b).lambda$applyContactsUpdates$46((Long) this.f17623c);
                return;
            case 26:
                ((ContactsController) this.f17622b).lambda$migratePhoneBookToV7$12((SparseArray) this.f17623c);
                return;
            case 27:
                ((ContactsController) this.f17622b).lambda$deleteContactsUndoable$53((HashMap) this.f17623c);
                return;
            case 28:
                ((DispatchQueuePoolBackground) this.f17622b).lambda$execute$0((DispatchQueue) this.f17623c);
                return;
            default:
                ((DownloadController) this.f17622b).lambda$deleteRecentFiles$13((ArrayList) this.f17623c);
                return;
        }
    }
}
