package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class d3 implements Runnable {
    public final int f18142a = 0;
    public final int f18143b;
    public final long f18144c;
    public final int d;
    public final BaseController e;
    public final Object f18145f;
    public final Object h;
    public final Object f18146n;
    public final Object f18147r;
    public final Object f18148s;
    public final Object v;
    public final Object f18149w;

    public d3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f18145f = document;
        this.h = secureDocument;
        this.f18146n = webFile;
        this.f18147r = tL_fileLocationToBeDeprecated;
        this.f18148s = imageLocation;
        this.v = obj;
        this.f18149w = str;
        this.f18144c = j10;
        this.f18143b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18142a) {
            case 0:
                int i10 = this.f18143b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18145f, (SecureDocument) this.h, (WebFile) this.f18146n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18147r, (ImageLocation) this.f18148s, this.v, (String) this.f18149w, this.f18144c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18143b, (a0.h) this.f18145f, (HashMap) this.h, (ArrayList) this.f18146n, this.f18144c, this.d, (a0.h) this.f18147r, (HashMap) this.f18148s, (a0.h) this.v, (Runnable) this.f18149w);
                return;
        }
    }

    public d3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18143b = i10;
        this.f18145f = hVar;
        this.h = hashMap;
        this.f18146n = arrayList;
        this.f18144c = j10;
        this.d = i11;
        this.f18147r = hVar2;
        this.f18148s = hashMap2;
        this.v = hVar3;
        this.f18149w = runnable;
    }
}
