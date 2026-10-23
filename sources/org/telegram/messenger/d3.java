package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class d3 implements Runnable {
    public final int f18152a = 0;
    public final int f18153b;
    public final long f18154c;
    public final int d;
    public final BaseController e;
    public final Object f18155f;
    public final Object h;
    public final Object f18156n;
    public final Object f18157r;
    public final Object f18158s;
    public final Object v;
    public final Object f18159w;

    public d3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f18155f = document;
        this.h = secureDocument;
        this.f18156n = webFile;
        this.f18157r = tL_fileLocationToBeDeprecated;
        this.f18158s = imageLocation;
        this.v = obj;
        this.f18159w = str;
        this.f18154c = j10;
        this.f18153b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18152a) {
            case 0:
                int i10 = this.f18153b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18155f, (SecureDocument) this.h, (WebFile) this.f18156n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18157r, (ImageLocation) this.f18158s, this.v, (String) this.f18159w, this.f18154c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18153b, (a0.h) this.f18155f, (HashMap) this.h, (ArrayList) this.f18156n, this.f18154c, this.d, (a0.h) this.f18157r, (HashMap) this.f18158s, (a0.h) this.v, (Runnable) this.f18159w);
                return;
        }
    }

    public d3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18153b = i10;
        this.f18155f = hVar;
        this.h = hashMap;
        this.f18156n = arrayList;
        this.f18154c = j10;
        this.d = i11;
        this.f18157r = hVar2;
        this.f18158s = hashMap2;
        this.v = hVar3;
        this.f18159w = runnable;
    }
}
