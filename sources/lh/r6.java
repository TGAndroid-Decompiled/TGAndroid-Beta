package lh;

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
public final class r6 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject A;
    public VideoEditedInfo B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final long F;
    public MessageObject G;
    public TL_bots.botPreviewMedia H;
    public final s6 I;
    public final boolean f16168b;
    public final nh.o7 f16169c;
    public boolean d;
    public String f16170e;
    public final String f16171f;
    public float h;
    public float f16172n;
    public float f16173r;
    public boolean f16174s;
    public boolean v;
    public int f16175w;
    public long f16177y;
    public long f16176x = -1;
    public final long f16167a = Utilities.random.nextLong();

    public r6(s6 s6Var, nh.o7 o7Var) {
        this.I = s6Var;
        this.f16169c = o7Var;
        this.f16168b = o7Var.f18270g;
        File file = o7Var.N0;
        if (file != null) {
            this.f16171f = file.getAbsolutePath();
        }
        boolean z10 = o7Var.f18299w;
        this.D = z10;
        this.E = z10;
        long j10 = o7Var.J0;
        if (j10 != 0) {
            this.F = j10;
        } else if (o7Var.f18270g) {
            this.F = o7Var.f18265e;
        } else {
            TLRPC.InputPeer inputPeer = o7Var.f18298v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.F = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.F = UserConfig.getInstance(s6Var.f16218a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.E;
        nh.o7 o7Var = this.f16169c;
        s6 s6Var = this.I;
        if (z10) {
            s6Var.f16237w.c(o7Var);
            ((ArrayList) s6Var.f16219b.f(this.F)).remove(this);
        }
        this.v = true;
        if (o7Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.A);
        }
        FileLoader.getInstance(s6Var.f16218a).cancelFileUpload(this.f16170e, false);
        if (this.f16175w >= 0) {
            ConnectionsManager.getInstance(s6Var.f16218a).cancelRequest(this.f16175w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        mh.v vVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        mh.v vVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        s6 s6Var = this.I;
        int i10 = s6Var.f16218a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.E;
        long j10 = this.F;
        if (!z10 && (arrayList = (ArrayList) s6Var.f16219b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) s6Var.f16220c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                s6Var.d = 0;
            } else {
                s6Var.d++;
            }
        }
        boolean z11 = this.f16168b;
        nh.o7 o7Var = this.f16169c;
        if (z11 && (hashMap = (HashMap) s6Var.f16221e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(o7Var.f18268f));
        }
        if (this.H != null) {
            k6 A = s6Var.A(this.F, 4, -1, false);
            if (o7Var != null && o7Var.f18270g) {
                if (A instanceof c6) {
                    ((c6) A).G(o7Var.L0, this.H);
                }
                String str = o7Var.K0;
                TLRPC.InputMedia inputMedia = o7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.H;
                LongSparseArray longSparseArray5 = mh.v.B;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    c6 c6Var = (c6) longSparseArray4.get(j10);
                    int i11 = c6Var.f15834c;
                    ArrayList arrayList3 = c6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(c6Var.E, str)) {
                            c6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            h6 h6Var = c6Var.f15846q;
                            AndroidUtilities.cancelRunOnUIThread(h6Var);
                            AndroidUtilities.runOnUIThread(h6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = mh.v.A;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (vVar2 = (mh.v) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = vVar2.f17060f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        c6 c6Var2 = (c6) arrayList4.get(i12);
                        if (c6Var2.f15834c == i10 && TextUtils.equals(c6Var2.E, str)) {
                            c6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof c6) {
                    ((c6) A).I(this.H);
                }
                String str2 = o7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.H;
                LongSparseArray longSparseArray7 = mh.v.B;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    c6 c6Var3 = (c6) longSparseArray2.get(j10);
                    int i13 = c6Var3.f15834c;
                    ArrayList arrayList5 = c6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(c6Var3.E, str2)) {
                            c6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            h6 h6Var2 = c6Var3.f15846q;
                            AndroidUtilities.cancelRunOnUIThread(h6Var2);
                            AndroidUtilities.runOnUIThread(h6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = mh.v.A;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (vVar = (mh.v) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = vVar.f17060f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        c6 c6Var4 = (c6) arrayList6.get(i14);
                        if (c6Var4.f15834c == i10 && TextUtils.equals(c6Var4.E, str2)) {
                            c6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.H = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (o7Var != null && !o7Var.h && !this.d) {
            o7Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.f16170e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r20) {
        throw new UnsupportedOperationException("Method not decompiled: lh.r6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        nh.o7 o7Var = this.f16169c;
        if (o7Var.f18258b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f16169c.f18261c0);
            c(tL_inputFileStoryDocument);
        } else if ((o7Var.f18270g || (o7Var.f18282n && o7Var.f18294t != null)) && !o7Var.f18275j && o7Var.f18285o0 == null) {
            c(null);
            return;
        }
        nh.c9 c9Var = this.f16169c.E0;
        if (c9Var != null && c9Var.f17481a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z10;
        NotificationCenter.getInstance(this.I.f16218a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.I.f16218a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.I.f16218a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.I.f16218a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.I.f16218a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.I.f16218a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f16169c.E();
        this.f16174s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f22413id = 1;
            String absolutePath = nh.o7.x(this.I.f16218a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f16170e = absolutePath;
            this.A = new MessageObject(this.I.f16218a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f16169c.s(new q6(this, 1));
        } else {
            File w10 = nh.o7.w(this.I.f16218a, "jpg");
            this.f16170e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new r3(9, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.f16170e);
        intent.putExtra("currentAccount", this.I.f16218a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.A) {
                this.f16170e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        s6 s6Var = this.I;
        if (i10 == i12) {
            if (objArr[0] == this.A) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f16172n = floatValue;
                this.h = (this.f16173r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(s6Var.f16218a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f16170e, Float.valueOf(this.h));
                if (this.f16176x < 0 && this.f16172n * ((float) this.f16177y) >= 1000.0f) {
                    this.f16176x = longValue;
                }
                FileLoader.getInstance(s6Var.f16218a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f16172n));
                if (longValue2 > 0 && this.f16176x < 0) {
                    this.f16176x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.A) {
                if (!this.f16168b) {
                    nh.o7 o7Var = this.f16169c;
                    o7Var.f18299w = true;
                    o7Var.f18301x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = o7Var.f18301x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.E = true;
                    this.D = true;
                    s6Var.f16237w.d(o7Var);
                }
                b();
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.f16170e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.f16170e;
            if (str5 != null && str4.equals(str5)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                b();
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.f16170e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f16173r = min;
            this.h = (min * 0.7f) + (this.f16172n * 0.3f);
            NotificationCenter.getInstance(s6Var.f16218a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.f16170e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        nh.o7 o7Var = this.f16169c;
        o7Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.I.f16218a);
        String str = this.f16170e;
        boolean z10 = !o7Var.K;
        long j10 = 0;
        if (this.f16174s) {
            VideoEditedInfo videoEditedInfo = this.B;
            if (videoEditedInfo != null) {
                j10 = videoEditedInfo.estimatedSize;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (o7Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z10, j10, i10, true);
    }
}
