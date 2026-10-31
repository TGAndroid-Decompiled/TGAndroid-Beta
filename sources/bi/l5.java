package bi;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l5 implements us {
    public int D;
    public volatile String E;
    public String F;
    public TLRPC.InputFile G;
    public boolean H;
    public final int f3183a;
    public final String f3184b;
    public final boolean f3185c;
    public final boolean d;
    public final boolean e;
    public final int f3186f;
    public final int h;
    public final int f3187n;
    public final TLRPC.Document f3188r;
    public final k5 f3189s;
    public boolean f3190w;
    public boolean f3191x;
    public boolean f3192y;

    public l5(int i10, String str, boolean z10, int i11, int i12, int i13, p3 p3Var) {
        this.f3183a = i10;
        this.f3184b = str;
        this.f3185c = z10;
        this.d = false;
        this.e = false;
        this.f3186f = i11;
        this.h = i12;
        this.f3187n = i13;
        this.f3188r = null;
        this.f3189s = p3Var;
    }

    public final void a(String str) {
        int i10;
        boolean z10;
        if (!this.f3191x && !this.f3192y) {
            this.E = str;
            zs f7 = zs.f(this.f3183a);
            f7.b(this, zs.U1);
            f7.b(this, zs.V1);
            f7.b(this, zs.W1);
            if (this.f3185c) {
                i10 = 33554432;
            } else if (this.d) {
                i10 = 50331648;
            } else if (this.e) {
                i10 = 67108864;
            } else {
                i10 = 16777216;
            }
            b8 G = b8.G(this.f3183a);
            String str2 = this.E;
            if (!this.f3185c && !this.d && !this.e) {
                z10 = true;
            } else {
                z10 = false;
            }
            G.i0(false, i10, str2, z10);
        }
    }

    public final void b() {
        if (!this.f3192y && !this.f3191x) {
            this.f3191x = true;
            try {
                if (this.E != null) {
                    b8.G(this.f3183a).b(this.E, false);
                }
            } catch (Throwable unused) {
            }
            if (this.D != 0) {
                ConnectionsManager.getInstance(this.f3183a).cancelRequest(this.D, true);
                this.D = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f3185c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f3187n;
            tL_documentAttributeVideo.f19800w = this.f3186f;
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
                TLRPC.Document document = this.f3188r;
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
        this.D = ConnectionsManager.getInstance(this.f3183a).sendRequest(tL_messages_uploadMedia, new ag.c(this, 7));
    }

    public final void d() {
        int i10;
        int i11;
        if (!this.f3190w && !this.f3191x && !this.f3192y) {
            this.f3190w = true;
            if (this.f3185c) {
                k5 k5Var = this.f3189s;
                int i12 = this.f3186f;
                if (i12 > 0 && (i11 = this.h) > 0) {
                    k5Var.b(i12, i11);
                }
                a(this.f3184b);
            } else if (this.e) {
                Utilities.e.c(new j5(this, 0));
            } else if (this.d) {
                a(this.f3184b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f3184b, options);
                    int i13 = options.outWidth;
                    if (i13 > 0 && (i10 = options.outHeight) > 0) {
                        this.f3189s.b(i13, i10);
                    }
                } catch (Exception unused) {
                }
                Utilities.e.c(new j5(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        TLRPC.InputFile inputFile;
        if (i11 == this.f3183a && !this.f3191x && !this.f3192y) {
            String str = (String) objArr[0];
            if (this.E != null && this.E.equals(str)) {
                if (i10 == zs.U1) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.e && !this.H && !TextUtils.isEmpty(this.F)) {
                        this.G = inputFile2;
                        this.H = true;
                        this.E = this.F;
                        b8.G(this.f3183a).i0(false, 16777216, this.E, true);
                    } else if (this.e && this.H) {
                        c(this.G, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i10 == zs.V1) {
                    if (this.e && this.H && (inputFile = this.G) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f3192y = true;
                    e();
                    this.f3189s.a();
                } else if (i10 == zs.W1) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    k5 k5Var = this.f3189s;
                    if (!this.H) {
                        if (longValue2 > 0) {
                            f7 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f7 = 0.0f;
                        }
                        k5Var.g(f7);
                    }
                }
            }
        }
    }

    public final void e() {
        zs f7 = zs.f(this.f3183a);
        f7.n(this, zs.U1);
        f7.n(this, zs.V1);
        f7.n(this, zs.W1);
    }

    public l5(int i10, String str, TLRPC.Document document, o3 o3Var) {
        this.f3183a = i10;
        this.f3184b = str;
        this.f3185c = false;
        this.d = true;
        this.e = false;
        this.f3186f = 0;
        this.h = 0;
        this.f3187n = 0;
        this.f3188r = document;
        this.f3189s = o3Var;
    }

    public l5(int i10, String str, TLRPC.Document document, n3 n3Var) {
        this.f3183a = i10;
        this.f3184b = str;
        this.f3185c = false;
        this.d = false;
        this.e = true;
        this.f3186f = 0;
        this.h = 0;
        this.f3187n = 0;
        this.f3188r = document;
        this.f3189s = n3Var;
    }
}
