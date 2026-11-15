package oi;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w4 implements is {
    public int E;
    public volatile String F;
    public String G;
    public TLRPC.InputFile H;
    public boolean I;
    public final int f22094a;
    public final String f22095b;
    public final boolean f22096c;
    public final boolean d;
    public final boolean f22097e;
    public final int f22098f;
    public final int h;
    public final int f22099n;
    public final TLRPC.Document f22100r;
    public final v4 f22101s;
    public boolean f22102w;
    public boolean f22103x;
    public boolean f22104y;

    public w4(int i7, String str, boolean z10, int i10, int i11, int i12, d3 d3Var) {
        this.f22094a = i7;
        this.f22095b = str;
        this.f22096c = z10;
        this.d = false;
        this.f22097e = false;
        this.f22098f = i10;
        this.h = i11;
        this.f22099n = i12;
        this.f22100r = null;
        this.f22101s = d3Var;
    }

    public final void a(String str) {
        int i7;
        boolean z10;
        if (!this.f22103x && !this.f22104y) {
            this.F = str;
            ns f10 = ns.f(this.f22094a);
            f10.b(this, ns.U1);
            f10.b(this, ns.V1);
            f10.b(this, ns.W1);
            if (this.f22096c) {
                i7 = 33554432;
            } else if (this.d) {
                i7 = 50331648;
            } else if (this.f22097e) {
                i7 = 67108864;
            } else {
                i7 = 16777216;
            }
            w7 G = w7.G(this.f22094a);
            String str2 = this.F;
            if (!this.f22096c && !this.d && !this.f22097e) {
                z10 = true;
            } else {
                z10 = false;
            }
            G.h0(false, i7, str2, z10);
        }
    }

    public final void b() {
        if (!this.f22104y && !this.f22103x) {
            this.f22103x = true;
            try {
                if (this.F != null) {
                    w7.G(this.f22094a).b(this.F, false);
                }
            } catch (Throwable unused) {
            }
            if (this.E != 0) {
                ConnectionsManager.getInstance(this.f22094a).cancelRequest(this.E, true);
                this.E = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f22096c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f22099n;
            tL_documentAttributeVideo.f28058w = this.f22098f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.f22097e;
            if (!z10 && !z11) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f22100r;
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
        this.E = ConnectionsManager.getInstance(this.f22094a).sendRequest(tL_messages_uploadMedia, new ai.e1(this, 22));
    }

    public final void d() {
        int i7;
        int i10;
        if (!this.f22102w && !this.f22103x && !this.f22104y) {
            this.f22102w = true;
            if (this.f22096c) {
                v4 v4Var = this.f22101s;
                int i11 = this.f22098f;
                if (i11 > 0 && (i10 = this.h) > 0) {
                    v4Var.b(i11, i10);
                }
                a(this.f22095b);
            } else if (this.f22097e) {
                Utilities.f22416e.c(new t4(this, 0));
            } else if (this.d) {
                a(this.f22095b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f22095b, options);
                    int i12 = options.outWidth;
                    if (i12 > 0 && (i7 = options.outHeight) > 0) {
                        this.f22101s.b(i12, i7);
                    }
                } catch (Exception unused) {
                }
                Utilities.f22416e.c(new t4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i10 == this.f22094a && !this.f22103x && !this.f22104y) {
            String str = (String) objArr[0];
            if (this.F != null && this.F.equals(str)) {
                if (i7 == ns.U1) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f22097e && !this.I && !TextUtils.isEmpty(this.G)) {
                        this.H = inputFile2;
                        this.I = true;
                        this.F = this.G;
                        w7.G(this.f22094a).h0(false, 16777216, this.F, true);
                    } else if (this.f22097e && this.I) {
                        c(this.H, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i7 == ns.V1) {
                    if (this.f22097e && this.I && (inputFile = this.H) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f22104y = true;
                    e();
                    this.f22101s.a();
                } else if (i7 == ns.W1) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    v4 v4Var = this.f22101s;
                    if (!this.I) {
                        if (longValue2 > 0) {
                            f10 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f10 = 0.0f;
                        }
                        v4Var.g(f10);
                    }
                }
            }
        }
    }

    public final void e() {
        ns f10 = ns.f(this.f22094a);
        f10.n(this, ns.U1);
        f10.n(this, ns.V1);
        f10.n(this, ns.W1);
    }

    public w4(int i7, String str, TLRPC.Document document, c3 c3Var) {
        this.f22094a = i7;
        this.f22095b = str;
        this.f22096c = false;
        this.d = true;
        this.f22097e = false;
        this.f22098f = 0;
        this.h = 0;
        this.f22099n = 0;
        this.f22100r = document;
        this.f22101s = c3Var;
    }

    public w4(int i7, String str, TLRPC.Document document, b3 b3Var) {
        this.f22094a = i7;
        this.f22095b = str;
        this.f22096c = false;
        this.d = false;
        this.f22097e = true;
        this.f22098f = 0;
        this.h = 0;
        this.f22099n = 0;
        this.f22100r = document;
        this.f22101s = b3Var;
    }
}
