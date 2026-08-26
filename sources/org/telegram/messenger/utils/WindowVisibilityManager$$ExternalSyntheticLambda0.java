package org.telegram.messenger.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AutoValue_CrashlyticsReportWithSessionId;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.TopicsSubscriber;
import com.google.firebase.messaging.WakeLockHolder;
import com.google.firebase.messaging.WithinAppServiceConnection;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionEvents;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda8;
import org.telegram.ui.AutoDeleteMessagesActivity;
import org.telegram.ui.AvatarPreviewer;
import org.telegram.ui.BasePermissionsActivity;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Business.BusinessLinksController$$ExternalSyntheticLambda8;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.OpeningHoursDayActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Business.TimezoneSelector;
import org.telegram.ui.CacheChatsExceptionsFragment;
import org.telegram.ui.CacheChatsExceptionsFragment$$ExternalSyntheticLambda3;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.CacheControlActivity$$ExternalSyntheticLambda20;
import org.telegram.ui.CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.CameraScanActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.CameraScanActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda271;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda464;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.DialogCacheBottomSheet;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.KeepMediaPopupView;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.MHTML;

public final class WindowVisibilityManager$$ExternalSyntheticLambda0 implements Deferred$DeferredHandler, Continuation, ComponentFactory, OnSuccessListener, OnCompleteListener, Transformer, FactorAnimator.Target, Vector.TLDeserializer, SeekBar.SeekBarDelegate, ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate, UsersSelectActivity.FilterUsersActivityDelegate, OnApplyWindowInsetsListener, AlertDialog.OnButtonClickListener, LimitPreviewView.DarkGradientProvider, PasscodeView.PasscodeViewDelegate, Utilities.Callback5, RecyclerListView.OnItemClickListenerExtended, SlideChooseView.Callback, StoryViewer.HolderDrawAbove, CameraView.CameraViewDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public WindowVisibilityManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public Object apply(Object obj) {
        ((ChatActivity.AnonymousClass1) this.f$0).getClass();
        String strEncode = SessionEvents.SESSION_EVENT_ENCODER.encode((SessionEvent) obj);
        Intrinsics.checkNotNullExpressionValue(strEncode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(strEncode));
        byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public Object create(MHTML mhtml) {
        return new DefaultHeartBeatController((Context) mhtml.get(Context.class), ((FirebaseApp) mhtml.get(FirebaseApp.class)).getPersistenceKey(), mhtml.setOf(ChatActivity.AnonymousClass40.class), mhtml.getProvider(DefaultUserAgentPublisher.class), (Executor) mhtml.get((Qualified) this.f$0));
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 12:
                return ((TLRPC.TL_stickerSet) this.f$0).lambda$readParams$0(inputSerializedData, i, z);
            default:
                return ((TLRPC.TL_stickerSet_layer143) this.f$0).lambda$readParams$0(inputSerializedData, i, z);
        }
    }

    @Override
    public void didAcceptedPassword(PasscodeView passcodeView) throws Throwable {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f$0;
        bubbleActivity.getClass();
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.passcodeSaveIntent;
        if (intent != null) {
            bubbleActivity.handleIntent(intent, bubbleActivity.passcodeSaveIntentIsNew, bubbleActivity.passcodeSaveIntentIsRestore, true, bubbleActivity.passcodeSaveIntentAccount);
            bubbleActivity.passcodeSaveIntent = null;
        }
        bubbleActivity.actionBarLayout.showLastFragment();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, passcodeView);
    }

    @Override
    public void didSelectChats(int i, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(9, (AutoDeleteMessagesActivity.AnonymousClass2) this.f$0, arrayList), 100L);
    }

    @Override
    public void draw(Canvas canvas, RectF rectF, float f) {
        CalendarActivity calendarActivity = (CalendarActivity) ((PhotoViewer.AnonymousClass18) this.f$0).this$0;
        Paint paint = calendarActivity.blackoutPaint;
        paint.setAlpha((int) (80.0f * f));
        float fLerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f);
        canvas.drawRoundRect(rectF, fLerp, fLerp, paint);
        float fClamp = Utilities.clamp((f - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (fClamp > 0.0f) {
            TextPaint textPaint = calendarActivity.activeTextPaint;
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * fClamp));
            canvas.save();
            float fMin = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(fMin, fMin, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(calendarActivity.storiesPlaceDay + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = (CrashlyticsNativeComponentDeferredProxy) this.f$0;
        crashlyticsNativeComponentDeferredProxy.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        crashlyticsNativeComponentDeferredProxy.availableNativeComponent.set((CrashlyticsNativeComponentDeferredProxy) provider.get());
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ChatActivity.AnonymousClass60 anonymousClass60;
        AvatarPreviewer avatarPreviewer = (AvatarPreviewer) this.f$0;
        avatarPreviewer.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        AvatarPreviewer.AnonymousClass1 anonymousClass1 = (AvatarPreviewer.AnonymousClass1) avatarPreviewer.layout;
        if (anonymousClass1 == view && (anonymousClass60 = anonymousClass1.container) != null) {
            anonymousClass60.setPadding(defaultWindowInsets.left, defaultWindowInsets.top, defaultWindowInsets.right, defaultWindowInsets.bottom);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onCameraInit() {
        CameraScanActivity cameraScanActivity = (CameraScanActivity) this.f$0;
        HandlerThread handlerThread = cameraScanActivity.backgroundHandlerThread;
        handlerThread.start();
        cameraScanActivity.handler = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(cameraScanActivity.requestShot, 0L);
        if (cameraScanActivity.isQr()) {
            SpringAnimation springAnimation = cameraScanActivity.qrAppearing;
            if (springAnimation != null) {
                springAnimation.cancel();
                cameraScanActivity.qrAppearing = null;
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(0.0f));
            cameraScanActivity.qrAppearing = springAnimation2;
            int i = 0;
            springAnimation2.addUpdateListener(new CameraScanActivity$$ExternalSyntheticLambda13(cameraScanActivity, i));
            cameraScanActivity.qrAppearing.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda14(cameraScanActivity, i));
            cameraScanActivity.qrAppearing.mSpring = new SpringForce(500.0f);
            cameraScanActivity.qrAppearing.mSpring.setDampingRatio(0.8f);
            cameraScanActivity.qrAppearing.mSpring.setStiffness(250.0f);
            cameraScanActivity.qrAppearing.start();
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        int i2 = 1;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 18:
                BasePermissionsActivity basePermissionsActivity = (BasePermissionsActivity) this.f$0;
                basePermissionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    basePermissionsActivity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 23:
                QuickRepliesActivity quickRepliesActivity = QuickRepliesActivity.this;
                QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(((BaseFragment) quickRepliesActivity).currentAccount);
                ArrayList arrayList = quickRepliesActivity.selected;
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    if (quickRepliesController.findReply(((Integer) arrayList.get(i4)).intValue()) == null) {
                        arrayList.remove(i4);
                        i4--;
                    }
                    i4++;
                }
                if (!arrayList.isEmpty()) {
                    int i5 = 0;
                    while (true) {
                        int size = arrayList.size();
                        int i6 = quickRepliesController.currentAccount;
                        if (i5 < size) {
                            QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController.findReply(((Integer) arrayList.get(i5)).intValue());
                            quickRepliesController.replies.remove(quickReplyFindReply);
                            quickRepliesController.deleteLocalReply(quickReplyFindReply.name);
                            TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                            tL_messages_deleteQuickReplyShortcut.shortcut_id = quickReplyFindReply.id;
                            ConnectionsManager.getInstance(i6).sendRequest(tL_messages_deleteQuickReplyShortcut, new PassportActivity$$ExternalSyntheticLambda1(3));
                            if ("hello".equals(quickReplyFindReply.name)) {
                                ConnectionsManager.getInstance(i6).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                                TLRPC.UserFull userFull = MessagesController.getInstance(i6).getUserFull(UserConfig.getInstance(i6).getClientUserId());
                                if (userFull != null) {
                                    userFull.flags2 &= -5;
                                    userFull.business_greeting_message = null;
                                    MessagesStorage.getInstance(i6).updateUserInfo(userFull, true);
                                }
                            } else if ("away".equals(quickReplyFindReply.name)) {
                                ConnectionsManager.getInstance(i6).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i6).getUserFull(UserConfig.getInstance(i6).getClientUserId());
                                if (userFull2 != null) {
                                    userFull2.flags2 &= -9;
                                    userFull2.business_away_message = null;
                                    MessagesStorage.getInstance(i6).updateUserInfo(userFull2, true);
                                }
                            }
                            i5++;
                        } else {
                            quickRepliesController.saveToCache();
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i6);
                            messagesStorage.getStorageQueue().postRunnable(new BusinessLinksController$$ExternalSyntheticLambda8(i2, arrayList, messagesStorage));
                            NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                quickRepliesActivity.clearSelection();
                break;
            default:
                CacheControlActivity.ClearCacheButtonInternal clearCacheButtonInternal = (CacheControlActivity.ClearCacheButtonInternal) this.f$0;
                clearCacheButtonInternal.getClass();
                CacheControlActivity.ClearCacheButtonInternal.AnonymousClass1 anonymousClass1 = new CacheControlActivity.ClearCacheButtonInternal.AnonymousClass1(clearCacheButtonInternal.getContext(), null, false, false);
                anonymousClass1.fixNavigationBar();
                anonymousClass1.setCanDismissWithSwipe(false);
                anonymousClass1.setCancelable(false);
                CacheControlActivity.ClearingCacheView clearingCacheView = new CacheControlActivity.ClearingCacheView(clearCacheButtonInternal.getContext());
                anonymousClass1.setCustomView(clearingCacheView);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                ChatActivity$$ExternalSyntheticLambda271 chatActivity$$ExternalSyntheticLambda271 = new ChatActivity$$ExternalSyntheticLambda271(clearCacheButtonInternal, clearingCacheView, fArr, zArr2, 18);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(clearCacheButtonInternal, zArr, jArr, anonymousClass1, 19), 150L);
                ChatActivity$$ExternalSyntheticLambda464 chatActivity$$ExternalSyntheticLambda464 = new ChatActivity$$ExternalSyntheticLambda464(fArr, zArr2, chatActivity$$ExternalSyntheticLambda271, 2);
                CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5 cacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5 = new CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5(zArr, clearingCacheView, jArr, anonymousClass1, 0);
                CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                CacheModel cacheModel = cacheControlActivity.cacheModel;
                if (cacheModel != null) {
                    cacheModel.selectedSize = 0L;
                    cacheModel.selectedFiles.clear();
                    cacheModel.selectedDialogs.clear();
                }
                DialogCacheBottomSheet.AnonymousClass3 anonymousClass3 = cacheControlActivity.cachedMediaLayout;
                if (anonymousClass3 != null) {
                    anonymousClass3.updateVisibleRows();
                    cacheControlActivity.cachedMediaLayout.showActionMode(false);
                }
                cacheControlActivity.getFileLoader().cancelLoadAllFiles();
                cacheControlActivity.getFileLoader().getFileLoaderQueue().postRunnable(new CacheControlActivity$$ExternalSyntheticLambda20(cacheControlActivity, chatActivity$$ExternalSyntheticLambda464, cacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5, i3));
                cacheControlActivity.cacheModel = null;
                DialogCacheBottomSheet.AnonymousClass3 anonymousClass4 = cacheControlActivity.cachedMediaLayout;
                if (anonymousClass4 != null) {
                    anonymousClass4.setCacheModel(null);
                }
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.$r8$classId) {
            case 7:
                WakeLockHolder.completeWakefulIntent((Intent) this.f$0);
                break;
            case 8:
                ((WithinAppServiceConnection.BindRequest) this.f$0).taskCompletionSource.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.f$0).cancel(false);
                break;
        }
    }

    @Override
    public void onDismiss(boolean z) {
        ArticleViewer.PageLayout pageLayout = (ArticleViewer.PageLayout) this.f$0;
        ArticleViewer.Sheet sheet = ArticleViewer.this.sheet;
        if (sheet != null) {
            pageLayout.swipeBack = true;
            sheet.dismiss(true);
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ((Switch) this.f$0).invalidate();
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        CacheChatsExceptionsFragment cacheChatsExceptionsFragment = (CacheChatsExceptionsFragment) this.f$0;
        ArrayList arrayList = cacheChatsExceptionsFragment.items;
        if (((CacheChatsExceptionsFragment.Item) arrayList.get(i)).viewType == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i2 = cacheChatsExceptionsFragment.currentType;
            if (i2 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i2 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.delegate = new ArticleViewer$$ExternalSyntheticLambda16(23, cacheChatsExceptionsFragment, dialogsActivity);
            cacheChatsExceptionsFragment.presentFragment(dialogsActivity);
            return;
        }
        if (((CacheChatsExceptionsFragment.Item) arrayList.get(i)).viewType != 2) {
            if (((CacheChatsExceptionsFragment.Item) arrayList.get(i)).viewType == 4) {
                AlertDialog alertDialog = AlertsCreator.createSimpleAlert(cacheChatsExceptionsFragment.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ArticleViewer$$ExternalSyntheticLambda3(cacheChatsExceptionsFragment, 20), null).alertDialog;
                alertDialog.show();
                alertDialog.redPositive();
                return;
            }
            return;
        }
        CacheByChatsController.KeepMediaException keepMediaException = ((CacheChatsExceptionsFragment.Item) arrayList.get(i)).exception;
        KeepMediaPopupView keepMediaPopupView = new KeepMediaPopupView(view.getContext(), cacheChatsExceptionsFragment);
        keepMediaPopupView.currentType = -1;
        keepMediaPopupView.gap.setVisibility(0);
        keepMediaPopupView.delete.setVisibility(0);
        keepMediaPopupView.description.setVisibility(0);
        keepMediaPopupView.exceptionsView.setVisibility(8);
        keepMediaPopupView.setParentWindow(AlertsCreator.createSimplePopup(cacheChatsExceptionsFragment, keepMediaPopupView, view, f, f2));
        keepMediaPopupView.setCallback(new CacheChatsExceptionsFragment$$ExternalSyntheticLambda3(cacheChatsExceptionsFragment, keepMediaException, 0));
    }

    @Override
    public void onOptionSelected(int i) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f$0).get(i)).intValue()).apply();
    }

    @Override
    public void onSeekBarContinuousDrag(float f) {
    }

    @Override
    public void onSeekBarDrag(float f) {
        ArticleViewer.BlockAudioCell blockAudioCell = (ArticleViewer.BlockAudioCell) this.f$0;
        MessageObject messageObject = blockAudioCell.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f;
        MediaController.getInstance().seekToProgress(blockAudioCell.currentMessageObject, f);
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z;
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        if (!((FirebaseMessaging) this.f$0).autoInit.isEnabled() || topicsSubscriber.store.getNextTopicOperation() == null) {
            return;
        }
        synchronized (topicsSubscriber) {
            z = topicsSubscriber.syncScheduledOrRunning;
        }
        if (z) {
            return;
        }
        topicsSubscriber.syncWithDelaySecondsInternal(0L);
    }

    @Override
    public void onTouchEnd() {
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        switch (this.$r8$classId) {
            case 21:
                UItem uItem = (UItem) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float fFloatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) this.f$0;
                int i2 = uItem.id;
                if (i2 == -1) {
                    boolean z = !openingHoursActivity.enabled;
                    openingHoursActivity.enabled = z;
                    ((TextCheckCell) view).setChecked(z);
                    openingHoursActivity.listView.adapter.update(true);
                    openingHoursActivity.checkDone$3(true);
                    break;
                } else if (i2 == -2) {
                    TimezoneSelector timezoneSelector = new TimezoneSelector(null);
                    timezoneSelector.currentTimezone = openingHoursActivity.timezoneId;
                    timezoneSelector.whenTimezoneSelected = new ArticleViewer$$ExternalSyntheticLambda21(8, openingHoursActivity, view);
                    openingHoursActivity.presentFragment(timezoneSelector);
                    break;
                } else if (uItem.viewType == 5 && i2 >= 0 && i2 < openingHoursActivity.value.length) {
                    if (!LocaleController.isRTL ? fFloatValue >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : fFloatValue <= AndroidUtilities.dp(76.0f)) {
                        int i3 = (uItem.id + 6) % 7;
                        int i4 = 0;
                        for (int i5 = 0; i5 < openingHoursActivity.value[i3].size(); i5++) {
                            if (((OpeningHoursActivity.Period) openingHoursActivity.value[i3].get(i5)).end > i4) {
                                i4 = ((OpeningHoursActivity.Period) openingHoursActivity.value[i3].get(i5)).end;
                            }
                        }
                        int iMax = Math.max(0, i4 - 1439);
                        int i6 = (uItem.id + 1) % 7;
                        int i7 = 1440;
                        for (int i8 = 0; i8 < openingHoursActivity.value[i6].size(); i8++) {
                            if (((OpeningHoursActivity.Period) openingHoursActivity.value[i6].get(i8)).start < i7) {
                                i7 = ((OpeningHoursActivity.Period) openingHoursActivity.value[i6].get(i8)).start;
                            }
                        }
                        int i9 = i7 + 1439;
                        CharSequence charSequence = uItem.text;
                        ArrayList arrayList = openingHoursActivity.value[uItem.id];
                        int iMax2 = 0;
                        for (int i10 = 0; i10 < 7; i10++) {
                            ArrayList arrayList2 = openingHoursActivity.value[i10];
                            if (arrayList2 != null) {
                                iMax2 = Math.max(1, arrayList2.size()) + iMax2;
                            }
                        }
                        OpeningHoursDayActivity openingHoursDayActivity = new OpeningHoursDayActivity(iMax, arrayList, charSequence, i9, 28 - iMax2);
                        openingHoursDayActivity.whenApplied = new ArticleViewer$$ExternalSyntheticLambda3(openingHoursActivity, 17);
                        openingHoursDayActivity.whenDone = new ArticleViewer$$ExternalSyntheticLambda8(14, openingHoursActivity, uItem);
                        openingHoursActivity.presentFragment(openingHoursDayActivity);
                    } else {
                        if (openingHoursActivity.value[uItem.id].isEmpty()) {
                            ((NotificationsCheckCell) view).setChecked(true);
                            openingHoursActivity.value[uItem.id].add(new OpeningHoursActivity.Period(0, 1439));
                            openingHoursActivity.adaptPrevDay(uItem.id);
                        } else {
                            openingHoursActivity.value[uItem.id].clear();
                            ((NotificationsCheckCell) view).setChecked(false);
                        }
                        ((NotificationsCheckCell) view).setValue(OpeningHoursActivity.getPeriodsValue(openingHoursActivity.value[uItem.id]));
                        openingHoursActivity.checkDone$3(true);
                    }
                    break;
                }
                break;
            case 22:
                UItem uItem2 = (UItem) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                final OpeningHoursDayActivity openingHoursDayActivity2 = (OpeningHoursDayActivity) this.f$0;
                int i11 = uItem2.id;
                ArrayList arrayList3 = openingHoursDayActivity2.periods;
                if (i11 == -1) {
                    openingHoursDayActivity2.enabled = !openingHoursDayActivity2.enabled;
                    arrayList3.clear();
                    if (openingHoursDayActivity2.enabled) {
                        arrayList3.add(new OpeningHoursActivity.Period(0, 1439));
                    }
                    TextCheckCell textCheckCell = (TextCheckCell) view2;
                    boolean z2 = openingHoursDayActivity2.enabled;
                    uItem2.checked = z2;
                    textCheckCell.setChecked(z2);
                    boolean z3 = openingHoursDayActivity2.enabled;
                    textCheckCell.setBackgroundColorAnimated(Theme.getColor(null, z3 ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false), z3);
                    openingHoursDayActivity2.listView.adapter.update(true);
                    ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda3 = openingHoursDayActivity2.whenApplied;
                    if (articleViewer$$ExternalSyntheticLambda3 != null) {
                        articleViewer$$ExternalSyntheticLambda3.run();
                    }
                    break;
                } else {
                    int i12 = openingHoursDayActivity2.min;
                    int i13 = openingHoursDayActivity2.max;
                    if (i11 == -2) {
                        if (arrayList3.isEmpty() || openingHoursDayActivity2.is24()) {
                            if (openingHoursDayActivity2.is24()) {
                                arrayList3.clear();
                            }
                            int iClamp = Utilities.clamp(480, i13 - 1, i12);
                            arrayList3.add(new OpeningHoursActivity.Period(iClamp, Utilities.clamp(1200, i13, iClamp + 1)));
                        } else {
                            int i14 = ((OpeningHoursActivity.Period) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3)).end;
                            int iClamp2 = Utilities.clamp(i14 + 30, i13 - 1, i12);
                            arrayList3.add(new OpeningHoursActivity.Period(iClamp2, Utilities.clamp((i14 + 1560) / 2, i13, iClamp2 + 1)));
                        }
                        ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda4 = openingHoursDayActivity2.whenApplied;
                        if (articleViewer$$ExternalSyntheticLambda4 != null) {
                            articleViewer$$ExternalSyntheticLambda4.run();
                        }
                        openingHoursDayActivity2.listView.adapter.update(true);
                        break;
                    } else if (uItem2.viewType == 3 && (i = i11 / 3) >= 0 && i < arrayList3.size()) {
                        int i15 = i - 1;
                        OpeningHoursActivity.Period period = i15 >= 0 ? (OpeningHoursActivity.Period) arrayList3.get(i15) : null;
                        final OpeningHoursActivity.Period period2 = (OpeningHoursActivity.Period) arrayList3.get(i);
                        int i16 = i + 1;
                        OpeningHoursActivity.Period period3 = i16 < arrayList3.size() ? (OpeningHoursActivity.Period) arrayList3.get(i16) : null;
                        int i17 = uItem2.id % 3;
                        if (i17 == 0) {
                            Activity parentActivity = openingHoursDayActivity2.getParentActivity();
                            String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                            int i18 = period2.start;
                            if (period != null) {
                                i12 = period.end + 1;
                            }
                            final int i19 = 0;
                            AlertsCreator.createTimePickerDialog(parentActivity, string, i18, i12, period2.end - 1, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj6) {
                                    Integer num = (Integer) obj6;
                                    switch (i19) {
                                        case 0:
                                            OpeningHoursDayActivity openingHoursDayActivity3 = openingHoursDayActivity2;
                                            boolean zShowAddButton = openingHoursDayActivity3.showAddButton();
                                            TextCell textCell = (TextCell) view2;
                                            int iIntValue = num.intValue();
                                            period2.start = iIntValue;
                                            textCell.setValue(OpeningHoursActivity.Period.timeToString(iIntValue), true);
                                            if (zShowAddButton != openingHoursDayActivity3.showAddButton()) {
                                                openingHoursDayActivity3.listView.adapter.update(true);
                                            }
                                            ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda5 = openingHoursDayActivity3.whenApplied;
                                            if (articleViewer$$ExternalSyntheticLambda5 != null) {
                                                articleViewer$$ExternalSyntheticLambda5.run();
                                            }
                                            break;
                                        default:
                                            OpeningHoursDayActivity openingHoursDayActivity4 = openingHoursDayActivity2;
                                            boolean zShowAddButton2 = openingHoursDayActivity4.showAddButton();
                                            TextCell textCell2 = (TextCell) view2;
                                            int iIntValue2 = num.intValue();
                                            period2.end = iIntValue2;
                                            textCell2.setValue(OpeningHoursActivity.Period.timeToString(iIntValue2), true);
                                            if (zShowAddButton2 != openingHoursDayActivity4.showAddButton()) {
                                                openingHoursDayActivity4.listView.adapter.update(true);
                                            }
                                            ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda6 = openingHoursDayActivity4.whenApplied;
                                            if (articleViewer$$ExternalSyntheticLambda6 != null) {
                                                articleViewer$$ExternalSyntheticLambda6.run();
                                            }
                                            break;
                                    }
                                }
                            });
                        } else if (i17 == 1) {
                            Activity parentActivity2 = openingHoursDayActivity2.getParentActivity();
                            String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                            int i20 = period2.end;
                            int i21 = period2.start + 1;
                            if (period3 != null) {
                                i13 = period3.start - 1;
                            }
                            final int i22 = 1;
                            AlertsCreator.createTimePickerDialog(parentActivity2, string2, i20, i21, i13, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj6) {
                                    Integer num = (Integer) obj6;
                                    switch (i22) {
                                        case 0:
                                            OpeningHoursDayActivity openingHoursDayActivity3 = openingHoursDayActivity2;
                                            boolean zShowAddButton = openingHoursDayActivity3.showAddButton();
                                            TextCell textCell = (TextCell) view2;
                                            int iIntValue = num.intValue();
                                            period2.start = iIntValue;
                                            textCell.setValue(OpeningHoursActivity.Period.timeToString(iIntValue), true);
                                            if (zShowAddButton != openingHoursDayActivity3.showAddButton()) {
                                                openingHoursDayActivity3.listView.adapter.update(true);
                                            }
                                            ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda5 = openingHoursDayActivity3.whenApplied;
                                            if (articleViewer$$ExternalSyntheticLambda5 != null) {
                                                articleViewer$$ExternalSyntheticLambda5.run();
                                            }
                                            break;
                                        default:
                                            OpeningHoursDayActivity openingHoursDayActivity4 = openingHoursDayActivity2;
                                            boolean zShowAddButton2 = openingHoursDayActivity4.showAddButton();
                                            TextCell textCell2 = (TextCell) view2;
                                            int iIntValue2 = num.intValue();
                                            period2.end = iIntValue2;
                                            textCell2.setValue(OpeningHoursActivity.Period.timeToString(iIntValue2), true);
                                            if (zShowAddButton2 != openingHoursDayActivity4.showAddButton()) {
                                                openingHoursDayActivity4.listView.adapter.update(true);
                                            }
                                            ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda6 = openingHoursDayActivity4.whenApplied;
                                            if (articleViewer$$ExternalSyntheticLambda6 != null) {
                                                articleViewer$$ExternalSyntheticLambda6.run();
                                            }
                                            break;
                                    }
                                }
                            });
                        } else if (i17 == 2) {
                            arrayList3.remove(i);
                            if (arrayList3.isEmpty()) {
                                arrayList3.add(new OpeningHoursActivity.Period(0, 1439));
                            }
                            openingHoursDayActivity2.listView.adapter.update(true);
                            ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda5 = openingHoursDayActivity2.whenApplied;
                            if (articleViewer$$ExternalSyntheticLambda5 != null) {
                                articleViewer$$ExternalSyntheticLambda5.run();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((TimezoneSelector) this.f$0).onClick$6((UItem) obj, (View) obj2);
                break;
        }
    }

    @Override
    public Object then(Task task) throws IOException {
        boolean z;
        switch (this.$r8$classId) {
            case 2:
                ((GmsRpc) this.f$0).getClass();
                if (task.isSuccessful()) {
                    AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId = (AutoValue_CrashlyticsReportWithSessionId) task.getResult();
                    Logger logger = Logger.DEFAULT_LOGGER;
                    logger.d("Crashlytics report successfully enqueued to DataTransport: " + autoValue_CrashlyticsReportWithSessionId.sessionId);
                    File file = autoValue_CrashlyticsReportWithSessionId.reportFile;
                    if (file.delete()) {
                        logger.d("Deleted report file: " + file.getPath());
                    } else {
                        logger.w("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ((CountDownLatch) this.f$0).countDown();
                return null;
            default:
                ((GmsRpc) this.f$0).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
