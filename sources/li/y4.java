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
    public final int f19020a;
    public final String f19021b;
    public final boolean f19022c;
    public final boolean d;
    public final boolean f19023e;
    public final int f19024f;
    public final int h;
    public final int f19025n;
    public final TLRPC.Document f19026r;
    public final x4 f19027s;
    public boolean f19028w;
    public boolean f19029x;
    public boolean f19030y;

    public y4(int i7, String str, boolean z9, int i10, int i11, int i12, f3 f3Var) {
        this.f19020a = i7;
        this.f19021b = str;
        this.f19022c = z9;
        this.d = false;
        this.f19023e = false;
        this.f19024f = i10;
        this.h = i11;
        this.f19025n = i12;
        this.f19026r = null;
        this.f19027s = f3Var;
    }

    public final void a(String str) {
        int i7;
        boolean z9;
        if (!this.f19029x && !this.f19030y) {
            this.E = str;
            qs f10 = qs.f(this.f19020a);
            f10.b(this, qs.U1);
            f10.b(this, qs.V1);
            f10.b(this, qs.W1);
            if (this.f19022c) {
                i7 = 33554432;
            } else if (this.d) {
                i7 = 50331648;
            } else if (this.f19023e) {
                i7 = 67108864;
            } else {
                i7 = 16777216;
            }
            w7 G = w7.G(this.f19020a);
            String str2 = this.E;
            if (!this.f19022c && !this.d && !this.f19023e) {
                z9 = true;
            } else {
                z9 = false;
            }
            G.h0(false, i7, str2, z9);
        }
    }

    public final void b() {
        if (!this.f19030y && !this.f19029x) {
            this.f19029x = true;
            try {
                if (this.E != null) {
                    w7.G(this.f19020a).b(this.E, false);
                }
            } catch (Throwable unused) {
            }
            if (this.D != 0) {
                ConnectionsManager.getInstance(this.f19020a).cancelRequest(this.D, true);
                this.D = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f19022c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f19025n;
            tL_documentAttributeVideo.f26960w = this.f19024f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z9 = this.d;
            boolean z10 = this.f19023e;
            if (!z9 && !z10) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f19026r;
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
        this.D = ConnectionsManager.getInstance(this.f19020a).sendRequest(tL_messages_uploadMedia, new bi.j0(this, 21));
    }

    public final void d() {
        int i7;
        int i10;
        if (!this.f19028w && !this.f19029x && !this.f19030y) {
            this.f19028w = true;
            if (this.f19022c) {
                x4 x4Var = this.f19027s;
                int i11 = this.f19024f;
                if (i11 > 0 && (i10 = this.h) > 0) {
                    x4Var.b(i11, i10);
                }
                a(this.f19021b);
            } else if (this.f19023e) {
                Utilities.f21333e.c(new w4(this, 0));
            } else if (this.d) {
                a(this.f19021b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f19021b, options);
                    int i12 = options.outWidth;
                    if (i12 > 0 && (i7 = options.outHeight) > 0) {
                        this.f19027s.b(i12, i7);
                    }
                } catch (Exception unused) {
                }
                Utilities.f21333e.c(new w4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i10 == this.f19020a && !this.f19029x && !this.f19030y) {
            String str = (String) objArr[0];
            if (this.E != null && this.E.equals(str)) {
                if (i7 == qs.U1) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f19023e && !this.H && !TextUtils.isEmpty(this.F)) {
                        this.G = inputFile2;
                        this.H = true;
                        this.E = this.F;
                        w7.G(this.f19020a).h0(false, 16777216, this.E, true);
                    } else if (this.f19023e && this.H) {
                        c(this.G, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i7 == qs.V1) {
                    if (this.f19023e && this.H && (inputFile = this.G) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f19030y = true;
                    e();
                    this.f19027s.a();
                } else if (i7 == qs.W1) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    x4 x4Var = this.f19027s;
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
        qs f10 = qs.f(this.f19020a);
        f10.n(this, qs.U1);
        f10.n(this, qs.V1);
        f10.n(this, qs.W1);
    }

    public y4(int i7, String str, TLRPC.Document document, e3 e3Var) {
        this.f19020a = i7;
        this.f19021b = str;
        this.f19022c = false;
        this.d = true;
        this.f19023e = false;
        this.f19024f = 0;
        this.h = 0;
        this.f19025n = 0;
        this.f19026r = document;
        this.f19027s = e3Var;
    }

    public y4(int i7, String str, TLRPC.Document document, d3 d3Var) {
        this.f19020a = i7;
        this.f19021b = str;
        this.f19022c = false;
        this.d = false;
        this.f19023e = true;
        this.f19024f = 0;
        this.h = 0;
        this.f19025n = 0;
        this.f19026r = document;
        this.f19027s = d3Var;
    }
}
