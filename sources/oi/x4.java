package oi;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x4 implements fs {
    public int E;
    public volatile String F;
    public String G;
    public TLRPC.InputFile H;
    public boolean I;
    public final int f22483a;
    public final String f22484b;
    public final boolean f22485c;
    public final boolean d;
    public final boolean f22486e;
    public final int f22487f;
    public final int h;
    public final int f22488n;
    public final TLRPC.Document f22489r;
    public final w4 f22490s;
    public boolean f22491w;
    public boolean f22492x;
    public boolean f22493y;

    public x4(int i7, String str, boolean z10, int i10, int i11, int i12, f3 f3Var) {
        this.f22483a = i7;
        this.f22484b = str;
        this.f22485c = z10;
        this.d = false;
        this.f22486e = false;
        this.f22487f = i10;
        this.h = i11;
        this.f22488n = i12;
        this.f22489r = null;
        this.f22490s = f3Var;
    }

    public final void a(String str) {
        int i7;
        boolean z10;
        if (!this.f22492x && !this.f22493y) {
            this.F = str;
            ks f10 = ks.f(this.f22483a);
            f10.b(this, ks.U1);
            f10.b(this, ks.V1);
            f10.b(this, ks.W1);
            if (this.f22485c) {
                i7 = 33554432;
            } else if (this.d) {
                i7 = 50331648;
            } else if (this.f22486e) {
                i7 = 67108864;
            } else {
                i7 = 16777216;
            }
            w7 G = w7.G(this.f22483a);
            String str2 = this.F;
            if (!this.f22485c && !this.d && !this.f22486e) {
                z10 = true;
            } else {
                z10 = false;
            }
            G.h0(false, i7, str2, z10);
        }
    }

    public final void b() {
        if (!this.f22493y && !this.f22492x) {
            this.f22492x = true;
            try {
                if (this.F != null) {
                    w7.G(this.f22483a).b(this.F, false);
                }
            } catch (Throwable unused) {
            }
            if (this.E != 0) {
                ConnectionsManager.getInstance(this.f22483a).cancelRequest(this.E, true);
                this.E = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f22485c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f22488n;
            tL_documentAttributeVideo.f28412w = this.f22487f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.f22486e;
            if (!z10 && !z11) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f22489r;
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
        this.E = ConnectionsManager.getInstance(this.f22483a).sendRequest(tL_messages_uploadMedia, new ai.e1(this, 24));
    }

    public final void d() {
        int i7;
        int i10;
        if (!this.f22491w && !this.f22492x && !this.f22493y) {
            this.f22491w = true;
            if (this.f22485c) {
                w4 w4Var = this.f22490s;
                int i11 = this.f22487f;
                if (i11 > 0 && (i10 = this.h) > 0) {
                    w4Var.b(i11, i10);
                }
                a(this.f22484b);
            } else if (this.f22486e) {
                Utilities.f22782e.c(new v4(this, 0));
            } else if (this.d) {
                a(this.f22484b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f22484b, options);
                    int i12 = options.outWidth;
                    if (i12 > 0 && (i7 = options.outHeight) > 0) {
                        this.f22490s.b(i12, i7);
                    }
                } catch (Exception unused) {
                }
                Utilities.f22782e.c(new v4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i10 == this.f22483a && !this.f22492x && !this.f22493y) {
            String str = (String) objArr[0];
            if (this.F != null && this.F.equals(str)) {
                if (i7 == ks.U1) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f22486e && !this.I && !TextUtils.isEmpty(this.G)) {
                        this.H = inputFile2;
                        this.I = true;
                        this.F = this.G;
                        w7.G(this.f22483a).h0(false, 16777216, this.F, true);
                    } else if (this.f22486e && this.I) {
                        c(this.H, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i7 == ks.V1) {
                    if (this.f22486e && this.I && (inputFile = this.H) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f22493y = true;
                    e();
                    this.f22490s.a();
                } else if (i7 == ks.W1) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    w4 w4Var = this.f22490s;
                    if (!this.I) {
                        if (longValue2 > 0) {
                            f10 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f10 = 0.0f;
                        }
                        w4Var.g(f10);
                    }
                }
            }
        }
    }

    public final void e() {
        ks f10 = ks.f(this.f22483a);
        f10.n(this, ks.U1);
        f10.n(this, ks.V1);
        f10.n(this, ks.W1);
    }

    public x4(int i7, String str, TLRPC.Document document, e3 e3Var) {
        this.f22483a = i7;
        this.f22484b = str;
        this.f22485c = false;
        this.d = true;
        this.f22486e = false;
        this.f22487f = 0;
        this.h = 0;
        this.f22488n = 0;
        this.f22489r = document;
        this.f22490s = e3Var;
    }

    public x4(int i7, String str, TLRPC.Document document, d3 d3Var) {
        this.f22483a = i7;
        this.f22484b = str;
        this.f22485c = false;
        this.d = false;
        this.f22486e = true;
        this.f22487f = 0;
        this.h = 0;
        this.f22488n = 0;
        this.f22489r = document;
        this.f22490s = d3Var;
    }
}
