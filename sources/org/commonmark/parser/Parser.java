package org.commonmark.parser;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.util.AtomicFile;
import androidx.datastore.core.SimpleActor$1;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.SingleProcessDataStore$actor$1;
import androidx.datastore.core.SingleProcessDataStore$actor$3;
import androidx.emoji2.text.EmojiMetadata;
import androidx.emoji2.text.MetadataRepo$Node;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerViewModel;
import androidx.fragment.app.FragmentStateManager;
import androidx.lifecycle.LiveData$1;
import com.android.billingclient.api.zzcc;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource$MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.text.ssa.SsaSubtitle;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1;
import com.google.zxing.BinaryBitmap;
import com.stripe.android.Stripe;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannelKt;
import kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelSegment;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import org.commonmark.internal.DocumentParser;
import org.commonmark.node.Document;
import org.commonmark.parser.block.AbstractBlockParser;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.WebPlayerView;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda28;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.web.MHTML;

public final class Parser implements Factory, MediaSourceEventListener, DrmSessionEventListener {
    public static Parser instance;
    public final int $r8$classId;
    public Object blockParserFactories;
    public Object delimiterProcessors;
    public Object inlineParserFactory;
    public Object postProcessors;

    public Parser(int i, boolean z) {
        this.$r8$classId = i;
    }

