package dg;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import oh.g7;
import oh.t6;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.w61;
import org.telegram.ui.wk0;
public final class w0 implements Runnable {
    public final int f4702a;
    public final boolean f4703b;
    public final boolean f4704c;
    public final Object d;
    public final Object f4705e;
    public final Object f4706f;

    public w0(m1 m1Var, boolean z4, boolean z10, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f4702a = 1;
        this.d = m1Var;
        this.f4703b = z4;
        this.f4704c = z10;
        this.f4705e = bitmapArr;
        this.f4706f = countDownLatch;
    }

    @Override
    public final void run() {
        boolean z4;
        Utilities.Callback callback;
        int i10 = this.f4702a;
        boolean z10 = this.f4704c;
        boolean z11 = this.f4703b;
        Object obj = this.f4706f;
        Object obj2 = this.f4705e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                ((c1) obj3).l((d1) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                c1 c1Var = ((m1) obj3).f4615y.f4626c;
                jv0 jv0Var = c1Var.f4456g;
                bf.b h = c1Var.h(new RectF(0.0f, 0.0f, jv0Var.f28201a, jv0Var.f28202b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f1935b;
                }
                countDownLatch.countDown();
                return;
            case 2:
                t6 t6Var = (t6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = t6Var.f17772a;
                SharedPreferences sharedPreferences = t6Var.f17781l;
                if (z11) {
                    t6Var.f17787r = false;
                } else {
                    t6Var.f17786q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z11) {
                        t6Var.f17790u = tL_stories_allStories.count;
                        t6Var.f17785p = tL_stories_allStories.has_more;
                        t6Var.f17784o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", t6Var.f17784o).putBoolean("last_stories_has_more", t6Var.f17785p).putInt("total_stores", t6Var.f17790u).apply();
                    } else {
                        t6Var.v = tL_stories_allStories.count;
                        t6Var.f17794z = tL_stories_allStories.has_more;
                        t6Var.f17793y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", t6Var.f17793y).putBoolean("last_stories_has_more_hidden", t6Var.f17794z).putInt("total_stores_hidden", t6Var.v).apply();
                    }
                    t6Var.Y(tL_stories_allStories, z11, false, z10);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z11) {
                        t6Var.f17785p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        t6Var.f17784o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", t6Var.f17784o).apply();
                    } else {
                        t6Var.f17794z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        t6Var.f17793y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", t6Var.f17793y).apply();
                    }
                    if (z11) {
                        z4 = t6Var.f17794z;
                    } else {
                        z4 = t6Var.f17785p;
                    }
                    if (z4) {
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                g7 g7Var = (g7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ag.f fVar = (ag.f) obj;
                int i12 = g7Var.f17165a;
                MessagesStorage messagesStorage = g7Var.f17166b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = g7Var.f(arrayList2.get(i14).f21082id, peerDialogId);
                                if (f10 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i14, f10);
                                }
                            }
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                if (!z11) {
                    try {
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i12).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i12).getChat(j10);
                                }
                                if (chat == null || (chat.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        String join = TextUtils.join(",", arrayList3);
                        database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + join + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        messagesStorage.checkSQLException(th2);
                    }
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i15);
                    g7Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(fVar);
                return;
            case 4:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                return;
            default:
                final w61 w61Var = (w61) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(w61Var.S).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                wk0 wk0Var = new wk0(w61Var, str, this.f4703b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.f4704c);
                int i16 = w61Var.T;
                if (i16 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(w61Var.S).getEmojiSuggestions(w61.X1, str, false, new vl0(15, linkedHashSet2, runnable2), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(w61Var.S).getAnimatedEmojiByKeywords(str, new e51(linkedHashSet2, runnable2, 0));
                                    return;
                            }
                        }
                    }, wk0Var);
                    return;
                } else if (i16 == 14) {
                    if (fullyConsistsOfEmojis) {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(w61Var.S).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i17 = 0; i17 < availableEffects.effects.size(); i17++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i17);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(ng.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        w61 w61Var2 = w61Var;
                                        MediaDataController.getInstance(w61Var2.S).getEmojiSuggestions(w61.X1, str, false, new a1.d(w61Var2, arrayList5, arrayList4, (Runnable) obj4, 16), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(w61Var.S).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i17 = 0; i17 < availableEffects.effects.size(); i17++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i17);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(ng.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        w61 w61Var2 = w61Var;
                                        MediaDataController.getInstance(w61Var2.S).getEmojiSuggestions(w61.X1, str, false, new a1.d(w61Var2, arrayList5, arrayList4, (Runnable) obj4, 16), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, wk0Var);
                    return;
                } else {
                    Utilities.doCallbacks(new ml(fullyConsistsOfEmojis, str, linkedHashSet, 3), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(w61Var.S).getEmojiSuggestions(w61.X1, str, false, new vl0(15, linkedHashSet, runnable2), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(w61Var.S).getAnimatedEmojiByKeywords(str, new e51(linkedHashSet, runnable2, 0));
                                    return;
                            }
                        }
                    }, new hg.c1(w61Var, strArr, str, linkedHashSet, 13), new ok(w61Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new hg.c1(14, w61Var, arrayList6, hashMap, str), new org.telegram.ui.a0(w61Var, str, arrayList7, 8), wk0Var);
                    return;
                }
        }
    }

    public w0(Object obj, Object obj2, boolean z4, boolean z10, Object obj3, int i10) {
        this.f4702a = i10;
        this.d = obj;
        this.f4705e = obj2;
        this.f4703b = z4;
        this.f4704c = z10;
        this.f4706f = obj3;
    }

    public w0(t6 t6Var, boolean z4, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z10) {
        this.f4702a = 2;
        this.d = t6Var;
        this.f4703b = z4;
        this.f4705e = tL_stories_getAllStories;
        this.f4706f = tLObject;
        this.f4704c = z10;
    }

    public w0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z4, boolean z10) {
        this.f4702a = 4;
        this.d = profileActivity;
        this.f4705e = user;
        this.f4706f = str;
        this.f4703b = z4;
        this.f4704c = z10;
    }
}
