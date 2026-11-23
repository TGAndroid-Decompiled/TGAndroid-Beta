package oi;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y4 implements gs {
    public int E;
    public volatile String F;
    public String G;
    public TLRPC.InputFile H;
    public boolean I;
    public final int f22569a;
    public final String f22570b;
    public final boolean f22571c;
    public final boolean d;
    public final boolean f22572e;
    public final int f22573f;
    public final int h;
    public final int f22574n;
    public final TLRPC.Document f22575r;
    public final x4 f22576s;
    public boolean f22577w;
    public boolean f22578x;
    public boolean f22579y;

    public y4(int i7, String str, boolean z10, int i10, int i11, int i12, g3 g3Var) {
        this.f22569a = i7;
        this.f22570b = str;
        this.f22571c = z10;
        this.d = false;
        this.f22572e = false;
        this.f22573f = i10;
        this.h = i11;
        this.f22574n = i12;
        this.f22575r = null;
        this.f22576s = g3Var;
    }

    public final void a(String str) {
        int i7;
        boolean z10;
        if (!this.f22578x && !this.f22579y) {
            this.F = str;
            ls f10 = ls.f(this.f22569a);
            f10.b(this, ls.U1);
            f10.b(this, ls.V1);
            f10.b(this, ls.W1);
            if (this.f22571c) {
                i7 = 33554432;
            } else if (this.d) {
                i7 = 50331648;
            } else if (this.f22572e) {
                i7 = 67108864;
            } else {
                i7 = 16777216;
            }
            w7 G = w7.G(this.f22569a);
            String str2 = this.F;
            if (!this.f22571c && !this.d && !this.f22572e) {
                z10 = true;
            } else {
                z10 = false;
            }
            G.h0(false, i7, str2, z10);
        }
    }

    public final void b() {
        if (!this.f22579y && !this.f22578x) {
            this.f22578x = true;
            try {
                if (this.F != null) {
                    w7.G(this.f22569a).b(this.F, false);
                }
            } catch (Throwable unused) {
            }
            if (this.E != 0) {
                ConnectionsManager.getInstance(this.f22569a).cancelRequest(this.E, true);
                this.E = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f22571c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f22574n;
            tL_documentAttributeVideo.f28441w = this.f22573f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.f22572e;
            if (!z10 && !z11) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f22575r;
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
        this.E = ConnectionsManager.getInstance(this.f22569a).sendRequest(tL_messages_uploadMedia, new ai.g1(this, 24));
    }

    public final void d() {
        int i7;
        int i10;
        if (!this.f22577w && !this.f22578x && !this.f22579y) {
            this.f22577w = true;
            if (this.f22571c) {
                x4 x4Var = this.f22576s;
                int i11 = this.f22573f;
                if (i11 > 0 && (i10 = this.h) > 0) {
                    x4Var.b(i11, i10);
                }
                a(this.f22570b);
            } else if (this.f22572e) {
                Utilities.f22810e.c(new w4(this, 0));
            } else if (this.d) {
                a(this.f22570b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f22570b, options);
                    int i12 = options.outWidth;
                    if (i12 > 0 && (i7 = options.outHeight) > 0) {
                        this.f22576s.b(i12, i7);
                    }
                } catch (Exception unused) {
                }
                Utilities.f22810e.c(new w4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i10 == this.f22569a && !this.f22578x && !this.f22579y) {
            String str = (String) objArr[0];
            if (this.F != null && this.F.equals(str)) {
                if (i7 == ls.U1) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f22572e && !this.I && !TextUtils.isEmpty(this.G)) {
                        this.H = inputFile2;
                        this.I = true;
                        this.F = this.G;
                        w7.G(this.f22569a).h0(false, 16777216, this.F, true);
                    } else if (this.f22572e && this.I) {
                        c(this.H, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i7 == ls.V1) {
                    if (this.f22572e && this.I && (inputFile = this.H) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f22579y = true;
                    e();
                    this.f22576s.a();
                } else if (i7 == ls.W1) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    x4 x4Var = this.f22576s;
                    if (!this.I) {
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
        ls f10 = ls.f(this.f22569a);
        f10.n(this, ls.U1);
        f10.n(this, ls.V1);
        f10.n(this, ls.W1);
    }

    public y4(int i7, String str, TLRPC.Document document, f3 f3Var) {
        this.f22569a = i7;
        this.f22570b = str;
        this.f22571c = false;
        this.d = true;
        this.f22572e = false;
        this.f22573f = 0;
        this.h = 0;
        this.f22574n = 0;
        this.f22575r = document;
        this.f22576s = f3Var;
    }

    public y4(int i7, String str, TLRPC.Document document, e3 e3Var) {
        this.f22569a = i7;
        this.f22570b = str;
        this.f22571c = false;
        this.d = false;
        this.f22572e = true;
        this.f22573f = 0;
        this.h = 0;
        this.f22574n = 0;
        this.f22575r = document;
        this.f22576s = e3Var;
    }
}
