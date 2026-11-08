package li;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y4 implements ls {
    public int D;
    public volatile String E;
    public String F;
    public TLRPC.InputFile G;
    public boolean H;
    public final int f19023a;
    public final String f19024b;
    public final boolean f19025c;
    public final boolean d;
    public final boolean f19026e;
    public final int f19027f;
    public final int h;
    public final int f19028n;
    public final TLRPC.Document f19029r;
    public final x4 f19030s;
    public boolean f19031w;
    public boolean f19032x;
    public boolean f19033y;

    public y4(int i7, String str, boolean z9, int i10, int i11, int i12, f3 f3Var) {
        this.f19023a = i7;
        this.f19024b = str;
        this.f19025c = z9;
        this.d = false;
        this.f19026e = false;
        this.f19027f = i10;
        this.h = i11;
        this.f19028n = i12;
        this.f19029r = null;
        this.f19030s = f3Var;
    }

    public final void a(String str) {
        int i7;
        boolean z9;
        if (!this.f19032x && !this.f19033y) {
            this.E = str;
            qs f10 = qs.f(this.f19023a);
            f10.b(this, qs.U1);
            f10.b(this, qs.V1);
            f10.b(this, qs.W1);
            if (this.f19025c) {
                i7 = 33554432;
            } else if (this.d) {
                i7 = 50331648;
            } else if (this.f19026e) {
                i7 = 67108864;
            } else {
                i7 = 16777216;
            }
            w7 G = w7.G(this.f19023a);
            String str2 = this.E;
            if (!this.f19025c && !this.d && !this.f19026e) {
                z9 = true;
            } else {
                z9 = false;
            }
            G.h0(false, i7, str2, z9);
        }
    }

    public final void b() {
        if (!this.f19033y && !this.f19032x) {
            this.f19032x = true;
            try {
                if (this.E != null) {
                    w7.G(this.f19023a).b(this.E, false);
                }
            } catch (Throwable unused) {
            }
            if (this.D != 0) {
                ConnectionsManager.getInstance(this.f19023a).cancelRequest(this.D, true);
                this.D = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f19025c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f19028n;
            tL_documentAttributeVideo.f26963w = this.f19027f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z9 = this.d;
            boolean z10 = this.f19026e;
            if (!z9 && !z10) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f19029r;
                if (z10) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z10) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i7);
                            i7++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z10) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            }
        }
        this.D = ConnectionsManager.getInstance(this.f19023a).sendRequest(tL_messages_uploadMedia, new bi.j0(this, 21));
    }

    public final void d() {
        int i7;
        int i10;
        if (!this.f19031w && !this.f19032x && !this.f19033y) {
            this.f19031w = true;
            if (this.f19025c) {
                x4 x4Var = this.f19030s;
                int i11 = this.f19027f;
                if (i11 > 0 && (i10 = this.h) > 0) {
                    x4Var.b(i11, i10);
                }
                a(this.f19024b);
            } else if (this.f19026e) {
                Utilities.f21336e.c(new w4(this, 0));
            } else if (this.d) {
                a(this.f19024b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f19024b, options);
                    int i12 = options.outWidth;
                    if (i12 > 0 && (i7 = options.outHeight) > 0) {
                        this.f19030s.b(i12, i7);
                    }
                } catch (Exception unused) {
                }
                Utilities.f21336e.c(new w4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i10 == this.f19023a && !this.f19032x && !this.f19033y) {
            String str = (String) objArr[0];
            if (this.E != null && this.E.equals(str)) {
                if (i7 == qs.U1) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f19026e && !this.H && !TextUtils.isEmpty(this.F)) {
                        this.G = inputFile2;
                        this.H = true;
                        this.E = this.F;
                        w7.G(this.f19023a).h0(false, 16777216, this.E, true);
                    } else if (this.f19026e && this.H) {
                        c(this.G, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i7 == qs.V1) {
                    if (this.f19026e && this.H && (inputFile = this.G) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f19033y = true;
                    e();
                    this.f19030s.a();
                } else if (i7 == qs.W1) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    x4 x4Var = this.f19030s;
                    if (!this.H) {
                        if (longValue2 > 0) {
                            f10 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f10 = 0.0f;
                        }
                        x4Var.g(f10);
                    }
                }
            }
        }
    }

    public final void e() {
        qs f10 = qs.f(this.f19023a);
        f10.n(this, qs.U1);
        f10.n(this, qs.V1);
        f10.n(this, qs.W1);
    }

    public y4(int i7, String str, TLRPC.Document document, e3 e3Var) {
        this.f19023a = i7;
        this.f19024b = str;
        this.f19025c = false;
        this.d = true;
        this.f19026e = false;
        this.f19027f = 0;
        this.h = 0;
        this.f19028n = 0;
        this.f19029r = document;
        this.f19030s = e3Var;
    }

    public y4(int i7, String str, TLRPC.Document document, d3 d3Var) {
        this.f19023a = i7;
        this.f19024b = str;
        this.f19025c = false;
        this.d = false;
        this.f19026e = true;
        this.f19027f = 0;
        this.h = 0;
        this.f19028n = 0;
        this.f19029r = document;
        this.f19030s = d3Var;
    }
}
