package oh;

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
    public final boolean f17738b;
    public final qh.r6 f17739c;
    public boolean d;
    public String f17740e;
    public final String f17741f;
    public float h;
    public float f17742n;
    public float f17743r;
    public boolean f17744s;
    public boolean v;
    public int f17745w;
    public long f17747y;
    public long f17746x = -1;
    public final long f17737a = Utilities.random.nextLong();

    public s6(t6 t6Var, qh.r6 r6Var) {
        this.J = t6Var;
        this.f17739c = r6Var;
        this.f17738b = r6Var.f46008g;
        File file = r6Var.N0;
        if (file != null) {
            this.f17741f = file.getAbsolutePath();
        }
        boolean z4 = r6Var.f46037w;
        this.E = z4;
        this.F = z4;
        long j10 = r6Var.J0;
        if (j10 != 0) {
            this.G = j10;
        } else if (r6Var.f46008g) {
            this.G = r6Var.f46003e;
        } else {
            TLRPC.InputPeer inputPeer = r6Var.f46036v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.G = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.G = UserConfig.getInstance(t6Var.f17772a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z4 = this.F;
        qh.r6 r6Var = this.f17739c;
        t6 t6Var = this.J;
        if (z4) {
            t6Var.f17791w.c(r6Var);
            ((ArrayList) t6Var.f17773b.f(this.G)).remove(this);
        }
        this.v = true;
        if (r6Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.B);
        }
        FileLoader.getInstance(t6Var.f17772a).cancelFileUpload(this.f17740e, false);
        if (this.f17745w >= 0) {
            ConnectionsManager.getInstance(t6Var.f17772a).cancelRequest(this.f17745w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ph.p pVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ph.p pVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        t6 t6Var = this.J;
        int i10 = t6Var.f17772a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z4 = this.F;
        long j10 = this.G;
        if (!z4 && (arrayList = (ArrayList) t6Var.f17773b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) t6Var.f17774c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                t6Var.d = 0;
            } else {
                t6Var.d++;
            }
        }
        boolean z10 = this.f17738b;
        qh.r6 r6Var = this.f17739c;
        if (z10 && (hashMap = (HashMap) t6Var.f17775e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(r6Var.f46006f));
        }
        if (this.I != null) {
            l6 A = t6Var.A(this.G, 4, -1, false);
            if (r6Var != null && r6Var.f46008g) {
                if (A instanceof d6) {
                    ((d6) A).G(r6Var.L0, this.I);
                }
                String str = r6Var.K0;
                TLRPC.InputMedia inputMedia = r6Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.I;
                LongSparseArray longSparseArray5 = ph.p.C;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    d6 d6Var = (d6) longSparseArray4.get(j10);
                    int i11 = d6Var.f17400c;
                    ArrayList arrayList3 = d6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(d6Var.E, str)) {
                            d6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            i6 i6Var = d6Var.f17412q;
                            AndroidUtilities.cancelRunOnUIThread(i6Var);
                            AndroidUtilities.runOnUIThread(i6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ph.p.B;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (pVar2 = (ph.p) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = pVar2.f44441f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        d6 d6Var2 = (d6) arrayList4.get(i12);
                        if (d6Var2.f17400c == i10 && TextUtils.equals(d6Var2.E, str)) {
                            d6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof d6) {
                    ((d6) A).I(this.I);
                }
                String str2 = r6Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.I;
                LongSparseArray longSparseArray7 = ph.p.C;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    d6 d6Var3 = (d6) longSparseArray2.get(j10);
                    int i13 = d6Var3.f17400c;
                    ArrayList arrayList5 = d6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(d6Var3.E, str2)) {
                            d6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            i6 i6Var2 = d6Var3.f17412q;
                            AndroidUtilities.cancelRunOnUIThread(i6Var2);
                            AndroidUtilities.runOnUIThread(i6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ph.p.B;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (pVar = (ph.p) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = pVar.f44441f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        d6 d6Var4 = (d6) arrayList6.get(i14);
                        if (d6Var4.f17400c == i10 && TextUtils.equals(d6Var4.E, str2)) {
                            d6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.I = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (r6Var != null && !r6Var.h && !this.d) {
            r6Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.f17740e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r20) {
        throw new UnsupportedOperationException("Method not decompiled: oh.s6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z4;
        qh.r6 r6Var = this.f17739c;
        if (r6Var.f45996b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f17739c.f45999c0);
            c(tL_inputFileStoryDocument);
        } else if ((r6Var.f46008g || (r6Var.f46020n && r6Var.f46032t != null)) && !r6Var.f46013j && r6Var.f46023o0 == null) {
            c(null);
            return;
        }
        qh.a8 a8Var = this.f17739c.E0;
        if (a8Var != null && a8Var.f44994a == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.D = z4;
        NotificationCenter.getInstance(this.J.f17772a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.J.f17772a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.J.f17772a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.J.f17772a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.J.f17772a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.J.f17772a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f17739c.E();
        this.f17744s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f20866id = 1;
            String absolutePath = qh.r6.x(this.J.f17772a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f17740e = absolutePath;
            this.B = new MessageObject(this.J.f17772a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f17739c.s(new r6(this, 1));
        } else {
            File w10 = qh.r6.w(this.J.f17772a, "jpg");
            this.f17740e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new z1(11, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.f17740e);
        intent.putExtra("currentAccount", this.J.f17772a);
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
                this.f17740e = (String) objArr[1];
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
                this.f17742n = floatValue;
                this.h = (this.f17743r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(t6Var.f17772a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f17740e, Float.valueOf(this.h));
                if (this.f17746x < 0 && this.f17742n * ((float) this.f17747y) >= 1000.0f) {
                    this.f17746x = longValue;
                }
                FileLoader.getInstance(t6Var.f17772a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f17742n));
                if (longValue2 > 0 && this.f17746x < 0) {
                    this.f17746x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.B) {
                if (!this.f17738b) {
                    qh.r6 r6Var = this.f17739c;
                    r6Var.f46037w = true;
                    r6Var.f46039x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = r6Var.f46039x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.F = true;
                    this.E = true;
                    t6Var.f17791w.d(r6Var);
                }
                b();
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.f17740e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.f17740e;
            if (str5 != null && str4.equals(str5)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                b();
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.f17740e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f17743r = min;
            this.h = (min * 0.7f) + (this.f17742n * 0.3f);
            NotificationCenter.getInstance(t6Var.f17772a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f17740e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        qh.r6 r6Var = this.f17739c;
        r6Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.J.f17772a);
        String str = this.f17740e;
        boolean z4 = !r6Var.K;
        long j10 = 0;
        if (this.f17744s) {
            VideoEditedInfo videoEditedInfo = this.C;
            if (videoEditedInfo != null) {
                j10 = videoEditedInfo.estimatedSize;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (r6Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z4, j10, i10, true);
    }
}
