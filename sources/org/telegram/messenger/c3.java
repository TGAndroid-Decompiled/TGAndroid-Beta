package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class c3 implements Runnable {
    public final int f16619a = 0;
    public final int f16620b;
    public final long f16621c;
    public final int d;
    public final BaseController e;
    public final Object f16622f;
    public final Object h;
    public final Object f16623n;
    public final Object f16624r;
    public final Object f16625s;
    public final Object v;
    public final Object f16626w;

    public c3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f16622f = document;
        this.h = secureDocument;
        this.f16623n = webFile;
        this.f16624r = tL_fileLocationToBeDeprecated;
        this.f16625s = imageLocation;
        this.v = obj;
        this.f16626w = str;
        this.f16621c = j10;
        this.f16620b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f16619a) {
            case 0:
                int i10 = this.f16620b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f16622f, (SecureDocument) this.h, (WebFile) this.f16623n, (TLRPC.TL_fileLocationToBeDeprecated) this.f16624r, (ImageLocation) this.f16625s, this.v, (String) this.f16626w, this.f16621c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f16620b, (a0.h) this.f16622f, (HashMap) this.h, (ArrayList) this.f16623n, this.f16621c, this.d, (a0.h) this.f16624r, (HashMap) this.f16625s, (a0.h) this.v, (Runnable) this.f16626w);
                return;
        }
    }

    public c3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f16620b = i10;
        this.f16622f = hVar;
        this.h = hashMap;
        this.f16623n = arrayList;
        this.f16621c = j10;
        this.d = i11;
        this.f16624r = hVar2;
        this.f16625s = hashMap2;
        this.v = hVar3;
        this.f16626w = runnable;
    }
}
