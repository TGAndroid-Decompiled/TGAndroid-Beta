package ih;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class u6 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject A;
    public VideoEditedInfo B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final long F;
    public MessageObject G;
    public TL_bots.botPreviewMedia H;
    public final v6 I;
    public final boolean f12192b;
    public final kh.a8 f12193c;
    public boolean d;
    public String f12194e;
    public final String f12195f;
    public float h;
    public float f12196n;
    public float f12197r;
    public boolean f12198s;
    public boolean v;
    public int f12199w;
    public long f12201y;
    public long f12200x = -1;
    public final long f12191a = Utilities.random.nextLong();

    public u6(v6 v6Var, kh.a8 a8Var) {
        this.I = v6Var;
        this.f12193c = a8Var;
        this.f12192b = a8Var.f14917g;
        File file = a8Var.N0;
        if (file != null) {
            this.f12195f = file.getAbsolutePath();
        }
        boolean z10 = a8Var.f14946w;
        this.D = z10;
        this.E = z10;
        long j10 = a8Var.J0;
        if (j10 != 0) {
            this.F = j10;
        } else if (a8Var.f14917g) {
            this.F = a8Var.f14912e;
        } else {
            TLRPC.InputPeer inputPeer = a8Var.f14945v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.F = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.F = UserConfig.getInstance(v6Var.f12236a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.E;
        kh.a8 a8Var = this.f12193c;
        v6 v6Var = this.I;
        if (z10) {
            v6Var.f12255w.c(a8Var);
            ((ArrayList) v6Var.f12237b.f(this.F)).remove(this);
        }
        this.v = true;
        if (a8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.A);
        }
        FileLoader.getInstance(v6Var.f12236a).cancelFileUpload(this.f12194e, false);
        if (this.f12199w >= 0) {
            ConnectionsManager.getInstance(v6Var.f12236a).cancelRequest(this.f12199w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        jh.u uVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        jh.u uVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        v6 v6Var = this.I;
        int i9 = v6Var.f12236a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.E;
        long j10 = this.F;
        if (!z10 && (arrayList = (ArrayList) v6Var.f12237b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) v6Var.f12238c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                v6Var.d = 0;
            } else {
                v6Var.d++;
            }
        }
        boolean z11 = this.f12192b;
        kh.a8 a8Var = this.f12193c;
        if (z11 && (hashMap = (HashMap) v6Var.f12239e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(a8Var.f14915f));
        }
        if (this.H != null) {
            n6 A = v6Var.A(this.F, 4, -1, false);
            if (a8Var != null && a8Var.f14917g) {
                if (A instanceof f6) {
                    ((f6) A).G(a8Var.L0, this.H);
                }
                String str = a8Var.K0;
                TLRPC.InputMedia inputMedia = a8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.H;
                LongSparseArray longSparseArray5 = jh.u.B;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i9)) != null) {
                    f6 f6Var = (f6) longSparseArray4.get(j10);
                    int i10 = f6Var.f11847c;
                    ArrayList arrayList3 = f6Var.G;
                    if (i10 == i9) {
                        if (TextUtils.equals(f6Var.E, str)) {
                            f6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            k6 k6Var = f6Var.f11859q;
                            AndroidUtilities.cancelRunOnUIThread(k6Var);
                            AndroidUtilities.runOnUIThread(k6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = jh.u.A;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i9)) != null && (uVar2 = (jh.u) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = uVar2.f14382f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        f6 f6Var2 = (f6) arrayList4.get(i11);
                        if (f6Var2.f11847c == i9 && TextUtils.equals(f6Var2.E, str)) {
                            f6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof f6) {
                    ((f6) A).I(this.H);
                }
                String str2 = a8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.H;
                LongSparseArray longSparseArray7 = jh.u.B;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i9)) != null) {
                    f6 f6Var3 = (f6) longSparseArray2.get(j10);
                    int i12 = f6Var3.f11847c;
                    ArrayList arrayList5 = f6Var3.G;
                    if (i12 == i9) {
                        if (TextUtils.equals(f6Var3.E, str2)) {
                            f6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            k6 k6Var2 = f6Var3.f11859q;
                            AndroidUtilities.cancelRunOnUIThread(k6Var2);
                            AndroidUtilities.runOnUIThread(k6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = jh.u.A;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i9)) != null && (uVar = (jh.u) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = uVar.f14382f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        f6 f6Var4 = (f6) arrayList6.get(i13);
                        if (f6Var4.f11847c == i9 && TextUtils.equals(f6Var4.E, str2)) {
                            f6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.H = null;
        }
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (a8Var != null && !a8Var.h && !this.d) {
            a8Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.f12194e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r20) {
        throw new UnsupportedOperationException("Method not decompiled: ih.u6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        kh.a8 a8Var = this.f12193c;
        if (a8Var.f14905b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f12193c.f14908c0);
            c(tL_inputFileStoryDocument);
        } else if ((a8Var.f14917g || (a8Var.f14929n && a8Var.f14941t != null)) && !a8Var.f14922j && a8Var.f14932o0 == null) {
            c(null);
            return;
        }
        kh.r9 r9Var = this.f12193c.E0;
        if (r9Var != null && r9Var.f15966a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z10;
        NotificationCenter.getInstance(this.I.f12236a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.I.f12236a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.I.f12236a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.I.f12236a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.I.f12236a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.I.f12236a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f12193c.E();
        this.f12198s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f22401id = 1;
            String absolutePath = kh.a8.x(this.I.f12236a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f12194e = absolutePath;
            this.A = new MessageObject(this.I.f12236a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f12193c.s(new t6(this, 1));
        } else {
            File w8 = kh.a8.w(this.I.f12236a, "jpg");
            this.f12194e = w8.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new h3.g0(23, this, w8));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.f12194e);
        intent.putExtra("currentAccount", this.I.f12236a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.A) {
                this.f12194e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i11 = NotificationCenter.fileNewChunkAvailable;
        v6 v6Var = this.I;
        if (i9 == i11) {
            if (objArr[0] == this.A) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f12196n = floatValue;
                this.h = (this.f12197r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(v6Var.f12236a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f12194e, Float.valueOf(this.h));
                if (this.f12200x < 0 && this.f12196n * ((float) this.f12201y) >= 1000.0f) {
                    this.f12200x = longValue;
                }
                FileLoader.getInstance(v6Var.f12236a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f12196n));
                if (longValue2 > 0 && this.f12200x < 0) {
                    this.f12200x = longValue2;
                }
            }
        } else if (i9 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.A) {
                if (!this.f12192b) {
                    kh.a8 a8Var = this.f12193c;
                    a8Var.f14946w = true;
                    a8Var.f14948x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = a8Var.f14948x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.E = true;
                    this.D = true;
                    v6Var.f12255w.d(a8Var);
                }
                b();
            }
        } else if (i9 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.f12194e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i9 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.f12194e;
            if (str5 != null && str4.equals(str5)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                b();
            }
        } else if (i9 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.f12194e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f12197r = min;
            this.h = (min * 0.7f) + (this.f12196n * 0.3f);
            NotificationCenter.getInstance(v6Var.f12236a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f12194e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i9;
        kh.a8 a8Var = this.f12193c;
        a8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.I.f12236a);
        String str = this.f12194e;
        boolean z10 = !a8Var.K;
        long j10 = 0;
        if (this.f12198s) {
            VideoEditedInfo videoEditedInfo = this.B;
            if (videoEditedInfo != null) {
                j10 = videoEditedInfo.estimatedSize;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (a8Var.K) {
            i9 = 33554432;
        } else {
            i9 = 16777216;
        }
        fileLoader.uploadFile(str, false, z10, j10, i9, true);
    }
}
