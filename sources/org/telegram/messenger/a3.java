package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class a3 implements Runnable {
    public final int f18091a = 0;
    public final int f18092b;
    public final long f18093c;
    public final int d;
    public final BaseController f18094e;
    public final Object f18095f;
    public final Object h;
    public final Object f18096n;
    public final Object f18097r;
    public final Object f18098s;
    public final Object v;
    public final Object f18099w;

    public a3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.f18094e = fileLoader;
        this.f18095f = document;
        this.h = secureDocument;
        this.f18096n = webFile;
        this.f18097r = tL_fileLocationToBeDeprecated;
        this.f18098s = imageLocation;
        this.v = obj;
        this.f18099w = str;
        this.f18093c = j10;
        this.f18092b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18091a) {
            case 0:
                int i10 = this.f18092b;
                int i11 = this.d;
                ((FileLoader) this.f18094e).lambda$loadFile$13((TLRPC.Document) this.f18095f, (SecureDocument) this.h, (WebFile) this.f18096n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18097r, (ImageLocation) this.f18098s, this.v, (String) this.f18099w, this.f18093c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f18094e).lambda$processLoadedStickers$105(this.f18092b, (a0.h) this.f18095f, (HashMap) this.h, (ArrayList) this.f18096n, this.f18093c, this.d, (a0.h) this.f18097r, (HashMap) this.f18098s, (a0.h) this.v, (Runnable) this.f18099w);
                return;
        }
    }

    public a3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.f18094e = mediaDataController;
        this.f18092b = i10;
        this.f18095f = hVar;
        this.h = hashMap;
        this.f18096n = arrayList;
        this.f18093c = j10;
        this.d = i11;
        this.f18097r = hVar2;
        this.f18098s = hashMap2;
        this.v = hVar3;
        this.f18099w = runnable;
    }
}
