package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class a3 implements Runnable {
    public final int f16703a = 0;
    public final int f16704b;
    public final long f16705c;
    public final int d;
    public final BaseController e;
    public final Object f16706f;
    public final Object h;
    public final Object f16707n;
    public final Object f16708r;
    public final Object f16709s;
    public final Object v;
    public final Object f16710w;

    public a3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f16706f = document;
        this.h = secureDocument;
        this.f16707n = webFile;
        this.f16708r = tL_fileLocationToBeDeprecated;
        this.f16709s = imageLocation;
        this.v = obj;
        this.f16710w = str;
        this.f16705c = j10;
        this.f16704b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f16703a) {
            case 0:
                int i10 = this.f16704b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f16706f, (SecureDocument) this.h, (WebFile) this.f16707n, (TLRPC.TL_fileLocationToBeDeprecated) this.f16708r, (ImageLocation) this.f16709s, this.v, (String) this.f16710w, this.f16705c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f16704b, (a0.h) this.f16706f, (HashMap) this.h, (ArrayList) this.f16707n, this.f16705c, this.d, (a0.h) this.f16708r, (HashMap) this.f16709s, (a0.h) this.v, (Runnable) this.f16710w);
                return;
        }
    }

    public a3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f16704b = i10;
        this.f16706f = hVar;
        this.h = hashMap;
        this.f16707n = arrayList;
        this.f16705c = j10;
        this.d = i11;
        this.f16708r = hVar2;
        this.f16709s = hashMap2;
        this.v = hVar3;
        this.f16710w = runnable;
    }
}
