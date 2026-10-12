package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class c3 implements Runnable {
    public final int f16922a = 0;
    public final int f16923b;
    public final long f16924c;
    public final int d;
    public final BaseController e;
    public final Object f16925f;
    public final Object h;
    public final Object f16926n;
    public final Object f16927r;
    public final Object f16928s;
    public final Object v;
    public final Object f16929w;

    public c3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f16925f = document;
        this.h = secureDocument;
        this.f16926n = webFile;
        this.f16927r = tL_fileLocationToBeDeprecated;
        this.f16928s = imageLocation;
        this.v = obj;
        this.f16929w = str;
        this.f16924c = j10;
        this.f16923b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f16922a) {
            case 0:
                int i10 = this.f16923b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f16925f, (SecureDocument) this.h, (WebFile) this.f16926n, (TLRPC.TL_fileLocationToBeDeprecated) this.f16927r, (ImageLocation) this.f16928s, this.v, (String) this.f16929w, this.f16924c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f16923b, (a0.h) this.f16925f, (HashMap) this.h, (ArrayList) this.f16926n, this.f16924c, this.d, (a0.h) this.f16927r, (HashMap) this.f16928s, (a0.h) this.v, (Runnable) this.f16929w);
                return;
        }
    }

    public c3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f16923b = i10;
        this.f16925f = hVar;
        this.h = hashMap;
        this.f16926n = arrayList;
        this.f16924c = j10;
        this.d = i11;
        this.f16927r = hVar2;
        this.f16928s = hashMap2;
        this.v = hVar3;
        this.f16929w = runnable;
    }
}