    public static final Message access$getLatestByCode(Parser parser, ArrayList arrayList, int i) {
        Object obj;
        parser.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (((Message) obj2).what == i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static synchronized Parser getInstance() {
        try {
            if (instance == null) {
                instance = new Parser(1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    public static void removeExpiredExclusions(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public void addFragment(Fragment fragment) {
        if (((ArrayList) this.blockParserFactories).contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (((ArrayList) this.blockParserFactories)) {
            ((ArrayList) this.blockParserFactories).add(fragment);
        }
        fragment.mAdded = true;
    }

    public ArrayList applyExclusions(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.blockParserFactories;
        removeExpiredExclusions(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.delimiterProcessors;
        removeExpiredExclusions(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            BaseUrl baseUrl = (BaseUrl) list.get(i);
            if (!map.containsKey(baseUrl.serviceLocation) && !map2.containsKey(Integer.valueOf(baseUrl.priority))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails build() {
        String strM$1 = ((String) this.blockParserFactories) == null ? " processName" : "";
        if (((Integer) this.delimiterProcessors) == null) {
            strM$1 = strM$1.concat(" pid");
        }
        if (((Integer) this.postProcessors) == null) {
            strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1, " importance");
        }
        if (((Boolean) this.inlineParserFactory) == null) {
            strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1, " defaultProcess");
        }
        if (strM$1.isEmpty()) {
            return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails((String) this.blockParserFactories, ((Integer) this.delimiterProcessors).intValue(), ((Integer) this.postProcessors).intValue(), ((Boolean) this.inlineParserFactory).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM$1));
    }

    public void buildFunction(String str, String[] strArr) throws Exception {
        HashMap map = new HashMap();
        for (String str2 : strArr) {
            map.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            interpretStatement(str3, map, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String extractFunction(String str) {
        ArrayList arrayList = (ArrayList) this.blockParserFactories;
        try {
            String strQuote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + strQuote + "|[{;,]\\s*" + strQuote + "\\s*=\\s*function|var\\s+" + strQuote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.delimiterProcessors);
            if (matcher.find()) {
                String strGroup = matcher.group();
                if (!arrayList.contains(strGroup)) {
                    arrayList.add(strGroup + ";");
                }
                buildFunction(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e) {
            arrayList.clear();
            FileLog.e(e);
        }
        return TextUtils.join("", arrayList);
    }

    public Fragment findActiveFragment(String str) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) ((HashMap) this.delimiterProcessors).get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.mFragment;
        }
        return null;
    }

    public Fragment findFragmentByWho(String str) {
        for (FragmentStateManager fragmentStateManager : ((HashMap) this.delimiterProcessors).values()) {
            if (fragmentStateManager != null) {
                Fragment fragmentFindFragmentByWho = fragmentStateManager.mFragment;
                if (!str.equals(fragmentFindFragmentByWho.mWho)) {
                    fragmentFindFragmentByWho = fragmentFindFragmentByWho.mChildFragmentManager.mFragmentStore.findFragmentByWho(str);
                }
                if (fragmentFindFragmentByWho != null) {
                    return fragmentFindFragmentByWho;
                }
            }
        }
        return null;
    }

    @Override
    public Object get() {
        return new WorkInitializer((Executor) ((Provider) this.blockParserFactories).get(), (EventStore) ((Provider) this.delimiterProcessors).get(), (JobInfoScheduler) ((AtomicFile) this.postProcessors).get(), (SynchronizationGuard) ((Provider) this.inlineParserFactory).get());
    }

    public SupportActionModeWrapper getActionModeWrapper(ActionMode actionMode) {
        ArrayList arrayList = (ArrayList) this.blockParserFactories;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) arrayList.get(i);
            if (supportActionModeWrapper != null && supportActionModeWrapper.mWrappedObject == actionMode) {
                return supportActionModeWrapper;
            }
        }
        SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper((Context) this.postProcessors, actionMode);
        arrayList.add(supportActionModeWrapper2);
        return supportActionModeWrapper2;
    }

    public ArrayList getActiveFragmentStateManagers() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : ((HashMap) this.delimiterProcessors).values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    public ArrayList getActiveFragments() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : ((HashMap) this.delimiterProcessors).values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.mFragment);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List getFragments() {
        ArrayList arrayList;
        if (((ArrayList) this.blockParserFactories).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.blockParserFactories)) {
            arrayList = new ArrayList((ArrayList) this.blockParserFactories);
        }
        return arrayList;
    }

    public boolean hasAccessNetworkStatePermission(Context context) {
        if (((Boolean) this.postProcessors) == null) {
            this.postProcessors = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.delimiterProcessors).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.postProcessors).booleanValue();
    }

    public boolean hasWakeLockPermission(Context context) {
        if (((Boolean) this.delimiterProcessors) == null) {
            this.delimiterProcessors = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.delimiterProcessors).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.delimiterProcessors).booleanValue();
    }

    public void interpretExpression(int i, String str, HashMap map) throws Exception {
        String strTrim = str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (strTrim.charAt(0) == '(') {
            Matcher matcher = WebPlayerView.exprParensPattern.matcher(strTrim);
            int i2 = 0;
            while (matcher.find()) {
                if (matcher.group(0).indexOf(48) == 40) {
                    i2++;
                } else {
                    i2--;
                    if (i2 == 0) {
                        interpretExpression(i, strTrim.substring(1, matcher.start()), map);
                        strTrim = strTrim.substring(matcher.end()).trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            break;
                        } else {
                            return;
                        }
                    }
                }
            }
            if (i2 != 0) {
                throw new Exception(SurfaceContainer$$ExternalSyntheticOutline0.m("Premature end of parens in ", strTrim));
            }
        }
        int i3 = 0;
        while (true) {
            String[] strArr = (String[]) this.inlineParserFactory;
            if (i3 < strArr.length) {
                String str2 = strArr[i3];
                Locale locale = Locale.US;
                Matcher matcher2 = Pattern.compile("(?x)([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\[([^\\]]+?)\\])?\\s*" + Pattern.quote(str2) + "(.*)$").matcher(strTrim);
                if (matcher2.find()) {
                    interpretExpression(i - 1, matcher2.group(3), map);
                    String strGroup = matcher2.group(2);
                    if (TextUtils.isEmpty(strGroup)) {
                        map.put(matcher2.group(1), "");
                        return;
                    } else {
                        interpretExpression(i, strGroup, map);
                        return;
                    }
                }
                i3++;
            } else {
                try {
                    Integer.parseInt(strTrim);
                    return;
                } catch (Exception unused) {
                    Locale locale2 = Locale.US;
                    if (Pattern.compile("(?!if|return|true|false)([a-zA-Z_$][a-zA-Z_$0-9]*)$").matcher(strTrim).find()) {
                        return;
                    }
                    if (strTrim.charAt(0) == '\"' && strTrim.charAt(strTrim.length() - 1) == '\"') {
                        return;
                    }
                    try {
                        new JSONObject(strTrim).toString();
                        return;
                    } catch (Exception unused2) {
                        Locale locale3 = Locale.US;
                        Matcher matcher3 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(strTrim);
                        if (matcher3.find()) {
                            matcher3.group(1);
                            interpretExpression(i - 1, matcher3.group(2), map);
                            return;
                        }
                        Matcher matcher4 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\.([^(]+)|\\[([^]]+)\\])\\s*(?:\\(+([^()]*)\\))?$").matcher(strTrim);
                        if (matcher4.find()) {
                            String strGroup2 = matcher4.group(1);
                            String strGroup3 = matcher4.group(2);
                            String strGroup4 = matcher4.group(3);
                            if (TextUtils.isEmpty(strGroup3)) {
                                strGroup3 = strGroup4;
                            }
                            strGroup3.replace("\"", "");
                            String strGroup5 = matcher4.group(4);
                            if (map.get(strGroup2) == null) {
                                new HashMap();
                                Matcher matcher5 = Pattern.compile("(?:var\\s+)?" + Pattern.quote(strGroup2) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher((String) this.delimiterProcessors);
                                String str3 = null;
                                while (matcher5.find()) {
                                    String strGroup6 = matcher5.group();
                                    String strGroup7 = matcher5.group(2);
                                    if (!TextUtils.isEmpty(strGroup7)) {
                                        ArrayList arrayList = (ArrayList) this.blockParserFactories;
                                        if (!arrayList.contains(strGroup6)) {
                                            arrayList.add(matcher5.group());
                                        }
                                        str3 = strGroup7;
                                        break;
                                    }
                                    str3 = strGroup7;
                                }
                                Matcher matcher6 = Pattern.compile("((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+'))\\s*:\\s*function\\(([a-z,]+)\\)\\{([^}]+)\\}").matcher(str3);
                                while (matcher6.find()) {
                                    buildFunction(matcher6.group(3), matcher6.group(2).split(","));
                                }
                            }
                            if (strGroup5 == null) {
                                return;
                            }
                            if (strTrim.charAt(strTrim.length() - 1) != ')') {
                                throw new Exception("last char not ')'");
                            }
                            if (strGroup5.length() != 0) {
                                for (String str4 : strGroup5.split(",")) {
                                    interpretExpression(i, str4, map);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(strTrim);
                        if (matcher7.find()) {
                            map.get(matcher7.group(1));
                            interpretExpression(i - 1, matcher7.group(2), map);
                            return;
                        }
                        int i4 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.postProcessors;
                            if (i4 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(strTrim);
                                if (matcher8.find()) {
                                    extractFunction(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(strTrim));
                            }
                            String str5 = strArr2[i4];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(strTrim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i5 = i - 1;
                                interpretStatement(matcher9.group(1), map, zArr, i5);
                                if (zArr[0]) {
                                    throw new Exception(SurfaceContainer$$ExternalSyntheticOutline0.m("Premature left-side return of ", str5, " in ", strTrim));
                                }
                                interpretStatement(matcher9.group(2), map, zArr, i5);
                                if (zArr[0]) {
                                    throw new Exception(SurfaceContainer$$ExternalSyntheticOutline0.m("Premature right-side return of ", str5, " in ", strTrim));
                                }
                            }
                            i4++;
                        }
                    }
                }
            }
        }
    }

    public void interpretStatement(String str, HashMap map, boolean[] zArr, int i) throws Exception {
        if (i < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String strTrim = str.trim();
        Matcher matcher = WebPlayerView.stmtVarPattern.matcher(strTrim);
        if (matcher.find()) {
            strTrim = strTrim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = WebPlayerView.stmtReturnPattern.matcher(strTrim);
            if (matcher2.find()) {
                strTrim = strTrim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        interpretExpression(i, strTrim, map);
    }

    public void makeActive(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.mFragment;
        String str = fragment.mWho;
        HashMap map = (HashMap) this.delimiterProcessors;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, fragmentStateManager);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public void makeInactive(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.mFragment;
        if (fragment.mRetainInstance) {
            ((FragmentManagerViewModel) this.inlineParserFactory).removeRetainedFragment(fragment);
        }
        HashMap map = (HashMap) this.delimiterProcessors;
        if (map.get(fragment.mWho) == fragmentStateManager && ((FragmentStateManager) map.put(fragment.mWho, null)) != null && FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public boolean maybeUpdateEventDispatcher(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        MediaSource$MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
        CompositeMediaSource compositeMediaSource = (CompositeMediaSource) this.inlineParserFactory;
        Integer num = (Integer) this.blockParserFactories;
        if (mediaSource$MediaPeriodId != null) {
            mediaPeriodIdForChildMediaPeriodId = compositeMediaSource.getMediaPeriodIdForChildMediaPeriodId(num, mediaSource$MediaPeriodId);
            if (mediaPeriodIdForChildMediaPeriodId == null) {
                return false;
            }
        } else {
            mediaPeriodIdForChildMediaPeriodId = null;
        }
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = mediaPeriodIdForChildMediaPeriodId;
        int windowIndexForChildWindowIndex = compositeMediaSource.getWindowIndexForChildWindowIndex(i, num);
        MediaSourceEventListener.EventDispatcher eventDispatcher = (MediaSourceEventListener.EventDispatcher) this.delimiterProcessors;
        if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaSource$MediaPeriodId2)) {
            this.delimiterProcessors = new MediaSourceEventListener.EventDispatcher(compositeMediaSource.eventDispatcher.listenerAndHandlers, windowIndexForChildWindowIndex, mediaSource$MediaPeriodId2, 0L);
        }
        Splitter splitter = (Splitter) this.postProcessors;
        if (splitter.limit == windowIndexForChildWindowIndex && Util.areEqual((MediaSource$MediaPeriodId) splitter.trimmer, mediaSource$MediaPeriodId2)) {
            return true;
        }
        this.postProcessors = new Splitter((CopyOnWriteArrayList) compositeMediaSource.drmEventDispatcher.strategy, windowIndexForChildWindowIndex, mediaSource$MediaPeriodId2);
        return true;
    }

    public MediaLoadData maybeUpdateMediaLoadData(MediaLoadData mediaLoadData) {
        CompositeMediaSource compositeMediaSource = (CompositeMediaSource) this.inlineParserFactory;
        Integer num = (Integer) this.blockParserFactories;
        long j = mediaLoadData.mediaStartTimeMs;
        long mediaTimeForChildMediaTime = compositeMediaSource.getMediaTimeForChildMediaTime(j, num);
        long j2 = mediaLoadData.mediaEndTimeMs;
        long mediaTimeForChildMediaTime2 = compositeMediaSource.getMediaTimeForChildMediaTime(j2, num);
        if (mediaTimeForChildMediaTime == j && mediaTimeForChildMediaTime2 == j2) {
            return mediaLoadData;
        }
        return new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
    }

    public void offer(SingleProcessDataStore.Message message) throws Throwable {
        Symbol symbol;
        boolean z;
        BufferedChannel bufferedChannel;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        ChannelSegment channelSegment;
        int i;
        long j;
        boolean z2;
        Continuation continuation;
        int i2;
        int iUpdateCellSendSlow;
        Object closed;
        ?? r1;
        Waiter waiter;
        Object objFindSegmentInternal;
        ChannelSegment channelSegment2;
        ChannelSegment channelSegment3;
        Throwable th;
        SingleProcessDataStore.Message message2 = message;
        boolean z3 = false;
        BufferedChannel bufferedChannel2 = (BufferedChannel) this.postProcessors;
        bufferedChannel2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = BufferedChannel.sendersAndCloseStatus$volatile$FU;
        long j2 = atomicLongFieldUpdater2.get(bufferedChannel2);
        boolean z4 = bufferedChannel2.isClosed(j2, false) ? false : !bufferedChannel2.bufferOrRendezvousSend(j2 & 1152921504606846975L);
        Object obj = ChannelResult.failed;
        if (!z4) {
            Symbol symbol2 = BufferedChannelKt.INTERRUPTED_SEND;
            ChannelSegment channelSegment4 = (ChannelSegment) BufferedChannel.sendSegment$volatile$FU.get(bufferedChannel2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bufferedChannel2);
                long j3 = andIncrement & 1152921504606846975L;
                boolean zIsClosed = bufferedChannel2.isClosed(andIncrement, z3);
                int i3 = BufferedChannelKt.SEGMENT_SIZE;
                long j4 = i3;
                long j5 = j3 / j4;
                int i4 = (int) (j3 % j4);
                if (channelSegment4.id != j5) {
                    ChannelSegment channelSegment5 = BufferedChannelKt.NULL_SEGMENT;
                    BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
                    while (true) {
                        objFindSegmentInternal = AtomicKt.findSegmentInternal(channelSegment4, j5, bufferedChannelKt$createSegmentFunction$1);
                        if (AtomicKt.m144isClosedimpl(objFindSegmentInternal)) {
                            symbol = symbol2;
                            z = zIsClosed;
                            break;
                        }
                        Segment segmentM143getSegmentimpl = AtomicKt.m143getSegmentimpl(objFindSegmentInternal);
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BufferedChannel.sendSegment$volatile$FU;
                            Segment segment = (Segment) atomicReferenceFieldUpdater.get(bufferedChannel2);
                            symbol = symbol2;
                            z = zIsClosed;
                            if (segment.id >= segmentM143getSegmentimpl.id) {
                                break;
                            }
                            if (!segmentM143getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(bufferedChannel2, segment, segmentM143getSegmentimpl)) {
                                    if (!segment.decPointers$kotlinx_coroutines_core()) {
                                        break;
                                    }
                                    segment.remove();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(bufferedChannel2) == segment);
                            if (segmentM143getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM143getSegmentimpl.remove();
                            }
                            symbol2 = symbol;
                            zIsClosed = z;
                        }
                        symbol2 = symbol;
                        zIsClosed = z;
                    }
                    boolean zM144isClosedimpl = AtomicKt.m144isClosedimpl(objFindSegmentInternal);
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = BufferedChannel.receivers$volatile$FU;
                    if (zM144isClosedimpl) {
                        bufferedChannel2.completeCloseOrCancel();
                        if (channelSegment4.id * ((long) BufferedChannelKt.SEGMENT_SIZE) < atomicLongFieldUpdater3.get(bufferedChannel2)) {
                            channelSegment4.cleanPrev();
                        }
                    } else {
                        channelSegment2 = (ChannelSegment) AtomicKt.m143getSegmentimpl(objFindSegmentInternal);
                        long j6 = channelSegment2.id;
                        if (j6 > j5) {
                            long j7 = ((long) BufferedChannelKt.SEGMENT_SIZE) * j6;
                            while (true) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = BufferedChannel.sendersAndCloseStatus$volatile$FU;
                                long j8 = atomicLongFieldUpdater4.get(bufferedChannel2);
                                long j9 = j8 & 1152921504606846975L;
                                if (j9 >= j7) {
                                    channelSegment3 = channelSegment2;
                                    break;
                                }
                                channelSegment3 = channelSegment2;
                                BufferedChannel bufferedChannel3 = bufferedChannel2;
                                bufferedChannel2 = bufferedChannel3;
                                if (atomicLongFieldUpdater4.compareAndSet(bufferedChannel3, j8, (((long) ((int) (j8 >> 60))) << 60) + j9)) {
                                    break;
                                } else {
                                    channelSegment2 = channelSegment3;
                                }
                            }
                            if (j6 * ((long) BufferedChannelKt.SEGMENT_SIZE) < atomicLongFieldUpdater3.get(bufferedChannel2)) {
                                channelSegment3.cleanPrev();
                            }
                        }
                        if (channelSegment2 == null) {
                            channelSegment4 = channelSegment2;
                        } else if (z) {
                            closed = new ChannelResult.Closed(bufferedChannel2.getSendException());
                        } else {
                            symbol2 = symbol;
                            z3 = false;
                        }
                    }
                    channelSegment2 = null;
                    if (channelSegment2 == null) {
                        channelSegment4 = channelSegment2;
                    } else if (z) {
                        closed = new ChannelResult.Closed(bufferedChannel2.getSendException());
                    } else {
                        symbol2 = symbol;
                        z3 = false;
                    }
                } else {
                    symbol = symbol2;
                    z = zIsClosed;
                }
                channelSegment4.setElementLazy(i4, message2);
                if (z) {
                    bufferedChannel = bufferedChannel2;
                    atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    channelSegment = channelSegment4;
                    i = i4;
                    j = j3;
                    symbol2 = symbol;
                    z2 = z;
                    continuation = null;
                    iUpdateCellSendSlow = bufferedChannel.updateCellSendSlow(channelSegment, i, message2, j, symbol2, z2);
                    i2 = 1;
                } else {
                    bufferedChannel = bufferedChannel2;
                    atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    channelSegment = channelSegment4;
                    i = i4;
                    j = j3;
                    symbol2 = symbol;
                    z2 = z;
                    continuation = null;
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core == null) {
                        if (bufferedChannel.bufferOrRendezvousSend(j)) {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                                i2 = 1;
                                iUpdateCellSendSlow = 1;
                            } else {
                                i2 = 1;
                                iUpdateCellSendSlow = bufferedChannel.updateCellSendSlow(channelSegment, i, message2, j, symbol2, z2);
                            }
                        } else if (symbol2 == null) {
                            i2 = 1;
                            iUpdateCellSendSlow = 3;
                        } else if (channelSegment.casState$kotlinx_coroutines_core(i, null, symbol2)) {
                            i2 = 1;
                            iUpdateCellSendSlow = 2;
                        } else {
                            i2 = 1;
                            iUpdateCellSendSlow = bufferedChannel.updateCellSendSlow(channelSegment, i, message2, j, symbol2, z2);
                        }
                    } else if (state$kotlinx_coroutines_core instanceof Waiter) {
                        channelSegment.setElementLazy(i, null);
                        if (bufferedChannel.tryResumeReceiver(state$kotlinx_coroutines_core, message2)) {
                            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                            i2 = 1;
                            iUpdateCellSendSlow = 0;
                        } else {
                            Symbol symbol3 = BufferedChannelKt.INTERRUPTED_RCV;
                            if (channelSegment.data.getAndSet((i * 2) + 1, symbol3) != symbol3) {
                                i2 = 1;
                                channelSegment.onCancelledRequest(i, true);
                            } else {
                                i2 = 1;
                            }
                            iUpdateCellSendSlow = 5;
                        }
                    } else {
                        i2 = 1;
                        iUpdateCellSendSlow = bufferedChannel.updateCellSendSlow(channelSegment, i, message2, j, symbol2, z2);
                    }
                }
                Object obj2 = Unit.INSTANCE;
                if (iUpdateCellSendSlow == 0) {
                    channelSegment.cleanPrev();
                } else if (iUpdateCellSendSlow != i2) {
                    if (iUpdateCellSendSlow == 2) {
                        if (!z2) {
                            if (symbol2 instanceof Waiter) {
                                waiter = (Waiter) symbol2;
                            } else {
                                r1 = continuation;
                            }
                            if (r1 != 0) {
                                r1 = waiter;
                                r1.invokeOnCancellation(channelSegment, i + i3);
                            }
                            r1 = waiter;
                            channelSegment.onSlotCleaned();
                            closed = obj;
                            break;
                        }
                        channelSegment.onSlotCleaned();
                        closed = new ChannelResult.Closed(bufferedChannel.getSendException());
                        break;
                    }
                    if (iUpdateCellSendSlow == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iUpdateCellSendSlow == 4) {
                        if (j < BufferedChannel.receivers$volatile$FU.get(bufferedChannel)) {
                            channelSegment.cleanPrev();
                        }
                        closed = new ChannelResult.Closed(bufferedChannel.getSendException());
                        break;
                    } else {
                        if (iUpdateCellSendSlow == 5) {
                            channelSegment.cleanPrev();
                        }
                        message2 = message;
                        channelSegment4 = channelSegment;
                        atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                        z3 = false;
                        bufferedChannel2 = bufferedChannel;
                    }
                }
                closed = obj2;
                break;
            }
            if (closed instanceof ChannelResult.Closed) {
                th = ((ChannelResult.Closed) closed).cause;
                if (th == null) {
                    throw th;
                }
                throw new ClosedSendChannelException("Channel was closed normally");
            }
            if (!(closed instanceof ChannelResult.Failed)) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) this.inlineParserFactory).getAndIncrement() == 0) {
                JobKt.launch$default((CoroutineScope) this.blockParserFactories, new SimpleActor$offer$2(this, continuation));
            }
        }
        closed = obj;
        continuation = null;
        if (closed instanceof ChannelResult.Closed) {
            th = ((ChannelResult.Closed) closed).cause;
            if (th == null) {
                throw th;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!(closed instanceof ChannelResult.Failed)) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.inlineParserFactory).getAndIncrement() == 0) {
            JobKt.launch$default((CoroutineScope) this.blockParserFactories, new SimpleActor$offer$2(this, continuation));
        }
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return ((android.view.ActionMode.Callback) this.delimiterProcessors).onActionItemClicked(getActionModeWrapper(actionMode), new MenuItemWrapperICS((Context) this.postProcessors, (SupportMenuItem) menuItem));
    }

    public boolean onCreateActionMode(ActionMode actionMode, MenuBuilder menuBuilder) {
        SupportActionModeWrapper actionModeWrapper = getActionModeWrapper(actionMode);
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.inlineParserFactory;
        Menu menuWrapperICS = (Menu) simpleArrayMap.get(menuBuilder);
        if (menuWrapperICS == null) {
            menuWrapperICS = new MenuWrapperICS((Context) this.postProcessors, menuBuilder);
            simpleArrayMap.put(menuBuilder, menuWrapperICS);
        }
        return ((android.view.ActionMode.Callback) this.delimiterProcessors).onCreateActionMode(actionModeWrapper, menuWrapperICS);
    }

    @Override
    public void onDownstreamFormatChanged(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, MediaLoadData mediaLoadData) {
        if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
            ((MediaSourceEventListener.EventDispatcher) this.delimiterProcessors).downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData));
        }
    }

    @Override
    public void onLoadCanceled(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
            ((MediaSourceEventListener.EventDispatcher) this.delimiterProcessors).loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
        }
    }

    @Override
    public void onLoadCompleted(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
            ((MediaSourceEventListener.EventDispatcher) this.delimiterProcessors).loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
        }
    }

    @Override
    public void onLoadError(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
            ((MediaSourceEventListener.EventDispatcher) this.delimiterProcessors).loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData), iOException, z);
        }
    }

    @Override
    public void onLoadStarted(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
            ((MediaSourceEventListener.EventDispatcher) this.delimiterProcessors).loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
        }
    }

    @Override
    public void onUpstreamDiscarded(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, MediaLoadData mediaLoadData) {
        if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
            ((MediaSourceEventListener.EventDispatcher) this.delimiterProcessors).upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData));
        }
    }

    public Document parse(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        DocumentParser documentParser = new DocumentParser((ArrayList) this.blockParserFactories, (InlineParserFactory) this.inlineParserFactory, (ArrayList) this.delimiterProcessors);
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            documentParser.incorporateLine(str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            documentParser.incorporateLine(str.substring(i));
        }
        documentParser.finalizeBlocks(documentParser.activeBlockParsers);
        InlineParser inlineParserCreate = documentParser.inlineParserFactory.create(new BinaryBitmap(documentParser.delimiterProcessors, documentParser.definitions, false, 15));
        Iterator it = documentParser.allBlockParsers.iterator();
        while (it.hasNext()) {
            ((AbstractBlockParser) it.next()).parseInlines(inlineParserCreate);
        }
        Document document = (Document) documentParser.documentBlockParser.document;
        Iterator it2 = ((ArrayList) this.postProcessors).iterator();
        if (!it2.hasNext()) {
            return document;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public void queueMessage(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.postProcessors;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public BaseUrl selectBaseUrl(List list) {
        BaseUrl baseUrl;
        ArrayList arrayListApplyExclusions = applyExclusions(list);
        if (arrayListApplyExclusions.size() < 2) {
            return (BaseUrl) Maps.getFirst(arrayListApplyExclusions, null);
        }
        Collections.sort(arrayListApplyExclusions, new Theme$$ExternalSyntheticLambda5(2));
        ArrayList arrayList = new ArrayList();
        int i = ((BaseUrl) arrayListApplyExclusions.get(0)).priority;
        for (int i2 = 0; i2 < arrayListApplyExclusions.size(); i2++) {
            BaseUrl baseUrl2 = (BaseUrl) arrayListApplyExclusions.get(i2);
            if (i != baseUrl2.priority) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (BaseUrl) arrayListApplyExclusions.get(0);
            }
            arrayList.add(new Pair(baseUrl2.serviceLocation, Integer.valueOf(baseUrl2.weight)));
        }
        HashMap map = (HashMap) this.postProcessors;
        BaseUrl baseUrl3 = (BaseUrl) map.get(arrayList);
        if (baseUrl3 != null) {
            return baseUrl3;
        }
        List listSubList = arrayListApplyExclusions.subList(0, arrayList.size());
        int i3 = 0;
        for (int i4 = 0; i4 < listSubList.size(); i4++) {
            i3 += ((BaseUrl) listSubList.get(i4)).weight;
        }
        int iNextInt = ((Random) this.inlineParserFactory).nextInt(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < listSubList.size(); i6++) {
            baseUrl = (BaseUrl) listSubList.get(i6);
            i5 += baseUrl.weight;
            if (iNextInt < i5) {
                map.put(arrayList, baseUrl);
                return baseUrl;
            }
        }
        baseUrl = (BaseUrl) Maps.getLast(listSubList);
        map.put(arrayList, baseUrl);
        return baseUrl;
    }

    public void sendLifecycleEvent(int i) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.postProcessors).drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i, 0, 0);
        Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        JobKt.launch$default(JobKt.CoroutineScope((CoroutineContext) this.blockParserFactories), new SessionLifecycleClient$sendLifecycleEvents$1(this, arrayList, null));
    }

    public Bundle setSavedState(String str, Bundle bundle) {
        HashMap map = (HashMap) this.postProcessors;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void setViewInternal(View view) {
        if (((View) this.delimiterProcessors) == view) {
            return;
        }
        setViewTreeObserverInternal(null);
        View view2 = (View) this.delimiterProcessors;
        AvatarSpan.AnonymousClass1 anonymousClass1 = (AvatarSpan.AnonymousClass1) this.inlineParserFactory;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(anonymousClass1);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(anonymousClass1);
            if (view.isAttachedToWindow()) {
                setViewTreeObserverInternal(view.getViewTreeObserver());
            }
        }
        this.delimiterProcessors = view;
    }

    public void setViewTreeObserverInternal(ViewTreeObserver viewTreeObserver) {
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.postProcessors;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        LaunchActivity$$ExternalSyntheticLambda28 launchActivity$$ExternalSyntheticLambda28 = (LaunchActivity$$ExternalSyntheticLambda28) this.blockParserFactories;
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.postProcessors).removeOnGlobalLayoutListener(launchActivity$$ExternalSyntheticLambda28);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(launchActivity$$ExternalSyntheticLambda28);
        }
        this.postProcessors = viewTreeObserver;
    }

    public Task submit(Callable callable) {
        Task taskContinueWith;
        synchronized (this.postProcessors) {
            taskContinueWith = ((Task) this.delimiterProcessors).continueWith((ExecutorService) this.blockParserFactories, new Stripe.AnonymousClass1(callable, 8));
            this.delimiterProcessors = taskContinueWith.continueWith((ExecutorService) this.blockParserFactories, new PollItemMenu.AnonymousClass8(14));
        }
        return taskContinueWith;
    }

    public Task submitTask(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.postProcessors) {
            taskContinueWithTask = ((Task) this.delimiterProcessors).continueWithTask((ExecutorService) this.blockParserFactories, new Stripe.AnonymousClass1(callable, 8));
            this.delimiterProcessors = taskContinueWithTask.continueWith((ExecutorService) this.blockParserFactories, new PollItemMenu.AnonymousClass8(14));
        }
        return taskContinueWithTask;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 20:
                return ((PhotoViewer.AnonymousClass18) this.inlineParserFactory).toString();
            default:
                return super.toString();
        }
    }

    public Parser(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.blockParserFactories = obj;
        this.delimiterProcessors = obj2;
        this.postProcessors = obj3;
        this.inlineParserFactory = obj4;
    }

    public Parser(CompositeMediaSource compositeMediaSource, Integer num) {
        this.$r8$classId = 9;
        this.inlineParserFactory = compositeMediaSource;
        this.delimiterProcessors = compositeMediaSource.createEventDispatcher(null);
        this.postProcessors = new Splitter((CopyOnWriteArrayList) compositeMediaSource.drmEventDispatcher.strategy, 0, (MediaSource$MediaPeriodId) null);
        this.blockParserFactories = num;
    }

    public Parser(TrackGroupArray trackGroupArray, boolean[] zArr) {
        this.$r8$classId = 10;
        this.blockParserFactories = trackGroupArray;
        this.delimiterProcessors = zArr;
        int i = trackGroupArray.length;
        this.postProcessors = new boolean[i];
        this.inlineParserFactory = new boolean[i];
    }

    public Parser(String str) {
        this.$r8$classId = 23;
        this.blockParserFactories = new ArrayList();
        this.postProcessors = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.inlineParserFactory = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.delimiterProcessors = str;
    }

    public AutoValue_CrashlyticsReport_Session_OperatingSystem m147build() {
        String strM$1;
        if (((Integer) this.blockParserFactories) == null) {
            strM$1 = " platform";
        } else {
            strM$1 = "";
        }
        if (((String) this.delimiterProcessors) == null) {
            strM$1 = strM$1.concat(" version");
        }
        if (((String) this.postProcessors) == null) {
            strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1, " buildVersion");
        }
        if (((Boolean) this.inlineParserFactory) == null) {
            strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1, " jailbroken");
        }
        if (strM$1.isEmpty()) {
            return new AutoValue_CrashlyticsReport_Session_OperatingSystem(((Integer) this.blockParserFactories).intValue(), (String) this.delimiterProcessors, (String) this.postProcessors, ((Boolean) this.inlineParserFactory).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM$1));
    }

    public Parser(LegendSignatureView legendSignatureView) {
        this.$r8$classId = 22;
        LinearLayout linearLayout = new LinearLayout(legendSignatureView.getContext());
        this.inlineParserFactory = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (legendSignatureView.showPercentage) {
            TextView textView = new TextView(legendSignatureView.getContext());
            this.postProcessors = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(legendSignatureView.getContext());
        this.delimiterProcessors = textView2;
        linearLayout.addView(textView2, LayoutHelper.createLinear(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(legendSignatureView.getContext());
        this.blockParserFactories = textViewEmojis;
        linearLayout.addView(textViewEmojis, LayoutHelper.createLinear(-1, -2));
        textView2.setGravity(8388611);
        textViewEmojis.setGravity(8388613);
        textViewEmojis.setTypeface(AndroidUtilities.bold());
        textViewEmojis.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment m146build() {
        String strM$1;
        if (((AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant) this.blockParserFactories) == null) {
            strM$1 = " rolloutVariant";
        } else {
            strM$1 = "";
        }
        if (((String) this.delimiterProcessors) == null) {
            strM$1 = strM$1.concat(" parameterKey");
        }
        if (((String) this.postProcessors) == null) {
            strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1, " parameterValue");
        }
        if (((Long) this.inlineParserFactory) == null) {
            strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1, " templateVersion");
        }
        if (strM$1.isEmpty()) {
            return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment((AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant) this.blockParserFactories, (String) this.delimiterProcessors, (String) this.postProcessors, ((Long) this.inlineParserFactory).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM$1));
    }

    public Parser(LaunchActivity$$ExternalSyntheticLambda28 launchActivity$$ExternalSyntheticLambda28) {
        this.$r8$classId = 21;
        this.inlineParserFactory = new AvatarSpan.AnonymousClass1(this, 3);
        this.blockParserFactories = launchActivity$$ExternalSyntheticLambda28;
    }

    public Parser(CoroutineScope coroutineScope, SingleProcessDataStore$actor$1 singleProcessDataStore$actor$1, SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3) {
        this.$r8$classId = 3;
        int i = 0;
        this.blockParserFactories = coroutineScope;
        this.delimiterProcessors = singleProcessDataStore$actor$3;
        BufferOverflow[] bufferOverflowArr = BufferOverflow.$VALUES;
        this.postProcessors = new BufferedChannel(Integer.MAX_VALUE);
        this.inlineParserFactory = new AtomicInteger(0);
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key.$$INSTANCE);
        if (job == null) {
            return;
        }
        job.invokeOnCompletion(new SimpleActor$1(i, singleProcessDataStore$actor$1, this));
    }

    public Parser(MHTML mhtml) {
        boolean z = false;
        this.$r8$classId = 0;
        ArrayList arrayList = (ArrayList) mhtml.entries;
        LinkedHashSet linkedHashSet = (LinkedHashSet) mhtml.entriesByLocation;
        LinkedHashSet linkedHashSet2 = DocumentParser.CORE_FACTORY_TYPES;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(DocumentParser.NODES_TO_CORE_FACTORIES.get((Class) it.next()));
        }
        this.blockParserFactories = arrayList2;
        InlineParserFactory anonymousClass8 = (SsaSubtitle) mhtml.filePos;
        anonymousClass8 = anonymousClass8 == null ? new PollItemMenu.AnonymousClass8(22) : anonymousClass8;
        this.inlineParserFactory = anonymousClass8;
        this.postProcessors = (ArrayList) mhtml.boundary;
        ArrayList arrayList3 = (ArrayList) mhtml.file;
        this.delimiterProcessors = arrayList3;
        anonymousClass8.create(new BinaryBitmap(arrayList3, Collections.EMPTY_MAP, z, 15));
    }

    public Parser(CoroutineContext coroutineContext) {
        this.$r8$classId = 19;
        this.blockParserFactories = coroutineContext;
        this.postProcessors = new LinkedBlockingDeque(20);
        this.inlineParserFactory = new zzcc(this, 2);
    }

    public Parser(ExecutorService executorService) {
        this.$r8$classId = 14;
        this.delimiterProcessors = Tasks.forResult(null);
        this.postProcessors = new Object();
        this.inlineParserFactory = new ThreadLocal();
        this.blockParserFactories = executorService;
        executorService.execute(new LiveData$1(this, 28));
    }

    public Parser(Typeface typeface, MetadataList metadataList) {
        int i;
        int i2;
        int i3;
        int i4;
        this.$r8$classId = 4;
        this.inlineParserFactory = typeface;
        this.blockParserFactories = metadataList;
        this.postProcessors = new MetadataRepo$Node(1024);
        int i__offset = metadataList.__offset(6);
        if (i__offset != 0) {
            int i5 = i__offset + metadataList.bb_pos;
            i = ((ByteBuffer) metadataList.bb).getInt(((ByteBuffer) metadataList.bb).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.delimiterProcessors = new char[i * 2];
        int i__offset2 = metadataList.__offset(6);
        if (i__offset2 != 0) {
            int i6 = i__offset2 + metadataList.bb_pos;
            i2 = ((ByteBuffer) metadataList.bb).getInt(((ByteBuffer) metadataList.bb).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            EmojiMetadata emojiMetadata = new EmojiMetadata(this, i7);
            MetadataItem metadataItem = emojiMetadata.getMetadataItem();
            int i__offset3 = metadataItem.__offset(4);
            Character.toChars(i__offset3 != 0 ? ((ByteBuffer) metadataItem.bb).getInt(i__offset3 + metadataItem.bb_pos) : 0, (char[]) this.delimiterProcessors, i7 * 2);
            MetadataItem metadataItem2 = emojiMetadata.getMetadataItem();
            int i__offset4 = metadataItem2.__offset(16);
            if (i__offset4 != 0) {
                int i8 = i__offset4 + metadataItem2.bb_pos;
                i3 = ((ByteBuffer) metadataItem2.bb).getInt(((ByteBuffer) metadataItem2.bb).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                MetadataItem metadataItem3 = emojiMetadata.getMetadataItem();
                int i__offset5 = metadataItem3.__offset(16);
                if (i__offset5 != 0) {
                    int i9 = i__offset5 + metadataItem3.bb_pos;
                    i4 = ((ByteBuffer) metadataItem3.bb).getInt(((ByteBuffer) metadataItem3.bb).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                ((MetadataRepo$Node) this.postProcessors).put(emojiMetadata, 0, i4 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public Parser(PhotoViewer.AnonymousClass18 anonymousClass18, Object obj, Object obj2, Object[] objArr) {
        this.$r8$classId = 20;
        this.inlineParserFactory = anonymousClass18;
        this.blockParserFactories = obj;
        this.delimiterProcessors = obj2;
        this.postProcessors = objArr;
    }

    public Parser(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 5:
                this.blockParserFactories = new ArrayList();
                this.delimiterProcessors = new HashMap();
                this.postProcessors = new HashMap();
                break;
            case 11:
                Random random = new Random();
                this.postProcessors = new HashMap();
                this.inlineParserFactory = random;
                this.blockParserFactories = new HashMap();
                this.delimiterProcessors = new HashMap();
                break;
            default:
                this.blockParserFactories = null;
                this.delimiterProcessors = null;
                this.postProcessors = null;
                this.inlineParserFactory = new ArrayDeque();
                break;
        }
    }

    public Parser(Context context, android.view.ActionMode.Callback callback) {
        this.$r8$classId = 2;
        this.postProcessors = context;
        this.delimiterProcessors = callback;
        this.blockParserFactories = new ArrayList();
        this.inlineParserFactory = new SimpleArrayMap(0);
    }
}
