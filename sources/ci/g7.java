package ci;

import ai.qa;
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
public final class g7 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final h7 M;
    public final boolean f5365b;
    public final ei.a8 f5366c;
    public boolean d;
    public String e;
    public final String f5367f;
    public float h;
    public float f5368n;
    public float f5369r;
    public boolean f5370s;
    public boolean v;
    public int f5371w;
    public long f5373y;
    public long f5372x = -1;
    public final long f5364a = Utilities.random.nextLong();

    public g7(h7 h7Var, ei.a8 a8Var) {
        this.M = h7Var;
        this.f5366c = a8Var;
        this.f5365b = a8Var.f8718g;
        File file = a8Var.N0;
        if (file != null) {
            this.f5367f = file.getAbsolutePath();
        }
        boolean z10 = a8Var.f8747w;
        this.H = z10;
        this.I = z10;
        long j10 = a8Var.J0;
        if (j10 != 0) {
            this.J = j10;
        } else if (a8Var.f8718g) {
            this.J = a8Var.e;
        } else {
            TLRPC.InputPeer inputPeer = a8Var.f8746v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.J = UserConfig.getInstance(h7Var.f5399a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        ei.a8 a8Var = this.f5366c;
        h7 h7Var = this.M;
        if (z10) {
            h7Var.f5417w.b(a8Var);
            ((ArrayList) h7Var.f5400b.f(this.J)).remove(this);
        }
        this.v = true;
        if (a8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(h7Var.f5399a).cancelFileUpload(this.e, false);
        if (this.f5371w >= 0) {
            ConnectionsManager.getInstance(h7Var.f5399a).cancelRequest(this.f5371w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        di.v vVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        di.v vVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        h7 h7Var = this.M;
        int i10 = h7Var.f5399a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j10 = this.J;
        if (!z10 && (arrayList = (ArrayList) h7Var.f5400b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) h7Var.f5401c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                h7Var.d = 0;
            } else {
                h7Var.d++;
            }
        }
        boolean z11 = this.f5365b;
        ei.a8 a8Var = this.f5366c;
        if (z11 && (hashMap = (HashMap) h7Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(a8Var.f8716f));
        }
        if (this.L != null) {
            z6 A = h7Var.A(this.J, 4, -1, false);
            if (a8Var != null && a8Var.f8718g) {
                if (A instanceof s6) {
                    ((s6) A).G(a8Var.L0, this.L);
                }
                String str = a8Var.K0;
                TLRPC.InputMedia inputMedia = a8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = di.v.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    s6 s6Var = (s6) longSparseArray4.get(j10);
                    int i11 = s6Var.f6190c;
                    ArrayList arrayList3 = s6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(s6Var.E, str)) {
                            s6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            w6 w6Var = s6Var.f6201q;
                            AndroidUtilities.cancelRunOnUIThread(w6Var);
                            AndroidUtilities.runOnUIThread(w6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = di.v.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (vVar2 = (di.v) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = vVar2.f8078f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        s6 s6Var2 = (s6) arrayList4.get(i12);
                        if (s6Var2.f6190c == i10 && TextUtils.equals(s6Var2.E, str)) {
                            s6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof s6) {
                    ((s6) A).I(this.L);
                }
                String str2 = a8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = di.v.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    s6 s6Var3 = (s6) longSparseArray2.get(j10);
                    int i13 = s6Var3.f6190c;
                    ArrayList arrayList5 = s6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(s6Var3.E, str2)) {
                            s6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            w6 w6Var2 = s6Var3.f6201q;
                            AndroidUtilities.cancelRunOnUIThread(w6Var2);
                            AndroidUtilities.runOnUIThread(w6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = di.v.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (vVar = (di.v) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = vVar.f8078f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        s6 s6Var4 = (s6) arrayList6.get(i14);
                        if (s6Var4.f6190c == i10 && TextUtils.equals(s6Var4.E, str2)) {
                            s6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (a8Var != null && !a8Var.h && !this.d) {
            a8Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: ci.g7.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        ei.a8 a8Var = this.f5366c;
        if (a8Var.f8707b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f5366c.f8710c0);
            c(tL_inputFileStoryDocument);
        } else if ((a8Var.f8718g || (a8Var.f8730n && a8Var.f8742t != null)) && !a8Var.f8723j && a8Var.f8733o0 == null) {
            c(null);
            return;
        }
        ei.p9 p9Var = this.f5366c.E0;
        if (p9Var != null && p9Var.f9615a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        NotificationCenter.getInstance(this.M.f5399a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.f5399a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.f5399a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.f5399a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.f5399a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.f5399a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f5366c.E();
        this.f5370s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f20364id = 1;
            String absolutePath = ei.a8.x(this.M.f5399a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new MessageObject(this.M.f5399a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f5366c.s(new f7(this, 1));
        } else {
            File w9 = ei.a8.w(this.M.f5399a, "jpg");
            this.e = w9.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new qa(25, this, w9));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.f5399a);
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
        h7 h7Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f5368n = floatValue;
                this.h = (this.f5369r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(h7Var.f5399a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.f5372x < 0 && this.f5368n * ((float) this.f5373y) >= 1000.0f) {
                    this.f5372x = longValue;
                }
                FileLoader.getInstance(h7Var.f5399a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f5368n));
                if (longValue2 > 0 && this.f5372x < 0) {
                    this.f5372x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.f5365b) {
                    ei.a8 a8Var = this.f5366c;
                    a8Var.f8747w = true;
                    a8Var.f8749x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = a8Var.f8749x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    h7Var.f5417w.d(a8Var);
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
            this.f5369r = min;
            this.h = (min * 0.7f) + (this.f5368n * 0.3f);
            NotificationCenter.getInstance(h7Var.f5399a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        ei.a8 a8Var = this.f5366c;
        a8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.f5399a);
        String str = this.e;
        boolean z10 = !a8Var.K;
        long j10 = 0;
        if (this.f5370s) {
            VideoEditedInfo videoEditedInfo = this.F;
            if (videoEditedInfo != null) {
                j10 = videoEditedInfo.estimatedSize;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (a8Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z10, j10, i10, true);
    }
}
