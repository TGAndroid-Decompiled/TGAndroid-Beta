package me.vkryl.android.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.concurrent.DelegatingScheduledFuture;
import com.google.firebase.crashlytics.internal.send.ReportQueue;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.ImageDownload;
import com.google.firebase.messaging.Store;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.source.PipSourceHandlerState2$$ExternalSyntheticLambda0;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.AudioRecordJNI;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBar$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda8;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$70$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;

public final class ClickHelper$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ClickHelper$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        int i = 5;
        int i2 = 8;
        ArrayList arrayList = null;
        Bitmap bitmapCreateWallpaperForAccent = null;
        int i3 = 3;
        int i4 = 2;
        final ?? r12 = 0;
        final int i5 = 1;
        switch (this.$r8$classId) {
            case 0:
                ClickHelper clickHelper = (ClickHelper) this.f$0;
                if ((clickHelper.flags & 2) != 0) {
                    float f = clickHelper.startX;
                    float f2 = clickHelper.startY;
                    ClickHelper.Delegate delegate = clickHelper.delegate;
                    View view = (View) this.f$1;
                    if (delegate.onLongPressRequestedAt(view, f, f2)) {
                        clickHelper.flags &= -3;
                        clickHelper.longPressCallback = null;
                        float f3 = clickHelper.startX;
                        float f4 = clickHelper.startY;
                        clickHelper.longPressX = f3;
                        clickHelper.longPressY = f4;
                        if (delegate.ignoreHapticFeedbackSettings(f3, f4)) {
                            boolean zForceEnableVibration = delegate.forceEnableVibration();
                            if (view != null) {
                                view.performHapticFeedback(0, zForceEnableVibration ? 2 : 0);
                            }
                        } else {
                            view.performHapticFeedback(0);
                        }
                        clickHelper.flags = (4 | clickHelper.flags) & (-11);
                        clickHelper.longPressCallback = null;
                    } else {
                        clickHelper.flags |= 8;
                    }
                }
                break;
            case 1:
                Callable callable = (Callable) this.f$0;
                DelegatingScheduledFuture delegatingScheduledFuture = (DelegatingScheduledFuture) ((PhotoViewer.AnonymousClass18) this.f$1).this$0;
                try {
                    delegatingScheduledFuture.set(callable.call());
                } catch (Exception e) {
                    delegatingScheduledFuture.setException(e);
                    return;
                }
                break;
            case 2:
                ReportQueue reportQueue = (ReportQueue) this.f$0;
                reportQueue.getClass();
                try {
                    TransportRuntime.getInstance().uploader.logAndUpdateState(reportQueue.transport.transportContext.withPriority(Priority.HIGHEST), 1);
                    break;
                } catch (SQLException unused) {
                }
                ((CountDownLatch) this.f$1).countDown();
                break;
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f$1;
                Store store = FirebaseMessaging.store;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f$0;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.blockingGetToken());
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
                break;
            case 4:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f$1;
                try {
                    taskCompletionSource2.setResult(((ImageDownload) this.f$0).blockingDownload());
                } catch (Exception e3) {
                    taskCompletionSource2.setException(e3);
                    return;
                }
                break;
            case 5:
                if (((AtomicBoolean) ((Trigger) this.f$0).triggered).compareAndSet(false, true)) {
                    ((PipSourceHandlerState2$$ExternalSyntheticLambda0) this.f$1).run(true);
                }
                break;
            case 6:
                RingtoneDataStore ringtoneDataStore = (RingtoneDataStore) this.f$0;
                TLObject tLObject = (TLObject) this.f$1;
                ringtoneDataStore.getClass();
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        ringtoneDataStore.loadFromPrefs(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        if (!ringtoneDataStore.loaded) {
                            ringtoneDataStore.loadFromPrefs(false);
                            ringtoneDataStore.loaded = true;
                        }
                        HashMap map = new HashMap();
                        ArrayList arrayList3 = ringtoneDataStore.userRingtones;
                        int size = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = arrayList3.get(i6);
                            i6++;
                            RingtoneDataStore.CachedTone cachedTone = (RingtoneDataStore.CachedTone) obj;
                            if (cachedTone.localUri != null && (document = cachedTone.document) != null) {
                                map.put(Long.valueOf(document.id), cachedTone.localUri);
                            }
                        }
                        ringtoneDataStore.userRingtones.clear();
                        SharedPreferences sharedPreferences = ringtoneDataStore.getSharedPreferences();
                        sharedPreferences.edit().clear().apply();
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putInt("count", arrayList2.size());
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            TLRPC.Document document3 = arrayList2.get(i7);
                            String str = (String) map.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            editorEdit.putString("tone_document" + i7, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                editorEdit.putString("tone_local_path" + i7, str);
                            }
                            RingtoneDataStore.CachedTone cachedTone2 = new RingtoneDataStore.CachedTone();
                            cachedTone2.document = document3;
                            cachedTone2.localUri = str;
                            int i8 = ringtoneDataStore.localIds;
                            ringtoneDataStore.localIds = i8 + 1;
                            cachedTone2.localId = i8;
                            ringtoneDataStore.userRingtones.add(cachedTone2);
                        }
                        editorEdit.apply();
                        NotificationCenter.getInstance(ringtoneDataStore.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor editorEdit2 = ringtoneDataStore.getSharedPreferences().edit();
                        long j = tL_savedRingtones.hash;
                        RingtoneDataStore.queryHash = j;
                        SharedPreferences.Editor editorPutLong = editorEdit2.putLong("hash", j);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        RingtoneDataStore.lastReloadTimeMs = jCurrentTimeMillis;
                        editorPutLong.putLong("lastReload", jCurrentTimeMillis).apply();
                    }
                    ringtoneDataStore.checkRingtoneSoundsLoaded();
                }
                break;
            case 7:
                RingtoneDataStore ringtoneDataStore2 = (RingtoneDataStore) this.f$0;
                ringtoneDataStore2.getClass();
                while (true) {
                    ?? r2 = (ArrayList) this.f$1;
                    if (r12 < r2.size()) {
                        RingtoneDataStore.CachedTone cachedTone3 = (RingtoneDataStore.CachedTone) r2.get(r12);
                        if (cachedTone3 != null && ((TextUtils.isEmpty(cachedTone3.localUri) || !new File(cachedTone3.localUri).exists()) && (document2 = cachedTone3.document) != null && ((pathToAttach = FileLoader.getInstance(ringtoneDataStore2.currentAccount).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                            AndroidUtilities.runOnUIThread(new ClickHelper$$ExternalSyntheticLambda0(i2, ringtoneDataStore2, document2));
                        }
                        r12++;
                    }
                    break;
                }
                break;
            case 8:
                FileLoader fileLoader = FileLoader.getInstance(((RingtoneDataStore) this.f$0).currentAccount);
                TLRPC.Document document4 = (TLRPC.Document) this.f$1;
                fileLoader.loadFile(document4, document4, 0, 0);
                break;
            case 9:
                RingtoneUploader ringtoneUploader = (RingtoneUploader) this.f$0;
                ringtoneUploader.getClass();
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                boolean zEquals = tL_error.text.equals("RINGTONE_DURATION_TOO_LONG");
                int i9 = ringtoneUploader.currentAccount;
                if (zEquals) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i9).ringtoneDurationMax)));
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i9).ringtoneSizeMax / 1024)));
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                }
                break;
            case 10:
                ((VideoAds) this.f$0).lambda$showPremium$19((PremiumFeatureBottomSheet) this.f$1);
                break;
            case 11:
                ((VideoAds) this.f$0).lambda$load$0((TLObject) this.f$1);
                break;
            case 12:
                ((VideoAds) this.f$0).lambda$show$16((Utilities.Callback) this.f$1);
                break;
            case 13:
                VideoAds.lambda$show$13((Context) this.f$0, (ShareAlert.AnonymousClass3) this.f$1);
                break;
            case 14:
                ((AudioRecordJNI) this.f$0).lambda$startThread$0((ByteBuffer) this.f$1);
                break;
            case 15:
                ((ConferenceCall) this.f$0).lambda$processUpdates$4((TLRPC.Updates) this.f$1);
                break;
            case 16:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.f$0, (Point) this.f$1);
                break;
            case 17:
                ((VideoCapturerDevice) this.f$0).lambda$init$4((String) this.f$1);
                break;
            case 18:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$56((ChatActivity$70$$ExternalSyntheticLambda1) this.f$1);
                break;
            case 19:
                ((VoIPService) this.f$0).lambda$startScreenCapture$58((TLRPC.Updates) this.f$1);
                break;
            case 20:
                ((VoIPService) this.f$0).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.f$1);
                break;
            case 21:
                ((VoIPService) this.f$0).lambda$createGroupInstance$71((String) this.f$1);
                break;
            case 22:
                ((VoipAudioManager) this.f$0).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) this.f$1);
                break;
            case 23:
                final ActionBar actionBar = (ActionBar) this.f$0;
                boolean zCanScrollVertically = ((SectionsScrollView) this.f$1).canScrollVertically(-1);
                final boolean z = !zCanScrollVertically;
                if (actionBar.onTop != z) {
                    ValueAnimator valueAnimator = actionBar.adaptive_animator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f5 = actionBar.onTopAnimated;
                    actionBar.onTop = z;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, zCanScrollVertically ? 0.0f : 1.0f);
                    actionBar.adaptive_animator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda0(actionBar, i3));
                    actionBar.adaptive_animator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i5) {
                                case 0:
                                    float f6 = z ? 1.0f : 0.0f;
                                    ActionBar actionBar2 = actionBar;
                                    actionBar2.onTopAnimated = f6;
                                    actionBar2.adaptive_updateColor();
                                    break;
                                default:
                                    float f7 = z ? 1.0f : 0.0f;
                                    ActionBar actionBar3 = actionBar;
                                    actionBar3.onTopAnimated = f7;
                                    actionBar3.adaptive_updateColor();
                                    break;
                            }
                        }
                    });
                    actionBar.adaptive_animator.setDuration(320L);
                    actionBar.adaptive_animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    actionBar.adaptive_animator.start();
                    break;
                }
                break;
            case 24:
                final ActionBar actionBar2 = (ActionBar) this.f$0;
                actionBar2.getClass();
                boolean zCanScrollVertically2 = ((RecyclerView) this.f$1).canScrollVertically(-1);
                final boolean z2 = !zCanScrollVertically2;
                if (actionBar2.onTop != z2) {
                    ValueAnimator valueAnimator2 = actionBar2.adaptive_animator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f6 = actionBar2.onTopAnimated;
                    actionBar2.onTop = z2;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f6, zCanScrollVertically2 ? 0.0f : 1.0f);
                    actionBar2.adaptive_animator = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new ActionBar$$ExternalSyntheticLambda0(actionBar2, i4));
                    actionBar2.adaptive_animator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (r12) {
                                case 0:
                                    float f7 = z2 ? 1.0f : 0.0f;
                                    ActionBar actionBar3 = actionBar2;
                                    actionBar3.onTopAnimated = f7;
                                    actionBar3.adaptive_updateColor();
                                    break;
                                default:
                                    float f8 = z2 ? 1.0f : 0.0f;
                                    ActionBar actionBar4 = actionBar2;
                                    actionBar4.onTopAnimated = f8;
                                    actionBar4.adaptive_updateColor();
                                    break;
                            }
                        }
                    });
                    actionBar2.adaptive_animator.setDuration(320L);
                    actionBar2.adaptive_animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    actionBar2.adaptive_animator.start();
                    break;
                }
                break;
            case 25:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f$0;
                actionBarLayout.removeFragmentFromStackInternal((BaseFragment) this.f$1, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.backgroundView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                break;
            case 26:
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                if (baseFragment != null) {
                    baseFragment.onTransitionAnimationEnd(false, false);
                }
                BaseFragment baseFragment2 = (BaseFragment) this.f$1;
                baseFragment2.onTransitionAnimationEnd(true, false);
                baseFragment2.onBecomeFullyVisible();
                break;
            case 27:
                Theme.PatternsLoader patternsLoader = (Theme.PatternsLoader) this.f$0;
                patternsLoader.getClass();
                ArrayList arrayList4 = (ArrayList) this.f$1;
                int size2 = arrayList4.size();
                int i10 = 0;
                while (i10 < size2) {
                    Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) arrayList4.get(i10);
                    File pathToWallpaper = themeAccent.getPathToWallpaper();
                    if (pathToWallpaper == null || pathToWallpaper.length() <= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(themeAccent.patternSlug)) {
                            arrayList.add(themeAccent.patternSlug);
                        }
                    } else {
                        arrayList4.remove(i10);
                        i10--;
                        size2--;
                    }
                    i10++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size3 = arrayList.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i11);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(patternsLoader.account).sendRequest(getmultiwallpapers, new ChatActivity$$ExternalSyntheticLambda208(i, patternsLoader, arrayList4));
                    break;
                }
                break;
            case 28:
                Theme.PatternsLoader patternsLoader2 = (Theme.PatternsLoader) this.f$0;
                Theme.PatternsLoader.LoadingPattern loadingPattern = (Theme.PatternsLoader.LoadingPattern) this.f$1;
                TLRPC.TL_wallPaper tL_wallPaper = loadingPattern.pattern;
                File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList5 = loadingPattern.accents;
                int size4 = arrayList5.size();
                ArrayList arrayList6 = null;
                for (int i12 = 0; i12 < size4; i12++) {
                    Theme.ThemeAccent themeAccent2 = (Theme.ThemeAccent) arrayList5.get(i12);
                    if (themeAccent2.patternSlug.equals(tL_wallPaper.slug)) {
                        bitmapCreateWallpaperForAccent = Theme.PatternsLoader.createWallpaperForAccent(bitmapCreateWallpaperForAccent, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach2, themeAccent2);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            arrayList6.add(themeAccent2);
                        }
                    }
                }
                if (bitmapCreateWallpaperForAccent != null) {
                    bitmapCreateWallpaperForAccent.recycle();
                }
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(patternsLoader2, arrayList6, (boolean) r12, i));
                break;
            default:
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) this.f$0;
                themeInfo.createBackground((File) this.f$1, themeInfo.newPathToWallpaper);
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda8(themeInfo, 19));
                break;
        }
    }
}
