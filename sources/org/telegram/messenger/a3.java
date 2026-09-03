package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class a3 implements Runnable {
    public final int f16684a = 0;
    public final int f16685b;
    public final long f16686c;
    public final int d;
    public final BaseController e;
    public final Object f16687f;
    public final Object h;
    public final Object f16688n;
    public final Object f16689r;
    public final Object f16690s;
    public final Object v;
    public final Object f16691w;

    public a3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f16687f = document;
        this.h = secureDocument;
        this.f16688n = webFile;
        this.f16689r = tL_fileLocationToBeDeprecated;
        this.f16690s = imageLocation;
        this.v = obj;
        this.f16691w = str;
        this.f16686c = j10;
        this.f16685b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f16684a) {
            case 0:
                int i10 = this.f16685b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f16687f, (SecureDocument) this.h, (WebFile) this.f16688n, (TLRPC.TL_fileLocationToBeDeprecated) this.f16689r, (ImageLocation) this.f16690s, this.v, (String) this.f16691w, this.f16686c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f16685b, (a0.h) this.f16687f, (HashMap) this.h, (ArrayList) this.f16688n, this.f16686c, this.d, (a0.h) this.f16689r, (HashMap) this.f16690s, (a0.h) this.v, (Runnable) this.f16691w);
                return;
        }
    }

    public a3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f16685b = i10;
        this.f16687f = hVar;
        this.h = hashMap;
        this.f16688n = arrayList;
        this.f16686c = j10;
        this.d = i11;
        this.f16689r = hVar2;
        this.f16690s = hashMap2;
        this.v = hVar3;
        this.f16691w = runnable;
    }
}
