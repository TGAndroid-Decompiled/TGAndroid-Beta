package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class c3 implements Runnable {
    public final int f18005a = 0;
    public final int f18006b;
    public final long f18007c;
    public final int d;
    public final BaseController e;
    public final Object f18008f;
    public final Object h;
    public final Object f18009n;
    public final Object f18010r;
    public final Object f18011s;
    public final Object v;
    public final Object f18012w;

    public c3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f18008f = document;
        this.h = secureDocument;
        this.f18009n = webFile;
        this.f18010r = tL_fileLocationToBeDeprecated;
        this.f18011s = imageLocation;
        this.v = obj;
        this.f18012w = str;
        this.f18007c = j10;
        this.f18006b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18005a) {
            case 0:
                int i10 = this.f18006b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18008f, (SecureDocument) this.h, (WebFile) this.f18009n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18010r, (ImageLocation) this.f18011s, this.v, (String) this.f18012w, this.f18007c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18006b, (a0.h) this.f18008f, (HashMap) this.h, (ArrayList) this.f18009n, this.f18007c, this.d, (a0.h) this.f18010r, (HashMap) this.f18011s, (a0.h) this.v, (Runnable) this.f18012w);
                return;
        }
    }

    public c3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18006b = i10;
        this.f18008f = hVar;
        this.h = hashMap;
        this.f18009n = arrayList;
        this.f18007c = j10;
        this.d = i11;
        this.f18010r = hVar2;
        this.f18011s = hashMap2;
        this.v = hVar3;
        this.f18012w = runnable;
    }
}
