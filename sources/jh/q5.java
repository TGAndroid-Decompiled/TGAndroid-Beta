package jh;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import lh.kc;
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
import org.telegram.messenger.hk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a61;
import org.telegram.ui.qk0;

public final class q5 implements Runnable {

    public final int f13856a;

    public final boolean f13857b;

    public final boolean f13858c;
    public final Object d;

    public final Object f13859e;

    public final Object f13860f;

    public q5(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f13856a = i10;
        this.d = obj;
        this.f13859e = obj2;
        this.f13857b = z10;
        this.f13858c = z11;
        this.f13860f = obj3;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        int i10 = this.f13856a;
        boolean z10 = this.f13858c;
        boolean z11 = this.f13857b;
        Object obj = this.f13860f;
        Object obj2 = this.f13859e;
        Object obj3 = this.d;
        final int i11 = 0;
        switch (i10) {
            case 0:
                s6 s6Var = (s6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = s6Var.f13955a;
                SharedPreferences sharedPreferences = s6Var.f13964l;
                if (z11) {
                    s6Var.f13970r = false;
                } else {
                    s6Var.f13969q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (z11) {
                        s6Var.v = tL_stories_allStories.count;
                        s6Var.f13977z = tL_stories_allStories.has_more;
                        s6Var.f13976y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", s6Var.f13976y).putBoolean("last_stories_has_more_hidden", s6Var.f13977z).putInt("total_stores_hidden", s6Var.v).apply();
                    } else {
                        s6Var.f13973u = tL_stories_allStories.count;
                        s6Var.f13968p = tL_stories_allStories.has_more;
                        s6Var.f13967o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", s6Var.f13967o).putBoolean("last_stories_has_more", s6Var.f13968p).putInt("total_stores", s6Var.f13973u).apply();
                    }
                    s6Var.Y(tL_stories_allStories, z11, false, z10);
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z11) {
                        s6Var.f13977z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        s6Var.f13976y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", s6Var.f13976y).apply();
                    } else {
                        s6Var.f13968p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        s6Var.f13967o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", s6Var.f13967o).apply();
                    }
                    if (z11 ? s6Var.f13977z : s6Var.f13968p) {
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    }
                }
                break;
            case 1:
                f7 f7Var = (f7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ag.l3 l3Var = (ag.l3) obj;
                int i13 = f7Var.f13331a;
                MessagesStorage messagesStorage = f7Var.f13332b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i14);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem storyItemF = f7Var.f(arrayList2.get(i15).f22617id, peerDialogId);
                                if (storyItemF instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i15, storyItemF);
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                if (!z11) {
                    try {
                        SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (sQLiteCursorQueryFinalized.next()) {
                            long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                            if (jLongValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(jLongValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i13).getUser(jLongValue);
                                }
                                if (user == null || (user.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(jLongValue)))) {
                                    arrayList3.add(Long.valueOf(jLongValue));
                                }
                            } else {
                                long j10 = -jLongValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i13).getChat(j10);
                                }
                                if (chat == null || (chat.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(jLongValue)))) {
                                    arrayList3.add(Long.valueOf(jLongValue));
                                }
                            }
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th) {
                        messagesStorage.checkSQLException(th);
                    }
                }
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i16);
                    f7Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(l3Var);
                break;
            case 2:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                break;
            case 3:
                final a61 a61Var = (a61) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(a61Var.R).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean zFullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap map = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                qk0 qk0Var = new qk0(a61Var, str, this.f13857b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.f13858c);
                int i17 = a61Var.S;
                if (i17 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i11) {
                                case 0:
                                    MediaDataController.getInstance(a61Var.R).getEmojiSuggestions(a61.W1, str, false, new nl0(16, linkedHashSet2, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(a61Var.R).getAnimatedEmojiByKeywords(str, new k41(linkedHashSet2, runnable, 0));
                                    break;
                            }
                        }
                    }, qk0Var);
                } else if (i17 == 14) {
                    if (zFullyConsistsOfEmojis) {
                        final int i18 = 0;
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                switch (i18) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(a61Var.R).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i19 = 0; i19 < availableEffects.effects.size(); i19++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i19);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ig.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        a61 a61Var2 = a61Var;
                                        MediaDataController.getInstance(a61Var2.R).getEmojiSuggestions(a61.W1, str, false, new a1.d(a61Var2, arrayList5, arrayList4, (Runnable) obj4, 17), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i19 = 1;
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                switch (i19) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(a61Var.R).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i110 = 0; i110 < availableEffects.effects.size(); i110++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i110);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ig.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        a61 a61Var2 = a61Var;
                                        MediaDataController.getInstance(a61Var2.R).getEmojiSuggestions(a61.W1, str, false, new a1.d(a61Var2, arrayList5, arrayList4, (Runnable) obj4, 17), null, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, qk0Var);
                } else {
                    final int i20 = 1;
                    Utilities.doCallbacks(new kc(zFullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (i20) {
                                case 0:
                                    MediaDataController.getInstance(a61Var.R).getEmojiSuggestions(a61.W1, str, false, new nl0(16, linkedHashSet, runnable), null, false, false, false, 0);
                                    break;
                                default:
                                    MediaDataController.getInstance(a61Var.R).getAnimatedEmojiByKeywords(str, new k41(linkedHashSet, runnable, 0));
                                    break;
                            }
                        }
                    }, new cg.e1(a61Var, strArr, str, linkedHashSet, 13), new hk(a61Var, zFullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new cg.e1((Object) a61Var, str, (Object) arrayList6, (Object) map, 14), new org.telegram.ui.b0(a61Var, str, arrayList7, 8), qk0Var);
                }
                break;
            case 4:
                Runnable runnable = (Runnable) obj;
                ((yf.p0) obj3).l((yf.q0) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                yf.p0 p0Var = ((yf.z0) obj3).f50140y.f49880c;
                tu0 tu0Var = p0Var.f50016g;
                w3.b0 b0VarH = p0Var.h(new RectF(0.0f, 0.0f, tu0Var.f32893a, tu0Var.f32894b), false, z11, z10);
                if (b0VarH != null) {
                    bitmapArr[0] = (Bitmap) b0VarH.f48998b;
                }
                countDownLatch.countDown();
                break;
        }
    }

    public q5(s6 s6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f13856a = 0;
        this.d = s6Var;
        this.f13857b = z10;
        this.f13859e = tL_stories_getAllStories;
        this.f13860f = tLObject;
        this.f13858c = z11;
    }

    public q5(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f13856a = 2;
        this.d = profileActivity;
        this.f13859e = user;
        this.f13860f = str;
        this.f13857b = z10;
        this.f13858c = z11;
    }

    public q5(yf.z0 z0Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f13856a = 5;
        this.d = z0Var;
        this.f13857b = z10;
        this.f13858c = z11;
        this.f13859e = bitmapArr;
        this.f13860f = countDownLatch;
    }
}
