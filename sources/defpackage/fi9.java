package defpackage;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fi9 implements jm7 {
    public int E;
    public volatile String F;
    public String G;
    public TLRPC.InputFile H;
    public boolean I;
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int h;
    public final int n;
    public final TLRPC.Document r;
    public final ei9 s;
    public boolean w;
    public boolean x;
    public boolean y;

    public fi9(int i, String str, boolean z, int i2, int i3, int i4, pg9 pg9Var) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = false;
        this.e = false;
        this.f = i2;
        this.h = i3;
        this.n = i4;
        this.r = null;
        this.s = pg9Var;
    }

    public final void a(String str) {
        int i;
        boolean z;
        if (!this.x && !this.y) {
            this.F = str;
            nm7 f = nm7.f(this.a);
            f.a(this, nm7.U1);
            f.a(this, nm7.V1);
            f.a(this, nm7.W1);
            if (this.c) {
                i = 33554432;
            } else if (this.d) {
                i = 50331648;
            } else if (this.e) {
                i = 67108864;
            } else {
                i = 16777216;
            }
            bc4 G = bc4.G(this.a);
            String str2 = this.F;
            if (!this.c && !this.d && !this.e) {
                z = true;
            } else {
                z = false;
            }
            G.h0(false, i, str2, z);
        }
    }

    public final void b() {
        if (!this.y && !this.x) {
            this.x = true;
            try {
                if (this.F != null) {
                    bc4.G(this.a).b(this.F, false);
                }
            } catch (Throwable unused) {
            }
            if (this.E != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.E, true);
                this.E = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.n;
            tL_documentAttributeVideo.w = this.f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z = this.d;
            boolean z2 = this.e;
            if (!z && !z2) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.r;
                if (z2) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z2) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i);
                            i++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z2) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            }
        }
        this.E = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_uploadMedia, new r15(this, (byte) 27));
    }

    public final void d() {
        int i;
        int i2;
        if (!this.w && !this.x && !this.y) {
            this.w = true;
            if (this.c) {
                ei9 ei9Var = this.s;
                int i3 = this.f;
                if (i3 > 0 && (i2 = this.h) > 0) {
                    ei9Var.b(i3, i2);
                }
                a(this.b);
            } else if (this.e) {
                Utilities.e.c(new di9(this, (byte) 0));
            } else if (this.d) {
                a(this.b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.b, options);
                    int i4 = options.outWidth;
                    if (i4 > 0 && (i = options.outHeight) > 0) {
                        this.s.b(i4, i);
                    }
                } catch (Exception unused) {
                }
                Utilities.e.c(new di9(this, (byte) 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        float f;
        TLRPC.InputFile inputFile;
        if (i2 == this.a && !this.x && !this.y) {
            String str = (String) objArr[0];
            if (this.F != null && this.F.equals(str)) {
                if (i == nm7.U1) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.e && !this.I && !TextUtils.isEmpty(this.G)) {
                        this.H = inputFile2;
                        this.I = true;
                        this.F = this.G;
                        bc4.G(this.a).h0(false, 16777216, this.F, true);
                    } else if (this.e && this.I) {
                        c(this.H, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i == nm7.V1) {
                    if (this.e && this.I && (inputFile = this.H) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.y = true;
                    e();
                    this.s.a();
                } else if (i == nm7.W1) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    ei9 ei9Var = this.s;
                    if (!this.I) {
                        if (longValue2 > 0) {
                            f = ((float) longValue) / ((float) longValue2);
                        } else {
                            f = 0.0f;
                        }
                        ei9Var.g(f);
                    }
                }
            }
        }
    }

    public final void e() {
        nm7 f = nm7.f(this.a);
        f.n(this, nm7.U1);
        f.n(this, nm7.V1);
        f.n(this, nm7.W1);
    }

    public fi9(int i, String str, TLRPC.Document document, og9 og9Var) {
        this.a = i;
        this.b = str;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = og9Var;
    }

    public fi9(int i, String str, TLRPC.Document document, ng9 ng9Var) {
        this.a = i;
        this.b = str;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = ng9Var;
    }
}
