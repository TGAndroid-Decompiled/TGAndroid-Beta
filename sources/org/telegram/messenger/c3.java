package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class c3 implements Runnable {
    public final int f18002a = 0;
    public final int f18003b;
    public final long f18004c;
    public final int d;
    public final BaseController e;
    public final Object f18005f;
    public final Object h;
    public final Object f18006n;
    public final Object f18007r;
    public final Object f18008s;
    public final Object v;
    public final Object f18009w;

    public c3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f18005f = document;
        this.h = secureDocument;
        this.f18006n = webFile;
        this.f18007r = tL_fileLocationToBeDeprecated;
        this.f18008s = imageLocation;
        this.v = obj;
        this.f18009w = str;
        this.f18004c = j10;
        this.f18003b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18002a) {
            case 0:
                int i10 = this.f18003b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18005f, (SecureDocument) this.h, (WebFile) this.f18006n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18007r, (ImageLocation) this.f18008s, this.v, (String) this.f18009w, this.f18004c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18003b, (a0.h) this.f18005f, (HashMap) this.h, (ArrayList) this.f18006n, this.f18004c, this.d, (a0.h) this.f18007r, (HashMap) this.f18008s, (a0.h) this.v, (Runnable) this.f18009w);
                return;
        }
    }

    public c3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18003b = i10;
        this.f18005f = hVar;
        this.h = hashMap;
        this.f18006n = arrayList;
        this.f18004c = j10;
        this.d = i11;
        this.f18007r = hVar2;
        this.f18008s = hashMap2;
        this.v = hVar3;
        this.f18009w = runnable;
    }
}
