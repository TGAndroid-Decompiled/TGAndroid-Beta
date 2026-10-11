package ai;

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
public final class l9 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final m9 M;
    public final boolean f1350b;
    public final ci.l8 f1351c;
    public boolean d;
    public String f1352e;
    public final String f1353f;
    public float h;
    public float f1354n;
    public float f1355r;
    public boolean f1356s;
    public boolean v;
    public int f1357w;
    public long f1359y;
    public long f1358x = -1;
    public final long f1349a = Utilities.random.nextLong();

    public l9(m9 m9Var, ci.l8 l8Var) {
        this.M = m9Var;
        this.f1351c = l8Var;
        this.f1350b = l8Var.f5409g;
        File file = l8Var.N0;
        if (file != null) {
            this.f1353f = file.getAbsolutePath();
        }
        boolean z10 = l8Var.f5438w;
        this.H = z10;
        this.I = z10;
        long j3 = l8Var.J0;
        if (j3 != 0) {
            this.J = j3;
        } else if (l8Var.f5409g) {
            this.J = l8Var.f5404e;
        } else {
            TLRPC.InputPeer inputPeer = l8Var.f5437v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.J = UserConfig.getInstance(m9Var.f1406a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        ci.l8 l8Var = this.f1351c;
        m9 m9Var = this.M;
        if (z10) {
            m9Var.f1425w.b(l8Var);
            ((ArrayList) m9Var.f1407b.f(this.J)).remove(this);
        }
        this.v = true;
        if (l8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(m9Var.f1406a).cancelFileUpload(this.f1352e, false);
        if (this.f1357w >= 0) {
            ConnectionsManager.getInstance(m9Var.f1406a).cancelRequest(this.f1357w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        bi.z zVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        bi.z zVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        m9 m9Var = this.M;
        int i10 = m9Var.f1406a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j3 = this.J;
        if (!z10 && (arrayList = (ArrayList) m9Var.f1407b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) m9Var.f1408c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                m9Var.d = 0;
            } else {
                m9Var.d++;
            }
        }
        boolean z11 = this.f1350b;
        ci.l8 l8Var = this.f1351c;
        if (z11 && (hashMap = (HashMap) m9Var.f1409e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(l8Var.f5407f));
        }
        if (this.L != null) {
            e9 A = m9Var.A(this.J, 4, -1, false);
            if (l8Var != null && l8Var.f5409g) {
                if (A instanceof v8) {
                    ((v8) A).G(l8Var.L0, this.L);
                }
                String str = l8Var.K0;
                TLRPC.InputMedia inputMedia = l8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = bi.z.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    v8 v8Var = (v8) longSparseArray4.get(j3);
                    int i11 = v8Var.f895c;
                    ArrayList arrayList3 = v8Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(v8Var.E, str)) {
                            v8Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            z8 z8Var = v8Var.f907q;
                            AndroidUtilities.cancelRunOnUIThread(z8Var);
                            AndroidUtilities.runOnUIThread(z8Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = bi.z.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (zVar2 = (bi.z) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = zVar2.f3944f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        v8 v8Var2 = (v8) arrayList4.get(i12);
                        if (v8Var2.f895c == i10 && TextUtils.equals(v8Var2.E, str)) {
                            v8Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof v8) {
                    ((v8) A).I(this.L);
                }
                String str2 = l8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = bi.z.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    v8 v8Var3 = (v8) longSparseArray2.get(j3);
                    int i13 = v8Var3.f895c;
                    ArrayList arrayList5 = v8Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(v8Var3.E, str2)) {
                            v8Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            z8 z8Var2 = v8Var3.f907q;
                            AndroidUtilities.cancelRunOnUIThread(z8Var2);
                            AndroidUtilities.runOnUIThread(z8Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = bi.z.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (zVar = (bi.z) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = zVar.f3944f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        v8 v8Var4 = (v8) arrayList6.get(i14);
                        if (v8Var4.f895c == i10 && TextUtils.equals(v8Var4.E, str2)) {
                            v8Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (l8Var != null && !l8Var.h && !this.d) {
            l8Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.f1352e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l9.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        ci.l8 l8Var = this.f1351c;
        if (l8Var.f5397b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f1351c.f5400c0);
            c(tL_inputFileStoryDocument);
        } else if ((l8Var.f5409g || (l8Var.f5421n && l8Var.f5433t != null)) && !l8Var.f5414j && l8Var.f5424o0 == null) {
            c(null);
            return;
        }
        ci.da daVar = this.f1351c.E0;
        if (daVar != null && daVar.f4971a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        NotificationCenter.getInstance(this.M.f1406a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.f1406a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.f1406a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.f1406a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.f1406a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.f1406a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f1351c.E();
        this.f1356s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f20089id = 1;
            String absolutePath = ci.l8.x(this.M.f1406a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f1352e = absolutePath;
            this.E = new MessageObject(this.M.f1406a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f1351c.s(new k9(this, 1));
        } else {
            File w10 = ci.l8.w(this.M.f1406a, "jpg");
            this.f1352e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new a1.f(21, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.f1352e);
        intent.putExtra("currentAccount", this.M.f1406a);
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
                this.f1352e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        m9 m9Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f1354n = floatValue;
                this.h = (this.f1355r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(m9Var.f1406a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f1352e, Float.valueOf(this.h));
                if (this.f1358x < 0 && this.f1354n * ((float) this.f1359y) >= 1000.0f) {
                    this.f1358x = longValue;
                }
                FileLoader.getInstance(m9Var.f1406a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f1354n));
                if (longValue2 > 0 && this.f1358x < 0) {
                    this.f1358x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.f1350b) {
                    ci.l8 l8Var = this.f1351c;
                    l8Var.f5438w = true;
                    l8Var.f5440x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = l8Var.f5440x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    m9Var.f1425w.d(l8Var);
                }
                b();
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.f1352e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.f1352e;
            if (str5 != null && str4.equals(str5)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                b();
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.f1352e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f1355r = min;
            this.h = (min * 0.7f) + (this.f1354n * 0.3f);
            NotificationCenter.getInstance(m9Var.f1406a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f1352e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        ci.l8 l8Var = this.f1351c;
        l8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.f1406a);
        String str = this.f1352e;
        boolean z10 = !l8Var.K;
        long j3 = 0;
        if (this.f1356s) {
            VideoEditedInfo videoEditedInfo = this.F;
            if (videoEditedInfo != null) {
                j3 = videoEditedInfo.estimatedSize;
            }
            j3 = Math.max(1, (int) j3);
        }
        if (l8Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z10, j3, i10, true);
    }
}
