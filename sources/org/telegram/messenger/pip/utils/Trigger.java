package org.telegram.messenger.pip.utils;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.activity.ComponentDialog$$ExternalSyntheticLambda1;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TooltipPopup;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.mediarouter.media.MediaRouter;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.zzcl;
import com.android.billingclient.api.zzct;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzao;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.cast.zzab;
import com.google.android.gms.internal.cast.zzaf;
import com.google.android.gms.internal.cast.zzbb;
import com.google.android.gms.internal.cast.zzbh;
import com.google.android.gms.internal.cast.zzbj;
import com.google.android.gms.internal.cast.zzbn;
import com.google.android.gms.internal.cast.zzk;
import com.google.android.gms.internal.cast.zzml;
import com.google.android.gms.internal.cast.zznf;
import com.google.android.gms.internal.cast.zzng;
import com.google.android.gms.internal.cast.zznn;
import com.google.android.gms.internal.cast.zzno;
import com.google.android.gms.internal.cast.zzo;
import com.google.android.gms.internal.cast.zzx;
import com.google.android.gms.internal.cast.zzz;
import com.google.android.gms.internal.mlkit_language_id_common.zzhy;
import com.google.android.gms.internal.mlkit_language_id_common.zzj;
import com.google.android.gms.internal.mlkit_language_id_common.zzke;
import com.google.android.gms.internal.mlkit_language_id_common.zzli;
import com.google.android.gms.internal.mlkit_language_id_common.zzs;
import com.google.android.gms.internal.mlkit_language_id_common.zzu;
import com.google.android.gms.internal.mlkit_language_id_common.zzy;
import com.google.android.gms.internal.mlkit_vision_label.zzbc;
import com.google.android.gms.internal.mlkit_vision_label.zzbe;
import com.google.android.gms.internal.mlkit_vision_label.zzbu;
import com.google.android.gms.internal.mlkit_vision_label.zzkf;
import com.google.android.gms.internal.mlkit_vision_label.zzmh;
import com.google.android.gms.internal.mlkit_vision_label.zzmj;
import com.google.android.gms.internal.mlkit_vision_label.zznp;
import com.google.android.gms.internal.mlkit_vision_label.zzr;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzav;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzbl;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzh;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzob;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzsc;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zztl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.base.Splitter;
import com.google.firebase.messaging.GmsRpc;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.commonmark.parser.Parser;
import org.telegram.messenger.pip.source.PipSourceHandlerState2$$ExternalSyntheticLambda0;
import org.telegram.ui.CastSync;
import org.telegram.ui.web.MHTML;

public final class Trigger implements Runnable {
    public final int $r8$classId;
    public final Object action;
    public final Object handler;
    public final Object timeoutRunnable;
    public final Object triggered;

    public Trigger(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.handler = obj;
        this.action = obj2;
        this.timeoutRunnable = obj3;
        this.triggered = obj4;
    }

    private final void run$com$google$android$gms$internal$mlkit_language_id_common$zzlg() {
        String str;
        zzy zzyVar;
        zzli zzliVar = (zzli) this.handler;
        Splitter splitter = (Splitter) this.action;
        zzhy zzhyVar = (zzhy) this.timeoutRunnable;
        String str2 = (String) this.triggered;
        zzliVar.getClass();
        Parser parser = (Parser) splitter.trimmer;
        parser.delimiterProcessors = zzhyVar;
        zzke zzkeVar = (zzke) parser.blockParserFactories;
        if (zzkeVar != null) {
            int i = zzj.$r8$clinit;
            str = zzkeVar.zzd;
            if (str == null || str.isEmpty()) {
                str = "NA";
            }
        } else {
            str = "NA";
        }
        zzmh zzmhVar = new zzmh();
        zzmhVar.zza = zzliVar.zzc;
        zzmhVar.zzb = zzliVar.zzd;
        synchronized (zzli.class) {
            zzyVar = zzli.zza;
            if (zzyVar == null) {
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                Object[] objArrCopyOf = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < locales.mImpl.size()) {
                    Locale locale = locales.mImpl.get(i2);
                    AccountIdentifiers accountIdentifiers = CommonUtils.zza;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArrCopyOf.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            int iHighestOneBit = Integer.highestOneBit(i3);
                            i5 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i5 < 0) {
                            i5 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
                    }
                    objArrCopyOf[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                zzs zzsVar = zzu.zza;
                zzyVar = i3 == 0 ? zzy.zza : new zzy(i3, objArrCopyOf);
                zzli.zza = zzyVar;
            }
        }
        zzmhVar.zze = zzyVar;
        zzmhVar.zzh = Boolean.TRUE;
        zzmhVar.zzd = str;
        zzmhVar.zzc = str2;
        zzmhVar.zzf = zzliVar.zzh.isSuccessful() ? (String) zzliVar.zzh.getResult() : zzliVar.zzf.getMlSdkInstanceId();
        zzmhVar.zzj = 10;
        zzmhVar.zzk = Integer.valueOf(zzliVar.zzj);
        splitter.strategy = zzmhVar;
        zzliVar.zze.zza(splitter);
    }

