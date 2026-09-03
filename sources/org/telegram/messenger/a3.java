package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class a3 implements Runnable {
    public final int f18093a = 0;
    public final int f18094b;
    public final long f18095c;
    public final int d;
    public final BaseController f18096e;
    public final Object f18097f;
    public final Object h;
    public final Object f18098n;
    public final Object f18099r;
    public final Object f18100s;
    public final Object v;
    public final Object f18101w;

    public a3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.f18096e = fileLoader;
        this.f18097f = document;
        this.h = secureDocument;
        this.f18098n = webFile;
        this.f18099r = tL_fileLocationToBeDeprecated;
        this.f18100s = imageLocation;
        this.v = obj;
        this.f18101w = str;
        this.f18095c = j10;
        this.f18094b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18093a) {
            case 0:
                int i10 = this.f18094b;
                int i11 = this.d;
                ((FileLoader) this.f18096e).lambda$loadFile$13((TLRPC.Document) this.f18097f, (SecureDocument) this.h, (WebFile) this.f18098n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18099r, (ImageLocation) this.f18100s, this.v, (String) this.f18101w, this.f18095c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f18096e).lambda$processLoadedStickers$105(this.f18094b, (a0.h) this.f18097f, (HashMap) this.h, (ArrayList) this.f18098n, this.f18095c, this.d, (a0.h) this.f18099r, (HashMap) this.f18100s, (a0.h) this.v, (Runnable) this.f18101w);
                return;
        }
    }

    public a3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.f18096e = mediaDataController;
        this.f18094b = i10;
        this.f18097f = hVar;
        this.h = hashMap;
        this.f18098n = arrayList;
        this.f18095c = j10;
        this.d = i11;
        this.f18099r = hVar2;
        this.f18100s = hashMap2;
        this.v = hVar3;
        this.f18101w = runnable;
    }
}
