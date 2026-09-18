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
public final class k9 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final l9 M;
    public final boolean f1142b;
    public final ci.o8 f1143c;
    public boolean d;
    public String e;
    public final String f1144f;
    public float h;
    public float f1145n;
    public float f1146r;
    public boolean f1147s;
    public boolean v;
    public int f1148w;
    public long f1150y;
    public long f1149x = -1;
    public final long f1141a = Utilities.random.nextLong();

    public k9(l9 l9Var, ci.o8 o8Var) {
        this.M = l9Var;
        this.f1143c = o8Var;
        this.f1142b = o8Var.f5157g;
        File file = o8Var.N0;
        if (file != null) {
            this.f1144f = file.getAbsolutePath();
        }
        boolean z10 = o8Var.f5186w;
        this.H = z10;
        this.I = z10;
        long j3 = o8Var.J0;
        if (j3 != 0) {
            this.J = j3;
        } else if (o8Var.f5157g) {
            this.J = o8Var.e;
        } else {
            TLRPC.InputPeer inputPeer = o8Var.f5185v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.J = UserConfig.getInstance(l9Var.f1193a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        ci.o8 o8Var = this.f1143c;
        l9 l9Var = this.M;
        if (z10) {
            l9Var.f1211w.b(o8Var);
            ((ArrayList) l9Var.f1194b.f(this.J)).remove(this);
        }
        this.v = true;
        if (o8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(l9Var.f1193a).cancelFileUpload(this.e, false);
        if (this.f1148w >= 0) {
            ConnectionsManager.getInstance(l9Var.f1193a).cancelRequest(this.f1148w, true);
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
        l9 l9Var = this.M;
        int i10 = l9Var.f1193a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j3 = this.J;
        if (!z10 && (arrayList = (ArrayList) l9Var.f1194b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) l9Var.f1195c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                l9Var.d = 0;
            } else {
                l9Var.d++;
            }
        }
        boolean z11 = this.f1142b;
        ci.o8 o8Var = this.f1143c;
        if (z11 && (hashMap = (HashMap) l9Var.e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(o8Var.f5155f));
        }
        if (this.L != null) {
            d9 A = l9Var.A(this.J, 4, -1, false);
            if (o8Var != null && o8Var.f5157g) {
                if (A instanceof t8) {
                    ((t8) A).G(o8Var.L0, this.L);
                }
                String str = o8Var.K0;
                TLRPC.InputMedia inputMedia = o8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = bi.z.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    t8 t8Var = (t8) longSparseArray4.get(j3);
                    int i11 = t8Var.f718c;
                    ArrayList arrayList3 = t8Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(t8Var.E, str)) {
                            t8Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            y8 y8Var = t8Var.f729q;
                            AndroidUtilities.cancelRunOnUIThread(y8Var);
                            AndroidUtilities.runOnUIThread(y8Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = bi.z.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (zVar2 = (bi.z) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = zVar2.f3610f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        t8 t8Var2 = (t8) arrayList4.get(i12);
                        if (t8Var2.f718c == i10 && TextUtils.equals(t8Var2.E, str)) {
                            t8Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof t8) {
                    ((t8) A).I(this.L);
                }
                String str2 = o8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = bi.z.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    t8 t8Var3 = (t8) longSparseArray2.get(j3);
                    int i13 = t8Var3.f718c;
                    ArrayList arrayList5 = t8Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(t8Var3.E, str2)) {
                            t8Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            y8 y8Var2 = t8Var3.f729q;
                            AndroidUtilities.cancelRunOnUIThread(y8Var2);
                            AndroidUtilities.runOnUIThread(y8Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = bi.z.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (zVar = (bi.z) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = zVar.f3610f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        t8 t8Var4 = (t8) arrayList6.get(i14);
                        if (t8Var4.f718c == i10 && TextUtils.equals(t8Var4.E, str2)) {
                            t8Var4.I(botpreviewmedia2);
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r20) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k9.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        ci.o8 o8Var = this.f1143c;
        if (o8Var.f5146b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f1143c.f5149c0);
            c(tL_inputFileStoryDocument);
        } else if ((o8Var.f5157g || (o8Var.f5169n && o8Var.f5181t != null)) && !o8Var.f5162j && o8Var.f5172o0 == null) {
            c(null);
            return;
        }
        ci.ga gaVar = this.f1143c.E0;
        if (gaVar != null && gaVar.f4725a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        NotificationCenter.getInstance(this.M.f1193a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.f1193a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.f1193a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.f1193a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.f1193a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.f1193a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f1143c.E();
        this.f1147s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f18317id = 1;
            String absolutePath = ci.o8.x(this.M.f1193a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new MessageObject(this.M.f1193a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f1143c.s(new j9(this, 1));
        } else {
            File w10 = ci.o8.w(this.M.f1193a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new a1.e(21, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.f1193a);
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
        l9 l9Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f1145n = floatValue;
                this.h = (this.f1146r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(l9Var.f1193a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.f1149x < 0 && this.f1145n * ((float) this.f1150y) >= 1000.0f) {
                    this.f1149x = longValue;
                }
                FileLoader.getInstance(l9Var.f1193a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f1145n));
                if (longValue2 > 0 && this.f1149x < 0) {
                    this.f1149x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.f1142b) {
                    ci.o8 o8Var = this.f1143c;
                    o8Var.f5186w = true;
                    o8Var.f5188x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = o8Var.f5188x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    l9Var.f1211w.d(o8Var);
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
            this.f1146r = min;
            this.h = (min * 0.7f) + (this.f1145n * 0.3f);
            NotificationCenter.getInstance(l9Var.f1193a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        ci.o8 o8Var = this.f1143c;
        o8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.f1193a);
        String str = this.e;
        boolean z10 = !o8Var.K;
        long j3 = 0;
        if (this.f1147s) {
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