    private final void run$com$google$android$gms$internal$mlkit_vision_label$zznl() {
        String str;
        zzbu zzbuVar;
        zznp zznpVar = (zznp) this.handler;
        Splitter splitter = (Splitter) this.action;
        zzkf zzkfVar = (zzkf) this.timeoutRunnable;
        String str2 = (String) this.triggered;
        zznpVar.getClass();
        GmsRpc gmsRpc = (GmsRpc) splitter.trimmer;
        gmsRpc.metadata = zzkfVar;
        zzmj zzmjVar = (zzmj) gmsRpc.app;
        if (zzmjVar != null) {
            int i = zzr.$r8$clinit;
            str = zzmjVar.zzd;
            if (str == null || str.isEmpty()) {
                str = "NA";
            }
        } else {
            str = "NA";
        }
        zzmh zzmhVar = new zzmh();
        zzmhVar.zza = zznpVar.zzc;
        zzmhVar.zzb = zznpVar.zzd;
        synchronized (zznp.class) {
            zzbuVar = zznp.zza;
            if (zzbuVar == null) {
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                Object[] objArrCopyOf = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < locales.mImpl.size()) {
                    Locale locale = locales.mImpl.get(i2);
                    AccountIdentifiers accountIdentifiers = CommonUtils.zza;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArrCopyOf.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            int iHighestOneBit = Integer.highestOneBit(i3);
                            i5 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i5 < 0) {
                            i5 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
                    }
                    objArrCopyOf[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                zzbc zzbcVar = zzbe.zza;
                zzbuVar = i3 == 0 ? zzbu.zza : new zzbu(i3, objArrCopyOf);
                zznp.zza = zzbuVar;
            }
        }
        zzmhVar.zze = zzbuVar;
        zzmhVar.zzh = Boolean.TRUE;
        zzmhVar.zzd = str;
        zzmhVar.zzc = str2;
        zzmhVar.zzf = zznpVar.zzh.isSuccessful() ? (String) zznpVar.zzh.getResult() : zznpVar.zzf.getMlSdkInstanceId();
        zzmhVar.zzj = 10;
        zzmhVar.zzk = Integer.valueOf(zznpVar.zzj);
        splitter.strategy = zzmhVar;
        zznpVar.zze.zza$5(splitter);
    }

