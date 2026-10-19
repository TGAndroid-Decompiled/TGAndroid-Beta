package ci;

import ai.pa;
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
public final class h7 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final i7 M;
    public final boolean f5469b;
    public final ei.a8 f5470c;
    public boolean d;
    public String e;
    public final String f5471f;
    public float h;
    public float f5472n;
    public float f5473r;
    public boolean f5474s;
    public boolean v;
    public int f5475w;
    public long f5477y;
    public long f5476x = -1;
    public final long f5468a = Utilities.random.nextLong();

    public h7(i7 i7Var, ei.a8 a8Var) {
        this.M = i7Var;
        this.f5470c = a8Var;
        this.f5469b = a8Var.f8711g;
        File file = a8Var.N0;
        if (file != null) {
            this.f5471f = file.getAbsolutePath();
        }
        boolean z10 = a8Var.f8740w;
        this.H = z10;
        this.I = z10;
        long j10 = a8Var.J0;
        if (j10 != 0) {
            this.J = j10;
        } else if (a8Var.f8711g) {
            this.J = a8Var.e;
        } else {
            TLRPC.InputPeer inputPeer = a8Var.f8739v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.J = UserConfig.getInstance(i7Var.f5493a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        ei.a8 a8Var = this.f5470c;
        i7 i7Var = this.M;
        if (z10) {
            i7Var.f5511w.b(a8Var);
            ((ArrayList) i7Var.f5494b.f(this.J)).remove(this);
        }
        this.v = true;
        if (a8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(i7Var.f5493a).cancelFileUpload(this.e, false);
        if (this.f5475w >= 0) {
            ConnectionsManager.getInstance(i7Var.f5493a).cancelRequest(this.f5475w, true);
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
        i7 i7Var = this.M;
        int i10 = i7Var.f5493a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j10 = this.J;
        if (!z10 && (arrayList = (ArrayList) i7Var.f5494b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) i7Var.f5495c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                i7Var.d = 0;
            } else {
                i7Var.d++;
            }
        }
        boolean z11 = this.f5469b;
        ei.a8 a8Var = this.f5470c;
        if (z11 && (hashMap = (HashMap) i7Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(a8Var.f8709f));
        }
        if (this.L != null) {
            a7 A = i7Var.A(this.J, 4, -1, false);
            if (a8Var != null && a8Var.f8711g) {
                if (A instanceof t6) {
                    ((t6) A).G(a8Var.L0, this.L);
                }
                String str = a8Var.K0;
                TLRPC.InputMedia inputMedia = a8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = di.v.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    t6 t6Var = (t6) longSparseArray4.get(j10);
                    int i11 = t6Var.f5148c;
                    ArrayList arrayList3 = t6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(t6Var.E, str)) {
                            t6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            x6 x6Var = t6Var.f5159q;
                            AndroidUtilities.cancelRunOnUIThread(x6Var);
                            AndroidUtilities.runOnUIThread(x6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = di.v.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (vVar2 = (di.v) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = vVar2.f8073f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        t6 t6Var2 = (t6) arrayList4.get(i12);
                        if (t6Var2.f5148c == i10 && TextUtils.equals(t6Var2.E, str)) {
                            t6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof t6) {
                    ((t6) A).I(this.L);
                }
                String str2 = a8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = di.v.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    t6 t6Var3 = (t6) longSparseArray2.get(j10);
                    int i13 = t6Var3.f5148c;
                    ArrayList arrayList5 = t6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(t6Var3.E, str2)) {
                            t6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            x6 x6Var2 = t6Var3.f5159q;
                            AndroidUtilities.cancelRunOnUIThread(x6Var2);
                            AndroidUtilities.runOnUIThread(x6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = di.v.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (vVar = (di.v) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = vVar.f8073f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        t6 t6Var4 = (t6) arrayList6.get(i14);
                        if (t6Var4.f5148c == i10 && TextUtils.equals(t6Var4.E, str2)) {
                            t6Var4.I(botpreviewmedia2);
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
        throw new UnsupportedOperationException("Method not decompiled: ci.h7.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        ei.a8 a8Var = this.f5470c;
        if (a8Var.f8700b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f5470c.f8703c0);
            c(tL_inputFileStoryDocument);
        } else if ((a8Var.f8711g || (a8Var.f8723n && a8Var.f8735t != null)) && !a8Var.f8716j && a8Var.f8726o0 == null) {
            c(null);
            return;
        }
        ei.p9 p9Var = this.f5470c.E0;
        if (p9Var != null && p9Var.f9601a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        NotificationCenter.getInstance(this.M.f5493a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.f5493a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.f5493a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.f5493a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.f5493a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.f5493a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f5470c.E();
        this.f5474s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f20296id = 1;
            String absolutePath = ei.a8.x(this.M.f5493a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new MessageObject(this.M.f5493a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f5470c.s(new g7(this, 1));
        } else {
            File w9 = ei.a8.w(this.M.f5493a, "jpg");
            this.e = w9.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new pa(25, this, w9));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.f5493a);
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
        i7 i7Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f5472n = floatValue;
                this.h = (this.f5473r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(i7Var.f5493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.f5476x < 0 && this.f5472n * ((float) this.f5477y) >= 1000.0f) {
                    this.f5476x = longValue;
                }
                FileLoader.getInstance(i7Var.f5493a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f5472n));
                if (longValue2 > 0 && this.f5476x < 0) {
                    this.f5476x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.f5469b) {
                    ei.a8 a8Var = this.f5470c;
                    a8Var.f8740w = true;
                    a8Var.f8742x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = a8Var.f8742x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    i7Var.f5511w.d(a8Var);
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
            this.f5473r = min;
            this.h = (min * 0.7f) + (this.f5472n * 0.3f);
            NotificationCenter.getInstance(i7Var.f5493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        ei.a8 a8Var = this.f5470c;
        a8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.f5493a);
        String str = this.e;
        boolean z10 = !a8Var.K;
        long j10 = 0;
        if (this.f5474s) {
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
