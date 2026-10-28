package di;

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
    public final boolean f8583b;
    public final fi.w7 f8584c;
    public boolean d;
    public String e;
    public final String f8585f;
    public float h;
    public float f8586n;
    public float f8587r;
    public boolean f8588s;
    public boolean v;
    public int f8589w;
    public long f8591y;
    public long f8590x = -1;
    public final long f8582a = Utilities.random.nextLong();

    public g7(h7 h7Var, fi.w7 w7Var) {
        this.M = h7Var;
        this.f8584c = w7Var;
        this.f8583b = w7Var.f11902g;
        File file = w7Var.N0;
        if (file != null) {
            this.f8585f = file.getAbsolutePath();
        }
        boolean z10 = w7Var.f11931w;
        this.H = z10;
        this.I = z10;
        long j10 = w7Var.J0;
        if (j10 != 0) {
            this.J = j10;
        } else if (w7Var.f11902g) {
            this.J = w7Var.e;
        } else {
            TLRPC.InputPeer inputPeer = w7Var.f11930v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.J = UserConfig.getInstance(h7Var.f8629a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        fi.w7 w7Var = this.f8584c;
        h7 h7Var = this.M;
        if (z10) {
            h7Var.f8647w.b(w7Var);
            ((ArrayList) h7Var.f8630b.f(this.J)).remove(this);
        }
        this.v = true;
        if (w7Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(h7Var.f8629a).cancelFileUpload(this.e, false);
        if (this.f8589w >= 0) {
            ConnectionsManager.getInstance(h7Var.f8629a).cancelRequest(this.f8589w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ei.v vVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ei.v vVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        h7 h7Var = this.M;
        int i10 = h7Var.f8629a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j10 = this.J;
        if (!z10 && (arrayList = (ArrayList) h7Var.f8630b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) h7Var.f8631c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                h7Var.d = 0;
            } else {
                h7Var.d++;
            }
        }
        boolean z11 = this.f8583b;
        fi.w7 w7Var = this.f8584c;
        if (z11 && (hashMap = (HashMap) h7Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(w7Var.f11900f));
        }
        if (this.L != null) {
            z6 A = h7Var.A(this.J, 4, -1, false);
            if (w7Var != null && w7Var.f11902g) {
                if (A instanceof s6) {
                    ((s6) A).G(w7Var.L0, this.L);
                }
                String str = w7Var.K0;
                TLRPC.InputMedia inputMedia = w7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ei.v.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    s6 s6Var = (s6) longSparseArray4.get(j10);
                    int i11 = s6Var.f9489c;
                    ArrayList arrayList3 = s6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(s6Var.E, str)) {
                            s6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            w6 w6Var = s6Var.f9500q;
                            AndroidUtilities.cancelRunOnUIThread(w6Var);
                            AndroidUtilities.runOnUIThread(w6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ei.v.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (vVar2 = (ei.v) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = vVar2.f10017f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        s6 s6Var2 = (s6) arrayList4.get(i12);
                        if (s6Var2.f9489c == i10 && TextUtils.equals(s6Var2.E, str)) {
                            s6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof s6) {
                    ((s6) A).I(this.L);
                }
                String str2 = w7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ei.v.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    s6 s6Var3 = (s6) longSparseArray2.get(j10);
                    int i13 = s6Var3.f9489c;
                    ArrayList arrayList5 = s6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(s6Var3.E, str2)) {
                            s6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            w6 w6Var2 = s6Var3.f9500q;
                            AndroidUtilities.cancelRunOnUIThread(w6Var2);
                            AndroidUtilities.runOnUIThread(w6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ei.v.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (vVar = (ei.v) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = vVar.f10017f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        s6 s6Var4 = (s6) arrayList6.get(i14);
                        if (s6Var4.f9489c == i10 && TextUtils.equals(s6Var4.E, str2)) {
                            s6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (w7Var != null && !w7Var.h && !this.d) {
            w7Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: di.g7.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        fi.w7 w7Var = this.f8584c;
        if (w7Var.f11891b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f8584c.f11894c0);
            c(tL_inputFileStoryDocument);
        } else if ((w7Var.f11902g || (w7Var.f11914n && w7Var.f11926t != null)) && !w7Var.f11907j && w7Var.f11917o0 == null) {
            c(null);
            return;
        }
        fi.l9 l9Var = this.f8584c.E0;
        if (l9Var != null && l9Var.f11180a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        NotificationCenter.getInstance(this.M.f8629a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.f8629a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.f8629a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.f8629a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.f8629a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.f8629a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f8584c.E();
        this.f8588s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f22049id = 1;
            String absolutePath = fi.w7.x(this.M.f8629a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new MessageObject(this.M.f8629a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f8584c.s(new f7(this, 1));
        } else {
            File w10 = fi.w7.w(this.M.f8629a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new b4(9, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.f8629a);
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
                this.f8586n = floatValue;
                this.h = (this.f8587r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(h7Var.f8629a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.f8590x < 0 && this.f8586n * ((float) this.f8591y) >= 1000.0f) {
                    this.f8590x = longValue;
                }
                FileLoader.getInstance(h7Var.f8629a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f8586n));
                if (longValue2 > 0 && this.f8590x < 0) {
                    this.f8590x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.f8583b) {
                    fi.w7 w7Var = this.f8584c;
                    w7Var.f11931w = true;
                    w7Var.f11933x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = w7Var.f11933x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    h7Var.f8647w.d(w7Var);
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
            this.f8587r = min;
            this.h = (min * 0.7f) + (this.f8586n * 0.3f);
            NotificationCenter.getInstance(h7Var.f8629a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        fi.w7 w7Var = this.f8584c;
        w7Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.f8629a);
        String str = this.e;
        boolean z10 = !w7Var.K;
        long j10 = 0;
        if (this.f8588s) {
            VideoEditedInfo videoEditedInfo = this.F;
            if (videoEditedInfo != null) {
                j10 = videoEditedInfo.estimatedSize;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (w7Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z10, j10, i10, true);
    }
}