    @Override
    public final void run() {
        int i;
        Task task;
        String str;
        zzbl zzblVarZzg;
        SessionState sessionState = null;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                if (((AtomicBoolean) this.triggered).compareAndSet(false, true)) {
                    Handler handler = (Handler) this.handler;
                    handler.removeCallbacks((ClickHelper$$ExternalSyntheticLambda0) this.timeoutRunnable);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((PipSourceHandlerState2$$ExternalSyntheticLambda0) this.action).run(false);
                        return;
                    } else {
                        handler.post(new ComponentDialog$$ExternalSyntheticLambda1(this, 23));
                        return;
                    }
                }
                return;
            case 1:
                CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo = (CascadingMenuPopup.CascadingMenuInfo) this.handler;
                if (cascadingMenuInfo != null) {
                    zzct zzctVar = (zzct) this.triggered;
                    ((CascadingMenuPopup) zzctVar.zza).mShouldCloseImmediately = true;
                    cascadingMenuInfo.menu.close(false);
                    ((CascadingMenuPopup) zzctVar.zza).mShouldCloseImmediately = false;
                }
                MenuItemImpl menuItemImpl = (MenuItemImpl) this.action;
                if (menuItemImpl.isEnabled() && menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) this.timeoutRunnable).performItemAction(menuItemImpl, null, 4);
                    return;
                }
                return;
            case 2:
                WindowInsetsAnimationCompat.Impl21.dispatchOnStart((View) this.handler, (WindowInsetsAnimationCompat) this.action, (zzcl) this.timeoutRunnable);
                ((ValueAnimator) this.triggered).start();
                return;
            case 3:
                zzbn zzbnVar = ((zzbb) this.handler).zzb;
                zzbnVar.getClass();
                Set set = zzbnVar.zzc;
                boolean zIsEmpty = new HashSet(set).isEmpty();
                Logger logger = zzbn.zza;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.triggered;
                if (zIsEmpty) {
                    logger.d("No need to prepare transfer without any callback", new Object[0]);
                    callbackToFutureAdapter$Completer.set();
                    return;
                }
                if (((MediaRouter.RouteInfo) this.action).mPlaybackType != 1) {
                    logger.d("No need to prepare transfer when transferring from local", new Object[0]);
                    callbackToFutureAdapter$Completer.set();
                    return;
                }
                RemoteMediaClient remoteMediaClientZzo = zzbnVar.zzo();
                if (remoteMediaClientZzo == null || !remoteMediaClientZzo.hasMediaSession()) {
                    logger.d("No need to prepare transfer when there is no media session", new Object[0]);
                    callbackToFutureAdapter$Completer.set();
                    return;
                }
                logger.d("Prepare route transfer for changing endpoint", new Object[0]);
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) this.timeoutRunnable;
                if (routeInfo.mPlaybackType == 0) {
                    zzo.zzd(zzml.CAST_TRANSFER_TO_LOCAL_USED);
                    i = 1;
                } else {
                    i = CastDevice.getFromBundle(routeInfo.mExtras) == null ? 3 : 2;
                }
                zzbnVar.zzf = i;
                zzbnVar.zzh = callbackToFutureAdapter$Completer;
                logger.d("notify transferring with type = %d", Integer.valueOf(i));
                for (com.google.android.gms.internal.cast.zzj zzjVar : new HashSet(set)) {
                    int i3 = zzbnVar.zzf;
                    switch (zzjVar.$r8$classId) {
                        case 0:
                            zzk.zza.d("onTransferring with type = %d", Integer.valueOf(i3));
                            zzk zzkVar = (zzk) zzjVar.zza;
                            zzkVar.zzj = true;
                            zzkVar.zzs();
                            zznn zznnVarZzh = zzkVar.zzd.zzh(zzkVar.zzh);
                            zznf zznfVarZzc = zzng.zzc(zznnVarZzh.zza());
                            zznfVarZzc.zzu();
                            zzng.zzm((zzng) zznfVarZzc.zza, i3);
                            zznnVarZzh.zze((zzng) zznfVarZzc.zzq());
                            zzkVar.zzb.zze((zzno) zznnVarZzh.zzq(), 230);
                            break;
                        default:
                            Splitter splitter = new Splitter(10, 9);
                            MHTML mhtml = (MHTML) zzjVar.zza;
                            splitter.strategy = Boolean.valueOf(((zzaf) mhtml.entries).zzd == 2);
                            MHTML.zzf(mhtml, new zzz(splitter));
                            zzx zzxVarZzg = mhtml.zzg();
                            zzab zzabVar = new zzab(new CastSync.AnonymousClass1(i3));
                            zzabVar.zzc = zzxVarZzg.zzn;
                            zzxVarZzg.zzi.add(zzabVar);
                            break;
                    }
                }
                zzbnVar.zzi = null;
                zzah.checkMainThread("Must be called from the main thread.");
                if (remoteMediaClientZzo.zzy()) {
                    remoteMediaClientZzo.zzh = new TaskCompletionSource();
                    RemoteMediaClient.zza.d("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo mediaInfo = remoteMediaClientZzo.getMediaInfo();
                    MediaStatus mediaStatus = remoteMediaClientZzo.getMediaStatus();
                    if (mediaInfo != null && mediaStatus != null) {
                        Boolean bool = Boolean.TRUE;
                        long approximateStreamPosition = remoteMediaClientZzo.getApproximateStreamPosition();
                        MediaQueueData mediaQueueData = mediaStatus.zzv;
                        double d = mediaStatus.zzd;
                        if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        sessionState = new SessionState(new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, approximateStreamPosition, d, mediaStatus.zzk, mediaStatus.zzo, null, null, null, null, 0L), null);
                    }
                    if (sessionState != null) {
                        remoteMediaClientZzo.zzh.setResult(sessionState);
                    } else {
                        remoteMediaClientZzo.zzh.setException(new zzao());
                    }
                    task = remoteMediaClientZzo.zzh.getTask();
                } else {
                    task = Tasks.forException(new zzao());
                }
                task.addOnSuccessListener(new zzbh(zzbnVar)).addOnFailureListener(new zzbh(zzbnVar));
                zau zauVar = zzbnVar.zzd;
                zzah.checkNotNull(zauVar);
                zzbj zzbjVar = zzbnVar.zze;
                zzah.checkNotNull(zzbjVar);
                zauVar.postDelayed(zzbjVar, 10000L);
                return;
            case 4:
                run$com$google$android$gms$internal$mlkit_language_id_common$zzlg();
                return;
            case 5:
                run$com$google$android$gms$internal$mlkit_vision_label$zznl();
                return;
            default:
                zztl zztlVar = (zztl) this.handler;
                Splitter splitter2 = (Splitter) this.action;
                zzob zzobVar = (zzob) this.timeoutRunnable;
                String str2 = (String) this.triggered;
                zztlVar.getClass();
                TooltipPopup tooltipPopup = (TooltipPopup) splitter2.trimmer;
                tooltipPopup.mContentView = zzobVar;
                zzsc zzscVar = (zzsc) tooltipPopup.mContext;
                if (zzscVar != null) {
                    int i4 = zzh.$r8$clinit;
                    str = zzscVar.zzd;
                    if (str == null || str.isEmpty()) {
                        str = "NA";
                    }
                } else {
                    str = "NA";
                }
                zzmh zzmhVar = new zzmh();
                zzmhVar.zza = zztlVar.zzc;
                zzmhVar.zzb = zztlVar.zzd;
                synchronized (zztl.class) {
                    zzblVarZzg = zztl.zza;
                    if (zzblVarZzg == null) {
                        LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                        Object[] objArrCopyOf = new Object[4];
                        int i5 = 0;
                        while (i2 < locales.mImpl.size()) {
                            Locale locale = locales.mImpl.get(i2);
                            AccountIdentifiers accountIdentifiers = CommonUtils.zza;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i6 = i5 + 1;
                            int length = objArrCopyOf.length;
                            if (length < i6) {
                                int i7 = length + (length >> 1) + 1;
                                if (i7 < i6) {
                                    int iHighestOneBit = Integer.highestOneBit(i5);
                                    i7 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i7 < 0) {
                                    i7 = Integer.MAX_VALUE;
                                }
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i7);
                            }
                            objArrCopyOf[i5] = languageTag;
                            i2++;
                            i5 = i6;
                        }
                        zzblVarZzg = zzav.zzg(i5, objArrCopyOf);
                        zztl.zza = zzblVarZzg;
                    }
                }
                zzmhVar.zze = zzblVarZzg;
                zzmhVar.zzh = Boolean.TRUE;
                zzmhVar.zzd = str;
                zzmhVar.zzc = str2;
                zzmhVar.zzf = zztlVar.zzh.isSuccessful() ? (String) zztlVar.zzh.getResult() : zztlVar.zzf.getMlSdkInstanceId();
                zzmhVar.zzj = 10;
                zzmhVar.zzk = Integer.valueOf(zztlVar.zzj);
                splitter2.strategy = zzmhVar;
                zztlVar.zze.zza$6(splitter2);
                return;
        }
    }

    public Trigger(Handler handler, PipSourceHandlerState2$$ExternalSyntheticLambda0 pipSourceHandlerState2$$ExternalSyntheticLambda0, long j) {
        this.$r8$classId = 0;
        this.triggered = new AtomicBoolean(false);
        this.handler = handler;
        this.action = pipSourceHandlerState2$$ExternalSyntheticLambda0;
        ClickHelper$$ExternalSyntheticLambda0 clickHelper$$ExternalSyntheticLambda0 = new ClickHelper$$ExternalSyntheticLambda0(5, this, pipSourceHandlerState2$$ExternalSyntheticLambda0);
        this.timeoutRunnable = clickHelper$$ExternalSyntheticLambda0;
        if (j > 0) {
            handler.postDelayed(clickHelper$$ExternalSyntheticLambda0, j);
        }
    }

    public Trigger(zzct zzctVar, CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo, MenuItemImpl menuItemImpl, MenuBuilder menuBuilder) {
        this.$r8$classId = 1;
        this.triggered = zzctVar;
        this.handler = cascadingMenuInfo;
        this.action = menuItemImpl;
        this.timeoutRunnable = menuBuilder;
    }
}
