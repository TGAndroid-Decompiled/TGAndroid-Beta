package mi;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z4 implements cs {
    public int E;
    public volatile String F;
    public String G;
    public TLRPC.InputFile H;
    public boolean I;
    public final int f20087a;
    public final String f20088b;
    public final boolean f20089c;
    public final boolean d;
    public final boolean f20090e;
    public final int f20091f;
    public final int h;
    public final int f20092n;
    public final TLRPC.Document f20093r;
    public final y4 f20094s;
    public boolean f20095w;
    public boolean f20096x;
    public boolean f20097y;

    public z4(int i3, String str, boolean z10, int i10, int i11, int i12, g3 g3Var) {
        this.f20087a = i3;
        this.f20088b = str;
        this.f20089c = z10;
        this.d = false;
        this.f20090e = false;
        this.f20091f = i10;
        this.h = i11;
        this.f20092n = i12;
        this.f20093r = null;
        this.f20094s = g3Var;
    }

    public final void a(String str) {
        int i3;
        boolean z10;
        if (!this.f20096x && !this.f20097y) {
            this.F = str;
            hs f10 = hs.f(this.f20087a);
            f10.b(this, hs.U1);
            f10.b(this, hs.V1);
            f10.b(this, hs.W1);
            if (this.f20089c) {
                i3 = 33554432;
            } else if (this.d) {
                i3 = 50331648;
            } else if (this.f20090e) {
                i3 = 67108864;
            } else {
                i3 = 16777216;
            }
            w7 G = w7.G(this.f20087a);
            String str2 = this.F;
            if (!this.f20089c && !this.d && !this.f20090e) {
                z10 = true;
            } else {
                z10 = false;
            }
            G.i0(false, i3, str2, z10);
        }
    }

    public final void b() {
        if (!this.f20097y && !this.f20096x) {
            this.f20096x = true;
            try {
                if (this.F != null) {
                    w7.G(this.f20087a).b(this.F, false);
                }
            } catch (Throwable unused) {
            }
            if (this.E != 0) {
                ConnectionsManager.getInstance(this.f20087a).cancelRequest(this.E, true);
                this.E = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f20089c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f20092n;
            tL_documentAttributeVideo.f27008w = this.f20091f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.f20090e;
            if (!z10 && !z11) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f20093r;
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
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i3);
                            i3++;
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
        this.E = ConnectionsManager.getInstance(this.f20087a).sendRequest(tL_messages_uploadMedia, new ci.d0(this, 21));
    }

    public final void d() {
        int i3;
        int i10;
        if (!this.f20095w && !this.f20096x && !this.f20097y) {
            this.f20095w = true;
            if (this.f20089c) {
                y4 y4Var = this.f20094s;
                int i11 = this.f20091f;
                if (i11 > 0 && (i10 = this.h) > 0) {
                    y4Var.b(i11, i10);
                }
                a(this.f20088b);
            } else if (this.f20090e) {
                Utilities.f21387e.c(new x4(this, 0));
            } else if (this.d) {
                a(this.f20088b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f20088b, options);
                    int i12 = options.outWidth;
                    if (i12 > 0 && (i3 = options.outHeight) > 0) {
                        this.f20094s.b(i12, i3);
                    }
                } catch (Exception unused) {
                }
                Utilities.f21387e.c(new x4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i10 == this.f20087a && !this.f20096x && !this.f20097y) {
            String str = (String) objArr[0];
            if (this.F != null && this.F.equals(str)) {
                if (i3 == hs.U1) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f20090e && !this.I && !TextUtils.isEmpty(this.G)) {
                        this.H = inputFile2;
                        this.I = true;
                        this.F = this.G;
                        w7.G(this.f20087a).i0(false, 16777216, this.F, true);
                    } else if (this.f20090e && this.I) {
                        c(this.H, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i3 == hs.V1) {
                    if (this.f20090e && this.I && (inputFile = this.H) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f20097y = true;
                    e();
                    this.f20094s.a();
                } else if (i3 == hs.W1) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    y4 y4Var = this.f20094s;
                    if (!this.I) {
                        if (longValue2 > 0) {
                            f10 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f10 = 0.0f;
                        }
                        y4Var.g(f10);
                    }
                }
            }
        }
    }

    public final void e() {
        hs f10 = hs.f(this.f20087a);
        f10.n(this, hs.U1);
        f10.n(this, hs.V1);
        f10.n(this, hs.W1);
    }

    public z4(int i3, String str, TLRPC.Document document, f3 f3Var) {
        this.f20087a = i3;
        this.f20088b = str;
        this.f20089c = false;
        this.d = true;
        this.f20090e = false;
        this.f20091f = 0;
        this.h = 0;
        this.f20092n = 0;
        this.f20093r = document;
        this.f20094s = f3Var;
    }

    public z4(int i3, String str, TLRPC.Document document, e3 e3Var) {
        this.f20087a = i3;
        this.f20088b = str;
        this.f20089c = false;
        this.d = false;
        this.f20090e = true;
        this.f20091f = 0;
        this.h = 0;
        this.f20092n = 0;
        this.f20093r = document;
        this.f20094s = e3Var;
    }
}
