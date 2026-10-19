package ki;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a5 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String E;
    public String F;
    public TLRPC.InputFile G;
    public boolean H;
    public final int f15124a;
    public final String f15125b;
    public final boolean f15126c;
    public final boolean d;
    public final boolean e;
    public final int f15127f;
    public final int h;
    public final int f15128n;
    public final TLRPC.Document f15129r;
    public final z4 f15130s;
    public boolean v;
    public boolean f15131w;
    public boolean f15132x;
    public int f15133y;

    public a5(int i10, String str, boolean z10, int i11, int i12, int i13, i3 i3Var) {
        this.f15124a = i10;
        this.f15125b = str;
        this.f15126c = z10;
        this.d = false;
        this.e = false;
        this.f15127f = i11;
        this.h = i12;
        this.f15128n = i13;
        this.f15129r = null;
        this.f15130s = i3Var;
    }

    public final void a(String str) {
        int i10;
        boolean z10;
        if (!this.f15131w && !this.f15132x) {
            this.E = str;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15124a);
            notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
            if (this.f15126c) {
                i10 = 33554432;
            } else if (this.d) {
                i10 = 50331648;
            } else if (this.e) {
                i10 = 67108864;
            } else {
                i10 = 16777216;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.f15124a);
            String str2 = this.E;
            if (!this.f15126c && !this.d && !this.e) {
                z10 = true;
            } else {
                z10 = false;
            }
            fileLoader.uploadFile(str2, false, z10, i10);
        }
    }

    public final void b() {
        if (!this.f15132x && !this.f15131w) {
            this.f15131w = true;
            try {
                if (this.E != null) {
                    FileLoader.getInstance(this.f15124a).cancelFileUpload(this.E, false);
                }
            } catch (Throwable unused) {
            }
            if (this.f15133y != 0) {
                ConnectionsManager.getInstance(this.f15124a).cancelRequest(this.f15133y, true);
                this.f15133y = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f15126c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f15128n;
            tL_documentAttributeVideo.f20282w = this.f15127f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.e;
            if (!z10 && !z11) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f15129r;
                if (z11) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z11) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                            i10++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z11) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            }
        }
        this.f15133y = ConnectionsManager.getInstance(this.f15124a).sendRequest(tL_messages_uploadMedia, new ai.h(this, 23));
    }

    public final void d() {
        int i10;
        int i11;
        if (!this.v && !this.f15131w && !this.f15132x) {
            this.v = true;
            if (this.f15126c) {
                z4 z4Var = this.f15130s;
                int i12 = this.f15127f;
                if (i12 > 0 && (i11 = this.h) > 0) {
                    z4Var.a(i12, i11);
                }
                a(this.f15125b);
            } else if (this.e) {
                Utilities.globalQueue.postRunnable(new y4(this, 0));
            } else if (this.d) {
                a(this.f15125b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f15125b, options);
                    int i13 = options.outWidth;
                    if (i13 > 0 && (i10 = options.outHeight) > 0) {
                        this.f15130s.a(i13, i10);
                    }
                } catch (Exception unused) {
                }
                Utilities.globalQueue.postRunnable(new y4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        TLRPC.InputFile inputFile;
        if (i11 == this.f15124a && !this.f15131w && !this.f15132x) {
            String str = (String) objArr[0];
            if (this.E != null && this.E.equals(str)) {
                if (i10 == NotificationCenter.fileUploaded) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.e && !this.H && !TextUtils.isEmpty(this.F)) {
                        this.G = inputFile2;
                        this.H = true;
                        this.E = this.F;
                        FileLoader.getInstance(this.f15124a).uploadFile(this.E, false, true, 16777216);
                    } else if (this.e && this.H) {
                        c(this.G, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i10 == NotificationCenter.fileUploadFailed) {
                    if (this.e && this.H && (inputFile = this.G) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f15132x = true;
                    e();
                    this.f15130s.onError();
                } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    z4 z4Var = this.f15130s;
                    if (!this.H) {
                        if (longValue2 > 0) {
                            f7 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f7 = 0.0f;
                        }
                        z4Var.f(f7);
                    }
                }
            }
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15124a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public a5(int i10, String str, TLRPC.Document document, g3 g3Var) {
        this.f15124a = i10;
        this.f15125b = str;
        this.f15126c = false;
        this.d = true;
        this.e = false;
        this.f15127f = 0;
        this.h = 0;
        this.f15128n = 0;
        this.f15129r = document;
        this.f15130s = g3Var;
    }

    public a5(int i10, String str, TLRPC.Document document, f3 f3Var) {
        this.f15124a = i10;
        this.f15125b = str;
        this.f15126c = false;
        this.d = false;
        this.e = true;
        this.f15127f = 0;
        this.h = 0;
        this.f15128n = 0;
        this.f15129r = document;
        this.f15130s = f3Var;
    }
}
