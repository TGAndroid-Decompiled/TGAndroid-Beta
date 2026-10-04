package ii;

import ai.n8;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c5 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String E;
    public String F;
    public TLRPC.InputFile G;
    public boolean H;
    public final int f12277a;
    public final String f12278b;
    public final boolean f12279c;
    public final boolean d;
    public final boolean f12280e;
    public final int f12281f;
    public final int h;
    public final int f12282n;
    public final TLRPC.Document f12283r;
    public final b5 f12284s;
    public boolean v;
    public boolean f12285w;
    public boolean f12286x;
    public int f12287y;

    public c5(int i10, String str, boolean z10, int i11, int i12, int i13, j3 j3Var) {
        this.f12277a = i10;
        this.f12278b = str;
        this.f12279c = z10;
        this.d = false;
        this.f12280e = false;
        this.f12281f = i11;
        this.h = i12;
        this.f12282n = i13;
        this.f12283r = null;
        this.f12284s = j3Var;
    }

    public final void a(String str) {
        int i10;
        boolean z10;
        if (!this.f12285w && !this.f12286x) {
            this.E = str;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f12277a);
            notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
            if (this.f12279c) {
                i10 = 33554432;
            } else if (this.d) {
                i10 = 50331648;
            } else if (this.f12280e) {
                i10 = 67108864;
            } else {
                i10 = 16777216;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.f12277a);
            String str2 = this.E;
            if (!this.f12279c && !this.d && !this.f12280e) {
                z10 = true;
            } else {
                z10 = false;
            }
            fileLoader.uploadFile(str2, false, z10, i10);
        }
    }

    public final void b() {
        if (!this.f12286x && !this.f12285w) {
            this.f12285w = true;
            try {
                if (this.E != null) {
                    FileLoader.getInstance(this.f12277a).cancelFileUpload(this.E, false);
                }
            } catch (Throwable unused) {
            }
            if (this.f12287y != 0) {
                ConnectionsManager.getInstance(this.f12277a).cancelRequest(this.f12287y, true);
                this.f12287y = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f12279c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f12282n;
            tL_documentAttributeVideo.f20045w = this.f12281f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.f12280e;
            if (!z10 && !z11) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f12283r;
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
        this.f12287y = ConnectionsManager.getInstance(this.f12277a).sendRequest(tL_messages_uploadMedia, new n8(this, 17));
    }

    public final void d() {
        int i10;
        int i11;
        if (!this.v && !this.f12285w && !this.f12286x) {
            this.v = true;
            if (this.f12279c) {
                b5 b5Var = this.f12284s;
                int i12 = this.f12281f;
                if (i12 > 0 && (i11 = this.h) > 0) {
                    b5Var.a(i12, i11);
                }
                a(this.f12278b);
            } else if (this.f12280e) {
                Utilities.globalQueue.postRunnable(new a5(this, 0));
            } else if (this.d) {
                a(this.f12278b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f12278b, options);
                    int i13 = options.outWidth;
                    if (i13 > 0 && (i10 = options.outHeight) > 0) {
                        this.f12284s.a(i13, i10);
                    }
                } catch (Exception unused) {
                }
                Utilities.globalQueue.postRunnable(new a5(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        TLRPC.InputFile inputFile;
        if (i11 == this.f12277a && !this.f12285w && !this.f12286x) {
            String str = (String) objArr[0];
            if (this.E != null && this.E.equals(str)) {
                if (i10 == NotificationCenter.fileUploaded) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f12280e && !this.H && !TextUtils.isEmpty(this.F)) {
                        this.G = inputFile2;
                        this.H = true;
                        this.E = this.F;
                        FileLoader.getInstance(this.f12277a).uploadFile(this.E, false, true, 16777216);
                    } else if (this.f12280e && this.H) {
                        c(this.G, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i10 == NotificationCenter.fileUploadFailed) {
                    if (this.f12280e && this.H && (inputFile = this.G) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f12286x = true;
                    e();
                    this.f12284s.onError();
                } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    b5 b5Var = this.f12284s;
                    if (!this.H) {
                        if (longValue2 > 0) {
                            f7 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f7 = 0.0f;
                        }
                        b5Var.f(f7);
                    }
                }
            }
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f12277a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public c5(int i10, String str, TLRPC.Document document, h3 h3Var) {
        this.f12277a = i10;
        this.f12278b = str;
        this.f12279c = false;
        this.d = true;
        this.f12280e = false;
        this.f12281f = 0;
        this.h = 0;
        this.f12282n = 0;
        this.f12283r = document;
        this.f12284s = h3Var;
    }

    public c5(int i10, String str, TLRPC.Document document, g3 g3Var) {
        this.f12277a = i10;
        this.f12278b = str;
        this.f12279c = false;
        this.d = false;
        this.f12280e = true;
        this.f12281f = 0;
        this.h = 0;
        this.f12282n = 0;
        this.f12283r = document;
        this.f12284s = g3Var;
    }
}
