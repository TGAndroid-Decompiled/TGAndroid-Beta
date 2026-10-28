package li;

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
    public final int f17103a;
    public final String f17104b;
    public final boolean f17105c;
    public final boolean d;
    public final boolean e;
    public final int f17106f;
    public final int h;
    public final int f17107n;
    public final TLRPC.Document f17108r;
    public final z4 f17109s;
    public boolean v;
    public boolean f17110w;
    public boolean f17111x;
    public int f17112y;

    public a5(int i10, String str, boolean z10, int i11, int i12, int i13, i3 i3Var) {
        this.f17103a = i10;
        this.f17104b = str;
        this.f17105c = z10;
        this.d = false;
        this.e = false;
        this.f17106f = i11;
        this.h = i12;
        this.f17107n = i13;
        this.f17108r = null;
        this.f17109s = i3Var;
    }

    public final void a(String str) {
        int i10;
        boolean z10;
        if (!this.f17110w && !this.f17111x) {
            this.E = str;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f17103a);
            notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
            if (this.f17105c) {
                i10 = 33554432;
            } else if (this.d) {
                i10 = 50331648;
            } else if (this.e) {
                i10 = 67108864;
            } else {
                i10 = 16777216;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.f17103a);
            String str2 = this.E;
            if (!this.f17105c && !this.d && !this.e) {
                z10 = true;
            } else {
                z10 = false;
            }
            fileLoader.uploadFile(str2, false, z10, i10);
        }
    }

    public final void b() {
        if (!this.f17111x && !this.f17110w) {
            this.f17110w = true;
            try {
                if (this.E != null) {
                    FileLoader.getInstance(this.f17103a).cancelFileUpload(this.E, false);
                }
            } catch (Throwable unused) {
            }
            if (this.f17112y != 0) {
                ConnectionsManager.getInstance(this.f17103a).cancelRequest(this.f17112y, true);
                this.f17112y = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f17105c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f17107n;
            tL_documentAttributeVideo.f22035w = this.f17106f;
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
                TLRPC.Document document = this.f17108r;
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
        this.f17112y = ConnectionsManager.getInstance(this.f17103a).sendRequest(tL_messages_uploadMedia, new bi.i0(this, 22));
    }

    public final void d() {
        int i10;
        int i11;
        if (!this.v && !this.f17110w && !this.f17111x) {
            this.v = true;
            if (this.f17105c) {
                z4 z4Var = this.f17109s;
                int i12 = this.f17106f;
                if (i12 > 0 && (i11 = this.h) > 0) {
                    z4Var.a(i12, i11);
                }
                a(this.f17104b);
            } else if (this.e) {
                Utilities.globalQueue.postRunnable(new y4(this, 0));
            } else if (this.d) {
                a(this.f17104b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f17104b, options);
                    int i13 = options.outWidth;
                    if (i13 > 0 && (i10 = options.outHeight) > 0) {
                        this.f17109s.a(i13, i10);
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
        if (i11 == this.f17103a && !this.f17110w && !this.f17111x) {
            String str = (String) objArr[0];
            if (this.E != null && this.E.equals(str)) {
                if (i10 == NotificationCenter.fileUploaded) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.e && !this.H && !TextUtils.isEmpty(this.F)) {
                        this.G = inputFile2;
                        this.H = true;
                        this.E = this.F;
                        FileLoader.getInstance(this.f17103a).uploadFile(this.E, false, true, 16777216);
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
                    this.f17111x = true;
                    e();
                    this.f17109s.onError();
                } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    z4 z4Var = this.f17109s;
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
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f17103a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public a5(int i10, String str, TLRPC.Document document, g3 g3Var) {
        this.f17103a = i10;
        this.f17104b = str;
        this.f17105c = false;
        this.d = true;
        this.e = false;
        this.f17106f = 0;
        this.h = 0;
        this.f17107n = 0;
        this.f17108r = document;
        this.f17109s = g3Var;
    }

    public a5(int i10, String str, TLRPC.Document document, f3 f3Var) {
        this.f17103a = i10;
        this.f17104b = str;
        this.f17105c = false;
        this.d = false;
        this.e = true;
        this.f17106f = 0;
        this.h = 0;
        this.f17107n = 0;
        this.f17108r = document;
        this.f17109s = f3Var;
    }
}
