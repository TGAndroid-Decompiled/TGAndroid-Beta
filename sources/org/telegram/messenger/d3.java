package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class d3 implements Runnable {
    public final int f14961a = 0;
    public final int f14962b;
    public final long f14963c;
    public final int d;
    public final BaseController e;
    public final Object f14964f;
    public final Object h;
    public final Object f14965n;
    public final Object f14966r;
    public final Object f14967s;
    public final Object v;
    public final Object f14968w;

    public d3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f14964f = document;
        this.h = secureDocument;
        this.f14965n = webFile;
        this.f14966r = tL_fileLocationToBeDeprecated;
        this.f14967s = imageLocation;
        this.v = obj;
        this.f14968w = str;
        this.f14963c = j3;
        this.f14962b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f14961a) {
            case 0:
                int i10 = this.f14962b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f14964f, (SecureDocument) this.h, (WebFile) this.f14965n, (TLRPC.TL_fileLocationToBeDeprecated) this.f14966r, (ImageLocation) this.f14967s, this.v, (String) this.f14968w, this.f14963c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f14962b, (a0.i) this.f14964f, (HashMap) this.h, (ArrayList) this.f14965n, this.f14963c, this.d, (a0.i) this.f14966r, (HashMap) this.f14967s, (a0.i) this.v, (Runnable) this.f14968w);
                return;
        }
    }

    public d3(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f14962b = i10;
        this.f14964f = iVar;
        this.h = hashMap;
        this.f14965n = arrayList;
        this.f14963c = j3;
        this.d = i11;
        this.f14966r = iVar2;
        this.f14967s = hashMap2;
        this.v = iVar3;
        this.f14968w = runnable;
    }
}
