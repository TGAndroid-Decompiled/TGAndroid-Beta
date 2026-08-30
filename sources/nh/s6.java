package nh;

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
public final class s6 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject B;
    public VideoEditedInfo C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final long G;
    public MessageObject H;
    public TL_bots.botPreviewMedia I;
    public final t6 J;
    public final boolean f15882b;
    public final ph.u6 f15883c;
    public boolean d;
    public String e;
    public final String f15884f;
    public float h;
    public float f15885n;
    public float f15886r;
    public boolean f15887s;
    public boolean v;
    public int f15888w;
    public long f15890y;
    public long f15889x = -1;
    public final long f15881a = Utilities.random.nextLong();

    public s6(t6 t6Var, ph.u6 u6Var) {
        this.J = t6Var;
        this.f15883c = u6Var;
        this.f15882b = u6Var.f42413g;
        File file = u6Var.N0;
        if (file != null) {
            this.f15884f = file.getAbsolutePath();
        }
        boolean z4 = u6Var.f42442w;
        this.E = z4;
        this.F = z4;
        long j10 = u6Var.J0;
        if (j10 != 0) {
            this.G = j10;
        } else if (u6Var.f42413g) {
            this.G = u6Var.e;
        } else {
            TLRPC.InputPeer inputPeer = u6Var.f42441v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.G = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.G = UserConfig.getInstance(t6Var.f15917a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z4 = this.F;
        ph.u6 u6Var = this.f15883c;
        t6 t6Var = this.J;
        if (z4) {
            t6Var.f15935w.c(u6Var);
            ((ArrayList) t6Var.f15918b.f(this.G)).remove(this);
        }
        this.v = true;
        if (u6Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.B);
        }
        FileLoader.getInstance(t6Var.f15917a).cancelFileUpload(this.e, false);
        if (this.f15888w >= 0) {
            ConnectionsManager.getInstance(t6Var.f15917a).cancelRequest(this.f15888w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        oh.v vVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        oh.v vVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        t6 t6Var = this.J;
        int i10 = t6Var.f15917a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z4 = this.F;
        long j10 = this.G;
        if (!z4 && (arrayList = (ArrayList) t6Var.f15918b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) t6Var.f15919c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                t6Var.d = 0;
            } else {
                t6Var.d++;
            }
        }
        boolean z10 = this.f15882b;
        ph.u6 u6Var = this.f15883c;
        if (z10 && (hashMap = (HashMap) t6Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(u6Var.f42411f));
        }
        if (this.I != null) {
            l6 A = t6Var.A(this.G, 4, -1, false);
            if (u6Var != null && u6Var.f42413g) {
                if (A instanceof d6) {
                    ((d6) A).G(u6Var.L0, this.I);
                }
                String str = u6Var.K0;
                TLRPC.InputMedia inputMedia = u6Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.I;
                LongSparseArray longSparseArray5 = oh.v.C;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    d6 d6Var = (d6) longSparseArray4.get(j10);
                    int i11 = d6Var.f15577c;
                    ArrayList arrayList3 = d6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(d6Var.E, str)) {
                            d6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            i6 i6Var = d6Var.f15588q;
                            AndroidUtilities.cancelRunOnUIThread(i6Var);
                            AndroidUtilities.runOnUIThread(i6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = oh.v.B;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (vVar2 = (oh.v) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = vVar2.f16618f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        d6 d6Var2 = (d6) arrayList4.get(i12);
                        if (d6Var2.f15577c == i10 && TextUtils.equals(d6Var2.E, str)) {
                            d6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof d6) {
                    ((d6) A).I(this.I);
                }
                String str2 = u6Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.I;
                LongSparseArray longSparseArray7 = oh.v.C;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    d6 d6Var3 = (d6) longSparseArray2.get(j10);
                    int i13 = d6Var3.f15577c;
                    ArrayList arrayList5 = d6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(d6Var3.E, str2)) {
                            d6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            i6 i6Var2 = d6Var3.f15588q;
                            AndroidUtilities.cancelRunOnUIThread(i6Var2);
                            AndroidUtilities.runOnUIThread(i6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = oh.v.B;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (vVar = (oh.v) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = vVar.f16618f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        d6 d6Var4 = (d6) arrayList6.get(i14);
                        if (d6Var4.f15577c == i10 && TextUtils.equals(d6Var4.E, str2)) {
                            d6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.I = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (u6Var != null && !u6Var.h && !this.d) {
            u6Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r20) {
        throw new UnsupportedOperationException("Method not decompiled: nh.s6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z4;
        ph.u6 u6Var = this.f15883c;
        if (u6Var.f42402b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f15883c.f42405c0);
            c(tL_inputFileStoryDocument);
        } else if ((u6Var.f42413g || (u6Var.f42425n && u6Var.f42437t != null)) && !u6Var.f42418j && u6Var.f42428o0 == null) {
            c(null);
            return;
        }
        ph.d8 d8Var = this.f15883c.E0;
        if (d8Var != null && d8Var.f41466a == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.D = z4;
        NotificationCenter.getInstance(this.J.f15917a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.J.f15917a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.J.f15917a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.J.f15917a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.J.f15917a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.J.f15917a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f15883c.E();
        this.f15887s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f19205id = 1;
            String absolutePath = ph.u6.x(this.J.f15917a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.B = new MessageObject(this.J.f15917a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f15883c.s(new r6(this, 1));
        } else {
            File w10 = ph.u6.w(this.J.f15917a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new n4(8, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.J.f15917a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.B) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        t6 t6Var = this.J;
        if (i10 == i12) {
            if (objArr[0] == this.B) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f15885n = floatValue;
                this.h = (this.f15886r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(t6Var.f15917a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.f15889x < 0 && this.f15885n * ((float) this.f15890y) >= 1000.0f) {
                    this.f15889x = longValue;
                }
                FileLoader.getInstance(t6Var.f15917a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f15885n));
                if (longValue2 > 0 && this.f15889x < 0) {
                    this.f15889x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.B) {
                if (!this.f15882b) {
                    ph.u6 u6Var = this.f15883c;
                    u6Var.f42442w = true;
                    u6Var.f42444x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = u6Var.f42444x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.F = true;
                    this.E = true;
                    t6Var.f15935w.d(u6Var);
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
            this.f15886r = min;
            this.h = (min * 0.7f) + (this.f15885n * 0.3f);
            NotificationCenter.getInstance(t6Var.f15917a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        ph.u6 u6Var = this.f15883c;
        u6Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.J.f15917a);
        String str = this.e;
        boolean z4 = !u6Var.K;
        long j10 = 0;
        if (this.f15887s) {
            VideoEditedInfo videoEditedInfo = this.C;
            if (videoEditedInfo != null) {
                j10 = videoEditedInfo.estimatedSize;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (u6Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z4, j10, i10, true);
    }
}
