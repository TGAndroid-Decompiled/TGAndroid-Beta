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
import org.telegram.messenger.WebProxyTransport;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d3 implements Runnable {
    public final int f19992a;
    public final Object f19993b;
    public final Object f19994c;

    public d3(int i10, Object obj, Object obj2) {
        this.f19992a = i10;
        this.f19993b = obj;
        this.f19994c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19992a) {
            case 0:
                FileLoader.AnonymousClass2.lambda$didPreFinishLoading$0((FileLoadOperation) this.f19993b, (FileLoaderPriorityQueue) this.f19994c);
                return;
            case 1:
                ((ImageLoader) this.f19993b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.f19994c);
                return;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.f19993b).lambda$onPostExecute$0((String) this.f19994c);
                return;
            case 3:
                ((ImageLoader.CacheOutTask) this.f19993b).lambda$onPostExecute$1((Drawable) this.f19994c);
                return;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.f19993b).lambda$removeTask$0((String) this.f19994c);
                return;
            case 5:
                ((MediaController.AnonymousClass2) this.f19993b).lambda$run$0((ByteBuffer) this.f19994c);
                return;
            case 6:
                ((MediaController.AnonymousClass5) this.f19993b).lambda$run$1((MessageObject) this.f19994c);
                return;
            case 7:
                ((MediaController.MediaLoader) this.f19993b).lambda$addMessageToLoad$7((MessageObject) this.f19994c);
                return;
            case 8:
                ((MediaDataController.AnonymousClass2) this.f19993b).lambda$run$0((ArrayList) this.f19994c);
                return;
            case 9:
                ((MediaDataController.AnonymousClass3) this.f19993b).lambda$run$0((ArrayList) this.f19994c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass2) this.f19993b).lambda$run$0((String) this.f19994c);
                return;
            case 11:
                ((WebProxyTransport) this.f19993b).lambda$acceptLoop$1((WebProxyTransport.Stream) this.f19994c);
                return;
            case 12:
                ((BetaUpdaterController) this.f19993b).lambda$downloadUpdate$4((File) this.f19994c);
                return;
            case 13:
                BirthdayController.a((BirthdayController) this.f19993b, (TLObject) this.f19994c);
                return;
            case 14:
                ChatMessagesMetadataController.a((ChatMessagesMetadataController) this.f19993b, (ArrayList) this.f19994c);
                return;
            case 15:
                ChatThemeController.o((File) this.f19993b, (ResultCallback) this.f19994c);
                return;
            case 16:
                ChatThemeController.s((ResultCallback) this.f19993b, (Bitmap) this.f19994c);
                return;
            case 17:
                ChatThemeController.u((ChatThemeController) this.f19993b, (TLRPC.ChatFull) this.f19994c);
                return;
            case 18:
                ChatThemeController.m((File) this.f19993b, (Utilities.Callback) this.f19994c);
                return;
            case 19:
                ChatThemeController.t((Utilities.Callback) this.f19993b, (of.a) this.f19994c);
                return;
            case 20:
                ChatThemeController.k((ChatThemeController) this.f19993b, (ResultCallback) this.f19994c);
                return;
            case 21:
                ChatThemeController.f((File) this.f19993b, (Bitmap) this.f19994c);
                return;
            case 22:
                CodeHighlighting.lambda$highlight$4((ArrayList) this.f19993b, (Spannable) this.f19994c);
                return;
            case 23:
                ((ContactsController) this.f19993b).lambda$addContact$50((TLRPC.User) this.f19994c);
                return;
            case 24:
                ((ContactsController) this.f19993b).lambda$deleteAllContacts$8((Runnable) this.f19994c);
                return;
            case 25:
                ((ContactsController) this.f19993b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.f19994c);
                return;
            case 26:
                ((ContactsController) this.f19993b).lambda$applyContactsUpdates$46((Long) this.f19994c);
                return;
            case 27:
                ((ContactsController) this.f19993b).lambda$migratePhoneBookToV7$12((SparseArray) this.f19994c);
                return;
            case 28:
                ((ContactsController) this.f19993b).lambda$deleteContactsUndoable$53((HashMap) this.f19994c);
                return;
            default:
                ((DispatchQueuePoolBackground) this.f19993b).lambda$execute$0((DispatchQueue) this.f19994c);
                return;
        }
    }
}
