package bi;

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
public final class w8 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final x8 M;
    public final boolean f3918b;
    public final di.k8 f3919c;
    public boolean d;
    public String e;
    public final String f3920f;
    public float h;
    public float f3921n;
    public float f3922r;
    public boolean f3923s;
    public boolean v;
    public int f3924w;
    public long f3926y;
    public long f3925x = -1;
    public final long f3917a = Utilities.random.nextLong();

    public w8(x8 x8Var, di.k8 k8Var) {
        this.M = x8Var;
        this.f3919c = k8Var;
        this.f3918b = k8Var.f7190g;
        File file = k8Var.N0;
        if (file != null) {
            this.f3920f = file.getAbsolutePath();
        }
        boolean z10 = k8Var.f7219w;
        this.H = z10;
        this.I = z10;
        long j10 = k8Var.J0;
        if (j10 != 0) {
            this.J = j10;
        } else if (k8Var.f7190g) {
            this.J = k8Var.e;
        } else {
            TLRPC.InputPeer inputPeer = k8Var.f7218v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.J = UserConfig.getInstance(x8Var.f3966a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        di.k8 k8Var = this.f3919c;
        x8 x8Var = this.M;
        if (z10) {
            x8Var.f3984w.b(k8Var);
            ((ArrayList) x8Var.f3967b.f(this.J)).remove(this);
        }
        this.v = true;
        if (k8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(x8Var.f3966a).cancelFileUpload(this.e, false);
        if (this.f3924w >= 0) {
            ConnectionsManager.getInstance(x8Var.f3966a).cancelRequest(this.f3924w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ci.y yVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ci.y yVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        x8 x8Var = this.M;
        int i10 = x8Var.f3966a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j10 = this.J;
        if (!z10 && (arrayList = (ArrayList) x8Var.f3967b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) x8Var.f3968c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                x8Var.d = 0;
            } else {
                x8Var.d++;
            }
        }
        boolean z11 = this.f3918b;
        di.k8 k8Var = this.f3919c;
        if (z11 && (hashMap = (HashMap) x8Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(k8Var.f7188f));
        }
        if (this.L != null) {
            o8 A = x8Var.A(this.J, 4, -1, false);
            if (k8Var != null && k8Var.f7190g) {
                if (A instanceof f8) {
                    ((f8) A).G(k8Var.L0, this.L);
                }
                String str = k8Var.K0;
                TLRPC.InputMedia inputMedia = k8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ci.y.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    f8 f8Var = (f8) longSparseArray4.get(j10);
                    int i11 = f8Var.f3430c;
                    ArrayList arrayList3 = f8Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(f8Var.E, str)) {
                            f8Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            j8 j8Var = f8Var.f3441q;
                            AndroidUtilities.cancelRunOnUIThread(j8Var);
                            AndroidUtilities.runOnUIThread(j8Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ci.y.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (yVar2 = (ci.y) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = yVar2.f4802f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        f8 f8Var2 = (f8) arrayList4.get(i12);
                        if (f8Var2.f3430c == i10 && TextUtils.equals(f8Var2.E, str)) {
                            f8Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof f8) {
                    ((f8) A).I(this.L);
                }
                String str2 = k8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ci.y.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    f8 f8Var3 = (f8) longSparseArray2.get(j10);
                    int i13 = f8Var3.f3430c;
                    ArrayList arrayList5 = f8Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(f8Var3.E, str2)) {
                            f8Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            j8 j8Var2 = f8Var3.f3441q;
                            AndroidUtilities.cancelRunOnUIThread(j8Var2);
                            AndroidUtilities.runOnUIThread(j8Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ci.y.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (yVar = (ci.y) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = yVar.f4802f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        f8 f8Var4 = (f8) arrayList6.get(i14);
                        if (f8Var4.f3430c == i10 && TextUtils.equals(f8Var4.E, str2)) {
                            f8Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (k8Var != null && !k8Var.h && !this.d) {
            k8Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: bi.w8.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        di.k8 k8Var = this.f3919c;
        if (k8Var.f7179b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f3919c.f7182c0);
            c(tL_inputFileStoryDocument);
        } else if ((k8Var.f7190g || (k8Var.f7202n && k8Var.f7214t != null)) && !k8Var.f7195j && k8Var.f7205o0 == null) {
            c(null);
            return;
        }
        di.ca caVar = this.f3919c.E0;
        if (caVar != null && caVar.f6740a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        NotificationCenter.getInstance(this.M.f3966a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.f3966a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.f3966a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.f3966a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.f3966a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.f3966a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f3919c.E();
        this.f3923s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f18937id = 1;
            String absolutePath = di.k8.x(this.M.f3966a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new MessageObject(this.M.f3966a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f3919c.s(new v8(this, 1));
        } else {
            File w9 = di.k8.w(this.M.f3966a, "jpg");
            this.e = w9.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new u8(2, this, w9));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.f3966a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.E) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        x8 x8Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f3921n = floatValue;
                this.h = (this.f3922r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(x8Var.f3966a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.f3925x < 0 && this.f3921n * ((float) this.f3926y) >= 1000.0f) {
                    this.f3925x = longValue;
                }
                FileLoader.getInstance(x8Var.f3966a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f3921n));
                if (longValue2 > 0 && this.f3925x < 0) {
                    this.f3925x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.f3918b) {
                    di.k8 k8Var = this.f3919c;
                    k8Var.f7219w = true;
                    k8Var.f7221x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = k8Var.f7221x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    x8Var.f3984w.d(k8Var);
                }
                b();
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 != null && str4.equals(str5)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                b();
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f3922r = min;
            this.h = (min * 0.7f) + (this.f3921n * 0.3f);
            NotificationCenter.getInstance(x8Var.f3966a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        di.k8 k8Var = this.f3919c;
        k8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.f3966a);
        String str = this.e;
        boolean z10 = !k8Var.K;
        long j10 = 0;
        if (this.f3923s) {
            VideoEditedInfo videoEditedInfo = this.F;
            if (videoEditedInfo != null) {
                j10 = videoEditedInfo.estimatedSize;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (k8Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z10, j10, i10, true);
    }
}
