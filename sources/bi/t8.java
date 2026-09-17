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
public final class t8 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final u8 M;
    public final boolean f3739b;
    public final di.o8 f3740c;
    public boolean d;
    public String f3741e;
    public final String f3742f;
    public float h;
    public float f3743n;
    public float f3744r;
    public boolean f3745s;
    public boolean v;
    public int f3746w;
    public long f3748y;
    public long f3747x = -1;
    public final long f3738a = Utilities.random.nextLong();

    public t8(u8 u8Var, di.o8 o8Var) {
        this.M = u8Var;
        this.f3740c = o8Var;
        this.f3739b = o8Var.f7756g;
        File file = o8Var.N0;
        if (file != null) {
            this.f3742f = file.getAbsolutePath();
        }
        boolean z10 = o8Var.f7785w;
        this.H = z10;
        this.I = z10;
        long j3 = o8Var.J0;
        if (j3 != 0) {
            this.J = j3;
        } else if (o8Var.f7756g) {
            this.J = o8Var.f7751e;
        } else {
            TLRPC.InputPeer inputPeer = o8Var.f7784v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.J = UserConfig.getInstance(u8Var.f3805a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        di.o8 o8Var = this.f3740c;
        u8 u8Var = this.M;
        if (z10) {
            u8Var.f3824w.b(o8Var);
            ((ArrayList) u8Var.f3806b.f(this.J)).remove(this);
        }
        this.v = true;
        if (o8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(u8Var.f3805a).cancelFileUpload(this.f3741e, false);
        if (this.f3746w >= 0) {
            ConnectionsManager.getInstance(u8Var.f3805a).cancelRequest(this.f3746w, true);
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
        u8 u8Var = this.M;
        int i10 = u8Var.f3805a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j3 = this.J;
        if (!z10 && (arrayList = (ArrayList) u8Var.f3806b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) u8Var.f3807c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                u8Var.d = 0;
            } else {
                u8Var.d++;
            }
        }
        boolean z11 = this.f3739b;
        di.o8 o8Var = this.f3740c;
        if (z11 && (hashMap = (HashMap) u8Var.f3808e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(o8Var.f7754f));
        }
        if (this.L != null) {
            l8 A = u8Var.A(this.J, 4, -1, false);
            if (o8Var != null && o8Var.f7756g) {
                if (A instanceof b8) {
                    ((b8) A).G(o8Var.L0, this.L);
                }
                String str = o8Var.K0;
                TLRPC.InputMedia inputMedia = o8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ci.y.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    b8 b8Var = (b8) longSparseArray4.get(j3);
                    int i11 = b8Var.f3271c;
                    ArrayList arrayList3 = b8Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(b8Var.E, str)) {
                            b8Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            g8 g8Var = b8Var.f3283q;
                            AndroidUtilities.cancelRunOnUIThread(g8Var);
                            AndroidUtilities.runOnUIThread(g8Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ci.y.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (yVar2 = (ci.y) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = yVar2.f4852f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        b8 b8Var2 = (b8) arrayList4.get(i12);
                        if (b8Var2.f3271c == i10 && TextUtils.equals(b8Var2.E, str)) {
                            b8Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof b8) {
                    ((b8) A).I(this.L);
                }
                String str2 = o8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ci.y.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    b8 b8Var3 = (b8) longSparseArray2.get(j3);
                    int i13 = b8Var3.f3271c;
                    ArrayList arrayList5 = b8Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(b8Var3.E, str2)) {
                            b8Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            g8 g8Var2 = b8Var3.f3283q;
                            AndroidUtilities.cancelRunOnUIThread(g8Var2);
                            AndroidUtilities.runOnUIThread(g8Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ci.y.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (yVar = (ci.y) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = yVar.f4852f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        b8 b8Var4 = (b8) arrayList6.get(i14);
                        if (b8Var4.f3271c == i10 && TextUtils.equals(b8Var4.E, str2)) {
                            b8Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (o8Var != null && !o8Var.h && !this.d) {
            o8Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.f3741e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r20) {
        throw new UnsupportedOperationException("Method not decompiled: bi.t8.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        di.o8 o8Var = this.f3740c;
        if (o8Var.f7744b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f3740c.f7747c0);
            c(tL_inputFileStoryDocument);
        } else if ((o8Var.f7756g || (o8Var.f7768n && o8Var.f7780t != null)) && !o8Var.f7761j && o8Var.f7771o0 == null) {
            c(null);
            return;
        }
        di.ga gaVar = this.f3740c.E0;
        if (gaVar != null && gaVar.f7298a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        NotificationCenter.getInstance(this.M.f3805a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.f3805a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.f3805a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.f3805a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.f3805a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.f3805a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f3740c.E();
        this.f3745s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f19890id = 1;
            String absolutePath = di.o8.x(this.M.f3805a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f3741e = absolutePath;
            this.E = new MessageObject(this.M.f3805a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f3740c.s(new r8(this, 1));
        } else {
            File w10 = di.o8.w(this.M.f3805a, "jpg");
            this.f3741e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new s8(0, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.f3741e);
        intent.putExtra("currentAccount", this.M.f3805a);
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
                this.f3741e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        u8 u8Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f3743n = floatValue;
                this.h = (this.f3744r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(u8Var.f3805a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f3741e, Float.valueOf(this.h));
                if (this.f3747x < 0 && this.f3743n * ((float) this.f3748y) >= 1000.0f) {
                    this.f3747x = longValue;
                }
                FileLoader.getInstance(u8Var.f3805a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f3743n));
                if (longValue2 > 0 && this.f3747x < 0) {
                    this.f3747x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.f3739b) {
                    di.o8 o8Var = this.f3740c;
                    o8Var.f7785w = true;
                    o8Var.f7787x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = o8Var.f7787x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    u8Var.f3824w.d(o8Var);
                }
                b();
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.f3741e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.f3741e;
            if (str5 != null && str4.equals(str5)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                b();
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.f3741e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f3744r = min;
            this.h = (min * 0.7f) + (this.f3743n * 0.3f);
            NotificationCenter.getInstance(u8Var.f3805a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f3741e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        di.o8 o8Var = this.f3740c;
        o8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.f3805a);
        String str = this.f3741e;
        boolean z10 = !o8Var.K;
        long j3 = 0;
        if (this.f3745s) {
            VideoEditedInfo videoEditedInfo = this.F;
            if (videoEditedInfo != null) {
                j3 = videoEditedInfo.estimatedSize;
            }
            j3 = Math.max(1, (int) j3);
        }
        if (o8Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z10, j3, i10, true);
    }
}
